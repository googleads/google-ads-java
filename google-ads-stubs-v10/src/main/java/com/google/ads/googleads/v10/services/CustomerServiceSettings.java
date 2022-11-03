/*
 * Copyright 2022 Google LLC
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

package com.google.ads.googleads.v10.services;

import com.google.ads.googleads.v10.services.stub.CustomerServiceStubSettings;
import com.google.api.core.ApiFunction;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.GoogleCredentialsProvider;
import com.google.api.gax.core.InstantiatingExecutorProvider;
import com.google.api.gax.grpc.InstantiatingGrpcChannelProvider;
import com.google.api.gax.rpc.ApiClientHeaderProvider;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.ClientSettings;
import com.google.api.gax.rpc.StubSettings;
import com.google.api.gax.rpc.TransportChannelProvider;
import com.google.api.gax.rpc.UnaryCallSettings;
import java.io.IOException;
import java.util.List;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Settings class to configure an instance of {@link CustomerServiceClient}.
 *
 * <p>The default instance has everything set to sensible defaults:
 *
 * <ul>
 *   <li>The default service address (googleads.googleapis.com) and default port (443) are used.
 *   <li>Credentials are acquired automatically through Application Default Credentials.
 *   <li>Retries are configured for idempotent methods but not for non-idempotent methods.
 * </ul>
 *
 * <p>The builder of this class is recursive, so contained classes are themselves builders. When
 * build() is called, the tree of builders is called to create the complete settings object.
 *
 * <p>For example, to set the total timeout of mutateCustomer to 30 seconds:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * CustomerServiceSettings.Builder customerServiceSettingsBuilder =
 *     CustomerServiceSettings.newBuilder();
 * customerServiceSettingsBuilder
 *     .mutateCustomerSettings()
 *     .setRetrySettings(
 *         customerServiceSettingsBuilder.mutateCustomerSettings().getRetrySettings().toBuilder()
 *             .setTotalTimeout(Duration.ofSeconds(30))
 *             .build());
 * CustomerServiceSettings customerServiceSettings = customerServiceSettingsBuilder.build();
 * }</pre>
 */
@Generated("by gapic-generator-java")
public class CustomerServiceSettings extends ClientSettings<CustomerServiceSettings> {

  /** Returns the object with the settings used for calls to mutateCustomer. */
  public UnaryCallSettings<MutateCustomerRequest, MutateCustomerResponse> mutateCustomerSettings() {
    return ((CustomerServiceStubSettings) getStubSettings()).mutateCustomerSettings();
  }

  /** Returns the object with the settings used for calls to listAccessibleCustomers. */
  public UnaryCallSettings<ListAccessibleCustomersRequest, ListAccessibleCustomersResponse>
      listAccessibleCustomersSettings() {
    return ((CustomerServiceStubSettings) getStubSettings()).listAccessibleCustomersSettings();
  }

  /** Returns the object with the settings used for calls to createCustomerClient. */
  public UnaryCallSettings<CreateCustomerClientRequest, CreateCustomerClientResponse>
      createCustomerClientSettings() {
    return ((CustomerServiceStubSettings) getStubSettings()).createCustomerClientSettings();
  }

  public static final CustomerServiceSettings create(CustomerServiceStubSettings stub)
      throws IOException {
    return new CustomerServiceSettings.Builder(stub.toBuilder()).build();
  }

  /** Returns a builder for the default ExecutorProvider for this service. */
  public static InstantiatingExecutorProvider.Builder defaultExecutorProviderBuilder() {
    return CustomerServiceStubSettings.defaultExecutorProviderBuilder();
  }

  /** Returns the default service endpoint. */
  public static String getDefaultEndpoint() {
    return CustomerServiceStubSettings.getDefaultEndpoint();
  }

  /** Returns the default service scopes. */
  public static List<String> getDefaultServiceScopes() {
    return CustomerServiceStubSettings.getDefaultServiceScopes();
  }

  /** Returns a builder for the default credentials for this service. */
  public static GoogleCredentialsProvider.Builder defaultCredentialsProviderBuilder() {
    return CustomerServiceStubSettings.defaultCredentialsProviderBuilder();
  }

  /** Returns a builder for the default ChannelProvider for this service. */
  public static InstantiatingGrpcChannelProvider.Builder defaultGrpcTransportProviderBuilder() {
    return CustomerServiceStubSettings.defaultGrpcTransportProviderBuilder();
  }

  public static TransportChannelProvider defaultTransportChannelProvider() {
    return CustomerServiceStubSettings.defaultTransportChannelProvider();
  }

  @BetaApi("The surface for customizing headers is not stable yet and may change in the future.")
  public static ApiClientHeaderProvider.Builder defaultApiClientHeaderProviderBuilder() {
    return CustomerServiceStubSettings.defaultApiClientHeaderProviderBuilder();
  }

  /** Returns a new builder for this class. */
  public static Builder newBuilder() {
    return Builder.createDefault();
  }

  /** Returns a new builder for this class. */
  public static Builder newBuilder(ClientContext clientContext) {
    return new Builder(clientContext);
  }

  /** Returns a builder containing all the values of this settings class. */
  public Builder toBuilder() {
    return new Builder(this);
  }

  protected CustomerServiceSettings(Builder settingsBuilder) throws IOException {
    super(settingsBuilder);
  }

  /** Builder for CustomerServiceSettings. */
  public static class Builder extends ClientSettings.Builder<CustomerServiceSettings, Builder> {

    protected Builder() throws IOException {
      this(((ClientContext) null));
    }

    protected Builder(ClientContext clientContext) {
      super(CustomerServiceStubSettings.newBuilder(clientContext));
    }

    protected Builder(CustomerServiceSettings settings) {
      super(settings.getStubSettings().toBuilder());
    }

    protected Builder(CustomerServiceStubSettings.Builder stubSettings) {
      super(stubSettings);
    }

    private static Builder createDefault() {
      return new Builder(CustomerServiceStubSettings.newBuilder());
    }

    public CustomerServiceStubSettings.Builder getStubSettingsBuilder() {
      return ((CustomerServiceStubSettings.Builder) getStubSettings());
    }

    /**
     * Applies the given settings updater function to all of the unary API methods in this service.
     *
     * <p>Note: This method does not support applying settings to streaming methods.
     */
    public Builder applyToAllUnaryMethods(
        ApiFunction<UnaryCallSettings.Builder<?, ?>, Void> settingsUpdater) {
      super.applyToAllUnaryMethods(
          getStubSettingsBuilder().unaryMethodSettingsBuilders(), settingsUpdater);
      return this;
    }

    /** Returns the builder for the settings used for calls to mutateCustomer. */
    public UnaryCallSettings.Builder<MutateCustomerRequest, MutateCustomerResponse>
        mutateCustomerSettings() {
      return getStubSettingsBuilder().mutateCustomerSettings();
    }

    /** Returns the builder for the settings used for calls to listAccessibleCustomers. */
    public UnaryCallSettings.Builder<
            ListAccessibleCustomersRequest, ListAccessibleCustomersResponse>
        listAccessibleCustomersSettings() {
      return getStubSettingsBuilder().listAccessibleCustomersSettings();
    }

    /** Returns the builder for the settings used for calls to createCustomerClient. */
    public UnaryCallSettings.Builder<CreateCustomerClientRequest, CreateCustomerClientResponse>
        createCustomerClientSettings() {
      return getStubSettingsBuilder().createCustomerClientSettings();
    }

    @Override
    public CustomerServiceSettings build() throws IOException {
      return new CustomerServiceSettings(this);
    }
  }
}
