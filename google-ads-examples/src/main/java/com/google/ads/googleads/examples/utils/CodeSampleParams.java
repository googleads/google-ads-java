// Copyright 2018 Google LLC
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

import com.beust.jcommander.JCommander;
import com.beust.jcommander.Parameter;
import java.io.PrintStream;

/**
 * A base class for all code examples to handle command line argument parsing and usage printing.
 */
public abstract class CodeSampleParams {

  @Parameter(names = "--help", help = true)
  protected boolean help = false;

  public boolean parseArguments(String[] args) {
    return parseArguments(args, Runtime.getRuntime(), System.err);
  }

  boolean parseArguments(String[] args, Runtime runtime, PrintStream usageStream) {
    JCommander jc = new JCommander(this);

    if (args.length == 0) {
      return false;
    }

    jc.parse(args);

    if (help) {
      StringBuilder usageOut = new StringBuilder();
      jc.usage(usageOut);
      usageStream.println(usageOut.toString());
      runtime.exit(0);
    }

    return true;
  }
}
