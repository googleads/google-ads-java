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

package com.google.ads.googleads.lib.reflect;

import static org.junit.Assert.assertEquals;

import com.google.ads.googleads.test.Bar;
import com.google.ads.googleads.test.Foo;
import com.google.common.collect.ImmutableList;
import com.google.common.io.Resources;
import com.google.protobuf.Message;
import com.google.protobuf.TextFormat;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.List;
import org.junit.Test;

public class ReflectionFieldAccessorTest {

  @Test
  public void setValueIfPresent_accessesRepeatedMessage() throws IOException {
    runSetValueIfPresent("accessesRepeatedMessage", Foo.class, "bars.primitive_string");
  }

  @Test
  public void setValueIfPresent_accessesRepeatedPrimitive() throws IOException {
    runSetValueIfPresent("accessesRepeatedPrimitive", Foo.class, "bars.repeated_primitive_string");
  }

  @Test
  public void setValueIfPresent_accessesUnaryPrimitive() throws IOException {
    runSetValueIfPresent("accessesUnaryPrimitive", Bar.class, "primitive_string");
  }

  @Test
  public void setValueIfPresent_recursesThroughRepeatedMessages() throws IOException {
    runSetValueIfPresent("recursesThroughRepeatedMessages", Foo.class, "bars.primitive_string");
  }

  @Test
  public void getValue_accessesRepeatedMessage() throws IOException {
    runGetValue(
        "accessesRepeatedMessage",
        Foo.class,
        "bars.primitive_string",
        ImmutableList.of("abc", "abc", "abc"));
  }

  @Test
  public void getValue_accessesRepeatedPrimitive() throws IOException {
    runGetValue(
        "accessesRepeatedPrimitive",
        Foo.class,
        "bars.repeated_primitive_string",
        ImmutableList.of("test", "test", "test"));
  }

  @Test
  public void getValue_accessesUnaryPrimitive() throws IOException {
    runGetValue("accessesUnaryPrimitive", Bar.class, "primitive_string", ImmutableList.of("test"));
  }

  @Test
  public void getValue_recursesThroughRepeatedMessages() throws IOException {
    runGetValue(
        "recursesThroughRepeatedMessages",
        Foo.class,
        "bars.primitive_string",
        ImmutableList.of("test", "test again"));
  }

  private void runSetValueIfPresent(String name, Class targetClass, String path)
      throws IOException {
    Message expected = loadTextPb(name + "_expected.textpb", targetClass);
    Message actual =
        new ReflectionFieldAccessor(path)
            .setFieldIfPresent(loadTextPb(name + "_input.textpb", targetClass), "REDACTED");
    assertEquals(expected, actual);
  }

  private void runGetValue(String name, Class targetClass, String field, List<Object> expected)
      throws IOException {
    Message input = loadTextPb(name + "_input.textpb", targetClass);
    Object actual = new ReflectionFieldAccessor(field).getValues(input);
    assertEquals(expected, actual);
  }

  private Message loadTextPb(String resourceName, Class targetClass) throws IOException {
    return TextFormat.parse(
        Resources.toString(
            getClass().getResource("/com/google/ads/googleads/lib/reflect/" + resourceName),
            Charset.forName("UTF-8")),
        targetClass);
  }
}
