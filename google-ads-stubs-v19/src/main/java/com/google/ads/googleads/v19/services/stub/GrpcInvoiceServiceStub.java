/*
 * Copyright 2025 Google LLC
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

package com.google.ads.googleads.v19.services.stub;

import com.google.ads.googleads.v19.services.ListInvoicesRequest;
import com.google.ads.googleads.v19.services.ListInvoicesResponse;
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
 * gRPC stub implementation for the InvoiceService service API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by gapic-generator-java")
public class GrpcInvoiceServiceStub extends InvoiceServiceStub {
  private static final MethodDescriptor<ListInvoicesRequest, ListInvoicesResponse>
      listInvoicesMethodDescriptor =
          MethodDescriptor.<ListInvoicesRequest, ListInvoicesResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName("google.ads.googleads.v19.services.InvoiceService/ListInvoices")
              .setRequestMarshaller(ProtoUtils.marshaller(ListInvoicesRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(ListInvoicesResponse.getDefaultInstance()))
              .build();

  private final UnaryCallable<ListInvoicesRequest, ListInvoicesResponse> listInvoicesCallable;

  private final BackgroundResource backgroundResources;
  private final GrpcOperationsStub operationsStub;
  private final GrpcStubCallableFactory callableFactory;

  public static final GrpcInvoiceServiceStub create(InvoiceServiceStubSettings settings)
      throws IOException {
    return new GrpcInvoiceServiceStub(settings, ClientContext.create(settings));
  }

  public static final GrpcInvoiceServiceStub create(ClientContext clientContext)
      throws IOException {
    return new GrpcInvoiceServiceStub(
        InvoiceServiceStubSettings.newBuilder().build(), clientContext);
  }

  public static final GrpcInvoiceServiceStub create(
      ClientContext clientContext, GrpcStubCallableFactory callableFactory) throws IOException {
    return new GrpcInvoiceServiceStub(
        InvoiceServiceStubSettings.newBuilder().build(), clientContext, callableFactory);
  }

  /**
   * Constructs an instance of GrpcInvoiceServiceStub, using the given settings. This is protected
   * so that it is easy to make a subclass, but otherwise, the static factory methods should be
   * preferred.
   */
  protected GrpcInvoiceServiceStub(InvoiceServiceStubSettings settings, ClientContext clientContext)
      throws IOException {
    this(settings, clientContext, new GrpcInvoiceServiceCallableFactory());
  }

  /**
   * Constructs an instance of GrpcInvoiceServiceStub, using the given settings. This is protected
   * so that it is easy to make a subclass, but otherwise, the static factory methods should be
   * preferred.
   */
  protected GrpcInvoiceServiceStub(
      InvoiceServiceStubSettings settings,
      ClientContext clientContext,
      GrpcStubCallableFactory callableFactory)
      throws IOException {
    this.callableFactory = callableFactory;
    this.operationsStub = GrpcOperationsStub.create(clientContext, callableFactory);

    GrpcCallSettings<ListInvoicesRequest, ListInvoicesResponse> listInvoicesTransportSettings =
        GrpcCallSettings.<ListInvoicesRequest, ListInvoicesResponse>newBuilder()
            .setMethodDescriptor(listInvoicesMethodDescriptor)
            .setParamsExtractor(
                request -> {
                  RequestParamsBuilder builder = RequestParamsBuilder.create();
                  builder.add("customer_id", String.valueOf(request.getCustomerId()));
                  return builder.build();
                })
            .build();

    this.listInvoicesCallable =
        callableFactory.createUnaryCallable(
            listInvoicesTransportSettings, settings.listInvoicesSettings(), clientContext);

    this.backgroundResources =
        new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  public GrpcOperationsStub getOperationsStub() {
    return operationsStub;
  }

  @Override
  public UnaryCallable<ListInvoicesRequest, ListInvoicesResponse> listInvoicesCallable() {
    return listInvoicesCallable;
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
