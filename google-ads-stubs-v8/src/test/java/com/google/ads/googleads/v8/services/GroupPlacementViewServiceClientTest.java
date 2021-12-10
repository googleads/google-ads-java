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

import com.google.ads.googleads.v8.resources.GroupPlacementView;
import com.google.ads.googleads.v8.resources.GroupPlacementViewName;
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
public class GroupPlacementViewServiceClientTest {
  private static MockGroupPlacementViewService mockGroupPlacementViewService;
  private static MockServiceHelper mockServiceHelper;
  private LocalChannelProvider channelProvider;
  private GroupPlacementViewServiceClient client;

  @BeforeClass
  public static void startStaticServer() {
    mockGroupPlacementViewService = new MockGroupPlacementViewService();
    mockServiceHelper =
        new MockServiceHelper(
            UUID.randomUUID().toString(),
            Arrays.<MockGrpcService>asList(mockGroupPlacementViewService));
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
    GroupPlacementViewServiceSettings settings =
        GroupPlacementViewServiceSettings.newBuilder()
            .setTransportChannelProvider(channelProvider)
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = GroupPlacementViewServiceClient.create(settings);
  }

  @After
  public void tearDown() throws Exception {
    client.close();
  }

  @Test
  public void getGroupPlacementViewTest() throws Exception {
    GroupPlacementView expectedResponse =
        GroupPlacementView.newBuilder()
            .setResourceName(
                GroupPlacementViewName.of("[CUSTOMER_ID]", "[AD_GROUP_ID]", "[BASE64_PLACEMENT]")
                    .toString())
            .setPlacement("placement1792938725")
            .setDisplayName("displayName1714148973")
            .setTargetUrl("targetUrl-815585762")
            .build();
    mockGroupPlacementViewService.addResponse(expectedResponse);

    GroupPlacementViewName resourceName =
        GroupPlacementViewName.of("[CUSTOMER_ID]", "[AD_GROUP_ID]", "[BASE64_PLACEMENT]");

    GroupPlacementView actualResponse = client.getGroupPlacementView(resourceName);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockGroupPlacementViewService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetGroupPlacementViewRequest actualRequest =
        ((GetGroupPlacementViewRequest) actualRequests.get(0));

    Assert.assertEquals(resourceName.toString(), actualRequest.getResourceName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getGroupPlacementViewExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockGroupPlacementViewService.addException(exception);

    try {
      GroupPlacementViewName resourceName =
          GroupPlacementViewName.of("[CUSTOMER_ID]", "[AD_GROUP_ID]", "[BASE64_PLACEMENT]");
      client.getGroupPlacementView(resourceName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getGroupPlacementViewTest2() throws Exception {
    GroupPlacementView expectedResponse =
        GroupPlacementView.newBuilder()
            .setResourceName(
                GroupPlacementViewName.of("[CUSTOMER_ID]", "[AD_GROUP_ID]", "[BASE64_PLACEMENT]")
                    .toString())
            .setPlacement("placement1792938725")
            .setDisplayName("displayName1714148973")
            .setTargetUrl("targetUrl-815585762")
            .build();
    mockGroupPlacementViewService.addResponse(expectedResponse);

    String resourceName = "resourceName-384566343";

    GroupPlacementView actualResponse = client.getGroupPlacementView(resourceName);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockGroupPlacementViewService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetGroupPlacementViewRequest actualRequest =
        ((GetGroupPlacementViewRequest) actualRequests.get(0));

    Assert.assertEquals(resourceName, actualRequest.getResourceName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getGroupPlacementViewExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockGroupPlacementViewService.addException(exception);

    try {
      String resourceName = "resourceName-384566343";
      client.getGroupPlacementView(resourceName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }
}
