// Copyright 2019 Google LLC
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

package com.google.ads.googleads.lib;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class GoogleAdsHeaderProviderTest {

  /** Verifies that the developer token is not nullable. */
  @Test
  public void requiresDeveloperToken() {
    try {
      GoogleAdsHeaderProvider.newBuilder().build();
      fail();
    } catch (IllegalStateException ex) {
      // expected
    }
  }

  /** Verifies that the customer ID is nullable and when null is not present in headers. */
  @Test
  public void loginCustomerIdOptional() {
    GoogleAdsHeaderProvider provider =
        GoogleAdsHeaderProvider.newBuilder().setDeveloperToken("test").build();
    assertNull(provider.getLoginCustomerId());
    assertFalse(
        "login customer id found when null",
        provider.getHeaders().containsKey("login-customer-id"));
  }

  /** Verifies that the login customer id is set and present when provided. */
  @Test
  public void loginCustomerId_includesIfSet() {
    GoogleAdsHeaderProvider provider =
        GoogleAdsHeaderProvider.newBuilder()
            .setDeveloperToken("test")
            .setLoginCustomerId(123L)
            .build();
    assertEquals("Incorrect login customer id", 123, (long) provider.getLoginCustomerId());
    assertEquals(
        "Missing login customer id", "123", provider.getHeaders().get("login-customer-id"));
  }

  /** Verifies that the linked customer ID is nullable and when null is not present in headers. */
  @Test
  public void linkedCustomerIdOptional() {
    GoogleAdsHeaderProvider provider =
        GoogleAdsHeaderProvider.newBuilder().setDeveloperToken("test").build();
    assertNull(provider.getLinkedCustomerId());
    assertFalse(
        "linked customer id found when null",
        provider.getHeaders().containsKey("linked-customer-id"));
  }

  /** Verifies that the linked customer id is set and present when provided. */
  @Test
  public void linkedCustomerId_includesIfSet() {
    GoogleAdsHeaderProvider provider =
        GoogleAdsHeaderProvider.newBuilder()
            .setDeveloperToken("test")
            .setLinkedCustomerId(123L)
            .build();
    assertEquals("Incorrect linked customer id", 123, (long) provider.getLinkedCustomerId());
    assertEquals(
        "Missing linked customer id", "123", provider.getHeaders().get("linked-customer-id"));
  }

  /** Verifies that the developer token is set and present in the headers. */
  @Test
  public void developerToken_includesInHeaderSet() {
    GoogleAdsHeaderProvider provider =
        GoogleAdsHeaderProvider.newBuilder().setDeveloperToken("test").build();
    assertEquals("Developer token incorrect", "test", provider.getHeaders().get("developer-token"));
  }

  /** Verifies that the API client version header is sent */
  @Test
  public void apiClientVersion_isIncluded() {
    GoogleAdsHeaderProvider provider =
        GoogleAdsHeaderProvider.newBuilder().setDeveloperToken("test").build();
    assertTrue(provider.getHeaders().containsKey("x-goog-api-client"));

  }
}
