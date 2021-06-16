/*
 * Copyright 2021 Google LLC
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

package com.google.ads.googleads.v8.services.stub;

import com.google.ads.googleads.v8.resources.ThirdPartyAppAnalyticsLink;
import com.google.ads.googleads.v8.services.GetThirdPartyAppAnalyticsLinkRequest;
import com.google.ads.googleads.v8.services.RegenerateShareableLinkIdRequest;
import com.google.ads.googleads.v8.services.RegenerateShareableLinkIdResponse;
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
 * gRPC stub implementation for the ThirdPartyAppAnalyticsLinkService service API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by gapic-generator-java")
public class GrpcThirdPartyAppAnalyticsLinkServiceStub
    extends ThirdPartyAppAnalyticsLinkServiceStub {
  private static final MethodDescriptor<
          GetThirdPartyAppAnalyticsLinkRequest, ThirdPartyAppAnalyticsLink>
      getThirdPartyAppAnalyticsLinkMethodDescriptor =
          MethodDescriptor
              .<GetThirdPartyAppAnalyticsLinkRequest, ThirdPartyAppAnalyticsLink>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.ads.googleads.v8.services.ThirdPartyAppAnalyticsLinkService/GetThirdPartyAppAnalyticsLink")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(GetThirdPartyAppAnalyticsLinkRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(ThirdPartyAppAnalyticsLink.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<
          RegenerateShareableLinkIdRequest, RegenerateShareableLinkIdResponse>
      regenerateShareableLinkIdMethodDescriptor =
          MethodDescriptor
              .<RegenerateShareableLinkIdRequest, RegenerateShareableLinkIdResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.ads.googleads.v8.services.ThirdPartyAppAnalyticsLinkService/RegenerateShareableLinkId")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(RegenerateShareableLinkIdRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(RegenerateShareableLinkIdResponse.getDefaultInstance()))
              .build();

  private final UnaryCallable<GetThirdPartyAppAnalyticsLinkRequest, ThirdPartyAppAnalyticsLink>
      getThirdPartyAppAnalyticsLinkCallable;
  private final UnaryCallable<RegenerateShareableLinkIdRequest, RegenerateShareableLinkIdResponse>
      regenerateShareableLinkIdCallable;

  private final BackgroundResource backgroundResources;
  private final GrpcOperationsStub operationsStub;
  private final GrpcStubCallableFactory callableFactory;

  public static final GrpcThirdPartyAppAnalyticsLinkServiceStub create(
      ThirdPartyAppAnalyticsLinkServiceStubSettings settings) throws IOException {
    return new GrpcThirdPartyAppAnalyticsLinkServiceStub(settings, ClientContext.create(settings));
  }

  public static final GrpcThirdPartyAppAnalyticsLinkServiceStub create(ClientContext clientContext)
      throws IOException {
    return new GrpcThirdPartyAppAnalyticsLinkServiceStub(
        ThirdPartyAppAnalyticsLinkServiceStubSettings.newBuilder().build(), clientContext);
  }

  public static final GrpcThirdPartyAppAnalyticsLinkServiceStub create(
      ClientContext clientContext, GrpcStubCallableFactory callableFactory) throws IOException {
    return new GrpcThirdPartyAppAnalyticsLinkServiceStub(
        ThirdPartyAppAnalyticsLinkServiceStubSettings.newBuilder().build(),
        clientContext,
        callableFactory);
  }

  /**
   * Constructs an instance of GrpcThirdPartyAppAnalyticsLinkServiceStub, using the given settings.
   * This is protected so that it is easy to make a subclass, but otherwise, the static factory
   * methods should be preferred.
   */
  protected GrpcThirdPartyAppAnalyticsLinkServiceStub(
      ThirdPartyAppAnalyticsLinkServiceStubSettings settings, ClientContext clientContext)
      throws IOException {
    this(settings, clientContext, new GrpcThirdPartyAppAnalyticsLinkServiceCallableFactory());
  }

  /**
   * Constructs an instance of GrpcThirdPartyAppAnalyticsLinkServiceStub, using the given settings.
   * This is protected so that it is easy to make a subclass, but otherwise, the static factory
   * methods should be preferred.
   */
  protected GrpcThirdPartyAppAnalyticsLinkServiceStub(
      ThirdPartyAppAnalyticsLinkServiceStubSettings settings,
      ClientContext clientContext,
      GrpcStubCallableFactory callableFactory)
      throws IOException {
    this.callableFactory = callableFactory;
    this.operationsStub = GrpcOperationsStub.create(clientContext, callableFactory);

    GrpcCallSettings<GetThirdPartyAppAnalyticsLinkRequest, ThirdPartyAppAnalyticsLink>
        getThirdPartyAppAnalyticsLinkTransportSettings =
            GrpcCallSettings
                .<GetThirdPartyAppAnalyticsLinkRequest, ThirdPartyAppAnalyticsLink>newBuilder()
                .setMethodDescriptor(getThirdPartyAppAnalyticsLinkMethodDescriptor)
                .setParamsExtractor(
                    new RequestParamsExtractor<GetThirdPartyAppAnalyticsLinkRequest>() {
                      @Override
                      public Map<String, String> extract(
                          GetThirdPartyAppAnalyticsLinkRequest request) {
                        ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                        params.put("resource_name", String.valueOf(request.getResourceName()));
                        return params.build();
                      }
                    })
                .build();
    GrpcCallSettings<RegenerateShareableLinkIdRequest, RegenerateShareableLinkIdResponse>
        regenerateShareableLinkIdTransportSettings =
            GrpcCallSettings
                .<RegenerateShareableLinkIdRequest, RegenerateShareableLinkIdResponse>newBuilder()
                .setMethodDescriptor(regenerateShareableLinkIdMethodDescriptor)
                .setParamsExtractor(
                    new RequestParamsExtractor<RegenerateShareableLinkIdRequest>() {
                      @Override
                      public Map<String, String> extract(RegenerateShareableLinkIdRequest request) {
                        ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                        params.put("resource_name", String.valueOf(request.getResourceName()));
                        return params.build();
                      }
                    })
                .build();

    this.getThirdPartyAppAnalyticsLinkCallable =
        callableFactory.createUnaryCallable(
            getThirdPartyAppAnalyticsLinkTransportSettings,
            settings.getThirdPartyAppAnalyticsLinkSettings(),
            clientContext);
    this.regenerateShareableLinkIdCallable =
        callableFactory.createUnaryCallable(
            regenerateShareableLinkIdTransportSettings,
            settings.regenerateShareableLinkIdSettings(),
            clientContext);

    this.backgroundResources =
        new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  public GrpcOperationsStub getOperationsStub() {
    return operationsStub;
  }

  @Override
  public UnaryCallable<GetThirdPartyAppAnalyticsLinkRequest, ThirdPartyAppAnalyticsLink>
      getThirdPartyAppAnalyticsLinkCallable() {
    return getThirdPartyAppAnalyticsLinkCallable;
  }

  @Override
  public UnaryCallable<RegenerateShareableLinkIdRequest, RegenerateShareableLinkIdResponse>
      regenerateShareableLinkIdCallable() {
    return regenerateShareableLinkIdCallable;
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
