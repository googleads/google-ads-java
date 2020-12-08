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

import com.google.ads.googleads.v6.resources.AccountBudgetProposal;
import com.google.ads.googleads.v6.services.GetAccountBudgetProposalRequest;
import com.google.ads.googleads.v6.services.MutateAccountBudgetProposalRequest;
import com.google.ads.googleads.v6.services.MutateAccountBudgetProposalResponse;
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
 * gRPC stub implementation for the AccountBudgetProposalService service API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by gapic-generator-java")
public class GrpcAccountBudgetProposalServiceStub extends AccountBudgetProposalServiceStub {
  private static final MethodDescriptor<GetAccountBudgetProposalRequest, AccountBudgetProposal>
      getAccountBudgetProposalMethodDescriptor =
          MethodDescriptor.<GetAccountBudgetProposalRequest, AccountBudgetProposal>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.ads.googleads.v6.services.AccountBudgetProposalService/GetAccountBudgetProposal")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(GetAccountBudgetProposalRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(AccountBudgetProposal.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<
          MutateAccountBudgetProposalRequest, MutateAccountBudgetProposalResponse>
      mutateAccountBudgetProposalMethodDescriptor =
          MethodDescriptor
              .<MutateAccountBudgetProposalRequest, MutateAccountBudgetProposalResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.ads.googleads.v6.services.AccountBudgetProposalService/MutateAccountBudgetProposal")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(MutateAccountBudgetProposalRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(MutateAccountBudgetProposalResponse.getDefaultInstance()))
              .build();

  private final UnaryCallable<GetAccountBudgetProposalRequest, AccountBudgetProposal>
      getAccountBudgetProposalCallable;
  private final UnaryCallable<
          MutateAccountBudgetProposalRequest, MutateAccountBudgetProposalResponse>
      mutateAccountBudgetProposalCallable;

  private final BackgroundResource backgroundResources;
  private final GrpcOperationsStub operationsStub;
  private final GrpcStubCallableFactory callableFactory;

  public static final GrpcAccountBudgetProposalServiceStub create(
      AccountBudgetProposalServiceStubSettings settings) throws IOException {
    return new GrpcAccountBudgetProposalServiceStub(settings, ClientContext.create(settings));
  }

  public static final GrpcAccountBudgetProposalServiceStub create(ClientContext clientContext)
      throws IOException {
    return new GrpcAccountBudgetProposalServiceStub(
        AccountBudgetProposalServiceStubSettings.newBuilder().build(), clientContext);
  }

  public static final GrpcAccountBudgetProposalServiceStub create(
      ClientContext clientContext, GrpcStubCallableFactory callableFactory) throws IOException {
    return new GrpcAccountBudgetProposalServiceStub(
        AccountBudgetProposalServiceStubSettings.newBuilder().build(),
        clientContext,
        callableFactory);
  }

  protected GrpcAccountBudgetProposalServiceStub(
      AccountBudgetProposalServiceStubSettings settings, ClientContext clientContext)
      throws IOException {
    this(settings, clientContext, new GrpcAccountBudgetProposalServiceCallableFactory());
  }

  protected GrpcAccountBudgetProposalServiceStub(
      AccountBudgetProposalServiceStubSettings settings,
      ClientContext clientContext,
      GrpcStubCallableFactory callableFactory)
      throws IOException {
    this.callableFactory = callableFactory;
    this.operationsStub = GrpcOperationsStub.create(clientContext, callableFactory);

    GrpcCallSettings<GetAccountBudgetProposalRequest, AccountBudgetProposal>
        getAccountBudgetProposalTransportSettings =
            GrpcCallSettings.<GetAccountBudgetProposalRequest, AccountBudgetProposal>newBuilder()
                .setMethodDescriptor(getAccountBudgetProposalMethodDescriptor)
                .setParamsExtractor(
                    new RequestParamsExtractor<GetAccountBudgetProposalRequest>() {
                      @Override
                      public Map<String, String> extract(GetAccountBudgetProposalRequest request) {
                        ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                        params.put("resource_name", String.valueOf(request.getResourceName()));
                        return params.build();
                      }
                    })
                .build();
    GrpcCallSettings<MutateAccountBudgetProposalRequest, MutateAccountBudgetProposalResponse>
        mutateAccountBudgetProposalTransportSettings =
            GrpcCallSettings
                .<MutateAccountBudgetProposalRequest, MutateAccountBudgetProposalResponse>
                    newBuilder()
                .setMethodDescriptor(mutateAccountBudgetProposalMethodDescriptor)
                .setParamsExtractor(
                    new RequestParamsExtractor<MutateAccountBudgetProposalRequest>() {
                      @Override
                      public Map<String, String> extract(
                          MutateAccountBudgetProposalRequest request) {
                        ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                        params.put("customer_id", String.valueOf(request.getCustomerId()));
                        return params.build();
                      }
                    })
                .build();

    this.getAccountBudgetProposalCallable =
        callableFactory.createUnaryCallable(
            getAccountBudgetProposalTransportSettings,
            settings.getAccountBudgetProposalSettings(),
            clientContext);
    this.mutateAccountBudgetProposalCallable =
        callableFactory.createUnaryCallable(
            mutateAccountBudgetProposalTransportSettings,
            settings.mutateAccountBudgetProposalSettings(),
            clientContext);

    this.backgroundResources =
        new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  public GrpcOperationsStub getOperationsStub() {
    return operationsStub;
  }

  public UnaryCallable<GetAccountBudgetProposalRequest, AccountBudgetProposal>
      getAccountBudgetProposalCallable() {
    return getAccountBudgetProposalCallable;
  }

  public UnaryCallable<MutateAccountBudgetProposalRequest, MutateAccountBudgetProposalResponse>
      mutateAccountBudgetProposalCallable() {
    return mutateAccountBudgetProposalCallable;
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
