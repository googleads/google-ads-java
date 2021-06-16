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

import com.google.ads.googleads.v8.enums.CustomerPayPerConversionEligibilityFailureReasonEnum;
import com.google.ads.googleads.v8.resources.CallReportingSetting;
import com.google.ads.googleads.v8.resources.ConversionTrackingSetting;
import com.google.ads.googleads.v8.resources.Customer;
import com.google.ads.googleads.v8.resources.CustomerName;
import com.google.ads.googleads.v8.resources.RemarketingSetting;
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
public class CustomerServiceClientTest {
  private static MockCustomerService mockCustomerService;
  private static MockServiceHelper mockServiceHelper;
  private LocalChannelProvider channelProvider;
  private CustomerServiceClient client;

  @BeforeClass
  public static void startStaticServer() {
    mockCustomerService = new MockCustomerService();
    mockServiceHelper =
        new MockServiceHelper(
            UUID.randomUUID().toString(), Arrays.<MockGrpcService>asList(mockCustomerService));
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
    CustomerServiceSettings settings =
        CustomerServiceSettings.newBuilder()
            .setTransportChannelProvider(channelProvider)
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = CustomerServiceClient.create(settings);
  }

  @After
  public void tearDown() throws Exception {
    client.close();
  }

  @Test
  public void getCustomerTest() throws Exception {
    Customer expectedResponse =
        Customer.newBuilder()
            .setResourceName(CustomerName.of("[CUSTOMER_ID]").toString())
            .setId(3355)
            .setDescriptiveName("descriptiveName1177759095")
            .setCurrencyCode("currencyCode1004773790")
            .setTimeZone("timeZone-2077180903")
            .setTrackingUrlTemplate("trackingUrlTemplate-939780142")
            .setFinalUrlSuffix("finalUrlSuffix-59294518")
            .setAutoTaggingEnabled(true)
            .setHasPartnersBadge(true)
            .setManager(true)
            .setTestAccount(true)
            .setCallReportingSetting(CallReportingSetting.newBuilder().build())
            .setConversionTrackingSetting(ConversionTrackingSetting.newBuilder().build())
            .setRemarketingSetting(RemarketingSetting.newBuilder().build())
            .addAllPayPerConversionEligibilityFailureReasons(
                new ArrayList<
                    CustomerPayPerConversionEligibilityFailureReasonEnum
                        .CustomerPayPerConversionEligibilityFailureReason>())
            .setOptimizationScore(-1699828416)
            .setOptimizationScoreWeight(997272151)
            .build();
    mockCustomerService.addResponse(expectedResponse);

    CustomerName resourceName = CustomerName.of("[CUSTOMER_ID]");

    Customer actualResponse = client.getCustomer(resourceName);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockCustomerService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetCustomerRequest actualRequest = ((GetCustomerRequest) actualRequests.get(0));

    Assert.assertEquals(resourceName.toString(), actualRequest.getResourceName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getCustomerExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockCustomerService.addException(exception);

    try {
      CustomerName resourceName = CustomerName.of("[CUSTOMER_ID]");
      client.getCustomer(resourceName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getCustomerTest2() throws Exception {
    Customer expectedResponse =
        Customer.newBuilder()
            .setResourceName(CustomerName.of("[CUSTOMER_ID]").toString())
            .setId(3355)
            .setDescriptiveName("descriptiveName1177759095")
            .setCurrencyCode("currencyCode1004773790")
            .setTimeZone("timeZone-2077180903")
            .setTrackingUrlTemplate("trackingUrlTemplate-939780142")
            .setFinalUrlSuffix("finalUrlSuffix-59294518")
            .setAutoTaggingEnabled(true)
            .setHasPartnersBadge(true)
            .setManager(true)
            .setTestAccount(true)
            .setCallReportingSetting(CallReportingSetting.newBuilder().build())
            .setConversionTrackingSetting(ConversionTrackingSetting.newBuilder().build())
            .setRemarketingSetting(RemarketingSetting.newBuilder().build())
            .addAllPayPerConversionEligibilityFailureReasons(
                new ArrayList<
                    CustomerPayPerConversionEligibilityFailureReasonEnum
                        .CustomerPayPerConversionEligibilityFailureReason>())
            .setOptimizationScore(-1699828416)
            .setOptimizationScoreWeight(997272151)
            .build();
    mockCustomerService.addResponse(expectedResponse);

    String resourceName = "resourceName-384566343";

    Customer actualResponse = client.getCustomer(resourceName);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockCustomerService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetCustomerRequest actualRequest = ((GetCustomerRequest) actualRequests.get(0));

    Assert.assertEquals(resourceName, actualRequest.getResourceName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getCustomerExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockCustomerService.addException(exception);

    try {
      String resourceName = "resourceName-384566343";
      client.getCustomer(resourceName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void mutateCustomerTest() throws Exception {
    MutateCustomerResponse expectedResponse =
        MutateCustomerResponse.newBuilder()
            .setResult(MutateCustomerResult.newBuilder().build())
            .build();
    mockCustomerService.addResponse(expectedResponse);

    String customerId = "customerId-1581184615";
    CustomerOperation operation = CustomerOperation.newBuilder().build();

    MutateCustomerResponse actualResponse = client.mutateCustomer(customerId, operation);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockCustomerService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    MutateCustomerRequest actualRequest = ((MutateCustomerRequest) actualRequests.get(0));

    Assert.assertEquals(customerId, actualRequest.getCustomerId());
    Assert.assertEquals(operation, actualRequest.getOperation());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void mutateCustomerExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockCustomerService.addException(exception);

    try {
      String customerId = "customerId-1581184615";
      CustomerOperation operation = CustomerOperation.newBuilder().build();
      client.mutateCustomer(customerId, operation);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void listAccessibleCustomersTest() throws Exception {
    ListAccessibleCustomersResponse expectedResponse =
        ListAccessibleCustomersResponse.newBuilder()
            .addAllResourceNames(new ArrayList<String>())
            .build();
    mockCustomerService.addResponse(expectedResponse);

    ListAccessibleCustomersRequest request = ListAccessibleCustomersRequest.newBuilder().build();

    ListAccessibleCustomersResponse actualResponse = client.listAccessibleCustomers(request);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockCustomerService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ListAccessibleCustomersRequest actualRequest =
        ((ListAccessibleCustomersRequest) actualRequests.get(0));

    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void listAccessibleCustomersExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockCustomerService.addException(exception);

    try {
      ListAccessibleCustomersRequest request = ListAccessibleCustomersRequest.newBuilder().build();
      client.listAccessibleCustomers(request);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void createCustomerClientTest() throws Exception {
    CreateCustomerClientResponse expectedResponse =
        CreateCustomerClientResponse.newBuilder()
            .setResourceName("resourceName-384566343")
            .setInvitationLink("invitationLink624699187")
            .build();
    mockCustomerService.addResponse(expectedResponse);

    String customerId = "customerId-1581184615";
    Customer customerClient = Customer.newBuilder().build();

    CreateCustomerClientResponse actualResponse =
        client.createCustomerClient(customerId, customerClient);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockCustomerService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    CreateCustomerClientRequest actualRequest =
        ((CreateCustomerClientRequest) actualRequests.get(0));

    Assert.assertEquals(customerId, actualRequest.getCustomerId());
    Assert.assertEquals(customerClient, actualRequest.getCustomerClient());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void createCustomerClientExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockCustomerService.addException(exception);

    try {
      String customerId = "customerId-1581184615";
      Customer customerClient = Customer.newBuilder().build();
      client.createCustomerClient(customerId, customerClient);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }
}
