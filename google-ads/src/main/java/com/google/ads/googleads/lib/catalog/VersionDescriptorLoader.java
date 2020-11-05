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

import com.google.ads.googleads.annotations.api.VersionDescriptor;
import com.google.common.collect.ImmutableSet;
import java.lang.reflect.Method;

/**
 * Provides a utility for loading the VersionDescriptor annotations and producing Version instances.
 *
 * <p>The supplied interface must have all method return types annotated with <code>
 * @VersionDescriptor</code>. See <code>forVersionList()</code> for more details.
 *
 * <p>For instance, the AllVersions interface below satisfies this constraint:
 * <pre>
 * <code>
 * public interface AllVersions {
 *   Version1 getVersion1();
 * }
 *
 * @VersionDescriptor(versionName="v1)
 * public interface Version1 {
 *
 *   @ServiceClientDescriptor(settingsClass=CampaignServiceClientSettings.class)
 *   CampaignServiceClient getCampaignServiceClient();
 * }
 * </code>
 * </pre>
 */
class VersionDescriptorLoader {

  private final ImmutableSet<Version> versions;

  /**
   * Creates a descriptor loader for the specified interface.
   *
   * @param interfaceSpec a class with all available VersionDescriptor instances as return types of
   *     the methods. No other method definitions are permitted. See the class javadoc for examples.
   * @throws IllegalArgumentException if the version descriptor is invalid.
   */
  public static VersionDescriptorLoader forVersionList(Class<?> interfaceSpec) {
    try {
      return new VersionDescriptorLoader(interfaceSpec);
    } catch (IllegalAccessException | InstantiationException e) {
      throw new IllegalArgumentException("Failed to load versions for " + interfaceSpec, e);
    }
  }

  private VersionDescriptorLoader(Class<?> interfaceSpec)
    throws IllegalAccessException, InstantiationException {
    this.versions = loadAvailableVersions(interfaceSpec);
  }

  public ImmutableSet<Version> getVersions() {
    return versions;
  }

  /** Loads the available GoogleAdsAllVersions for the library. */
  private static ImmutableSet<Version> loadAvailableVersions(Class<?> interfaceSpec)
    throws InstantiationException, IllegalAccessException {
    ImmutableSet.Builder<Version> builder = ImmutableSet.builder();
    for (Method method : interfaceSpec.getMethods()) {
      Class<?> descriptorClass = method.getReturnType();
      if (descriptorClass.isAnnotationPresent(VersionDescriptor.class)) {
        VersionDescriptor descriptor =
          method.getReturnType().getAnnotation(VersionDescriptor.class);
        builder.add(new Version(descriptor, descriptorClass));
      }
    }
    return builder.build();
  }
}