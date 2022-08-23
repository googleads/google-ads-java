// Copyright 2019 Google LLC
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.ads.googleads.lib.logging;

import static org.mockito.Matchers.any;
import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.google.ads.googleads.lib.catalog.ApiCatalog;
import com.google.ads.googleads.lib.catalog.Version;
import com.google.ads.googleads.lib.logging.Event.Detail;
import com.google.ads.googleads.lib.logging.Event.Summary;
import com.google.ads.googleads.lib.utils.FieldMasks;
import com.google.ads.googleads.v11.resources.CustomerUserAccess;
import com.google.ads.googleads.v11.resources.Feed;
import com.google.ads.googleads.v11.services.CreateCustomerClientRequest;
import com.google.ads.googleads.v11.services.SearchGoogleAdsResponse;
import com.google.ads.googleads.v11.services.SearchGoogleAdsStreamResponse;
import com.google.common.collect.ImmutableMap;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import io.grpc.Channel;
import io.grpc.ClientCall;
import io.grpc.ClientCall.Listener;
import io.grpc.Metadata;
import io.grpc.MethodDescriptor;
import io.grpc.MethodDescriptor.Marshaller;
import io.grpc.MethodDescriptor.MethodType;
import io.grpc.Status;
import java.io.InputStream;
import java.util.Collections;
import java.util.Map;
import java.util.function.BiConsumer;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;
import org.slf4j.Logger;

/**
 * Test suite for the logging interceptor. Uses mocks to avoid sending actual RPC calls. At some
 * point in future we should investigate gRPC's support for mocking servers.
 *
 * <p>The mutable fields in this class get composed into request/responses and sent to the logger.
 * Set these fields to match the test case, and call runCall()/runDefaultCall() to simulate the call
 * and verify the result.
 */
@RunWith(MockitoJUnitRunner.class)
public class LoggingInterceptorTest {

  private MethodDescriptor methodDescriptor;
  private RequestLogger requestLogger;
  private String devToken;
  private String endpoint;
  private String loginCustomerId;
  private String customerId;
  private Object request;
  private Object response;
  private Status status;
  private boolean isSuccess;
  private Map<String, String> requestHeaders;
  private Map<String, String> scrubbedHeaders;
  private Metadata responseHeaders;
  private Metadata trailers;
  private String requestId;
  private Message failure;

  @Mock(name = "summaryLogger")
  private Logger summaryLogger;

  @Mock(name = "detailLogger")
  private Logger detailLogger;

  @Mock private Channel nextChannel;

  @Mock private ClientCall nextCall;

  @Before
  public void setup() {
    // Initialize Mockito objects.
    resetMocks();

    // Initialize dummy request object.
    devToken = "devtoken-test";
    loginCustomerId = "lcid-test";
    endpoint = "google.com";
    request = new Object();
    requestHeaders =
        ImmutableMap.of("developer-token", devToken, "login-customer-id", loginCustomerId);
    scrubbedHeaders =
        ImmutableMap.of("developer-token", "REDACTED", "login-customer-id", loginCustomerId);

    // Initialize dummy response object.
    status = Status.OK;
    isSuccess = true;
    responseHeaders = new Metadata();
    response = new Object();
    requestId = "testrqid";
    responseHeaders.put(LoggingInterceptor.REQUEST_ID_HEADER_KEY, requestId);
    trailers = new Metadata();
    failure = null;
    customerId = null;

    // Initialize logger and gRPC.
    requestLogger = new RequestLogger(summaryLogger, detailLogger, () -> Integer.MAX_VALUE);
    methodDescriptor =
        MethodDescriptor.newBuilder()
            .setFullMethodName("this.is.the/Method")
            .setType(MethodType.UNARY)
            .setResponseMarshaller(
                new Marshaller<Object>() {
                  @Override
                  public InputStream stream(Object value) {
                    return null;
                  }

                  @Override
                  public Object parse(InputStream stream) {
                    return null;
                  }
                })
            .setRequestMarshaller(
                new Marshaller<Object>() {
                  @Override
                  public InputStream stream(Object value) {
                    return null;
                  }

                  @Override
                  public Object parse(InputStream stream) {
                    return null;
                  }
                })
            .build();
  }

  /** Ensures that the normal RPC flow results in a correct log. */
  @Test
  public void logsSuccessfulCall() {
    runDefaultCall();
  }

