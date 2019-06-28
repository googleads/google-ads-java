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

import com.google.ads.googleads.v1.resources.UserInterest;
import com.google.ads.googleads.v1.services.stub.UserInterestServiceStub;
import com.google.ads.googleads.v1.services.stub.UserInterestServiceStubSettings;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.api.pathtemplate.PathTemplate;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND SERVICE
/**
 * Service Description: Service to fetch Google Ads User Interest.
 *
 * <p>This class provides the ability to make remote calls to the backing service through method
 * calls that map to API methods. Sample code to get started:
 *
 * <pre>
 * <code>
 * try (UserInterestServiceClient userInterestServiceClient = UserInterestServiceClient.create()) {
 *   String formattedResourceName = UserInterestServiceClient.formatUserInterestName("[CUSTOMER]", "[USER_INTEREST]");
 *   UserInterest response = userInterestServiceClient.getUserInterest(formattedResourceName);
 * }
 * </code>
 * </pre>
 *
 * <p>Note: close() needs to be called on the userInterestServiceClient object to clean up resources
 * such as threads. In the example above, try-with-resources is used, which automatically calls
 * close().
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
 * <p>This class can be customized by passing in a custom instance of UserInterestServiceSettings to
 * create(). For example:
 *
 * <p>To customize credentials:
 *
 * <pre>
 * <code>
 * UserInterestServiceSettings userInterestServiceSettings =
 *     UserInterestServiceSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * UserInterestServiceClient userInterestServiceClient =
 *     UserInterestServiceClient.create(userInterestServiceSettings);
 * </code>
 * </pre>
 *
 * To customize the endpoint:
 *
 * <pre>
 * <code>
 * UserInterestServiceSettings userInterestServiceSettings =
 *     UserInterestServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
 * UserInterestServiceClient userInterestServiceClient =
 *     UserInterestServiceClient.create(userInterestServiceSettings);
 * </code>
 * </pre>
 */
@Generated("by gapic-generator")
@BetaApi
public class UserInterestServiceClient implements BackgroundResource {
  private final UserInterestServiceSettings settings;
  private final UserInterestServiceStub stub;

  private static final PathTemplate USER_INTEREST_PATH_TEMPLATE =
      PathTemplate.createWithoutUrlEncoding("customers/{customer}/userInterests/{user_interest}");

  /**
   * Formats a string containing the fully-qualified path to represent a user_interest resource.
   *
   * @deprecated Use the {@link UserInterestName} class instead.
   */
  @Deprecated
  public static final String formatUserInterestName(String customer, String userInterest) {
    return USER_INTEREST_PATH_TEMPLATE.instantiate(
        "customer", customer,
        "user_interest", userInterest);
  }

  /**
   * Parses the customer from the given fully-qualified path which represents a user_interest
   * resource.
   *
   * @deprecated Use the {@link UserInterestName} class instead.
   */
  @Deprecated
  public static final String parseCustomerFromUserInterestName(String userInterestName) {
    return USER_INTEREST_PATH_TEMPLATE.parse(userInterestName).get("customer");
  }

  /**
   * Parses the user_interest from the given fully-qualified path which represents a user_interest
   * resource.
   *
   * @deprecated Use the {@link UserInterestName} class instead.
   */
  @Deprecated
  public static final String parseUserInterestFromUserInterestName(String userInterestName) {
    return USER_INTEREST_PATH_TEMPLATE.parse(userInterestName).get("user_interest");
  }

  /** Constructs an instance of UserInterestServiceClient with default settings. */
  public static final UserInterestServiceClient create() throws IOException {
    return create(UserInterestServiceSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of UserInterestServiceClient, using the given settings. The channels are
   * created based on the settings passed in, or defaults for any settings that are not set.
   */
  public static final UserInterestServiceClient create(UserInterestServiceSettings settings)
      throws IOException {
    return new UserInterestServiceClient(settings);
  }

  /**
   * Constructs an instance of UserInterestServiceClient, using the given stub for making calls.
   * This is for advanced usage - prefer to use UserInterestServiceSettings}.
   */
  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public static final UserInterestServiceClient create(UserInterestServiceStub stub) {
    return new UserInterestServiceClient(stub);
  }

  /**
   * Constructs an instance of UserInterestServiceClient, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected UserInterestServiceClient(UserInterestServiceSettings settings) throws IOException {
    this.settings = settings;
    this.stub = ((UserInterestServiceStubSettings) settings.getStubSettings()).createStub();
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  protected UserInterestServiceClient(UserInterestServiceStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final UserInterestServiceSettings getSettings() {
    return settings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public UserInterestServiceStub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the requested user interest in full detail
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (UserInterestServiceClient userInterestServiceClient = UserInterestServiceClient.create()) {
   *   String formattedResourceName = UserInterestServiceClient.formatUserInterestName("[CUSTOMER]", "[USER_INTEREST]");
   *   UserInterest response = userInterestServiceClient.getUserInterest(formattedResourceName);
   * }
   * </code></pre>
   *
   * @param resourceName Resource name of the UserInterest to fetch.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final UserInterest getUserInterest(String resourceName) {
    USER_INTEREST_PATH_TEMPLATE.validate(resourceName, "getUserInterest");
    GetUserInterestRequest request =
        GetUserInterestRequest.newBuilder().setResourceName(resourceName).build();
    return getUserInterest(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the requested user interest in full detail
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (UserInterestServiceClient userInterestServiceClient = UserInterestServiceClient.create()) {
   *   String formattedResourceName = UserInterestServiceClient.formatUserInterestName("[CUSTOMER]", "[USER_INTEREST]");
   *   GetUserInterestRequest request = GetUserInterestRequest.newBuilder()
   *     .setResourceName(formattedResourceName)
   *     .build();
   *   UserInterest response = userInterestServiceClient.getUserInterest(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final UserInterest getUserInterest(GetUserInterestRequest request) {
    return getUserInterestCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the requested user interest in full detail
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (UserInterestServiceClient userInterestServiceClient = UserInterestServiceClient.create()) {
   *   String formattedResourceName = UserInterestServiceClient.formatUserInterestName("[CUSTOMER]", "[USER_INTEREST]");
   *   GetUserInterestRequest request = GetUserInterestRequest.newBuilder()
   *     .setResourceName(formattedResourceName)
   *     .build();
   *   ApiFuture&lt;UserInterest&gt; future = userInterestServiceClient.getUserInterestCallable().futureCall(request);
   *   // Do something
   *   UserInterest response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<GetUserInterestRequest, UserInterest> getUserInterestCallable() {
    return stub.getUserInterestCallable();
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
