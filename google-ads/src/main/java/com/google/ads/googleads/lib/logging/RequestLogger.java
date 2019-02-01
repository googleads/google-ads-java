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

import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Preconditions;
import java.util.function.Supplier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.event.Level;

/**
 * Dispatches logging requests to the logging library, decoupling logging from the RPC interceptor.
 */
public class RequestLogger {

  @VisibleForTesting
  static final String TRUNCATE_MESSAGE =
      "\n... TRUNCATED. See README.md to configure/disable log truncation.";

  private static final String LOG_LENGTH_LIMIT_KEY = "api.googleads.maxLogMessageLength";
  private static final int DEFAULT_LOG_LENGTH_LIMIT = 1000;
  private final Logger detailLogger;
  private final Logger summaryLogger;
  private final int logLengthLimit;

  public RequestLogger() {
    // These loggers are explicitly configured with constants to ensure consistency of logging
    // configuration across refactorings.
    this(
        LoggerFactory.getLogger("com.google.ads.googleads.lib.request.summary"),
        LoggerFactory.getLogger("com.google.ads.googleads.lib.request.detail"),
        () ->
            System.getProperties().containsKey(LOG_LENGTH_LIMIT_KEY)
                ? parseLogLengthLimit(System.getProperty(LOG_LENGTH_LIMIT_KEY))
                : DEFAULT_LOG_LENGTH_LIMIT);
  }

  @VisibleForTesting
  RequestLogger(
      Logger summaryLogger, Logger detailLogger, Supplier<Integer> logLengthLimitSupplier) {
    this.summaryLogger = summaryLogger;
    this.detailLogger = detailLogger;
    this.logLengthLimit = logLengthLimitSupplier.get();
    Preconditions.checkArgument(logLengthLimit >= -1, LOG_LENGTH_LIMIT_KEY + " must be >= -1");
  }

  /**
   * Checks if the detailed (request) logger is enabled. This operation will complete quickly and
   * can be used to guard expensive logger statements.
   */
  public boolean isDetailEnabled(Level level) {
    return isLevelEnabled(level, detailLogger);
  }

  /**
   * Checks if the summary (headers/trailers) logger is enabled. This operation will complete
   * quickly and can be used to guard expensive logger statements.
   */
  public boolean isSummaryEnabled(Level level) {
    return isLevelEnabled(level, summaryLogger);
  }

  /**
   * Logs a summary of an RPC call. Has no effect if the logger is not enabled at the level
   * requested.
   */
  public void logSummary(Level level, Event.Summary event) {
    logAtLevel(
        summaryLogger,
        level,
        "{} REQUEST SUMMARY. "
            + "Method: {}, "
            + "Endpoint: {}, "
            + "CustomerID: {}, "
            + "RequestID: {}, "
            + "ResponseCode: {}, "
            + "Fault: {}.",
        event.isSuccess() ? "SUCCESS" : "FAILURE",
        event.getMethodName(),
        event.getEndpoint(),
        event.getCustomerId(),
        event.getRequestId(),
        event.getResponseCode(),
        event.getResponseDescription());
  }

  /**
   * Logs the request/response of an RPC call. Has no effect if the logger is not enabled at the
   * level requested.
   */
  public void logDetail(Level level, Event.Detail event) {
    logAtLevel(
        detailLogger,
        level,
        "{} REQUEST DETAIL.\n"
            + "Request\n"
            + "-------\n"
            + "MethodName: {}\n"
            + "Endpoint: {}\n"
            + "Headers: {}\n"
            + "Body: {}\n\n"
            + "Response\n"
            + "--------\n"
            + "Headers: {}\n"
            + "Body: {}\n"
            + "Status: {}.",
        event.isSuccess() ? "SUCCESS" : "FAILURE",
        event.getMethodName(),
        event.getEndpoint(),
        event.getScrubbedRequestHeaders(),
        event.getRequest(),
        event.getResponseHeaderMetadata(),
        truncate(event.getResponseAsText()),
        event.getResponseStatus());
  }

  private String truncate(String responseMsg) {
    if (responseMsg == null) {
      return null;
    }
    if (logLengthLimit > -1 && responseMsg.length() > logLengthLimit) {
      responseMsg = responseMsg.substring(0, logLengthLimit) + TRUNCATE_MESSAGE;
    }
    return responseMsg;
  }

  private static Integer parseLogLengthLimit(String propertyValue) {
    try {
      return Integer.parseInt(propertyValue);
    } catch (NumberFormatException ex) {
      throw new IllegalArgumentException(
          "Invalid " + LOG_LENGTH_LIMIT_KEY + " supplied, must be a number: " + propertyValue);
    }
  }

  private static void logAtLevel(Logger logger, Level level, String format, Object... argList) {
    if (level == Level.INFO) {
      logger.info(format, argList);
    } else if (level == Level.WARN) {
      logger.warn(format, argList);
    } else if (level == Level.DEBUG) {
      logger.debug(format, argList);
    } else {
      throw new IllegalStateException("Unexpected log level: " + level);
    }
  }

  private static boolean isLevelEnabled(Level logLevel, Logger logger) {
    return (logLevel == Level.INFO && logger.isInfoEnabled())
        || (logLevel == Level.WARN && logger.isWarnEnabled())
        || (logLevel == Level.DEBUG && logger.isDebugEnabled());
  }
}
