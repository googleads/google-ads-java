// Copyright 2019 Google LLC
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     https://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.ads.googleads.v5.utils;

import com.google.ads.googleads.lib.utils.AbstractErrorUtils;
import com.google.ads.googleads.v5.errors.ErrorLocation.FieldPathElement;
import com.google.ads.googleads.v5.errors.GoogleAdsError;
import com.google.ads.googleads.v5.errors.GoogleAdsFailure;
import java.util.List;
import java.util.Optional;

public class ErrorUtils
    extends AbstractErrorUtils<GoogleAdsFailure, GoogleAdsError, FieldPathElement> {

  private static final ErrorUtils impl = new ErrorUtils();

  public static ErrorUtils getInstance() {
    return impl;
  }

  @Override
  public ErrorPath<GoogleAdsError> createErrorPath(
      GoogleAdsError error, FieldPathElement pathElement) {
    return new ErrorPath<>(
        error,
        pathElement.getFieldName(),
        Optional.ofNullable(pathElement.hasIndex() ? pathElement.getIndex().getValue() : null));
  }

  @Override
  public List<FieldPathElement> getFieldPathElements(GoogleAdsError googleAdsError) {
    return googleAdsError.getLocation().getFieldPathElementsList();
  }

  @Override
  public List<GoogleAdsError> getGoogleAdsErrors(GoogleAdsFailure googleAdsFailure) {
    return googleAdsFailure.getErrorsList();
  }

  @Override
  public Class<GoogleAdsFailure> getGoogleAdsFailureClass() {
    return GoogleAdsFailure.class;
  }
}
