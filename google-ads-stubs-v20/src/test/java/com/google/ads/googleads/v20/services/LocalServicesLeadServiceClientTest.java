/*
 * Copyright 2025 Google LLC
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

package com.google.ads.googleads.v20.services;

import com.google.ads.googleads.v20.resources.LocalServicesLeadName;
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
public class LocalServicesLeadServiceClientTest {
  private static MockLocalServicesLeadService mockLocalServicesLeadService;
  private static MockServiceHelper mockServiceHelper;
  private LocalChannelProvider channelProvider;
  private LocalServicesLeadServiceClient client;

  @BeforeClass
  public static void startStaticServer() {
    mockLocalServicesLeadService = new MockLocalServicesLeadService();
    mockServiceHelper =
        new MockServiceHelper(
            UUID.randomUUID().toString(),
            Arrays.<MockGrpcService>asList(mockLocalServicesLeadService));
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
    LocalServicesLeadServiceSettings settings =
        LocalServicesLeadServiceSettings.newBuilder()
            .setTransportChannelProvider(channelProvider)
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = LocalServicesLeadServiceClient.create(settings);
  }

  @After
  public void tearDown() throws Exception {
    client.close();
  }

  @Test
  public void appendLeadConversationTest() throws Exception {
    AppendLeadConversationResponse expectedResponse =
        AppendLeadConversationResponse.newBuilder()
            .addAllResponses(new ArrayList<ConversationOrError>())
            .build();
    mockLocalServicesLeadService.addResponse(expectedResponse);

    String customerId = "customerId-1581184615";
    List<Conversation> conversations = new ArrayList<>();

    AppendLeadConversationResponse actualResponse =
        client.appendLeadConversation(customerId, conversations);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockLocalServicesLeadService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    AppendLeadConversationRequest actualRequest =
        ((AppendLeadConversationRequest) actualRequests.get(0));

    Assert.assertEquals(customerId, actualRequest.getCustomerId());
    Assert.assertEquals(conversations, actualRequest.getConversationsList());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void appendLeadConversationExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockLocalServicesLeadService.addException(exception);

    try {
      String customerId = "customerId-1581184615";
      List<Conversation> conversations = new ArrayList<>();
      client.appendLeadConversation(customerId, conversations);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void provideLeadFeedbackTest() throws Exception {
    ProvideLeadFeedbackResponse expectedResponse = ProvideLeadFeedbackResponse.newBuilder().build();
    mockLocalServicesLeadService.addResponse(expectedResponse);

    ProvideLeadFeedbackRequest request =
        ProvideLeadFeedbackRequest.newBuilder()
            .setResourceName(
                LocalServicesLeadName.of("[CUSTOMER_ID]", "[LOCAL_SERVICES_LEAD_ID]").toString())
            .build();

    ProvideLeadFeedbackResponse actualResponse = client.provideLeadFeedback(request);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockLocalServicesLeadService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ProvideLeadFeedbackRequest actualRequest = ((ProvideLeadFeedbackRequest) actualRequests.get(0));

    Assert.assertEquals(request.getResourceName(), actualRequest.getResourceName());
    Assert.assertEquals(request.getSurveyAnswer(), actualRequest.getSurveyAnswer());
    Assert.assertEquals(request.getSurveySatisfied(), actualRequest.getSurveySatisfied());
    Assert.assertEquals(request.getSurveyDissatisfied(), actualRequest.getSurveyDissatisfied());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void provideLeadFeedbackExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockLocalServicesLeadService.addException(exception);

    try {
      ProvideLeadFeedbackRequest request =
          ProvideLeadFeedbackRequest.newBuilder()
              .setResourceName(
                  LocalServicesLeadName.of("[CUSTOMER_ID]", "[LOCAL_SERVICES_LEAD_ID]").toString())
              .build();
      client.provideLeadFeedback(request);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }
}
