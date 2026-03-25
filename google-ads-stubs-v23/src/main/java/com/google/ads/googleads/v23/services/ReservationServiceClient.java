/*
 * Copyright 2026 Google LLC
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

package com.google.ads.googleads.v23.services;

import com.google.ads.googleads.v23.services.stub.ReservationServiceStub;
import com.google.ads.googleads.v23.services.stub.ReservationServiceStubSettings;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.UnaryCallable;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Service Description: Service for reservation related operations. This service is not publicly
 * available.
 *
 * <p>This class provides the ability to make remote calls to the backing service through method
 * calls that map to API methods. Sample code to get started:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * try (ReservationServiceClient reservationServiceClient = ReservationServiceClient.create()) {
 *   String customerId = "customerId-1581184615";
 *   QuoteCampaignsResponse response = reservationServiceClient.quoteCampaigns(customerId);
 * }
 * }</pre>
 *
 * <p>Note: close() needs to be called on the ReservationServiceClient object to clean up resources
 * such as threads. In the example above, try-with-resources is used, which automatically calls
 * close().
 *
 * <table>
 *    <caption>Methods</caption>
 *    <tr>
 *      <th>Method</th>
 *      <th>Description</th>
 *      <th>Method Variants</th>
 *    </tr>
 *    <tr>
 *      <td><p> QuoteCampaigns</td>
 *      <td><p> Proposes quotes for booking campaigns. This request can have a latency of 30 seconds.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> quoteCampaigns(QuoteCampaignsRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> quoteCampaigns(String customerId)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> quoteCampaignsCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> BookCampaigns</td>
 *      <td><p> Books the requested campaigns. This request can have a latency of 30 seconds.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> bookCampaigns(BookCampaignsRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> bookCampaigns(String customerId)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> bookCampaignsCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *  </table>
 *
 * <p>See the individual methods for example code.
 *
 * <p>Many parameters require resource names to be formatted in a particular way. To assist with
 * these names, this class includes a format method for each type of name, and additionally a parse
 * method to extract the individual identifiers contained within names that are returned.
 *
 * <p>This class can be customized by passing in a custom instance of ReservationServiceSettings to
 * create(). For example:
 *
 * <p>To customize credentials:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * ReservationServiceSettings reservationServiceSettings =
 *     ReservationServiceSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * ReservationServiceClient reservationServiceClient =
 *     ReservationServiceClient.create(reservationServiceSettings);
 * }</pre>
 *
 * <p>To customize the endpoint:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * ReservationServiceSettings reservationServiceSettings =
 *     ReservationServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
 * ReservationServiceClient reservationServiceClient =
 *     ReservationServiceClient.create(reservationServiceSettings);
 * }</pre>
 *
 * <p>Please refer to the GitHub repository's samples for more quickstart code snippets.
 */
@Generated("by gapic-generator-java")
public class ReservationServiceClient implements BackgroundResource {
  private final ReservationServiceSettings settings;
  private final ReservationServiceStub stub;

