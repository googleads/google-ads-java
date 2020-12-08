/*
 * Copyright 2020 Google LLC
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

package com.google.ads.googleads.v6.services.stub;

import com.google.ads.googleads.v6.resources.CustomAudience;
import com.google.ads.googleads.v6.services.GetCustomAudienceRequest;
import com.google.ads.googleads.v6.services.MutateCustomAudiencesRequest;
import com.google.ads.googleads.v6.services.MutateCustomAudiencesResponse;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.UnaryCallable;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Base stub class for the CustomAudienceService service API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by gapic-generator")
public abstract class CustomAudienceServiceStub implements BackgroundResource {

  public UnaryCallable<GetCustomAudienceRequest, CustomAudience> getCustomAudienceCallable() {
    throw new UnsupportedOperationException("Not implemented: getCustomAudienceCallable()");
  }

  public UnaryCallable<MutateCustomAudiencesRequest, MutateCustomAudiencesResponse>
      mutateCustomAudiencesCallable() {
    throw new UnsupportedOperationException("Not implemented: mutateCustomAudiencesCallable()");
  }

  @Override
  public abstract void close();
}
