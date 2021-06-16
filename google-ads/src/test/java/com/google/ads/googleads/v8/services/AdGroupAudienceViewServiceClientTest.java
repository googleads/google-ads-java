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

import com.google.ads.googleads.v8.resources.AdGroupAudienceView;
import com.google.ads.googleads.v8.resources.AdGroupAudienceViewName;
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
public class AdGroupAudienceViewServiceClientTest {
  private static MockAdGroupAudienceViewService mockAdGroupAudienceViewService;
  private static MockServiceHelper mockServiceHelper;
  private LocalChannelProvider channelProvider;
  private AdGroupAudienceViewServiceClient client;

  @BeforeClass
  public static void startStaticServer() {
    mockAdGroupAudienceViewService = new MockAdGroupAudienceViewService();
    mockServiceHelper =
        new MockServiceHelper(
            UUID.randomUUID().toString(),
            Arrays.<MockGrpcService>asList(mockAdGroupAudienceViewService));
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
    AdGroupAudienceViewServiceSettings settings =
        AdGroupAudienceViewServiceSettings.newBuilder()
            .setTransportChannelProvider(channelProvider)
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = AdGroupAudienceViewServiceClient.create(settings);
  }

  @After
  public void tearDown() throws Exception {
    client.close();
  }

  @Test
  public void getAdGroupAudienceViewTest() throws Exception {
    AdGroupAudienceView expectedResponse =
        AdGroupAudienceView.newBuilder()
            .setResourceName(
                AdGroupAudienceViewName.of("[CUSTOMER_ID]", "[AD_GROUP_ID]", "[CRITERION_ID]")
                    .toString())
            .build();
    mockAdGroupAudienceViewService.addResponse(expectedResponse);

    AdGroupAudienceViewName resourceName =
        AdGroupAudienceViewName.of("[CUSTOMER_ID]", "[AD_GROUP_ID]", "[CRITERION_ID]");

    AdGroupAudienceView actualResponse = client.getAdGroupAudienceView(resourceName);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockAdGroupAudienceViewService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetAdGroupAudienceViewRequest actualRequest =
        ((GetAdGroupAudienceViewRequest) actualRequests.get(0));

    Assert.assertEquals(resourceName.toString(), actualRequest.getResourceName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getAdGroupAudienceViewExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAdGroupAudienceViewService.addException(exception);

    try {
      AdGroupAudienceViewName resourceName =
          AdGroupAudienceViewName.of("[CUSTOMER_ID]", "[AD_GROUP_ID]", "[CRITERION_ID]");
      client.getAdGroupAudienceView(resourceName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getAdGroupAudienceViewTest2() throws Exception {
    AdGroupAudienceView expectedResponse =
        AdGroupAudienceView.newBuilder()
            .setResourceName(
                AdGroupAudienceViewName.of("[CUSTOMER_ID]", "[AD_GROUP_ID]", "[CRITERION_ID]")
                    .toString())
            .build();
    mockAdGroupAudienceViewService.addResponse(expectedResponse);

    String resourceName = "resourceName-384566343";

    AdGroupAudienceView actualResponse = client.getAdGroupAudienceView(resourceName);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockAdGroupAudienceViewService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetAdGroupAudienceViewRequest actualRequest =
        ((GetAdGroupAudienceViewRequest) actualRequests.get(0));

    Assert.assertEquals(resourceName, actualRequest.getResourceName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getAdGroupAudienceViewExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAdGroupAudienceViewService.addException(exception);

    try {
      String resourceName = "resourceName-384566343";
      client.getAdGroupAudienceView(resourceName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }
}
