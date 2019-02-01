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

import com.google.auth.Credentials;
import java.io.IOException;
import java.net.URI;
import java.util.List;
import java.util.Map;

/** Dummy implementation of credentials for testing purposes. A call to refresh does nothing. */
public class FakeCredential extends Credentials {

  @Override
  public String getAuthenticationType() {
    return null;
  }

  @Override
  public Map<String, List<String>> getRequestMetadata(URI uri) throws IOException {
    return null;
  }

  @Override
  public boolean hasRequestMetadata() {
    return false;
  }

  @Override
  public boolean hasRequestMetadataOnly() {
    return false;
  }

  @Override
  public void refresh() throws IOException {}
}
