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

package com.google.ads.googleads.lib;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import static org.junit.Assert.assertEquals;

@RunWith(JUnit4.class)
public class MethodsPresenceTest {
  /**
   * Verifies that the list of all service client methods in a given GoogleAdsVersion class matches
   * that provided in the testdata/avail_service_clients.txt file.
   *
   * <p>The avail_service_clients.txt file should be the standard against which all releases are
   * compared. In the event the list of services changes in the API, this test will fail. Then,
   * avail_service_clients.txt should be updated so that this test passes.
   *
   * <p>The version variable should be updated for each major release of the Google Ads API.
   */
  @Test
  public void methodsListMatches() throws ClassNotFoundException {
    String version = "v3";
    Class cls = Class.forName("com.google.ads.googleads." + version + ".services.GoogleAdsVersion");

    // Retrieves a list of the methods (and return types) in the GoogleAdsVersion class using
    // reflection, alphabetizes the list by method name, and concatenates the alphabetized list
    // into a string.
    List<Method> methods = Arrays.asList(cls.getDeclaredMethods());
    methods.sort(Comparator.comparing((Method method) -> method.getName().toLowerCase()));
    String serviceListReflection = "";
    for (Method method : methods) {
      serviceListReflection += method.getName() + ": " + method.getReturnType().getSimpleName();
    }

    // Retrieves the list of service client methods (and return types) in the
    // provided avail_service_clients.txt file.
    ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
    InputStream inputStream = classLoader.getResourceAsStream("testdata/avail_service_clients.txt");
    Scanner scanner = new Scanner(inputStream);
    StringBuffer serviceListResource = new StringBuffer();
    while (scanner.hasNext()) {
      serviceListResource.append(scanner.nextLine());
    }

    assertEquals(serviceListReflection, serviceListResource.toString());
  }
}
