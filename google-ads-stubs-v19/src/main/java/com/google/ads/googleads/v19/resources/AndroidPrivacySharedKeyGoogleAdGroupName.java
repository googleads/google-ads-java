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
public class AndroidPrivacySharedKeyGoogleAdGroupName implements ResourceName {
  private static final PathTemplate
      CUSTOMER_ID_CAMPAIGN_ID_AD_GROUP_ID_ANDROID_PRIVACY_INTERACTION_TYPE_ANDROID_PRIVACY_NETWORK_TYPE_ANDROID_PRIVACY_INTERACTION_DATE =
          PathTemplate.createWithoutUrlEncoding(
              "customers/{customer_id}/androidPrivacySharedKeyGoogleAdGroups/{campaign_id}~{ad_group_id}~{android_privacy_interaction_type}~{android_privacy_network_type}~{android_privacy_interaction_date}");
  private volatile Map<String, String> fieldValuesMap;
  private final String customerId;
  private final String campaignId;
  private final String adGroupId;
  private final String androidPrivacyInteractionType;
  private final String androidPrivacyNetworkType;
  private final String androidPrivacyInteractionDate;

  @Deprecated
  protected AndroidPrivacySharedKeyGoogleAdGroupName() {
    customerId = null;
    campaignId = null;
    adGroupId = null;
    androidPrivacyInteractionType = null;
    androidPrivacyNetworkType = null;
    androidPrivacyInteractionDate = null;
  }

  private AndroidPrivacySharedKeyGoogleAdGroupName(Builder builder) {
    customerId = Preconditions.checkNotNull(builder.getCustomerId());
    campaignId = Preconditions.checkNotNull(builder.getCampaignId());
    adGroupId = Preconditions.checkNotNull(builder.getAdGroupId());
    androidPrivacyInteractionType =
        Preconditions.checkNotNull(builder.getAndroidPrivacyInteractionType());
    androidPrivacyNetworkType = Preconditions.checkNotNull(builder.getAndroidPrivacyNetworkType());
    androidPrivacyInteractionDate =
        Preconditions.checkNotNull(builder.getAndroidPrivacyInteractionDate());
  }

  public String getCustomerId() {
    return customerId;
  }

  public String getCampaignId() {
    return campaignId;
  }

  public String getAdGroupId() {
    return adGroupId;
  }

  public String getAndroidPrivacyInteractionType() {
    return androidPrivacyInteractionType;
  }

