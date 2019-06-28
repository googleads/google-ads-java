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
package com.google.ads.googleads.v1.services.stub;

import com.google.ads.googleads.v1.resources.KeywordPlanKeyword;
import com.google.ads.googleads.v1.services.GetKeywordPlanKeywordRequest;
import com.google.ads.googleads.v1.services.MutateKeywordPlanKeywordsRequest;
import com.google.ads.googleads.v1.services.MutateKeywordPlanKeywordsResponse;
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
public class GrpcKeywordPlanKeywordServiceStub extends KeywordPlanKeywordServiceStub {

  private static final MethodDescriptor<GetKeywordPlanKeywordRequest, KeywordPlanKeyword>
      getKeywordPlanKeywordMethodDescriptor =
          MethodDescriptor.<GetKeywordPlanKeywordRequest, KeywordPlanKeyword>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.ads.googleads.v1.services.KeywordPlanKeywordService/GetKeywordPlanKeyword")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(GetKeywordPlanKeywordRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(KeywordPlanKeyword.getDefaultInstance()))
              .build();
  private static final MethodDescriptor<
          MutateKeywordPlanKeywordsRequest, MutateKeywordPlanKeywordsResponse>
      mutateKeywordPlanKeywordsMethodDescriptor =
          MethodDescriptor
              .<MutateKeywordPlanKeywordsRequest, MutateKeywordPlanKeywordsResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.ads.googleads.v1.services.KeywordPlanKeywordService/MutateKeywordPlanKeywords")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(MutateKeywordPlanKeywordsRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(MutateKeywordPlanKeywordsResponse.getDefaultInstance()))
              .build();

  private final BackgroundResource backgroundResources;

  private final UnaryCallable<GetKeywordPlanKeywordRequest, KeywordPlanKeyword>
      getKeywordPlanKeywordCallable;
  private final UnaryCallable<MutateKeywordPlanKeywordsRequest, MutateKeywordPlanKeywordsResponse>
      mutateKeywordPlanKeywordsCallable;

  private final GrpcStubCallableFactory callableFactory;

  public static final GrpcKeywordPlanKeywordServiceStub create(
      KeywordPlanKeywordServiceStubSettings settings) throws IOException {
    return new GrpcKeywordPlanKeywordServiceStub(settings, ClientContext.create(settings));
  }

  public static final GrpcKeywordPlanKeywordServiceStub create(ClientContext clientContext)
      throws IOException {
    return new GrpcKeywordPlanKeywordServiceStub(
        KeywordPlanKeywordServiceStubSettings.newBuilder().build(), clientContext);
  }

  public static final GrpcKeywordPlanKeywordServiceStub create(
      ClientContext clientContext, GrpcStubCallableFactory callableFactory) throws IOException {
    return new GrpcKeywordPlanKeywordServiceStub(
        KeywordPlanKeywordServiceStubSettings.newBuilder().build(), clientContext, callableFactory);
  }

  /**
   * Constructs an instance of GrpcKeywordPlanKeywordServiceStub, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected GrpcKeywordPlanKeywordServiceStub(
      KeywordPlanKeywordServiceStubSettings settings, ClientContext clientContext)
      throws IOException {
    this(settings, clientContext, new GrpcKeywordPlanKeywordServiceCallableFactory());
  }

  /**
   * Constructs an instance of GrpcKeywordPlanKeywordServiceStub, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected GrpcKeywordPlanKeywordServiceStub(
      KeywordPlanKeywordServiceStubSettings settings,
      ClientContext clientContext,
      GrpcStubCallableFactory callableFactory)
      throws IOException {
    this.callableFactory = callableFactory;

    GrpcCallSettings<GetKeywordPlanKeywordRequest, KeywordPlanKeyword>
        getKeywordPlanKeywordTransportSettings =
            GrpcCallSettings.<GetKeywordPlanKeywordRequest, KeywordPlanKeyword>newBuilder()
                .setMethodDescriptor(getKeywordPlanKeywordMethodDescriptor)
                .setParamsExtractor(
                    new RequestParamsExtractor<GetKeywordPlanKeywordRequest>() {
                      @Override
                      public Map<String, String> extract(GetKeywordPlanKeywordRequest request) {
                        ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                        params.put("resource_name", String.valueOf(request.getResourceName()));
                        return params.build();
                      }
                    })
                .build();
    GrpcCallSettings<MutateKeywordPlanKeywordsRequest, MutateKeywordPlanKeywordsResponse>
        mutateKeywordPlanKeywordsTransportSettings =
            GrpcCallSettings
                .<MutateKeywordPlanKeywordsRequest, MutateKeywordPlanKeywordsResponse>newBuilder()
                .setMethodDescriptor(mutateKeywordPlanKeywordsMethodDescriptor)
                .setParamsExtractor(
                    new RequestParamsExtractor<MutateKeywordPlanKeywordsRequest>() {
                      @Override
                      public Map<String, String> extract(MutateKeywordPlanKeywordsRequest request) {
                        ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                        params.put("customer_id", String.valueOf(request.getCustomerId()));
                        return params.build();
                      }
                    })
                .build();

    this.getKeywordPlanKeywordCallable =
        callableFactory.createUnaryCallable(
            getKeywordPlanKeywordTransportSettings,
            settings.getKeywordPlanKeywordSettings(),
            clientContext);
    this.mutateKeywordPlanKeywordsCallable =
        callableFactory.createUnaryCallable(
            mutateKeywordPlanKeywordsTransportSettings,
            settings.mutateKeywordPlanKeywordsSettings(),
            clientContext);

    backgroundResources = new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  public UnaryCallable<GetKeywordPlanKeywordRequest, KeywordPlanKeyword>
      getKeywordPlanKeywordCallable() {
    return getKeywordPlanKeywordCallable;
  }

  public UnaryCallable<MutateKeywordPlanKeywordsRequest, MutateKeywordPlanKeywordsResponse>
      mutateKeywordPlanKeywordsCallable() {
    return mutateKeywordPlanKeywordsCallable;
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
