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

package com.google.ads.googleads.v13.services;

import com.google.ads.googleads.v13.common.DateRange;
import com.google.ads.googleads.v13.enums.AudienceInsightsDimensionEnum;
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
public class AudienceInsightsServiceClientTest {
  private static MockAudienceInsightsService mockAudienceInsightsService;
  private static MockServiceHelper mockServiceHelper;
  private LocalChannelProvider channelProvider;
  private AudienceInsightsServiceClient client;

  @BeforeClass
  public static void startStaticServer() {
    mockAudienceInsightsService = new MockAudienceInsightsService();
    mockServiceHelper =
        new MockServiceHelper(
            UUID.randomUUID().toString(),
            Arrays.<MockGrpcService>asList(mockAudienceInsightsService));
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
    AudienceInsightsServiceSettings settings =
        AudienceInsightsServiceSettings.newBuilder()
            .setTransportChannelProvider(channelProvider)
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = AudienceInsightsServiceClient.create(settings);
  }

  @After
  public void tearDown() throws Exception {
    client.close();
  }

  @Test
  public void generateInsightsFinderReportTest() throws Exception {
    GenerateInsightsFinderReportResponse expectedResponse =
        GenerateInsightsFinderReportResponse.newBuilder()
            .setSavedReportUrl("savedReportUrl-277441324")
            .build();
    mockAudienceInsightsService.addResponse(expectedResponse);

    String customerId = "customerId-1581184615";
    BasicInsightsAudience baselineAudience = BasicInsightsAudience.newBuilder().build();
    BasicInsightsAudience specificAudience = BasicInsightsAudience.newBuilder().build();

    GenerateInsightsFinderReportResponse actualResponse =
        client.generateInsightsFinderReport(customerId, baselineAudience, specificAudience);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockAudienceInsightsService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GenerateInsightsFinderReportRequest actualRequest =
        ((GenerateInsightsFinderReportRequest) actualRequests.get(0));

    Assert.assertEquals(customerId, actualRequest.getCustomerId());
    Assert.assertEquals(baselineAudience, actualRequest.getBaselineAudience());
    Assert.assertEquals(specificAudience, actualRequest.getSpecificAudience());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void generateInsightsFinderReportExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAudienceInsightsService.addException(exception);

    try {
      String customerId = "customerId-1581184615";
      BasicInsightsAudience baselineAudience = BasicInsightsAudience.newBuilder().build();
      BasicInsightsAudience specificAudience = BasicInsightsAudience.newBuilder().build();
      client.generateInsightsFinderReport(customerId, baselineAudience, specificAudience);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void listAudienceInsightsAttributesTest() throws Exception {
    ListAudienceInsightsAttributesResponse expectedResponse =
        ListAudienceInsightsAttributesResponse.newBuilder()
            .addAllAttributes(new ArrayList<AudienceInsightsAttributeMetadata>())
            .build();
    mockAudienceInsightsService.addResponse(expectedResponse);

    String customerId = "customerId-1581184615";
    List<AudienceInsightsDimensionEnum.AudienceInsightsDimension> dimensions = new ArrayList<>();
    String queryText = "queryText-1806881259";

    ListAudienceInsightsAttributesResponse actualResponse =
        client.listAudienceInsightsAttributes(customerId, dimensions, queryText);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockAudienceInsightsService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ListAudienceInsightsAttributesRequest actualRequest =
        ((ListAudienceInsightsAttributesRequest) actualRequests.get(0));

    Assert.assertEquals(customerId, actualRequest.getCustomerId());
    Assert.assertEquals(dimensions, actualRequest.getDimensionsList());
    Assert.assertEquals(queryText, actualRequest.getQueryText());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void listAudienceInsightsAttributesExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAudienceInsightsService.addException(exception);

    try {
      String customerId = "customerId-1581184615";
      List<AudienceInsightsDimensionEnum.AudienceInsightsDimension> dimensions = new ArrayList<>();
      String queryText = "queryText-1806881259";
      client.listAudienceInsightsAttributes(customerId, dimensions, queryText);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void listInsightsEligibleDatesTest() throws Exception {
    ListInsightsEligibleDatesResponse expectedResponse =
        ListInsightsEligibleDatesResponse.newBuilder()
            .addAllDataMonths(new ArrayList<String>())
            .setLastThirtyDays(DateRange.newBuilder().build())
            .build();
    mockAudienceInsightsService.addResponse(expectedResponse);

    ListInsightsEligibleDatesRequest request =
        ListInsightsEligibleDatesRequest.newBuilder().build();

    ListInsightsEligibleDatesResponse actualResponse = client.listInsightsEligibleDates(request);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockAudienceInsightsService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ListInsightsEligibleDatesRequest actualRequest =
        ((ListInsightsEligibleDatesRequest) actualRequests.get(0));

    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void listInsightsEligibleDatesExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAudienceInsightsService.addException(exception);

    try {
      ListInsightsEligibleDatesRequest request =
          ListInsightsEligibleDatesRequest.newBuilder().build();
      client.listInsightsEligibleDates(request);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void generateAudienceCompositionInsightsTest() throws Exception {
    GenerateAudienceCompositionInsightsResponse expectedResponse =
        GenerateAudienceCompositionInsightsResponse.newBuilder()
            .addAllSections(new ArrayList<AudienceCompositionSection>())
            .build();
    mockAudienceInsightsService.addResponse(expectedResponse);

    String customerId = "customerId-1581184615";
    InsightsAudience audience = InsightsAudience.newBuilder().build();
    List<AudienceInsightsDimensionEnum.AudienceInsightsDimension> dimensions = new ArrayList<>();

    GenerateAudienceCompositionInsightsResponse actualResponse =
        client.generateAudienceCompositionInsights(customerId, audience, dimensions);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockAudienceInsightsService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GenerateAudienceCompositionInsightsRequest actualRequest =
        ((GenerateAudienceCompositionInsightsRequest) actualRequests.get(0));

    Assert.assertEquals(customerId, actualRequest.getCustomerId());
    Assert.assertEquals(audience, actualRequest.getAudience());
    Assert.assertEquals(dimensions, actualRequest.getDimensionsList());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void generateAudienceCompositionInsightsExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAudienceInsightsService.addException(exception);

    try {
      String customerId = "customerId-1581184615";
      InsightsAudience audience = InsightsAudience.newBuilder().build();
      List<AudienceInsightsDimensionEnum.AudienceInsightsDimension> dimensions = new ArrayList<>();
      client.generateAudienceCompositionInsights(customerId, audience, dimensions);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }
}
