// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v16/resources/recommendation_subscription.proto

// Protobuf Java Version: 3.25.2
package com.google.ads.googleads.v16.resources;

public final class RecommendationSubscriptionProto {
  private RecommendationSubscriptionProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v16_resources_RecommendationSubscription_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v16_resources_RecommendationSubscription_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nDgoogle/ads/googleads/v16/resources/rec" +
      "ommendation_subscription.proto\022\"google.a" +
      "ds.googleads.v16.resources\032Ggoogle/ads/g" +
      "oogleads/v16/enums/recommendation_subscr" +
      "iption_status.proto\0328google/ads/googlead" +
      "s/v16/enums/recommendation_type.proto\032\037g" +
      "oogle/api/field_behavior.proto\032\031google/a" +
      "pi/resource.proto\"\326\004\n\032RecommendationSubs" +
      "cription\022R\n\rresource_name\030\001 \001(\tB;\340A\005\372A5\n" +
      "3googleads.googleapis.com/Recommendation" +
      "Subscription\022_\n\004type\030\002 \001(\0162I.google.ads." +
      "googleads.v16.enums.RecommendationTypeEn" +
      "um.RecommendationTypeB\006\340A\002\340A\005\022\"\n\020create_" +
      "date_time\030\003 \001(\tB\003\340A\003H\000\210\001\001\022\"\n\020modify_date" +
      "_time\030\004 \001(\tB\003\340A\003H\001\210\001\001\022\177\n\006status\030\005 \001(\0162e." +
      "google.ads.googleads.v16.enums.Recommend" +
      "ationSubscriptionStatusEnum.Recommendati" +
      "onSubscriptionStatusB\003\340A\002H\002\210\001\001:\204\001\352A\200\001\n3g" +
      "oogleads.googleapis.com/RecommendationSu" +
      "bscription\022Icustomers/{customer_id}/reco" +
      "mmendationSubscriptions/{recommendation_" +
      "type}B\023\n\021_create_date_timeB\023\n\021_modify_da" +
      "te_timeB\t\n\007_statusB\221\002\n&com.google.ads.go" +
      "ogleads.v16.resourcesB\037RecommendationSub" +
      "scriptionProtoP\001ZKgoogle.golang.org/genp" +
      "roto/googleapis/ads/googleads/v16/resour" +
      "ces;resources\242\002\003GAA\252\002\"Google.Ads.GoogleA" +
      "ds.V16.Resources\312\002\"Google\\Ads\\GoogleAds\\" +
      "V16\\Resources\352\002&Google::Ads::GoogleAds::" +
      "V16::Resourcesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v16.enums.RecommendationSubscriptionStatusProto.getDescriptor(),
          com.google.ads.googleads.v16.enums.RecommendationTypeProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v16_resources_RecommendationSubscription_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v16_resources_RecommendationSubscription_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v16_resources_RecommendationSubscription_descriptor,
        new java.lang.String[] { "ResourceName", "Type", "CreateDateTime", "ModifyDateTime", "Status", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v16.enums.RecommendationSubscriptionStatusProto.getDescriptor();
    com.google.ads.googleads.v16.enums.RecommendationTypeProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
