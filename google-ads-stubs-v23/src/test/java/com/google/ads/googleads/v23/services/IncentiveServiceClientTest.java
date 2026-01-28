/*
 * Copyright 2026 Google LLC
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

package com.google.ads.googleads.v23.services;

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
public class IncentiveServiceClientTest {
  private static MockIncentiveService mockIncentiveService;
  private static MockServiceHelper mockServiceHelper;
  private LocalChannelProvider channelProvider;
  private IncentiveServiceClient client;

  @BeforeClass
  public static void startStaticServer() {
    mockIncentiveService = new MockIncentiveService();
    mockServiceHelper =
        new MockServiceHelper(
            UUID.randomUUID().toString(), Arrays.<MockGrpcService>asList(mockIncentiveService));
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
    IncentiveServiceSettings settings =
        IncentiveServiceSettings.newBuilder()
            .setTransportChannelProvider(channelProvider)
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = IncentiveServiceClient.create(settings);
  }

  @After
  public void tearDown() throws Exception {
    client.close();
  }

  @Test
  public void fetchIncentiveTest() throws Exception {
    FetchIncentiveResponse expectedResponse =
        FetchIncentiveResponse.newBuilder()
            .setIncentiveOffer(IncentiveOffer.newBuilder().build())
            .build();
    mockIncentiveService.addResponse(expectedResponse);

    FetchIncentiveRequest request =
        FetchIncentiveRequest.newBuilder()
            .setLanguageCode("languageCode-2092349083")
            .setCountryCode("countryCode-1477067101")
            .setEmail("email96619420")
            .build();

    FetchIncentiveResponse actualResponse = client.fetchIncentive(request);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockIncentiveService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    FetchIncentiveRequest actualRequest = ((FetchIncentiveRequest) actualRequests.get(0));

    Assert.assertEquals(request.getLanguageCode(), actualRequest.getLanguageCode());
    Assert.assertEquals(request.getCountryCode(), actualRequest.getCountryCode());
    Assert.assertEquals(request.getEmail(), actualRequest.getEmail());
    Assert.assertEquals(request.getType(), actualRequest.getType());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void fetchIncentiveExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockIncentiveService.addException(exception);

    try {
      FetchIncentiveRequest request =
          FetchIncentiveRequest.newBuilder()
              .setLanguageCode("languageCode-2092349083")
              .setCountryCode("countryCode-1477067101")
              .setEmail("email96619420")
              .build();
      client.fetchIncentive(request);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void applyIncentiveTest() throws Exception {
    ApplyIncentiveResponse expectedResponse =
        ApplyIncentiveResponse.newBuilder()
            .setCouponCode("couponCode609122099")
            .setCreationTime("creationTime1586015820")
            .build();
    mockIncentiveService.addResponse(expectedResponse);

    String countryCode = "countryCode-1477067101";

    ApplyIncentiveResponse actualResponse = client.applyIncentive(countryCode);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockIncentiveService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ApplyIncentiveRequest actualRequest = ((ApplyIncentiveRequest) actualRequests.get(0));

    Assert.assertEquals(countryCode, actualRequest.getCountryCode());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void applyIncentiveExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockIncentiveService.addException(exception);

    try {
      String countryCode = "countryCode-1477067101";
      client.applyIncentive(countryCode);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }
}
