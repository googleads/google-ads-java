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
package com.google.ads.googleads.v3.services;

import com.google.ads.googleads.v3.enums.MonthOfYearEnum;
import com.google.ads.googleads.v3.services.stub.InvoiceServiceStub;
import com.google.ads.googleads.v3.services.stub.InvoiceServiceStubSettings;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.UnaryCallable;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND SERVICE
/**
 * Service Description: A service to fetch invoices issued for a billing setup during a given month.
 *
 * <p>This class provides the ability to make remote calls to the backing service through method
 * calls that map to API methods. Sample code to get started:
 *
 * <pre>
 * <code>
 * try (InvoiceServiceClient invoiceServiceClient = InvoiceServiceClient.create()) {
 *   String customerId = "";
 *   String billingSetup = "";
 *   String issueYear = "";
 *   MonthOfYearEnum.MonthOfYear issueMonth = MonthOfYearEnum.MonthOfYear.UNSPECIFIED;
 *   ListInvoicesResponse response = invoiceServiceClient.listInvoices(customerId, billingSetup, issueYear, issueMonth);
 * }
 * </code>
 * </pre>
 *
 * <p>Note: close() needs to be called on the invoiceServiceClient object to clean up resources such
 * as threads. In the example above, try-with-resources is used, which automatically calls close().
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
 * <p>This class can be customized by passing in a custom instance of InvoiceServiceSettings to
 * create(). For example:
 *
 * <p>To customize credentials:
 *
 * <pre>
 * <code>
 * InvoiceServiceSettings invoiceServiceSettings =
 *     InvoiceServiceSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * InvoiceServiceClient invoiceServiceClient =
 *     InvoiceServiceClient.create(invoiceServiceSettings);
 * </code>
 * </pre>
 *
 * To customize the endpoint:
 *
 * <pre>
 * <code>
 * InvoiceServiceSettings invoiceServiceSettings =
 *     InvoiceServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
 * InvoiceServiceClient invoiceServiceClient =
 *     InvoiceServiceClient.create(invoiceServiceSettings);
 * </code>
 * </pre>
 */
@Generated("by gapic-generator")
@BetaApi
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
   * for advanced usage - prefer to use InvoiceServiceSettings}.
   */
  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
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

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  protected InvoiceServiceClient(InvoiceServiceStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final InvoiceServiceSettings getSettings() {
    return settings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public InvoiceServiceStub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns all invoices associated with a billing setup, for a given month.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (InvoiceServiceClient invoiceServiceClient = InvoiceServiceClient.create()) {
   *   String customerId = "";
   *   String billingSetup = "";
   *   String issueYear = "";
   *   MonthOfYearEnum.MonthOfYear issueMonth = MonthOfYearEnum.MonthOfYear.UNSPECIFIED;
   *   ListInvoicesResponse response = invoiceServiceClient.listInvoices(customerId, billingSetup, issueYear, issueMonth);
   * }
   * </code></pre>
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

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns all invoices associated with a billing setup, for a given month.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (InvoiceServiceClient invoiceServiceClient = InvoiceServiceClient.create()) {
   *   String customerId = "";
   *   String billingSetup = "";
   *   String issueYear = "";
   *   MonthOfYearEnum.MonthOfYear issueMonth = MonthOfYearEnum.MonthOfYear.UNSPECIFIED;
   *   ListInvoicesRequest request = ListInvoicesRequest.newBuilder()
   *     .setCustomerId(customerId)
   *     .setBillingSetup(billingSetup)
   *     .setIssueYear(issueYear)
   *     .setIssueMonth(issueMonth)
   *     .build();
   *   ListInvoicesResponse response = invoiceServiceClient.listInvoices(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListInvoicesResponse listInvoices(ListInvoicesRequest request) {
    return listInvoicesCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns all invoices associated with a billing setup, for a given month.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (InvoiceServiceClient invoiceServiceClient = InvoiceServiceClient.create()) {
   *   String customerId = "";
   *   String billingSetup = "";
   *   String issueYear = "";
   *   MonthOfYearEnum.MonthOfYear issueMonth = MonthOfYearEnum.MonthOfYear.UNSPECIFIED;
   *   ListInvoicesRequest request = ListInvoicesRequest.newBuilder()
   *     .setCustomerId(customerId)
   *     .setBillingSetup(billingSetup)
   *     .setIssueYear(issueYear)
   *     .setIssueMonth(issueMonth)
   *     .build();
   *   ApiFuture&lt;ListInvoicesResponse&gt; future = invoiceServiceClient.listInvoicesCallable().futureCall(request);
   *   // Do something
   *   ListInvoicesResponse response = future.get();
   * }
   * </code></pre>
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
