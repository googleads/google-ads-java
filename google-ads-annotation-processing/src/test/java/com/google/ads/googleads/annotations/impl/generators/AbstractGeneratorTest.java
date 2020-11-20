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

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.any;
import static org.mockito.Matchers.anyVararg;
import static org.mockito.Mockito.when;

import com.google.common.io.Resources;
import com.squareup.javapoet.TypeSpec;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import javax.annotation.processing.Filer;
import javax.annotation.processing.Messager;
import javax.tools.JavaFileObject;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.mockito.AdditionalAnswers;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

/**
 * Defines a generic test case for code generators which write code via {@link
 * Utils#writeGeneratedClassToFile(String, TypeSpec, Messager, Filer)}.
 *
 * <p>Provides Mockito support for validating that the serialized code matches expectations.
 */
@RunWith(MockitoJUnitRunner.class)
public abstract class AbstractGeneratorTest {

  @Mock public Messager messager;
  @Mock public Filer filer;
  @Mock public JavaFileObject javaFileObject;
  private Queue<ByteArrayOutputStream> outputStreams;

  @Before
  public void setup() throws IOException {
    outputStreams = new LinkedList<>();
    when(filer.createSourceFile(any(), anyVararg())).thenReturn(javaFileObject);
  }

  /**
   * Allows writing a number of files in succession, each having their own writer. File contents are
   * available in then available in outputStreams.
   */
  private void setupWriters(int numFiles) throws IOException {
    List<Writer> writers = new ArrayList();
    for (int i = 0; i < numFiles; ++i) {
      ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
      outputStreams.add(outputStream);
      writers.add(new PrintWriter(outputStream));
    }
    when(javaFileObject.openWriter()).then(AdditionalAnswers.returnsElementsOf(writers));
  }

  /** Calls invokeCodeGenClass and returns the generted code as a String. */
  protected String generateCode() {
    invokeCodeGenClass();
    return new String(outputStreams.remove().toByteArray(), Charset.forName("UTF-8"));
  }

  protected void assertGeneratedCodeMatches(String... expectedResourcePaths) throws IOException {
    setupWriters(expectedResourcePaths.length);
    for (String expectedResource : expectedResourcePaths) {
      String actual = generateCode();
      String expected = loadResource(expectedResource);
      assertEquals("Generated code mismatch: " + expectedResource, expected, actual);
    }
  }

  /** Abstracts the code generator implementation. */
  protected abstract void invokeCodeGenClass();

  /** Loads a resource (i.e. expected generated code) as a String. */
  protected static String loadResource(String path) throws IOException {
    return Resources.toString(
        AbstractGeneratorTest.class.getResource(path), Charset.forName("UTF-8"));
  }
}
