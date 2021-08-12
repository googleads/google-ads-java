// Copyright 2021 Google LLC
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     https://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.ads.googleads.lib.utils;

import com.google.ads.googleads.test.lib.utils.FieldValue;
import com.google.ads.googleads.test.lib.utils.TestCase;
import com.google.ads.googleads.test.lib.utils.TestSuite;
import com.google.common.base.Charsets;
import com.google.common.truth.Truth;
import com.google.protobuf.Descriptors.FieldDescriptor;
import com.google.protobuf.FieldMask;
import com.google.protobuf.TextFormat;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 * Tests the {@link FieldMasks} utility. This is a common suit of tests shared by all client
 * libraries for the Google Ads API.
 */
@RunWith(Parameterized.class)
public class FieldMasksStandardizedTests {
  private final TestCase testCase;

  public FieldMasksStandardizedTests(String description, TestCase testCase) {
    this.testCase = testCase;
  }

  @Parameters(name = "{index}: {0}")
  public static Collection<Object[]> data() throws IOException {
    InputStream stream =
        FieldMasksParameterizedTest.class.getResourceAsStream(
            "/testdata/field_masks_tests.textproto");
    Readable readable = new InputStreamReader(stream, Charsets.UTF_8);

    TestSuite.Builder builder = TestSuite.newBuilder();
    TextFormat.merge(readable, builder);
    TestSuite testSuite = builder.build();

    List<Object[]> result = new ArrayList<>();
    for (TestCase testCase : testSuite.getTestCasesList()) {
      result.add(new Object[] {testCase.getDescription(), testCase});
    }
    return result;
  }

  @Test
  public void testCompare() {
    FieldMask actual =
        FieldMasks.compare(testCase.getOriginalResource(), testCase.getModifiedResource());
    Truth.assertThat(testCase.getExpectedMask()).isEqualTo(actual);
  }

  @Test
  public void testAllSetFieldsOf() {
    FieldMask allSetFieldsOf = FieldMasks.allSetFieldsOf(testCase.getModifiedResource());
    Truth.assertThat(testCase.getAllSetFieldsMask()).isEqualTo(allSetFieldsOf);
  }

  @Test
  public void testGetFieldValue() {
    for (Map.Entry<String, FieldValue> entry : testCase.getExpectedFieldValuesMap().entrySet()) {
      String fieldPath = entry.getKey();
      FieldValue fieldValue = entry.getValue();

      for (FieldDescriptor descriptor : fieldValue.getDescriptorForType().getFields()) {
        if (descriptor.isRepeated()) {
          List expectedValues = (List) fieldValue.getField(descriptor);
          if (!expectedValues.isEmpty()) {
            List actualValues = FieldMasks.getFieldValue(fieldPath, testCase.getModifiedResource());

            Truth.assertThat(expectedValues).isEqualTo(actualValues);
            break;
          }
        } else if (fieldValue.hasField(descriptor)) {
          Object expectedValue = fieldValue.getField(descriptor);
          List<Object> actualValues =
              FieldMasks.getFieldValue(fieldPath, testCase.getModifiedResource());
          if (!actualValues.isEmpty()) {
            Truth.assertThat(expectedValue).isEqualTo(actualValues.get(0));
          }

          break;
        }
      }
    }
  }
}
