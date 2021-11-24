/*
 * Copyright 2021 Google LLC
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

package com.google.ads.googleads.v8.services;

import com.google.ads.googleads.v8.resources.AdGroupCriterionName;
import com.google.ads.googleads.v8.resources.AdParameter;
import com.google.ads.googleads.v8.resources.AdParameterName;
import com.google.api.gax.core.NoCredentialsProvider;
import com.google.api.gax.grpc.GaxGrpcProperties;
import com.google.api.gax.grpc.testing.LocalChannelProvider;
import com.google.api.gax.grpc.testing.MockGrpcService;
import com.google.api.gax.grpc.testing.MockServiceHelper;
import com.google.api.gax.rpc.ApiClientHeaderProvider;
import com.google.api.gax.rpc.InvalidArgumentException;
import com.google.protobuf.AbstractMessage;
import com.google.rpc.Status;
import io.grpc.StatusRuntimeException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import javax.annotation.Generated;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

@Generated("by gapic-generator-java")
public class AdParameterServiceClientTest {
  private static MockAdParameterService mockAdParameterService;
  private static MockServiceHelper mockServiceHelper;
  private LocalChannelProvider channelProvider;
  private AdParameterServiceClient client;

  @BeforeClass
  public static void startStaticServer() {
    mockAdParameterService = new MockAdParameterService();
    mockServiceHelper =
        new MockServiceHelper(
            UUID.randomUUID().toString(), Arrays.<MockGrpcService>asList(mockAdParameterService));
    mockServiceHelper.start();
  }

  @AfterClass
  public static void stopServer() {
    mockServiceHelper.stop();
  }

  @Before
  public void setUp() throws IOException {
    mockServiceHelper.reset();
    channelProvider = mockServiceHelper.createChannelProvider();
    AdParameterServiceSettings settings =
        AdParameterServiceSettings.newBuilder()
            .setTransportChannelProvider(channelProvider)
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = AdParameterServiceClient.create(settings);
  }

  @After
  public void tearDown() throws Exception {
    client.close();
  }

  @Test
  public void getAdParameterTest() throws Exception {
    AdParameter expectedResponse =
        AdParameter.newBuilder()
            .setResourceName(
                AdParameterName.of(
                        "[CUSTOMER_ID]", "[AD_GROUP_ID]", "[CRITERION_ID]", "[PARAMETER_INDEX]")
                    .toString())
            .setAdGroupCriterion(
                AdGroupCriterionName.of("[CUSTOMER_ID]", "[AD_GROUP_ID]", "[CRITERION_ID]")
                    .toString())
            .setParameterIndex(763436220)
            .setInsertionText("insertionText-195528580")
            .build();
    mockAdParameterService.addResponse(expectedResponse);

    AdParameterName resourceName =
        AdParameterName.of("[CUSTOMER_ID]", "[AD_GROUP_ID]", "[CRITERION_ID]", "[PARAMETER_INDEX]");

    AdParameter actualResponse = client.getAdParameter(resourceName);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockAdParameterService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetAdParameterRequest actualRequest = ((GetAdParameterRequest) actualRequests.get(0));

    Assert.assertEquals(resourceName.toString(), actualRequest.getResourceName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getAdParameterExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAdParameterService.addException(exception);

    try {
      AdParameterName resourceName =
          AdParameterName.of(
              "[CUSTOMER_ID]", "[AD_GROUP_ID]", "[CRITERION_ID]", "[PARAMETER_INDEX]");
      client.getAdParameter(resourceName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getAdParameterTest2() throws Exception {
    AdParameter expectedResponse =
        AdParameter.newBuilder()
            .setResourceName(
                AdParameterName.of(
                        "[CUSTOMER_ID]", "[AD_GROUP_ID]", "[CRITERION_ID]", "[PARAMETER_INDEX]")
                    .toString())
            .setAdGroupCriterion(
                AdGroupCriterionName.of("[CUSTOMER_ID]", "[AD_GROUP_ID]", "[CRITERION_ID]")
                    .toString())
            .setParameterIndex(763436220)
            .setInsertionText("insertionText-195528580")
            .build();
    mockAdParameterService.addResponse(expectedResponse);

    String resourceName = "resourceName-384566343";

    AdParameter actualResponse = client.getAdParameter(resourceName);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockAdParameterService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetAdParameterRequest actualRequest = ((GetAdParameterRequest) actualRequests.get(0));

    Assert.assertEquals(resourceName, actualRequest.getResourceName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getAdParameterExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAdParameterService.addException(exception);

    try {
      String resourceName = "resourceName-384566343";
      client.getAdParameter(resourceName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void mutateAdParametersTest() throws Exception {
    MutateAdParametersResponse expectedResponse =
        MutateAdParametersResponse.newBuilder()
            .setPartialFailureError(Status.newBuilder().build())
            .addAllResults(new ArrayList<MutateAdParameterResult>())
            .build();
    mockAdParameterService.addResponse(expectedResponse);

    String customerId = "customerId-1581184615";
    List<AdParameterOperation> operations = new ArrayList<>();

    MutateAdParametersResponse actualResponse = client.mutateAdParameters(customerId, operations);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockAdParameterService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    MutateAdParametersRequest actualRequest = ((MutateAdParametersRequest) actualRequests.get(0));

    Assert.assertEquals(customerId, actualRequest.getCustomerId());
    Assert.assertEquals(operations, actualRequest.getOperationsList());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void mutateAdParametersExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAdParameterService.addException(exception);

    try {
      String customerId = "customerId-1581184615";
      List<AdParameterOperation> operations = new ArrayList<>();
      client.mutateAdParameters(customerId, operations);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }
}
