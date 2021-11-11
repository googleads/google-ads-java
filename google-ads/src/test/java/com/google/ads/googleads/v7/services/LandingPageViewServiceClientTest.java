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

import com.google.ads.googleads.v7.resources.LandingPageView;
import com.google.ads.googleads.v7.resources.LandingPageViewName;
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
public class LandingPageViewServiceClientTest {
  private static MockLandingPageViewService mockLandingPageViewService;
  private static MockServiceHelper mockServiceHelper;
  private LocalChannelProvider channelProvider;
  private LandingPageViewServiceClient client;

  @BeforeClass
  public static void startStaticServer() {
    mockLandingPageViewService = new MockLandingPageViewService();
    mockServiceHelper =
        new MockServiceHelper(
            UUID.randomUUID().toString(),
            Arrays.<MockGrpcService>asList(mockLandingPageViewService));
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
    LandingPageViewServiceSettings settings =
        LandingPageViewServiceSettings.newBuilder()
            .setTransportChannelProvider(channelProvider)
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = LandingPageViewServiceClient.create(settings);
  }

  @After
  public void tearDown() throws Exception {
    client.close();
  }

  @Test
  public void getLandingPageViewTest() throws Exception {
    LandingPageView expectedResponse =
        LandingPageView.newBuilder()
            .setResourceName(
                LandingPageViewName.of("[CUSTOMER_ID]", "[UNEXPANDED_FINAL_URL_FINGERPRINT]")
                    .toString())
            .setUnexpandedFinalUrl("unexpandedFinalUrl1818006667")
            .build();
    mockLandingPageViewService.addResponse(expectedResponse);

    LandingPageViewName resourceName =
        LandingPageViewName.of("[CUSTOMER_ID]", "[UNEXPANDED_FINAL_URL_FINGERPRINT]");

    LandingPageView actualResponse = client.getLandingPageView(resourceName);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockLandingPageViewService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetLandingPageViewRequest actualRequest = ((GetLandingPageViewRequest) actualRequests.get(0));

    Assert.assertEquals(resourceName.toString(), actualRequest.getResourceName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getLandingPageViewExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockLandingPageViewService.addException(exception);

    try {
      LandingPageViewName resourceName =
          LandingPageViewName.of("[CUSTOMER_ID]", "[UNEXPANDED_FINAL_URL_FINGERPRINT]");
      client.getLandingPageView(resourceName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getLandingPageViewTest2() throws Exception {
    LandingPageView expectedResponse =
        LandingPageView.newBuilder()
            .setResourceName(
                LandingPageViewName.of("[CUSTOMER_ID]", "[UNEXPANDED_FINAL_URL_FINGERPRINT]")
                    .toString())
            .setUnexpandedFinalUrl("unexpandedFinalUrl1818006667")
            .build();
    mockLandingPageViewService.addResponse(expectedResponse);

    String resourceName = "resourceName-384566343";

    LandingPageView actualResponse = client.getLandingPageView(resourceName);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockLandingPageViewService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetLandingPageViewRequest actualRequest = ((GetLandingPageViewRequest) actualRequests.get(0));

    Assert.assertEquals(resourceName, actualRequest.getResourceName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getLandingPageViewExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockLandingPageViewService.addException(exception);

    try {
      String resourceName = "resourceName-384566343";
      client.getLandingPageView(resourceName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }
}
