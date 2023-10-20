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

package com.google.ads.googleads.lib.callables;

import static org.mockito.ArgumentMatchers.argThat;
import static org.mockito.Mockito.verify;

import com.google.ads.googleads.lib.stubs.callables.ExceptionTransformingServerStreamingCallable;
import com.google.api.gax.grpc.GrpcCallContext;
import com.google.api.gax.rpc.ApiCallContext;
import com.google.api.gax.rpc.ResponseObserver;
import com.google.api.gax.rpc.ServerStreamingCallable;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

@RunWith(Parameterized.class)
public class ExceptionTransformingServerStreamingCallableTest {
  private static final Object request = "test";
  private static final ApiCallContext context = GrpcCallContext.createDefault();

  private final ExceptionCase exceptionCase;
  private MockServerStreamingCallable innerCallable;
  private ExceptionTransformingServerStreamingCallable<Object, Object> serverStreamingCallable;

  @Mock public ResponseObserver<Object> innerObserver;

  @Parameters(name = "{0}")
  public static Iterable<Object[]> params() {
    return ExceptionCase.getCasesForParameterized();
  }

  public ExceptionTransformingServerStreamingCallableTest(
      String name, ExceptionCase exceptionCase) {
    this.exceptionCase = exceptionCase;
  }

  @Before
  public void setup() {
    MockitoAnnotations.initMocks(this);
    // Sets up mock callable to abstract away gRPC.
    this.innerCallable = new MockServerStreamingCallable();
    // Creates the instances to be tested.
    this.serverStreamingCallable =
        new ExceptionTransformingServerStreamingCallable(
            innerCallable, new GoogleAdsExceptionTransformation());
  }

  @Test
  public void simulatedException_matchesExpectations() {
    // Starts the call.
    serverStreamingCallable.call(request, innerObserver, context);
    // Simulates the call failing due to an ads backend error.
    innerCallable.setException(exceptionCase.getInputThrowable());
    // Ensures that our GoogleAdsFailure was passed to the ResponseObserver.
    verify(innerObserver).onError(argThat(exceptionCase));
  }

  /** Mocks out gRPC so we can artificially generate RPC failures. */
  private static class MockServerStreamingCallable<RequestT, ResponseT>
      extends ServerStreamingCallable<RequestT, ResponseT> {

    private ResponseObserver<ResponseT> responseObserver;

    @Override
    public void call(
        RequestT request, ResponseObserver<ResponseT> responseObserver, ApiCallContext context) {
      this.responseObserver = responseObserver;
    }

    /** Injects an exception to the call. */
    void setException(Throwable t) {
      responseObserver.onError(t);
    }
  }
}
