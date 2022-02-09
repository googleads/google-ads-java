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

package com.google.ads.googleads.v10.services.stub;

import static com.google.ads.googleads.v10.services.ExperimentServiceClient.ListExperimentAsyncErrorsPagedResponse;

import com.google.ads.googleads.v10.services.EndExperimentRequest;
import com.google.ads.googleads.v10.services.GraduateExperimentRequest;
import com.google.ads.googleads.v10.services.ListExperimentAsyncErrorsRequest;
import com.google.ads.googleads.v10.services.ListExperimentAsyncErrorsResponse;
import com.google.ads.googleads.v10.services.MutateExperimentsRequest;
import com.google.ads.googleads.v10.services.MutateExperimentsResponse;
import com.google.ads.googleads.v10.services.PromoteExperimentMetadata;
import com.google.ads.googleads.v10.services.PromoteExperimentRequest;
import com.google.ads.googleads.v10.services.ScheduleExperimentMetadata;
import com.google.ads.googleads.v10.services.ScheduleExperimentRequest;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.core.BackgroundResourceAggregation;
import com.google.api.gax.grpc.GrpcCallSettings;
import com.google.api.gax.grpc.GrpcStubCallableFactory;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.OperationCallable;
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
 * gRPC stub implementation for the ExperimentService service API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by gapic-generator-java")
public class GrpcExperimentServiceStub extends ExperimentServiceStub {
  private static final MethodDescriptor<MutateExperimentsRequest, MutateExperimentsResponse>
      mutateExperimentsMethodDescriptor =
          MethodDescriptor.<MutateExperimentsRequest, MutateExperimentsResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.ads.googleads.v10.services.ExperimentService/MutateExperiments")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(MutateExperimentsRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(MutateExperimentsResponse.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<EndExperimentRequest, Empty> endExperimentMethodDescriptor =
      MethodDescriptor.<EndExperimentRequest, Empty>newBuilder()
          .setType(MethodDescriptor.MethodType.UNARY)
          .setFullMethodName("google.ads.googleads.v10.services.ExperimentService/EndExperiment")
          .setRequestMarshaller(ProtoUtils.marshaller(EndExperimentRequest.getDefaultInstance()))
          .setResponseMarshaller(ProtoUtils.marshaller(Empty.getDefaultInstance()))
          .build();

  private static final MethodDescriptor<
          ListExperimentAsyncErrorsRequest, ListExperimentAsyncErrorsResponse>
      listExperimentAsyncErrorsMethodDescriptor =
          MethodDescriptor
              .<ListExperimentAsyncErrorsRequest, ListExperimentAsyncErrorsResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.ads.googleads.v10.services.ExperimentService/ListExperimentAsyncErrors")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(ListExperimentAsyncErrorsRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(ListExperimentAsyncErrorsResponse.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<GraduateExperimentRequest, Empty>
      graduateExperimentMethodDescriptor =
          MethodDescriptor.<GraduateExperimentRequest, Empty>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.ads.googleads.v10.services.ExperimentService/GraduateExperiment")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(GraduateExperimentRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(Empty.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<ScheduleExperimentRequest, Operation>
      scheduleExperimentMethodDescriptor =
          MethodDescriptor.<ScheduleExperimentRequest, Operation>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.ads.googleads.v10.services.ExperimentService/ScheduleExperiment")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(ScheduleExperimentRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(Operation.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<PromoteExperimentRequest, Operation>
      promoteExperimentMethodDescriptor =
          MethodDescriptor.<PromoteExperimentRequest, Operation>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.ads.googleads.v10.services.ExperimentService/PromoteExperiment")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(PromoteExperimentRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(Operation.getDefaultInstance()))
              .build();

  private final UnaryCallable<MutateExperimentsRequest, MutateExperimentsResponse>
      mutateExperimentsCallable;
  private final UnaryCallable<EndExperimentRequest, Empty> endExperimentCallable;
  private final UnaryCallable<ListExperimentAsyncErrorsRequest, ListExperimentAsyncErrorsResponse>
      listExperimentAsyncErrorsCallable;
  private final UnaryCallable<
          ListExperimentAsyncErrorsRequest, ListExperimentAsyncErrorsPagedResponse>
      listExperimentAsyncErrorsPagedCallable;
  private final UnaryCallable<GraduateExperimentRequest, Empty> graduateExperimentCallable;
  private final UnaryCallable<ScheduleExperimentRequest, Operation> scheduleExperimentCallable;
  private final OperationCallable<ScheduleExperimentRequest, Empty, ScheduleExperimentMetadata>
      scheduleExperimentOperationCallable;
  private final UnaryCallable<PromoteExperimentRequest, Operation> promoteExperimentCallable;
  private final OperationCallable<PromoteExperimentRequest, Empty, PromoteExperimentMetadata>
      promoteExperimentOperationCallable;

