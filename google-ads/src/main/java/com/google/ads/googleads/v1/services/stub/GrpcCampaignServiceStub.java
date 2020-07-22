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
package com.google.ads.googleads.v1.services.stub;

import com.google.ads.googleads.v1.resources.Campaign;
import com.google.ads.googleads.v1.services.GetCampaignRequest;
import com.google.ads.googleads.v1.services.MutateCampaignsRequest;
import com.google.ads.googleads.v1.services.MutateCampaignsResponse;
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
public class GrpcCampaignServiceStub extends CampaignServiceStub {

  private static final MethodDescriptor<GetCampaignRequest, Campaign> getCampaignMethodDescriptor =
      MethodDescriptor.<GetCampaignRequest, Campaign>newBuilder()
          .setType(MethodDescriptor.MethodType.UNARY)
          .setFullMethodName("google.ads.googleads.v1.services.CampaignService/GetCampaign")
          .setRequestMarshaller(ProtoUtils.marshaller(GetCampaignRequest.getDefaultInstance()))
          .setResponseMarshaller(ProtoUtils.marshaller(Campaign.getDefaultInstance()))
          .build();
  private static final MethodDescriptor<MutateCampaignsRequest, MutateCampaignsResponse>
      mutateCampaignsMethodDescriptor =
          MethodDescriptor.<MutateCampaignsRequest, MutateCampaignsResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName("google.ads.googleads.v1.services.CampaignService/MutateCampaigns")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(MutateCampaignsRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(MutateCampaignsResponse.getDefaultInstance()))
              .build();

  private final BackgroundResource backgroundResources;

  private final UnaryCallable<GetCampaignRequest, Campaign> getCampaignCallable;
  private final UnaryCallable<MutateCampaignsRequest, MutateCampaignsResponse>
      mutateCampaignsCallable;

  private final GrpcStubCallableFactory callableFactory;

  public static final GrpcCampaignServiceStub create(CampaignServiceStubSettings settings)
      throws IOException {
    return new GrpcCampaignServiceStub(settings, ClientContext.create(settings));
  }

  public static final GrpcCampaignServiceStub create(ClientContext clientContext)
      throws IOException {
    return new GrpcCampaignServiceStub(
        CampaignServiceStubSettings.newBuilder().build(), clientContext);
  }

  public static final GrpcCampaignServiceStub create(
      ClientContext clientContext, GrpcStubCallableFactory callableFactory) throws IOException {
    return new GrpcCampaignServiceStub(
        CampaignServiceStubSettings.newBuilder().build(), clientContext, callableFactory);
  }

  /**
   * Constructs an instance of GrpcCampaignServiceStub, using the given settings. This is protected
   * so that it is easy to make a subclass, but otherwise, the static factory methods should be
   * preferred.
   */
  protected GrpcCampaignServiceStub(
      CampaignServiceStubSettings settings, ClientContext clientContext) throws IOException {
    this(settings, clientContext, new GrpcCampaignServiceCallableFactory());
  }

  /**
   * Constructs an instance of GrpcCampaignServiceStub, using the given settings. This is protected
   * so that it is easy to make a subclass, but otherwise, the static factory methods should be
   * preferred.
   */
  protected GrpcCampaignServiceStub(
      CampaignServiceStubSettings settings,
      ClientContext clientContext,
      GrpcStubCallableFactory callableFactory)
      throws IOException {
    this.callableFactory = callableFactory;

    GrpcCallSettings<GetCampaignRequest, Campaign> getCampaignTransportSettings =
        GrpcCallSettings.<GetCampaignRequest, Campaign>newBuilder()
            .setMethodDescriptor(getCampaignMethodDescriptor)
            .setParamsExtractor(
                new RequestParamsExtractor<GetCampaignRequest>() {
                  @Override
                  public Map<String, String> extract(GetCampaignRequest request) {
                    ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                    params.put("resource_name", String.valueOf(request.getResourceName()));
                    return params.build();
                  }
                })
            .build();
    GrpcCallSettings<MutateCampaignsRequest, MutateCampaignsResponse>
        mutateCampaignsTransportSettings =
            GrpcCallSettings.<MutateCampaignsRequest, MutateCampaignsResponse>newBuilder()
                .setMethodDescriptor(mutateCampaignsMethodDescriptor)
                .setParamsExtractor(
                    new RequestParamsExtractor<MutateCampaignsRequest>() {
                      @Override
                      public Map<String, String> extract(MutateCampaignsRequest request) {
                        ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                        params.put("customer_id", String.valueOf(request.getCustomerId()));
                        return params.build();
                      }
                    })
                .build();

    this.getCampaignCallable =
        callableFactory.createUnaryCallable(
            getCampaignTransportSettings, settings.getCampaignSettings(), clientContext);
    this.mutateCampaignsCallable =
        callableFactory.createUnaryCallable(
            mutateCampaignsTransportSettings, settings.mutateCampaignsSettings(), clientContext);

    backgroundResources = new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  public UnaryCallable<GetCampaignRequest, Campaign> getCampaignCallable() {
    return getCampaignCallable;
  }

  public UnaryCallable<MutateCampaignsRequest, MutateCampaignsResponse> mutateCampaignsCallable() {
    return mutateCampaignsCallable;
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
