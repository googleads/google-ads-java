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
package com.google.ads.googleads.v1.services.stub;

import com.google.ads.googleads.v1.resources.CampaignExtensionSetting;
import com.google.ads.googleads.v1.services.GetCampaignExtensionSettingRequest;
import com.google.ads.googleads.v1.services.MutateCampaignExtensionSettingsRequest;
import com.google.ads.googleads.v1.services.MutateCampaignExtensionSettingsResponse;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.core.BackgroundResourceAggregation;
import com.google.api.gax.grpc.GrpcCallSettings;
import com.google.api.gax.grpc.GrpcStubCallableFactory;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.UnaryCallable;
import io.grpc.MethodDescriptor;
import io.grpc.protobuf.ProtoUtils;
import java.io.IOException;
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
public class GrpcCampaignExtensionSettingServiceStub extends CampaignExtensionSettingServiceStub {

  private static final MethodDescriptor<
          GetCampaignExtensionSettingRequest, CampaignExtensionSetting>
      getCampaignExtensionSettingMethodDescriptor =
          MethodDescriptor
              .<GetCampaignExtensionSettingRequest, CampaignExtensionSetting>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.ads.googleads.v1.services.CampaignExtensionSettingService/GetCampaignExtensionSetting")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(GetCampaignExtensionSettingRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(CampaignExtensionSetting.getDefaultInstance()))
              .build();
  private static final MethodDescriptor<
          MutateCampaignExtensionSettingsRequest, MutateCampaignExtensionSettingsResponse>
      mutateCampaignExtensionSettingsMethodDescriptor =
          MethodDescriptor
              .<MutateCampaignExtensionSettingsRequest, MutateCampaignExtensionSettingsResponse>
                  newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.ads.googleads.v1.services.CampaignExtensionSettingService/MutateCampaignExtensionSettings")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(
                      MutateCampaignExtensionSettingsRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(
                      MutateCampaignExtensionSettingsResponse.getDefaultInstance()))
              .build();

  private final BackgroundResource backgroundResources;

  private final UnaryCallable<GetCampaignExtensionSettingRequest, CampaignExtensionSetting>
      getCampaignExtensionSettingCallable;
  private final UnaryCallable<
          MutateCampaignExtensionSettingsRequest, MutateCampaignExtensionSettingsResponse>
      mutateCampaignExtensionSettingsCallable;

  private final GrpcStubCallableFactory callableFactory;

  public static final GrpcCampaignExtensionSettingServiceStub create(
      CampaignExtensionSettingServiceStubSettings settings) throws IOException {
    return new GrpcCampaignExtensionSettingServiceStub(settings, ClientContext.create(settings));
  }

  public static final GrpcCampaignExtensionSettingServiceStub create(ClientContext clientContext)
      throws IOException {
    return new GrpcCampaignExtensionSettingServiceStub(
        CampaignExtensionSettingServiceStubSettings.newBuilder().build(), clientContext);
  }

  public static final GrpcCampaignExtensionSettingServiceStub create(
      ClientContext clientContext, GrpcStubCallableFactory callableFactory) throws IOException {
    return new GrpcCampaignExtensionSettingServiceStub(
        CampaignExtensionSettingServiceStubSettings.newBuilder().build(),
        clientContext,
        callableFactory);
  }

  /**
   * Constructs an instance of GrpcCampaignExtensionSettingServiceStub, using the given settings.
   * This is protected so that it is easy to make a subclass, but otherwise, the static factory
   * methods should be preferred.
   */
  protected GrpcCampaignExtensionSettingServiceStub(
      CampaignExtensionSettingServiceStubSettings settings, ClientContext clientContext)
      throws IOException {
    this(settings, clientContext, new GrpcCampaignExtensionSettingServiceCallableFactory());
  }

  /**
   * Constructs an instance of GrpcCampaignExtensionSettingServiceStub, using the given settings.
   * This is protected so that it is easy to make a subclass, but otherwise, the static factory
   * methods should be preferred.
   */
  protected GrpcCampaignExtensionSettingServiceStub(
      CampaignExtensionSettingServiceStubSettings settings,
      ClientContext clientContext,
      GrpcStubCallableFactory callableFactory)
      throws IOException {
    this.callableFactory = callableFactory;

    GrpcCallSettings<GetCampaignExtensionSettingRequest, CampaignExtensionSetting>
        getCampaignExtensionSettingTransportSettings =
            GrpcCallSettings
                .<GetCampaignExtensionSettingRequest, CampaignExtensionSetting>newBuilder()
                .setMethodDescriptor(getCampaignExtensionSettingMethodDescriptor)
                .build();
    GrpcCallSettings<
            MutateCampaignExtensionSettingsRequest, MutateCampaignExtensionSettingsResponse>
        mutateCampaignExtensionSettingsTransportSettings =
            GrpcCallSettings
                .<MutateCampaignExtensionSettingsRequest, MutateCampaignExtensionSettingsResponse>
                    newBuilder()
                .setMethodDescriptor(mutateCampaignExtensionSettingsMethodDescriptor)
                .build();

    this.getCampaignExtensionSettingCallable =
        callableFactory.createUnaryCallable(
            getCampaignExtensionSettingTransportSettings,
            settings.getCampaignExtensionSettingSettings(),
            clientContext);
    this.mutateCampaignExtensionSettingsCallable =
        callableFactory.createUnaryCallable(
            mutateCampaignExtensionSettingsTransportSettings,
            settings.mutateCampaignExtensionSettingsSettings(),
            clientContext);

    backgroundResources = new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  public UnaryCallable<GetCampaignExtensionSettingRequest, CampaignExtensionSetting>
      getCampaignExtensionSettingCallable() {
    return getCampaignExtensionSettingCallable;
  }

  public UnaryCallable<
          MutateCampaignExtensionSettingsRequest, MutateCampaignExtensionSettingsResponse>
      mutateCampaignExtensionSettingsCallable() {
    return mutateCampaignExtensionSettingsCallable;
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
