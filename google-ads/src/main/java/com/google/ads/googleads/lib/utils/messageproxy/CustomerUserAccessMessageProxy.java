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

/** Abstracts an instance of CustomerUserAccess from the API version. */
public interface CustomerUserAccessMessageProxy<
    MsgT extends Message, BuilderT extends Message.Builder> {

  /** Sets the google_ads_row.customer_user_access.email_address property. */
  BuilderT setCustomerUserAccessEmailAddressIfPresent(BuilderT builder, String toSet);

  /** Sets the google_ads_row.customer_user_access.inviter_email_address property. */
  BuilderT setCustomerUserAccessInviterEmailAddressIfPresent(BuilderT builder, String toSet);
}
