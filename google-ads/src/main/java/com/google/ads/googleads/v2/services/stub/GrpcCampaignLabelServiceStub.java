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
package com.google.ads.googleads.v2.services.stub;

import com.google.ads.googleads.v2.resources.CampaignLabel;
import com.google.ads.googleads.v2.services.GetCampaignLabelRequest;
import com.google.ads.googleads.v2.services.MutateCampaignLabelsRequest;
import com.google.ads.googleads.v2.services.MutateCampaignLabelsResponse;
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
public class GrpcCampaignLabelServiceStub extends CampaignLabelServiceStub {

  private static final MethodDescriptor<GetCampaignLabelRequest, CampaignLabel>
      getCampaignLabelMethodDescriptor =
          MethodDescriptor.<GetCampaignLabelRequest, CampaignLabel>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.ads.googleads.v2.services.CampaignLabelService/GetCampaignLabel")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(GetCampaignLabelRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(CampaignLabel.getDefaultInstance()))
              .build();
  private static final MethodDescriptor<MutateCampaignLabelsRequest, MutateCampaignLabelsResponse>
      mutateCampaignLabelsMethodDescriptor =
          MethodDescriptor.<MutateCampaignLabelsRequest, MutateCampaignLabelsResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.ads.googleads.v2.services.CampaignLabelService/MutateCampaignLabels")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(MutateCampaignLabelsRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(MutateCampaignLabelsResponse.getDefaultInstance()))
              .build();

  private final BackgroundResource backgroundResources;

  private final UnaryCallable<GetCampaignLabelRequest, CampaignLabel> getCampaignLabelCallable;
  private final UnaryCallable<MutateCampaignLabelsRequest, MutateCampaignLabelsResponse>
      mutateCampaignLabelsCallable;

  private final GrpcStubCallableFactory callableFactory;

  public static final GrpcCampaignLabelServiceStub create(CampaignLabelServiceStubSettings settings)
      throws IOException {
    return new GrpcCampaignLabelServiceStub(settings, ClientContext.create(settings));
  }

  public static final GrpcCampaignLabelServiceStub create(ClientContext clientContext)
      throws IOException {
    return new GrpcCampaignLabelServiceStub(
        CampaignLabelServiceStubSettings.newBuilder().build(), clientContext);
  }

  public static final GrpcCampaignLabelServiceStub create(
      ClientContext clientContext, GrpcStubCallableFactory callableFactory) throws IOException {
    return new GrpcCampaignLabelServiceStub(
        CampaignLabelServiceStubSettings.newBuilder().build(), clientContext, callableFactory);
  }

  /**
   * Constructs an instance of GrpcCampaignLabelServiceStub, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected GrpcCampaignLabelServiceStub(
      CampaignLabelServiceStubSettings settings, ClientContext clientContext) throws IOException {
    this(settings, clientContext, new GrpcCampaignLabelServiceCallableFactory());
  }

  /**
   * Constructs an instance of GrpcCampaignLabelServiceStub, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected GrpcCampaignLabelServiceStub(
      CampaignLabelServiceStubSettings settings,
      ClientContext clientContext,
      GrpcStubCallableFactory callableFactory)
      throws IOException {
    this.callableFactory = callableFactory;

    GrpcCallSettings<GetCampaignLabelRequest, CampaignLabel> getCampaignLabelTransportSettings =
        GrpcCallSettings.<GetCampaignLabelRequest, CampaignLabel>newBuilder()
            .setMethodDescriptor(getCampaignLabelMethodDescriptor)
            .setParamsExtractor(
                new RequestParamsExtractor<GetCampaignLabelRequest>() {
                  @Override
                  public Map<String, String> extract(GetCampaignLabelRequest request) {
                    ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                    params.put("resource_name", String.valueOf(request.getResourceName()));
                    return params.build();
                  }
                })
            .build();
    GrpcCallSettings<MutateCampaignLabelsRequest, MutateCampaignLabelsResponse>
        mutateCampaignLabelsTransportSettings =
            GrpcCallSettings.<MutateCampaignLabelsRequest, MutateCampaignLabelsResponse>newBuilder()
                .setMethodDescriptor(mutateCampaignLabelsMethodDescriptor)
                .setParamsExtractor(
                    new RequestParamsExtractor<MutateCampaignLabelsRequest>() {
                      @Override
                      public Map<String, String> extract(MutateCampaignLabelsRequest request) {
                        ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                        params.put("customer_id", String.valueOf(request.getCustomerId()));
                        return params.build();
                      }
                    })
                .build();

    this.getCampaignLabelCallable =
        callableFactory.createUnaryCallable(
            getCampaignLabelTransportSettings, settings.getCampaignLabelSettings(), clientContext);
    this.mutateCampaignLabelsCallable =
        callableFactory.createUnaryCallable(
            mutateCampaignLabelsTransportSettings,
            settings.mutateCampaignLabelsSettings(),
            clientContext);

    backgroundResources = new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  public UnaryCallable<GetCampaignLabelRequest, CampaignLabel> getCampaignLabelCallable() {
    return getCampaignLabelCallable;
  }

  public UnaryCallable<MutateCampaignLabelsRequest, MutateCampaignLabelsResponse>
      mutateCampaignLabelsCallable() {
    return mutateCampaignLabelsCallable;
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
