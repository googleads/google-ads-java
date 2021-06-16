/*
 * Copyright 2021 Google LLC
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

package com.google.ads.googleads.v8.services.stub;

import com.google.ads.googleads.v8.resources.AccountLink;
import com.google.ads.googleads.v8.services.CreateAccountLinkRequest;
import com.google.ads.googleads.v8.services.CreateAccountLinkResponse;
import com.google.ads.googleads.v8.services.GetAccountLinkRequest;
import com.google.ads.googleads.v8.services.MutateAccountLinkRequest;
import com.google.ads.googleads.v8.services.MutateAccountLinkResponse;
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
 * gRPC stub implementation for the AccountLinkService service API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by gapic-generator-java")
public class GrpcAccountLinkServiceStub extends AccountLinkServiceStub {
  private static final MethodDescriptor<GetAccountLinkRequest, AccountLink>
      getAccountLinkMethodDescriptor =
          MethodDescriptor.<GetAccountLinkRequest, AccountLink>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.ads.googleads.v8.services.AccountLinkService/GetAccountLink")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(GetAccountLinkRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(AccountLink.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<CreateAccountLinkRequest, CreateAccountLinkResponse>
      createAccountLinkMethodDescriptor =
          MethodDescriptor.<CreateAccountLinkRequest, CreateAccountLinkResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.ads.googleads.v8.services.AccountLinkService/CreateAccountLink")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(CreateAccountLinkRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(CreateAccountLinkResponse.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<MutateAccountLinkRequest, MutateAccountLinkResponse>
      mutateAccountLinkMethodDescriptor =
          MethodDescriptor.<MutateAccountLinkRequest, MutateAccountLinkResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.ads.googleads.v8.services.AccountLinkService/MutateAccountLink")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(MutateAccountLinkRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(MutateAccountLinkResponse.getDefaultInstance()))
              .build();

  private final UnaryCallable<GetAccountLinkRequest, AccountLink> getAccountLinkCallable;
  private final UnaryCallable<CreateAccountLinkRequest, CreateAccountLinkResponse>
      createAccountLinkCallable;
  private final UnaryCallable<MutateAccountLinkRequest, MutateAccountLinkResponse>
      mutateAccountLinkCallable;

  private final BackgroundResource backgroundResources;
  private final GrpcOperationsStub operationsStub;
  private final GrpcStubCallableFactory callableFactory;

  public static final GrpcAccountLinkServiceStub create(AccountLinkServiceStubSettings settings)
      throws IOException {
    return new GrpcAccountLinkServiceStub(settings, ClientContext.create(settings));
  }

  public static final GrpcAccountLinkServiceStub create(ClientContext clientContext)
      throws IOException {
    return new GrpcAccountLinkServiceStub(
        AccountLinkServiceStubSettings.newBuilder().build(), clientContext);
  }

  public static final GrpcAccountLinkServiceStub create(
      ClientContext clientContext, GrpcStubCallableFactory callableFactory) throws IOException {
    return new GrpcAccountLinkServiceStub(
        AccountLinkServiceStubSettings.newBuilder().build(), clientContext, callableFactory);
  }

  /**
   * Constructs an instance of GrpcAccountLinkServiceStub, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected GrpcAccountLinkServiceStub(
      AccountLinkServiceStubSettings settings, ClientContext clientContext) throws IOException {
    this(settings, clientContext, new GrpcAccountLinkServiceCallableFactory());
  }

  /**
   * Constructs an instance of GrpcAccountLinkServiceStub, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected GrpcAccountLinkServiceStub(
      AccountLinkServiceStubSettings settings,
      ClientContext clientContext,
      GrpcStubCallableFactory callableFactory)
      throws IOException {
    this.callableFactory = callableFactory;
    this.operationsStub = GrpcOperationsStub.create(clientContext, callableFactory);

    GrpcCallSettings<GetAccountLinkRequest, AccountLink> getAccountLinkTransportSettings =
        GrpcCallSettings.<GetAccountLinkRequest, AccountLink>newBuilder()
            .setMethodDescriptor(getAccountLinkMethodDescriptor)
            .setParamsExtractor(
                new RequestParamsExtractor<GetAccountLinkRequest>() {
                  @Override
                  public Map<String, String> extract(GetAccountLinkRequest request) {
                    ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                    params.put("resource_name", String.valueOf(request.getResourceName()));
                    return params.build();
                  }
                })
            .build();
    GrpcCallSettings<CreateAccountLinkRequest, CreateAccountLinkResponse>
        createAccountLinkTransportSettings =
            GrpcCallSettings.<CreateAccountLinkRequest, CreateAccountLinkResponse>newBuilder()
                .setMethodDescriptor(createAccountLinkMethodDescriptor)
                .setParamsExtractor(
                    new RequestParamsExtractor<CreateAccountLinkRequest>() {
                      @Override
                      public Map<String, String> extract(CreateAccountLinkRequest request) {
                        ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                        params.put("customer_id", String.valueOf(request.getCustomerId()));
                        return params.build();
                      }
                    })
                .build();
    GrpcCallSettings<MutateAccountLinkRequest, MutateAccountLinkResponse>
        mutateAccountLinkTransportSettings =
            GrpcCallSettings.<MutateAccountLinkRequest, MutateAccountLinkResponse>newBuilder()
                .setMethodDescriptor(mutateAccountLinkMethodDescriptor)
                .setParamsExtractor(
                    new RequestParamsExtractor<MutateAccountLinkRequest>() {
                      @Override
                      public Map<String, String> extract(MutateAccountLinkRequest request) {
                        ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                        params.put("customer_id", String.valueOf(request.getCustomerId()));
                        return params.build();
                      }
                    })
                .build();

    this.getAccountLinkCallable =
        callableFactory.createUnaryCallable(
            getAccountLinkTransportSettings, settings.getAccountLinkSettings(), clientContext);
    this.createAccountLinkCallable =
        callableFactory.createUnaryCallable(
            createAccountLinkTransportSettings,
            settings.createAccountLinkSettings(),
            clientContext);
    this.mutateAccountLinkCallable =
        callableFactory.createUnaryCallable(
            mutateAccountLinkTransportSettings,
            settings.mutateAccountLinkSettings(),
            clientContext);

    this.backgroundResources =
        new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  public GrpcOperationsStub getOperationsStub() {
    return operationsStub;
  }

  @Override
  public UnaryCallable<GetAccountLinkRequest, AccountLink> getAccountLinkCallable() {
    return getAccountLinkCallable;
  }

  @Override
  public UnaryCallable<CreateAccountLinkRequest, CreateAccountLinkResponse>
      createAccountLinkCallable() {
    return createAccountLinkCallable;
  }

  @Override
  public UnaryCallable<MutateAccountLinkRequest, MutateAccountLinkResponse>
      mutateAccountLinkCallable() {
    return mutateAccountLinkCallable;
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