  /** Constructs an instance of ReservationServiceClient with default settings. */
  public static final ReservationServiceClient create() throws IOException {
    return create(ReservationServiceSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of ReservationServiceClient, using the given settings. The channels are
   * created based on the settings passed in, or defaults for any settings that are not set.
   */
  public static final ReservationServiceClient create(ReservationServiceSettings settings)
      throws IOException {
    return new ReservationServiceClient(settings);
  }

  /**
   * Constructs an instance of ReservationServiceClient, using the given stub for making calls. This
   * is for advanced usage - prefer using create(ReservationServiceSettings).
   */
  public static final ReservationServiceClient create(ReservationServiceStub stub) {
    return new ReservationServiceClient(stub);
  }

  /**
   * Constructs an instance of ReservationServiceClient, using the given settings. This is protected
   * so that it is easy to make a subclass, but otherwise, the static factory methods should be
   * preferred.
   */
  protected ReservationServiceClient(ReservationServiceSettings settings) throws IOException {
    this.settings = settings;
    this.stub = ((ReservationServiceStubSettings) settings.getStubSettings()).createStub();
  }

  protected ReservationServiceClient(ReservationServiceStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final ReservationServiceSettings getSettings() {
    return settings;
  }

  public ReservationServiceStub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Proposes quotes for booking campaigns. This request can have a latency of 30 seconds.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (ReservationServiceClient reservationServiceClient = ReservationServiceClient.create()) {
   *   String customerId = "customerId-1581184615";
   *   QuoteCampaignsResponse response = reservationServiceClient.quoteCampaigns(customerId);
   * }
   * }</pre>
   *
   * @param customerId Required. The ID of the customer making the request.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final QuoteCampaignsResponse quoteCampaigns(String customerId) {
    QuoteCampaignsRequest request =
        QuoteCampaignsRequest.newBuilder().setCustomerId(customerId).build();
    return quoteCampaigns(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Proposes quotes for booking campaigns. This request can have a latency of 30 seconds.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (ReservationServiceClient reservationServiceClient = ReservationServiceClient.create()) {
   *   QuoteCampaignsRequest request =
   *       QuoteCampaignsRequest.newBuilder()
   *           .setCustomerId("customerId-1581184615")
   *           .setOperation(QuoteCampaignsOperation.newBuilder().build())
   *           .build();
   *   QuoteCampaignsResponse response = reservationServiceClient.quoteCampaigns(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final QuoteCampaignsResponse quoteCampaigns(QuoteCampaignsRequest request) {
    return quoteCampaignsCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Proposes quotes for booking campaigns. This request can have a latency of 30 seconds.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (ReservationServiceClient reservationServiceClient = ReservationServiceClient.create()) {
   *   QuoteCampaignsRequest request =
   *       QuoteCampaignsRequest.newBuilder()
   *           .setCustomerId("customerId-1581184615")
   *           .setOperation(QuoteCampaignsOperation.newBuilder().build())
   *           .build();
   *   ApiFuture<QuoteCampaignsResponse> future =
   *       reservationServiceClient.quoteCampaignsCallable().futureCall(request);
   *   // Do something.
   *   QuoteCampaignsResponse response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<QuoteCampaignsRequest, QuoteCampaignsResponse>
      quoteCampaignsCallable() {
    return stub.quoteCampaignsCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Books the requested campaigns. This request can have a latency of 30 seconds.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (ReservationServiceClient reservationServiceClient = ReservationServiceClient.create()) {
   *   String customerId = "customerId-1581184615";
   *   BookCampaignsResponse response = reservationServiceClient.bookCampaigns(customerId);
   * }
   * }</pre>
   *
   * @param customerId Required. The ID of the customer making the request.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final BookCampaignsResponse bookCampaigns(String customerId) {
    BookCampaignsRequest request =
        BookCampaignsRequest.newBuilder().setCustomerId(customerId).build();
    return bookCampaigns(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Books the requested campaigns. This request can have a latency of 30 seconds.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (ReservationServiceClient reservationServiceClient = ReservationServiceClient.create()) {
   *   BookCampaignsRequest request =
   *       BookCampaignsRequest.newBuilder()
   *           .setCustomerId("customerId-1581184615")
   *           .setOperation(BookCampaignsOperation.newBuilder().build())
   *           .build();
   *   BookCampaignsResponse response = reservationServiceClient.bookCampaigns(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final BookCampaignsResponse bookCampaigns(BookCampaignsRequest request) {
    return bookCampaignsCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Books the requested campaigns. This request can have a latency of 30 seconds.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (ReservationServiceClient reservationServiceClient = ReservationServiceClient.create()) {
   *   BookCampaignsRequest request =
   *       BookCampaignsRequest.newBuilder()
   *           .setCustomerId("customerId-1581184615")
   *           .setOperation(BookCampaignsOperation.newBuilder().build())
   *           .build();
   *   ApiFuture<BookCampaignsResponse> future =
   *       reservationServiceClient.bookCampaignsCallable().futureCall(request);
   *   // Do something.
   *   BookCampaignsResponse response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<BookCampaignsRequest, BookCampaignsResponse> bookCampaignsCallable() {
    return stub.bookCampaignsCallable();
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
