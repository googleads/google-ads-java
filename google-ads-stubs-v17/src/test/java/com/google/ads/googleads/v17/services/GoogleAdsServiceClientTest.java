/*
 * Copyright 2024 Google LLC
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

package com.google.ads.googleads.v17.services;

import static com.google.ads.googleads.v17.services.GoogleAdsServiceClient.SearchPagedResponse;

import com.google.api.gax.core.NoCredentialsProvider;
import com.google.api.gax.grpc.GaxGrpcProperties;
import com.google.api.gax.grpc.testing.LocalChannelProvider;
import com.google.api.gax.grpc.testing.MockGrpcService;
import com.google.api.gax.grpc.testing.MockServiceHelper;
import com.google.api.gax.grpc.testing.MockStreamObserver;
import com.google.api.gax.rpc.ApiClientHeaderProvider;
import com.google.api.gax.rpc.InvalidArgumentException;
import com.google.api.gax.rpc.ServerStreamingCallable;
import com.google.api.gax.rpc.StatusCode;
import com.google.common.collect.Lists;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.FieldMask;
import com.google.rpc.Status;
import io.grpc.StatusRuntimeException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import javax.annotation.Generated;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

@Generated("by gapic-generator-java")
public class GoogleAdsServiceClientTest {
  private static MockGoogleAdsService mockGoogleAdsService;
  private static MockServiceHelper mockServiceHelper;
  private LocalChannelProvider channelProvider;
  private GoogleAdsServiceClient client;

  @BeforeClass
  public static void startStaticServer() {
    mockGoogleAdsService = new MockGoogleAdsService();
    mockServiceHelper =
        new MockServiceHelper(
            UUID.randomUUID().toString(), Arrays.<MockGrpcService>asList(mockGoogleAdsService));
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
    GoogleAdsServiceSettings settings =
        GoogleAdsServiceSettings.newBuilder()
            .setTransportChannelProvider(channelProvider)
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = GoogleAdsServiceClient.create(settings);
  }

  @After
  public void tearDown() throws Exception {
    client.close();
  }

  @Test
  public void searchTest() throws Exception {
    GoogleAdsRow responsesElement = GoogleAdsRow.newBuilder().build();
    SearchGoogleAdsResponse expectedResponse =
        SearchGoogleAdsResponse.newBuilder()
            .setNextPageToken("")
            .addAllResults(Arrays.asList(responsesElement))
            .build();
    mockGoogleAdsService.addResponse(expectedResponse);

    String customerId = "customerId-1581184615";
    String query = "query107944136";

    SearchPagedResponse pagedListResponse = client.search(customerId, query);

    List<GoogleAdsRow> resources = Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getResultsList().get(0), resources.get(0));

    List<AbstractMessage> actualRequests = mockGoogleAdsService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    SearchGoogleAdsRequest actualRequest = ((SearchGoogleAdsRequest) actualRequests.get(0));

    Assert.assertEquals(customerId, actualRequest.getCustomerId());
    Assert.assertEquals(query, actualRequest.getQuery());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void searchExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockGoogleAdsService.addException(exception);

    try {
      String customerId = "customerId-1581184615";
      String query = "query107944136";
      client.search(customerId, query);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void searchStreamTest() throws Exception {
    SearchGoogleAdsStreamResponse expectedResponse =
        SearchGoogleAdsStreamResponse.newBuilder()
            .addAllResults(new ArrayList<GoogleAdsRow>())
            .setFieldMask(FieldMask.newBuilder().build())
            .setSummaryRow(GoogleAdsRow.newBuilder().build())
            .setRequestId("requestId693933066")
            .setQueryResourceConsumption(-1151647743)
            .build();
    mockGoogleAdsService.addResponse(expectedResponse);
    SearchGoogleAdsStreamRequest request =
        SearchGoogleAdsStreamRequest.newBuilder()
            .setCustomerId("customerId-1581184615")
            .setQuery("query107944136")
            .build();

    MockStreamObserver<SearchGoogleAdsStreamResponse> responseObserver = new MockStreamObserver<>();

    ServerStreamingCallable<SearchGoogleAdsStreamRequest, SearchGoogleAdsStreamResponse> callable =
        client.searchStreamCallable();
    callable.serverStreamingCall(request, responseObserver);

    List<SearchGoogleAdsStreamResponse> actualResponses = responseObserver.future().get();
    Assert.assertEquals(1, actualResponses.size());
    Assert.assertEquals(expectedResponse, actualResponses.get(0));
  }

  @Test
  public void searchStreamExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockGoogleAdsService.addException(exception);
    SearchGoogleAdsStreamRequest request =
        SearchGoogleAdsStreamRequest.newBuilder()
            .setCustomerId("customerId-1581184615")
            .setQuery("query107944136")
            .build();

    MockStreamObserver<SearchGoogleAdsStreamResponse> responseObserver = new MockStreamObserver<>();

    ServerStreamingCallable<SearchGoogleAdsStreamRequest, SearchGoogleAdsStreamResponse> callable =
        client.searchStreamCallable();
    callable.serverStreamingCall(request, responseObserver);

    try {
      List<SearchGoogleAdsStreamResponse> actualResponses = responseObserver.future().get();
      Assert.fail("No exception thrown");
    } catch (ExecutionException e) {
      Assert.assertTrue(e.getCause() instanceof InvalidArgumentException);
      InvalidArgumentException apiException = ((InvalidArgumentException) e.getCause());
      Assert.assertEquals(StatusCode.Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  public void mutateTest() throws Exception {
    MutateGoogleAdsResponse expectedResponse =
        MutateGoogleAdsResponse.newBuilder()
            .setPartialFailureError(Status.newBuilder().build())
            .addAllMutateOperationResponses(new ArrayList<MutateOperationResponse>())
            .build();
    mockGoogleAdsService.addResponse(expectedResponse);

    String customerId = "customerId-1581184615";
    List<MutateOperation> mutateOperations = new ArrayList<>();

    MutateGoogleAdsResponse actualResponse = client.mutate(customerId, mutateOperations);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockGoogleAdsService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    MutateGoogleAdsRequest actualRequest = ((MutateGoogleAdsRequest) actualRequests.get(0));

    Assert.assertEquals(customerId, actualRequest.getCustomerId());
    Assert.assertEquals(mutateOperations, actualRequest.getMutateOperationsList());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void mutateExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockGoogleAdsService.addException(exception);

    try {
      String customerId = "customerId-1581184615";
      List<MutateOperation> mutateOperations = new ArrayList<>();
      client.mutate(customerId, mutateOperations);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }
}
