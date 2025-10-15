/*
 * Copyright 2025 Google LLC
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

package com.google.ads.googleads.v22.services;

import com.google.ads.googleads.v22.common.AdditionalApplicationInfo;
import com.google.ads.googleads.v22.common.LocationInfo;
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
public class ContentCreatorInsightsServiceClientTest {
  private static MockContentCreatorInsightsService mockContentCreatorInsightsService;
  private static MockServiceHelper mockServiceHelper;
  private LocalChannelProvider channelProvider;
  private ContentCreatorInsightsServiceClient client;

  @BeforeClass
  public static void startStaticServer() {
    mockContentCreatorInsightsService = new MockContentCreatorInsightsService();
    mockServiceHelper =
        new MockServiceHelper(
            UUID.randomUUID().toString(),
            Arrays.<MockGrpcService>asList(mockContentCreatorInsightsService));
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
    ContentCreatorInsightsServiceSettings settings =
        ContentCreatorInsightsServiceSettings.newBuilder()
            .setTransportChannelProvider(channelProvider)
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = ContentCreatorInsightsServiceClient.create(settings);
  }

  @After
  public void tearDown() throws Exception {
    client.close();
  }

  @Test
  public void generateCreatorInsightsTest() throws Exception {
    GenerateCreatorInsightsResponse expectedResponse =
        GenerateCreatorInsightsResponse.newBuilder()
            .addAllCreatorInsights(new ArrayList<YouTubeCreatorInsights>())
            .build();
    mockContentCreatorInsightsService.addResponse(expectedResponse);

    GenerateCreatorInsightsRequest request =
        GenerateCreatorInsightsRequest.newBuilder()
            .setCustomerId("customerId-1581184615")
            .setCustomerInsightsGroup("customerInsightsGroup1092118566")
            .setInsightsApplicationInfo(AdditionalApplicationInfo.newBuilder().build())
            .addAllCountryLocations(new ArrayList<LocationInfo>())
            .addAllSubCountryLocations(new ArrayList<LocationInfo>())
            .build();

    GenerateCreatorInsightsResponse actualResponse = client.generateCreatorInsights(request);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockContentCreatorInsightsService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GenerateCreatorInsightsRequest actualRequest =
        ((GenerateCreatorInsightsRequest) actualRequests.get(0));

    Assert.assertEquals(request.getCustomerId(), actualRequest.getCustomerId());
    Assert.assertEquals(
        request.getCustomerInsightsGroup(), actualRequest.getCustomerInsightsGroup());
    Assert.assertEquals(
        request.getInsightsApplicationInfo(), actualRequest.getInsightsApplicationInfo());
    Assert.assertEquals(request.getCountryLocationsList(), actualRequest.getCountryLocationsList());
    Assert.assertEquals(
        request.getSubCountryLocationsList(), actualRequest.getSubCountryLocationsList());
    Assert.assertEquals(request.getSearchAttributes(), actualRequest.getSearchAttributes());
    Assert.assertEquals(request.getSearchBrand(), actualRequest.getSearchBrand());
    Assert.assertEquals(request.getSearchChannels(), actualRequest.getSearchChannels());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void generateCreatorInsightsExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockContentCreatorInsightsService.addException(exception);

    try {
      GenerateCreatorInsightsRequest request =
          GenerateCreatorInsightsRequest.newBuilder()
              .setCustomerId("customerId-1581184615")
              .setCustomerInsightsGroup("customerInsightsGroup1092118566")
              .setInsightsApplicationInfo(AdditionalApplicationInfo.newBuilder().build())
              .addAllCountryLocations(new ArrayList<LocationInfo>())
              .addAllSubCountryLocations(new ArrayList<LocationInfo>())
              .build();
      client.generateCreatorInsights(request);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void generateTrendingInsightsTest() throws Exception {
    GenerateTrendingInsightsResponse expectedResponse =
        GenerateTrendingInsightsResponse.newBuilder()
            .addAllTrendInsights(new ArrayList<TrendInsight>())
            .build();
    mockContentCreatorInsightsService.addResponse(expectedResponse);

    GenerateTrendingInsightsRequest request =
        GenerateTrendingInsightsRequest.newBuilder()
            .setCustomerId("customerId-1581184615")
            .setCustomerInsightsGroup("customerInsightsGroup1092118566")
            .setInsightsApplicationInfo(AdditionalApplicationInfo.newBuilder().build())
            .setCountryLocation(LocationInfo.newBuilder().build())
            .build();

    GenerateTrendingInsightsResponse actualResponse = client.generateTrendingInsights(request);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockContentCreatorInsightsService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GenerateTrendingInsightsRequest actualRequest =
        ((GenerateTrendingInsightsRequest) actualRequests.get(0));

    Assert.assertEquals(request.getCustomerId(), actualRequest.getCustomerId());
    Assert.assertEquals(
        request.getCustomerInsightsGroup(), actualRequest.getCustomerInsightsGroup());
    Assert.assertEquals(
        request.getInsightsApplicationInfo(), actualRequest.getInsightsApplicationInfo());
    Assert.assertEquals(request.getCountryLocation(), actualRequest.getCountryLocation());
    Assert.assertEquals(request.getSearchAudience(), actualRequest.getSearchAudience());
    Assert.assertEquals(request.getSearchTopics(), actualRequest.getSearchTopics());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void generateTrendingInsightsExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockContentCreatorInsightsService.addException(exception);

    try {
      GenerateTrendingInsightsRequest request =
          GenerateTrendingInsightsRequest.newBuilder()
              .setCustomerId("customerId-1581184615")
              .setCustomerInsightsGroup("customerInsightsGroup1092118566")
              .setInsightsApplicationInfo(AdditionalApplicationInfo.newBuilder().build())
              .setCountryLocation(LocationInfo.newBuilder().build())
              .build();
      client.generateTrendingInsights(request);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }
}
