// Copyright 2019 Google LLC
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

package com.google.ads.googleads.lib.catalog.annotation;

import com.google.api.gax.rpc.ClientSettings;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Declares a factory method for building service clients. The return type of the method should be
 * the service client class. The service client must support a method create(ClientSettings).
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface ServiceClientDescriptor {

  /**
   * Specifies the instance of ClientSettings to use with the service client returned by the
   * annotated method.
   *
   * The instance must support a static method newBuilder() which returns ClientSettings.Builder.
   */
  Class<? extends ClientSettings> settingsClass();
}
