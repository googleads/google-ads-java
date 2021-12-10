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

import com.google.ads.googleads.lib.stubs.exceptions.BaseGoogleAdsException;
import com.google.common.base.Preconditions;
import com.google.protobuf.Message;
import java.util.Objects;

/**
 * Represents the metadata of a version of the Google Ads API. Provides a TypeFactory instance which
 * can be used to create API object instances in a version independent context.
 */
public final class Version implements Comparable<Version> {

  /** A class which enumerates the service clients available for this Version. */
  private final Class<?> descriptorClass;

  private final String versionName;
  private final BaseGoogleAdsException.Factory exceptionFactory;
  private final int versionNumber;
  private final String packageNameIdentifier;

  Version(
      String versionName,
      BaseGoogleAdsException.Factory exceptionFactory,
      Class<?> descriptorClass) {
    Preconditions.checkArgument(
        versionName.matches("v[0-9]+"), "Invalid version name: %", versionName);
    this.versionName = Preconditions.checkNotNull(versionName);
    this.versionNumber = Preconditions.checkNotNull(extractVersionNumber(versionName));
    this.descriptorClass = Preconditions.checkNotNull(descriptorClass);
    this.exceptionFactory = Preconditions.checkNotNull(exceptionFactory);
    this.packageNameIdentifier = "." + versionName + ".";
  }

  /** Gets the (major) version number of this version. */
  public int getVersionNumber() {
    return versionNumber;
  }

  /**
   * Returns the version name, e.g. "v1".
   *
   * @return the version name
   */
  public String getVersionName() {
    return versionName;
  }

  /**
   * Allows sorting of versions, higher version numbers have lower sorting rank, as in v1 &lt; v0.
   */
  @Override
  public int compareTo(Version o) {
    return o.versionName.compareTo(versionName);
  }

  /** Returns a class which enumerates the service clients for this version. */
  public Class<?> getServiceClientFactoryClass() {
    return descriptorClass;
  }

  /**
   * Returns a TypeFactory instance which can be used to create version specific objects without
   * binding to the specific versioned class name.
   */
  public BaseGoogleAdsException.Factory getExceptionFactory() {
    return exceptionFactory;
  }

  /** Returns true if this Version is the same as that of the provided message. */
  public boolean containsMessage(Message input) {
    return input.getClass().getPackage().getName().contains(packageNameIdentifier);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Version version = (Version) o;
    return versionName.equals(version.versionName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(versionName);
  }

  /** Gets the version number from a string matching v[0-9]+. */
  private static int extractVersionNumber(String versionName) {
    return Integer.valueOf(versionName.substring(1));
  }
}
