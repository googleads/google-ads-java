// Copyright 2021 Google LLC
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

package com.google.ads.googleads.codegen;

import com.google.ads.googleads.lib.stubs.annotations.VersionDescriptor;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.io.File;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import org.reflections.Reflections;
import org.reflections.scanners.SubTypesScanner;
import org.reflections.scanners.TypeAnnotationsScanner;
import org.reflections.util.ClasspathHelper;
import org.reflections.util.ConfigurationBuilder;

/**
 * Generates various classes which require knowing the available Google Ads API major versions.
 *
 * <p>This cannot run as an annotation processor, since we need to know all the available versions.
 * An annotation processor only has access to the annotations from the current compilation step,
 * which in the case of a multi-module build, is only the sources from that module. So we would only
 * be able to detect a single version at a time.
 */
public class RunCodeGenerators {

  /**
   * Defines the main entry point to run the code generators. This is invoked from gradle.
   *
   * <p>Requires a single argument, the output directory in which to write generated code.
   */
  public static void main(String[] args) {
    if (args.length != 1) {
      throw new RuntimeException("Specify 1 argument, the directory for the generated code");
    }
    RunCodeGenerators entryPoint = new RunCodeGenerators(new File(args[0]));
    entryPoint.runAll();
  }

  /**
   * Loads classes annotated with @VersionDescriptor. One such class will be generated for each API
   * major version by the GAPIC generator pipeline.
   */
  private static Set<Class<?>> loadAnnotatedClasses() {
    Reflections reflections =
        new Reflections(
            new ConfigurationBuilder()
                .addUrls(ClasspathHelper.forPackage("com.google.ads.googleads"))
                .addScanners(new TypeAnnotationsScanner(), new SubTypesScanner()));
    return reflections.getTypesAnnotatedWith(VersionDescriptor.class);
  }

  /** Pulls the @VersionDescriptor instance from annotated classes. */
  private static Map<VersionDescriptor, Class<?>> extractVersionDescriptors(
      Set<Class<?>> versionDescriptorTypes) {
    return versionDescriptorTypes.stream()
        .collect(Collectors.toMap(c -> c.getAnnotation(VersionDescriptor.class), c -> c));
  }

  private final File targetDirectory;
  private final ImmutableMap<VersionDescriptor, Class<?>> descriptors;

  public RunCodeGenerators(File targetDirectory) {
    this(targetDirectory, loadAnnotatedClasses());
  }

  public RunCodeGenerators(File targetDirectory, Set<Class<?>> annotatedClasses) {
    this(targetDirectory, extractVersionDescriptors(annotatedClasses));
  }

  /**
   * Creates a new instance.
   *
   * @param targetDirectory directory to contain the generated code.
   * @param versionDescriptors defines the mapping from VersionDescriptor to its declaring class.
   */
  public RunCodeGenerators(
      File targetDirectory, Map<VersionDescriptor, Class<?>> versionDescriptors) {
    this.targetDirectory = targetDirectory;
    this.descriptors = ImmutableMap.copyOf(versionDescriptors);
  }

  /** Runs the code generators. */
  public void runAll() {
    if (!targetDirectory.exists()) {
      targetDirectory.mkdirs();
    } else if (!targetDirectory.isDirectory()) {
      throw new RuntimeException(
          "Target directory exists and is not a directory: " + targetDirectory);
    }
    for (Generator generator : loadGenerators(targetDirectory)) {
      generator.generate();
    }
  }

  /** Creates instances the {@link Generator}s required by the library. */
  private List<Generator> loadGenerators(File targetDirectory) {
    Set<Integer> versions = getApiMajorVersions();
    int latestVersion = getLatestVersion();
    return ImmutableList.of(
        // Provides a collection of Version instances. These are descriptors which provide
        // programmatic metadata and utilities for a version of the API. This enables writing
        // version independent code. This is required by GeneratedCatalog.
        new VersionFactoryCodeGenerator(versions, targetDirectory),
        // Combines the VersionFactory metadata with the *ServiceClient instances produced by the
        // GAPIC generators to instantiate any service client with a type-safe method signature.
        new GeneratedCatalogCodeGenerator(versions, latestVersion, descriptors, targetDirectory),
        // Generates an interface with getLatestVersion(), getVersionX() etc.
        new GoogleAdsAllVersionsCodeGenerator(versions, latestVersion, targetDirectory),
        // Makes GoogleAdsClient implement GoogleAdsAllVersions.
        new AbstractGoogleAdsClientCodeGenerator(versions, latestVersion, targetDirectory));
  }

  /** Gets the available API major versions. */
  private Set<Integer> getApiMajorVersions() {
    return descriptors.keySet().stream()
        .map(d -> Integer.valueOf(d.versionName().substring(1)))
        .collect(Collectors.toSet());
  }

  /** Gets the latest version, excluding v999. */
  private int getLatestVersion() {
    int latestVersion = 0;
    for (int version : getApiMajorVersions()) {
      if (version != 999) {
        latestVersion = Math.max(latestVersion, version);
      }
    }
    return latestVersion;
  }
}
