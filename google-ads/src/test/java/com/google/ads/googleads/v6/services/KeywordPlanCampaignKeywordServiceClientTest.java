/*
 * Copyright 2020 Google LLC
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

package com.google.ads.googleads.v6.services;

import com.google.ads.googleads.v6.resources.KeywordPlanCampaignKeyword;
import com.google.ads.googleads.v6.resources.KeywordPlanCampaignKeywordName;
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
public class KeywordPlanCampaignKeywordServiceClientTest {
  private static MockServiceHelper mockServiceHelper;
  private static MockKeywordPlanCampaignKeywordService mockKeywordPlanCampaignKeywordService;
  private KeywordPlanCampaignKeywordServiceClient client;
  private LocalChannelProvider channelProvider;

  @BeforeClass
  public static void startStaticServer() {
    mockKeywordPlanCampaignKeywordService = new MockKeywordPlanCampaignKeywordService();
    mockServiceHelper =
        new MockServiceHelper(
            UUID.randomUUID().toString(),
            Arrays.<MockGrpcService>asList(mockKeywordPlanCampaignKeywordService));
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
    KeywordPlanCampaignKeywordServiceSettings settings =
        KeywordPlanCampaignKeywordServiceSettings.newBuilder()
            .setTransportChannelProvider(channelProvider)
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = KeywordPlanCampaignKeywordServiceClient.create(settings);
  }

  @After
  public void tearDown() throws Exception {
    client.close();
  }

  @Test
  public void getKeywordPlanCampaignKeywordTest() throws Exception {
    KeywordPlanCampaignKeyword expectedResponse =
        KeywordPlanCampaignKeyword.newBuilder()
            .setResourceName(
                KeywordPlanCampaignKeywordName.of(
                        "[CUSTOMER_ID]", "[KEYWORD_PLAN_CAMPAIGN_KEYWORD_ID]")
                    .toString())
            .build();
    mockKeywordPlanCampaignKeywordService.addResponse(expectedResponse);

    KeywordPlanCampaignKeywordName resourceName =
        KeywordPlanCampaignKeywordName.of("[CUSTOMER_ID]", "[KEYWORD_PLAN_CAMPAIGN_KEYWORD_ID]");

    KeywordPlanCampaignKeyword actualResponse = client.getKeywordPlanCampaignKeyword(resourceName);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockKeywordPlanCampaignKeywordService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetKeywordPlanCampaignKeywordRequest actualRequest =
        ((GetKeywordPlanCampaignKeywordRequest) actualRequests.get(0));

    Assert.assertEquals(resourceName.toString(), actualRequest.getResourceName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getKeywordPlanCampaignKeywordExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockKeywordPlanCampaignKeywordService.addException(exception);

    try {
      KeywordPlanCampaignKeywordName resourceName =
          KeywordPlanCampaignKeywordName.of("[CUSTOMER_ID]", "[KEYWORD_PLAN_CAMPAIGN_KEYWORD_ID]");
      client.getKeywordPlanCampaignKeyword(resourceName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getKeywordPlanCampaignKeywordTest2() throws Exception {
    KeywordPlanCampaignKeyword expectedResponse =
        KeywordPlanCampaignKeyword.newBuilder()
            .setResourceName(
                KeywordPlanCampaignKeywordName.of(
                        "[CUSTOMER_ID]", "[KEYWORD_PLAN_CAMPAIGN_KEYWORD_ID]")
                    .toString())
            .build();
    mockKeywordPlanCampaignKeywordService.addResponse(expectedResponse);

    String resourceName = "resourceName-384566343";

    KeywordPlanCampaignKeyword actualResponse = client.getKeywordPlanCampaignKeyword(resourceName);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockKeywordPlanCampaignKeywordService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetKeywordPlanCampaignKeywordRequest actualRequest =
        ((GetKeywordPlanCampaignKeywordRequest) actualRequests.get(0));

    Assert.assertEquals(resourceName, actualRequest.getResourceName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getKeywordPlanCampaignKeywordExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockKeywordPlanCampaignKeywordService.addException(exception);

    try {
      String resourceName = "resourceName-384566343";
      client.getKeywordPlanCampaignKeyword(resourceName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void mutateKeywordPlanCampaignKeywordsTest() throws Exception {
    MutateKeywordPlanCampaignKeywordsResponse expectedResponse =
        MutateKeywordPlanCampaignKeywordsResponse.newBuilder()
            .setPartialFailureError(Status.newBuilder().build())
            .addAllResults(new ArrayList<MutateKeywordPlanCampaignKeywordResult>())
            .build();
    mockKeywordPlanCampaignKeywordService.addResponse(expectedResponse);

    String customerId = "customerId-1581184615";
    List<KeywordPlanCampaignKeywordOperation> operations = new ArrayList<>();

    MutateKeywordPlanCampaignKeywordsResponse actualResponse =
        client.mutateKeywordPlanCampaignKeywords(customerId, operations);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockKeywordPlanCampaignKeywordService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    MutateKeywordPlanCampaignKeywordsRequest actualRequest =
        ((MutateKeywordPlanCampaignKeywordsRequest) actualRequests.get(0));

    Assert.assertEquals(customerId, actualRequest.getCustomerId());
    Assert.assertEquals(operations, actualRequest.getOperationsList());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void mutateKeywordPlanCampaignKeywordsExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockKeywordPlanCampaignKeywordService.addException(exception);

    try {
      String customerId = "customerId-1581184615";
      List<KeywordPlanCampaignKeywordOperation> operations = new ArrayList<>();
      client.mutateKeywordPlanCampaignKeywords(customerId, operations);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }
}
