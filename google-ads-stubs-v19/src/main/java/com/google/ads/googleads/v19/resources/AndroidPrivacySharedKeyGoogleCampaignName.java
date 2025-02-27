/*
 * Copyright 2025 Google LLC
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

package com.google.ads.googleads.v19.resources;

import com.google.api.pathtemplate.PathTemplate;
import com.google.api.resourcenames.ResourceName;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
@Generated("by gapic-generator-java")
public class AndroidPrivacySharedKeyGoogleCampaignName implements ResourceName {
  private static final PathTemplate
      CUSTOMER_ID_CAMPAIGN_ID_ANDROID_PRIVACY_INTERACTION_TYPE_ANDROID_PRIVACY_INTERACTION_DATE =
          PathTemplate.createWithoutUrlEncoding(
              "customers/{customer_id}/androidPrivacySharedKeyGoogleCampaigns/{campaign_id}~{android_privacy_interaction_type}~{android_privacy_interaction_date}");
  private volatile Map<String, String> fieldValuesMap;
  private final String customerId;
  private final String campaignId;
  private final String androidPrivacyInteractionType;
  private final String androidPrivacyInteractionDate;

  @Deprecated
  protected AndroidPrivacySharedKeyGoogleCampaignName() {
    customerId = null;
    campaignId = null;
    androidPrivacyInteractionType = null;
    androidPrivacyInteractionDate = null;
  }

  private AndroidPrivacySharedKeyGoogleCampaignName(Builder builder) {
    customerId = Preconditions.checkNotNull(builder.getCustomerId());
    campaignId = Preconditions.checkNotNull(builder.getCampaignId());
    androidPrivacyInteractionType =
        Preconditions.checkNotNull(builder.getAndroidPrivacyInteractionType());
    androidPrivacyInteractionDate =
        Preconditions.checkNotNull(builder.getAndroidPrivacyInteractionDate());
  }

  public String getCustomerId() {
    return customerId;
  }

  public String getCampaignId() {
    return campaignId;
  }

  public String getAndroidPrivacyInteractionType() {
    return androidPrivacyInteractionType;
  }

  public String getAndroidPrivacyInteractionDate() {
    return androidPrivacyInteractionDate;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  public static AndroidPrivacySharedKeyGoogleCampaignName of(
      String customerId,
      String campaignId,
      String androidPrivacyInteractionType,
      String androidPrivacyInteractionDate) {
    return newBuilder()
        .setCustomerId(customerId)
        .setCampaignId(campaignId)
        .setAndroidPrivacyInteractionType(androidPrivacyInteractionType)
        .setAndroidPrivacyInteractionDate(androidPrivacyInteractionDate)
        .build();
  }

  public static String format(
      String customerId,
      String campaignId,
      String androidPrivacyInteractionType,
      String androidPrivacyInteractionDate) {
    return newBuilder()
        .setCustomerId(customerId)
        .setCampaignId(campaignId)
        .setAndroidPrivacyInteractionType(androidPrivacyInteractionType)
        .setAndroidPrivacyInteractionDate(androidPrivacyInteractionDate)
        .build()
        .toString();
  }

  public static AndroidPrivacySharedKeyGoogleCampaignName parse(String formattedString) {
    if (formattedString.isEmpty()) {
      return null;
    }
    Map<String, String> matchMap =
        CUSTOMER_ID_CAMPAIGN_ID_ANDROID_PRIVACY_INTERACTION_TYPE_ANDROID_PRIVACY_INTERACTION_DATE
            .validatedMatch(
                formattedString,
                "AndroidPrivacySharedKeyGoogleCampaignName.parse: formattedString not in valid format");
    return of(
        matchMap.get("customer_id"),
        matchMap.get("campaign_id"),
        matchMap.get("android_privacy_interaction_type"),
        matchMap.get("android_privacy_interaction_date"));
  }

  public static List<AndroidPrivacySharedKeyGoogleCampaignName> parseList(
      List<String> formattedStrings) {
    List<AndroidPrivacySharedKeyGoogleCampaignName> list = new ArrayList<>(formattedStrings.size());
    for (String formattedString : formattedStrings) {
      list.add(parse(formattedString));
    }
    return list;
  }

  public static List<String> toStringList(List<AndroidPrivacySharedKeyGoogleCampaignName> values) {
    List<String> list = new ArrayList<>(values.size());
    for (AndroidPrivacySharedKeyGoogleCampaignName value : values) {
      if (value == null) {
        list.add("");
      } else {
        list.add(value.toString());
      }
    }
    return list;
  }

  public static boolean isParsableFrom(String formattedString) {
    return CUSTOMER_ID_CAMPAIGN_ID_ANDROID_PRIVACY_INTERACTION_TYPE_ANDROID_PRIVACY_INTERACTION_DATE
        .matches(formattedString);
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
          if (campaignId != null) {
            fieldMapBuilder.put("campaign_id", campaignId);
          }
          if (androidPrivacyInteractionType != null) {
            fieldMapBuilder.put("android_privacy_interaction_type", androidPrivacyInteractionType);
          }
          if (androidPrivacyInteractionDate != null) {
            fieldMapBuilder.put("android_privacy_interaction_date", androidPrivacyInteractionDate);
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
    return CUSTOMER_ID_CAMPAIGN_ID_ANDROID_PRIVACY_INTERACTION_TYPE_ANDROID_PRIVACY_INTERACTION_DATE
        .instantiate(
            "customer_id",
            customerId,
            "campaign_id",
            campaignId,
            "android_privacy_interaction_type",
            androidPrivacyInteractionType,
            "android_privacy_interaction_date",
            androidPrivacyInteractionDate);
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o != null && getClass() == o.getClass()) {
      AndroidPrivacySharedKeyGoogleCampaignName that =
          ((AndroidPrivacySharedKeyGoogleCampaignName) o);
      return Objects.equals(this.customerId, that.customerId)
          && Objects.equals(this.campaignId, that.campaignId)
          && Objects.equals(this.androidPrivacyInteractionType, that.androidPrivacyInteractionType)
          && Objects.equals(this.androidPrivacyInteractionDate, that.androidPrivacyInteractionDate);
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= Objects.hashCode(customerId);
    h *= 1000003;
    h ^= Objects.hashCode(campaignId);
    h *= 1000003;
    h ^= Objects.hashCode(androidPrivacyInteractionType);
    h *= 1000003;
    h ^= Objects.hashCode(androidPrivacyInteractionDate);
    return h;
  }

  /**
   * Builder for
   * customers/{customer_id}/androidPrivacySharedKeyGoogleCampaigns/{campaign_id}~{android_privacy_interaction_type}~{android_privacy_interaction_date}.
   */
  public static class Builder {
    private String customerId;
    private String campaignId;
    private String androidPrivacyInteractionType;
    private String androidPrivacyInteractionDate;

    protected Builder() {}

    public String getCustomerId() {
      return customerId;
    }

    public String getCampaignId() {
      return campaignId;
    }

    public String getAndroidPrivacyInteractionType() {
      return androidPrivacyInteractionType;
    }

    public String getAndroidPrivacyInteractionDate() {
      return androidPrivacyInteractionDate;
    }

    public Builder setCustomerId(String customerId) {
      this.customerId = customerId;
      return this;
    }

    public Builder setCampaignId(String campaignId) {
      this.campaignId = campaignId;
      return this;
    }

    public Builder setAndroidPrivacyInteractionType(String androidPrivacyInteractionType) {
      this.androidPrivacyInteractionType = androidPrivacyInteractionType;
      return this;
    }

    public Builder setAndroidPrivacyInteractionDate(String androidPrivacyInteractionDate) {
      this.androidPrivacyInteractionDate = androidPrivacyInteractionDate;
      return this;
    }

    private Builder(
        AndroidPrivacySharedKeyGoogleCampaignName androidPrivacySharedKeyGoogleCampaignName) {
      this.customerId = androidPrivacySharedKeyGoogleCampaignName.customerId;
      this.campaignId = androidPrivacySharedKeyGoogleCampaignName.campaignId;
      this.androidPrivacyInteractionType =
          androidPrivacySharedKeyGoogleCampaignName.androidPrivacyInteractionType;
      this.androidPrivacyInteractionDate =
          androidPrivacySharedKeyGoogleCampaignName.androidPrivacyInteractionDate;
    }

    public AndroidPrivacySharedKeyGoogleCampaignName build() {
      return new AndroidPrivacySharedKeyGoogleCampaignName(this);
    }
  }
}
