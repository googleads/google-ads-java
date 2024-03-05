/*
 * Copyright 2018 Google LLC
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
package com.google.ads.googleads.lib;

import com.google.ads.googleads.lib.stubs.callables.ExceptionTransformation;
import com.google.ads.googleads.lib.stubs.callables.ExceptionTransformingServerStreamingCallable;
import com.google.ads.googleads.lib.stubs.callables.ExceptionTransformingUnaryCallable;
import com.google.api.gax.grpc.GrpcCallSettings;
import com.google.api.gax.grpc.GrpcCallableFactory;
import com.google.api.gax.grpc.GrpcStubCallableFactory;
import com.google.api.gax.rpc.BatchingCallSettings;
import com.google.api.gax.rpc.BidiStreamingCallable;
import com.google.api.gax.rpc.Callables;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.ClientStreamingCallable;
import com.google.api.gax.rpc.OperationCallSettings;
import com.google.api.gax.rpc.OperationCallable;
import com.google.api.gax.rpc.PagedCallSettings;
import com.google.api.gax.rpc.ServerStreamingCallSettings;
import com.google.api.gax.rpc.ServerStreamingCallable;
import com.google.api.gax.rpc.StreamingCallSettings;
import com.google.api.gax.rpc.UnaryCallSettings;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.longrunning.Operation;
import com.google.longrunning.stub.OperationsStub;
import java.util.Iterator;
import java.util.ServiceLoader;

/**
 * Defines the factory used to create instances for all Google Ads services.
 *
 * <p>Used in place of the default generated code to override the exceptions generated to throw
 * GoogleAdsException instead of ApiException.
 */
public class GrpcGoogleAdsCallableFactory implements GrpcStubCallableFactory {

  private static final ExceptionTransformation googleAdsExceptionTransformation =
      loadExceptionTransformation();

  private static ExceptionTransformation loadExceptionTransformation() {
    ServiceLoader<ExceptionTransformation> loader =
        ServiceLoader.load(ExceptionTransformation.class);
    Iterator<ExceptionTransformation> iterator = loader.iterator();
    if (iterator.hasNext()) {
      return iterator.next();
    }
    // Provides a no-op implementation for unit test purposes.
    // TODO this should probably be configured differently.
    return throwable -> throwable;
  }

  public static <RequestT, ResponseT> UnaryCallable<RequestT, ResponseT> createBaseUnaryCallable(
      GrpcCallSettings<RequestT, ResponseT> grpcCallSettings,
      UnaryCallSettings<?, ?> callSettings,
      ClientContext clientContext) {
    UnaryCallable<RequestT, ResponseT> callable =
        GrpcCallableFactory.createBaseUnaryCallable(grpcCallSettings, callSettings, clientContext);
    return new ExceptionTransformingUnaryCallable<>(
        callable, googleAdsExceptionTransformation, clientContext.getExecutor());
  }

  @Override
  public <RequestT, ResponseT> UnaryCallable<RequestT, ResponseT> createUnaryCallable(
      GrpcCallSettings<RequestT, ResponseT> grpcCallSettings,
      UnaryCallSettings<RequestT, ResponseT> callSettings,
      ClientContext clientContext) {
    UnaryCallable<RequestT, ResponseT> callable =
        createBaseUnaryCallable(grpcCallSettings, callSettings, clientContext);
    return callable.withDefaultCallContext(clientContext.getDefaultCallContext());
  }

  @Override
  public <RequestT, ResponseT, PagedListResponseT>
      UnaryCallable<RequestT, PagedListResponseT> createPagedCallable(
          GrpcCallSettings<RequestT, ResponseT> grpcCallSettings,
          PagedCallSettings<RequestT, ResponseT, PagedListResponseT> pagedCallSettings,
          ClientContext clientContext) {
    UnaryCallable<RequestT, ResponseT> innerCallable =
        createBaseUnaryCallable(grpcCallSettings, pagedCallSettings, clientContext);
    UnaryCallable<RequestT, PagedListResponseT> pagedCallable =
        Callables.paged(innerCallable, pagedCallSettings);
    return pagedCallable.withDefaultCallContext(clientContext.getDefaultCallContext());
  }

  @Override
  public <RequestT, ResponseT> UnaryCallable<RequestT, ResponseT> createBatchingCallable(
      GrpcCallSettings<RequestT, ResponseT> grpcCallSettings,
      BatchingCallSettings<RequestT, ResponseT> batchingCallSettings,
      ClientContext clientContext) {
    UnaryCallable<RequestT, ResponseT> callable =
        createBaseUnaryCallable(grpcCallSettings, batchingCallSettings, clientContext);
    callable = Callables.batching(callable, batchingCallSettings, clientContext);
    return callable.withDefaultCallContext(clientContext.getDefaultCallContext());
  }

  @Override
  public <RequestT, ResponseT, MetadataT>
      OperationCallable<RequestT, ResponseT, MetadataT> createOperationCallable(
          GrpcCallSettings<RequestT, Operation> grpcCallSettings,
          OperationCallSettings<RequestT, ResponseT, MetadataT> operationCallSettings,
          ClientContext clientContext,
          OperationsStub operationsStub) {
    return GrpcCallableFactory.createOperationCallable(
        grpcCallSettings, operationCallSettings, clientContext, operationsStub);
  }

  @Override
  public <RequestT, ResponseT>
      BidiStreamingCallable<RequestT, ResponseT> createBidiStreamingCallable(
          GrpcCallSettings<RequestT, ResponseT> grpcCallSettings,
          StreamingCallSettings<RequestT, ResponseT> streamingCallSettings,
          ClientContext clientContext) {
    return GrpcCallableFactory.createBidiStreamingCallable(
        grpcCallSettings, streamingCallSettings, clientContext);
  }

  @Override
  public <RequestT, ResponseT>
      ServerStreamingCallable<RequestT, ResponseT> createServerStreamingCallable(
          GrpcCallSettings<RequestT, ResponseT> grpcCallSettings,
          ServerStreamingCallSettings<RequestT, ResponseT> streamingCallSettings,
          ClientContext clientContext) {
    ServerStreamingCallable<RequestT, ResponseT> defaultCallable =
        GrpcCallableFactory.createServerStreamingCallable(
            grpcCallSettings, streamingCallSettings, clientContext);
    return new ExceptionTransformingServerStreamingCallable(
        defaultCallable, googleAdsExceptionTransformation);
  }

  @Override
  public <RequestT, ResponseT>
      ClientStreamingCallable<RequestT, ResponseT> createClientStreamingCallable(
          GrpcCallSettings<RequestT, ResponseT> grpcCallSettings,
          StreamingCallSettings<RequestT, ResponseT> streamingCallSettings,
          ClientContext clientContext) {
    return GrpcCallableFactory.createClientStreamingCallable(
        grpcCallSettings, streamingCallSettings, clientContext);
  }
}
