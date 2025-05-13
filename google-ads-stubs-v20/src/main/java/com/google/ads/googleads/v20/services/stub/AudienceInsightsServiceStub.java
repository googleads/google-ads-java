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

import com.google.ads.googleads.v20.services.GenerateAudienceCompositionInsightsRequest;
import com.google.ads.googleads.v20.services.GenerateAudienceCompositionInsightsResponse;
import com.google.ads.googleads.v20.services.GenerateAudienceOverlapInsightsRequest;
import com.google.ads.googleads.v20.services.GenerateAudienceOverlapInsightsResponse;
import com.google.ads.googleads.v20.services.GenerateInsightsFinderReportRequest;
import com.google.ads.googleads.v20.services.GenerateInsightsFinderReportResponse;
import com.google.ads.googleads.v20.services.GenerateSuggestedTargetingInsightsRequest;
import com.google.ads.googleads.v20.services.GenerateSuggestedTargetingInsightsResponse;
import com.google.ads.googleads.v20.services.GenerateTargetingSuggestionMetricsRequest;
import com.google.ads.googleads.v20.services.GenerateTargetingSuggestionMetricsResponse;
import com.google.ads.googleads.v20.services.ListAudienceInsightsAttributesRequest;
import com.google.ads.googleads.v20.services.ListAudienceInsightsAttributesResponse;
import com.google.ads.googleads.v20.services.ListInsightsEligibleDatesRequest;
import com.google.ads.googleads.v20.services.ListInsightsEligibleDatesResponse;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.UnaryCallable;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Base stub class for the AudienceInsightsService service API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by gapic-generator-java")
public abstract class AudienceInsightsServiceStub implements BackgroundResource {

  public UnaryCallable<GenerateInsightsFinderReportRequest, GenerateInsightsFinderReportResponse>
      generateInsightsFinderReportCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: generateInsightsFinderReportCallable()");
  }

  public UnaryCallable<
          ListAudienceInsightsAttributesRequest, ListAudienceInsightsAttributesResponse>
      listAudienceInsightsAttributesCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: listAudienceInsightsAttributesCallable()");
  }

  public UnaryCallable<ListInsightsEligibleDatesRequest, ListInsightsEligibleDatesResponse>
      listInsightsEligibleDatesCallable() {
    throw new UnsupportedOperationException("Not implemented: listInsightsEligibleDatesCallable()");
  }

  public UnaryCallable<
          GenerateAudienceCompositionInsightsRequest, GenerateAudienceCompositionInsightsResponse>
      generateAudienceCompositionInsightsCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: generateAudienceCompositionInsightsCallable()");
  }

  public UnaryCallable<
          GenerateSuggestedTargetingInsightsRequest, GenerateSuggestedTargetingInsightsResponse>
      generateSuggestedTargetingInsightsCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: generateSuggestedTargetingInsightsCallable()");
  }

  public UnaryCallable<
          GenerateAudienceOverlapInsightsRequest, GenerateAudienceOverlapInsightsResponse>
      generateAudienceOverlapInsightsCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: generateAudienceOverlapInsightsCallable()");
  }

  public UnaryCallable<
          GenerateTargetingSuggestionMetricsRequest, GenerateTargetingSuggestionMetricsResponse>
      generateTargetingSuggestionMetricsCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: generateTargetingSuggestionMetricsCallable()");
  }

  @Override
  public abstract void close();
}
