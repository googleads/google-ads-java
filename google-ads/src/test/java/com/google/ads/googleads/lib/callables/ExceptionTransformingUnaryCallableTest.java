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

import static org.junit.Assert.fail;
import static org.mockito.Mockito.when;

import com.google.ads.googleads.lib.stubs.callables.ExceptionTransformingUnaryCallable;
import com.google.api.core.ApiFuture;
import com.google.api.core.SettableApiFuture;
import com.google.api.gax.grpc.GrpcCallContext;
import com.google.api.gax.rpc.ApiCallContext;
import com.google.api.gax.rpc.UnaryCallable;
import java.util.concurrent.ExecutionException;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

@RunWith(Parameterized.class)
public class ExceptionTransformingUnaryCallableTest {
  private static final Object request = "test";
  private static final ApiCallContext callContext = GrpcCallContext.createDefault();

  private final ExceptionCase exceptionCase;
  private ExceptionTransformingUnaryCallable callable;
  private SettableApiFuture<Object> innerFuture;

  @Mock public UnaryCallable mockCallable;

  @Parameters(name = "{0}")
  public static Iterable<Object[]> params() {
    return ExceptionCase.getCasesForParameterized();
  }

  public ExceptionTransformingUnaryCallableTest(String name, ExceptionCase exceptionCase) {
    this.exceptionCase = exceptionCase;
  }

  @Before
  public void setup() {
    MockitoAnnotations.initMocks(this);
    // Sets up the class we're going to test.
    callable =
        new ExceptionTransformingUnaryCallable(
            mockCallable, new GoogleAdsExceptionTransformation());

    // Mocks out the gRPC callable implementation.
    innerFuture = SettableApiFuture.create();
    when(mockCallable.futureCall(request, callContext)).thenReturn(innerFuture);
  }

  @Test
  public void simulatedException_matchesExpectations() throws InterruptedException {
    // Invokes the async callable.
    ApiFuture actualFuture = callable.futureCall(request, GrpcCallContext.createDefault());
    // Simulates a failure of the underlying RPC.
    innerFuture.setException(exceptionCase.getInputThrowable());
    try {
      // Attempts to get the RPC result.
      actualFuture.get();
      // Expects this to fail.
      fail();
    } catch (ExecutionException ex) {
      exceptionCase.matches(ex.getCause());
    }
  }
}
