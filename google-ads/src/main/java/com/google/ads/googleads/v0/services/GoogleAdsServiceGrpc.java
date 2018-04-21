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
 * Service to fetch data and metrics across resources.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.2.0)",
    comments = "Source: google/ads/googleads/v0/services/google_ads_service.proto")
public final class GoogleAdsServiceGrpc {

  private GoogleAdsServiceGrpc() {}

  public static final String SERVICE_NAME = "google.ads.googleads.v0.services.GoogleAdsService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.ads.googleads.v0.services.SearchGoogleAdsRequest,
      com.google.ads.googleads.v0.services.SearchGoogleAdsResponse> METHOD_SEARCH =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.ads.googleads.v0.services.GoogleAdsService", "Search"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.ads.googleads.v0.services.SearchGoogleAdsRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.ads.googleads.v0.services.SearchGoogleAdsResponse.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static GoogleAdsServiceStub newStub(io.grpc.Channel channel) {
    return new GoogleAdsServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static GoogleAdsServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new GoogleAdsServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static GoogleAdsServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new GoogleAdsServiceFutureStub(channel);
  }

  /**
   * <pre>
   * Service to fetch data and metrics across resources.
   * </pre>
   */
  public static abstract class GoogleAdsServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns all rows that match the search query.
     * </pre>
     */
    public void search(com.google.ads.googleads.v0.services.SearchGoogleAdsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v0.services.SearchGoogleAdsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_SEARCH, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_SEARCH,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v0.services.SearchGoogleAdsRequest,
                com.google.ads.googleads.v0.services.SearchGoogleAdsResponse>(
                  this, METHODID_SEARCH)))
          .build();
    }
  }

  /**
   * <pre>
   * Service to fetch data and metrics across resources.
   * </pre>
   */
  public static final class GoogleAdsServiceStub extends io.grpc.stub.AbstractStub<GoogleAdsServiceStub> {
    private GoogleAdsServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GoogleAdsServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GoogleAdsServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GoogleAdsServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns all rows that match the search query.
     * </pre>
     */
    public void search(com.google.ads.googleads.v0.services.SearchGoogleAdsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v0.services.SearchGoogleAdsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_SEARCH, getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service to fetch data and metrics across resources.
   * </pre>
   */
  public static final class GoogleAdsServiceBlockingStub extends io.grpc.stub.AbstractStub<GoogleAdsServiceBlockingStub> {
    private GoogleAdsServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GoogleAdsServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GoogleAdsServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GoogleAdsServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns all rows that match the search query.
     * </pre>
     */
    public com.google.ads.googleads.v0.services.SearchGoogleAdsResponse search(com.google.ads.googleads.v0.services.SearchGoogleAdsRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_SEARCH, getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service to fetch data and metrics across resources.
   * </pre>
   */
  public static final class GoogleAdsServiceFutureStub extends io.grpc.stub.AbstractStub<GoogleAdsServiceFutureStub> {
    private GoogleAdsServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GoogleAdsServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GoogleAdsServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GoogleAdsServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns all rows that match the search query.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v0.services.SearchGoogleAdsResponse> search(
        com.google.ads.googleads.v0.services.SearchGoogleAdsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_SEARCH, getCallOptions()), request);
    }
  }

  private static final int METHODID_SEARCH = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final GoogleAdsServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(GoogleAdsServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SEARCH:
          serviceImpl.search((com.google.ads.googleads.v0.services.SearchGoogleAdsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v0.services.SearchGoogleAdsResponse>) responseObserver);
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

  private static final class GoogleAdsServiceDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v0.services.GoogleAdsServiceProto.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (GoogleAdsServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new GoogleAdsServiceDescriptorSupplier())
              .addMethod(METHOD_SEARCH)
              .build();
        }
      }
    }
    return result;
  }
}
