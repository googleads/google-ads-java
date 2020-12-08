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

import com.google.ads.googleads.v6.resources.CampaignBudget;
import com.google.ads.googleads.v6.services.GetCampaignBudgetRequest;
import com.google.ads.googleads.v6.services.MutateCampaignBudgetsRequest;
import com.google.ads.googleads.v6.services.MutateCampaignBudgetsResponse;
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
 * gRPC stub implementation for the CampaignBudgetService service API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by gapic-generator-java")
public class GrpcCampaignBudgetServiceStub extends CampaignBudgetServiceStub {
  private static final MethodDescriptor<GetCampaignBudgetRequest, CampaignBudget>
      getCampaignBudgetMethodDescriptor =
          MethodDescriptor.<GetCampaignBudgetRequest, CampaignBudget>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.ads.googleads.v6.services.CampaignBudgetService/GetCampaignBudget")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(GetCampaignBudgetRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(CampaignBudget.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<MutateCampaignBudgetsRequest, MutateCampaignBudgetsResponse>
      mutateCampaignBudgetsMethodDescriptor =
          MethodDescriptor.<MutateCampaignBudgetsRequest, MutateCampaignBudgetsResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.ads.googleads.v6.services.CampaignBudgetService/MutateCampaignBudgets")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(MutateCampaignBudgetsRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(MutateCampaignBudgetsResponse.getDefaultInstance()))
              .build();

  private final UnaryCallable<GetCampaignBudgetRequest, CampaignBudget> getCampaignBudgetCallable;
  private final UnaryCallable<MutateCampaignBudgetsRequest, MutateCampaignBudgetsResponse>
      mutateCampaignBudgetsCallable;

  private final BackgroundResource backgroundResources;
  private final GrpcOperationsStub operationsStub;
  private final GrpcStubCallableFactory callableFactory;

  public static final GrpcCampaignBudgetServiceStub create(
      CampaignBudgetServiceStubSettings settings) throws IOException {
    return new GrpcCampaignBudgetServiceStub(settings, ClientContext.create(settings));
  }

  public static final GrpcCampaignBudgetServiceStub create(ClientContext clientContext)
      throws IOException {
    return new GrpcCampaignBudgetServiceStub(
        CampaignBudgetServiceStubSettings.newBuilder().build(), clientContext);
  }

  public static final GrpcCampaignBudgetServiceStub create(
      ClientContext clientContext, GrpcStubCallableFactory callableFactory) throws IOException {
    return new GrpcCampaignBudgetServiceStub(
        CampaignBudgetServiceStubSettings.newBuilder().build(), clientContext, callableFactory);
  }

  protected GrpcCampaignBudgetServiceStub(
      CampaignBudgetServiceStubSettings settings, ClientContext clientContext) throws IOException {
    this(settings, clientContext, new GrpcCampaignBudgetServiceCallableFactory());
  }

  protected GrpcCampaignBudgetServiceStub(
      CampaignBudgetServiceStubSettings settings,
      ClientContext clientContext,
      GrpcStubCallableFactory callableFactory)
      throws IOException {
    this.callableFactory = callableFactory;
    this.operationsStub = GrpcOperationsStub.create(clientContext, callableFactory);

    GrpcCallSettings<GetCampaignBudgetRequest, CampaignBudget> getCampaignBudgetTransportSettings =
        GrpcCallSettings.<GetCampaignBudgetRequest, CampaignBudget>newBuilder()
            .setMethodDescriptor(getCampaignBudgetMethodDescriptor)
            .setParamsExtractor(
                new RequestParamsExtractor<GetCampaignBudgetRequest>() {
                  @Override
                  public Map<String, String> extract(GetCampaignBudgetRequest request) {
                    ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                    params.put("resource_name", String.valueOf(request.getResourceName()));
                    return params.build();
                  }
                })
            .build();
    GrpcCallSettings<MutateCampaignBudgetsRequest, MutateCampaignBudgetsResponse>
        mutateCampaignBudgetsTransportSettings =
            GrpcCallSettings
                .<MutateCampaignBudgetsRequest, MutateCampaignBudgetsResponse>newBuilder()
                .setMethodDescriptor(mutateCampaignBudgetsMethodDescriptor)
                .setParamsExtractor(
                    new RequestParamsExtractor<MutateCampaignBudgetsRequest>() {
                      @Override
                      public Map<String, String> extract(MutateCampaignBudgetsRequest request) {
                        ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                        params.put("customer_id", String.valueOf(request.getCustomerId()));
                        return params.build();
                      }
                    })
                .build();

    this.getCampaignBudgetCallable =
        callableFactory.createUnaryCallable(
            getCampaignBudgetTransportSettings,
            settings.getCampaignBudgetSettings(),
            clientContext);
    this.mutateCampaignBudgetsCallable =
        callableFactory.createUnaryCallable(
            mutateCampaignBudgetsTransportSettings,
            settings.mutateCampaignBudgetsSettings(),
            clientContext);

    this.backgroundResources =
        new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  public GrpcOperationsStub getOperationsStub() {
    return operationsStub;
  }

  public UnaryCallable<GetCampaignBudgetRequest, CampaignBudget> getCampaignBudgetCallable() {
    return getCampaignBudgetCallable;
  }

  public UnaryCallable<MutateCampaignBudgetsRequest, MutateCampaignBudgetsResponse>
      mutateCampaignBudgetsCallable() {
    return mutateCampaignBudgetsCallable;
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
