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
import com.google.api.gax.core.BackgroundResourceAggregation;
import com.google.api.gax.grpc.GrpcCallSettings;
import com.google.api.gax.grpc.GrpcStubCallableFactory;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.OperationCallable;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.longrunning.Operation;
import com.google.longrunning.stub.GrpcOperationsStub;
import com.google.protobuf.Empty;
import io.grpc.MethodDescriptor;
import io.grpc.protobuf.ProtoUtils;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS
/**
 * gRPC stub implementation for Google Ads API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by gapic-generator")
@BetaApi("A restructuring of stub classes is planned, so this may break in the future")
public class GrpcMutateJobServiceStub extends MutateJobServiceStub {

  private static final MethodDescriptor<CreateMutateJobRequest, CreateMutateJobResponse>
      createMutateJobMethodDescriptor =
          MethodDescriptor.<CreateMutateJobRequest, CreateMutateJobResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.ads.googleads.v1.services.MutateJobService/CreateMutateJob")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(CreateMutateJobRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(CreateMutateJobResponse.getDefaultInstance()))
              .build();
  private static final MethodDescriptor<GetMutateJobRequest, MutateJob>
      getMutateJobMethodDescriptor =
          MethodDescriptor.<GetMutateJobRequest, MutateJob>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName("google.ads.googleads.v1.services.MutateJobService/GetMutateJob")
              .setRequestMarshaller(ProtoUtils.marshaller(GetMutateJobRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(MutateJob.getDefaultInstance()))
              .build();
  private static final MethodDescriptor<ListMutateJobResultsRequest, ListMutateJobResultsResponse>
      listMutateJobResultsMethodDescriptor =
          MethodDescriptor.<ListMutateJobResultsRequest, ListMutateJobResultsResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.ads.googleads.v1.services.MutateJobService/ListMutateJobResults")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(ListMutateJobResultsRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(ListMutateJobResultsResponse.getDefaultInstance()))
              .build();
  private static final MethodDescriptor<RunMutateJobRequest, Operation>
      runMutateJobMethodDescriptor =
          MethodDescriptor.<RunMutateJobRequest, Operation>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName("google.ads.googleads.v1.services.MutateJobService/RunMutateJob")
              .setRequestMarshaller(ProtoUtils.marshaller(RunMutateJobRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(Operation.getDefaultInstance()))
              .build();
  private static final MethodDescriptor<
          AddMutateJobOperationsRequest, AddMutateJobOperationsResponse>
      addMutateJobOperationsMethodDescriptor =
          MethodDescriptor
              .<AddMutateJobOperationsRequest, AddMutateJobOperationsResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.ads.googleads.v1.services.MutateJobService/AddMutateJobOperations")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(AddMutateJobOperationsRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(AddMutateJobOperationsResponse.getDefaultInstance()))
              .build();

  private final BackgroundResource backgroundResources;
  private final GrpcOperationsStub operationsStub;

  private final UnaryCallable<CreateMutateJobRequest, CreateMutateJobResponse>
      createMutateJobCallable;
  private final UnaryCallable<GetMutateJobRequest, MutateJob> getMutateJobCallable;
  private final UnaryCallable<ListMutateJobResultsRequest, ListMutateJobResultsResponse>
      listMutateJobResultsCallable;
  private final UnaryCallable<ListMutateJobResultsRequest, ListMutateJobResultsPagedResponse>
      listMutateJobResultsPagedCallable;
  private final UnaryCallable<RunMutateJobRequest, Operation> runMutateJobCallable;
  private final OperationCallable<RunMutateJobRequest, Empty, MutateJobMetadata>
      runMutateJobOperationCallable;
  private final UnaryCallable<AddMutateJobOperationsRequest, AddMutateJobOperationsResponse>
      addMutateJobOperationsCallable;

  private final GrpcStubCallableFactory callableFactory;

  public static final GrpcMutateJobServiceStub create(MutateJobServiceStubSettings settings)
      throws IOException {
    return new GrpcMutateJobServiceStub(settings, ClientContext.create(settings));
  }

  public static final GrpcMutateJobServiceStub create(ClientContext clientContext)
      throws IOException {
    return new GrpcMutateJobServiceStub(
        MutateJobServiceStubSettings.newBuilder().build(), clientContext);
  }

  public static final GrpcMutateJobServiceStub create(
      ClientContext clientContext, GrpcStubCallableFactory callableFactory) throws IOException {
    return new GrpcMutateJobServiceStub(
        MutateJobServiceStubSettings.newBuilder().build(), clientContext, callableFactory);
  }

  /**
   * Constructs an instance of GrpcMutateJobServiceStub, using the given settings. This is protected
   * so that it is easy to make a subclass, but otherwise, the static factory methods should be
   * preferred.
   */
  protected GrpcMutateJobServiceStub(
      MutateJobServiceStubSettings settings, ClientContext clientContext) throws IOException {
    this(settings, clientContext, new GrpcMutateJobServiceCallableFactory());
  }

  /**
   * Constructs an instance of GrpcMutateJobServiceStub, using the given settings. This is protected
   * so that it is easy to make a subclass, but otherwise, the static factory methods should be
   * preferred.
   */
  protected GrpcMutateJobServiceStub(
      MutateJobServiceStubSettings settings,
      ClientContext clientContext,
      GrpcStubCallableFactory callableFactory)
      throws IOException {
    this.callableFactory = callableFactory;
    this.operationsStub = GrpcOperationsStub.create(clientContext, callableFactory);

    GrpcCallSettings<CreateMutateJobRequest, CreateMutateJobResponse>
        createMutateJobTransportSettings =
            GrpcCallSettings.<CreateMutateJobRequest, CreateMutateJobResponse>newBuilder()
                .setMethodDescriptor(createMutateJobMethodDescriptor)
                .build();
    GrpcCallSettings<GetMutateJobRequest, MutateJob> getMutateJobTransportSettings =
        GrpcCallSettings.<GetMutateJobRequest, MutateJob>newBuilder()
            .setMethodDescriptor(getMutateJobMethodDescriptor)
            .build();
    GrpcCallSettings<ListMutateJobResultsRequest, ListMutateJobResultsResponse>
        listMutateJobResultsTransportSettings =
            GrpcCallSettings.<ListMutateJobResultsRequest, ListMutateJobResultsResponse>newBuilder()
                .setMethodDescriptor(listMutateJobResultsMethodDescriptor)
                .build();
    GrpcCallSettings<RunMutateJobRequest, Operation> runMutateJobTransportSettings =
        GrpcCallSettings.<RunMutateJobRequest, Operation>newBuilder()
            .setMethodDescriptor(runMutateJobMethodDescriptor)
            .build();
    GrpcCallSettings<AddMutateJobOperationsRequest, AddMutateJobOperationsResponse>
        addMutateJobOperationsTransportSettings =
            GrpcCallSettings
                .<AddMutateJobOperationsRequest, AddMutateJobOperationsResponse>newBuilder()
                .setMethodDescriptor(addMutateJobOperationsMethodDescriptor)
                .build();

    this.createMutateJobCallable =
        callableFactory.createUnaryCallable(
            createMutateJobTransportSettings, settings.createMutateJobSettings(), clientContext);
    this.getMutateJobCallable =
        callableFactory.createUnaryCallable(
            getMutateJobTransportSettings, settings.getMutateJobSettings(), clientContext);
    this.listMutateJobResultsCallable =
        callableFactory.createUnaryCallable(
            listMutateJobResultsTransportSettings,
            settings.listMutateJobResultsSettings(),
            clientContext);
    this.listMutateJobResultsPagedCallable =
        callableFactory.createPagedCallable(
            listMutateJobResultsTransportSettings,
            settings.listMutateJobResultsSettings(),
            clientContext);
    this.runMutateJobCallable =
        callableFactory.createUnaryCallable(
            runMutateJobTransportSettings, settings.runMutateJobSettings(), clientContext);
    this.runMutateJobOperationCallable =
        callableFactory.createOperationCallable(
            runMutateJobTransportSettings,
            settings.runMutateJobOperationSettings(),
            clientContext,
            this.operationsStub);
    this.addMutateJobOperationsCallable =
        callableFactory.createUnaryCallable(
            addMutateJobOperationsTransportSettings,
            settings.addMutateJobOperationsSettings(),
            clientContext);

    backgroundResources = new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public GrpcOperationsStub getOperationsStub() {
    return operationsStub;
  }

  public UnaryCallable<CreateMutateJobRequest, CreateMutateJobResponse> createMutateJobCallable() {
    return createMutateJobCallable;
  }

  public UnaryCallable<GetMutateJobRequest, MutateJob> getMutateJobCallable() {
    return getMutateJobCallable;
  }

  public UnaryCallable<ListMutateJobResultsRequest, ListMutateJobResultsPagedResponse>
      listMutateJobResultsPagedCallable() {
    return listMutateJobResultsPagedCallable;
  }

  public UnaryCallable<ListMutateJobResultsRequest, ListMutateJobResultsResponse>
      listMutateJobResultsCallable() {
    return listMutateJobResultsCallable;
  }

  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public OperationCallable<RunMutateJobRequest, Empty, MutateJobMetadata>
      runMutateJobOperationCallable() {
    return runMutateJobOperationCallable;
  }

  public UnaryCallable<RunMutateJobRequest, Operation> runMutateJobCallable() {
    return runMutateJobCallable;
  }

  public UnaryCallable<AddMutateJobOperationsRequest, AddMutateJobOperationsResponse>
      addMutateJobOperationsCallable() {
    return addMutateJobOperationsCallable;
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
