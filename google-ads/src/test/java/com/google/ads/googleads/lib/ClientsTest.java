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

import static org.junit.Assert.assertTrue;

import com.google.ads.googleads.lib.stubs.annotations.ServiceClientDescriptor;
import com.google.ads.googleads.lib.stubs.annotations.VersionDescriptor;
import java.lang.reflect.Method;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class ClientsTest {

  /**
   * Verify generated GoogleAdsAllVersions class only contains methods which return types annotated with
   * VersionDescriptor.
   */
  @Test
  public void allVersionsAnnotatedWithVersionDescriptor() {
    for (Method method : GoogleAdsAllVersions.class.getMethods()) {
      assertTrue(method.getReturnType().isAnnotationPresent(VersionDescriptor.class));
    }
  }

  /** Verify generated VersionDescriptors only contain methods annotated with ServiceClientDescriptor. */
  @Test
  public void allServicesAnnotatedWithServiceDescriptor() {
    for (Method version : GoogleAdsAllVersions.class.getMethods()) {
      for (Method client : version.getReturnType().getMethods()) {
        assertTrue(client.isAnnotationPresent(ServiceClientDescriptor.class));
      }
    }
  }
}
