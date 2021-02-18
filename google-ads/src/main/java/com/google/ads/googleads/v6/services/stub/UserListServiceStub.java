/*
 * Copyright 2020 Google LLC
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

package com.google.ads.googleads.v6.services.stub;

import com.google.ads.googleads.v6.resources.UserList;
import com.google.ads.googleads.v6.services.GetUserListRequest;
import com.google.ads.googleads.v6.services.MutateUserListsRequest;
import com.google.ads.googleads.v6.services.MutateUserListsResponse;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.UnaryCallable;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Base stub class for the UserListService service API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by gapic-generator-java")
public abstract class UserListServiceStub implements BackgroundResource {

  public UnaryCallable<GetUserListRequest, UserList> getUserListCallable() {
    throw new UnsupportedOperationException("Not implemented: getUserListCallable()");
  }

  public UnaryCallable<MutateUserListsRequest, MutateUserListsResponse> mutateUserListsCallable() {
    throw new UnsupportedOperationException("Not implemented: mutateUserListsCallable()");
  }

  @Override
  public abstract void close();
}
