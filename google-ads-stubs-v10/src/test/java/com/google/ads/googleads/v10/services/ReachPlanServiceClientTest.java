/*
 * Copyright 2022 Google LLC
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

package com.google.ads.googleads.v10.services;

import com.google.api.gax.core.NoCredentialsProvider;
import com.google.api.gax.grpc.GaxGrpcProperties;
import com.google.api.gax.grpc.testing.LocalChannelProvider;
import com.google.api.gax.grpc.testing.MockGrpcService;
import com.google.api.gax.grpc.testing.MockServiceHelper;
import com.google.api.gax.rpc.ApiClientHeaderProvider;
import com.google.api.gax.rpc.InvalidArgumentException;
import com.google.protobuf.AbstractMessage;
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
public class ReachPlanServiceClientTest {
  private static MockReachPlanService mockReachPlanService;
  private static MockServiceHelper mockServiceHelper;
  private LocalChannelProvider channelProvider;
  private ReachPlanServiceClient client;

  @BeforeClass
  public static void startStaticServer() {
    mockReachPlanService = new MockReachPlanService();
    mockServiceHelper =
        new MockServiceHelper(
            UUID.randomUUID().toString(), Arrays.<MockGrpcService>asList(mockReachPlanService));
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
    ReachPlanServiceSettings settings =
        ReachPlanServiceSettings.newBuilder()
            .setTransportChannelProvider(channelProvider)
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = ReachPlanServiceClient.create(settings);
  }

  @After
  public void tearDown() throws Exception {
    client.close();
  }

  @Test
  public void listPlannableLocationsTest() throws Exception {
    ListPlannableLocationsResponse expectedResponse =
        ListPlannableLocationsResponse.newBuilder()
            .addAllPlannableLocations(new ArrayList<PlannableLocation>())
            .build();
    mockReachPlanService.addResponse(expectedResponse);

    ListPlannableLocationsRequest request = ListPlannableLocationsRequest.newBuilder().build();

    ListPlannableLocationsResponse actualResponse = client.listPlannableLocations(request);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockReachPlanService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ListPlannableLocationsRequest actualRequest =
        ((ListPlannableLocationsRequest) actualRequests.get(0));

    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void listPlannableLocationsExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockReachPlanService.addException(exception);

    try {
      ListPlannableLocationsRequest request = ListPlannableLocationsRequest.newBuilder().build();
      client.listPlannableLocations(request);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void listPlannableProductsTest() throws Exception {
    ListPlannableProductsResponse expectedResponse =
        ListPlannableProductsResponse.newBuilder()
            .addAllProductMetadata(new ArrayList<ProductMetadata>())
            .build();
    mockReachPlanService.addResponse(expectedResponse);

    String plannableLocationId = "plannableLocationId-1266753969";

    ListPlannableProductsResponse actualResponse =
        client.listPlannableProducts(plannableLocationId);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockReachPlanService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ListPlannableProductsRequest actualRequest =
        ((ListPlannableProductsRequest) actualRequests.get(0));

    Assert.assertEquals(plannableLocationId, actualRequest.getPlannableLocationId());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void listPlannableProductsExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockReachPlanService.addException(exception);

    try {
      String plannableLocationId = "plannableLocationId-1266753969";
      client.listPlannableProducts(plannableLocationId);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void generateProductMixIdeasTest() throws Exception {
    GenerateProductMixIdeasResponse expectedResponse =
        GenerateProductMixIdeasResponse.newBuilder()
            .addAllProductAllocation(new ArrayList<ProductAllocation>())
            .build();
    mockReachPlanService.addResponse(expectedResponse);

    String customerId = "customerId-1581184615";
    String plannableLocationId = "plannableLocationId-1266753969";
    String currencyCode = "currencyCode1004773790";
    long budgetMicros = 933896297;

    GenerateProductMixIdeasResponse actualResponse =
        client.generateProductMixIdeas(customerId, plannableLocationId, currencyCode, budgetMicros);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockReachPlanService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GenerateProductMixIdeasRequest actualRequest =
        ((GenerateProductMixIdeasRequest) actualRequests.get(0));

    Assert.assertEquals(customerId, actualRequest.getCustomerId());
    Assert.assertEquals(plannableLocationId, actualRequest.getPlannableLocationId());
    Assert.assertEquals(currencyCode, actualRequest.getCurrencyCode());
    Assert.assertEquals(budgetMicros, actualRequest.getBudgetMicros());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void generateProductMixIdeasExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockReachPlanService.addException(exception);

    try {
      String customerId = "customerId-1581184615";
      String plannableLocationId = "plannableLocationId-1266753969";
      String currencyCode = "currencyCode1004773790";
      long budgetMicros = 933896297;
      client.generateProductMixIdeas(customerId, plannableLocationId, currencyCode, budgetMicros);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void generateReachForecastTest() throws Exception {
    GenerateReachForecastResponse expectedResponse =
        GenerateReachForecastResponse.newBuilder()
            .setOnTargetAudienceMetrics(OnTargetAudienceMetrics.newBuilder().build())
            .setReachCurve(ReachCurve.newBuilder().build())
            .build();
    mockReachPlanService.addResponse(expectedResponse);

    String customerId = "customerId-1581184615";
    CampaignDuration campaignDuration = CampaignDuration.newBuilder().build();
    List<PlannedProduct> plannedProducts = new ArrayList<>();

    GenerateReachForecastResponse actualResponse =
        client.generateReachForecast(customerId, campaignDuration, plannedProducts);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockReachPlanService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GenerateReachForecastRequest actualRequest =
        ((GenerateReachForecastRequest) actualRequests.get(0));

    Assert.assertEquals(customerId, actualRequest.getCustomerId());
    Assert.assertEquals(campaignDuration, actualRequest.getCampaignDuration());
    Assert.assertEquals(plannedProducts, actualRequest.getPlannedProductsList());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void generateReachForecastExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockReachPlanService.addException(exception);

    try {
      String customerId = "customerId-1581184615";
      CampaignDuration campaignDuration = CampaignDuration.newBuilder().build();
      List<PlannedProduct> plannedProducts = new ArrayList<>();
      client.generateReachForecast(customerId, campaignDuration, plannedProducts);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }
}
