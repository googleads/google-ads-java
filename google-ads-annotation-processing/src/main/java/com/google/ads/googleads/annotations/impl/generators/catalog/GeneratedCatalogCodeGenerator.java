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
import com.google.api.gax.core.FixedCredentialsProvider;
import com.google.api.gax.rpc.TransportChannelProvider;
import com.google.auth.Credentials;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSortedSet;
import com.squareup.javapoet.ClassName;
import com.squareup.javapoet.CodeBlock;
import com.squareup.javapoet.FieldSpec;
import com.squareup.javapoet.MethodSpec;
import com.squareup.javapoet.ParameterizedTypeName;
import com.squareup.javapoet.TypeSpec;
import java.io.IOException;
import java.util.Set;
import java.util.SortedSet;
import javax.annotation.processing.Filer;
import javax.annotation.processing.Messager;
import javax.lang.model.element.Element;
import javax.lang.model.element.ElementKind;
import javax.lang.model.element.ExecutableElement;
import javax.lang.model.element.Modifier;
import javax.lang.model.element.Name;
import javax.lang.model.element.TypeElement;
import javax.lang.model.util.Elements;

/**
 * Generates code for and writes the GeneratedCatalog class, which provides methods to access a
 * GoogleAdsVersion object for each available version of the library. In turn, each GoogleAdsVersion
 * provides methods to create service clients for every service that is available in a given version
 * of the Google Ads library.
 *
 * <p>Example generated code snippets:
 *
 * <pre>
 *  public GoogleAdsVersion getVersion1() {
 *    return new V1Client(provider, credentials);
 *  }
 *  ...
 *  private static class V1Client implements GoogleAdsVersion {
 *  ...
 *    public UserListServiceClient createUserListServiceClient() {
 *    ...
 *    }
 *  ...
 *  }
 *  </pre>
 */
public class GeneratedCatalogCodeGenerator implements Generator {

  private static final ClassName VERSION_CLASS_NAME =
      ClassName.get("com.google.ads.googleads.lib.catalog", "Version");
  private static final ClassName IMMUTABLE_SET_CLASS_NAME = ClassName.get(ImmutableSet.class);

  private final Set<Integer> versions;
  private final int latestVersion;
  private final String catalogName;
  private final Elements elementUtils;
  private final Messager messager;
  private final Filer filer;

  /**
   * Creates and instance of the generator.
   *
   * @param versions available versions of the Google Ads library.
   * @param latestVersion the latest available version of the Google Ads library.
   * @param catalogName the catalogName parameter found in the VersionDescriptor annotation that
   *     will be used to namespace the output classname (can be an empty string).
   * @param messager the processing environment's messager.
   * @param filer the processing environment's filer.
   */
  public GeneratedCatalogCodeGenerator(
      Set<Integer> versions,
      int latestVersion,
      String catalogName,
      Elements elementUtils,
      Messager messager,
      Filer filer) {
    this.versions = versions;
    this.latestVersion = latestVersion;
    this.catalogName = catalogName;
    this.elementUtils = elementUtils;
    this.messager = messager;
    this.filer = filer;
  }

