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

package com.google.ads.googleads.v20.services.stub;

import com.google.ads.googleads.v20.services.CreateProductLinkRequest;
import com.google.ads.googleads.v20.services.CreateProductLinkResponse;
import com.google.ads.googleads.v20.services.RemoveProductLinkRequest;
import com.google.ads.googleads.v20.services.RemoveProductLinkResponse;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.UnaryCallable;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Base stub class for the ProductLinkService service API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by gapic-generator-java")
public abstract class ProductLinkServiceStub implements BackgroundResource {

  public UnaryCallable<CreateProductLinkRequest, CreateProductLinkResponse>
      createProductLinkCallable() {
    throw new UnsupportedOperationException("Not implemented: createProductLinkCallable()");
  }

  public UnaryCallable<RemoveProductLinkRequest, RemoveProductLinkResponse>
      removeProductLinkCallable() {
    throw new UnsupportedOperationException("Not implemented: removeProductLinkCallable()");
  }

  @Override
  public abstract void close();
}
