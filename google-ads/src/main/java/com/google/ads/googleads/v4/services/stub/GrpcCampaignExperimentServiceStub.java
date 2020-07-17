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
package com.google.ads.googleads.v4.services.stub;

import static com.google.ads.googleads.v4.services.CampaignExperimentServiceClient.ListCampaignExperimentAsyncErrorsPagedResponse;

import com.google.ads.googleads.v4.resources.CampaignExperiment;
import com.google.ads.googleads.v4.services.CreateCampaignExperimentMetadata;
import com.google.ads.googleads.v4.services.CreateCampaignExperimentRequest;
import com.google.ads.googleads.v4.services.EndCampaignExperimentRequest;
import com.google.ads.googleads.v4.services.GetCampaignExperimentRequest;
import com.google.ads.googleads.v4.services.GraduateCampaignExperimentRequest;
import com.google.ads.googleads.v4.services.GraduateCampaignExperimentResponse;
import com.google.ads.googleads.v4.services.ListCampaignExperimentAsyncErrorsRequest;
import com.google.ads.googleads.v4.services.ListCampaignExperimentAsyncErrorsResponse;
import com.google.ads.googleads.v4.services.MutateCampaignExperimentsRequest;
import com.google.ads.googleads.v4.services.MutateCampaignExperimentsResponse;
import com.google.ads.googleads.v4.services.PromoteCampaignExperimentRequest;
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
public class GrpcCampaignExperimentServiceStub extends CampaignExperimentServiceStub {

