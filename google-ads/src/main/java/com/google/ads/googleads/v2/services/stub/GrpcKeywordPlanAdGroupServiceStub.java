/*
 * Copyright 2019 Google LLC
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
package com.google.ads.googleads.v2.services.stub;

import com.google.ads.googleads.v2.resources.KeywordPlanAdGroup;
import com.google.ads.googleads.v2.services.GetKeywordPlanAdGroupRequest;
import com.google.ads.googleads.v2.services.MutateKeywordPlanAdGroupsRequest;
import com.google.ads.googleads.v2.services.MutateKeywordPlanAdGroupsResponse;
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
public class GrpcKeywordPlanAdGroupServiceStub extends KeywordPlanAdGroupServiceStub {

  private static final MethodDescriptor<GetKeywordPlanAdGroupRequest, KeywordPlanAdGroup>
      getKeywordPlanAdGroupMethodDescriptor =
          MethodDescriptor.<GetKeywordPlanAdGroupRequest, KeywordPlanAdGroup>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.ads.googleads.v2.services.KeywordPlanAdGroupService/GetKeywordPlanAdGroup")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(GetKeywordPlanAdGroupRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(KeywordPlanAdGroup.getDefaultInstance()))
              .build();
  private static final MethodDescriptor<
          MutateKeywordPlanAdGroupsRequest, MutateKeywordPlanAdGroupsResponse>
      mutateKeywordPlanAdGroupsMethodDescriptor =
          MethodDescriptor
              .<MutateKeywordPlanAdGroupsRequest, MutateKeywordPlanAdGroupsResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.ads.googleads.v2.services.KeywordPlanAdGroupService/MutateKeywordPlanAdGroups")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(MutateKeywordPlanAdGroupsRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(MutateKeywordPlanAdGroupsResponse.getDefaultInstance()))
              .build();

  private final BackgroundResource backgroundResources;

  private final UnaryCallable<GetKeywordPlanAdGroupRequest, KeywordPlanAdGroup>
      getKeywordPlanAdGroupCallable;
  private final UnaryCallable<MutateKeywordPlanAdGroupsRequest, MutateKeywordPlanAdGroupsResponse>
      mutateKeywordPlanAdGroupsCallable;

  private final GrpcStubCallableFactory callableFactory;

  public static final GrpcKeywordPlanAdGroupServiceStub create(
      KeywordPlanAdGroupServiceStubSettings settings) throws IOException {
    return new GrpcKeywordPlanAdGroupServiceStub(settings, ClientContext.create(settings));
  }

  public static final GrpcKeywordPlanAdGroupServiceStub create(ClientContext clientContext)
      throws IOException {
    return new GrpcKeywordPlanAdGroupServiceStub(
        KeywordPlanAdGroupServiceStubSettings.newBuilder().build(), clientContext);
  }

  public static final GrpcKeywordPlanAdGroupServiceStub create(
      ClientContext clientContext, GrpcStubCallableFactory callableFactory) throws IOException {
    return new GrpcKeywordPlanAdGroupServiceStub(
        KeywordPlanAdGroupServiceStubSettings.newBuilder().build(), clientContext, callableFactory);
  }

  /**
   * Constructs an instance of GrpcKeywordPlanAdGroupServiceStub, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected GrpcKeywordPlanAdGroupServiceStub(
      KeywordPlanAdGroupServiceStubSettings settings, ClientContext clientContext)
      throws IOException {
    this(settings, clientContext, new GrpcKeywordPlanAdGroupServiceCallableFactory());
  }

  /**
   * Constructs an instance of GrpcKeywordPlanAdGroupServiceStub, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected GrpcKeywordPlanAdGroupServiceStub(
      KeywordPlanAdGroupServiceStubSettings settings,
      ClientContext clientContext,
      GrpcStubCallableFactory callableFactory)
      throws IOException {
    this.callableFactory = callableFactory;

    GrpcCallSettings<GetKeywordPlanAdGroupRequest, KeywordPlanAdGroup>
        getKeywordPlanAdGroupTransportSettings =
            GrpcCallSettings.<GetKeywordPlanAdGroupRequest, KeywordPlanAdGroup>newBuilder()
                .setMethodDescriptor(getKeywordPlanAdGroupMethodDescriptor)
                .setParamsExtractor(
                    new RequestParamsExtractor<GetKeywordPlanAdGroupRequest>() {
                      @Override
                      public Map<String, String> extract(GetKeywordPlanAdGroupRequest request) {
                        ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                        params.put("resource_name", String.valueOf(request.getResourceName()));
                        return params.build();
                      }
                    })
                .build();
    GrpcCallSettings<MutateKeywordPlanAdGroupsRequest, MutateKeywordPlanAdGroupsResponse>
        mutateKeywordPlanAdGroupsTransportSettings =
            GrpcCallSettings
                .<MutateKeywordPlanAdGroupsRequest, MutateKeywordPlanAdGroupsResponse>newBuilder()
                .setMethodDescriptor(mutateKeywordPlanAdGroupsMethodDescriptor)
                .setParamsExtractor(
                    new RequestParamsExtractor<MutateKeywordPlanAdGroupsRequest>() {
                      @Override
                      public Map<String, String> extract(MutateKeywordPlanAdGroupsRequest request) {
                        ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                        params.put("customer_id", String.valueOf(request.getCustomerId()));
                        return params.build();
                      }
                    })
                .build();

    this.getKeywordPlanAdGroupCallable =
        callableFactory.createUnaryCallable(
            getKeywordPlanAdGroupTransportSettings,
            settings.getKeywordPlanAdGroupSettings(),
            clientContext);
    this.mutateKeywordPlanAdGroupsCallable =
        callableFactory.createUnaryCallable(
            mutateKeywordPlanAdGroupsTransportSettings,
            settings.mutateKeywordPlanAdGroupsSettings(),
            clientContext);

    backgroundResources = new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  public UnaryCallable<GetKeywordPlanAdGroupRequest, KeywordPlanAdGroup>
      getKeywordPlanAdGroupCallable() {
    return getKeywordPlanAdGroupCallable;
  }

  public UnaryCallable<MutateKeywordPlanAdGroupsRequest, MutateKeywordPlanAdGroupsResponse>
      mutateKeywordPlanAdGroupsCallable() {
    return mutateKeywordPlanAdGroupsCallable;
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
