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

package com.google.ads.googleads.lib.catalog.annotation;

import com.google.ads.googleads.lib.BaseGoogleAdsException;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Specifies that a class is a factory of service clients for a version of the Google Ads API. All
 * methods in the class should be annotated with @ServiceClientDescriptor.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD})
public @interface VersionDescriptor {

  /** Specifies the name of the version, as in v[0-9]+ */
  String versionName();

  /** Specifies the factory to use for creating GoogleAdsException instances for this version. */
  Class<? extends BaseGoogleAdsException.Factory> googleAdsExceptionFactory();
}
