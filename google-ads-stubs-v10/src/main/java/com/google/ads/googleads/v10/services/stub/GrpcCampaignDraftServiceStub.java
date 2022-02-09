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

import static com.google.ads.googleads.v10.services.CampaignDraftServiceClient.ListCampaignDraftAsyncErrorsPagedResponse;

import com.google.ads.googleads.v10.services.ListCampaignDraftAsyncErrorsRequest;
import com.google.ads.googleads.v10.services.ListCampaignDraftAsyncErrorsResponse;
import com.google.ads.googleads.v10.services.MutateCampaignDraftsRequest;
import com.google.ads.googleads.v10.services.MutateCampaignDraftsResponse;
import com.google.ads.googleads.v10.services.PromoteCampaignDraftRequest;
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
 * gRPC stub implementation for the CampaignDraftService service API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by gapic-generator-java")
public class GrpcCampaignDraftServiceStub extends CampaignDraftServiceStub {
  private static final MethodDescriptor<MutateCampaignDraftsRequest, MutateCampaignDraftsResponse>
      mutateCampaignDraftsMethodDescriptor =
          MethodDescriptor.<MutateCampaignDraftsRequest, MutateCampaignDraftsResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.ads.googleads.v10.services.CampaignDraftService/MutateCampaignDrafts")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(MutateCampaignDraftsRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(MutateCampaignDraftsResponse.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<PromoteCampaignDraftRequest, Operation>
      promoteCampaignDraftMethodDescriptor =
          MethodDescriptor.<PromoteCampaignDraftRequest, Operation>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.ads.googleads.v10.services.CampaignDraftService/PromoteCampaignDraft")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(PromoteCampaignDraftRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(Operation.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<
          ListCampaignDraftAsyncErrorsRequest, ListCampaignDraftAsyncErrorsResponse>
      listCampaignDraftAsyncErrorsMethodDescriptor =
          MethodDescriptor
              .<ListCampaignDraftAsyncErrorsRequest, ListCampaignDraftAsyncErrorsResponse>
                  newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.ads.googleads.v10.services.CampaignDraftService/ListCampaignDraftAsyncErrors")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(ListCampaignDraftAsyncErrorsRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(ListCampaignDraftAsyncErrorsResponse.getDefaultInstance()))
              .build();

  private final UnaryCallable<MutateCampaignDraftsRequest, MutateCampaignDraftsResponse>
      mutateCampaignDraftsCallable;
  private final UnaryCallable<PromoteCampaignDraftRequest, Operation> promoteCampaignDraftCallable;
  private final OperationCallable<PromoteCampaignDraftRequest, Empty, Empty>
      promoteCampaignDraftOperationCallable;
  private final UnaryCallable<
          ListCampaignDraftAsyncErrorsRequest, ListCampaignDraftAsyncErrorsResponse>
      listCampaignDraftAsyncErrorsCallable;
  private final UnaryCallable<
          ListCampaignDraftAsyncErrorsRequest, ListCampaignDraftAsyncErrorsPagedResponse>
      listCampaignDraftAsyncErrorsPagedCallable;

  private final BackgroundResource backgroundResources;
  private final GrpcOperationsStub operationsStub;
  private final GrpcStubCallableFactory callableFactory;

  public static final GrpcCampaignDraftServiceStub create(CampaignDraftServiceStubSettings settings)
      throws IOException {
    return new GrpcCampaignDraftServiceStub(settings, ClientContext.create(settings));
  }

  public static final GrpcCampaignDraftServiceStub create(ClientContext clientContext)
      throws IOException {
    return new GrpcCampaignDraftServiceStub(
        CampaignDraftServiceStubSettings.newBuilder().build(), clientContext);
  }

  public static final GrpcCampaignDraftServiceStub create(
      ClientContext clientContext, GrpcStubCallableFactory callableFactory) throws IOException {
    return new GrpcCampaignDraftServiceStub(
        CampaignDraftServiceStubSettings.newBuilder().build(), clientContext, callableFactory);
  }

