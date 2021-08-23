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

package com.google.ads.googleads.codegen;

import com.google.ads.googleads.lib.stubs.annotations.VersionDescriptor;
import com.google.ads.googleads.lib.stubs.exceptions.BaseGoogleAdsException;
import com.google.api.gax.rpc.ApiException;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.squareup.javapoet.JavaFile;
import io.grpc.Metadata;
import java.io.IOException;
import java.util.Set;
import org.junit.Test;

/** Test cases for {@link GeneratedCatalogCodeGenerator} . */
public class GeneratedCatalogCodeGeneratorTest extends AbstractGeneratorTest {

  private Set<Integer> versions = ImmutableSet.of(1);
  private int latestVersion = 1;

  /** Ensures the the generated code matches a base case. */
  @Test
  public void baseCaseCodeMatches() throws IOException {
    // Executes the test case.
    assertGeneratedCodeMatches(
        "/com/google/ads/googleads/codegen/GeneratedCatalog.java.expected");
  }

  /**
   * Implements the abstract method to invoke generator.
   *
   * @return
   */
  @Override
  protected JavaFile invokeCodeGenClass() {
    return new GeneratedCatalogCodeGenerator(
            versions,
            latestVersion,
            ImmutableMap.of(
                MockVersion.class.getAnnotation(VersionDescriptor.class), MockVersion.class),
            temporaryFolder.getRoot())
        .generate();
  }

  @VersionDescriptor(versionName = "v1", googleAdsExceptionFactory = MockExceptionFactory.class)
  static class MockVersion {}

  static class MockExceptionFactory extends BaseGoogleAdsException.Factory {

    @Override
    protected BaseGoogleAdsException createException(
        ApiException source, byte[] protoData, Metadata metadata)
        throws InvalidProtocolBufferException {
      return null;
    }

    @Override
    public Metadata.Key<byte[]> getTrailerKey() {
      return null;
    }

    @Override
    public Message createGoogleAdsFailure() {
      return null;
    }

    @Override
    public Message createGoogleAdsFailure(byte[] serializedBytes)
        throws InvalidProtocolBufferException {
      return null;
    }
  }
}
