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

package com.google.ads.googleads.annotations.impl.generators;

import com.squareup.javapoet.ClassName;
import com.squareup.javapoet.TypeSpec;
import java.util.Set;
import javax.annotation.processing.Filer;
import javax.annotation.processing.Messager;

/** Generates an implementation of FeedMessageProxy. */
public class FeedMessageProxyGenerator extends AbstractMessageProxyGenerator {

  private static final int MIN_VERSION_FOR_FEED = 1;

  public FeedMessageProxyGenerator(Set<Integer> versions, Messager messager, Filer filer) {
    super(versions, messager, filer);
  }

  @Override
  protected void generate(
      TypeSpec.Builder typeBuilder,
      int version,
      ClassName proxiedClassName,
      ClassName proxiedBuilderClassName) {
    generateStringSetter(
        typeBuilder,
        proxiedBuilderClassName,
        "setPlacesLocationFeedDataEmailAddressIfPresent",
        "builder.hasPlacesLocationFeedData()"
            + " && builder.getPlacesLocationFeedData().hasEmailAddress()",
        "builder.getPlacesLocationFeedDataBuilder().setEmailAddress(toSet)",
        version,
        MIN_VERSION_FOR_FEED,
        MIN_VERSION_FOR_FEED_PLACES_LOCATION_DATA_EMAIL);
  }

  @Override
  protected ClassName getProxyInterfaceRawName() {
    return ClassName.get(MESSAGE_PROXY_PACKAGE_NAME, "FeedMessageProxy");
  }

  @Override
  protected ClassName getProxiedClassName(int version) {
    return ClassName.get(getResourcesPackage(version), "Feed");
  }
}
