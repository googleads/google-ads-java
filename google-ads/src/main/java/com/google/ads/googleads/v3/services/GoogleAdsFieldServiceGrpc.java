package com.google.ads.googleads.v3.services;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 * <pre>
 * Service to fetch Google Ads API fields.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.10.0)",
    comments = "Source: google/ads/googleads/v3/services/google_ads_field_service.proto")
public final class GoogleAdsFieldServiceGrpc {

  private GoogleAdsFieldServiceGrpc() {}

  public static final String SERVICE_NAME = "google.ads.googleads.v3.services.GoogleAdsFieldService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGetGoogleAdsFieldMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.google.ads.googleads.v3.services.GetGoogleAdsFieldRequest,
      com.google.ads.googleads.v3.resources.GoogleAdsField> METHOD_GET_GOOGLE_ADS_FIELD = getGetGoogleAdsFieldMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v3.services.GetGoogleAdsFieldRequest,
      com.google.ads.googleads.v3.resources.GoogleAdsField> getGetGoogleAdsFieldMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v3.services.GetGoogleAdsFieldRequest,
      com.google.ads.googleads.v3.resources.GoogleAdsField> getGetGoogleAdsFieldMethod() {
    return getGetGoogleAdsFieldMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.google.ads.googleads.v3.services.GetGoogleAdsFieldRequest,
      com.google.ads.googleads.v3.resources.GoogleAdsField> getGetGoogleAdsFieldMethodHelper() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v3.services.GetGoogleAdsFieldRequest, com.google.ads.googleads.v3.resources.GoogleAdsField> getGetGoogleAdsFieldMethod;
    if ((getGetGoogleAdsFieldMethod = GoogleAdsFieldServiceGrpc.getGetGoogleAdsFieldMethod) == null) {
      synchronized (GoogleAdsFieldServiceGrpc.class) {
        if ((getGetGoogleAdsFieldMethod = GoogleAdsFieldServiceGrpc.getGetGoogleAdsFieldMethod) == null) {
          GoogleAdsFieldServiceGrpc.getGetGoogleAdsFieldMethod = getGetGoogleAdsFieldMethod = 
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v3.services.GetGoogleAdsFieldRequest, com.google.ads.googleads.v3.resources.GoogleAdsField>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "google.ads.googleads.v3.services.GoogleAdsFieldService", "GetGoogleAdsField"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v3.services.GetGoogleAdsFieldRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v3.resources.GoogleAdsField.getDefaultInstance()))
                  .setSchemaDescriptor(new GoogleAdsFieldServiceMethodDescriptorSupplier("GetGoogleAdsField"))
                  .build();
          }
        }
     }
     return getGetGoogleAdsFieldMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getSearchGoogleAdsFieldsMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.google.ads.googleads.v3.services.SearchGoogleAdsFieldsRequest,
      com.google.ads.googleads.v3.services.SearchGoogleAdsFieldsResponse> METHOD_SEARCH_GOOGLE_ADS_FIELDS = getSearchGoogleAdsFieldsMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v3.services.SearchGoogleAdsFieldsRequest,
      com.google.ads.googleads.v3.services.SearchGoogleAdsFieldsResponse> getSearchGoogleAdsFieldsMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v3.services.SearchGoogleAdsFieldsRequest,
      com.google.ads.googleads.v3.services.SearchGoogleAdsFieldsResponse> getSearchGoogleAdsFieldsMethod() {
    return getSearchGoogleAdsFieldsMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.google.ads.googleads.v3.services.SearchGoogleAdsFieldsRequest,
      com.google.ads.googleads.v3.services.SearchGoogleAdsFieldsResponse> getSearchGoogleAdsFieldsMethodHelper() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v3.services.SearchGoogleAdsFieldsRequest, com.google.ads.googleads.v3.services.SearchGoogleAdsFieldsResponse> getSearchGoogleAdsFieldsMethod;
    if ((getSearchGoogleAdsFieldsMethod = GoogleAdsFieldServiceGrpc.getSearchGoogleAdsFieldsMethod) == null) {
      synchronized (GoogleAdsFieldServiceGrpc.class) {
        if ((getSearchGoogleAdsFieldsMethod = GoogleAdsFieldServiceGrpc.getSearchGoogleAdsFieldsMethod) == null) {
          GoogleAdsFieldServiceGrpc.getSearchGoogleAdsFieldsMethod = getSearchGoogleAdsFieldsMethod = 
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v3.services.SearchGoogleAdsFieldsRequest, com.google.ads.googleads.v3.services.SearchGoogleAdsFieldsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "google.ads.googleads.v3.services.GoogleAdsFieldService", "SearchGoogleAdsFields"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v3.services.SearchGoogleAdsFieldsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v3.services.SearchGoogleAdsFieldsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new GoogleAdsFieldServiceMethodDescriptorSupplier("SearchGoogleAdsFields"))
                  .build();
          }
        }
     }
     return getSearchGoogleAdsFieldsMethod;
  }

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
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
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
    public void getGoogleAdsField(com.google.ads.googleads.v3.services.GetGoogleAdsFieldRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v3.resources.GoogleAdsField> responseObserver) {
      asyncUnimplementedUnaryCall(getGetGoogleAdsFieldMethodHelper(), responseObserver);
    }

    /**
     * <pre>
     * Returns all fields that match the search query.
     * </pre>
     */
    public void searchGoogleAdsFields(com.google.ads.googleads.v3.services.SearchGoogleAdsFieldsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v3.services.SearchGoogleAdsFieldsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSearchGoogleAdsFieldsMethodHelper(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetGoogleAdsFieldMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v3.services.GetGoogleAdsFieldRequest,
                com.google.ads.googleads.v3.resources.GoogleAdsField>(
                  this, METHODID_GET_GOOGLE_ADS_FIELD)))
          .addMethod(
            getSearchGoogleAdsFieldsMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v3.services.SearchGoogleAdsFieldsRequest,
                com.google.ads.googleads.v3.services.SearchGoogleAdsFieldsResponse>(
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
    public void getGoogleAdsField(com.google.ads.googleads.v3.services.GetGoogleAdsFieldRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v3.resources.GoogleAdsField> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetGoogleAdsFieldMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns all fields that match the search query.
     * </pre>
     */
    public void searchGoogleAdsFields(com.google.ads.googleads.v3.services.SearchGoogleAdsFieldsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v3.services.SearchGoogleAdsFieldsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSearchGoogleAdsFieldsMethodHelper(), getCallOptions()), request, responseObserver);
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
    public com.google.ads.googleads.v3.resources.GoogleAdsField getGoogleAdsField(com.google.ads.googleads.v3.services.GetGoogleAdsFieldRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetGoogleAdsFieldMethodHelper(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns all fields that match the search query.
     * </pre>
     */
    public com.google.ads.googleads.v3.services.SearchGoogleAdsFieldsResponse searchGoogleAdsFields(com.google.ads.googleads.v3.services.SearchGoogleAdsFieldsRequest request) {
      return blockingUnaryCall(
          getChannel(), getSearchGoogleAdsFieldsMethodHelper(), getCallOptions(), request);
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
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v3.resources.GoogleAdsField> getGoogleAdsField(
        com.google.ads.googleads.v3.services.GetGoogleAdsFieldRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetGoogleAdsFieldMethodHelper(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns all fields that match the search query.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v3.services.SearchGoogleAdsFieldsResponse> searchGoogleAdsFields(
        com.google.ads.googleads.v3.services.SearchGoogleAdsFieldsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSearchGoogleAdsFieldsMethodHelper(), getCallOptions()), request);
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
          serviceImpl.getGoogleAdsField((com.google.ads.googleads.v3.services.GetGoogleAdsFieldRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v3.resources.GoogleAdsField>) responseObserver);
          break;
        case METHODID_SEARCH_GOOGLE_ADS_FIELDS:
          serviceImpl.searchGoogleAdsFields((com.google.ads.googleads.v3.services.SearchGoogleAdsFieldsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v3.services.SearchGoogleAdsFieldsResponse>) responseObserver);
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

  private static abstract class GoogleAdsFieldServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    GoogleAdsFieldServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v3.services.GoogleAdsFieldServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("GoogleAdsFieldService");
    }
  }

  private static final class GoogleAdsFieldServiceFileDescriptorSupplier
      extends GoogleAdsFieldServiceBaseDescriptorSupplier {
    GoogleAdsFieldServiceFileDescriptorSupplier() {}
  }

  private static final class GoogleAdsFieldServiceMethodDescriptorSupplier
      extends GoogleAdsFieldServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    GoogleAdsFieldServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (GoogleAdsFieldServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new GoogleAdsFieldServiceFileDescriptorSupplier())
              .addMethod(getGetGoogleAdsFieldMethodHelper())
              .addMethod(getSearchGoogleAdsFieldsMethodHelper())
              .build();
        }
      }
    }
    return result;
  }
}
