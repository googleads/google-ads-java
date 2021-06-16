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

import com.google.ads.googleads.v8.resources.KeywordThemeConstant;
import com.google.ads.googleads.v8.resources.KeywordThemeConstantName;
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
public class KeywordThemeConstantServiceClientTest {
  private static MockKeywordThemeConstantService mockKeywordThemeConstantService;
  private static MockServiceHelper mockServiceHelper;
  private LocalChannelProvider channelProvider;
  private KeywordThemeConstantServiceClient client;

  @BeforeClass
  public static void startStaticServer() {
    mockKeywordThemeConstantService = new MockKeywordThemeConstantService();
    mockServiceHelper =
        new MockServiceHelper(
            UUID.randomUUID().toString(),
            Arrays.<MockGrpcService>asList(mockKeywordThemeConstantService));
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
    KeywordThemeConstantServiceSettings settings =
        KeywordThemeConstantServiceSettings.newBuilder()
            .setTransportChannelProvider(channelProvider)
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = KeywordThemeConstantServiceClient.create(settings);
  }

  @After
  public void tearDown() throws Exception {
    client.close();
  }

  @Test
  public void getKeywordThemeConstantTest() throws Exception {
    KeywordThemeConstant expectedResponse =
        KeywordThemeConstant.newBuilder()
            .setResourceName(
                KeywordThemeConstantName.of("[EXPRESS_CATEGORY_ID]", "[EXPRESS_SUB_CATEGORY_ID]")
                    .toString())
            .setCountryCode("countryCode-1477067101")
            .setLanguageCode("languageCode-2092349083")
            .setDisplayName("displayName1714148973")
            .build();
    mockKeywordThemeConstantService.addResponse(expectedResponse);

    KeywordThemeConstantName resourceName =
        KeywordThemeConstantName.of("[EXPRESS_CATEGORY_ID]", "[EXPRESS_SUB_CATEGORY_ID]");

    KeywordThemeConstant actualResponse = client.getKeywordThemeConstant(resourceName);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockKeywordThemeConstantService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetKeywordThemeConstantRequest actualRequest =
        ((GetKeywordThemeConstantRequest) actualRequests.get(0));

    Assert.assertEquals(resourceName.toString(), actualRequest.getResourceName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getKeywordThemeConstantExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockKeywordThemeConstantService.addException(exception);

    try {
      KeywordThemeConstantName resourceName =
          KeywordThemeConstantName.of("[EXPRESS_CATEGORY_ID]", "[EXPRESS_SUB_CATEGORY_ID]");
      client.getKeywordThemeConstant(resourceName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getKeywordThemeConstantTest2() throws Exception {
    KeywordThemeConstant expectedResponse =
        KeywordThemeConstant.newBuilder()
            .setResourceName(
                KeywordThemeConstantName.of("[EXPRESS_CATEGORY_ID]", "[EXPRESS_SUB_CATEGORY_ID]")
                    .toString())
            .setCountryCode("countryCode-1477067101")
            .setLanguageCode("languageCode-2092349083")
            .setDisplayName("displayName1714148973")
            .build();
    mockKeywordThemeConstantService.addResponse(expectedResponse);

    String resourceName = "resourceName-384566343";

    KeywordThemeConstant actualResponse = client.getKeywordThemeConstant(resourceName);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockKeywordThemeConstantService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetKeywordThemeConstantRequest actualRequest =
        ((GetKeywordThemeConstantRequest) actualRequests.get(0));

    Assert.assertEquals(resourceName, actualRequest.getResourceName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getKeywordThemeConstantExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockKeywordThemeConstantService.addException(exception);

    try {
      String resourceName = "resourceName-384566343";
      client.getKeywordThemeConstant(resourceName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void suggestKeywordThemeConstantsTest() throws Exception {
    SuggestKeywordThemeConstantsResponse expectedResponse =
        SuggestKeywordThemeConstantsResponse.newBuilder()
            .addAllKeywordThemeConstants(new ArrayList<KeywordThemeConstant>())
            .build();
    mockKeywordThemeConstantService.addResponse(expectedResponse);

    SuggestKeywordThemeConstantsRequest request =
        SuggestKeywordThemeConstantsRequest.newBuilder()
            .setQueryText("queryText-1806881259")
            .setCountryCode("countryCode-1477067101")
            .setLanguageCode("languageCode-2092349083")
            .build();

    SuggestKeywordThemeConstantsResponse actualResponse =
        client.suggestKeywordThemeConstants(request);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockKeywordThemeConstantService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    SuggestKeywordThemeConstantsRequest actualRequest =
        ((SuggestKeywordThemeConstantsRequest) actualRequests.get(0));

    Assert.assertEquals(request.getQueryText(), actualRequest.getQueryText());
    Assert.assertEquals(request.getCountryCode(), actualRequest.getCountryCode());
    Assert.assertEquals(request.getLanguageCode(), actualRequest.getLanguageCode());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void suggestKeywordThemeConstantsExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockKeywordThemeConstantService.addException(exception);

    try {
      SuggestKeywordThemeConstantsRequest request =
          SuggestKeywordThemeConstantsRequest.newBuilder()
              .setQueryText("queryText-1806881259")
              .setCountryCode("countryCode-1477067101")
              .setLanguageCode("languageCode-2092349083")
              .build();
      client.suggestKeywordThemeConstants(request);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }
}