  /** Ensures that a failed call is logged at the appropriate levels. */
  @Test
  public void logsFailedCall() {
    status = Status.INVALID_ARGUMENT;
    isSuccess = false;
    runDefaultCall();
  }

  /** Ensures that the CID is extracted from requests where it's present. */
  @Test
  public void logsCustomerId() {
    request =
        new Object() {
          // This method is accessed using reflection in the logging impl.
          @SuppressWarnings("unused")
          public String getCustomerId() {
            return "dummyCID";
          }
        };
    customerId = "dummyCID";
    runDefaultCall();
  }

  /** Ensures that the CID is extracted from requests where it's present in the resource name. */
  @Test
  public void logsCustomerId_fromResourceName() {
    request =
        new Object() {
          // This method is accessed using reflection in the logging impl.
          @SuppressWarnings("unused")
          public String getResourceName() {
            return "dummyResourceName";
          }
        };
    customerId = "dummyResourceName";
    runDefaultCall();
  }

  /** Ensures that can read the requestID from trailers. */
  @Test
  public void canReadRequestIdFromTrailers() {
    trailers = responseHeaders;
    responseHeaders = new Metadata();
    runDefaultCall();
  }

  /** Ensures that logging works without requestID. */
  @Test
  public void logsWhenMissingRequestId() {
    responseHeaders = new Metadata();
    trailers = new Metadata();
    requestId = null;
    runDefaultCall();
  }

  /** Ensures that logging works with empty request headers. */
  @Test
  public void logsWhenRequestHeadersEmpty() {
    requestHeaders = Collections.emptyMap();
    scrubbedHeaders = Collections.emptyMap();
    runDefaultCall();
  }

  /** Ensures that logging works with null request headers. */
  @Test
  public void logsWhenRequestHeadersNull() {
    requestHeaders = null;
    scrubbedHeaders = Collections.emptyMap();
    runDefaultCall();
  }

  /** Ensures that logging works with the RPC method not provided (should never happen). */
  @Test
  public void logsWithMethodNotSet() {
    methodDescriptor = null;
    runDefaultCall();
  }

  /** Ensures that logging works with no RPC response status received. */
  @Test
  public void logsWithStatusNotSet() {
    status = null;
    isSuccess = false;
    runDefaultCall();
  }

  /** Ensures that logging works when no endpoint is set (should never happen). */
  @Test
  public void logsWithEndpointNotSet() {
    endpoint = null;
    runDefaultCall();
  }

  /** Ensures that logging works with null response headers. */
  @Test
  public void logsWithResponseHeadersNotSet() {
    responseHeaders = null;
    requestId = null;
    runDefaultCall();
  }

  /** Ensures that logging works with null response trailers. */
  @Test
  public void logsWithTrailersNotSet() {
    trailers = null;
    runDefaultCall();
  }

  /** Ensures that we can log a GoogleAdsFailure message from the response trailers. */
  @Test
  public void logsFailureMessageFromTrailers() {
    ApiCatalog catalog = ApiCatalog.getDefault();
    for (Version version : catalog.getSupportedVersions()) {
      failure = version.getExceptionFactory().createGoogleAdsFailure();
      trailers.put(version.getExceptionFactory().getTrailerKey(), failure.toByteArray());
      runDefaultCall();
      resetMocks();
    }
  }

  /** Ensures that logging works when onHeaders is not called. */
  @Test
  public void logsIfResponseHeadersNotSent() {
    responseHeaders = null;
    requestId = null;
    runCall(
        (listener, detail) -> {
          listener.onMessage(detail.getResponse());
          listener.onClose(detail.getResponseStatus(), detail.getResponseTrailerMetadata());
        });
  }

  /** Ensures that logging works if onMessage is not called. */
  @Test
  public void logsIfResponseNotReceived() {
    response = null;
    runCall(
        (listener, detail) -> {
          listener.onHeaders(detail.getResponseHeaderMetadata());
          listener.onClose(detail.getResponseStatus(), detail.getResponseTrailerMetadata());
        });
  }

  /** Ensures that logging works if onHeaders and onMessage are not called. */
  @Test
  public void logsIfResponseAndHeadersNotReceived() {
    response = null;
    responseHeaders = null;
    requestId = null;
    runCall(
        (listener, detail) ->
            listener.onClose(detail.getResponseStatus(), detail.getResponseTrailerMetadata()));
  }

