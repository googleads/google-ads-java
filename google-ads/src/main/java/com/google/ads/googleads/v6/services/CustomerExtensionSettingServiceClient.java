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

import com.google.ads.googleads.v6.resources.CustomerExtensionSetting;
import com.google.ads.googleads.v6.resources.CustomerExtensionSettingName;
import com.google.ads.googleads.v6.services.stub.CustomerExtensionSettingServiceStub;
import com.google.ads.googleads.v6.services.stub.CustomerExtensionSettingServiceStubSettings;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.UnaryCallable;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Service Description: Service to manage customer extension settings.
 *
 * <p>This class provides the ability to make remote calls to the backing service through method
 * calls that map to API methods. Sample code to get started:
 *
 * <p>Note: close() needs to be called on the CustomerExtensionSettingServiceClient object to clean
 * up resources such as threads. In the example above, try-with-resources is used, which
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
 * CustomerExtensionSettingServiceSettings to create(). For example:
 *
 * <p>To customize credentials:
 *
 * <pre>{@code
 * CustomerExtensionSettingServiceSettings customerExtensionSettingServiceSettings =
 *     CustomerExtensionSettingServiceSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * CustomerExtensionSettingServiceClient customerExtensionSettingServiceClient =
 *     CustomerExtensionSettingServiceClient.create(customerExtensionSettingServiceSettings);
 * }</pre>
 *
 * <p>To customize the endpoint:
 *
 * <pre>{@code
 * CustomerExtensionSettingServiceSettings customerExtensionSettingServiceSettings =
 *     CustomerExtensionSettingServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
 * CustomerExtensionSettingServiceClient customerExtensionSettingServiceClient =
 *     CustomerExtensionSettingServiceClient.create(customerExtensionSettingServiceSettings);
 * }</pre>
 *
 * <p>Please refer to the GitHub repository's samples for more quickstart code snippets.
 */
@BetaApi
@Generated("by gapic-generator")
public class CustomerExtensionSettingServiceClient implements BackgroundResource {
  private final CustomerExtensionSettingServiceSettings settings;
  private final CustomerExtensionSettingServiceStub stub;

  /** Constructs an instance of CustomerExtensionSettingServiceClient with default settings. */
  public static final CustomerExtensionSettingServiceClient create() throws IOException {
    return create(CustomerExtensionSettingServiceSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of CustomerExtensionSettingServiceClient, using the given settings. The
   * channels are created based on the settings passed in, or defaults for any settings that are not
   * set.
   */
  public static final CustomerExtensionSettingServiceClient create(
      CustomerExtensionSettingServiceSettings settings) throws IOException {
    return new CustomerExtensionSettingServiceClient(settings);
  }

  /**
   * Constructs an instance of CustomerExtensionSettingServiceClient, using the given stub for
   * making calls. This is for advanced usage - prefer using
   * create(CustomerExtensionSettingServiceSettings).
   */
  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public static final CustomerExtensionSettingServiceClient create(
      CustomerExtensionSettingServiceStub stub) {
    return new CustomerExtensionSettingServiceClient(stub);
  }

  /**
   * Constructs an instance of CustomerExtensionSettingServiceClient, using the given settings. This
   * is protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected CustomerExtensionSettingServiceClient(CustomerExtensionSettingServiceSettings settings)
      throws IOException {
    this.settings = settings;
    this.stub =
        ((CustomerExtensionSettingServiceStubSettings) settings.getStubSettings()).createStub();
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  protected CustomerExtensionSettingServiceClient(CustomerExtensionSettingServiceStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final CustomerExtensionSettingServiceSettings getSettings() {
    return settings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public CustomerExtensionSettingServiceStub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the requested customer extension setting in full detail.
   *
   * @param resource_name Required. The resource name of the customer extension setting to fetch.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final CustomerExtensionSetting getCustomerExtensionSetting(
      CustomerExtensionSettingName resourceName) {
    GetCustomerExtensionSettingRequest request =
        GetCustomerExtensionSettingRequest.newBuilder()
            .setResourceName(resourceName == null ? null : resourceName.toString())
            .build();
    return getCustomerExtensionSetting(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the requested customer extension setting in full detail.
   *
   * @param resource_name Required. The resource name of the customer extension setting to fetch.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final CustomerExtensionSetting getCustomerExtensionSetting(String resourceName) {
    GetCustomerExtensionSettingRequest request =
        GetCustomerExtensionSettingRequest.newBuilder().setResourceName(resourceName).build();
    return getCustomerExtensionSetting(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the requested customer extension setting in full detail.
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final CustomerExtensionSetting getCustomerExtensionSetting(
      GetCustomerExtensionSettingRequest request) {
    return getCustomerExtensionSettingCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the requested customer extension setting in full detail.
   *
   * <p>Sample code:
   */
  public final UnaryCallable<GetCustomerExtensionSettingRequest, CustomerExtensionSetting>
      getCustomerExtensionSettingCallable() {
    return stub.getCustomerExtensionSettingCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates, updates, or removes customer extension settings. Operation statuses are returned.
   *
   * @param customer_id Required. The ID of the customer whose customer extension settings are being
   *     modified.
   * @param operations Required. The list of operations to perform on individual customer extension
   *     settings.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MutateCustomerExtensionSettingsResponse mutateCustomerExtensionSettings(
      String customerId, List<CustomerExtensionSettingOperation> operations) {
    MutateCustomerExtensionSettingsRequest request =
        MutateCustomerExtensionSettingsRequest.newBuilder()
            .setCustomerId(customerId)
            .addAllOperations(operations)
            .build();
    return mutateCustomerExtensionSettings(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates, updates, or removes customer extension settings. Operation statuses are returned.
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MutateCustomerExtensionSettingsResponse mutateCustomerExtensionSettings(
      MutateCustomerExtensionSettingsRequest request) {
    return mutateCustomerExtensionSettingsCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates, updates, or removes customer extension settings. Operation statuses are returned.
   *
   * <p>Sample code:
   */
  public final UnaryCallable<
          MutateCustomerExtensionSettingsRequest, MutateCustomerExtensionSettingsResponse>
      mutateCustomerExtensionSettingsCallable() {
    return stub.mutateCustomerExtensionSettingsCallable();
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
