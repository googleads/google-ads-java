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
package com.google.ads.googleads.v3.services.stub;

import com.google.ads.googleads.v3.resources.CampaignCriterion;
import com.google.ads.googleads.v3.services.GetCampaignCriterionRequest;
import com.google.ads.googleads.v3.services.MutateCampaignCriteriaRequest;
import com.google.ads.googleads.v3.services.MutateCampaignCriteriaResponse;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.core.BackgroundResourceAggregation;
import com.google.api.gax.grpc.GrpcCallSettings;
import com.google.api.gax.grpc.GrpcStubCallableFactory;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.RequestParamsExtractor;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.common.collect.ImmutableMap;
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
public class GrpcCampaignCriterionServiceStub extends CampaignCriterionServiceStub {

  private static final MethodDescriptor<GetCampaignCriterionRequest, CampaignCriterion>
      getCampaignCriterionMethodDescriptor =
          MethodDescriptor.<GetCampaignCriterionRequest, CampaignCriterion>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.ads.googleads.v3.services.CampaignCriterionService/GetCampaignCriterion")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(GetCampaignCriterionRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(CampaignCriterion.getDefaultInstance()))
              .build();
  private static final MethodDescriptor<
          MutateCampaignCriteriaRequest, MutateCampaignCriteriaResponse>
      mutateCampaignCriteriaMethodDescriptor =
          MethodDescriptor
              .<MutateCampaignCriteriaRequest, MutateCampaignCriteriaResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.ads.googleads.v3.services.CampaignCriterionService/MutateCampaignCriteria")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(MutateCampaignCriteriaRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(MutateCampaignCriteriaResponse.getDefaultInstance()))
              .build();

  private final BackgroundResource backgroundResources;

  private final UnaryCallable<GetCampaignCriterionRequest, CampaignCriterion>
      getCampaignCriterionCallable;
  private final UnaryCallable<MutateCampaignCriteriaRequest, MutateCampaignCriteriaResponse>
      mutateCampaignCriteriaCallable;

  private final GrpcStubCallableFactory callableFactory;

  public static final GrpcCampaignCriterionServiceStub create(
      CampaignCriterionServiceStubSettings settings) throws IOException {
    return new GrpcCampaignCriterionServiceStub(settings, ClientContext.create(settings));
  }

  public static final GrpcCampaignCriterionServiceStub create(ClientContext clientContext)
      throws IOException {
    return new GrpcCampaignCriterionServiceStub(
        CampaignCriterionServiceStubSettings.newBuilder().build(), clientContext);
  }

  public static final GrpcCampaignCriterionServiceStub create(
      ClientContext clientContext, GrpcStubCallableFactory callableFactory) throws IOException {
    return new GrpcCampaignCriterionServiceStub(
        CampaignCriterionServiceStubSettings.newBuilder().build(), clientContext, callableFactory);
  }

  /**
   * Constructs an instance of GrpcCampaignCriterionServiceStub, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected GrpcCampaignCriterionServiceStub(
      CampaignCriterionServiceStubSettings settings, ClientContext clientContext)
      throws IOException {
    this(settings, clientContext, new GrpcCampaignCriterionServiceCallableFactory());
  }

  /**
   * Constructs an instance of GrpcCampaignCriterionServiceStub, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected GrpcCampaignCriterionServiceStub(
      CampaignCriterionServiceStubSettings settings,
      ClientContext clientContext,
      GrpcStubCallableFactory callableFactory)
      throws IOException {
    this.callableFactory = callableFactory;

    GrpcCallSettings<GetCampaignCriterionRequest, CampaignCriterion>
        getCampaignCriterionTransportSettings =
            GrpcCallSettings.<GetCampaignCriterionRequest, CampaignCriterion>newBuilder()
                .setMethodDescriptor(getCampaignCriterionMethodDescriptor)
                .setParamsExtractor(
                    new RequestParamsExtractor<GetCampaignCriterionRequest>() {
                      @Override
                      public Map<String, String> extract(GetCampaignCriterionRequest request) {
                        ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                        params.put("resource_name", String.valueOf(request.getResourceName()));
                        return params.build();
                      }
                    })
                .build();
    GrpcCallSettings<MutateCampaignCriteriaRequest, MutateCampaignCriteriaResponse>
        mutateCampaignCriteriaTransportSettings =
            GrpcCallSettings
                .<MutateCampaignCriteriaRequest, MutateCampaignCriteriaResponse>newBuilder()
                .setMethodDescriptor(mutateCampaignCriteriaMethodDescriptor)
                .setParamsExtractor(
                    new RequestParamsExtractor<MutateCampaignCriteriaRequest>() {
                      @Override
                      public Map<String, String> extract(MutateCampaignCriteriaRequest request) {
                        ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                        params.put("customer_id", String.valueOf(request.getCustomerId()));
                        return params.build();
                      }
                    })
                .build();

    this.getCampaignCriterionCallable =
        callableFactory.createUnaryCallable(
            getCampaignCriterionTransportSettings,
            settings.getCampaignCriterionSettings(),
            clientContext);
    this.mutateCampaignCriteriaCallable =
        callableFactory.createUnaryCallable(
            mutateCampaignCriteriaTransportSettings,
            settings.mutateCampaignCriteriaSettings(),
            clientContext);

    backgroundResources = new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  public UnaryCallable<GetCampaignCriterionRequest, CampaignCriterion>
      getCampaignCriterionCallable() {
    return getCampaignCriterionCallable;
  }

  public UnaryCallable<MutateCampaignCriteriaRequest, MutateCampaignCriteriaResponse>
      mutateCampaignCriteriaCallable() {
    return mutateCampaignCriteriaCallable;
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
