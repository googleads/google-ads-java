/*
 * Copyright 2025 Google LLC
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

package com.google.ads.googleads.v20.services;

import com.google.ads.googleads.v20.resources.AccountLink;
import com.google.ads.googleads.v20.resources.AccountLinkName;
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
public class AccountLinkServiceClientTest {
  private static MockAccountLinkService mockAccountLinkService;
  private static MockServiceHelper mockServiceHelper;
  private LocalChannelProvider channelProvider;
  private AccountLinkServiceClient client;

  @BeforeClass
  public static void startStaticServer() {
    mockAccountLinkService = new MockAccountLinkService();
    mockServiceHelper =
        new MockServiceHelper(
            UUID.randomUUID().toString(), Arrays.<MockGrpcService>asList(mockAccountLinkService));
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
    AccountLinkServiceSettings settings =
        AccountLinkServiceSettings.newBuilder()
            .setTransportChannelProvider(channelProvider)
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = AccountLinkServiceClient.create(settings);
  }

  @After
  public void tearDown() throws Exception {
    client.close();
  }

  @Test
  public void createAccountLinkTest() throws Exception {
    CreateAccountLinkResponse expectedResponse =
        CreateAccountLinkResponse.newBuilder()
            .setResourceName(AccountLinkName.of("[CUSTOMER_ID]", "[ACCOUNT_LINK_ID]").toString())
            .build();
    mockAccountLinkService.addResponse(expectedResponse);

    String customerId = "customerId-1581184615";
    AccountLink accountLink = AccountLink.newBuilder().build();

    CreateAccountLinkResponse actualResponse = client.createAccountLink(customerId, accountLink);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockAccountLinkService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    CreateAccountLinkRequest actualRequest = ((CreateAccountLinkRequest) actualRequests.get(0));

    Assert.assertEquals(customerId, actualRequest.getCustomerId());
    Assert.assertEquals(accountLink, actualRequest.getAccountLink());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void createAccountLinkExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAccountLinkService.addException(exception);

    try {
      String customerId = "customerId-1581184615";
      AccountLink accountLink = AccountLink.newBuilder().build();
      client.createAccountLink(customerId, accountLink);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void mutateAccountLinkTest() throws Exception {
    MutateAccountLinkResponse expectedResponse =
        MutateAccountLinkResponse.newBuilder()
            .setResult(MutateAccountLinkResult.newBuilder().build())
            .setPartialFailureError(Status.newBuilder().build())
            .build();
    mockAccountLinkService.addResponse(expectedResponse);

    String customerId = "customerId-1581184615";
    AccountLinkOperation operation = AccountLinkOperation.newBuilder().build();

    MutateAccountLinkResponse actualResponse = client.mutateAccountLink(customerId, operation);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockAccountLinkService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    MutateAccountLinkRequest actualRequest = ((MutateAccountLinkRequest) actualRequests.get(0));

    Assert.assertEquals(customerId, actualRequest.getCustomerId());
    Assert.assertEquals(operation, actualRequest.getOperation());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void mutateAccountLinkExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAccountLinkService.addException(exception);

    try {
      String customerId = "customerId-1581184615";
      AccountLinkOperation operation = AccountLinkOperation.newBuilder().build();
      client.mutateAccountLink(customerId, operation);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }
}
