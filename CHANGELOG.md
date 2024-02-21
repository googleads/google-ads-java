30.0.0 - 2024-02-23
-------------------
- Add support and examples for Google Ads API v16.
- Update to version 3.25.0 of
  `com.google.cloud:google-cloud-shared-dependencies`.

29.0.0 - 2024-01-16
-------------------
- Remove support for v13 of Google Ads API.

28.0.0 - 2023-10-19
-------------------
- Add support and examples for Google Ads API v15.

27.0.0 - 2023-09-21
-------------------
- Remove support for v12 of Google Ads API.
- Update to version 3.14.0 of
  `com.google.cloud:google-cloud-shared-dependencies`.

26.1.0 - 2023-08-10
-------------------
- Add support and examples for Google Ads API v14.1.
- Modify the following examples in the `planning` package to demonstrate how
  to use planning services without first creating a keyword plan:
  - Remove `AddKeywordPlan`.
  - Add `GenerateForecastMetrics`.
  - Add `GenerateHistoricalMetrics`.

26.0.0 - 2023-06-09
-------------------
- Add support and examples for Google Ads API v14.
- Update to version 3.11.0 of
  `com.google.cloud:google-cloud-shared-dependencies`.

25.0.0 - 2023-04-27
-------------------
- Add support and examples for Google Ads API v13.1.
- Remove sitelinks example that uses legacy feed features. Use
  `AddSitelinksUsingAssets` instead. See
  https://developers.google.com/google-ads/api/docs/extensions/assets/migrating-extensions
  for details.

24.0.0 - 2023-03-17
-------------------
- Remove support for v11 of Google Ads API.
- Add AddPerformanceMaxForTravelGoalsCampaign example.
- Remove custom Sonatype client in favor of using `--no-parallel`.
- Modify CreateExperiment example to demonstrate updated best practices
- Remove restatement currency code and value from UploadConversionEnhancement
  example.

23.0.0 - 2023-01-22
-------------------
- Add support and examples for Google Ads API v13.0.
- Remove support for v10 of Google Ads API.
- Update to version 3.1.2 of
  `com.google.cloud:google-cloud-shared-dependencies`.
- Automate allstar config updates.
- Only create Sonatype staging URL during publishing when needed.

22.0.0 - 2022-11-03
-------------------
- Add support and examples for Google Ads API v12.0.
- Upgrade protobuf-java and protobuf-java-util dependencies to 3.19.6.
- Remove examples demonstrating deprecated (or soon to be deprecated) features.
  - AddDynamicPageFeed
  - AddLocalCampaign
  - AddShoppingSmartAd
  - AddSmartDisplayAd
- Remove examples demonstrating migration from the AdWords API.

21.0.0 - 2022-08-30
-------------------
- Add support and examples for Google Ads API v11.1.
- Update to version 2.8.0 of
  `com.google.cloud:google-cloud-shared-dependencies`.
- Update to version 1.5.3 of `com.google.auth:google-auth-library-credentials`.
- Replace ETA examples with RSA examples.
- Add Go and Bouncy Castle licenses to THIRD-PARTY-LICENSES.txt and allowed
  third party licenses.

