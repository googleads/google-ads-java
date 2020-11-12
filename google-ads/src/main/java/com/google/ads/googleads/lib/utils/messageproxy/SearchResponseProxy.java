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

package com.google.ads.googleads.lib.utils.messageproxy;

import com.google.protobuf.Message;
import java.util.List;

/**
 * Provides an interface for handling SearchGoogleAdsStreamResponse objects independently of the API
 * version. This is useful to e.g. update fields in the message without having to handle all API
 * version cases.
 */
public interface SearchResponseProxy<MsgT extends Message, BuilderT extends Message.Builder>
    extends CustomerUserAccessMessageProxy<MsgT, BuilderT>,
        ChangeEventMessageProxy<MsgT, BuilderT> {

  List<String> getFieldMaskPaths(MsgT message);
}
