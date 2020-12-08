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

import com.google.ads.googleads.v6.resources.SearchTermView;
import com.google.ads.googleads.v6.services.GetSearchTermViewRequest;
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
 * gRPC stub implementation for the SearchTermViewService service API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by gapic-generator-java")
public class GrpcSearchTermViewServiceStub extends SearchTermViewServiceStub {
  private static final MethodDescriptor<GetSearchTermViewRequest, SearchTermView>
      getSearchTermViewMethodDescriptor =
          MethodDescriptor.<GetSearchTermViewRequest, SearchTermView>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.ads.googleads.v6.services.SearchTermViewService/GetSearchTermView")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(GetSearchTermViewRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(SearchTermView.getDefaultInstance()))
              .build();

  private final UnaryCallable<GetSearchTermViewRequest, SearchTermView> getSearchTermViewCallable;

  private final BackgroundResource backgroundResources;
  private final GrpcOperationsStub operationsStub;
  private final GrpcStubCallableFactory callableFactory;

  public static final GrpcSearchTermViewServiceStub create(
      SearchTermViewServiceStubSettings settings) throws IOException {
    return new GrpcSearchTermViewServiceStub(settings, ClientContext.create(settings));
  }

  public static final GrpcSearchTermViewServiceStub create(ClientContext clientContext)
      throws IOException {
    return new GrpcSearchTermViewServiceStub(
        SearchTermViewServiceStubSettings.newBuilder().build(), clientContext);
  }

  public static final GrpcSearchTermViewServiceStub create(
      ClientContext clientContext, GrpcStubCallableFactory callableFactory) throws IOException {
    return new GrpcSearchTermViewServiceStub(
        SearchTermViewServiceStubSettings.newBuilder().build(), clientContext, callableFactory);
  }

  protected GrpcSearchTermViewServiceStub(
      SearchTermViewServiceStubSettings settings, ClientContext clientContext) throws IOException {
    this(settings, clientContext, new GrpcSearchTermViewServiceCallableFactory());
  }

  protected GrpcSearchTermViewServiceStub(
      SearchTermViewServiceStubSettings settings,
      ClientContext clientContext,
      GrpcStubCallableFactory callableFactory)
      throws IOException {
    this.callableFactory = callableFactory;
    this.operationsStub = GrpcOperationsStub.create(clientContext, callableFactory);

    GrpcCallSettings<GetSearchTermViewRequest, SearchTermView> getSearchTermViewTransportSettings =
        GrpcCallSettings.<GetSearchTermViewRequest, SearchTermView>newBuilder()
            .setMethodDescriptor(getSearchTermViewMethodDescriptor)
            .setParamsExtractor(
                new RequestParamsExtractor<GetSearchTermViewRequest>() {
                  @Override
                  public Map<String, String> extract(GetSearchTermViewRequest request) {
                    ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                    params.put("resource_name", String.valueOf(request.getResourceName()));
                    return params.build();
                  }
                })
            .build();

    this.getSearchTermViewCallable =
        callableFactory.createUnaryCallable(
            getSearchTermViewTransportSettings,
            settings.getSearchTermViewSettings(),
            clientContext);

    this.backgroundResources =
        new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  public GrpcOperationsStub getOperationsStub() {
    return operationsStub;
  }

  public UnaryCallable<GetSearchTermViewRequest, SearchTermView> getSearchTermViewCallable() {
    return getSearchTermViewCallable;
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
