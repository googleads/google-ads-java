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

import static org.junit.Assert.assertEquals;

import com.google.ads.googleads.lib.stubs.annotations.VersionDescriptor;
import com.google.ads.googleads.lib.stubs.exceptions.BaseGoogleAdsException;
import com.google.api.gax.rpc.ApiException;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.io.Files;
import com.google.common.io.Resources;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import io.grpc.Metadata;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class RunCodeGeneratorsTest {

  private static final ImmutableMap<String, String> FILE_NAME_TO_EXPECTED_GENSRC =
      ImmutableMap.<String, String>builder()
          .put(
              "/com/google/ads/googleads/lib/catalog/VersionFactory.java",
              "/com/google/ads/googleads/codegen/RunCodeGeneratorsTest_VersionFactory.java.expected")
          .put(
              "/com/google/ads/googleads/lib/catalog/GeneratedCatalog.java",
              "/com/google/ads/googleads/codegen/RunCodeGeneratorsTest_GeneratedCatalog.java.expected")
          .put(
              "/com/google/ads/googleads/lib/GoogleAdsAllVersions.java",
              "/com/google/ads/googleads/codegen/RunCodeGeneratorsTest_GoogleAdsAllVersions.java.expected")
          .put(
              "/com/google/ads/googleads/lib/AbstractGoogleAdsClient.java",
              "/com/google/ads/googleads/codegen/RunCodeGeneratorsTest_AbstractGoogleAdsClient.java.expected")
          .build();

  @Rule public TemporaryFolder temporaryFolder = new TemporaryFolder();

  @Test
  public void generatedCodeMatches() throws IOException {
    RunCodeGenerators entryPoint =
        new RunCodeGenerators(temporaryFolder.getRoot(), ImmutableSet.of(DummyVersion.class));
    entryPoint.runAll();
    for (Map.Entry<String, String> entry : FILE_NAME_TO_EXPECTED_GENSRC.entrySet()) {
      String actual =
          Files.asCharSource(
                  new File(temporaryFolder.getRoot(), entry.getKey()), StandardCharsets.UTF_8)
              .read();
      String expected = loadResource(entry.getValue());
      assertEquals("Generated code mismatch for " + entry.getKey(), expected, actual);
    }
  }

  /** Loads a resource (i.e. expected generated code) as a String. */
  private static String loadResource(String path) throws IOException {
    return Resources.toString(
        AbstractGeneratorTest.class.getResource(path), Charset.forName("UTF-8"));
  }

  @VersionDescriptor(
      versionName = "v1",
      googleAdsExceptionFactory = DummyVersion.DummyExceptionFactory.class)
  private static class DummyVersion {

    private static class DummyExceptionFactory extends BaseGoogleAdsException.Factory {

      @Override
      protected BaseGoogleAdsException createException(
          ApiException source, byte[] protoData, Metadata metadata) {
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
}
