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

import com.google.ads.googleads.v1.resources.BillingSetup;
import com.google.ads.googleads.v1.services.GetBillingSetupRequest;
import com.google.ads.googleads.v1.services.MutateBillingSetupRequest;
import com.google.ads.googleads.v1.services.MutateBillingSetupResponse;
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
public class GrpcBillingSetupServiceStub extends BillingSetupServiceStub {

  private static final MethodDescriptor<GetBillingSetupRequest, BillingSetup>
      getBillingSetupMethodDescriptor =
          MethodDescriptor.<GetBillingSetupRequest, BillingSetup>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.ads.googleads.v1.services.BillingSetupService/GetBillingSetup")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(GetBillingSetupRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(BillingSetup.getDefaultInstance()))
              .build();
  private static final MethodDescriptor<MutateBillingSetupRequest, MutateBillingSetupResponse>
      mutateBillingSetupMethodDescriptor =
          MethodDescriptor.<MutateBillingSetupRequest, MutateBillingSetupResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.ads.googleads.v1.services.BillingSetupService/MutateBillingSetup")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(MutateBillingSetupRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(MutateBillingSetupResponse.getDefaultInstance()))
              .build();

  private final BackgroundResource backgroundResources;

  private final UnaryCallable<GetBillingSetupRequest, BillingSetup> getBillingSetupCallable;
  private final UnaryCallable<MutateBillingSetupRequest, MutateBillingSetupResponse>
      mutateBillingSetupCallable;

  private final GrpcStubCallableFactory callableFactory;

  public static final GrpcBillingSetupServiceStub create(BillingSetupServiceStubSettings settings)
      throws IOException {
    return new GrpcBillingSetupServiceStub(settings, ClientContext.create(settings));
  }

  public static final GrpcBillingSetupServiceStub create(ClientContext clientContext)
      throws IOException {
    return new GrpcBillingSetupServiceStub(
        BillingSetupServiceStubSettings.newBuilder().build(), clientContext);
  }

  public static final GrpcBillingSetupServiceStub create(
      ClientContext clientContext, GrpcStubCallableFactory callableFactory) throws IOException {
    return new GrpcBillingSetupServiceStub(
        BillingSetupServiceStubSettings.newBuilder().build(), clientContext, callableFactory);
  }

  /**
   * Constructs an instance of GrpcBillingSetupServiceStub, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected GrpcBillingSetupServiceStub(
      BillingSetupServiceStubSettings settings, ClientContext clientContext) throws IOException {
    this(settings, clientContext, new GrpcBillingSetupServiceCallableFactory());
  }

  /**
   * Constructs an instance of GrpcBillingSetupServiceStub, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected GrpcBillingSetupServiceStub(
      BillingSetupServiceStubSettings settings,
      ClientContext clientContext,
      GrpcStubCallableFactory callableFactory)
      throws IOException {
    this.callableFactory = callableFactory;

    GrpcCallSettings<GetBillingSetupRequest, BillingSetup> getBillingSetupTransportSettings =
        GrpcCallSettings.<GetBillingSetupRequest, BillingSetup>newBuilder()
            .setMethodDescriptor(getBillingSetupMethodDescriptor)
            .setParamsExtractor(
                new RequestParamsExtractor<GetBillingSetupRequest>() {
                  @Override
                  public Map<String, String> extract(GetBillingSetupRequest request) {
                    ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                    params.put("resource_name", String.valueOf(request.getResourceName()));
                    return params.build();
                  }
                })
            .build();
    GrpcCallSettings<MutateBillingSetupRequest, MutateBillingSetupResponse>
        mutateBillingSetupTransportSettings =
            GrpcCallSettings.<MutateBillingSetupRequest, MutateBillingSetupResponse>newBuilder()
                .setMethodDescriptor(mutateBillingSetupMethodDescriptor)
                .setParamsExtractor(
                    new RequestParamsExtractor<MutateBillingSetupRequest>() {
                      @Override
                      public Map<String, String> extract(MutateBillingSetupRequest request) {
                        ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                        params.put("customer_id", String.valueOf(request.getCustomerId()));
                        return params.build();
                      }
                    })
                .build();

    this.getBillingSetupCallable =
        callableFactory.createUnaryCallable(
            getBillingSetupTransportSettings, settings.getBillingSetupSettings(), clientContext);
    this.mutateBillingSetupCallable =
        callableFactory.createUnaryCallable(
            mutateBillingSetupTransportSettings,
            settings.mutateBillingSetupSettings(),
            clientContext);

    backgroundResources = new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  public UnaryCallable<GetBillingSetupRequest, BillingSetup> getBillingSetupCallable() {
    return getBillingSetupCallable;
  }

  public UnaryCallable<MutateBillingSetupRequest, MutateBillingSetupResponse>
      mutateBillingSetupCallable() {
    return mutateBillingSetupCallable;
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
