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

import com.google.ads.googleads.v8.resources.DynamicSearchAdsSearchTermView;
import com.google.ads.googleads.v8.resources.DynamicSearchAdsSearchTermViewName;
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
public class DynamicSearchAdsSearchTermViewServiceClientTest {
  private static MockDynamicSearchAdsSearchTermViewService
      mockDynamicSearchAdsSearchTermViewService;
  private static MockServiceHelper mockServiceHelper;
  private LocalChannelProvider channelProvider;
  private DynamicSearchAdsSearchTermViewServiceClient client;

  @BeforeClass
  public static void startStaticServer() {
    mockDynamicSearchAdsSearchTermViewService = new MockDynamicSearchAdsSearchTermViewService();
    mockServiceHelper =
        new MockServiceHelper(
            UUID.randomUUID().toString(),
            Arrays.<MockGrpcService>asList(mockDynamicSearchAdsSearchTermViewService));
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
    DynamicSearchAdsSearchTermViewServiceSettings settings =
        DynamicSearchAdsSearchTermViewServiceSettings.newBuilder()
            .setTransportChannelProvider(channelProvider)
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = DynamicSearchAdsSearchTermViewServiceClient.create(settings);
  }

  @After
  public void tearDown() throws Exception {
    client.close();
  }

  @Test
  public void getDynamicSearchAdsSearchTermViewTest() throws Exception {
    DynamicSearchAdsSearchTermView expectedResponse =
        DynamicSearchAdsSearchTermView.newBuilder()
            .setResourceName(
                DynamicSearchAdsSearchTermViewName.of(
                        "[CUSTOMER_ID]",
                        "[AD_GROUP_ID]",
                        "[SEARCH_TERM_FINGERPRINT]",
                        "[HEADLINE_FINGERPRINT]",
                        "[LANDING_PAGE_FINGERPRINT]",
                        "[PAGE_URL_FINGERPRINT]")
                    .toString())
            .setSearchTerm("searchTerm-710473164")
            .setHeadline("headline-1115058732")
            .setLandingPage("landingPage497102150")
            .setPageUrl("pageUrl-803558304")
            .setHasNegativeKeyword(true)
            .setHasMatchingKeyword(true)
            .setHasNegativeUrl(true)
            .build();
    mockDynamicSearchAdsSearchTermViewService.addResponse(expectedResponse);

    DynamicSearchAdsSearchTermViewName resourceName =
        DynamicSearchAdsSearchTermViewName.of(
            "[CUSTOMER_ID]",
            "[AD_GROUP_ID]",
            "[SEARCH_TERM_FINGERPRINT]",
            "[HEADLINE_FINGERPRINT]",
            "[LANDING_PAGE_FINGERPRINT]",
            "[PAGE_URL_FINGERPRINT]");

    DynamicSearchAdsSearchTermView actualResponse =
        client.getDynamicSearchAdsSearchTermView(resourceName);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockDynamicSearchAdsSearchTermViewService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetDynamicSearchAdsSearchTermViewRequest actualRequest =
        ((GetDynamicSearchAdsSearchTermViewRequest) actualRequests.get(0));

    Assert.assertEquals(resourceName.toString(), actualRequest.getResourceName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getDynamicSearchAdsSearchTermViewExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockDynamicSearchAdsSearchTermViewService.addException(exception);

    try {
      DynamicSearchAdsSearchTermViewName resourceName =
          DynamicSearchAdsSearchTermViewName.of(
              "[CUSTOMER_ID]",
              "[AD_GROUP_ID]",
              "[SEARCH_TERM_FINGERPRINT]",
              "[HEADLINE_FINGERPRINT]",
              "[LANDING_PAGE_FINGERPRINT]",
              "[PAGE_URL_FINGERPRINT]");
      client.getDynamicSearchAdsSearchTermView(resourceName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getDynamicSearchAdsSearchTermViewTest2() throws Exception {
    DynamicSearchAdsSearchTermView expectedResponse =
        DynamicSearchAdsSearchTermView.newBuilder()
            .setResourceName(
                DynamicSearchAdsSearchTermViewName.of(
                        "[CUSTOMER_ID]",
                        "[AD_GROUP_ID]",
                        "[SEARCH_TERM_FINGERPRINT]",
                        "[HEADLINE_FINGERPRINT]",
                        "[LANDING_PAGE_FINGERPRINT]",
                        "[PAGE_URL_FINGERPRINT]")
                    .toString())
            .setSearchTerm("searchTerm-710473164")
            .setHeadline("headline-1115058732")
            .setLandingPage("landingPage497102150")
            .setPageUrl("pageUrl-803558304")
            .setHasNegativeKeyword(true)
            .setHasMatchingKeyword(true)
            .setHasNegativeUrl(true)
            .build();
    mockDynamicSearchAdsSearchTermViewService.addResponse(expectedResponse);

    String resourceName = "resourceName-384566343";

    DynamicSearchAdsSearchTermView actualResponse =
        client.getDynamicSearchAdsSearchTermView(resourceName);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockDynamicSearchAdsSearchTermViewService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetDynamicSearchAdsSearchTermViewRequest actualRequest =
        ((GetDynamicSearchAdsSearchTermViewRequest) actualRequests.get(0));

    Assert.assertEquals(resourceName, actualRequest.getResourceName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getDynamicSearchAdsSearchTermViewExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockDynamicSearchAdsSearchTermViewService.addException(exception);

    try {
      String resourceName = "resourceName-384566343";
      client.getDynamicSearchAdsSearchTermView(resourceName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }
}
