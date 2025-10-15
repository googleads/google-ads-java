package com.google.ads.googleads.v22.services;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * This service allows management of data links between  a Google
 * Ads customer and another data entity.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/ads/googleads/v22/services/data_link_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class DataLinkServiceGrpc {

  private DataLinkServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "google.ads.googleads.v22.services.DataLinkService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v22.services.CreateDataLinkRequest,
      com.google.ads.googleads.v22.services.CreateDataLinkResponse> getCreateDataLinkMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateDataLink",
      requestType = com.google.ads.googleads.v22.services.CreateDataLinkRequest.class,
      responseType = com.google.ads.googleads.v22.services.CreateDataLinkResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v22.services.CreateDataLinkRequest,
      com.google.ads.googleads.v22.services.CreateDataLinkResponse> getCreateDataLinkMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v22.services.CreateDataLinkRequest, com.google.ads.googleads.v22.services.CreateDataLinkResponse> getCreateDataLinkMethod;
    if ((getCreateDataLinkMethod = DataLinkServiceGrpc.getCreateDataLinkMethod) == null) {
      synchronized (DataLinkServiceGrpc.class) {
        if ((getCreateDataLinkMethod = DataLinkServiceGrpc.getCreateDataLinkMethod) == null) {
          DataLinkServiceGrpc.getCreateDataLinkMethod = getCreateDataLinkMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v22.services.CreateDataLinkRequest, com.google.ads.googleads.v22.services.CreateDataLinkResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateDataLink"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v22.services.CreateDataLinkRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v22.services.CreateDataLinkResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DataLinkServiceMethodDescriptorSupplier("CreateDataLink"))
              .build();
        }
      }
    }
    return getCreateDataLinkMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v22.services.RemoveDataLinkRequest,
      com.google.ads.googleads.v22.services.RemoveDataLinkResponse> getRemoveDataLinkMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RemoveDataLink",
      requestType = com.google.ads.googleads.v22.services.RemoveDataLinkRequest.class,
      responseType = com.google.ads.googleads.v22.services.RemoveDataLinkResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v22.services.RemoveDataLinkRequest,
      com.google.ads.googleads.v22.services.RemoveDataLinkResponse> getRemoveDataLinkMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v22.services.RemoveDataLinkRequest, com.google.ads.googleads.v22.services.RemoveDataLinkResponse> getRemoveDataLinkMethod;
    if ((getRemoveDataLinkMethod = DataLinkServiceGrpc.getRemoveDataLinkMethod) == null) {
      synchronized (DataLinkServiceGrpc.class) {
        if ((getRemoveDataLinkMethod = DataLinkServiceGrpc.getRemoveDataLinkMethod) == null) {
          DataLinkServiceGrpc.getRemoveDataLinkMethod = getRemoveDataLinkMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v22.services.RemoveDataLinkRequest, com.google.ads.googleads.v22.services.RemoveDataLinkResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RemoveDataLink"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v22.services.RemoveDataLinkRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v22.services.RemoveDataLinkResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DataLinkServiceMethodDescriptorSupplier("RemoveDataLink"))
              .build();
        }
      }
    }
    return getRemoveDataLinkMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v22.services.UpdateDataLinkRequest,
      com.google.ads.googleads.v22.services.UpdateDataLinkResponse> getUpdateDataLinkMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateDataLink",
      requestType = com.google.ads.googleads.v22.services.UpdateDataLinkRequest.class,
      responseType = com.google.ads.googleads.v22.services.UpdateDataLinkResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v22.services.UpdateDataLinkRequest,
      com.google.ads.googleads.v22.services.UpdateDataLinkResponse> getUpdateDataLinkMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v22.services.UpdateDataLinkRequest, com.google.ads.googleads.v22.services.UpdateDataLinkResponse> getUpdateDataLinkMethod;
    if ((getUpdateDataLinkMethod = DataLinkServiceGrpc.getUpdateDataLinkMethod) == null) {
      synchronized (DataLinkServiceGrpc.class) {
        if ((getUpdateDataLinkMethod = DataLinkServiceGrpc.getUpdateDataLinkMethod) == null) {
          DataLinkServiceGrpc.getUpdateDataLinkMethod = getUpdateDataLinkMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v22.services.UpdateDataLinkRequest, com.google.ads.googleads.v22.services.UpdateDataLinkResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateDataLink"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v22.services.UpdateDataLinkRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v22.services.UpdateDataLinkResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DataLinkServiceMethodDescriptorSupplier("UpdateDataLink"))
              .build();
        }
      }
    }
    return getUpdateDataLinkMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DataLinkServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DataLinkServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DataLinkServiceStub>() {
        @java.lang.Override
        public DataLinkServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DataLinkServiceStub(channel, callOptions);
        }
      };
    return DataLinkServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static DataLinkServiceBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DataLinkServiceBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DataLinkServiceBlockingV2Stub>() {
        @java.lang.Override
        public DataLinkServiceBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DataLinkServiceBlockingV2Stub(channel, callOptions);
        }
      };
    return DataLinkServiceBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DataLinkServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DataLinkServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DataLinkServiceBlockingStub>() {
        @java.lang.Override
        public DataLinkServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DataLinkServiceBlockingStub(channel, callOptions);
        }
      };
    return DataLinkServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DataLinkServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DataLinkServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DataLinkServiceFutureStub>() {
        @java.lang.Override
        public DataLinkServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DataLinkServiceFutureStub(channel, callOptions);
        }
      };
    return DataLinkServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * This service allows management of data links between  a Google
   * Ads customer and another data entity.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Creates a data link. The requesting Google Ads account name and account ID
     * will be shared with the third party (such as YouTube creators for video
     * links) to whom you are creating the link with. Only customers on the
     * allow-list can create data links.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [DatabaseError]()
     *   [DataLinkError]()
     *   [FieldError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [MutateError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    default void createDataLink(com.google.ads.googleads.v22.services.CreateDataLinkRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v22.services.CreateDataLinkResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateDataLinkMethod(), responseObserver);
    }

    /**
     * <pre>
     * Remove a data link.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [DatabaseError]()
     *   [DataLinkError]()
     *   [FieldError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [MutateError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    default void removeDataLink(com.google.ads.googleads.v22.services.RemoveDataLinkRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v22.services.RemoveDataLinkResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRemoveDataLinkMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update a data link.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [DatabaseError]()
     *   [DataLinkError]()
     *   [FieldError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [MutateError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    default void updateDataLink(com.google.ads.googleads.v22.services.UpdateDataLinkRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v22.services.UpdateDataLinkResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateDataLinkMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service DataLinkService.
   * <pre>
   * This service allows management of data links between  a Google
   * Ads customer and another data entity.
   * </pre>
   */
  public static abstract class DataLinkServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return DataLinkServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service DataLinkService.
   * <pre>
   * This service allows management of data links between  a Google
   * Ads customer and another data entity.
   * </pre>
   */
  public static final class DataLinkServiceStub
      extends io.grpc.stub.AbstractAsyncStub<DataLinkServiceStub> {
    private DataLinkServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DataLinkServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DataLinkServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates a data link. The requesting Google Ads account name and account ID
     * will be shared with the third party (such as YouTube creators for video
     * links) to whom you are creating the link with. Only customers on the
     * allow-list can create data links.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [DatabaseError]()
     *   [DataLinkError]()
     *   [FieldError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [MutateError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public void createDataLink(com.google.ads.googleads.v22.services.CreateDataLinkRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v22.services.CreateDataLinkResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateDataLinkMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Remove a data link.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [DatabaseError]()
     *   [DataLinkError]()
     *   [FieldError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [MutateError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public void removeDataLink(com.google.ads.googleads.v22.services.RemoveDataLinkRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v22.services.RemoveDataLinkResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRemoveDataLinkMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update a data link.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [DatabaseError]()
     *   [DataLinkError]()
     *   [FieldError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [MutateError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public void updateDataLink(com.google.ads.googleads.v22.services.UpdateDataLinkRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v22.services.UpdateDataLinkResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateDataLinkMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service DataLinkService.
   * <pre>
   * This service allows management of data links between  a Google
   * Ads customer and another data entity.
   * </pre>
   */
  public static final class DataLinkServiceBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<DataLinkServiceBlockingV2Stub> {
    private DataLinkServiceBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DataLinkServiceBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DataLinkServiceBlockingV2Stub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates a data link. The requesting Google Ads account name and account ID
     * will be shared with the third party (such as YouTube creators for video
     * links) to whom you are creating the link with. Only customers on the
     * allow-list can create data links.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [DatabaseError]()
     *   [DataLinkError]()
     *   [FieldError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [MutateError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.ads.googleads.v22.services.CreateDataLinkResponse createDataLink(com.google.ads.googleads.v22.services.CreateDataLinkRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateDataLinkMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Remove a data link.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [DatabaseError]()
     *   [DataLinkError]()
     *   [FieldError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [MutateError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.ads.googleads.v22.services.RemoveDataLinkResponse removeDataLink(com.google.ads.googleads.v22.services.RemoveDataLinkRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRemoveDataLinkMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update a data link.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [DatabaseError]()
     *   [DataLinkError]()
     *   [FieldError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [MutateError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.ads.googleads.v22.services.UpdateDataLinkResponse updateDataLink(com.google.ads.googleads.v22.services.UpdateDataLinkRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateDataLinkMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service DataLinkService.
   * <pre>
   * This service allows management of data links between  a Google
   * Ads customer and another data entity.
   * </pre>
   */
  public static final class DataLinkServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<DataLinkServiceBlockingStub> {
    private DataLinkServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DataLinkServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DataLinkServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates a data link. The requesting Google Ads account name and account ID
     * will be shared with the third party (such as YouTube creators for video
     * links) to whom you are creating the link with. Only customers on the
     * allow-list can create data links.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [DatabaseError]()
     *   [DataLinkError]()
     *   [FieldError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [MutateError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.ads.googleads.v22.services.CreateDataLinkResponse createDataLink(com.google.ads.googleads.v22.services.CreateDataLinkRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateDataLinkMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Remove a data link.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [DatabaseError]()
     *   [DataLinkError]()
     *   [FieldError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [MutateError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.ads.googleads.v22.services.RemoveDataLinkResponse removeDataLink(com.google.ads.googleads.v22.services.RemoveDataLinkRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRemoveDataLinkMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update a data link.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [DatabaseError]()
     *   [DataLinkError]()
     *   [FieldError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [MutateError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.ads.googleads.v22.services.UpdateDataLinkResponse updateDataLink(com.google.ads.googleads.v22.services.UpdateDataLinkRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateDataLinkMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service DataLinkService.
   * <pre>
   * This service allows management of data links between  a Google
   * Ads customer and another data entity.
   * </pre>
   */
  public static final class DataLinkServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<DataLinkServiceFutureStub> {
    private DataLinkServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DataLinkServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DataLinkServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates a data link. The requesting Google Ads account name and account ID
     * will be shared with the third party (such as YouTube creators for video
     * links) to whom you are creating the link with. Only customers on the
     * allow-list can create data links.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [DatabaseError]()
     *   [DataLinkError]()
     *   [FieldError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [MutateError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v22.services.CreateDataLinkResponse> createDataLink(
        com.google.ads.googleads.v22.services.CreateDataLinkRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateDataLinkMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Remove a data link.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [DatabaseError]()
     *   [DataLinkError]()
     *   [FieldError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [MutateError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v22.services.RemoveDataLinkResponse> removeDataLink(
        com.google.ads.googleads.v22.services.RemoveDataLinkRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRemoveDataLinkMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Update a data link.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [DatabaseError]()
     *   [DataLinkError]()
     *   [FieldError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [MutateError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v22.services.UpdateDataLinkResponse> updateDataLink(
        com.google.ads.googleads.v22.services.UpdateDataLinkRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateDataLinkMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_DATA_LINK = 0;
  private static final int METHODID_REMOVE_DATA_LINK = 1;
  private static final int METHODID_UPDATE_DATA_LINK = 2;

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
        case METHODID_CREATE_DATA_LINK:
          serviceImpl.createDataLink((com.google.ads.googleads.v22.services.CreateDataLinkRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v22.services.CreateDataLinkResponse>) responseObserver);
          break;
        case METHODID_REMOVE_DATA_LINK:
          serviceImpl.removeDataLink((com.google.ads.googleads.v22.services.RemoveDataLinkRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v22.services.RemoveDataLinkResponse>) responseObserver);
          break;
        case METHODID_UPDATE_DATA_LINK:
          serviceImpl.updateDataLink((com.google.ads.googleads.v22.services.UpdateDataLinkRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v22.services.UpdateDataLinkResponse>) responseObserver);
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
          getCreateDataLinkMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.ads.googleads.v22.services.CreateDataLinkRequest,
              com.google.ads.googleads.v22.services.CreateDataLinkResponse>(
                service, METHODID_CREATE_DATA_LINK)))
        .addMethod(
          getRemoveDataLinkMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.ads.googleads.v22.services.RemoveDataLinkRequest,
              com.google.ads.googleads.v22.services.RemoveDataLinkResponse>(
                service, METHODID_REMOVE_DATA_LINK)))
        .addMethod(
          getUpdateDataLinkMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.ads.googleads.v22.services.UpdateDataLinkRequest,
              com.google.ads.googleads.v22.services.UpdateDataLinkResponse>(
                service, METHODID_UPDATE_DATA_LINK)))
        .build();
  }

  private static abstract class DataLinkServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    DataLinkServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v22.services.DataLinkServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("DataLinkService");
    }
  }

  private static final class DataLinkServiceFileDescriptorSupplier
      extends DataLinkServiceBaseDescriptorSupplier {
    DataLinkServiceFileDescriptorSupplier() {}
  }

  private static final class DataLinkServiceMethodDescriptorSupplier
      extends DataLinkServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    DataLinkServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (DataLinkServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new DataLinkServiceFileDescriptorSupplier())
              .addMethod(getCreateDataLinkMethod())
              .addMethod(getRemoveDataLinkMethod())
              .addMethod(getUpdateDataLinkMethod())
              .build();
        }
      }
    }
    return result;
  }
}
