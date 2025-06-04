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

package com.google.ads.googleads.v20.resources;

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
public class QualifyingQuestionName implements ResourceName {
  private static final PathTemplate QUALIFYING_QUESTION_ID =
      PathTemplate.createWithoutUrlEncoding("qualifyingQuestions/{qualifying_question_id}");
  private volatile Map<String, String> fieldValuesMap;
  private final String qualifyingQuestionId;

  @Deprecated
  protected QualifyingQuestionName() {
    qualifyingQuestionId = null;
  }

  private QualifyingQuestionName(Builder builder) {
    qualifyingQuestionId = Preconditions.checkNotNull(builder.getQualifyingQuestionId());
  }

  public String getQualifyingQuestionId() {
    return qualifyingQuestionId;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  public static QualifyingQuestionName of(String qualifyingQuestionId) {
    return newBuilder().setQualifyingQuestionId(qualifyingQuestionId).build();
  }

  public static String format(String qualifyingQuestionId) {
    return newBuilder().setQualifyingQuestionId(qualifyingQuestionId).build().toString();
  }

  public static QualifyingQuestionName parse(String formattedString) {
    if (formattedString.isEmpty()) {
      return null;
    }
    Map<String, String> matchMap =
        QUALIFYING_QUESTION_ID.validatedMatch(
            formattedString, "QualifyingQuestionName.parse: formattedString not in valid format");
    return of(matchMap.get("qualifying_question_id"));
  }

  public static List<QualifyingQuestionName> parseList(List<String> formattedStrings) {
    List<QualifyingQuestionName> list = new ArrayList<>(formattedStrings.size());
    for (String formattedString : formattedStrings) {
      list.add(parse(formattedString));
    }
    return list;
  }

  public static List<String> toStringList(List<QualifyingQuestionName> values) {
    List<String> list = new ArrayList<>(values.size());
    for (QualifyingQuestionName value : values) {
      if (value == null) {
        list.add("");
      } else {
        list.add(value.toString());
      }
    }
    return list;
  }

  public static boolean isParsableFrom(String formattedString) {
    return QUALIFYING_QUESTION_ID.matches(formattedString);
  }

  @Override
  public Map<String, String> getFieldValuesMap() {
    if (fieldValuesMap == null) {
      synchronized (this) {
        if (fieldValuesMap == null) {
          ImmutableMap.Builder<String, String> fieldMapBuilder = ImmutableMap.builder();
          if (qualifyingQuestionId != null) {
            fieldMapBuilder.put("qualifying_question_id", qualifyingQuestionId);
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
    return QUALIFYING_QUESTION_ID.instantiate("qualifying_question_id", qualifyingQuestionId);
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o != null && getClass() == o.getClass()) {
      QualifyingQuestionName that = ((QualifyingQuestionName) o);
      return Objects.equals(this.qualifyingQuestionId, that.qualifyingQuestionId);
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= Objects.hashCode(qualifyingQuestionId);
    return h;
  }

  /** Builder for qualifyingQuestions/{qualifying_question_id}. */
  public static class Builder {
    private String qualifyingQuestionId;

    protected Builder() {}

    public String getQualifyingQuestionId() {
      return qualifyingQuestionId;
    }

    public Builder setQualifyingQuestionId(String qualifyingQuestionId) {
      this.qualifyingQuestionId = qualifyingQuestionId;
      return this;
    }

    private Builder(QualifyingQuestionName qualifyingQuestionName) {
      this.qualifyingQuestionId = qualifyingQuestionName.qualifyingQuestionId;
    }

    public QualifyingQuestionName build() {
      return new QualifyingQuestionName(this);
    }
  }
}