  private static final MethodDescriptor<GetCampaignExperimentRequest, CampaignExperiment>
      getCampaignExperimentMethodDescriptor =
          MethodDescriptor.<GetCampaignExperimentRequest, CampaignExperiment>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.ads.googleads.v4.services.CampaignExperimentService/GetCampaignExperiment")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(GetCampaignExperimentRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(CampaignExperiment.getDefaultInstance()))
              .build();
  private static final MethodDescriptor<CreateCampaignExperimentRequest, Operation>
      createCampaignExperimentMethodDescriptor =
          MethodDescriptor.<CreateCampaignExperimentRequest, Operation>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.ads.googleads.v4.services.CampaignExperimentService/CreateCampaignExperiment")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(CreateCampaignExperimentRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(Operation.getDefaultInstance()))
              .build();
  private static final MethodDescriptor<
          MutateCampaignExperimentsRequest, MutateCampaignExperimentsResponse>
      mutateCampaignExperimentsMethodDescriptor =
          MethodDescriptor
              .<MutateCampaignExperimentsRequest, MutateCampaignExperimentsResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.ads.googleads.v4.services.CampaignExperimentService/MutateCampaignExperiments")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(MutateCampaignExperimentsRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(MutateCampaignExperimentsResponse.getDefaultInstance()))
              .build();
  private static final MethodDescriptor<
          GraduateCampaignExperimentRequest, GraduateCampaignExperimentResponse>
      graduateCampaignExperimentMethodDescriptor =
          MethodDescriptor
              .<GraduateCampaignExperimentRequest, GraduateCampaignExperimentResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.ads.googleads.v4.services.CampaignExperimentService/GraduateCampaignExperiment")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(GraduateCampaignExperimentRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(GraduateCampaignExperimentResponse.getDefaultInstance()))
              .build();
  private static final MethodDescriptor<PromoteCampaignExperimentRequest, Operation>
      promoteCampaignExperimentMethodDescriptor =
          MethodDescriptor.<PromoteCampaignExperimentRequest, Operation>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.ads.googleads.v4.services.CampaignExperimentService/PromoteCampaignExperiment")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(PromoteCampaignExperimentRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(Operation.getDefaultInstance()))
              .build();
  private static final MethodDescriptor<EndCampaignExperimentRequest, Empty>
      endCampaignExperimentMethodDescriptor =
          MethodDescriptor.<EndCampaignExperimentRequest, Empty>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.ads.googleads.v4.services.CampaignExperimentService/EndCampaignExperiment")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(EndCampaignExperimentRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(Empty.getDefaultInstance()))
              .build();
  private static final MethodDescriptor<
          ListCampaignExperimentAsyncErrorsRequest, ListCampaignExperimentAsyncErrorsResponse>
      listCampaignExperimentAsyncErrorsMethodDescriptor =
          MethodDescriptor
              .<ListCampaignExperimentAsyncErrorsRequest, ListCampaignExperimentAsyncErrorsResponse>
                  newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.ads.googleads.v4.services.CampaignExperimentService/ListCampaignExperimentAsyncErrors")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(
                      ListCampaignExperimentAsyncErrorsRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(
                      ListCampaignExperimentAsyncErrorsResponse.getDefaultInstance()))
              .build();

  private final BackgroundResource backgroundResources;
  private final GrpcOperationsStub operationsStub;

  private final UnaryCallable<GetCampaignExperimentRequest, CampaignExperiment>
      getCampaignExperimentCallable;
  private final UnaryCallable<CreateCampaignExperimentRequest, Operation>
      createCampaignExperimentCallable;
  private final OperationCallable<
          CreateCampaignExperimentRequest, Empty, CreateCampaignExperimentMetadata>
      createCampaignExperimentOperationCallable;
  private final UnaryCallable<MutateCampaignExperimentsRequest, MutateCampaignExperimentsResponse>
      mutateCampaignExperimentsCallable;
  private final UnaryCallable<GraduateCampaignExperimentRequest, GraduateCampaignExperimentResponse>
      graduateCampaignExperimentCallable;
  private final UnaryCallable<PromoteCampaignExperimentRequest, Operation>
      promoteCampaignExperimentCallable;
  private final OperationCallable<PromoteCampaignExperimentRequest, Empty, Empty>
      promoteCampaignExperimentOperationCallable;
  private final UnaryCallable<EndCampaignExperimentRequest, Empty> endCampaignExperimentCallable;
  private final UnaryCallable<
          ListCampaignExperimentAsyncErrorsRequest, ListCampaignExperimentAsyncErrorsResponse>
      listCampaignExperimentAsyncErrorsCallable;
  private final UnaryCallable<
          ListCampaignExperimentAsyncErrorsRequest, ListCampaignExperimentAsyncErrorsPagedResponse>
      listCampaignExperimentAsyncErrorsPagedCallable;

  private final GrpcStubCallableFactory callableFactory;

  public static final GrpcCampaignExperimentServiceStub create(
      CampaignExperimentServiceStubSettings settings) throws IOException {
    return new GrpcCampaignExperimentServiceStub(settings, ClientContext.create(settings));
  }

  public static final GrpcCampaignExperimentServiceStub create(ClientContext clientContext)
      throws IOException {
    return new GrpcCampaignExperimentServiceStub(
        CampaignExperimentServiceStubSettings.newBuilder().build(), clientContext);
  }

  public static final GrpcCampaignExperimentServiceStub create(
      ClientContext clientContext, GrpcStubCallableFactory callableFactory) throws IOException {
    return new GrpcCampaignExperimentServiceStub(
        CampaignExperimentServiceStubSettings.newBuilder().build(), clientContext, callableFactory);
  }

  /**
   * Constructs an instance of GrpcCampaignExperimentServiceStub, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected GrpcCampaignExperimentServiceStub(
      CampaignExperimentServiceStubSettings settings, ClientContext clientContext)
      throws IOException {
    this(settings, clientContext, new GrpcCampaignExperimentServiceCallableFactory());
  }

  /**
   * Constructs an instance of GrpcCampaignExperimentServiceStub, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected GrpcCampaignExperimentServiceStub(
      CampaignExperimentServiceStubSettings settings,
      ClientContext clientContext,
      GrpcStubCallableFactory callableFactory)
      throws IOException {
    this.callableFactory = callableFactory;
    this.operationsStub = GrpcOperationsStub.create(clientContext, callableFactory);

    GrpcCallSettings<GetCampaignExperimentRequest, CampaignExperiment>
        getCampaignExperimentTransportSettings =
            GrpcCallSettings.<GetCampaignExperimentRequest, CampaignExperiment>newBuilder()
                .setMethodDescriptor(getCampaignExperimentMethodDescriptor)
                .setParamsExtractor(
                    new RequestParamsExtractor<GetCampaignExperimentRequest>() {
                      @Override
                      public Map<String, String> extract(GetCampaignExperimentRequest request) {
                        ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                        params.put("resource_name", String.valueOf(request.getResourceName()));
                        return params.build();
                      }
                    })
                .build();
    GrpcCallSettings<CreateCampaignExperimentRequest, Operation>
        createCampaignExperimentTransportSettings =
            GrpcCallSettings.<CreateCampaignExperimentRequest, Operation>newBuilder()
                .setMethodDescriptor(createCampaignExperimentMethodDescriptor)
                .setParamsExtractor(
                    new RequestParamsExtractor<CreateCampaignExperimentRequest>() {
                      @Override
                      public Map<String, String> extract(CreateCampaignExperimentRequest request) {
                        ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                        params.put("customer_id", String.valueOf(request.getCustomerId()));
                        return params.build();
                      }
                    })
                .build();
    GrpcCallSettings<MutateCampaignExperimentsRequest, MutateCampaignExperimentsResponse>
        mutateCampaignExperimentsTransportSettings =
            GrpcCallSettings
                .<MutateCampaignExperimentsRequest, MutateCampaignExperimentsResponse>newBuilder()
                .setMethodDescriptor(mutateCampaignExperimentsMethodDescriptor)
                .setParamsExtractor(
                    new RequestParamsExtractor<MutateCampaignExperimentsRequest>() {
                      @Override
                      public Map<String, String> extract(MutateCampaignExperimentsRequest request) {
                        ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                        params.put("customer_id", String.valueOf(request.getCustomerId()));
                        return params.build();
                      }
                    })
                .build();
    GrpcCallSettings<GraduateCampaignExperimentRequest, GraduateCampaignExperimentResponse>
        graduateCampaignExperimentTransportSettings =
            GrpcCallSettings
                .<GraduateCampaignExperimentRequest, GraduateCampaignExperimentResponse>newBuilder()
                .setMethodDescriptor(graduateCampaignExperimentMethodDescriptor)
                .setParamsExtractor(
                    new RequestParamsExtractor<GraduateCampaignExperimentRequest>() {
                      @Override
                      public Map<String, String> extract(
                          GraduateCampaignExperimentRequest request) {
                        ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                        params.put(
                            "campaign_experiment", String.valueOf(request.getCampaignExperiment()));
                        return params.build();
                      }
                    })
                .build();
    GrpcCallSettings<PromoteCampaignExperimentRequest, Operation>
        promoteCampaignExperimentTransportSettings =
            GrpcCallSettings.<PromoteCampaignExperimentRequest, Operation>newBuilder()
                .setMethodDescriptor(promoteCampaignExperimentMethodDescriptor)
                .setParamsExtractor(
                    new RequestParamsExtractor<PromoteCampaignExperimentRequest>() {
                      @Override
                      public Map<String, String> extract(PromoteCampaignExperimentRequest request) {
                        ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                        params.put(
                            "campaign_experiment", String.valueOf(request.getCampaignExperiment()));
                        return params.build();
                      }
                    })
                .build();
    GrpcCallSettings<EndCampaignExperimentRequest, Empty> endCampaignExperimentTransportSettings =
        GrpcCallSettings.<EndCampaignExperimentRequest, Empty>newBuilder()
            .setMethodDescriptor(endCampaignExperimentMethodDescriptor)
            .setParamsExtractor(
                new RequestParamsExtractor<EndCampaignExperimentRequest>() {
                  @Override
                  public Map<String, String> extract(EndCampaignExperimentRequest request) {
                    ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                    params.put(
                        "campaign_experiment", String.valueOf(request.getCampaignExperiment()));
                    return params.build();
                  }
                })
            .build();
    GrpcCallSettings<
            ListCampaignExperimentAsyncErrorsRequest, ListCampaignExperimentAsyncErrorsResponse>
        listCampaignExperimentAsyncErrorsTransportSettings =
            GrpcCallSettings
                .<ListCampaignExperimentAsyncErrorsRequest,
                    ListCampaignExperimentAsyncErrorsResponse>
                    newBuilder()
                .setMethodDescriptor(listCampaignExperimentAsyncErrorsMethodDescriptor)
                .setParamsExtractor(
                    new RequestParamsExtractor<ListCampaignExperimentAsyncErrorsRequest>() {
                      @Override
                      public Map<String, String> extract(
                          ListCampaignExperimentAsyncErrorsRequest request) {
                        ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                        params.put("resource_name", String.valueOf(request.getResourceName()));
                        return params.build();
                      }
                    })
                .build();

    this.getCampaignExperimentCallable =
        callableFactory.createUnaryCallable(
            getCampaignExperimentTransportSettings,
            settings.getCampaignExperimentSettings(),
            clientContext);
    this.createCampaignExperimentCallable =
        callableFactory.createUnaryCallable(
            createCampaignExperimentTransportSettings,
            settings.createCampaignExperimentSettings(),
            clientContext);
    this.createCampaignExperimentOperationCallable =
        callableFactory.createOperationCallable(
            createCampaignExperimentTransportSettings,
            settings.createCampaignExperimentOperationSettings(),
            clientContext,
            this.operationsStub);
    this.mutateCampaignExperimentsCallable =
        callableFactory.createUnaryCallable(
            mutateCampaignExperimentsTransportSettings,
            settings.mutateCampaignExperimentsSettings(),
            clientContext);
    this.graduateCampaignExperimentCallable =
        callableFactory.createUnaryCallable(
            graduateCampaignExperimentTransportSettings,
            settings.graduateCampaignExperimentSettings(),
            clientContext);
    this.promoteCampaignExperimentCallable =
        callableFactory.createUnaryCallable(
            promoteCampaignExperimentTransportSettings,
            settings.promoteCampaignExperimentSettings(),
            clientContext);
    this.promoteCampaignExperimentOperationCallable =
        callableFactory.createOperationCallable(
            promoteCampaignExperimentTransportSettings,
            settings.promoteCampaignExperimentOperationSettings(),
            clientContext,
            this.operationsStub);
    this.endCampaignExperimentCallable =
        callableFactory.createUnaryCallable(
            endCampaignExperimentTransportSettings,
            settings.endCampaignExperimentSettings(),
            clientContext);
    this.listCampaignExperimentAsyncErrorsCallable =
        callableFactory.createUnaryCallable(
            listCampaignExperimentAsyncErrorsTransportSettings,
            settings.listCampaignExperimentAsyncErrorsSettings(),
            clientContext);
    this.listCampaignExperimentAsyncErrorsPagedCallable =
        callableFactory.createPagedCallable(
            listCampaignExperimentAsyncErrorsTransportSettings,
            settings.listCampaignExperimentAsyncErrorsSettings(),
            clientContext);

    backgroundResources = new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public GrpcOperationsStub getOperationsStub() {
    return operationsStub;
  }

  public UnaryCallable<GetCampaignExperimentRequest, CampaignExperiment>
      getCampaignExperimentCallable() {
    return getCampaignExperimentCallable;
  }

  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public OperationCallable<CreateCampaignExperimentRequest, Empty, CreateCampaignExperimentMetadata>
      createCampaignExperimentOperationCallable() {
    return createCampaignExperimentOperationCallable;
  }

  public UnaryCallable<CreateCampaignExperimentRequest, Operation>
      createCampaignExperimentCallable() {
    return createCampaignExperimentCallable;
  }

  public UnaryCallable<MutateCampaignExperimentsRequest, MutateCampaignExperimentsResponse>
      mutateCampaignExperimentsCallable() {
    return mutateCampaignExperimentsCallable;
  }

  public UnaryCallable<GraduateCampaignExperimentRequest, GraduateCampaignExperimentResponse>
      graduateCampaignExperimentCallable() {
    return graduateCampaignExperimentCallable;
  }

  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public OperationCallable<PromoteCampaignExperimentRequest, Empty, Empty>
      promoteCampaignExperimentOperationCallable() {
    return promoteCampaignExperimentOperationCallable;
  }

  public UnaryCallable<PromoteCampaignExperimentRequest, Operation>
      promoteCampaignExperimentCallable() {
    return promoteCampaignExperimentCallable;
  }

  public UnaryCallable<EndCampaignExperimentRequest, Empty> endCampaignExperimentCallable() {
    return endCampaignExperimentCallable;
  }

  public UnaryCallable<
          ListCampaignExperimentAsyncErrorsRequest, ListCampaignExperimentAsyncErrorsPagedResponse>
      listCampaignExperimentAsyncErrorsPagedCallable() {
    return listCampaignExperimentAsyncErrorsPagedCallable;
  }

  public UnaryCallable<
          ListCampaignExperimentAsyncErrorsRequest, ListCampaignExperimentAsyncErrorsResponse>
      listCampaignExperimentAsyncErrorsCallable() {
    return listCampaignExperimentAsyncErrorsCallable;
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
