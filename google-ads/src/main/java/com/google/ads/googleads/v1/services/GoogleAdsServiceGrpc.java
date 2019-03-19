package com.google.ads.googleads.v1.services;

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
 * Service to fetch data and metrics across resources.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.10.0)",
    comments = "Source: google/ads/googleads/v1/services/google_ads_service.proto")
public final class GoogleAdsServiceGrpc {

  private GoogleAdsServiceGrpc() {}

  public static final String SERVICE_NAME = "google.ads.googleads.v1.services.GoogleAdsService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getSearchMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.google.ads.googleads.v1.services.SearchGoogleAdsRequest,
      com.google.ads.googleads.v1.services.SearchGoogleAdsResponse> METHOD_SEARCH = getSearchMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v1.services.SearchGoogleAdsRequest,
      com.google.ads.googleads.v1.services.SearchGoogleAdsResponse> getSearchMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v1.services.SearchGoogleAdsRequest,
      com.google.ads.googleads.v1.services.SearchGoogleAdsResponse> getSearchMethod() {
    return getSearchMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.google.ads.googleads.v1.services.SearchGoogleAdsRequest,
      com.google.ads.googleads.v1.services.SearchGoogleAdsResponse> getSearchMethodHelper() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v1.services.SearchGoogleAdsRequest, com.google.ads.googleads.v1.services.SearchGoogleAdsResponse> getSearchMethod;
    if ((getSearchMethod = GoogleAdsServiceGrpc.getSearchMethod) == null) {
      synchronized (GoogleAdsServiceGrpc.class) {
        if ((getSearchMethod = GoogleAdsServiceGrpc.getSearchMethod) == null) {
          GoogleAdsServiceGrpc.getSearchMethod = getSearchMethod = 
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v1.services.SearchGoogleAdsRequest, com.google.ads.googleads.v1.services.SearchGoogleAdsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "google.ads.googleads.v1.services.GoogleAdsService", "Search"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v1.services.SearchGoogleAdsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v1.services.SearchGoogleAdsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new GoogleAdsServiceMethodDescriptorSupplier("Search"))
                  .build();
          }
        }
     }
     return getSearchMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getMutateMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.google.ads.googleads.v1.services.MutateGoogleAdsRequest,
      com.google.ads.googleads.v1.services.MutateGoogleAdsResponse> METHOD_MUTATE = getMutateMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v1.services.MutateGoogleAdsRequest,
      com.google.ads.googleads.v1.services.MutateGoogleAdsResponse> getMutateMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v1.services.MutateGoogleAdsRequest,
      com.google.ads.googleads.v1.services.MutateGoogleAdsResponse> getMutateMethod() {
    return getMutateMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.google.ads.googleads.v1.services.MutateGoogleAdsRequest,
      com.google.ads.googleads.v1.services.MutateGoogleAdsResponse> getMutateMethodHelper() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v1.services.MutateGoogleAdsRequest, com.google.ads.googleads.v1.services.MutateGoogleAdsResponse> getMutateMethod;
    if ((getMutateMethod = GoogleAdsServiceGrpc.getMutateMethod) == null) {
      synchronized (GoogleAdsServiceGrpc.class) {
        if ((getMutateMethod = GoogleAdsServiceGrpc.getMutateMethod) == null) {
          GoogleAdsServiceGrpc.getMutateMethod = getMutateMethod = 
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v1.services.MutateGoogleAdsRequest, com.google.ads.googleads.v1.services.MutateGoogleAdsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "google.ads.googleads.v1.services.GoogleAdsService", "Mutate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v1.services.MutateGoogleAdsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v1.services.MutateGoogleAdsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new GoogleAdsServiceMethodDescriptorSupplier("Mutate"))
                  .build();
          }
        }
     }
     return getMutateMethod;
  }

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
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
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
    public void search(com.google.ads.googleads.v1.services.SearchGoogleAdsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v1.services.SearchGoogleAdsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSearchMethodHelper(), responseObserver);
    }

    /**
     * <pre>
     * Creates, updates, or removes resources. Operation statuses are returned.
     * </pre>
     */
    public void mutate(com.google.ads.googleads.v1.services.MutateGoogleAdsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v1.services.MutateGoogleAdsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getMutateMethodHelper(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSearchMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v1.services.SearchGoogleAdsRequest,
                com.google.ads.googleads.v1.services.SearchGoogleAdsResponse>(
                  this, METHODID_SEARCH)))
          .addMethod(
            getMutateMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v1.services.MutateGoogleAdsRequest,
                com.google.ads.googleads.v1.services.MutateGoogleAdsResponse>(
                  this, METHODID_MUTATE)))
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
    public void search(com.google.ads.googleads.v1.services.SearchGoogleAdsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v1.services.SearchGoogleAdsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSearchMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates, updates, or removes resources. Operation statuses are returned.
     * </pre>
     */
    public void mutate(com.google.ads.googleads.v1.services.MutateGoogleAdsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v1.services.MutateGoogleAdsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getMutateMethodHelper(), getCallOptions()), request, responseObserver);
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
    public com.google.ads.googleads.v1.services.SearchGoogleAdsResponse search(com.google.ads.googleads.v1.services.SearchGoogleAdsRequest request) {
      return blockingUnaryCall(
          getChannel(), getSearchMethodHelper(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates, updates, or removes resources. Operation statuses are returned.
     * </pre>
     */
    public com.google.ads.googleads.v1.services.MutateGoogleAdsResponse mutate(com.google.ads.googleads.v1.services.MutateGoogleAdsRequest request) {
      return blockingUnaryCall(
          getChannel(), getMutateMethodHelper(), getCallOptions(), request);
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
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v1.services.SearchGoogleAdsResponse> search(
        com.google.ads.googleads.v1.services.SearchGoogleAdsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSearchMethodHelper(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates, updates, or removes resources. Operation statuses are returned.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v1.services.MutateGoogleAdsResponse> mutate(
        com.google.ads.googleads.v1.services.MutateGoogleAdsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getMutateMethodHelper(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SEARCH = 0;
  private static final int METHODID_MUTATE = 1;

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
          serviceImpl.search((com.google.ads.googleads.v1.services.SearchGoogleAdsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v1.services.SearchGoogleAdsResponse>) responseObserver);
          break;
        case METHODID_MUTATE:
          serviceImpl.mutate((com.google.ads.googleads.v1.services.MutateGoogleAdsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v1.services.MutateGoogleAdsResponse>) responseObserver);
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

  private static abstract class GoogleAdsServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    GoogleAdsServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v1.services.GoogleAdsServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("GoogleAdsService");
    }
  }

  private static final class GoogleAdsServiceFileDescriptorSupplier
      extends GoogleAdsServiceBaseDescriptorSupplier {
    GoogleAdsServiceFileDescriptorSupplier() {}
  }

  private static final class GoogleAdsServiceMethodDescriptorSupplier
      extends GoogleAdsServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    GoogleAdsServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (GoogleAdsServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new GoogleAdsServiceFileDescriptorSupplier())
              .addMethod(getSearchMethodHelper())
              .addMethod(getMutateMethodHelper())
              .build();
        }
      }
    }
    return result;
  }
}
