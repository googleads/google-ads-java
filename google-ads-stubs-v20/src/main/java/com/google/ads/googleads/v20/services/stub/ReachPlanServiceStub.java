/*
 * Copyright 2025 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.ads.googleads.v20.services.stub;

import com.google.ads.googleads.v20.services.GenerateConversionRatesRequest;
import com.google.ads.googleads.v20.services.GenerateConversionRatesResponse;
import com.google.ads.googleads.v20.services.GenerateReachForecastRequest;
import com.google.ads.googleads.v20.services.GenerateReachForecastResponse;
import com.google.ads.googleads.v20.services.ListPlannableLocationsRequest;
import com.google.ads.googleads.v20.services.ListPlannableLocationsResponse;
import com.google.ads.googleads.v20.services.ListPlannableProductsRequest;
import com.google.ads.googleads.v20.services.ListPlannableProductsResponse;
import com.google.ads.googleads.v20.services.ListPlannableUserListsRequest;
import com.google.ads.googleads.v20.services.ListPlannableUserListsResponse;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.UnaryCallable;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Base stub class for the ReachPlanService service API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by gapic-generator-java")
public abstract class ReachPlanServiceStub implements BackgroundResource {

  public UnaryCallable<GenerateConversionRatesRequest, GenerateConversionRatesResponse>
      generateConversionRatesCallable() {
    throw new UnsupportedOperationException("Not implemented: generateConversionRatesCallable()");
  }

  public UnaryCallable<ListPlannableLocationsRequest, ListPlannableLocationsResponse>
      listPlannableLocationsCallable() {
    throw new UnsupportedOperationException("Not implemented: listPlannableLocationsCallable()");
  }

  public UnaryCallable<ListPlannableProductsRequest, ListPlannableProductsResponse>
      listPlannableProductsCallable() {
    throw new UnsupportedOperationException("Not implemented: listPlannableProductsCallable()");
  }

  public UnaryCallable<GenerateReachForecastRequest, GenerateReachForecastResponse>
      generateReachForecastCallable() {
    throw new UnsupportedOperationException("Not implemented: generateReachForecastCallable()");
  }

  public UnaryCallable<ListPlannableUserListsRequest, ListPlannableUserListsResponse>
      listPlannableUserListsCallable() {
    throw new UnsupportedOperationException("Not implemented: listPlannableUserListsCallable()");
  }

  @Override
  public abstract void close();
}
