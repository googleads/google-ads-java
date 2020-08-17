package com.google.ads.googleads.v3.utils;

import static org.junit.Assert.assertEquals;

import com.google.ads.googleads.v3.errors.GoogleAdsError;
import com.google.ads.googleads.v3.services.UploadConversionAdjustmentsResponse;
import com.google.protobuf.TextFormat;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import org.junit.Test;

public class ErrorUtilsTest {

  @Test
  public void github_issue325() throws IOException {
    UploadConversionAdjustmentsResponse.Builder builder =
        UploadConversionAdjustmentsResponse.newBuilder();
    TextFormat.merge(
        new InputStreamReader(
            getClass()
                .getResourceAsStream("/testdata/error_utils_conversion_upload_issue325.textpb")),
        builder);
    UploadConversionAdjustmentsResponse response = builder.build();
    List<GoogleAdsError> googleAdsErrors =
        ErrorUtils.getInstance().getGoogleAdsErrors(0, response.getPartialFailureError());
    assertEquals(1, googleAdsErrors.size());
  }
}
