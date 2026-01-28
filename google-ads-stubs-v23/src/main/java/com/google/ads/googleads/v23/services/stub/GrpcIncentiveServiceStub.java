/*
 * Copyright 2026 Google LLC
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

package com.google.ads.googleads.v23.services.stub;

import com.google.ads.googleads.v23.services.ApplyIncentiveRequest;
import com.google.ads.googleads.v23.services.ApplyIncentiveResponse;
import com.google.ads.googleads.v23.services.FetchIncentiveRequest;
import com.google.ads.googleads.v23.services.FetchIncentiveResponse;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.core.BackgroundResourceAggregation;
import com.google.api.gax.grpc.GrpcCallSettings;
import com.google.api.gax.grpc.GrpcStubCallableFactory;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.RequestParamsBuilder;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.longrunning.stub.GrpcOperationsStub;
import io.grpc.MethodDescriptor;
import io.grpc.protobuf.ProtoUtils;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * gRPC stub implementation for the IncentiveService service API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by gapic-generator-java")
public class GrpcIncentiveServiceStub extends IncentiveServiceStub {
  private static final MethodDescriptor<FetchIncentiveRequest, FetchIncentiveResponse>
      fetchIncentiveMethodDescriptor =
          MethodDescriptor.<FetchIncentiveRequest, FetchIncentiveResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.ads.googleads.v23.services.IncentiveService/FetchIncentive")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(FetchIncentiveRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(FetchIncentiveResponse.getDefaultInstance()))
              .setSampledToLocalTracing(true)
              .build();

  private static final MethodDescriptor<ApplyIncentiveRequest, ApplyIncentiveResponse>
      applyIncentiveMethodDescriptor =
          MethodDescriptor.<ApplyIncentiveRequest, ApplyIncentiveResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.ads.googleads.v23.services.IncentiveService/ApplyIncentive")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(ApplyIncentiveRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(ApplyIncentiveResponse.getDefaultInstance()))
              .setSampledToLocalTracing(true)
              .build();

  private final UnaryCallable<FetchIncentiveRequest, FetchIncentiveResponse> fetchIncentiveCallable;
  private final UnaryCallable<ApplyIncentiveRequest, ApplyIncentiveResponse> applyIncentiveCallable;

  private final BackgroundResource backgroundResources;
  private final GrpcOperationsStub operationsStub;
  private final GrpcStubCallableFactory callableFactory;

  public static final GrpcIncentiveServiceStub create(IncentiveServiceStubSettings settings)
      throws IOException {
    return new GrpcIncentiveServiceStub(settings, ClientContext.create(settings));
  }

  public static final GrpcIncentiveServiceStub create(ClientContext clientContext)
      throws IOException {
    return new GrpcIncentiveServiceStub(
        IncentiveServiceStubSettings.newBuilder().build(), clientContext);
  }

  public static final GrpcIncentiveServiceStub create(
      ClientContext clientContext, GrpcStubCallableFactory callableFactory) throws IOException {
    return new GrpcIncentiveServiceStub(
        IncentiveServiceStubSettings.newBuilder().build(), clientContext, callableFactory);
  }

  /**
   * Constructs an instance of GrpcIncentiveServiceStub, using the given settings. This is protected
   * so that it is easy to make a subclass, but otherwise, the static factory methods should be
   * preferred.
   */
  protected GrpcIncentiveServiceStub(
      IncentiveServiceStubSettings settings, ClientContext clientContext) throws IOException {
    this(settings, clientContext, new GrpcIncentiveServiceCallableFactory());
  }

  /**
   * Constructs an instance of GrpcIncentiveServiceStub, using the given settings. This is protected
   * so that it is easy to make a subclass, but otherwise, the static factory methods should be
   * preferred.
   */
  protected GrpcIncentiveServiceStub(
      IncentiveServiceStubSettings settings,
      ClientContext clientContext,
      GrpcStubCallableFactory callableFactory)
      throws IOException {
    this.callableFactory = callableFactory;
    this.operationsStub = GrpcOperationsStub.create(clientContext, callableFactory);

    GrpcCallSettings<FetchIncentiveRequest, FetchIncentiveResponse>
        fetchIncentiveTransportSettings =
            GrpcCallSettings.<FetchIncentiveRequest, FetchIncentiveResponse>newBuilder()
                .setMethodDescriptor(fetchIncentiveMethodDescriptor)
                .build();
    GrpcCallSettings<ApplyIncentiveRequest, ApplyIncentiveResponse>
        applyIncentiveTransportSettings =
            GrpcCallSettings.<ApplyIncentiveRequest, ApplyIncentiveResponse>newBuilder()
                .setMethodDescriptor(applyIncentiveMethodDescriptor)
                .setParamsExtractor(
                    request -> {
                      RequestParamsBuilder builder = RequestParamsBuilder.create();
                      builder.add("customer_id", String.valueOf(request.getCustomerId()));
                      builder.add(
                          "selected_incentive_id",
                          String.valueOf(request.getSelectedIncentiveId()));
                      return builder.build();
                    })
                .build();

    this.fetchIncentiveCallable =
        callableFactory.createUnaryCallable(
            fetchIncentiveTransportSettings, settings.fetchIncentiveSettings(), clientContext);
    this.applyIncentiveCallable =
        callableFactory.createUnaryCallable(
            applyIncentiveTransportSettings, settings.applyIncentiveSettings(), clientContext);

    this.backgroundResources =
        new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  public GrpcOperationsStub getOperationsStub() {
    return operationsStub;
  }

  @Override
  public UnaryCallable<FetchIncentiveRequest, FetchIncentiveResponse> fetchIncentiveCallable() {
    return fetchIncentiveCallable;
  }

  @Override
  public UnaryCallable<ApplyIncentiveRequest, ApplyIncentiveResponse> applyIncentiveCallable() {
    return applyIncentiveCallable;
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
