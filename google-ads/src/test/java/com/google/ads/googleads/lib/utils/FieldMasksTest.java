package com.google.ads.googleads.lib.utils;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import com.google.ads.googleads.v5.enums.CampaignStatusEnum.CampaignStatus;
import com.google.ads.googleads.v5.resources.Campaign;
import com.google.common.collect.ImmutableList;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class FieldMasksTest {
  private Campaign campaign;

  @Before
  public void setUp() {
    Campaign.Builder builder =
        Campaign.newBuilder()
            .setName("New campaign")
            .setStatus(CampaignStatus.PAUSED);
    builder.getManualCpcBuilder().setEnhancedCpcEnabled(false);
    campaign = builder.build();
  }

  // Regression test for https://github.com/googleads/google-ads-java/issues/344.
  @Test
  public void optionalField_withDefaultValue_detectsChange() {
    Campaign.Builder builder = Campaign.newBuilder();
    builder.getManualCpcBuilder().setEnhancedCpcEnabled(false);
    campaign = builder.build();
    assertEquals(
        ImmutableList.of("manual_cpc.enhanced_cpc_enabled"),
        FieldMasks.allSetFieldsOf(campaign).getPathsList());
  }

  @Test
  public void getFieldValue_gets_basic_field() {
    assertEquals(FieldMasks.getFieldValue("name", campaign), campaign.getName());
  }

  @Test
  public void getFieldValue_gets_nested_field() {
    assertEquals(
        FieldMasks.getFieldValue("manual_cpc.enhanced_cpc_enabled", campaign),
        campaign.getManualCpc().getEnhancedCpcEnabled());
  }

  @Test
  public void getFieldValue_gets_top_nested_field() {
    assertEquals(FieldMasks.getFieldValue("manual_cpc", campaign), campaign.getManualCpc());
  }

  @Test
  public void getFieldValue_gets_enum_field() {
    assertEquals(
        FieldMasks.getFieldValue("status", campaign), campaign.getStatus().getValueDescriptor());
  }

  @Test
  public void getFieldValue_no_match_throws_exception() {
    IllegalArgumentException exception =
        assertThrows(
            IllegalArgumentException.class,
            () -> {
              FieldMasks.getFieldValue("foo.bar", campaign);
            });
    assertEquals(
        exception.getMessage(),
        "Cannot retrieve field value. A matching field was not found after navigating foo.bar up to"
            + " foo.");
  }

  @Test
  public void getFieldValue_repeated_throws_exception() {
    IllegalArgumentException exception =
        assertThrows(
            IllegalArgumentException.class,
            () -> {
              FieldMasks.getFieldValue("url_custom_parameters.key", campaign);
            });
    assertEquals(
        exception.getMessage(),
        "Cannot retrieve field value. A repeated field was encountered after navigating"
            + " url_custom_parameters.key up to url_custom_parameters.");
  }

  @Test
  public void getFieldValue_non_message_throws_exception() {
    IllegalArgumentException exception =
        assertThrows(
            IllegalArgumentException.class,
            () -> {
              FieldMasks.getFieldValue("status.paused", campaign);
            });
    assertEquals(
        exception.getMessage(),
        "Cannot retrieve field value. A non-MESSAGE field was encountered after navigating status.paused up to status.");
  }
}