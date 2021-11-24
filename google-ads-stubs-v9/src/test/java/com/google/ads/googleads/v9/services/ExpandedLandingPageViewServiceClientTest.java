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

import com.google.ads.googleads.v9.resources.ExpandedLandingPageView;
import com.google.ads.googleads.v9.resources.ExpandedLandingPageViewName;
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
public class ExpandedLandingPageViewServiceClientTest {
  private static MockExpandedLandingPageViewService mockExpandedLandingPageViewService;
  private static MockServiceHelper mockServiceHelper;
  private LocalChannelProvider channelProvider;
  private ExpandedLandingPageViewServiceClient client;

  @BeforeClass
  public static void startStaticServer() {
    mockExpandedLandingPageViewService = new MockExpandedLandingPageViewService();
    mockServiceHelper =
        new MockServiceHelper(
            UUID.randomUUID().toString(),
            Arrays.<MockGrpcService>asList(mockExpandedLandingPageViewService));
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
    ExpandedLandingPageViewServiceSettings settings =
        ExpandedLandingPageViewServiceSettings.newBuilder()
            .setTransportChannelProvider(channelProvider)
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = ExpandedLandingPageViewServiceClient.create(settings);
  }

  @After
  public void tearDown() throws Exception {
    client.close();
  }

  @Test
  public void getExpandedLandingPageViewTest() throws Exception {
    ExpandedLandingPageView expectedResponse =
        ExpandedLandingPageView.newBuilder()
            .setResourceName(
                ExpandedLandingPageViewName.of("[CUSTOMER_ID]", "[EXPANDED_FINAL_URL_FINGERPRINT]")
                    .toString())
            .setExpandedFinalUrl("expandedFinalUrl-323823630")
            .build();
    mockExpandedLandingPageViewService.addResponse(expectedResponse);

    ExpandedLandingPageViewName resourceName =
        ExpandedLandingPageViewName.of("[CUSTOMER_ID]", "[EXPANDED_FINAL_URL_FINGERPRINT]");

    ExpandedLandingPageView actualResponse = client.getExpandedLandingPageView(resourceName);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockExpandedLandingPageViewService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetExpandedLandingPageViewRequest actualRequest =
        ((GetExpandedLandingPageViewRequest) actualRequests.get(0));

    Assert.assertEquals(resourceName.toString(), actualRequest.getResourceName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getExpandedLandingPageViewExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockExpandedLandingPageViewService.addException(exception);

    try {
      ExpandedLandingPageViewName resourceName =
          ExpandedLandingPageViewName.of("[CUSTOMER_ID]", "[EXPANDED_FINAL_URL_FINGERPRINT]");
      client.getExpandedLandingPageView(resourceName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getExpandedLandingPageViewTest2() throws Exception {
    ExpandedLandingPageView expectedResponse =
        ExpandedLandingPageView.newBuilder()
            .setResourceName(
                ExpandedLandingPageViewName.of("[CUSTOMER_ID]", "[EXPANDED_FINAL_URL_FINGERPRINT]")
                    .toString())
            .setExpandedFinalUrl("expandedFinalUrl-323823630")
            .build();
    mockExpandedLandingPageViewService.addResponse(expectedResponse);

    String resourceName = "resourceName-384566343";

    ExpandedLandingPageView actualResponse = client.getExpandedLandingPageView(resourceName);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockExpandedLandingPageViewService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetExpandedLandingPageViewRequest actualRequest =
        ((GetExpandedLandingPageViewRequest) actualRequests.get(0));

    Assert.assertEquals(resourceName, actualRequest.getResourceName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getExpandedLandingPageViewExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockExpandedLandingPageViewService.addException(exception);

    try {
      String resourceName = "resourceName-384566343";
      client.getExpandedLandingPageView(resourceName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }
}
