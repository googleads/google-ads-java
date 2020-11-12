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

import com.squareup.javapoet.MethodSpec;
import com.squareup.javapoet.TypeSpec;
import java.util.Set;
import javax.annotation.processing.Filer;
import javax.annotation.processing.Messager;
import javax.lang.model.element.Modifier;

/**
 * Generates code for and writes the GoogleAdsAllVersions interface, which provides methods for
 * accessing the GoogleAdsVersion service for each available version of the API as well as a
 * getLatestVersion method.
 *
 * <p>Example generated code snippets:
 *
 * <pre>
 * public interface GoogleAdsAllVersions {
 *   GoogleAdsVersion getVersion1();
 *
 *   com.google.ads.googleads.v2.services.GoogleAdsVersion getVersion2();
 *
 *   com.google.ads.googleads.v2.services.GoogleAdsVersion getLatestVersion();
 * }
 *  </pre>
 */
public class GoogleAdsAllVersionsCodeGenerator implements Generator {

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
  public GoogleAdsAllVersionsCodeGenerator(
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

  /** Generates the code for the GoogleAdsAllVersions interface and writes the file. */
  @Override
  public void generate() {
    String googleAdsAllVersionsSimpleName = "GoogleAdsAllVersions";
    if (!catalogName.isEmpty()) {
      googleAdsAllVersionsSimpleName += "_" + catalogName;
    }

    // Creates a builder for the GoogleAdsAllVersions interface.
    TypeSpec.Builder googleAdsAllVersionsGeneratedCodeBuilder =
        TypeSpec.interfaceBuilder(googleAdsAllVersionsSimpleName)
            .addAnnotation(Utils.generatedAnnotation())
            .addModifiers(Modifier.PUBLIC);

    // Creates and adds each of the getVersionX() methods to the interface builder.
    for (Integer version : versions) {
      MethodSpec getVersionMethod =
          MethodSpec.methodBuilder("getVersion" + version)
              // JavaPoet requires public and abstract modifiers when creating interfaces. Only
              // the public modifier will be explicitly written to the interface.
              .addModifiers(Modifier.PUBLIC, Modifier.ABSTRACT)
              .returns(Utils.createServiceClientClassName(version, "GoogleAdsVersion"))
              .build();
      googleAdsAllVersionsGeneratedCodeBuilder.addMethod(getVersionMethod);
    }

    // Creates the getLatestVersion() method and adds it to the interface builder.
    MethodSpec getLatestVersionMethod =
        MethodSpec.methodBuilder("getLatestVersion")
            .addModifiers(Modifier.PUBLIC, Modifier.ABSTRACT)
            .returns(Utils.createServiceClientClassName(latestVersion, "GoogleAdsVersion"))
            .build();
    googleAdsAllVersionsGeneratedCodeBuilder.addMethod(getLatestVersionMethod);

    // Builds the interface and writes the generated class to file.
    TypeSpec googleAdsAllVersionsGeneratedCode = googleAdsAllVersionsGeneratedCodeBuilder.build();
    Utils.writeGeneratedClassToFile(
        "com.google.ads.googleads.lib", googleAdsAllVersionsGeneratedCode, messager, filer);
  }
}
