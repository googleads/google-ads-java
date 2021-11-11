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

import com.google.ads.googleads.v7.resources.KeywordPlanAdGroupKeyword;
import com.google.ads.googleads.v7.resources.KeywordPlanAdGroupKeywordName;
import com.google.ads.googleads.v7.resources.KeywordPlanAdGroupName;
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
public class KeywordPlanAdGroupKeywordServiceClientTest {
  private static MockKeywordPlanAdGroupKeywordService mockKeywordPlanAdGroupKeywordService;
  private static MockServiceHelper mockServiceHelper;
  private LocalChannelProvider channelProvider;
  private KeywordPlanAdGroupKeywordServiceClient client;

  @BeforeClass
  public static void startStaticServer() {
    mockKeywordPlanAdGroupKeywordService = new MockKeywordPlanAdGroupKeywordService();
    mockServiceHelper =
        new MockServiceHelper(
            UUID.randomUUID().toString(),
            Arrays.<MockGrpcService>asList(mockKeywordPlanAdGroupKeywordService));
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
    KeywordPlanAdGroupKeywordServiceSettings settings =
        KeywordPlanAdGroupKeywordServiceSettings.newBuilder()
            .setTransportChannelProvider(channelProvider)
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = KeywordPlanAdGroupKeywordServiceClient.create(settings);
  }

  @After
  public void tearDown() throws Exception {
    client.close();
  }

  @Test
  public void getKeywordPlanAdGroupKeywordTest() throws Exception {
    KeywordPlanAdGroupKeyword expectedResponse =
        KeywordPlanAdGroupKeyword.newBuilder()
            .setResourceName(
                KeywordPlanAdGroupKeywordName.of(
                        "[CUSTOMER_ID]", "[KEYWORD_PLAN_AD_GROUP_KEYWORD_ID]")
                    .toString())
            .setKeywordPlanAdGroup(
                KeywordPlanAdGroupName.of("[CUSTOMER_ID]", "[KEYWORD_PLAN_AD_GROUP_ID]").toString())
            .setId(3355)
            .setText("text3556653")
            .setCpcBidMicros(909381114)
            .setNegative(true)
            .build();
    mockKeywordPlanAdGroupKeywordService.addResponse(expectedResponse);

    KeywordPlanAdGroupKeywordName resourceName =
        KeywordPlanAdGroupKeywordName.of("[CUSTOMER_ID]", "[KEYWORD_PLAN_AD_GROUP_KEYWORD_ID]");

    KeywordPlanAdGroupKeyword actualResponse = client.getKeywordPlanAdGroupKeyword(resourceName);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockKeywordPlanAdGroupKeywordService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetKeywordPlanAdGroupKeywordRequest actualRequest =
        ((GetKeywordPlanAdGroupKeywordRequest) actualRequests.get(0));

    Assert.assertEquals(resourceName.toString(), actualRequest.getResourceName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getKeywordPlanAdGroupKeywordExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockKeywordPlanAdGroupKeywordService.addException(exception);

    try {
      KeywordPlanAdGroupKeywordName resourceName =
          KeywordPlanAdGroupKeywordName.of("[CUSTOMER_ID]", "[KEYWORD_PLAN_AD_GROUP_KEYWORD_ID]");
      client.getKeywordPlanAdGroupKeyword(resourceName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getKeywordPlanAdGroupKeywordTest2() throws Exception {
    KeywordPlanAdGroupKeyword expectedResponse =
        KeywordPlanAdGroupKeyword.newBuilder()
            .setResourceName(
                KeywordPlanAdGroupKeywordName.of(
                        "[CUSTOMER_ID]", "[KEYWORD_PLAN_AD_GROUP_KEYWORD_ID]")
                    .toString())
            .setKeywordPlanAdGroup(
                KeywordPlanAdGroupName.of("[CUSTOMER_ID]", "[KEYWORD_PLAN_AD_GROUP_ID]").toString())
            .setId(3355)
            .setText("text3556653")
            .setCpcBidMicros(909381114)
            .setNegative(true)
            .build();
    mockKeywordPlanAdGroupKeywordService.addResponse(expectedResponse);

    String resourceName = "resourceName-384566343";

    KeywordPlanAdGroupKeyword actualResponse = client.getKeywordPlanAdGroupKeyword(resourceName);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockKeywordPlanAdGroupKeywordService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetKeywordPlanAdGroupKeywordRequest actualRequest =
        ((GetKeywordPlanAdGroupKeywordRequest) actualRequests.get(0));

    Assert.assertEquals(resourceName, actualRequest.getResourceName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getKeywordPlanAdGroupKeywordExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockKeywordPlanAdGroupKeywordService.addException(exception);

    try {
      String resourceName = "resourceName-384566343";
      client.getKeywordPlanAdGroupKeyword(resourceName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void mutateKeywordPlanAdGroupKeywordsTest() throws Exception {
    MutateKeywordPlanAdGroupKeywordsResponse expectedResponse =
        MutateKeywordPlanAdGroupKeywordsResponse.newBuilder()
            .setPartialFailureError(Status.newBuilder().build())
            .addAllResults(new ArrayList<MutateKeywordPlanAdGroupKeywordResult>())
            .build();
    mockKeywordPlanAdGroupKeywordService.addResponse(expectedResponse);

    String customerId = "customerId-1581184615";
    List<KeywordPlanAdGroupKeywordOperation> operations = new ArrayList<>();

    MutateKeywordPlanAdGroupKeywordsResponse actualResponse =
        client.mutateKeywordPlanAdGroupKeywords(customerId, operations);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockKeywordPlanAdGroupKeywordService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    MutateKeywordPlanAdGroupKeywordsRequest actualRequest =
        ((MutateKeywordPlanAdGroupKeywordsRequest) actualRequests.get(0));

    Assert.assertEquals(customerId, actualRequest.getCustomerId());
    Assert.assertEquals(operations, actualRequest.getOperationsList());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void mutateKeywordPlanAdGroupKeywordsExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockKeywordPlanAdGroupKeywordService.addException(exception);

    try {
      String customerId = "customerId-1581184615";
      List<KeywordPlanAdGroupKeywordOperation> operations = new ArrayList<>();
      client.mutateKeywordPlanAdGroupKeywords(customerId, operations);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }
}
