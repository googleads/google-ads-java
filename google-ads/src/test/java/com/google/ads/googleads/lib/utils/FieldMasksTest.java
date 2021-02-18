package com.google.ads.googleads.lib.utils;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import com.google.ads.googleads.v6.common.ManualCpc;
import com.google.ads.googleads.v6.enums.CampaignStatusEnum.CampaignStatus;
import com.google.ads.googleads.v6.resources.Campaign;
import com.google.common.collect.ImmutableList;
import com.google.protobuf.Descriptors.EnumValueDescriptor;
import java.util.List;
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
        Campaign.newBuilder().setName("New campaign").setStatus(CampaignStatus.PAUSED);
    builder.getManualCpcBuilder().setEnhancedCpcEnabled(false);
    builder.addUrlCustomParametersBuilder().setKey("foo");
    builder.addUrlCustomParametersBuilder().setKey("bar");
    builder.addUrlCustomParametersBuilder().setKey("baz");
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
    assertEquals(FieldMasks.getFieldValue("name", campaign).get(0), campaign.getName());
  }

  @Test
  public void getFieldValue_assigns_basic_field() {
    List<?> name = FieldMasks.getFieldValue("name", campaign);
    Campaign campaignToCompare = campaign.toBuilder().setName(name.get(0).toString()).build();
    assertEquals(campaign, campaignToCompare);
  }

  @Test
  public void getFieldValue_gets_nested_field() {
    assertEquals(
        FieldMasks.getFieldValue("manual_cpc.enhanced_cpc_enabled", campaign).get(0),
        campaign.getManualCpc().getEnhancedCpcEnabled());
  }

  @Test
  public void getFieldValue_assigns_nested_field() {
    List<?> enhancedCpcEnabled =
        FieldMasks.getFieldValue("manual_cpc.enhanced_cpc_enabled", campaign);
    Campaign.Builder campaignToCompare = campaign.toBuilder();
    campaignToCompare
        .getManualCpcBuilder()
        .setEnhancedCpcEnabled((Boolean) enhancedCpcEnabled.get(0));
    assertEquals(campaign, campaignToCompare.build());
  }

  @Test
  public void getFieldValue_gets_top_nested_field() {
    assertEquals(FieldMasks.getFieldValue("manual_cpc", campaign).get(0), campaign.getManualCpc());
  }

  @Test
  public void getFieldValue_assigns_top_nested_field() {
    List<?> manualCpc = FieldMasks.getFieldValue("manual_cpc", campaign);
    Campaign campaignToCompare =
        campaign.toBuilder().setManualCpc((ManualCpc) manualCpc.get(0)).build();
    assertEquals(campaign, campaignToCompare);
  }

  @Test
  public void getFieldValue_gets_enum_field() {
    assertEquals(
        FieldMasks.getFieldValue("status", campaign).get(0),
        campaign.getStatus().getValueDescriptor());
  }

  @Test
  public void getFieldValue_assigns_enum_value() {
    List<?> status = FieldMasks.getFieldValue("status", campaign);
    Campaign.Builder campaignToCompare = campaign.toBuilder();
    campaignToCompare.setStatus(
        CampaignStatus.forNumber(((EnumValueDescriptor) status.get(0)).getNumber()));
    assertEquals(campaign, campaignToCompare.build());
  }

  @Test
  public void getFieldValue_repeated_returnsAllValues() {
    List<?> values = FieldMasks.getFieldValue("url_custom_parameters.key", campaign);
    assertEquals(ImmutableList.of("foo", "bar", "baz"), values);
  }

  @Test
  public void getFieldValue_no_match_throws_exception() {
    IllegalStateException exception =
        assertThrows(
            IllegalStateException.class,
            () -> {
              FieldMasks.getFieldValue("foo.bar", campaign);
            });
    assertEquals(
        "Unknown field foo in class com.google.ads.googleads.lib.reflect.ImmutableTreeNode",
        exception.getMessage());
  }

  @Test
  public void getFieldValue_non_message_throws_exception() {
    IllegalStateException exception =
        assertThrows(
            IllegalStateException.class,
            () -> {
              FieldMasks.getFieldValue("status.paused", campaign);
            });
    assertEquals(
        "Unable to access subfield of google.ads.googleads.v6.resources.Campaign.status which is"
            + " not a Message",
        exception.getMessage());
  }
}
