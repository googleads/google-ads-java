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

package com.google.ads.googleads.v21.services.stub;

import static com.google.ads.googleads.v21.services.GoogleAdsServiceClient.SearchPagedResponse;

import com.google.ads.googleads.v21.services.MutateGoogleAdsRequest;
import com.google.ads.googleads.v21.services.MutateGoogleAdsResponse;
import com.google.ads.googleads.v21.services.SearchGoogleAdsRequest;
import com.google.ads.googleads.v21.services.SearchGoogleAdsResponse;
import com.google.ads.googleads.v21.services.SearchGoogleAdsStreamRequest;
import com.google.ads.googleads.v21.services.SearchGoogleAdsStreamResponse;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.ServerStreamingCallable;
import com.google.api.gax.rpc.UnaryCallable;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Base stub class for the GoogleAdsService service API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by gapic-generator-java")
public abstract class GoogleAdsServiceStub implements BackgroundResource {

  public UnaryCallable<SearchGoogleAdsRequest, SearchPagedResponse> searchPagedCallable() {
    throw new UnsupportedOperationException("Not implemented: searchPagedCallable()");
  }

  public UnaryCallable<SearchGoogleAdsRequest, SearchGoogleAdsResponse> searchCallable() {
    throw new UnsupportedOperationException("Not implemented: searchCallable()");
  }

  public ServerStreamingCallable<SearchGoogleAdsStreamRequest, SearchGoogleAdsStreamResponse>
      searchStreamCallable() {
    throw new UnsupportedOperationException("Not implemented: searchStreamCallable()");
  }

  public UnaryCallable<MutateGoogleAdsRequest, MutateGoogleAdsResponse> mutateCallable() {
    throw new UnsupportedOperationException("Not implemented: mutateCallable()");
  }

  @Override
  public abstract void close();
}
