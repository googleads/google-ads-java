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

package com.google.ads.googleads.lib.catalog;

import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.lessThan;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import com.google.ads.googleads.lib.BaseGoogleAdsException;
import com.google.ads.googleads.lib.utils.messageproxy.MessageProxyProvider;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

@RunWith(JUnit4.class)
public class VersionTest {

  @Mock private BaseGoogleAdsException.Factory typeFactory;
  @Mock private MessageProxyProvider messageProxyProvider;
  private Version v0;
  private Version v1;

  @Before
  public void setup() {
    MockitoAnnotations.initMocks(this);
    v0 = new Version("v0", typeFactory, String.class, messageProxyProvider);
    v1 = new Version("v1", typeFactory, String.class, messageProxyProvider);
  }

  /** Ensures the compareTo operator works in x < y case. */
  @Test
  public void compareTo_respectsLowerVersion() {
    assertThat(v1.compareTo(v0), is(lessThan(0)));
  }

  /** Ensures the compareTo operator works in x > y case. */
  @Test
  public void compareTo_respectsHigherVersion() {
    assertThat(v0.compareTo(v1), is(greaterThan(0)));
  }

  /** Ensures the compareTo operator works in x == y case. */
  @Test
  public void compareTo_respectsEqualVersion() {
    assertEquals(0, v0.compareTo(v0));
  }
}
