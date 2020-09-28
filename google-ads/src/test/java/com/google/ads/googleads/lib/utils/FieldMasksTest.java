package com.google.ads.googleads.lib.utils;

import static org.junit.Assert.assertEquals;

import com.google.ads.googleads.v5.resources.Campaign;
import com.google.common.collect.ImmutableList;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class FieldMasksTest {

  // Regression test for https://github.com/googleads/google-ads-java/issues/344.
  @Test
  public void optionalField_withDefaultValue_detectsChange() {
    Campaign.Builder builder = Campaign.newBuilder();
    builder.getManualCpcBuilder().setEnhancedCpcEnabled(false);
    Campaign campaign = builder.build();
    assertEquals(
        ImmutableList.of("manual_cpc.enhanced_cpc_enabled"),
        FieldMasks.allSetFieldsOf(campaign).getPathsList());
  }
}
