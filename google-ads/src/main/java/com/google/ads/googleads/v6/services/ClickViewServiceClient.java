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

import com.google.ads.googleads.v6.resources.ClickView;
import com.google.ads.googleads.v6.resources.ClickViewName;
import com.google.ads.googleads.v6.services.stub.ClickViewServiceStub;
import com.google.ads.googleads.v6.services.stub.ClickViewServiceStubSettings;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.UnaryCallable;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Service Description: Service to fetch click views.
 *
 * <p>This class provides the ability to make remote calls to the backing service through method
 * calls that map to API methods. Sample code to get started:
 *
 * <p>Note: close() needs to be called on the ClickViewServiceClient object to clean up resources
 * such as threads. In the example above, try-with-resources is used, which automatically calls
 * close().
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
 * <p>This class can be customized by passing in a custom instance of ClickViewServiceSettings to
 * create(). For example:
 *
 * <p>To customize credentials:
 *
 * <pre>{@code
 * ClickViewServiceSettings clickViewServiceSettings =
 *     ClickViewServiceSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * ClickViewServiceClient clickViewServiceClient =
 *     ClickViewServiceClient.create(clickViewServiceSettings);
 * }</pre>
 *
 * <p>To customize the endpoint:
 *
 * <pre>{@code
 * ClickViewServiceSettings clickViewServiceSettings =
 *     ClickViewServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
 * ClickViewServiceClient clickViewServiceClient =
 *     ClickViewServiceClient.create(clickViewServiceSettings);
 * }</pre>
 *
 * <p>Please refer to the GitHub repository's samples for more quickstart code snippets.
 */
@BetaApi
@Generated("by gapic-generator")
public class ClickViewServiceClient implements BackgroundResource {
  private final ClickViewServiceSettings settings;
  private final ClickViewServiceStub stub;

  /** Constructs an instance of ClickViewServiceClient with default settings. */
  public static final ClickViewServiceClient create() throws IOException {
    return create(ClickViewServiceSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of ClickViewServiceClient, using the given settings. The channels are
   * created based on the settings passed in, or defaults for any settings that are not set.
   */
  public static final ClickViewServiceClient create(ClickViewServiceSettings settings)
      throws IOException {
    return new ClickViewServiceClient(settings);
  }

  /**
   * Constructs an instance of ClickViewServiceClient, using the given stub for making calls. This
   * is for advanced usage - prefer using create(ClickViewServiceSettings).
   */
  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public static final ClickViewServiceClient create(ClickViewServiceStub stub) {
    return new ClickViewServiceClient(stub);
  }

  /**
   * Constructs an instance of ClickViewServiceClient, using the given settings. This is protected
   * so that it is easy to make a subclass, but otherwise, the static factory methods should be
   * preferred.
   */
  protected ClickViewServiceClient(ClickViewServiceSettings settings) throws IOException {
    this.settings = settings;
    this.stub = ((ClickViewServiceStubSettings) settings.getStubSettings()).createStub();
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  protected ClickViewServiceClient(ClickViewServiceStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final ClickViewServiceSettings getSettings() {
    return settings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public ClickViewServiceStub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the requested click view in full detail.
   *
   * @param resource_name Required. The resource name of the click view to fetch.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ClickView getClickView(ClickViewName resourceName) {
    GetClickViewRequest request =
        GetClickViewRequest.newBuilder()
            .setResourceName(resourceName == null ? null : resourceName.toString())
            .build();
    return getClickView(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the requested click view in full detail.
   *
   * @param resource_name Required. The resource name of the click view to fetch.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ClickView getClickView(String resourceName) {
    GetClickViewRequest request =
        GetClickViewRequest.newBuilder().setResourceName(resourceName).build();
    return getClickView(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the requested click view in full detail.
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ClickView getClickView(GetClickViewRequest request) {
    return getClickViewCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the requested click view in full detail.
   *
   * <p>Sample code:
   */
  public final UnaryCallable<GetClickViewRequest, ClickView> getClickViewCallable() {
    return stub.getClickViewCallable();
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
