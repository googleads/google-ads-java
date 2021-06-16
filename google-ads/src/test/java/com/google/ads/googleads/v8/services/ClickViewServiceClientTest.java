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

import com.google.ads.googleads.v8.common.ClickLocation;
import com.google.ads.googleads.v8.common.KeywordInfo;
import com.google.ads.googleads.v8.resources.AdGroupAdName;
import com.google.ads.googleads.v8.resources.AdGroupCriterionName;
import com.google.ads.googleads.v8.resources.ClickView;
import com.google.ads.googleads.v8.resources.ClickViewName;
import com.google.ads.googleads.v8.resources.GeoTargetConstantName;
import com.google.ads.googleads.v8.resources.UserListName;
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
public class ClickViewServiceClientTest {
  private static MockClickViewService mockClickViewService;
  private static MockServiceHelper mockServiceHelper;
  private LocalChannelProvider channelProvider;
  private ClickViewServiceClient client;

  @BeforeClass
  public static void startStaticServer() {
    mockClickViewService = new MockClickViewService();
    mockServiceHelper =
        new MockServiceHelper(
            UUID.randomUUID().toString(), Arrays.<MockGrpcService>asList(mockClickViewService));
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
    ClickViewServiceSettings settings =
        ClickViewServiceSettings.newBuilder()
            .setTransportChannelProvider(channelProvider)
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = ClickViewServiceClient.create(settings);
  }

  @After
  public void tearDown() throws Exception {
    client.close();
  }

  @Test
  public void getClickViewTest() throws Exception {
    ClickView expectedResponse =
        ClickView.newBuilder()
            .setResourceName(ClickViewName.of("[CUSTOMER_ID]", "[DATE]", "[GCLID]").toString())
            .setGclid("gclid98179115")
            .setAreaOfInterest(ClickLocation.newBuilder().build())
            .setLocationOfPresence(ClickLocation.newBuilder().build())
            .setPageNumber(-1156954375)
            .setAdGroupAd(AdGroupAdName.of("[CUSTOMER_ID]", "[AD_GROUP_ID]", "[AD_ID]").toString())
            .setCampaignLocationTarget(GeoTargetConstantName.of("[CRITERION_ID]").toString())
            .setUserList(UserListName.of("[CUSTOMER_ID]", "[USER_LIST_ID]").toString())
            .setKeyword(
                AdGroupCriterionName.of("[CUSTOMER_ID]", "[AD_GROUP_ID]", "[CRITERION_ID]")
                    .toString())
            .setKeywordInfo(KeywordInfo.newBuilder().build())
            .build();
    mockClickViewService.addResponse(expectedResponse);

    ClickViewName resourceName = ClickViewName.of("[CUSTOMER_ID]", "[DATE]", "[GCLID]");

    ClickView actualResponse = client.getClickView(resourceName);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockClickViewService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetClickViewRequest actualRequest = ((GetClickViewRequest) actualRequests.get(0));

    Assert.assertEquals(resourceName.toString(), actualRequest.getResourceName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getClickViewExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockClickViewService.addException(exception);

    try {
      ClickViewName resourceName = ClickViewName.of("[CUSTOMER_ID]", "[DATE]", "[GCLID]");
      client.getClickView(resourceName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getClickViewTest2() throws Exception {
    ClickView expectedResponse =
        ClickView.newBuilder()
            .setResourceName(ClickViewName.of("[CUSTOMER_ID]", "[DATE]", "[GCLID]").toString())
            .setGclid("gclid98179115")
            .setAreaOfInterest(ClickLocation.newBuilder().build())
            .setLocationOfPresence(ClickLocation.newBuilder().build())
            .setPageNumber(-1156954375)
            .setAdGroupAd(AdGroupAdName.of("[CUSTOMER_ID]", "[AD_GROUP_ID]", "[AD_ID]").toString())
            .setCampaignLocationTarget(GeoTargetConstantName.of("[CRITERION_ID]").toString())
            .setUserList(UserListName.of("[CUSTOMER_ID]", "[USER_LIST_ID]").toString())
            .setKeyword(
                AdGroupCriterionName.of("[CUSTOMER_ID]", "[AD_GROUP_ID]", "[CRITERION_ID]")
                    .toString())
            .setKeywordInfo(KeywordInfo.newBuilder().build())
            .build();
    mockClickViewService.addResponse(expectedResponse);

    String resourceName = "resourceName-384566343";

    ClickView actualResponse = client.getClickView(resourceName);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockClickViewService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetClickViewRequest actualRequest = ((GetClickViewRequest) actualRequests.get(0));

    Assert.assertEquals(resourceName, actualRequest.getResourceName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getClickViewExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockClickViewService.addException(exception);

    try {
      String resourceName = "resourceName-384566343";
      client.getClickView(resourceName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }
}