  private final BackgroundResource backgroundResources;
  private final GrpcOperationsStub operationsStub;
  private final GrpcStubCallableFactory callableFactory;

  public static final GrpcExperimentServiceStub create(ExperimentServiceStubSettings settings)
      throws IOException {
    return new GrpcExperimentServiceStub(settings, ClientContext.create(settings));
  }

  public static final GrpcExperimentServiceStub create(ClientContext clientContext)
      throws IOException {
    return new GrpcExperimentServiceStub(
        ExperimentServiceStubSettings.newBuilder().build(), clientContext);
  }

  public static final GrpcExperimentServiceStub create(
      ClientContext clientContext, GrpcStubCallableFactory callableFactory) throws IOException {
    return new GrpcExperimentServiceStub(
        ExperimentServiceStubSettings.newBuilder().build(), clientContext, callableFactory);
  }

  /**
   * Constructs an instance of GrpcExperimentServiceStub, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected GrpcExperimentServiceStub(
      ExperimentServiceStubSettings settings, ClientContext clientContext) throws IOException {
    this(settings, clientContext, new GrpcExperimentServiceCallableFactory());
  }

  /**
   * Constructs an instance of GrpcExperimentServiceStub, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected GrpcExperimentServiceStub(
      ExperimentServiceStubSettings settings,
      ClientContext clientContext,
      GrpcStubCallableFactory callableFactory)
      throws IOException {
    this.callableFactory = callableFactory;
    this.operationsStub = GrpcOperationsStub.create(clientContext, callableFactory);

    GrpcCallSettings<MutateExperimentsRequest, MutateExperimentsResponse>
        mutateExperimentsTransportSettings =
            GrpcCallSettings.<MutateExperimentsRequest, MutateExperimentsResponse>newBuilder()
                .setMethodDescriptor(mutateExperimentsMethodDescriptor)
                .setParamsExtractor(
                    request -> {
                      ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                      params.put("customer_id", String.valueOf(request.getCustomerId()));
                      return params.build();
                    })
                .build();
    GrpcCallSettings<EndExperimentRequest, Empty> endExperimentTransportSettings =
        GrpcCallSettings.<EndExperimentRequest, Empty>newBuilder()
            .setMethodDescriptor(endExperimentMethodDescriptor)
            .setParamsExtractor(
                request -> {
                  ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                  params.put("experiment", String.valueOf(request.getExperiment()));
                  return params.build();
                })
            .build();
    GrpcCallSettings<ListExperimentAsyncErrorsRequest, ListExperimentAsyncErrorsResponse>
        listExperimentAsyncErrorsTransportSettings =
            GrpcCallSettings
                .<ListExperimentAsyncErrorsRequest, ListExperimentAsyncErrorsResponse>newBuilder()
                .setMethodDescriptor(listExperimentAsyncErrorsMethodDescriptor)
                .setParamsExtractor(
                    request -> {
                      ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                      params.put("resource_name", String.valueOf(request.getResourceName()));
                      return params.build();
                    })
                .build();
    GrpcCallSettings<GraduateExperimentRequest, Empty> graduateExperimentTransportSettings =
        GrpcCallSettings.<GraduateExperimentRequest, Empty>newBuilder()
            .setMethodDescriptor(graduateExperimentMethodDescriptor)
            .setParamsExtractor(
                request -> {
                  ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                  params.put("experiment", String.valueOf(request.getExperiment()));
                  return params.build();
                })
            .build();
    GrpcCallSettings<ScheduleExperimentRequest, Operation> scheduleExperimentTransportSettings =
        GrpcCallSettings.<ScheduleExperimentRequest, Operation>newBuilder()
            .setMethodDescriptor(scheduleExperimentMethodDescriptor)
            .setParamsExtractor(
                request -> {
                  ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                  params.put("resource_name", String.valueOf(request.getResourceName()));
                  return params.build();
                })
            .build();
    GrpcCallSettings<PromoteExperimentRequest, Operation> promoteExperimentTransportSettings =
        GrpcCallSettings.<PromoteExperimentRequest, Operation>newBuilder()
            .setMethodDescriptor(promoteExperimentMethodDescriptor)
            .setParamsExtractor(
                request -> {
                  ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                  params.put("resource_name", String.valueOf(request.getResourceName()));
                  return params.build();
                })
            .build();

    this.mutateExperimentsCallable =
        callableFactory.createUnaryCallable(
            mutateExperimentsTransportSettings,
            settings.mutateExperimentsSettings(),
            clientContext);
    this.endExperimentCallable =
        callableFactory.createUnaryCallable(
            endExperimentTransportSettings, settings.endExperimentSettings(), clientContext);
    this.listExperimentAsyncErrorsCallable =
        callableFactory.createUnaryCallable(
            listExperimentAsyncErrorsTransportSettings,
            settings.listExperimentAsyncErrorsSettings(),
            clientContext);
    this.listExperimentAsyncErrorsPagedCallable =
        callableFactory.createPagedCallable(
            listExperimentAsyncErrorsTransportSettings,
            settings.listExperimentAsyncErrorsSettings(),
            clientContext);
    this.graduateExperimentCallable =
        callableFactory.createUnaryCallable(
            graduateExperimentTransportSettings,
            settings.graduateExperimentSettings(),
            clientContext);
    this.scheduleExperimentCallable =
        callableFactory.createUnaryCallable(
            scheduleExperimentTransportSettings,
            settings.scheduleExperimentSettings(),
            clientContext);
    this.scheduleExperimentOperationCallable =
        callableFactory.createOperationCallable(
            scheduleExperimentTransportSettings,
            settings.scheduleExperimentOperationSettings(),
            clientContext,
            operationsStub);
    this.promoteExperimentCallable =
        callableFactory.createUnaryCallable(
            promoteExperimentTransportSettings,
            settings.promoteExperimentSettings(),
            clientContext);
    this.promoteExperimentOperationCallable =
        callableFactory.createOperationCallable(
            promoteExperimentTransportSettings,
            settings.promoteExperimentOperationSettings(),
            clientContext,
            operationsStub);

    this.backgroundResources =
        new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  public GrpcOperationsStub getOperationsStub() {
    return operationsStub;
  }

  @Override
  public UnaryCallable<MutateExperimentsRequest, MutateExperimentsResponse>
      mutateExperimentsCallable() {
    return mutateExperimentsCallable;
  }

  @Override
  public UnaryCallable<EndExperimentRequest, Empty> endExperimentCallable() {
    return endExperimentCallable;
  }

  @Override
  public UnaryCallable<ListExperimentAsyncErrorsRequest, ListExperimentAsyncErrorsResponse>
      listExperimentAsyncErrorsCallable() {
    return listExperimentAsyncErrorsCallable;
  }

  @Override
  public UnaryCallable<ListExperimentAsyncErrorsRequest, ListExperimentAsyncErrorsPagedResponse>
      listExperimentAsyncErrorsPagedCallable() {
    return listExperimentAsyncErrorsPagedCallable;
  }

  @Override
  public UnaryCallable<GraduateExperimentRequest, Empty> graduateExperimentCallable() {
    return graduateExperimentCallable;
  }

  @Override
  public UnaryCallable<ScheduleExperimentRequest, Operation> scheduleExperimentCallable() {
    return scheduleExperimentCallable;
  }

  @Override
  public OperationCallable<ScheduleExperimentRequest, Empty, ScheduleExperimentMetadata>
      scheduleExperimentOperationCallable() {
    return scheduleExperimentOperationCallable;
  }

  @Override
  public UnaryCallable<PromoteExperimentRequest, Operation> promoteExperimentCallable() {
    return promoteExperimentCallable;
  }

  @Override
  public OperationCallable<PromoteExperimentRequest, Empty, PromoteExperimentMetadata>
      promoteExperimentOperationCallable() {
    return promoteExperimentOperationCallable;
  }

  @Override
  public final void close() {
    try {
      backgroundResources.close();
    } catch (RuntimeException e) {
      throw e;
    } catch (Exception e) {
      throw new IllegalStateException("Failed to close resource", e);
    }
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
