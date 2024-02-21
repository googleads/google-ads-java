/*
 * Copyright 2024 Google LLC
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

package com.google.ads.googleads.v15.services;

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
public class CustomerSkAdNetworkConversionValueSchemaServiceClientTest {
  private static MockCustomerSkAdNetworkConversionValueSchemaService
      mockCustomerSkAdNetworkConversionValueSchemaService;
  private static MockServiceHelper mockServiceHelper;
  private LocalChannelProvider channelProvider;
  private CustomerSkAdNetworkConversionValueSchemaServiceClient client;

  @BeforeClass
  public static void startStaticServer() {
    mockCustomerSkAdNetworkConversionValueSchemaService =
        new MockCustomerSkAdNetworkConversionValueSchemaService();
    mockServiceHelper =
        new MockServiceHelper(
            UUID.randomUUID().toString(),
            Arrays.<MockGrpcService>asList(mockCustomerSkAdNetworkConversionValueSchemaService));
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
    CustomerSkAdNetworkConversionValueSchemaServiceSettings settings =
        CustomerSkAdNetworkConversionValueSchemaServiceSettings.newBuilder()
            .setTransportChannelProvider(channelProvider)
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = CustomerSkAdNetworkConversionValueSchemaServiceClient.create(settings);
  }

  @After
  public void tearDown() throws Exception {
    client.close();
  }

  @Test
  public void mutateCustomerSkAdNetworkConversionValueSchemaTest() throws Exception {
    MutateCustomerSkAdNetworkConversionValueSchemaResponse expectedResponse =
        MutateCustomerSkAdNetworkConversionValueSchemaResponse.newBuilder()
            .setResult(MutateCustomerSkAdNetworkConversionValueSchemaResult.newBuilder().build())
            .build();
    mockCustomerSkAdNetworkConversionValueSchemaService.addResponse(expectedResponse);

    MutateCustomerSkAdNetworkConversionValueSchemaRequest request =
        MutateCustomerSkAdNetworkConversionValueSchemaRequest.newBuilder()
            .setCustomerId("customerId-1581184615")
            .setOperation(CustomerSkAdNetworkConversionValueSchemaOperation.newBuilder().build())
            .setValidateOnly(true)
            .build();

    MutateCustomerSkAdNetworkConversionValueSchemaResponse actualResponse =
        client.mutateCustomerSkAdNetworkConversionValueSchema(request);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests =
        mockCustomerSkAdNetworkConversionValueSchemaService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    MutateCustomerSkAdNetworkConversionValueSchemaRequest actualRequest =
        ((MutateCustomerSkAdNetworkConversionValueSchemaRequest) actualRequests.get(0));

    Assert.assertEquals(request.getCustomerId(), actualRequest.getCustomerId());
    Assert.assertEquals(request.getOperation(), actualRequest.getOperation());
    Assert.assertEquals(request.getValidateOnly(), actualRequest.getValidateOnly());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void mutateCustomerSkAdNetworkConversionValueSchemaExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockCustomerSkAdNetworkConversionValueSchemaService.addException(exception);

    try {
      MutateCustomerSkAdNetworkConversionValueSchemaRequest request =
          MutateCustomerSkAdNetworkConversionValueSchemaRequest.newBuilder()
              .setCustomerId("customerId-1581184615")
              .setOperation(CustomerSkAdNetworkConversionValueSchemaOperation.newBuilder().build())
              .setValidateOnly(true)
              .build();
      client.mutateCustomerSkAdNetworkConversionValueSchema(request);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }
}
