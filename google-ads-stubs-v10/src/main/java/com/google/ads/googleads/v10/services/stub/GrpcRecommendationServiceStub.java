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

package com.google.ads.googleads.v10.services.stub;

import com.google.ads.googleads.v10.services.ApplyRecommendationRequest;
import com.google.ads.googleads.v10.services.ApplyRecommendationResponse;
import com.google.ads.googleads.v10.services.DismissRecommendationRequest;
import com.google.ads.googleads.v10.services.DismissRecommendationResponse;
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
 * gRPC stub implementation for the RecommendationService service API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by gapic-generator-java")
public class GrpcRecommendationServiceStub extends RecommendationServiceStub {
  private static final MethodDescriptor<ApplyRecommendationRequest, ApplyRecommendationResponse>
      applyRecommendationMethodDescriptor =
          MethodDescriptor.<ApplyRecommendationRequest, ApplyRecommendationResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.ads.googleads.v10.services.RecommendationService/ApplyRecommendation")
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
                  "google.ads.googleads.v10.services.RecommendationService/DismissRecommendation")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(DismissRecommendationRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(DismissRecommendationResponse.getDefaultInstance()))
              .build();

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
    this.operationsStub = GrpcOperationsStub.create(clientContext, callableFactory);

    GrpcCallSettings<ApplyRecommendationRequest, ApplyRecommendationResponse>
        applyRecommendationTransportSettings =
            GrpcCallSettings.<ApplyRecommendationRequest, ApplyRecommendationResponse>newBuilder()
                .setMethodDescriptor(applyRecommendationMethodDescriptor)
                .setParamsExtractor(
                    request -> {
                      ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                      params.put("customer_id", String.valueOf(request.getCustomerId()));
                      return params.build();
                    })
                .build();
    GrpcCallSettings<DismissRecommendationRequest, DismissRecommendationResponse>
        dismissRecommendationTransportSettings =
            GrpcCallSettings
                .<DismissRecommendationRequest, DismissRecommendationResponse>newBuilder()
                .setMethodDescriptor(dismissRecommendationMethodDescriptor)
                .setParamsExtractor(
                    request -> {
                      ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                      params.put("customer_id", String.valueOf(request.getCustomerId()));
                      return params.build();
                    })
                .build();

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

  @Override
  public UnaryCallable<ApplyRecommendationRequest, ApplyRecommendationResponse>
      applyRecommendationCallable() {
    return applyRecommendationCallable;
  }

  @Override
  public UnaryCallable<DismissRecommendationRequest, DismissRecommendationResponse>
      dismissRecommendationCallable() {
    return dismissRecommendationCallable;
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
