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

import com.google.ads.googleads.v8.resources.CampaignName;
import com.google.ads.googleads.v8.resources.SmartCampaignSearchTermView;
import com.google.ads.googleads.v8.resources.SmartCampaignSearchTermViewName;
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
public class SmartCampaignSearchTermViewServiceClientTest {
  private static MockServiceHelper mockServiceHelper;
  private static MockSmartCampaignSearchTermViewService mockSmartCampaignSearchTermViewService;
  private LocalChannelProvider channelProvider;
  private SmartCampaignSearchTermViewServiceClient client;

  @BeforeClass
  public static void startStaticServer() {
    mockSmartCampaignSearchTermViewService = new MockSmartCampaignSearchTermViewService();
    mockServiceHelper =
        new MockServiceHelper(
            UUID.randomUUID().toString(),
            Arrays.<MockGrpcService>asList(mockSmartCampaignSearchTermViewService));
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
    SmartCampaignSearchTermViewServiceSettings settings =
        SmartCampaignSearchTermViewServiceSettings.newBuilder()
            .setTransportChannelProvider(channelProvider)
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = SmartCampaignSearchTermViewServiceClient.create(settings);
  }

  @After
  public void tearDown() throws Exception {
    client.close();
  }

  @Test
  public void getSmartCampaignSearchTermViewTest() throws Exception {
    SmartCampaignSearchTermView expectedResponse =
        SmartCampaignSearchTermView.newBuilder()
            .setResourceName(
                SmartCampaignSearchTermViewName.of("[CUSTOMER_ID]", "[CAMPAIGN_ID]", "[QUERY]")
                    .toString())
            .setSearchTerm("searchTerm-710473164")
            .setCampaign(CampaignName.of("[CUSTOMER_ID]", "[CAMPAIGN_ID]").toString())
            .build();
    mockSmartCampaignSearchTermViewService.addResponse(expectedResponse);

    SmartCampaignSearchTermViewName resourceName =
        SmartCampaignSearchTermViewName.of("[CUSTOMER_ID]", "[CAMPAIGN_ID]", "[QUERY]");

    SmartCampaignSearchTermView actualResponse =
        client.getSmartCampaignSearchTermView(resourceName);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockSmartCampaignSearchTermViewService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetSmartCampaignSearchTermViewRequest actualRequest =
        ((GetSmartCampaignSearchTermViewRequest) actualRequests.get(0));

    Assert.assertEquals(resourceName.toString(), actualRequest.getResourceName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getSmartCampaignSearchTermViewExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockSmartCampaignSearchTermViewService.addException(exception);

    try {
      SmartCampaignSearchTermViewName resourceName =
          SmartCampaignSearchTermViewName.of("[CUSTOMER_ID]", "[CAMPAIGN_ID]", "[QUERY]");
      client.getSmartCampaignSearchTermView(resourceName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getSmartCampaignSearchTermViewTest2() throws Exception {
    SmartCampaignSearchTermView expectedResponse =
        SmartCampaignSearchTermView.newBuilder()
            .setResourceName(
                SmartCampaignSearchTermViewName.of("[CUSTOMER_ID]", "[CAMPAIGN_ID]", "[QUERY]")
                    .toString())
            .setSearchTerm("searchTerm-710473164")
            .setCampaign(CampaignName.of("[CUSTOMER_ID]", "[CAMPAIGN_ID]").toString())
            .build();
    mockSmartCampaignSearchTermViewService.addResponse(expectedResponse);

    String resourceName = "resourceName-384566343";

    SmartCampaignSearchTermView actualResponse =
        client.getSmartCampaignSearchTermView(resourceName);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockSmartCampaignSearchTermViewService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetSmartCampaignSearchTermViewRequest actualRequest =
        ((GetSmartCampaignSearchTermViewRequest) actualRequests.get(0));

    Assert.assertEquals(resourceName, actualRequest.getResourceName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getSmartCampaignSearchTermViewExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockSmartCampaignSearchTermViewService.addException(exception);

    try {
      String resourceName = "resourceName-384566343";
      client.getSmartCampaignSearchTermView(resourceName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }
}
