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

package com.google.ads.googleads.v19.services.stub;

import com.google.ads.googleads.v19.services.CreateProductLinkInvitationRequest;
import com.google.ads.googleads.v19.services.CreateProductLinkInvitationResponse;
import com.google.ads.googleads.v19.services.RemoveProductLinkInvitationRequest;
import com.google.ads.googleads.v19.services.RemoveProductLinkInvitationResponse;
import com.google.ads.googleads.v19.services.UpdateProductLinkInvitationRequest;
import com.google.ads.googleads.v19.services.UpdateProductLinkInvitationResponse;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.UnaryCallable;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Base stub class for the ProductLinkInvitationService service API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by gapic-generator-java")
public abstract class ProductLinkInvitationServiceStub implements BackgroundResource {

  public UnaryCallable<CreateProductLinkInvitationRequest, CreateProductLinkInvitationResponse>
      createProductLinkInvitationCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: createProductLinkInvitationCallable()");
  }

  public UnaryCallable<UpdateProductLinkInvitationRequest, UpdateProductLinkInvitationResponse>
      updateProductLinkInvitationCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: updateProductLinkInvitationCallable()");
  }

  public UnaryCallable<RemoveProductLinkInvitationRequest, RemoveProductLinkInvitationResponse>
      removeProductLinkInvitationCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: removeProductLinkInvitationCallable()");
  }

  @Override
  public abstract void close();
}
