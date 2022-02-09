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

import com.google.ads.googleads.v10.services.MutateCustomInterestsRequest;
import com.google.ads.googleads.v10.services.MutateCustomInterestsResponse;
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
 * gRPC stub implementation for the CustomInterestService service API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by gapic-generator-java")
public class GrpcCustomInterestServiceStub extends CustomInterestServiceStub {
  private static final MethodDescriptor<MutateCustomInterestsRequest, MutateCustomInterestsResponse>
      mutateCustomInterestsMethodDescriptor =
          MethodDescriptor.<MutateCustomInterestsRequest, MutateCustomInterestsResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.ads.googleads.v10.services.CustomInterestService/MutateCustomInterests")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(MutateCustomInterestsRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(MutateCustomInterestsResponse.getDefaultInstance()))
              .build();

  private final UnaryCallable<MutateCustomInterestsRequest, MutateCustomInterestsResponse>
      mutateCustomInterestsCallable;

  private final BackgroundResource backgroundResources;
  private final GrpcOperationsStub operationsStub;
  private final GrpcStubCallableFactory callableFactory;

  public static final GrpcCustomInterestServiceStub create(
      CustomInterestServiceStubSettings settings) throws IOException {
    return new GrpcCustomInterestServiceStub(settings, ClientContext.create(settings));
  }

  public static final GrpcCustomInterestServiceStub create(ClientContext clientContext)
      throws IOException {
    return new GrpcCustomInterestServiceStub(
        CustomInterestServiceStubSettings.newBuilder().build(), clientContext);
  }

  public static final GrpcCustomInterestServiceStub create(
      ClientContext clientContext, GrpcStubCallableFactory callableFactory) throws IOException {
    return new GrpcCustomInterestServiceStub(
        CustomInterestServiceStubSettings.newBuilder().build(), clientContext, callableFactory);
  }

  /**
   * Constructs an instance of GrpcCustomInterestServiceStub, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected GrpcCustomInterestServiceStub(
      CustomInterestServiceStubSettings settings, ClientContext clientContext) throws IOException {
    this(settings, clientContext, new GrpcCustomInterestServiceCallableFactory());
  }

  /**
   * Constructs an instance of GrpcCustomInterestServiceStub, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected GrpcCustomInterestServiceStub(
      CustomInterestServiceStubSettings settings,
      ClientContext clientContext,
      GrpcStubCallableFactory callableFactory)
      throws IOException {
    this.callableFactory = callableFactory;
    this.operationsStub = GrpcOperationsStub.create(clientContext, callableFactory);

    GrpcCallSettings<MutateCustomInterestsRequest, MutateCustomInterestsResponse>
        mutateCustomInterestsTransportSettings =
            GrpcCallSettings
                .<MutateCustomInterestsRequest, MutateCustomInterestsResponse>newBuilder()
                .setMethodDescriptor(mutateCustomInterestsMethodDescriptor)
                .setParamsExtractor(
                    request -> {
                      ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                      params.put("customer_id", String.valueOf(request.getCustomerId()));
                      return params.build();
                    })
                .build();

    this.mutateCustomInterestsCallable =
        callableFactory.createUnaryCallable(
            mutateCustomInterestsTransportSettings,
            settings.mutateCustomInterestsSettings(),
            clientContext);

    this.backgroundResources =
        new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  public GrpcOperationsStub getOperationsStub() {
    return operationsStub;
  }

  @Override
  public UnaryCallable<MutateCustomInterestsRequest, MutateCustomInterestsResponse>
      mutateCustomInterestsCallable() {
    return mutateCustomInterestsCallable;
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
