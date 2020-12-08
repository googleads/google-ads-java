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

import com.google.ads.googleads.v6.resources.Label;
import com.google.ads.googleads.v6.services.GetLabelRequest;
import com.google.ads.googleads.v6.services.MutateLabelsRequest;
import com.google.ads.googleads.v6.services.MutateLabelsResponse;
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
 * gRPC stub implementation for the LabelService service API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by gapic-generator-java")
public class GrpcLabelServiceStub extends LabelServiceStub {
  private static final MethodDescriptor<GetLabelRequest, Label> getLabelMethodDescriptor =
      MethodDescriptor.<GetLabelRequest, Label>newBuilder()
          .setType(MethodDescriptor.MethodType.UNARY)
          .setFullMethodName("google.ads.googleads.v6.services.LabelService/GetLabel")
          .setRequestMarshaller(ProtoUtils.marshaller(GetLabelRequest.getDefaultInstance()))
          .setResponseMarshaller(ProtoUtils.marshaller(Label.getDefaultInstance()))
          .build();

  private static final MethodDescriptor<MutateLabelsRequest, MutateLabelsResponse>
      mutateLabelsMethodDescriptor =
          MethodDescriptor.<MutateLabelsRequest, MutateLabelsResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName("google.ads.googleads.v6.services.LabelService/MutateLabels")
              .setRequestMarshaller(ProtoUtils.marshaller(MutateLabelsRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(MutateLabelsResponse.getDefaultInstance()))
              .build();

  private final UnaryCallable<GetLabelRequest, Label> getLabelCallable;
  private final UnaryCallable<MutateLabelsRequest, MutateLabelsResponse> mutateLabelsCallable;

  private final BackgroundResource backgroundResources;
  private final GrpcOperationsStub operationsStub;
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

  protected GrpcLabelServiceStub(LabelServiceStubSettings settings, ClientContext clientContext)
      throws IOException {
    this(settings, clientContext, new GrpcLabelServiceCallableFactory());
  }

  protected GrpcLabelServiceStub(
      LabelServiceStubSettings settings,
      ClientContext clientContext,
      GrpcStubCallableFactory callableFactory)
      throws IOException {
    this.callableFactory = callableFactory;
    this.operationsStub = GrpcOperationsStub.create(clientContext, callableFactory);

    GrpcCallSettings<GetLabelRequest, Label> getLabelTransportSettings =
        GrpcCallSettings.<GetLabelRequest, Label>newBuilder()
            .setMethodDescriptor(getLabelMethodDescriptor)
            .setParamsExtractor(
                new RequestParamsExtractor<GetLabelRequest>() {
                  @Override
                  public Map<String, String> extract(GetLabelRequest request) {
                    ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                    params.put("resource_name", String.valueOf(request.getResourceName()));
                    return params.build();
                  }
                })
            .build();
    GrpcCallSettings<MutateLabelsRequest, MutateLabelsResponse> mutateLabelsTransportSettings =
        GrpcCallSettings.<MutateLabelsRequest, MutateLabelsResponse>newBuilder()
            .setMethodDescriptor(mutateLabelsMethodDescriptor)
            .setParamsExtractor(
                new RequestParamsExtractor<MutateLabelsRequest>() {
                  @Override
                  public Map<String, String> extract(MutateLabelsRequest request) {
                    ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                    params.put("customer_id", String.valueOf(request.getCustomerId()));
                    return params.build();
                  }
                })
            .build();

    this.getLabelCallable =
        callableFactory.createUnaryCallable(
            getLabelTransportSettings, settings.getLabelSettings(), clientContext);
    this.mutateLabelsCallable =
        callableFactory.createUnaryCallable(
            mutateLabelsTransportSettings, settings.mutateLabelsSettings(), clientContext);

    this.backgroundResources =
        new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  public GrpcOperationsStub getOperationsStub() {
    return operationsStub;
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
