// Copyright 2020 Google LLC
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

package com.google.ads.googleads.lib.catalog;

import com.google.ads.googleads.lib.GoogleAdsAllVersions;
import com.google.auth.Credentials;
import com.google.common.annotations.VisibleForTesting;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Consumer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** Implements Primer by running classloading and OAuth flows asynchronously. */
public class DefaultPrimer extends Primer {

  private static final Logger logger = LoggerFactory.getLogger(DefaultPrimer.class);
  private static final int MAX_NUM_THREADS = 5;
  private static final String GRPC_RESOURCE_PATH = "/googleadsapi-primer/grpc_class_names";
  private static final String PROTOBUF_RESOURCE_PATH = "/googleadsapi-primer/protobuf_class_names";
  private final ExecutorService executorService;
  private final AtomicBoolean isGrpcPrimed = new AtomicBoolean(false);
  private final AtomicBoolean isProtobufPrimed = new AtomicBoolean(false);
  private final Consumer<String> classLoaderStrategy;
  private final String grpcResourcePath;
  private final String protobufResourcePath;

  DefaultPrimer() {
    this(
        name -> {
          try {
            Class.forName(name);
          } catch (ClassNotFoundException e) {
            // Do not log here to avoid slowing down the primer.
          }
        },
        GRPC_RESOURCE_PATH,
        PROTOBUF_RESOURCE_PATH,
        createDefaultExecutor());
  }

  @VisibleForTesting
  DefaultPrimer(
      Consumer<String> classloaderStrategy,
      String grpcResourcePath,
      String protobufResourcePath,
      ExecutorService executorService) {
    this.classLoaderStrategy = classloaderStrategy;
    this.grpcResourcePath = grpcResourcePath;
    this.protobufResourcePath = protobufResourcePath;
    this.executorService = executorService;
  }

  @Override
  public void primeGrpcAsync() {
    boolean needsPrime = isGrpcPrimed.compareAndSet(false, true);
    if (needsPrime) {
      primeClassNamesResourceAsync(grpcResourcePath);
    }
  }

  @Override
  public void primeProtobufAsync() {
    boolean needsPrime = isProtobufPrimed.compareAndSet(false, true);
    if (needsPrime) {
      primeClassNamesResourceAsync(protobufResourcePath);
    }
  }

  @Override
  public void primeAllVersionsAsync() {
    runAndPreserveStacktrace(() -> GoogleAdsAllVersions.class.getMethods());
  }

  @Override
  public void primeCredentialsAsync(Credentials credentials) {
    runAndPreserveStacktrace(
        () -> {
          try {
            credentials.getRequestMetadata();
          } catch (IOException e) {
            throw new RuntimeException(e);
          }
        });
  }

  /** Queues a Runnable while presering the calling thread's stacktrace for exceptions. */
  private void runAndPreserveStacktrace(Runnable runnable) {
    executorService.submit(new StackTracePreservingRunnable(runnable));
  }

  /**
   * Asynchronously loads all classes defined by the strings in a resource file. One class name per
   * line.
   */
  private void primeClassNamesResourceAsync(String resourcePath) {
    runAndPreserveStacktrace(() -> primeClassNamesResource(resourcePath));
  }

  /** Creates a new executor service with the default parameters. */
  private static ExecutorService createDefaultExecutor() {
    return Executors.newFixedThreadPool(
        MAX_NUM_THREADS,
        r -> {
          Thread t = new Thread(r);
          t.setName("GAAPI primer thread " + t.getId());
          t.setDaemon(true);
          return t;
        });
  }

  /**
   * Synchronously loads all classes defined by the strings in a resource file. One class name per
   * line.
   */
  private void primeClassNamesResource(String resourcePath) {
    try (BufferedReader in =
        new BufferedReader(
            new InputStreamReader(DefaultPrimer.class.getResourceAsStream(resourcePath)))) {
      String line;
      while ((line = in.readLine()) != null) {
        if (line.length() > 0) {
          classLoaderStrategy.accept(line);
        }
      }
    } catch (IOException e) {
      logger.debug("Failed to prime", e);
    }
  }

  /** Throws exceptions which preserve the stacktrace when run() is called from another thread. */
  private static class StackTracePreservingRunnable implements Runnable {

    private final StackTraceElement[] originalStackTrace = Thread.currentThread().getStackTrace();
    private final Runnable innerRunnable;

    public StackTracePreservingRunnable(Runnable innerRunnable) {
      this.innerRunnable = innerRunnable;
    }

    @Override
    public void run() {
      try {
        innerRunnable.run();
      } catch (Exception cause) {
        CrossThreadException exception = new CrossThreadException(originalStackTrace, cause);
        throw exception;
      }
    }

    /**
     * An exception class which supports rewriting it's origin stacktrace, while providing a cause.
     * Used to give the appearance of an exception arising from a method call which spawns a thread,
     * rather than originating from Thread.start().
     */
    private static class CrossThreadException extends RuntimeException {

      public CrossThreadException(StackTraceElement[] originalStackTrace, Exception cause) {
        super(cause);
        setStackTrace(originalStackTrace);
      }
    }
  }
}
