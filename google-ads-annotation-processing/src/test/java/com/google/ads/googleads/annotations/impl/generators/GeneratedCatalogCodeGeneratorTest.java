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

import static org.mockito.Mockito.when;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import javax.lang.model.element.Element;
import javax.lang.model.element.ElementKind;
import javax.lang.model.element.ExecutableElement;
import javax.lang.model.element.Name;
import javax.lang.model.element.TypeElement;
import javax.lang.model.util.Elements;
import org.junit.Test;
import org.mockito.Mock;

/** Test cases for {@link GeneratedCatalogCodeGenerator} . */
public class GeneratedCatalogCodeGeneratorTest extends AbstractGeneratorTest {

  private Set<Integer> versions = ImmutableSet.of(1);
  private int latestVersion = 1;
  private String catalogName = "";
  @Mock private Elements elementUtils;
  @Mock private TypeElement v1Version;
  @Mock private ExecutableElement v1ServiceMethod;
  @Mock private Name v1ServiceName;

  /** Ensures the the generated code matches a base case. */
  @Test
  public void baseCaseCodeMatches() throws IOException {
    // Mocks out the javac API. This was pretty gnarly so consider refactoring generator to avoid
    // direct dependency on javac.
    when(v1Version.getKind()).thenReturn(ElementKind.METHOD);
    when(elementUtils.getTypeElement("com.google.ads.googleads.v1.services.GoogleAdsVersion"))
        .thenReturn(v1Version);
    when(v1Version.getEnclosedElements())
        .thenReturn((List) ImmutableList.<Element>of(v1ServiceMethod));
    when(v1ServiceMethod.getSimpleName()).thenReturn(v1ServiceName);
    when(v1ServiceName.toString()).thenReturn("getFooClient");
    // Executes the test case.
    assertGeneratedCodeMatches(
        "/com/google/ads/googleads/annotations/impl/GeneratedCatalog.java.expected");
  }

  /** Implements the abstract method to invoke generator. */
  @Override
  protected void invokeCodeGenClass() {
    new GeneratedCatalogCodeGenerator(
            versions, latestVersion, catalogName, elementUtils, messager, filer)
        .generate();
  }
}
