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

import com.google.ads.googleads.v6.common.TagSnippet;
import com.google.ads.googleads.v6.resources.RemarketingAction;
import com.google.ads.googleads.v6.resources.RemarketingActionName;
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
public class RemarketingActionServiceClientTest {
  private static MockServiceHelper mockServiceHelper;
  private static MockRemarketingActionService mockRemarketingActionService;
  private RemarketingActionServiceClient client;
  private LocalChannelProvider channelProvider;

  @BeforeClass
  public static void startStaticServer() {
    mockRemarketingActionService = new MockRemarketingActionService();
    mockServiceHelper =
        new MockServiceHelper(
            UUID.randomUUID().toString(),
            Arrays.<MockGrpcService>asList(mockRemarketingActionService));
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
    RemarketingActionServiceSettings settings =
        RemarketingActionServiceSettings.newBuilder()
            .setTransportChannelProvider(channelProvider)
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = RemarketingActionServiceClient.create(settings);
  }

  @After
  public void tearDown() throws Exception {
    client.close();
  }

  @Test
  public void getRemarketingActionTest() throws Exception {
    RemarketingAction expectedResponse =
        RemarketingAction.newBuilder()
            .setResourceName(
                RemarketingActionName.of("[CUSTOMER_ID]", "[REMARKETING_ACTION_ID]").toString())
            .addAllTagSnippets(new ArrayList<TagSnippet>())
            .build();
    mockRemarketingActionService.addResponse(expectedResponse);

    RemarketingActionName resourceName =
        RemarketingActionName.of("[CUSTOMER_ID]", "[REMARKETING_ACTION_ID]");

    RemarketingAction actualResponse = client.getRemarketingAction(resourceName);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockRemarketingActionService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetRemarketingActionRequest actualRequest =
        ((GetRemarketingActionRequest) actualRequests.get(0));

    Assert.assertEquals(resourceName.toString(), actualRequest.getResourceName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getRemarketingActionExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockRemarketingActionService.addException(exception);

    try {
      RemarketingActionName resourceName =
          RemarketingActionName.of("[CUSTOMER_ID]", "[REMARKETING_ACTION_ID]");
      client.getRemarketingAction(resourceName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getRemarketingActionTest2() throws Exception {
    RemarketingAction expectedResponse =
        RemarketingAction.newBuilder()
            .setResourceName(
                RemarketingActionName.of("[CUSTOMER_ID]", "[REMARKETING_ACTION_ID]").toString())
            .addAllTagSnippets(new ArrayList<TagSnippet>())
            .build();
    mockRemarketingActionService.addResponse(expectedResponse);

    String resourceName = "resourceName-384566343";

    RemarketingAction actualResponse = client.getRemarketingAction(resourceName);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockRemarketingActionService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetRemarketingActionRequest actualRequest =
        ((GetRemarketingActionRequest) actualRequests.get(0));

    Assert.assertEquals(resourceName, actualRequest.getResourceName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getRemarketingActionExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockRemarketingActionService.addException(exception);

    try {
      String resourceName = "resourceName-384566343";
      client.getRemarketingAction(resourceName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void mutateRemarketingActionsTest() throws Exception {
    MutateRemarketingActionsResponse expectedResponse =
        MutateRemarketingActionsResponse.newBuilder()
            .setPartialFailureError(Status.newBuilder().build())
            .addAllResults(new ArrayList<MutateRemarketingActionResult>())
            .build();
    mockRemarketingActionService.addResponse(expectedResponse);

    String customerId = "customerId-1581184615";
    List<RemarketingActionOperation> operations = new ArrayList<>();

    MutateRemarketingActionsResponse actualResponse =
        client.mutateRemarketingActions(customerId, operations);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockRemarketingActionService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    MutateRemarketingActionsRequest actualRequest =
        ((MutateRemarketingActionsRequest) actualRequests.get(0));

    Assert.assertEquals(customerId, actualRequest.getCustomerId());
    Assert.assertEquals(operations, actualRequest.getOperationsList());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void mutateRemarketingActionsExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockRemarketingActionService.addException(exception);

    try {
      String customerId = "customerId-1581184615";
      List<RemarketingActionOperation> operations = new ArrayList<>();
      client.mutateRemarketingActions(customerId, operations);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }
}
