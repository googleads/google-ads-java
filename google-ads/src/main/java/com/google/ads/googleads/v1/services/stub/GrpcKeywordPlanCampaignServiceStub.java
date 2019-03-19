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

import com.google.ads.googleads.v1.resources.KeywordPlanCampaign;
import com.google.ads.googleads.v1.services.GetKeywordPlanCampaignRequest;
import com.google.ads.googleads.v1.services.MutateKeywordPlanCampaignsRequest;
import com.google.ads.googleads.v1.services.MutateKeywordPlanCampaignsResponse;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.core.BackgroundResourceAggregation;
import com.google.api.gax.grpc.GrpcCallSettings;
import com.google.api.gax.grpc.GrpcStubCallableFactory;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.UnaryCallable;
import io.grpc.MethodDescriptor;
import io.grpc.protobuf.ProtoUtils;
import java.io.IOException;
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
public class GrpcKeywordPlanCampaignServiceStub extends KeywordPlanCampaignServiceStub {

  private static final MethodDescriptor<GetKeywordPlanCampaignRequest, KeywordPlanCampaign>
      getKeywordPlanCampaignMethodDescriptor =
          MethodDescriptor.<GetKeywordPlanCampaignRequest, KeywordPlanCampaign>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.ads.googleads.v1.services.KeywordPlanCampaignService/GetKeywordPlanCampaign")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(GetKeywordPlanCampaignRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(KeywordPlanCampaign.getDefaultInstance()))
              .build();
  private static final MethodDescriptor<
          MutateKeywordPlanCampaignsRequest, MutateKeywordPlanCampaignsResponse>
      mutateKeywordPlanCampaignsMethodDescriptor =
          MethodDescriptor
              .<MutateKeywordPlanCampaignsRequest, MutateKeywordPlanCampaignsResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.ads.googleads.v1.services.KeywordPlanCampaignService/MutateKeywordPlanCampaigns")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(MutateKeywordPlanCampaignsRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(MutateKeywordPlanCampaignsResponse.getDefaultInstance()))
              .build();

  private final BackgroundResource backgroundResources;

  private final UnaryCallable<GetKeywordPlanCampaignRequest, KeywordPlanCampaign>
      getKeywordPlanCampaignCallable;
  private final UnaryCallable<MutateKeywordPlanCampaignsRequest, MutateKeywordPlanCampaignsResponse>
      mutateKeywordPlanCampaignsCallable;

  private final GrpcStubCallableFactory callableFactory;

  public static final GrpcKeywordPlanCampaignServiceStub create(
      KeywordPlanCampaignServiceStubSettings settings) throws IOException {
    return new GrpcKeywordPlanCampaignServiceStub(settings, ClientContext.create(settings));
  }

  public static final GrpcKeywordPlanCampaignServiceStub create(ClientContext clientContext)
      throws IOException {
    return new GrpcKeywordPlanCampaignServiceStub(
        KeywordPlanCampaignServiceStubSettings.newBuilder().build(), clientContext);
  }

  public static final GrpcKeywordPlanCampaignServiceStub create(
      ClientContext clientContext, GrpcStubCallableFactory callableFactory) throws IOException {
    return new GrpcKeywordPlanCampaignServiceStub(
        KeywordPlanCampaignServiceStubSettings.newBuilder().build(),
        clientContext,
        callableFactory);
  }

  /**
   * Constructs an instance of GrpcKeywordPlanCampaignServiceStub, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected GrpcKeywordPlanCampaignServiceStub(
      KeywordPlanCampaignServiceStubSettings settings, ClientContext clientContext)
      throws IOException {
    this(settings, clientContext, new GrpcKeywordPlanCampaignServiceCallableFactory());
  }

  /**
   * Constructs an instance of GrpcKeywordPlanCampaignServiceStub, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected GrpcKeywordPlanCampaignServiceStub(
      KeywordPlanCampaignServiceStubSettings settings,
      ClientContext clientContext,
      GrpcStubCallableFactory callableFactory)
      throws IOException {
    this.callableFactory = callableFactory;

    GrpcCallSettings<GetKeywordPlanCampaignRequest, KeywordPlanCampaign>
        getKeywordPlanCampaignTransportSettings =
            GrpcCallSettings.<GetKeywordPlanCampaignRequest, KeywordPlanCampaign>newBuilder()
                .setMethodDescriptor(getKeywordPlanCampaignMethodDescriptor)
                .build();
    GrpcCallSettings<MutateKeywordPlanCampaignsRequest, MutateKeywordPlanCampaignsResponse>
        mutateKeywordPlanCampaignsTransportSettings =
            GrpcCallSettings
                .<MutateKeywordPlanCampaignsRequest, MutateKeywordPlanCampaignsResponse>newBuilder()
                .setMethodDescriptor(mutateKeywordPlanCampaignsMethodDescriptor)
                .build();

    this.getKeywordPlanCampaignCallable =
        callableFactory.createUnaryCallable(
            getKeywordPlanCampaignTransportSettings,
            settings.getKeywordPlanCampaignSettings(),
            clientContext);
    this.mutateKeywordPlanCampaignsCallable =
        callableFactory.createUnaryCallable(
            mutateKeywordPlanCampaignsTransportSettings,
            settings.mutateKeywordPlanCampaignsSettings(),
            clientContext);

    backgroundResources = new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  public UnaryCallable<GetKeywordPlanCampaignRequest, KeywordPlanCampaign>
      getKeywordPlanCampaignCallable() {
    return getKeywordPlanCampaignCallable;
  }

  public UnaryCallable<MutateKeywordPlanCampaignsRequest, MutateKeywordPlanCampaignsResponse>
      mutateKeywordPlanCampaignsCallable() {
    return mutateKeywordPlanCampaignsCallable;
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
