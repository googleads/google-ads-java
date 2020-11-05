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
package com.google.ads.googleads.v4.services.stub;

import com.google.ads.googleads.v4.resources.AdGroup;
import com.google.ads.googleads.v4.services.GetAdGroupRequest;
import com.google.ads.googleads.v4.services.MutateAdGroupsRequest;
import com.google.ads.googleads.v4.services.MutateAdGroupsResponse;
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
public class GrpcAdGroupServiceStub extends AdGroupServiceStub {

  private static final MethodDescriptor<GetAdGroupRequest, AdGroup> getAdGroupMethodDescriptor =
      MethodDescriptor.<GetAdGroupRequest, AdGroup>newBuilder()
          .setType(MethodDescriptor.MethodType.UNARY)
          .setFullMethodName("google.ads.googleads.v4.services.AdGroupService/GetAdGroup")
          .setRequestMarshaller(ProtoUtils.marshaller(GetAdGroupRequest.getDefaultInstance()))
          .setResponseMarshaller(ProtoUtils.marshaller(AdGroup.getDefaultInstance()))
          .build();
  private static final MethodDescriptor<MutateAdGroupsRequest, MutateAdGroupsResponse>
      mutateAdGroupsMethodDescriptor =
          MethodDescriptor.<MutateAdGroupsRequest, MutateAdGroupsResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName("google.ads.googleads.v4.services.AdGroupService/MutateAdGroups")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(MutateAdGroupsRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(MutateAdGroupsResponse.getDefaultInstance()))
              .build();

  private final BackgroundResource backgroundResources;

  private final UnaryCallable<GetAdGroupRequest, AdGroup> getAdGroupCallable;
  private final UnaryCallable<MutateAdGroupsRequest, MutateAdGroupsResponse> mutateAdGroupsCallable;

  private final GrpcStubCallableFactory callableFactory;

  public static final GrpcAdGroupServiceStub create(AdGroupServiceStubSettings settings)
      throws IOException {
    return new GrpcAdGroupServiceStub(settings, ClientContext.create(settings));
  }

  public static final GrpcAdGroupServiceStub create(ClientContext clientContext)
      throws IOException {
    return new GrpcAdGroupServiceStub(
        AdGroupServiceStubSettings.newBuilder().build(), clientContext);
  }

  public static final GrpcAdGroupServiceStub create(
      ClientContext clientContext, GrpcStubCallableFactory callableFactory) throws IOException {
    return new GrpcAdGroupServiceStub(
        AdGroupServiceStubSettings.newBuilder().build(), clientContext, callableFactory);
  }

  /**
   * Constructs an instance of GrpcAdGroupServiceStub, using the given settings. This is protected
   * so that it is easy to make a subclass, but otherwise, the static factory methods should be
   * preferred.
   */
  protected GrpcAdGroupServiceStub(AdGroupServiceStubSettings settings, ClientContext clientContext)
      throws IOException {
    this(settings, clientContext, new GrpcAdGroupServiceCallableFactory());
  }

  /**
   * Constructs an instance of GrpcAdGroupServiceStub, using the given settings. This is protected
   * so that it is easy to make a subclass, but otherwise, the static factory methods should be
   * preferred.
   */
  protected GrpcAdGroupServiceStub(
      AdGroupServiceStubSettings settings,
      ClientContext clientContext,
      GrpcStubCallableFactory callableFactory)
      throws IOException {
    this.callableFactory = callableFactory;

    GrpcCallSettings<GetAdGroupRequest, AdGroup> getAdGroupTransportSettings =
        GrpcCallSettings.<GetAdGroupRequest, AdGroup>newBuilder()
            .setMethodDescriptor(getAdGroupMethodDescriptor)
            .setParamsExtractor(
                new RequestParamsExtractor<GetAdGroupRequest>() {
                  @Override
                  public Map<String, String> extract(GetAdGroupRequest request) {
                    ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                    params.put("resource_name", String.valueOf(request.getResourceName()));
                    return params.build();
                  }
                })
            .build();
    GrpcCallSettings<MutateAdGroupsRequest, MutateAdGroupsResponse>
        mutateAdGroupsTransportSettings =
            GrpcCallSettings.<MutateAdGroupsRequest, MutateAdGroupsResponse>newBuilder()
                .setMethodDescriptor(mutateAdGroupsMethodDescriptor)
                .setParamsExtractor(
                    new RequestParamsExtractor<MutateAdGroupsRequest>() {
                      @Override
                      public Map<String, String> extract(MutateAdGroupsRequest request) {
                        ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                        params.put("customer_id", String.valueOf(request.getCustomerId()));
                        return params.build();
                      }
                    })
                .build();

    this.getAdGroupCallable =
        callableFactory.createUnaryCallable(
            getAdGroupTransportSettings, settings.getAdGroupSettings(), clientContext);
    this.mutateAdGroupsCallable =
        callableFactory.createUnaryCallable(
            mutateAdGroupsTransportSettings, settings.mutateAdGroupsSettings(), clientContext);

    backgroundResources = new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  public UnaryCallable<GetAdGroupRequest, AdGroup> getAdGroupCallable() {
    return getAdGroupCallable;
  }

  public UnaryCallable<MutateAdGroupsRequest, MutateAdGroupsResponse> mutateAdGroupsCallable() {
    return mutateAdGroupsCallable;
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
