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

import com.google.ads.googleads.v6.resources.AdParameter;
import com.google.ads.googleads.v6.services.GetAdParameterRequest;
import com.google.ads.googleads.v6.services.MutateAdParametersRequest;
import com.google.ads.googleads.v6.services.MutateAdParametersResponse;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.UnaryCallable;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Base stub class for the AdParameterService service API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by gapic-generator")
public abstract class AdParameterServiceStub implements BackgroundResource {

  public UnaryCallable<GetAdParameterRequest, AdParameter> getAdParameterCallable() {
    throw new UnsupportedOperationException("Not implemented: getAdParameterCallable()");
  }

  public UnaryCallable<MutateAdParametersRequest, MutateAdParametersResponse>
      mutateAdParametersCallable() {
    throw new UnsupportedOperationException("Not implemented: mutateAdParametersCallable()");
  }

  @Override
  public abstract void close();
}