  /** Ensures that the truncation setting is respected and request/responses are truncated. */
  @Test
  public void truncatesLongResponses() {
    requestLogger = new RequestLogger(summaryLogger, detailLogger, () -> 5);
    response = "12345" + RequestLogger.TRUNCATE_MESSAGE;
    runCall(
        (listener, detail) -> {
          listener.onHeaders(detail.getResponseHeaderMetadata());
          listener.onMessage("123456");
          listener.onClose(detail.getResponseStatus(), detail.getResponseTrailerMetadata());
        });
  }

  /**
   * Ensures that truncation doesn't apply at the boundary case where response.length =
   * truncateLength.
   */
  @Test
  public void doesntTruncateOnLimitBoundary() {
    requestLogger = new RequestLogger(summaryLogger, detailLogger, () -> 5);
    response = "12345";
    runCall(
        (listener, detail) -> {
          listener.onHeaders(detail.getResponseHeaderMetadata());
          listener.onMessage("12345");
          listener.onClose(detail.getResponseStatus(), detail.getResponseTrailerMetadata());
        });
  }

  @Test
  public void scrubsEmailAddress_from_searchStreamResponse() {
    SearchGoogleAdsStreamResponse.Builder builder = SearchGoogleAdsStreamResponse.newBuilder();
    builder
        .addResultsBuilder()
        .getCustomerUserAccessBuilder()
        .setEmailAddress("foo@bar.com")
        .setInviterUserEmailAddress("foo@bar.com");
    builder.setFieldMask(FieldMasks.allSetFieldsOf(builder.getResults(0)));
    response = builder.build();

    runDefaultCallNoVerify();

    // Recreates the detail message with the REDACTED text.
    builder
        .getResultsBuilder(0)
        .getCustomerUserAccessBuilder()
        .setEmailAddress("REDACTED")
        .setInviterUserEmailAddress("REDACTED");
    response = builder.build();

    verifyLoggers(createDetail(), createSummary(), detailLogger, summaryLogger);
  }

  @Test
  public void scrubsEmailAddress_from_searchPagedResponse() {
    SearchGoogleAdsResponse.Builder builder = SearchGoogleAdsResponse.newBuilder();
    builder
        .addResultsBuilder()
        .getCustomerUserAccessBuilder()
        .setEmailAddress("foo@bar.com")
        .setInviterUserEmailAddress("foo@bar.com");
    builder.setFieldMask(FieldMasks.allSetFieldsOf(builder.getResults(0)));
    response = builder.build();

    runDefaultCallNoVerify();

    // Recreates the detail message with the REDACTED text.
    builder
        .getResultsBuilder(0)
        .getCustomerUserAccessBuilder()
        .setEmailAddress("REDACTED")
        .setInviterUserEmailAddress("REDACTED");
    response = builder.build();

    verifyLoggers(createDetail(), createSummary(), detailLogger, summaryLogger);
  }

  @Test
  public void scrubsEmailAddress_from_customerUserAccess() {
    CustomerUserAccess.Builder builder =
        CustomerUserAccess.newBuilder()
            .setEmailAddress("foo@bar.com")
            .setInviterUserEmailAddress("foo@bar.com");
    response = builder.build();

    runDefaultCallNoVerify();

    // Recreates the detail message with the REDACTED text.
    builder.setEmailAddress("REDACTED").setInviterUserEmailAddress("REDACTED");
    response = builder.build();

    verifyLoggers(createDetail(), createSummary(), detailLogger, summaryLogger);
  }

  @Test
  public void scrubsInviterEmailAddress_from_searchStreamResponse() {
    SearchGoogleAdsStreamResponse.Builder builder = SearchGoogleAdsStreamResponse.newBuilder();
    builder
        .addResultsBuilder()
        .getCustomerUserAccessBuilder()
        .setInviterUserEmailAddress("foo@bar.com");
    builder.setFieldMask(FieldMasks.allSetFieldsOf(builder.getResults(0)));
    response = builder.build();

    runDefaultCallNoVerify();

    // Recreates the detail message with the REDACTED text.
    builder
        .getResultsBuilder(0)
        .getCustomerUserAccessBuilder()
        .setInviterUserEmailAddress("REDACTED");
    response = builder.build();

    verifyLoggers(createDetail(), createSummary(), detailLogger, summaryLogger);
  }

