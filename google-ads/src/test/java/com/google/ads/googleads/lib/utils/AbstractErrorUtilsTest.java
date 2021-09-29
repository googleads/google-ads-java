// Copyright 2019 Google LLC
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     https://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.ads.googleads.lib.utils;

import static org.junit.Assert.assertEquals;

import com.google.ads.googleads.lib.test.errors.Int64Value;
import com.google.ads.googleads.lib.test.errors.MockError;
import com.google.ads.googleads.lib.test.errors.MockFailure;
import com.google.ads.googleads.lib.test.errors.MockPath;
import com.google.protobuf.Any;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.rpc.Status;
import java.util.List;
import java.util.Optional;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class AbstractErrorUtilsTest {

  private final String operationsFieldName;
  private final TestImpl impl = new TestImpl();

  public AbstractErrorUtilsTest(String operationsFieldName) {
    this.operationsFieldName = operationsFieldName;
  }

  @Parameterized.Parameters
  public static String[] parameters() {
    return new String[] {"operations", "mutate_operations"};
  }

  @Test
  public void getGoogleAdsErrors_includesWhen_operationSet() throws InvalidProtocolBufferException {
    MockPath path =
        MockPath.newBuilder()
            .setIndex(Int64Value.newBuilder().setValue(0))
            .setFieldName(operationsFieldName)
            .build();
    MockError error = MockError.newBuilder().addLocation(path).build();
    MockFailure failure = MockFailure.newBuilder().addErrors(error).build();
    Status status = Status.newBuilder().addDetails(Any.pack(failure)).build();
    List<MockError> result = impl.getGoogleAdsErrors(0, status);
    assertEquals(1, result.size());
    assertEquals(error, result.get(0));
  }

  @Test
  public void getGoogleAdsErrors_omitsWhen_operationNotSet() throws InvalidProtocolBufferException {
    MockPath path = MockPath.newBuilder().setFieldName("someotherfield").build();
    MockError error = MockError.newBuilder().addLocation(path).build();
    MockFailure failure = MockFailure.newBuilder().addErrors(error).build();
    Status status = Status.newBuilder().addDetails(Any.pack(failure)).build();
    List<MockError> result = impl.getGoogleAdsErrors(0, status);
    assertEquals(0, result.size());
  }

  @Test
  public void getGoogleAdsErrors_omitsWhen_missingIndex() throws InvalidProtocolBufferException {
    MockPath path = MockPath.newBuilder().setFieldName(operationsFieldName).build();
    MockError error = MockError.newBuilder().addLocation(path).build();
    MockFailure failure = MockFailure.newBuilder().addErrors(error).build();
    Status status = Status.newBuilder().addDetails(Any.pack(failure)).build();
    List<MockError> result = impl.getGoogleAdsErrors(0, status);
    assertEquals(0, result.size());
  }

  @Test
  public void getGoogleAdsErrors_omitsWhen_missingFieldName()
      throws InvalidProtocolBufferException {
    MockPath path =
        MockPath.newBuilder().setIndex(Int64Value.newBuilder().setValue(0).build()).build();
    MockError error = MockError.newBuilder().addLocation(path).build();
    MockFailure failure = MockFailure.newBuilder().addErrors(error).build();
    Status status = Status.newBuilder().addDetails(Any.pack(failure)).build();
    List<MockError> result = impl.getGoogleAdsErrors(0, status);
    assertEquals(0, result.size());
  }

  @Test
  public void getGoogleAdsErrors_omitsWhen_operationIndexOutOfSequenceInPaths()
      throws InvalidProtocolBufferException {
    MockPath path0 = MockPath.newBuilder().setFieldName("someotherfield").build();
    MockPath path1 =
        MockPath.newBuilder()
            .setIndex(Int64Value.newBuilder().setValue(0))
            .setFieldName(operationsFieldName)
            .build();
    MockError error = MockError.newBuilder().addLocation(path0).addLocation(path1).build();
    MockFailure failure = MockFailure.newBuilder().addErrors(error).build();
    Status status = Status.newBuilder().addDetails(Any.pack(failure)).build();
    List<MockError> result = impl.getGoogleAdsErrors(0, status);
    assertEquals(0, result.size());
  }

  @Test
  public void getGoogleAdsErrors_includesWhen_operationIndexOutOfSequenceInErrors()
      throws InvalidProtocolBufferException {
    MockPath path0 =
        MockPath.newBuilder()
            .setIndex(Int64Value.newBuilder().setValue(0))
            .setFieldName(operationsFieldName)
            .build();
    MockPath path1 =
        MockPath.newBuilder()
            .setIndex(Int64Value.newBuilder().setValue(1))
            .setFieldName(operationsFieldName)
            .build();
    MockError error0 = MockError.newBuilder().addLocation(path0).build();
    MockError error1 = MockError.newBuilder().addLocation(path1).build();
    // Swap the order of the errors.
    MockFailure failure = MockFailure.newBuilder().addErrors(error1).addErrors(error0).build();
    Status status = Status.newBuilder().addDetails(Any.pack(failure)).build();
    List<MockError> result = impl.getGoogleAdsErrors(0, status);
    assertEquals(1, result.size());
    assertEquals(error0, result.get(0));
  }

  @Test
  public void getGoogleAdsErrors_noDuplicates_ofSameError() throws InvalidProtocolBufferException {
    MockPath path0 =
        MockPath.newBuilder()
            .setIndex(Int64Value.newBuilder().setValue(0))
            .setFieldName(operationsFieldName)
            .build();
    MockPath path1 =
        MockPath.newBuilder()
            .setIndex(Int64Value.newBuilder().setValue(0))
            .setFieldName(operationsFieldName)
            .build();
    MockError error0 = MockError.newBuilder().addLocation(path0).build();
    MockError error1 = MockError.newBuilder().addLocation(path1).build();
    MockFailure failure = MockFailure.newBuilder().addErrors(error0).addErrors(error1).build();
    Status status = Status.newBuilder().addDetails(Any.pack(failure)).build();
    List<MockError> result = impl.getGoogleAdsErrors(0, status);
    assertEquals(1, result.size());
    assertEquals(error0, result.get(0));
  }

  @Test
  public void getGoogleAdsErrors_duplicates_whenErrorsDiffer()
      throws InvalidProtocolBufferException {
    MockPath path0 =
        MockPath.newBuilder()
            .setIndex(Int64Value.newBuilder().setValue(0))
            .setFieldName(operationsFieldName)
            .build();
    MockPath path1 =
        MockPath.newBuilder()
            .setIndex(Int64Value.newBuilder().setValue(0))
            .setFieldName(operationsFieldName)
            .build();
    MockPath path2 = MockPath.newBuilder().setFieldName("somethingelse").build();
    MockError error0 = MockError.newBuilder().addLocation(path0).build();
    MockError error1 = MockError.newBuilder().addLocation(path1).addLocation(path2).build();
    // Swap the order of the errors.
    MockFailure failure = MockFailure.newBuilder().addErrors(error0).addErrors(error1).build();
    Status status = Status.newBuilder().addDetails(Any.pack(failure)).build();
    List<MockError> result = impl.getGoogleAdsErrors(0, status);
    assertEquals(2, result.size());
    assertEquals(error0, result.get(0));
    assertEquals(error1, result.get(1));
  }

  @Test
  public void getFailedOperationIndices_returnsOperation() {
    MockPath path0 =
        MockPath.newBuilder()
            .setIndex(Int64Value.newBuilder().setValue(123))
            .setFieldName(operationsFieldName)
            .build();
    MockError error0 = MockError.newBuilder().addLocation(path0).build();
    MockFailure failure = MockFailure.newBuilder().addErrors(error0).build();
    List<Long> result = impl.getFailedOperationIndices(failure);
    assertEquals(1, result.size());
    assertEquals(123L, (long) result.get(0));
  }

  @Test
  public void getFailedOperationIndices_removesDuplicates() {
    MockPath path0 =
        MockPath.newBuilder()
            .setIndex(Int64Value.newBuilder().setValue(123))
            .setFieldName(operationsFieldName)
            .build();
    MockPath path1 =
        MockPath.newBuilder()
            .setIndex(Int64Value.newBuilder().setValue(123))
            .setFieldName(operationsFieldName)
            .build();
    MockError error0 = MockError.newBuilder().addLocation(path0).build();
    MockError error1 = MockError.newBuilder().addLocation(path1).build();
    MockFailure failure = MockFailure.newBuilder().addErrors(error0).addErrors(error1).build();
    List<Long> result = impl.getFailedOperationIndices(failure);
    assertEquals(1, result.size());
    assertEquals(123L, (long) result.get(0));
  }

  @Test
  public void getFailedOperationIndices_ignoresNonOperationErrors() {
    MockPath path0 =
        MockPath.newBuilder()
            .setIndex(Int64Value.newBuilder().setValue(123))
            .setFieldName("someotherfield")
            .build();
    MockError error0 = MockError.newBuilder().addLocation(path0).build();
    MockFailure failure = MockFailure.newBuilder().addErrors(error0).build();
    List<Long> result = impl.getFailedOperationIndices(failure);
    assertEquals(0, result.size());
  }

  // We do want a dummy here for the version specific code, rather than a mock, so we can test the
  // base class methods.
  private static class TestImpl extends AbstractErrorUtils<MockFailure, MockError, MockPath> {

    @Override
    public List<MockPath> getFieldPathElements(MockError googleAdsError) {
      return googleAdsError.getLocationList();
    }

    @Override
    public List<MockError> getGoogleAdsErrors(MockFailure googleAdsFailure) {
      return googleAdsFailure.getErrorsList();
    }

    @Override
    public Class<MockFailure> getGoogleAdsFailureClass() {
      return MockFailure.class;
    }

    @Override
    protected ErrorPath<MockError> createErrorPath(MockError error, MockPath errorLocation) {
      return new ErrorPath(
          error,
          errorLocation.getFieldName(),
          Optional.ofNullable(
              errorLocation.hasIndex() ? errorLocation.getIndex().getValue() : null));
    }
  }
}
