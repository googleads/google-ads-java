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

import static com.google.ads.googleads.lib.utils.AbstractErrorUtils.ErrorPath.OPERATION_FIELD_NAMES;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import com.google.ads.googleads.lib.GoogleAdsAllVersions;
import com.google.ads.googleads.lib.test.errors.MockError;
import com.google.ads.googleads.lib.test.errors.MockFailure;
import com.google.ads.googleads.lib.test.errors.MockPath;
import com.google.ads.googleads.lib.utils.AbstractErrorUtils.ErrorPath;
import com.google.ads.googleads.v22.services.GenerateAdGroupThemesRequest;
import com.google.ads.googleads.v22.services.GenerateAudienceCompositionInsightsRequest;
import com.google.ads.googleads.v22.services.GenerateAudienceOverlapInsightsRequest;
import com.google.ads.googleads.v22.services.GenerateCreatorInsightsRequest;
import com.google.ads.googleads.v22.services.GenerateImagesRequest;
import com.google.ads.googleads.v22.services.GenerateKeywordHistoricalMetricsRequest;
import com.google.ads.googleads.v22.services.GenerateKeywordIdeasRequest;
import com.google.ads.googleads.v22.services.GenerateReachForecastRequest;
import com.google.ads.googleads.v22.services.GenerateRecommendationsRequest;
import com.google.ads.googleads.v22.services.GenerateShareablePreviewsRequest;
import com.google.ads.googleads.v22.services.GenerateTargetingSuggestionMetricsRequest;
import com.google.ads.googleads.v22.services.GenerateTextRequest;
import com.google.ads.googleads.v22.services.GraduateExperimentRequest;
import com.google.ads.googleads.v22.services.ListAudienceInsightsAttributesRequest;
import com.google.ads.googleads.v22.services.ListPlannableUserInterestsRequest;
import com.google.ads.googleads.v22.services.RemoveAutomaticallyCreatedAssetsRequest;
import com.google.ads.googleads.v22.services.SuggestBrandsRequest;
import com.google.ads.googleads.v22.services.SuggestTravelAssetsRequest;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Multimap;
import com.google.common.collect.Multimaps;
import com.google.protobuf.Any;
import com.google.protobuf.Descriptors.Descriptor;
import com.google.protobuf.Descriptors.FieldDescriptor;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.rpc.Status;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;
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

  @Parameterized.Parameters(name = "operationsFieldName={0}")
  public static String[] parameters() {
    return OPERATION_FIELD_NAMES.toArray(new String[0]);
  }

  @Test
  public void getGoogleAdsErrors_includesWhen_operationSet() throws InvalidProtocolBufferException {
    MockPath path = MockPath.newBuilder().setIndex(0).setFieldName(operationsFieldName).build();
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
    MockPath path = MockPath.newBuilder().setIndex(0).build();
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
    MockPath path1 = MockPath.newBuilder().setIndex(0).setFieldName(operationsFieldName).build();
    MockError error = MockError.newBuilder().addLocation(path0).addLocation(path1).build();
    MockFailure failure = MockFailure.newBuilder().addErrors(error).build();
    Status status = Status.newBuilder().addDetails(Any.pack(failure)).build();
    List<MockError> result = impl.getGoogleAdsErrors(0, status);
    assertEquals(0, result.size());
  }

  @Test
  public void getGoogleAdsErrors_includesWhen_operationIndexOutOfSequenceInErrors()
      throws InvalidProtocolBufferException {
    MockPath path0 = MockPath.newBuilder().setIndex(0).setFieldName(operationsFieldName).build();
    MockPath path1 = MockPath.newBuilder().setIndex(1).setFieldName(operationsFieldName).build();
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
    MockPath path0 = MockPath.newBuilder().setIndex(0).setFieldName(operationsFieldName).build();
    MockPath path1 = MockPath.newBuilder().setIndex(0).setFieldName(operationsFieldName).build();
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
    MockPath path0 = MockPath.newBuilder().setIndex(0).setFieldName(operationsFieldName).build();
    MockPath path1 = MockPath.newBuilder().setIndex(0).setFieldName(operationsFieldName).build();
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
    MockPath path0 = MockPath.newBuilder().setIndex(123).setFieldName(operationsFieldName).build();
    MockError error0 = MockError.newBuilder().addLocation(path0).build();
    MockFailure failure = MockFailure.newBuilder().addErrors(error0).build();
    List<Long> result = impl.getFailedOperationIndices(failure);
    assertEquals(1, result.size());
    assertEquals(123L, (long) result.get(0));
  }

  @Test
  public void getFailedOperationIndices_removesDuplicates() {
    MockPath path0 = MockPath.newBuilder().setIndex(123).setFieldName(operationsFieldName).build();
    MockPath path1 = MockPath.newBuilder().setIndex(123).setFieldName(operationsFieldName).build();
    MockError error0 = MockError.newBuilder().addLocation(path0).build();
    MockError error1 = MockError.newBuilder().addLocation(path1).build();
    MockFailure failure = MockFailure.newBuilder().addErrors(error0).addErrors(error1).build();
    List<Long> result = impl.getFailedOperationIndices(failure);
    assertEquals(1, result.size());
    assertEquals(123L, (long) result.get(0));
  }

  @Test
  public void getFailedOperationIndices_ignoresNonOperationErrors() {
    MockPath path0 = MockPath.newBuilder().setIndex(123).setFieldName("someotherfield").build();
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
      return new ErrorPath<>(
          error,
          errorLocation.getFieldName(),
          Optional.ofNullable(errorLocation.hasIndex() ? errorLocation.getIndex() : null));
    }
  }

  /**
   * Identifies any request type with a field that potentially contains a list of operations, but
   * the field is not handled by the utility methods in {@link ErrorPath} that identify the portion
   * of the path that contains an operation index.
   *
   * <p>The intent of this test is to automatically alert library owners when a change in the API
   * necessitates updating the error utility.
   */
  @Test
  public void ensureAllOperationFieldNamesDetected() throws NoSuchMethodException {
    // NOTE: This test uses certain assumptions in combination with protobuf descriptor inspection
    // to try to find potential problems introduced by new request types. If this test fails, review
    // the detailed failure message for next steps.

    // The set of request descriptors for known special cases where the request has repeated fields
    // but does not contain an operations collection.
    final Set<Descriptor> requestDescriptorsToIgnore =
        ImmutableSet.<Descriptor>builder()
            .add(ListAudienceInsightsAttributesRequest.getDescriptor())
            .add(GenerateAudienceCompositionInsightsRequest.getDescriptor())
            .add(GenerateAudienceOverlapInsightsRequest.getDescriptor())
            .add(SuggestBrandsRequest.getDescriptor())
            .add(GenerateKeywordIdeasRequest.getDescriptor())
            .add(GenerateKeywordHistoricalMetricsRequest.getDescriptor())
            .add(GenerateAdGroupThemesRequest.getDescriptor())
            .add(GenerateReachForecastRequest.getDescriptor())
            .add(GraduateExperimentRequest.getDescriptor())
            .add(SuggestTravelAssetsRequest.getDescriptor())
            .add(GenerateRecommendationsRequest.getDescriptor())
            .add(GenerateShareablePreviewsRequest.getDescriptor())
            .add(RemoveAutomaticallyCreatedAssetsRequest.getDescriptor())
            .add(GenerateTargetingSuggestionMetricsRequest.getDescriptor())
            .add(GenerateCreatorInsightsRequest.getDescriptor())
            .add(ListPlannableUserInterestsRequest.getDescriptor())
            .add(GenerateTextRequest.getDescriptor())
            .add(GenerateImagesRequest.getDescriptor())
            .build();

    // Gets the class for the latest version of the Google Ads API.
    Class<?> latestVersionClass =
        GoogleAdsAllVersions.class.getMethod("getLatestVersion").getReturnType();
    // Collects the list of service client creation methods for further inspection.
    List<? extends Class<?>> serviceClientTypes =
        Arrays.stream(latestVersionClass.getMethods())
            .filter(m -> m.getName().matches("create.*ServiceClient"))
            .map(Method::getReturnType)
            .collect(Collectors.toList());

    // A multimap of service name to the list of the service's request names where the request
    // potentially has a field containing the list of operations but the field's name is not in the
    // list of known operation fields and the request type is not in the list of request types to
    // ignore.
    Multimap<String, String> unmappedRequestsByService =
        Multimaps.newListMultimap(new TreeMap<>(), ArrayList::new);

    // Processes each service client.
    for (Class<?> serviceClientType : serviceClientTypes) {
      // Finds each method of the service client that accepts a request type and inspect its request
      // type.
      List<String> unmappedRequests =
          Arrays.stream(serviceClientType.getMethods())
              // Keeps the service client methods that have a single request parameter.
              .filter(
                  m ->
                      m.getParameterCount() == 1
                          && m.getParameterTypes()[0].getTypeName().endsWith("Request"))
              // Gets the type of the request parameter.
              .map(m -> m.getParameterTypes()[0])
              // Invokes the getDescriptor method for easier inspection of the request type.
              .map(
                  msgClass -> {
                    try {
                      return (Descriptor) msgClass.getMethod("getDescriptor").invoke(new Object[0]);
                    } catch (ReflectiveOperationException refExc) {
                      throw new RuntimeException(
                          "Failed to invoke getDescriptor on: " + msgClass, refExc);
                    }
                  })
              // Keeps the request descriptor only if it is not one of the known exceptions.
              .filter(desc -> !requestDescriptorsToIgnore.contains(desc))
              // Keeps the request descriptor if it contains at least one repeated field. Request
              // types with no repeated fields cannot have a list of operations, so they are
              // irrelevant for this test.
              .filter(desc -> desc.getFields().stream().anyMatch(FieldDescriptor::isRepeated))
              // Keeps the request descriptor if it does not have any fields that match the known
              // list of operation field names.
              .filter(
                  desc ->
                      desc.getFields().stream()
                          .noneMatch(fldDesc -> OPERATION_FIELD_NAMES.contains(fldDesc.getName())))
              // Gets the name of the request type.
              .map(Descriptor::getName)
              // Adds all unmapped request type names to the list for this service client.
              .collect(Collectors.toList());

      // Only adds an entry for the service client if there are unmapped request types.
      if (!unmappedRequests.isEmpty()) {
        unmappedRequestsByService.putAll(serviceClientType.getName(), unmappedRequests);
      }
    }

    if (!unmappedRequestsByService.isEmpty()) {
      // Fails the test with a detailed error message containing all request types that are not
      // properly handled by the error utility.
      StringBuilder failureBuilder = new StringBuilder();
      failureBuilder
          .append(
              "No known operations field found for the following service/request combinations: ")
          .append(String.format("%n"))
          .append(
              unmappedRequestsByService.entries().stream()
                  .map(entry -> entry.getKey() + "." + entry.getValue())
                  .collect(Collectors.joining(String.format("%n"))))
          .append(String.format("%n"))
          .append(
              "Review each service/request combination. If the request does not contain an"
                  + " operations list, add the request to this test's list of request descriptors"
                  + " to ignore. Otherwise, add the operations list field name to"
                  + " OPERATION_FIELD_NAMES in ErrorPath.");
      fail(failureBuilder.toString());
    }
  }
}
