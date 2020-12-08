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

import com.google.ads.googleads.v6.resources.DisplayKeywordView;
import com.google.ads.googleads.v6.services.GetDisplayKeywordViewRequest;
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
 * gRPC stub implementation for the DisplayKeywordViewService service API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by gapic-generator-java")
public class GrpcDisplayKeywordViewServiceStub extends DisplayKeywordViewServiceStub {
  private static final MethodDescriptor<GetDisplayKeywordViewRequest, DisplayKeywordView>
      getDisplayKeywordViewMethodDescriptor =
          MethodDescriptor.<GetDisplayKeywordViewRequest, DisplayKeywordView>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.ads.googleads.v6.services.DisplayKeywordViewService/GetDisplayKeywordView")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(GetDisplayKeywordViewRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(DisplayKeywordView.getDefaultInstance()))
              .build();

  private final UnaryCallable<GetDisplayKeywordViewRequest, DisplayKeywordView>
      getDisplayKeywordViewCallable;

  private final BackgroundResource backgroundResources;
  private final GrpcOperationsStub operationsStub;
  private final GrpcStubCallableFactory callableFactory;

  public static final GrpcDisplayKeywordViewServiceStub create(
      DisplayKeywordViewServiceStubSettings settings) throws IOException {
    return new GrpcDisplayKeywordViewServiceStub(settings, ClientContext.create(settings));
  }

  public static final GrpcDisplayKeywordViewServiceStub create(ClientContext clientContext)
      throws IOException {
    return new GrpcDisplayKeywordViewServiceStub(
        DisplayKeywordViewServiceStubSettings.newBuilder().build(), clientContext);
  }

  public static final GrpcDisplayKeywordViewServiceStub create(
      ClientContext clientContext, GrpcStubCallableFactory callableFactory) throws IOException {
    return new GrpcDisplayKeywordViewServiceStub(
        DisplayKeywordViewServiceStubSettings.newBuilder().build(), clientContext, callableFactory);
  }

  protected GrpcDisplayKeywordViewServiceStub(
      DisplayKeywordViewServiceStubSettings settings, ClientContext clientContext)
      throws IOException {
    this(settings, clientContext, new GrpcDisplayKeywordViewServiceCallableFactory());
  }

  protected GrpcDisplayKeywordViewServiceStub(
      DisplayKeywordViewServiceStubSettings settings,
      ClientContext clientContext,
      GrpcStubCallableFactory callableFactory)
      throws IOException {
    this.callableFactory = callableFactory;
    this.operationsStub = GrpcOperationsStub.create(clientContext, callableFactory);

    GrpcCallSettings<GetDisplayKeywordViewRequest, DisplayKeywordView>
        getDisplayKeywordViewTransportSettings =
            GrpcCallSettings.<GetDisplayKeywordViewRequest, DisplayKeywordView>newBuilder()
                .setMethodDescriptor(getDisplayKeywordViewMethodDescriptor)
                .setParamsExtractor(
                    new RequestParamsExtractor<GetDisplayKeywordViewRequest>() {
                      @Override
                      public Map<String, String> extract(GetDisplayKeywordViewRequest request) {
                        ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                        params.put("resource_name", String.valueOf(request.getResourceName()));
                        return params.build();
                      }
                    })
                .build();

    this.getDisplayKeywordViewCallable =
        callableFactory.createUnaryCallable(
            getDisplayKeywordViewTransportSettings,
            settings.getDisplayKeywordViewSettings(),
            clientContext);

    this.backgroundResources =
        new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  public GrpcOperationsStub getOperationsStub() {
    return operationsStub;
  }

  public UnaryCallable<GetDisplayKeywordViewRequest, DisplayKeywordView>
      getDisplayKeywordViewCallable() {
    return getDisplayKeywordViewCallable;
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
