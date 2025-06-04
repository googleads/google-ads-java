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

package com.google.ads.googleads.v18.resources;

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
public class ShoppingProductName implements ResourceName {
  private static final PathTemplate
      CUSTOMER_ID_MERCHANT_CENTER_ID_CHANNEL_LANGUAGE_CODE_FEED_LABEL_ITEM_ID =
          PathTemplate.createWithoutUrlEncoding(
              "customers/{customer_id}/shoppingProducts/{merchant_center_id}~{channel}~{language_code}~{feed_label}~{item_id}");
  private volatile Map<String, String> fieldValuesMap;
  private final String customerId;
  private final String merchantCenterId;
  private final String channel;
  private final String languageCode;
  private final String feedLabel;
  private final String itemId;

  @Deprecated
  protected ShoppingProductName() {
    customerId = null;
    merchantCenterId = null;
    channel = null;
    languageCode = null;
    feedLabel = null;
    itemId = null;
  }

  private ShoppingProductName(Builder builder) {
    customerId = Preconditions.checkNotNull(builder.getCustomerId());
    merchantCenterId = Preconditions.checkNotNull(builder.getMerchantCenterId());
    channel = Preconditions.checkNotNull(builder.getChannel());
    languageCode = Preconditions.checkNotNull(builder.getLanguageCode());
    feedLabel = Preconditions.checkNotNull(builder.getFeedLabel());
    itemId = Preconditions.checkNotNull(builder.getItemId());
  }

  public String getCustomerId() {
    return customerId;
  }

  public String getMerchantCenterId() {
    return merchantCenterId;
  }

  public String getChannel() {
    return channel;
  }

  public String getLanguageCode() {
    return languageCode;
  }

  public String getFeedLabel() {
    return feedLabel;
  }

