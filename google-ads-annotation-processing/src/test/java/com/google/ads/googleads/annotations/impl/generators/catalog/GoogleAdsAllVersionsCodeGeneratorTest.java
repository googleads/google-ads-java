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
import java.util.Set;
import org.junit.Test;

/** Test cases for {@link GoogleAdsAllVersionsCodeGenerator}. */
public class GoogleAdsAllVersionsCodeGeneratorTest extends AbstractGeneratorTest {

  private Set<Integer> versions = ImmutableSet.of(1, 2, 3);
  private int latestVersion = 3;
  private String catalogName = "";

  /** Ensures that a base case generated code matches expectations. */
  @Test
  public void baseCaseGeneratedCodeMatches() throws IOException {
    assertGeneratedCodeMatches(
        "/com/google/ads/googleads/annotations/impl/GoogleAdsAllVersions.java.expected");
  }

  /** Implements abstract class method to invoke code generator. */
  @Override
  protected void invokeCodeGenClass() {
    new GoogleAdsAllVersionsCodeGenerator(versions, latestVersion, catalogName, messager, filer)
        .generate();
  }
}
