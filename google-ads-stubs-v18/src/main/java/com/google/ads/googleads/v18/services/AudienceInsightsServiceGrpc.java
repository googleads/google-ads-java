package com.google.ads.googleads.v18.services;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Audience Insights Service helps users find information about groups of
 * people and how they can be reached with Google Ads. Accessible to
 * allowlisted customers only.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/ads/googleads/v18/services/audience_insights_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class AudienceInsightsServiceGrpc {

  private AudienceInsightsServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "google.ads.googleads.v18.services.AudienceInsightsService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v18.services.GenerateInsightsFinderReportRequest,
      com.google.ads.googleads.v18.services.GenerateInsightsFinderReportResponse> getGenerateInsightsFinderReportMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GenerateInsightsFinderReport",
      requestType = com.google.ads.googleads.v18.services.GenerateInsightsFinderReportRequest.class,
      responseType = com.google.ads.googleads.v18.services.GenerateInsightsFinderReportResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v18.services.GenerateInsightsFinderReportRequest,
      com.google.ads.googleads.v18.services.GenerateInsightsFinderReportResponse> getGenerateInsightsFinderReportMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v18.services.GenerateInsightsFinderReportRequest, com.google.ads.googleads.v18.services.GenerateInsightsFinderReportResponse> getGenerateInsightsFinderReportMethod;
    if ((getGenerateInsightsFinderReportMethod = AudienceInsightsServiceGrpc.getGenerateInsightsFinderReportMethod) == null) {
      synchronized (AudienceInsightsServiceGrpc.class) {
        if ((getGenerateInsightsFinderReportMethod = AudienceInsightsServiceGrpc.getGenerateInsightsFinderReportMethod) == null) {
          AudienceInsightsServiceGrpc.getGenerateInsightsFinderReportMethod = getGenerateInsightsFinderReportMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v18.services.GenerateInsightsFinderReportRequest, com.google.ads.googleads.v18.services.GenerateInsightsFinderReportResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GenerateInsightsFinderReport"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v18.services.GenerateInsightsFinderReportRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v18.services.GenerateInsightsFinderReportResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AudienceInsightsServiceMethodDescriptorSupplier("GenerateInsightsFinderReport"))
              .build();
        }
      }
    }
    return getGenerateInsightsFinderReportMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v18.services.ListAudienceInsightsAttributesRequest,
      com.google.ads.googleads.v18.services.ListAudienceInsightsAttributesResponse> getListAudienceInsightsAttributesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListAudienceInsightsAttributes",
      requestType = com.google.ads.googleads.v18.services.ListAudienceInsightsAttributesRequest.class,
      responseType = com.google.ads.googleads.v18.services.ListAudienceInsightsAttributesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v18.services.ListAudienceInsightsAttributesRequest,
      com.google.ads.googleads.v18.services.ListAudienceInsightsAttributesResponse> getListAudienceInsightsAttributesMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v18.services.ListAudienceInsightsAttributesRequest, com.google.ads.googleads.v18.services.ListAudienceInsightsAttributesResponse> getListAudienceInsightsAttributesMethod;
    if ((getListAudienceInsightsAttributesMethod = AudienceInsightsServiceGrpc.getListAudienceInsightsAttributesMethod) == null) {
      synchronized (AudienceInsightsServiceGrpc.class) {
        if ((getListAudienceInsightsAttributesMethod = AudienceInsightsServiceGrpc.getListAudienceInsightsAttributesMethod) == null) {
          AudienceInsightsServiceGrpc.getListAudienceInsightsAttributesMethod = getListAudienceInsightsAttributesMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v18.services.ListAudienceInsightsAttributesRequest, com.google.ads.googleads.v18.services.ListAudienceInsightsAttributesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListAudienceInsightsAttributes"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v18.services.ListAudienceInsightsAttributesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v18.services.ListAudienceInsightsAttributesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AudienceInsightsServiceMethodDescriptorSupplier("ListAudienceInsightsAttributes"))
              .build();
        }
      }
    }
    return getListAudienceInsightsAttributesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v18.services.ListInsightsEligibleDatesRequest,
      com.google.ads.googleads.v18.services.ListInsightsEligibleDatesResponse> getListInsightsEligibleDatesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListInsightsEligibleDates",
      requestType = com.google.ads.googleads.v18.services.ListInsightsEligibleDatesRequest.class,
      responseType = com.google.ads.googleads.v18.services.ListInsightsEligibleDatesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v18.services.ListInsightsEligibleDatesRequest,
      com.google.ads.googleads.v18.services.ListInsightsEligibleDatesResponse> getListInsightsEligibleDatesMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v18.services.ListInsightsEligibleDatesRequest, com.google.ads.googleads.v18.services.ListInsightsEligibleDatesResponse> getListInsightsEligibleDatesMethod;
    if ((getListInsightsEligibleDatesMethod = AudienceInsightsServiceGrpc.getListInsightsEligibleDatesMethod) == null) {
      synchronized (AudienceInsightsServiceGrpc.class) {
        if ((getListInsightsEligibleDatesMethod = AudienceInsightsServiceGrpc.getListInsightsEligibleDatesMethod) == null) {
          AudienceInsightsServiceGrpc.getListInsightsEligibleDatesMethod = getListInsightsEligibleDatesMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v18.services.ListInsightsEligibleDatesRequest, com.google.ads.googleads.v18.services.ListInsightsEligibleDatesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListInsightsEligibleDates"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v18.services.ListInsightsEligibleDatesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v18.services.ListInsightsEligibleDatesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AudienceInsightsServiceMethodDescriptorSupplier("ListInsightsEligibleDates"))
              .build();
        }
      }
    }
    return getListInsightsEligibleDatesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v18.services.GenerateAudienceCompositionInsightsRequest,
      com.google.ads.googleads.v18.services.GenerateAudienceCompositionInsightsResponse> getGenerateAudienceCompositionInsightsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GenerateAudienceCompositionInsights",
      requestType = com.google.ads.googleads.v18.services.GenerateAudienceCompositionInsightsRequest.class,
      responseType = com.google.ads.googleads.v18.services.GenerateAudienceCompositionInsightsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v18.services.GenerateAudienceCompositionInsightsRequest,
      com.google.ads.googleads.v18.services.GenerateAudienceCompositionInsightsResponse> getGenerateAudienceCompositionInsightsMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v18.services.GenerateAudienceCompositionInsightsRequest, com.google.ads.googleads.v18.services.GenerateAudienceCompositionInsightsResponse> getGenerateAudienceCompositionInsightsMethod;
    if ((getGenerateAudienceCompositionInsightsMethod = AudienceInsightsServiceGrpc.getGenerateAudienceCompositionInsightsMethod) == null) {
      synchronized (AudienceInsightsServiceGrpc.class) {
        if ((getGenerateAudienceCompositionInsightsMethod = AudienceInsightsServiceGrpc.getGenerateAudienceCompositionInsightsMethod) == null) {
          AudienceInsightsServiceGrpc.getGenerateAudienceCompositionInsightsMethod = getGenerateAudienceCompositionInsightsMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v18.services.GenerateAudienceCompositionInsightsRequest, com.google.ads.googleads.v18.services.GenerateAudienceCompositionInsightsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GenerateAudienceCompositionInsights"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v18.services.GenerateAudienceCompositionInsightsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v18.services.GenerateAudienceCompositionInsightsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AudienceInsightsServiceMethodDescriptorSupplier("GenerateAudienceCompositionInsights"))
              .build();
        }
      }
    }
    return getGenerateAudienceCompositionInsightsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v18.services.GenerateSuggestedTargetingInsightsRequest,
      com.google.ads.googleads.v18.services.GenerateSuggestedTargetingInsightsResponse> getGenerateSuggestedTargetingInsightsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GenerateSuggestedTargetingInsights",
      requestType = com.google.ads.googleads.v18.services.GenerateSuggestedTargetingInsightsRequest.class,
      responseType = com.google.ads.googleads.v18.services.GenerateSuggestedTargetingInsightsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v18.services.GenerateSuggestedTargetingInsightsRequest,
      com.google.ads.googleads.v18.services.GenerateSuggestedTargetingInsightsResponse> getGenerateSuggestedTargetingInsightsMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v18.services.GenerateSuggestedTargetingInsightsRequest, com.google.ads.googleads.v18.services.GenerateSuggestedTargetingInsightsResponse> getGenerateSuggestedTargetingInsightsMethod;
    if ((getGenerateSuggestedTargetingInsightsMethod = AudienceInsightsServiceGrpc.getGenerateSuggestedTargetingInsightsMethod) == null) {
      synchronized (AudienceInsightsServiceGrpc.class) {
        if ((getGenerateSuggestedTargetingInsightsMethod = AudienceInsightsServiceGrpc.getGenerateSuggestedTargetingInsightsMethod) == null) {
          AudienceInsightsServiceGrpc.getGenerateSuggestedTargetingInsightsMethod = getGenerateSuggestedTargetingInsightsMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v18.services.GenerateSuggestedTargetingInsightsRequest, com.google.ads.googleads.v18.services.GenerateSuggestedTargetingInsightsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GenerateSuggestedTargetingInsights"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v18.services.GenerateSuggestedTargetingInsightsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v18.services.GenerateSuggestedTargetingInsightsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AudienceInsightsServiceMethodDescriptorSupplier("GenerateSuggestedTargetingInsights"))
              .build();
        }
      }
    }
    return getGenerateSuggestedTargetingInsightsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v18.services.GenerateAudienceOverlapInsightsRequest,
      com.google.ads.googleads.v18.services.GenerateAudienceOverlapInsightsResponse> getGenerateAudienceOverlapInsightsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GenerateAudienceOverlapInsights",
      requestType = com.google.ads.googleads.v18.services.GenerateAudienceOverlapInsightsRequest.class,
      responseType = com.google.ads.googleads.v18.services.GenerateAudienceOverlapInsightsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v18.services.GenerateAudienceOverlapInsightsRequest,
      com.google.ads.googleads.v18.services.GenerateAudienceOverlapInsightsResponse> getGenerateAudienceOverlapInsightsMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v18.services.GenerateAudienceOverlapInsightsRequest, com.google.ads.googleads.v18.services.GenerateAudienceOverlapInsightsResponse> getGenerateAudienceOverlapInsightsMethod;
    if ((getGenerateAudienceOverlapInsightsMethod = AudienceInsightsServiceGrpc.getGenerateAudienceOverlapInsightsMethod) == null) {
      synchronized (AudienceInsightsServiceGrpc.class) {
        if ((getGenerateAudienceOverlapInsightsMethod = AudienceInsightsServiceGrpc.getGenerateAudienceOverlapInsightsMethod) == null) {
          AudienceInsightsServiceGrpc.getGenerateAudienceOverlapInsightsMethod = getGenerateAudienceOverlapInsightsMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v18.services.GenerateAudienceOverlapInsightsRequest, com.google.ads.googleads.v18.services.GenerateAudienceOverlapInsightsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GenerateAudienceOverlapInsights"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v18.services.GenerateAudienceOverlapInsightsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v18.services.GenerateAudienceOverlapInsightsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AudienceInsightsServiceMethodDescriptorSupplier("GenerateAudienceOverlapInsights"))
              .build();
        }
      }
    }
    return getGenerateAudienceOverlapInsightsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v18.services.GenerateTargetingSuggestionMetricsRequest,
      com.google.ads.googleads.v18.services.GenerateTargetingSuggestionMetricsResponse> getGenerateTargetingSuggestionMetricsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GenerateTargetingSuggestionMetrics",
      requestType = com.google.ads.googleads.v18.services.GenerateTargetingSuggestionMetricsRequest.class,
      responseType = com.google.ads.googleads.v18.services.GenerateTargetingSuggestionMetricsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v18.services.GenerateTargetingSuggestionMetricsRequest,
      com.google.ads.googleads.v18.services.GenerateTargetingSuggestionMetricsResponse> getGenerateTargetingSuggestionMetricsMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v18.services.GenerateTargetingSuggestionMetricsRequest, com.google.ads.googleads.v18.services.GenerateTargetingSuggestionMetricsResponse> getGenerateTargetingSuggestionMetricsMethod;
    if ((getGenerateTargetingSuggestionMetricsMethod = AudienceInsightsServiceGrpc.getGenerateTargetingSuggestionMetricsMethod) == null) {
      synchronized (AudienceInsightsServiceGrpc.class) {
        if ((getGenerateTargetingSuggestionMetricsMethod = AudienceInsightsServiceGrpc.getGenerateTargetingSuggestionMetricsMethod) == null) {
          AudienceInsightsServiceGrpc.getGenerateTargetingSuggestionMetricsMethod = getGenerateTargetingSuggestionMetricsMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v18.services.GenerateTargetingSuggestionMetricsRequest, com.google.ads.googleads.v18.services.GenerateTargetingSuggestionMetricsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GenerateTargetingSuggestionMetrics"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v18.services.GenerateTargetingSuggestionMetricsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v18.services.GenerateTargetingSuggestionMetricsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AudienceInsightsServiceMethodDescriptorSupplier("GenerateTargetingSuggestionMetrics"))
              .build();
        }
      }
    }
    return getGenerateTargetingSuggestionMetricsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AudienceInsightsServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AudienceInsightsServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AudienceInsightsServiceStub>() {
        @java.lang.Override
        public AudienceInsightsServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AudienceInsightsServiceStub(channel, callOptions);
        }
      };
    return AudienceInsightsServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static AudienceInsightsServiceBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AudienceInsightsServiceBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AudienceInsightsServiceBlockingV2Stub>() {
        @java.lang.Override
        public AudienceInsightsServiceBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AudienceInsightsServiceBlockingV2Stub(channel, callOptions);
        }
      };
    return AudienceInsightsServiceBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AudienceInsightsServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AudienceInsightsServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AudienceInsightsServiceBlockingStub>() {
        @java.lang.Override
        public AudienceInsightsServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AudienceInsightsServiceBlockingStub(channel, callOptions);
        }
      };
    return AudienceInsightsServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AudienceInsightsServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AudienceInsightsServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AudienceInsightsServiceFutureStub>() {
        @java.lang.Override
        public AudienceInsightsServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AudienceInsightsServiceFutureStub(channel, callOptions);
        }
      };
    return AudienceInsightsServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Audience Insights Service helps users find information about groups of
   * people and how they can be reached with Google Ads. Accessible to
   * allowlisted customers only.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Creates a saved report that can be viewed in the Insights Finder tool.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [FieldError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RangeError]()
     *   [RequestError]()
     * </pre>
     */
    default void generateInsightsFinderReport(com.google.ads.googleads.v18.services.GenerateInsightsFinderReportRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v18.services.GenerateInsightsFinderReportResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGenerateInsightsFinderReportMethod(), responseObserver);
    }

    /**
     * <pre>
     * Searches for audience attributes that can be used to generate insights.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [FieldError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RangeError]()
     *   [RequestError]()
     * </pre>
     */
    default void listAudienceInsightsAttributes(com.google.ads.googleads.v18.services.ListAudienceInsightsAttributesRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v18.services.ListAudienceInsightsAttributesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListAudienceInsightsAttributesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists date ranges for which audience insights data can be requested.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [FieldError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RangeError]()
     *   [RequestError]()
     * </pre>
     */
    default void listInsightsEligibleDates(com.google.ads.googleads.v18.services.ListInsightsEligibleDatesRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v18.services.ListInsightsEligibleDatesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListInsightsEligibleDatesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns a collection of attributes that are represented in an audience of
     * interest, with metrics that compare each attribute's share of the audience
     * with its share of a baseline audience.
     * List of thrown errors:
     *   [AudienceInsightsError]()
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [FieldError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RangeError]()
     *   [RequestError]()
     * </pre>
     */
    default void generateAudienceCompositionInsights(com.google.ads.googleads.v18.services.GenerateAudienceCompositionInsightsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v18.services.GenerateAudienceCompositionInsightsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGenerateAudienceCompositionInsightsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns a collection of targeting insights (e.g. targetable audiences) that
     * are relevant to the requested audience.
     * List of thrown errors:
     *   [AudienceInsightsError]()
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [FieldError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RangeError]()
     *   [RequestError]()
     * </pre>
     */
    default void generateSuggestedTargetingInsights(com.google.ads.googleads.v18.services.GenerateSuggestedTargetingInsightsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v18.services.GenerateSuggestedTargetingInsightsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGenerateSuggestedTargetingInsightsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns a collection of audience attributes along with estimates of the
     * overlap between their potential YouTube reach and that of a given input
     * attribute.
     * List of thrown errors:
     *   [AudienceInsightsError]()
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [FieldError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RangeError]()
     *   [RequestError]()
     * </pre>
     */
    default void generateAudienceOverlapInsights(com.google.ads.googleads.v18.services.GenerateAudienceOverlapInsightsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v18.services.GenerateAudienceOverlapInsightsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGenerateAudienceOverlapInsightsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns potential reach metrics for targetable audiences.
     * This method helps answer questions like "How many Men aged 18+ interested
     * in Camping can be reached on YouTube?"
     * List of thrown errors:
     *   [AudienceInsightsError]()
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [FieldError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RangeError]()
     *   [RequestError]()
     * </pre>
     */
    default void generateTargetingSuggestionMetrics(com.google.ads.googleads.v18.services.GenerateTargetingSuggestionMetricsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v18.services.GenerateTargetingSuggestionMetricsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGenerateTargetingSuggestionMetricsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service AudienceInsightsService.
   * <pre>
   * Audience Insights Service helps users find information about groups of
   * people and how they can be reached with Google Ads. Accessible to
   * allowlisted customers only.
   * </pre>
   */
  public static abstract class AudienceInsightsServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return AudienceInsightsServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service AudienceInsightsService.
   * <pre>
   * Audience Insights Service helps users find information about groups of
   * people and how they can be reached with Google Ads. Accessible to
   * allowlisted customers only.
   * </pre>
   */
  public static final class AudienceInsightsServiceStub
      extends io.grpc.stub.AbstractAsyncStub<AudienceInsightsServiceStub> {
    private AudienceInsightsServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AudienceInsightsServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AudienceInsightsServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates a saved report that can be viewed in the Insights Finder tool.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [FieldError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RangeError]()
     *   [RequestError]()
     * </pre>
     */
    public void generateInsightsFinderReport(com.google.ads.googleads.v18.services.GenerateInsightsFinderReportRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v18.services.GenerateInsightsFinderReportResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGenerateInsightsFinderReportMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Searches for audience attributes that can be used to generate insights.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [FieldError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RangeError]()
     *   [RequestError]()
     * </pre>
     */
    public void listAudienceInsightsAttributes(com.google.ads.googleads.v18.services.ListAudienceInsightsAttributesRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v18.services.ListAudienceInsightsAttributesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListAudienceInsightsAttributesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists date ranges for which audience insights data can be requested.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [FieldError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RangeError]()
     *   [RequestError]()
     * </pre>
     */
    public void listInsightsEligibleDates(com.google.ads.googleads.v18.services.ListInsightsEligibleDatesRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v18.services.ListInsightsEligibleDatesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListInsightsEligibleDatesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns a collection of attributes that are represented in an audience of
     * interest, with metrics that compare each attribute's share of the audience
     * with its share of a baseline audience.
     * List of thrown errors:
     *   [AudienceInsightsError]()
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [FieldError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RangeError]()
     *   [RequestError]()
     * </pre>
     */
    public void generateAudienceCompositionInsights(com.google.ads.googleads.v18.services.GenerateAudienceCompositionInsightsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v18.services.GenerateAudienceCompositionInsightsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGenerateAudienceCompositionInsightsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns a collection of targeting insights (e.g. targetable audiences) that
     * are relevant to the requested audience.
     * List of thrown errors:
     *   [AudienceInsightsError]()
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [FieldError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RangeError]()
     *   [RequestError]()
     * </pre>
     */
    public void generateSuggestedTargetingInsights(com.google.ads.googleads.v18.services.GenerateSuggestedTargetingInsightsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v18.services.GenerateSuggestedTargetingInsightsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGenerateSuggestedTargetingInsightsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns a collection of audience attributes along with estimates of the
     * overlap between their potential YouTube reach and that of a given input
     * attribute.
     * List of thrown errors:
     *   [AudienceInsightsError]()
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [FieldError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RangeError]()
     *   [RequestError]()
     * </pre>
     */
    public void generateAudienceOverlapInsights(com.google.ads.googleads.v18.services.GenerateAudienceOverlapInsightsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v18.services.GenerateAudienceOverlapInsightsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGenerateAudienceOverlapInsightsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns potential reach metrics for targetable audiences.
     * This method helps answer questions like "How many Men aged 18+ interested
     * in Camping can be reached on YouTube?"
     * List of thrown errors:
     *   [AudienceInsightsError]()
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [FieldError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RangeError]()
     *   [RequestError]()
     * </pre>
     */
    public void generateTargetingSuggestionMetrics(com.google.ads.googleads.v18.services.GenerateTargetingSuggestionMetricsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v18.services.GenerateTargetingSuggestionMetricsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGenerateTargetingSuggestionMetricsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service AudienceInsightsService.
   * <pre>
   * Audience Insights Service helps users find information about groups of
   * people and how they can be reached with Google Ads. Accessible to
   * allowlisted customers only.
   * </pre>
   */
  public static final class AudienceInsightsServiceBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<AudienceInsightsServiceBlockingV2Stub> {
    private AudienceInsightsServiceBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AudienceInsightsServiceBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AudienceInsightsServiceBlockingV2Stub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates a saved report that can be viewed in the Insights Finder tool.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [FieldError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RangeError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.ads.googleads.v18.services.GenerateInsightsFinderReportResponse generateInsightsFinderReport(com.google.ads.googleads.v18.services.GenerateInsightsFinderReportRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGenerateInsightsFinderReportMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Searches for audience attributes that can be used to generate insights.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [FieldError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RangeError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.ads.googleads.v18.services.ListAudienceInsightsAttributesResponse listAudienceInsightsAttributes(com.google.ads.googleads.v18.services.ListAudienceInsightsAttributesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListAudienceInsightsAttributesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists date ranges for which audience insights data can be requested.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [FieldError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RangeError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.ads.googleads.v18.services.ListInsightsEligibleDatesResponse listInsightsEligibleDates(com.google.ads.googleads.v18.services.ListInsightsEligibleDatesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListInsightsEligibleDatesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns a collection of attributes that are represented in an audience of
     * interest, with metrics that compare each attribute's share of the audience
     * with its share of a baseline audience.
     * List of thrown errors:
     *   [AudienceInsightsError]()
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [FieldError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RangeError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.ads.googleads.v18.services.GenerateAudienceCompositionInsightsResponse generateAudienceCompositionInsights(com.google.ads.googleads.v18.services.GenerateAudienceCompositionInsightsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGenerateAudienceCompositionInsightsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns a collection of targeting insights (e.g. targetable audiences) that
     * are relevant to the requested audience.
     * List of thrown errors:
     *   [AudienceInsightsError]()
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [FieldError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RangeError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.ads.googleads.v18.services.GenerateSuggestedTargetingInsightsResponse generateSuggestedTargetingInsights(com.google.ads.googleads.v18.services.GenerateSuggestedTargetingInsightsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGenerateSuggestedTargetingInsightsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns a collection of audience attributes along with estimates of the
     * overlap between their potential YouTube reach and that of a given input
     * attribute.
     * List of thrown errors:
     *   [AudienceInsightsError]()
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [FieldError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RangeError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.ads.googleads.v18.services.GenerateAudienceOverlapInsightsResponse generateAudienceOverlapInsights(com.google.ads.googleads.v18.services.GenerateAudienceOverlapInsightsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGenerateAudienceOverlapInsightsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns potential reach metrics for targetable audiences.
     * This method helps answer questions like "How many Men aged 18+ interested
     * in Camping can be reached on YouTube?"
     * List of thrown errors:
     *   [AudienceInsightsError]()
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [FieldError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RangeError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.ads.googleads.v18.services.GenerateTargetingSuggestionMetricsResponse generateTargetingSuggestionMetrics(com.google.ads.googleads.v18.services.GenerateTargetingSuggestionMetricsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGenerateTargetingSuggestionMetricsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service AudienceInsightsService.
   * <pre>
   * Audience Insights Service helps users find information about groups of
   * people and how they can be reached with Google Ads. Accessible to
   * allowlisted customers only.
   * </pre>
   */
  public static final class AudienceInsightsServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<AudienceInsightsServiceBlockingStub> {
    private AudienceInsightsServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AudienceInsightsServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AudienceInsightsServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates a saved report that can be viewed in the Insights Finder tool.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [FieldError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RangeError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.ads.googleads.v18.services.GenerateInsightsFinderReportResponse generateInsightsFinderReport(com.google.ads.googleads.v18.services.GenerateInsightsFinderReportRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGenerateInsightsFinderReportMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Searches for audience attributes that can be used to generate insights.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [FieldError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RangeError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.ads.googleads.v18.services.ListAudienceInsightsAttributesResponse listAudienceInsightsAttributes(com.google.ads.googleads.v18.services.ListAudienceInsightsAttributesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListAudienceInsightsAttributesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists date ranges for which audience insights data can be requested.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [FieldError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RangeError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.ads.googleads.v18.services.ListInsightsEligibleDatesResponse listInsightsEligibleDates(com.google.ads.googleads.v18.services.ListInsightsEligibleDatesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListInsightsEligibleDatesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns a collection of attributes that are represented in an audience of
     * interest, with metrics that compare each attribute's share of the audience
     * with its share of a baseline audience.
     * List of thrown errors:
     *   [AudienceInsightsError]()
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [FieldError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RangeError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.ads.googleads.v18.services.GenerateAudienceCompositionInsightsResponse generateAudienceCompositionInsights(com.google.ads.googleads.v18.services.GenerateAudienceCompositionInsightsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGenerateAudienceCompositionInsightsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns a collection of targeting insights (e.g. targetable audiences) that
     * are relevant to the requested audience.
     * List of thrown errors:
     *   [AudienceInsightsError]()
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [FieldError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RangeError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.ads.googleads.v18.services.GenerateSuggestedTargetingInsightsResponse generateSuggestedTargetingInsights(com.google.ads.googleads.v18.services.GenerateSuggestedTargetingInsightsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGenerateSuggestedTargetingInsightsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns a collection of audience attributes along with estimates of the
     * overlap between their potential YouTube reach and that of a given input
     * attribute.
     * List of thrown errors:
     *   [AudienceInsightsError]()
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [FieldError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RangeError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.ads.googleads.v18.services.GenerateAudienceOverlapInsightsResponse generateAudienceOverlapInsights(com.google.ads.googleads.v18.services.GenerateAudienceOverlapInsightsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGenerateAudienceOverlapInsightsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns potential reach metrics for targetable audiences.
     * This method helps answer questions like "How many Men aged 18+ interested
     * in Camping can be reached on YouTube?"
     * List of thrown errors:
     *   [AudienceInsightsError]()
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [FieldError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RangeError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.ads.googleads.v18.services.GenerateTargetingSuggestionMetricsResponse generateTargetingSuggestionMetrics(com.google.ads.googleads.v18.services.GenerateTargetingSuggestionMetricsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGenerateTargetingSuggestionMetricsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service AudienceInsightsService.
   * <pre>
   * Audience Insights Service helps users find information about groups of
   * people and how they can be reached with Google Ads. Accessible to
   * allowlisted customers only.
   * </pre>
   */
  public static final class AudienceInsightsServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<AudienceInsightsServiceFutureStub> {
    private AudienceInsightsServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AudienceInsightsServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AudienceInsightsServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates a saved report that can be viewed in the Insights Finder tool.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [FieldError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RangeError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v18.services.GenerateInsightsFinderReportResponse> generateInsightsFinderReport(
        com.google.ads.googleads.v18.services.GenerateInsightsFinderReportRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGenerateInsightsFinderReportMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Searches for audience attributes that can be used to generate insights.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [FieldError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RangeError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v18.services.ListAudienceInsightsAttributesResponse> listAudienceInsightsAttributes(
        com.google.ads.googleads.v18.services.ListAudienceInsightsAttributesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListAudienceInsightsAttributesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists date ranges for which audience insights data can be requested.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [FieldError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RangeError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v18.services.ListInsightsEligibleDatesResponse> listInsightsEligibleDates(
        com.google.ads.googleads.v18.services.ListInsightsEligibleDatesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListInsightsEligibleDatesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns a collection of attributes that are represented in an audience of
     * interest, with metrics that compare each attribute's share of the audience
     * with its share of a baseline audience.
     * List of thrown errors:
     *   [AudienceInsightsError]()
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [FieldError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RangeError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v18.services.GenerateAudienceCompositionInsightsResponse> generateAudienceCompositionInsights(
        com.google.ads.googleads.v18.services.GenerateAudienceCompositionInsightsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGenerateAudienceCompositionInsightsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns a collection of targeting insights (e.g. targetable audiences) that
     * are relevant to the requested audience.
     * List of thrown errors:
     *   [AudienceInsightsError]()
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [FieldError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RangeError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v18.services.GenerateSuggestedTargetingInsightsResponse> generateSuggestedTargetingInsights(
        com.google.ads.googleads.v18.services.GenerateSuggestedTargetingInsightsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGenerateSuggestedTargetingInsightsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns a collection of audience attributes along with estimates of the
     * overlap between their potential YouTube reach and that of a given input
     * attribute.
     * List of thrown errors:
     *   [AudienceInsightsError]()
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [FieldError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RangeError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v18.services.GenerateAudienceOverlapInsightsResponse> generateAudienceOverlapInsights(
        com.google.ads.googleads.v18.services.GenerateAudienceOverlapInsightsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGenerateAudienceOverlapInsightsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns potential reach metrics for targetable audiences.
     * This method helps answer questions like "How many Men aged 18+ interested
     * in Camping can be reached on YouTube?"
     * List of thrown errors:
     *   [AudienceInsightsError]()
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [FieldError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RangeError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v18.services.GenerateTargetingSuggestionMetricsResponse> generateTargetingSuggestionMetrics(
        com.google.ads.googleads.v18.services.GenerateTargetingSuggestionMetricsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGenerateTargetingSuggestionMetricsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GENERATE_INSIGHTS_FINDER_REPORT = 0;
  private static final int METHODID_LIST_AUDIENCE_INSIGHTS_ATTRIBUTES = 1;
  private static final int METHODID_LIST_INSIGHTS_ELIGIBLE_DATES = 2;
  private static final int METHODID_GENERATE_AUDIENCE_COMPOSITION_INSIGHTS = 3;
  private static final int METHODID_GENERATE_SUGGESTED_TARGETING_INSIGHTS = 4;
  private static final int METHODID_GENERATE_AUDIENCE_OVERLAP_INSIGHTS = 5;
  private static final int METHODID_GENERATE_TARGETING_SUGGESTION_METRICS = 6;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GENERATE_INSIGHTS_FINDER_REPORT:
          serviceImpl.generateInsightsFinderReport((com.google.ads.googleads.v18.services.GenerateInsightsFinderReportRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v18.services.GenerateInsightsFinderReportResponse>) responseObserver);
          break;
        case METHODID_LIST_AUDIENCE_INSIGHTS_ATTRIBUTES:
          serviceImpl.listAudienceInsightsAttributes((com.google.ads.googleads.v18.services.ListAudienceInsightsAttributesRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v18.services.ListAudienceInsightsAttributesResponse>) responseObserver);
          break;
        case METHODID_LIST_INSIGHTS_ELIGIBLE_DATES:
          serviceImpl.listInsightsEligibleDates((com.google.ads.googleads.v18.services.ListInsightsEligibleDatesRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v18.services.ListInsightsEligibleDatesResponse>) responseObserver);
          break;
        case METHODID_GENERATE_AUDIENCE_COMPOSITION_INSIGHTS:
          serviceImpl.generateAudienceCompositionInsights((com.google.ads.googleads.v18.services.GenerateAudienceCompositionInsightsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v18.services.GenerateAudienceCompositionInsightsResponse>) responseObserver);
          break;
        case METHODID_GENERATE_SUGGESTED_TARGETING_INSIGHTS:
          serviceImpl.generateSuggestedTargetingInsights((com.google.ads.googleads.v18.services.GenerateSuggestedTargetingInsightsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v18.services.GenerateSuggestedTargetingInsightsResponse>) responseObserver);
          break;
        case METHODID_GENERATE_AUDIENCE_OVERLAP_INSIGHTS:
          serviceImpl.generateAudienceOverlapInsights((com.google.ads.googleads.v18.services.GenerateAudienceOverlapInsightsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v18.services.GenerateAudienceOverlapInsightsResponse>) responseObserver);
          break;
        case METHODID_GENERATE_TARGETING_SUGGESTION_METRICS:
          serviceImpl.generateTargetingSuggestionMetrics((com.google.ads.googleads.v18.services.GenerateTargetingSuggestionMetricsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v18.services.GenerateTargetingSuggestionMetricsResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getGenerateInsightsFinderReportMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.ads.googleads.v18.services.GenerateInsightsFinderReportRequest,
              com.google.ads.googleads.v18.services.GenerateInsightsFinderReportResponse>(
                service, METHODID_GENERATE_INSIGHTS_FINDER_REPORT)))
        .addMethod(
          getListAudienceInsightsAttributesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.ads.googleads.v18.services.ListAudienceInsightsAttributesRequest,
              com.google.ads.googleads.v18.services.ListAudienceInsightsAttributesResponse>(
                service, METHODID_LIST_AUDIENCE_INSIGHTS_ATTRIBUTES)))
        .addMethod(
          getListInsightsEligibleDatesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.ads.googleads.v18.services.ListInsightsEligibleDatesRequest,
              com.google.ads.googleads.v18.services.ListInsightsEligibleDatesResponse>(
                service, METHODID_LIST_INSIGHTS_ELIGIBLE_DATES)))
        .addMethod(
          getGenerateAudienceCompositionInsightsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.ads.googleads.v18.services.GenerateAudienceCompositionInsightsRequest,
              com.google.ads.googleads.v18.services.GenerateAudienceCompositionInsightsResponse>(
                service, METHODID_GENERATE_AUDIENCE_COMPOSITION_INSIGHTS)))
        .addMethod(
          getGenerateSuggestedTargetingInsightsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.ads.googleads.v18.services.GenerateSuggestedTargetingInsightsRequest,
              com.google.ads.googleads.v18.services.GenerateSuggestedTargetingInsightsResponse>(
                service, METHODID_GENERATE_SUGGESTED_TARGETING_INSIGHTS)))
        .addMethod(
          getGenerateAudienceOverlapInsightsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.ads.googleads.v18.services.GenerateAudienceOverlapInsightsRequest,
              com.google.ads.googleads.v18.services.GenerateAudienceOverlapInsightsResponse>(
                service, METHODID_GENERATE_AUDIENCE_OVERLAP_INSIGHTS)))
        .addMethod(
          getGenerateTargetingSuggestionMetricsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.ads.googleads.v18.services.GenerateTargetingSuggestionMetricsRequest,
              com.google.ads.googleads.v18.services.GenerateTargetingSuggestionMetricsResponse>(
                service, METHODID_GENERATE_TARGETING_SUGGESTION_METRICS)))
        .build();
  }

  private static abstract class AudienceInsightsServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AudienceInsightsServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v18.services.AudienceInsightsServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AudienceInsightsService");
    }
  }

  private static final class AudienceInsightsServiceFileDescriptorSupplier
      extends AudienceInsightsServiceBaseDescriptorSupplier {
    AudienceInsightsServiceFileDescriptorSupplier() {}
  }

  private static final class AudienceInsightsServiceMethodDescriptorSupplier
      extends AudienceInsightsServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    AudienceInsightsServiceMethodDescriptorSupplier(java.lang.String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (AudienceInsightsServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AudienceInsightsServiceFileDescriptorSupplier())
              .addMethod(getGenerateInsightsFinderReportMethod())
              .addMethod(getListAudienceInsightsAttributesMethod())
              .addMethod(getListInsightsEligibleDatesMethod())
              .addMethod(getGenerateAudienceCompositionInsightsMethod())
              .addMethod(getGenerateSuggestedTargetingInsightsMethod())
              .addMethod(getGenerateAudienceOverlapInsightsMethod())
              .addMethod(getGenerateTargetingSuggestionMetricsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
