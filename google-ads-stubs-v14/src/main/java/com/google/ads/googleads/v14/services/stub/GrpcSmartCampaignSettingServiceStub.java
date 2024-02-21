/*
 * Copyright 2024 Google LLC
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

package com.google.ads.googleads.v14.services.stub;

import com.google.ads.googleads.v14.services.GetSmartCampaignStatusRequest;
import com.google.ads.googleads.v14.services.GetSmartCampaignStatusResponse;
import com.google.ads.googleads.v14.services.MutateSmartCampaignSettingsRequest;
import com.google.ads.googleads.v14.services.MutateSmartCampaignSettingsResponse;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.core.BackgroundResourceAggregation;
import com.google.api.gax.grpc.GrpcCallSettings;
import com.google.api.gax.grpc.GrpcStubCallableFactory;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.RequestParamsBuilder;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.longrunning.stub.GrpcOperationsStub;
import io.grpc.MethodDescriptor;
import io.grpc.protobuf.ProtoUtils;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * gRPC stub implementation for the SmartCampaignSettingService service API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by gapic-generator-java")
public class GrpcSmartCampaignSettingServiceStub extends SmartCampaignSettingServiceStub {
  private static final MethodDescriptor<
          GetSmartCampaignStatusRequest, GetSmartCampaignStatusResponse>
      getSmartCampaignStatusMethodDescriptor =
          MethodDescriptor
              .<GetSmartCampaignStatusRequest, GetSmartCampaignStatusResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.ads.googleads.v14.services.SmartCampaignSettingService/GetSmartCampaignStatus")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(GetSmartCampaignStatusRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(GetSmartCampaignStatusResponse.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<
          MutateSmartCampaignSettingsRequest, MutateSmartCampaignSettingsResponse>
      mutateSmartCampaignSettingsMethodDescriptor =
          MethodDescriptor
              .<MutateSmartCampaignSettingsRequest, MutateSmartCampaignSettingsResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.ads.googleads.v14.services.SmartCampaignSettingService/MutateSmartCampaignSettings")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(MutateSmartCampaignSettingsRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(MutateSmartCampaignSettingsResponse.getDefaultInstance()))
              .build();

  private final UnaryCallable<GetSmartCampaignStatusRequest, GetSmartCampaignStatusResponse>
      getSmartCampaignStatusCallable;
  private final UnaryCallable<
          MutateSmartCampaignSettingsRequest, MutateSmartCampaignSettingsResponse>
      mutateSmartCampaignSettingsCallable;

  private final BackgroundResource backgroundResources;
  private final GrpcOperationsStub operationsStub;
  private final GrpcStubCallableFactory callableFactory;

  public static final GrpcSmartCampaignSettingServiceStub create(
      SmartCampaignSettingServiceStubSettings settings) throws IOException {
    return new GrpcSmartCampaignSettingServiceStub(settings, ClientContext.create(settings));
  }

  public static final GrpcSmartCampaignSettingServiceStub create(ClientContext clientContext)
      throws IOException {
    return new GrpcSmartCampaignSettingServiceStub(
        SmartCampaignSettingServiceStubSettings.newBuilder().build(), clientContext);
  }

  public static final GrpcSmartCampaignSettingServiceStub create(
      ClientContext clientContext, GrpcStubCallableFactory callableFactory) throws IOException {
    return new GrpcSmartCampaignSettingServiceStub(
        SmartCampaignSettingServiceStubSettings.newBuilder().build(),
        clientContext,
        callableFactory);
  }

  /**
   * Constructs an instance of GrpcSmartCampaignSettingServiceStub, using the given settings. This
   * is protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected GrpcSmartCampaignSettingServiceStub(
      SmartCampaignSettingServiceStubSettings settings, ClientContext clientContext)
      throws IOException {
    this(settings, clientContext, new GrpcSmartCampaignSettingServiceCallableFactory());
  }

  /**
   * Constructs an instance of GrpcSmartCampaignSettingServiceStub, using the given settings. This
   * is protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected GrpcSmartCampaignSettingServiceStub(
      SmartCampaignSettingServiceStubSettings settings,
      ClientContext clientContext,
      GrpcStubCallableFactory callableFactory)
      throws IOException {
    this.callableFactory = callableFactory;
    this.operationsStub = GrpcOperationsStub.create(clientContext, callableFactory);

    GrpcCallSettings<GetSmartCampaignStatusRequest, GetSmartCampaignStatusResponse>
        getSmartCampaignStatusTransportSettings =
            GrpcCallSettings
                .<GetSmartCampaignStatusRequest, GetSmartCampaignStatusResponse>newBuilder()
                .setMethodDescriptor(getSmartCampaignStatusMethodDescriptor)
                .setParamsExtractor(
                    request -> {
                      RequestParamsBuilder builder = RequestParamsBuilder.create();
                      builder.add("resource_name", String.valueOf(request.getResourceName()));
                      return builder.build();
                    })
                .build();
    GrpcCallSettings<MutateSmartCampaignSettingsRequest, MutateSmartCampaignSettingsResponse>
        mutateSmartCampaignSettingsTransportSettings =
            GrpcCallSettings
                .<MutateSmartCampaignSettingsRequest, MutateSmartCampaignSettingsResponse>
                    newBuilder()
                .setMethodDescriptor(mutateSmartCampaignSettingsMethodDescriptor)
                .setParamsExtractor(
                    request -> {
                      RequestParamsBuilder builder = RequestParamsBuilder.create();
                      builder.add("customer_id", String.valueOf(request.getCustomerId()));
                      return builder.build();
                    })
                .build();

    this.getSmartCampaignStatusCallable =
        callableFactory.createUnaryCallable(
            getSmartCampaignStatusTransportSettings,
            settings.getSmartCampaignStatusSettings(),
            clientContext);
    this.mutateSmartCampaignSettingsCallable =
        callableFactory.createUnaryCallable(
            mutateSmartCampaignSettingsTransportSettings,
            settings.mutateSmartCampaignSettingsSettings(),
            clientContext);

    this.backgroundResources =
        new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  public GrpcOperationsStub getOperationsStub() {
    return operationsStub;
  }

  @Override
  public UnaryCallable<GetSmartCampaignStatusRequest, GetSmartCampaignStatusResponse>
      getSmartCampaignStatusCallable() {
    return getSmartCampaignStatusCallable;
  }

  @Override
  public UnaryCallable<MutateSmartCampaignSettingsRequest, MutateSmartCampaignSettingsResponse>
      mutateSmartCampaignSettingsCallable() {
    return mutateSmartCampaignSettingsCallable;
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
