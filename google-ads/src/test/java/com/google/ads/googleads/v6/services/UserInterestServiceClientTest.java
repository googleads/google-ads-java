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

import com.google.ads.googleads.v6.common.CriterionCategoryAvailability;
import com.google.ads.googleads.v6.resources.UserInterest;
import com.google.ads.googleads.v6.resources.UserInterestName;
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
public class UserInterestServiceClientTest {
  private static MockServiceHelper mockServiceHelper;
  private static MockUserInterestService mockUserInterestService;
  private UserInterestServiceClient client;
  private LocalChannelProvider channelProvider;

  @BeforeClass
  public static void startStaticServer() {
    mockUserInterestService = new MockUserInterestService();
    mockServiceHelper =
        new MockServiceHelper(
            UUID.randomUUID().toString(), Arrays.<MockGrpcService>asList(mockUserInterestService));
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
    UserInterestServiceSettings settings =
        UserInterestServiceSettings.newBuilder()
            .setTransportChannelProvider(channelProvider)
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = UserInterestServiceClient.create(settings);
  }

  @After
  public void tearDown() throws Exception {
    client.close();
  }

  @Test
  public void getUserInterestTest() throws Exception {
    UserInterest expectedResponse =
        UserInterest.newBuilder()
            .setResourceName(UserInterestName.of("[CUSTOMER_ID]", "[USER_INTEREST_ID]").toString())
            .addAllAvailabilities(new ArrayList<CriterionCategoryAvailability>())
            .build();
    mockUserInterestService.addResponse(expectedResponse);

    UserInterestName resourceName = UserInterestName.of("[CUSTOMER_ID]", "[USER_INTEREST_ID]");

    UserInterest actualResponse = client.getUserInterest(resourceName);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockUserInterestService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetUserInterestRequest actualRequest = ((GetUserInterestRequest) actualRequests.get(0));

    Assert.assertEquals(resourceName.toString(), actualRequest.getResourceName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getUserInterestExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockUserInterestService.addException(exception);

    try {
      UserInterestName resourceName = UserInterestName.of("[CUSTOMER_ID]", "[USER_INTEREST_ID]");
      client.getUserInterest(resourceName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getUserInterestTest2() throws Exception {
    UserInterest expectedResponse =
        UserInterest.newBuilder()
            .setResourceName(UserInterestName.of("[CUSTOMER_ID]", "[USER_INTEREST_ID]").toString())
            .addAllAvailabilities(new ArrayList<CriterionCategoryAvailability>())
            .build();
    mockUserInterestService.addResponse(expectedResponse);

    String resourceName = "resourceName-384566343";

    UserInterest actualResponse = client.getUserInterest(resourceName);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockUserInterestService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetUserInterestRequest actualRequest = ((GetUserInterestRequest) actualRequests.get(0));

    Assert.assertEquals(resourceName, actualRequest.getResourceName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getUserInterestExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockUserInterestService.addException(exception);

    try {
      String resourceName = "resourceName-384566343";
      client.getUserInterest(resourceName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }
}
