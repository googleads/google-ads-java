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

package com.google.ads.googleads.lib;

import com.google.ads.googleads.lib.catalog.GeneratedCatalog;
import com.google.ads.googleads.lib.catalog.Version;
import com.google.api.gax.rpc.ApiException;
import com.google.api.gax.rpc.ApiExceptionFactory;
import com.google.auto.service.AutoService;
import java.util.Optional;

/**
 * Transforms an ApiException into a GoogleAdsException.
 *
 * <p>The server returns a binary GoogleAdsFailure message in the RPC trailers. This isn't
 * immediately useful without deserialization, so this class transforms the exception before it is
 * thrown.
 */
@AutoService(ApiExceptionFactory.ExceptionTransformation.class)
public class GoogleAdsExceptionTransformation
    implements ApiExceptionFactory.ExceptionTransformation {

  private static final GeneratedCatalog catalog = GeneratedCatalog.getDefault();

  @Override
  public ApiException transform(ApiException apiException) {
    for (Version version : catalog.getSupportedVersions()) {
      Optional<? extends BaseGoogleAdsException> result =
          version.getExceptionFactory().createGoogleAdsException(apiException);
      if (result.isPresent()) {
        return result.get();
      }
    }
    return apiException;
  }
}
