// Copyright 2018 Google LLC
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.ads.googleads.lib;

import static org.junit.Assert.assertNotNull;

import com.google.ads.googleads.v0.services.CampaignServiceClient;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/** Tests for {@link GrpcServiceDescriptor}. */
public class GrpcServiceDescriptorTest {

  @Rule public ExpectedException thrown = ExpectedException.none();

  @Test
  public void testGetNull_fails() {
    thrown.expect(NullPointerException.class);
    GrpcServiceDescriptor.get(null);
  }

  @Test
  public void testGetUnknownServiceClient_fails() {
    thrown.expect(IllegalArgumentException.class);
    GrpcServiceDescriptor.get(String.class);
  }

  @Test
  public void testGetCampaignServiceClientDescriptor() {
    assertNotNull(GrpcServiceDescriptor.get(CampaignServiceClient.class));
  }
}
