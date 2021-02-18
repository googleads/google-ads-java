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

import com.google.ads.googleads.v6.resources.DynamicSearchAdsSearchTermView;
import com.google.ads.googleads.v6.services.GetDynamicSearchAdsSearchTermViewRequest;
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
 * gRPC stub implementation for the DynamicSearchAdsSearchTermViewService service API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by gapic-generator-java")
public class GrpcDynamicSearchAdsSearchTermViewServiceStub
    extends DynamicSearchAdsSearchTermViewServiceStub {
  private static final MethodDescriptor<
          GetDynamicSearchAdsSearchTermViewRequest, DynamicSearchAdsSearchTermView>
      getDynamicSearchAdsSearchTermViewMethodDescriptor =
          MethodDescriptor
              .<GetDynamicSearchAdsSearchTermViewRequest, DynamicSearchAdsSearchTermView>
                  newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.ads.googleads.v6.services.DynamicSearchAdsSearchTermViewService/GetDynamicSearchAdsSearchTermView")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(
                      GetDynamicSearchAdsSearchTermViewRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(DynamicSearchAdsSearchTermView.getDefaultInstance()))
              .build();

  private final UnaryCallable<
          GetDynamicSearchAdsSearchTermViewRequest, DynamicSearchAdsSearchTermView>
      getDynamicSearchAdsSearchTermViewCallable;

  private final BackgroundResource backgroundResources;
  private final GrpcOperationsStub operationsStub;
  private final GrpcStubCallableFactory callableFactory;

  public static final GrpcDynamicSearchAdsSearchTermViewServiceStub create(
      DynamicSearchAdsSearchTermViewServiceStubSettings settings) throws IOException {
    return new GrpcDynamicSearchAdsSearchTermViewServiceStub(
        settings, ClientContext.create(settings));
  }

  public static final GrpcDynamicSearchAdsSearchTermViewServiceStub create(
      ClientContext clientContext) throws IOException {
    return new GrpcDynamicSearchAdsSearchTermViewServiceStub(
        DynamicSearchAdsSearchTermViewServiceStubSettings.newBuilder().build(), clientContext);
  }

  public static final GrpcDynamicSearchAdsSearchTermViewServiceStub create(
      ClientContext clientContext, GrpcStubCallableFactory callableFactory) throws IOException {
    return new GrpcDynamicSearchAdsSearchTermViewServiceStub(
        DynamicSearchAdsSearchTermViewServiceStubSettings.newBuilder().build(),
        clientContext,
        callableFactory);
  }

  /**
   * Constructs an instance of GrpcDynamicSearchAdsSearchTermViewServiceStub, using the given
   * settings. This is protected so that it is easy to make a subclass, but otherwise, the static
   * factory methods should be preferred.
   */
  protected GrpcDynamicSearchAdsSearchTermViewServiceStub(
      DynamicSearchAdsSearchTermViewServiceStubSettings settings, ClientContext clientContext)
      throws IOException {
    this(settings, clientContext, new GrpcDynamicSearchAdsSearchTermViewServiceCallableFactory());
  }

  /**
   * Constructs an instance of GrpcDynamicSearchAdsSearchTermViewServiceStub, using the given
   * settings. This is protected so that it is easy to make a subclass, but otherwise, the static
   * factory methods should be preferred.
   */
  protected GrpcDynamicSearchAdsSearchTermViewServiceStub(
      DynamicSearchAdsSearchTermViewServiceStubSettings settings,
      ClientContext clientContext,
      GrpcStubCallableFactory callableFactory)
      throws IOException {
    this.callableFactory = callableFactory;
    this.operationsStub = GrpcOperationsStub.create(clientContext, callableFactory);

    GrpcCallSettings<GetDynamicSearchAdsSearchTermViewRequest, DynamicSearchAdsSearchTermView>
        getDynamicSearchAdsSearchTermViewTransportSettings =
            GrpcCallSettings
                .<GetDynamicSearchAdsSearchTermViewRequest, DynamicSearchAdsSearchTermView>
                    newBuilder()
                .setMethodDescriptor(getDynamicSearchAdsSearchTermViewMethodDescriptor)
                .setParamsExtractor(
                    new RequestParamsExtractor<GetDynamicSearchAdsSearchTermViewRequest>() {
                      @Override
                      public Map<String, String> extract(
                          GetDynamicSearchAdsSearchTermViewRequest request) {
                        ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                        params.put("resource_name", String.valueOf(request.getResourceName()));
                        return params.build();
                      }
                    })
                .build();

    this.getDynamicSearchAdsSearchTermViewCallable =
        callableFactory.createUnaryCallable(
            getDynamicSearchAdsSearchTermViewTransportSettings,
            settings.getDynamicSearchAdsSearchTermViewSettings(),
            clientContext);

    this.backgroundResources =
        new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  public GrpcOperationsStub getOperationsStub() {
    return operationsStub;
  }

  public UnaryCallable<GetDynamicSearchAdsSearchTermViewRequest, DynamicSearchAdsSearchTermView>
      getDynamicSearchAdsSearchTermViewCallable() {
    return getDynamicSearchAdsSearchTermViewCallable;
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
