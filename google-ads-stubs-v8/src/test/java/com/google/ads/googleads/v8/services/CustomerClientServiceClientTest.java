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

import com.google.ads.googleads.v8.resources.CustomerClient;
import com.google.ads.googleads.v8.resources.CustomerClientName;
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
public class CustomerClientServiceClientTest {
  private static MockCustomerClientService mockCustomerClientService;
  private static MockServiceHelper mockServiceHelper;
  private LocalChannelProvider channelProvider;
  private CustomerClientServiceClient client;

  @BeforeClass
  public static void startStaticServer() {
    mockCustomerClientService = new MockCustomerClientService();
    mockServiceHelper =
        new MockServiceHelper(
            UUID.randomUUID().toString(),
            Arrays.<MockGrpcService>asList(mockCustomerClientService));
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
    CustomerClientServiceSettings settings =
        CustomerClientServiceSettings.newBuilder()
            .setTransportChannelProvider(channelProvider)
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = CustomerClientServiceClient.create(settings);
  }

  @After
  public void tearDown() throws Exception {
    client.close();
  }

  @Test
  public void getCustomerClientTest() throws Exception {
    CustomerClient expectedResponse =
        CustomerClient.newBuilder()
            .setResourceName(
                CustomerClientName.of("[CUSTOMER_ID]", "[CLIENT_CUSTOMER_ID]").toString())
            .setClientCustomer(CustomerName.of("[CUSTOMER_ID]").toString())
            .setHidden(true)
            .setLevel(102865796)
            .setTimeZone("timeZone-2077180903")
            .setTestAccount(true)
            .setManager(true)
            .setDescriptiveName("descriptiveName1177759095")
            .setCurrencyCode("currencyCode1004773790")
            .setId(3355)
            .addAllAppliedLabels(new ArrayList<String>())
            .build();
    mockCustomerClientService.addResponse(expectedResponse);

    CustomerClientName resourceName =
        CustomerClientName.of("[CUSTOMER_ID]", "[CLIENT_CUSTOMER_ID]");

    CustomerClient actualResponse = client.getCustomerClient(resourceName);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockCustomerClientService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetCustomerClientRequest actualRequest = ((GetCustomerClientRequest) actualRequests.get(0));

    Assert.assertEquals(resourceName.toString(), actualRequest.getResourceName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getCustomerClientExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockCustomerClientService.addException(exception);

    try {
      CustomerClientName resourceName =
          CustomerClientName.of("[CUSTOMER_ID]", "[CLIENT_CUSTOMER_ID]");
      client.getCustomerClient(resourceName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getCustomerClientTest2() throws Exception {
    CustomerClient expectedResponse =
        CustomerClient.newBuilder()
            .setResourceName(
                CustomerClientName.of("[CUSTOMER_ID]", "[CLIENT_CUSTOMER_ID]").toString())
            .setClientCustomer(CustomerName.of("[CUSTOMER_ID]").toString())
            .setHidden(true)
            .setLevel(102865796)
            .setTimeZone("timeZone-2077180903")
            .setTestAccount(true)
            .setManager(true)
            .setDescriptiveName("descriptiveName1177759095")
            .setCurrencyCode("currencyCode1004773790")
            .setId(3355)
            .addAllAppliedLabels(new ArrayList<String>())
            .build();
    mockCustomerClientService.addResponse(expectedResponse);

    String resourceName = "resourceName-384566343";

    CustomerClient actualResponse = client.getCustomerClient(resourceName);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockCustomerClientService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetCustomerClientRequest actualRequest = ((GetCustomerClientRequest) actualRequests.get(0));

    Assert.assertEquals(resourceName, actualRequest.getResourceName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getCustomerClientExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockCustomerClientService.addException(exception);

    try {
      String resourceName = "resourceName-384566343";
      client.getCustomerClient(resourceName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }
}
