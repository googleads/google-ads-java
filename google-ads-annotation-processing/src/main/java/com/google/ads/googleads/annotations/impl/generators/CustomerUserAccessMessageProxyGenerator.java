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
import com.squareup.javapoet.TypeName;
import com.squareup.javapoet.TypeSpec;
import java.util.Set;
import javax.annotation.processing.Filer;
import javax.annotation.processing.Messager;

/**
 * Generates CustomerUserAccessMessageProxy implementations.
 *
 * <p>Example generated code: <code>
 * package com.google.ads.googleads.lib.utils.messageproxy.generated.v6;
 *
 * import com.google.ads.googleads.v6.resources.CustomerUserAccess;
 * import javax.annotation.Generated;
 *
 * @Generated("GoogleAdsCatalogAnnotationProcessor")
 * public class CustomerUserAccessMessageProxy
 *      implements com.google.ads.googleads.lib.utils.messageproxy.CustomerUserAccessMessageProxy<CustomerUserAccess, CustomerUserAccess.Builder> {
 *   @Override
 *   public CustomerUserAccess.Builder setCustomerUserAccessEmailAddressIfPresent(
 *       CustomerUserAccess.Builder builder, String toSet) {
 *     if (builder.hasEmailAddress()) {
 *       builder.setEmailAddress(toSet);
 *     }
 *     return builder;
 *   }
 *
 *   @Override
 *   public CustomerUserAccess.Builder setCustomerUserAccessInviterEmailAddressIfPresent(
 *       CustomerUserAccess.Builder builder, String toSet) {
 *     if (builder.hasInviterUserEmailAddress()) {
 *       builder.setInviterUserEmailAddress(toSet);
 *     }
 *     return builder;
 *   }
 * }
 * </code>
 */
public class CustomerUserAccessMessageProxyGenerator extends AbstractMessageProxyGenerator {

  public CustomerUserAccessMessageProxyGenerator(
      Set<Integer> versions, Messager messager, Filer filer) {
    super(versions, messager, filer);
  }

  @Override
  protected TypeName getProxyInterfaceParameterizedName(
      int version,
      ClassName interfaceRawType,
      ClassName proxiedClassName,
      ClassName proxiedBuilderClassName) {
    if (version < MIN_VERSION_FOR_CUSTOMER_USER_ACCESS) {
      // Avoids generating code which won't compile because CustomerUserAccess doesn't exist yet.
      return interfaceRawType;
    }
    return super.getProxyInterfaceParameterizedName(
        version, interfaceRawType, proxiedClassName, proxiedBuilderClassName);
  }

  @Override
  protected void generate(
      TypeSpec.Builder typeBuilder,
      int version,
      ClassName proxiedClassName,
      ClassName proxiedBuilderClassName) {
    generateStringSetter(
        typeBuilder,
        proxiedBuilderClassName,
        "setCustomerUserAccessEmailAddressIfPresent",
        "builder.hasEmailAddress()",
        "builder.setEmailAddress(toSet)",
        version,
        MIN_VERSION_FOR_CUSTOMER_USER_ACCESS);

    generateStringSetter(
        typeBuilder,
        proxiedBuilderClassName,
        "setCustomerUserAccessInviterEmailAddressIfPresent",
        "builder.hasInviterUserEmailAddress()",
        "builder.setInviterUserEmailAddress(toSet)",
        version,
        MIN_VERSION_FOR_CUSTOMER_USER_ACCESS);
  }

  @Override
  protected ClassName getProxyInterfaceRawName() {
    return ClassName.get(MESSAGE_PROXY_PACKAGE_NAME, "CustomerUserAccessMessageProxy");
  }

  @Override
  protected ClassName getProxiedClassName(int version) {
    return ClassName.get(getResourcesPackage(version), "CustomerUserAccess");
  }
}
