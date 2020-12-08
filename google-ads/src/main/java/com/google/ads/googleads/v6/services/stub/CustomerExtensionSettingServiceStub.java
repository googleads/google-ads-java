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

package com.google.ads.googleads.v6.services.stub;

import com.google.ads.googleads.v6.resources.CustomerExtensionSetting;
import com.google.ads.googleads.v6.services.GetCustomerExtensionSettingRequest;
import com.google.ads.googleads.v6.services.MutateCustomerExtensionSettingsRequest;
import com.google.ads.googleads.v6.services.MutateCustomerExtensionSettingsResponse;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.UnaryCallable;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Base stub class for the CustomerExtensionSettingService service API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by gapic-generator")
public abstract class CustomerExtensionSettingServiceStub implements BackgroundResource {

  public UnaryCallable<GetCustomerExtensionSettingRequest, CustomerExtensionSetting>
      getCustomerExtensionSettingCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: getCustomerExtensionSettingCallable()");
  }

  public UnaryCallable<
          MutateCustomerExtensionSettingsRequest, MutateCustomerExtensionSettingsResponse>
      mutateCustomerExtensionSettingsCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: mutateCustomerExtensionSettingsCallable()");
  }

  @Override
  public abstract void close();
}
