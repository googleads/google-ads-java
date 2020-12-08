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

package com.google.ads.googleads.annotations.impl.generators.messageproxy;

import com.google.ads.googleads.annotations.impl.generators.AbstractGeneratorTest;
import com.google.common.collect.ImmutableSet;
import java.io.IOException;
import org.junit.Test;

public class FeedMessageProxyGeneratorTest extends AbstractGeneratorTest {
  private int version;

  @Override
  protected void invokeCodeGenClass() {
    new FeedMessageProxyGenerator(ImmutableSet.of(version), messager, filer).generate();
  }

  @Test
  public void generates_v6() throws IOException {
    version = 6;
    assertGeneratedCodeMatches(
        "/com/google/ads/googleads/annotations/impl/FeedMessageProxy_v6.java.expected");
  }

  @Test
  public void generates_prev6() throws IOException {
    version = 5;
    assertGeneratedCodeMatches(
        "/com/google/ads/googleads/annotations/impl/FeedMessageProxy_prev6.java.expected");
  }
}
