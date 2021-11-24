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

package com.google.ads.googleads.v9.services;

import com.google.ads.googleads.v9.resources.CustomerLabel;
import com.google.ads.googleads.v9.resources.CustomerLabelName;
import com.google.ads.googleads.v9.resources.CustomerName;
import com.google.ads.googleads.v9.resources.LabelName;
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
public class CustomerLabelServiceClientTest {
  private static MockCustomerLabelService mockCustomerLabelService;
  private static MockServiceHelper mockServiceHelper;
  private LocalChannelProvider channelProvider;
  private CustomerLabelServiceClient client;

  @BeforeClass
  public static void startStaticServer() {
    mockCustomerLabelService = new MockCustomerLabelService();
    mockServiceHelper =
        new MockServiceHelper(
            UUID.randomUUID().toString(), Arrays.<MockGrpcService>asList(mockCustomerLabelService));
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
    CustomerLabelServiceSettings settings =
        CustomerLabelServiceSettings.newBuilder()
            .setTransportChannelProvider(channelProvider)
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = CustomerLabelServiceClient.create(settings);
  }

  @After
  public void tearDown() throws Exception {
    client.close();
  }

  @Test
  public void getCustomerLabelTest() throws Exception {
    CustomerLabel expectedResponse =
        CustomerLabel.newBuilder()
            .setResourceName(CustomerLabelName.of("[CUSTOMER_ID]", "[LABEL_ID]").toString())
            .setCustomer(CustomerName.of("[CUSTOMER_ID]").toString())
            .setLabel(LabelName.of("[CUSTOMER_ID]", "[LABEL_ID]").toString())
            .build();
    mockCustomerLabelService.addResponse(expectedResponse);

    CustomerLabelName resourceName = CustomerLabelName.of("[CUSTOMER_ID]", "[LABEL_ID]");

    CustomerLabel actualResponse = client.getCustomerLabel(resourceName);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockCustomerLabelService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetCustomerLabelRequest actualRequest = ((GetCustomerLabelRequest) actualRequests.get(0));

    Assert.assertEquals(resourceName.toString(), actualRequest.getResourceName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getCustomerLabelExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockCustomerLabelService.addException(exception);

    try {
      CustomerLabelName resourceName = CustomerLabelName.of("[CUSTOMER_ID]", "[LABEL_ID]");
      client.getCustomerLabel(resourceName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getCustomerLabelTest2() throws Exception {
    CustomerLabel expectedResponse =
        CustomerLabel.newBuilder()
            .setResourceName(CustomerLabelName.of("[CUSTOMER_ID]", "[LABEL_ID]").toString())
            .setCustomer(CustomerName.of("[CUSTOMER_ID]").toString())
            .setLabel(LabelName.of("[CUSTOMER_ID]", "[LABEL_ID]").toString())
            .build();
    mockCustomerLabelService.addResponse(expectedResponse);

    String resourceName = "resourceName-384566343";

    CustomerLabel actualResponse = client.getCustomerLabel(resourceName);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockCustomerLabelService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetCustomerLabelRequest actualRequest = ((GetCustomerLabelRequest) actualRequests.get(0));

    Assert.assertEquals(resourceName, actualRequest.getResourceName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getCustomerLabelExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockCustomerLabelService.addException(exception);

    try {
      String resourceName = "resourceName-384566343";
      client.getCustomerLabel(resourceName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void mutateCustomerLabelsTest() throws Exception {
    MutateCustomerLabelsResponse expectedResponse =
        MutateCustomerLabelsResponse.newBuilder()
            .setPartialFailureError(Status.newBuilder().build())
            .addAllResults(new ArrayList<MutateCustomerLabelResult>())
            .build();
    mockCustomerLabelService.addResponse(expectedResponse);

    String customerId = "customerId-1581184615";
    List<CustomerLabelOperation> operations = new ArrayList<>();

    MutateCustomerLabelsResponse actualResponse =
        client.mutateCustomerLabels(customerId, operations);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockCustomerLabelService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    MutateCustomerLabelsRequest actualRequest =
        ((MutateCustomerLabelsRequest) actualRequests.get(0));

    Assert.assertEquals(customerId, actualRequest.getCustomerId());
    Assert.assertEquals(operations, actualRequest.getOperationsList());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void mutateCustomerLabelsExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockCustomerLabelService.addException(exception);

    try {
      String customerId = "customerId-1581184615";
      List<CustomerLabelOperation> operations = new ArrayList<>();
      client.mutateCustomerLabels(customerId, operations);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }
}
