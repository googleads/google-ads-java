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
package com.google.ads.googleads.v3.services.stub;

import com.google.ads.googleads.v3.resources.MerchantCenterLink;
import com.google.ads.googleads.v3.services.GetMerchantCenterLinkRequest;
import com.google.ads.googleads.v3.services.ListMerchantCenterLinksRequest;
import com.google.ads.googleads.v3.services.ListMerchantCenterLinksResponse;
import com.google.ads.googleads.v3.services.MutateMerchantCenterLinkRequest;
import com.google.ads.googleads.v3.services.MutateMerchantCenterLinkResponse;
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
public abstract class MerchantCenterLinkServiceStub implements BackgroundResource {

  public UnaryCallable<ListMerchantCenterLinksRequest, ListMerchantCenterLinksResponse>
      listMerchantCenterLinksCallable() {
    throw new UnsupportedOperationException("Not implemented: listMerchantCenterLinksCallable()");
  }

  public UnaryCallable<GetMerchantCenterLinkRequest, MerchantCenterLink>
      getMerchantCenterLinkCallable() {
    throw new UnsupportedOperationException("Not implemented: getMerchantCenterLinkCallable()");
  }

  public UnaryCallable<MutateMerchantCenterLinkRequest, MutateMerchantCenterLinkResponse>
      mutateMerchantCenterLinkCallable() {
    throw new UnsupportedOperationException("Not implemented: mutateMerchantCenterLinkCallable()");
  }

  @Override
  public abstract void close();
}
