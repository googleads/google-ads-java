/*
 * Copyright 2022 Google LLC
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

package com.google.ads.googleads.v10.services.stub;

import com.google.ads.googleads.v10.resources.MerchantCenterLink;
import com.google.ads.googleads.v10.services.GetMerchantCenterLinkRequest;
import com.google.ads.googleads.v10.services.ListMerchantCenterLinksRequest;
import com.google.ads.googleads.v10.services.ListMerchantCenterLinksResponse;
import com.google.ads.googleads.v10.services.MutateMerchantCenterLinkRequest;
import com.google.ads.googleads.v10.services.MutateMerchantCenterLinkResponse;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.core.BackgroundResourceAggregation;
import com.google.api.gax.grpc.GrpcCallSettings;
import com.google.api.gax.grpc.GrpcStubCallableFactory;
import com.google.api.gax.rpc.ClientContext;
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
 * gRPC stub implementation for the MerchantCenterLinkService service API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by gapic-generator-java")
public class GrpcMerchantCenterLinkServiceStub extends MerchantCenterLinkServiceStub {
  private static final MethodDescriptor<
          ListMerchantCenterLinksRequest, ListMerchantCenterLinksResponse>
      listMerchantCenterLinksMethodDescriptor =
          MethodDescriptor
              .<ListMerchantCenterLinksRequest, ListMerchantCenterLinksResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.ads.googleads.v10.services.MerchantCenterLinkService/ListMerchantCenterLinks")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(ListMerchantCenterLinksRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(ListMerchantCenterLinksResponse.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<GetMerchantCenterLinkRequest, MerchantCenterLink>
      getMerchantCenterLinkMethodDescriptor =
          MethodDescriptor.<GetMerchantCenterLinkRequest, MerchantCenterLink>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.ads.googleads.v10.services.MerchantCenterLinkService/GetMerchantCenterLink")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(GetMerchantCenterLinkRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(MerchantCenterLink.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<
          MutateMerchantCenterLinkRequest, MutateMerchantCenterLinkResponse>
      mutateMerchantCenterLinkMethodDescriptor =
          MethodDescriptor
              .<MutateMerchantCenterLinkRequest, MutateMerchantCenterLinkResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.ads.googleads.v10.services.MerchantCenterLinkService/MutateMerchantCenterLink")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(MutateMerchantCenterLinkRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(MutateMerchantCenterLinkResponse.getDefaultInstance()))
              .build();

  private final UnaryCallable<ListMerchantCenterLinksRequest, ListMerchantCenterLinksResponse>
      listMerchantCenterLinksCallable;
  private final UnaryCallable<GetMerchantCenterLinkRequest, MerchantCenterLink>
      getMerchantCenterLinkCallable;
  private final UnaryCallable<MutateMerchantCenterLinkRequest, MutateMerchantCenterLinkResponse>
      mutateMerchantCenterLinkCallable;

  private final BackgroundResource backgroundResources;
  private final GrpcOperationsStub operationsStub;
  private final GrpcStubCallableFactory callableFactory;

  public static final GrpcMerchantCenterLinkServiceStub create(
      MerchantCenterLinkServiceStubSettings settings) throws IOException {
    return new GrpcMerchantCenterLinkServiceStub(settings, ClientContext.create(settings));
  }

  public static final GrpcMerchantCenterLinkServiceStub create(ClientContext clientContext)
      throws IOException {
    return new GrpcMerchantCenterLinkServiceStub(
        MerchantCenterLinkServiceStubSettings.newBuilder().build(), clientContext);
  }

  public static final GrpcMerchantCenterLinkServiceStub create(
      ClientContext clientContext, GrpcStubCallableFactory callableFactory) throws IOException {
    return new GrpcMerchantCenterLinkServiceStub(
        MerchantCenterLinkServiceStubSettings.newBuilder().build(), clientContext, callableFactory);
  }

  /**
   * Constructs an instance of GrpcMerchantCenterLinkServiceStub, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected GrpcMerchantCenterLinkServiceStub(
      MerchantCenterLinkServiceStubSettings settings, ClientContext clientContext)
      throws IOException {
    this(settings, clientContext, new GrpcMerchantCenterLinkServiceCallableFactory());
  }

  /**
   * Constructs an instance of GrpcMerchantCenterLinkServiceStub, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected GrpcMerchantCenterLinkServiceStub(
      MerchantCenterLinkServiceStubSettings settings,
      ClientContext clientContext,
      GrpcStubCallableFactory callableFactory)
      throws IOException {
    this.callableFactory = callableFactory;
    this.operationsStub = GrpcOperationsStub.create(clientContext, callableFactory);

    GrpcCallSettings<ListMerchantCenterLinksRequest, ListMerchantCenterLinksResponse>
        listMerchantCenterLinksTransportSettings =
            GrpcCallSettings
                .<ListMerchantCenterLinksRequest, ListMerchantCenterLinksResponse>newBuilder()
                .setMethodDescriptor(listMerchantCenterLinksMethodDescriptor)
                .setParamsExtractor(
                    request -> {
                      ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                      params.put("customer_id", String.valueOf(request.getCustomerId()));
                      return params.build();
                    })
                .build();
    GrpcCallSettings<GetMerchantCenterLinkRequest, MerchantCenterLink>
        getMerchantCenterLinkTransportSettings =
            GrpcCallSettings.<GetMerchantCenterLinkRequest, MerchantCenterLink>newBuilder()
                .setMethodDescriptor(getMerchantCenterLinkMethodDescriptor)
                .setParamsExtractor(
                    request -> {
                      ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                      params.put("resource_name", String.valueOf(request.getResourceName()));
                      return params.build();
                    })
                .build();
    GrpcCallSettings<MutateMerchantCenterLinkRequest, MutateMerchantCenterLinkResponse>
        mutateMerchantCenterLinkTransportSettings =
            GrpcCallSettings
                .<MutateMerchantCenterLinkRequest, MutateMerchantCenterLinkResponse>newBuilder()
                .setMethodDescriptor(mutateMerchantCenterLinkMethodDescriptor)
                .setParamsExtractor(
                    request -> {
                      ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                      params.put("customer_id", String.valueOf(request.getCustomerId()));
                      return params.build();
                    })
                .build();

    this.listMerchantCenterLinksCallable =
        callableFactory.createUnaryCallable(
            listMerchantCenterLinksTransportSettings,
            settings.listMerchantCenterLinksSettings(),
            clientContext);
    this.getMerchantCenterLinkCallable =
        callableFactory.createUnaryCallable(
            getMerchantCenterLinkTransportSettings,
            settings.getMerchantCenterLinkSettings(),
            clientContext);
    this.mutateMerchantCenterLinkCallable =
        callableFactory.createUnaryCallable(
            mutateMerchantCenterLinkTransportSettings,
            settings.mutateMerchantCenterLinkSettings(),
            clientContext);

    this.backgroundResources =
        new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  public GrpcOperationsStub getOperationsStub() {
    return operationsStub;
  }

  @Override
  public UnaryCallable<ListMerchantCenterLinksRequest, ListMerchantCenterLinksResponse>
      listMerchantCenterLinksCallable() {
    return listMerchantCenterLinksCallable;
  }

  @Override
  public UnaryCallable<GetMerchantCenterLinkRequest, MerchantCenterLink>
      getMerchantCenterLinkCallable() {
    return getMerchantCenterLinkCallable;
  }

  @Override
  public UnaryCallable<MutateMerchantCenterLinkRequest, MutateMerchantCenterLinkResponse>
      mutateMerchantCenterLinkCallable() {
    return mutateMerchantCenterLinkCallable;
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
