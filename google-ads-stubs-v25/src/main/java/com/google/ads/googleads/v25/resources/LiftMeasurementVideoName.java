/*
 * Copyright 2026 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.ads.googleads.v25.resources;

import com.google.api.pathtemplate.PathTemplate;
import com.google.api.resourcenames.ResourceName;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Generated;
import org.jspecify.annotations.NullMarked;
import org.jspecify.annotations.Nullable;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
@NullMarked
@Generated("by gapic-generator-java")
public class LiftMeasurementVideoName implements ResourceName {
  private static final PathTemplate
      CUSTOMER_ID_LIFT_MEASUREMENT_CONFIGURATION_ID_CAMPAIGN_ID_EXTERNAL_VIDEO_ID =
          PathTemplate.createWithoutUrlEncoding(
              "customers/{customer_id}/liftMeasurementVideos/{lift_measurement_configuration_id}~{campaign_id}~{external_video_id}");
  private volatile Map<String, String> fieldValuesMap;
  private final String customerId;
  private final String liftMeasurementConfigurationId;
  private final String campaignId;
  private final String externalVideoId;

  @Deprecated
  protected LiftMeasurementVideoName() {
    customerId = null;
    liftMeasurementConfigurationId = null;
    campaignId = null;
    externalVideoId = null;
  }

  private LiftMeasurementVideoName(Builder builder) {
    customerId = Preconditions.checkNotNull(builder.getCustomerId());
    liftMeasurementConfigurationId =
        Preconditions.checkNotNull(builder.getLiftMeasurementConfigurationId());
    campaignId = Preconditions.checkNotNull(builder.getCampaignId());
    externalVideoId = Preconditions.checkNotNull(builder.getExternalVideoId());
  }

  public String getCustomerId() {
    return customerId;
  }

  public String getLiftMeasurementConfigurationId() {
    return liftMeasurementConfigurationId;
  }

  public String getCampaignId() {
    return campaignId;
  }

  public String getExternalVideoId() {
    return externalVideoId;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  public static LiftMeasurementVideoName of(
      String customerId,
      String liftMeasurementConfigurationId,
      String campaignId,
      String externalVideoId) {
    return newBuilder()
        .setCustomerId(customerId)
        .setLiftMeasurementConfigurationId(liftMeasurementConfigurationId)
        .setCampaignId(campaignId)
        .setExternalVideoId(externalVideoId)
        .build();
  }

  public static String format(
      String customerId,
      String liftMeasurementConfigurationId,
      String campaignId,
      String externalVideoId) {
    return newBuilder()
        .setCustomerId(customerId)
        .setLiftMeasurementConfigurationId(liftMeasurementConfigurationId)
        .setCampaignId(campaignId)
        .setExternalVideoId(externalVideoId)
        .build()
        .toString();
  }

  public static @Nullable LiftMeasurementVideoName parse(String formattedString) {
    if (formattedString.isEmpty()) {
      return null;
    }
    Map<String, String> matchMap =
        CUSTOMER_ID_LIFT_MEASUREMENT_CONFIGURATION_ID_CAMPAIGN_ID_EXTERNAL_VIDEO_ID.validatedMatch(
            formattedString, "LiftMeasurementVideoName.parse: formattedString not in valid format");
    return of(
        matchMap.get("customer_id"),
        matchMap.get("lift_measurement_configuration_id"),
        matchMap.get("campaign_id"),
        matchMap.get("external_video_id"));
  }

  public static List<LiftMeasurementVideoName> parseList(List<String> formattedStrings) {
    List<LiftMeasurementVideoName> list = new ArrayList<>(formattedStrings.size());
    for (String formattedString : formattedStrings) {
      list.add(parse(formattedString));
    }
    return list;
  }

  public static List<String> toStringList(List<@Nullable LiftMeasurementVideoName> values) {
    List<String> list = new ArrayList<>(values.size());
    for (LiftMeasurementVideoName value : values) {
      if (value == null) {
        list.add("");
      } else {
        list.add(value.toString());
      }
    }
    return list;
  }

  public static boolean isParsableFrom(String formattedString) {
    return CUSTOMER_ID_LIFT_MEASUREMENT_CONFIGURATION_ID_CAMPAIGN_ID_EXTERNAL_VIDEO_ID.matches(
        formattedString);
  }

  @Override
  public Map<String, String> getFieldValuesMap() {
    if (fieldValuesMap == null) {
      synchronized (this) {
        if (fieldValuesMap == null) {
          ImmutableMap.Builder<String, String> fieldMapBuilder = ImmutableMap.builder();
          if (customerId != null) {
            fieldMapBuilder.put("customer_id", customerId);
          }
          if (liftMeasurementConfigurationId != null) {
            fieldMapBuilder.put(
                "lift_measurement_configuration_id", liftMeasurementConfigurationId);
          }
          if (campaignId != null) {
            fieldMapBuilder.put("campaign_id", campaignId);
          }
          if (externalVideoId != null) {
            fieldMapBuilder.put("external_video_id", externalVideoId);
          }
          fieldValuesMap = fieldMapBuilder.build();
        }
      }
    }
    return fieldValuesMap;
  }

  public String getFieldValue(String fieldName) {
    return getFieldValuesMap().get(fieldName);
  }

  @Override
  public String toString() {
    return CUSTOMER_ID_LIFT_MEASUREMENT_CONFIGURATION_ID_CAMPAIGN_ID_EXTERNAL_VIDEO_ID.instantiate(
        "customer_id",
        customerId,
        "lift_measurement_configuration_id",
        liftMeasurementConfigurationId,
        "campaign_id",
        campaignId,
        "external_video_id",
        externalVideoId);
  }

  @Override
  public boolean equals(@Nullable Object o) {
    if (o == this) {
      return true;
    }
    if (o != null && getClass() == o.getClass()) {
      LiftMeasurementVideoName that = ((LiftMeasurementVideoName) o);
      return Objects.equals(this.customerId, that.customerId)
          && Objects.equals(
              this.liftMeasurementConfigurationId, that.liftMeasurementConfigurationId)
          && Objects.equals(this.campaignId, that.campaignId)
          && Objects.equals(this.externalVideoId, that.externalVideoId);
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= Objects.hashCode(customerId);
    h *= 1000003;
    h ^= Objects.hashCode(liftMeasurementConfigurationId);
    h *= 1000003;
    h ^= Objects.hashCode(campaignId);
    h *= 1000003;
    h ^= Objects.hashCode(externalVideoId);
    return h;
  }

  /**
   * Builder for
   * customers/{customer_id}/liftMeasurementVideos/{lift_measurement_configuration_id}~{campaign_id}~{external_video_id}.
   */
  public static class Builder {
    private String customerId;
    private String liftMeasurementConfigurationId;
    private String campaignId;
    private String externalVideoId;

    protected Builder() {}

    public String getCustomerId() {
      return customerId;
    }

    public String getLiftMeasurementConfigurationId() {
      return liftMeasurementConfigurationId;
    }

    public String getCampaignId() {
      return campaignId;
    }

    public String getExternalVideoId() {
      return externalVideoId;
    }

    public Builder setCustomerId(String customerId) {
      this.customerId = customerId;
      return this;
    }

    public Builder setLiftMeasurementConfigurationId(String liftMeasurementConfigurationId) {
      this.liftMeasurementConfigurationId = liftMeasurementConfigurationId;
      return this;
    }

    public Builder setCampaignId(String campaignId) {
      this.campaignId = campaignId;
      return this;
    }

    public Builder setExternalVideoId(String externalVideoId) {
      this.externalVideoId = externalVideoId;
      return this;
    }

    private Builder(LiftMeasurementVideoName liftMeasurementVideoName) {
      this.customerId = liftMeasurementVideoName.customerId;
      this.liftMeasurementConfigurationId = liftMeasurementVideoName.liftMeasurementConfigurationId;
      this.campaignId = liftMeasurementVideoName.campaignId;
      this.externalVideoId = liftMeasurementVideoName.externalVideoId;
    }

    public LiftMeasurementVideoName build() {
      return new LiftMeasurementVideoName(this);
    }
  }
}
