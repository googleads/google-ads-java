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

package com.google.ads.googleads.v14.services;

import com.google.ads.googleads.v14.enums.MonthOfYearEnum;
import com.google.ads.googleads.v14.services.stub.InvoiceServiceStub;
import com.google.ads.googleads.v14.services.stub.InvoiceServiceStubSettings;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.UnaryCallable;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Service Description: A service to fetch invoices issued for a billing setup during a given month.
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
 * try (InvoiceServiceClient invoiceServiceClient = InvoiceServiceClient.create()) {
 *   String customerId = "customerId-1581184615";
 *   String billingSetup = "billingSetup-1435075390";
 *   String issueYear = "issueYear184914102";
 *   MonthOfYearEnum.MonthOfYear issueMonth = MonthOfYearEnum.MonthOfYear.forNumber(0);
 *   ListInvoicesResponse response =
 *       invoiceServiceClient.listInvoices(customerId, billingSetup, issueYear, issueMonth);
 * }
 * }</pre>
 *
 * <p>Note: close() needs to be called on the InvoiceServiceClient object to clean up resources such
 * as threads. In the example above, try-with-resources is used, which automatically calls close().
 *
 * <table>
 *    <caption>Methods</caption>
 *    <tr>
 *      <th>Method</th>
 *      <th>Description</th>
 *      <th>Method Variants</th>
 *    </tr>
 *    <tr>
 *      <td><p> ListInvoices</td>
 *      <td><p> Returns all invoices associated with a billing setup, for a given month.
 * <p>  List of thrown errors:   [AuthenticationError]()   [AuthorizationError]()   [FieldError]()   [HeaderError]()   [InternalError]()   [InvoiceError]()   [QuotaError]()   [RequestError]()</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> listInvoices(ListInvoicesRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> listInvoices(String customerId, String billingSetup, String issueYear, MonthOfYearEnum.MonthOfYear issueMonth)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> listInvoicesCallable()
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
 * <p>This class can be customized by passing in a custom instance of InvoiceServiceSettings to
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
 * InvoiceServiceSettings invoiceServiceSettings =
 *     InvoiceServiceSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * InvoiceServiceClient invoiceServiceClient = InvoiceServiceClient.create(invoiceServiceSettings);
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
 * InvoiceServiceSettings invoiceServiceSettings =
 *     InvoiceServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
 * InvoiceServiceClient invoiceServiceClient = InvoiceServiceClient.create(invoiceServiceSettings);
 * }</pre>
 *
 * <p>Please refer to the GitHub repository's samples for more quickstart code snippets.
 */
@Generated("by gapic-generator-java")
public class InvoiceServiceClient implements BackgroundResource {
  private final InvoiceServiceSettings settings;
  private final InvoiceServiceStub stub;

  /** Constructs an instance of InvoiceServiceClient with default settings. */
  public static final InvoiceServiceClient create() throws IOException {
    return create(InvoiceServiceSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of InvoiceServiceClient, using the given settings. The channels are
   * created based on the settings passed in, or defaults for any settings that are not set.
   */
  public static final InvoiceServiceClient create(InvoiceServiceSettings settings)
      throws IOException {
    return new InvoiceServiceClient(settings);
  }

  /**
   * Constructs an instance of InvoiceServiceClient, using the given stub for making calls. This is
   * for advanced usage - prefer using create(InvoiceServiceSettings).
   */
  public static final InvoiceServiceClient create(InvoiceServiceStub stub) {
    return new InvoiceServiceClient(stub);
  }

  /**
   * Constructs an instance of InvoiceServiceClient, using the given settings. This is protected so
   * that it is easy to make a subclass, but otherwise, the static factory methods should be
   * preferred.
   */
  protected InvoiceServiceClient(InvoiceServiceSettings settings) throws IOException {
    this.settings = settings;
    this.stub = ((InvoiceServiceStubSettings) settings.getStubSettings()).createStub();
  }

  protected InvoiceServiceClient(InvoiceServiceStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final InvoiceServiceSettings getSettings() {
    return settings;
  }

  public InvoiceServiceStub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns all invoices associated with a billing setup, for a given month.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]() [FieldError]()
   * [HeaderError]() [InternalError]() [InvoiceError]() [QuotaError]() [RequestError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (InvoiceServiceClient invoiceServiceClient = InvoiceServiceClient.create()) {
   *   String customerId = "customerId-1581184615";
   *   String billingSetup = "billingSetup-1435075390";
   *   String issueYear = "issueYear184914102";
   *   MonthOfYearEnum.MonthOfYear issueMonth = MonthOfYearEnum.MonthOfYear.forNumber(0);
   *   ListInvoicesResponse response =
   *       invoiceServiceClient.listInvoices(customerId, billingSetup, issueYear, issueMonth);
   * }
   * }</pre>
   *
   * @param customerId Required. The ID of the customer to fetch invoices for.
   * @param billingSetup Required. The billing setup resource name of the requested invoices.
   *     <p>`customers/{customer_id}/billingSetups/{billing_setup_id}`
   * @param issueYear Required. The issue year to retrieve invoices, in yyyy format. Only invoices
   *     issued in 2019 or later can be retrieved.
   * @param issueMonth Required. The issue month to retrieve invoices.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListInvoicesResponse listInvoices(
      String customerId,
      String billingSetup,
      String issueYear,
      MonthOfYearEnum.MonthOfYear issueMonth) {
    ListInvoicesRequest request =
        ListInvoicesRequest.newBuilder()
            .setCustomerId(customerId)
            .setBillingSetup(billingSetup)
            .setIssueYear(issueYear)
            .setIssueMonth(issueMonth)
            .build();
    return listInvoices(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns all invoices associated with a billing setup, for a given month.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]() [FieldError]()
   * [HeaderError]() [InternalError]() [InvoiceError]() [QuotaError]() [RequestError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (InvoiceServiceClient invoiceServiceClient = InvoiceServiceClient.create()) {
   *   ListInvoicesRequest request =
   *       ListInvoicesRequest.newBuilder()
   *           .setCustomerId("customerId-1581184615")
   *           .setBillingSetup("billingSetup-1435075390")
   *           .setIssueYear("issueYear184914102")
   *           .build();
   *   ListInvoicesResponse response = invoiceServiceClient.listInvoices(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListInvoicesResponse listInvoices(ListInvoicesRequest request) {
    return listInvoicesCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns all invoices associated with a billing setup, for a given month.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]() [FieldError]()
   * [HeaderError]() [InternalError]() [InvoiceError]() [QuotaError]() [RequestError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (InvoiceServiceClient invoiceServiceClient = InvoiceServiceClient.create()) {
   *   ListInvoicesRequest request =
   *       ListInvoicesRequest.newBuilder()
   *           .setCustomerId("customerId-1581184615")
   *           .setBillingSetup("billingSetup-1435075390")
   *           .setIssueYear("issueYear184914102")
   *           .build();
   *   ApiFuture<ListInvoicesResponse> future =
   *       invoiceServiceClient.listInvoicesCallable().futureCall(request);
   *   // Do something.
   *   ListInvoicesResponse response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<ListInvoicesRequest, ListInvoicesResponse> listInvoicesCallable() {
    return stub.listInvoicesCallable();
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
