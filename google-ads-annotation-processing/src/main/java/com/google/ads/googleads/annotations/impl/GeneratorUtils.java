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

package com.google.ads.googleads.annotations.impl;

import com.squareup.javapoet.AnnotationSpec;
import com.squareup.javapoet.ClassName;
import com.squareup.javapoet.JavaFile;
import com.squareup.javapoet.TypeSpec;
import java.io.IOException;
import javax.annotation.Generated;
import javax.annotation.processing.Filer;
import javax.annotation.processing.Messager;
import javax.tools.Diagnostic;
import javax.tools.Diagnostic.Kind;

/**
 * Provides access to utility methods used in code generation during annotation processing.
 */
class GeneratorUtils {

  /**
   * Creates the @Generated annotation
   */
  static AnnotationSpec generatedAnnotation() {
    return AnnotationSpec.builder(Generated.class)
        .addMember("value", "$S", "GoogleAdsCatalogAnnotationProcessor")
        .build();
  }

  /**
   * Constructs a class name given a version of the Google Ads library and a service client.
   *
   * @param version of the Google Ads library.
   * @param serviceClient the service client for which the class is being created.
   * @return ClassName object for the given version of the library and service client.
   */
  static ClassName createServiceClientClassName(int version, String serviceClient) {
    return ClassName.get("com.google.ads.googleads.v" + version + ".services", serviceClient);
  }

  /**
   * @param packageName the name of the package.
   * @param clazz the generated class.
   */
  static void writeGeneratedClassToFile(String packageName, TypeSpec clazz, Messager messager,
      Filer filer) {
    final String LICENSE =
        ""
            + "Copyright 2020 Google LLC\n"
            + "\n"
            + "Licensed under the Apache License, Version 2.0 (the \"License\");\n"
            + "you may not use this file except in compliance with the License.\n"
            + "You may obtain a copy of the License at\n"
            + "\n"
            + "    http://www.apache.org/licenses/LICENSE-2.0\n"
            + "\n"
            + "Unless required by applicable law or agreed to in writing, software\n"
            + "distributed under the License is distributed on an \"AS IS\" BASIS,\n"
            + "WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.\n"
            + "See the License for the specific language governing permissions and\n"
            + "limitations under the License.";

    try {
      JavaFile.builder(packageName, clazz).addFileComment(LICENSE).build().writeTo(filer);
      messager.printMessage(Kind.NOTE, "Successfully generated class " + packageName + clazz.name);
    } catch (IOException ioe) {
      messager.printMessage(Diagnostic.Kind.ERROR, "Failed to create file: " + ioe);
      throw new RuntimeException(
          "There was an error writing the class file " + packageName + "." + clazz, ioe);
    }
  }
}