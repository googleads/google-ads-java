// Copyright 2019 Google LLC
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     https://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.ads.googleads.shaded.it;

import static org.junit.Assert.assertEquals;

import com.google.common.collect.ImmutableSet;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;
import org.apache.maven.model.Dependency;
import org.apache.maven.model.Model;
import org.apache.maven.model.io.xpp3.MavenXpp3Reader;
import org.codehaus.plexus.util.xml.pull.XmlPullParserException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/** Integration test suite which ensures that the shade plugin generates a valid shaded jar. */
@RunWith(JUnit4.class)
public class ShadeIT {

  private static final String DEP_REDUCED_LOCATION = System.getProperty("dependencyReducedPom");
  private static final ImmutableSet<ComparableDependency> allowedDependencies;

  static {
    ComparableDependency slf4j = new ComparableDependency();
    slf4j.setGroupId("org.slf4j");
    slf4j.setArtifactId("slf4j-api");
    slf4j.setVersion("1.7.25");
    slf4j.setType("jar");

    ComparableDependency javaxAnnotationApi = new ComparableDependency();
    javaxAnnotationApi.setGroupId("javax.annotation");
    javaxAnnotationApi.setArtifactId("javax.annotation-api");
    javaxAnnotationApi.setVersion("1.3.2");
    javaxAnnotationApi.setType("jar");

    allowedDependencies = ImmutableSet.of(slf4j, javaxAnnotationApi);
  }

  @Test
  public void ensureOnlyExpectedDependenciesRemain() throws IOException, XmlPullParserException {
    MavenXpp3Reader reader = new MavenXpp3Reader();
    Model model = reader.read(new FileInputStream(DEP_REDUCED_LOCATION));
    Set<Dependency> modelDependencies =
        model.getDependencies().stream().map(ComparableDependency::new).collect(Collectors.toSet());
    assertEquals("Invalid dependencies found after shade", allowedDependencies, modelDependencies);
  }

  /** Wrapper around Dependency which allows equals and hashcode for collections. */
  private static class ComparableDependency extends Dependency {

    public ComparableDependency() {}

    public ComparableDependency(Dependency source) {
      setGroupId(source.getGroupId());
      setArtifactId(source.getArtifactId());
      setVersion(source.getVersion());
      setType(source.getType());
    }

    @Override
    public boolean equals(Object o) {
      if (this == o) {
        return true;
      }
      if (o == null || getClass() != o.getClass()) {
        return false;
      }
      ComparableDependency that = (ComparableDependency) o;
      return Objects.equals(getArtifactId(), that.getArtifactId())
          && Objects.equals(getVersion(), that.getVersion())
          && Objects.equals(getType(), that.getType())
          && Objects.equals(getGroupId(), that.getGroupId());
    }

    @Override
    public int hashCode() {
      return Objects.hash(getArtifactId(), getVersion(), getType(), getGroupId());
    }
  }
}
