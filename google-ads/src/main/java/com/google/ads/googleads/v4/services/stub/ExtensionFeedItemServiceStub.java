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
package com.google.ads.googleads.v4.services.stub;

import com.google.ads.googleads.v4.resources.ExtensionFeedItem;
import com.google.ads.googleads.v4.services.GetExtensionFeedItemRequest;
import com.google.ads.googleads.v4.services.MutateExtensionFeedItemsRequest;
import com.google.ads.googleads.v4.services.MutateExtensionFeedItemsResponse;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.UnaryCallable;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS
/**
 * Base stub class for Google Ads API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by gapic-generator")
@BetaApi("A restructuring of stub classes is planned, so this may break in the future")
public abstract class ExtensionFeedItemServiceStub implements BackgroundResource {

  public UnaryCallable<GetExtensionFeedItemRequest, ExtensionFeedItem>
      getExtensionFeedItemCallable() {
    throw new UnsupportedOperationException("Not implemented: getExtensionFeedItemCallable()");
  }

  public UnaryCallable<MutateExtensionFeedItemsRequest, MutateExtensionFeedItemsResponse>
      mutateExtensionFeedItemsCallable() {
    throw new UnsupportedOperationException("Not implemented: mutateExtensionFeedItemsCallable()");
  }

  @Override
  public abstract void close();
}
