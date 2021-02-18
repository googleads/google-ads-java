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

import com.google.ads.googleads.v6.resources.OfflineUserDataJob;
import com.google.ads.googleads.v6.services.AddOfflineUserDataJobOperationsRequest;
import com.google.ads.googleads.v6.services.AddOfflineUserDataJobOperationsResponse;
import com.google.ads.googleads.v6.services.CreateOfflineUserDataJobRequest;
import com.google.ads.googleads.v6.services.CreateOfflineUserDataJobResponse;
import com.google.ads.googleads.v6.services.GetOfflineUserDataJobRequest;
import com.google.ads.googleads.v6.services.RunOfflineUserDataJobRequest;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.core.BackgroundResourceAggregation;
import com.google.api.gax.grpc.GrpcCallSettings;
import com.google.api.gax.grpc.GrpcStubCallableFactory;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.OperationCallable;
import com.google.api.gax.rpc.RequestParamsExtractor;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.common.collect.ImmutableMap;
import com.google.longrunning.Operation;
import com.google.longrunning.stub.GrpcOperationsStub;
import com.google.protobuf.Empty;
import io.grpc.MethodDescriptor;
import io.grpc.protobuf.ProtoUtils;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * gRPC stub implementation for the OfflineUserDataJobService service API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by gapic-generator-java")
public class GrpcOfflineUserDataJobServiceStub extends OfflineUserDataJobServiceStub {
  private static final MethodDescriptor<
          CreateOfflineUserDataJobRequest, CreateOfflineUserDataJobResponse>
      createOfflineUserDataJobMethodDescriptor =
          MethodDescriptor
              .<CreateOfflineUserDataJobRequest, CreateOfflineUserDataJobResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.ads.googleads.v6.services.OfflineUserDataJobService/CreateOfflineUserDataJob")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(CreateOfflineUserDataJobRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(CreateOfflineUserDataJobResponse.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<GetOfflineUserDataJobRequest, OfflineUserDataJob>
      getOfflineUserDataJobMethodDescriptor =
          MethodDescriptor.<GetOfflineUserDataJobRequest, OfflineUserDataJob>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.ads.googleads.v6.services.OfflineUserDataJobService/GetOfflineUserDataJob")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(GetOfflineUserDataJobRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(OfflineUserDataJob.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<
          AddOfflineUserDataJobOperationsRequest, AddOfflineUserDataJobOperationsResponse>
      addOfflineUserDataJobOperationsMethodDescriptor =
          MethodDescriptor
              .<AddOfflineUserDataJobOperationsRequest, AddOfflineUserDataJobOperationsResponse>
                  newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.ads.googleads.v6.services.OfflineUserDataJobService/AddOfflineUserDataJobOperations")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(
                      AddOfflineUserDataJobOperationsRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(
                      AddOfflineUserDataJobOperationsResponse.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<RunOfflineUserDataJobRequest, Operation>
      runOfflineUserDataJobMethodDescriptor =
          MethodDescriptor.<RunOfflineUserDataJobRequest, Operation>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.ads.googleads.v6.services.OfflineUserDataJobService/RunOfflineUserDataJob")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(RunOfflineUserDataJobRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(Operation.getDefaultInstance()))
              .build();

  private final UnaryCallable<CreateOfflineUserDataJobRequest, CreateOfflineUserDataJobResponse>
      createOfflineUserDataJobCallable;
  private final UnaryCallable<GetOfflineUserDataJobRequest, OfflineUserDataJob>
      getOfflineUserDataJobCallable;
  private final UnaryCallable<
          AddOfflineUserDataJobOperationsRequest, AddOfflineUserDataJobOperationsResponse>
      addOfflineUserDataJobOperationsCallable;
  private final UnaryCallable<RunOfflineUserDataJobRequest, Operation>
      runOfflineUserDataJobCallable;
  private final OperationCallable<RunOfflineUserDataJobRequest, Empty, Empty>
      runOfflineUserDataJobOperationCallable;

  private final BackgroundResource backgroundResources;
  private final GrpcOperationsStub operationsStub;
  private final GrpcStubCallableFactory callableFactory;

  public static final GrpcOfflineUserDataJobServiceStub create(
      OfflineUserDataJobServiceStubSettings settings) throws IOException {
    return new GrpcOfflineUserDataJobServiceStub(settings, ClientContext.create(settings));
  }

  public static final GrpcOfflineUserDataJobServiceStub create(ClientContext clientContext)
      throws IOException {
    return new GrpcOfflineUserDataJobServiceStub(
        OfflineUserDataJobServiceStubSettings.newBuilder().build(), clientContext);
  }

  public static final GrpcOfflineUserDataJobServiceStub create(
      ClientContext clientContext, GrpcStubCallableFactory callableFactory) throws IOException {
    return new GrpcOfflineUserDataJobServiceStub(
        OfflineUserDataJobServiceStubSettings.newBuilder().build(), clientContext, callableFactory);
  }

  /**
   * Constructs an instance of GrpcOfflineUserDataJobServiceStub, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected GrpcOfflineUserDataJobServiceStub(
      OfflineUserDataJobServiceStubSettings settings, ClientContext clientContext)
      throws IOException {
    this(settings, clientContext, new GrpcOfflineUserDataJobServiceCallableFactory());
  }

  /**
   * Constructs an instance of GrpcOfflineUserDataJobServiceStub, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected GrpcOfflineUserDataJobServiceStub(
      OfflineUserDataJobServiceStubSettings settings,
      ClientContext clientContext,
      GrpcStubCallableFactory callableFactory)
      throws IOException {
    this.callableFactory = callableFactory;
    this.operationsStub = GrpcOperationsStub.create(clientContext, callableFactory);

    GrpcCallSettings<CreateOfflineUserDataJobRequest, CreateOfflineUserDataJobResponse>
        createOfflineUserDataJobTransportSettings =
            GrpcCallSettings
                .<CreateOfflineUserDataJobRequest, CreateOfflineUserDataJobResponse>newBuilder()
                .setMethodDescriptor(createOfflineUserDataJobMethodDescriptor)
                .setParamsExtractor(
                    new RequestParamsExtractor<CreateOfflineUserDataJobRequest>() {
                      @Override
                      public Map<String, String> extract(CreateOfflineUserDataJobRequest request) {
                        ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                        params.put("customer_id", String.valueOf(request.getCustomerId()));
                        return params.build();
                      }
                    })
                .build();
    GrpcCallSettings<GetOfflineUserDataJobRequest, OfflineUserDataJob>
        getOfflineUserDataJobTransportSettings =
            GrpcCallSettings.<GetOfflineUserDataJobRequest, OfflineUserDataJob>newBuilder()
                .setMethodDescriptor(getOfflineUserDataJobMethodDescriptor)
                .setParamsExtractor(
                    new RequestParamsExtractor<GetOfflineUserDataJobRequest>() {
                      @Override
                      public Map<String, String> extract(GetOfflineUserDataJobRequest request) {
                        ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                        params.put("resource_name", String.valueOf(request.getResourceName()));
                        return params.build();
                      }
                    })
                .build();
    GrpcCallSettings<
            AddOfflineUserDataJobOperationsRequest, AddOfflineUserDataJobOperationsResponse>
        addOfflineUserDataJobOperationsTransportSettings =
            GrpcCallSettings
                .<AddOfflineUserDataJobOperationsRequest, AddOfflineUserDataJobOperationsResponse>
                    newBuilder()
                .setMethodDescriptor(addOfflineUserDataJobOperationsMethodDescriptor)
                .setParamsExtractor(
                    new RequestParamsExtractor<AddOfflineUserDataJobOperationsRequest>() {
                      @Override
                      public Map<String, String> extract(
                          AddOfflineUserDataJobOperationsRequest request) {
                        ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                        params.put("resource_name", String.valueOf(request.getResourceName()));
                        return params.build();
                      }
                    })
                .build();
    GrpcCallSettings<RunOfflineUserDataJobRequest, Operation>
        runOfflineUserDataJobTransportSettings =
            GrpcCallSettings.<RunOfflineUserDataJobRequest, Operation>newBuilder()
                .setMethodDescriptor(runOfflineUserDataJobMethodDescriptor)
                .setParamsExtractor(
                    new RequestParamsExtractor<RunOfflineUserDataJobRequest>() {
                      @Override
                      public Map<String, String> extract(RunOfflineUserDataJobRequest request) {
                        ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                        params.put("resource_name", String.valueOf(request.getResourceName()));
                        return params.build();
                      }
                    })
                .build();

    this.createOfflineUserDataJobCallable =
        callableFactory.createUnaryCallable(
            createOfflineUserDataJobTransportSettings,
            settings.createOfflineUserDataJobSettings(),
            clientContext);
    this.getOfflineUserDataJobCallable =
        callableFactory.createUnaryCallable(
            getOfflineUserDataJobTransportSettings,
            settings.getOfflineUserDataJobSettings(),
            clientContext);
    this.addOfflineUserDataJobOperationsCallable =
        callableFactory.createUnaryCallable(
            addOfflineUserDataJobOperationsTransportSettings,
            settings.addOfflineUserDataJobOperationsSettings(),
            clientContext);
    this.runOfflineUserDataJobCallable =
        callableFactory.createUnaryCallable(
            runOfflineUserDataJobTransportSettings,
            settings.runOfflineUserDataJobSettings(),
            clientContext);
    this.runOfflineUserDataJobOperationCallable =
        callableFactory.createOperationCallable(
            runOfflineUserDataJobTransportSettings,
            settings.runOfflineUserDataJobOperationSettings(),
            clientContext,
            operationsStub);

    this.backgroundResources =
        new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  public GrpcOperationsStub getOperationsStub() {
    return operationsStub;
  }

  public UnaryCallable<CreateOfflineUserDataJobRequest, CreateOfflineUserDataJobResponse>
      createOfflineUserDataJobCallable() {
    return createOfflineUserDataJobCallable;
  }

  public UnaryCallable<GetOfflineUserDataJobRequest, OfflineUserDataJob>
      getOfflineUserDataJobCallable() {
    return getOfflineUserDataJobCallable;
  }

  public UnaryCallable<
          AddOfflineUserDataJobOperationsRequest, AddOfflineUserDataJobOperationsResponse>
      addOfflineUserDataJobOperationsCallable() {
    return addOfflineUserDataJobOperationsCallable;
  }

  public UnaryCallable<RunOfflineUserDataJobRequest, Operation> runOfflineUserDataJobCallable() {
    return runOfflineUserDataJobCallable;
  }

  public OperationCallable<RunOfflineUserDataJobRequest, Empty, Empty>
      runOfflineUserDataJobOperationCallable() {
    return runOfflineUserDataJobOperationCallable;
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
