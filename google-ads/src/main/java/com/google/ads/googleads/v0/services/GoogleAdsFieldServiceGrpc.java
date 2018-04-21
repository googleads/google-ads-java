package com.google.ads.googleads.v0.services;

import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;

/**
 * <pre>
 * Service to fetch Google Ads API fields.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.2.0)",
    comments = "Source: google/ads/googleads/v0/services/google_ads_field_service.proto")
public final class GoogleAdsFieldServiceGrpc {

  private GoogleAdsFieldServiceGrpc() {}

  public static final String SERVICE_NAME = "google.ads.googleads.v0.services.GoogleAdsFieldService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.ads.googleads.v0.services.GetGoogleAdsFieldRequest,
      com.google.ads.googleads.v0.resources.GoogleAdsField> METHOD_GET_GOOGLE_ADS_FIELD =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.ads.googleads.v0.services.GoogleAdsFieldService", "GetGoogleAdsField"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.ads.googleads.v0.services.GetGoogleAdsFieldRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.ads.googleads.v0.resources.GoogleAdsField.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.ads.googleads.v0.services.SearchGoogleAdsFieldsRequest,
      com.google.ads.googleads.v0.services.SearchGoogleAdsFieldsResponse> METHOD_SEARCH_GOOGLE_ADS_FIELDS =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.ads.googleads.v0.services.GoogleAdsFieldService", "SearchGoogleAdsFields"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.ads.googleads.v0.services.SearchGoogleAdsFieldsRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.ads.googleads.v0.services.SearchGoogleAdsFieldsResponse.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static GoogleAdsFieldServiceStub newStub(io.grpc.Channel channel) {
    return new GoogleAdsFieldServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static GoogleAdsFieldServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new GoogleAdsFieldServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static GoogleAdsFieldServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new GoogleAdsFieldServiceFutureStub(channel);
  }

  /**
   * <pre>
   * Service to fetch Google Ads API fields.
   * </pre>
   */
  public static abstract class GoogleAdsFieldServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns just the requested field.
     * </pre>
     */
    public void getGoogleAdsField(com.google.ads.googleads.v0.services.GetGoogleAdsFieldRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v0.resources.GoogleAdsField> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_GOOGLE_ADS_FIELD, responseObserver);
    }

    /**
     * <pre>
     * Returns all fields that match the search query.
     * </pre>
     */
    public void searchGoogleAdsFields(com.google.ads.googleads.v0.services.SearchGoogleAdsFieldsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v0.services.SearchGoogleAdsFieldsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_SEARCH_GOOGLE_ADS_FIELDS, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_GET_GOOGLE_ADS_FIELD,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v0.services.GetGoogleAdsFieldRequest,
                com.google.ads.googleads.v0.resources.GoogleAdsField>(
                  this, METHODID_GET_GOOGLE_ADS_FIELD)))
          .addMethod(
            METHOD_SEARCH_GOOGLE_ADS_FIELDS,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v0.services.SearchGoogleAdsFieldsRequest,
                com.google.ads.googleads.v0.services.SearchGoogleAdsFieldsResponse>(
                  this, METHODID_SEARCH_GOOGLE_ADS_FIELDS)))
          .build();
    }
  }

  /**
   * <pre>
   * Service to fetch Google Ads API fields.
   * </pre>
   */
  public static final class GoogleAdsFieldServiceStub extends io.grpc.stub.AbstractStub<GoogleAdsFieldServiceStub> {
    private GoogleAdsFieldServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GoogleAdsFieldServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GoogleAdsFieldServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GoogleAdsFieldServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns just the requested field.
     * </pre>
     */
    public void getGoogleAdsField(com.google.ads.googleads.v0.services.GetGoogleAdsFieldRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v0.resources.GoogleAdsField> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_GOOGLE_ADS_FIELD, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns all fields that match the search query.
     * </pre>
     */
    public void searchGoogleAdsFields(com.google.ads.googleads.v0.services.SearchGoogleAdsFieldsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v0.services.SearchGoogleAdsFieldsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_SEARCH_GOOGLE_ADS_FIELDS, getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service to fetch Google Ads API fields.
   * </pre>
   */
  public static final class GoogleAdsFieldServiceBlockingStub extends io.grpc.stub.AbstractStub<GoogleAdsFieldServiceBlockingStub> {
    private GoogleAdsFieldServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GoogleAdsFieldServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GoogleAdsFieldServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GoogleAdsFieldServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns just the requested field.
     * </pre>
     */
    public com.google.ads.googleads.v0.resources.GoogleAdsField getGoogleAdsField(com.google.ads.googleads.v0.services.GetGoogleAdsFieldRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_GOOGLE_ADS_FIELD, getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns all fields that match the search query.
     * </pre>
     */
    public com.google.ads.googleads.v0.services.SearchGoogleAdsFieldsResponse searchGoogleAdsFields(com.google.ads.googleads.v0.services.SearchGoogleAdsFieldsRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_SEARCH_GOOGLE_ADS_FIELDS, getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service to fetch Google Ads API fields.
   * </pre>
   */
  public static final class GoogleAdsFieldServiceFutureStub extends io.grpc.stub.AbstractStub<GoogleAdsFieldServiceFutureStub> {
    private GoogleAdsFieldServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GoogleAdsFieldServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GoogleAdsFieldServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GoogleAdsFieldServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns just the requested field.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v0.resources.GoogleAdsField> getGoogleAdsField(
        com.google.ads.googleads.v0.services.GetGoogleAdsFieldRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_GOOGLE_ADS_FIELD, getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns all fields that match the search query.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v0.services.SearchGoogleAdsFieldsResponse> searchGoogleAdsFields(
        com.google.ads.googleads.v0.services.SearchGoogleAdsFieldsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_SEARCH_GOOGLE_ADS_FIELDS, getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_GOOGLE_ADS_FIELD = 0;
  private static final int METHODID_SEARCH_GOOGLE_ADS_FIELDS = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final GoogleAdsFieldServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(GoogleAdsFieldServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_GOOGLE_ADS_FIELD:
          serviceImpl.getGoogleAdsField((com.google.ads.googleads.v0.services.GetGoogleAdsFieldRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v0.resources.GoogleAdsField>) responseObserver);
          break;
        case METHODID_SEARCH_GOOGLE_ADS_FIELDS:
          serviceImpl.searchGoogleAdsFields((com.google.ads.googleads.v0.services.SearchGoogleAdsFieldsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v0.services.SearchGoogleAdsFieldsResponse>) responseObserver);
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

  private static final class GoogleAdsFieldServiceDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v0.services.GoogleAdsFieldServiceProto.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (GoogleAdsFieldServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new GoogleAdsFieldServiceDescriptorSupplier())
              .addMethod(METHOD_GET_GOOGLE_ADS_FIELD)
              .addMethod(METHOD_SEARCH_GOOGLE_ADS_FIELDS)
              .build();
        }
      }
    }
    return result;
  }
}
