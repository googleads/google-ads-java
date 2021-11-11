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

package com.google.ads.googleads.v7.services;

import com.google.ads.googleads.v7.resources.MobileDeviceConstant;
import com.google.ads.googleads.v7.resources.MobileDeviceConstantName;
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
public class MobileDeviceConstantServiceClientTest {
  private static MockMobileDeviceConstantService mockMobileDeviceConstantService;
  private static MockServiceHelper mockServiceHelper;
  private LocalChannelProvider channelProvider;
  private MobileDeviceConstantServiceClient client;

  @BeforeClass
  public static void startStaticServer() {
    mockMobileDeviceConstantService = new MockMobileDeviceConstantService();
    mockServiceHelper =
        new MockServiceHelper(
            UUID.randomUUID().toString(),
            Arrays.<MockGrpcService>asList(mockMobileDeviceConstantService));
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
    MobileDeviceConstantServiceSettings settings =
        MobileDeviceConstantServiceSettings.newBuilder()
            .setTransportChannelProvider(channelProvider)
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = MobileDeviceConstantServiceClient.create(settings);
  }

  @After
  public void tearDown() throws Exception {
    client.close();
  }

  @Test
  public void getMobileDeviceConstantTest() throws Exception {
    MobileDeviceConstant expectedResponse =
        MobileDeviceConstant.newBuilder()
            .setResourceName(MobileDeviceConstantName.of("[CRITERION_ID]").toString())
            .setId(3355)
            .setName(MobileDeviceConstantName.of("[CRITERION_ID]").toString())
            .setManufacturerName("manufacturerName75153916")
            .setOperatingSystemName("operatingSystemName2122745211")
            .build();
    mockMobileDeviceConstantService.addResponse(expectedResponse);

    MobileDeviceConstantName resourceName = MobileDeviceConstantName.of("[CRITERION_ID]");

    MobileDeviceConstant actualResponse = client.getMobileDeviceConstant(resourceName);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockMobileDeviceConstantService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetMobileDeviceConstantRequest actualRequest =
        ((GetMobileDeviceConstantRequest) actualRequests.get(0));

    Assert.assertEquals(resourceName.toString(), actualRequest.getResourceName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getMobileDeviceConstantExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockMobileDeviceConstantService.addException(exception);

    try {
      MobileDeviceConstantName resourceName = MobileDeviceConstantName.of("[CRITERION_ID]");
      client.getMobileDeviceConstant(resourceName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getMobileDeviceConstantTest2() throws Exception {
    MobileDeviceConstant expectedResponse =
        MobileDeviceConstant.newBuilder()
            .setResourceName(MobileDeviceConstantName.of("[CRITERION_ID]").toString())
            .setId(3355)
            .setName(MobileDeviceConstantName.of("[CRITERION_ID]").toString())
            .setManufacturerName("manufacturerName75153916")
            .setOperatingSystemName("operatingSystemName2122745211")
            .build();
    mockMobileDeviceConstantService.addResponse(expectedResponse);

    String resourceName = "resourceName-384566343";

    MobileDeviceConstant actualResponse = client.getMobileDeviceConstant(resourceName);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockMobileDeviceConstantService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetMobileDeviceConstantRequest actualRequest =
        ((GetMobileDeviceConstantRequest) actualRequests.get(0));

    Assert.assertEquals(resourceName, actualRequest.getResourceName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getMobileDeviceConstantExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockMobileDeviceConstantService.addException(exception);

    try {
      String resourceName = "resourceName-384566343";
      client.getMobileDeviceConstant(resourceName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }
}
