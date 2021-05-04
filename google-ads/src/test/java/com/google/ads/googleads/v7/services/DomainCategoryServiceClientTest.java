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

package com.google.ads.googleads.v7.services;

import com.google.ads.googleads.v7.resources.DomainCategory;
import com.google.ads.googleads.v7.resources.DomainCategoryName;
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
public class DomainCategoryServiceClientTest {
  private static MockServiceHelper mockServiceHelper;
  private DomainCategoryServiceClient client;
  private static MockDomainCategoryService mockDomainCategoryService;
  private LocalChannelProvider channelProvider;

  @BeforeClass
  public static void startStaticServer() {
    mockDomainCategoryService = new MockDomainCategoryService();
    mockServiceHelper =
        new MockServiceHelper(
            UUID.randomUUID().toString(),
            Arrays.<MockGrpcService>asList(mockDomainCategoryService));
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
    DomainCategoryServiceSettings settings =
        DomainCategoryServiceSettings.newBuilder()
            .setTransportChannelProvider(channelProvider)
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = DomainCategoryServiceClient.create(settings);
  }

  @After
  public void tearDown() throws Exception {
    client.close();
  }

  @Test
  public void getDomainCategoryTest() throws Exception {
    DomainCategory expectedResponse =
        DomainCategory.newBuilder()
            .setResourceName(
                DomainCategoryName.of(
                        "[CUSTOMER_ID]", "[CAMPAIGN_ID]", "[BASE64_CATEGORY]", "[LANGUAGE_CODE]")
                    .toString())
            .build();
    mockDomainCategoryService.addResponse(expectedResponse);

    DomainCategoryName resourceName =
        DomainCategoryName.of(
            "[CUSTOMER_ID]", "[CAMPAIGN_ID]", "[BASE64_CATEGORY]", "[LANGUAGE_CODE]");

    DomainCategory actualResponse = client.getDomainCategory(resourceName);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockDomainCategoryService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetDomainCategoryRequest actualRequest = ((GetDomainCategoryRequest) actualRequests.get(0));

    Assert.assertEquals(resourceName.toString(), actualRequest.getResourceName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getDomainCategoryExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockDomainCategoryService.addException(exception);

    try {
      DomainCategoryName resourceName =
          DomainCategoryName.of(
              "[CUSTOMER_ID]", "[CAMPAIGN_ID]", "[BASE64_CATEGORY]", "[LANGUAGE_CODE]");
      client.getDomainCategory(resourceName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getDomainCategoryTest2() throws Exception {
    DomainCategory expectedResponse =
        DomainCategory.newBuilder()
            .setResourceName(
                DomainCategoryName.of(
                        "[CUSTOMER_ID]", "[CAMPAIGN_ID]", "[BASE64_CATEGORY]", "[LANGUAGE_CODE]")
                    .toString())
            .build();
    mockDomainCategoryService.addResponse(expectedResponse);

    String resourceName = "resourceName-384566343";

    DomainCategory actualResponse = client.getDomainCategory(resourceName);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockDomainCategoryService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetDomainCategoryRequest actualRequest = ((GetDomainCategoryRequest) actualRequests.get(0));

    Assert.assertEquals(resourceName, actualRequest.getResourceName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getDomainCategoryExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockDomainCategoryService.addException(exception);

    try {
      String resourceName = "resourceName-384566343";
      client.getDomainCategory(resourceName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }
}
