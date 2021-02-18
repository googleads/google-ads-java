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

import com.google.ads.googleads.v6.resources.AccountBudgetProposal;
import com.google.ads.googleads.v6.services.GetAccountBudgetProposalRequest;
import com.google.ads.googleads.v6.services.MutateAccountBudgetProposalRequest;
import com.google.ads.googleads.v6.services.MutateAccountBudgetProposalResponse;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.UnaryCallable;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Base stub class for the AccountBudgetProposalService service API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by gapic-generator-java")
public abstract class AccountBudgetProposalServiceStub implements BackgroundResource {

  public UnaryCallable<GetAccountBudgetProposalRequest, AccountBudgetProposal>
      getAccountBudgetProposalCallable() {
    throw new UnsupportedOperationException("Not implemented: getAccountBudgetProposalCallable()");
  }

  public UnaryCallable<MutateAccountBudgetProposalRequest, MutateAccountBudgetProposalResponse>
      mutateAccountBudgetProposalCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: mutateAccountBudgetProposalCallable()");
  }

  @Override
  public abstract void close();
}
