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

