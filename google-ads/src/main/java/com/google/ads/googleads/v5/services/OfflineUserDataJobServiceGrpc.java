package com.google.ads.googleads.v5.services;

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
 * Service to manage offline user data jobs.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/ads/googleads/v5/services/offline_user_data_job_service.proto")
public final class OfflineUserDataJobServiceGrpc {

  private OfflineUserDataJobServiceGrpc() {}

  public static final String SERVICE_NAME = "google.ads.googleads.v5.services.OfflineUserDataJobService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v5.services.CreateOfflineUserDataJobRequest,
      com.google.ads.googleads.v5.services.CreateOfflineUserDataJobResponse> getCreateOfflineUserDataJobMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateOfflineUserDataJob",
      requestType = com.google.ads.googleads.v5.services.CreateOfflineUserDataJobRequest.class,
      responseType = com.google.ads.googleads.v5.services.CreateOfflineUserDataJobResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v5.services.CreateOfflineUserDataJobRequest,
      com.google.ads.googleads.v5.services.CreateOfflineUserDataJobResponse> getCreateOfflineUserDataJobMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v5.services.CreateOfflineUserDataJobRequest, com.google.ads.googleads.v5.services.CreateOfflineUserDataJobResponse> getCreateOfflineUserDataJobMethod;
    if ((getCreateOfflineUserDataJobMethod = OfflineUserDataJobServiceGrpc.getCreateOfflineUserDataJobMethod) == null) {
      synchronized (OfflineUserDataJobServiceGrpc.class) {
        if ((getCreateOfflineUserDataJobMethod = OfflineUserDataJobServiceGrpc.getCreateOfflineUserDataJobMethod) == null) {
          OfflineUserDataJobServiceGrpc.getCreateOfflineUserDataJobMethod = getCreateOfflineUserDataJobMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v5.services.CreateOfflineUserDataJobRequest, com.google.ads.googleads.v5.services.CreateOfflineUserDataJobResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateOfflineUserDataJob"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v5.services.CreateOfflineUserDataJobRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v5.services.CreateOfflineUserDataJobResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OfflineUserDataJobServiceMethodDescriptorSupplier("CreateOfflineUserDataJob"))
              .build();
        }
      }
    }
    return getCreateOfflineUserDataJobMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v5.services.GetOfflineUserDataJobRequest,
      com.google.ads.googleads.v5.resources.OfflineUserDataJob> getGetOfflineUserDataJobMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetOfflineUserDataJob",
      requestType = com.google.ads.googleads.v5.services.GetOfflineUserDataJobRequest.class,
      responseType = com.google.ads.googleads.v5.resources.OfflineUserDataJob.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v5.services.GetOfflineUserDataJobRequest,
      com.google.ads.googleads.v5.resources.OfflineUserDataJob> getGetOfflineUserDataJobMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v5.services.GetOfflineUserDataJobRequest, com.google.ads.googleads.v5.resources.OfflineUserDataJob> getGetOfflineUserDataJobMethod;
    if ((getGetOfflineUserDataJobMethod = OfflineUserDataJobServiceGrpc.getGetOfflineUserDataJobMethod) == null) {
      synchronized (OfflineUserDataJobServiceGrpc.class) {
        if ((getGetOfflineUserDataJobMethod = OfflineUserDataJobServiceGrpc.getGetOfflineUserDataJobMethod) == null) {
          OfflineUserDataJobServiceGrpc.getGetOfflineUserDataJobMethod = getGetOfflineUserDataJobMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v5.services.GetOfflineUserDataJobRequest, com.google.ads.googleads.v5.resources.OfflineUserDataJob>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetOfflineUserDataJob"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v5.services.GetOfflineUserDataJobRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v5.resources.OfflineUserDataJob.getDefaultInstance()))
              .setSchemaDescriptor(new OfflineUserDataJobServiceMethodDescriptorSupplier("GetOfflineUserDataJob"))
              .build();
        }
      }
    }
    return getGetOfflineUserDataJobMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v5.services.AddOfflineUserDataJobOperationsRequest,
      com.google.ads.googleads.v5.services.AddOfflineUserDataJobOperationsResponse> getAddOfflineUserDataJobOperationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddOfflineUserDataJobOperations",
      requestType = com.google.ads.googleads.v5.services.AddOfflineUserDataJobOperationsRequest.class,
      responseType = com.google.ads.googleads.v5.services.AddOfflineUserDataJobOperationsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v5.services.AddOfflineUserDataJobOperationsRequest,
      com.google.ads.googleads.v5.services.AddOfflineUserDataJobOperationsResponse> getAddOfflineUserDataJobOperationsMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v5.services.AddOfflineUserDataJobOperationsRequest, com.google.ads.googleads.v5.services.AddOfflineUserDataJobOperationsResponse> getAddOfflineUserDataJobOperationsMethod;
    if ((getAddOfflineUserDataJobOperationsMethod = OfflineUserDataJobServiceGrpc.getAddOfflineUserDataJobOperationsMethod) == null) {
      synchronized (OfflineUserDataJobServiceGrpc.class) {
        if ((getAddOfflineUserDataJobOperationsMethod = OfflineUserDataJobServiceGrpc.getAddOfflineUserDataJobOperationsMethod) == null) {
          OfflineUserDataJobServiceGrpc.getAddOfflineUserDataJobOperationsMethod = getAddOfflineUserDataJobOperationsMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v5.services.AddOfflineUserDataJobOperationsRequest, com.google.ads.googleads.v5.services.AddOfflineUserDataJobOperationsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddOfflineUserDataJobOperations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v5.services.AddOfflineUserDataJobOperationsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v5.services.AddOfflineUserDataJobOperationsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OfflineUserDataJobServiceMethodDescriptorSupplier("AddOfflineUserDataJobOperations"))
              .build();
        }
      }
    }
    return getAddOfflineUserDataJobOperationsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v5.services.RunOfflineUserDataJobRequest,
      com.google.longrunning.Operation> getRunOfflineUserDataJobMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RunOfflineUserDataJob",
      requestType = com.google.ads.googleads.v5.services.RunOfflineUserDataJobRequest.class,
      responseType = com.google.longrunning.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v5.services.RunOfflineUserDataJobRequest,
      com.google.longrunning.Operation> getRunOfflineUserDataJobMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v5.services.RunOfflineUserDataJobRequest, com.google.longrunning.Operation> getRunOfflineUserDataJobMethod;
    if ((getRunOfflineUserDataJobMethod = OfflineUserDataJobServiceGrpc.getRunOfflineUserDataJobMethod) == null) {
      synchronized (OfflineUserDataJobServiceGrpc.class) {
        if ((getRunOfflineUserDataJobMethod = OfflineUserDataJobServiceGrpc.getRunOfflineUserDataJobMethod) == null) {
          OfflineUserDataJobServiceGrpc.getRunOfflineUserDataJobMethod = getRunOfflineUserDataJobMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v5.services.RunOfflineUserDataJobRequest, com.google.longrunning.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RunOfflineUserDataJob"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v5.services.RunOfflineUserDataJobRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.longrunning.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new OfflineUserDataJobServiceMethodDescriptorSupplier("RunOfflineUserDataJob"))
              .build();
        }
      }
    }
    return getRunOfflineUserDataJobMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static OfflineUserDataJobServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<OfflineUserDataJobServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<OfflineUserDataJobServiceStub>() {
        @java.lang.Override
        public OfflineUserDataJobServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new OfflineUserDataJobServiceStub(channel, callOptions);
        }
      };
    return OfflineUserDataJobServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static OfflineUserDataJobServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<OfflineUserDataJobServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<OfflineUserDataJobServiceBlockingStub>() {
        @java.lang.Override
        public OfflineUserDataJobServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new OfflineUserDataJobServiceBlockingStub(channel, callOptions);
        }
      };
    return OfflineUserDataJobServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static OfflineUserDataJobServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<OfflineUserDataJobServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<OfflineUserDataJobServiceFutureStub>() {
        @java.lang.Override
        public OfflineUserDataJobServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new OfflineUserDataJobServiceFutureStub(channel, callOptions);
        }
      };
    return OfflineUserDataJobServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Service to manage offline user data jobs.
   * </pre>
   */
  public static abstract class OfflineUserDataJobServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Creates an offline user data job.
     * </pre>
     */
    public void createOfflineUserDataJob(com.google.ads.googleads.v5.services.CreateOfflineUserDataJobRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v5.services.CreateOfflineUserDataJobResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateOfflineUserDataJobMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns the offline user data job.
     * </pre>
     */
    public void getOfflineUserDataJob(com.google.ads.googleads.v5.services.GetOfflineUserDataJobRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v5.resources.OfflineUserDataJob> responseObserver) {
      asyncUnimplementedUnaryCall(getGetOfflineUserDataJobMethod(), responseObserver);
    }

    /**
     * <pre>
     * Adds operations to the offline user data job.
     * </pre>
     */
    public void addOfflineUserDataJobOperations(com.google.ads.googleads.v5.services.AddOfflineUserDataJobOperationsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v5.services.AddOfflineUserDataJobOperationsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAddOfflineUserDataJobOperationsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Runs the offline user data job.
     * When finished, the long running operation will contain the processing
     * result or failure information, if any.
     * </pre>
     */
    public void runOfflineUserDataJob(com.google.ads.googleads.v5.services.RunOfflineUserDataJobRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getRunOfflineUserDataJobMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateOfflineUserDataJobMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v5.services.CreateOfflineUserDataJobRequest,
                com.google.ads.googleads.v5.services.CreateOfflineUserDataJobResponse>(
                  this, METHODID_CREATE_OFFLINE_USER_DATA_JOB)))
          .addMethod(
            getGetOfflineUserDataJobMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v5.services.GetOfflineUserDataJobRequest,
                com.google.ads.googleads.v5.resources.OfflineUserDataJob>(
                  this, METHODID_GET_OFFLINE_USER_DATA_JOB)))
          .addMethod(
            getAddOfflineUserDataJobOperationsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v5.services.AddOfflineUserDataJobOperationsRequest,
                com.google.ads.googleads.v5.services.AddOfflineUserDataJobOperationsResponse>(
                  this, METHODID_ADD_OFFLINE_USER_DATA_JOB_OPERATIONS)))
          .addMethod(
            getRunOfflineUserDataJobMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v5.services.RunOfflineUserDataJobRequest,
                com.google.longrunning.Operation>(
                  this, METHODID_RUN_OFFLINE_USER_DATA_JOB)))
          .build();
    }
  }

  /**
   * <pre>
   * Service to manage offline user data jobs.
   * </pre>
   */
  public static final class OfflineUserDataJobServiceStub extends io.grpc.stub.AbstractAsyncStub<OfflineUserDataJobServiceStub> {
    private OfflineUserDataJobServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OfflineUserDataJobServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new OfflineUserDataJobServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates an offline user data job.
     * </pre>
     */
    public void createOfflineUserDataJob(com.google.ads.googleads.v5.services.CreateOfflineUserDataJobRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v5.services.CreateOfflineUserDataJobResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateOfflineUserDataJobMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns the offline user data job.
     * </pre>
     */
    public void getOfflineUserDataJob(com.google.ads.googleads.v5.services.GetOfflineUserDataJobRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v5.resources.OfflineUserDataJob> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetOfflineUserDataJobMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Adds operations to the offline user data job.
     * </pre>
     */
    public void addOfflineUserDataJobOperations(com.google.ads.googleads.v5.services.AddOfflineUserDataJobOperationsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v5.services.AddOfflineUserDataJobOperationsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddOfflineUserDataJobOperationsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Runs the offline user data job.
     * When finished, the long running operation will contain the processing
     * result or failure information, if any.
     * </pre>
     */
    public void runOfflineUserDataJob(com.google.ads.googleads.v5.services.RunOfflineUserDataJobRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRunOfflineUserDataJobMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service to manage offline user data jobs.
   * </pre>
   */
  public static final class OfflineUserDataJobServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<OfflineUserDataJobServiceBlockingStub> {
    private OfflineUserDataJobServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OfflineUserDataJobServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new OfflineUserDataJobServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates an offline user data job.
     * </pre>
     */
    public com.google.ads.googleads.v5.services.CreateOfflineUserDataJobResponse createOfflineUserDataJob(com.google.ads.googleads.v5.services.CreateOfflineUserDataJobRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateOfflineUserDataJobMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns the offline user data job.
     * </pre>
     */
    public com.google.ads.googleads.v5.resources.OfflineUserDataJob getOfflineUserDataJob(com.google.ads.googleads.v5.services.GetOfflineUserDataJobRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetOfflineUserDataJobMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Adds operations to the offline user data job.
     * </pre>
     */
    public com.google.ads.googleads.v5.services.AddOfflineUserDataJobOperationsResponse addOfflineUserDataJobOperations(com.google.ads.googleads.v5.services.AddOfflineUserDataJobOperationsRequest request) {
      return blockingUnaryCall(
          getChannel(), getAddOfflineUserDataJobOperationsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Runs the offline user data job.
     * When finished, the long running operation will contain the processing
     * result or failure information, if any.
     * </pre>
     */
    public com.google.longrunning.Operation runOfflineUserDataJob(com.google.ads.googleads.v5.services.RunOfflineUserDataJobRequest request) {
      return blockingUnaryCall(
          getChannel(), getRunOfflineUserDataJobMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service to manage offline user data jobs.
   * </pre>
   */
  public static final class OfflineUserDataJobServiceFutureStub extends io.grpc.stub.AbstractFutureStub<OfflineUserDataJobServiceFutureStub> {
    private OfflineUserDataJobServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OfflineUserDataJobServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new OfflineUserDataJobServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates an offline user data job.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v5.services.CreateOfflineUserDataJobResponse> createOfflineUserDataJob(
        com.google.ads.googleads.v5.services.CreateOfflineUserDataJobRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateOfflineUserDataJobMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns the offline user data job.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v5.resources.OfflineUserDataJob> getOfflineUserDataJob(
        com.google.ads.googleads.v5.services.GetOfflineUserDataJobRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetOfflineUserDataJobMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Adds operations to the offline user data job.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v5.services.AddOfflineUserDataJobOperationsResponse> addOfflineUserDataJobOperations(
        com.google.ads.googleads.v5.services.AddOfflineUserDataJobOperationsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAddOfflineUserDataJobOperationsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Runs the offline user data job.
     * When finished, the long running operation will contain the processing
     * result or failure information, if any.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.longrunning.Operation> runOfflineUserDataJob(
        com.google.ads.googleads.v5.services.RunOfflineUserDataJobRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRunOfflineUserDataJobMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_OFFLINE_USER_DATA_JOB = 0;
  private static final int METHODID_GET_OFFLINE_USER_DATA_JOB = 1;
  private static final int METHODID_ADD_OFFLINE_USER_DATA_JOB_OPERATIONS = 2;
  private static final int METHODID_RUN_OFFLINE_USER_DATA_JOB = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final OfflineUserDataJobServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(OfflineUserDataJobServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_OFFLINE_USER_DATA_JOB:
          serviceImpl.createOfflineUserDataJob((com.google.ads.googleads.v5.services.CreateOfflineUserDataJobRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v5.services.CreateOfflineUserDataJobResponse>) responseObserver);
          break;
        case METHODID_GET_OFFLINE_USER_DATA_JOB:
          serviceImpl.getOfflineUserDataJob((com.google.ads.googleads.v5.services.GetOfflineUserDataJobRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v5.resources.OfflineUserDataJob>) responseObserver);
          break;
        case METHODID_ADD_OFFLINE_USER_DATA_JOB_OPERATIONS:
          serviceImpl.addOfflineUserDataJobOperations((com.google.ads.googleads.v5.services.AddOfflineUserDataJobOperationsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v5.services.AddOfflineUserDataJobOperationsResponse>) responseObserver);
          break;
        case METHODID_RUN_OFFLINE_USER_DATA_JOB:
          serviceImpl.runOfflineUserDataJob((com.google.ads.googleads.v5.services.RunOfflineUserDataJobRequest) request,
              (io.grpc.stub.StreamObserver<com.google.longrunning.Operation>) responseObserver);
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

  private static abstract class OfflineUserDataJobServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    OfflineUserDataJobServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v5.services.OfflineUserDataJobServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("OfflineUserDataJobService");
    }
  }

  private static final class OfflineUserDataJobServiceFileDescriptorSupplier
      extends OfflineUserDataJobServiceBaseDescriptorSupplier {
    OfflineUserDataJobServiceFileDescriptorSupplier() {}
  }

  private static final class OfflineUserDataJobServiceMethodDescriptorSupplier
      extends OfflineUserDataJobServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    OfflineUserDataJobServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (OfflineUserDataJobServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new OfflineUserDataJobServiceFileDescriptorSupplier())
              .addMethod(getCreateOfflineUserDataJobMethod())
              .addMethod(getGetOfflineUserDataJobMethod())
              .addMethod(getAddOfflineUserDataJobOperationsMethod())
              .addMethod(getRunOfflineUserDataJobMethod())
              .build();
        }
      }
    }
    return result;
  }
}
