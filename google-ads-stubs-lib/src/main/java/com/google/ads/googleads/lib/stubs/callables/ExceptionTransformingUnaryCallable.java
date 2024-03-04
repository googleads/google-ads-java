// Copyright 2018 Google LLC
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.ads.googleads.lib.stubs.callables;

import com.google.api.core.AbstractApiFuture;
import com.google.api.core.ApiFuture;
import com.google.api.core.ApiFutureCallback;
import com.google.api.core.ApiFutures;
import com.google.api.gax.grpc.GrpcCallContext;
import com.google.api.gax.rpc.ApiCallContext;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.common.base.Preconditions;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/**
 * Wrapper around a {@link UnaryCallable} which invokes an {@link ExceptionTransformation} for
 * {@link Throwable}s which occur on the stream.
 *
 * <p>NOTE: This class could be pushed into the gax library, as it is not specific to the Google Ads
 * API.
 */
public class ExceptionTransformingUnaryCallable<RequestT, ResponseT>
    extends UnaryCallable<RequestT, ResponseT> {

  private final UnaryCallable<RequestT, ResponseT> callable;
  private final ExceptionTransformation transformation;
  private final Executor transformationExecutor;

  /**
   * Constructs a new instance. The {@code transformationExecutor} should be the executor for the
   * callable's {@code ClientContext}.
   *
   * @param callable the Callable that may throw an exception.
   * @param transformation the transformation to perform on any thrown exceptions.
   * @param transformationExecutor the Executor to use to execute the {@code transformation}.
   */
  public ExceptionTransformingUnaryCallable(
      UnaryCallable<RequestT, ResponseT> callable,
      ExceptionTransformation transformation,
      Executor transformationExecutor) {
    this.callable = Preconditions.checkNotNull(callable, "Null callable");
    this.transformation = Preconditions.checkNotNull(transformation, "Null transformation");
    this.transformationExecutor =
        Preconditions.checkNotNull(transformationExecutor, "Null transformation executor");
  }

  @Override
  public ApiFuture<ResponseT> futureCall(RequestT request, ApiCallContext inputContext) {
    GrpcCallContext context = GrpcCallContext.createDefault().nullToSelf(inputContext);
    ApiFuture<ResponseT> innerCallFuture = callable.futureCall(request, context);
    ExceptionTransformingFuture transformingFuture =
        new ExceptionTransformingFuture(innerCallFuture);
    ApiFutures.addCallback(innerCallFuture, transformingFuture, transformationExecutor);
    return transformingFuture;
  }

  /** Provides a mechanism to transform exceptions which occur on the inner callable. */
  private class ExceptionTransformingFuture extends AbstractApiFuture<ResponseT>
      implements ApiFutureCallback<ResponseT> {
    private ApiFuture<ResponseT> innerCallFuture;
    private volatile boolean cancelled = false;

    public ExceptionTransformingFuture(ApiFuture<ResponseT> innerCallFuture) {
      this.innerCallFuture = innerCallFuture;
    }

    @Override
    protected void interruptTask() {
      cancelled = true;
      innerCallFuture.cancel(true);
    }

    @Override
    public void onSuccess(ResponseT r) {
      super.set(r);
    }

    @Override
    public void onFailure(Throwable throwable) {
      if (throwable instanceof CancellationException && cancelled) {
        // this just circled around, so ignore.
      } else {
        setException(transformation.transform(throwable));
      }
    }
  }
}
