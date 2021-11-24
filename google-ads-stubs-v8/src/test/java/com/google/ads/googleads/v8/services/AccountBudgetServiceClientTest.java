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

import com.google.ads.googleads.v8.resources.AccountBudget;
import com.google.ads.googleads.v8.resources.AccountBudgetName;
import com.google.ads.googleads.v8.resources.BillingSetupName;
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
public class AccountBudgetServiceClientTest {
  private static MockAccountBudgetService mockAccountBudgetService;
  private static MockServiceHelper mockServiceHelper;
  private LocalChannelProvider channelProvider;
  private AccountBudgetServiceClient client;

  @BeforeClass
  public static void startStaticServer() {
    mockAccountBudgetService = new MockAccountBudgetService();
    mockServiceHelper =
        new MockServiceHelper(
            UUID.randomUUID().toString(), Arrays.<MockGrpcService>asList(mockAccountBudgetService));
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
    AccountBudgetServiceSettings settings =
        AccountBudgetServiceSettings.newBuilder()
            .setTransportChannelProvider(channelProvider)
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = AccountBudgetServiceClient.create(settings);
  }

  @After
  public void tearDown() throws Exception {
    client.close();
  }

  @Test
  public void getAccountBudgetTest() throws Exception {
    AccountBudget expectedResponse =
        AccountBudget.newBuilder()
            .setResourceName(
                AccountBudgetName.of("[CUSTOMER_ID]", "[ACCOUNT_BUDGET_ID]").toString())
            .setId(3355)
            .setBillingSetup(BillingSetupName.of("[CUSTOMER_ID]", "[BILLING_SETUP_ID]").toString())
            .setName(AccountBudgetName.of("[CUSTOMER_ID]", "[ACCOUNT_BUDGET_ID]").toString())
            .setProposedStartDateTime("proposedStartDateTime1948242007")
            .setApprovedStartDateTime("approvedStartDateTime-479625050")
            .setTotalAdjustmentsMicros(1469082819)
            .setAmountServedMicros(1848146642)
            .setPurchaseOrderNumber("purchaseOrderNumber-125746058")
            .setNotes("notes105008833")
            .setPendingProposal(AccountBudget.PendingAccountBudgetProposal.newBuilder().build())
            .build();
    mockAccountBudgetService.addResponse(expectedResponse);

    AccountBudgetName resourceName = AccountBudgetName.of("[CUSTOMER_ID]", "[ACCOUNT_BUDGET_ID]");

    AccountBudget actualResponse = client.getAccountBudget(resourceName);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockAccountBudgetService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetAccountBudgetRequest actualRequest = ((GetAccountBudgetRequest) actualRequests.get(0));

    Assert.assertEquals(resourceName.toString(), actualRequest.getResourceName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getAccountBudgetExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAccountBudgetService.addException(exception);

    try {
      AccountBudgetName resourceName = AccountBudgetName.of("[CUSTOMER_ID]", "[ACCOUNT_BUDGET_ID]");
      client.getAccountBudget(resourceName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getAccountBudgetTest2() throws Exception {
    AccountBudget expectedResponse =
        AccountBudget.newBuilder()
            .setResourceName(
                AccountBudgetName.of("[CUSTOMER_ID]", "[ACCOUNT_BUDGET_ID]").toString())
            .setId(3355)
            .setBillingSetup(BillingSetupName.of("[CUSTOMER_ID]", "[BILLING_SETUP_ID]").toString())
            .setName(AccountBudgetName.of("[CUSTOMER_ID]", "[ACCOUNT_BUDGET_ID]").toString())
            .setProposedStartDateTime("proposedStartDateTime1948242007")
            .setApprovedStartDateTime("approvedStartDateTime-479625050")
            .setTotalAdjustmentsMicros(1469082819)
            .setAmountServedMicros(1848146642)
            .setPurchaseOrderNumber("purchaseOrderNumber-125746058")
            .setNotes("notes105008833")
            .setPendingProposal(AccountBudget.PendingAccountBudgetProposal.newBuilder().build())
            .build();
    mockAccountBudgetService.addResponse(expectedResponse);

    String resourceName = "resourceName-384566343";

    AccountBudget actualResponse = client.getAccountBudget(resourceName);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockAccountBudgetService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetAccountBudgetRequest actualRequest = ((GetAccountBudgetRequest) actualRequests.get(0));

    Assert.assertEquals(resourceName, actualRequest.getResourceName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getAccountBudgetExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAccountBudgetService.addException(exception);

    try {
      String resourceName = "resourceName-384566343";
      client.getAccountBudget(resourceName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }
}
