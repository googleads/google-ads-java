/*
 * Copyright 2021 Google LLC
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

package com.google.ads.googleads.v8.resources;

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
public class CampaignSimulationName implements ResourceName {
  private static final PathTemplate
      CUSTOMER_ID_CAMPAIGN_ID_TYPE_MODIFICATION_METHOD_START_DATE_END_DATE =
          PathTemplate.createWithoutUrlEncoding(
              "customers/{customer_id}/campaignSimulations/{campaign_id}~{type}~{modification_method}~{start_date}~{end_date}");
  private volatile Map<String, String> fieldValuesMap;
  private final String customerId;
  private final String campaignId;
  private final String type;
  private final String modificationMethod;
  private final String startDate;
  private final String endDate;

  @Deprecated
  protected CampaignSimulationName() {
    customerId = null;
    campaignId = null;
    type = null;
    modificationMethod = null;
    startDate = null;
    endDate = null;
  }

  private CampaignSimulationName(Builder builder) {
    customerId = Preconditions.checkNotNull(builder.getCustomerId());
    campaignId = Preconditions.checkNotNull(builder.getCampaignId());
    type = Preconditions.checkNotNull(builder.getType());
    modificationMethod = Preconditions.checkNotNull(builder.getModificationMethod());
    startDate = Preconditions.checkNotNull(builder.getStartDate());
    endDate = Preconditions.checkNotNull(builder.getEndDate());
  }

  public String getCustomerId() {
    return customerId;
  }

  public String getCampaignId() {
    return campaignId;
  }

  public String getType() {
    return type;
  }

  public String getModificationMethod() {
    return modificationMethod;
  }

  public String getStartDate() {
    return startDate;
  }

  public String getEndDate() {
    return endDate;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  public static CampaignSimulationName of(
      String customerId,
      String campaignId,
      String type,
      String modificationMethod,
      String startDate,
      String endDate) {
    return newBuilder()
        .setCustomerId(customerId)
        .setCampaignId(campaignId)
        .setType(type)
        .setModificationMethod(modificationMethod)
        .setStartDate(startDate)
        .setEndDate(endDate)
        .build();
  }

  public static String format(
      String customerId,
      String campaignId,
      String type,
      String modificationMethod,
      String startDate,
      String endDate) {
    return newBuilder()
        .setCustomerId(customerId)
        .setCampaignId(campaignId)
        .setType(type)
        .setModificationMethod(modificationMethod)
        .setStartDate(startDate)
        .setEndDate(endDate)
        .build()
        .toString();
  }

  public static CampaignSimulationName parse(String formattedString) {
    if (formattedString.isEmpty()) {
      return null;
    }
    Map<String, String> matchMap =
        CUSTOMER_ID_CAMPAIGN_ID_TYPE_MODIFICATION_METHOD_START_DATE_END_DATE.validatedMatch(
            formattedString, "CampaignSimulationName.parse: formattedString not in valid format");
    return of(
        matchMap.get("customer_id"),
        matchMap.get("campaign_id"),
        matchMap.get("type"),
        matchMap.get("modification_method"),
        matchMap.get("start_date"),
        matchMap.get("end_date"));
  }

  public static List<CampaignSimulationName> parseList(List<String> formattedStrings) {
    List<CampaignSimulationName> list = new ArrayList<>(formattedStrings.size());
    for (String formattedString : formattedStrings) {
      list.add(parse(formattedString));
    }
    return list;
  }

  public static List<String> toStringList(List<CampaignSimulationName> values) {
    List<String> list = new ArrayList<>(values.size());
    for (CampaignSimulationName value : values) {
      if (value == null) {
        list.add("");
      } else {
        list.add(value.toString());
      }
    }
    return list;
  }

  public static boolean isParsableFrom(String formattedString) {
    return CUSTOMER_ID_CAMPAIGN_ID_TYPE_MODIFICATION_METHOD_START_DATE_END_DATE.matches(
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
          if (campaignId != null) {
            fieldMapBuilder.put("campaign_id", campaignId);
          }
          if (type != null) {
            fieldMapBuilder.put("type", type);
          }
          if (modificationMethod != null) {
            fieldMapBuilder.put("modification_method", modificationMethod);
          }
          if (startDate != null) {
            fieldMapBuilder.put("start_date", startDate);
          }
          if (endDate != null) {
            fieldMapBuilder.put("end_date", endDate);
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
    return CUSTOMER_ID_CAMPAIGN_ID_TYPE_MODIFICATION_METHOD_START_DATE_END_DATE.instantiate(
        "customer_id",
        customerId,
        "campaign_id",
        campaignId,
        "type",
        type,
        "modification_method",
        modificationMethod,
        "start_date",
        startDate,
        "end_date",
        endDate);
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o != null || getClass() == o.getClass()) {
      CampaignSimulationName that = ((CampaignSimulationName) o);
      return Objects.equals(this.customerId, that.customerId)
          && Objects.equals(this.campaignId, that.campaignId)
          && Objects.equals(this.type, that.type)
          && Objects.equals(this.modificationMethod, that.modificationMethod)
          && Objects.equals(this.startDate, that.startDate)
          && Objects.equals(this.endDate, that.endDate);
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
    h ^= Objects.hashCode(type);
    h *= 1000003;
    h ^= Objects.hashCode(modificationMethod);
    h *= 1000003;
    h ^= Objects.hashCode(startDate);
    h *= 1000003;
    h ^= Objects.hashCode(endDate);
    return h;
  }

  /**
   * Builder for
   * customers/{customer_id}/campaignSimulations/{campaign_id}~{type}~{modification_method}~{start_date}~{end_date}.
   */
  public static class Builder {
    private String customerId;
    private String campaignId;
    private String type;
    private String modificationMethod;
    private String startDate;
    private String endDate;

    protected Builder() {}

    public String getCustomerId() {
      return customerId;
    }

    public String getCampaignId() {
      return campaignId;
    }

    public String getType() {
      return type;
    }

    public String getModificationMethod() {
      return modificationMethod;
    }

    public String getStartDate() {
      return startDate;
    }

    public String getEndDate() {
      return endDate;
    }

    public Builder setCustomerId(String customerId) {
      this.customerId = customerId;
      return this;
    }

    public Builder setCampaignId(String campaignId) {
      this.campaignId = campaignId;
      return this;
    }

    public Builder setType(String type) {
      this.type = type;
      return this;
    }

    public Builder setModificationMethod(String modificationMethod) {
      this.modificationMethod = modificationMethod;
      return this;
    }

    public Builder setStartDate(String startDate) {
      this.startDate = startDate;
      return this;
    }

    public Builder setEndDate(String endDate) {
      this.endDate = endDate;
      return this;
    }

    private Builder(CampaignSimulationName campaignSimulationName) {
      customerId = campaignSimulationName.customerId;
      campaignId = campaignSimulationName.campaignId;
      type = campaignSimulationName.type;
      modificationMethod = campaignSimulationName.modificationMethod;
      startDate = campaignSimulationName.startDate;
      endDate = campaignSimulationName.endDate;
    }

    public CampaignSimulationName build() {
      return new CampaignSimulationName(this);
    }
  }
}
