// Copyright 2021 Google LLC
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.ads.googleads.examples.utils;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.number.OrderingComparison.greaterThan;
import static org.junit.Assert.assertEquals;

import com.beust.jcommander.Parameter;
import com.google.common.collect.ImmutableList;
import com.google.common.reflect.ClassPath;
import com.google.common.reflect.ClassPath.ClassInfo;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class ValidateParametersTest {

  @Test
  public void ensure_no_final_parameters() throws IOException {
    // Avoids silent failures from JCommander when parsing flags if the field is final.
    Set<Field> annotatedFields =
        ClassPath.from(getClass().getClassLoader())
            .getTopLevelClassesRecursive("com.google.ads.googleads.examples")
            .stream()
            .map(ClassInfo::load)
            .flatMap(
                c ->
                    ImmutableList.<Class<?>>builder()
                        .add(c)
                        .addAll(Arrays.asList(c.getDeclaredClasses()))
                        .build()
                        .stream())
            .flatMap(c -> Arrays.stream(c.getDeclaredFields()))
            .filter(f -> f.getAnnotation(Parameter.class) != null)
            .collect(Collectors.toSet());

    // Asserts that the above discovered at least 300 annotated fields. Examples contain closer to
    // 400 such fields as of the writing of this test, but this leaves some room in case we decide
    // to remove some examples.
    assertThat("parameters", annotatedFields.size(), is(greaterThan(300)));
    for (Field field : annotatedFields) {
      assertEquals("field is final: " + field, 0, field.getModifiers() & Modifier.FINAL);
    }
  }
}
