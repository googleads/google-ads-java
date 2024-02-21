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

package com.google.ads.googleads.v15.services.stub;

import static com.google.ads.googleads.v15.services.ExperimentServiceClient.ListExperimentAsyncErrorsPagedResponse;

import com.google.ads.googleads.v15.services.EndExperimentRequest;
import com.google.ads.googleads.v15.services.GraduateExperimentRequest;
import com.google.ads.googleads.v15.services.ListExperimentAsyncErrorsRequest;
import com.google.ads.googleads.v15.services.ListExperimentAsyncErrorsResponse;
import com.google.ads.googleads.v15.services.MutateExperimentsRequest;
import com.google.ads.googleads.v15.services.MutateExperimentsResponse;
import com.google.ads.googleads.v15.services.PromoteExperimentMetadata;
import com.google.ads.googleads.v15.services.PromoteExperimentRequest;
import com.google.ads.googleads.v15.services.ScheduleExperimentMetadata;
import com.google.ads.googleads.v15.services.ScheduleExperimentRequest;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.OperationCallable;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.longrunning.Operation;
import com.google.longrunning.stub.OperationsStub;
import com.google.protobuf.Empty;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Base stub class for the ExperimentService service API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by gapic-generator-java")
public abstract class ExperimentServiceStub implements BackgroundResource {

  public OperationsStub getOperationsStub() {
    throw new UnsupportedOperationException("Not implemented: getOperationsStub()");
  }

  public UnaryCallable<MutateExperimentsRequest, MutateExperimentsResponse>
      mutateExperimentsCallable() {
    throw new UnsupportedOperationException("Not implemented: mutateExperimentsCallable()");
  }

  public UnaryCallable<EndExperimentRequest, Empty> endExperimentCallable() {
    throw new UnsupportedOperationException("Not implemented: endExperimentCallable()");
  }

  public UnaryCallable<ListExperimentAsyncErrorsRequest, ListExperimentAsyncErrorsPagedResponse>
      listExperimentAsyncErrorsPagedCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: listExperimentAsyncErrorsPagedCallable()");
  }

  public UnaryCallable<ListExperimentAsyncErrorsRequest, ListExperimentAsyncErrorsResponse>
      listExperimentAsyncErrorsCallable() {
    throw new UnsupportedOperationException("Not implemented: listExperimentAsyncErrorsCallable()");
  }

  public UnaryCallable<GraduateExperimentRequest, Empty> graduateExperimentCallable() {
    throw new UnsupportedOperationException("Not implemented: graduateExperimentCallable()");
  }

  public OperationCallable<ScheduleExperimentRequest, Empty, ScheduleExperimentMetadata>
      scheduleExperimentOperationCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: scheduleExperimentOperationCallable()");
  }

  public UnaryCallable<ScheduleExperimentRequest, Operation> scheduleExperimentCallable() {
    throw new UnsupportedOperationException("Not implemented: scheduleExperimentCallable()");
  }

  public OperationCallable<PromoteExperimentRequest, Empty, PromoteExperimentMetadata>
      promoteExperimentOperationCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: promoteExperimentOperationCallable()");
  }

  public UnaryCallable<PromoteExperimentRequest, Operation> promoteExperimentCallable() {
    throw new UnsupportedOperationException("Not implemented: promoteExperimentCallable()");
  }

  @Override
  public abstract void close();
}
