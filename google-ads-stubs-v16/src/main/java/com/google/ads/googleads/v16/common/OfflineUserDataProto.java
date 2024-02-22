// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v16/common/offline_user_data.proto

// Protobuf Java Version: 3.25.2
package com.google.ads.googleads.v16.common;

public final class OfflineUserDataProto {
  private OfflineUserDataProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v16_common_OfflineUserAddressInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v16_common_OfflineUserAddressInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v16_common_UserIdentifier_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v16_common_UserIdentifier_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v16_common_TransactionAttribute_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v16_common_TransactionAttribute_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v16_common_StoreAttribute_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v16_common_StoreAttribute_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v16_common_ItemAttribute_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v16_common_ItemAttribute_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v16_common_UserData_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v16_common_UserData_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v16_common_UserAttribute_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v16_common_UserAttribute_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v16_common_EventAttribute_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v16_common_EventAttribute_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v16_common_EventItemAttribute_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v16_common_EventItemAttribute_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v16_common_ShoppingLoyalty_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v16_common_ShoppingLoyalty_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v16_common_CustomerMatchUserListMetadata_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v16_common_CustomerMatchUserListMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v16_common_StoreSalesMetadata_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v16_common_StoreSalesMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v16_common_StoreSalesThirdPartyMetadata_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v16_common_StoreSalesThirdPartyMetadata_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n7google/ads/googleads/v16/common/offlin" +
      "e_user_data.proto\022\037google.ads.googleads." +
      "v16.common\032-google/ads/googleads/v16/com" +
      "mon/consent.proto\032;google/ads/googleads/" +
      "v16/enums/user_identifier_source.proto\032\037" +
      "google/api/field_behavior.proto\"\320\002\n\026Offl" +
      "ineUserAddressInfo\022\036\n\021hashed_first_name\030" +
      "\007 \001(\tH\000\210\001\001\022\035\n\020hashed_last_name\030\010 \001(\tH\001\210\001" +
      "\001\022\021\n\004city\030\t \001(\tH\002\210\001\001\022\022\n\005state\030\n \001(\tH\003\210\001\001" +
      "\022\031\n\014country_code\030\013 \001(\tH\004\210\001\001\022\030\n\013postal_co" +
      "de\030\014 \001(\tH\005\210\001\001\022\"\n\025hashed_street_address\030\r" +
      " \001(\tH\006\210\001\001B\024\n\022_hashed_first_nameB\023\n\021_hash" +
      "ed_last_nameB\007\n\005_cityB\010\n\006_stateB\017\n\r_coun" +
      "try_codeB\016\n\014_postal_codeB\030\n\026_hashed_stre" +
      "et_address\"\311\002\n\016UserIdentifier\022m\n\026user_id" +
      "entifier_source\030\006 \001(\0162M.google.ads.googl" +
      "eads.v16.enums.UserIdentifierSourceEnum." +
      "UserIdentifierSource\022\026\n\014hashed_email\030\007 \001" +
      "(\tH\000\022\035\n\023hashed_phone_number\030\010 \001(\tH\000\022\023\n\tm" +
      "obile_id\030\t \001(\tH\000\022\035\n\023third_party_user_id\030" +
      "\n \001(\tH\000\022O\n\014address_info\030\005 \001(\01327.google.a" +
      "ds.googleads.v16.common.OfflineUserAddre" +
      "ssInfoH\000B\014\n\nidentifier\"\340\003\n\024TransactionAt" +
      "tribute\022\"\n\025transaction_date_time\030\010 \001(\tH\000" +
      "\210\001\001\022&\n\031transaction_amount_micros\030\t \001(\001H\001" +
      "\210\001\001\022\032\n\rcurrency_code\030\n \001(\tH\002\210\001\001\022\036\n\021conve" +
      "rsion_action\030\013 \001(\tH\003\210\001\001\022\025\n\010order_id\030\014 \001(" +
      "\tH\004\210\001\001\022H\n\017store_attribute\030\006 \001(\0132/.google" +
      ".ads.googleads.v16.common.StoreAttribute" +
      "\022\031\n\014custom_value\030\r \001(\tH\005\210\001\001\022F\n\016item_attr" +
      "ibute\030\016 \001(\0132..google.ads.googleads.v16.c" +
      "ommon.ItemAttributeB\030\n\026_transaction_date" +
      "_timeB\034\n\032_transaction_amount_microsB\020\n\016_" +
      "currency_codeB\024\n\022_conversion_actionB\013\n\t_" +
      "order_idB\017\n\r_custom_value\"8\n\016StoreAttrib" +
      "ute\022\027\n\nstore_code\030\002 \001(\tH\000\210\001\001B\r\n\013_store_c" +
      "ode\"\211\001\n\rItemAttribute\022\017\n\007item_id\030\001 \001(\t\022\030" +
      "\n\013merchant_id\030\002 \001(\003H\000\210\001\001\022\024\n\014country_code" +
      "\030\003 \001(\t\022\025\n\rlanguage_code\030\004 \001(\t\022\020\n\010quantit" +
      "y\030\005 \001(\003B\016\n\014_merchant_id\"\277\002\n\010UserData\022I\n\020" +
      "user_identifiers\030\001 \003(\0132/.google.ads.goog" +
      "leads.v16.common.UserIdentifier\022T\n\025trans" +
      "action_attribute\030\002 \001(\01325.google.ads.goog" +
      "leads.v16.common.TransactionAttribute\022F\n" +
      "\016user_attribute\030\003 \001(\0132..google.ads.googl" +
      "eads.v16.common.UserAttribute\022>\n\007consent" +
      "\030\004 \001(\0132(.google.ads.googleads.v16.common" +
      ".ConsentH\000\210\001\001B\n\n\010_consent\"\214\004\n\rUserAttrib" +
      "ute\022\"\n\025lifetime_value_micros\030\001 \001(\003H\000\210\001\001\022" +
      "\"\n\025lifetime_value_bucket\030\002 \001(\005H\001\210\001\001\022\037\n\027l" +
      "ast_purchase_date_time\030\003 \001(\t\022\036\n\026average_" +
      "purchase_count\030\004 \001(\005\022%\n\035average_purchase" +
      "_value_micros\030\005 \001(\003\022\035\n\025acquisition_date_" +
      "time\030\006 \001(\t\022O\n\020shopping_loyalty\030\007 \001(\01320.g" +
      "oogle.ads.googleads.v16.common.ShoppingL" +
      "oyaltyH\002\210\001\001\022\034\n\017lifecycle_stage\030\010 \001(\tB\003\340A" +
      "\001\022%\n\030first_purchase_date_time\030\t \001(\tB\003\340A\001" +
      "\022M\n\017event_attribute\030\n \003(\0132/.google.ads.g" +
      "oogleads.v16.common.EventAttributeB\003\340A\001B" +
      "\030\n\026_lifetime_value_microsB\030\n\026_lifetime_v" +
      "alue_bucketB\023\n\021_shopping_loyalty\"\224\001\n\016Eve" +
      "ntAttribute\022\022\n\005event\030\001 \001(\tB\003\340A\002\022\034\n\017event" +
      "_date_time\030\002 \001(\tB\003\340A\002\022P\n\016item_attribute\030" +
      "\003 \003(\01323.google.ads.googleads.v16.common." +
      "EventItemAttributeB\003\340A\002\"*\n\022EventItemAttr" +
      "ibute\022\024\n\007item_id\030\001 \001(\tB\003\340A\001\"=\n\017ShoppingL" +
      "oyalty\022\031\n\014loyalty_tier\030\001 \001(\tH\000\210\001\001B\017\n\r_lo" +
      "yalty_tier\"\221\001\n\035CustomerMatchUserListMeta" +
      "data\022\026\n\tuser_list\030\002 \001(\tH\000\210\001\001\022>\n\007consent\030" +
      "\003 \001(\0132(.google.ads.googleads.v16.common." +
      "ConsentH\001\210\001\001B\014\n\n_user_listB\n\n\010_consent\"\227" +
      "\002\n\022StoreSalesMetadata\022\035\n\020loyalty_fractio" +
      "n\030\005 \001(\001H\000\210\001\001\022(\n\033transaction_upload_fract" +
      "ion\030\006 \001(\001H\001\210\001\001\022\027\n\ncustom_key\030\007 \001(\tH\002\210\001\001\022" +
      "[\n\024third_party_metadata\030\003 \001(\0132=.google.a" +
      "ds.googleads.v16.common.StoreSalesThirdP" +
      "artyMetadataB\023\n\021_loyalty_fractionB\036\n\034_tr" +
      "ansaction_upload_fractionB\r\n\013_custom_key" +
      "\"\230\003\n\034StoreSalesThirdPartyMetadata\022(\n\033adv" +
      "ertiser_upload_date_time\030\007 \001(\tH\000\210\001\001\022\'\n\032v" +
      "alid_transaction_fraction\030\010 \001(\001H\001\210\001\001\022#\n\026" +
      "partner_match_fraction\030\t \001(\001H\002\210\001\001\022$\n\027par" +
      "tner_upload_fraction\030\n \001(\001H\003\210\001\001\022\"\n\025bridg" +
      "e_map_version_id\030\013 \001(\tH\004\210\001\001\022\027\n\npartner_i" +
      "d\030\014 \001(\003H\005\210\001\001B\036\n\034_advertiser_upload_date_" +
      "timeB\035\n\033_valid_transaction_fractionB\031\n\027_" +
      "partner_match_fractionB\032\n\030_partner_uploa" +
      "d_fractionB\030\n\026_bridge_map_version_idB\r\n\013" +
      "_partner_idB\364\001\n#com.google.ads.googleads" +
      ".v16.commonB\024OfflineUserDataProtoP\001ZEgoo" +
      "gle.golang.org/genproto/googleapis/ads/g" +
      "oogleads/v16/common;common\242\002\003GAA\252\002\037Googl" +
      "e.Ads.GoogleAds.V16.Common\312\002\037Google\\Ads\\" +
      "GoogleAds\\V16\\Common\352\002#Google::Ads::Goog" +
      "leAds::V16::Commonb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v16.common.ConsentProto.getDescriptor(),
          com.google.ads.googleads.v16.enums.UserIdentifierSourceProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v16_common_OfflineUserAddressInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v16_common_OfflineUserAddressInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v16_common_OfflineUserAddressInfo_descriptor,
        new java.lang.String[] { "HashedFirstName", "HashedLastName", "City", "State", "CountryCode", "PostalCode", "HashedStreetAddress", });
    internal_static_google_ads_googleads_v16_common_UserIdentifier_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v16_common_UserIdentifier_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v16_common_UserIdentifier_descriptor,
        new java.lang.String[] { "UserIdentifierSource", "HashedEmail", "HashedPhoneNumber", "MobileId", "ThirdPartyUserId", "AddressInfo", "Identifier", });
    internal_static_google_ads_googleads_v16_common_TransactionAttribute_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v16_common_TransactionAttribute_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v16_common_TransactionAttribute_descriptor,
        new java.lang.String[] { "TransactionDateTime", "TransactionAmountMicros", "CurrencyCode", "ConversionAction", "OrderId", "StoreAttribute", "CustomValue", "ItemAttribute", });
    internal_static_google_ads_googleads_v16_common_StoreAttribute_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v16_common_StoreAttribute_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v16_common_StoreAttribute_descriptor,
        new java.lang.String[] { "StoreCode", });
    internal_static_google_ads_googleads_v16_common_ItemAttribute_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_ads_googleads_v16_common_ItemAttribute_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v16_common_ItemAttribute_descriptor,
        new java.lang.String[] { "ItemId", "MerchantId", "CountryCode", "LanguageCode", "Quantity", });
    internal_static_google_ads_googleads_v16_common_UserData_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_google_ads_googleads_v16_common_UserData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v16_common_UserData_descriptor,
        new java.lang.String[] { "UserIdentifiers", "TransactionAttribute", "UserAttribute", "Consent", });
    internal_static_google_ads_googleads_v16_common_UserAttribute_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_google_ads_googleads_v16_common_UserAttribute_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v16_common_UserAttribute_descriptor,
        new java.lang.String[] { "LifetimeValueMicros", "LifetimeValueBucket", "LastPurchaseDateTime", "AveragePurchaseCount", "AveragePurchaseValueMicros", "AcquisitionDateTime", "ShoppingLoyalty", "LifecycleStage", "FirstPurchaseDateTime", "EventAttribute", });
    internal_static_google_ads_googleads_v16_common_EventAttribute_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_google_ads_googleads_v16_common_EventAttribute_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v16_common_EventAttribute_descriptor,
        new java.lang.String[] { "Event", "EventDateTime", "ItemAttribute", });
    internal_static_google_ads_googleads_v16_common_EventItemAttribute_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_google_ads_googleads_v16_common_EventItemAttribute_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v16_common_EventItemAttribute_descriptor,
        new java.lang.String[] { "ItemId", });
    internal_static_google_ads_googleads_v16_common_ShoppingLoyalty_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_google_ads_googleads_v16_common_ShoppingLoyalty_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v16_common_ShoppingLoyalty_descriptor,
        new java.lang.String[] { "LoyaltyTier", });
    internal_static_google_ads_googleads_v16_common_CustomerMatchUserListMetadata_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_google_ads_googleads_v16_common_CustomerMatchUserListMetadata_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v16_common_CustomerMatchUserListMetadata_descriptor,
        new java.lang.String[] { "UserList", "Consent", });
    internal_static_google_ads_googleads_v16_common_StoreSalesMetadata_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_google_ads_googleads_v16_common_StoreSalesMetadata_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v16_common_StoreSalesMetadata_descriptor,
        new java.lang.String[] { "LoyaltyFraction", "TransactionUploadFraction", "CustomKey", "ThirdPartyMetadata", });
    internal_static_google_ads_googleads_v16_common_StoreSalesThirdPartyMetadata_descriptor =
      getDescriptor().getMessageTypes().get(12);
    internal_static_google_ads_googleads_v16_common_StoreSalesThirdPartyMetadata_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v16_common_StoreSalesThirdPartyMetadata_descriptor,
        new java.lang.String[] { "AdvertiserUploadDateTime", "ValidTransactionFraction", "PartnerMatchFraction", "PartnerUploadFraction", "BridgeMapVersionId", "PartnerId", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v16.common.ConsentProto.getDescriptor();
    com.google.ads.googleads.v16.enums.UserIdentifierSourceProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
