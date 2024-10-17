/*
 * Copyright 2024 Google LLC
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

package com.google.ads.googleads.v18.services.stub;

import com.google.ads.googleads.v18.services.SuggestBrandsRequest;
import com.google.ads.googleads.v18.services.SuggestBrandsResponse;
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
 * gRPC stub implementation for the BrandSuggestionService service API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by gapic-generator-java")
public class GrpcBrandSuggestionServiceStub extends BrandSuggestionServiceStub {
  private static final MethodDescriptor<SuggestBrandsRequest, SuggestBrandsResponse>
      suggestBrandsMethodDescriptor =
          MethodDescriptor.<SuggestBrandsRequest, SuggestBrandsResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.ads.googleads.v18.services.BrandSuggestionService/SuggestBrands")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(SuggestBrandsRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(SuggestBrandsResponse.getDefaultInstance()))
              .build();

  private final UnaryCallable<SuggestBrandsRequest, SuggestBrandsResponse> suggestBrandsCallable;

  private final BackgroundResource backgroundResources;
  private final GrpcOperationsStub operationsStub;
  private final GrpcStubCallableFactory callableFactory;

  public static final GrpcBrandSuggestionServiceStub create(
      BrandSuggestionServiceStubSettings settings) throws IOException {
    return new GrpcBrandSuggestionServiceStub(settings, ClientContext.create(settings));
  }

  public static final GrpcBrandSuggestionServiceStub create(ClientContext clientContext)
      throws IOException {
    return new GrpcBrandSuggestionServiceStub(
        BrandSuggestionServiceStubSettings.newBuilder().build(), clientContext);
  }

  public static final GrpcBrandSuggestionServiceStub create(
      ClientContext clientContext, GrpcStubCallableFactory callableFactory) throws IOException {
    return new GrpcBrandSuggestionServiceStub(
        BrandSuggestionServiceStubSettings.newBuilder().build(), clientContext, callableFactory);
  }

  /**
   * Constructs an instance of GrpcBrandSuggestionServiceStub, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected GrpcBrandSuggestionServiceStub(
      BrandSuggestionServiceStubSettings settings, ClientContext clientContext) throws IOException {
    this(settings, clientContext, new GrpcBrandSuggestionServiceCallableFactory());
  }

  /**
   * Constructs an instance of GrpcBrandSuggestionServiceStub, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected GrpcBrandSuggestionServiceStub(
      BrandSuggestionServiceStubSettings settings,
      ClientContext clientContext,
      GrpcStubCallableFactory callableFactory)
      throws IOException {
    this.callableFactory = callableFactory;
    this.operationsStub = GrpcOperationsStub.create(clientContext, callableFactory);

    GrpcCallSettings<SuggestBrandsRequest, SuggestBrandsResponse> suggestBrandsTransportSettings =
        GrpcCallSettings.<SuggestBrandsRequest, SuggestBrandsResponse>newBuilder()
            .setMethodDescriptor(suggestBrandsMethodDescriptor)
            .setParamsExtractor(
                request -> {
                  RequestParamsBuilder builder = RequestParamsBuilder.create();
                  builder.add("customer_id", String.valueOf(request.getCustomerId()));
                  return builder.build();
                })
            .build();

    this.suggestBrandsCallable =
        callableFactory.createUnaryCallable(
            suggestBrandsTransportSettings, settings.suggestBrandsSettings(), clientContext);

    this.backgroundResources =
        new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  public GrpcOperationsStub getOperationsStub() {
    return operationsStub;
  }

  @Override
  public UnaryCallable<SuggestBrandsRequest, SuggestBrandsResponse> suggestBrandsCallable() {
    return suggestBrandsCallable;
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
