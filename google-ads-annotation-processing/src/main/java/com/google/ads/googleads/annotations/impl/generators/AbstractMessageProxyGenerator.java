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
import com.squareup.javapoet.TypeName;
import com.squareup.javapoet.TypeSpec;
import java.util.Set;
import javax.annotation.processing.Filer;
import javax.annotation.processing.Messager;
import javax.lang.model.element.Modifier;

/** Abstracts common functionality for generating message proxy implementations. */
public abstract class AbstractMessageProxyGenerator implements Generator {

  public static final int MIN_VERSION_FOR_CUSTOMER_USER_ACCESS = 6;
  public static final int MIN_VERSION_FOR_CHANGE_EVENT = 6;
  protected static final String MESSAGE_PROXY_PACKAGE_NAME =
      "com.google.ads.googleads.lib.utils.messageproxy";
  protected static final String GENERATED_PACKAGE_NAME = MESSAGE_PROXY_PACKAGE_NAME + ".generated";
  private final Set<Integer> versions;
  private final Messager messager;
  private final Filer filer;

  public AbstractMessageProxyGenerator(Set<Integer> versions, Messager messager, Filer filer) {
    this.versions = versions;
    this.messager = messager;
    this.filer = filer;
  }

  /** Generates a SearchResponseProxy for each version. */
  @Override
  public void generate() {
    for (int version : versions) {
      generate(version);
    }
  }

  /** Generates a SearchResponseProxy for a specified version. */
  private void generate(int version) {
    // Defines the type handled by this generator, e.g. SearchGoogleAdsResponse.
    ClassName proxiedClassName = getProxiedClassName(version);
    // Defines the builder type for the proxied type, e.g. SearchGoogleAdsResponse.Builder.
    ClassName proxiedBuilderClassName = proxiedClassName.nestedClass("Builder");
    // Defines the raw interface (without type params) implemented by the generated class, e.g.
    // SearchResponseProxy.
    ClassName interfaceRawType = getProxyInterfaceRawName();
    // Defines the (possibly parameterized) type of the interface to implement, e.g.
    //   SearchResponseProxy<SearchGoogleAdsResponse, SearchGoogleAdsResponse.Builder>.
    //
    // This is a separate step from defining the raw type to avoid generating parameterized types
    // which do not compile (e.g. because the type parameters have not been created yet).
    TypeName interfaceType =
        getProxyInterfaceParameterizedName(
            version, interfaceRawType, proxiedClassName, proxiedBuilderClassName);
    // Defines the package to contain the generated code.
    String versionedProxyPackageName =
        AbstractMessageProxyGenerator.GENERATED_PACKAGE_NAME + ".v" + version;
    /* Example generated code:
     *  public class SearchStreamResponseMessageProxy
     *      implements SearchResponseProxy<
     *              SearchGoogleAdsStreamResponse, SearchGoogleAdsStreamResponse.Builder>
     */
    TypeSpec.Builder typeBuilder =
        TypeSpec.classBuilder(
                ClassName.get(
                    versionedProxyPackageName, proxiedClassName.simpleName() + "MessageProxy"))
            .addSuperinterface(interfaceType)
            .addAnnotation(Utils.generatedAnnotation())
            .addModifiers(Modifier.PUBLIC);

    // Calls the subclass to complete generation of the type.
    generate(typeBuilder, version, proxiedClassName, proxiedBuilderClassName);

    // Generates the code.
    Utils.writeGeneratedClassToFile(
        versionedProxyPackageName, typeBuilder.build(), messager, filer);
  }

  /** Generates the class content (methods etc.) required for the proxy implementation. */
  protected abstract void generate(
      TypeSpec.Builder typeBuilder,
      int version,
      ClassName proxiedClassName,
      ClassName proxiedBuilderClassName);

