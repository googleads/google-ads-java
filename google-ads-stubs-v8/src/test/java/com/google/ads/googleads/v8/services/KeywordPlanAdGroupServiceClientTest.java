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

import com.google.ads.googleads.v8.resources.KeywordPlanAdGroup;
import com.google.ads.googleads.v8.resources.KeywordPlanAdGroupName;
import com.google.ads.googleads.v8.resources.KeywordPlanCampaignName;
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
public class KeywordPlanAdGroupServiceClientTest {
  private static MockKeywordPlanAdGroupService mockKeywordPlanAdGroupService;
  private static MockServiceHelper mockServiceHelper;
  private LocalChannelProvider channelProvider;
  private KeywordPlanAdGroupServiceClient client;

  @BeforeClass
  public static void startStaticServer() {
    mockKeywordPlanAdGroupService = new MockKeywordPlanAdGroupService();
    mockServiceHelper =
        new MockServiceHelper(
            UUID.randomUUID().toString(),
            Arrays.<MockGrpcService>asList(mockKeywordPlanAdGroupService));
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
    KeywordPlanAdGroupServiceSettings settings =
        KeywordPlanAdGroupServiceSettings.newBuilder()
            .setTransportChannelProvider(channelProvider)
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = KeywordPlanAdGroupServiceClient.create(settings);
  }

  @After
  public void tearDown() throws Exception {
    client.close();
  }

  @Test
  public void getKeywordPlanAdGroupTest() throws Exception {
    KeywordPlanAdGroup expectedResponse =
        KeywordPlanAdGroup.newBuilder()
            .setResourceName(
                KeywordPlanAdGroupName.of("[CUSTOMER_ID]", "[KEYWORD_PLAN_AD_GROUP_ID]").toString())
            .setKeywordPlanCampaign(
                KeywordPlanCampaignName.of("[CUSTOMER_ID]", "[KEYWORD_PLAN_CAMPAIGN_ID]")
                    .toString())
            .setId(3355)
            .setName(
                KeywordPlanAdGroupName.of("[CUSTOMER_ID]", "[KEYWORD_PLAN_AD_GROUP_ID]").toString())
            .setCpcBidMicros(909381114)
            .build();
    mockKeywordPlanAdGroupService.addResponse(expectedResponse);

    KeywordPlanAdGroupName resourceName =
        KeywordPlanAdGroupName.of("[CUSTOMER_ID]", "[KEYWORD_PLAN_AD_GROUP_ID]");

    KeywordPlanAdGroup actualResponse = client.getKeywordPlanAdGroup(resourceName);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockKeywordPlanAdGroupService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetKeywordPlanAdGroupRequest actualRequest =
        ((GetKeywordPlanAdGroupRequest) actualRequests.get(0));

    Assert.assertEquals(resourceName.toString(), actualRequest.getResourceName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getKeywordPlanAdGroupExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockKeywordPlanAdGroupService.addException(exception);

    try {
      KeywordPlanAdGroupName resourceName =
          KeywordPlanAdGroupName.of("[CUSTOMER_ID]", "[KEYWORD_PLAN_AD_GROUP_ID]");
      client.getKeywordPlanAdGroup(resourceName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getKeywordPlanAdGroupTest2() throws Exception {
    KeywordPlanAdGroup expectedResponse =
        KeywordPlanAdGroup.newBuilder()
            .setResourceName(
                KeywordPlanAdGroupName.of("[CUSTOMER_ID]", "[KEYWORD_PLAN_AD_GROUP_ID]").toString())
            .setKeywordPlanCampaign(
                KeywordPlanCampaignName.of("[CUSTOMER_ID]", "[KEYWORD_PLAN_CAMPAIGN_ID]")
                    .toString())
            .setId(3355)
            .setName(
                KeywordPlanAdGroupName.of("[CUSTOMER_ID]", "[KEYWORD_PLAN_AD_GROUP_ID]").toString())
            .setCpcBidMicros(909381114)
            .build();
    mockKeywordPlanAdGroupService.addResponse(expectedResponse);

    String resourceName = "resourceName-384566343";

    KeywordPlanAdGroup actualResponse = client.getKeywordPlanAdGroup(resourceName);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockKeywordPlanAdGroupService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetKeywordPlanAdGroupRequest actualRequest =
        ((GetKeywordPlanAdGroupRequest) actualRequests.get(0));

    Assert.assertEquals(resourceName, actualRequest.getResourceName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getKeywordPlanAdGroupExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockKeywordPlanAdGroupService.addException(exception);

    try {
      String resourceName = "resourceName-384566343";
      client.getKeywordPlanAdGroup(resourceName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void mutateKeywordPlanAdGroupsTest() throws Exception {
    MutateKeywordPlanAdGroupsResponse expectedResponse =
        MutateKeywordPlanAdGroupsResponse.newBuilder()
            .setPartialFailureError(Status.newBuilder().build())
            .addAllResults(new ArrayList<MutateKeywordPlanAdGroupResult>())
            .build();
    mockKeywordPlanAdGroupService.addResponse(expectedResponse);

    String customerId = "customerId-1581184615";
    List<KeywordPlanAdGroupOperation> operations = new ArrayList<>();

    MutateKeywordPlanAdGroupsResponse actualResponse =
        client.mutateKeywordPlanAdGroups(customerId, operations);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockKeywordPlanAdGroupService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    MutateKeywordPlanAdGroupsRequest actualRequest =
        ((MutateKeywordPlanAdGroupsRequest) actualRequests.get(0));

    Assert.assertEquals(customerId, actualRequest.getCustomerId());
    Assert.assertEquals(operations, actualRequest.getOperationsList());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void mutateKeywordPlanAdGroupsExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockKeywordPlanAdGroupService.addException(exception);

    try {
      String customerId = "customerId-1581184615";
      List<KeywordPlanAdGroupOperation> operations = new ArrayList<>();
      client.mutateKeywordPlanAdGroups(customerId, operations);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }
}
