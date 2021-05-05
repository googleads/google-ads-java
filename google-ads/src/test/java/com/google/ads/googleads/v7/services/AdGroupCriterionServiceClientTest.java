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

package com.google.ads.googleads.v7.services;

import com.google.ads.googleads.v7.common.CustomParameter;
import com.google.ads.googleads.v7.resources.AdGroupCriterion;
import com.google.ads.googleads.v7.resources.AdGroupCriterionName;
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
public class AdGroupCriterionServiceClientTest {
  private static MockServiceHelper mockServiceHelper;
  private static MockAdGroupCriterionService mockAdGroupCriterionService;
  private AdGroupCriterionServiceClient client;
  private LocalChannelProvider channelProvider;

  @BeforeClass
  public static void startStaticServer() {
    mockAdGroupCriterionService = new MockAdGroupCriterionService();
    mockServiceHelper =
        new MockServiceHelper(
            UUID.randomUUID().toString(),
            Arrays.<MockGrpcService>asList(mockAdGroupCriterionService));
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
    AdGroupCriterionServiceSettings settings =
        AdGroupCriterionServiceSettings.newBuilder()
            .setTransportChannelProvider(channelProvider)
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = AdGroupCriterionServiceClient.create(settings);
  }

  @After
  public void tearDown() throws Exception {
    client.close();
  }

  @Test
  public void getAdGroupCriterionTest() throws Exception {
    AdGroupCriterion expectedResponse =
        AdGroupCriterion.newBuilder()
            .setResourceName(
                AdGroupCriterionName.of("[CUSTOMER_ID]", "[AD_GROUP_ID]", "[CRITERION_ID]")
                    .toString())
            .setDisplayName("displayName1714148973")
            .setQualityInfo(AdGroupCriterion.QualityInfo.newBuilder().build())
            .addAllDisapprovalReasons(new ArrayList<String>())
            .addAllLabels(new ArrayList<String>())
            .setPositionEstimates(AdGroupCriterion.PositionEstimates.newBuilder().build())
            .addAllFinalUrls(new ArrayList<String>())
            .addAllFinalMobileUrls(new ArrayList<String>())
            .addAllUrlCustomParameters(new ArrayList<CustomParameter>())
            .build();
    mockAdGroupCriterionService.addResponse(expectedResponse);

    AdGroupCriterionName resourceName =
        AdGroupCriterionName.of("[CUSTOMER_ID]", "[AD_GROUP_ID]", "[CRITERION_ID]");

    AdGroupCriterion actualResponse = client.getAdGroupCriterion(resourceName);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockAdGroupCriterionService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetAdGroupCriterionRequest actualRequest = ((GetAdGroupCriterionRequest) actualRequests.get(0));

    Assert.assertEquals(resourceName.toString(), actualRequest.getResourceName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getAdGroupCriterionExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAdGroupCriterionService.addException(exception);

    try {
      AdGroupCriterionName resourceName =
          AdGroupCriterionName.of("[CUSTOMER_ID]", "[AD_GROUP_ID]", "[CRITERION_ID]");
      client.getAdGroupCriterion(resourceName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getAdGroupCriterionTest2() throws Exception {
    AdGroupCriterion expectedResponse =
        AdGroupCriterion.newBuilder()
            .setResourceName(
                AdGroupCriterionName.of("[CUSTOMER_ID]", "[AD_GROUP_ID]", "[CRITERION_ID]")
                    .toString())
            .setDisplayName("displayName1714148973")
            .setQualityInfo(AdGroupCriterion.QualityInfo.newBuilder().build())
            .addAllDisapprovalReasons(new ArrayList<String>())
            .addAllLabels(new ArrayList<String>())
            .setPositionEstimates(AdGroupCriterion.PositionEstimates.newBuilder().build())
            .addAllFinalUrls(new ArrayList<String>())
            .addAllFinalMobileUrls(new ArrayList<String>())
            .addAllUrlCustomParameters(new ArrayList<CustomParameter>())
            .build();
    mockAdGroupCriterionService.addResponse(expectedResponse);

    String resourceName = "resourceName-384566343";

    AdGroupCriterion actualResponse = client.getAdGroupCriterion(resourceName);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockAdGroupCriterionService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetAdGroupCriterionRequest actualRequest = ((GetAdGroupCriterionRequest) actualRequests.get(0));

    Assert.assertEquals(resourceName, actualRequest.getResourceName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getAdGroupCriterionExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAdGroupCriterionService.addException(exception);

    try {
      String resourceName = "resourceName-384566343";
      client.getAdGroupCriterion(resourceName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void mutateAdGroupCriteriaTest() throws Exception {
    MutateAdGroupCriteriaResponse expectedResponse =
        MutateAdGroupCriteriaResponse.newBuilder()
            .setPartialFailureError(Status.newBuilder().build())
            .addAllResults(new ArrayList<MutateAdGroupCriterionResult>())
            .build();
    mockAdGroupCriterionService.addResponse(expectedResponse);

    String customerId = "customerId-1581184615";
    List<AdGroupCriterionOperation> operations = new ArrayList<>();

    MutateAdGroupCriteriaResponse actualResponse =
        client.mutateAdGroupCriteria(customerId, operations);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockAdGroupCriterionService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    MutateAdGroupCriteriaRequest actualRequest =
        ((MutateAdGroupCriteriaRequest) actualRequests.get(0));

    Assert.assertEquals(customerId, actualRequest.getCustomerId());
    Assert.assertEquals(operations, actualRequest.getOperationsList());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void mutateAdGroupCriteriaExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAdGroupCriterionService.addException(exception);

    try {
      String customerId = "customerId-1581184615";
      List<AdGroupCriterionOperation> operations = new ArrayList<>();
      client.mutateAdGroupCriteria(customerId, operations);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }
}
