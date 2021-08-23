// Copyright 2018 Google LLC
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

package com.google.ads.googleads.lib.callables;

import com.google.ads.googleads.lib.catalog.ApiCatalog;
import com.google.ads.googleads.lib.catalog.Version;
import com.google.ads.googleads.lib.stubs.callables.ExceptionTransformation;
import com.google.ads.googleads.lib.stubs.exceptions.BaseGoogleAdsException;
import com.google.api.gax.rpc.ApiException;
import com.google.auto.service.AutoService;
import java.util.Optional;

/**
 * Transforms an ApiException into a GoogleAdsException whenever a binary GoogleAdsFailure message
 * was sent in the RPC trailers.
 */
@AutoService(ExceptionTransformation.class)
public class GoogleAdsExceptionTransformation implements ExceptionTransformation {

  private static final ApiCatalog catalog = ApiCatalog.getDefault();

  @Override
  public Throwable transform(Throwable input) {
    if (ApiException.class.isAssignableFrom(input.getClass())) {
      for (Version version : catalog.getSupportedVersions()) {
        Optional<? extends BaseGoogleAdsException> result =
            version.getExceptionFactory().createGoogleAdsException((ApiException) input);
        if (result.isPresent()) {
          return result.get();
        }
      }
    }
    return input;
  }
}
