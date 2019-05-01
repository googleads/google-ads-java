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

package com.google.ads.googleads.lib;

// This class can be replaced with codegen, for now it is generated manually.
public abstract class AbstractGoogleAdsClient implements GoogleAdsAllVersions {

  /** Returns the accessor for service client factories, using configuration from this class. */
  protected abstract GoogleAdsAllVersions getGoogleAdsAllVersions();

  @Override
  public com.google.ads.googleads.v1.services.GoogleAdsVersion getVersion1() {
    return getGoogleAdsAllVersions().getVersion1();
  }

  @Override
  public com.google.ads.googleads.v1.services.GoogleAdsVersion getLatestVersion() {
    return getGoogleAdsAllVersions().getLatestVersion();
  }
}
