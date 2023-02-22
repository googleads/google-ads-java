/*
 * Copyright 2022 Google LLC
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

package com.google.ads.googleads.v13.services;

import com.google.ads.googleads.v13.resources.ThirdPartyAppAnalyticsLinkName;
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
public class ThirdPartyAppAnalyticsLinkServiceClientTest {
  private static MockServiceHelper mockServiceHelper;
  private static MockThirdPartyAppAnalyticsLinkService mockThirdPartyAppAnalyticsLinkService;
  private LocalChannelProvider channelProvider;
  private ThirdPartyAppAnalyticsLinkServiceClient client;

  @BeforeClass
  public static void startStaticServer() {
    mockThirdPartyAppAnalyticsLinkService = new MockThirdPartyAppAnalyticsLinkService();
    mockServiceHelper =
        new MockServiceHelper(
            UUID.randomUUID().toString(),
            Arrays.<MockGrpcService>asList(mockThirdPartyAppAnalyticsLinkService));
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
    ThirdPartyAppAnalyticsLinkServiceSettings settings =
        ThirdPartyAppAnalyticsLinkServiceSettings.newBuilder()
            .setTransportChannelProvider(channelProvider)
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = ThirdPartyAppAnalyticsLinkServiceClient.create(settings);
  }

  @After
  public void tearDown() throws Exception {
    client.close();
  }

  @Test
  public void regenerateShareableLinkIdTest() throws Exception {
    RegenerateShareableLinkIdResponse expectedResponse =
        RegenerateShareableLinkIdResponse.newBuilder().build();
    mockThirdPartyAppAnalyticsLinkService.addResponse(expectedResponse);

    RegenerateShareableLinkIdRequest request =
        RegenerateShareableLinkIdRequest.newBuilder()
            .setResourceName(
                ThirdPartyAppAnalyticsLinkName.of("[CUSTOMER_ID]", "[CUSTOMER_LINK_ID]").toString())
            .build();

    RegenerateShareableLinkIdResponse actualResponse = client.regenerateShareableLinkId(request);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockThirdPartyAppAnalyticsLinkService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    RegenerateShareableLinkIdRequest actualRequest =
        ((RegenerateShareableLinkIdRequest) actualRequests.get(0));

    Assert.assertEquals(request.getResourceName(), actualRequest.getResourceName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void regenerateShareableLinkIdExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockThirdPartyAppAnalyticsLinkService.addException(exception);

    try {
      RegenerateShareableLinkIdRequest request =
          RegenerateShareableLinkIdRequest.newBuilder()
              .setResourceName(
                  ThirdPartyAppAnalyticsLinkName.of("[CUSTOMER_ID]", "[CUSTOMER_LINK_ID]")
                      .toString())
              .build();
      client.regenerateShareableLinkId(request);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }
}
