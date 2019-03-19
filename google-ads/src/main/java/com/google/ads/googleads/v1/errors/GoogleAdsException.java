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

package com.google.ads.googleads.v1.errors;

import com.google.ads.googleads.lib.BaseGoogleAdsException;
import com.google.api.gax.rpc.ApiException;
import com.google.protobuf.InvalidProtocolBufferException;
import io.grpc.Metadata;

/** An exception thrown by a GoogleAds RPC. */
public class GoogleAdsException extends BaseGoogleAdsException {

  public GoogleAdsException(ApiException original, GoogleAdsFailure failure, Metadata metadata) {
    super(original, failure, metadata);
  }

  @Override
  public GoogleAdsFailure getGoogleAdsFailure() {
    return (GoogleAdsFailure) super.getGoogleAdsFailure();
  }

  public static class Factory
      extends BaseGoogleAdsException.Factory<GoogleAdsException, GoogleAdsFailure> {

    @Override
    protected GoogleAdsException createException(
        ApiException source, byte[] protoData, Metadata metadata)
        throws InvalidProtocolBufferException {
      GoogleAdsFailure failure = GoogleAdsFailure.parseFrom(protoData);
      return new GoogleAdsException(source, failure, metadata);
    }

    @Override
    public GoogleAdsFailure createDefaultFailure() {
      return GoogleAdsFailure.newBuilder().build();
    }

    @Override
    public Metadata.Key<byte[]> getTrailerKey() {
      return createKey("google.ads.googleads.v1.errors.googleadsfailure-bin");
    }
  }
}
