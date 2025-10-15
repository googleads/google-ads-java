/*
 * Copyright 2025 Google LLC
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

package com.google.ads.googleads.v22.services;

import com.google.ads.googleads.v22.services.stub.LocalServicesLeadServiceStub;
import com.google.ads.googleads.v22.services.stub.LocalServicesLeadServiceStubSettings;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.UnaryCallable;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Service Description: This service allows management of LocalServicesLead resources.
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
 * try (LocalServicesLeadServiceClient localServicesLeadServiceClient =
 *     LocalServicesLeadServiceClient.create()) {
 *   String customerId = "customerId-1581184615";
 *   List<Conversation> conversations = new ArrayList<>();
 *   AppendLeadConversationResponse response =
 *       localServicesLeadServiceClient.appendLeadConversation(customerId, conversations);
 * }
 * }</pre>
 *
 * <p>Note: close() needs to be called on the LocalServicesLeadServiceClient object to clean up
 * resources such as threads. In the example above, try-with-resources is used, which automatically
 * calls close().
 *
 * <table>
 *    <caption>Methods</caption>
 *    <tr>
 *      <th>Method</th>
 *      <th>Description</th>
 *      <th>Method Variants</th>
 *    </tr>
 *    <tr>
 *      <td><p> AppendLeadConversation</td>
 *      <td><p> RPC to append Local Services Lead Conversation resources to Local Services Lead resources.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> appendLeadConversation(AppendLeadConversationRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> appendLeadConversation(String customerId, List&lt;Conversation&gt; conversations)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> appendLeadConversationCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> ProvideLeadFeedback</td>
 *      <td><p> RPC to provide feedback on Local Services Lead resources.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> provideLeadFeedback(ProvideLeadFeedbackRequest request)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> provideLeadFeedbackCallable()
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
 * <p>This class can be customized by passing in a custom instance of
 * LocalServicesLeadServiceSettings to create(). For example:
 *
 * <p>To customize credentials:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * LocalServicesLeadServiceSettings localServicesLeadServiceSettings =
 *     LocalServicesLeadServiceSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * LocalServicesLeadServiceClient localServicesLeadServiceClient =
 *     LocalServicesLeadServiceClient.create(localServicesLeadServiceSettings);
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
 * LocalServicesLeadServiceSettings localServicesLeadServiceSettings =
 *     LocalServicesLeadServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
 * LocalServicesLeadServiceClient localServicesLeadServiceClient =
 *     LocalServicesLeadServiceClient.create(localServicesLeadServiceSettings);
 * }</pre>
 *
 * <p>Please refer to the GitHub repository's samples for more quickstart code snippets.
 */
@Generated("by gapic-generator-java")
public class LocalServicesLeadServiceClient implements BackgroundResource {
  private final LocalServicesLeadServiceSettings settings;
  private final LocalServicesLeadServiceStub stub;