  @Test
  public void scrubsUserEmail_from_searchStreamResponse() {
    SearchGoogleAdsStreamResponse.Builder builder = SearchGoogleAdsStreamResponse.newBuilder();
    builder.addResultsBuilder().getChangeEventBuilder().setUserEmail("foo@bar.com");
    builder.setFieldMask(FieldMasks.allSetFieldsOf(builder.getResults(0)));
    response = builder.build();

    runDefaultCallNoVerify();

    // Recreates the detail message with the REDACTED text.
    builder.getResultsBuilder(0).getChangeEventBuilder().setUserEmail("REDACTED");
    response = builder.build();

    verifyLoggers(createDetail(), createSummary(), detailLogger, summaryLogger);
  }

  @Test
  public void scrubsEmail_from_getFeed() {
    Feed.Builder builder = Feed.newBuilder();
    builder.getPlacesLocationFeedDataBuilder().setEmailAddress("foo@bar.com");
    response = builder.build();

    runDefaultCallNoVerify();

    builder.getPlacesLocationFeedDataBuilder().setEmailAddress("REDACTED");
    response = builder.build();

    verifyLoggers(createDetail(), createSummary(), detailLogger, summaryLogger);
  }

  @Test
  public void scrubsFeedPlacesLocationEmail_from_searchStreamResponse() {
    SearchGoogleAdsStreamResponse.Builder builder = SearchGoogleAdsStreamResponse.newBuilder();
    builder
        .addResultsBuilder()
        .getFeedBuilder()
        .getPlacesLocationFeedDataBuilder()
        .setEmailAddress("foo@bar.com");
    builder.setFieldMask(FieldMasks.allSetFieldsOf(builder.getResults(0)));
    response = builder.build();

    runDefaultCallNoVerify();

    builder
        .getResultsBuilder(0)
        .getFeedBuilder()
        .getPlacesLocationFeedDataBuilder()
        .setEmailAddress("REDACTED");
    response = builder.build();

    verifyLoggers(createDetail(), createSummary(), detailLogger, summaryLogger);
  }

  @Test
  public void scrubsFeedPlacesLocationEmail_from_searchPagedResponse() {
    SearchGoogleAdsResponse.Builder builder = SearchGoogleAdsResponse.newBuilder();
    builder
        .addResultsBuilder()
        .getFeedBuilder()
        .getPlacesLocationFeedDataBuilder()
        .setEmailAddress("foo@bar.com");
    builder.setFieldMask(FieldMasks.allSetFieldsOf(builder.getResults(0)));
    response = builder.build();

    runDefaultCallNoVerify();

    builder
        .getResultsBuilder(0)
        .getFeedBuilder()
        .getPlacesLocationFeedDataBuilder()
        .setEmailAddress("REDACTED");
    response = builder.build();

    verifyLoggers(createDetail(), createSummary(), detailLogger, summaryLogger);
  }

  @Test
  public void scrubsEmail_from_CreateCustomerClientRequest() {
    CreateCustomerClientRequest.Builder builder = CreateCustomerClientRequest.newBuilder();
    builder.setEmailAddress("foo@bar.com");
    response = builder.build();

    runDefaultCallNoVerify();

    builder.setEmailAddress("REDACTED");
    response = builder.build();

    verifyLoggers(createDetail(), createSummary(), detailLogger, summaryLogger);
  }

  private static Listener simulateCall(
      RequestLogger requestLogger,
      Detail detail,
      Summary summary,
      MethodDescriptor methodDescriptor,
      Channel nextChannel,
      ClientCall nextCall) {
    LoggingInterceptor interceptor =
        new LoggingInterceptor(requestLogger, detail.getRawRequestHeaders(), summary.getEndpoint());

    // Simulate a call (mocked channel doesn't actually make a call).
    ClientCall call = interceptor.interceptCall(methodDescriptor, null, nextChannel);
    Metadata upstreamHeaders = new Metadata();
    call.start(new Listener() {}, upstreamHeaders);
    call.sendMessage(detail.getRequest());

    // Capture the response listener and return this so we can test with different responses.
    ArgumentCaptor<Listener> listenerCaptor = ArgumentCaptor.forClass(Listener.class);
    verify(nextCall).start(listenerCaptor.capture(), eq(upstreamHeaders));
    return listenerCaptor.getValue();
  }

