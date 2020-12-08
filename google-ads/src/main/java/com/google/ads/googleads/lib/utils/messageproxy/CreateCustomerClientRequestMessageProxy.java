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

package com.google.ads.googleads.lib.utils.messageproxy;

import com.google.protobuf.Message;

/**
 * Abstracts an interface for CreateCustomerClientRequest that is independant of the API version.
 */
public interface CreateCustomerClientRequestMessageProxy<
    MsgT extends Message, BuilderT extends Message.Builder> {

  /** Sets the email_address field if it is present in the given builder. */
  BuilderT setEmailAddressIfPresent(BuilderT builder, String toSet);
}
