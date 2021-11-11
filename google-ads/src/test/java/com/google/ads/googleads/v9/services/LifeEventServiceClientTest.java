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

import com.google.ads.googleads.v9.common.CriterionCategoryAvailability;
import com.google.ads.googleads.v9.resources.LifeEvent;
import com.google.ads.googleads.v9.resources.LifeEventName;
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
public class LifeEventServiceClientTest {
  private static MockLifeEventService mockLifeEventService;
  private static MockServiceHelper mockServiceHelper;
  private LocalChannelProvider channelProvider;
  private LifeEventServiceClient client;

  @BeforeClass
  public static void startStaticServer() {
    mockLifeEventService = new MockLifeEventService();
    mockServiceHelper =
        new MockServiceHelper(
            UUID.randomUUID().toString(), Arrays.<MockGrpcService>asList(mockLifeEventService));
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
    LifeEventServiceSettings settings =
        LifeEventServiceSettings.newBuilder()
            .setTransportChannelProvider(channelProvider)
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = LifeEventServiceClient.create(settings);
  }

  @After
  public void tearDown() throws Exception {
    client.close();
  }

  @Test
  public void getLifeEventTest() throws Exception {
    LifeEvent expectedResponse =
        LifeEvent.newBuilder()
            .setResourceName(LifeEventName.of("[CUSTOMER_ID]", "[LIFE_EVENT_ID]").toString())
            .setId(3355)
            .setName(LifeEventName.of("[CUSTOMER_ID]", "[LIFE_EVENT_ID]").toString())
            .setParent(LifeEventName.of("[CUSTOMER_ID]", "[LIFE_EVENT_ID]").toString())
            .setLaunchedToAll(true)
            .addAllAvailabilities(new ArrayList<CriterionCategoryAvailability>())
            .build();
    mockLifeEventService.addResponse(expectedResponse);

    LifeEventName resourceName = LifeEventName.of("[CUSTOMER_ID]", "[LIFE_EVENT_ID]");

    LifeEvent actualResponse = client.getLifeEvent(resourceName);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockLifeEventService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetLifeEventRequest actualRequest = ((GetLifeEventRequest) actualRequests.get(0));

    Assert.assertEquals(resourceName.toString(), actualRequest.getResourceName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getLifeEventExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockLifeEventService.addException(exception);

    try {
      LifeEventName resourceName = LifeEventName.of("[CUSTOMER_ID]", "[LIFE_EVENT_ID]");
      client.getLifeEvent(resourceName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getLifeEventTest2() throws Exception {
    LifeEvent expectedResponse =
        LifeEvent.newBuilder()
            .setResourceName(LifeEventName.of("[CUSTOMER_ID]", "[LIFE_EVENT_ID]").toString())
            .setId(3355)
            .setName(LifeEventName.of("[CUSTOMER_ID]", "[LIFE_EVENT_ID]").toString())
            .setParent(LifeEventName.of("[CUSTOMER_ID]", "[LIFE_EVENT_ID]").toString())
            .setLaunchedToAll(true)
            .addAllAvailabilities(new ArrayList<CriterionCategoryAvailability>())
            .build();
    mockLifeEventService.addResponse(expectedResponse);

    String resourceName = "resourceName-384566343";

    LifeEvent actualResponse = client.getLifeEvent(resourceName);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockLifeEventService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetLifeEventRequest actualRequest = ((GetLifeEventRequest) actualRequests.get(0));

    Assert.assertEquals(resourceName, actualRequest.getResourceName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getLifeEventExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockLifeEventService.addException(exception);

    try {
      String resourceName = "resourceName-384566343";
      client.getLifeEvent(resourceName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }
}
