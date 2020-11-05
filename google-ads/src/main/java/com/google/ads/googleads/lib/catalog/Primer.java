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

package com.google.ads.googleads.lib.catalog;

import com.google.auth.Credentials;
import com.google.common.annotations.Beta;
import java.util.Optional;

/**
 * Performs startup performance optimizations to avoid cold-start of clients. Disabled by default.
 * To enable, set the system property defined by ENABLE_PRIMER_SYSTEM_PROPERTY=true.
 */
@Beta
public abstract class Primer {

  private static final Optional<Primer> INSTANCE;
  static final String ENABLE_PRIMER_SYSTEM_PROPERTY = "GOOGLE_ADS_ALPHA_ENABLE_PRIMER";

  static {
    // Avoid initializing this unless we have to. A thread pool is created in the constructor
    // which is expensive and unnecessary for most users.
    INSTANCE = isEnabled() ? Optional.of(new DefaultPrimer()) : Optional.empty();
  }

  /** Returns an instance of the primer, if enabled. Otherwise, empty. */
  public static Optional<Primer> getInstance() {
    return INSTANCE;
  }

  /** Checks if the primer should be enabled. This can be used to avoid initializing the primer. */
  public static boolean isEnabled() {
    return Boolean.getBoolean(ENABLE_PRIMER_SYSTEM_PROPERTY);
  }

  /** Primes any components that can be run without additional state (e.g. credentials). */
  public static void primeBasicsIfEnabled() {
    if (Primer.isEnabled()) {
      Primer.getInstance()
          .ifPresent(
              p -> {
                p.primeGrpcAsync();
                p.primeProtobufAsync();
                p.primeAllVersionsAsync();
              });
    }
  }

  /** Primes the gRPC layer asynchronously. */
  public abstract void primeGrpcAsync();

  /** Primes the protobuf layer asynchronously. */
  public abstract void primeProtobufAsync();

  /** Primes the classes required by {@link com.google.ads.googleads.lib.GoogleAdsAllVersions} */
  public abstract void primeAllVersionsAsync();

  /**
   * Primes the credentials, e.g. by preemptively loading an access token.
   *
   * @param credentials the credentials to prime.
   */
  public abstract void primeCredentialsAsync(Credentials credentials);
}
