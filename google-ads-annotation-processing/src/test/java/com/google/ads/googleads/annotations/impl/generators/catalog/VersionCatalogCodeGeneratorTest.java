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

import com.google.ads.googleads.annotations.impl.generators.AbstractGeneratorTest;
import com.google.common.collect.ImmutableSet;
import java.io.IOException;
import org.junit.Test;

/** Test cases for {@link VersionCatalogCodeGenerator}. */
public class VersionCatalogCodeGeneratorTest extends AbstractGeneratorTest {

  /** Ensures that generated code matches expectations for a catalog with several versions. */
  @Test
  public void baseCaseGeneratedCodeMatches() throws IOException {
    assertGeneratedCodeMatches(
        "/com/google/ads/googleads/annotations/impl/VersionCatalog.java.expected");
  }

  /** Implements the abstract method to invoke the code generator. */
  @Override
  protected void invokeCodeGenClass() {
    new VersionCatalogCodeGenerator(ImmutableSet.of(123, 456, 789), "foo", messager, filer)
        .generate();
  }
}
