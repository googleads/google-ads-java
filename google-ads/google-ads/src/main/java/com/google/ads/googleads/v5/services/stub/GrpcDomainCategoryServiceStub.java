/*
 * Copyright 2020 Google LLC
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
package com.google.ads.googleads.v5.services.stub;

import com.google.ads.googleads.v5.resources.DomainCategory;
import com.google.ads.googleads.v5.services.GetDomainCategoryRequest;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.core.BackgroundResourceAggregation;
import com.google.api.gax.grpc.GrpcCallSettings;
import com.google.api.gax.grpc.GrpcStubCallableFactory;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.RequestParamsExtractor;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.common.collect.ImmutableMap;
import io.grpc.MethodDescriptor;
import io.grpc.protobuf.ProtoUtils;
import java.io.IOException;
import java.util.Map;
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
public class GrpcDomainCategoryServiceStub extends DomainCategoryServiceStub {

  private static final MethodDescriptor<GetDomainCategoryRequest, DomainCategory>
      getDomainCategoryMethodDescriptor =
          MethodDescriptor.<GetDomainCategoryRequest, DomainCategory>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.ads.googleads.v5.services.DomainCategoryService/GetDomainCategory")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(GetDomainCategoryRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(DomainCategory.getDefaultInstance()))
              .build();

  private final BackgroundResource backgroundResources;

  private final UnaryCallable<GetDomainCategoryRequest, DomainCategory> getDomainCategoryCallable;

  private final GrpcStubCallableFactory callableFactory;

  public static final GrpcDomainCategoryServiceStub create(
      DomainCategoryServiceStubSettings settings) throws IOException {
    return new GrpcDomainCategoryServiceStub(settings, ClientContext.create(settings));
  }

  public static final GrpcDomainCategoryServiceStub create(ClientContext clientContext)
      throws IOException {
    return new GrpcDomainCategoryServiceStub(
        DomainCategoryServiceStubSettings.newBuilder().build(), clientContext);
  }

  public static final GrpcDomainCategoryServiceStub create(
      ClientContext clientContext, GrpcStubCallableFactory callableFactory) throws IOException {
    return new GrpcDomainCategoryServiceStub(
        DomainCategoryServiceStubSettings.newBuilder().build(), clientContext, callableFactory);
  }

  /**
   * Constructs an instance of GrpcDomainCategoryServiceStub, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected GrpcDomainCategoryServiceStub(
      DomainCategoryServiceStubSettings settings, ClientContext clientContext) throws IOException {
    this(settings, clientContext, new GrpcDomainCategoryServiceCallableFactory());
  }

  /**
   * Constructs an instance of GrpcDomainCategoryServiceStub, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected GrpcDomainCategoryServiceStub(
      DomainCategoryServiceStubSettings settings,
      ClientContext clientContext,
      GrpcStubCallableFactory callableFactory)
      throws IOException {
    this.callableFactory = callableFactory;

    GrpcCallSettings<GetDomainCategoryRequest, DomainCategory> getDomainCategoryTransportSettings =
        GrpcCallSettings.<GetDomainCategoryRequest, DomainCategory>newBuilder()
            .setMethodDescriptor(getDomainCategoryMethodDescriptor)
            .setParamsExtractor(
                new RequestParamsExtractor<GetDomainCategoryRequest>() {
                  @Override
                  public Map<String, String> extract(GetDomainCategoryRequest request) {
                    ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                    params.put("resource_name", String.valueOf(request.getResourceName()));
                    return params.build();
                  }
                })
            .build();

    this.getDomainCategoryCallable =
        callableFactory.createUnaryCallable(
            getDomainCategoryTransportSettings,
            settings.getDomainCategorySettings(),
            clientContext);

    backgroundResources = new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  public UnaryCallable<GetDomainCategoryRequest, DomainCategory> getDomainCategoryCallable() {
    return getDomainCategoryCallable;
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
