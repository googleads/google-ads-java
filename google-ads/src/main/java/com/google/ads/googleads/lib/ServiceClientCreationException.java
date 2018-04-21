// Copyright 2018 Google LLC
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

import com.google.api.gax.rpc.ClientSettings.Builder;
import io.grpc.Channel;
import java.io.IOException;

/**
 * Indicates that a failure occurred during an attempt to create a service client for a specific
 * service descriptor. The most likely cause of this is an {@link IOException} while attempting to
 * obtain a {@link Channel} for the client.
 */
public class ServiceClientCreationException extends RuntimeException {

  private final GrpcServiceDescriptor<?, ?> serviceDescriptor;

  public ServiceClientCreationException(
      GrpcServiceDescriptor<?, ? extends Builder> serviceDescriptor, IOException cause) {
    super(String.format("Failed to create service client for: %s", serviceDescriptor), cause);
    this.serviceDescriptor = serviceDescriptor;
  }

  /**
   * Returns the service descriptor for which a service client could not be created. Provided so
   * exception handlers can determine the context for this exception.
   */
  public GrpcServiceDescriptor<?, ?> getServiceDescriptor() {
    return serviceDescriptor;
  }
}
