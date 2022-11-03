/*
 * Copyright 2022 Google LLC
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

package com.google.ads.googleads.v12.services.stub;

import com.google.ads.googleads.v12.resources.OfflineUserDataJobMetadata;
import com.google.ads.googleads.v12.services.AddOfflineUserDataJobOperationsRequest;
import com.google.ads.googleads.v12.services.AddOfflineUserDataJobOperationsResponse;
import com.google.ads.googleads.v12.services.CreateOfflineUserDataJobRequest;
import com.google.ads.googleads.v12.services.CreateOfflineUserDataJobResponse;
import com.google.ads.googleads.v12.services.RunOfflineUserDataJobRequest;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.OperationCallable;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.longrunning.Operation;
import com.google.longrunning.stub.OperationsStub;
import com.google.protobuf.Empty;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Base stub class for the OfflineUserDataJobService service API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by gapic-generator-java")
public abstract class OfflineUserDataJobServiceStub implements BackgroundResource {

  public OperationsStub getOperationsStub() {
    throw new UnsupportedOperationException("Not implemented: getOperationsStub()");
  }

  public UnaryCallable<CreateOfflineUserDataJobRequest, CreateOfflineUserDataJobResponse>
      createOfflineUserDataJobCallable() {
    throw new UnsupportedOperationException("Not implemented: createOfflineUserDataJobCallable()");
  }

  public UnaryCallable<
          AddOfflineUserDataJobOperationsRequest, AddOfflineUserDataJobOperationsResponse>
      addOfflineUserDataJobOperationsCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: addOfflineUserDataJobOperationsCallable()");
  }

  public OperationCallable<RunOfflineUserDataJobRequest, Empty, OfflineUserDataJobMetadata>
      runOfflineUserDataJobOperationCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: runOfflineUserDataJobOperationCallable()");
  }

  public UnaryCallable<RunOfflineUserDataJobRequest, Operation> runOfflineUserDataJobCallable() {
    throw new UnsupportedOperationException("Not implemented: runOfflineUserDataJobCallable()");
  }

  @Override
  public abstract void close();
}
