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

import com.google.ads.googleads.v6.resources.CustomAudience;
import com.google.ads.googleads.v6.resources.CustomAudienceMember;
import com.google.ads.googleads.v6.resources.CustomAudienceName;
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
public class CustomAudienceServiceClientTest {
  private static MockServiceHelper mockServiceHelper;
  private CustomAudienceServiceClient client;
  private static MockCustomAudienceService mockCustomAudienceService;
  private LocalChannelProvider channelProvider;

  @BeforeClass
  public static void startStaticServer() {
    mockCustomAudienceService = new MockCustomAudienceService();
    mockServiceHelper =
        new MockServiceHelper(
            UUID.randomUUID().toString(),
            Arrays.<MockGrpcService>asList(mockCustomAudienceService));
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
    CustomAudienceServiceSettings settings =
        CustomAudienceServiceSettings.newBuilder()
            .setTransportChannelProvider(channelProvider)
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = CustomAudienceServiceClient.create(settings);
  }

  @After
  public void tearDown() throws Exception {
    client.close();
  }

  @Test
  public void getCustomAudienceTest() throws Exception {
    CustomAudience expectedResponse =
        CustomAudience.newBuilder()
            .setResourceName(
                CustomAudienceName.of("[CUSTOMER_ID]", "[CUSTOM_AUDIENCE_ID]").toString())
            .setId(3355)
            .setName(CustomAudienceName.of("[CUSTOMER_ID]", "[CUSTOM_AUDIENCE_ID]").toString())
            .setDescription("description-1724546052")
            .addAllMembers(new ArrayList<CustomAudienceMember>())
            .build();
    mockCustomAudienceService.addResponse(expectedResponse);

    CustomAudienceName resourceName =
        CustomAudienceName.of("[CUSTOMER_ID]", "[CUSTOM_AUDIENCE_ID]");

    CustomAudience actualResponse = client.getCustomAudience(resourceName);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockCustomAudienceService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetCustomAudienceRequest actualRequest = ((GetCustomAudienceRequest) actualRequests.get(0));

    Assert.assertEquals(resourceName.toString(), actualRequest.getResourceName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getCustomAudienceExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockCustomAudienceService.addException(exception);

    try {
      CustomAudienceName resourceName =
          CustomAudienceName.of("[CUSTOMER_ID]", "[CUSTOM_AUDIENCE_ID]");
      client.getCustomAudience(resourceName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getCustomAudienceTest2() throws Exception {
    CustomAudience expectedResponse =
        CustomAudience.newBuilder()
            .setResourceName(
                CustomAudienceName.of("[CUSTOMER_ID]", "[CUSTOM_AUDIENCE_ID]").toString())
            .setId(3355)
            .setName(CustomAudienceName.of("[CUSTOMER_ID]", "[CUSTOM_AUDIENCE_ID]").toString())
            .setDescription("description-1724546052")
            .addAllMembers(new ArrayList<CustomAudienceMember>())
            .build();
    mockCustomAudienceService.addResponse(expectedResponse);

    String resourceName = "resourceName-384566343";

    CustomAudience actualResponse = client.getCustomAudience(resourceName);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockCustomAudienceService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetCustomAudienceRequest actualRequest = ((GetCustomAudienceRequest) actualRequests.get(0));

    Assert.assertEquals(resourceName, actualRequest.getResourceName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getCustomAudienceExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockCustomAudienceService.addException(exception);

    try {
      String resourceName = "resourceName-384566343";
      client.getCustomAudience(resourceName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void mutateCustomAudiencesTest() throws Exception {
    MutateCustomAudiencesResponse expectedResponse =
        MutateCustomAudiencesResponse.newBuilder()
            .addAllResults(new ArrayList<MutateCustomAudienceResult>())
            .build();
    mockCustomAudienceService.addResponse(expectedResponse);

    String customerId = "customerId-1581184615";
    List<CustomAudienceOperation> operations = new ArrayList<>();

    MutateCustomAudiencesResponse actualResponse =
        client.mutateCustomAudiences(customerId, operations);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockCustomAudienceService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    MutateCustomAudiencesRequest actualRequest =
        ((MutateCustomAudiencesRequest) actualRequests.get(0));

    Assert.assertEquals(customerId, actualRequest.getCustomerId());
    Assert.assertEquals(operations, actualRequest.getOperationsList());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void mutateCustomAudiencesExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockCustomAudienceService.addException(exception);

    try {
      String customerId = "customerId-1581184615";
      List<CustomAudienceOperation> operations = new ArrayList<>();
      client.mutateCustomAudiences(customerId, operations);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }
}
