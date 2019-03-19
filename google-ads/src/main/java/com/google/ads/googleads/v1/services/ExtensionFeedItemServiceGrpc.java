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
 * Service to manage extension feed items.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.10.0)",
    comments = "Source: google/ads/googleads/v1/services/extension_feed_item_service.proto")
public final class ExtensionFeedItemServiceGrpc {

  private ExtensionFeedItemServiceGrpc() {}

  public static final String SERVICE_NAME = "google.ads.googleads.v1.services.ExtensionFeedItemService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGetExtensionFeedItemMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.google.ads.googleads.v1.services.GetExtensionFeedItemRequest,
      com.google.ads.googleads.v1.resources.ExtensionFeedItem> METHOD_GET_EXTENSION_FEED_ITEM = getGetExtensionFeedItemMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v1.services.GetExtensionFeedItemRequest,
      com.google.ads.googleads.v1.resources.ExtensionFeedItem> getGetExtensionFeedItemMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v1.services.GetExtensionFeedItemRequest,
      com.google.ads.googleads.v1.resources.ExtensionFeedItem> getGetExtensionFeedItemMethod() {
    return getGetExtensionFeedItemMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.google.ads.googleads.v1.services.GetExtensionFeedItemRequest,
      com.google.ads.googleads.v1.resources.ExtensionFeedItem> getGetExtensionFeedItemMethodHelper() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v1.services.GetExtensionFeedItemRequest, com.google.ads.googleads.v1.resources.ExtensionFeedItem> getGetExtensionFeedItemMethod;
    if ((getGetExtensionFeedItemMethod = ExtensionFeedItemServiceGrpc.getGetExtensionFeedItemMethod) == null) {
      synchronized (ExtensionFeedItemServiceGrpc.class) {
        if ((getGetExtensionFeedItemMethod = ExtensionFeedItemServiceGrpc.getGetExtensionFeedItemMethod) == null) {
          ExtensionFeedItemServiceGrpc.getGetExtensionFeedItemMethod = getGetExtensionFeedItemMethod = 
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v1.services.GetExtensionFeedItemRequest, com.google.ads.googleads.v1.resources.ExtensionFeedItem>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "google.ads.googleads.v1.services.ExtensionFeedItemService", "GetExtensionFeedItem"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v1.services.GetExtensionFeedItemRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v1.resources.ExtensionFeedItem.getDefaultInstance()))
                  .setSchemaDescriptor(new ExtensionFeedItemServiceMethodDescriptorSupplier("GetExtensionFeedItem"))
                  .build();
          }
        }
     }
     return getGetExtensionFeedItemMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getMutateExtensionFeedItemsMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.google.ads.googleads.v1.services.MutateExtensionFeedItemsRequest,
      com.google.ads.googleads.v1.services.MutateExtensionFeedItemsResponse> METHOD_MUTATE_EXTENSION_FEED_ITEMS = getMutateExtensionFeedItemsMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v1.services.MutateExtensionFeedItemsRequest,
      com.google.ads.googleads.v1.services.MutateExtensionFeedItemsResponse> getMutateExtensionFeedItemsMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v1.services.MutateExtensionFeedItemsRequest,
      com.google.ads.googleads.v1.services.MutateExtensionFeedItemsResponse> getMutateExtensionFeedItemsMethod() {
    return getMutateExtensionFeedItemsMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.google.ads.googleads.v1.services.MutateExtensionFeedItemsRequest,
      com.google.ads.googleads.v1.services.MutateExtensionFeedItemsResponse> getMutateExtensionFeedItemsMethodHelper() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v1.services.MutateExtensionFeedItemsRequest, com.google.ads.googleads.v1.services.MutateExtensionFeedItemsResponse> getMutateExtensionFeedItemsMethod;
    if ((getMutateExtensionFeedItemsMethod = ExtensionFeedItemServiceGrpc.getMutateExtensionFeedItemsMethod) == null) {
      synchronized (ExtensionFeedItemServiceGrpc.class) {
        if ((getMutateExtensionFeedItemsMethod = ExtensionFeedItemServiceGrpc.getMutateExtensionFeedItemsMethod) == null) {
          ExtensionFeedItemServiceGrpc.getMutateExtensionFeedItemsMethod = getMutateExtensionFeedItemsMethod = 
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v1.services.MutateExtensionFeedItemsRequest, com.google.ads.googleads.v1.services.MutateExtensionFeedItemsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "google.ads.googleads.v1.services.ExtensionFeedItemService", "MutateExtensionFeedItems"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v1.services.MutateExtensionFeedItemsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v1.services.MutateExtensionFeedItemsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ExtensionFeedItemServiceMethodDescriptorSupplier("MutateExtensionFeedItems"))
                  .build();
          }
        }
     }
     return getMutateExtensionFeedItemsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ExtensionFeedItemServiceStub newStub(io.grpc.Channel channel) {
    return new ExtensionFeedItemServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ExtensionFeedItemServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ExtensionFeedItemServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ExtensionFeedItemServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ExtensionFeedItemServiceFutureStub(channel);
  }

  /**
   * <pre>
   * Service to manage extension feed items.
   * </pre>
   */
  public static abstract class ExtensionFeedItemServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the requested extension feed item in full detail.
     * </pre>
     */
    public void getExtensionFeedItem(com.google.ads.googleads.v1.services.GetExtensionFeedItemRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v1.resources.ExtensionFeedItem> responseObserver) {
      asyncUnimplementedUnaryCall(getGetExtensionFeedItemMethodHelper(), responseObserver);
    }

    /**
     * <pre>
     * Creates, updates, or removes extension feed items. Operation
     * statuses are returned.
     * </pre>
     */
    public void mutateExtensionFeedItems(com.google.ads.googleads.v1.services.MutateExtensionFeedItemsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v1.services.MutateExtensionFeedItemsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getMutateExtensionFeedItemsMethodHelper(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetExtensionFeedItemMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v1.services.GetExtensionFeedItemRequest,
                com.google.ads.googleads.v1.resources.ExtensionFeedItem>(
                  this, METHODID_GET_EXTENSION_FEED_ITEM)))
          .addMethod(
            getMutateExtensionFeedItemsMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v1.services.MutateExtensionFeedItemsRequest,
                com.google.ads.googleads.v1.services.MutateExtensionFeedItemsResponse>(
                  this, METHODID_MUTATE_EXTENSION_FEED_ITEMS)))
          .build();
    }
  }

  /**
   * <pre>
   * Service to manage extension feed items.
   * </pre>
   */
  public static final class ExtensionFeedItemServiceStub extends io.grpc.stub.AbstractStub<ExtensionFeedItemServiceStub> {
    private ExtensionFeedItemServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ExtensionFeedItemServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ExtensionFeedItemServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ExtensionFeedItemServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested extension feed item in full detail.
     * </pre>
     */
    public void getExtensionFeedItem(com.google.ads.googleads.v1.services.GetExtensionFeedItemRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v1.resources.ExtensionFeedItem> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetExtensionFeedItemMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates, updates, or removes extension feed items. Operation
     * statuses are returned.
     * </pre>
     */
    public void mutateExtensionFeedItems(com.google.ads.googleads.v1.services.MutateExtensionFeedItemsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v1.services.MutateExtensionFeedItemsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getMutateExtensionFeedItemsMethodHelper(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service to manage extension feed items.
   * </pre>
   */
  public static final class ExtensionFeedItemServiceBlockingStub extends io.grpc.stub.AbstractStub<ExtensionFeedItemServiceBlockingStub> {
    private ExtensionFeedItemServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ExtensionFeedItemServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ExtensionFeedItemServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ExtensionFeedItemServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested extension feed item in full detail.
     * </pre>
     */
    public com.google.ads.googleads.v1.resources.ExtensionFeedItem getExtensionFeedItem(com.google.ads.googleads.v1.services.GetExtensionFeedItemRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetExtensionFeedItemMethodHelper(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates, updates, or removes extension feed items. Operation
     * statuses are returned.
     * </pre>
     */
    public com.google.ads.googleads.v1.services.MutateExtensionFeedItemsResponse mutateExtensionFeedItems(com.google.ads.googleads.v1.services.MutateExtensionFeedItemsRequest request) {
      return blockingUnaryCall(
          getChannel(), getMutateExtensionFeedItemsMethodHelper(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service to manage extension feed items.
   * </pre>
   */
  public static final class ExtensionFeedItemServiceFutureStub extends io.grpc.stub.AbstractStub<ExtensionFeedItemServiceFutureStub> {
    private ExtensionFeedItemServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ExtensionFeedItemServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ExtensionFeedItemServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ExtensionFeedItemServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested extension feed item in full detail.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v1.resources.ExtensionFeedItem> getExtensionFeedItem(
        com.google.ads.googleads.v1.services.GetExtensionFeedItemRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetExtensionFeedItemMethodHelper(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates, updates, or removes extension feed items. Operation
     * statuses are returned.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v1.services.MutateExtensionFeedItemsResponse> mutateExtensionFeedItems(
        com.google.ads.googleads.v1.services.MutateExtensionFeedItemsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getMutateExtensionFeedItemsMethodHelper(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_EXTENSION_FEED_ITEM = 0;
  private static final int METHODID_MUTATE_EXTENSION_FEED_ITEMS = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ExtensionFeedItemServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ExtensionFeedItemServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_EXTENSION_FEED_ITEM:
          serviceImpl.getExtensionFeedItem((com.google.ads.googleads.v1.services.GetExtensionFeedItemRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v1.resources.ExtensionFeedItem>) responseObserver);
          break;
        case METHODID_MUTATE_EXTENSION_FEED_ITEMS:
          serviceImpl.mutateExtensionFeedItems((com.google.ads.googleads.v1.services.MutateExtensionFeedItemsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v1.services.MutateExtensionFeedItemsResponse>) responseObserver);
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

  private static abstract class ExtensionFeedItemServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ExtensionFeedItemServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v1.services.ExtensionFeedItemServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ExtensionFeedItemService");
    }
  }

  private static final class ExtensionFeedItemServiceFileDescriptorSupplier
      extends ExtensionFeedItemServiceBaseDescriptorSupplier {
    ExtensionFeedItemServiceFileDescriptorSupplier() {}
  }

  private static final class ExtensionFeedItemServiceMethodDescriptorSupplier
      extends ExtensionFeedItemServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ExtensionFeedItemServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ExtensionFeedItemServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ExtensionFeedItemServiceFileDescriptorSupplier())
              .addMethod(getGetExtensionFeedItemMethodHelper())
              .addMethod(getMutateExtensionFeedItemsMethodHelper())
              .build();
        }
      }
    }
    return result;
  }
}
