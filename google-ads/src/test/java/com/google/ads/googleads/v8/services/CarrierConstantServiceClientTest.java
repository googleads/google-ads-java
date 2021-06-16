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

import com.google.ads.googleads.v8.resources.CarrierConstant;
import com.google.ads.googleads.v8.resources.CarrierConstantName;
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
public class CarrierConstantServiceClientTest {
  private static MockCarrierConstantService mockCarrierConstantService;
  private static MockServiceHelper mockServiceHelper;
  private LocalChannelProvider channelProvider;
  private CarrierConstantServiceClient client;

  @BeforeClass
  public static void startStaticServer() {
    mockCarrierConstantService = new MockCarrierConstantService();
    mockServiceHelper =
        new MockServiceHelper(
            UUID.randomUUID().toString(),
            Arrays.<MockGrpcService>asList(mockCarrierConstantService));
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
    CarrierConstantServiceSettings settings =
        CarrierConstantServiceSettings.newBuilder()
            .setTransportChannelProvider(channelProvider)
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = CarrierConstantServiceClient.create(settings);
  }

  @After
  public void tearDown() throws Exception {
    client.close();
  }

  @Test
  public void getCarrierConstantTest() throws Exception {
    CarrierConstant expectedResponse =
        CarrierConstant.newBuilder()
            .setResourceName(CarrierConstantName.of("[CRITERION_ID]").toString())
            .setId(3355)
            .setName(CarrierConstantName.of("[CRITERION_ID]").toString())
            .setCountryCode("countryCode-1477067101")
            .build();
    mockCarrierConstantService.addResponse(expectedResponse);

    CarrierConstantName resourceName = CarrierConstantName.of("[CRITERION_ID]");

    CarrierConstant actualResponse = client.getCarrierConstant(resourceName);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockCarrierConstantService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetCarrierConstantRequest actualRequest = ((GetCarrierConstantRequest) actualRequests.get(0));

    Assert.assertEquals(resourceName.toString(), actualRequest.getResourceName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getCarrierConstantExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockCarrierConstantService.addException(exception);

    try {
      CarrierConstantName resourceName = CarrierConstantName.of("[CRITERION_ID]");
      client.getCarrierConstant(resourceName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getCarrierConstantTest2() throws Exception {
    CarrierConstant expectedResponse =
        CarrierConstant.newBuilder()
            .setResourceName(CarrierConstantName.of("[CRITERION_ID]").toString())
            .setId(3355)
            .setName(CarrierConstantName.of("[CRITERION_ID]").toString())
            .setCountryCode("countryCode-1477067101")
            .build();
    mockCarrierConstantService.addResponse(expectedResponse);

    String resourceName = "resourceName-384566343";

    CarrierConstant actualResponse = client.getCarrierConstant(resourceName);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockCarrierConstantService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetCarrierConstantRequest actualRequest = ((GetCarrierConstantRequest) actualRequests.get(0));

    Assert.assertEquals(resourceName, actualRequest.getResourceName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getCarrierConstantExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockCarrierConstantService.addException(exception);

    try {
      String resourceName = "resourceName-384566343";
      client.getCarrierConstant(resourceName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }
}