20.0.0 - 2022-07-19
-------------------
- Remove support for v9 of Google Ads API.
- Add @Internal annotation for basePackage in Gradle (#647).
- Add protobuf version to the API client header.
- Rename GetArtifactMetadata to SearchForGoogleAdsFields and make the example
  more flexible and useful.
- Remove references to wrapper types.

19.0.0 - 2022-06-15
-------------------
- Add support and examples for Google Ads API v11.0.
- Update FieldMasks utility to better handle empty message fields.
- Update AddSmartCampaign example for the new features in v11.0.
- Add DetectAndApplyRecommendations example.
- Add CreateExperiment example, replacing CreateExperimentCampaign and
  GraduateCampaignExperiment.

18.0.0 - 2022-05-02
-------------------
- Add support for v10_1 of Google Ads API.
- Remove support for v8 of Google Ads API.
- Combine two examples in authentication/ into GenerateUserCredentials,
  since [OAuth OOB](https://developers.googleblog.com/2022/02/making-oauth-flows-safer.html?m=1#disallowed-oob)
  is being deprecated.
- Remove artifacts related to v7 of the API
  which was removed in the release 17.0.0 (#571, #600).
- Exclude projects defined in google-ads directory
  from third_party directory (#599).
- Add code examples:
  - AddPerformanceMaxProductListingGroupTree
  - NavigateSearchResultPagesCachingTokens
- Update code examples:
  - AddCampaigns
  - AddCustomerMatchUserList
  - AddDynamicRemarketingAsset
  - AddPerformanceMaxCampaign
  - AddPerformanceMaxRetailCampaign
  - GetChangeDetails
  - UploadOfflineConversion

17.0.1 - 2022-02-16
-------------------
- Fix #565 to properly set the max inbound message size and metadata size.

17.0.0 - 2022-02-10
-------------------
- Add support and examples for Google Ads API v10.0.
- Remove support for Google Ads API v7.
- Remove dependency on `io.netty:netty-tcnative-boringssl-static` (#557, #440).
- Fix #174 to pass new login customer ID header after
  `GoogleAdsClient.toBuilder().setLoginCustomerId().build()`.
- Update examples using image asset and media bundle to include asset names.
- Add asset names to AddDisplayUploadAd and UploadImageAsset.
- Add call ads examples.
- Update `GetKeywords` example to demonstrate `omit_unselected_resource_names`
  usage.


16.0.3 - 2022-01-10
-------------------
- Fix #543 to correctly classify the `google-cloud-shared-dependencies` dependency.
- Split project into multiple sub-modules to improve build times and separate
  generated code from core library code. No changes are required for projects
  with a dependency on the `google-ads` artifact.
- Customize the client used to upload artifacts to Sonatype Nexus during library releases (#544).

16.0.2 - 2021-12-15
-------------------
- Fix #525 shadow jar replaces main jar.
- Correctly classify api/implementation dependencies to expose the correct developer surface (#536).
- Upgraded to log4j 2.16.0 in examples.

16.0.1 - 2021-11-30
-------------------
- Fix #507 compatibility issue with buck.build.
- Remove maven build files. The library is now built with gradle.

16.0.0 - 2021-11-11
-------------------
- Added support and examples for Google Ads API v9.0.
- Various improvements to Gradle build config.

15.0.0 - 2021-08-12
-------------------
- Added and updated examples for Google Ads API v8.1.
- Removed support for Google Ads API v6.0.
- Fixed bugs and added tests for the FieldMasks utility.
- Fixed issues with third_party directory generation.

14.0.0 - 2021-07-07
-------------------
- Added and updated examples for Google Ads API v8.0.
- Removed support for Google Ads API v5.0.
- Moved generateThirdPartyDirectory execution out of configure phase (#444).
- Added sonatype publish for shadow jar (#445).
- Add required artifacts for central repo (#446).

13.0.0 - 2021-06-17
-------------------
- Added support and examples for Google Ads API v8.0.
- Added functionality to generate shadow jar and third party license tracking
  in gradle build.

12.0.0 - 2021-05-04
-------------------
- Added support and examples for Google Ads API v7.0.
- Added support for building with Gradle. This improves build times
  substantially, particularly for incremental builds. Also makes it easier to
  run examples:
    ./gradlew google-ads-examples:runExample --example="basicoperations.GetCampaigns"
- Removed support for Google Ads API v4.0.

11.0.0 - 2021-02-18
-------------------
- Added support and examples for Google Ads API v6.1.
- Removed support for Google Ads API v3.0.
- Fixed FieldMasks.getFieldValue() to support repeated fields (breaking change).
- Updated personal information log masking to support new fields.

10.0.0 - 2020-11-11
-------------------
- Added support and examples for Google Ads API v6.0.
- Updated logging to scrub personal information (email addresses) from logs.
- Ensure that GoogleAdsFailure is decoded for exceptions on server streaming 
  calls (#332).
- Fix FieldMasks util to return correct result for optional fields (#344).
- Removed reflection based catalog in favour of generated code.

9.0.0 - 2020-09-01
------------------
- Added support and examples for Google Ads API v5_0.
- Switched internal catalog implementation default to use annotation processor.

8.0.0 - 2020-07-31
------------------
- Removed v1 from the library.
- Added example demonstrating how to add a geo target to an extension feed item.

7.0.0 - 2020-07-23
------------------
- Generated library with a new build system. A side effect of that change is
  that certain overloaded method signatures containing boolean flags for making
  requests have been removed.

6.0.0 - 2020-07-17
------------------
- Added support for Google Ads API v4_0.
- Moved documentation. Now hosted at:
  https://developers.google.com/google-ads/api/docs/client-libs/java.
- Added examples demonstrating:
  - Drafts and experiments.
  - Parallel report download.
  - CPC bid simulations.
  - Programmatic library configuration.
  - Keyword policy violation handling.
  - Updating expanded text ads.
- Removed vulnerable dependency on log4j 1.2.16.
- Added support for linked-customer-id header. This is needed for an extremely
  narrow authentication use-case. Any developer who requires this to be set
  will be advised. It is otherwise safe to ignore.

5.1.0 - 2020-05-06
------------------
- Added support for Google Ads API v3_1.
- Fixed missing entity from ResourceNames for Ad.
- Added various examples.

5.0.0 - 2020-03-04
------------------
- Added support for Google Ads API v3_0.
- Added example demonstrating how to add demographic targeting criteria.
- Added example demonstrating how to upload an image asset.
- Added example demonstrating how to add a price extension.
- Added several examples demontrating remarketing funcionality.
- Updated issues templates.
- Updated CONTRIBUTING.MD.

4.4.1 - 2020-01-22
------------------
- Set a default value for `enableGeneratedCatalog` property,
  see #224.

4.4.0 - 2020-01-14
------------------
- Switch to Gax 1.50.1 and gRPC 1.25.0.
- Various updates to code examples.
- Fix resource names utility for payment accounts.

4.3.0 - 2019-12-16
------------------
- Added option to use generated API Catalog.
- Added example for AddSiteLinks.
- Changed default status of AdGroupAd to ENABLED in AddHotelAd example.
- Added example for AddHotelCalloutExtension.
- Added example for HandleRateExceededError.

4.2.0 - 2019-09-27
------------------
- Added support for Google Ads API v2_2.

4.1.0 - 2019-08-15
------------------
- Added support for Google Ads API v2_1.
- Exposed the TransportChanelProvider as package private.

4.0.0 - 2019-07-01
------------------
- Added support for Google Ads API v2_0.
- Fixed resource name creation for ad group criteria, see #141.

3.0.1 - 2019-06-10
------------------
- Increased max inbound message size to 64MB, see #136.
- Increased max inbound header (i.e. metadata) size to 16MB, see #132.
- Increased default deadline to 60 mins and added automatic retry support for
  GoogleAdsService.search(), see #130.
- Added support for GoogleAdsService.mutate() to ErrorUtils, see #126.
- Fixed bug in FieldMasks utility, see #116.

3.0.0 - 2019-05-24
------------------
- Added support for Google Ads API v1_3.
- Refactored ErrorUtils to extract base class. Callers need update to use ErrorUtils.getInstance()
rather than static methods.

2.0.0 - 2019-05-01
------------------
- Added support for Google Ads API v1_2.
- Removed support for Google Ads API v0.

1.1.0 - 2019-03-29
------------------
- Added support for Google Ads API v1_1.

1.0.1 - 2019-03-14
------------------
- Added support for equals, hashCode and toString on proxy instances.
  Fixes [issue #70](https://github.com/googleads/google-ads-java/issues/70).

1.0.0 - 2019-03-07
------------------
Added support and examples for Google Ads API v0_1.

- Added support for multiple versions in the client library.
- Added example for HandlePartialFailure.
- Updated ResourceNames.java format to use '~' for v1.

0.7.0 - 2019-02-01
------------------
Added support and examples for Google Ads API v0_7.

- Added support for request level logging.
- Added GetHotelAdsPerformance example.
- Updated GetKeywordStats example with segments prefix.

0.6.0 - 2018-12-03
------------------
Added support and examples for Google Ads API v0_6.

- Added support for loginCustomerId header. This must be specified when
  authenticating as a manager account.
- Added example showing how to create a Smart Shopping Campaign.
- Updated example showing how to apply recommendations with partial failure.
- Updated example showing how to add proximity criteria to campaigns.
- Updated example showing how to retrieve geo target constants for a country
  code.

0.5.0 - 2018-11-02
------------------
Added support and examples for Google Ads API v0_5.

- Added example showing how to get account budgets.
- Added example showing how to get location criteria IDs for an address.
- Updated campaign targeting criteria example to use location criteria IDs.
- Updated GetBillingSetup example to use PaymentAccountInfo object.

0.4.0 - 2018-09-25
------------------
Added support and examples for Google Ads API v0_4.

- Added examples showing how to add and get account budget proposals.
- Added examples showing how to get and remove billing setups.
- Added an example showing how to retrieve all disapproved ads in a campaign.
- Added an example showing how to add a conversion action.
- Added an example showing how to create a standard shopping campaign, a
  shopping product ad group, and a shopping product ad.
- Added an example showing how to add a shopping listing group tree to a
  shopping ad group.

0.3.2 - 2018-08-29
------------------
Added support and examples for Google Ads API v0_3.

- Updated the minimum JRE version to 1.8. This keeps the JRE version consistent
  with the AdWords API Java library, where the min JRE changed to 1.8 in version
  [3.16.0](https://github.com/googleads/googleads-java-lib/releases/tag/3.16.0).
- Updated GetArtifactMetadata to quote the name param value.
- Added examples showing how to add and get ad group bid modifiers.
- Added an example showing how to create and attach shared keyword sets.
- Added an example showing how to remove shared set criteria.
- Updated hotel ad group bid modifier example with v0_3 criteria changes.
- Added AddCampaignBidModifier example.

0.3.1 - 2018-08-08
------------------

- Updated FieldMasks utility to properly handle wrapper types.

0.3.0 - 2018-06-18
------------------

Added support and examples for Google Ads API v0_2.

- Added PercentCpc bidding strategy.
- Updated Hotel Ads example to use PercentCpc.

0.2.0 - 2018-06-07
------------------

Added support and examples for Google Ads API v0_1.

- Added support for Hotel Ads and Recommendations.
- Added AddHotelAd and AddHotelAdGroupBidModifiers examples.
- Added examples for the new `RecommendationService`.

0.1.0 - 2018-04-23
------------------

Initial release for Google Ads API v0.

