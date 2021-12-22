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

import com.squareup.javapoet.JavaFile;
import com.squareup.javapoet.MethodSpec;
import com.squareup.javapoet.TypeSpec;
import java.io.File;
import java.util.Set;
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
  private final File targetDirectory;

  /**
   * Creates an instance of the generator.
   *
   * @param versions available versions of the Google Ads library.
   * @param latestVersion the latest available version of the Google Ads library.
   */
  public GoogleAdsAllVersionsCodeGenerator(
      Set<Integer> versions, int latestVersion, File targetDirectory) {
    this.versions = versions;
    this.latestVersion = latestVersion;
    this.targetDirectory = targetDirectory;
  }

  /** Generates the code for the GoogleAdsAllVersions interface and writes the file.
   * @return*/
  @Override
  public JavaFile generate() {
    String googleAdsAllVersionsSimpleName = "GoogleAdsAllVersions";

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
    JavaFile javaFile = Utils.createJavaFile("com.google.ads.googleads.lib", googleAdsAllVersionsGeneratedCodeBuilder.build());
    Utils.writeGeneratedClassToFile(javaFile, targetDirectory);
    return javaFile;
  }
}
