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

import com.google.ads.googleads.v8.common.SmartCampaignAdInfo;
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
public class SmartCampaignSuggestServiceClientTest {
  private static MockServiceHelper mockServiceHelper;
  private static MockSmartCampaignSuggestService mockSmartCampaignSuggestService;
  private LocalChannelProvider channelProvider;
  private SmartCampaignSuggestServiceClient client;

  @BeforeClass
  public static void startStaticServer() {
    mockSmartCampaignSuggestService = new MockSmartCampaignSuggestService();
    mockServiceHelper =
        new MockServiceHelper(
            UUID.randomUUID().toString(),
            Arrays.<MockGrpcService>asList(mockSmartCampaignSuggestService));
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
    SmartCampaignSuggestServiceSettings settings =
        SmartCampaignSuggestServiceSettings.newBuilder()
            .setTransportChannelProvider(channelProvider)
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = SmartCampaignSuggestServiceClient.create(settings);
  }

  @After
  public void tearDown() throws Exception {
    client.close();
  }

  @Test
  public void suggestSmartCampaignBudgetOptionsTest() throws Exception {
    SuggestSmartCampaignBudgetOptionsResponse expectedResponse =
        SuggestSmartCampaignBudgetOptionsResponse.newBuilder()
            .setLow(SuggestSmartCampaignBudgetOptionsResponse.BudgetOption.newBuilder().build())
            .setRecommended(
                SuggestSmartCampaignBudgetOptionsResponse.BudgetOption.newBuilder().build())
            .setHigh(SuggestSmartCampaignBudgetOptionsResponse.BudgetOption.newBuilder().build())
            .build();
    mockSmartCampaignSuggestService.addResponse(expectedResponse);

    SuggestSmartCampaignBudgetOptionsRequest request =
        SuggestSmartCampaignBudgetOptionsRequest.newBuilder()
            .setCustomerId("customerId-1581184615")
            .build();

    SuggestSmartCampaignBudgetOptionsResponse actualResponse =
        client.suggestSmartCampaignBudgetOptions(request);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockSmartCampaignSuggestService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    SuggestSmartCampaignBudgetOptionsRequest actualRequest =
        ((SuggestSmartCampaignBudgetOptionsRequest) actualRequests.get(0));

    Assert.assertEquals(request.getCustomerId(), actualRequest.getCustomerId());
    Assert.assertEquals(request.getCampaign(), actualRequest.getCampaign());
    Assert.assertEquals(request.getSuggestionInfo(), actualRequest.getSuggestionInfo());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void suggestSmartCampaignBudgetOptionsExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockSmartCampaignSuggestService.addException(exception);

    try {
      SuggestSmartCampaignBudgetOptionsRequest request =
          SuggestSmartCampaignBudgetOptionsRequest.newBuilder()
              .setCustomerId("customerId-1581184615")
              .build();
      client.suggestSmartCampaignBudgetOptions(request);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void suggestSmartCampaignAdTest() throws Exception {
    SuggestSmartCampaignAdResponse expectedResponse =
        SuggestSmartCampaignAdResponse.newBuilder()
            .setAdInfo(SmartCampaignAdInfo.newBuilder().build())
            .build();
    mockSmartCampaignSuggestService.addResponse(expectedResponse);

    SuggestSmartCampaignAdRequest request =
        SuggestSmartCampaignAdRequest.newBuilder()
            .setCustomerId("customerId-1581184615")
            .setSuggestionInfo(SmartCampaignSuggestionInfo.newBuilder().build())
            .build();

    SuggestSmartCampaignAdResponse actualResponse = client.suggestSmartCampaignAd(request);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockSmartCampaignSuggestService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    SuggestSmartCampaignAdRequest actualRequest =
        ((SuggestSmartCampaignAdRequest) actualRequests.get(0));

    Assert.assertEquals(request.getCustomerId(), actualRequest.getCustomerId());
    Assert.assertEquals(request.getSuggestionInfo(), actualRequest.getSuggestionInfo());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void suggestSmartCampaignAdExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockSmartCampaignSuggestService.addException(exception);

    try {
      SuggestSmartCampaignAdRequest request =
          SuggestSmartCampaignAdRequest.newBuilder()
              .setCustomerId("customerId-1581184615")
              .setSuggestionInfo(SmartCampaignSuggestionInfo.newBuilder().build())
              .build();
      client.suggestSmartCampaignAd(request);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }
}
