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

import com.google.ads.googleads.lib.logging.Event.Summary;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import io.grpc.CallOptions;
import io.grpc.Channel;
import io.grpc.ClientCall;
import io.grpc.ClientInterceptor;
import io.grpc.ForwardingClientCall.SimpleForwardingClientCall;
import io.grpc.ForwardingClientCallListener.SimpleForwardingClientCallListener;
import io.grpc.Metadata;
import io.grpc.Metadata.Key;
import io.grpc.MethodDescriptor;
import io.grpc.Status;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Stream;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.event.Level;

/** An interceptor which logs all RPCs made on a Channel. */
public class LoggingInterceptor implements ClientInterceptor {

  public static final Key<String> REQUEST_ID_HEADER_KEY =
      Key.of("request-id", Metadata.ASCII_STRING_MARSHALLER);
  private static final ImmutableSet<CharSequence> HEADERS_TO_SCRUB =
      ImmutableSet.of("developer-token", "authorization");
  private static final Logger thisClassLogger = LoggerFactory.getLogger(LoggingInterceptor.class);
  private final RequestLogger requestLogger;
  private final ImmutableMap<String, String> requestHeaders;
  private final ImmutableMap<String, String> scrubbedRequestHeaders;
  private final String endpoint;

  /** Creates with the RequestLogger sink, the constant header data, and the API endpoint. */
  public LoggingInterceptor(
      RequestLogger requestLogger, ImmutableMap<String, String> headers, String endpoint) {
    this.requestLogger = requestLogger;
    this.requestHeaders = headers;
    this.scrubbedRequestHeaders = scrubHeaders(requestHeaders);
    this.endpoint = endpoint;
  }

  /**
   * Logs the Google Ads API fields required for debugging.
   *
   * {@inheritDoc}
   */
  @Override
  public <ReqT, RespT> ClientCall<ReqT, RespT> interceptCall(
      final MethodDescriptor<ReqT, RespT> method, CallOptions callOptions, Channel next) {
    ClientCall<ReqT, RespT> wrappedCall = next.newCall(method, callOptions);
    return new SimpleForwardingClientCall<ReqT, RespT>(wrappedCall) {
      private volatile ReqT request;
      private volatile RespT response;
      private volatile Metadata responseHeaders;

      @Override
      public void start(Listener<RespT> responseListener, Metadata headers) {
        super.start(
            new SimpleForwardingClientCallListener<RespT>(responseListener) {
              @Override
              public void onMessage(RespT message) {
                response = message;
                super.onMessage(message);
              }

              @Override
              public void onHeaders(Metadata headers) {
                responseHeaders = headers;
                super.onHeaders(headers);
              }

              @Override
              public void onClose(Status status, Metadata trailers) {
                try {
                  logSummary(status, request, method, responseHeaders, trailers);
                  logDetail(
                      status,
                      method,
                      requestHeaders,
                      endpoint,
                      request,
                      responseHeaders,
                      trailers,
                      response);
                } catch (Exception ex) {
                  thisClassLogger.warn("Failed to log request.", ex);
                }
                request = null;
                response = null;
                responseHeaders = null;
                super.onClose(status, trailers);
              }
            },
            headers);
      }

      @Override
      public void sendMessage(ReqT message) {
        request = message;
        super.sendMessage(message);
      }
    };
  }

  private static ImmutableMap<String, String> scrubHeaders(ImmutableMap<String, String> headers) {
    Map<String, String> scrubbed = new LinkedHashMap();
    if (headers != null) {
      scrubbed.putAll(headers);
      scrubbed.replaceAll((key, value) -> HEADERS_TO_SCRUB.contains(key) ? "REDACTED" : value);
    }
    return ImmutableMap.copyOf(scrubbed);
  }

  private static Level getDetailLevel(Status status) {
    return isSuccess(status) ? Level.DEBUG : Level.INFO;
  }

  private static Level getSummaryLevel(Status status) {
    return isSuccess(status) ? Level.INFO : Level.WARN;
  }

  private static String getRequestId(Metadata responseHeaders, Metadata responseTrailers) {
    if (responseHeaders != null && responseHeaders.containsKey(REQUEST_ID_HEADER_KEY)) {
      return responseHeaders.get(REQUEST_ID_HEADER_KEY);
    } else if (responseTrailers != null && responseTrailers.containsKey(REQUEST_ID_HEADER_KEY)) {
      return responseTrailers.get(REQUEST_ID_HEADER_KEY);
    } else {
      return null;
    }
  }

  private static String getCustomerId(Object request) {
    Optional<Method> getter =
        Stream.of(request.getClass().getMethods())
            .filter(method -> method.getName().equals("getCustomerId"))
            .findFirst();
    if (getter.isPresent()) {
      try {
        return (String) getter.get().invoke(request);
      } catch (IllegalAccessException | InvocationTargetException e) {
        thisClassLogger.error("Unable to retrieve customer ID from " + request);
      }
    }
    return null;
  }

  private static <ReqT, RespT> String getMethodName(MethodDescriptor<ReqT, RespT> method) {
    return method == null ? null : method.getFullMethodName();
  }

  private static boolean isSuccess(Status status) {
    return status != null && status.isOk();
  }

  /**
   * Logs an RPC call detailed message containing full request/response + headers. The level chosen
   * will depend on the response status (OK=DEBUG, FAILURE=INFO). Also checks if the logger is
   * enabled for the RPC status and logger configuration before computing message params.
   */
  private void logDetail(
      Status responseStatus,
      MethodDescriptor method,
      ImmutableMap<String, String> requestHeaders,
      String endpoint,
      Object request,
      Metadata responseHeaders,
      Metadata responseTrailers,
      Object response) {
    Level level = getDetailLevel(responseStatus);
    if (requestLogger.isDetailEnabled(level)) {
      String methodName = getMethodName(method);
      boolean isSuccess = isSuccess(responseStatus);
      Event.Detail event =
          Event.Detail.builder()
              .setResponseStatus(responseStatus)
              .setSuccess(isSuccess)
              .setMethodName(methodName)
              .setRawRequestHeaders(requestHeaders)
              .setScrubbedRequestHeaders(scrubbedRequestHeaders)
              .setEndpoint(endpoint)
              .setRequest(request)
              .setResponseHeaderMetadata(responseHeaders)
              .setResponseTrailerMetadata(responseTrailers)
              .setResponse(response)
              .build();
      requestLogger.logDetail(level, event);
    }
  }

  /**
   * Logs an RPC call summary, containing method name, endpoint, customerId and requestId. The level
   * chosen will depend on the response status (OK=INFO, FAILURE=WARN). This will check if the
   * logger is enabled for the RPC status and logger configuration before computing message params.
   */
  private void logSummary(
      Status responseStatus,
      Object request,
      MethodDescriptor method,
      Metadata responseHeaders,
      Metadata responseTrailers) {
    Level level = getSummaryLevel(responseStatus);
    if (requestLogger.isSummaryEnabled(level)) {
      String customerId = getCustomerId(request);
      String requestId = getRequestId(responseHeaders, responseTrailers);
      String methodName = getMethodName(method);
      boolean isSuccess = isSuccess(responseStatus);
      Summary event =
          Summary.builder()
              .setResponseStatus(responseStatus)
              .setSuccess(isSuccess)
              .setMethodName(methodName)
              .setCustomerId(customerId)
              .setEndpoint(endpoint)
              .setRequestId(requestId)
              .build();
      requestLogger.logSummary(level, event);
    }
  }
}
