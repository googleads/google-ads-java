/*
 * Copyright 2023 Google LLC
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

package com.google.ads.googleads.v14.services;

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
public class CustomerUserAccessInvitationServiceClientTest {
  private static MockCustomerUserAccessInvitationService mockCustomerUserAccessInvitationService;
  private static MockServiceHelper mockServiceHelper;
  private LocalChannelProvider channelProvider;
  private CustomerUserAccessInvitationServiceClient client;

  @BeforeClass
  public static void startStaticServer() {
    mockCustomerUserAccessInvitationService = new MockCustomerUserAccessInvitationService();
    mockServiceHelper =
        new MockServiceHelper(
            UUID.randomUUID().toString(),
            Arrays.<MockGrpcService>asList(mockCustomerUserAccessInvitationService));
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
    CustomerUserAccessInvitationServiceSettings settings =
        CustomerUserAccessInvitationServiceSettings.newBuilder()
            .setTransportChannelProvider(channelProvider)
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = CustomerUserAccessInvitationServiceClient.create(settings);
  }

  @After
  public void tearDown() throws Exception {
    client.close();
  }

  @Test
  public void mutateCustomerUserAccessInvitationTest() throws Exception {
    MutateCustomerUserAccessInvitationResponse expectedResponse =
        MutateCustomerUserAccessInvitationResponse.newBuilder()
            .setResult(MutateCustomerUserAccessInvitationResult.newBuilder().build())
            .build();
    mockCustomerUserAccessInvitationService.addResponse(expectedResponse);

    String customerId = "customerId-1581184615";
    CustomerUserAccessInvitationOperation operation =
        CustomerUserAccessInvitationOperation.newBuilder().build();

    MutateCustomerUserAccessInvitationResponse actualResponse =
        client.mutateCustomerUserAccessInvitation(customerId, operation);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockCustomerUserAccessInvitationService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    MutateCustomerUserAccessInvitationRequest actualRequest =
        ((MutateCustomerUserAccessInvitationRequest) actualRequests.get(0));

    Assert.assertEquals(customerId, actualRequest.getCustomerId());
    Assert.assertEquals(operation, actualRequest.getOperation());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void mutateCustomerUserAccessInvitationExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockCustomerUserAccessInvitationService.addException(exception);

    try {
      String customerId = "customerId-1581184615";
      CustomerUserAccessInvitationOperation operation =
          CustomerUserAccessInvitationOperation.newBuilder().build();
      client.mutateCustomerUserAccessInvitation(customerId, operation);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }
}
