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

import com.google.ads.googleads.v6.resources.Recommendation;
import com.google.ads.googleads.v6.services.ApplyRecommendationRequest;
import com.google.ads.googleads.v6.services.ApplyRecommendationResponse;
import com.google.ads.googleads.v6.services.DismissRecommendationRequest;
import com.google.ads.googleads.v6.services.DismissRecommendationResponse;
import com.google.ads.googleads.v6.services.GetRecommendationRequest;
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
 * gRPC stub implementation for the RecommendationService service API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by gapic-generator-java")
public class GrpcRecommendationServiceStub extends RecommendationServiceStub {
  private static final MethodDescriptor<GetRecommendationRequest, Recommendation>
      getRecommendationMethodDescriptor =
          MethodDescriptor.<GetRecommendationRequest, Recommendation>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.ads.googleads.v6.services.RecommendationService/GetRecommendation")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(GetRecommendationRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(Recommendation.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<ApplyRecommendationRequest, ApplyRecommendationResponse>
      applyRecommendationMethodDescriptor =
          MethodDescriptor.<ApplyRecommendationRequest, ApplyRecommendationResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.ads.googleads.v6.services.RecommendationService/ApplyRecommendation")
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
                  "google.ads.googleads.v6.services.RecommendationService/DismissRecommendation")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(DismissRecommendationRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(DismissRecommendationResponse.getDefaultInstance()))
              .build();

  private final UnaryCallable<GetRecommendationRequest, Recommendation> getRecommendationCallable;
  private final UnaryCallable<ApplyRecommendationRequest, ApplyRecommendationResponse>
      applyRecommendationCallable;
  private final UnaryCallable<DismissRecommendationRequest, DismissRecommendationResponse>
      dismissRecommendationCallable;

  private final BackgroundResource backgroundResources;
  private final GrpcOperationsStub operationsStub;
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

  protected GrpcRecommendationServiceStub(
      RecommendationServiceStubSettings settings, ClientContext clientContext) throws IOException {
    this(settings, clientContext, new GrpcRecommendationServiceCallableFactory());
  }

  protected GrpcRecommendationServiceStub(
      RecommendationServiceStubSettings settings,
      ClientContext clientContext,
      GrpcStubCallableFactory callableFactory)
      throws IOException {
    this.callableFactory = callableFactory;
    this.operationsStub = GrpcOperationsStub.create(clientContext, callableFactory);

    GrpcCallSettings<GetRecommendationRequest, Recommendation> getRecommendationTransportSettings =
        GrpcCallSettings.<GetRecommendationRequest, Recommendation>newBuilder()
            .setMethodDescriptor(getRecommendationMethodDescriptor)
            .setParamsExtractor(
                new RequestParamsExtractor<GetRecommendationRequest>() {
                  @Override
                  public Map<String, String> extract(GetRecommendationRequest request) {
                    ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                    params.put("resource_name", String.valueOf(request.getResourceName()));
                    return params.build();
                  }
                })
            .build();
    GrpcCallSettings<ApplyRecommendationRequest, ApplyRecommendationResponse>
        applyRecommendationTransportSettings =
            GrpcCallSettings.<ApplyRecommendationRequest, ApplyRecommendationResponse>newBuilder()
                .setMethodDescriptor(applyRecommendationMethodDescriptor)
                .setParamsExtractor(
                    new RequestParamsExtractor<ApplyRecommendationRequest>() {
                      @Override
                      public Map<String, String> extract(ApplyRecommendationRequest request) {
                        ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                        params.put("customer_id", String.valueOf(request.getCustomerId()));
                        return params.build();
                      }
                    })
                .build();
    GrpcCallSettings<DismissRecommendationRequest, DismissRecommendationResponse>
        dismissRecommendationTransportSettings =
            GrpcCallSettings
                .<DismissRecommendationRequest, DismissRecommendationResponse>newBuilder()
                .setMethodDescriptor(dismissRecommendationMethodDescriptor)
                .setParamsExtractor(
                    new RequestParamsExtractor<DismissRecommendationRequest>() {
                      @Override
                      public Map<String, String> extract(DismissRecommendationRequest request) {
                        ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                        params.put("customer_id", String.valueOf(request.getCustomerId()));
                        return params.build();
                      }
                    })
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

    this.backgroundResources =
        new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  public GrpcOperationsStub getOperationsStub() {
    return operationsStub;
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