  /** Generates the code for the GeneratedCatalog class and writes the file. */
  @Override
  public void generate() {
    String generatedCatalogSimpleName = "GeneratedCatalog";
    if (!catalogName.isEmpty()) {
      generatedCatalogSimpleName += "_" + catalogName;
    }

    ClassName generatedCatalogClassName =
        ClassName.get("com.google.ads.googleads.lib.catalog", generatedCatalogSimpleName);

    // Creates the ApiCatalog instance variable.
    FieldSpec instance =
        FieldSpec.builder(generatedCatalogClassName, "instance")
            .addModifiers(Modifier.PRIVATE, Modifier.STATIC)
            .build();

    // Creates a static block instantiating the instance class variable.
    CodeBlock instanceInitializer =
        CodeBlock.builder()
            .beginControlFlow("try")
            .addStatement(
                "instance = new $T($T.getCatalog())",
                generatedCatalogClassName,
                ClassName.get("com.google.ads.googleads.lib.catalog", "VersionCatalog"))
            .nextControlFlow("catch ($T e)", IllegalAccessException.class)
            .addStatement("throw new RuntimeException(e)")
            .nextControlFlow("catch ($T e)", InstantiationException.class)
            .addStatement("throw new RuntimeException(e)")
            .endControlFlow()
            .build();

    // Creates the supportedVersions variable.
    FieldSpec supportedVersions =
        FieldSpec.builder(
                ParameterizedTypeName.get(
                    ClassName.get(ImmutableSortedSet.class), VERSION_CLASS_NAME),
                "supportedVersions")
            .addModifiers(Modifier.PRIVATE, Modifier.FINAL)
            .build();

    // Creates the constructor method for the GeneratedCatalog class.
    MethodSpec constructor =
        MethodSpec.constructorBuilder()
            .addModifiers(Modifier.PUBLIC)
            .addParameter(
                ParameterizedTypeName.get(IMMUTABLE_SET_CLASS_NAME, VERSION_CLASS_NAME), "versions")
            .addStatement("supportedVersions = $T.copyOf(versions)", ImmutableSortedSet.class)
            .addJavadoc("Creates a new constant catalog from a known collection of versions.")
            .build();

    // Creates the getDefault method.
    MethodSpec getDefault =
        MethodSpec.methodBuilder("getDefault")
            .addModifiers(Modifier.PUBLIC, Modifier.STATIC)
            .returns(generatedCatalogClassName)
            .addStatement("return instance")
            .build();

    // Creates the getSupportedVersions method.
    MethodSpec getSupportedVersions =
        MethodSpec.methodBuilder("getSupportedVersions")
            .addModifiers(Modifier.PUBLIC)
            .returns(ParameterizedTypeName.get(ClassName.get(SortedSet.class), VERSION_CLASS_NAME))
            .addStatement("return supportedVersions")
            .build();

    // Creates the getLatestVersion method.
    MethodSpec getLatestVersion =
        MethodSpec.methodBuilder("getLatestVersion")
            .addModifiers(Modifier.PUBLIC)
            .returns(VERSION_CLASS_NAME)
            .addStatement("return getSupportedVersions().first()")
            .build();

    // Creates the createAllVersionsClient method.
    MethodSpec createAllVersionsClient =
        createAllVersionsClient(versions, latestVersion, catalogName);

    // Creates the GeneratedCatalog class.
    TypeSpec.Builder generatedCatalogBuilder =
        TypeSpec.classBuilder(generatedCatalogSimpleName)
            .addAnnotation(Utils.generatedAnnotation())
            .addModifiers(Modifier.PUBLIC)
            .addField(instance)
            .addStaticBlock(instanceInitializer)
            .addField(supportedVersions)
            .addMethod(constructor)
            .addMethod(getDefault)
            .addMethod(getSupportedVersions)
            .addMethod(getLatestVersion)
            .addMethod(createAllVersionsClient);

    // The generated catalog should implement the ApiCatalog class as not to be called directly.
    // This does not, however, apply to catalogs that are generated during the test-compile phase.
    // This is because the createAllVersionsClient method in ApiCatalog will not have a matching
    // implementation for test cases (specifically there will be a mismatch on
    // GoogleAdsAllVersions class name which is suffixed with the catalog name).
    if (generatedCatalogSimpleName.equals("GeneratedCatalog")) {
      generatedCatalogBuilder.superclass(
          ClassName.get("com.google.ads.googleads.lib.catalog", "AbstractCatalog"));
    }

    // Creates a version class for each version.
    for (Integer version : versions) {
      generatedCatalogBuilder.addType(createClient(version, elementUtils));
    }

    Utils.writeGeneratedClassToFile(
        "com.google.ads.googleads.lib.catalog", generatedCatalogBuilder.build(), messager, filer);
  }

  /**
   * Creates a client to access all service clients for a given version.
   *
   * @param version the version of the client to be created.
   * @return TypeSpec of the generated class.
   */
  private static TypeSpec createClient(int version, Elements elementUtils) {
    // Creates the provider variable.
    FieldSpec provider =
        FieldSpec.builder(TransportChannelProvider.class, "provider")
            .addModifiers(Modifier.PRIVATE, Modifier.FINAL)
            .build();

    // Creates the credentials variable.
    FieldSpec credentials =
        FieldSpec.builder(Credentials.class, "credentials")
            .addModifiers(Modifier.PRIVATE, Modifier.FINAL)
            .build();

    // Creates the constructor.
    MethodSpec constructor =
        MethodSpec.constructorBuilder()
            .addModifiers(Modifier.PUBLIC)
            .addParameter(TransportChannelProvider.class, "provider")
            .addParameter(Credentials.class, "credentials")
            .addStatement("this.provider = provider")
            .addStatement("this.credentials = credentials")
            .build();

    // Creates the a class builder for a given version client.
    TypeSpec.Builder clientBuilder =
        TypeSpec.classBuilder("V" + version + "Client")
            .addModifiers(Modifier.PRIVATE, Modifier.STATIC)
            .addSuperinterface(Utils.createServiceClientClassName(version, "GoogleAdsVersion"))
            .addField(provider)
            .addField(credentials)
            .addMethod(constructor);

    // Creates the class name for the given version of GoogleAdsVersion.
    ClassName versionClassName = Utils.createServiceClientClassName(version, "GoogleAdsVersion");
    // Gets the TypeElement for the given GoogleAdsVersion version.
    TypeElement googleAdsVersionType =
        elementUtils.getTypeElement(versionClassName.reflectionName());
    // Loops through all of the enclosed elements of the TypeElement in order to retrieve all of
    // its nested methods and generate a method for accessing a service client for each.
    for (Element enclosedElement : googleAdsVersionType.getEnclosedElements()) {
      // Checks if the enclosed element is a method.
      if (enclosedElement.getKind() == ElementKind.METHOD) {
        // Gets the method name.
        ExecutableElement executableElement = (ExecutableElement) enclosedElement;
        Name methodName = executableElement.getSimpleName();
        // Trims preceding 'create' from the method name, which provides the service client type
        // and will be used as the return value for the service client creation method.
        String serviceClient = methodName.toString().substring("create".length());
        // Adds the method to the class builder.
        clientBuilder.addMethod(createServiceClient(version, serviceClient));
      }
    }

    // Builds and returns the class TypeSpec.
    return clientBuilder.build();
  }

