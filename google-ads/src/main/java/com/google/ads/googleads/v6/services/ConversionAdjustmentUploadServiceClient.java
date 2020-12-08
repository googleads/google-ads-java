/*
 * Copyright 2020 Google LLC
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

package com.google.ads.googleads.v6.services;

import com.google.ads.googleads.v6.services.stub.ConversionAdjustmentUploadServiceStub;
import com.google.ads.googleads.v6.services.stub.ConversionAdjustmentUploadServiceStubSettings;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.UnaryCallable;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Service Description: Service to upload conversion adjustments.
 *
 * <p>This class provides the ability to make remote calls to the backing service through method
 * calls that map to API methods. Sample code to get started:
 *
 * <p>Note: close() needs to be called on the ConversionAdjustmentUploadServiceClient object to
 * clean up resources such as threads. In the example above, try-with-resources is used, which
 * automatically calls close().
 *
 * <p>The surface of this class includes several types of Java methods for each of the API's
 * methods:
 *
 * <ol>
 *   <li>A "flattened" method. With this type of method, the fields of the request type have been
 *       converted into function parameters. It may be the case that not all fields are available as
 *       parameters, and not every API method will have a flattened method entry point.
 *   <li>A "request object" method. This type of method only takes one parameter, a request object,
 *       which must be constructed before the call. Not every API method will have a request object
 *       method.
 *   <li>A "callable" method. This type of method takes no parameters and returns an immutable API
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
 * ConversionAdjustmentUploadServiceSettings to create(). For example:
 *
 * <p>To customize credentials:
 *
 * <pre>{@code
 * ConversionAdjustmentUploadServiceSettings conversionAdjustmentUploadServiceSettings =
 *     ConversionAdjustmentUploadServiceSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * ConversionAdjustmentUploadServiceClient conversionAdjustmentUploadServiceClient =
 *     ConversionAdjustmentUploadServiceClient.create(conversionAdjustmentUploadServiceSettings);
 * }</pre>
 *
 * <p>To customize the endpoint:
 *
 * <pre>{@code
 * ConversionAdjustmentUploadServiceSettings conversionAdjustmentUploadServiceSettings =
 *     ConversionAdjustmentUploadServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
 * ConversionAdjustmentUploadServiceClient conversionAdjustmentUploadServiceClient =
 *     ConversionAdjustmentUploadServiceClient.create(conversionAdjustmentUploadServiceSettings);
 * }</pre>
 *
 * <p>Please refer to the GitHub repository's samples for more quickstart code snippets.
 */
@BetaApi
@Generated("by gapic-generator")
public class ConversionAdjustmentUploadServiceClient implements BackgroundResource {
  private final ConversionAdjustmentUploadServiceSettings settings;
  private final ConversionAdjustmentUploadServiceStub stub;

  /** Constructs an instance of ConversionAdjustmentUploadServiceClient with default settings. */
  public static final ConversionAdjustmentUploadServiceClient create() throws IOException {
    return create(ConversionAdjustmentUploadServiceSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of ConversionAdjustmentUploadServiceClient, using the given settings.
   * The channels are created based on the settings passed in, or defaults for any settings that are
   * not set.
   */
  public static final ConversionAdjustmentUploadServiceClient create(
      ConversionAdjustmentUploadServiceSettings settings) throws IOException {
    return new ConversionAdjustmentUploadServiceClient(settings);
  }

  /**
   * Constructs an instance of ConversionAdjustmentUploadServiceClient, using the given stub for
   * making calls. This is for advanced usage - prefer using
   * create(ConversionAdjustmentUploadServiceSettings).
   */
  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public static final ConversionAdjustmentUploadServiceClient create(
      ConversionAdjustmentUploadServiceStub stub) {
    return new ConversionAdjustmentUploadServiceClient(stub);
  }

  /**
   * Constructs an instance of ConversionAdjustmentUploadServiceClient, using the given settings.
   * This is protected so that it is easy to make a subclass, but otherwise, the static factory
   * methods should be preferred.
   */
  protected ConversionAdjustmentUploadServiceClient(
      ConversionAdjustmentUploadServiceSettings settings) throws IOException {
    this.settings = settings;
    this.stub =
        ((ConversionAdjustmentUploadServiceStubSettings) settings.getStubSettings()).createStub();
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  protected ConversionAdjustmentUploadServiceClient(ConversionAdjustmentUploadServiceStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final ConversionAdjustmentUploadServiceSettings getSettings() {
    return settings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public ConversionAdjustmentUploadServiceStub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Processes the given conversion adjustments.
   *
   * @param customer_id Required. The ID of the customer performing the upload.
   * @param conversion_adjustments Required. The conversion adjustments that are being uploaded.
   * @param partial_failure Required. If true, successful operations will be carried out and invalid
   *     operations will return errors. If false, all operations will be carried out in one
   *     transaction if and only if they are all valid. This should always be set to true. See
   *     https://developers.google.com/google-ads/api/docs/best-practices/partial-failures for more
   *     information about partial failure.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final UploadConversionAdjustmentsResponse uploadConversionAdjustments(
      String customerId, List<ConversionAdjustment> conversionAdjustments, boolean partialFailure) {
    UploadConversionAdjustmentsRequest request =
        UploadConversionAdjustmentsRequest.newBuilder()
            .setCustomerId(customerId)
            .addAllConversionAdjustments(conversionAdjustments)
            .setPartialFailure(partialFailure)
            .build();
    return uploadConversionAdjustments(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Processes the given conversion adjustments.
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final UploadConversionAdjustmentsResponse uploadConversionAdjustments(
      UploadConversionAdjustmentsRequest request) {
    return uploadConversionAdjustmentsCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Processes the given conversion adjustments.
   *
   * <p>Sample code:
   */
  public final UnaryCallable<
          UploadConversionAdjustmentsRequest, UploadConversionAdjustmentsResponse>
      uploadConversionAdjustmentsCallable() {
    return stub.uploadConversionAdjustmentsCallable();
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
