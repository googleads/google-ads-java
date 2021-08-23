// Copyright 2020 Google LLC
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.ads.googleads.lib.stubs.callables;

import com.google.api.gax.rpc.ApiCallContext;
import com.google.api.gax.rpc.ApiException;
import com.google.api.gax.rpc.ResponseObserver;
import com.google.api.gax.rpc.ServerStreamingCallable;
import com.google.api.gax.rpc.StreamController;

/**
 * Wrapper around a {@link ServerStreamingCallable} which invokes an {@link ExceptionTransformation}
 * for {@link Throwable}s which occur on the stream.
 *
 * <p>NOTE: This class could be pushed into the gax library, as it is not specific to the Google Ads
 * API.
 */
public class ExceptionTransformingServerStreamingCallable<RequestT, ResponseT>
    extends ServerStreamingCallable<RequestT, ResponseT> {

  private final ServerStreamingCallable<RequestT, ResponseT> innerCallable;
  private final ExceptionTransformation exceptionTransformation;

  public ExceptionTransformingServerStreamingCallable(
      ServerStreamingCallable<RequestT, ResponseT> innerCallable,
      ExceptionTransformation exceptionTransformation) {
    this.innerCallable = innerCallable;
    this.exceptionTransformation = exceptionTransformation;
  }

  @Override
  public void call(
      RequestT request, ResponseObserver<ResponseT> responseObserver, ApiCallContext context) {
    innerCallable.call(request, new ExceptionTransformingStreamObserver(responseObserver), context);
  }

  /** Provides a mechanism for transforming any exceptions which occur on the stream. */
  private class ExceptionTransformingStreamObserver implements ResponseObserver<ResponseT> {

    private final ResponseObserver<ResponseT> innerObserver;

    public ExceptionTransformingStreamObserver(ResponseObserver<ResponseT> innerObserver) {
      this.innerObserver = innerObserver;
    }

    @Override
    public void onStart(StreamController controller) {
      innerObserver.onStart(controller);
    }

    @Override
    public void onResponse(ResponseT response) {
      innerObserver.onResponse(response);
    }

    @Override
    public void onError(Throwable t) {
      if (t instanceof ApiException) {
        t = exceptionTransformation.transform(t);
      }
      innerObserver.onError(t);
    }

    @Override
    public void onComplete() {
      innerObserver.onComplete();
    }
  }
}
