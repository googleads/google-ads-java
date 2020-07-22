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
package com.google.ads.googleads.v2.services.stub;

import com.google.ads.googleads.v2.resources.ConversionAction;
import com.google.ads.googleads.v2.services.GetConversionActionRequest;
import com.google.ads.googleads.v2.services.MutateConversionActionsRequest;
import com.google.ads.googleads.v2.services.MutateConversionActionsResponse;
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
public class GrpcConversionActionServiceStub extends ConversionActionServiceStub {

  private static final MethodDescriptor<GetConversionActionRequest, ConversionAction>
      getConversionActionMethodDescriptor =
          MethodDescriptor.<GetConversionActionRequest, ConversionAction>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.ads.googleads.v2.services.ConversionActionService/GetConversionAction")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(GetConversionActionRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(ConversionAction.getDefaultInstance()))
              .build();
  private static final MethodDescriptor<
          MutateConversionActionsRequest, MutateConversionActionsResponse>
      mutateConversionActionsMethodDescriptor =
          MethodDescriptor
              .<MutateConversionActionsRequest, MutateConversionActionsResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.ads.googleads.v2.services.ConversionActionService/MutateConversionActions")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(MutateConversionActionsRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(MutateConversionActionsResponse.getDefaultInstance()))
              .build();

  private final BackgroundResource backgroundResources;

  private final UnaryCallable<GetConversionActionRequest, ConversionAction>
      getConversionActionCallable;
  private final UnaryCallable<MutateConversionActionsRequest, MutateConversionActionsResponse>
      mutateConversionActionsCallable;

  private final GrpcStubCallableFactory callableFactory;

  public static final GrpcConversionActionServiceStub create(
      ConversionActionServiceStubSettings settings) throws IOException {
    return new GrpcConversionActionServiceStub(settings, ClientContext.create(settings));
  }

  public static final GrpcConversionActionServiceStub create(ClientContext clientContext)
      throws IOException {
    return new GrpcConversionActionServiceStub(
        ConversionActionServiceStubSettings.newBuilder().build(), clientContext);
  }

  public static final GrpcConversionActionServiceStub create(
      ClientContext clientContext, GrpcStubCallableFactory callableFactory) throws IOException {
    return new GrpcConversionActionServiceStub(
        ConversionActionServiceStubSettings.newBuilder().build(), clientContext, callableFactory);
  }

  /**
   * Constructs an instance of GrpcConversionActionServiceStub, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected GrpcConversionActionServiceStub(
      ConversionActionServiceStubSettings settings, ClientContext clientContext)
      throws IOException {
    this(settings, clientContext, new GrpcConversionActionServiceCallableFactory());
  }

  /**
   * Constructs an instance of GrpcConversionActionServiceStub, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected GrpcConversionActionServiceStub(
      ConversionActionServiceStubSettings settings,
      ClientContext clientContext,
      GrpcStubCallableFactory callableFactory)
      throws IOException {
    this.callableFactory = callableFactory;

    GrpcCallSettings<GetConversionActionRequest, ConversionAction>
        getConversionActionTransportSettings =
            GrpcCallSettings.<GetConversionActionRequest, ConversionAction>newBuilder()
                .setMethodDescriptor(getConversionActionMethodDescriptor)
                .setParamsExtractor(
                    new RequestParamsExtractor<GetConversionActionRequest>() {
                      @Override
                      public Map<String, String> extract(GetConversionActionRequest request) {
                        ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                        params.put("resource_name", String.valueOf(request.getResourceName()));
                        return params.build();
                      }
                    })
                .build();
    GrpcCallSettings<MutateConversionActionsRequest, MutateConversionActionsResponse>
        mutateConversionActionsTransportSettings =
            GrpcCallSettings
                .<MutateConversionActionsRequest, MutateConversionActionsResponse>newBuilder()
                .setMethodDescriptor(mutateConversionActionsMethodDescriptor)
                .setParamsExtractor(
                    new RequestParamsExtractor<MutateConversionActionsRequest>() {
                      @Override
                      public Map<String, String> extract(MutateConversionActionsRequest request) {
                        ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                        params.put("customer_id", String.valueOf(request.getCustomerId()));
                        return params.build();
                      }
                    })
                .build();

    this.getConversionActionCallable =
        callableFactory.createUnaryCallable(
            getConversionActionTransportSettings,
            settings.getConversionActionSettings(),
            clientContext);
    this.mutateConversionActionsCallable =
        callableFactory.createUnaryCallable(
            mutateConversionActionsTransportSettings,
            settings.mutateConversionActionsSettings(),
            clientContext);

    backgroundResources = new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  public UnaryCallable<GetConversionActionRequest, ConversionAction> getConversionActionCallable() {
    return getConversionActionCallable;
  }

  public UnaryCallable<MutateConversionActionsRequest, MutateConversionActionsResponse>
      mutateConversionActionsCallable() {
    return mutateConversionActionsCallable;
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
