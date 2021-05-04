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

import static com.google.ads.googleads.v7.services.CampaignExperimentServiceClient.ListCampaignExperimentAsyncErrorsPagedResponse;

import com.google.ads.googleads.v7.resources.CampaignExperiment;
import com.google.ads.googleads.v7.services.CreateCampaignExperimentMetadata;
import com.google.ads.googleads.v7.services.CreateCampaignExperimentRequest;
import com.google.ads.googleads.v7.services.EndCampaignExperimentRequest;
import com.google.ads.googleads.v7.services.GetCampaignExperimentRequest;
import com.google.ads.googleads.v7.services.GraduateCampaignExperimentRequest;
import com.google.ads.googleads.v7.services.GraduateCampaignExperimentResponse;
import com.google.ads.googleads.v7.services.ListCampaignExperimentAsyncErrorsRequest;
import com.google.ads.googleads.v7.services.ListCampaignExperimentAsyncErrorsResponse;
import com.google.ads.googleads.v7.services.MutateCampaignExperimentsRequest;
import com.google.ads.googleads.v7.services.MutateCampaignExperimentsResponse;
import com.google.ads.googleads.v7.services.PromoteCampaignExperimentRequest;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.OperationCallable;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.longrunning.Operation;
import com.google.longrunning.stub.OperationsStub;
import com.google.protobuf.Empty;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Base stub class for the CampaignExperimentService service API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by gapic-generator-java")
public abstract class CampaignExperimentServiceStub implements BackgroundResource {

  public OperationsStub getOperationsStub() {
    throw new UnsupportedOperationException("Not implemented: getOperationsStub()");
  }

  public UnaryCallable<GetCampaignExperimentRequest, CampaignExperiment>
      getCampaignExperimentCallable() {
    throw new UnsupportedOperationException("Not implemented: getCampaignExperimentCallable()");
  }

  public OperationCallable<CreateCampaignExperimentRequest, Empty, CreateCampaignExperimentMetadata>
      createCampaignExperimentOperationCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: createCampaignExperimentOperationCallable()");
  }

  public UnaryCallable<CreateCampaignExperimentRequest, Operation>
      createCampaignExperimentCallable() {
    throw new UnsupportedOperationException("Not implemented: createCampaignExperimentCallable()");
  }

  public UnaryCallable<MutateCampaignExperimentsRequest, MutateCampaignExperimentsResponse>
      mutateCampaignExperimentsCallable() {
    throw new UnsupportedOperationException("Not implemented: mutateCampaignExperimentsCallable()");
  }

  public UnaryCallable<GraduateCampaignExperimentRequest, GraduateCampaignExperimentResponse>
      graduateCampaignExperimentCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: graduateCampaignExperimentCallable()");
  }

  public OperationCallable<PromoteCampaignExperimentRequest, Empty, Empty>
      promoteCampaignExperimentOperationCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: promoteCampaignExperimentOperationCallable()");
  }

  public UnaryCallable<PromoteCampaignExperimentRequest, Operation>
      promoteCampaignExperimentCallable() {
    throw new UnsupportedOperationException("Not implemented: promoteCampaignExperimentCallable()");
  }

  public UnaryCallable<EndCampaignExperimentRequest, Empty> endCampaignExperimentCallable() {
    throw new UnsupportedOperationException("Not implemented: endCampaignExperimentCallable()");
  }

  public UnaryCallable<
          ListCampaignExperimentAsyncErrorsRequest, ListCampaignExperimentAsyncErrorsPagedResponse>
      listCampaignExperimentAsyncErrorsPagedCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: listCampaignExperimentAsyncErrorsPagedCallable()");
  }

  public UnaryCallable<
          ListCampaignExperimentAsyncErrorsRequest, ListCampaignExperimentAsyncErrorsResponse>
      listCampaignExperimentAsyncErrorsCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: listCampaignExperimentAsyncErrorsCallable()");
  }

  @Override
  public abstract void close();
}