  /**
   * Creates a service client creation method for a given version and service client.
   *
   * @param version the version of the Google Ads library.
   * @param serviceClient the service client for which the method is being created.
   * @return MethodSpec for the method to be created.
   */
  private static MethodSpec createServiceClient(int version, String serviceClient) {
    // Creates the method builder for a given service client and version.
    MethodSpec.Builder serviceBuilder =
        MethodSpec.methodBuilder("create" + serviceClient)
            .addModifiers(Modifier.PUBLIC)
            .addAnnotation(Override.class)
            .returns(Utils.createServiceClientClassName(version, serviceClient));

    // Gets the name of the service without the word 'client', which will be later used to create
    // the given service client's settings object.
    String noClientName = serviceClient.substring(0, serviceClient.length() - "client".length());

    // Adds code body to the method builder, which creates the settings of a given service client
    // by setting the credentials and transport provider. This code is contained is a try block
    // and throws a RuntimeException exception if it fails.
    serviceBuilder.addCode(
        ""
            + "try {\n"
            + "  $T settings =\n"
            + "    $T.newBuilder()\n"
            + "      .setCredentialsProvider($T.create(credentials))\n"
            + "      .setTransportChannelProvider(provider)\n"
            + "      .build();\n"
            + "  return $T.create(settings);\n"
            + "} catch ($T e) {\n"
            + "  throw new RuntimeException(e);\n"
            + "}\n",
        Utils.createServiceClientClassName(version, noClientName + "Settings"),
        Utils.createServiceClientClassName(version, noClientName + "Settings"),
        FixedCredentialsProvider.class,
        Utils.createServiceClientClassName(version, serviceClient),
        IOException.class);

    // Builds and returns the method.
    return serviceBuilder.build();
  }

  /**
   * Creates the createAllVersionsClient method.
   *
   * @param versions available versions of the Google Ads library.
   * @param latestVersion the latest available version of the Google Ads library.
   * @param catalogName the catalogName parameter found in the VersionDescriptor annotation that
   *     will be used to namespace the output classname (can be an empty string).
   * @return MethodSpec for the method to be created.
   */
  private static MethodSpec createAllVersionsClient(
      Set<Integer> versions, int latestVersion, String catalogName) {
    String googleAdsAllVersionsSimpleName = "GoogleAdsAllVersions";
    if (!catalogName.isEmpty()) {
      googleAdsAllVersionsSimpleName += "_" + catalogName;
    }
    ClassName googleAdsAllVersionsClassName =
        ClassName.get("com.google.ads.googleads.lib", googleAdsAllVersionsSimpleName);

    // Creates an anonymous class builder that is returned by the createAllVersionsClient method.
    TypeSpec.Builder allVersionsClientBuilder =
        TypeSpec.anonymousClassBuilder("").addSuperinterface(googleAdsAllVersionsClassName);

    // Adds the getVersion[version] method for each available version to the builder.
    for (Integer version : versions) {
      allVersionsClientBuilder.addMethod(getVersion(version));
    }

    // Adds the getLatestVersion method to the builder.
    allVersionsClientBuilder.addMethod(
        MethodSpec.methodBuilder("getLatestVersion")
            .addAnnotation(Override.class)
            .addModifiers(Modifier.PUBLIC)
            .returns(
                ClassName.get(
                    "com.google.ads.googleads.v" + latestVersion + ".services", "GoogleAdsVersion"))
            .addStatement("return getVersion$L()", latestVersion)
            .build());

    // Builds the anonymous class.
    TypeSpec allVersionsClient = allVersionsClientBuilder.build();

    // Returns the createAllVersionsClient method.
    return MethodSpec.methodBuilder("createAllVersionsClient")
        .addModifiers(Modifier.PUBLIC)
        .addStatement("return $L", allVersionsClient)
        .returns(googleAdsAllVersionsClassName)
        .addParameter(TransportChannelProvider.class, "provider")
        .addParameter(Credentials.class, "credentials")
        .build();
  }

  /**
   * Creates a method with the signature getVersion[version] for a given GoogleAdsVersion.
   *
   * @param version the version of the Google Ads library.
   * @return the MethodSpec for the generated method.
   */
  private static MethodSpec getVersion(int version) {
    return MethodSpec.methodBuilder("getVersion" + version)
        .addAnnotation(Override.class)
        .addModifiers(Modifier.PUBLIC)
        .returns(Utils.createServiceClientClassName(version, "GoogleAdsVersion"))
        .addStatement("return new V" + version + "Client(provider, credentials)")
        .build();
  }
}
