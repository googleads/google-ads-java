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

import com.google.ads.googleads.lib.GoogleAdsAllVersions;
import com.google.api.gax.rpc.TransportChannelProvider;
import com.google.auth.Credentials;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSortedSet;
import com.google.common.reflect.AbstractInvocationHandler;
import com.google.common.reflect.Reflection;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * A basic catalog implementation which loads versions from @VersionDescriptor annotations and uses
 * reflection for the type factory.
 */
class ApiCatalogImpl implements ApiCatalog {
  private static final ApiCatalogImpl instance =
      new ApiCatalogImpl(
          VersionDescriptorLoader.forVersionList(GoogleAdsAllVersions.class).getVersions());

  private final ImmutableSortedSet<Version> supportedVersions;

  /** Creates a new catalog from a known collection of versions. */
  public ApiCatalogImpl(Collection<Version> versions) {
    supportedVersions = ImmutableSortedSet.copyOf(new TreeSet<>(versions));
  }

  /** Returns a catalog with the versions declared in the class. */
  public static ApiCatalog getDefault() {
    return instance;
  }

  /** @inheritDoc */
  @Override
  public SortedSet<Version> getSupportedVersions() {
    return supportedVersions;
  }

  /** @inheritDoc */
  @Override
  public Version getLatestVersion() {
    return getSupportedVersions().first();
  }

  /** @inheritDoc */
  @Override
  public GoogleAdsAllVersions createAllVersionsClient(
      TransportChannelProvider provider, Credentials credentials) {
    Preconditions.checkNotNull(
        provider, "Transport channel provider required to create GoogleAdsAllVersions interface.");
    Preconditions.checkNotNull(
        credentials, "Credentials are required to create GoogleAdsAllVersions interface.");
    return Reflection.newProxy(
        GoogleAdsAllVersions.class,
        new GoogleAdsAllVersionsInvocationHandler(provider, credentials));
  }

  /** A dynamic proxy implementation of GoogleAdsAllVersions. */
  private static class GoogleAdsAllVersionsInvocationHandler extends AbstractInvocationHandler {

    private final ImmutableMap<Method, Object> clientFactories;

    /** Creates a new handler with credentials and transport provider. */
    public GoogleAdsAllVersionsInvocationHandler(
        TransportChannelProvider provider, Credentials credentials) {
      this.clientFactories = cacheClientFactories(provider, credentials);
    }

    @Override
    protected Object handleInvocation(Object proxy, Method method, Object[] args) {
      return clientFactories.get(method);
    }

    /** Loads all client factories for Service, given TransportChannelProvider and Credentials. */
    private static ImmutableMap<Method, Object> cacheClientFactories(
        TransportChannelProvider provider, Credentials credentials) {
      ImmutableMap.Builder<Method, Object> builder = ImmutableMap.builder();
      for (Method method : GoogleAdsAllVersions.class.getMethods()) {
        builder.put(
            method,
            GoogleAdsVersionFactory.createProxy(method.getReturnType(), provider, credentials));
      }
      return builder.build();
    }
  }
}
