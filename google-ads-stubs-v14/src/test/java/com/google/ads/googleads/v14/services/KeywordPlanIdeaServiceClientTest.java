/*
 * Copyright 2023 Google LLC
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

package com.google.ads.googleads.v14.services;

import static com.google.ads.googleads.v14.services.KeywordPlanIdeaServiceClient.GenerateKeywordIdeasPagedResponse;

import com.google.ads.googleads.v14.common.DateRange;
import com.google.ads.googleads.v14.common.HistoricalMetricsOptions;
import com.google.ads.googleads.v14.common.KeywordPlanAggregateMetricResults;
import com.google.ads.googleads.v14.common.KeywordPlanAggregateMetrics;
import com.google.ads.googleads.v14.enums.KeywordPlanKeywordAnnotationEnum;
import com.google.api.gax.core.NoCredentialsProvider;
import com.google.api.gax.grpc.GaxGrpcProperties;
import com.google.api.gax.grpc.testing.LocalChannelProvider;
import com.google.api.gax.grpc.testing.MockGrpcService;
import com.google.api.gax.grpc.testing.MockServiceHelper;
import com.google.api.gax.rpc.ApiClientHeaderProvider;
import com.google.api.gax.rpc.InvalidArgumentException;
import com.google.common.collect.Lists;
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
public class KeywordPlanIdeaServiceClientTest {
  private static MockKeywordPlanIdeaService mockKeywordPlanIdeaService;
  private static MockServiceHelper mockServiceHelper;
  private LocalChannelProvider channelProvider;
  private KeywordPlanIdeaServiceClient client;

  @BeforeClass
  public static void startStaticServer() {
    mockKeywordPlanIdeaService = new MockKeywordPlanIdeaService();
    mockServiceHelper =
        new MockServiceHelper(
            UUID.randomUUID().toString(),
            Arrays.<MockGrpcService>asList(mockKeywordPlanIdeaService));
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
    KeywordPlanIdeaServiceSettings settings =
        KeywordPlanIdeaServiceSettings.newBuilder()
            .setTransportChannelProvider(channelProvider)
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = KeywordPlanIdeaServiceClient.create(settings);
  }

  @After
  public void tearDown() throws Exception {
    client.close();
  }

  @Test
  public void generateKeywordIdeasTest() throws Exception {
    GenerateKeywordIdeaResult responsesElement = GenerateKeywordIdeaResult.newBuilder().build();
    GenerateKeywordIdeaResponse expectedResponse =
        GenerateKeywordIdeaResponse.newBuilder()
            .setNextPageToken("")
            .addAllResults(Arrays.asList(responsesElement))
            .build();
    mockKeywordPlanIdeaService.addResponse(expectedResponse);

    GenerateKeywordIdeasRequest request =
        GenerateKeywordIdeasRequest.newBuilder()
            .setCustomerId("customerId-1581184615")
            .setLanguage("language-1613589672")
            .addAllGeoTargetConstants(new ArrayList<String>())
            .setIncludeAdultKeywords(true)
            .setPageToken("pageToken873572522")
            .setPageSize(883849137)
            .addAllKeywordAnnotation(
                new ArrayList<KeywordPlanKeywordAnnotationEnum.KeywordPlanKeywordAnnotation>())
            .setAggregateMetrics(KeywordPlanAggregateMetrics.newBuilder().build())
            .setHistoricalMetricsOptions(HistoricalMetricsOptions.newBuilder().build())
            .build();

    GenerateKeywordIdeasPagedResponse pagedListResponse = client.generateKeywordIdeas(request);

    List<GenerateKeywordIdeaResult> resources = Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getResultsList().get(0), resources.get(0));

    List<AbstractMessage> actualRequests = mockKeywordPlanIdeaService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GenerateKeywordIdeasRequest actualRequest =
        ((GenerateKeywordIdeasRequest) actualRequests.get(0));

    Assert.assertEquals(request.getCustomerId(), actualRequest.getCustomerId());
    Assert.assertEquals(request.getLanguage(), actualRequest.getLanguage());
    Assert.assertEquals(
        request.getGeoTargetConstantsList(), actualRequest.getGeoTargetConstantsList());
    Assert.assertEquals(request.getIncludeAdultKeywords(), actualRequest.getIncludeAdultKeywords());
    Assert.assertEquals(request.getPageToken(), actualRequest.getPageToken());
    Assert.assertEquals(request.getPageSize(), actualRequest.getPageSize());
    Assert.assertEquals(request.getKeywordPlanNetwork(), actualRequest.getKeywordPlanNetwork());
    Assert.assertEquals(
        request.getKeywordAnnotationList(), actualRequest.getKeywordAnnotationList());
    Assert.assertEquals(request.getAggregateMetrics(), actualRequest.getAggregateMetrics());
    Assert.assertEquals(
        request.getHistoricalMetricsOptions(), actualRequest.getHistoricalMetricsOptions());
    Assert.assertEquals(request.getKeywordAndUrlSeed(), actualRequest.getKeywordAndUrlSeed());
    Assert.assertEquals(request.getKeywordSeed(), actualRequest.getKeywordSeed());
    Assert.assertEquals(request.getUrlSeed(), actualRequest.getUrlSeed());
    Assert.assertEquals(request.getSiteSeed(), actualRequest.getSiteSeed());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void generateKeywordIdeasExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockKeywordPlanIdeaService.addException(exception);

    try {
      GenerateKeywordIdeasRequest request =
          GenerateKeywordIdeasRequest.newBuilder()
              .setCustomerId("customerId-1581184615")
              .setLanguage("language-1613589672")
              .addAllGeoTargetConstants(new ArrayList<String>())
              .setIncludeAdultKeywords(true)
              .setPageToken("pageToken873572522")
              .setPageSize(883849137)
              .addAllKeywordAnnotation(
                  new ArrayList<KeywordPlanKeywordAnnotationEnum.KeywordPlanKeywordAnnotation>())
              .setAggregateMetrics(KeywordPlanAggregateMetrics.newBuilder().build())
              .setHistoricalMetricsOptions(HistoricalMetricsOptions.newBuilder().build())
              .build();
      client.generateKeywordIdeas(request);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void generateKeywordHistoricalMetricsTest() throws Exception {
    GenerateKeywordHistoricalMetricsResponse expectedResponse =
        GenerateKeywordHistoricalMetricsResponse.newBuilder()
            .addAllResults(new ArrayList<GenerateKeywordHistoricalMetricsResult>())
            .setAggregateMetricResults(KeywordPlanAggregateMetricResults.newBuilder().build())
            .build();
    mockKeywordPlanIdeaService.addResponse(expectedResponse);

    GenerateKeywordHistoricalMetricsRequest request =
        GenerateKeywordHistoricalMetricsRequest.newBuilder()
            .setCustomerId("customerId-1581184615")
            .addAllKeywords(new ArrayList<String>())
            .setLanguage("language-1613589672")
            .setIncludeAdultKeywords(true)
            .addAllGeoTargetConstants(new ArrayList<String>())
            .setAggregateMetrics(KeywordPlanAggregateMetrics.newBuilder().build())
            .setHistoricalMetricsOptions(HistoricalMetricsOptions.newBuilder().build())
            .build();

    GenerateKeywordHistoricalMetricsResponse actualResponse =
        client.generateKeywordHistoricalMetrics(request);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockKeywordPlanIdeaService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GenerateKeywordHistoricalMetricsRequest actualRequest =
        ((GenerateKeywordHistoricalMetricsRequest) actualRequests.get(0));

    Assert.assertEquals(request.getCustomerId(), actualRequest.getCustomerId());
    Assert.assertEquals(request.getKeywordsList(), actualRequest.getKeywordsList());
    Assert.assertEquals(request.getLanguage(), actualRequest.getLanguage());
    Assert.assertEquals(request.getIncludeAdultKeywords(), actualRequest.getIncludeAdultKeywords());
    Assert.assertEquals(
        request.getGeoTargetConstantsList(), actualRequest.getGeoTargetConstantsList());
    Assert.assertEquals(request.getKeywordPlanNetwork(), actualRequest.getKeywordPlanNetwork());
    Assert.assertEquals(request.getAggregateMetrics(), actualRequest.getAggregateMetrics());
    Assert.assertEquals(
        request.getHistoricalMetricsOptions(), actualRequest.getHistoricalMetricsOptions());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void generateKeywordHistoricalMetricsExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockKeywordPlanIdeaService.addException(exception);

    try {
      GenerateKeywordHistoricalMetricsRequest request =
          GenerateKeywordHistoricalMetricsRequest.newBuilder()
              .setCustomerId("customerId-1581184615")
              .addAllKeywords(new ArrayList<String>())
              .setLanguage("language-1613589672")
              .setIncludeAdultKeywords(true)
              .addAllGeoTargetConstants(new ArrayList<String>())
              .setAggregateMetrics(KeywordPlanAggregateMetrics.newBuilder().build())
              .setHistoricalMetricsOptions(HistoricalMetricsOptions.newBuilder().build())
              .build();
      client.generateKeywordHistoricalMetrics(request);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void generateAdGroupThemesTest() throws Exception {
    GenerateAdGroupThemesResponse expectedResponse =
        GenerateAdGroupThemesResponse.newBuilder()
            .addAllAdGroupKeywordSuggestions(new ArrayList<AdGroupKeywordSuggestion>())
            .addAllUnusableAdGroups(new ArrayList<UnusableAdGroup>())
            .build();
    mockKeywordPlanIdeaService.addResponse(expectedResponse);

    GenerateAdGroupThemesRequest request =
        GenerateAdGroupThemesRequest.newBuilder()
            .setCustomerId("customerId-1581184615")
            .addAllKeywords(new ArrayList<String>())
            .addAllAdGroups(new ArrayList<String>())
            .build();

    GenerateAdGroupThemesResponse actualResponse = client.generateAdGroupThemes(request);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockKeywordPlanIdeaService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GenerateAdGroupThemesRequest actualRequest =
        ((GenerateAdGroupThemesRequest) actualRequests.get(0));

    Assert.assertEquals(request.getCustomerId(), actualRequest.getCustomerId());
    Assert.assertEquals(request.getKeywordsList(), actualRequest.getKeywordsList());
    Assert.assertEquals(request.getAdGroupsList(), actualRequest.getAdGroupsList());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void generateAdGroupThemesExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockKeywordPlanIdeaService.addException(exception);

    try {
      GenerateAdGroupThemesRequest request =
          GenerateAdGroupThemesRequest.newBuilder()
              .setCustomerId("customerId-1581184615")
              .addAllKeywords(new ArrayList<String>())
              .addAllAdGroups(new ArrayList<String>())
              .build();
      client.generateAdGroupThemes(request);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void generateKeywordForecastMetricsTest() throws Exception {
    GenerateKeywordForecastMetricsResponse expectedResponse =
        GenerateKeywordForecastMetricsResponse.newBuilder()
            .setCampaignForecastMetrics(KeywordForecastMetrics.newBuilder().build())
            .build();
    mockKeywordPlanIdeaService.addResponse(expectedResponse);

    GenerateKeywordForecastMetricsRequest request =
        GenerateKeywordForecastMetricsRequest.newBuilder()
            .setCustomerId("customerId-1581184615")
            .setCurrencyCode("currencyCode1004773790")
            .setForecastPeriod(DateRange.newBuilder().build())
            .setCampaign(CampaignToForecast.newBuilder().build())
            .build();

    GenerateKeywordForecastMetricsResponse actualResponse =
        client.generateKeywordForecastMetrics(request);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockKeywordPlanIdeaService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GenerateKeywordForecastMetricsRequest actualRequest =
        ((GenerateKeywordForecastMetricsRequest) actualRequests.get(0));

    Assert.assertEquals(request.getCustomerId(), actualRequest.getCustomerId());
    Assert.assertEquals(request.getCurrencyCode(), actualRequest.getCurrencyCode());
    Assert.assertEquals(request.getForecastPeriod(), actualRequest.getForecastPeriod());
    Assert.assertEquals(request.getCampaign(), actualRequest.getCampaign());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void generateKeywordForecastMetricsExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockKeywordPlanIdeaService.addException(exception);

    try {
      GenerateKeywordForecastMetricsRequest request =
          GenerateKeywordForecastMetricsRequest.newBuilder()
              .setCustomerId("customerId-1581184615")
              .setCurrencyCode("currencyCode1004773790")
              .setForecastPeriod(DateRange.newBuilder().build())
              .setCampaign(CampaignToForecast.newBuilder().build())
              .build();
      client.generateKeywordForecastMetrics(request);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }
}
