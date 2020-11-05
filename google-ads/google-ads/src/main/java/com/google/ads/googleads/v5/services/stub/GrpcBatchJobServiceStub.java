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
package com.google.ads.googleads.v5.services.stub;

import static com.google.ads.googleads.v5.services.BatchJobServiceClient.ListBatchJobResultsPagedResponse;

import com.google.ads.googleads.v5.resources.BatchJob;
import com.google.ads.googleads.v5.resources.BatchJob.BatchJobMetadata;
import com.google.ads.googleads.v5.services.AddBatchJobOperationsRequest;
import com.google.ads.googleads.v5.services.AddBatchJobOperationsResponse;
import com.google.ads.googleads.v5.services.GetBatchJobRequest;
import com.google.ads.googleads.v5.services.ListBatchJobResultsRequest;
import com.google.ads.googleads.v5.services.ListBatchJobResultsResponse;
import com.google.ads.googleads.v5.services.MutateBatchJobRequest;
import com.google.ads.googleads.v5.services.MutateBatchJobResponse;
import com.google.ads.googleads.v5.services.RunBatchJobRequest;
import com.google.api.core.BetaApi;
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

// AUTO-GENERATED DOCUMENTATION AND CLASS
/**
 * gRPC stub implementation for Google Ads API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by gapic-generator")
@BetaApi("A restructuring of stub classes is planned, so this may break in the future")
public class GrpcBatchJobServiceStub extends BatchJobServiceStub {

  private static final MethodDescriptor<MutateBatchJobRequest, MutateBatchJobResponse>
      mutateBatchJobMethodDescriptor =
          MethodDescriptor.<MutateBatchJobRequest, MutateBatchJobResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName("google.ads.googleads.v5.services.BatchJobService/MutateBatchJob")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(MutateBatchJobRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(MutateBatchJobResponse.getDefaultInstance()))
              .build();
  private static final MethodDescriptor<GetBatchJobRequest, BatchJob> getBatchJobMethodDescriptor =
      MethodDescriptor.<GetBatchJobRequest, BatchJob>newBuilder()
          .setType(MethodDescriptor.MethodType.UNARY)
          .setFullMethodName("google.ads.googleads.v5.services.BatchJobService/GetBatchJob")
          .setRequestMarshaller(ProtoUtils.marshaller(GetBatchJobRequest.getDefaultInstance()))
          .setResponseMarshaller(ProtoUtils.marshaller(BatchJob.getDefaultInstance()))
          .build();
  private static final MethodDescriptor<ListBatchJobResultsRequest, ListBatchJobResultsResponse>
      listBatchJobResultsMethodDescriptor =
          MethodDescriptor.<ListBatchJobResultsRequest, ListBatchJobResultsResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.ads.googleads.v5.services.BatchJobService/ListBatchJobResults")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(ListBatchJobResultsRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(ListBatchJobResultsResponse.getDefaultInstance()))
              .build();
  private static final MethodDescriptor<RunBatchJobRequest, Operation> runBatchJobMethodDescriptor =
      MethodDescriptor.<RunBatchJobRequest, Operation>newBuilder()
          .setType(MethodDescriptor.MethodType.UNARY)
          .setFullMethodName("google.ads.googleads.v5.services.BatchJobService/RunBatchJob")
          .setRequestMarshaller(ProtoUtils.marshaller(RunBatchJobRequest.getDefaultInstance()))
          .setResponseMarshaller(ProtoUtils.marshaller(Operation.getDefaultInstance()))
          .build();
  private static final MethodDescriptor<AddBatchJobOperationsRequest, AddBatchJobOperationsResponse>
      addBatchJobOperationsMethodDescriptor =
          MethodDescriptor.<AddBatchJobOperationsRequest, AddBatchJobOperationsResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.ads.googleads.v5.services.BatchJobService/AddBatchJobOperations")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(AddBatchJobOperationsRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(AddBatchJobOperationsResponse.getDefaultInstance()))
              .build();

  private final BackgroundResource backgroundResources;
  private final GrpcOperationsStub operationsStub;

  private final UnaryCallable<MutateBatchJobRequest, MutateBatchJobResponse> mutateBatchJobCallable;
  private final UnaryCallable<GetBatchJobRequest, BatchJob> getBatchJobCallable;
  private final UnaryCallable<ListBatchJobResultsRequest, ListBatchJobResultsResponse>
      listBatchJobResultsCallable;
  private final UnaryCallable<ListBatchJobResultsRequest, ListBatchJobResultsPagedResponse>
      listBatchJobResultsPagedCallable;
  private final UnaryCallable<RunBatchJobRequest, Operation> runBatchJobCallable;
  private final OperationCallable<RunBatchJobRequest, Empty, BatchJobMetadata>
      runBatchJobOperationCallable;
  private final UnaryCallable<AddBatchJobOperationsRequest, AddBatchJobOperationsResponse>
      addBatchJobOperationsCallable;

  private final GrpcStubCallableFactory callableFactory;

  public static final GrpcBatchJobServiceStub create(BatchJobServiceStubSettings settings)
      throws IOException {
    return new GrpcBatchJobServiceStub(settings, ClientContext.create(settings));
  }

  public static final GrpcBatchJobServiceStub create(ClientContext clientContext)
      throws IOException {
    return new GrpcBatchJobServiceStub(
        BatchJobServiceStubSettings.newBuilder().build(), clientContext);
  }

  public static final GrpcBatchJobServiceStub create(
      ClientContext clientContext, GrpcStubCallableFactory callableFactory) throws IOException {
    return new GrpcBatchJobServiceStub(
        BatchJobServiceStubSettings.newBuilder().build(), clientContext, callableFactory);
  }

  /**
   * Constructs an instance of GrpcBatchJobServiceStub, using the given settings. This is protected
   * so that it is easy to make a subclass, but otherwise, the static factory methods should be
   * preferred.
   */
  protected GrpcBatchJobServiceStub(
      BatchJobServiceStubSettings settings, ClientContext clientContext) throws IOException {
    this(settings, clientContext, new GrpcBatchJobServiceCallableFactory());
  }

  /**
   * Constructs an instance of GrpcBatchJobServiceStub, using the given settings. This is protected
   * so that it is easy to make a subclass, but otherwise, the static factory methods should be
   * preferred.
   */
  protected GrpcBatchJobServiceStub(
      BatchJobServiceStubSettings settings,
      ClientContext clientContext,
      GrpcStubCallableFactory callableFactory)
      throws IOException {
    this.callableFactory = callableFactory;
    this.operationsStub = GrpcOperationsStub.create(clientContext, callableFactory);

    GrpcCallSettings<MutateBatchJobRequest, MutateBatchJobResponse>
        mutateBatchJobTransportSettings =
            GrpcCallSettings.<MutateBatchJobRequest, MutateBatchJobResponse>newBuilder()
                .setMethodDescriptor(mutateBatchJobMethodDescriptor)
                .setParamsExtractor(
                    new RequestParamsExtractor<MutateBatchJobRequest>() {
                      @Override
                      public Map<String, String> extract(MutateBatchJobRequest request) {
                        ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                        params.put("customer_id", String.valueOf(request.getCustomerId()));
                        return params.build();
                      }
                    })
                .build();
    GrpcCallSettings<GetBatchJobRequest, BatchJob> getBatchJobTransportSettings =
        GrpcCallSettings.<GetBatchJobRequest, BatchJob>newBuilder()
            .setMethodDescriptor(getBatchJobMethodDescriptor)
            .setParamsExtractor(
                new RequestParamsExtractor<GetBatchJobRequest>() {
                  @Override
                  public Map<String, String> extract(GetBatchJobRequest request) {
                    ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                    params.put("resource_name", String.valueOf(request.getResourceName()));
                    return params.build();
                  }
                })
            .build();
    GrpcCallSettings<ListBatchJobResultsRequest, ListBatchJobResultsResponse>
        listBatchJobResultsTransportSettings =
            GrpcCallSettings.<ListBatchJobResultsRequest, ListBatchJobResultsResponse>newBuilder()
                .setMethodDescriptor(listBatchJobResultsMethodDescriptor)
                .setParamsExtractor(
                    new RequestParamsExtractor<ListBatchJobResultsRequest>() {
                      @Override
                      public Map<String, String> extract(ListBatchJobResultsRequest request) {
                        ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                        params.put("resource_name", String.valueOf(request.getResourceName()));
                        return params.build();
                      }
                    })
                .build();
    GrpcCallSettings<RunBatchJobRequest, Operation> runBatchJobTransportSettings =
        GrpcCallSettings.<RunBatchJobRequest, Operation>newBuilder()
            .setMethodDescriptor(runBatchJobMethodDescriptor)
            .setParamsExtractor(
                new RequestParamsExtractor<RunBatchJobRequest>() {
                  @Override
                  public Map<String, String> extract(RunBatchJobRequest request) {
                    ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                    params.put("resource_name", String.valueOf(request.getResourceName()));
                    return params.build();
                  }
                })
            .build();
    GrpcCallSettings<AddBatchJobOperationsRequest, AddBatchJobOperationsResponse>
        addBatchJobOperationsTransportSettings =
            GrpcCallSettings
                .<AddBatchJobOperationsRequest, AddBatchJobOperationsResponse>newBuilder()
                .setMethodDescriptor(addBatchJobOperationsMethodDescriptor)
                .setParamsExtractor(
                    new RequestParamsExtractor<AddBatchJobOperationsRequest>() {
                      @Override
                      public Map<String, String> extract(AddBatchJobOperationsRequest request) {
                        ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                        params.put("resource_name", String.valueOf(request.getResourceName()));
                        return params.build();
                      }
                    })
                .build();

    this.mutateBatchJobCallable =
        callableFactory.createUnaryCallable(
            mutateBatchJobTransportSettings, settings.mutateBatchJobSettings(), clientContext);
    this.getBatchJobCallable =
        callableFactory.createUnaryCallable(
            getBatchJobTransportSettings, settings.getBatchJobSettings(), clientContext);
    this.listBatchJobResultsCallable =
        callableFactory.createUnaryCallable(
            listBatchJobResultsTransportSettings,
            settings.listBatchJobResultsSettings(),
            clientContext);
    this.listBatchJobResultsPagedCallable =
        callableFactory.createPagedCallable(
            listBatchJobResultsTransportSettings,
            settings.listBatchJobResultsSettings(),
            clientContext);
    this.runBatchJobCallable =
        callableFactory.createUnaryCallable(
            runBatchJobTransportSettings, settings.runBatchJobSettings(), clientContext);
    this.runBatchJobOperationCallable =
        callableFactory.createOperationCallable(
            runBatchJobTransportSettings,
            settings.runBatchJobOperationSettings(),
            clientContext,
            this.operationsStub);
    this.addBatchJobOperationsCallable =
        callableFactory.createUnaryCallable(
            addBatchJobOperationsTransportSettings,
            settings.addBatchJobOperationsSettings(),
            clientContext);

    backgroundResources = new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public GrpcOperationsStub getOperationsStub() {
    return operationsStub;
  }

  public UnaryCallable<MutateBatchJobRequest, MutateBatchJobResponse> mutateBatchJobCallable() {
    return mutateBatchJobCallable;
  }

  public UnaryCallable<GetBatchJobRequest, BatchJob> getBatchJobCallable() {
    return getBatchJobCallable;
  }

  public UnaryCallable<ListBatchJobResultsRequest, ListBatchJobResultsPagedResponse>
      listBatchJobResultsPagedCallable() {
    return listBatchJobResultsPagedCallable;
  }

  public UnaryCallable<ListBatchJobResultsRequest, ListBatchJobResultsResponse>
      listBatchJobResultsCallable() {
    return listBatchJobResultsCallable;
  }

  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public OperationCallable<RunBatchJobRequest, Empty, BatchJobMetadata>
      runBatchJobOperationCallable() {
    return runBatchJobOperationCallable;
  }

  public UnaryCallable<RunBatchJobRequest, Operation> runBatchJobCallable() {
    return runBatchJobCallable;
  }

  public UnaryCallable<AddBatchJobOperationsRequest, AddBatchJobOperationsResponse>
      addBatchJobOperationsCallable() {
    return addBatchJobOperationsCallable;
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
