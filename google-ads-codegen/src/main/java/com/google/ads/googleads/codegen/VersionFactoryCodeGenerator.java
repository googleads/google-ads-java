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

package com.google.ads.googleads.codegen;

import com.google.common.collect.ImmutableSet;
import com.squareup.javapoet.ClassName;
import com.squareup.javapoet.JavaFile;
import com.squareup.javapoet.MethodSpec;
import com.squareup.javapoet.ParameterizedTypeName;
import com.squareup.javapoet.TypeSpec;
import java.io.File;
import java.util.Set;
import javax.lang.model.element.Modifier;

/**
 * Generates code for and writes the VersionCatalog class, which contains a method to retrieve a set
 * of Version objects, one for each available version of the Google Ads library.
 *
 * <p>Example generated code snippets:
 *
 * <pre>
 *  <code>
 *  public class VersionFactory {
 *    protected static ImmutableSet<Version> getVersions() throws IllegalAccessException,
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
public class VersionFactoryCodeGenerator implements Generator {

  private static final ClassName VERSION_CLASS_NAME =
      ClassName.get("com.google.ads.googleads.lib.catalog", "Version");
  private static final ClassName IMMUTABLE_SET_CLASS_NAME = ClassName.get(ImmutableSet.class);
  private final Set<Integer> versions;
  private final File targetDirectory;

  /**
   * Creates an instance of the generator.
   *
   * @param versions available versions of the Google Ads library.
   */
  public VersionFactoryCodeGenerator(Set<Integer> versions, File targetDirectory) {
    this.versions = versions;
    this.targetDirectory = targetDirectory;
  }

  /**
   * Generates the code for the VersionCatalog class and writes the file.
   *
   * @return
   */
  @Override
  public JavaFile generate() {
    String versionCatalogSimpleName = "VersionFactory";

    // Creates the getCatalog method.
    MethodSpec.Builder getCatalogBuilder =
        MethodSpec.methodBuilder("getVersions")
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
      // Adds a Version instance to the builder with the params as defined above.
      getCatalogBuilder.addStatement(
          "builder.add(new Version(\n" + "  $S,\n" + "  new $T(),\n" + "  $T.class))",
          "v" + version,
          exceptionFactoryName,
          versionClassName);
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

    JavaFile javaFile =
        Utils.createJavaFile("com.google.ads.googleads.lib.catalog", versionCatalogGeneratedCode);
    Utils.writeGeneratedClassToFile(javaFile, targetDirectory);
    return javaFile;
  }
}
