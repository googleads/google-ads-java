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

import com.google.ads.googleads.v7.resources.CustomerNegativeCriterion;
import com.google.ads.googleads.v7.resources.CustomerNegativeCriterionName;
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
public class CustomerNegativeCriterionServiceClientTest {
  private static MockCustomerNegativeCriterionService mockCustomerNegativeCriterionService;
  private static MockServiceHelper mockServiceHelper;
  private LocalChannelProvider channelProvider;
  private CustomerNegativeCriterionServiceClient client;

  @BeforeClass
  public static void startStaticServer() {
    mockCustomerNegativeCriterionService = new MockCustomerNegativeCriterionService();
    mockServiceHelper =
        new MockServiceHelper(
            UUID.randomUUID().toString(),
            Arrays.<MockGrpcService>asList(mockCustomerNegativeCriterionService));
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
    CustomerNegativeCriterionServiceSettings settings =
        CustomerNegativeCriterionServiceSettings.newBuilder()
            .setTransportChannelProvider(channelProvider)
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = CustomerNegativeCriterionServiceClient.create(settings);
  }

  @After
  public void tearDown() throws Exception {
    client.close();
  }

  @Test
  public void getCustomerNegativeCriterionTest() throws Exception {
    CustomerNegativeCriterion expectedResponse =
        CustomerNegativeCriterion.newBuilder()
            .setResourceName(
                CustomerNegativeCriterionName.of("[CUSTOMER_ID]", "[CRITERION_ID]").toString())
            .setId(3355)
            .build();
    mockCustomerNegativeCriterionService.addResponse(expectedResponse);

    CustomerNegativeCriterionName resourceName =
        CustomerNegativeCriterionName.of("[CUSTOMER_ID]", "[CRITERION_ID]");

    CustomerNegativeCriterion actualResponse = client.getCustomerNegativeCriterion(resourceName);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockCustomerNegativeCriterionService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetCustomerNegativeCriterionRequest actualRequest =
        ((GetCustomerNegativeCriterionRequest) actualRequests.get(0));

    Assert.assertEquals(resourceName.toString(), actualRequest.getResourceName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getCustomerNegativeCriterionExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockCustomerNegativeCriterionService.addException(exception);

    try {
      CustomerNegativeCriterionName resourceName =
          CustomerNegativeCriterionName.of("[CUSTOMER_ID]", "[CRITERION_ID]");
      client.getCustomerNegativeCriterion(resourceName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getCustomerNegativeCriterionTest2() throws Exception {
    CustomerNegativeCriterion expectedResponse =
        CustomerNegativeCriterion.newBuilder()
            .setResourceName(
                CustomerNegativeCriterionName.of("[CUSTOMER_ID]", "[CRITERION_ID]").toString())
            .setId(3355)
            .build();
    mockCustomerNegativeCriterionService.addResponse(expectedResponse);

    String resourceName = "resourceName-384566343";

    CustomerNegativeCriterion actualResponse = client.getCustomerNegativeCriterion(resourceName);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockCustomerNegativeCriterionService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetCustomerNegativeCriterionRequest actualRequest =
        ((GetCustomerNegativeCriterionRequest) actualRequests.get(0));

    Assert.assertEquals(resourceName, actualRequest.getResourceName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getCustomerNegativeCriterionExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockCustomerNegativeCriterionService.addException(exception);

    try {
      String resourceName = "resourceName-384566343";
      client.getCustomerNegativeCriterion(resourceName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void mutateCustomerNegativeCriteriaTest() throws Exception {
    MutateCustomerNegativeCriteriaResponse expectedResponse =
        MutateCustomerNegativeCriteriaResponse.newBuilder()
            .setPartialFailureError(Status.newBuilder().build())
            .addAllResults(new ArrayList<MutateCustomerNegativeCriteriaResult>())
            .build();
    mockCustomerNegativeCriterionService.addResponse(expectedResponse);

    String customerId = "customerId-1581184615";
    List<CustomerNegativeCriterionOperation> operations = new ArrayList<>();

    MutateCustomerNegativeCriteriaResponse actualResponse =
        client.mutateCustomerNegativeCriteria(customerId, operations);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockCustomerNegativeCriterionService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    MutateCustomerNegativeCriteriaRequest actualRequest =
        ((MutateCustomerNegativeCriteriaRequest) actualRequests.get(0));

    Assert.assertEquals(customerId, actualRequest.getCustomerId());
    Assert.assertEquals(operations, actualRequest.getOperationsList());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void mutateCustomerNegativeCriteriaExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockCustomerNegativeCriterionService.addException(exception);

    try {
      String customerId = "customerId-1581184615";
      List<CustomerNegativeCriterionOperation> operations = new ArrayList<>();
      client.mutateCustomerNegativeCriteria(customerId, operations);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }
}
