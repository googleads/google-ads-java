/*
 * Copyright 2019 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.google.ads.googleads.v1.services;

import com.google.ads.googleads.v1.services.stub.ConversionUploadServiceStub;
import com.google.ads.googleads.v1.services.stub.ConversionUploadServiceStubSettings;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.UnaryCallable;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND SERVICE
/**
 * Service Description: Service to upload conversions.
 *
 * <p>This class provides the ability to make remote calls to the backing service through method
 * calls that map to API methods. Sample code to get started:
 *
 * <pre>
 * <code>
 * try (ConversionUploadServiceClient conversionUploadServiceClient = ConversionUploadServiceClient.create()) {
 *   String customerId = "";
 *   List&lt;ClickConversion&gt; conversions = new ArrayList&lt;&gt;();
 *   boolean partialFailure = false;
 *   boolean validateOnly = false;
 *   UploadClickConversionsResponse response = conversionUploadServiceClient.uploadClickConversions(customerId, conversions, partialFailure, validateOnly);
 * }
 * </code>
 * </pre>
 *
 * <p>Note: close() needs to be called on the conversionUploadServiceClient object to clean up
 * resources such as threads. In the example above, try-with-resources is used, which automatically
 * calls close().
 *
 * <p>The surface of this class includes several types of Java methods for each of the API's
 * methods:
 *
 * <ol>
 *   <li> A "flattened" method. With this type of method, the fields of the request type have been
 *       converted into function parameters. It may be the case that not all fields are available as
 *       parameters, and not every API method will have a flattened method entry point.
 *   <li> A "request object" method. This type of method only takes one parameter, a request object,
 *       which must be constructed before the call. Not every API method will have a request object
 *       method.
 *   <li> A "callable" method. This type of method takes no parameters and returns an immutable API
 *       callable object, which can be used to initiate calls to the service.
 * </ol>
 *
 * <p>See the individual methods for example code.
 *
 * <p>Many parameters require resource names to be formatted in a particular way. To assist with
 * these names, this class includes a format method for each type of name, and additionally a parse
 * method to extract the individual identifiers contained within names that are returned.
 *
 * <p>This class can be customized by passing in a custom instance of
 * ConversionUploadServiceSettings to create(). For example:
 *
 * <p>To customize credentials:
 *
 * <pre>
 * <code>
 * ConversionUploadServiceSettings conversionUploadServiceSettings =
 *     ConversionUploadServiceSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * ConversionUploadServiceClient conversionUploadServiceClient =
 *     ConversionUploadServiceClient.create(conversionUploadServiceSettings);
 * </code>
 * </pre>
 *
 * To customize the endpoint:
 *
 * <pre>
 * <code>
 * ConversionUploadServiceSettings conversionUploadServiceSettings =
 *     ConversionUploadServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
 * ConversionUploadServiceClient conversionUploadServiceClient =
 *     ConversionUploadServiceClient.create(conversionUploadServiceSettings);
 * </code>
 * </pre>
 */
@Generated("by gapic-generator")
@BetaApi
public class ConversionUploadServiceClient implements BackgroundResource {
  private final ConversionUploadServiceSettings settings;
  private final ConversionUploadServiceStub stub;

