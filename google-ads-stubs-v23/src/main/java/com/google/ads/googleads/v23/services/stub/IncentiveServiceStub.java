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

import com.google.ads.googleads.v23.services.ApplyIncentiveRequest;
import com.google.ads.googleads.v23.services.ApplyIncentiveResponse;
import com.google.ads.googleads.v23.services.FetchIncentiveRequest;
import com.google.ads.googleads.v23.services.FetchIncentiveResponse;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.UnaryCallable;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Base stub class for the IncentiveService service API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by gapic-generator-java")
public abstract class IncentiveServiceStub implements BackgroundResource {

  public UnaryCallable<FetchIncentiveRequest, FetchIncentiveResponse> fetchIncentiveCallable() {
    throw new UnsupportedOperationException("Not implemented: fetchIncentiveCallable()");
  }

  public UnaryCallable<ApplyIncentiveRequest, ApplyIncentiveResponse> applyIncentiveCallable() {
    throw new UnsupportedOperationException("Not implemented: applyIncentiveCallable()");
  }

  @Override
  public abstract void close();
}
