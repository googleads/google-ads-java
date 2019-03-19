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

import com.google.ads.googleads.v1.resources.Label;
import com.google.ads.googleads.v1.services.GetLabelRequest;
import com.google.ads.googleads.v1.services.MutateLabelsRequest;
import com.google.ads.googleads.v1.services.MutateLabelsResponse;
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
public class GrpcLabelServiceStub extends LabelServiceStub {

  private static final MethodDescriptor<GetLabelRequest, Label> getLabelMethodDescriptor =
      MethodDescriptor.<GetLabelRequest, Label>newBuilder()
          .setType(MethodDescriptor.MethodType.UNARY)
          .setFullMethodName("google.ads.googleads.v1.services.LabelService/GetLabel")
          .setRequestMarshaller(ProtoUtils.marshaller(GetLabelRequest.getDefaultInstance()))
          .setResponseMarshaller(ProtoUtils.marshaller(Label.getDefaultInstance()))
          .build();
  private static final MethodDescriptor<MutateLabelsRequest, MutateLabelsResponse>
      mutateLabelsMethodDescriptor =
          MethodDescriptor.<MutateLabelsRequest, MutateLabelsResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName("google.ads.googleads.v1.services.LabelService/MutateLabels")
              .setRequestMarshaller(ProtoUtils.marshaller(MutateLabelsRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(MutateLabelsResponse.getDefaultInstance()))
              .build();

  private final BackgroundResource backgroundResources;

  private final UnaryCallable<GetLabelRequest, Label> getLabelCallable;
  private final UnaryCallable<MutateLabelsRequest, MutateLabelsResponse> mutateLabelsCallable;

  private final GrpcStubCallableFactory callableFactory;

  public static final GrpcLabelServiceStub create(LabelServiceStubSettings settings)
      throws IOException {
    return new GrpcLabelServiceStub(settings, ClientContext.create(settings));
  }

  public static final GrpcLabelServiceStub create(ClientContext clientContext) throws IOException {
    return new GrpcLabelServiceStub(LabelServiceStubSettings.newBuilder().build(), clientContext);
  }

  public static final GrpcLabelServiceStub create(
      ClientContext clientContext, GrpcStubCallableFactory callableFactory) throws IOException {
    return new GrpcLabelServiceStub(
        LabelServiceStubSettings.newBuilder().build(), clientContext, callableFactory);
  }

  /**
   * Constructs an instance of GrpcLabelServiceStub, using the given settings. This is protected so
   * that it is easy to make a subclass, but otherwise, the static factory methods should be
   * preferred.
   */
  protected GrpcLabelServiceStub(LabelServiceStubSettings settings, ClientContext clientContext)
      throws IOException {
    this(settings, clientContext, new GrpcLabelServiceCallableFactory());
  }

  /**
   * Constructs an instance of GrpcLabelServiceStub, using the given settings. This is protected so
   * that it is easy to make a subclass, but otherwise, the static factory methods should be
   * preferred.
   */
  protected GrpcLabelServiceStub(
      LabelServiceStubSettings settings,
      ClientContext clientContext,
      GrpcStubCallableFactory callableFactory)
      throws IOException {
    this.callableFactory = callableFactory;

    GrpcCallSettings<GetLabelRequest, Label> getLabelTransportSettings =
        GrpcCallSettings.<GetLabelRequest, Label>newBuilder()
            .setMethodDescriptor(getLabelMethodDescriptor)
            .build();
    GrpcCallSettings<MutateLabelsRequest, MutateLabelsResponse> mutateLabelsTransportSettings =
        GrpcCallSettings.<MutateLabelsRequest, MutateLabelsResponse>newBuilder()
            .setMethodDescriptor(mutateLabelsMethodDescriptor)
            .build();

    this.getLabelCallable =
        callableFactory.createUnaryCallable(
            getLabelTransportSettings, settings.getLabelSettings(), clientContext);
    this.mutateLabelsCallable =
        callableFactory.createUnaryCallable(
            mutateLabelsTransportSettings, settings.mutateLabelsSettings(), clientContext);

    backgroundResources = new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  public UnaryCallable<GetLabelRequest, Label> getLabelCallable() {
    return getLabelCallable;
  }

  public UnaryCallable<MutateLabelsRequest, MutateLabelsResponse> mutateLabelsCallable() {
    return mutateLabelsCallable;
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