  /**
   * Constructs an instance of GrpcCampaignDraftServiceStub, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected GrpcCampaignDraftServiceStub(
      CampaignDraftServiceStubSettings settings, ClientContext clientContext) throws IOException {
    this(settings, clientContext, new GrpcCampaignDraftServiceCallableFactory());
  }

  /**
   * Constructs an instance of GrpcCampaignDraftServiceStub, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected GrpcCampaignDraftServiceStub(
      CampaignDraftServiceStubSettings settings,
      ClientContext clientContext,
      GrpcStubCallableFactory callableFactory)
      throws IOException {
    this.callableFactory = callableFactory;
    this.operationsStub = GrpcOperationsStub.create(clientContext, callableFactory);

    GrpcCallSettings<MutateCampaignDraftsRequest, MutateCampaignDraftsResponse>
        mutateCampaignDraftsTransportSettings =
            GrpcCallSettings.<MutateCampaignDraftsRequest, MutateCampaignDraftsResponse>newBuilder()
                .setMethodDescriptor(mutateCampaignDraftsMethodDescriptor)
                .setParamsExtractor(
                    request -> {
                      ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                      params.put("customer_id", String.valueOf(request.getCustomerId()));
                      return params.build();
                    })
                .build();
    GrpcCallSettings<PromoteCampaignDraftRequest, Operation> promoteCampaignDraftTransportSettings =
        GrpcCallSettings.<PromoteCampaignDraftRequest, Operation>newBuilder()
            .setMethodDescriptor(promoteCampaignDraftMethodDescriptor)
            .setParamsExtractor(
                request -> {
                  ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                  params.put("campaign_draft", String.valueOf(request.getCampaignDraft()));
                  return params.build();
                })
            .build();
    GrpcCallSettings<ListCampaignDraftAsyncErrorsRequest, ListCampaignDraftAsyncErrorsResponse>
        listCampaignDraftAsyncErrorsTransportSettings =
            GrpcCallSettings
                .<ListCampaignDraftAsyncErrorsRequest, ListCampaignDraftAsyncErrorsResponse>
                    newBuilder()
                .setMethodDescriptor(listCampaignDraftAsyncErrorsMethodDescriptor)
                .setParamsExtractor(
                    request -> {
                      ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                      params.put("resource_name", String.valueOf(request.getResourceName()));
                      return params.build();
                    })
                .build();

    this.mutateCampaignDraftsCallable =
        callableFactory.createUnaryCallable(
            mutateCampaignDraftsTransportSettings,
            settings.mutateCampaignDraftsSettings(),
            clientContext);
    this.promoteCampaignDraftCallable =
        callableFactory.createUnaryCallable(
            promoteCampaignDraftTransportSettings,
            settings.promoteCampaignDraftSettings(),
            clientContext);
    this.promoteCampaignDraftOperationCallable =
        callableFactory.createOperationCallable(
            promoteCampaignDraftTransportSettings,
            settings.promoteCampaignDraftOperationSettings(),
            clientContext,
            operationsStub);
    this.listCampaignDraftAsyncErrorsCallable =
        callableFactory.createUnaryCallable(
            listCampaignDraftAsyncErrorsTransportSettings,
            settings.listCampaignDraftAsyncErrorsSettings(),
            clientContext);
    this.listCampaignDraftAsyncErrorsPagedCallable =
        callableFactory.createPagedCallable(
            listCampaignDraftAsyncErrorsTransportSettings,
            settings.listCampaignDraftAsyncErrorsSettings(),
            clientContext);

    this.backgroundResources =
        new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  public GrpcOperationsStub getOperationsStub() {
    return operationsStub;
  }

  @Override
  public UnaryCallable<MutateCampaignDraftsRequest, MutateCampaignDraftsResponse>
      mutateCampaignDraftsCallable() {
    return mutateCampaignDraftsCallable;
  }

  @Override
  public UnaryCallable<PromoteCampaignDraftRequest, Operation> promoteCampaignDraftCallable() {
    return promoteCampaignDraftCallable;
  }

  @Override
  public OperationCallable<PromoteCampaignDraftRequest, Empty, Empty>
      promoteCampaignDraftOperationCallable() {
    return promoteCampaignDraftOperationCallable;
  }

  @Override
  public UnaryCallable<ListCampaignDraftAsyncErrorsRequest, ListCampaignDraftAsyncErrorsResponse>
      listCampaignDraftAsyncErrorsCallable() {
    return listCampaignDraftAsyncErrorsCallable;
  }

  @Override
  public UnaryCallable<
          ListCampaignDraftAsyncErrorsRequest, ListCampaignDraftAsyncErrorsPagedResponse>
      listCampaignDraftAsyncErrorsPagedCallable() {
    return listCampaignDraftAsyncErrorsPagedCallable;
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
