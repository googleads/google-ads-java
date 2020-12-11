// Copyright 2020 Google LLC
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

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

/** A helper class for all code examples. */
public abstract class CodeSampleHelper {

  /** The date format used for printing. */
  private static final DateTimeFormatter format =
      DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSSZZ");

  /** The shorter date format used for printing. */
  private static final DateTimeFormatter shortFormat =
      DateTimeFormatter.ofPattern("yyMMddHHmmssSSS");

  /**
   * Generates a printable string for the current date and time in local time zone.
   *
   * @return the result string.
   */
  public static String getPrintableDatetime() {
    return ZonedDateTime.now().format(format);
  }

  /**
   * Generates a short printable string for the current date and time in local time zone.
   *
   * @return the result string.
   */
  public static String getShortPrintableDatetime() {
    return ZonedDateTime.now().format(shortFormat);
  }
}
