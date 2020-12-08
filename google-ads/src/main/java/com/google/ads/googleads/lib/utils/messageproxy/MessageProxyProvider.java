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
 * Provides a selection of message proxy implementations.
 *
 * <p>A message proxy is an interface which allows us to interact with API messages in a version
 * agnostic way. Rather than having to cast an API response to the versioned type, the message proxy
 * decouples us from the version by providing a general interface which is applicable to all API
 * versions.
 *
 * <p>For example, rather than writing: <code>
 *   Object message = ...;
 *   if (message instanceof com.google.ads.googleads.v5.services.GoogleAdsRow) {
 *     (com.google.ads.googleads.v5.services.GoogleAdsRow) message).getFoo();
 *   }
 *   else if (message instance of com.google.ads.googleads.v4.services.GoogleAdsRow) // ... etc.
 * </code>
 *
 * <p>... we can instead do... <code>
 *   Object message = ...;
 *   SearchResponseProxy responseProxy = provider.getSearchStreamResponseProxy();
 *   responseProxy.getFoo(message);
 * </code>
 *
 * <p>An alternative approach to message proxy implementation is to use the protobuf reflection API
 * (i.e. {@link com.google.protobuf.Message}#getField(FieldDescriptor)). There are two main
 * downsides to this:
 *
 * <ul>
 *   <li>Protobuf reflection API is based on Java reflection. Internally it obtains a reference to
 *       the get/set {@link java.lang.reflect.Method}s and invokes those via reflection. This is
 *       substantially slower than compiled code which calls the same method.
 *   <li>Reflection code is inherently difficult to maintain and understand. It requires careful
 *       unit testing in order to detect regressions which would otherwise be flagged by the
 *       compiler. Moreover the code is difficult to read at the call-site. While the
 *       code-generation itself is also hard to read, the generator code is typically less
 *       frequently worked on than the usages of the generated code.
 * </ul>
 *
 * <p>Another alternative to message proxies is to generate smaller, more specific pieces of code
 * which solve one immediate use-case. This would get initial results faster, but would scale poorly
 * by comparison - each new use-case requiring significant infrastructure work to build out. With
 * message proxies, we get a reusable and scalable solution.
 */
public interface MessageProxyProvider {

  /** Returns a proxy for handling SearchGoogleAdsStreamResponse instances. */
  SearchResponseProxy getSearchStreamResponseProxy();

  /** Returns a proxy for handling SearchGoogleAdsStreamResponse instances. */
  SearchResponseProxy getSearchPagedResponseProxy();

  /** Returns a proxy for handling CustomerUserAccess instances. */
  CustomerUserAccessMessageProxy getCustomerUserAccessProxy();

  /** Returns a proxy for handling Feed instances. */
  FeedMessageProxy getFeedMessageProxy();
}
