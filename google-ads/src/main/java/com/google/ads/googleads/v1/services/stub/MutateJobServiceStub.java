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
package com.google.ads.googleads.v1.services.stub;

import static com.google.ads.googleads.v1.services.MutateJobServiceClient.ListMutateJobResultsPagedResponse;

import com.google.ads.googleads.v1.resources.MutateJob;
import com.google.ads.googleads.v1.resources.MutateJob.MutateJobMetadata;
import com.google.ads.googleads.v1.services.AddMutateJobOperationsRequest;
import com.google.ads.googleads.v1.services.AddMutateJobOperationsResponse;
import com.google.ads.googleads.v1.services.CreateMutateJobRequest;
import com.google.ads.googleads.v1.services.CreateMutateJobResponse;
import com.google.ads.googleads.v1.services.GetMutateJobRequest;
import com.google.ads.googleads.v1.services.ListMutateJobResultsRequest;
import com.google.ads.googleads.v1.services.ListMutateJobResultsResponse;
import com.google.ads.googleads.v1.services.RunMutateJobRequest;
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
public abstract class MutateJobServiceStub implements BackgroundResource {

  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public OperationsStub getOperationsStub() {
    throw new UnsupportedOperationException("Not implemented: getOperationsStub()");
  }

  public UnaryCallable<CreateMutateJobRequest, CreateMutateJobResponse> createMutateJobCallable() {
    throw new UnsupportedOperationException("Not implemented: createMutateJobCallable()");
  }

  public UnaryCallable<GetMutateJobRequest, MutateJob> getMutateJobCallable() {
    throw new UnsupportedOperationException("Not implemented: getMutateJobCallable()");
  }

  public UnaryCallable<ListMutateJobResultsRequest, ListMutateJobResultsPagedResponse>
      listMutateJobResultsPagedCallable() {
    throw new UnsupportedOperationException("Not implemented: listMutateJobResultsPagedCallable()");
  }

  public UnaryCallable<ListMutateJobResultsRequest, ListMutateJobResultsResponse>
      listMutateJobResultsCallable() {
    throw new UnsupportedOperationException("Not implemented: listMutateJobResultsCallable()");
  }

  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public OperationCallable<RunMutateJobRequest, Empty, MutateJobMetadata>
      runMutateJobOperationCallable() {
    throw new UnsupportedOperationException("Not implemented: runMutateJobOperationCallable()");
  }

  public UnaryCallable<RunMutateJobRequest, Operation> runMutateJobCallable() {
    throw new UnsupportedOperationException("Not implemented: runMutateJobCallable()");
  }

  public UnaryCallable<AddMutateJobOperationsRequest, AddMutateJobOperationsResponse>
      addMutateJobOperationsCallable() {
    throw new UnsupportedOperationException("Not implemented: addMutateJobOperationsCallable()");
  }

  @Override
  public abstract void close();
}
