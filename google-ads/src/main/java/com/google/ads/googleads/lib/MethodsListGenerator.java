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
import com.google.common.base.Charsets;
import com.google.common.io.CharSink;
import com.google.common.io.Files;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;

/**
 * Generates a list of methods present in the GoogleAdsAllVersions class of the latest available
 * version of the Google Ads API and saves the output to a txt file in the test resources directory.
 */
public class MethodsListGenerator {
  public static void main(String args[])
      throws ClassNotFoundException, IOException, NoSuchMethodException {
    Method latestVersionMethod = GoogleAdsAllVersions.class.getMethod("getLatestVersion");
    Class cls = Class.forName(latestVersionMethod.getReturnType().getName());
    List<Method> methods = Arrays.asList(cls.getDeclaredMethods());

    StringBuilder output = new StringBuilder();
    for (Method method : methods) {
      output.append(method + "\n");
    }

    System.out.println("Writing the following methods to file:");
    System.out.printf(output.toString());

    File file = new File("./google-ads/src/test/resources/testdata/avail_service_clients.txt");
    CharSink sink = Files.asCharSink(file, Charsets.UTF_8);
    sink.write(output);
  }
}
