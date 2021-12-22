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

import com.google.ads.googleads.v8.resources.CustomerClientLink;
import com.google.ads.googleads.v8.resources.CustomerClientLinkName;
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
public class CustomerClientLinkServiceClientTest {
  private static MockCustomerClientLinkService mockCustomerClientLinkService;
  private static MockServiceHelper mockServiceHelper;
  private LocalChannelProvider channelProvider;
  private CustomerClientLinkServiceClient client;

  @BeforeClass
  public static void startStaticServer() {
    mockCustomerClientLinkService = new MockCustomerClientLinkService();
    mockServiceHelper =
        new MockServiceHelper(
            UUID.randomUUID().toString(),
            Arrays.<MockGrpcService>asList(mockCustomerClientLinkService));
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
    CustomerClientLinkServiceSettings settings =
        CustomerClientLinkServiceSettings.newBuilder()
            .setTransportChannelProvider(channelProvider)
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = CustomerClientLinkServiceClient.create(settings);
  }

  @After
  public void tearDown() throws Exception {
    client.close();
  }

  @Test
  public void getCustomerClientLinkTest() throws Exception {
    CustomerClientLink expectedResponse =
        CustomerClientLink.newBuilder()
            .setResourceName(
                CustomerClientLinkName.of(
                        "[CUSTOMER_ID]", "[CLIENT_CUSTOMER_ID]", "[MANAGER_LINK_ID]")
                    .toString())
            .setClientCustomer(CustomerName.of("[CUSTOMER_ID]").toString())
            .setManagerLinkId(614908142)
            .setHidden(true)
            .build();
    mockCustomerClientLinkService.addResponse(expectedResponse);

    CustomerClientLinkName resourceName =
        CustomerClientLinkName.of("[CUSTOMER_ID]", "[CLIENT_CUSTOMER_ID]", "[MANAGER_LINK_ID]");

    CustomerClientLink actualResponse = client.getCustomerClientLink(resourceName);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockCustomerClientLinkService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetCustomerClientLinkRequest actualRequest =
        ((GetCustomerClientLinkRequest) actualRequests.get(0));

    Assert.assertEquals(resourceName.toString(), actualRequest.getResourceName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getCustomerClientLinkExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockCustomerClientLinkService.addException(exception);

    try {
      CustomerClientLinkName resourceName =
          CustomerClientLinkName.of("[CUSTOMER_ID]", "[CLIENT_CUSTOMER_ID]", "[MANAGER_LINK_ID]");
      client.getCustomerClientLink(resourceName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getCustomerClientLinkTest2() throws Exception {
    CustomerClientLink expectedResponse =
        CustomerClientLink.newBuilder()
            .setResourceName(
                CustomerClientLinkName.of(
                        "[CUSTOMER_ID]", "[CLIENT_CUSTOMER_ID]", "[MANAGER_LINK_ID]")
                    .toString())
            .setClientCustomer(CustomerName.of("[CUSTOMER_ID]").toString())
            .setManagerLinkId(614908142)
            .setHidden(true)
            .build();
    mockCustomerClientLinkService.addResponse(expectedResponse);

    String resourceName = "resourceName-384566343";

    CustomerClientLink actualResponse = client.getCustomerClientLink(resourceName);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockCustomerClientLinkService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetCustomerClientLinkRequest actualRequest =
        ((GetCustomerClientLinkRequest) actualRequests.get(0));

    Assert.assertEquals(resourceName, actualRequest.getResourceName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getCustomerClientLinkExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockCustomerClientLinkService.addException(exception);

    try {
      String resourceName = "resourceName-384566343";
      client.getCustomerClientLink(resourceName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void mutateCustomerClientLinkTest() throws Exception {
    MutateCustomerClientLinkResponse expectedResponse =
        MutateCustomerClientLinkResponse.newBuilder()
            .setResult(MutateCustomerClientLinkResult.newBuilder().build())
            .build();
    mockCustomerClientLinkService.addResponse(expectedResponse);

    String customerId = "customerId-1581184615";
    CustomerClientLinkOperation operation = CustomerClientLinkOperation.newBuilder().build();

    MutateCustomerClientLinkResponse actualResponse =
        client.mutateCustomerClientLink(customerId, operation);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockCustomerClientLinkService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    MutateCustomerClientLinkRequest actualRequest =
        ((MutateCustomerClientLinkRequest) actualRequests.get(0));

    Assert.assertEquals(customerId, actualRequest.getCustomerId());
    Assert.assertEquals(operation, actualRequest.getOperation());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void mutateCustomerClientLinkExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockCustomerClientLinkService.addException(exception);

    try {
      String customerId = "customerId-1581184615";
      CustomerClientLinkOperation operation = CustomerClientLinkOperation.newBuilder().build();
      client.mutateCustomerClientLink(customerId, operation);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }
}
