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
import com.squareup.javapoet.MethodSpec;
import com.squareup.javapoet.ParameterizedTypeName;
import com.squareup.javapoet.TypeSpec;
import java.util.List;
import java.util.Set;
import javax.annotation.processing.Filer;
import javax.annotation.processing.Messager;
import javax.lang.model.element.Modifier;

/**
 * Abstracts common functionality for generating GoogleAdsService.search() +
 * GoogleAdsService.searchStream() message proxies.
 */
public abstract class AbstractSearchResponseMessageProxyGenerator
    extends AbstractMessageProxyGenerator {

  public AbstractSearchResponseMessageProxyGenerator(
      Set<Integer> versions, Messager messager, Filer filer) {
    super(versions, messager, filer);
  }

  @Override
  protected ClassName getProxyInterfaceRawName() {
    return ClassName.get(MESSAGE_PROXY_PACKAGE_NAME, "SearchResponseProxy");
  }

  @Override
  protected void generate(
      TypeSpec.Builder typeBuilder,
      int version,
      ClassName proxiedClassName,
      ClassName proxiedBuilderClassName) {
    /* Example generated code:
     *   @Override
     *   public Iterable<String> getFieldMaskPaths(SearchGoogleAdsStreamResponse message) {
     *     return message.getFieldMask().getPathsList();
     *   }
     */
    typeBuilder.addMethod(
        MethodSpec.methodBuilder("getFieldMaskPaths")
            .addAnnotation(Override.class)
            .addModifiers(Modifier.PUBLIC)
            .returns(ParameterizedTypeName.get(List.class, String.class))
            .addParameter(proxiedClassName, "message")
            .addStatement("return message.getFieldMask().getPathsList()")
            .build());

    /* Example generated code:
     *   @Override
     *   public SearchGoogleAdsStreamResponse.Builder setCustomerUserAccessEmailAddressIfPresent(
     *       SearchGoogleAdsStreamResponse.Builder builder, String toSet) {
     *     builder.getResultsBuilderList().stream()
     *         .filter(row -> row.hasCustomerUserAccess() && row.getCustomerUserAccessBuilder().hasEmailAddress())
     *         .forEach(row -> row.getCustomerUserAccessBuilder().setEmailAddress(toSet));
     *     return builder;
     *   }
     */
    generateResultFieldSetterString(
        version,
        proxiedBuilderClassName,
        typeBuilder,
        "setCustomerUserAccessEmailAddressIfPresent",
        "row.hasCustomerUserAccess() && row.getCustomerUserAccess().hasEmailAddress()",
        "row.getCustomerUserAccessBuilder().setEmailAddress(toSet)",
        MIN_VERSION_FOR_CUSTOMER_USER_ACCESS);

    /* Example generated code:
     *   @Override
     *   public SearchGoogleAdsStreamResponse.Builder setCustomerUserAccessInviterEmailAddressIfPresent(
     *       SearchGoogleAdsStreamResponse.Builder builder, String toSet) {
     *     builder.getResultsBuilderList().stream()
     *         .filter(row.hasCustomerUserAccess() && row -> row.getCustomerUserAccessBuilder().hasInviterUserEmailAddress())
     *         .forEach(row -> row.getCustomerUserAccessBuilder().setInviterUserEmailAddress(toSet));
     *     return builder;
     *   }
     */
    generateResultFieldSetterString(
        version,
        proxiedBuilderClassName,
        typeBuilder,
        "setCustomerUserAccessInviterEmailAddressIfPresent",
        "row.hasCustomerUserAccess() &&"
            + " row.getCustomerUserAccessBuilder().hasInviterUserEmailAddress()",
        "row.getCustomerUserAccessBuilder().setInviterUserEmailAddress(toSet)",
        MIN_VERSION_FOR_CUSTOMER_USER_ACCESS);

    /* Example generated code:
     *   @Override
     *   public SearchGoogleAdsStreamResponse.Builder setChangeEventUserEmailIfPresent(
     *       SearchGoogleAdsStreamResponse.Builder builder, String toSet) {
     *     builder.getResultsBuilderList().stream()
     *         .filter(row -> row.hasChangeEvent() && !row.getChangeEvent().getUserEmail().isEmpty())
     *         .forEach(row -> row.getChangeEventBuilder().setUserEmail(toSet));
     *     return builder;
     *   }
     */
    generateResultFieldSetterString(
        version,
        proxiedBuilderClassName,
        typeBuilder,
        "setChangeEventUserEmailIfPresent",
        // Calls isEmpty instead of hasUserEmail (no proto3 presence on field).
        "row.hasChangeEvent() && !row.getChangeEvent().getUserEmail().isEmpty()",
        "row.getChangeEventBuilder().setUserEmail(toSet)",
        MIN_VERSION_FOR_CHANGE_EVENT);
  }

  /**
   * Generates a method with signature: <code>Builder setFoo(Builder, String)</code>. Applies the
   * set value to all rows found in the builder.
   *
   * @param version the API version this proxy is for.
   * @param builderType TypeName of Builder on which to call setter.
   * @param fullNameOfSetterMethod the method name (e.g. setFoo).
   * @param filterStatement the statement which filters out rows for the update. Note that this
   *     *MUST* exclude rows which do not already contain the submessage. We do not want to add
   *     submessages by doing row.getFooBuilder() if row.hasFoo() was false.
   *     <p>For example the following should be avoided. <code>
   *     results {
   *     }
   *
   *     results {
   *       foo{
   *       }
   *     }
   * </code> The current row will be assigned to a variable named "row".
   * @param updateStatement the code to run for each row in the response. The current row will be
   *     assigned to a variable named "row".
   * @param minVersion the minimum API version which supports this setter. If verion > minVersion
   *     then the updateStatement is generated. Otherwise an unchecked exception is thrown.
   */
  private static void generateResultFieldSetterString(
      int version,
      ClassName builderType,
      TypeSpec.Builder typeBuilder,
      String fullNameOfSetterMethod,
      String filterStatement,
      String updateStatement,
      int minVersion) {
    MethodSpec.Builder methodBuilder =
        MethodSpec.methodBuilder(fullNameOfSetterMethod)
            .addAnnotation(Override.class)
            .addModifiers(Modifier.PUBLIC)
            .returns(builderType)
            .addParameter(builderType, "builder")
            .addParameter(String.class, "toSet");
    if (version >= minVersion) {
      methodBuilder.addStatement(
          "builder.getResultsBuilderList().stream()\n"
              + ".filter(row -> $L)\n"
              + ".forEach(row -> $L)",
          filterStatement,
          updateStatement);
    }
    methodBuilder.addStatement("return builder");
    typeBuilder.addMethod(methodBuilder.build());
  }
}
