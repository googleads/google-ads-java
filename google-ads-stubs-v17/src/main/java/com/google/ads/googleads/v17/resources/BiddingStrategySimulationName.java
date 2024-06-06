/*
 * Copyright 2024 Google LLC
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

package com.google.ads.googleads.v17.resources;

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
public class BiddingStrategySimulationName implements ResourceName {
  private static final PathTemplate
      CUSTOMER_ID_BIDDING_STRATEGY_ID_TYPE_MODIFICATION_METHOD_START_DATE_END_DATE =
          PathTemplate.createWithoutUrlEncoding(
              "customers/{customer_id}/biddingStrategySimulations/{bidding_strategy_id}~{type}~{modification_method}~{start_date}~{end_date}");
  private volatile Map<String, String> fieldValuesMap;
  private final String customerId;
  private final String biddingStrategyId;
  private final String type;
  private final String modificationMethod;
  private final String startDate;
  private final String endDate;

  @Deprecated
  protected BiddingStrategySimulationName() {
    customerId = null;
    biddingStrategyId = null;
    type = null;
    modificationMethod = null;
    startDate = null;
    endDate = null;
  }

  private BiddingStrategySimulationName(Builder builder) {
    customerId = Preconditions.checkNotNull(builder.getCustomerId());
    biddingStrategyId = Preconditions.checkNotNull(builder.getBiddingStrategyId());
    type = Preconditions.checkNotNull(builder.getType());
    modificationMethod = Preconditions.checkNotNull(builder.getModificationMethod());
    startDate = Preconditions.checkNotNull(builder.getStartDate());
    endDate = Preconditions.checkNotNull(builder.getEndDate());
  }

  public String getCustomerId() {
    return customerId;
  }

  public String getBiddingStrategyId() {
    return biddingStrategyId;
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

  public static BiddingStrategySimulationName of(
      String customerId,
      String biddingStrategyId,
      String type,
      String modificationMethod,
      String startDate,
      String endDate) {
    return newBuilder()
        .setCustomerId(customerId)
        .setBiddingStrategyId(biddingStrategyId)
        .setType(type)
        .setModificationMethod(modificationMethod)
        .setStartDate(startDate)
        .setEndDate(endDate)
        .build();
  }

  public static String format(
      String customerId,
      String biddingStrategyId,
      String type,
      String modificationMethod,
      String startDate,
      String endDate) {
    return newBuilder()
        .setCustomerId(customerId)
        .setBiddingStrategyId(biddingStrategyId)
        .setType(type)
        .setModificationMethod(modificationMethod)
        .setStartDate(startDate)
        .setEndDate(endDate)
        .build()
        .toString();
  }

  public static BiddingStrategySimulationName parse(String formattedString) {
    if (formattedString.isEmpty()) {
      return null;
    }
    Map<String, String> matchMap =
        CUSTOMER_ID_BIDDING_STRATEGY_ID_TYPE_MODIFICATION_METHOD_START_DATE_END_DATE.validatedMatch(
            formattedString,
            "BiddingStrategySimulationName.parse: formattedString not in valid format");
    return of(
        matchMap.get("customer_id"),
        matchMap.get("bidding_strategy_id"),
        matchMap.get("type"),
        matchMap.get("modification_method"),
        matchMap.get("start_date"),
        matchMap.get("end_date"));
  }

  public static List<BiddingStrategySimulationName> parseList(List<String> formattedStrings) {
    List<BiddingStrategySimulationName> list = new ArrayList<>(formattedStrings.size());
    for (String formattedString : formattedStrings) {
      list.add(parse(formattedString));
    }
    return list;
  }

  public static List<String> toStringList(List<BiddingStrategySimulationName> values) {
    List<String> list = new ArrayList<>(values.size());
    for (BiddingStrategySimulationName value : values) {
      if (value == null) {
        list.add("");
      } else {
        list.add(value.toString());
      }
    }
    return list;
  }

  public static boolean isParsableFrom(String formattedString) {
    return CUSTOMER_ID_BIDDING_STRATEGY_ID_TYPE_MODIFICATION_METHOD_START_DATE_END_DATE.matches(
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
          if (biddingStrategyId != null) {
            fieldMapBuilder.put("bidding_strategy_id", biddingStrategyId);
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
    return CUSTOMER_ID_BIDDING_STRATEGY_ID_TYPE_MODIFICATION_METHOD_START_DATE_END_DATE.instantiate(
        "customer_id",
        customerId,
        "bidding_strategy_id",
        biddingStrategyId,
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
    if (o != null && getClass() == o.getClass()) {
      BiddingStrategySimulationName that = ((BiddingStrategySimulationName) o);
      return Objects.equals(this.customerId, that.customerId)
          && Objects.equals(this.biddingStrategyId, that.biddingStrategyId)
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
    h ^= Objects.hashCode(biddingStrategyId);
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
   * customers/{customer_id}/biddingStrategySimulations/{bidding_strategy_id}~{type}~{modification_method}~{start_date}~{end_date}.
   */
  public static class Builder {
    private String customerId;
    private String biddingStrategyId;
    private String type;
    private String modificationMethod;
    private String startDate;
    private String endDate;

    protected Builder() {}

    public String getCustomerId() {
      return customerId;
    }

    public String getBiddingStrategyId() {
      return biddingStrategyId;
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

    public Builder setBiddingStrategyId(String biddingStrategyId) {
      this.biddingStrategyId = biddingStrategyId;
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

    private Builder(BiddingStrategySimulationName biddingStrategySimulationName) {
      this.customerId = biddingStrategySimulationName.customerId;
      this.biddingStrategyId = biddingStrategySimulationName.biddingStrategyId;
      this.type = biddingStrategySimulationName.type;
      this.modificationMethod = biddingStrategySimulationName.modificationMethod;
      this.startDate = biddingStrategySimulationName.startDate;
      this.endDate = biddingStrategySimulationName.endDate;
    }

    public BiddingStrategySimulationName build() {
      return new BiddingStrategySimulationName(this);
    }
  }
}
