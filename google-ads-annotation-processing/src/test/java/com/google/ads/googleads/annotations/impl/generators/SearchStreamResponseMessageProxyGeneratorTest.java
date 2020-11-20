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

import static com.google.ads.googleads.annotations.impl.generators.AbstractMessageProxyGenerator.MIN_VERSION_FOR_CUSTOMER_USER_ACCESS;

import com.google.common.collect.ImmutableSet;
import java.io.IOException;
import org.junit.Test;

/** Test cases for {@link SearchStreamResponseMessageProxyGenerator}. */
public class SearchStreamResponseMessageProxyGeneratorTest extends AbstractGeneratorTest {

  private int version;

  /** Implements the {@link AbstractGeneratorTest} hook for calling the code generator. */
  @Override
  protected void invokeCodeGenClass() {
    new SearchStreamResponseMessageProxyGenerator(ImmutableSet.of(version), messager, filer)
        .generate();
  }

  /**
   * Tests generated code prior to v6 (when there was no support for
   * CustomerUserAccess.email_address and CustomerUserAccess.inviter_user_email_address.)
   */
  @Test
  public void preV6DisablesCustomerUserAccess() throws IOException {
    version = MIN_VERSION_FOR_CUSTOMER_USER_ACCESS - 1;
    assertGeneratedCodeMatches(
        "/com/google/ads/googleads/annotations/impl/SearchStreamResponseMessageProxy_preV6.java.expected");
  }

  /**
   * Tests that generated code after v6 supports setters for CustomerUserAccess.email_address and
   * CustomerUserAccess.inviter_user_email_address.
   */
  @Test
  public void V6enablesCustomerUserAccess() throws IOException {
    version = MIN_VERSION_FOR_CUSTOMER_USER_ACCESS;
    assertGeneratedCodeMatches(
        "/com/google/ads/googleads/annotations/impl/SearchStreamResponseMessageProxy_V6.java.expected");
  }
}
