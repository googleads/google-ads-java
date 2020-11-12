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

package com.google.ads.googleads.annotations.impl.generators;

import com.squareup.javapoet.ClassName;
import java.util.Set;
import javax.annotation.processing.Filer;
import javax.annotation.processing.Messager;

/**
 * Generates a message proxy for SearchGoogleAdsStreamResponse.
 *
 * <p>Example generated code: <code>
 *
 * package com.google.ads.googleads.lib.utils.messageproxy.generated.v6;
 *
 * import com.google.ads.googleads.lib.utils.messageproxy.SearchResponseProxy;
 * import com.google.ads.googleads.v6.services.SearchGoogleAdsStreamResponse;
 * import java.util.List;
 * import javax.annotation.Generated;
 *
 * @Generated("GoogleAdsCatalogAnnotationProcessor")
 * public class SearchStreamResponseMessageProxy implements SearchResponseProxy<SearchGoogleAdsStreamResponse, SearchGoogleAdsStreamResponse.Builder> {
 *   @Override
 *   public List<String> getFieldMaskPaths(SearchGoogleAdsStreamResponse message) {
 *     return message.getFieldMask().getPathsList();
 *   }
 *
 *   @Override
 *   public SearchGoogleAdsStreamResponse.Builder setCustomerUserAccessEmailAddressIfPresent(
 *       SearchGoogleAdsStreamResponse.Builder builder, String toSet) {
 *     builder.getResultsBuilderList().stream()
 *         .filter(row -> row.hasCustomerUserAccess() && row.getCustomerUserAccess().hasEmailAddress())
 *         .forEach(row -> row.getCustomerUserAccessBuilder().setEmailAddress(toSet));
 *     return builder;
 *   }
 *
 *   @Override
 *   public SearchGoogleAdsStreamResponse.Builder setCustomerUserAccessInviterEmailAddressIfPresent(
 *       SearchGoogleAdsStreamResponse.Builder builder, String toSet) {
 *     builder.getResultsBuilderList().stream()
 *         .filter(row -> row.hasCustomerUserAccess() && row.getCustomerUserAccessBuilder().hasInviterUserEmailAddress())
 *         .forEach(row -> row.getCustomerUserAccessBuilder().setInviterUserEmailAddress(toSet));
 *     return builder;
 *   }
 * }
 * </code>
 */
public class SearchStreamResponseMessageProxyGenerator
    extends AbstractSearchResponseMessageProxyGenerator {

  public SearchStreamResponseMessageProxyGenerator(
      Set<Integer> versions, Messager messager, Filer filer) {
    super(versions, messager, filer);
  }

  @Override
  protected ClassName getProxiedClassName(int version) {
    return ClassName.get(getServicesPackage(version), "SearchGoogleAdsStreamResponse");
  }
}
