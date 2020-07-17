package com.google.ads.googleads.annotations.impl;

import com.squareup.javapoet.MethodSpec;
import com.squareup.javapoet.TypeSpec;
import javax.annotation.processing.Filer;
import javax.annotation.processing.Messager;
import javax.lang.model.element.Modifier;
import java.util.Set;

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
public class GoogleAdsAllVersionsCodeGenerator {
  /**
   * Generates the code for the GoogleAdsAllVersions interface and writes the file.
   *
   * @param versions available versions of the Google Ads library.
   * @param latestVersion the latest available version of the Google Ads library.
   * @param catalogName the catalogName parameter found in the VersionDescriptor annotation that
   *     will be used to namespace the output classname (can be an empty string).
   * @param messager the processing environment's messager.
   * @param filer the processing environment's filer.
   */
  public static void generate(
      Set<Integer> versions,
      int latestVersion,
      String catalogName,
      Messager messager,
      Filer filer) {
    String googleAdsAllVersionsSimpleName = "GoogleAdsAllVersions";
    if (!catalogName.isEmpty()) {
      googleAdsAllVersionsSimpleName += "_" + catalogName;
    }

    // Creates a builder for the GoogleAdsAllVersions interface.
    TypeSpec.Builder googleAdsAllVersionsGeneratedCodeBuilder =
        TypeSpec.interfaceBuilder(googleAdsAllVersionsSimpleName)
            .addAnnotation(GeneratorUtils.generatedAnnotation())
            .addModifiers(Modifier.PUBLIC);

    // Creates and adds each of the getVersionX() methods to the interface builder.
    for (Integer version : versions) {
      MethodSpec getVersionMethod =
          MethodSpec.methodBuilder("getVersion" + version)
              // JavaPoet requires public and abstract modifiers when creating interfaces. Only
              // the public modifier will be explicitly written to the interface.
              .addModifiers(Modifier.PUBLIC, Modifier.ABSTRACT)
              .returns(GeneratorUtils.createServiceClientClassName(version, "GoogleAdsVersion"))
              .build();
      googleAdsAllVersionsGeneratedCodeBuilder.addMethod(getVersionMethod);
    }

    // Creates the getLatestVersion() method and adds it to the interface builder.
    MethodSpec getLatestVersionMethod =
        MethodSpec.methodBuilder("getLatestVersion")
            .addModifiers(Modifier.PUBLIC, Modifier.ABSTRACT)
            .returns(GeneratorUtils.createServiceClientClassName(latestVersion, "GoogleAdsVersion"))
            .build();
    googleAdsAllVersionsGeneratedCodeBuilder.addMethod(getLatestVersionMethod);

    // Builds the interface and writes the generated class to file.
    TypeSpec googleAdsAllVersionsGeneratedCode = googleAdsAllVersionsGeneratedCodeBuilder.build();
    GeneratorUtils.writeGeneratedClassToFile(
        "com.google.ads.googleads.lib", googleAdsAllVersionsGeneratedCode, messager, filer);
  }
}
