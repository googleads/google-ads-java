package com.google.ads.googleads.annotations.impl.generators;

import com.squareup.javapoet.ClassName;
import java.util.Set;
import javax.annotation.processing.Filer;
import javax.annotation.processing.Messager;

/**
 * Generates a message proxy for SearchGoogleAdsResponse.
 *
 * <p>Example generated code: <code>
 *   package com.google.ads.googleads.lib.utils.messageproxy.generated.v6;
 *
 *   import com.google.ads.googleads.lib.utils.messageproxy.SearchResponseProxy;
 *   import com.google.ads.googleads.v6.services.SearchGoogleAdsResponse;
 *   import java.util.List;
 *   import javax.annotation.Generated;
 *
 *   @Generated("GoogleAdsCatalogAnnotationProcessor")
 *   public class SearchGoogleAdsResponseMessageProxy implements SearchResponseProxy<SearchGoogleAdsResponse, SearchGoogleAdsResponse.Builder> {
 *     @Override
 *     public List<String> getFieldMaskPaths(SearchGoogleAdsResponse message) {
 *       return message.getFieldMask().getPathsList();
 *     }
 *
 *    @Override
 *     public SearchGoogleAdsResponse.Builder setCustomerUserAccessEmailAddressIfPresent(
 *         SearchGoogleAdsResponse.Builder builder, String toSet) {
 *       builder.getResultsBuilderList().stream()
 *           .filter(row -> row.hasCustomerUserAccess() && row.getCustomerUserAccess().hasEmailAddress())
 *           .forEach(row -> row.getCustomerUserAccessBuilder().setEmailAddress(toSet));
 *       return builder;
 *     }
 *
 *     @Override
 *     public SearchGoogleAdsResponse.Builder setCustomerUserAccessInviterEmailAddressIfPresent(
 *         SearchGoogleAdsResponse.Builder builder, String toSet) {
 *       builder.getResultsBuilderList().stream()
 *           .filter(row -> row.hasCustomerUserAccess() && row.getCustomerUserAccessBuilder().hasInviterUserEmailAddress())
 *           .forEach(row -> row.getCustomerUserAccessBuilder().setInviterUserEmailAddress(toSet));
 *       return builder;
 *     }
 *   }
 * </code>
 */
public class SearchPagedResponseMessageProxyGenerator
    extends AbstractSearchResponseMessageProxyGenerator {

  public SearchPagedResponseMessageProxyGenerator(
      Set<Integer> versions, Messager messager, Filer filer) {
    super(versions, messager, filer);
  }

  @Override
  protected ClassName getProxiedClassName(int version) {
    return ClassName.get(getServicesPackage(version), "SearchGoogleAdsResponse");
  }
}
