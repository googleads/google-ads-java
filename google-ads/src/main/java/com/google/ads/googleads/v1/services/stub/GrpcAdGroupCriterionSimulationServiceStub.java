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

import com.google.ads.googleads.v1.resources.AdGroupCriterionSimulation;
import com.google.ads.googleads.v1.services.GetAdGroupCriterionSimulationRequest;
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
public class GrpcAdGroupCriterionSimulationServiceStub
    extends AdGroupCriterionSimulationServiceStub {

  private static final MethodDescriptor<
          GetAdGroupCriterionSimulationRequest, AdGroupCriterionSimulation>
      getAdGroupCriterionSimulationMethodDescriptor =
          MethodDescriptor
              .<GetAdGroupCriterionSimulationRequest, AdGroupCriterionSimulation>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.ads.googleads.v1.services.AdGroupCriterionSimulationService/GetAdGroupCriterionSimulation")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(GetAdGroupCriterionSimulationRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(AdGroupCriterionSimulation.getDefaultInstance()))
              .build();

  private final BackgroundResource backgroundResources;

  private final UnaryCallable<GetAdGroupCriterionSimulationRequest, AdGroupCriterionSimulation>
      getAdGroupCriterionSimulationCallable;

  private final GrpcStubCallableFactory callableFactory;

  public static final GrpcAdGroupCriterionSimulationServiceStub create(
      AdGroupCriterionSimulationServiceStubSettings settings) throws IOException {
    return new GrpcAdGroupCriterionSimulationServiceStub(settings, ClientContext.create(settings));
  }

  public static final GrpcAdGroupCriterionSimulationServiceStub create(ClientContext clientContext)
      throws IOException {
    return new GrpcAdGroupCriterionSimulationServiceStub(
        AdGroupCriterionSimulationServiceStubSettings.newBuilder().build(), clientContext);
  }

  public static final GrpcAdGroupCriterionSimulationServiceStub create(
      ClientContext clientContext, GrpcStubCallableFactory callableFactory) throws IOException {
    return new GrpcAdGroupCriterionSimulationServiceStub(
        AdGroupCriterionSimulationServiceStubSettings.newBuilder().build(),
        clientContext,
        callableFactory);
  }

  /**
   * Constructs an instance of GrpcAdGroupCriterionSimulationServiceStub, using the given settings.
   * This is protected so that it is easy to make a subclass, but otherwise, the static factory
   * methods should be preferred.
   */
  protected GrpcAdGroupCriterionSimulationServiceStub(
      AdGroupCriterionSimulationServiceStubSettings settings, ClientContext clientContext)
      throws IOException {
    this(settings, clientContext, new GrpcAdGroupCriterionSimulationServiceCallableFactory());
  }

  /**
   * Constructs an instance of GrpcAdGroupCriterionSimulationServiceStub, using the given settings.
   * This is protected so that it is easy to make a subclass, but otherwise, the static factory
   * methods should be preferred.
   */
  protected GrpcAdGroupCriterionSimulationServiceStub(
      AdGroupCriterionSimulationServiceStubSettings settings,
      ClientContext clientContext,
      GrpcStubCallableFactory callableFactory)
      throws IOException {
    this.callableFactory = callableFactory;

    GrpcCallSettings<GetAdGroupCriterionSimulationRequest, AdGroupCriterionSimulation>
        getAdGroupCriterionSimulationTransportSettings =
            GrpcCallSettings
                .<GetAdGroupCriterionSimulationRequest, AdGroupCriterionSimulation>newBuilder()
                .setMethodDescriptor(getAdGroupCriterionSimulationMethodDescriptor)
                .build();

    this.getAdGroupCriterionSimulationCallable =
        callableFactory.createUnaryCallable(
            getAdGroupCriterionSimulationTransportSettings,
            settings.getAdGroupCriterionSimulationSettings(),
            clientContext);

    backgroundResources = new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  public UnaryCallable<GetAdGroupCriterionSimulationRequest, AdGroupCriterionSimulation>
      getAdGroupCriterionSimulationCallable() {
    return getAdGroupCriterionSimulationCallable;
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
