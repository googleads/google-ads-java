/*
 * Copyright 2020 Google LLC
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

package com.google.ads.googleads.v6.services;

import com.google.ads.googleads.v6.resources.KeywordView;
import com.google.ads.googleads.v6.resources.KeywordViewName;
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
public class KeywordViewServiceClientTest {
  private static MockKeywordViewService mockKeywordViewService;
  private static MockServiceHelper mockServiceHelper;
  private KeywordViewServiceClient client;
  private LocalChannelProvider channelProvider;

  @BeforeClass
  public static void startStaticServer() {
    mockKeywordViewService = new MockKeywordViewService();
    mockServiceHelper =
        new MockServiceHelper(
            UUID.randomUUID().toString(), Arrays.<MockGrpcService>asList(mockKeywordViewService));
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
    KeywordViewServiceSettings settings =
        KeywordViewServiceSettings.newBuilder()
            .setTransportChannelProvider(channelProvider)
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = KeywordViewServiceClient.create(settings);
  }

  @After
  public void tearDown() throws Exception {
    client.close();
  }

  @Test
  public void getKeywordViewTest() throws Exception {
    KeywordView expectedResponse =
        KeywordView.newBuilder()
            .setResourceName(
                KeywordViewName.of("[CUSTOMER_ID]", "[AD_GROUP_ID]", "[CRITERION_ID]").toString())
            .build();
    mockKeywordViewService.addResponse(expectedResponse);

    KeywordViewName resourceName =
        KeywordViewName.of("[CUSTOMER_ID]", "[AD_GROUP_ID]", "[CRITERION_ID]");

    KeywordView actualResponse = client.getKeywordView(resourceName);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockKeywordViewService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetKeywordViewRequest actualRequest = ((GetKeywordViewRequest) actualRequests.get(0));

    Assert.assertEquals(resourceName.toString(), actualRequest.getResourceName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getKeywordViewExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockKeywordViewService.addException(exception);

    try {
      KeywordViewName resourceName =
          KeywordViewName.of("[CUSTOMER_ID]", "[AD_GROUP_ID]", "[CRITERION_ID]");
      client.getKeywordView(resourceName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getKeywordViewTest2() throws Exception {
    KeywordView expectedResponse =
        KeywordView.newBuilder()
            .setResourceName(
                KeywordViewName.of("[CUSTOMER_ID]", "[AD_GROUP_ID]", "[CRITERION_ID]").toString())
            .build();
    mockKeywordViewService.addResponse(expectedResponse);

    String resourceName = "resourceName-384566343";

    KeywordView actualResponse = client.getKeywordView(resourceName);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockKeywordViewService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetKeywordViewRequest actualRequest = ((GetKeywordViewRequest) actualRequests.get(0));

    Assert.assertEquals(resourceName, actualRequest.getResourceName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getKeywordViewExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockKeywordViewService.addException(exception);

    try {
      String resourceName = "resourceName-384566343";
      client.getKeywordView(resourceName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }
}
