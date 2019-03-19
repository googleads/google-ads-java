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

import com.google.ads.googleads.v1.resources.AdGroupCriterionLabel;
import com.google.ads.googleads.v1.services.GetAdGroupCriterionLabelRequest;
import com.google.ads.googleads.v1.services.MutateAdGroupCriterionLabelsRequest;
import com.google.ads.googleads.v1.services.MutateAdGroupCriterionLabelsResponse;
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
public class GrpcAdGroupCriterionLabelServiceStub extends AdGroupCriterionLabelServiceStub {

  private static final MethodDescriptor<GetAdGroupCriterionLabelRequest, AdGroupCriterionLabel>
      getAdGroupCriterionLabelMethodDescriptor =
          MethodDescriptor.<GetAdGroupCriterionLabelRequest, AdGroupCriterionLabel>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.ads.googleads.v1.services.AdGroupCriterionLabelService/GetAdGroupCriterionLabel")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(GetAdGroupCriterionLabelRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(AdGroupCriterionLabel.getDefaultInstance()))
              .build();
  private static final MethodDescriptor<
          MutateAdGroupCriterionLabelsRequest, MutateAdGroupCriterionLabelsResponse>
      mutateAdGroupCriterionLabelsMethodDescriptor =
          MethodDescriptor
              .<MutateAdGroupCriterionLabelsRequest, MutateAdGroupCriterionLabelsResponse>
                  newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.ads.googleads.v1.services.AdGroupCriterionLabelService/MutateAdGroupCriterionLabels")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(MutateAdGroupCriterionLabelsRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(MutateAdGroupCriterionLabelsResponse.getDefaultInstance()))
              .build();

  private final BackgroundResource backgroundResources;

  private final UnaryCallable<GetAdGroupCriterionLabelRequest, AdGroupCriterionLabel>
      getAdGroupCriterionLabelCallable;
  private final UnaryCallable<
          MutateAdGroupCriterionLabelsRequest, MutateAdGroupCriterionLabelsResponse>
      mutateAdGroupCriterionLabelsCallable;

  private final GrpcStubCallableFactory callableFactory;

  public static final GrpcAdGroupCriterionLabelServiceStub create(
      AdGroupCriterionLabelServiceStubSettings settings) throws IOException {
    return new GrpcAdGroupCriterionLabelServiceStub(settings, ClientContext.create(settings));
  }

  public static final GrpcAdGroupCriterionLabelServiceStub create(ClientContext clientContext)
      throws IOException {
    return new GrpcAdGroupCriterionLabelServiceStub(
        AdGroupCriterionLabelServiceStubSettings.newBuilder().build(), clientContext);
  }

  public static final GrpcAdGroupCriterionLabelServiceStub create(
      ClientContext clientContext, GrpcStubCallableFactory callableFactory) throws IOException {
    return new GrpcAdGroupCriterionLabelServiceStub(
        AdGroupCriterionLabelServiceStubSettings.newBuilder().build(),
        clientContext,
        callableFactory);
  }

  /**
   * Constructs an instance of GrpcAdGroupCriterionLabelServiceStub, using the given settings. This
   * is protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected GrpcAdGroupCriterionLabelServiceStub(
      AdGroupCriterionLabelServiceStubSettings settings, ClientContext clientContext)
      throws IOException {
    this(settings, clientContext, new GrpcAdGroupCriterionLabelServiceCallableFactory());
  }

  /**
   * Constructs an instance of GrpcAdGroupCriterionLabelServiceStub, using the given settings. This
   * is protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected GrpcAdGroupCriterionLabelServiceStub(
      AdGroupCriterionLabelServiceStubSettings settings,
      ClientContext clientContext,
      GrpcStubCallableFactory callableFactory)
      throws IOException {
    this.callableFactory = callableFactory;

    GrpcCallSettings<GetAdGroupCriterionLabelRequest, AdGroupCriterionLabel>
        getAdGroupCriterionLabelTransportSettings =
            GrpcCallSettings.<GetAdGroupCriterionLabelRequest, AdGroupCriterionLabel>newBuilder()
                .setMethodDescriptor(getAdGroupCriterionLabelMethodDescriptor)
                .build();
    GrpcCallSettings<MutateAdGroupCriterionLabelsRequest, MutateAdGroupCriterionLabelsResponse>
        mutateAdGroupCriterionLabelsTransportSettings =
            GrpcCallSettings
                .<MutateAdGroupCriterionLabelsRequest, MutateAdGroupCriterionLabelsResponse>
                    newBuilder()
                .setMethodDescriptor(mutateAdGroupCriterionLabelsMethodDescriptor)
                .build();

    this.getAdGroupCriterionLabelCallable =
        callableFactory.createUnaryCallable(
            getAdGroupCriterionLabelTransportSettings,
            settings.getAdGroupCriterionLabelSettings(),
            clientContext);
    this.mutateAdGroupCriterionLabelsCallable =
        callableFactory.createUnaryCallable(
            mutateAdGroupCriterionLabelsTransportSettings,
            settings.mutateAdGroupCriterionLabelsSettings(),
            clientContext);

    backgroundResources = new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  public UnaryCallable<GetAdGroupCriterionLabelRequest, AdGroupCriterionLabel>
      getAdGroupCriterionLabelCallable() {
    return getAdGroupCriterionLabelCallable;
  }

  public UnaryCallable<MutateAdGroupCriterionLabelsRequest, MutateAdGroupCriterionLabelsResponse>
      mutateAdGroupCriterionLabelsCallable() {
    return mutateAdGroupCriterionLabelsCallable;
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
