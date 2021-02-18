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

import com.google.ads.googleads.v6.resources.UserLocationView;
import com.google.ads.googleads.v6.services.GetUserLocationViewRequest;
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
 * gRPC stub implementation for the UserLocationViewService service API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by gapic-generator-java")
public class GrpcUserLocationViewServiceStub extends UserLocationViewServiceStub {
  private static final MethodDescriptor<GetUserLocationViewRequest, UserLocationView>
      getUserLocationViewMethodDescriptor =
          MethodDescriptor.<GetUserLocationViewRequest, UserLocationView>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.ads.googleads.v6.services.UserLocationViewService/GetUserLocationView")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(GetUserLocationViewRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(UserLocationView.getDefaultInstance()))
              .build();

  private final UnaryCallable<GetUserLocationViewRequest, UserLocationView>
      getUserLocationViewCallable;

  private final BackgroundResource backgroundResources;
  private final GrpcOperationsStub operationsStub;
  private final GrpcStubCallableFactory callableFactory;

  public static final GrpcUserLocationViewServiceStub create(
      UserLocationViewServiceStubSettings settings) throws IOException {
    return new GrpcUserLocationViewServiceStub(settings, ClientContext.create(settings));
  }

  public static final GrpcUserLocationViewServiceStub create(ClientContext clientContext)
      throws IOException {
    return new GrpcUserLocationViewServiceStub(
        UserLocationViewServiceStubSettings.newBuilder().build(), clientContext);
  }

  public static final GrpcUserLocationViewServiceStub create(
      ClientContext clientContext, GrpcStubCallableFactory callableFactory) throws IOException {
    return new GrpcUserLocationViewServiceStub(
        UserLocationViewServiceStubSettings.newBuilder().build(), clientContext, callableFactory);
  }

  /**
   * Constructs an instance of GrpcUserLocationViewServiceStub, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected GrpcUserLocationViewServiceStub(
      UserLocationViewServiceStubSettings settings, ClientContext clientContext)
      throws IOException {
    this(settings, clientContext, new GrpcUserLocationViewServiceCallableFactory());
  }

  /**
   * Constructs an instance of GrpcUserLocationViewServiceStub, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected GrpcUserLocationViewServiceStub(
      UserLocationViewServiceStubSettings settings,
      ClientContext clientContext,
      GrpcStubCallableFactory callableFactory)
      throws IOException {
    this.callableFactory = callableFactory;
    this.operationsStub = GrpcOperationsStub.create(clientContext, callableFactory);

    GrpcCallSettings<GetUserLocationViewRequest, UserLocationView>
        getUserLocationViewTransportSettings =
            GrpcCallSettings.<GetUserLocationViewRequest, UserLocationView>newBuilder()
                .setMethodDescriptor(getUserLocationViewMethodDescriptor)
                .setParamsExtractor(
                    new RequestParamsExtractor<GetUserLocationViewRequest>() {
                      @Override
                      public Map<String, String> extract(GetUserLocationViewRequest request) {
                        ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                        params.put("resource_name", String.valueOf(request.getResourceName()));
                        return params.build();
                      }
                    })
                .build();

    this.getUserLocationViewCallable =
        callableFactory.createUnaryCallable(
            getUserLocationViewTransportSettings,
            settings.getUserLocationViewSettings(),
            clientContext);

    this.backgroundResources =
        new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  public GrpcOperationsStub getOperationsStub() {
    return operationsStub;
  }

  public UnaryCallable<GetUserLocationViewRequest, UserLocationView> getUserLocationViewCallable() {
    return getUserLocationViewCallable;
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
