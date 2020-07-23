package com.google.ads.googleads.v4.services;

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
    value = "by gRPC proto compiler",
    comments = "Source: google/ads/googleads/v4/services/google_ads_field_service.proto")
public final class GoogleAdsFieldServiceGrpc {

  private GoogleAdsFieldServiceGrpc() {}

  public static final String SERVICE_NAME = "google.ads.googleads.v4.services.GoogleAdsFieldService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v4.services.GetGoogleAdsFieldRequest,
      com.google.ads.googleads.v4.resources.GoogleAdsField> getGetGoogleAdsFieldMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetGoogleAdsField",
      requestType = com.google.ads.googleads.v4.services.GetGoogleAdsFieldRequest.class,
      responseType = com.google.ads.googleads.v4.resources.GoogleAdsField.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v4.services.GetGoogleAdsFieldRequest,
      com.google.ads.googleads.v4.resources.GoogleAdsField> getGetGoogleAdsFieldMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v4.services.GetGoogleAdsFieldRequest, com.google.ads.googleads.v4.resources.GoogleAdsField> getGetGoogleAdsFieldMethod;
    if ((getGetGoogleAdsFieldMethod = GoogleAdsFieldServiceGrpc.getGetGoogleAdsFieldMethod) == null) {
      synchronized (GoogleAdsFieldServiceGrpc.class) {
        if ((getGetGoogleAdsFieldMethod = GoogleAdsFieldServiceGrpc.getGetGoogleAdsFieldMethod) == null) {
          GoogleAdsFieldServiceGrpc.getGetGoogleAdsFieldMethod = getGetGoogleAdsFieldMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v4.services.GetGoogleAdsFieldRequest, com.google.ads.googleads.v4.resources.GoogleAdsField>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetGoogleAdsField"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v4.services.GetGoogleAdsFieldRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v4.resources.GoogleAdsField.getDefaultInstance()))
              .setSchemaDescriptor(new GoogleAdsFieldServiceMethodDescriptorSupplier("GetGoogleAdsField"))
              .build();
        }
      }
    }
    return getGetGoogleAdsFieldMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v4.services.SearchGoogleAdsFieldsRequest,
      com.google.ads.googleads.v4.services.SearchGoogleAdsFieldsResponse> getSearchGoogleAdsFieldsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SearchGoogleAdsFields",
      requestType = com.google.ads.googleads.v4.services.SearchGoogleAdsFieldsRequest.class,
      responseType = com.google.ads.googleads.v4.services.SearchGoogleAdsFieldsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v4.services.SearchGoogleAdsFieldsRequest,
      com.google.ads.googleads.v4.services.SearchGoogleAdsFieldsResponse> getSearchGoogleAdsFieldsMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v4.services.SearchGoogleAdsFieldsRequest, com.google.ads.googleads.v4.services.SearchGoogleAdsFieldsResponse> getSearchGoogleAdsFieldsMethod;
    if ((getSearchGoogleAdsFieldsMethod = GoogleAdsFieldServiceGrpc.getSearchGoogleAdsFieldsMethod) == null) {
      synchronized (GoogleAdsFieldServiceGrpc.class) {
        if ((getSearchGoogleAdsFieldsMethod = GoogleAdsFieldServiceGrpc.getSearchGoogleAdsFieldsMethod) == null) {
          GoogleAdsFieldServiceGrpc.getSearchGoogleAdsFieldsMethod = getSearchGoogleAdsFieldsMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v4.services.SearchGoogleAdsFieldsRequest, com.google.ads.googleads.v4.services.SearchGoogleAdsFieldsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SearchGoogleAdsFields"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v4.services.SearchGoogleAdsFieldsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v4.services.SearchGoogleAdsFieldsResponse.getDefaultInstance()))
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
    io.grpc.stub.AbstractStub.StubFactory<GoogleAdsFieldServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GoogleAdsFieldServiceStub>() {
        @java.lang.Override
        public GoogleAdsFieldServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GoogleAdsFieldServiceStub(channel, callOptions);
        }
      };
    return GoogleAdsFieldServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static GoogleAdsFieldServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GoogleAdsFieldServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GoogleAdsFieldServiceBlockingStub>() {
        @java.lang.Override
        public GoogleAdsFieldServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GoogleAdsFieldServiceBlockingStub(channel, callOptions);
        }
      };
    return GoogleAdsFieldServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static GoogleAdsFieldServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GoogleAdsFieldServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GoogleAdsFieldServiceFutureStub>() {
        @java.lang.Override
        public GoogleAdsFieldServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GoogleAdsFieldServiceFutureStub(channel, callOptions);
        }
      };
    return GoogleAdsFieldServiceFutureStub.newStub(factory, channel);
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
    public void getGoogleAdsField(com.google.ads.googleads.v4.services.GetGoogleAdsFieldRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v4.resources.GoogleAdsField> responseObserver) {
      asyncUnimplementedUnaryCall(getGetGoogleAdsFieldMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns all fields that match the search query.
     * </pre>
     */
    public void searchGoogleAdsFields(com.google.ads.googleads.v4.services.SearchGoogleAdsFieldsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v4.services.SearchGoogleAdsFieldsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSearchGoogleAdsFieldsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetGoogleAdsFieldMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v4.services.GetGoogleAdsFieldRequest,
                com.google.ads.googleads.v4.resources.GoogleAdsField>(
                  this, METHODID_GET_GOOGLE_ADS_FIELD)))
          .addMethod(
            getSearchGoogleAdsFieldsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v4.services.SearchGoogleAdsFieldsRequest,
                com.google.ads.googleads.v4.services.SearchGoogleAdsFieldsResponse>(
                  this, METHODID_SEARCH_GOOGLE_ADS_FIELDS)))
          .build();
    }
  }

  /**
   * <pre>
   * Service to fetch Google Ads API fields.
   * </pre>
   */
  public static final class GoogleAdsFieldServiceStub extends io.grpc.stub.AbstractAsyncStub<GoogleAdsFieldServiceStub> {
    private GoogleAdsFieldServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GoogleAdsFieldServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GoogleAdsFieldServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns just the requested field.
     * </pre>
     */
    public void getGoogleAdsField(com.google.ads.googleads.v4.services.GetGoogleAdsFieldRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v4.resources.GoogleAdsField> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetGoogleAdsFieldMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns all fields that match the search query.
     * </pre>
     */
    public void searchGoogleAdsFields(com.google.ads.googleads.v4.services.SearchGoogleAdsFieldsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v4.services.SearchGoogleAdsFieldsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSearchGoogleAdsFieldsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service to fetch Google Ads API fields.
   * </pre>
   */
  public static final class GoogleAdsFieldServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<GoogleAdsFieldServiceBlockingStub> {
    private GoogleAdsFieldServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GoogleAdsFieldServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GoogleAdsFieldServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns just the requested field.
     * </pre>
     */
    public com.google.ads.googleads.v4.resources.GoogleAdsField getGoogleAdsField(com.google.ads.googleads.v4.services.GetGoogleAdsFieldRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetGoogleAdsFieldMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns all fields that match the search query.
     * </pre>
     */
    public com.google.ads.googleads.v4.services.SearchGoogleAdsFieldsResponse searchGoogleAdsFields(com.google.ads.googleads.v4.services.SearchGoogleAdsFieldsRequest request) {
      return blockingUnaryCall(
          getChannel(), getSearchGoogleAdsFieldsMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service to fetch Google Ads API fields.
   * </pre>
   */
  public static final class GoogleAdsFieldServiceFutureStub extends io.grpc.stub.AbstractFutureStub<GoogleAdsFieldServiceFutureStub> {
    private GoogleAdsFieldServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GoogleAdsFieldServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GoogleAdsFieldServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns just the requested field.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v4.resources.GoogleAdsField> getGoogleAdsField(
        com.google.ads.googleads.v4.services.GetGoogleAdsFieldRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetGoogleAdsFieldMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns all fields that match the search query.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v4.services.SearchGoogleAdsFieldsResponse> searchGoogleAdsFields(
        com.google.ads.googleads.v4.services.SearchGoogleAdsFieldsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSearchGoogleAdsFieldsMethod(), getCallOptions()), request);
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
          serviceImpl.getGoogleAdsField((com.google.ads.googleads.v4.services.GetGoogleAdsFieldRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v4.resources.GoogleAdsField>) responseObserver);
          break;
        case METHODID_SEARCH_GOOGLE_ADS_FIELDS:
          serviceImpl.searchGoogleAdsFields((com.google.ads.googleads.v4.services.SearchGoogleAdsFieldsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v4.services.SearchGoogleAdsFieldsResponse>) responseObserver);
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
      return com.google.ads.googleads.v4.services.GoogleAdsFieldServiceProto.getDescriptor();
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
              .addMethod(getGetGoogleAdsFieldMethod())
              .addMethod(getSearchGoogleAdsFieldsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