  /**
   * Gets the type of interface to be implemented. By default this is
   *
   * <pre>InterfaceRawType<ProxiedClassName, ProxiedBuilderClassName></pre>
   *
   * It can be useful to override this in cases where the proxied type doesn't exist in a version.
   * Rather than having a null proxy implementation (complicating client code), we can generate a
   * default implementation which gracefully returns the builder unchanged.
   */
  protected TypeName getProxyInterfaceParameterizedName(
      int version,
      ClassName interfaceRawType,
      ClassName proxiedClassName,
      ClassName proxiedBuilderClassName) {
    return ParameterizedTypeName.get(interfaceRawType, proxiedClassName, proxiedBuilderClassName);
  }

  /**
   * Generates a setter for a string property.
   *
   * @param typeBuilder the type which should contain the new setter.
   * @param proxiedBuilderClassName the builder for the type which is being proxied.
   * @param fullNameOfSetterMethod the name of the new method.
   * @param filterStatement a filter which should be applied prior to setting the new value. The
   *     builder will be available from a variable named builder.
   * @param updateStatement a statement to update the value. The builder will be available from a
   *     variable named builder.
   * @param version the version this setter is generated for.
   * @param minVersion the minimum version required to access the type, and execute filter + update
   *     statements.
   */
  protected static void generateStringSetter(
      TypeSpec.Builder typeBuilder,
      ClassName proxiedBuilderClassName,
      String fullNameOfSetterMethod,
      String filterStatement,
      String updateStatement,
      int version,
      int minVersion) {
    generateStringSetter(
        typeBuilder,
        proxiedBuilderClassName,
        fullNameOfSetterMethod,
        filterStatement,
        updateStatement,
        version,
        minVersion,
        minVersion);
  }
  /**
   * Generates a setter for a string property.
   *
   * @param typeBuilder the type which should contain the new setter.
   * @param proxiedBuilderClassName the builder for the type which is being proxied.
   * @param fullNameOfSetterMethod the name of the new method.
   * @param filterStatement a filter which should be applied prior to setting the new value. The
   *     builder will be available from a variable named builder.
   * @param updateStatement a statement to update the value. The builder will be available from a
   *     variable named builder.
   * @param version the version this setter is generated for.
   * @param minVersionForFilterAndUpdate the minimum version required to access the type.
   * @param minVersionForFilterAndUpdate the minimum version required to support the filter + update
   *     statements.
   */
  protected static void generateStringSetter(
      TypeSpec.Builder typeBuilder,
      ClassName proxiedBuilderClassName,
      String fullNameOfSetterMethod,
      String filterStatement,
      String updateStatement,
      int version,
      int minVersionForType,
      int minVersionForFilterAndUpdate) {
    if (version < minVersionForType) {
      proxiedBuilderClassName = ClassName.get("com.google.protobuf", "Message", "Builder");
    }
    MethodSpec.Builder methodBuilder =
        MethodSpec.methodBuilder(fullNameOfSetterMethod)
            .addAnnotation(Override.class)
            .addModifiers(Modifier.PUBLIC)
            .returns(proxiedBuilderClassName)
            .addParameter(proxiedBuilderClassName, "builder")
            .addParameter(String.class, "toSet");
    if (version >= minVersionForFilterAndUpdate) {
      methodBuilder.beginControlFlow("if ($L)", filterStatement);
      methodBuilder.addStatement(updateStatement);
      methodBuilder.endControlFlow();
    }
    methodBuilder.addStatement("return builder");
    typeBuilder.addMethod(methodBuilder.build());
  }

  /** Gets the name of the super interface that the generated proxy should implement. */
  protected abstract ClassName getProxyInterfaceRawName();

  /** Gets the name of the class that this proxy is for. */
  protected abstract ClassName getProxiedClassName(int version);

  /** Gets the package where the API generated services classes are located. */
  protected static String getServicesPackage(int version) {
    return "com.google.ads.googleads.v" + version + ".services";
  }

  /** Gets the package where the API resource classes are located. */
  protected static String getResourcesPackage(int version) {
    return "com.google.ads.googleads.v" + version + ".resources";
  }
}
