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
import com.squareup.javapoet.TypeSpec;
import java.util.Set;
import javax.annotation.processing.Filer;
import javax.annotation.processing.Messager;
import javax.lang.model.element.Modifier;

/**
 * Generates code for and writes the AbstractGoogleAdsClient abstract class, which defines the
 * methods that can be used to gain access to a GoogleAdsVersion for a given version.
 *
 * <p>Example generated code snippets:
 *
 * <pre>
 *  protected abstract GoogleAdsAllVersions getGoogleAdsAllVersions();
 *  ...
 *  public GoogleAdsVersion getVersion1() { return getGoogleAdsAllVersions().getVersion1(); }
 *  ...
 *  public com.google.ads.googleads.v2.services.GoogleAdsVersion getLatestVersion() {
 *    return getGoogleAdsAllVersions().getLatestVersion();
 *  }
 *  </pre>
 */
public class AbstractGoogleAdsClientCodeGenerator implements Generator {

  private final Set<Integer> versions;
  private final int latestVersion;
  private final String catalogName;
  private final Messager messager;
  private final Filer filer;

  /**
   * Creates an instance of the generator.
   *
   * @param versions available versions of the Google Ads library.
   * @param latestVersion the latest available version of the Google Ads library.
   * @param catalogName the catalogName parameter found in the VersionDescriptor annotation that
   *     will be used to namespace the output classname (can be an empty string).
   * @param messager the processing environment's messager.
   * @param filer the processing environment's filer.
   */
  public AbstractGoogleAdsClientCodeGenerator(
      Set<Integer> versions,
      int latestVersion,
      String catalogName,
      Messager messager,
      Filer filer) {
    this.versions = versions;
    this.latestVersion = latestVersion;
    this.catalogName = catalogName;
    this.messager = messager;
    this.filer = filer;
  }

  /** Generates the code for the AbstractGoogleAdsClient class and writes the file. */
  @Override
  public void generate() {
    String abstractGacSimpleName = "AbstractGoogleAdsClient";
    String googleAdsAllVersionsSimpleName = "GoogleAdsAllVersions";
    if (!catalogName.isEmpty()) {
      abstractGacSimpleName += "_" + catalogName;
      googleAdsAllVersionsSimpleName += "_" + catalogName;
    }

    ClassName googleAdsAllVersionsClassName =
        ClassName.get("com.google.ads.googleads.lib", googleAdsAllVersionsSimpleName);

    // Creates the getGoogleAdsAllVersions method.
    MethodSpec getGoogleAdsAllVersions =
        MethodSpec.methodBuilder("getGoogleAdsAllVersions")
            .addJavadoc(
                "Returns the accessor for service client factories, "
                    + "using configuration from this class.")
            .addModifiers(Modifier.PROTECTED, Modifier.ABSTRACT)
            .returns(googleAdsAllVersionsClassName)
            .build();

    // Creates the getLatestVersion method.
    MethodSpec getLatestVersion =
        MethodSpec.methodBuilder("getLatestVersion")
            .addAnnotation(Override.class)
            .addModifiers(Modifier.PUBLIC)
            .returns(
                ClassName.get(
                    "com.google.ads.googleads.v" + latestVersion + ".services", "GoogleAdsVersion"))
            .addStatement("return getGoogleAdsAllVersions().getLatestVersion()")
            .build();

    // Creates the AbstractGoogleAdsClient class.
    TypeSpec.Builder abstractGoogleAdsClientBuilder =
        TypeSpec.classBuilder(abstractGacSimpleName)
            .addAnnotation(Utils.generatedAnnotation())
            .addSuperinterface(googleAdsAllVersionsClassName)
            .addModifiers(Modifier.PUBLIC, Modifier.ABSTRACT)
            .addMethod(getGoogleAdsAllVersions);

    // Adds each of the getVersion[VERSION] methods to the builder.
    for (Integer version : versions) {
      abstractGoogleAdsClientBuilder.addMethod(getVersion(version));
    }

    abstractGoogleAdsClientBuilder.addMethod(getLatestVersion);

    Utils.writeGeneratedClassToFile(
        "com.google.ads.googleads.lib", abstractGoogleAdsClientBuilder.build(), messager, filer);
  }

  /**
   * Creates a method to get a particular GoogleAdsVersion in the form getVersion[VERSION].
   *
   * @param version the version of the Google Ads library.
   * @return the MethodSpec for the generated method.
   */
  private static MethodSpec getVersion(int version) {
    return MethodSpec.methodBuilder("getVersion" + version)
        .addAnnotation(Override.class)
        .addModifiers(Modifier.PUBLIC)
        .returns(Utils.createServiceClientClassName(version, "GoogleAdsVersion"))
        .addStatement("return getGoogleAdsAllVersions().getVersion" + version + "()")
        .build();
  }
}
