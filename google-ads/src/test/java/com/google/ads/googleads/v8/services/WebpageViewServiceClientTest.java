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

import com.google.ads.googleads.v8.resources.WebpageView;
import com.google.ads.googleads.v8.resources.WebpageViewName;
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
public class WebpageViewServiceClientTest {
  private static MockServiceHelper mockServiceHelper;
  private static MockWebpageViewService mockWebpageViewService;
  private LocalChannelProvider channelProvider;
  private WebpageViewServiceClient client;

  @BeforeClass
  public static void startStaticServer() {
    mockWebpageViewService = new MockWebpageViewService();
    mockServiceHelper =
        new MockServiceHelper(
            UUID.randomUUID().toString(), Arrays.<MockGrpcService>asList(mockWebpageViewService));
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
    WebpageViewServiceSettings settings =
        WebpageViewServiceSettings.newBuilder()
            .setTransportChannelProvider(channelProvider)
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = WebpageViewServiceClient.create(settings);
  }

  @After
  public void tearDown() throws Exception {
    client.close();
  }

  @Test
  public void getWebpageViewTest() throws Exception {
    WebpageView expectedResponse =
        WebpageView.newBuilder()
            .setResourceName(
                WebpageViewName.of("[CUSTOMER_ID]", "[AD_GROUP_ID]", "[CRITERION_ID]").toString())
            .build();
    mockWebpageViewService.addResponse(expectedResponse);

    WebpageViewName resourceName =
        WebpageViewName.of("[CUSTOMER_ID]", "[AD_GROUP_ID]", "[CRITERION_ID]");

    WebpageView actualResponse = client.getWebpageView(resourceName);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockWebpageViewService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetWebpageViewRequest actualRequest = ((GetWebpageViewRequest) actualRequests.get(0));

    Assert.assertEquals(resourceName.toString(), actualRequest.getResourceName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getWebpageViewExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockWebpageViewService.addException(exception);

    try {
      WebpageViewName resourceName =
          WebpageViewName.of("[CUSTOMER_ID]", "[AD_GROUP_ID]", "[CRITERION_ID]");
      client.getWebpageView(resourceName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getWebpageViewTest2() throws Exception {
    WebpageView expectedResponse =
        WebpageView.newBuilder()
            .setResourceName(
                WebpageViewName.of("[CUSTOMER_ID]", "[AD_GROUP_ID]", "[CRITERION_ID]").toString())
            .build();
    mockWebpageViewService.addResponse(expectedResponse);

    String resourceName = "resourceName-384566343";

    WebpageView actualResponse = client.getWebpageView(resourceName);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockWebpageViewService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetWebpageViewRequest actualRequest = ((GetWebpageViewRequest) actualRequests.get(0));

    Assert.assertEquals(resourceName, actualRequest.getResourceName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getWebpageViewExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockWebpageViewService.addException(exception);

    try {
      String resourceName = "resourceName-384566343";
      client.getWebpageView(resourceName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }
}
