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

import com.google.ads.googleads.v6.resources.CustomerUserAccess;
import com.google.ads.googleads.v6.resources.CustomerUserAccessName;
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
public class CustomerUserAccessServiceClientTest {
  private static MockServiceHelper mockServiceHelper;
  private CustomerUserAccessServiceClient client;
  private static MockCustomerUserAccessService mockCustomerUserAccessService;
  private LocalChannelProvider channelProvider;

  @BeforeClass
  public static void startStaticServer() {
    mockCustomerUserAccessService = new MockCustomerUserAccessService();
    mockServiceHelper =
        new MockServiceHelper(
            UUID.randomUUID().toString(),
            Arrays.<MockGrpcService>asList(mockCustomerUserAccessService));
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
    CustomerUserAccessServiceSettings settings =
        CustomerUserAccessServiceSettings.newBuilder()
            .setTransportChannelProvider(channelProvider)
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = CustomerUserAccessServiceClient.create(settings);
  }

  @After
  public void tearDown() throws Exception {
    client.close();
  }

  @Test
  public void getCustomerUserAccessTest() throws Exception {
    CustomerUserAccess expectedResponse =
        CustomerUserAccess.newBuilder()
            .setResourceName(CustomerUserAccessName.of("[CUSTOMER_ID]", "[USER_ID]").toString())
            .setUserId(-147132913)
            .build();
    mockCustomerUserAccessService.addResponse(expectedResponse);

    CustomerUserAccessName resourceName = CustomerUserAccessName.of("[CUSTOMER_ID]", "[USER_ID]");

    CustomerUserAccess actualResponse = client.getCustomerUserAccess(resourceName);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockCustomerUserAccessService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetCustomerUserAccessRequest actualRequest =
        ((GetCustomerUserAccessRequest) actualRequests.get(0));

    Assert.assertEquals(resourceName.toString(), actualRequest.getResourceName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getCustomerUserAccessExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockCustomerUserAccessService.addException(exception);

    try {
      CustomerUserAccessName resourceName = CustomerUserAccessName.of("[CUSTOMER_ID]", "[USER_ID]");
      client.getCustomerUserAccess(resourceName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getCustomerUserAccessTest2() throws Exception {
    CustomerUserAccess expectedResponse =
        CustomerUserAccess.newBuilder()
            .setResourceName(CustomerUserAccessName.of("[CUSTOMER_ID]", "[USER_ID]").toString())
            .setUserId(-147132913)
            .build();
    mockCustomerUserAccessService.addResponse(expectedResponse);

    String resourceName = "resourceName-384566343";

    CustomerUserAccess actualResponse = client.getCustomerUserAccess(resourceName);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockCustomerUserAccessService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetCustomerUserAccessRequest actualRequest =
        ((GetCustomerUserAccessRequest) actualRequests.get(0));

    Assert.assertEquals(resourceName, actualRequest.getResourceName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getCustomerUserAccessExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockCustomerUserAccessService.addException(exception);

    try {
      String resourceName = "resourceName-384566343";
      client.getCustomerUserAccess(resourceName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void mutateCustomerUserAccessTest() throws Exception {
    MutateCustomerUserAccessResponse expectedResponse =
        MutateCustomerUserAccessResponse.newBuilder()
            .setResult(MutateCustomerUserAccessResult.newBuilder().build())
            .build();
    mockCustomerUserAccessService.addResponse(expectedResponse);

    String customerId = "customerId-1581184615";
    CustomerUserAccessOperation operation = CustomerUserAccessOperation.newBuilder().build();

    MutateCustomerUserAccessResponse actualResponse =
        client.mutateCustomerUserAccess(customerId, operation);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockCustomerUserAccessService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    MutateCustomerUserAccessRequest actualRequest =
        ((MutateCustomerUserAccessRequest) actualRequests.get(0));

    Assert.assertEquals(customerId, actualRequest.getCustomerId());
    Assert.assertEquals(operation, actualRequest.getOperation());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void mutateCustomerUserAccessExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockCustomerUserAccessService.addException(exception);

    try {
      String customerId = "customerId-1581184615";
      CustomerUserAccessOperation operation = CustomerUserAccessOperation.newBuilder().build();
      client.mutateCustomerUserAccess(customerId, operation);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }
}
