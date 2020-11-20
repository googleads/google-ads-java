// Copyright 2020 Google LLC
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.ads.googleads.lib.utils.messageproxy;

/**
 * Implementation of {@link MessageProxyProvider} which stores references to a predetermined set of
 * proxy implementations.
 */
public class DefaultMessageProxyProvider implements MessageProxyProvider {

  private final SearchResponseProxy searchStreamResponseProxy;
  private final SearchResponseProxy searchPagedResponseProxy;
  private final CustomerUserAccessMessageProxy customerUserAccessProxy;

  public DefaultMessageProxyProvider(
      SearchResponseProxy searchStreamResponseProxy,
      SearchResponseProxy searchPagedResponseProxy,
      CustomerUserAccessMessageProxy customerUserAccessProxy) {
    this.searchStreamResponseProxy = searchStreamResponseProxy;
    this.searchPagedResponseProxy = searchPagedResponseProxy;
    this.customerUserAccessProxy = customerUserAccessProxy;
  }

  @Override
  public SearchResponseProxy getSearchStreamResponseProxy() {
    return searchStreamResponseProxy;
  }

  @Override
  public SearchResponseProxy getSearchPagedResponseProxy() {
    return searchPagedResponseProxy;
  }

  @Override
  public CustomerUserAccessMessageProxy getCustomerUserAccessProxy() {
    return customerUserAccessProxy;
  }
}
