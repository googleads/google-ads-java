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

import com.google.ads.googleads.v6.services.UploadUserDataRequest;
import com.google.ads.googleads.v6.services.UploadUserDataResponse;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.core.BackgroundResourceAggregation;
import com.google.api.gax.grpc.GrpcCallSettings;
import com.google.api.gax.grpc.GrpcStubCallableFactory;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.RequestParamsExtractor;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.common.collect.ImmutableMap;
import com.google.longrunning.stub.GrpcOperationsStub;
import io.grpc.MethodDescriptor;
import io.grpc.protobuf.ProtoUtils;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * gRPC stub implementation for the UserDataService service API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by gapic-generator-java")
public class GrpcUserDataServiceStub extends UserDataServiceStub {
  private static final MethodDescriptor<UploadUserDataRequest, UploadUserDataResponse>
      uploadUserDataMethodDescriptor =
          MethodDescriptor.<UploadUserDataRequest, UploadUserDataResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName("google.ads.googleads.v6.services.UserDataService/UploadUserData")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(UploadUserDataRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(UploadUserDataResponse.getDefaultInstance()))
              .build();

  private final UnaryCallable<UploadUserDataRequest, UploadUserDataResponse> uploadUserDataCallable;

  private final BackgroundResource backgroundResources;
  private final GrpcOperationsStub operationsStub;
  private final GrpcStubCallableFactory callableFactory;

  public static final GrpcUserDataServiceStub create(UserDataServiceStubSettings settings)
      throws IOException {
    return new GrpcUserDataServiceStub(settings, ClientContext.create(settings));
  }

  public static final GrpcUserDataServiceStub create(ClientContext clientContext)
      throws IOException {
    return new GrpcUserDataServiceStub(
        UserDataServiceStubSettings.newBuilder().build(), clientContext);
  }

  public static final GrpcUserDataServiceStub create(
      ClientContext clientContext, GrpcStubCallableFactory callableFactory) throws IOException {
    return new GrpcUserDataServiceStub(
        UserDataServiceStubSettings.newBuilder().build(), clientContext, callableFactory);
  }

  protected GrpcUserDataServiceStub(
      UserDataServiceStubSettings settings, ClientContext clientContext) throws IOException {
    this(settings, clientContext, new GrpcUserDataServiceCallableFactory());
  }

  protected GrpcUserDataServiceStub(
      UserDataServiceStubSettings settings,
      ClientContext clientContext,
      GrpcStubCallableFactory callableFactory)
      throws IOException {
    this.callableFactory = callableFactory;
    this.operationsStub = GrpcOperationsStub.create(clientContext, callableFactory);

    GrpcCallSettings<UploadUserDataRequest, UploadUserDataResponse>
        uploadUserDataTransportSettings =
            GrpcCallSettings.<UploadUserDataRequest, UploadUserDataResponse>newBuilder()
                .setMethodDescriptor(uploadUserDataMethodDescriptor)
                .setParamsExtractor(
                    new RequestParamsExtractor<UploadUserDataRequest>() {
                      @Override
                      public Map<String, String> extract(UploadUserDataRequest request) {
                        ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                        params.put("customer_id", String.valueOf(request.getCustomerId()));
                        return params.build();
                      }
                    })
                .build();

    this.uploadUserDataCallable =
        callableFactory.createUnaryCallable(
            uploadUserDataTransportSettings, settings.uploadUserDataSettings(), clientContext);

    this.backgroundResources =
        new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  public GrpcOperationsStub getOperationsStub() {
    return operationsStub;
  }

  public UnaryCallable<UploadUserDataRequest, UploadUserDataResponse> uploadUserDataCallable() {
    return uploadUserDataCallable;
  }

  @Override
  public final void close() {
    shutdown();
  }

  @Override
  public void shutdown() {
    backgroundResources.shutdown();
  }

  @Override
  public boolean isShutdown() {
    return backgroundResources.isShutdown();
  }

  @Override
  public boolean isTerminated() {
    return backgroundResources.isTerminated();
  }

  @Override
  public void shutdownNow() {
    backgroundResources.shutdownNow();
  }

  @Override
  public boolean awaitTermination(long duration, TimeUnit unit) throws InterruptedException {
    return backgroundResources.awaitTermination(duration, unit);
  }
}