  public String getAndroidPrivacyNetworkType() {
    return androidPrivacyNetworkType;
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

  public static AndroidPrivacySharedKeyGoogleAdGroupName of(
      String customerId,
      String campaignId,
      String adGroupId,
      String androidPrivacyInteractionType,
      String androidPrivacyNetworkType,
      String androidPrivacyInteractionDate) {
    return newBuilder()
        .setCustomerId(customerId)
        .setCampaignId(campaignId)
        .setAdGroupId(adGroupId)
        .setAndroidPrivacyInteractionType(androidPrivacyInteractionType)
        .setAndroidPrivacyNetworkType(androidPrivacyNetworkType)
        .setAndroidPrivacyInteractionDate(androidPrivacyInteractionDate)
        .build();
  }

  public static String format(
      String customerId,
      String campaignId,
      String adGroupId,
      String androidPrivacyInteractionType,
      String androidPrivacyNetworkType,
      String androidPrivacyInteractionDate) {
    return newBuilder()
        .setCustomerId(customerId)
        .setCampaignId(campaignId)
        .setAdGroupId(adGroupId)
        .setAndroidPrivacyInteractionType(androidPrivacyInteractionType)
        .setAndroidPrivacyNetworkType(androidPrivacyNetworkType)
        .setAndroidPrivacyInteractionDate(androidPrivacyInteractionDate)
        .build()
        .toString();
  }

  public static AndroidPrivacySharedKeyGoogleAdGroupName parse(String formattedString) {
    if (formattedString.isEmpty()) {
      return null;
    }
    Map<String, String> matchMap =
        CUSTOMER_ID_CAMPAIGN_ID_AD_GROUP_ID_ANDROID_PRIVACY_INTERACTION_TYPE_ANDROID_PRIVACY_NETWORK_TYPE_ANDROID_PRIVACY_INTERACTION_DATE
            .validatedMatch(
                formattedString,
                "AndroidPrivacySharedKeyGoogleAdGroupName.parse: formattedString not in valid format");
    return of(
        matchMap.get("customer_id"),
        matchMap.get("campaign_id"),
        matchMap.get("ad_group_id"),
        matchMap.get("android_privacy_interaction_type"),
        matchMap.get("android_privacy_network_type"),
        matchMap.get("android_privacy_interaction_date"));
  }

  public static List<AndroidPrivacySharedKeyGoogleAdGroupName> parseList(
      List<String> formattedStrings) {
    List<AndroidPrivacySharedKeyGoogleAdGroupName> list = new ArrayList<>(formattedStrings.size());
    for (String formattedString : formattedStrings) {
      list.add(parse(formattedString));
    }
    return list;
  }

  public static List<String> toStringList(List<AndroidPrivacySharedKeyGoogleAdGroupName> values) {
    List<String> list = new ArrayList<>(values.size());
    for (AndroidPrivacySharedKeyGoogleAdGroupName value : values) {
      if (value == null) {
        list.add("");
      } else {
        list.add(value.toString());
      }
    }
    return list;
  }

  public static boolean isParsableFrom(String formattedString) {
    return CUSTOMER_ID_CAMPAIGN_ID_AD_GROUP_ID_ANDROID_PRIVACY_INTERACTION_TYPE_ANDROID_PRIVACY_NETWORK_TYPE_ANDROID_PRIVACY_INTERACTION_DATE
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
          if (adGroupId != null) {
            fieldMapBuilder.put("ad_group_id", adGroupId);
          }
          if (androidPrivacyInteractionType != null) {
            fieldMapBuilder.put("android_privacy_interaction_type", androidPrivacyInteractionType);
          }
          if (androidPrivacyNetworkType != null) {
            fieldMapBuilder.put("android_privacy_network_type", androidPrivacyNetworkType);
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
    return CUSTOMER_ID_CAMPAIGN_ID_AD_GROUP_ID_ANDROID_PRIVACY_INTERACTION_TYPE_ANDROID_PRIVACY_NETWORK_TYPE_ANDROID_PRIVACY_INTERACTION_DATE
        .instantiate(
            "customer_id",
            customerId,
            "campaign_id",
            campaignId,
            "ad_group_id",
            adGroupId,
            "android_privacy_interaction_type",
            androidPrivacyInteractionType,
            "android_privacy_network_type",
            androidPrivacyNetworkType,
            "android_privacy_interaction_date",
            androidPrivacyInteractionDate);
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o != null && getClass() == o.getClass()) {
      AndroidPrivacySharedKeyGoogleAdGroupName that =
          ((AndroidPrivacySharedKeyGoogleAdGroupName) o);
      return Objects.equals(this.customerId, that.customerId)
          && Objects.equals(this.campaignId, that.campaignId)
          && Objects.equals(this.adGroupId, that.adGroupId)
          && Objects.equals(this.androidPrivacyInteractionType, that.androidPrivacyInteractionType)
          && Objects.equals(this.androidPrivacyNetworkType, that.androidPrivacyNetworkType)
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
    h ^= Objects.hashCode(adGroupId);
    h *= 1000003;
    h ^= Objects.hashCode(androidPrivacyInteractionType);
    h *= 1000003;
    h ^= Objects.hashCode(androidPrivacyNetworkType);
    h *= 1000003;
    h ^= Objects.hashCode(androidPrivacyInteractionDate);
    return h;
  }

  /**
   * Builder for
   * customers/{customer_id}/androidPrivacySharedKeyGoogleAdGroups/{campaign_id}~{ad_group_id}~{android_privacy_interaction_type}~{android_privacy_network_type}~{android_privacy_interaction_date}.
   */
  public static class Builder {
    private String customerId;
    private String campaignId;
    private String adGroupId;
    private String androidPrivacyInteractionType;
    private String androidPrivacyNetworkType;
    private String androidPrivacyInteractionDate;

    protected Builder() {}

    public String getCustomerId() {
      return customerId;
    }

    public String getCampaignId() {
      return campaignId;
    }

    public String getAdGroupId() {
      return adGroupId;
    }

    public String getAndroidPrivacyInteractionType() {
      return androidPrivacyInteractionType;
    }

    public String getAndroidPrivacyNetworkType() {
      return androidPrivacyNetworkType;
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

    public Builder setAdGroupId(String adGroupId) {
      this.adGroupId = adGroupId;
      return this;
    }

    public Builder setAndroidPrivacyInteractionType(String androidPrivacyInteractionType) {
      this.androidPrivacyInteractionType = androidPrivacyInteractionType;
      return this;
    }

    public Builder setAndroidPrivacyNetworkType(String androidPrivacyNetworkType) {
      this.androidPrivacyNetworkType = androidPrivacyNetworkType;
      return this;
    }

    public Builder setAndroidPrivacyInteractionDate(String androidPrivacyInteractionDate) {
      this.androidPrivacyInteractionDate = androidPrivacyInteractionDate;
      return this;
    }

    private Builder(
        AndroidPrivacySharedKeyGoogleAdGroupName androidPrivacySharedKeyGoogleAdGroupName) {
      this.customerId = androidPrivacySharedKeyGoogleAdGroupName.customerId;
      this.campaignId = androidPrivacySharedKeyGoogleAdGroupName.campaignId;
      this.adGroupId = androidPrivacySharedKeyGoogleAdGroupName.adGroupId;
      this.androidPrivacyInteractionType =
          androidPrivacySharedKeyGoogleAdGroupName.androidPrivacyInteractionType;
      this.androidPrivacyNetworkType =
          androidPrivacySharedKeyGoogleAdGroupName.androidPrivacyNetworkType;
      this.androidPrivacyInteractionDate =
          androidPrivacySharedKeyGoogleAdGroupName.androidPrivacyInteractionDate;
    }

    public AndroidPrivacySharedKeyGoogleAdGroupName build() {
      return new AndroidPrivacySharedKeyGoogleAdGroupName(this);
    }
  }
}
