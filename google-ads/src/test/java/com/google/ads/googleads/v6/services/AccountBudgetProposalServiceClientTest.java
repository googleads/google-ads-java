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

import com.google.ads.googleads.v6.resources.AccountBudgetProposal;
import com.google.ads.googleads.v6.resources.AccountBudgetProposalName;
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
public class AccountBudgetProposalServiceClientTest {
  private static MockServiceHelper mockServiceHelper;
  private static MockAccountBudgetProposalService mockAccountBudgetProposalService;
  private AccountBudgetProposalServiceClient client;
  private LocalChannelProvider channelProvider;

  @BeforeClass
  public static void startStaticServer() {
    mockAccountBudgetProposalService = new MockAccountBudgetProposalService();
    mockServiceHelper =
        new MockServiceHelper(
            UUID.randomUUID().toString(),
            Arrays.<MockGrpcService>asList(mockAccountBudgetProposalService));
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
    AccountBudgetProposalServiceSettings settings =
        AccountBudgetProposalServiceSettings.newBuilder()
            .setTransportChannelProvider(channelProvider)
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = AccountBudgetProposalServiceClient.create(settings);
  }

  @After
  public void tearDown() throws Exception {
    client.close();
  }

  @Test
  public void getAccountBudgetProposalTest() throws Exception {
    AccountBudgetProposal expectedResponse =
        AccountBudgetProposal.newBuilder()
            .setResourceName(
                AccountBudgetProposalName.of("[CUSTOMER_ID]", "[ACCOUNT_BUDGET_PROPOSAL_ID]")
                    .toString())
            .build();
    mockAccountBudgetProposalService.addResponse(expectedResponse);

    AccountBudgetProposalName resourceName =
        AccountBudgetProposalName.of("[CUSTOMER_ID]", "[ACCOUNT_BUDGET_PROPOSAL_ID]");

    AccountBudgetProposal actualResponse = client.getAccountBudgetProposal(resourceName);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockAccountBudgetProposalService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetAccountBudgetProposalRequest actualRequest =
        ((GetAccountBudgetProposalRequest) actualRequests.get(0));

    Assert.assertEquals(resourceName.toString(), actualRequest.getResourceName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getAccountBudgetProposalExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAccountBudgetProposalService.addException(exception);

    try {
      AccountBudgetProposalName resourceName =
          AccountBudgetProposalName.of("[CUSTOMER_ID]", "[ACCOUNT_BUDGET_PROPOSAL_ID]");
      client.getAccountBudgetProposal(resourceName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getAccountBudgetProposalTest2() throws Exception {
    AccountBudgetProposal expectedResponse =
        AccountBudgetProposal.newBuilder()
            .setResourceName(
                AccountBudgetProposalName.of("[CUSTOMER_ID]", "[ACCOUNT_BUDGET_PROPOSAL_ID]")
                    .toString())
            .build();
    mockAccountBudgetProposalService.addResponse(expectedResponse);

    String resourceName = "resourceName-384566343";

    AccountBudgetProposal actualResponse = client.getAccountBudgetProposal(resourceName);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockAccountBudgetProposalService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetAccountBudgetProposalRequest actualRequest =
        ((GetAccountBudgetProposalRequest) actualRequests.get(0));

    Assert.assertEquals(resourceName, actualRequest.getResourceName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getAccountBudgetProposalExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAccountBudgetProposalService.addException(exception);

    try {
      String resourceName = "resourceName-384566343";
      client.getAccountBudgetProposal(resourceName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void mutateAccountBudgetProposalTest() throws Exception {
    MutateAccountBudgetProposalResponse expectedResponse =
        MutateAccountBudgetProposalResponse.newBuilder()
            .setResult(MutateAccountBudgetProposalResult.newBuilder().build())
            .build();
    mockAccountBudgetProposalService.addResponse(expectedResponse);

    String customerId = "customerId-1581184615";
    AccountBudgetProposalOperation operation = AccountBudgetProposalOperation.newBuilder().build();

    MutateAccountBudgetProposalResponse actualResponse =
        client.mutateAccountBudgetProposal(customerId, operation);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockAccountBudgetProposalService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    MutateAccountBudgetProposalRequest actualRequest =
        ((MutateAccountBudgetProposalRequest) actualRequests.get(0));

    Assert.assertEquals(customerId, actualRequest.getCustomerId());
    Assert.assertEquals(operation, actualRequest.getOperation());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void mutateAccountBudgetProposalExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAccountBudgetProposalService.addException(exception);

    try {
      String customerId = "customerId-1581184615";
      AccountBudgetProposalOperation operation =
          AccountBudgetProposalOperation.newBuilder().build();
      client.mutateAccountBudgetProposal(customerId, operation);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }
}
