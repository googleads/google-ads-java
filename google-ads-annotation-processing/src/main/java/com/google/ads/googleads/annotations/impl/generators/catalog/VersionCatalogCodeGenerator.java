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

package com.google.ads.googleads.annotations.impl.generators.catalog;

import com.google.ads.googleads.annotations.impl.generators.Generator;
import com.google.ads.googleads.annotations.impl.generators.Utils;
import com.google.common.collect.ImmutableSet;
import com.squareup.javapoet.ClassName;
import com.squareup.javapoet.MethodSpec;
import com.squareup.javapoet.ParameterizedTypeName;
import com.squareup.javapoet.TypeSpec;
import java.util.Set;
import javax.annotation.processing.Filer;
import javax.annotation.processing.Messager;
import javax.lang.model.element.Modifier;

/**
 * Generates code for and writes the VersionCatalog class, which contains a method to retrieve a set
 * of Version objects, one for each available version of the Google Ads library.
 *
 * <p>Example generated code snippets:
 *
 * <pre>
 *  <code>
 *  public class VersionCatalog {
 *    protected static ImmutableSet<Version> getCatalog() throws IllegalAccessException,
 *      InstantiationException {
 *    ImmutableSet.Builder<Version> builder = ImmutableSet.builder();
 *      builder.add(new Version(
 *        "v1",
 *        com.google.ads.googleads.v1.errors.GoogleAdsException.Factory.class.newInstance(),
 *        com.google.ads.googleads.v1.services.GoogleAdsVersion.class));
 *       builder.add(new Version(
 *        "v2",
 *        com.google.ads.googleads.v2.errors.GoogleAdsException.Factory.class.newInstance(),
 *        com.google.ads.googleads.v2.services.GoogleAdsVersion.class));
 *      return builder.build();
 *    }
 *  }
 *  </code>
 *  </pre>
 */
public class VersionCatalogCodeGenerator implements Generator {

  private static final ClassName VERSION_CLASS_NAME =
      ClassName.get("com.google.ads.googleads.lib.catalog", "Version");
  private static final ClassName IMMUTABLE_SET_CLASS_NAME = ClassName.get(ImmutableSet.class);
  private final Set<Integer> versions;
  private final String catalogName;
  private final Messager messager;
  private final Filer filer;

  /**
   * Creates an instance of the generator.
   *
   * @param versions available versions of the Google Ads library.
   * @param catalogName the catalogName parameter found in the VersionDescriptor annotation that
   *     will be used to namespace the output classname (can be an empty string).
   * @param messager the processing environment's messager.
   * @param filer the processing environment's filer.
   */
  public VersionCatalogCodeGenerator(
      Set<Integer> versions, String catalogName, Messager messager, Filer filer) {
    this.versions = versions;
    this.catalogName = catalogName;
    this.messager = messager;
    this.filer = filer;
  }

  /** Generates the code for the VersionCatalog class and writes the file. */
  @Override
  public void generate() {
    String versionCatalogSimpleName = "VersionCatalog";
    if (!catalogName.isEmpty()) {
      versionCatalogSimpleName += "_" + catalogName;
    }

    // Creates the getCatalog method.
    MethodSpec.Builder getCatalogBuilder =
        MethodSpec.methodBuilder("getCatalog")
            .addModifiers(Modifier.PROTECTED, Modifier.STATIC)
            .addException(IllegalAccessException.class)
            .addException(InstantiationException.class)
            .returns(ParameterizedTypeName.get(IMMUTABLE_SET_CLASS_NAME, VERSION_CLASS_NAME))
            .addStatement(
                "$T.Builder<$T> builder = $T.builder()",
                IMMUTABLE_SET_CLASS_NAME,
                VERSION_CLASS_NAME,
                IMMUTABLE_SET_CLASS_NAME);

    /*
     * <code>
     *     builder.add(new Version(
     *           "v123",
     *           new GoogleAdsException.Factory(),
     *           GoogleAdsVersion.class,
     *           new DefaultMessageProxyProvider(
     *             new SearchGoogleAdsStreamResponseMessageProxy())));
     * </code>
     */
    // Creates a Version instance for each version of the API.
    for (Integer version : versions) {
      // Defines the exception factory class name.
      ClassName exceptionFactoryName =
          ClassName.get(
              "com.google.ads.googleads.v" + version + ".errors", "GoogleAdsException", "Factory");
      // Defines the GoogleAdsVersion class name.
      ClassName versionClassName =
          ClassName.get("com.google.ads.googleads.v" + version + ".services", "GoogleAdsVersion");
      // Defines the implementation of MessageProxyProvider.
      ClassName messageProxyProviderClassName =
          ClassName.get(
              "com.google.ads.googleads.lib.utils.messageproxy", "DefaultMessageProxyProvider");
      // Defines the search stream message proxy implementation.
      ClassName searchStreamResponseProxyName =
          ClassName.get(
              "com.google.ads.googleads.lib.utils.messageproxy.generated.v" + version,
              "SearchGoogleAdsStreamResponseMessageProxy");
      // Defines the search stream message proxy implementation.
      ClassName searchPagedResponseProxyName =
          ClassName.get(
              "com.google.ads.googleads.lib.utils.messageproxy.generated.v" + version,
              "SearchGoogleAdsResponseMessageProxy");
      // Defines the search stream message proxy implementation.
      ClassName customerUserAccessProxyName =
          ClassName.get(
              "com.google.ads.googleads.lib.utils.messageproxy.generated.v" + version,
              "CustomerUserAccessMessageProxy");
      // Defines the feed message proxy implementation.
      ClassName feedMessageProxyName =
          ClassName.get(
              "com.google.ads.googleads.lib.utils.messageproxy.generated.v" + version,
              "FeedMessageProxy");
      // Defines the CreateCustomerClientRequest message proxy implementation.
      ClassName createCustomerClientRequestProxyName =
          ClassName.get(
              "com.google.ads.googleads.lib.utils.messageproxy.generated.v" + version,
              "CreateCustomerClientRequestMessageProxy");
      // Adds a Version instance to the builder with the params as defined above.
      getCatalogBuilder.addStatement(
          "builder.add(new Version(\n"
              + "  $S,\n"
              + "  new $T(),\n"
              + "  $T.class,\n"
              + "  new $T(\n"
              + "    new $T(),\n"
              + "    new $T(),\n"
              + "    new $T(),\n"
              + "    new $T(),\n"
              + "    new $T())))",
          "v" + version,
          exceptionFactoryName,
          versionClassName,
          messageProxyProviderClassName,
          searchStreamResponseProxyName,
          searchPagedResponseProxyName,
          customerUserAccessProxyName,
          feedMessageProxyName,
          createCustomerClientRequestProxyName);
    }

    getCatalogBuilder.addStatement("return builder.build()");

    MethodSpec getCatalog = getCatalogBuilder.build();

    // Creates and returns the VersionCatalog class.
    TypeSpec versionCatalogGeneratedCode =
        TypeSpec.classBuilder(versionCatalogSimpleName)
            .addAnnotation(Utils.generatedAnnotation())
            .addModifiers(Modifier.PUBLIC)
            .addMethod(getCatalog)
            .build();

    Utils.writeGeneratedClassToFile(
        "com.google.ads.googleads.lib.catalog", versionCatalogGeneratedCode, messager, filer);
  }
}
