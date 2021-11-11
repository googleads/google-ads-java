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

import com.google.ads.googleads.v7.resources.CustomInterest;
import com.google.ads.googleads.v7.resources.CustomInterestMember;
import com.google.ads.googleads.v7.resources.CustomInterestName;
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
public class CustomInterestServiceClientTest {
  private static MockCustomInterestService mockCustomInterestService;
  private static MockServiceHelper mockServiceHelper;
  private LocalChannelProvider channelProvider;
  private CustomInterestServiceClient client;

  @BeforeClass
  public static void startStaticServer() {
    mockCustomInterestService = new MockCustomInterestService();
    mockServiceHelper =
        new MockServiceHelper(
            UUID.randomUUID().toString(),
            Arrays.<MockGrpcService>asList(mockCustomInterestService));
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
    CustomInterestServiceSettings settings =
        CustomInterestServiceSettings.newBuilder()
            .setTransportChannelProvider(channelProvider)
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = CustomInterestServiceClient.create(settings);
  }

  @After
  public void tearDown() throws Exception {
    client.close();
  }

  @Test
  public void getCustomInterestTest() throws Exception {
    CustomInterest expectedResponse =
        CustomInterest.newBuilder()
            .setResourceName(
                CustomInterestName.of("[CUSTOMER_ID]", "[CUSTOM_INTEREST_ID]").toString())
            .setId(3355)
            .setName(CustomInterestName.of("[CUSTOMER_ID]", "[CUSTOM_INTEREST_ID]").toString())
            .setDescription("description-1724546052")
            .addAllMembers(new ArrayList<CustomInterestMember>())
            .build();
    mockCustomInterestService.addResponse(expectedResponse);

    CustomInterestName resourceName =
        CustomInterestName.of("[CUSTOMER_ID]", "[CUSTOM_INTEREST_ID]");

    CustomInterest actualResponse = client.getCustomInterest(resourceName);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockCustomInterestService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetCustomInterestRequest actualRequest = ((GetCustomInterestRequest) actualRequests.get(0));

    Assert.assertEquals(resourceName.toString(), actualRequest.getResourceName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getCustomInterestExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockCustomInterestService.addException(exception);

    try {
      CustomInterestName resourceName =
          CustomInterestName.of("[CUSTOMER_ID]", "[CUSTOM_INTEREST_ID]");
      client.getCustomInterest(resourceName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getCustomInterestTest2() throws Exception {
    CustomInterest expectedResponse =
        CustomInterest.newBuilder()
            .setResourceName(
                CustomInterestName.of("[CUSTOMER_ID]", "[CUSTOM_INTEREST_ID]").toString())
            .setId(3355)
            .setName(CustomInterestName.of("[CUSTOMER_ID]", "[CUSTOM_INTEREST_ID]").toString())
            .setDescription("description-1724546052")
            .addAllMembers(new ArrayList<CustomInterestMember>())
            .build();
    mockCustomInterestService.addResponse(expectedResponse);

    String resourceName = "resourceName-384566343";

    CustomInterest actualResponse = client.getCustomInterest(resourceName);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockCustomInterestService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetCustomInterestRequest actualRequest = ((GetCustomInterestRequest) actualRequests.get(0));

    Assert.assertEquals(resourceName, actualRequest.getResourceName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getCustomInterestExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockCustomInterestService.addException(exception);

    try {
      String resourceName = "resourceName-384566343";
      client.getCustomInterest(resourceName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void mutateCustomInterestsTest() throws Exception {
    MutateCustomInterestsResponse expectedResponse =
        MutateCustomInterestsResponse.newBuilder()
            .addAllResults(new ArrayList<MutateCustomInterestResult>())
            .build();
    mockCustomInterestService.addResponse(expectedResponse);

    String customerId = "customerId-1581184615";
    List<CustomInterestOperation> operations = new ArrayList<>();

    MutateCustomInterestsResponse actualResponse =
        client.mutateCustomInterests(customerId, operations);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockCustomInterestService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    MutateCustomInterestsRequest actualRequest =
        ((MutateCustomInterestsRequest) actualRequests.get(0));

    Assert.assertEquals(customerId, actualRequest.getCustomerId());
    Assert.assertEquals(operations, actualRequest.getOperationsList());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void mutateCustomInterestsExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockCustomInterestService.addException(exception);

    try {
      String customerId = "customerId-1581184615";
      List<CustomInterestOperation> operations = new ArrayList<>();
      client.mutateCustomInterests(customerId, operations);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }
}
