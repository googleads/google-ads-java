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

import static com.google.ads.googleads.v15.services.BatchJobServiceClient.ListBatchJobResultsPagedResponse;

import com.google.ads.googleads.v15.resources.BatchJob;
import com.google.ads.googleads.v15.services.AddBatchJobOperationsRequest;
import com.google.ads.googleads.v15.services.AddBatchJobOperationsResponse;
import com.google.ads.googleads.v15.services.ListBatchJobResultsRequest;
import com.google.ads.googleads.v15.services.ListBatchJobResultsResponse;
import com.google.ads.googleads.v15.services.MutateBatchJobRequest;
import com.google.ads.googleads.v15.services.MutateBatchJobResponse;
import com.google.ads.googleads.v15.services.RunBatchJobRequest;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.OperationCallable;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.longrunning.Operation;
import com.google.longrunning.stub.OperationsStub;
import com.google.protobuf.Empty;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Base stub class for the BatchJobService service API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by gapic-generator-java")
public abstract class BatchJobServiceStub implements BackgroundResource {

  public OperationsStub getOperationsStub() {
    throw new UnsupportedOperationException("Not implemented: getOperationsStub()");
  }

  public UnaryCallable<MutateBatchJobRequest, MutateBatchJobResponse> mutateBatchJobCallable() {
    throw new UnsupportedOperationException("Not implemented: mutateBatchJobCallable()");
  }

  public UnaryCallable<ListBatchJobResultsRequest, ListBatchJobResultsPagedResponse>
      listBatchJobResultsPagedCallable() {
    throw new UnsupportedOperationException("Not implemented: listBatchJobResultsPagedCallable()");
  }

  public UnaryCallable<ListBatchJobResultsRequest, ListBatchJobResultsResponse>
      listBatchJobResultsCallable() {
    throw new UnsupportedOperationException("Not implemented: listBatchJobResultsCallable()");
  }

  public OperationCallable<RunBatchJobRequest, Empty, BatchJob.BatchJobMetadata>
      runBatchJobOperationCallable() {
    throw new UnsupportedOperationException("Not implemented: runBatchJobOperationCallable()");
  }

  public UnaryCallable<RunBatchJobRequest, Operation> runBatchJobCallable() {
    throw new UnsupportedOperationException("Not implemented: runBatchJobCallable()");
  }

  public UnaryCallable<AddBatchJobOperationsRequest, AddBatchJobOperationsResponse>
      addBatchJobOperationsCallable() {
    throw new UnsupportedOperationException("Not implemented: addBatchJobOperationsCallable()");
  }

  @Override
  public abstract void close();
}
