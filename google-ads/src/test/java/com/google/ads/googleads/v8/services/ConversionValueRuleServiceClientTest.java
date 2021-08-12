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

import com.google.ads.googleads.v8.resources.ConversionValueRule;
import com.google.ads.googleads.v8.resources.ConversionValueRuleName;
import com.google.ads.googleads.v8.resources.CustomerName;
import com.google.api.gax.core.NoCredentialsProvider;
import com.google.api.gax.grpc.GaxGrpcProperties;
import com.google.api.gax.grpc.testing.LocalChannelProvider;
import com.google.api.gax.grpc.testing.MockGrpcService;
import com.google.api.gax.grpc.testing.MockServiceHelper;
import com.google.api.gax.rpc.ApiClientHeaderProvider;
import com.google.api.gax.rpc.InvalidArgumentException;
import com.google.protobuf.AbstractMessage;
import com.google.rpc.Status;
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
public class ConversionValueRuleServiceClientTest {
  private static MockConversionValueRuleService mockConversionValueRuleService;
  private static MockServiceHelper mockServiceHelper;
  private LocalChannelProvider channelProvider;
  private ConversionValueRuleServiceClient client;

  @BeforeClass
  public static void startStaticServer() {
    mockConversionValueRuleService = new MockConversionValueRuleService();
    mockServiceHelper =
        new MockServiceHelper(
            UUID.randomUUID().toString(),
            Arrays.<MockGrpcService>asList(mockConversionValueRuleService));
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
    ConversionValueRuleServiceSettings settings =
        ConversionValueRuleServiceSettings.newBuilder()
            .setTransportChannelProvider(channelProvider)
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = ConversionValueRuleServiceClient.create(settings);
  }

  @After
  public void tearDown() throws Exception {
    client.close();
  }

  @Test
  public void getConversionValueRuleTest() throws Exception {
    ConversionValueRule expectedResponse =
        ConversionValueRule.newBuilder()
            .setResourceName(
                ConversionValueRuleName.of("[CUSTOMER_ID]", "[CONVERSION_VALUE_RULE_ID]")
                    .toString())
            .setId(3355)
            .setAction(ConversionValueRule.ValueRuleAction.newBuilder().build())
            .setGeoLocationCondition(
                ConversionValueRule.ValueRuleGeoLocationCondition.newBuilder().build())
            .setDeviceCondition(ConversionValueRule.ValueRuleDeviceCondition.newBuilder().build())
            .setAudienceCondition(
                ConversionValueRule.ValueRuleAudienceCondition.newBuilder().build())
            .setOwnerCustomer(CustomerName.of("[CUSTOMER_ID]").toString())
            .build();
    mockConversionValueRuleService.addResponse(expectedResponse);

    ConversionValueRuleName resourceName =
        ConversionValueRuleName.of("[CUSTOMER_ID]", "[CONVERSION_VALUE_RULE_ID]");

    ConversionValueRule actualResponse = client.getConversionValueRule(resourceName);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockConversionValueRuleService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetConversionValueRuleRequest actualRequest =
        ((GetConversionValueRuleRequest) actualRequests.get(0));

    Assert.assertEquals(resourceName.toString(), actualRequest.getResourceName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getConversionValueRuleExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockConversionValueRuleService.addException(exception);

    try {
      ConversionValueRuleName resourceName =
          ConversionValueRuleName.of("[CUSTOMER_ID]", "[CONVERSION_VALUE_RULE_ID]");
      client.getConversionValueRule(resourceName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getConversionValueRuleTest2() throws Exception {
    ConversionValueRule expectedResponse =
        ConversionValueRule.newBuilder()
            .setResourceName(
                ConversionValueRuleName.of("[CUSTOMER_ID]", "[CONVERSION_VALUE_RULE_ID]")
                    .toString())
            .setId(3355)
            .setAction(ConversionValueRule.ValueRuleAction.newBuilder().build())
            .setGeoLocationCondition(
                ConversionValueRule.ValueRuleGeoLocationCondition.newBuilder().build())
            .setDeviceCondition(ConversionValueRule.ValueRuleDeviceCondition.newBuilder().build())
            .setAudienceCondition(
                ConversionValueRule.ValueRuleAudienceCondition.newBuilder().build())
            .setOwnerCustomer(CustomerName.of("[CUSTOMER_ID]").toString())
            .build();
    mockConversionValueRuleService.addResponse(expectedResponse);

    String resourceName = "resourceName-384566343";

    ConversionValueRule actualResponse = client.getConversionValueRule(resourceName);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockConversionValueRuleService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetConversionValueRuleRequest actualRequest =
        ((GetConversionValueRuleRequest) actualRequests.get(0));

    Assert.assertEquals(resourceName, actualRequest.getResourceName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getConversionValueRuleExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockConversionValueRuleService.addException(exception);

    try {
      String resourceName = "resourceName-384566343";
      client.getConversionValueRule(resourceName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void mutateConversionValueRulesTest() throws Exception {
    MutateConversionValueRulesResponse expectedResponse =
        MutateConversionValueRulesResponse.newBuilder()
            .addAllResults(new ArrayList<MutateConversionValueRuleResult>())
            .setPartialFailureError(Status.newBuilder().build())
            .build();
    mockConversionValueRuleService.addResponse(expectedResponse);

    String customerId = "customerId-1581184615";
    List<ConversionValueRuleOperation> operations = new ArrayList<>();

    MutateConversionValueRulesResponse actualResponse =
        client.mutateConversionValueRules(customerId, operations);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockConversionValueRuleService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    MutateConversionValueRulesRequest actualRequest =
        ((MutateConversionValueRulesRequest) actualRequests.get(0));

    Assert.assertEquals(customerId, actualRequest.getCustomerId());
    Assert.assertEquals(operations, actualRequest.getOperationsList());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void mutateConversionValueRulesExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockConversionValueRuleService.addException(exception);

    try {
      String customerId = "customerId-1581184615";
      List<ConversionValueRuleOperation> operations = new ArrayList<>();
      client.mutateConversionValueRules(customerId, operations);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }
}
