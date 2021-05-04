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

import com.google.ads.googleads.v7.resources.KeywordPlanCampaign;
import com.google.ads.googleads.v7.resources.KeywordPlanCampaignName;
import com.google.ads.googleads.v7.resources.KeywordPlanGeoTarget;
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
public class KeywordPlanCampaignServiceClientTest {
  private static MockServiceHelper mockServiceHelper;
  private KeywordPlanCampaignServiceClient client;
  private static MockKeywordPlanCampaignService mockKeywordPlanCampaignService;
  private LocalChannelProvider channelProvider;

  @BeforeClass
  public static void startStaticServer() {
    mockKeywordPlanCampaignService = new MockKeywordPlanCampaignService();
    mockServiceHelper =
        new MockServiceHelper(
            UUID.randomUUID().toString(),
            Arrays.<MockGrpcService>asList(mockKeywordPlanCampaignService));
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
    KeywordPlanCampaignServiceSettings settings =
        KeywordPlanCampaignServiceSettings.newBuilder()
            .setTransportChannelProvider(channelProvider)
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = KeywordPlanCampaignServiceClient.create(settings);
  }

  @After
  public void tearDown() throws Exception {
    client.close();
  }

  @Test
  public void getKeywordPlanCampaignTest() throws Exception {
    KeywordPlanCampaign expectedResponse =
        KeywordPlanCampaign.newBuilder()
            .setResourceName(
                KeywordPlanCampaignName.of("[CUSTOMER_ID]", "[KEYWORD_PLAN_CAMPAIGN_ID]")
                    .toString())
            .addAllLanguageConstants(new ArrayList<String>())
            .addAllGeoTargets(new ArrayList<KeywordPlanGeoTarget>())
            .build();
    mockKeywordPlanCampaignService.addResponse(expectedResponse);

    KeywordPlanCampaignName resourceName =
        KeywordPlanCampaignName.of("[CUSTOMER_ID]", "[KEYWORD_PLAN_CAMPAIGN_ID]");

    KeywordPlanCampaign actualResponse = client.getKeywordPlanCampaign(resourceName);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockKeywordPlanCampaignService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetKeywordPlanCampaignRequest actualRequest =
        ((GetKeywordPlanCampaignRequest) actualRequests.get(0));

    Assert.assertEquals(resourceName.toString(), actualRequest.getResourceName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getKeywordPlanCampaignExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockKeywordPlanCampaignService.addException(exception);

    try {
      KeywordPlanCampaignName resourceName =
          KeywordPlanCampaignName.of("[CUSTOMER_ID]", "[KEYWORD_PLAN_CAMPAIGN_ID]");
      client.getKeywordPlanCampaign(resourceName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getKeywordPlanCampaignTest2() throws Exception {
    KeywordPlanCampaign expectedResponse =
        KeywordPlanCampaign.newBuilder()
            .setResourceName(
                KeywordPlanCampaignName.of("[CUSTOMER_ID]", "[KEYWORD_PLAN_CAMPAIGN_ID]")
                    .toString())
            .addAllLanguageConstants(new ArrayList<String>())
            .addAllGeoTargets(new ArrayList<KeywordPlanGeoTarget>())
            .build();
    mockKeywordPlanCampaignService.addResponse(expectedResponse);

    String resourceName = "resourceName-384566343";

    KeywordPlanCampaign actualResponse = client.getKeywordPlanCampaign(resourceName);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockKeywordPlanCampaignService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetKeywordPlanCampaignRequest actualRequest =
        ((GetKeywordPlanCampaignRequest) actualRequests.get(0));

    Assert.assertEquals(resourceName, actualRequest.getResourceName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getKeywordPlanCampaignExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockKeywordPlanCampaignService.addException(exception);

    try {
      String resourceName = "resourceName-384566343";
      client.getKeywordPlanCampaign(resourceName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void mutateKeywordPlanCampaignsTest() throws Exception {
    MutateKeywordPlanCampaignsResponse expectedResponse =
        MutateKeywordPlanCampaignsResponse.newBuilder()
            .setPartialFailureError(Status.newBuilder().build())
            .addAllResults(new ArrayList<MutateKeywordPlanCampaignResult>())
            .build();
    mockKeywordPlanCampaignService.addResponse(expectedResponse);

    String customerId = "customerId-1581184615";
    List<KeywordPlanCampaignOperation> operations = new ArrayList<>();

    MutateKeywordPlanCampaignsResponse actualResponse =
        client.mutateKeywordPlanCampaigns(customerId, operations);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockKeywordPlanCampaignService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    MutateKeywordPlanCampaignsRequest actualRequest =
        ((MutateKeywordPlanCampaignsRequest) actualRequests.get(0));

    Assert.assertEquals(customerId, actualRequest.getCustomerId());
    Assert.assertEquals(operations, actualRequest.getOperationsList());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void mutateKeywordPlanCampaignsExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockKeywordPlanCampaignService.addException(exception);

    try {
      String customerId = "customerId-1581184615";
      List<KeywordPlanCampaignOperation> operations = new ArrayList<>();
      client.mutateKeywordPlanCampaigns(customerId, operations);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }
}
