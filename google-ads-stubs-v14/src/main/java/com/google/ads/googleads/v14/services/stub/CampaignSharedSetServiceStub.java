/*
 * Copyright 2024 Google LLC
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

package com.google.ads.googleads.v14.services.stub;

import com.google.ads.googleads.v14.services.MutateCampaignSharedSetsRequest;
import com.google.ads.googleads.v14.services.MutateCampaignSharedSetsResponse;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.UnaryCallable;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Base stub class for the CampaignSharedSetService service API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by gapic-generator-java")
public abstract class CampaignSharedSetServiceStub implements BackgroundResource {

  public UnaryCallable<MutateCampaignSharedSetsRequest, MutateCampaignSharedSetsResponse>
      mutateCampaignSharedSetsCallable() {
    throw new UnsupportedOperationException("Not implemented: mutateCampaignSharedSetsCallable()");
  }

  @Override
  public abstract void close();
}
