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

package com.google.ads.googleads.v9.services.stub;

import com.google.ads.googleads.v9.resources.BiddingSeasonalityAdjustment;
import com.google.ads.googleads.v9.services.GetBiddingSeasonalityAdjustmentRequest;
import com.google.ads.googleads.v9.services.MutateBiddingSeasonalityAdjustmentsRequest;
import com.google.ads.googleads.v9.services.MutateBiddingSeasonalityAdjustmentsResponse;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.core.BackgroundResourceAggregation;
import com.google.api.gax.grpc.GrpcCallSettings;
import com.google.api.gax.grpc.GrpcStubCallableFactory;
import com.google.api.gax.rpc.ClientContext;
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
 * gRPC stub implementation for the BiddingSeasonalityAdjustmentService service API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by gapic-generator-java")
public class GrpcBiddingSeasonalityAdjustmentServiceStub
    extends BiddingSeasonalityAdjustmentServiceStub {
  private static final MethodDescriptor<
          GetBiddingSeasonalityAdjustmentRequest, BiddingSeasonalityAdjustment>
      getBiddingSeasonalityAdjustmentMethodDescriptor =
          MethodDescriptor
              .<GetBiddingSeasonalityAdjustmentRequest, BiddingSeasonalityAdjustment>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.ads.googleads.v9.services.BiddingSeasonalityAdjustmentService/GetBiddingSeasonalityAdjustment")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(
                      GetBiddingSeasonalityAdjustmentRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(BiddingSeasonalityAdjustment.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<
          MutateBiddingSeasonalityAdjustmentsRequest, MutateBiddingSeasonalityAdjustmentsResponse>
      mutateBiddingSeasonalityAdjustmentsMethodDescriptor =
          MethodDescriptor
              .<MutateBiddingSeasonalityAdjustmentsRequest,
                  MutateBiddingSeasonalityAdjustmentsResponse>
                  newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.ads.googleads.v9.services.BiddingSeasonalityAdjustmentService/MutateBiddingSeasonalityAdjustments")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(
                      MutateBiddingSeasonalityAdjustmentsRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(
                      MutateBiddingSeasonalityAdjustmentsResponse.getDefaultInstance()))
              .build();

  private final UnaryCallable<GetBiddingSeasonalityAdjustmentRequest, BiddingSeasonalityAdjustment>
      getBiddingSeasonalityAdjustmentCallable;
  private final UnaryCallable<
          MutateBiddingSeasonalityAdjustmentsRequest, MutateBiddingSeasonalityAdjustmentsResponse>
      mutateBiddingSeasonalityAdjustmentsCallable;

  private final BackgroundResource backgroundResources;
  private final GrpcOperationsStub operationsStub;
  private final GrpcStubCallableFactory callableFactory;

  public static final GrpcBiddingSeasonalityAdjustmentServiceStub create(
      BiddingSeasonalityAdjustmentServiceStubSettings settings) throws IOException {
    return new GrpcBiddingSeasonalityAdjustmentServiceStub(
        settings, ClientContext.create(settings));
  }

  public static final GrpcBiddingSeasonalityAdjustmentServiceStub create(
      ClientContext clientContext) throws IOException {
    return new GrpcBiddingSeasonalityAdjustmentServiceStub(
        BiddingSeasonalityAdjustmentServiceStubSettings.newBuilder().build(), clientContext);
  }

  public static final GrpcBiddingSeasonalityAdjustmentServiceStub create(
      ClientContext clientContext, GrpcStubCallableFactory callableFactory) throws IOException {
    return new GrpcBiddingSeasonalityAdjustmentServiceStub(
        BiddingSeasonalityAdjustmentServiceStubSettings.newBuilder().build(),
        clientContext,
        callableFactory);
  }

  /**
   * Constructs an instance of GrpcBiddingSeasonalityAdjustmentServiceStub, using the given
   * settings. This is protected so that it is easy to make a subclass, but otherwise, the static
   * factory methods should be preferred.
   */
  protected GrpcBiddingSeasonalityAdjustmentServiceStub(
      BiddingSeasonalityAdjustmentServiceStubSettings settings, ClientContext clientContext)
      throws IOException {
    this(settings, clientContext, new GrpcBiddingSeasonalityAdjustmentServiceCallableFactory());
  }

  /**
   * Constructs an instance of GrpcBiddingSeasonalityAdjustmentServiceStub, using the given
   * settings. This is protected so that it is easy to make a subclass, but otherwise, the static
   * factory methods should be preferred.
   */
  protected GrpcBiddingSeasonalityAdjustmentServiceStub(
      BiddingSeasonalityAdjustmentServiceStubSettings settings,
      ClientContext clientContext,
      GrpcStubCallableFactory callableFactory)
      throws IOException {
    this.callableFactory = callableFactory;
    this.operationsStub = GrpcOperationsStub.create(clientContext, callableFactory);

    GrpcCallSettings<GetBiddingSeasonalityAdjustmentRequest, BiddingSeasonalityAdjustment>
        getBiddingSeasonalityAdjustmentTransportSettings =
            GrpcCallSettings
                .<GetBiddingSeasonalityAdjustmentRequest, BiddingSeasonalityAdjustment>newBuilder()
                .setMethodDescriptor(getBiddingSeasonalityAdjustmentMethodDescriptor)
                .setParamsExtractor(
                    request -> {
                      ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                      params.put("resource_name", String.valueOf(request.getResourceName()));
                      return params.build();
                    })
                .build();
    GrpcCallSettings<
            MutateBiddingSeasonalityAdjustmentsRequest, MutateBiddingSeasonalityAdjustmentsResponse>
        mutateBiddingSeasonalityAdjustmentsTransportSettings =
            GrpcCallSettings
                .<MutateBiddingSeasonalityAdjustmentsRequest,
                    MutateBiddingSeasonalityAdjustmentsResponse>
                    newBuilder()
                .setMethodDescriptor(mutateBiddingSeasonalityAdjustmentsMethodDescriptor)
                .setParamsExtractor(
                    request -> {
                      ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                      params.put("customer_id", String.valueOf(request.getCustomerId()));
                      return params.build();
                    })
                .build();

    this.getBiddingSeasonalityAdjustmentCallable =
        callableFactory.createUnaryCallable(
            getBiddingSeasonalityAdjustmentTransportSettings,
            settings.getBiddingSeasonalityAdjustmentSettings(),
            clientContext);
    this.mutateBiddingSeasonalityAdjustmentsCallable =
        callableFactory.createUnaryCallable(
            mutateBiddingSeasonalityAdjustmentsTransportSettings,
            settings.mutateBiddingSeasonalityAdjustmentsSettings(),
            clientContext);

    this.backgroundResources =
        new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  public GrpcOperationsStub getOperationsStub() {
    return operationsStub;
  }

  @Override
  public UnaryCallable<GetBiddingSeasonalityAdjustmentRequest, BiddingSeasonalityAdjustment>
      getBiddingSeasonalityAdjustmentCallable() {
    return getBiddingSeasonalityAdjustmentCallable;
  }

  @Override
  public UnaryCallable<
          MutateBiddingSeasonalityAdjustmentsRequest, MutateBiddingSeasonalityAdjustmentsResponse>
      mutateBiddingSeasonalityAdjustmentsCallable() {
    return mutateBiddingSeasonalityAdjustmentsCallable;
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
