// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v5/enums/click_type.proto

package com.google.ads.googleads.v5.enums;

/**
 * <pre>
 * Container for enumeration of Google Ads click types.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v5.enums.ClickTypeEnum}
 */
public final class ClickTypeEnum extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v5.enums.ClickTypeEnum)
    ClickTypeEnumOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ClickTypeEnum.newBuilder() to construct.
  private ClickTypeEnum(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ClickTypeEnum() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ClickTypeEnum();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ClickTypeEnum(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v5.enums.ClickTypeProto.internal_static_google_ads_googleads_v5_enums_ClickTypeEnum_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v5.enums.ClickTypeProto.internal_static_google_ads_googleads_v5_enums_ClickTypeEnum_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v5.enums.ClickTypeEnum.class, com.google.ads.googleads.v5.enums.ClickTypeEnum.Builder.class);
  }

  /**
   * <pre>
   * Enumerates Google Ads click types.
   * </pre>
   *
   * Protobuf enum {@code google.ads.googleads.v5.enums.ClickTypeEnum.ClickType}
   */
  public enum ClickType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * Not specified.
     * </pre>
     *
     * <code>UNSPECIFIED = 0;</code>
     */
    UNSPECIFIED(0),
    /**
     * <pre>
     * The value is unknown in this version.
     * </pre>
     *
     * <code>UNKNOWN = 1;</code>
     */
    UNKNOWN(1),
    /**
     * <pre>
     * App engagement ad deep link.
     * </pre>
     *
     * <code>APP_DEEPLINK = 2;</code>
     */
    APP_DEEPLINK(2),
    /**
     * <pre>
     * Breadcrumbs.
     * </pre>
     *
     * <code>BREADCRUMBS = 3;</code>
     */
    BREADCRUMBS(3),
    /**
     * <pre>
     * Broadband Plan.
     * </pre>
     *
     * <code>BROADBAND_PLAN = 4;</code>
     */
    BROADBAND_PLAN(4),
    /**
     * <pre>
     * Manually dialed phone calls.
     * </pre>
     *
     * <code>CALL_TRACKING = 5;</code>
     */
    CALL_TRACKING(5),
    /**
     * <pre>
     * Phone calls.
     * </pre>
     *
     * <code>CALLS = 6;</code>
     */
    CALLS(6),
    /**
     * <pre>
     * Click on engagement ad.
     * </pre>
     *
     * <code>CLICK_ON_ENGAGEMENT_AD = 7;</code>
     */
    CLICK_ON_ENGAGEMENT_AD(7),
    /**
     * <pre>
     * Driving direction.
     * </pre>
     *
     * <code>GET_DIRECTIONS = 8;</code>
     */
    GET_DIRECTIONS(8),
    /**
     * <pre>
     * Get location details.
     * </pre>
     *
     * <code>LOCATION_EXPANSION = 9;</code>
     */
    LOCATION_EXPANSION(9),
    /**
     * <pre>
     * Call.
     * </pre>
     *
     * <code>LOCATION_FORMAT_CALL = 10;</code>
     */
    LOCATION_FORMAT_CALL(10),
    /**
     * <pre>
     * Directions.
     * </pre>
     *
     * <code>LOCATION_FORMAT_DIRECTIONS = 11;</code>
     */
    LOCATION_FORMAT_DIRECTIONS(11),
    /**
     * <pre>
     * Image(s).
     * </pre>
     *
     * <code>LOCATION_FORMAT_IMAGE = 12;</code>
     */
    LOCATION_FORMAT_IMAGE(12),
    /**
     * <pre>
     * Go to landing page.
     * </pre>
     *
     * <code>LOCATION_FORMAT_LANDING_PAGE = 13;</code>
     */
    LOCATION_FORMAT_LANDING_PAGE(13),
    /**
     * <pre>
     * Map.
     * </pre>
     *
     * <code>LOCATION_FORMAT_MAP = 14;</code>
     */
    LOCATION_FORMAT_MAP(14),
    /**
     * <pre>
     * Go to store info.
     * </pre>
     *
     * <code>LOCATION_FORMAT_STORE_INFO = 15;</code>
     */
    LOCATION_FORMAT_STORE_INFO(15),
    /**
     * <pre>
     * Text.
     * </pre>
     *
     * <code>LOCATION_FORMAT_TEXT = 16;</code>
     */
    LOCATION_FORMAT_TEXT(16),
    /**
     * <pre>
     * Mobile phone calls.
     * </pre>
     *
     * <code>MOBILE_CALL_TRACKING = 17;</code>
     */
    MOBILE_CALL_TRACKING(17),
    /**
     * <pre>
     * Print offer.
     * </pre>
     *
     * <code>OFFER_PRINTS = 18;</code>
     */
    OFFER_PRINTS(18),
    /**
     * <pre>
     * Other.
     * </pre>
     *
     * <code>OTHER = 19;</code>
     */
    OTHER(19),
    /**
     * <pre>
     * Product plusbox offer.
     * </pre>
     *
     * <code>PRODUCT_EXTENSION_CLICKS = 20;</code>
     */
    PRODUCT_EXTENSION_CLICKS(20),
    /**
     * <pre>
     * Shopping - Product - Online.
     * </pre>
     *
     * <code>PRODUCT_LISTING_AD_CLICKS = 21;</code>
     */
    PRODUCT_LISTING_AD_CLICKS(21),
    /**
     * <pre>
     * Sitelink.
     * </pre>
     *
     * <code>SITELINKS = 22;</code>
     */
    SITELINKS(22),
    /**
     * <pre>
     * Show nearby locations.
     * </pre>
     *
     * <code>STORE_LOCATOR = 23;</code>
     */
    STORE_LOCATOR(23),
    /**
     * <pre>
     * Headline.
     * </pre>
     *
     * <code>URL_CLICKS = 25;</code>
     */
    URL_CLICKS(25),
    /**
     * <pre>
     * App store.
     * </pre>
     *
     * <code>VIDEO_APP_STORE_CLICKS = 26;</code>
     */
    VIDEO_APP_STORE_CLICKS(26),
    /**
     * <pre>
     * Call-to-Action overlay.
     * </pre>
     *
     * <code>VIDEO_CALL_TO_ACTION_CLICKS = 27;</code>
     */
    VIDEO_CALL_TO_ACTION_CLICKS(27),
    /**
     * <pre>
     * Cards.
     * </pre>
     *
     * <code>VIDEO_CARD_ACTION_HEADLINE_CLICKS = 28;</code>
     */
    VIDEO_CARD_ACTION_HEADLINE_CLICKS(28),
    /**
     * <pre>
     * End cap.
     * </pre>
     *
     * <code>VIDEO_END_CAP_CLICKS = 29;</code>
     */
    VIDEO_END_CAP_CLICKS(29),
    /**
     * <pre>
     * Website.
     * </pre>
     *
     * <code>VIDEO_WEBSITE_CLICKS = 30;</code>
     */
    VIDEO_WEBSITE_CLICKS(30),
    /**
     * <pre>
     * Visual Sitelinks.
     * </pre>
     *
     * <code>VISUAL_SITELINKS = 31;</code>
     */
    VISUAL_SITELINKS(31),
    /**
     * <pre>
     * Wireless Plan.
     * </pre>
     *
     * <code>WIRELESS_PLAN = 32;</code>
     */
    WIRELESS_PLAN(32),
    /**
     * <pre>
     * Shopping - Product - Local.
     * </pre>
     *
     * <code>PRODUCT_LISTING_AD_LOCAL = 33;</code>
     */
    PRODUCT_LISTING_AD_LOCAL(33),
    /**
     * <pre>
     * Shopping - Product - MultiChannel Local.
     * </pre>
     *
     * <code>PRODUCT_LISTING_AD_MULTICHANNEL_LOCAL = 34;</code>
     */
    PRODUCT_LISTING_AD_MULTICHANNEL_LOCAL(34),
    /**
     * <pre>
     * Shopping - Product - MultiChannel Online.
     * </pre>
     *
     * <code>PRODUCT_LISTING_AD_MULTICHANNEL_ONLINE = 35;</code>
     */
    PRODUCT_LISTING_AD_MULTICHANNEL_ONLINE(35),
    /**
     * <pre>
     * Shopping - Product - Coupon.
     * </pre>
     *
     * <code>PRODUCT_LISTING_ADS_COUPON = 36;</code>
     */
    PRODUCT_LISTING_ADS_COUPON(36),
    /**
     * <pre>
     * Shopping - Product - Sell on Google.
     * </pre>
     *
     * <code>PRODUCT_LISTING_AD_TRANSACTABLE = 37;</code>
     */
    PRODUCT_LISTING_AD_TRANSACTABLE(37),
    /**
     * <pre>
     * Shopping - Product - App engagement ad deep link.
     * </pre>
     *
     * <code>PRODUCT_AD_APP_DEEPLINK = 38;</code>
     */
    PRODUCT_AD_APP_DEEPLINK(38),
    /**
     * <pre>
     * Shopping - Showcase - Category.
     * </pre>
     *
     * <code>SHOWCASE_AD_CATEGORY_LINK = 39;</code>
     */
    SHOWCASE_AD_CATEGORY_LINK(39),
    /**
     * <pre>
     * Shopping - Showcase - Local storefront.
     * </pre>
     *
     * <code>SHOWCASE_AD_LOCAL_STOREFRONT_LINK = 40;</code>
     */
    SHOWCASE_AD_LOCAL_STOREFRONT_LINK(40),
    /**
     * <pre>
     * Shopping - Showcase - Online product.
     * </pre>
     *
     * <code>SHOWCASE_AD_ONLINE_PRODUCT_LINK = 42;</code>
     */
    SHOWCASE_AD_ONLINE_PRODUCT_LINK(42),
    /**
     * <pre>
     * Shopping - Showcase - Local product.
     * </pre>
     *
     * <code>SHOWCASE_AD_LOCAL_PRODUCT_LINK = 43;</code>
     */
    SHOWCASE_AD_LOCAL_PRODUCT_LINK(43),
    /**
     * <pre>
     * Promotion Extension.
     * </pre>
     *
     * <code>PROMOTION_EXTENSION = 44;</code>
     */
    PROMOTION_EXTENSION(44),
    /**
     * <pre>
     * Ad Headline.
     * </pre>
     *
     * <code>SWIPEABLE_GALLERY_AD_HEADLINE = 45;</code>
     */
    SWIPEABLE_GALLERY_AD_HEADLINE(45),
    /**
     * <pre>
     * Swipes.
     * </pre>
     *
     * <code>SWIPEABLE_GALLERY_AD_SWIPES = 46;</code>
     */
    SWIPEABLE_GALLERY_AD_SWIPES(46),
    /**
     * <pre>
     * See More.
     * </pre>
     *
     * <code>SWIPEABLE_GALLERY_AD_SEE_MORE = 47;</code>
     */
    SWIPEABLE_GALLERY_AD_SEE_MORE(47),
    /**
     * <pre>
     * Sitelink 1.
     * </pre>
     *
     * <code>SWIPEABLE_GALLERY_AD_SITELINK_ONE = 48;</code>
     */
    SWIPEABLE_GALLERY_AD_SITELINK_ONE(48),
    /**
     * <pre>
     * Sitelink 2.
     * </pre>
     *
     * <code>SWIPEABLE_GALLERY_AD_SITELINK_TWO = 49;</code>
     */
    SWIPEABLE_GALLERY_AD_SITELINK_TWO(49),
    /**
     * <pre>
     * Sitelink 3.
     * </pre>
     *
     * <code>SWIPEABLE_GALLERY_AD_SITELINK_THREE = 50;</code>
     */
    SWIPEABLE_GALLERY_AD_SITELINK_THREE(50),
    /**
     * <pre>
     * Sitelink 4.
     * </pre>
     *
     * <code>SWIPEABLE_GALLERY_AD_SITELINK_FOUR = 51;</code>
     */
    SWIPEABLE_GALLERY_AD_SITELINK_FOUR(51),
    /**
     * <pre>
     * Sitelink 5.
     * </pre>
     *
     * <code>SWIPEABLE_GALLERY_AD_SITELINK_FIVE = 52;</code>
     */
    SWIPEABLE_GALLERY_AD_SITELINK_FIVE(52),
    /**
     * <pre>
     * Hotel price.
     * </pre>
     *
     * <code>HOTEL_PRICE = 53;</code>
     */
    HOTEL_PRICE(53),
    /**
     * <pre>
     * Price Extension.
     * </pre>
     *
     * <code>PRICE_EXTENSION = 54;</code>
     */
    PRICE_EXTENSION(54),
    /**
     * <pre>
     * Book on Google hotel room selection.
     * </pre>
     *
     * <code>HOTEL_BOOK_ON_GOOGLE_ROOM_SELECTION = 55;</code>
     */
    HOTEL_BOOK_ON_GOOGLE_ROOM_SELECTION(55),
    /**
     * <pre>
     * Shopping - Comparison Listing.
     * </pre>
     *
     * <code>SHOPPING_COMPARISON_LISTING = 56;</code>
     */
    SHOPPING_COMPARISON_LISTING(56),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     * Not specified.
     * </pre>
     *
     * <code>UNSPECIFIED = 0;</code>
     */
    public static final int UNSPECIFIED_VALUE = 0;
    /**
     * <pre>
     * The value is unknown in this version.
     * </pre>
     *
     * <code>UNKNOWN = 1;</code>
     */
    public static final int UNKNOWN_VALUE = 1;
    /**
     * <pre>
     * App engagement ad deep link.
     * </pre>
     *
     * <code>APP_DEEPLINK = 2;</code>
     */
    public static final int APP_DEEPLINK_VALUE = 2;
    /**
     * <pre>
     * Breadcrumbs.
     * </pre>
     *
     * <code>BREADCRUMBS = 3;</code>
     */
    public static final int BREADCRUMBS_VALUE = 3;
    /**
     * <pre>
     * Broadband Plan.
     * </pre>
     *
     * <code>BROADBAND_PLAN = 4;</code>
     */
    public static final int BROADBAND_PLAN_VALUE = 4;
    /**
     * <pre>
     * Manually dialed phone calls.
     * </pre>
     *
     * <code>CALL_TRACKING = 5;</code>
     */
    public static final int CALL_TRACKING_VALUE = 5;
    /**
     * <pre>
     * Phone calls.
     * </pre>
     *
     * <code>CALLS = 6;</code>
     */
    public static final int CALLS_VALUE = 6;
    /**
     * <pre>
     * Click on engagement ad.
     * </pre>
     *
     * <code>CLICK_ON_ENGAGEMENT_AD = 7;</code>
     */
    public static final int CLICK_ON_ENGAGEMENT_AD_VALUE = 7;
    /**
     * <pre>
     * Driving direction.
     * </pre>
     *
     * <code>GET_DIRECTIONS = 8;</code>
     */
    public static final int GET_DIRECTIONS_VALUE = 8;
    /**
     * <pre>
     * Get location details.
     * </pre>
     *
     * <code>LOCATION_EXPANSION = 9;</code>
     */
    public static final int LOCATION_EXPANSION_VALUE = 9;
    /**
     * <pre>
     * Call.
     * </pre>
     *
     * <code>LOCATION_FORMAT_CALL = 10;</code>
     */
    public static final int LOCATION_FORMAT_CALL_VALUE = 10;
    /**
     * <pre>
     * Directions.
     * </pre>
     *
     * <code>LOCATION_FORMAT_DIRECTIONS = 11;</code>
     */
    public static final int LOCATION_FORMAT_DIRECTIONS_VALUE = 11;
    /**
     * <pre>
     * Image(s).
     * </pre>
     *
     * <code>LOCATION_FORMAT_IMAGE = 12;</code>
     */
    public static final int LOCATION_FORMAT_IMAGE_VALUE = 12;
    /**
     * <pre>
     * Go to landing page.
     * </pre>
     *
     * <code>LOCATION_FORMAT_LANDING_PAGE = 13;</code>
     */
    public static final int LOCATION_FORMAT_LANDING_PAGE_VALUE = 13;
    /**
     * <pre>
     * Map.
     * </pre>
     *
     * <code>LOCATION_FORMAT_MAP = 14;</code>
     */
    public static final int LOCATION_FORMAT_MAP_VALUE = 14;
    /**
     * <pre>
     * Go to store info.
     * </pre>
     *
     * <code>LOCATION_FORMAT_STORE_INFO = 15;</code>
     */
    public static final int LOCATION_FORMAT_STORE_INFO_VALUE = 15;
    /**
     * <pre>
     * Text.
     * </pre>
     *
     * <code>LOCATION_FORMAT_TEXT = 16;</code>
     */
    public static final int LOCATION_FORMAT_TEXT_VALUE = 16;
    /**
     * <pre>
     * Mobile phone calls.
     * </pre>
     *
     * <code>MOBILE_CALL_TRACKING = 17;</code>
     */
    public static final int MOBILE_CALL_TRACKING_VALUE = 17;
    /**
     * <pre>
     * Print offer.
     * </pre>
     *
     * <code>OFFER_PRINTS = 18;</code>
     */
    public static final int OFFER_PRINTS_VALUE = 18;
    /**
     * <pre>
     * Other.
     * </pre>
     *
     * <code>OTHER = 19;</code>
     */
    public static final int OTHER_VALUE = 19;
    /**
     * <pre>
     * Product plusbox offer.
     * </pre>
     *
     * <code>PRODUCT_EXTENSION_CLICKS = 20;</code>
     */
    public static final int PRODUCT_EXTENSION_CLICKS_VALUE = 20;
    /**
     * <pre>
     * Shopping - Product - Online.
     * </pre>
     *
     * <code>PRODUCT_LISTING_AD_CLICKS = 21;</code>
     */
    public static final int PRODUCT_LISTING_AD_CLICKS_VALUE = 21;
    /**
     * <pre>
     * Sitelink.
     * </pre>
     *
     * <code>SITELINKS = 22;</code>
     */
    public static final int SITELINKS_VALUE = 22;
    /**
     * <pre>
     * Show nearby locations.
     * </pre>
     *
     * <code>STORE_LOCATOR = 23;</code>
     */
    public static final int STORE_LOCATOR_VALUE = 23;
    /**
     * <pre>
     * Headline.
     * </pre>
     *
     * <code>URL_CLICKS = 25;</code>
     */
    public static final int URL_CLICKS_VALUE = 25;
    /**
     * <pre>
     * App store.
     * </pre>
     *
     * <code>VIDEO_APP_STORE_CLICKS = 26;</code>
     */
    public static final int VIDEO_APP_STORE_CLICKS_VALUE = 26;
    /**
     * <pre>
     * Call-to-Action overlay.
     * </pre>
     *
     * <code>VIDEO_CALL_TO_ACTION_CLICKS = 27;</code>
     */
    public static final int VIDEO_CALL_TO_ACTION_CLICKS_VALUE = 27;
    /**
     * <pre>
     * Cards.
     * </pre>
     *
     * <code>VIDEO_CARD_ACTION_HEADLINE_CLICKS = 28;</code>
     */
    public static final int VIDEO_CARD_ACTION_HEADLINE_CLICKS_VALUE = 28;
    /**
     * <pre>
     * End cap.
     * </pre>
     *
     * <code>VIDEO_END_CAP_CLICKS = 29;</code>
     */
    public static final int VIDEO_END_CAP_CLICKS_VALUE = 29;
    /**
     * <pre>
     * Website.
     * </pre>
     *
     * <code>VIDEO_WEBSITE_CLICKS = 30;</code>
     */
    public static final int VIDEO_WEBSITE_CLICKS_VALUE = 30;
    /**
     * <pre>
     * Visual Sitelinks.
     * </pre>
     *
     * <code>VISUAL_SITELINKS = 31;</code>
     */
    public static final int VISUAL_SITELINKS_VALUE = 31;
    /**
     * <pre>
     * Wireless Plan.
     * </pre>
     *
     * <code>WIRELESS_PLAN = 32;</code>
     */
    public static final int WIRELESS_PLAN_VALUE = 32;
    /**
     * <pre>
     * Shopping - Product - Local.
     * </pre>
     *
     * <code>PRODUCT_LISTING_AD_LOCAL = 33;</code>
     */
    public static final int PRODUCT_LISTING_AD_LOCAL_VALUE = 33;
    /**
     * <pre>
     * Shopping - Product - MultiChannel Local.
     * </pre>
     *
     * <code>PRODUCT_LISTING_AD_MULTICHANNEL_LOCAL = 34;</code>
     */
    public static final int PRODUCT_LISTING_AD_MULTICHANNEL_LOCAL_VALUE = 34;
    /**
     * <pre>
     * Shopping - Product - MultiChannel Online.
     * </pre>
     *
     * <code>PRODUCT_LISTING_AD_MULTICHANNEL_ONLINE = 35;</code>
     */
    public static final int PRODUCT_LISTING_AD_MULTICHANNEL_ONLINE_VALUE = 35;
    /**
     * <pre>
     * Shopping - Product - Coupon.
     * </pre>
     *
     * <code>PRODUCT_LISTING_ADS_COUPON = 36;</code>
     */
    public static final int PRODUCT_LISTING_ADS_COUPON_VALUE = 36;
    /**
     * <pre>
     * Shopping - Product - Sell on Google.
     * </pre>
     *
     * <code>PRODUCT_LISTING_AD_TRANSACTABLE = 37;</code>
     */
    public static final int PRODUCT_LISTING_AD_TRANSACTABLE_VALUE = 37;
    /**
     * <pre>
     * Shopping - Product - App engagement ad deep link.
     * </pre>
     *
     * <code>PRODUCT_AD_APP_DEEPLINK = 38;</code>
     */
    public static final int PRODUCT_AD_APP_DEEPLINK_VALUE = 38;
    /**
     * <pre>
     * Shopping - Showcase - Category.
     * </pre>
     *
     * <code>SHOWCASE_AD_CATEGORY_LINK = 39;</code>
     */
    public static final int SHOWCASE_AD_CATEGORY_LINK_VALUE = 39;
    /**
     * <pre>
     * Shopping - Showcase - Local storefront.
     * </pre>
     *
     * <code>SHOWCASE_AD_LOCAL_STOREFRONT_LINK = 40;</code>
     */
    public static final int SHOWCASE_AD_LOCAL_STOREFRONT_LINK_VALUE = 40;
    /**
     * <pre>
     * Shopping - Showcase - Online product.
     * </pre>
     *
     * <code>SHOWCASE_AD_ONLINE_PRODUCT_LINK = 42;</code>
     */
    public static final int SHOWCASE_AD_ONLINE_PRODUCT_LINK_VALUE = 42;
    /**
     * <pre>
     * Shopping - Showcase - Local product.
     * </pre>
     *
     * <code>SHOWCASE_AD_LOCAL_PRODUCT_LINK = 43;</code>
     */
    public static final int SHOWCASE_AD_LOCAL_PRODUCT_LINK_VALUE = 43;
    /**
     * <pre>
     * Promotion Extension.
     * </pre>
     *
     * <code>PROMOTION_EXTENSION = 44;</code>
     */
    public static final int PROMOTION_EXTENSION_VALUE = 44;
    /**
     * <pre>
     * Ad Headline.
     * </pre>
     *
     * <code>SWIPEABLE_GALLERY_AD_HEADLINE = 45;</code>
     */
    public static final int SWIPEABLE_GALLERY_AD_HEADLINE_VALUE = 45;
    /**
     * <pre>
     * Swipes.
     * </pre>
     *
     * <code>SWIPEABLE_GALLERY_AD_SWIPES = 46;</code>
     */
    public static final int SWIPEABLE_GALLERY_AD_SWIPES_VALUE = 46;
    /**
     * <pre>
     * See More.
     * </pre>
     *
     * <code>SWIPEABLE_GALLERY_AD_SEE_MORE = 47;</code>
     */
    public static final int SWIPEABLE_GALLERY_AD_SEE_MORE_VALUE = 47;
    /**
     * <pre>
     * Sitelink 1.
     * </pre>
     *
     * <code>SWIPEABLE_GALLERY_AD_SITELINK_ONE = 48;</code>
     */
    public static final int SWIPEABLE_GALLERY_AD_SITELINK_ONE_VALUE = 48;
    /**
     * <pre>
     * Sitelink 2.
     * </pre>
     *
     * <code>SWIPEABLE_GALLERY_AD_SITELINK_TWO = 49;</code>
     */
    public static final int SWIPEABLE_GALLERY_AD_SITELINK_TWO_VALUE = 49;
    /**
     * <pre>
     * Sitelink 3.
     * </pre>
     *
     * <code>SWIPEABLE_GALLERY_AD_SITELINK_THREE = 50;</code>
     */
    public static final int SWIPEABLE_GALLERY_AD_SITELINK_THREE_VALUE = 50;
    /**
     * <pre>
     * Sitelink 4.
     * </pre>
     *
     * <code>SWIPEABLE_GALLERY_AD_SITELINK_FOUR = 51;</code>
     */
    public static final int SWIPEABLE_GALLERY_AD_SITELINK_FOUR_VALUE = 51;
    /**
     * <pre>
     * Sitelink 5.
     * </pre>
     *
     * <code>SWIPEABLE_GALLERY_AD_SITELINK_FIVE = 52;</code>
     */
    public static final int SWIPEABLE_GALLERY_AD_SITELINK_FIVE_VALUE = 52;
    /**
     * <pre>
     * Hotel price.
     * </pre>
     *
     * <code>HOTEL_PRICE = 53;</code>
     */
    public static final int HOTEL_PRICE_VALUE = 53;
    /**
     * <pre>
     * Price Extension.
     * </pre>
     *
     * <code>PRICE_EXTENSION = 54;</code>
     */
    public static final int PRICE_EXTENSION_VALUE = 54;
    /**
     * <pre>
     * Book on Google hotel room selection.
     * </pre>
     *
     * <code>HOTEL_BOOK_ON_GOOGLE_ROOM_SELECTION = 55;</code>
     */
    public static final int HOTEL_BOOK_ON_GOOGLE_ROOM_SELECTION_VALUE = 55;
    /**
     * <pre>
     * Shopping - Comparison Listing.
     * </pre>
     *
     * <code>SHOPPING_COMPARISON_LISTING = 56;</code>
     */
    public static final int SHOPPING_COMPARISON_LISTING_VALUE = 56;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static ClickType valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static ClickType forNumber(int value) {
      switch (value) {
        case 0: return UNSPECIFIED;
        case 1: return UNKNOWN;
        case 2: return APP_DEEPLINK;
        case 3: return BREADCRUMBS;
        case 4: return BROADBAND_PLAN;
        case 5: return CALL_TRACKING;
        case 6: return CALLS;
        case 7: return CLICK_ON_ENGAGEMENT_AD;
        case 8: return GET_DIRECTIONS;
        case 9: return LOCATION_EXPANSION;
        case 10: return LOCATION_FORMAT_CALL;
        case 11: return LOCATION_FORMAT_DIRECTIONS;
        case 12: return LOCATION_FORMAT_IMAGE;
        case 13: return LOCATION_FORMAT_LANDING_PAGE;
        case 14: return LOCATION_FORMAT_MAP;
        case 15: return LOCATION_FORMAT_STORE_INFO;
        case 16: return LOCATION_FORMAT_TEXT;
        case 17: return MOBILE_CALL_TRACKING;
        case 18: return OFFER_PRINTS;
        case 19: return OTHER;
        case 20: return PRODUCT_EXTENSION_CLICKS;
        case 21: return PRODUCT_LISTING_AD_CLICKS;
        case 22: return SITELINKS;
        case 23: return STORE_LOCATOR;
        case 25: return URL_CLICKS;
        case 26: return VIDEO_APP_STORE_CLICKS;
        case 27: return VIDEO_CALL_TO_ACTION_CLICKS;
        case 28: return VIDEO_CARD_ACTION_HEADLINE_CLICKS;
        case 29: return VIDEO_END_CAP_CLICKS;
        case 30: return VIDEO_WEBSITE_CLICKS;
        case 31: return VISUAL_SITELINKS;
        case 32: return WIRELESS_PLAN;
        case 33: return PRODUCT_LISTING_AD_LOCAL;
        case 34: return PRODUCT_LISTING_AD_MULTICHANNEL_LOCAL;
        case 35: return PRODUCT_LISTING_AD_MULTICHANNEL_ONLINE;
        case 36: return PRODUCT_LISTING_ADS_COUPON;
        case 37: return PRODUCT_LISTING_AD_TRANSACTABLE;
        case 38: return PRODUCT_AD_APP_DEEPLINK;
        case 39: return SHOWCASE_AD_CATEGORY_LINK;
        case 40: return SHOWCASE_AD_LOCAL_STOREFRONT_LINK;
        case 42: return SHOWCASE_AD_ONLINE_PRODUCT_LINK;
        case 43: return SHOWCASE_AD_LOCAL_PRODUCT_LINK;
        case 44: return PROMOTION_EXTENSION;
        case 45: return SWIPEABLE_GALLERY_AD_HEADLINE;
        case 46: return SWIPEABLE_GALLERY_AD_SWIPES;
        case 47: return SWIPEABLE_GALLERY_AD_SEE_MORE;
        case 48: return SWIPEABLE_GALLERY_AD_SITELINK_ONE;
        case 49: return SWIPEABLE_GALLERY_AD_SITELINK_TWO;
        case 50: return SWIPEABLE_GALLERY_AD_SITELINK_THREE;
        case 51: return SWIPEABLE_GALLERY_AD_SITELINK_FOUR;
        case 52: return SWIPEABLE_GALLERY_AD_SITELINK_FIVE;
        case 53: return HOTEL_PRICE;
        case 54: return PRICE_EXTENSION;
        case 55: return HOTEL_BOOK_ON_GOOGLE_ROOM_SELECTION;
        case 56: return SHOPPING_COMPARISON_LISTING;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<ClickType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        ClickType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<ClickType>() {
            public ClickType findValueByNumber(int number) {
              return ClickType.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.google.ads.googleads.v5.enums.ClickTypeEnum.getDescriptor().getEnumTypes().get(0);
    }

    private static final ClickType[] VALUES = values();

    public static ClickType valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private ClickType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.ads.googleads.v5.enums.ClickTypeEnum.ClickType)
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.ads.googleads.v5.enums.ClickTypeEnum)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v5.enums.ClickTypeEnum other = (com.google.ads.googleads.v5.enums.ClickTypeEnum) obj;

    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v5.enums.ClickTypeEnum parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v5.enums.ClickTypeEnum parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v5.enums.ClickTypeEnum parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v5.enums.ClickTypeEnum parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v5.enums.ClickTypeEnum parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v5.enums.ClickTypeEnum parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v5.enums.ClickTypeEnum parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v5.enums.ClickTypeEnum parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v5.enums.ClickTypeEnum parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v5.enums.ClickTypeEnum parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v5.enums.ClickTypeEnum parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v5.enums.ClickTypeEnum parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.ads.googleads.v5.enums.ClickTypeEnum prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * Container for enumeration of Google Ads click types.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v5.enums.ClickTypeEnum}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v5.enums.ClickTypeEnum)
      com.google.ads.googleads.v5.enums.ClickTypeEnumOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v5.enums.ClickTypeProto.internal_static_google_ads_googleads_v5_enums_ClickTypeEnum_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v5.enums.ClickTypeProto.internal_static_google_ads_googleads_v5_enums_ClickTypeEnum_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v5.enums.ClickTypeEnum.class, com.google.ads.googleads.v5.enums.ClickTypeEnum.Builder.class);
    }

    // Construct using com.google.ads.googleads.v5.enums.ClickTypeEnum.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v5.enums.ClickTypeProto.internal_static_google_ads_googleads_v5_enums_ClickTypeEnum_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v5.enums.ClickTypeEnum getDefaultInstanceForType() {
      return com.google.ads.googleads.v5.enums.ClickTypeEnum.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v5.enums.ClickTypeEnum build() {
      com.google.ads.googleads.v5.enums.ClickTypeEnum result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v5.enums.ClickTypeEnum buildPartial() {
      com.google.ads.googleads.v5.enums.ClickTypeEnum result = new com.google.ads.googleads.v5.enums.ClickTypeEnum(this);
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.ads.googleads.v5.enums.ClickTypeEnum) {
        return mergeFrom((com.google.ads.googleads.v5.enums.ClickTypeEnum)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v5.enums.ClickTypeEnum other) {
      if (other == com.google.ads.googleads.v5.enums.ClickTypeEnum.getDefaultInstance()) return this;
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.ads.googleads.v5.enums.ClickTypeEnum parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v5.enums.ClickTypeEnum) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v5.enums.ClickTypeEnum)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v5.enums.ClickTypeEnum)
  private static final com.google.ads.googleads.v5.enums.ClickTypeEnum DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v5.enums.ClickTypeEnum();
  }

  public static com.google.ads.googleads.v5.enums.ClickTypeEnum getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ClickTypeEnum>
      PARSER = new com.google.protobuf.AbstractParser<ClickTypeEnum>() {
    @java.lang.Override
    public ClickTypeEnum parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ClickTypeEnum(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ClickTypeEnum> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ClickTypeEnum> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v5.enums.ClickTypeEnum getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

