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

import com.google.ads.googleads.v9.resources.OperatingSystemVersionConstant;
import com.google.ads.googleads.v9.resources.OperatingSystemVersionConstantName;
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
public class OperatingSystemVersionConstantServiceClientTest {
  private static MockOperatingSystemVersionConstantService
      mockOperatingSystemVersionConstantService;
  private static MockServiceHelper mockServiceHelper;
  private LocalChannelProvider channelProvider;
  private OperatingSystemVersionConstantServiceClient client;

  @BeforeClass
  public static void startStaticServer() {
    mockOperatingSystemVersionConstantService = new MockOperatingSystemVersionConstantService();
    mockServiceHelper =
        new MockServiceHelper(
            UUID.randomUUID().toString(),
            Arrays.<MockGrpcService>asList(mockOperatingSystemVersionConstantService));
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
    OperatingSystemVersionConstantServiceSettings settings =
        OperatingSystemVersionConstantServiceSettings.newBuilder()
            .setTransportChannelProvider(channelProvider)
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = OperatingSystemVersionConstantServiceClient.create(settings);
  }

  @After
  public void tearDown() throws Exception {
    client.close();
  }

  @Test
  public void getOperatingSystemVersionConstantTest() throws Exception {
    OperatingSystemVersionConstant expectedResponse =
        OperatingSystemVersionConstant.newBuilder()
            .setResourceName(OperatingSystemVersionConstantName.of("[CRITERION_ID]").toString())
            .setId(3355)
            .setName(OperatingSystemVersionConstantName.of("[CRITERION_ID]").toString())
            .setOsMajorVersion(-1346408137)
            .setOsMinorVersion(1088382771)
            .build();
    mockOperatingSystemVersionConstantService.addResponse(expectedResponse);

    OperatingSystemVersionConstantName resourceName =
        OperatingSystemVersionConstantName.of("[CRITERION_ID]");

    OperatingSystemVersionConstant actualResponse =
        client.getOperatingSystemVersionConstant(resourceName);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockOperatingSystemVersionConstantService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetOperatingSystemVersionConstantRequest actualRequest =
        ((GetOperatingSystemVersionConstantRequest) actualRequests.get(0));

    Assert.assertEquals(resourceName.toString(), actualRequest.getResourceName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getOperatingSystemVersionConstantExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockOperatingSystemVersionConstantService.addException(exception);

    try {
      OperatingSystemVersionConstantName resourceName =
          OperatingSystemVersionConstantName.of("[CRITERION_ID]");
      client.getOperatingSystemVersionConstant(resourceName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getOperatingSystemVersionConstantTest2() throws Exception {
    OperatingSystemVersionConstant expectedResponse =
        OperatingSystemVersionConstant.newBuilder()
            .setResourceName(OperatingSystemVersionConstantName.of("[CRITERION_ID]").toString())
            .setId(3355)
            .setName(OperatingSystemVersionConstantName.of("[CRITERION_ID]").toString())
            .setOsMajorVersion(-1346408137)
            .setOsMinorVersion(1088382771)
            .build();
    mockOperatingSystemVersionConstantService.addResponse(expectedResponse);

    String resourceName = "resourceName-384566343";

    OperatingSystemVersionConstant actualResponse =
        client.getOperatingSystemVersionConstant(resourceName);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockOperatingSystemVersionConstantService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetOperatingSystemVersionConstantRequest actualRequest =
        ((GetOperatingSystemVersionConstantRequest) actualRequests.get(0));

    Assert.assertEquals(resourceName, actualRequest.getResourceName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getOperatingSystemVersionConstantExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockOperatingSystemVersionConstantService.addException(exception);

    try {
      String resourceName = "resourceName-384566343";
      client.getOperatingSystemVersionConstant(resourceName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }
}
