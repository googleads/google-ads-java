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

import com.google.ads.googleads.v8.resources.CustomerManagerLink;
import com.google.ads.googleads.v8.resources.CustomerManagerLinkName;
import com.google.ads.googleads.v8.resources.CustomerName;
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
public class CustomerManagerLinkServiceClientTest {
  private static MockCustomerManagerLinkService mockCustomerManagerLinkService;
  private static MockServiceHelper mockServiceHelper;
  private LocalChannelProvider channelProvider;
  private CustomerManagerLinkServiceClient client;

  @BeforeClass
  public static void startStaticServer() {
    mockCustomerManagerLinkService = new MockCustomerManagerLinkService();
    mockServiceHelper =
        new MockServiceHelper(
            UUID.randomUUID().toString(),
            Arrays.<MockGrpcService>asList(mockCustomerManagerLinkService));
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
    CustomerManagerLinkServiceSettings settings =
        CustomerManagerLinkServiceSettings.newBuilder()
            .setTransportChannelProvider(channelProvider)
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = CustomerManagerLinkServiceClient.create(settings);
  }

  @After
  public void tearDown() throws Exception {
    client.close();
  }

  @Test
  public void getCustomerManagerLinkTest() throws Exception {
    CustomerManagerLink expectedResponse =
        CustomerManagerLink.newBuilder()
            .setResourceName(
                CustomerManagerLinkName.of(
                        "[CUSTOMER_ID]", "[MANAGER_CUSTOMER_ID]", "[MANAGER_LINK_ID]")
                    .toString())
            .setManagerCustomer(CustomerName.of("[CUSTOMER_ID]").toString())
            .setManagerLinkId(614908142)
            .build();
    mockCustomerManagerLinkService.addResponse(expectedResponse);

    CustomerManagerLinkName resourceName =
        CustomerManagerLinkName.of("[CUSTOMER_ID]", "[MANAGER_CUSTOMER_ID]", "[MANAGER_LINK_ID]");

    CustomerManagerLink actualResponse = client.getCustomerManagerLink(resourceName);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockCustomerManagerLinkService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetCustomerManagerLinkRequest actualRequest =
        ((GetCustomerManagerLinkRequest) actualRequests.get(0));

    Assert.assertEquals(resourceName.toString(), actualRequest.getResourceName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getCustomerManagerLinkExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockCustomerManagerLinkService.addException(exception);

    try {
      CustomerManagerLinkName resourceName =
          CustomerManagerLinkName.of("[CUSTOMER_ID]", "[MANAGER_CUSTOMER_ID]", "[MANAGER_LINK_ID]");
      client.getCustomerManagerLink(resourceName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getCustomerManagerLinkTest2() throws Exception {
    CustomerManagerLink expectedResponse =
        CustomerManagerLink.newBuilder()
            .setResourceName(
                CustomerManagerLinkName.of(
                        "[CUSTOMER_ID]", "[MANAGER_CUSTOMER_ID]", "[MANAGER_LINK_ID]")
                    .toString())
            .setManagerCustomer(CustomerName.of("[CUSTOMER_ID]").toString())
            .setManagerLinkId(614908142)
            .build();
    mockCustomerManagerLinkService.addResponse(expectedResponse);

    String resourceName = "resourceName-384566343";

    CustomerManagerLink actualResponse = client.getCustomerManagerLink(resourceName);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockCustomerManagerLinkService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetCustomerManagerLinkRequest actualRequest =
        ((GetCustomerManagerLinkRequest) actualRequests.get(0));

    Assert.assertEquals(resourceName, actualRequest.getResourceName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getCustomerManagerLinkExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockCustomerManagerLinkService.addException(exception);

    try {
      String resourceName = "resourceName-384566343";
      client.getCustomerManagerLink(resourceName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void mutateCustomerManagerLinkTest() throws Exception {
    MutateCustomerManagerLinkResponse expectedResponse =
        MutateCustomerManagerLinkResponse.newBuilder()
            .addAllResults(new ArrayList<MutateCustomerManagerLinkResult>())
            .build();
    mockCustomerManagerLinkService.addResponse(expectedResponse);

    String customerId = "customerId-1581184615";
    List<CustomerManagerLinkOperation> operations = new ArrayList<>();

    MutateCustomerManagerLinkResponse actualResponse =
        client.mutateCustomerManagerLink(customerId, operations);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockCustomerManagerLinkService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    MutateCustomerManagerLinkRequest actualRequest =
        ((MutateCustomerManagerLinkRequest) actualRequests.get(0));

    Assert.assertEquals(customerId, actualRequest.getCustomerId());
    Assert.assertEquals(operations, actualRequest.getOperationsList());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void mutateCustomerManagerLinkExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockCustomerManagerLinkService.addException(exception);

    try {
      String customerId = "customerId-1581184615";
      List<CustomerManagerLinkOperation> operations = new ArrayList<>();
      client.mutateCustomerManagerLink(customerId, operations);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void moveManagerLinkTest() throws Exception {
    MoveManagerLinkResponse expectedResponse =
        MoveManagerLinkResponse.newBuilder().setResourceName("resourceName-384566343").build();
    mockCustomerManagerLinkService.addResponse(expectedResponse);

    String customerId = "customerId-1581184615";
    String previousCustomerManagerLink = "previousCustomerManagerLink-222598638";
    String newManager = "newManager1429989869";

    MoveManagerLinkResponse actualResponse =
        client.moveManagerLink(customerId, previousCustomerManagerLink, newManager);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockCustomerManagerLinkService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    MoveManagerLinkRequest actualRequest = ((MoveManagerLinkRequest) actualRequests.get(0));

    Assert.assertEquals(customerId, actualRequest.getCustomerId());
    Assert.assertEquals(
        previousCustomerManagerLink, actualRequest.getPreviousCustomerManagerLink());
    Assert.assertEquals(newManager, actualRequest.getNewManager());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void moveManagerLinkExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockCustomerManagerLinkService.addException(exception);

    try {
      String customerId = "customerId-1581184615";
      String previousCustomerManagerLink = "previousCustomerManagerLink-222598638";
      String newManager = "newManager1429989869";
      client.moveManagerLink(customerId, previousCustomerManagerLink, newManager);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }
}
