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

package com.google.ads.googleads.annotations.api;

import static java.lang.Math.max;

import com.google.ads.googleads.annotations.impl.AbstractGoogleAdsClientCodeGenerator;
import com.google.ads.googleads.annotations.impl.GeneratedCatalogCodeGenerator;
import com.google.ads.googleads.annotations.impl.GoogleAdsAllVersionsCodeGenerator;
import com.google.ads.googleads.annotations.impl.VersionCatalogCodeGenerator;
import com.google.auto.service.AutoService;
import com.google.common.collect.SortedSetMultimap;
import com.google.common.collect.TreeMultimap;
import java.util.Collections;
import java.util.Map.Entry;
import java.util.Set;
import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.Filer;
import javax.annotation.processing.Messager;
import javax.annotation.processing.ProcessingEnvironment;
import javax.annotation.processing.Processor;
import javax.annotation.processing.RoundEnvironment;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.AnnotationMirror;
import javax.lang.model.element.AnnotationValue;
import javax.lang.model.element.Element;
import javax.lang.model.element.ExecutableElement;
import javax.lang.model.element.TypeElement;
import javax.lang.model.type.DeclaredType;
import javax.lang.model.util.Elements;

/**
 * Processes annotations and dynamically generates several classes and interfaces required to define
 * the services available in each version of API. The generated classes and interfaces are listed
 * below:
 *
 * <ul>
 *   <li>GeneratedCatalog
 *   <li>VersionCatalog
 *   <li>AbstractGoogleAdsClient
 *   <li>GoogleAdsAllVersions
 * </ul>
 *
 * <p>The annotation processor dynamically creates a set of the available versions of the Google Ads
 * API by finding all of the unique versionName parameters (e.g. "v1" or "v2") and catalogs by
 * finding all of the unique catalogName parameters included in @VersionDescriptor annotations
 * throughout the library. More information regarding the catalog system can be found in the
 * documentation of the VersionDescriptor.java class. Upon finding all versions and catalogs, this
 * class writes one version of each of the classes listed above for each unique combination of
 * version and catalog.
 */
@AutoService(Processor.class)
public class GoogleAdsCatalogAnnotationProcessor extends AbstractProcessor {

  private Elements elementUtils;
  private Filer filer;
  private Messager messager;
  private boolean hasWrittenFiles;

  @Override
  public synchronized void init(ProcessingEnvironment processingEnv) {
    super.init(processingEnv);
    elementUtils = processingEnv.getElementUtils();
    filer = processingEnv.getFiler();
    messager = processingEnv.getMessager();
  }

  @Override
  public Set<String> getSupportedAnnotationTypes() {
    return Collections.singleton(VersionDescriptor.class.getCanonicalName());
  }

  @Override
  public SourceVersion getSupportedSourceVersion() {
    return SourceVersion.latestSupported();
  }

