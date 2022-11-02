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

package com.google.ads.googleads.v12.services;

import com.google.ads.googleads.v12.common.KeywordPlanAggregateMetricResults;
import com.google.ads.googleads.v12.resources.KeywordPlanName;
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
public class KeywordPlanServiceClientTest {
  private static MockKeywordPlanService mockKeywordPlanService;
  private static MockServiceHelper mockServiceHelper;
  private LocalChannelProvider channelProvider;
  private KeywordPlanServiceClient client;

  @BeforeClass
  public static void startStaticServer() {
    mockKeywordPlanService = new MockKeywordPlanService();
    mockServiceHelper =
        new MockServiceHelper(
            UUID.randomUUID().toString(), Arrays.<MockGrpcService>asList(mockKeywordPlanService));
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
    KeywordPlanServiceSettings settings =
        KeywordPlanServiceSettings.newBuilder()
            .setTransportChannelProvider(channelProvider)
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = KeywordPlanServiceClient.create(settings);
  }

  @After
  public void tearDown() throws Exception {
    client.close();
  }

  @Test
  public void mutateKeywordPlansTest() throws Exception {
    MutateKeywordPlansResponse expectedResponse =
        MutateKeywordPlansResponse.newBuilder()
            .setPartialFailureError(Status.newBuilder().build())
            .addAllResults(new ArrayList<MutateKeywordPlansResult>())
            .build();
    mockKeywordPlanService.addResponse(expectedResponse);

    String customerId = "customerId-1581184615";
    List<KeywordPlanOperation> operations = new ArrayList<>();

    MutateKeywordPlansResponse actualResponse = client.mutateKeywordPlans(customerId, operations);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockKeywordPlanService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    MutateKeywordPlansRequest actualRequest = ((MutateKeywordPlansRequest) actualRequests.get(0));

    Assert.assertEquals(customerId, actualRequest.getCustomerId());
    Assert.assertEquals(operations, actualRequest.getOperationsList());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void mutateKeywordPlansExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockKeywordPlanService.addException(exception);

    try {
      String customerId = "customerId-1581184615";
      List<KeywordPlanOperation> operations = new ArrayList<>();
      client.mutateKeywordPlans(customerId, operations);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void generateForecastCurveTest() throws Exception {
    GenerateForecastCurveResponse expectedResponse =
        GenerateForecastCurveResponse.newBuilder()
            .addAllCampaignForecastCurves(new ArrayList<KeywordPlanCampaignForecastCurve>())
            .build();
    mockKeywordPlanService.addResponse(expectedResponse);

    KeywordPlanName keywordPlan = KeywordPlanName.of("[CUSTOMER_ID]", "[KEYWORD_PLAN_ID]");

    GenerateForecastCurveResponse actualResponse = client.generateForecastCurve(keywordPlan);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockKeywordPlanService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GenerateForecastCurveRequest actualRequest =
        ((GenerateForecastCurveRequest) actualRequests.get(0));

    Assert.assertEquals(keywordPlan.toString(), actualRequest.getKeywordPlan());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void generateForecastCurveExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockKeywordPlanService.addException(exception);

    try {
      KeywordPlanName keywordPlan = KeywordPlanName.of("[CUSTOMER_ID]", "[KEYWORD_PLAN_ID]");
      client.generateForecastCurve(keywordPlan);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void generateForecastCurveTest2() throws Exception {
    GenerateForecastCurveResponse expectedResponse =
        GenerateForecastCurveResponse.newBuilder()
            .addAllCampaignForecastCurves(new ArrayList<KeywordPlanCampaignForecastCurve>())
            .build();
    mockKeywordPlanService.addResponse(expectedResponse);

    String keywordPlan = "keywordPlan-1298661198";

    GenerateForecastCurveResponse actualResponse = client.generateForecastCurve(keywordPlan);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockKeywordPlanService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GenerateForecastCurveRequest actualRequest =
        ((GenerateForecastCurveRequest) actualRequests.get(0));

    Assert.assertEquals(keywordPlan, actualRequest.getKeywordPlan());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void generateForecastCurveExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockKeywordPlanService.addException(exception);

    try {
      String keywordPlan = "keywordPlan-1298661198";
      client.generateForecastCurve(keywordPlan);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void generateForecastTimeSeriesTest() throws Exception {
    GenerateForecastTimeSeriesResponse expectedResponse =
        GenerateForecastTimeSeriesResponse.newBuilder()
            .addAllWeeklyTimeSeriesForecasts(new ArrayList<KeywordPlanWeeklyTimeSeriesForecast>())
            .build();
    mockKeywordPlanService.addResponse(expectedResponse);

    KeywordPlanName keywordPlan = KeywordPlanName.of("[CUSTOMER_ID]", "[KEYWORD_PLAN_ID]");

    GenerateForecastTimeSeriesResponse actualResponse =
        client.generateForecastTimeSeries(keywordPlan);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockKeywordPlanService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GenerateForecastTimeSeriesRequest actualRequest =
        ((GenerateForecastTimeSeriesRequest) actualRequests.get(0));

    Assert.assertEquals(keywordPlan.toString(), actualRequest.getKeywordPlan());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void generateForecastTimeSeriesExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockKeywordPlanService.addException(exception);

    try {
      KeywordPlanName keywordPlan = KeywordPlanName.of("[CUSTOMER_ID]", "[KEYWORD_PLAN_ID]");
      client.generateForecastTimeSeries(keywordPlan);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void generateForecastTimeSeriesTest2() throws Exception {
    GenerateForecastTimeSeriesResponse expectedResponse =
        GenerateForecastTimeSeriesResponse.newBuilder()
            .addAllWeeklyTimeSeriesForecasts(new ArrayList<KeywordPlanWeeklyTimeSeriesForecast>())
            .build();
    mockKeywordPlanService.addResponse(expectedResponse);

    String keywordPlan = "keywordPlan-1298661198";

    GenerateForecastTimeSeriesResponse actualResponse =
        client.generateForecastTimeSeries(keywordPlan);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockKeywordPlanService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GenerateForecastTimeSeriesRequest actualRequest =
        ((GenerateForecastTimeSeriesRequest) actualRequests.get(0));

    Assert.assertEquals(keywordPlan, actualRequest.getKeywordPlan());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void generateForecastTimeSeriesExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockKeywordPlanService.addException(exception);

    try {
      String keywordPlan = "keywordPlan-1298661198";
      client.generateForecastTimeSeries(keywordPlan);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void generateForecastMetricsTest() throws Exception {
    GenerateForecastMetricsResponse expectedResponse =
        GenerateForecastMetricsResponse.newBuilder()
            .addAllCampaignForecasts(new ArrayList<KeywordPlanCampaignForecast>())
            .addAllAdGroupForecasts(new ArrayList<KeywordPlanAdGroupForecast>())
            .addAllKeywordForecasts(new ArrayList<KeywordPlanKeywordForecast>())
            .build();
    mockKeywordPlanService.addResponse(expectedResponse);

    KeywordPlanName keywordPlan = KeywordPlanName.of("[CUSTOMER_ID]", "[KEYWORD_PLAN_ID]");

    GenerateForecastMetricsResponse actualResponse = client.generateForecastMetrics(keywordPlan);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockKeywordPlanService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GenerateForecastMetricsRequest actualRequest =
        ((GenerateForecastMetricsRequest) actualRequests.get(0));

    Assert.assertEquals(keywordPlan.toString(), actualRequest.getKeywordPlan());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void generateForecastMetricsExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockKeywordPlanService.addException(exception);

    try {
      KeywordPlanName keywordPlan = KeywordPlanName.of("[CUSTOMER_ID]", "[KEYWORD_PLAN_ID]");
      client.generateForecastMetrics(keywordPlan);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void generateForecastMetricsTest2() throws Exception {
    GenerateForecastMetricsResponse expectedResponse =
        GenerateForecastMetricsResponse.newBuilder()
            .addAllCampaignForecasts(new ArrayList<KeywordPlanCampaignForecast>())
            .addAllAdGroupForecasts(new ArrayList<KeywordPlanAdGroupForecast>())
            .addAllKeywordForecasts(new ArrayList<KeywordPlanKeywordForecast>())
            .build();
    mockKeywordPlanService.addResponse(expectedResponse);

    String keywordPlan = "keywordPlan-1298661198";

    GenerateForecastMetricsResponse actualResponse = client.generateForecastMetrics(keywordPlan);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockKeywordPlanService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GenerateForecastMetricsRequest actualRequest =
        ((GenerateForecastMetricsRequest) actualRequests.get(0));

    Assert.assertEquals(keywordPlan, actualRequest.getKeywordPlan());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void generateForecastMetricsExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockKeywordPlanService.addException(exception);

    try {
      String keywordPlan = "keywordPlan-1298661198";
      client.generateForecastMetrics(keywordPlan);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void generateHistoricalMetricsTest() throws Exception {
    GenerateHistoricalMetricsResponse expectedResponse =
        GenerateHistoricalMetricsResponse.newBuilder()
            .addAllMetrics(new ArrayList<KeywordPlanKeywordHistoricalMetrics>())
            .setAggregateMetricResults(KeywordPlanAggregateMetricResults.newBuilder().build())
            .build();
    mockKeywordPlanService.addResponse(expectedResponse);

    KeywordPlanName keywordPlan = KeywordPlanName.of("[CUSTOMER_ID]", "[KEYWORD_PLAN_ID]");

    GenerateHistoricalMetricsResponse actualResponse =
        client.generateHistoricalMetrics(keywordPlan);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockKeywordPlanService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GenerateHistoricalMetricsRequest actualRequest =
        ((GenerateHistoricalMetricsRequest) actualRequests.get(0));

    Assert.assertEquals(keywordPlan.toString(), actualRequest.getKeywordPlan());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void generateHistoricalMetricsExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockKeywordPlanService.addException(exception);

    try {
      KeywordPlanName keywordPlan = KeywordPlanName.of("[CUSTOMER_ID]", "[KEYWORD_PLAN_ID]");
      client.generateHistoricalMetrics(keywordPlan);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void generateHistoricalMetricsTest2() throws Exception {
    GenerateHistoricalMetricsResponse expectedResponse =
        GenerateHistoricalMetricsResponse.newBuilder()
            .addAllMetrics(new ArrayList<KeywordPlanKeywordHistoricalMetrics>())
            .setAggregateMetricResults(KeywordPlanAggregateMetricResults.newBuilder().build())
            .build();
    mockKeywordPlanService.addResponse(expectedResponse);

    String keywordPlan = "keywordPlan-1298661198";

    GenerateHistoricalMetricsResponse actualResponse =
        client.generateHistoricalMetrics(keywordPlan);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockKeywordPlanService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GenerateHistoricalMetricsRequest actualRequest =
        ((GenerateHistoricalMetricsRequest) actualRequests.get(0));

    Assert.assertEquals(keywordPlan, actualRequest.getKeywordPlan());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void generateHistoricalMetricsExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockKeywordPlanService.addException(exception);

    try {
      String keywordPlan = "keywordPlan-1298661198";
      client.generateHistoricalMetrics(keywordPlan);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }
}
