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

import com.google.ads.googleads.v6.resources.KeywordPlanCampaignKeyword;
import com.google.ads.googleads.v6.services.GetKeywordPlanCampaignKeywordRequest;
import com.google.ads.googleads.v6.services.MutateKeywordPlanCampaignKeywordsRequest;
import com.google.ads.googleads.v6.services.MutateKeywordPlanCampaignKeywordsResponse;
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
 * gRPC stub implementation for the KeywordPlanCampaignKeywordService service API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by gapic-generator-java")
public class GrpcKeywordPlanCampaignKeywordServiceStub
    extends KeywordPlanCampaignKeywordServiceStub {
  private static final MethodDescriptor<
          GetKeywordPlanCampaignKeywordRequest, KeywordPlanCampaignKeyword>
      getKeywordPlanCampaignKeywordMethodDescriptor =
          MethodDescriptor
              .<GetKeywordPlanCampaignKeywordRequest, KeywordPlanCampaignKeyword>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.ads.googleads.v6.services.KeywordPlanCampaignKeywordService/GetKeywordPlanCampaignKeyword")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(GetKeywordPlanCampaignKeywordRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(KeywordPlanCampaignKeyword.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<
          MutateKeywordPlanCampaignKeywordsRequest, MutateKeywordPlanCampaignKeywordsResponse>
      mutateKeywordPlanCampaignKeywordsMethodDescriptor =
          MethodDescriptor
              .<MutateKeywordPlanCampaignKeywordsRequest, MutateKeywordPlanCampaignKeywordsResponse>
                  newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.ads.googleads.v6.services.KeywordPlanCampaignKeywordService/MutateKeywordPlanCampaignKeywords")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(
                      MutateKeywordPlanCampaignKeywordsRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(
                      MutateKeywordPlanCampaignKeywordsResponse.getDefaultInstance()))
              .build();

  private final UnaryCallable<GetKeywordPlanCampaignKeywordRequest, KeywordPlanCampaignKeyword>
      getKeywordPlanCampaignKeywordCallable;
  private final UnaryCallable<
          MutateKeywordPlanCampaignKeywordsRequest, MutateKeywordPlanCampaignKeywordsResponse>
      mutateKeywordPlanCampaignKeywordsCallable;

  private final BackgroundResource backgroundResources;
  private final GrpcOperationsStub operationsStub;
  private final GrpcStubCallableFactory callableFactory;

  public static final GrpcKeywordPlanCampaignKeywordServiceStub create(
      KeywordPlanCampaignKeywordServiceStubSettings settings) throws IOException {
    return new GrpcKeywordPlanCampaignKeywordServiceStub(settings, ClientContext.create(settings));
  }

  public static final GrpcKeywordPlanCampaignKeywordServiceStub create(ClientContext clientContext)
      throws IOException {
    return new GrpcKeywordPlanCampaignKeywordServiceStub(
        KeywordPlanCampaignKeywordServiceStubSettings.newBuilder().build(), clientContext);
  }

  public static final GrpcKeywordPlanCampaignKeywordServiceStub create(
      ClientContext clientContext, GrpcStubCallableFactory callableFactory) throws IOException {
    return new GrpcKeywordPlanCampaignKeywordServiceStub(
        KeywordPlanCampaignKeywordServiceStubSettings.newBuilder().build(),
        clientContext,
        callableFactory);
  }

  /**
   * Constructs an instance of GrpcKeywordPlanCampaignKeywordServiceStub, using the given settings.
   * This is protected so that it is easy to make a subclass, but otherwise, the static factory
   * methods should be preferred.
   */
  protected GrpcKeywordPlanCampaignKeywordServiceStub(
      KeywordPlanCampaignKeywordServiceStubSettings settings, ClientContext clientContext)
      throws IOException {
    this(settings, clientContext, new GrpcKeywordPlanCampaignKeywordServiceCallableFactory());
  }

  /**
   * Constructs an instance of GrpcKeywordPlanCampaignKeywordServiceStub, using the given settings.
   * This is protected so that it is easy to make a subclass, but otherwise, the static factory
   * methods should be preferred.
   */
  protected GrpcKeywordPlanCampaignKeywordServiceStub(
      KeywordPlanCampaignKeywordServiceStubSettings settings,
      ClientContext clientContext,
      GrpcStubCallableFactory callableFactory)
      throws IOException {
    this.callableFactory = callableFactory;
    this.operationsStub = GrpcOperationsStub.create(clientContext, callableFactory);

    GrpcCallSettings<GetKeywordPlanCampaignKeywordRequest, KeywordPlanCampaignKeyword>
        getKeywordPlanCampaignKeywordTransportSettings =
            GrpcCallSettings
                .<GetKeywordPlanCampaignKeywordRequest, KeywordPlanCampaignKeyword>newBuilder()
                .setMethodDescriptor(getKeywordPlanCampaignKeywordMethodDescriptor)
                .setParamsExtractor(
                    new RequestParamsExtractor<GetKeywordPlanCampaignKeywordRequest>() {
                      @Override
                      public Map<String, String> extract(
                          GetKeywordPlanCampaignKeywordRequest request) {
                        ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                        params.put("resource_name", String.valueOf(request.getResourceName()));
                        return params.build();
                      }
                    })
                .build();
    GrpcCallSettings<
            MutateKeywordPlanCampaignKeywordsRequest, MutateKeywordPlanCampaignKeywordsResponse>
        mutateKeywordPlanCampaignKeywordsTransportSettings =
            GrpcCallSettings
                .<MutateKeywordPlanCampaignKeywordsRequest,
                    MutateKeywordPlanCampaignKeywordsResponse>
                    newBuilder()
                .setMethodDescriptor(mutateKeywordPlanCampaignKeywordsMethodDescriptor)
                .setParamsExtractor(
                    new RequestParamsExtractor<MutateKeywordPlanCampaignKeywordsRequest>() {
                      @Override
                      public Map<String, String> extract(
                          MutateKeywordPlanCampaignKeywordsRequest request) {
                        ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                        params.put("customer_id", String.valueOf(request.getCustomerId()));
                        return params.build();
                      }
                    })
                .build();

    this.getKeywordPlanCampaignKeywordCallable =
        callableFactory.createUnaryCallable(
            getKeywordPlanCampaignKeywordTransportSettings,
            settings.getKeywordPlanCampaignKeywordSettings(),
            clientContext);
    this.mutateKeywordPlanCampaignKeywordsCallable =
        callableFactory.createUnaryCallable(
            mutateKeywordPlanCampaignKeywordsTransportSettings,
            settings.mutateKeywordPlanCampaignKeywordsSettings(),
            clientContext);

    this.backgroundResources =
        new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  public GrpcOperationsStub getOperationsStub() {
    return operationsStub;
  }

  public UnaryCallable<GetKeywordPlanCampaignKeywordRequest, KeywordPlanCampaignKeyword>
      getKeywordPlanCampaignKeywordCallable() {
    return getKeywordPlanCampaignKeywordCallable;
  }

  public UnaryCallable<
          MutateKeywordPlanCampaignKeywordsRequest, MutateKeywordPlanCampaignKeywordsResponse>
      mutateKeywordPlanCampaignKeywordsCallable() {
    return mutateKeywordPlanCampaignKeywordsCallable;
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
