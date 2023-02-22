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

package com.google.ads.googleads.lib.logging.scrub;

import static org.junit.Assert.assertEquals;

import com.google.ads.googleads.v13.resources.CustomerUserAccessInvitation;
import com.google.ads.googleads.v13.services.CreateCustomerClientRequest;
import com.google.ads.googleads.v13.services.SearchGoogleAdsResponse;
import com.google.ads.googleads.v13.services.SearchGoogleAdsStreamResponse;
import com.google.common.io.Resources;
import com.google.protobuf.Message;
import com.google.protobuf.TextFormat;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class LogScrubberTest {

  private static final LogScrubber scrubber = LogScrubber.getInstance();
  private final Message expected;
  private final Message input;
  private final String message;

  @Parameters(name = "{0}")
  public static List<Object[]> parameters() {
    return Arrays.asList(
        new Object[] {
          "search stream scrubs email",
          "searchStream_email_expected.textpb",
          "searchStream_email_input.textpb",
          SearchGoogleAdsStreamResponse.class
        },
        new Object[] {
          "search stream scrubs inviter email",
          "searchStream_inviter_email_expected.textpb",
          "searchStream_inviter_email_input.textpb",
          SearchGoogleAdsStreamResponse.class
        },
        new Object[] {
          "search stream ignores when not present",
          "searchStream_ignoresWhenNotPresent_expected.textpb",
          "searchStream_ignoresWhenNotPresent_input.textpb",
          SearchGoogleAdsStreamResponse.class
        },
        new Object[] {
          "ignores other message",
          "searchStream_ignoresOtherMessage_expected.textpb",
          "searchStream_ignoresOtherMessage_input.textpb",
          SearchGoogleAdsStreamResponse.class
        },
        new Object[] {
          "search stream scrubs email",
          "searchStream_email_expected.textpb",
          "searchStream_email_input.textpb",
          SearchGoogleAdsResponse.class
        },
        new Object[] {
          "search stream scrubs inviter email",
          "searchStream_inviter_email_expected.textpb",
          "searchStream_inviter_email_input.textpb",
          SearchGoogleAdsResponse.class
        },
        new Object[] {
          "search stream ignores when not present",
          "searchStream_ignoresWhenNotPresent_expected.textpb",
          "searchStream_ignoresWhenNotPresent_input.textpb",
          SearchGoogleAdsResponse.class
        },
        new Object[] {
          "ignores other message",
          "searchStream_ignoresOtherMessage_expected.textpb",
          "searchStream_ignoresOtherMessage_input.textpb",
          SearchGoogleAdsResponse.class
        },
        new Object[] {
          "CreateCustomerClient scrubs email address",
          "createCustomerClient_scrubsEmailAddress_expected.textpb",
          "createCustomerClient_scrubsEmailAddress_input.textpb",
          CreateCustomerClientRequest.class
        },
        new Object[] {
          "GetCustomerUserAccess scrubs email address",
          "getCustomerUserAccess_scrubsEmailAddress_expected.textpb",
          "getCustomerUserAccess_scrubsEmailAddress_input.textpb",
          CreateCustomerClientRequest.class
        },
        new Object[] {
          "search stream masks invitation email address",
          "searchStream_scrubsInvitationEmailAddress_expected.textpb",
          "searchStream_scrubsInvitationEmailAddress_input.textpb",
          SearchGoogleAdsStreamResponse.class
        },
        new Object[] {
          "search stream masks invitation email address",
          "searchStream_scrubsInvitationEmailAddress_expected.textpb",
          "searchStream_scrubsInvitationEmailAddress_input.textpb",
          SearchGoogleAdsResponse.class
        },
        new Object[] {
          "get CustomerUserAccessInvitation scrubs email address",
          "getCustomerUserAccessInvitation_scrubsEmailAddress_expected.textpb",
          "getCustomerUserAccessInvitation_scrubsEmailAddress_input.textpb",
          CustomerUserAccessInvitation.class
        });
  }

  public LogScrubberTest(
      String message, String expectedResourceName, String inputResourceName, Class protoClass)
      throws IOException {
    this.message = message;
    this.expected = loadTextPb(expectedResourceName, protoClass);
    this.input = loadTextPb(inputResourceName, protoClass);
  }

  @Test
  public void editMatchesExpected() {
    assertEquals(message, expected, scrubber.edit(input));
  }

  private Message loadTextPb(String resourceName, Class protoClass) throws IOException {
    return TextFormat.parse(
        Resources.toString(
            getClass().getResource("/com/google/ads/googleads/lib/logging/scrub/" + resourceName),
            Charset.forName("UTF-8")),
        protoClass);
  }
}
