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

import static org.junit.Assert.assertEquals;

import com.google.common.base.Charsets;
import com.google.common.collect.Sets;
import com.google.common.collect.Sets.SetView;
import com.google.common.io.Resources;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.URL;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class MethodsPresenceTest {

  private static final String CONFIG_FILE_RESOURCE_PATH = "testdata/avail_service_clients.txt";

  /**
   * Verifies that the list of all service client methods in a given GoogleAdsVersion class matches
   * that provided in the testdata/avail_service_clients.txt file.
   *
   * <p>The avail_service_clients.txt file should be the standard against which all releases are
   * compared. In the event the list of services changes in the API, this test will fail. Then,
   * avail_service_clients.txt should be updated so that this test passes.
   */
  @Test
  public void methodsListMatches()
      throws ClassNotFoundException, NoSuchMethodException, IOException {
    // Gets the fully qualified return type of the GoogleAdsAllVersions getLatestVersion method,
    // which is the class from which the methods will be retrieved.
    Method latestVersionMethod = GoogleAdsAllVersions.class.getMethod("getLatestVersion");
    Class cls = Class.forName(latestVersionMethod.getReturnType().getName());

    // Retrieves a list of the methods in the GoogleAdsVersion class using reflection and adds
    // each to a set.
    List<Method> methods = Arrays.asList(cls.getDeclaredMethods());
    Set<String> serviceListReflection = new HashSet<>();
    for (Method method : methods) {
      serviceListReflection.add(method.toString());
    }

    // Retrieves the list of service client methods in the provided avail_service_clients.txt file.
    URL resource = Resources.getResource(CONFIG_FILE_RESOURCE_PATH);
    Set<String> serviceListResource =
        new HashSet<>(Resources.asCharSource(resource, Charsets.UTF_8).readLines());

    SetView<String> newlyAdded = Sets.difference(serviceListReflection, serviceListResource);
    SetView<String> newlyRemoved = Sets.difference(serviceListResource, serviceListReflection);

    assertEquals(
        "Service clients have been newly added: "
            + newlyAdded
            + " Please verify this is expected and update "
            + CONFIG_FILE_RESOURCE_PATH,
        Collections.emptySet(),
        newlyAdded);
    assertEquals(
        "Service clients have been newly removed: "
            + newlyRemoved
            + " Please verify this is expected and update "
            + CONFIG_FILE_RESOURCE_PATH,
        Collections.emptySet(),
        newlyRemoved);
  }
}
