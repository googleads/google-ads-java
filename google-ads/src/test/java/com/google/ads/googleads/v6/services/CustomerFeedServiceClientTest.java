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

import com.google.ads.googleads.v6.common.MatchingFunction;
import com.google.ads.googleads.v6.enums.PlaceholderTypeEnum;
import com.google.ads.googleads.v6.resources.CustomerFeed;
import com.google.ads.googleads.v6.resources.CustomerFeedName;
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
public class CustomerFeedServiceClientTest {
  private static MockServiceHelper mockServiceHelper;
  private CustomerFeedServiceClient client;
  private static MockCustomerFeedService mockCustomerFeedService;
  private LocalChannelProvider channelProvider;

  @BeforeClass
  public static void startStaticServer() {
    mockCustomerFeedService = new MockCustomerFeedService();
    mockServiceHelper =
        new MockServiceHelper(
            UUID.randomUUID().toString(), Arrays.<MockGrpcService>asList(mockCustomerFeedService));
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
    CustomerFeedServiceSettings settings =
        CustomerFeedServiceSettings.newBuilder()
            .setTransportChannelProvider(channelProvider)
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = CustomerFeedServiceClient.create(settings);
  }

  @After
  public void tearDown() throws Exception {
    client.close();
  }

  @Test
  public void getCustomerFeedTest() throws Exception {
    CustomerFeed expectedResponse =
        CustomerFeed.newBuilder()
            .setResourceName(CustomerFeedName.of("[CUSTOMER_ID]", "[FEED_ID]").toString())
            .addAllPlaceholderTypes(new ArrayList<PlaceholderTypeEnum.PlaceholderType>())
            .setMatchingFunction(MatchingFunction.newBuilder().build())
            .build();
    mockCustomerFeedService.addResponse(expectedResponse);

    CustomerFeedName resourceName = CustomerFeedName.of("[CUSTOMER_ID]", "[FEED_ID]");

    CustomerFeed actualResponse = client.getCustomerFeed(resourceName);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockCustomerFeedService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetCustomerFeedRequest actualRequest = ((GetCustomerFeedRequest) actualRequests.get(0));

    Assert.assertEquals(resourceName.toString(), actualRequest.getResourceName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getCustomerFeedExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockCustomerFeedService.addException(exception);

    try {
      CustomerFeedName resourceName = CustomerFeedName.of("[CUSTOMER_ID]", "[FEED_ID]");
      client.getCustomerFeed(resourceName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getCustomerFeedTest2() throws Exception {
    CustomerFeed expectedResponse =
        CustomerFeed.newBuilder()
            .setResourceName(CustomerFeedName.of("[CUSTOMER_ID]", "[FEED_ID]").toString())
            .addAllPlaceholderTypes(new ArrayList<PlaceholderTypeEnum.PlaceholderType>())
            .setMatchingFunction(MatchingFunction.newBuilder().build())
            .build();
    mockCustomerFeedService.addResponse(expectedResponse);

    String resourceName = "resourceName-384566343";

    CustomerFeed actualResponse = client.getCustomerFeed(resourceName);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockCustomerFeedService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetCustomerFeedRequest actualRequest = ((GetCustomerFeedRequest) actualRequests.get(0));

    Assert.assertEquals(resourceName, actualRequest.getResourceName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getCustomerFeedExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockCustomerFeedService.addException(exception);

    try {
      String resourceName = "resourceName-384566343";
      client.getCustomerFeed(resourceName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void mutateCustomerFeedsTest() throws Exception {
    MutateCustomerFeedsResponse expectedResponse =
        MutateCustomerFeedsResponse.newBuilder()
            .setPartialFailureError(Status.newBuilder().build())
            .addAllResults(new ArrayList<MutateCustomerFeedResult>())
            .build();
    mockCustomerFeedService.addResponse(expectedResponse);

    String customerId = "customerId-1581184615";
    List<CustomerFeedOperation> operations = new ArrayList<>();

    MutateCustomerFeedsResponse actualResponse = client.mutateCustomerFeeds(customerId, operations);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockCustomerFeedService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    MutateCustomerFeedsRequest actualRequest = ((MutateCustomerFeedsRequest) actualRequests.get(0));

    Assert.assertEquals(customerId, actualRequest.getCustomerId());
    Assert.assertEquals(operations, actualRequest.getOperationsList());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void mutateCustomerFeedsExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockCustomerFeedService.addException(exception);

    try {
      String customerId = "customerId-1581184615";
      List<CustomerFeedOperation> operations = new ArrayList<>();
      client.mutateCustomerFeeds(customerId, operations);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }
}
