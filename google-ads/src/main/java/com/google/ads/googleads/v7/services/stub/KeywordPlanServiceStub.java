/*
 * Copyright 2021 Google LLC
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

package com.google.ads.googleads.v7.services.stub;

import com.google.ads.googleads.v7.resources.KeywordPlan;
import com.google.ads.googleads.v7.services.GenerateForecastCurveRequest;
import com.google.ads.googleads.v7.services.GenerateForecastCurveResponse;
import com.google.ads.googleads.v7.services.GenerateForecastMetricsRequest;
import com.google.ads.googleads.v7.services.GenerateForecastMetricsResponse;
import com.google.ads.googleads.v7.services.GenerateForecastTimeSeriesRequest;
import com.google.ads.googleads.v7.services.GenerateForecastTimeSeriesResponse;
import com.google.ads.googleads.v7.services.GenerateHistoricalMetricsRequest;
import com.google.ads.googleads.v7.services.GenerateHistoricalMetricsResponse;
import com.google.ads.googleads.v7.services.GetKeywordPlanRequest;
import com.google.ads.googleads.v7.services.MutateKeywordPlansRequest;
import com.google.ads.googleads.v7.services.MutateKeywordPlansResponse;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.UnaryCallable;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Base stub class for the KeywordPlanService service API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by gapic-generator-java")
public abstract class KeywordPlanServiceStub implements BackgroundResource {

  public UnaryCallable<GetKeywordPlanRequest, KeywordPlan> getKeywordPlanCallable() {
    throw new UnsupportedOperationException("Not implemented: getKeywordPlanCallable()");
  }

  public UnaryCallable<MutateKeywordPlansRequest, MutateKeywordPlansResponse>
      mutateKeywordPlansCallable() {
    throw new UnsupportedOperationException("Not implemented: mutateKeywordPlansCallable()");
  }

  public UnaryCallable<GenerateForecastCurveRequest, GenerateForecastCurveResponse>
      generateForecastCurveCallable() {
    throw new UnsupportedOperationException("Not implemented: generateForecastCurveCallable()");
  }

  public UnaryCallable<GenerateForecastTimeSeriesRequest, GenerateForecastTimeSeriesResponse>
      generateForecastTimeSeriesCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: generateForecastTimeSeriesCallable()");
  }

  public UnaryCallable<GenerateForecastMetricsRequest, GenerateForecastMetricsResponse>
      generateForecastMetricsCallable() {
    throw new UnsupportedOperationException("Not implemented: generateForecastMetricsCallable()");
  }

  public UnaryCallable<GenerateHistoricalMetricsRequest, GenerateHistoricalMetricsResponse>
      generateHistoricalMetricsCallable() {
    throw new UnsupportedOperationException("Not implemented: generateHistoricalMetricsCallable()");
  }

  @Override
  public abstract void close();
}
