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

import com.google.ads.googleads.v7.resources.UserLocationView;
import com.google.ads.googleads.v7.resources.UserLocationViewName;
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
public class UserLocationViewServiceClientTest {
  private static MockServiceHelper mockServiceHelper;
  private static MockUserLocationViewService mockUserLocationViewService;
  private LocalChannelProvider channelProvider;
  private UserLocationViewServiceClient client;

  @BeforeClass
  public static void startStaticServer() {
    mockUserLocationViewService = new MockUserLocationViewService();
    mockServiceHelper =
        new MockServiceHelper(
            UUID.randomUUID().toString(),
            Arrays.<MockGrpcService>asList(mockUserLocationViewService));
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
    UserLocationViewServiceSettings settings =
        UserLocationViewServiceSettings.newBuilder()
            .setTransportChannelProvider(channelProvider)
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = UserLocationViewServiceClient.create(settings);
  }

  @After
  public void tearDown() throws Exception {
    client.close();
  }

  @Test
  public void getUserLocationViewTest() throws Exception {
    UserLocationView expectedResponse =
        UserLocationView.newBuilder()
            .setResourceName(
                UserLocationViewName.of(
                        "[CUSTOMER_ID]", "[COUNTRY_CRITERION_ID]", "[IS_TARGETING_LOCATION]")
                    .toString())
            .setCountryCriterionId(-1427674750)
            .setTargetingLocation(true)
            .build();
    mockUserLocationViewService.addResponse(expectedResponse);

    UserLocationViewName resourceName =
        UserLocationViewName.of(
            "[CUSTOMER_ID]", "[COUNTRY_CRITERION_ID]", "[IS_TARGETING_LOCATION]");

    UserLocationView actualResponse = client.getUserLocationView(resourceName);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockUserLocationViewService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetUserLocationViewRequest actualRequest = ((GetUserLocationViewRequest) actualRequests.get(0));

    Assert.assertEquals(resourceName.toString(), actualRequest.getResourceName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getUserLocationViewExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockUserLocationViewService.addException(exception);

    try {
      UserLocationViewName resourceName =
          UserLocationViewName.of(
              "[CUSTOMER_ID]", "[COUNTRY_CRITERION_ID]", "[IS_TARGETING_LOCATION]");
      client.getUserLocationView(resourceName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getUserLocationViewTest2() throws Exception {
    UserLocationView expectedResponse =
        UserLocationView.newBuilder()
            .setResourceName(
                UserLocationViewName.of(
                        "[CUSTOMER_ID]", "[COUNTRY_CRITERION_ID]", "[IS_TARGETING_LOCATION]")
                    .toString())
            .setCountryCriterionId(-1427674750)
            .setTargetingLocation(true)
            .build();
    mockUserLocationViewService.addResponse(expectedResponse);

    String resourceName = "resourceName-384566343";

    UserLocationView actualResponse = client.getUserLocationView(resourceName);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockUserLocationViewService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetUserLocationViewRequest actualRequest = ((GetUserLocationViewRequest) actualRequests.get(0));

    Assert.assertEquals(resourceName, actualRequest.getResourceName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getUserLocationViewExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockUserLocationViewService.addException(exception);

    try {
      String resourceName = "resourceName-384566343";
      client.getUserLocationView(resourceName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }
}
