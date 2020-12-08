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

import com.google.ads.googleads.v6.resources.AdGroupBidModifier;
import com.google.ads.googleads.v6.services.GetAdGroupBidModifierRequest;
import com.google.ads.googleads.v6.services.MutateAdGroupBidModifiersRequest;
import com.google.ads.googleads.v6.services.MutateAdGroupBidModifiersResponse;
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
 * gRPC stub implementation for the AdGroupBidModifierService service API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by gapic-generator-java")
public class GrpcAdGroupBidModifierServiceStub extends AdGroupBidModifierServiceStub {
  private static final MethodDescriptor<GetAdGroupBidModifierRequest, AdGroupBidModifier>
      getAdGroupBidModifierMethodDescriptor =
          MethodDescriptor.<GetAdGroupBidModifierRequest, AdGroupBidModifier>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.ads.googleads.v6.services.AdGroupBidModifierService/GetAdGroupBidModifier")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(GetAdGroupBidModifierRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(AdGroupBidModifier.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<
          MutateAdGroupBidModifiersRequest, MutateAdGroupBidModifiersResponse>
      mutateAdGroupBidModifiersMethodDescriptor =
          MethodDescriptor
              .<MutateAdGroupBidModifiersRequest, MutateAdGroupBidModifiersResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.ads.googleads.v6.services.AdGroupBidModifierService/MutateAdGroupBidModifiers")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(MutateAdGroupBidModifiersRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(MutateAdGroupBidModifiersResponse.getDefaultInstance()))
              .build();

  private final UnaryCallable<GetAdGroupBidModifierRequest, AdGroupBidModifier>
      getAdGroupBidModifierCallable;
  private final UnaryCallable<MutateAdGroupBidModifiersRequest, MutateAdGroupBidModifiersResponse>
      mutateAdGroupBidModifiersCallable;

  private final BackgroundResource backgroundResources;
  private final GrpcOperationsStub operationsStub;
  private final GrpcStubCallableFactory callableFactory;

  public static final GrpcAdGroupBidModifierServiceStub create(
      AdGroupBidModifierServiceStubSettings settings) throws IOException {
    return new GrpcAdGroupBidModifierServiceStub(settings, ClientContext.create(settings));
  }

  public static final GrpcAdGroupBidModifierServiceStub create(ClientContext clientContext)
      throws IOException {
    return new GrpcAdGroupBidModifierServiceStub(
        AdGroupBidModifierServiceStubSettings.newBuilder().build(), clientContext);
  }

  public static final GrpcAdGroupBidModifierServiceStub create(
      ClientContext clientContext, GrpcStubCallableFactory callableFactory) throws IOException {
    return new GrpcAdGroupBidModifierServiceStub(
        AdGroupBidModifierServiceStubSettings.newBuilder().build(), clientContext, callableFactory);
  }

  protected GrpcAdGroupBidModifierServiceStub(
      AdGroupBidModifierServiceStubSettings settings, ClientContext clientContext)
      throws IOException {
    this(settings, clientContext, new GrpcAdGroupBidModifierServiceCallableFactory());
  }

  protected GrpcAdGroupBidModifierServiceStub(
      AdGroupBidModifierServiceStubSettings settings,
      ClientContext clientContext,
      GrpcStubCallableFactory callableFactory)
      throws IOException {
    this.callableFactory = callableFactory;
    this.operationsStub = GrpcOperationsStub.create(clientContext, callableFactory);

    GrpcCallSettings<GetAdGroupBidModifierRequest, AdGroupBidModifier>
        getAdGroupBidModifierTransportSettings =
            GrpcCallSettings.<GetAdGroupBidModifierRequest, AdGroupBidModifier>newBuilder()
                .setMethodDescriptor(getAdGroupBidModifierMethodDescriptor)
                .setParamsExtractor(
                    new RequestParamsExtractor<GetAdGroupBidModifierRequest>() {
                      @Override
                      public Map<String, String> extract(GetAdGroupBidModifierRequest request) {
                        ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                        params.put("resource_name", String.valueOf(request.getResourceName()));
                        return params.build();
                      }
                    })
                .build();
    GrpcCallSettings<MutateAdGroupBidModifiersRequest, MutateAdGroupBidModifiersResponse>
        mutateAdGroupBidModifiersTransportSettings =
            GrpcCallSettings
                .<MutateAdGroupBidModifiersRequest, MutateAdGroupBidModifiersResponse>newBuilder()
                .setMethodDescriptor(mutateAdGroupBidModifiersMethodDescriptor)
                .setParamsExtractor(
                    new RequestParamsExtractor<MutateAdGroupBidModifiersRequest>() {
                      @Override
                      public Map<String, String> extract(MutateAdGroupBidModifiersRequest request) {
                        ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                        params.put("customer_id", String.valueOf(request.getCustomerId()));
                        return params.build();
                      }
                    })
                .build();

    this.getAdGroupBidModifierCallable =
        callableFactory.createUnaryCallable(
            getAdGroupBidModifierTransportSettings,
            settings.getAdGroupBidModifierSettings(),
            clientContext);
    this.mutateAdGroupBidModifiersCallable =
        callableFactory.createUnaryCallable(
            mutateAdGroupBidModifiersTransportSettings,
            settings.mutateAdGroupBidModifiersSettings(),
            clientContext);

    this.backgroundResources =
        new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  public GrpcOperationsStub getOperationsStub() {
    return operationsStub;
  }

  public UnaryCallable<GetAdGroupBidModifierRequest, AdGroupBidModifier>
      getAdGroupBidModifierCallable() {
    return getAdGroupBidModifierCallable;
  }

  public UnaryCallable<MutateAdGroupBidModifiersRequest, MutateAdGroupBidModifiersResponse>
      mutateAdGroupBidModifiersCallable() {
    return mutateAdGroupBidModifiersCallable;
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
