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
package com.google.ads.googleads.v3.services.stub;

import com.google.ads.googleads.v3.resources.KeywordPlanNegativeKeyword;
import com.google.ads.googleads.v3.services.GetKeywordPlanNegativeKeywordRequest;
import com.google.ads.googleads.v3.services.MutateKeywordPlanNegativeKeywordsRequest;
import com.google.ads.googleads.v3.services.MutateKeywordPlanNegativeKeywordsResponse;
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
public class GrpcKeywordPlanNegativeKeywordServiceStub
    extends KeywordPlanNegativeKeywordServiceStub {

  private static final MethodDescriptor<
          GetKeywordPlanNegativeKeywordRequest, KeywordPlanNegativeKeyword>
      getKeywordPlanNegativeKeywordMethodDescriptor =
          MethodDescriptor
              .<GetKeywordPlanNegativeKeywordRequest, KeywordPlanNegativeKeyword>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.ads.googleads.v3.services.KeywordPlanNegativeKeywordService/GetKeywordPlanNegativeKeyword")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(GetKeywordPlanNegativeKeywordRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(KeywordPlanNegativeKeyword.getDefaultInstance()))
              .build();
  private static final MethodDescriptor<
          MutateKeywordPlanNegativeKeywordsRequest, MutateKeywordPlanNegativeKeywordsResponse>
      mutateKeywordPlanNegativeKeywordsMethodDescriptor =
          MethodDescriptor
              .<MutateKeywordPlanNegativeKeywordsRequest, MutateKeywordPlanNegativeKeywordsResponse>
                  newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.ads.googleads.v3.services.KeywordPlanNegativeKeywordService/MutateKeywordPlanNegativeKeywords")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(
                      MutateKeywordPlanNegativeKeywordsRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(
                      MutateKeywordPlanNegativeKeywordsResponse.getDefaultInstance()))
              .build();

  private final BackgroundResource backgroundResources;

  private final UnaryCallable<GetKeywordPlanNegativeKeywordRequest, KeywordPlanNegativeKeyword>
      getKeywordPlanNegativeKeywordCallable;
  private final UnaryCallable<
          MutateKeywordPlanNegativeKeywordsRequest, MutateKeywordPlanNegativeKeywordsResponse>
      mutateKeywordPlanNegativeKeywordsCallable;

  private final GrpcStubCallableFactory callableFactory;

  public static final GrpcKeywordPlanNegativeKeywordServiceStub create(
      KeywordPlanNegativeKeywordServiceStubSettings settings) throws IOException {
    return new GrpcKeywordPlanNegativeKeywordServiceStub(settings, ClientContext.create(settings));
  }

  public static final GrpcKeywordPlanNegativeKeywordServiceStub create(ClientContext clientContext)
      throws IOException {
    return new GrpcKeywordPlanNegativeKeywordServiceStub(
        KeywordPlanNegativeKeywordServiceStubSettings.newBuilder().build(), clientContext);
  }

  public static final GrpcKeywordPlanNegativeKeywordServiceStub create(
      ClientContext clientContext, GrpcStubCallableFactory callableFactory) throws IOException {
    return new GrpcKeywordPlanNegativeKeywordServiceStub(
        KeywordPlanNegativeKeywordServiceStubSettings.newBuilder().build(),
        clientContext,
        callableFactory);
  }

  /**
   * Constructs an instance of GrpcKeywordPlanNegativeKeywordServiceStub, using the given settings.
   * This is protected so that it is easy to make a subclass, but otherwise, the static factory
   * methods should be preferred.
   */
  protected GrpcKeywordPlanNegativeKeywordServiceStub(
      KeywordPlanNegativeKeywordServiceStubSettings settings, ClientContext clientContext)
      throws IOException {
    this(settings, clientContext, new GrpcKeywordPlanNegativeKeywordServiceCallableFactory());
  }

  /**
   * Constructs an instance of GrpcKeywordPlanNegativeKeywordServiceStub, using the given settings.
   * This is protected so that it is easy to make a subclass, but otherwise, the static factory
   * methods should be preferred.
   */
  protected GrpcKeywordPlanNegativeKeywordServiceStub(
      KeywordPlanNegativeKeywordServiceStubSettings settings,
      ClientContext clientContext,
      GrpcStubCallableFactory callableFactory)
      throws IOException {
    this.callableFactory = callableFactory;

    GrpcCallSettings<GetKeywordPlanNegativeKeywordRequest, KeywordPlanNegativeKeyword>
        getKeywordPlanNegativeKeywordTransportSettings =
            GrpcCallSettings
                .<GetKeywordPlanNegativeKeywordRequest, KeywordPlanNegativeKeyword>newBuilder()
                .setMethodDescriptor(getKeywordPlanNegativeKeywordMethodDescriptor)
                .setParamsExtractor(
                    new RequestParamsExtractor<GetKeywordPlanNegativeKeywordRequest>() {
                      @Override
                      public Map<String, String> extract(
                          GetKeywordPlanNegativeKeywordRequest request) {
                        ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                        params.put("resource_name", String.valueOf(request.getResourceName()));
                        return params.build();
                      }
                    })
                .build();
    GrpcCallSettings<
            MutateKeywordPlanNegativeKeywordsRequest, MutateKeywordPlanNegativeKeywordsResponse>
        mutateKeywordPlanNegativeKeywordsTransportSettings =
            GrpcCallSettings
                .<MutateKeywordPlanNegativeKeywordsRequest,
                    MutateKeywordPlanNegativeKeywordsResponse>
                    newBuilder()
                .setMethodDescriptor(mutateKeywordPlanNegativeKeywordsMethodDescriptor)
                .setParamsExtractor(
                    new RequestParamsExtractor<MutateKeywordPlanNegativeKeywordsRequest>() {
                      @Override
                      public Map<String, String> extract(
                          MutateKeywordPlanNegativeKeywordsRequest request) {
                        ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                        params.put("customer_id", String.valueOf(request.getCustomerId()));
                        return params.build();
                      }
                    })
                .build();

    this.getKeywordPlanNegativeKeywordCallable =
        callableFactory.createUnaryCallable(
            getKeywordPlanNegativeKeywordTransportSettings,
            settings.getKeywordPlanNegativeKeywordSettings(),
            clientContext);
    this.mutateKeywordPlanNegativeKeywordsCallable =
        callableFactory.createUnaryCallable(
            mutateKeywordPlanNegativeKeywordsTransportSettings,
            settings.mutateKeywordPlanNegativeKeywordsSettings(),
            clientContext);

    backgroundResources = new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  public UnaryCallable<GetKeywordPlanNegativeKeywordRequest, KeywordPlanNegativeKeyword>
      getKeywordPlanNegativeKeywordCallable() {
    return getKeywordPlanNegativeKeywordCallable;
  }

  public UnaryCallable<
          MutateKeywordPlanNegativeKeywordsRequest, MutateKeywordPlanNegativeKeywordsResponse>
      mutateKeywordPlanNegativeKeywordsCallable() {
    return mutateKeywordPlanNegativeKeywordsCallable;
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
