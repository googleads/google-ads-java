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

import com.google.ads.googleads.v6.resources.CampaignAsset;
import com.google.ads.googleads.v6.services.GetCampaignAssetRequest;
import com.google.ads.googleads.v6.services.MutateCampaignAssetsRequest;
import com.google.ads.googleads.v6.services.MutateCampaignAssetsResponse;
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
 * gRPC stub implementation for the CampaignAssetService service API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by gapic-generator-java")
public class GrpcCampaignAssetServiceStub extends CampaignAssetServiceStub {
  private static final MethodDescriptor<GetCampaignAssetRequest, CampaignAsset>
      getCampaignAssetMethodDescriptor =
          MethodDescriptor.<GetCampaignAssetRequest, CampaignAsset>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.ads.googleads.v6.services.CampaignAssetService/GetCampaignAsset")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(GetCampaignAssetRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(CampaignAsset.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<MutateCampaignAssetsRequest, MutateCampaignAssetsResponse>
      mutateCampaignAssetsMethodDescriptor =
          MethodDescriptor.<MutateCampaignAssetsRequest, MutateCampaignAssetsResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.ads.googleads.v6.services.CampaignAssetService/MutateCampaignAssets")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(MutateCampaignAssetsRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(MutateCampaignAssetsResponse.getDefaultInstance()))
              .build();

  private final UnaryCallable<GetCampaignAssetRequest, CampaignAsset> getCampaignAssetCallable;
  private final UnaryCallable<MutateCampaignAssetsRequest, MutateCampaignAssetsResponse>
      mutateCampaignAssetsCallable;

  private final BackgroundResource backgroundResources;
  private final GrpcOperationsStub operationsStub;
  private final GrpcStubCallableFactory callableFactory;

  public static final GrpcCampaignAssetServiceStub create(CampaignAssetServiceStubSettings settings)
      throws IOException {
    return new GrpcCampaignAssetServiceStub(settings, ClientContext.create(settings));
  }

  public static final GrpcCampaignAssetServiceStub create(ClientContext clientContext)
      throws IOException {
    return new GrpcCampaignAssetServiceStub(
        CampaignAssetServiceStubSettings.newBuilder().build(), clientContext);
  }

  public static final GrpcCampaignAssetServiceStub create(
      ClientContext clientContext, GrpcStubCallableFactory callableFactory) throws IOException {
    return new GrpcCampaignAssetServiceStub(
        CampaignAssetServiceStubSettings.newBuilder().build(), clientContext, callableFactory);
  }

  protected GrpcCampaignAssetServiceStub(
      CampaignAssetServiceStubSettings settings, ClientContext clientContext) throws IOException {
    this(settings, clientContext, new GrpcCampaignAssetServiceCallableFactory());
  }

  protected GrpcCampaignAssetServiceStub(
      CampaignAssetServiceStubSettings settings,
      ClientContext clientContext,
      GrpcStubCallableFactory callableFactory)
      throws IOException {
    this.callableFactory = callableFactory;
    this.operationsStub = GrpcOperationsStub.create(clientContext, callableFactory);

    GrpcCallSettings<GetCampaignAssetRequest, CampaignAsset> getCampaignAssetTransportSettings =
        GrpcCallSettings.<GetCampaignAssetRequest, CampaignAsset>newBuilder()
            .setMethodDescriptor(getCampaignAssetMethodDescriptor)
            .setParamsExtractor(
                new RequestParamsExtractor<GetCampaignAssetRequest>() {
                  @Override
                  public Map<String, String> extract(GetCampaignAssetRequest request) {
                    ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                    params.put("resource_name", String.valueOf(request.getResourceName()));
                    return params.build();
                  }
                })
            .build();
    GrpcCallSettings<MutateCampaignAssetsRequest, MutateCampaignAssetsResponse>
        mutateCampaignAssetsTransportSettings =
            GrpcCallSettings.<MutateCampaignAssetsRequest, MutateCampaignAssetsResponse>newBuilder()
                .setMethodDescriptor(mutateCampaignAssetsMethodDescriptor)
                .setParamsExtractor(
                    new RequestParamsExtractor<MutateCampaignAssetsRequest>() {
                      @Override
                      public Map<String, String> extract(MutateCampaignAssetsRequest request) {
                        ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                        params.put("customer_id", String.valueOf(request.getCustomerId()));
                        return params.build();
                      }
                    })
                .build();

    this.getCampaignAssetCallable =
        callableFactory.createUnaryCallable(
            getCampaignAssetTransportSettings, settings.getCampaignAssetSettings(), clientContext);
    this.mutateCampaignAssetsCallable =
        callableFactory.createUnaryCallable(
            mutateCampaignAssetsTransportSettings,
            settings.mutateCampaignAssetsSettings(),
            clientContext);

    this.backgroundResources =
        new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  public GrpcOperationsStub getOperationsStub() {
    return operationsStub;
  }

  public UnaryCallable<GetCampaignAssetRequest, CampaignAsset> getCampaignAssetCallable() {
    return getCampaignAssetCallable;
  }

  public UnaryCallable<MutateCampaignAssetsRequest, MutateCampaignAssetsResponse>
      mutateCampaignAssetsCallable() {
    return mutateCampaignAssetsCallable;
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
