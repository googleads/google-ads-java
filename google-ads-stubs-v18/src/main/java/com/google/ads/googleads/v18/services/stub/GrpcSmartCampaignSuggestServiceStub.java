/*
 * Copyright 2024 Google LLC
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

package com.google.ads.googleads.v18.services.stub;

import com.google.ads.googleads.v18.services.SuggestKeywordThemesRequest;
import com.google.ads.googleads.v18.services.SuggestKeywordThemesResponse;
import com.google.ads.googleads.v18.services.SuggestSmartCampaignAdRequest;
import com.google.ads.googleads.v18.services.SuggestSmartCampaignAdResponse;
import com.google.ads.googleads.v18.services.SuggestSmartCampaignBudgetOptionsRequest;
import com.google.ads.googleads.v18.services.SuggestSmartCampaignBudgetOptionsResponse;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.core.BackgroundResourceAggregation;
import com.google.api.gax.grpc.GrpcCallSettings;
import com.google.api.gax.grpc.GrpcStubCallableFactory;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.RequestParamsBuilder;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.longrunning.stub.GrpcOperationsStub;
import io.grpc.MethodDescriptor;
import io.grpc.protobuf.ProtoUtils;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * gRPC stub implementation for the SmartCampaignSuggestService service API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by gapic-generator-java")
public class GrpcSmartCampaignSuggestServiceStub extends SmartCampaignSuggestServiceStub {
  private static final MethodDescriptor<
          SuggestSmartCampaignBudgetOptionsRequest, SuggestSmartCampaignBudgetOptionsResponse>
      suggestSmartCampaignBudgetOptionsMethodDescriptor =
          MethodDescriptor
              .<SuggestSmartCampaignBudgetOptionsRequest, SuggestSmartCampaignBudgetOptionsResponse>
                  newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.ads.googleads.v18.services.SmartCampaignSuggestService/SuggestSmartCampaignBudgetOptions")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(
                      SuggestSmartCampaignBudgetOptionsRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(
                      SuggestSmartCampaignBudgetOptionsResponse.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<
          SuggestSmartCampaignAdRequest, SuggestSmartCampaignAdResponse>
      suggestSmartCampaignAdMethodDescriptor =
          MethodDescriptor
              .<SuggestSmartCampaignAdRequest, SuggestSmartCampaignAdResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.ads.googleads.v18.services.SmartCampaignSuggestService/SuggestSmartCampaignAd")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(SuggestSmartCampaignAdRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(SuggestSmartCampaignAdResponse.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<SuggestKeywordThemesRequest, SuggestKeywordThemesResponse>
      suggestKeywordThemesMethodDescriptor =
          MethodDescriptor.<SuggestKeywordThemesRequest, SuggestKeywordThemesResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.ads.googleads.v18.services.SmartCampaignSuggestService/SuggestKeywordThemes")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(SuggestKeywordThemesRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(SuggestKeywordThemesResponse.getDefaultInstance()))
              .build();

  private final UnaryCallable<
          SuggestSmartCampaignBudgetOptionsRequest, SuggestSmartCampaignBudgetOptionsResponse>
      suggestSmartCampaignBudgetOptionsCallable;
  private final UnaryCallable<SuggestSmartCampaignAdRequest, SuggestSmartCampaignAdResponse>
      suggestSmartCampaignAdCallable;
  private final UnaryCallable<SuggestKeywordThemesRequest, SuggestKeywordThemesResponse>
      suggestKeywordThemesCallable;

  private final BackgroundResource backgroundResources;
  private final GrpcOperationsStub operationsStub;
  private final GrpcStubCallableFactory callableFactory;

  public static final GrpcSmartCampaignSuggestServiceStub create(
      SmartCampaignSuggestServiceStubSettings settings) throws IOException {
    return new GrpcSmartCampaignSuggestServiceStub(settings, ClientContext.create(settings));
  }

  public static final GrpcSmartCampaignSuggestServiceStub create(ClientContext clientContext)
      throws IOException {
    return new GrpcSmartCampaignSuggestServiceStub(
        SmartCampaignSuggestServiceStubSettings.newBuilder().build(), clientContext);
  }

  public static final GrpcSmartCampaignSuggestServiceStub create(
      ClientContext clientContext, GrpcStubCallableFactory callableFactory) throws IOException {
    return new GrpcSmartCampaignSuggestServiceStub(
        SmartCampaignSuggestServiceStubSettings.newBuilder().build(),
        clientContext,
        callableFactory);
  }

  /**
   * Constructs an instance of GrpcSmartCampaignSuggestServiceStub, using the given settings. This
   * is protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected GrpcSmartCampaignSuggestServiceStub(
      SmartCampaignSuggestServiceStubSettings settings, ClientContext clientContext)
      throws IOException {
    this(settings, clientContext, new GrpcSmartCampaignSuggestServiceCallableFactory());
  }

  /**
   * Constructs an instance of GrpcSmartCampaignSuggestServiceStub, using the given settings. This
   * is protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected GrpcSmartCampaignSuggestServiceStub(
      SmartCampaignSuggestServiceStubSettings settings,
      ClientContext clientContext,
      GrpcStubCallableFactory callableFactory)
      throws IOException {
    this.callableFactory = callableFactory;
    this.operationsStub = GrpcOperationsStub.create(clientContext, callableFactory);

    GrpcCallSettings<
            SuggestSmartCampaignBudgetOptionsRequest, SuggestSmartCampaignBudgetOptionsResponse>
        suggestSmartCampaignBudgetOptionsTransportSettings =
            GrpcCallSettings
                .<SuggestSmartCampaignBudgetOptionsRequest,
                    SuggestSmartCampaignBudgetOptionsResponse>
                    newBuilder()
                .setMethodDescriptor(suggestSmartCampaignBudgetOptionsMethodDescriptor)
                .setParamsExtractor(
                    request -> {
                      RequestParamsBuilder builder = RequestParamsBuilder.create();
                      builder.add("customer_id", String.valueOf(request.getCustomerId()));
                      return builder.build();
                    })
                .build();
    GrpcCallSettings<SuggestSmartCampaignAdRequest, SuggestSmartCampaignAdResponse>
        suggestSmartCampaignAdTransportSettings =
            GrpcCallSettings
                .<SuggestSmartCampaignAdRequest, SuggestSmartCampaignAdResponse>newBuilder()
                .setMethodDescriptor(suggestSmartCampaignAdMethodDescriptor)
                .setParamsExtractor(
                    request -> {
                      RequestParamsBuilder builder = RequestParamsBuilder.create();
                      builder.add("customer_id", String.valueOf(request.getCustomerId()));
                      return builder.build();
                    })
                .build();
    GrpcCallSettings<SuggestKeywordThemesRequest, SuggestKeywordThemesResponse>
        suggestKeywordThemesTransportSettings =
            GrpcCallSettings.<SuggestKeywordThemesRequest, SuggestKeywordThemesResponse>newBuilder()
                .setMethodDescriptor(suggestKeywordThemesMethodDescriptor)
                .setParamsExtractor(
                    request -> {
                      RequestParamsBuilder builder = RequestParamsBuilder.create();
                      builder.add("customer_id", String.valueOf(request.getCustomerId()));
                      return builder.build();
                    })
                .build();

    this.suggestSmartCampaignBudgetOptionsCallable =
        callableFactory.createUnaryCallable(
            suggestSmartCampaignBudgetOptionsTransportSettings,
            settings.suggestSmartCampaignBudgetOptionsSettings(),
            clientContext);
    this.suggestSmartCampaignAdCallable =
        callableFactory.createUnaryCallable(
            suggestSmartCampaignAdTransportSettings,
            settings.suggestSmartCampaignAdSettings(),
            clientContext);
    this.suggestKeywordThemesCallable =
        callableFactory.createUnaryCallable(
            suggestKeywordThemesTransportSettings,
            settings.suggestKeywordThemesSettings(),
            clientContext);

    this.backgroundResources =
        new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  public GrpcOperationsStub getOperationsStub() {
    return operationsStub;
  }

  @Override
  public UnaryCallable<
          SuggestSmartCampaignBudgetOptionsRequest, SuggestSmartCampaignBudgetOptionsResponse>
      suggestSmartCampaignBudgetOptionsCallable() {
    return suggestSmartCampaignBudgetOptionsCallable;
  }

  @Override
  public UnaryCallable<SuggestSmartCampaignAdRequest, SuggestSmartCampaignAdResponse>
      suggestSmartCampaignAdCallable() {
    return suggestSmartCampaignAdCallable;
  }

  @Override
  public UnaryCallable<SuggestKeywordThemesRequest, SuggestKeywordThemesResponse>
      suggestKeywordThemesCallable() {
    return suggestKeywordThemesCallable;
  }

  @Override
  public final void close() {
    try {
      backgroundResources.close();
    } catch (RuntimeException e) {
      throw e;
    } catch (Exception e) {
      throw new IllegalStateException("Failed to close resource", e);
    }
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
