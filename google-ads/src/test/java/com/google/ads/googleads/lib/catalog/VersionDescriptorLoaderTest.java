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

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import com.google.ads.googleads.annotations.api.VersionDescriptor;
import com.google.ads.googleads.lib.BaseGoogleAdsException;
import com.google.ads.googleads.lib.GoogleAdsAllVersions;
import com.google.api.gax.rpc.ApiException;
import com.google.common.collect.ImmutableSet;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import io.grpc.Metadata;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mockito;

@RunWith(JUnit4.class)
public class VersionDescriptorLoaderTest {

  private static final BaseGoogleAdsException.Factory fakeTypeFactory =
      Mockito.mock(BaseGoogleAdsException.Factory.class);
  private static final Set<VersionDescriptor> expectedDescriptors =
      Stream.of(GoogleAdsAllVersions.class.getMethods())
          .map(method -> method.getReturnType().getAnnotation(VersionDescriptor.class))
          .collect(Collectors.toSet());
  private static final Set<Version> expectedVersions =
      expectedDescriptors.stream()
          .map(
              descriptor ->
                  new Version(descriptor.versionName(), fakeTypeFactory, ValidExample.class))
          .collect(Collectors.toSet());

  /** Ensures that all service in GoogleAdsVersions.class can be loaded. */
  @Test
  public void loadsAllVersions() {
    assertEquals(
        expectedVersions,
        VersionDescriptorLoader.forVersionList(GoogleAdsAllVersions.class).getVersions());
  }

  /** Ensures that a missing VersionDescriptor annotation is ignored. */
  @Test
  public void ignoresMissingVersionDescriptor() {
    assertTrue(
        VersionDescriptorLoader.forVersionList(MissingClientFactory.class).getVersions().isEmpty());
  }

  /** Ensures that a valid (fake) example can be loaded. */
  @Test
  public void loadsValidExample() {
    ImmutableSet<Version> actualVersions =
        VersionDescriptorLoader.forVersionList(ValidExample.class).getVersions();
    assertEquals(
        ImmutableSet.of(new Version("v1", fakeTypeFactory, ValidExample.class)), actualVersions);
  }

  /**
   * Ensure that the exception factory supports default instance creation i.e. Class.newInstance().
   */
  @Test
  public void failsIfExceptionFactoryHasNoPublicConstructor() {
    try {
      VersionDescriptorLoader.forVersionList(MissingExceptionFactoryConstructor.class);
      fail();
    } catch (IllegalArgumentException e) {
      // Expected
    }
  }

  // -------------------------- Mock interface definitions for test cases --------------------------
  interface MissingClientFactory {
    void aMethodToIgnore();
  }

  interface ValidExample {
    ServiceClient getClient();
  }

  interface MissingExceptionFactoryConstructor {
    ServiceClientNoExceptionConstructor getClient();
  }

  @VersionDescriptor(
      versionName = "v1",
      googleAdsExceptionFactory = FakeExceptionFactory.class,
      catalogName = "v1")
  interface ServiceClient {}

  @VersionDescriptor(
      versionName = "v1",
      googleAdsExceptionFactory = FakeExceptionFactoryNoConstructor.class,
      catalogName = "v1")
  interface ServiceClientNoExceptionConstructor {}

  static class FakeExceptionFactory extends BaseGoogleAdsException.Factory {

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

  static class FakeExceptionFactoryNoConstructor extends BaseGoogleAdsException.Factory {
    private FakeExceptionFactoryNoConstructor() {}

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