  @Override
  public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment roundEnv) {
    // Ensures the annotation processor prints useful information when compiling fails.
    try {
      return doProcess(roundEnv);
    } catch (RuntimeException e) {
      e.printStackTrace();
      throw e;
    }
  }

  /**
   * Processes annotations and generates files.
   *
   * @param roundEnv the processing round environment.
   */
  private boolean doProcess(RoundEnvironment roundEnv) {
    // Ensures the code below runs only once. Because processing needs to be completed in the final
    // round that depends on the code generated below, this code should not run in the final
    // processing run.
    if (!hasWrittenFiles) {
      SortedSetMultimap<String, Integer> catalogVersionsMap =
          generateVersionsFromAnnotations(roundEnv);

      if (!catalogVersionsMap.isEmpty()) {
        for (String catalogName : catalogVersionsMap.keySet()) {
          Set<Integer> versions = catalogVersionsMap.get(catalogName);
          int latestVersion = getLatestVersion(versions);

          if (!versions.isEmpty()) {
            GeneratedCatalogCodeGenerator.generate(
                versions, latestVersion, catalogName, elementUtils, messager, filer);
            VersionCatalogCodeGenerator.generate(versions, catalogName, messager, filer);
            AbstractGoogleAdsClientCodeGenerator.generate(
                versions, latestVersion, catalogName, messager, filer);
            GoogleAdsAllVersionsCodeGenerator.generate(
                versions, latestVersion, catalogName, messager, filer);
          }
        }
        hasWrittenFiles = true;
      }
    }
    return false;
  }

  /**
   * Dynamically creates a SortedSetMultimap of the available versions of the Google Ads API, that
   * is mapped by catalog name, by finding all of the unique catalogName (e.g. "v1" or "v1_v2") and
   * versionName (e.g. "v1" or "v2") descriptors included in @VersionDescriptor annotations
   * throughout the library. Each set of versions is mapped to its specified catalog name.
   *
   * @param roundEnv the environment of the processing round.
   * @return a set of the available versions in the library.
   */
  private static SortedSetMultimap<String, Integer> generateVersionsFromAnnotations(
      RoundEnvironment roundEnv) {
    SortedSetMultimap<String, Integer> versionsMap = TreeMultimap.create();

    for (Element annotatedElement : roundEnv.getElementsAnnotatedWith(VersionDescriptor.class)) {
      TypeElement typeElement = (TypeElement) annotatedElement;
      String validExceptionFactoryType = "BaseGoogleAdsException.Factory";
      if (!isValidExceptionFactory(typeElement, validExceptionFactoryType)) {
        throw new IllegalArgumentException(
            String.format(
                "googleAdsExceptionFactory parameters in VersionDescriptor either be of class"
                    + " type %s or directly extend %s.",
                validExceptionFactoryType, validExceptionFactoryType));
      }

      VersionDescriptor annotation = typeElement.getAnnotation(VersionDescriptor.class);
      if (annotation.versionName().charAt(0) == 'v') {
        int version = Integer.parseInt(annotation.versionName().substring(1));
        versionsMap.put(annotation.catalogName(), version);
      } else {
        throw new IllegalArgumentException(
            "versionName parameters in VersionDescriptor annotations must be in"
                + " the format 'vX' where X is an integer.");
      }
    }
    return versionsMap;
  }

  /**
   * Checks if the googleAdsExceptionFactory is of a valid type. In order to be valid, the provided
   * googleAdsExceptionFactory must be either equal to or a direct child of the provided type.
   *
   * @param typeElement the annotated element.
   * @param validExceptionFactoryType the simple class name of the valid type against which to check
   *     validity.
   * @return true if the googleAdsExceptionFactory is of a valid type or false if not.
   */
  private static boolean isValidExceptionFactory(
      TypeElement typeElement, String validExceptionFactoryType) {
    TypeElement exceptionFactoryElement = getExceptionFactoryElement(typeElement);
    if (isClassNameValid(
        exceptionFactoryElement.getQualifiedName().toString(), validExceptionFactoryType)) {
      return true;
    }

    String superClass = exceptionFactoryElement.getSuperclass().toString();
    return isClassNameValid(superClass, validExceptionFactoryType);
  }

  /**
   * Gets the value of the googleAdsExceptionFactory field of a VersionDescriptor as a TypeElement.
   *
   * @param typeElement the annotated element.
   * @return the TypeElement of the googleAdsExceptionFactory value in the annotation.
   */
  private static TypeElement getExceptionFactoryElement(TypeElement typeElement) {
    for (AnnotationMirror annotationMirror : typeElement.getAnnotationMirrors()) {
      for (Entry<? extends ExecutableElement, ? extends AnnotationValue> entry :
          annotationMirror.getElementValues().entrySet()) {
        if (entry.getKey().getSimpleName().toString().equals("googleAdsExceptionFactory")) {
          DeclaredType exceptionFactoryMirror = (DeclaredType) entry.getValue().getValue();
          return (TypeElement) exceptionFactoryMirror.asElement();
        }
      }
    }
    return null;
  }

  /**
   * Checks if the provided class name is of a valid type.
   *
   * @param className the String representation of the class name.
   * @param validExceptionFactoryType the simple class name of the valid type against which to check
   *     validity.
   * @return true if the googleAdsExceptionFactory is of a valid type or false if not.
   */
  private static boolean isClassNameValid(String className, String validExceptionFactoryType) {
    int end = className.indexOf("<");
    if (end != -1) {
      className = className.substring(0, end);
    }
    if (className.endsWith(validExceptionFactoryType)) {
      return true;
    }
    return false;
  }

  /**
   * Gets the latest production version.
   *
   * @param versions list of versions.
   * @return the latest available version of the Google Ads library.
   */
  private static int getLatestVersion(Set<Integer> versions) {
    int latestVersion = 0;
    for (int version : versions) {
      if (version != 999) {
        latestVersion = max(latestVersion, version);
      }
    }
    return latestVersion;
  }
}
