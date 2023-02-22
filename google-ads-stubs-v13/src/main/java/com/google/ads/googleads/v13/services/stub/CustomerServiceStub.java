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

package com.google.ads.googleads.v13.services.stub;

import com.google.ads.googleads.v13.services.CreateCustomerClientRequest;
import com.google.ads.googleads.v13.services.CreateCustomerClientResponse;
import com.google.ads.googleads.v13.services.ListAccessibleCustomersRequest;
import com.google.ads.googleads.v13.services.ListAccessibleCustomersResponse;
import com.google.ads.googleads.v13.services.MutateCustomerRequest;
import com.google.ads.googleads.v13.services.MutateCustomerResponse;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.UnaryCallable;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Base stub class for the CustomerService service API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by gapic-generator-java")
public abstract class CustomerServiceStub implements BackgroundResource {

  public UnaryCallable<MutateCustomerRequest, MutateCustomerResponse> mutateCustomerCallable() {
    throw new UnsupportedOperationException("Not implemented: mutateCustomerCallable()");
  }

  public UnaryCallable<ListAccessibleCustomersRequest, ListAccessibleCustomersResponse>
      listAccessibleCustomersCallable() {
    throw new UnsupportedOperationException("Not implemented: listAccessibleCustomersCallable()");
  }

  public UnaryCallable<CreateCustomerClientRequest, CreateCustomerClientResponse>
      createCustomerClientCallable() {
    throw new UnsupportedOperationException("Not implemented: createCustomerClientCallable()");
  }

  @Override
  public abstract void close();
}
