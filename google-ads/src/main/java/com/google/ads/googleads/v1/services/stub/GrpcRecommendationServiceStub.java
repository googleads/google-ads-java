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

import com.google.ads.googleads.v1.resources.Recommendation;
import com.google.ads.googleads.v1.services.ApplyRecommendationRequest;
import com.google.ads.googleads.v1.services.ApplyRecommendationResponse;
import com.google.ads.googleads.v1.services.DismissRecommendationRequest;
import com.google.ads.googleads.v1.services.DismissRecommendationResponse;
import com.google.ads.googleads.v1.services.GetRecommendationRequest;
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
public class GrpcRecommendationServiceStub extends RecommendationServiceStub {

  private static final MethodDescriptor<GetRecommendationRequest, Recommendation>
      getRecommendationMethodDescriptor =
          MethodDescriptor.<GetRecommendationRequest, Recommendation>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.ads.googleads.v1.services.RecommendationService/GetRecommendation")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(GetRecommendationRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(Recommendation.getDefaultInstance()))
              .build();
  private static final MethodDescriptor<ApplyRecommendationRequest, ApplyRecommendationResponse>
      applyRecommendationMethodDescriptor =
          MethodDescriptor.<ApplyRecommendationRequest, ApplyRecommendationResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.ads.googleads.v1.services.RecommendationService/ApplyRecommendation")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(ApplyRecommendationRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(ApplyRecommendationResponse.getDefaultInstance()))
              .build();
  private static final MethodDescriptor<DismissRecommendationRequest, DismissRecommendationResponse>
      dismissRecommendationMethodDescriptor =
          MethodDescriptor.<DismissRecommendationRequest, DismissRecommendationResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.ads.googleads.v1.services.RecommendationService/DismissRecommendation")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(DismissRecommendationRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(DismissRecommendationResponse.getDefaultInstance()))
              .build();

  private final BackgroundResource backgroundResources;

  private final UnaryCallable<GetRecommendationRequest, Recommendation> getRecommendationCallable;
  private final UnaryCallable<ApplyRecommendationRequest, ApplyRecommendationResponse>
      applyRecommendationCallable;
  private final UnaryCallable<DismissRecommendationRequest, DismissRecommendationResponse>
      dismissRecommendationCallable;

  private final GrpcStubCallableFactory callableFactory;

  public static final GrpcRecommendationServiceStub create(
      RecommendationServiceStubSettings settings) throws IOException {
    return new GrpcRecommendationServiceStub(settings, ClientContext.create(settings));
  }

  public static final GrpcRecommendationServiceStub create(ClientContext clientContext)
      throws IOException {
    return new GrpcRecommendationServiceStub(
        RecommendationServiceStubSettings.newBuilder().build(), clientContext);
  }

  public static final GrpcRecommendationServiceStub create(
      ClientContext clientContext, GrpcStubCallableFactory callableFactory) throws IOException {
    return new GrpcRecommendationServiceStub(
        RecommendationServiceStubSettings.newBuilder().build(), clientContext, callableFactory);
  }

  /**
   * Constructs an instance of GrpcRecommendationServiceStub, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected GrpcRecommendationServiceStub(
      RecommendationServiceStubSettings settings, ClientContext clientContext) throws IOException {
    this(settings, clientContext, new GrpcRecommendationServiceCallableFactory());
  }

  /**
   * Constructs an instance of GrpcRecommendationServiceStub, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected GrpcRecommendationServiceStub(
      RecommendationServiceStubSettings settings,
      ClientContext clientContext,
      GrpcStubCallableFactory callableFactory)
      throws IOException {
    this.callableFactory = callableFactory;

    GrpcCallSettings<GetRecommendationRequest, Recommendation> getRecommendationTransportSettings =
        GrpcCallSettings.<GetRecommendationRequest, Recommendation>newBuilder()
            .setMethodDescriptor(getRecommendationMethodDescriptor)
            .build();
    GrpcCallSettings<ApplyRecommendationRequest, ApplyRecommendationResponse>
        applyRecommendationTransportSettings =
            GrpcCallSettings.<ApplyRecommendationRequest, ApplyRecommendationResponse>newBuilder()
                .setMethodDescriptor(applyRecommendationMethodDescriptor)
                .build();
    GrpcCallSettings<DismissRecommendationRequest, DismissRecommendationResponse>
        dismissRecommendationTransportSettings =
            GrpcCallSettings
                .<DismissRecommendationRequest, DismissRecommendationResponse>newBuilder()
                .setMethodDescriptor(dismissRecommendationMethodDescriptor)
                .build();

    this.getRecommendationCallable =
        callableFactory.createUnaryCallable(
            getRecommendationTransportSettings,
            settings.getRecommendationSettings(),
            clientContext);
    this.applyRecommendationCallable =
        callableFactory.createUnaryCallable(
            applyRecommendationTransportSettings,
            settings.applyRecommendationSettings(),
            clientContext);
    this.dismissRecommendationCallable =
        callableFactory.createUnaryCallable(
            dismissRecommendationTransportSettings,
            settings.dismissRecommendationSettings(),
            clientContext);

    backgroundResources = new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  public UnaryCallable<GetRecommendationRequest, Recommendation> getRecommendationCallable() {
    return getRecommendationCallable;
  }

  public UnaryCallable<ApplyRecommendationRequest, ApplyRecommendationResponse>
      applyRecommendationCallable() {
    return applyRecommendationCallable;
  }

  public UnaryCallable<DismissRecommendationRequest, DismissRecommendationResponse>
      dismissRecommendationCallable() {
    return dismissRecommendationCallable;
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
