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

import com.google.ads.googleads.v8.resources.AdGroupName;
import com.google.ads.googleads.v8.resources.CampaignBudgetName;
import com.google.ads.googleads.v8.resources.CampaignName;
import com.google.ads.googleads.v8.resources.Recommendation;
import com.google.ads.googleads.v8.resources.RecommendationName;
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
public class RecommendationServiceClientTest {
  private static MockRecommendationService mockRecommendationService;
  private static MockServiceHelper mockServiceHelper;
  private LocalChannelProvider channelProvider;
  private RecommendationServiceClient client;

  @BeforeClass
  public static void startStaticServer() {
    mockRecommendationService = new MockRecommendationService();
    mockServiceHelper =
        new MockServiceHelper(
            UUID.randomUUID().toString(),
            Arrays.<MockGrpcService>asList(mockRecommendationService));
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
    RecommendationServiceSettings settings =
        RecommendationServiceSettings.newBuilder()
            .setTransportChannelProvider(channelProvider)
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = RecommendationServiceClient.create(settings);
  }

  @After
  public void tearDown() throws Exception {
    client.close();
  }

  @Test
  public void getRecommendationTest() throws Exception {
    Recommendation expectedResponse =
        Recommendation.newBuilder()
            .setResourceName(
                RecommendationName.of("[CUSTOMER_ID]", "[RECOMMENDATION_ID]").toString())
            .setImpact(Recommendation.RecommendationImpact.newBuilder().build())
            .setCampaignBudget(
                CampaignBudgetName.of("[CUSTOMER_ID]", "[CAMPAIGN_BUDGET_ID]").toString())
            .setCampaign(CampaignName.of("[CUSTOMER_ID]", "[CAMPAIGN_ID]").toString())
            .setAdGroup(AdGroupName.of("[CUSTOMER_ID]", "[AD_GROUP_ID]").toString())
            .setDismissed(true)
            .build();
    mockRecommendationService.addResponse(expectedResponse);

    RecommendationName resourceName = RecommendationName.of("[CUSTOMER_ID]", "[RECOMMENDATION_ID]");

    Recommendation actualResponse = client.getRecommendation(resourceName);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockRecommendationService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetRecommendationRequest actualRequest = ((GetRecommendationRequest) actualRequests.get(0));

    Assert.assertEquals(resourceName.toString(), actualRequest.getResourceName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getRecommendationExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockRecommendationService.addException(exception);

    try {
      RecommendationName resourceName =
          RecommendationName.of("[CUSTOMER_ID]", "[RECOMMENDATION_ID]");
      client.getRecommendation(resourceName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getRecommendationTest2() throws Exception {
    Recommendation expectedResponse =
        Recommendation.newBuilder()
            .setResourceName(
                RecommendationName.of("[CUSTOMER_ID]", "[RECOMMENDATION_ID]").toString())
            .setImpact(Recommendation.RecommendationImpact.newBuilder().build())
            .setCampaignBudget(
                CampaignBudgetName.of("[CUSTOMER_ID]", "[CAMPAIGN_BUDGET_ID]").toString())
            .setCampaign(CampaignName.of("[CUSTOMER_ID]", "[CAMPAIGN_ID]").toString())
            .setAdGroup(AdGroupName.of("[CUSTOMER_ID]", "[AD_GROUP_ID]").toString())
            .setDismissed(true)
            .build();
    mockRecommendationService.addResponse(expectedResponse);

    String resourceName = "resourceName-384566343";

    Recommendation actualResponse = client.getRecommendation(resourceName);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockRecommendationService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetRecommendationRequest actualRequest = ((GetRecommendationRequest) actualRequests.get(0));

    Assert.assertEquals(resourceName, actualRequest.getResourceName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getRecommendationExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockRecommendationService.addException(exception);

    try {
      String resourceName = "resourceName-384566343";
      client.getRecommendation(resourceName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void applyRecommendationTest() throws Exception {
    ApplyRecommendationResponse expectedResponse =
        ApplyRecommendationResponse.newBuilder()
            .addAllResults(new ArrayList<ApplyRecommendationResult>())
            .setPartialFailureError(Status.newBuilder().build())
            .build();
    mockRecommendationService.addResponse(expectedResponse);

    String customerId = "customerId-1581184615";
    List<ApplyRecommendationOperation> operations = new ArrayList<>();

    ApplyRecommendationResponse actualResponse = client.applyRecommendation(customerId, operations);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockRecommendationService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ApplyRecommendationRequest actualRequest = ((ApplyRecommendationRequest) actualRequests.get(0));

    Assert.assertEquals(customerId, actualRequest.getCustomerId());
    Assert.assertEquals(operations, actualRequest.getOperationsList());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void applyRecommendationExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockRecommendationService.addException(exception);

    try {
      String customerId = "customerId-1581184615";
      List<ApplyRecommendationOperation> operations = new ArrayList<>();
      client.applyRecommendation(customerId, operations);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void dismissRecommendationTest() throws Exception {
    DismissRecommendationResponse expectedResponse =
        DismissRecommendationResponse.newBuilder()
            .addAllResults(
                new ArrayList<DismissRecommendationResponse.DismissRecommendationResult>())
            .setPartialFailureError(Status.newBuilder().build())
            .build();
    mockRecommendationService.addResponse(expectedResponse);

    String customerId = "customerId-1581184615";
    List<DismissRecommendationRequest.DismissRecommendationOperation> operations =
        new ArrayList<>();

    DismissRecommendationResponse actualResponse =
        client.dismissRecommendation(customerId, operations);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockRecommendationService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    DismissRecommendationRequest actualRequest =
        ((DismissRecommendationRequest) actualRequests.get(0));

    Assert.assertEquals(customerId, actualRequest.getCustomerId());
    Assert.assertEquals(operations, actualRequest.getOperationsList());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void dismissRecommendationExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockRecommendationService.addException(exception);

    try {
      String customerId = "customerId-1581184615";
      List<DismissRecommendationRequest.DismissRecommendationOperation> operations =
          new ArrayList<>();
      client.dismissRecommendation(customerId, operations);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }
}