  /** Constructs an instance of LocalServicesLeadServiceClient with default settings. */
  public static final LocalServicesLeadServiceClient create() throws IOException {
    return create(LocalServicesLeadServiceSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of LocalServicesLeadServiceClient, using the given settings. The
   * channels are created based on the settings passed in, or defaults for any settings that are not
   * set.
   */
  public static final LocalServicesLeadServiceClient create(
      LocalServicesLeadServiceSettings settings) throws IOException {
    return new LocalServicesLeadServiceClient(settings);
  }

  /**
   * Constructs an instance of LocalServicesLeadServiceClient, using the given stub for making
   * calls. This is for advanced usage - prefer using create(LocalServicesLeadServiceSettings).
   */
  public static final LocalServicesLeadServiceClient create(LocalServicesLeadServiceStub stub) {
    return new LocalServicesLeadServiceClient(stub);
  }

  /**
   * Constructs an instance of LocalServicesLeadServiceClient, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected LocalServicesLeadServiceClient(LocalServicesLeadServiceSettings settings)
      throws IOException {
    this.settings = settings;
    this.stub = ((LocalServicesLeadServiceStubSettings) settings.getStubSettings()).createStub();
  }

  protected LocalServicesLeadServiceClient(LocalServicesLeadServiceStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final LocalServicesLeadServiceSettings getSettings() {
    return settings;
  }

  public LocalServicesLeadServiceStub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * RPC to append Local Services Lead Conversation resources to Local Services Lead resources.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (LocalServicesLeadServiceClient localServicesLeadServiceClient =
   *     LocalServicesLeadServiceClient.create()) {
   *   String customerId = "customerId-1581184615";
   *   List<Conversation> conversations = new ArrayList<>();
   *   AppendLeadConversationResponse response =
   *       localServicesLeadServiceClient.appendLeadConversation(customerId, conversations);
   * }
   * }</pre>
   *
   * @param customerId Required. The Id of the customer which owns the leads onto which the
   *     conversations will be appended.
   * @param conversations Required. Conversations that are being appended.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final AppendLeadConversationResponse appendLeadConversation(
      String customerId, List<Conversation> conversations) {
    AppendLeadConversationRequest request =
        AppendLeadConversationRequest.newBuilder()
            .setCustomerId(customerId)
            .addAllConversations(conversations)
            .build();
    return appendLeadConversation(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * RPC to append Local Services Lead Conversation resources to Local Services Lead resources.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (LocalServicesLeadServiceClient localServicesLeadServiceClient =
   *     LocalServicesLeadServiceClient.create()) {
   *   AppendLeadConversationRequest request =
   *       AppendLeadConversationRequest.newBuilder()
   *           .setCustomerId("customerId-1581184615")
   *           .addAllConversations(new ArrayList<Conversation>())
   *           .build();
   *   AppendLeadConversationResponse response =
   *       localServicesLeadServiceClient.appendLeadConversation(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final AppendLeadConversationResponse appendLeadConversation(
      AppendLeadConversationRequest request) {
    return appendLeadConversationCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * RPC to append Local Services Lead Conversation resources to Local Services Lead resources.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (LocalServicesLeadServiceClient localServicesLeadServiceClient =
   *     LocalServicesLeadServiceClient.create()) {
   *   AppendLeadConversationRequest request =
   *       AppendLeadConversationRequest.newBuilder()
   *           .setCustomerId("customerId-1581184615")
   *           .addAllConversations(new ArrayList<Conversation>())
   *           .build();
   *   ApiFuture<AppendLeadConversationResponse> future =
   *       localServicesLeadServiceClient.appendLeadConversationCallable().futureCall(request);
   *   // Do something.
   *   AppendLeadConversationResponse response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<AppendLeadConversationRequest, AppendLeadConversationResponse>
      appendLeadConversationCallable() {
    return stub.appendLeadConversationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * RPC to provide feedback on Local Services Lead resources.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (LocalServicesLeadServiceClient localServicesLeadServiceClient =
   *     LocalServicesLeadServiceClient.create()) {
   *   ProvideLeadFeedbackRequest request =
   *       ProvideLeadFeedbackRequest.newBuilder()
   *           .setResourceName(
   *               LocalServicesLeadName.of("[CUSTOMER_ID]", "[LOCAL_SERVICES_LEAD_ID]").toString())
   *           .build();
   *   ProvideLeadFeedbackResponse response =
   *       localServicesLeadServiceClient.provideLeadFeedback(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ProvideLeadFeedbackResponse provideLeadFeedback(ProvideLeadFeedbackRequest request) {
    return provideLeadFeedbackCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * RPC to provide feedback on Local Services Lead resources.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (LocalServicesLeadServiceClient localServicesLeadServiceClient =
   *     LocalServicesLeadServiceClient.create()) {
   *   ProvideLeadFeedbackRequest request =
   *       ProvideLeadFeedbackRequest.newBuilder()
   *           .setResourceName(
   *               LocalServicesLeadName.of("[CUSTOMER_ID]", "[LOCAL_SERVICES_LEAD_ID]").toString())
   *           .build();
   *   ApiFuture<ProvideLeadFeedbackResponse> future =
   *       localServicesLeadServiceClient.provideLeadFeedbackCallable().futureCall(request);
   *   // Do something.
   *   ProvideLeadFeedbackResponse response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<ProvideLeadFeedbackRequest, ProvideLeadFeedbackResponse>
      provideLeadFeedbackCallable() {
    return stub.provideLeadFeedbackCallable();
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