  /** Constructs an instance of ConversionUploadServiceClient with default settings. */
  public static final ConversionUploadServiceClient create() throws IOException {
    return create(ConversionUploadServiceSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of ConversionUploadServiceClient, using the given settings. The channels
   * are created based on the settings passed in, or defaults for any settings that are not set.
   */
  public static final ConversionUploadServiceClient create(ConversionUploadServiceSettings settings)
      throws IOException {
    return new ConversionUploadServiceClient(settings);
  }

  /**
   * Constructs an instance of ConversionUploadServiceClient, using the given stub for making calls.
   * This is for advanced usage - prefer to use ConversionUploadServiceSettings}.
   */
  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public static final ConversionUploadServiceClient create(ConversionUploadServiceStub stub) {
    return new ConversionUploadServiceClient(stub);
  }

  /**
   * Constructs an instance of ConversionUploadServiceClient, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected ConversionUploadServiceClient(ConversionUploadServiceSettings settings)
      throws IOException {
    this.settings = settings;
    this.stub = ((ConversionUploadServiceStubSettings) settings.getStubSettings()).createStub();
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  protected ConversionUploadServiceClient(ConversionUploadServiceStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final ConversionUploadServiceSettings getSettings() {
    return settings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public ConversionUploadServiceStub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Processes the given click conversions.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (ConversionUploadServiceClient conversionUploadServiceClient = ConversionUploadServiceClient.create()) {
   *   String customerId = "";
   *   List&lt;ClickConversion&gt; conversions = new ArrayList&lt;&gt;();
   *   boolean partialFailure = false;
   *   boolean validateOnly = false;
   *   UploadClickConversionsResponse response = conversionUploadServiceClient.uploadClickConversions(customerId, conversions, partialFailure, validateOnly);
   * }
   * </code></pre>
   *
   * @param customerId The ID of the customer performing the upload.
   * @param conversions The conversions that are being uploaded.
   * @param partialFailure If true, successful operations will be carried out and invalid operations
   *     will return errors. If false, all operations will be carried out in one transaction if and
   *     only if they are all valid. This should always be set to true.
   * @param validateOnly If true, the request is validated but not executed. Only errors are
   *     returned, not results.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final UploadClickConversionsResponse uploadClickConversions(
      String customerId,
      List<ClickConversion> conversions,
      boolean partialFailure,
      boolean validateOnly) {

    UploadClickConversionsRequest request =
        UploadClickConversionsRequest.newBuilder()
            .setCustomerId(customerId)
            .addAllConversions(conversions)
            .setPartialFailure(partialFailure)
            .setValidateOnly(validateOnly)
            .build();
    return uploadClickConversions(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Processes the given click conversions.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (ConversionUploadServiceClient conversionUploadServiceClient = ConversionUploadServiceClient.create()) {
   *   String customerId = "";
   *   List&lt;ClickConversion&gt; conversions = new ArrayList&lt;&gt;();
   *   UploadClickConversionsResponse response = conversionUploadServiceClient.uploadClickConversions(customerId, conversions);
   * }
   * </code></pre>
   *
   * @param customerId The ID of the customer performing the upload.
   * @param conversions The conversions that are being uploaded.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final UploadClickConversionsResponse uploadClickConversions(
      String customerId, List<ClickConversion> conversions) {

    UploadClickConversionsRequest request =
        UploadClickConversionsRequest.newBuilder()
            .setCustomerId(customerId)
            .addAllConversions(conversions)
            .build();
    return uploadClickConversions(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Processes the given click conversions.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (ConversionUploadServiceClient conversionUploadServiceClient = ConversionUploadServiceClient.create()) {
   *   String customerId = "";
   *   List&lt;ClickConversion&gt; conversions = new ArrayList&lt;&gt;();
   *   UploadClickConversionsRequest request = UploadClickConversionsRequest.newBuilder()
   *     .setCustomerId(customerId)
   *     .addAllConversions(conversions)
   *     .build();
   *   UploadClickConversionsResponse response = conversionUploadServiceClient.uploadClickConversions(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final UploadClickConversionsResponse uploadClickConversions(
      UploadClickConversionsRequest request) {
    return uploadClickConversionsCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Processes the given click conversions.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (ConversionUploadServiceClient conversionUploadServiceClient = ConversionUploadServiceClient.create()) {
   *   String customerId = "";
   *   List&lt;ClickConversion&gt; conversions = new ArrayList&lt;&gt;();
   *   UploadClickConversionsRequest request = UploadClickConversionsRequest.newBuilder()
   *     .setCustomerId(customerId)
   *     .addAllConversions(conversions)
   *     .build();
   *   ApiFuture&lt;UploadClickConversionsResponse&gt; future = conversionUploadServiceClient.uploadClickConversionsCallable().futureCall(request);
   *   // Do something
   *   UploadClickConversionsResponse response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<UploadClickConversionsRequest, UploadClickConversionsResponse>
      uploadClickConversionsCallable() {
    return stub.uploadClickConversionsCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Processes the given call conversions.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (ConversionUploadServiceClient conversionUploadServiceClient = ConversionUploadServiceClient.create()) {
   *   String customerId = "";
   *   List&lt;CallConversion&gt; conversions = new ArrayList&lt;&gt;();
   *   boolean partialFailure = false;
   *   boolean validateOnly = false;
   *   UploadCallConversionsResponse response = conversionUploadServiceClient.uploadCallConversions(customerId, conversions, partialFailure, validateOnly);
   * }
   * </code></pre>
   *
   * @param customerId The ID of the customer performing the upload.
   * @param conversions The conversions that are being uploaded.
   * @param partialFailure If true, successful operations will be carried out and invalid operations
   *     will return errors. If false, all operations will be carried out in one transaction if and
   *     only if they are all valid. This should always be set to true.
   * @param validateOnly If true, the request is validated but not executed. Only errors are
   *     returned, not results.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final UploadCallConversionsResponse uploadCallConversions(
      String customerId,
      List<CallConversion> conversions,
      boolean partialFailure,
      boolean validateOnly) {

    UploadCallConversionsRequest request =
        UploadCallConversionsRequest.newBuilder()
            .setCustomerId(customerId)
            .addAllConversions(conversions)
            .setPartialFailure(partialFailure)
            .setValidateOnly(validateOnly)
            .build();
    return uploadCallConversions(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Processes the given call conversions.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (ConversionUploadServiceClient conversionUploadServiceClient = ConversionUploadServiceClient.create()) {
   *   String customerId = "";
   *   List&lt;CallConversion&gt; conversions = new ArrayList&lt;&gt;();
   *   UploadCallConversionsResponse response = conversionUploadServiceClient.uploadCallConversions(customerId, conversions);
   * }
   * </code></pre>
   *
   * @param customerId The ID of the customer performing the upload.
   * @param conversions The conversions that are being uploaded.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final UploadCallConversionsResponse uploadCallConversions(
      String customerId, List<CallConversion> conversions) {

    UploadCallConversionsRequest request =
        UploadCallConversionsRequest.newBuilder()
            .setCustomerId(customerId)
            .addAllConversions(conversions)
            .build();
    return uploadCallConversions(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Processes the given call conversions.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (ConversionUploadServiceClient conversionUploadServiceClient = ConversionUploadServiceClient.create()) {
   *   String customerId = "";
   *   List&lt;CallConversion&gt; conversions = new ArrayList&lt;&gt;();
   *   UploadCallConversionsRequest request = UploadCallConversionsRequest.newBuilder()
   *     .setCustomerId(customerId)
   *     .addAllConversions(conversions)
   *     .build();
   *   UploadCallConversionsResponse response = conversionUploadServiceClient.uploadCallConversions(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final UploadCallConversionsResponse uploadCallConversions(
      UploadCallConversionsRequest request) {
    return uploadCallConversionsCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Processes the given call conversions.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (ConversionUploadServiceClient conversionUploadServiceClient = ConversionUploadServiceClient.create()) {
   *   String customerId = "";
   *   List&lt;CallConversion&gt; conversions = new ArrayList&lt;&gt;();
   *   UploadCallConversionsRequest request = UploadCallConversionsRequest.newBuilder()
   *     .setCustomerId(customerId)
   *     .addAllConversions(conversions)
   *     .build();
   *   ApiFuture&lt;UploadCallConversionsResponse&gt; future = conversionUploadServiceClient.uploadCallConversionsCallable().futureCall(request);
   *   // Do something
   *   UploadCallConversionsResponse response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<UploadCallConversionsRequest, UploadCallConversionsResponse>
      uploadCallConversionsCallable() {
    return stub.uploadCallConversionsCallable();
  }

  @Override
  public final void close() {
    stub.close();
  }

  @Override
  public void shutdown() {
    stub.shutdown();
  }

  @Override
  public boolean isShutdown() {
    return stub.isShutdown();
  }

  @Override
  public boolean isTerminated() {
    return stub.isTerminated();
  }

  @Override
  public void shutdownNow() {
    stub.shutdownNow();
  }

  @Override
  public boolean awaitTermination(long duration, TimeUnit unit) throws InterruptedException {
    return stub.awaitTermination(duration, unit);
  }
}
