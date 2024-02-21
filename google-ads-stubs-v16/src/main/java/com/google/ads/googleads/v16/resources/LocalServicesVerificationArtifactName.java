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

package com.google.ads.googleads.v16.resources;

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
public class LocalServicesVerificationArtifactName implements ResourceName {
  private static final PathTemplate CUSTOMER_ID_GLS_VERIFICATION_ARTIFACT_ID =
      PathTemplate.createWithoutUrlEncoding(
          "customers/{customer_id}/localServicesVerificationArtifacts/{gls_verification_artifact_id}");
  private volatile Map<String, String> fieldValuesMap;
  private final String customerId;
  private final String glsVerificationArtifactId;

  @Deprecated
  protected LocalServicesVerificationArtifactName() {
    customerId = null;
    glsVerificationArtifactId = null;
  }

  private LocalServicesVerificationArtifactName(Builder builder) {
    customerId = Preconditions.checkNotNull(builder.getCustomerId());
    glsVerificationArtifactId = Preconditions.checkNotNull(builder.getGlsVerificationArtifactId());
  }

  public String getCustomerId() {
    return customerId;
  }

  public String getGlsVerificationArtifactId() {
    return glsVerificationArtifactId;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  public static LocalServicesVerificationArtifactName of(
      String customerId, String glsVerificationArtifactId) {
    return newBuilder()
        .setCustomerId(customerId)
        .setGlsVerificationArtifactId(glsVerificationArtifactId)
        .build();
  }

  public static String format(String customerId, String glsVerificationArtifactId) {
    return newBuilder()
        .setCustomerId(customerId)
        .setGlsVerificationArtifactId(glsVerificationArtifactId)
        .build()
        .toString();
  }

  public static LocalServicesVerificationArtifactName parse(String formattedString) {
    if (formattedString.isEmpty()) {
      return null;
    }
    Map<String, String> matchMap =
        CUSTOMER_ID_GLS_VERIFICATION_ARTIFACT_ID.validatedMatch(
            formattedString,
            "LocalServicesVerificationArtifactName.parse: formattedString not in valid format");
    return of(matchMap.get("customer_id"), matchMap.get("gls_verification_artifact_id"));
  }

  public static List<LocalServicesVerificationArtifactName> parseList(
      List<String> formattedStrings) {
    List<LocalServicesVerificationArtifactName> list = new ArrayList<>(formattedStrings.size());
    for (String formattedString : formattedStrings) {
      list.add(parse(formattedString));
    }
    return list;
  }

  public static List<String> toStringList(List<LocalServicesVerificationArtifactName> values) {
    List<String> list = new ArrayList<>(values.size());
    for (LocalServicesVerificationArtifactName value : values) {
      if (value == null) {
        list.add("");
      } else {
        list.add(value.toString());
      }
    }
    return list;
  }

  public static boolean isParsableFrom(String formattedString) {
    return CUSTOMER_ID_GLS_VERIFICATION_ARTIFACT_ID.matches(formattedString);
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
          if (glsVerificationArtifactId != null) {
            fieldMapBuilder.put("gls_verification_artifact_id", glsVerificationArtifactId);
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
    return CUSTOMER_ID_GLS_VERIFICATION_ARTIFACT_ID.instantiate(
        "customer_id", customerId, "gls_verification_artifact_id", glsVerificationArtifactId);
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o != null && getClass() == o.getClass()) {
      LocalServicesVerificationArtifactName that = ((LocalServicesVerificationArtifactName) o);
      return Objects.equals(this.customerId, that.customerId)
          && Objects.equals(this.glsVerificationArtifactId, that.glsVerificationArtifactId);
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= Objects.hashCode(customerId);
    h *= 1000003;
    h ^= Objects.hashCode(glsVerificationArtifactId);
    return h;
  }

  /**
   * Builder for
   * customers/{customer_id}/localServicesVerificationArtifacts/{gls_verification_artifact_id}.
   */
  public static class Builder {
    private String customerId;
    private String glsVerificationArtifactId;

    protected Builder() {}

    public String getCustomerId() {
      return customerId;
    }

    public String getGlsVerificationArtifactId() {
      return glsVerificationArtifactId;
    }

    public Builder setCustomerId(String customerId) {
      this.customerId = customerId;
      return this;
    }

    public Builder setGlsVerificationArtifactId(String glsVerificationArtifactId) {
      this.glsVerificationArtifactId = glsVerificationArtifactId;
      return this;
    }

    private Builder(LocalServicesVerificationArtifactName localServicesVerificationArtifactName) {
      this.customerId = localServicesVerificationArtifactName.customerId;
      this.glsVerificationArtifactId =
          localServicesVerificationArtifactName.glsVerificationArtifactId;
    }

    public LocalServicesVerificationArtifactName build() {
      return new LocalServicesVerificationArtifactName(this);
    }
  }
}
