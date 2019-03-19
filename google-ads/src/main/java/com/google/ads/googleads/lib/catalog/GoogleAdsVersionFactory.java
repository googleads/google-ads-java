// Copyright 2019 Google LLC
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.ads.googleads.lib.catalog;

import com.google.ads.googleads.lib.catalog.annotation.ServiceClientDescriptor;
import com.google.ads.googleads.lib.catalog.annotation.VersionDescriptor;
import com.google.api.gax.core.FixedCredentialsProvider;
import com.google.api.gax.rpc.ClientSettings;
import com.google.api.gax.rpc.ClientSettings.Builder;
import com.google.api.gax.rpc.TransportChannelProvider;
import com.google.auth.Credentials;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableMap;
import com.google.common.reflect.AbstractInvocationHandler;
import com.google.common.reflect.Reflection;
import java.io.IOException;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Provides implementations of a class annotated with @VersionDescriptor using dynamic proxy.
 *
 * <ul>
 *   <li>The annotated class must consist solely of methods annotated with <code>
 *       @ServiceClientDescriptor</code>. The settingsClass parameter must support a single factory
 *       method <code>newBuilder()</code>.
 *   <li>The return type of all methods must support a single method <code>create(ClientSettings)
 *       </code>.
 * </ul>
 */
public class GoogleAdsVersionFactory {

  /**
   * Creates a new instance of interfaceSpec, an interface with accessor methods for all services
   * available in an API version.
   *
   * <p>The interfaceSpec class must be annotated with @VersionDescriptor.
   *
   * <p>All methods of interfaceSpec must be annotated with @ServiceClientDescriptor.
   */
  public static <T> T createProxy(
      Class<T> interfaceSpec,
      TransportChannelProvider transportChannelProvider,
      Credentials credentials) {
    try {
      return Reflection.newProxy(
          interfaceSpec,
          new VersionDescriptorInvocationHandler(
              interfaceSpec, transportChannelProvider, credentials));
    } catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
      throw new IllegalArgumentException("Invalid GoogleAdsVersion configuration", e);
    }
  }

  /** Implements InvocationHandler for the dynamic proxy implementation of VersionDescriptor. */
  private static class VersionDescriptorInvocationHandler extends AbstractInvocationHandler {

    private final ImmutableMap<Class, Method> clientCreators;
    private final ImmutableMap<Method, Method> settingsBuilders;
    private final TransportChannelProvider transportChannelProvider;
    private final Credentials credentials;

    private VersionDescriptorInvocationHandler(
        Class<?> interfaceSpec,
        TransportChannelProvider transportChannelProvider,
        Credentials credentials)
        throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
      // Ensure the interface spec is annotated with VersionDescriptor.
      Preconditions.checkArgument(
          interfaceSpec.isAnnotationPresent(VersionDescriptor.class),
          "Missing VersionDescriptor annotation for: %s",
          interfaceSpec);

      this.transportChannelProvider = Preconditions.checkNotNull(transportChannelProvider);
      this.credentials = Preconditions.checkNotNull(credentials);

      // Reflected entities are loaded in the constructor so that any issues are caught at
      // creation/unit-test time, rather than waiting until an API call is made. This should also
      // (slightly) improve performance by avoiding repeated reflections at runtime.
      this.settingsBuilders = cacheSettingsBuilders(interfaceSpec);
      this.clientCreators = cacheClientCreators(interfaceSpec);
    }

    @Override
    protected Object handleInvocation(Object proxy, Method method, Object[] args) throws Throwable {
      ClientSettings settings = createClientSettings(method);
      return createServiceClient(method.getReturnType(), settings);
    }

    /** Creates a new service client from a class and settings. */
    private Object createServiceClient(Class serviceClass, ClientSettings settings)
        throws IllegalAccessException, InvocationTargetException {
      return clientCreators.get(serviceClass).invoke(null, settings);
    }

    /** Creates a new settings object for a @ServiceClientDescriptor method. */
    private ClientSettings createClientSettings(Method method)
        throws IllegalAccessException, InvocationTargetException, IOException {
      Method settingsBuilderFactory = settingsBuilders.get(method);
      Builder settingsBuilder = (Builder) settingsBuilderFactory.invoke(null);
      settingsBuilder.setTransportChannelProvider(transportChannelProvider);
      settingsBuilder.setCredentialsProvider(FixedCredentialsProvider.create(credentials));
      return settingsBuilder.build();
    }

    /** Loads all service client factory methods for a class. */
    private static ImmutableMap<Class, Method> cacheClientCreators(Class<?> interfaceSpec)
        throws NoSuchMethodException {
      ImmutableMap.Builder<Class, Method> builder = ImmutableMap.builder();
      for (Method method : interfaceSpec.getMethods()) {
        Class<?> serviceClass = method.getReturnType();
        Class<? extends ClientSettings> settingsClass =
            method.getAnnotation(ServiceClientDescriptor.class).settingsClass();
        Method createMethod = serviceClass.getMethod("create", settingsClass);
        builder.put(serviceClass, createMethod);
      }
      return builder.build();
    }

    /** Loads all settings builder methods for a class. */
    private static ImmutableMap<Method, Method> cacheSettingsBuilders(Class<?> interfaceSpec)
        throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
      ImmutableMap.Builder<Method, Method> builder = ImmutableMap.builder();
      for (Method method : interfaceSpec.getMethods()) {
        // Extract and verify the ServiceClientDescriptor annotation.
        ServiceClientDescriptor descriptor = method.getAnnotation(ServiceClientDescriptor.class);
        if (descriptor == null) {
          throw new IllegalArgumentException(
              "Missing ServiceClientDescriptor annotation for: " + method);
        }

        // Reflect the ClientSettings newBuilder method.
        Class<? extends ClientSettings> settingsClass = descriptor.settingsClass();
        Method builderMethod = settingsClass.getMethod("newBuilder");

        // Verify the new builder method returns a ClientSettings.Builder.
        Object settingsBuilder = builderMethod.invoke(null);
        Preconditions.checkArgument(
            ClientSettings.Builder.class.isAssignableFrom(settingsBuilder.getClass()));

        builder.put(method, builderMethod);
      }
      return builder.build();
    }
  }
}
