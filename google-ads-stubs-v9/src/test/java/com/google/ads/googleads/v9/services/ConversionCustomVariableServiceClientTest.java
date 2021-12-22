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

import com.google.ads.googleads.v9.resources.ConversionCustomVariable;
import com.google.ads.googleads.v9.resources.ConversionCustomVariableName;
import com.google.ads.googleads.v9.resources.CustomerName;
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
public class ConversionCustomVariableServiceClientTest {
  private static MockConversionCustomVariableService mockConversionCustomVariableService;
  private static MockServiceHelper mockServiceHelper;
  private LocalChannelProvider channelProvider;
  private ConversionCustomVariableServiceClient client;

  @BeforeClass
  public static void startStaticServer() {
    mockConversionCustomVariableService = new MockConversionCustomVariableService();
    mockServiceHelper =
        new MockServiceHelper(
            UUID.randomUUID().toString(),
            Arrays.<MockGrpcService>asList(mockConversionCustomVariableService));
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
    ConversionCustomVariableServiceSettings settings =
        ConversionCustomVariableServiceSettings.newBuilder()
            .setTransportChannelProvider(channelProvider)
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = ConversionCustomVariableServiceClient.create(settings);
  }

  @After
  public void tearDown() throws Exception {
    client.close();
  }

  @Test
  public void getConversionCustomVariableTest() throws Exception {
    ConversionCustomVariable expectedResponse =
        ConversionCustomVariable.newBuilder()
            .setResourceName(
                ConversionCustomVariableName.of("[CUSTOMER_ID]", "[CONVERSION_CUSTOM_VARIABLE_ID]")
                    .toString())
            .setId(3355)
            .setName(
                ConversionCustomVariableName.of("[CUSTOMER_ID]", "[CONVERSION_CUSTOM_VARIABLE_ID]")
                    .toString())
            .setTag("tag114586")
            .setOwnerCustomer(CustomerName.of("[CUSTOMER_ID]").toString())
            .build();
    mockConversionCustomVariableService.addResponse(expectedResponse);

    ConversionCustomVariableName resourceName =
        ConversionCustomVariableName.of("[CUSTOMER_ID]", "[CONVERSION_CUSTOM_VARIABLE_ID]");

    ConversionCustomVariable actualResponse = client.getConversionCustomVariable(resourceName);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockConversionCustomVariableService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetConversionCustomVariableRequest actualRequest =
        ((GetConversionCustomVariableRequest) actualRequests.get(0));

    Assert.assertEquals(resourceName.toString(), actualRequest.getResourceName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getConversionCustomVariableExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockConversionCustomVariableService.addException(exception);

    try {
      ConversionCustomVariableName resourceName =
          ConversionCustomVariableName.of("[CUSTOMER_ID]", "[CONVERSION_CUSTOM_VARIABLE_ID]");
      client.getConversionCustomVariable(resourceName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getConversionCustomVariableTest2() throws Exception {
    ConversionCustomVariable expectedResponse =
        ConversionCustomVariable.newBuilder()
            .setResourceName(
                ConversionCustomVariableName.of("[CUSTOMER_ID]", "[CONVERSION_CUSTOM_VARIABLE_ID]")
                    .toString())
            .setId(3355)
            .setName(
                ConversionCustomVariableName.of("[CUSTOMER_ID]", "[CONVERSION_CUSTOM_VARIABLE_ID]")
                    .toString())
            .setTag("tag114586")
            .setOwnerCustomer(CustomerName.of("[CUSTOMER_ID]").toString())
            .build();
    mockConversionCustomVariableService.addResponse(expectedResponse);

    String resourceName = "resourceName-384566343";

    ConversionCustomVariable actualResponse = client.getConversionCustomVariable(resourceName);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockConversionCustomVariableService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetConversionCustomVariableRequest actualRequest =
        ((GetConversionCustomVariableRequest) actualRequests.get(0));

    Assert.assertEquals(resourceName, actualRequest.getResourceName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getConversionCustomVariableExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockConversionCustomVariableService.addException(exception);

    try {
      String resourceName = "resourceName-384566343";
      client.getConversionCustomVariable(resourceName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void mutateConversionCustomVariablesTest() throws Exception {
    MutateConversionCustomVariablesResponse expectedResponse =
        MutateConversionCustomVariablesResponse.newBuilder()
            .setPartialFailureError(Status.newBuilder().build())
            .addAllResults(new ArrayList<MutateConversionCustomVariableResult>())
            .build();
    mockConversionCustomVariableService.addResponse(expectedResponse);

    String customerId = "customerId-1581184615";
    List<ConversionCustomVariableOperation> operations = new ArrayList<>();

    MutateConversionCustomVariablesResponse actualResponse =
        client.mutateConversionCustomVariables(customerId, operations);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockConversionCustomVariableService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    MutateConversionCustomVariablesRequest actualRequest =
        ((MutateConversionCustomVariablesRequest) actualRequests.get(0));

    Assert.assertEquals(customerId, actualRequest.getCustomerId());
    Assert.assertEquals(operations, actualRequest.getOperationsList());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void mutateConversionCustomVariablesExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockConversionCustomVariableService.addException(exception);

    try {
      String customerId = "customerId-1581184615";
      List<ConversionCustomVariableOperation> operations = new ArrayList<>();
      client.mutateConversionCustomVariables(customerId, operations);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }
}
