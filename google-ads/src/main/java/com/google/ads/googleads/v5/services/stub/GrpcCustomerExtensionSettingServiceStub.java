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
package com.google.ads.googleads.v5.services.stub;

import com.google.ads.googleads.v5.resources.CustomerExtensionSetting;
import com.google.ads.googleads.v5.services.GetCustomerExtensionSettingRequest;
import com.google.ads.googleads.v5.services.MutateCustomerExtensionSettingsRequest;
import com.google.ads.googleads.v5.services.MutateCustomerExtensionSettingsResponse;
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
public class GrpcCustomerExtensionSettingServiceStub extends CustomerExtensionSettingServiceStub {

  private static final MethodDescriptor<
          GetCustomerExtensionSettingRequest, CustomerExtensionSetting>
      getCustomerExtensionSettingMethodDescriptor =
          MethodDescriptor
              .<GetCustomerExtensionSettingRequest, CustomerExtensionSetting>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.ads.googleads.v5.services.CustomerExtensionSettingService/GetCustomerExtensionSetting")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(GetCustomerExtensionSettingRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(CustomerExtensionSetting.getDefaultInstance()))
              .build();
  private static final MethodDescriptor<
          MutateCustomerExtensionSettingsRequest, MutateCustomerExtensionSettingsResponse>
      mutateCustomerExtensionSettingsMethodDescriptor =
          MethodDescriptor
              .<MutateCustomerExtensionSettingsRequest, MutateCustomerExtensionSettingsResponse>
                  newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.ads.googleads.v5.services.CustomerExtensionSettingService/MutateCustomerExtensionSettings")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(
                      MutateCustomerExtensionSettingsRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(
                      MutateCustomerExtensionSettingsResponse.getDefaultInstance()))
              .build();

  private final BackgroundResource backgroundResources;

  private final UnaryCallable<GetCustomerExtensionSettingRequest, CustomerExtensionSetting>
      getCustomerExtensionSettingCallable;
  private final UnaryCallable<
          MutateCustomerExtensionSettingsRequest, MutateCustomerExtensionSettingsResponse>
      mutateCustomerExtensionSettingsCallable;

  private final GrpcStubCallableFactory callableFactory;

  public static final GrpcCustomerExtensionSettingServiceStub create(
      CustomerExtensionSettingServiceStubSettings settings) throws IOException {
    return new GrpcCustomerExtensionSettingServiceStub(settings, ClientContext.create(settings));
  }

  public static final GrpcCustomerExtensionSettingServiceStub create(ClientContext clientContext)
      throws IOException {
    return new GrpcCustomerExtensionSettingServiceStub(
        CustomerExtensionSettingServiceStubSettings.newBuilder().build(), clientContext);
  }

  public static final GrpcCustomerExtensionSettingServiceStub create(
      ClientContext clientContext, GrpcStubCallableFactory callableFactory) throws IOException {
    return new GrpcCustomerExtensionSettingServiceStub(
        CustomerExtensionSettingServiceStubSettings.newBuilder().build(),
        clientContext,
        callableFactory);
  }

  /**
   * Constructs an instance of GrpcCustomerExtensionSettingServiceStub, using the given settings.
   * This is protected so that it is easy to make a subclass, but otherwise, the static factory
   * methods should be preferred.
   */
  protected GrpcCustomerExtensionSettingServiceStub(
      CustomerExtensionSettingServiceStubSettings settings, ClientContext clientContext)
      throws IOException {
    this(settings, clientContext, new GrpcCustomerExtensionSettingServiceCallableFactory());
  }

  /**
   * Constructs an instance of GrpcCustomerExtensionSettingServiceStub, using the given settings.
   * This is protected so that it is easy to make a subclass, but otherwise, the static factory
   * methods should be preferred.
   */
  protected GrpcCustomerExtensionSettingServiceStub(
      CustomerExtensionSettingServiceStubSettings settings,
      ClientContext clientContext,
      GrpcStubCallableFactory callableFactory)
      throws IOException {
    this.callableFactory = callableFactory;

    GrpcCallSettings<GetCustomerExtensionSettingRequest, CustomerExtensionSetting>
        getCustomerExtensionSettingTransportSettings =
            GrpcCallSettings
                .<GetCustomerExtensionSettingRequest, CustomerExtensionSetting>newBuilder()
                .setMethodDescriptor(getCustomerExtensionSettingMethodDescriptor)
                .setParamsExtractor(
                    new RequestParamsExtractor<GetCustomerExtensionSettingRequest>() {
                      @Override
                      public Map<String, String> extract(
                          GetCustomerExtensionSettingRequest request) {
                        ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                        params.put("resource_name", String.valueOf(request.getResourceName()));
                        return params.build();
                      }
                    })
                .build();
    GrpcCallSettings<
            MutateCustomerExtensionSettingsRequest, MutateCustomerExtensionSettingsResponse>
        mutateCustomerExtensionSettingsTransportSettings =
            GrpcCallSettings
                .<MutateCustomerExtensionSettingsRequest, MutateCustomerExtensionSettingsResponse>
                    newBuilder()
                .setMethodDescriptor(mutateCustomerExtensionSettingsMethodDescriptor)
                .setParamsExtractor(
                    new RequestParamsExtractor<MutateCustomerExtensionSettingsRequest>() {
                      @Override
                      public Map<String, String> extract(
                          MutateCustomerExtensionSettingsRequest request) {
                        ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                        params.put("customer_id", String.valueOf(request.getCustomerId()));
                        return params.build();
                      }
                    })
                .build();

    this.getCustomerExtensionSettingCallable =
        callableFactory.createUnaryCallable(
            getCustomerExtensionSettingTransportSettings,
            settings.getCustomerExtensionSettingSettings(),
            clientContext);
    this.mutateCustomerExtensionSettingsCallable =
        callableFactory.createUnaryCallable(
            mutateCustomerExtensionSettingsTransportSettings,
            settings.mutateCustomerExtensionSettingsSettings(),
            clientContext);

    backgroundResources = new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  public UnaryCallable<GetCustomerExtensionSettingRequest, CustomerExtensionSetting>
      getCustomerExtensionSettingCallable() {
    return getCustomerExtensionSettingCallable;
  }

  public UnaryCallable<
          MutateCustomerExtensionSettingsRequest, MutateCustomerExtensionSettingsResponse>
      mutateCustomerExtensionSettingsCallable() {
    return mutateCustomerExtensionSettingsCallable;
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
