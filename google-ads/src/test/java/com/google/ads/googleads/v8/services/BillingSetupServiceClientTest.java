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

import com.google.ads.googleads.v8.resources.BillingSetup;
import com.google.ads.googleads.v8.resources.BillingSetupName;
import com.google.ads.googleads.v8.resources.PaymentsAccountName;
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
public class BillingSetupServiceClientTest {
  private static MockBillingSetupService mockBillingSetupService;
  private static MockServiceHelper mockServiceHelper;
  private LocalChannelProvider channelProvider;
  private BillingSetupServiceClient client;

  @BeforeClass
  public static void startStaticServer() {
    mockBillingSetupService = new MockBillingSetupService();
    mockServiceHelper =
        new MockServiceHelper(
            UUID.randomUUID().toString(), Arrays.<MockGrpcService>asList(mockBillingSetupService));
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
    BillingSetupServiceSettings settings =
        BillingSetupServiceSettings.newBuilder()
            .setTransportChannelProvider(channelProvider)
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = BillingSetupServiceClient.create(settings);
  }

  @After
  public void tearDown() throws Exception {
    client.close();
  }

  @Test
  public void getBillingSetupTest() throws Exception {
    BillingSetup expectedResponse =
        BillingSetup.newBuilder()
            .setResourceName(BillingSetupName.of("[CUSTOMER_ID]", "[BILLING_SETUP_ID]").toString())
            .setId(3355)
            .setPaymentsAccount(
                PaymentsAccountName.of("[CUSTOMER_ID]", "[PAYMENTS_ACCOUNT_ID]").toString())
            .setPaymentsAccountInfo(BillingSetup.PaymentsAccountInfo.newBuilder().build())
            .build();
    mockBillingSetupService.addResponse(expectedResponse);

    BillingSetupName resourceName = BillingSetupName.of("[CUSTOMER_ID]", "[BILLING_SETUP_ID]");

    BillingSetup actualResponse = client.getBillingSetup(resourceName);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockBillingSetupService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetBillingSetupRequest actualRequest = ((GetBillingSetupRequest) actualRequests.get(0));

    Assert.assertEquals(resourceName.toString(), actualRequest.getResourceName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getBillingSetupExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockBillingSetupService.addException(exception);

    try {
      BillingSetupName resourceName = BillingSetupName.of("[CUSTOMER_ID]", "[BILLING_SETUP_ID]");
      client.getBillingSetup(resourceName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getBillingSetupTest2() throws Exception {
    BillingSetup expectedResponse =
        BillingSetup.newBuilder()
            .setResourceName(BillingSetupName.of("[CUSTOMER_ID]", "[BILLING_SETUP_ID]").toString())
            .setId(3355)
            .setPaymentsAccount(
                PaymentsAccountName.of("[CUSTOMER_ID]", "[PAYMENTS_ACCOUNT_ID]").toString())
            .setPaymentsAccountInfo(BillingSetup.PaymentsAccountInfo.newBuilder().build())
            .build();
    mockBillingSetupService.addResponse(expectedResponse);

    String resourceName = "resourceName-384566343";

    BillingSetup actualResponse = client.getBillingSetup(resourceName);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockBillingSetupService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetBillingSetupRequest actualRequest = ((GetBillingSetupRequest) actualRequests.get(0));

    Assert.assertEquals(resourceName, actualRequest.getResourceName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getBillingSetupExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockBillingSetupService.addException(exception);

    try {
      String resourceName = "resourceName-384566343";
      client.getBillingSetup(resourceName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void mutateBillingSetupTest() throws Exception {
    MutateBillingSetupResponse expectedResponse =
        MutateBillingSetupResponse.newBuilder()
            .setResult(MutateBillingSetupResult.newBuilder().build())
            .build();
    mockBillingSetupService.addResponse(expectedResponse);

    String customerId = "customerId-1581184615";
    BillingSetupOperation operation = BillingSetupOperation.newBuilder().build();

    MutateBillingSetupResponse actualResponse = client.mutateBillingSetup(customerId, operation);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockBillingSetupService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    MutateBillingSetupRequest actualRequest = ((MutateBillingSetupRequest) actualRequests.get(0));

    Assert.assertEquals(customerId, actualRequest.getCustomerId());
    Assert.assertEquals(operation, actualRequest.getOperation());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void mutateBillingSetupExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockBillingSetupService.addException(exception);

    try {
      String customerId = "customerId-1581184615";
      BillingSetupOperation operation = BillingSetupOperation.newBuilder().build();
      client.mutateBillingSetup(customerId, operation);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }
}
