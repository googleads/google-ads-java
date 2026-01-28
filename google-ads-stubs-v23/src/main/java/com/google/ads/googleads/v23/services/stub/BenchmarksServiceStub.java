/*
 * Copyright 2026 Google LLC
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

package com.google.ads.googleads.v23.services.stub;

import com.google.ads.googleads.v23.services.GenerateBenchmarksMetricsRequest;
import com.google.ads.googleads.v23.services.GenerateBenchmarksMetricsResponse;
import com.google.ads.googleads.v23.services.ListBenchmarksAvailableDatesRequest;
import com.google.ads.googleads.v23.services.ListBenchmarksAvailableDatesResponse;
import com.google.ads.googleads.v23.services.ListBenchmarksLocationsRequest;
import com.google.ads.googleads.v23.services.ListBenchmarksLocationsResponse;
import com.google.ads.googleads.v23.services.ListBenchmarksProductsRequest;
import com.google.ads.googleads.v23.services.ListBenchmarksProductsResponse;
import com.google.ads.googleads.v23.services.ListBenchmarksSourcesRequest;
import com.google.ads.googleads.v23.services.ListBenchmarksSourcesResponse;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.UnaryCallable;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Base stub class for the BenchmarksService service API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by gapic-generator-java")
public abstract class BenchmarksServiceStub implements BackgroundResource {

  public UnaryCallable<ListBenchmarksAvailableDatesRequest, ListBenchmarksAvailableDatesResponse>
      listBenchmarksAvailableDatesCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: listBenchmarksAvailableDatesCallable()");
  }

  public UnaryCallable<ListBenchmarksLocationsRequest, ListBenchmarksLocationsResponse>
      listBenchmarksLocationsCallable() {
    throw new UnsupportedOperationException("Not implemented: listBenchmarksLocationsCallable()");
  }

  public UnaryCallable<ListBenchmarksProductsRequest, ListBenchmarksProductsResponse>
      listBenchmarksProductsCallable() {
    throw new UnsupportedOperationException("Not implemented: listBenchmarksProductsCallable()");
  }

  public UnaryCallable<ListBenchmarksSourcesRequest, ListBenchmarksSourcesResponse>
      listBenchmarksSourcesCallable() {
    throw new UnsupportedOperationException("Not implemented: listBenchmarksSourcesCallable()");
  }

  public UnaryCallable<GenerateBenchmarksMetricsRequest, GenerateBenchmarksMetricsResponse>
      generateBenchmarksMetricsCallable() {
    throw new UnsupportedOperationException("Not implemented: generateBenchmarksMetricsCallable()");
  }

  @Override
  public abstract void close();
}
