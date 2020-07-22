/*
 * Copyright 2020 Google LLC
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
package com.google.ads.googleads.v3.services.stub;

import com.google.ads.googleads.v3.resources.OfflineUserDataJob;
import com.google.ads.googleads.v3.services.AddOfflineUserDataJobOperationsRequest;
import com.google.ads.googleads.v3.services.AddOfflineUserDataJobOperationsResponse;
import com.google.ads.googleads.v3.services.CreateOfflineUserDataJobRequest;
import com.google.ads.googleads.v3.services.CreateOfflineUserDataJobResponse;
import com.google.ads.googleads.v3.services.GetOfflineUserDataJobRequest;
import com.google.ads.googleads.v3.services.RunOfflineUserDataJobRequest;
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
public abstract class OfflineUserDataJobServiceStub implements BackgroundResource {

  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public OperationsStub getOperationsStub() {
    throw new UnsupportedOperationException("Not implemented: getOperationsStub()");
  }

  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public OperationCallable<RunOfflineUserDataJobRequest, Empty, Empty>
      runOfflineUserDataJobOperationCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: runOfflineUserDataJobOperationCallable()");
  }

  public UnaryCallable<RunOfflineUserDataJobRequest, Operation> runOfflineUserDataJobCallable() {
    throw new UnsupportedOperationException("Not implemented: runOfflineUserDataJobCallable()");
  }

  public UnaryCallable<CreateOfflineUserDataJobRequest, CreateOfflineUserDataJobResponse>
      createOfflineUserDataJobCallable() {
    throw new UnsupportedOperationException("Not implemented: createOfflineUserDataJobCallable()");
  }

  public UnaryCallable<GetOfflineUserDataJobRequest, OfflineUserDataJob>
      getOfflineUserDataJobCallable() {
    throw new UnsupportedOperationException("Not implemented: getOfflineUserDataJobCallable()");
  }

  public UnaryCallable<
          AddOfflineUserDataJobOperationsRequest, AddOfflineUserDataJobOperationsResponse>
      addOfflineUserDataJobOperationsCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: addOfflineUserDataJobOperationsCallable()");
  }

  @Override
  public abstract void close();
}
