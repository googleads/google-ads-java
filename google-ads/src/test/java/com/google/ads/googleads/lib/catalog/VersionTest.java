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

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.lessThan;
import static org.junit.Assert.assertEquals;

import com.google.ads.googleads.lib.stubs.exceptions.BaseGoogleAdsException;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.StrictStubs.class)
public class VersionTest {

  @Mock private BaseGoogleAdsException.Factory typeFactory;
  private Version v0;
  private Version v1;

  @Before
  public void setup() {
    v0 = new Version("v0", typeFactory, String.class);
    v1 = new Version("v1", typeFactory, String.class);
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
