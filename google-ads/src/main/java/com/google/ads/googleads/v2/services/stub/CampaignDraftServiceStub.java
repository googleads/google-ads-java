/*
 * Copyright 2019 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.google.ads.googleads.v2.services.stub;

import static com.google.ads.googleads.v2.services.CampaignDraftServiceClient.ListCampaignDraftAsyncErrorsPagedResponse;

import com.google.ads.googleads.v2.resources.CampaignDraft;
import com.google.ads.googleads.v2.services.GetCampaignDraftRequest;
import com.google.ads.googleads.v2.services.ListCampaignDraftAsyncErrorsRequest;
import com.google.ads.googleads.v2.services.ListCampaignDraftAsyncErrorsResponse;
import com.google.ads.googleads.v2.services.MutateCampaignDraftsRequest;
import com.google.ads.googleads.v2.services.MutateCampaignDraftsResponse;
import com.google.ads.googleads.v2.services.PromoteCampaignDraftRequest;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.OperationCallable;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.longrunning.Operation;
import com.google.longrunning.stub.OperationsStub;
import com.google.protobuf.Empty;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS
/**
 * Base stub class for Google Ads API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by gapic-generator")
@BetaApi("A restructuring of stub classes is planned, so this may break in the future")
public abstract class CampaignDraftServiceStub implements BackgroundResource {

  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public OperationsStub getOperationsStub() {
    throw new UnsupportedOperationException("Not implemented: getOperationsStub()");
  }

  public UnaryCallable<GetCampaignDraftRequest, CampaignDraft> getCampaignDraftCallable() {
    throw new UnsupportedOperationException("Not implemented: getCampaignDraftCallable()");
  }

  public UnaryCallable<MutateCampaignDraftsRequest, MutateCampaignDraftsResponse>
      mutateCampaignDraftsCallable() {
    throw new UnsupportedOperationException("Not implemented: mutateCampaignDraftsCallable()");
  }

  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public OperationCallable<PromoteCampaignDraftRequest, Empty, Empty>
      promoteCampaignDraftOperationCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: promoteCampaignDraftOperationCallable()");
  }

  public UnaryCallable<PromoteCampaignDraftRequest, Operation> promoteCampaignDraftCallable() {
    throw new UnsupportedOperationException("Not implemented: promoteCampaignDraftCallable()");
  }

  public UnaryCallable<
          ListCampaignDraftAsyncErrorsRequest, ListCampaignDraftAsyncErrorsPagedResponse>
      listCampaignDraftAsyncErrorsPagedCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: listCampaignDraftAsyncErrorsPagedCallable()");
  }

  public UnaryCallable<ListCampaignDraftAsyncErrorsRequest, ListCampaignDraftAsyncErrorsResponse>
      listCampaignDraftAsyncErrorsCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: listCampaignDraftAsyncErrorsCallable()");
  }

  @Override
  public abstract void close();
}
