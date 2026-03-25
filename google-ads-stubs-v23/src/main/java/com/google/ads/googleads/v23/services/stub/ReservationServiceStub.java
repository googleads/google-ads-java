/*
 * Copyright 2026 Google LLC
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

package com.google.ads.googleads.v23.services.stub;

import com.google.ads.googleads.v23.services.BookCampaignsRequest;
import com.google.ads.googleads.v23.services.BookCampaignsResponse;
import com.google.ads.googleads.v23.services.QuoteCampaignsRequest;
import com.google.ads.googleads.v23.services.QuoteCampaignsResponse;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.UnaryCallable;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Base stub class for the ReservationService service API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by gapic-generator-java")
public abstract class ReservationServiceStub implements BackgroundResource {

  public UnaryCallable<QuoteCampaignsRequest, QuoteCampaignsResponse> quoteCampaignsCallable() {
    throw new UnsupportedOperationException("Not implemented: quoteCampaignsCallable()");
  }

  public UnaryCallable<BookCampaignsRequest, BookCampaignsResponse> bookCampaignsCallable() {
    throw new UnsupportedOperationException("Not implemented: bookCampaignsCallable()");
  }

  @Override
  public abstract void close();
}
