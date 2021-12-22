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

import com.squareup.javapoet.AnnotationSpec;
import com.squareup.javapoet.ClassName;
import com.squareup.javapoet.JavaFile;
import com.squareup.javapoet.TypeSpec;
import java.io.File;
import java.io.IOException;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** Provides access to utility methods used in code generation during annotation processing. */
public class Utils {
  private static final Logger logger = LoggerFactory.getLogger(Utils.class);

  /** Creates the @Generated annotation */
  public static AnnotationSpec generatedAnnotation() {
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
  public static ClassName createServiceClientClassName(int version, String serviceClient) {
    return ClassName.get("com.google.ads.googleads.v" + version + ".services", serviceClient);
  }

  public static JavaFile createJavaFile(String packageName, TypeSpec typeSpec) {
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
    return JavaFile.builder(packageName, typeSpec)
        .addFileComment(LICENSE)
        .skipJavaLangImports(true)
        .build();
  }

  /** */
  public static void writeGeneratedClassToFile(JavaFile javaFile, File targetDirectory) {
    try {
      javaFile.writeTo(targetDirectory);
    } catch (IOException ioe) {
      throw new RuntimeException(
          "There was an error writing the class file " + javaFile.typeSpec.name, ioe);
    }
  }
}
