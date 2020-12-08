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

import com.google.ads.googleads.v6.resources.UserList;
import com.google.ads.googleads.v6.services.GetUserListRequest;
import com.google.ads.googleads.v6.services.MutateUserListsRequest;
import com.google.ads.googleads.v6.services.MutateUserListsResponse;
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
 * gRPC stub implementation for the UserListService service API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by gapic-generator-java")
public class GrpcUserListServiceStub extends UserListServiceStub {
  private static final MethodDescriptor<GetUserListRequest, UserList> getUserListMethodDescriptor =
      MethodDescriptor.<GetUserListRequest, UserList>newBuilder()
          .setType(MethodDescriptor.MethodType.UNARY)
          .setFullMethodName("google.ads.googleads.v6.services.UserListService/GetUserList")
          .setRequestMarshaller(ProtoUtils.marshaller(GetUserListRequest.getDefaultInstance()))
          .setResponseMarshaller(ProtoUtils.marshaller(UserList.getDefaultInstance()))
          .build();

  private static final MethodDescriptor<MutateUserListsRequest, MutateUserListsResponse>
      mutateUserListsMethodDescriptor =
          MethodDescriptor.<MutateUserListsRequest, MutateUserListsResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName("google.ads.googleads.v6.services.UserListService/MutateUserLists")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(MutateUserListsRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(MutateUserListsResponse.getDefaultInstance()))
              .build();

  private final UnaryCallable<GetUserListRequest, UserList> getUserListCallable;
  private final UnaryCallable<MutateUserListsRequest, MutateUserListsResponse>
      mutateUserListsCallable;

  private final BackgroundResource backgroundResources;
  private final GrpcOperationsStub operationsStub;
  private final GrpcStubCallableFactory callableFactory;

  public static final GrpcUserListServiceStub create(UserListServiceStubSettings settings)
      throws IOException {
    return new GrpcUserListServiceStub(settings, ClientContext.create(settings));
  }

  public static final GrpcUserListServiceStub create(ClientContext clientContext)
      throws IOException {
    return new GrpcUserListServiceStub(
        UserListServiceStubSettings.newBuilder().build(), clientContext);
  }

  public static final GrpcUserListServiceStub create(
      ClientContext clientContext, GrpcStubCallableFactory callableFactory) throws IOException {
    return new GrpcUserListServiceStub(
        UserListServiceStubSettings.newBuilder().build(), clientContext, callableFactory);
  }

  protected GrpcUserListServiceStub(
      UserListServiceStubSettings settings, ClientContext clientContext) throws IOException {
    this(settings, clientContext, new GrpcUserListServiceCallableFactory());
  }

  protected GrpcUserListServiceStub(
      UserListServiceStubSettings settings,
      ClientContext clientContext,
      GrpcStubCallableFactory callableFactory)
      throws IOException {
    this.callableFactory = callableFactory;
    this.operationsStub = GrpcOperationsStub.create(clientContext, callableFactory);

    GrpcCallSettings<GetUserListRequest, UserList> getUserListTransportSettings =
        GrpcCallSettings.<GetUserListRequest, UserList>newBuilder()
            .setMethodDescriptor(getUserListMethodDescriptor)
            .setParamsExtractor(
                new RequestParamsExtractor<GetUserListRequest>() {
                  @Override
                  public Map<String, String> extract(GetUserListRequest request) {
                    ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                    params.put("resource_name", String.valueOf(request.getResourceName()));
                    return params.build();
                  }
                })
            .build();
    GrpcCallSettings<MutateUserListsRequest, MutateUserListsResponse>
        mutateUserListsTransportSettings =
            GrpcCallSettings.<MutateUserListsRequest, MutateUserListsResponse>newBuilder()
                .setMethodDescriptor(mutateUserListsMethodDescriptor)
                .setParamsExtractor(
                    new RequestParamsExtractor<MutateUserListsRequest>() {
                      @Override
                      public Map<String, String> extract(MutateUserListsRequest request) {
                        ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                        params.put("customer_id", String.valueOf(request.getCustomerId()));
                        return params.build();
                      }
                    })
                .build();

    this.getUserListCallable =
        callableFactory.createUnaryCallable(
            getUserListTransportSettings, settings.getUserListSettings(), clientContext);
    this.mutateUserListsCallable =
        callableFactory.createUnaryCallable(
            mutateUserListsTransportSettings, settings.mutateUserListsSettings(), clientContext);

    this.backgroundResources =
        new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  public GrpcOperationsStub getOperationsStub() {
    return operationsStub;
  }

  public UnaryCallable<GetUserListRequest, UserList> getUserListCallable() {
    return getUserListCallable;
  }

  public UnaryCallable<MutateUserListsRequest, MutateUserListsResponse> mutateUserListsCallable() {
    return mutateUserListsCallable;
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
