/*
 * Copyright 2020 Google LLC
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
package com.google.ads.googleads.v5.services;

import com.google.ads.googleads.v5.resources.Label;
import com.google.ads.googleads.v5.services.stub.LabelServiceStub;
import com.google.ads.googleads.v5.services.stub.LabelServiceStubSettings;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.UnaryCallable;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND SERVICE
/**
 * Service Description: Service to manage labels.
 *
 * <p>This class provides the ability to make remote calls to the backing service through method
 * calls that map to API methods. Sample code to get started:
 *
 * <pre>
 * <code>
 * try (LabelServiceClient labelServiceClient = LabelServiceClient.create()) {
 *   LabelName resourceName = LabelName.of("[CUSTOMER]", "[LABEL]");
 *   Label response = labelServiceClient.getLabel(resourceName);
 * }
 * </code>
 * </pre>
 *
 * <p>Note: close() needs to be called on the labelServiceClient object to clean up resources such
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
 * <p>This class can be customized by passing in a custom instance of LabelServiceSettings to
 * create(). For example:
 *
 * <p>To customize credentials:
 *
 * <pre>
 * <code>
 * LabelServiceSettings labelServiceSettings =
 *     LabelServiceSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * LabelServiceClient labelServiceClient =
 *     LabelServiceClient.create(labelServiceSettings);
 * </code>
 * </pre>
 *
 * To customize the endpoint:
 *
 * <pre>
 * <code>
 * LabelServiceSettings labelServiceSettings =
 *     LabelServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
 * LabelServiceClient labelServiceClient =
 *     LabelServiceClient.create(labelServiceSettings);
 * </code>
 * </pre>
 */
@Generated("by gapic-generator")
@BetaApi
public class LabelServiceClient implements BackgroundResource {
  private final LabelServiceSettings settings;
  private final LabelServiceStub stub;

  /** Constructs an instance of LabelServiceClient with default settings. */
  public static final LabelServiceClient create() throws IOException {
    return create(LabelServiceSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of LabelServiceClient, using the given settings. The channels are
   * created based on the settings passed in, or defaults for any settings that are not set.
   */
  public static final LabelServiceClient create(LabelServiceSettings settings) throws IOException {
    return new LabelServiceClient(settings);
  }

  /**
   * Constructs an instance of LabelServiceClient, using the given stub for making calls. This is
   * for advanced usage - prefer to use LabelServiceSettings}.
   */
  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public static final LabelServiceClient create(LabelServiceStub stub) {
    return new LabelServiceClient(stub);
  }

  /**
   * Constructs an instance of LabelServiceClient, using the given settings. This is protected so
   * that it is easy to make a subclass, but otherwise, the static factory methods should be
   * preferred.
   */
  protected LabelServiceClient(LabelServiceSettings settings) throws IOException {
    this.settings = settings;
    this.stub = ((LabelServiceStubSettings) settings.getStubSettings()).createStub();
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  protected LabelServiceClient(LabelServiceStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final LabelServiceSettings getSettings() {
    return settings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public LabelServiceStub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the requested label in full detail.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (LabelServiceClient labelServiceClient = LabelServiceClient.create()) {
   *   LabelName resourceName = LabelName.of("[CUSTOMER]", "[LABEL]");
   *   Label response = labelServiceClient.getLabel(resourceName);
   * }
   * </code></pre>
   *
   * @param resourceName Required. The resource name of the label to fetch.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Label getLabel(LabelName resourceName) {
    GetLabelRequest request =
        GetLabelRequest.newBuilder()
            .setResourceName(resourceName == null ? null : resourceName.toString())
            .build();
    return getLabel(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the requested label in full detail.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (LabelServiceClient labelServiceClient = LabelServiceClient.create()) {
   *   LabelName resourceName = LabelName.of("[CUSTOMER]", "[LABEL]");
   *   Label response = labelServiceClient.getLabel(resourceName.toString());
   * }
   * </code></pre>
   *
   * @param resourceName Required. The resource name of the label to fetch.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Label getLabel(String resourceName) {
    GetLabelRequest request = GetLabelRequest.newBuilder().setResourceName(resourceName).build();
    return getLabel(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the requested label in full detail.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (LabelServiceClient labelServiceClient = LabelServiceClient.create()) {
   *   LabelName resourceName = LabelName.of("[CUSTOMER]", "[LABEL]");
   *   GetLabelRequest request = GetLabelRequest.newBuilder()
   *     .setResourceName(resourceName.toString())
   *     .build();
   *   Label response = labelServiceClient.getLabel(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Label getLabel(GetLabelRequest request) {
    return getLabelCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the requested label in full detail.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (LabelServiceClient labelServiceClient = LabelServiceClient.create()) {
   *   LabelName resourceName = LabelName.of("[CUSTOMER]", "[LABEL]");
   *   GetLabelRequest request = GetLabelRequest.newBuilder()
   *     .setResourceName(resourceName.toString())
   *     .build();
   *   ApiFuture&lt;Label&gt; future = labelServiceClient.getLabelCallable().futureCall(request);
   *   // Do something
   *   Label response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<GetLabelRequest, Label> getLabelCallable() {
    return stub.getLabelCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates, updates, or removes labels. Operation statuses are returned.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (LabelServiceClient labelServiceClient = LabelServiceClient.create()) {
   *   String customerId = "";
   *   List&lt;LabelOperation&gt; operations = new ArrayList&lt;&gt;();
   *   MutateLabelsResponse response = labelServiceClient.mutateLabels(customerId, operations);
   * }
   * </code></pre>
   *
   * @param customerId Required. ID of the customer whose labels are being modified.
   * @param operations Required. The list of operations to perform on labels.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MutateLabelsResponse mutateLabels(
      String customerId, List<LabelOperation> operations) {
    MutateLabelsRequest request =
        MutateLabelsRequest.newBuilder()
            .setCustomerId(customerId)
            .addAllOperations(operations)
            .build();
    return mutateLabels(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates, updates, or removes labels. Operation statuses are returned.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (LabelServiceClient labelServiceClient = LabelServiceClient.create()) {
   *   String customerId = "";
   *   List&lt;LabelOperation&gt; operations = new ArrayList&lt;&gt;();
   *   MutateLabelsRequest request = MutateLabelsRequest.newBuilder()
   *     .setCustomerId(customerId)
   *     .addAllOperations(operations)
   *     .build();
   *   MutateLabelsResponse response = labelServiceClient.mutateLabels(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MutateLabelsResponse mutateLabels(MutateLabelsRequest request) {
    return mutateLabelsCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates, updates, or removes labels. Operation statuses are returned.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (LabelServiceClient labelServiceClient = LabelServiceClient.create()) {
   *   String customerId = "";
   *   List&lt;LabelOperation&gt; operations = new ArrayList&lt;&gt;();
   *   MutateLabelsRequest request = MutateLabelsRequest.newBuilder()
   *     .setCustomerId(customerId)
   *     .addAllOperations(operations)
   *     .build();
   *   ApiFuture&lt;MutateLabelsResponse&gt; future = labelServiceClient.mutateLabelsCallable().futureCall(request);
   *   // Do something
   *   MutateLabelsResponse response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<MutateLabelsRequest, MutateLabelsResponse> mutateLabelsCallable() {
    return stub.mutateLabelsCallable();
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
