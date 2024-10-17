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

package com.google.ads.googleads.v18.services;

import com.google.ads.googleads.v18.enums.IdentityVerificationProgramEnum;
import com.google.api.gax.core.NoCredentialsProvider;
import com.google.api.gax.grpc.GaxGrpcProperties;
import com.google.api.gax.grpc.testing.LocalChannelProvider;
import com.google.api.gax.grpc.testing.MockGrpcService;
import com.google.api.gax.grpc.testing.MockServiceHelper;
import com.google.api.gax.rpc.ApiClientHeaderProvider;
import com.google.api.gax.rpc.InvalidArgumentException;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.Empty;
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
public class IdentityVerificationServiceClientTest {
  private static MockIdentityVerificationService mockIdentityVerificationService;
  private static MockServiceHelper mockServiceHelper;
  private LocalChannelProvider channelProvider;
  private IdentityVerificationServiceClient client;

  @BeforeClass
  public static void startStaticServer() {
    mockIdentityVerificationService = new MockIdentityVerificationService();
    mockServiceHelper =
        new MockServiceHelper(
            UUID.randomUUID().toString(),
            Arrays.<MockGrpcService>asList(mockIdentityVerificationService));
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
    IdentityVerificationServiceSettings settings =
        IdentityVerificationServiceSettings.newBuilder()
            .setTransportChannelProvider(channelProvider)
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = IdentityVerificationServiceClient.create(settings);
  }

  @After
  public void tearDown() throws Exception {
    client.close();
  }

  @Test
  public void startIdentityVerificationTest() throws Exception {
    Empty expectedResponse = Empty.newBuilder().build();
    mockIdentityVerificationService.addResponse(expectedResponse);

    String customerId = "customerId-1581184615";
    IdentityVerificationProgramEnum.IdentityVerificationProgram verificationProgram =
        IdentityVerificationProgramEnum.IdentityVerificationProgram.forNumber(0);

    client.startIdentityVerification(customerId, verificationProgram);

    List<AbstractMessage> actualRequests = mockIdentityVerificationService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    StartIdentityVerificationRequest actualRequest =
        ((StartIdentityVerificationRequest) actualRequests.get(0));

    Assert.assertEquals(customerId, actualRequest.getCustomerId());
    Assert.assertEquals(verificationProgram, actualRequest.getVerificationProgram());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void startIdentityVerificationExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockIdentityVerificationService.addException(exception);

    try {
      String customerId = "customerId-1581184615";
      IdentityVerificationProgramEnum.IdentityVerificationProgram verificationProgram =
          IdentityVerificationProgramEnum.IdentityVerificationProgram.forNumber(0);
      client.startIdentityVerification(customerId, verificationProgram);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getIdentityVerificationTest() throws Exception {
    GetIdentityVerificationResponse expectedResponse =
        GetIdentityVerificationResponse.newBuilder()
            .addAllIdentityVerification(new ArrayList<IdentityVerification>())
            .build();
    mockIdentityVerificationService.addResponse(expectedResponse);

    String customerId = "customerId-1581184615";

    GetIdentityVerificationResponse actualResponse = client.getIdentityVerification(customerId);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockIdentityVerificationService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetIdentityVerificationRequest actualRequest =
        ((GetIdentityVerificationRequest) actualRequests.get(0));

    Assert.assertEquals(customerId, actualRequest.getCustomerId());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getIdentityVerificationExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockIdentityVerificationService.addException(exception);

    try {
      String customerId = "customerId-1581184615";
      client.getIdentityVerification(customerId);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }
}
