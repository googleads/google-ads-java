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

import static com.google.ads.googleads.annotations.impl.generators.AbstractMessageProxyGenerator.MIN_VERSION_FOR_CHANGE_EVENT;
import static com.google.ads.googleads.annotations.impl.generators.AbstractMessageProxyGenerator.MIN_VERSION_FOR_CUSTOMER_USER_ACCESS;

import com.google.common.collect.ImmutableSet;
import java.io.IOException;
import java.util.Set;
import org.junit.Test;

/** Defines test cases for {@link SearchPagedResponseMessageProxyGenerator}. */
public class SearchPagedResponseMessageProxyGeneratorTest extends AbstractGeneratorTest {
  private Set<Integer> versions;

  @Test
  public void customerUserAccessTogglesAvailability() throws IOException {
    versions =
        ImmutableSet.of(
            MIN_VERSION_FOR_CUSTOMER_USER_ACCESS - 1, MIN_VERSION_FOR_CUSTOMER_USER_ACCESS);
    assertGeneratedCodeMatches(
        "/com/google/ads/googleads/annotations/impl/SearchPagedResponseMessageProxy_v5.java.expected",
        "/com/google/ads/googleads/annotations/impl/SearchPagedResponseMessageProxy_v6.java.expected");
  }

  @Test
  public void changeEventTogglesAvaiability() throws IOException {
    versions = ImmutableSet.of(MIN_VERSION_FOR_CHANGE_EVENT - 1, MIN_VERSION_FOR_CHANGE_EVENT);
    assertGeneratedCodeMatches(
        "/com/google/ads/googleads/annotations/impl/SearchPagedResponseMessageProxy_v5.java.expected",
        "/com/google/ads/googleads/annotations/impl/SearchPagedResponseMessageProxy_v6.java.expected");
  }

  @Override
  protected void invokeCodeGenClass() {
    new SearchPagedResponseMessageProxyGenerator(versions, messager, filer).generate();
  }
}
