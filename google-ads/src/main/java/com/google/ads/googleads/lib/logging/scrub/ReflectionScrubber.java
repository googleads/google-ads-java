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

package com.google.ads.googleads.lib.logging.scrub;

import com.google.ads.googleads.lib.reflect.ReflectionFieldAccessor;
import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import com.google.protobuf.Message;

/** Scrubs messages using reflection. */
public class ReflectionScrubber {

  // Defines the fields that are scrubbed and how they are scrubbed.
  // Note: does not use Class<? extends Message> since loading all these classes would be extremely
  // slow. Keys are Class.getSimpleName() rather then Class.getCanonicalName() to avoid having
  // multiple entries for each simple name (one for each version of the API).
  private static final Multimap<String, FieldAccessor> FIELDS_TO_SCRUB =
      ImmutableMultimap.<String, FieldAccessor>builder()
          .put(
              "SearchGoogleAdsStreamResponse",
              new SearchResponseScrubber("customer_user_access.email_address"))
          .put(
              "SearchGoogleAdsResponse",
              new SearchResponseScrubber("customer_user_access.email_address"))
          .put(
              "SearchGoogleAdsStreamResponse",
              new SearchResponseScrubber("customer_user_access.inviter_user_email_address"))
          .put(
              "SearchGoogleAdsResponse",
              new SearchResponseScrubber("customer_user_access.inviter_user_email_address"))
          .put(
              "SearchGoogleAdsStreamResponse",
              new SearchResponseScrubber("customer_user_access_invitation.email_address"))
          .put(
              "SearchGoogleAdsResponse",
              new SearchResponseScrubber("customer_user_access_invitation.email_address"))
          .put(
              "SearchGoogleAdsStreamResponse",
              new SearchResponseScrubber("feed.places_location_feed_data.email_address"))
          .put(
              "SearchGoogleAdsResponse",
              new SearchResponseScrubber("feed.places_location_feed_data.email_address"))
          .put(
              "SearchGoogleAdsStreamResponse",
              new SearchResponseScrubber("change_event.user_email"))
          .put("SearchGoogleAdsResponse", new SearchResponseScrubber("change_event.user_email"))
          .put(
              "SearchGoogleAdsStreamResponse",
              new SearchResponseScrubber("local_services_lead.contact_details.consumer_name"))
          .put(
              "SearchGoogleAdsResponse",
              new SearchResponseScrubber("local_services_lead.contact_details.consumer_name"))
          .put(
              "SearchGoogleAdsStreamResponse",
              new SearchResponseScrubber("local_services_lead.contact_details.email"))
          .put(
              "SearchGoogleAdsResponse",
              new SearchResponseScrubber("local_services_lead.contact_details.email"))
          .put(
              "SearchGoogleAdsStreamResponse",
              new SearchResponseScrubber("local_services_lead.contact_details.phone_number"))
          .put(
              "SearchGoogleAdsResponse",
              new SearchResponseScrubber("local_services_lead.contact_details.phone_number"))
          .put(
              "SearchGoogleAdsStreamResponse",
              new SearchResponseScrubber("local_services_lead_conversation.message_details.text"))
          .put(
              "SearchGoogleAdsResponse",
              new SearchResponseScrubber("local_services_lead_conversation.message_details.text"))
          .put("CreateCustomerClientRequest", new ReflectionFieldAccessor("email_address"))
          .put("CustomerUserAccess", new ReflectionFieldAccessor("email_address"))
          .put("CustomerUserAccess", new ReflectionFieldAccessor("inviter_user_email_address"))
          .put("CustomerUserAccessInvitation", new ReflectionFieldAccessor("email_address"))
          .put("Feed", new ReflectionFieldAccessor("places_location_feed_data.email_address"))
          .put("ChangeEvent", new ReflectionFieldAccessor("user_email"))
          .build();

  /** Scrubs the given message using the protobuf descriptor API. */
  public Message scrub(Message input) {
    Message result = input;
    // A faster implementation here would be to only call Message.toBuilder() once here, rather than
    // repeatedly in setFieldIfPresent(). However, this is not necessary at the moment.
    for (FieldAccessor fieldAccessor : FIELDS_TO_SCRUB.get(input.getClass().getSimpleName())) {
      result = fieldAccessor.setFieldIfPresent(result, LogScrubber.MASK_PATTERN);
    }
    return result;
  }

  /** Checks if a given message needs to be scrubbed. */
  public boolean supports(Message input) {
    return FIELDS_TO_SCRUB.containsKey(input.getClass().getSimpleName());
  }
}
