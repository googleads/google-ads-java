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

import com.google.ads.googleads.v7.resources.UserList;
import com.google.ads.googleads.v7.resources.UserListName;
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
public class UserListServiceClientTest {
  private static MockServiceHelper mockServiceHelper;
  private static MockUserListService mockUserListService;
  private LocalChannelProvider channelProvider;
  private UserListServiceClient client;

  @BeforeClass
  public static void startStaticServer() {
    mockUserListService = new MockUserListService();
    mockServiceHelper =
        new MockServiceHelper(
            UUID.randomUUID().toString(), Arrays.<MockGrpcService>asList(mockUserListService));
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
    UserListServiceSettings settings =
        UserListServiceSettings.newBuilder()
            .setTransportChannelProvider(channelProvider)
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = UserListServiceClient.create(settings);
  }

  @After
  public void tearDown() throws Exception {
    client.close();
  }

  @Test
  public void getUserListTest() throws Exception {
    UserList expectedResponse =
        UserList.newBuilder()
            .setResourceName(UserListName.of("[CUSTOMER_ID]", "[USER_LIST_ID]").toString())
            .setId(3355)
            .setReadOnly(true)
            .setName(UserListName.of("[CUSTOMER_ID]", "[USER_LIST_ID]").toString())
            .setDescription("description-1724546052")
            .setIntegrationCode("integrationCode1802866145")
            .setMembershipLifeSpan(-1773195900)
            .setSizeForDisplay(-42289138)
            .setSizeForSearch(1116581084)
            .setEligibleForSearch(true)
            .setEligibleForDisplay(true)
            .setMatchRatePercentage(-1873464097)
            .build();
    mockUserListService.addResponse(expectedResponse);

    UserListName resourceName = UserListName.of("[CUSTOMER_ID]", "[USER_LIST_ID]");

    UserList actualResponse = client.getUserList(resourceName);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockUserListService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetUserListRequest actualRequest = ((GetUserListRequest) actualRequests.get(0));

    Assert.assertEquals(resourceName.toString(), actualRequest.getResourceName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getUserListExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockUserListService.addException(exception);

    try {
      UserListName resourceName = UserListName.of("[CUSTOMER_ID]", "[USER_LIST_ID]");
      client.getUserList(resourceName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getUserListTest2() throws Exception {
    UserList expectedResponse =
        UserList.newBuilder()
            .setResourceName(UserListName.of("[CUSTOMER_ID]", "[USER_LIST_ID]").toString())
            .setId(3355)
            .setReadOnly(true)
            .setName(UserListName.of("[CUSTOMER_ID]", "[USER_LIST_ID]").toString())
            .setDescription("description-1724546052")
            .setIntegrationCode("integrationCode1802866145")
            .setMembershipLifeSpan(-1773195900)
            .setSizeForDisplay(-42289138)
            .setSizeForSearch(1116581084)
            .setEligibleForSearch(true)
            .setEligibleForDisplay(true)
            .setMatchRatePercentage(-1873464097)
            .build();
    mockUserListService.addResponse(expectedResponse);

    String resourceName = "resourceName-384566343";

    UserList actualResponse = client.getUserList(resourceName);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockUserListService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetUserListRequest actualRequest = ((GetUserListRequest) actualRequests.get(0));

    Assert.assertEquals(resourceName, actualRequest.getResourceName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getUserListExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockUserListService.addException(exception);

    try {
      String resourceName = "resourceName-384566343";
      client.getUserList(resourceName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void mutateUserListsTest() throws Exception {
    MutateUserListsResponse expectedResponse =
        MutateUserListsResponse.newBuilder()
            .setPartialFailureError(Status.newBuilder().build())
            .addAllResults(new ArrayList<MutateUserListResult>())
            .build();
    mockUserListService.addResponse(expectedResponse);

    String customerId = "customerId-1581184615";
    List<UserListOperation> operations = new ArrayList<>();

    MutateUserListsResponse actualResponse = client.mutateUserLists(customerId, operations);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockUserListService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    MutateUserListsRequest actualRequest = ((MutateUserListsRequest) actualRequests.get(0));

    Assert.assertEquals(customerId, actualRequest.getCustomerId());
    Assert.assertEquals(operations, actualRequest.getOperationsList());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void mutateUserListsExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockUserListService.addException(exception);

    try {
      String customerId = "customerId-1581184615";
      List<UserListOperation> operations = new ArrayList<>();
      client.mutateUserLists(customerId, operations);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }
}
