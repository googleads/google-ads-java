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

import com.squareup.javapoet.ClassName;
import com.squareup.javapoet.JavaFile;
import com.squareup.javapoet.MethodSpec;
import com.squareup.javapoet.TypeSpec;
import java.io.File;
import java.util.Set;
import javax.lang.model.element.Modifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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

  private static final Logger logger =
      LoggerFactory.getLogger(AbstractGoogleAdsClientCodeGenerator.class);
  private final Set<Integer> versions;
  private final int latestVersion;
  private final File targetDirectory;

  /**
   * Creates an instance of the generator.
   *
   * @param versions available versions of the Google Ads library.
   * @param latestVersion the latest available version of the Google Ads library.
   */
  public AbstractGoogleAdsClientCodeGenerator(
      Set<Integer> versions, int latestVersion, File targetDirectory) {
    this.versions = versions;
    this.latestVersion = latestVersion;
    this.targetDirectory = targetDirectory;
  }

  /**
   * Generates the code for the AbstractGoogleAdsClient class and writes the file.
   *
   * @return
   */
  @Override
  public JavaFile generate() {
    String abstractGacSimpleName = "AbstractGoogleAdsClient";
    String googleAdsAllVersionsSimpleName = "GoogleAdsAllVersions";

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
    JavaFile javaFile =
        Utils.createJavaFile(
            "com.google.ads.googleads.lib", abstractGoogleAdsClientBuilder.build());
    Utils.writeGeneratedClassToFile(javaFile, targetDirectory);
    return javaFile;
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
