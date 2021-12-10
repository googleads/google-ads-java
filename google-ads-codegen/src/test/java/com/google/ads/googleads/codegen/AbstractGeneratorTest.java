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

import static org.junit.Assert.assertEquals;

import com.google.common.io.Resources;
import com.squareup.javapoet.JavaFile;
import com.squareup.javapoet.TypeSpec;
import java.io.IOException;
import java.nio.charset.Charset;
import javax.annotation.processing.Filer;
import javax.annotation.processing.Messager;
import org.junit.Rule;
import org.junit.rules.TemporaryFolder;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

/**
 * Defines a generic test case for code generators which write code via {@link
 * Utils#writeGeneratedClassToFile(String, TypeSpec, Messager, Filer)}.
 *
 * <p>Provides Mockito support for validating that the serialized code matches expectations.
 */
@RunWith(MockitoJUnitRunner.class)
public abstract class AbstractGeneratorTest {

  @Rule
  public TemporaryFolder temporaryFolder = new TemporaryFolder();


  /** Calls invokeCodeGenClass and returns the generated code as a String. */
  protected String generateCode() {
    JavaFile javaFile = invokeCodeGenClass();
    return javaFile.toString();
  }

  protected void assertGeneratedCodeMatches(String... expectedResourcePaths) throws IOException {
    for (String expectedResource : expectedResourcePaths) {
      String actual = generateCode();
      String expected = loadResource(expectedResource);
      assertEquals("Generated code mismatch: " + expectedResource, expected, actual);
    }
  }

  /** Abstracts the code generator implementation.
   * @return*/
  protected abstract JavaFile invokeCodeGenClass();

  /** Loads a resource (i.e. expected generated code) as a String. */
  private static String loadResource(String path) throws IOException {
    return Resources.toString(
        AbstractGeneratorTest.class.getResource(path), Charset.forName("UTF-8"));
  }
}
