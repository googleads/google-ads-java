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

import com.google.ads.googleads.v8.resources.CombinedAudience;
import com.google.ads.googleads.v8.resources.CombinedAudienceName;
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
public class CombinedAudienceServiceClientTest {
  private static MockCombinedAudienceService mockCombinedAudienceService;
  private static MockServiceHelper mockServiceHelper;
  private LocalChannelProvider channelProvider;
  private CombinedAudienceServiceClient client;

  @BeforeClass
  public static void startStaticServer() {
    mockCombinedAudienceService = new MockCombinedAudienceService();
    mockServiceHelper =
        new MockServiceHelper(
            UUID.randomUUID().toString(),
            Arrays.<MockGrpcService>asList(mockCombinedAudienceService));
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
    CombinedAudienceServiceSettings settings =
        CombinedAudienceServiceSettings.newBuilder()
            .setTransportChannelProvider(channelProvider)
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = CombinedAudienceServiceClient.create(settings);
  }

  @After
  public void tearDown() throws Exception {
    client.close();
  }

  @Test
  public void getCombinedAudienceTest() throws Exception {
    CombinedAudience expectedResponse =
        CombinedAudience.newBuilder()
            .setResourceName(
                CombinedAudienceName.of("[CUSTOMER_ID]", "[COMBINED_AUDIENCE_ID]").toString())
            .setId(3355)
            .setName(CombinedAudienceName.of("[CUSTOMER_ID]", "[COMBINED_AUDIENCE_ID]").toString())
            .setDescription("description-1724546052")
            .build();
    mockCombinedAudienceService.addResponse(expectedResponse);

    CombinedAudienceName resourceName =
        CombinedAudienceName.of("[CUSTOMER_ID]", "[COMBINED_AUDIENCE_ID]");

    CombinedAudience actualResponse = client.getCombinedAudience(resourceName);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockCombinedAudienceService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetCombinedAudienceRequest actualRequest = ((GetCombinedAudienceRequest) actualRequests.get(0));

    Assert.assertEquals(resourceName.toString(), actualRequest.getResourceName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getCombinedAudienceExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockCombinedAudienceService.addException(exception);

    try {
      CombinedAudienceName resourceName =
          CombinedAudienceName.of("[CUSTOMER_ID]", "[COMBINED_AUDIENCE_ID]");
      client.getCombinedAudience(resourceName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getCombinedAudienceTest2() throws Exception {
    CombinedAudience expectedResponse =
        CombinedAudience.newBuilder()
            .setResourceName(
                CombinedAudienceName.of("[CUSTOMER_ID]", "[COMBINED_AUDIENCE_ID]").toString())
            .setId(3355)
            .setName(CombinedAudienceName.of("[CUSTOMER_ID]", "[COMBINED_AUDIENCE_ID]").toString())
            .setDescription("description-1724546052")
            .build();
    mockCombinedAudienceService.addResponse(expectedResponse);

    String resourceName = "resourceName-384566343";

    CombinedAudience actualResponse = client.getCombinedAudience(resourceName);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockCombinedAudienceService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetCombinedAudienceRequest actualRequest = ((GetCombinedAudienceRequest) actualRequests.get(0));

    Assert.assertEquals(resourceName, actualRequest.getResourceName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getCombinedAudienceExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockCombinedAudienceService.addException(exception);

    try {
      String resourceName = "resourceName-384566343";
      client.getCombinedAudience(resourceName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }
}
