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

