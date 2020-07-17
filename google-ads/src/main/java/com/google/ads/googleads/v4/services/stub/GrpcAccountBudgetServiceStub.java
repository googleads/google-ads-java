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

import com.google.ads.googleads.v4.resources.AccountBudget;
import com.google.ads.googleads.v4.services.GetAccountBudgetRequest;
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
public class GrpcAccountBudgetServiceStub extends AccountBudgetServiceStub {

  private static final MethodDescriptor<GetAccountBudgetRequest, AccountBudget>
      getAccountBudgetMethodDescriptor =
          MethodDescriptor.<GetAccountBudgetRequest, AccountBudget>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.ads.googleads.v4.services.AccountBudgetService/GetAccountBudget")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(GetAccountBudgetRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(AccountBudget.getDefaultInstance()))
              .build();

  private final BackgroundResource backgroundResources;

  private final UnaryCallable<GetAccountBudgetRequest, AccountBudget> getAccountBudgetCallable;

  private final GrpcStubCallableFactory callableFactory;

  public static final GrpcAccountBudgetServiceStub create(AccountBudgetServiceStubSettings settings)
      throws IOException {
    return new GrpcAccountBudgetServiceStub(settings, ClientContext.create(settings));
  }

  public static final GrpcAccountBudgetServiceStub create(ClientContext clientContext)
      throws IOException {
    return new GrpcAccountBudgetServiceStub(
        AccountBudgetServiceStubSettings.newBuilder().build(), clientContext);
  }

  public static final GrpcAccountBudgetServiceStub create(
      ClientContext clientContext, GrpcStubCallableFactory callableFactory) throws IOException {
    return new GrpcAccountBudgetServiceStub(
        AccountBudgetServiceStubSettings.newBuilder().build(), clientContext, callableFactory);
  }

  /**
   * Constructs an instance of GrpcAccountBudgetServiceStub, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected GrpcAccountBudgetServiceStub(
      AccountBudgetServiceStubSettings settings, ClientContext clientContext) throws IOException {
    this(settings, clientContext, new GrpcAccountBudgetServiceCallableFactory());
  }

  /**
   * Constructs an instance of GrpcAccountBudgetServiceStub, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected GrpcAccountBudgetServiceStub(
      AccountBudgetServiceStubSettings settings,
      ClientContext clientContext,
      GrpcStubCallableFactory callableFactory)
      throws IOException {
    this.callableFactory = callableFactory;

    GrpcCallSettings<GetAccountBudgetRequest, AccountBudget> getAccountBudgetTransportSettings =
        GrpcCallSettings.<GetAccountBudgetRequest, AccountBudget>newBuilder()
            .setMethodDescriptor(getAccountBudgetMethodDescriptor)
            .setParamsExtractor(
                new RequestParamsExtractor<GetAccountBudgetRequest>() {
                  @Override
                  public Map<String, String> extract(GetAccountBudgetRequest request) {
                    ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                    params.put("resource_name", String.valueOf(request.getResourceName()));
                    return params.build();
                  }
                })
            .build();

    this.getAccountBudgetCallable =
        callableFactory.createUnaryCallable(
            getAccountBudgetTransportSettings, settings.getAccountBudgetSettings(), clientContext);

    backgroundResources = new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  public UnaryCallable<GetAccountBudgetRequest, AccountBudget> getAccountBudgetCallable() {
    return getAccountBudgetCallable;
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