  public String getItemId() {
    return itemId;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  public static ShoppingProductName of(
      String customerId,
      String merchantCenterId,
      String channel,
      String languageCode,
      String feedLabel,
      String itemId) {
    return newBuilder()
        .setCustomerId(customerId)
        .setMerchantCenterId(merchantCenterId)
        .setChannel(channel)
        .setLanguageCode(languageCode)
        .setFeedLabel(feedLabel)
        .setItemId(itemId)
        .build();
  }

  public static String format(
      String customerId,
      String merchantCenterId,
      String channel,
      String languageCode,
      String feedLabel,
      String itemId) {
    return newBuilder()
        .setCustomerId(customerId)
        .setMerchantCenterId(merchantCenterId)
        .setChannel(channel)
        .setLanguageCode(languageCode)
        .setFeedLabel(feedLabel)
        .setItemId(itemId)
        .build()
        .toString();
  }

  public static ShoppingProductName parse(String formattedString) {
    if (formattedString.isEmpty()) {
      return null;
    }
    Map<String, String> matchMap =
        CUSTOMER_ID_MERCHANT_CENTER_ID_CHANNEL_LANGUAGE_CODE_FEED_LABEL_ITEM_ID.validatedMatch(
            formattedString, "ShoppingProductName.parse: formattedString not in valid format");
    return of(
        matchMap.get("customer_id"),
        matchMap.get("merchant_center_id"),
        matchMap.get("channel"),
        matchMap.get("language_code"),
        matchMap.get("feed_label"),
        matchMap.get("item_id"));
  }

  public static List<ShoppingProductName> parseList(List<String> formattedStrings) {
    List<ShoppingProductName> list = new ArrayList<>(formattedStrings.size());
    for (String formattedString : formattedStrings) {
      list.add(parse(formattedString));
    }
    return list;
  }

  public static List<String> toStringList(List<ShoppingProductName> values) {
    List<String> list = new ArrayList<>(values.size());
    for (ShoppingProductName value : values) {
      if (value == null) {
        list.add("");
      } else {
        list.add(value.toString());
      }
    }
    return list;
  }

  public static boolean isParsableFrom(String formattedString) {
    return CUSTOMER_ID_MERCHANT_CENTER_ID_CHANNEL_LANGUAGE_CODE_FEED_LABEL_ITEM_ID.matches(
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
          if (merchantCenterId != null) {
            fieldMapBuilder.put("merchant_center_id", merchantCenterId);
          }
          if (channel != null) {
            fieldMapBuilder.put("channel", channel);
          }
          if (languageCode != null) {
            fieldMapBuilder.put("language_code", languageCode);
          }
          if (feedLabel != null) {
            fieldMapBuilder.put("feed_label", feedLabel);
          }
          if (itemId != null) {
            fieldMapBuilder.put("item_id", itemId);
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
    return CUSTOMER_ID_MERCHANT_CENTER_ID_CHANNEL_LANGUAGE_CODE_FEED_LABEL_ITEM_ID.instantiate(
        "customer_id",
        customerId,
        "merchant_center_id",
        merchantCenterId,
        "channel",
        channel,
        "language_code",
        languageCode,
        "feed_label",
        feedLabel,
        "item_id",
        itemId);
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o != null && getClass() == o.getClass()) {
      ShoppingProductName that = ((ShoppingProductName) o);
      return Objects.equals(this.customerId, that.customerId)
          && Objects.equals(this.merchantCenterId, that.merchantCenterId)
          && Objects.equals(this.channel, that.channel)
          && Objects.equals(this.languageCode, that.languageCode)
          && Objects.equals(this.feedLabel, that.feedLabel)
          && Objects.equals(this.itemId, that.itemId);
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= Objects.hashCode(customerId);
    h *= 1000003;
    h ^= Objects.hashCode(merchantCenterId);
    h *= 1000003;
    h ^= Objects.hashCode(channel);
    h *= 1000003;
    h ^= Objects.hashCode(languageCode);
    h *= 1000003;
    h ^= Objects.hashCode(feedLabel);
    h *= 1000003;
    h ^= Objects.hashCode(itemId);
    return h;
  }

  /**
   * Builder for
   * customers/{customer_id}/shoppingProducts/{merchant_center_id}~{channel}~{language_code}~{feed_label}~{item_id}.
   */
  public static class Builder {
    private String customerId;
    private String merchantCenterId;
    private String channel;
    private String languageCode;
    private String feedLabel;
    private String itemId;

    protected Builder() {}

    public String getCustomerId() {
      return customerId;
    }

    public String getMerchantCenterId() {
      return merchantCenterId;
    }

    public String getChannel() {
      return channel;
    }

    public String getLanguageCode() {
      return languageCode;
    }

    public String getFeedLabel() {
      return feedLabel;
    }

    public String getItemId() {
      return itemId;
    }

    public Builder setCustomerId(String customerId) {
      this.customerId = customerId;
      return this;
    }

    public Builder setMerchantCenterId(String merchantCenterId) {
      this.merchantCenterId = merchantCenterId;
      return this;
    }

    public Builder setChannel(String channel) {
      this.channel = channel;
      return this;
    }

    public Builder setLanguageCode(String languageCode) {
      this.languageCode = languageCode;
      return this;
    }

    public Builder setFeedLabel(String feedLabel) {
      this.feedLabel = feedLabel;
      return this;
    }

    public Builder setItemId(String itemId) {
      this.itemId = itemId;
      return this;
    }

    private Builder(ShoppingProductName shoppingProductName) {
      this.customerId = shoppingProductName.customerId;
      this.merchantCenterId = shoppingProductName.merchantCenterId;
      this.channel = shoppingProductName.channel;
      this.languageCode = shoppingProductName.languageCode;
      this.feedLabel = shoppingProductName.feedLabel;
      this.itemId = shoppingProductName.itemId;
    }

    public ShoppingProductName build() {
      return new ShoppingProductName(this);
    }
  }
}