  private static void verifyLoggers(
      Detail detail, Summary summary, Logger detailLogger, Logger summaryLogger) {
    // A small bit of logic here is a reasonable trade-off to simplify the tests.
    if (detail.isSuccess()) {
      verify(detailLogger).debug(any(), getDetailLoggerParams(detail));
      verify(summaryLogger).info(any(), getSummaryLoggerParams(summary));
    } else {
      verify(detailLogger).info(any(), getDetailLoggerParams(detail));
      verify(summaryLogger).warn(any(), getSummaryLoggerParams(summary));
    }
  }

  private static Object[] getDetailLoggerParams(Detail detail) {
    try {
      return new Object[] {
        any(),
        eq(detail.getMethodName()),
        eq(detail.getEndpoint()),
        eq(detail.getScrubbedRequestHeaders()),
        eq(detail.getRequest()),
        eq(detail.getResponseHeaderMetadata()),
        eq(detail.getResponseAsText()),
        eq(detail.deserializeFailureMessage().orElse(null)),
        eq(detail.getResponseStatus())
      };
    } catch (InvalidProtocolBufferException e) {
      throw new IllegalStateException(e);
    }
  }

  private static Object[] getSummaryLoggerParams(Summary summary) {
    return new Object[] {
      any(),
      eq(summary.getMethodName()),
      eq(summary.getEndpoint()),
      eq(summary.getCustomerId()),
      eq(summary.getRequestId()),
      eq(summary.getResponseCode()),
      eq(summary.getResponseDescription())
    };
  }

  private void resetMocks() {
    Mockito.reset(summaryLogger);
    Mockito.reset(detailLogger);
    Mockito.reset(nextChannel);
    Mockito.reset(nextChannel);

    when(nextChannel.newCall(any(), any())).thenReturn(nextCall);
    enableAllLevels(summaryLogger);
    enableAllLevels(detailLogger);
  }

  private void enableAllLevels(Logger logger) {
    when(logger.isDebugEnabled()).thenReturn(true);
    when(logger.isErrorEnabled()).thenReturn(true);
    when(logger.isInfoEnabled()).thenReturn(true);
    when(logger.isTraceEnabled()).thenReturn(true);
    when(logger.isWarnEnabled()).thenReturn(true);
  }

  private void runDefaultCall() {
    runCall(LoggingInterceptorTest::runDefaultCallback);
  }

  private static void runDefaultCallback(Listener listener, Detail detail) {
    listener.onHeaders(detail.getResponseHeaderMetadata());
    listener.onMessage(detail.getResponse());
    listener.onClose(detail.getResponseStatus(), detail.getResponseTrailerMetadata());
  }

  private void runCall(BiConsumer<Listener, Detail> callback) {
    Detail detail = createDetail();
    Summary summary = createSummary();
    runCall(callback, detail, summary);
  }

  private void runCall(BiConsumer<Listener, Detail> callback, Detail detail, Summary summary) {
    runCallNoVerify(callback, detail, summary);
    verifyLoggers(detail, summary, detailLogger, summaryLogger);
  }

  private void runDefaultCallNoVerify() {
    runCallNoVerify(LoggingInterceptorTest::runDefaultCallback, createDetail(), createSummary());
  }

  private void runCallNoVerify(
      BiConsumer<Listener, Detail> callback, Detail detail, Summary summary) {
    Listener listener =
        simulateCall(requestLogger, detail, summary, methodDescriptor, nextChannel, nextCall);
    callback.accept(listener, detail);
  }

  private Detail createDetail() {
    return Detail.builder()
        .setResponseStatus(status)
        .setSuccess(isSuccess)
        .setMethodName(methodDescriptor == null ? null : methodDescriptor.getFullMethodName())
        .setRawRequestHeaders(requestHeaders)
        .setScrubbedRequestHeaders(scrubbedHeaders)
        .setEndpoint(endpoint)
        .setRequest(request)
        .setResponseHeaderMetadata(responseHeaders)
        .setResponseTrailerMetadata(trailers)
        .setResponse(response)
        .build();
  }

  private Summary createSummary() {
    return Summary.builder()
        .setResponseStatus(status)
        .setSuccess(isSuccess)
        .setMethodName(methodDescriptor == null ? null : methodDescriptor.getFullMethodName())
        .setCustomerId(customerId)
        .setEndpoint(endpoint)
        .setRequestId(requestId)
        .build();
  }
}
