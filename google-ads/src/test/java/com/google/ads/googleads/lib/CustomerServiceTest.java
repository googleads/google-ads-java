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

package com.google.ads.googleads.lib;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import com.google.ads.googleads.v4.services.CustomerServiceClient;
import com.google.ads.googleads.v4.services.ListAccessibleCustomersRequest;
import com.google.ads.googleads.v4.services.ListAccessibleCustomersResponse;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import org.junit.Test;

public class CustomerServiceTest {

  /**
   * Currently the proto generators do not output a generated synchronous convenience method and
   * this needs to be manually added after regenerating. This test ensures that the method is
   * present.
   *
   * @throws NoSuchMethodException
   */
  @Test
  public void customerService_listAccessibleCustomers_hasConvenienceMethod()
      throws NoSuchMethodException {
    Method method =
        CustomerServiceClient.class.getMethod(
            "listAccessibleCustomers", ListAccessibleCustomersRequest.class);
    assertEquals(ListAccessibleCustomersResponse.class, method.getReturnType());
    assertFalse(Modifier.isStatic(method.getModifiers()));
  }
}
