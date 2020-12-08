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

import com.google.ads.googleads.v6.resources.CampaignFeed;
import com.google.ads.googleads.v6.services.GetCampaignFeedRequest;
import com.google.ads.googleads.v6.services.MutateCampaignFeedsRequest;
import com.google.ads.googleads.v6.services.MutateCampaignFeedsResponse;
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
 * gRPC stub implementation for the CampaignFeedService service API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by gapic-generator-java")
public class GrpcCampaignFeedServiceStub extends CampaignFeedServiceStub {
  private static final MethodDescriptor<GetCampaignFeedRequest, CampaignFeed>
      getCampaignFeedMethodDescriptor =
          MethodDescriptor.<GetCampaignFeedRequest, CampaignFeed>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.ads.googleads.v6.services.CampaignFeedService/GetCampaignFeed")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(GetCampaignFeedRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(CampaignFeed.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<MutateCampaignFeedsRequest, MutateCampaignFeedsResponse>
      mutateCampaignFeedsMethodDescriptor =
          MethodDescriptor.<MutateCampaignFeedsRequest, MutateCampaignFeedsResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.ads.googleads.v6.services.CampaignFeedService/MutateCampaignFeeds")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(MutateCampaignFeedsRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(MutateCampaignFeedsResponse.getDefaultInstance()))
              .build();

  private final UnaryCallable<GetCampaignFeedRequest, CampaignFeed> getCampaignFeedCallable;
  private final UnaryCallable<MutateCampaignFeedsRequest, MutateCampaignFeedsResponse>
      mutateCampaignFeedsCallable;

  private final BackgroundResource backgroundResources;
  private final GrpcOperationsStub operationsStub;
  private final GrpcStubCallableFactory callableFactory;

  public static final GrpcCampaignFeedServiceStub create(CampaignFeedServiceStubSettings settings)
      throws IOException {
    return new GrpcCampaignFeedServiceStub(settings, ClientContext.create(settings));
  }

  public static final GrpcCampaignFeedServiceStub create(ClientContext clientContext)
      throws IOException {
    return new GrpcCampaignFeedServiceStub(
        CampaignFeedServiceStubSettings.newBuilder().build(), clientContext);
  }

  public static final GrpcCampaignFeedServiceStub create(
      ClientContext clientContext, GrpcStubCallableFactory callableFactory) throws IOException {
    return new GrpcCampaignFeedServiceStub(
        CampaignFeedServiceStubSettings.newBuilder().build(), clientContext, callableFactory);
  }

  protected GrpcCampaignFeedServiceStub(
      CampaignFeedServiceStubSettings settings, ClientContext clientContext) throws IOException {
    this(settings, clientContext, new GrpcCampaignFeedServiceCallableFactory());
  }

  protected GrpcCampaignFeedServiceStub(
      CampaignFeedServiceStubSettings settings,
      ClientContext clientContext,
      GrpcStubCallableFactory callableFactory)
      throws IOException {
    this.callableFactory = callableFactory;
    this.operationsStub = GrpcOperationsStub.create(clientContext, callableFactory);

    GrpcCallSettings<GetCampaignFeedRequest, CampaignFeed> getCampaignFeedTransportSettings =
        GrpcCallSettings.<GetCampaignFeedRequest, CampaignFeed>newBuilder()
            .setMethodDescriptor(getCampaignFeedMethodDescriptor)
            .setParamsExtractor(
                new RequestParamsExtractor<GetCampaignFeedRequest>() {
                  @Override
                  public Map<String, String> extract(GetCampaignFeedRequest request) {
                    ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                    params.put("resource_name", String.valueOf(request.getResourceName()));
                    return params.build();
                  }
                })
            .build();
    GrpcCallSettings<MutateCampaignFeedsRequest, MutateCampaignFeedsResponse>
        mutateCampaignFeedsTransportSettings =
            GrpcCallSettings.<MutateCampaignFeedsRequest, MutateCampaignFeedsResponse>newBuilder()
                .setMethodDescriptor(mutateCampaignFeedsMethodDescriptor)
                .setParamsExtractor(
                    new RequestParamsExtractor<MutateCampaignFeedsRequest>() {
                      @Override
                      public Map<String, String> extract(MutateCampaignFeedsRequest request) {
                        ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                        params.put("customer_id", String.valueOf(request.getCustomerId()));
                        return params.build();
                      }
                    })
                .build();

    this.getCampaignFeedCallable =
        callableFactory.createUnaryCallable(
            getCampaignFeedTransportSettings, settings.getCampaignFeedSettings(), clientContext);
    this.mutateCampaignFeedsCallable =
        callableFactory.createUnaryCallable(
            mutateCampaignFeedsTransportSettings,
            settings.mutateCampaignFeedsSettings(),
            clientContext);

    this.backgroundResources =
        new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  public GrpcOperationsStub getOperationsStub() {
    return operationsStub;
  }

  public UnaryCallable<GetCampaignFeedRequest, CampaignFeed> getCampaignFeedCallable() {
    return getCampaignFeedCallable;
  }

  public UnaryCallable<MutateCampaignFeedsRequest, MutateCampaignFeedsResponse>
      mutateCampaignFeedsCallable() {
    return mutateCampaignFeedsCallable;
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
