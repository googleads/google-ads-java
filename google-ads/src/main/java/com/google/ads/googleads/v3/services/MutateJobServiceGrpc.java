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
 * Service to manage mutate jobs.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/ads/googleads/v3/services/mutate_job_service.proto")
public final class MutateJobServiceGrpc {

  private MutateJobServiceGrpc() {}

  public static final String SERVICE_NAME = "google.ads.googleads.v3.services.MutateJobService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v3.services.CreateMutateJobRequest,
      com.google.ads.googleads.v3.services.CreateMutateJobResponse> getCreateMutateJobMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateMutateJob",
      requestType = com.google.ads.googleads.v3.services.CreateMutateJobRequest.class,
      responseType = com.google.ads.googleads.v3.services.CreateMutateJobResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v3.services.CreateMutateJobRequest,
      com.google.ads.googleads.v3.services.CreateMutateJobResponse> getCreateMutateJobMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v3.services.CreateMutateJobRequest, com.google.ads.googleads.v3.services.CreateMutateJobResponse> getCreateMutateJobMethod;
    if ((getCreateMutateJobMethod = MutateJobServiceGrpc.getCreateMutateJobMethod) == null) {
      synchronized (MutateJobServiceGrpc.class) {
        if ((getCreateMutateJobMethod = MutateJobServiceGrpc.getCreateMutateJobMethod) == null) {
          MutateJobServiceGrpc.getCreateMutateJobMethod = getCreateMutateJobMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v3.services.CreateMutateJobRequest, com.google.ads.googleads.v3.services.CreateMutateJobResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateMutateJob"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v3.services.CreateMutateJobRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v3.services.CreateMutateJobResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MutateJobServiceMethodDescriptorSupplier("CreateMutateJob"))
              .build();
        }
      }
    }
    return getCreateMutateJobMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v3.services.GetMutateJobRequest,
      com.google.ads.googleads.v3.resources.MutateJob> getGetMutateJobMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetMutateJob",
      requestType = com.google.ads.googleads.v3.services.GetMutateJobRequest.class,
      responseType = com.google.ads.googleads.v3.resources.MutateJob.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v3.services.GetMutateJobRequest,
      com.google.ads.googleads.v3.resources.MutateJob> getGetMutateJobMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v3.services.GetMutateJobRequest, com.google.ads.googleads.v3.resources.MutateJob> getGetMutateJobMethod;
    if ((getGetMutateJobMethod = MutateJobServiceGrpc.getGetMutateJobMethod) == null) {
      synchronized (MutateJobServiceGrpc.class) {
        if ((getGetMutateJobMethod = MutateJobServiceGrpc.getGetMutateJobMethod) == null) {
          MutateJobServiceGrpc.getGetMutateJobMethod = getGetMutateJobMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v3.services.GetMutateJobRequest, com.google.ads.googleads.v3.resources.MutateJob>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetMutateJob"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v3.services.GetMutateJobRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v3.resources.MutateJob.getDefaultInstance()))
              .setSchemaDescriptor(new MutateJobServiceMethodDescriptorSupplier("GetMutateJob"))
              .build();
        }
      }
    }
    return getGetMutateJobMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v3.services.ListMutateJobResultsRequest,
      com.google.ads.googleads.v3.services.ListMutateJobResultsResponse> getListMutateJobResultsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListMutateJobResults",
      requestType = com.google.ads.googleads.v3.services.ListMutateJobResultsRequest.class,
      responseType = com.google.ads.googleads.v3.services.ListMutateJobResultsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v3.services.ListMutateJobResultsRequest,
      com.google.ads.googleads.v3.services.ListMutateJobResultsResponse> getListMutateJobResultsMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v3.services.ListMutateJobResultsRequest, com.google.ads.googleads.v3.services.ListMutateJobResultsResponse> getListMutateJobResultsMethod;
    if ((getListMutateJobResultsMethod = MutateJobServiceGrpc.getListMutateJobResultsMethod) == null) {
      synchronized (MutateJobServiceGrpc.class) {
        if ((getListMutateJobResultsMethod = MutateJobServiceGrpc.getListMutateJobResultsMethod) == null) {
          MutateJobServiceGrpc.getListMutateJobResultsMethod = getListMutateJobResultsMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v3.services.ListMutateJobResultsRequest, com.google.ads.googleads.v3.services.ListMutateJobResultsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListMutateJobResults"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v3.services.ListMutateJobResultsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v3.services.ListMutateJobResultsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MutateJobServiceMethodDescriptorSupplier("ListMutateJobResults"))
              .build();
        }
      }
    }
    return getListMutateJobResultsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v3.services.RunMutateJobRequest,
      com.google.longrunning.Operation> getRunMutateJobMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RunMutateJob",
      requestType = com.google.ads.googleads.v3.services.RunMutateJobRequest.class,
      responseType = com.google.longrunning.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v3.services.RunMutateJobRequest,
      com.google.longrunning.Operation> getRunMutateJobMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v3.services.RunMutateJobRequest, com.google.longrunning.Operation> getRunMutateJobMethod;
    if ((getRunMutateJobMethod = MutateJobServiceGrpc.getRunMutateJobMethod) == null) {
      synchronized (MutateJobServiceGrpc.class) {
        if ((getRunMutateJobMethod = MutateJobServiceGrpc.getRunMutateJobMethod) == null) {
          MutateJobServiceGrpc.getRunMutateJobMethod = getRunMutateJobMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v3.services.RunMutateJobRequest, com.google.longrunning.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RunMutateJob"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v3.services.RunMutateJobRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.longrunning.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new MutateJobServiceMethodDescriptorSupplier("RunMutateJob"))
              .build();
        }
      }
    }
    return getRunMutateJobMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v3.services.AddMutateJobOperationsRequest,
      com.google.ads.googleads.v3.services.AddMutateJobOperationsResponse> getAddMutateJobOperationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddMutateJobOperations",
      requestType = com.google.ads.googleads.v3.services.AddMutateJobOperationsRequest.class,
      responseType = com.google.ads.googleads.v3.services.AddMutateJobOperationsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v3.services.AddMutateJobOperationsRequest,
      com.google.ads.googleads.v3.services.AddMutateJobOperationsResponse> getAddMutateJobOperationsMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v3.services.AddMutateJobOperationsRequest, com.google.ads.googleads.v3.services.AddMutateJobOperationsResponse> getAddMutateJobOperationsMethod;
    if ((getAddMutateJobOperationsMethod = MutateJobServiceGrpc.getAddMutateJobOperationsMethod) == null) {
      synchronized (MutateJobServiceGrpc.class) {
        if ((getAddMutateJobOperationsMethod = MutateJobServiceGrpc.getAddMutateJobOperationsMethod) == null) {
          MutateJobServiceGrpc.getAddMutateJobOperationsMethod = getAddMutateJobOperationsMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v3.services.AddMutateJobOperationsRequest, com.google.ads.googleads.v3.services.AddMutateJobOperationsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddMutateJobOperations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v3.services.AddMutateJobOperationsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v3.services.AddMutateJobOperationsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MutateJobServiceMethodDescriptorSupplier("AddMutateJobOperations"))
              .build();
        }
      }
    }
    return getAddMutateJobOperationsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MutateJobServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MutateJobServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MutateJobServiceStub>() {
        @java.lang.Override
        public MutateJobServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MutateJobServiceStub(channel, callOptions);
        }
      };
    return MutateJobServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MutateJobServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MutateJobServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MutateJobServiceBlockingStub>() {
        @java.lang.Override
        public MutateJobServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MutateJobServiceBlockingStub(channel, callOptions);
        }
      };
    return MutateJobServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MutateJobServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MutateJobServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MutateJobServiceFutureStub>() {
        @java.lang.Override
        public MutateJobServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MutateJobServiceFutureStub(channel, callOptions);
        }
      };
    return MutateJobServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Service to manage mutate jobs.
   * </pre>
   */
  public static abstract class MutateJobServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Creates a mutate job.
     * </pre>
     */
    public void createMutateJob(com.google.ads.googleads.v3.services.CreateMutateJobRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v3.services.CreateMutateJobResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateMutateJobMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns the mutate job.
     * </pre>
     */
    public void getMutateJob(com.google.ads.googleads.v3.services.GetMutateJobRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v3.resources.MutateJob> responseObserver) {
      asyncUnimplementedUnaryCall(getGetMutateJobMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns the results of the mutate job. The job must be done.
     * Supports standard list paging.
     * </pre>
     */
    public void listMutateJobResults(com.google.ads.googleads.v3.services.ListMutateJobResultsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v3.services.ListMutateJobResultsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListMutateJobResultsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Runs the mutate job.
     * The Operation.metadata field type is MutateJobMetadata. When finished, the
     * long running operation will not contain errors or a response. Instead, use
     * ListMutateJobResults to get the results of the job.
     * </pre>
     */
    public void runMutateJob(com.google.ads.googleads.v3.services.RunMutateJobRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getRunMutateJobMethod(), responseObserver);
    }

    /**
     * <pre>
     * Add operations to the mutate job.
     * </pre>
     */
    public void addMutateJobOperations(com.google.ads.googleads.v3.services.AddMutateJobOperationsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v3.services.AddMutateJobOperationsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAddMutateJobOperationsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateMutateJobMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v3.services.CreateMutateJobRequest,
                com.google.ads.googleads.v3.services.CreateMutateJobResponse>(
                  this, METHODID_CREATE_MUTATE_JOB)))
          .addMethod(
            getGetMutateJobMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v3.services.GetMutateJobRequest,
                com.google.ads.googleads.v3.resources.MutateJob>(
                  this, METHODID_GET_MUTATE_JOB)))
          .addMethod(
            getListMutateJobResultsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v3.services.ListMutateJobResultsRequest,
                com.google.ads.googleads.v3.services.ListMutateJobResultsResponse>(
                  this, METHODID_LIST_MUTATE_JOB_RESULTS)))
          .addMethod(
            getRunMutateJobMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v3.services.RunMutateJobRequest,
                com.google.longrunning.Operation>(
                  this, METHODID_RUN_MUTATE_JOB)))
          .addMethod(
            getAddMutateJobOperationsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v3.services.AddMutateJobOperationsRequest,
                com.google.ads.googleads.v3.services.AddMutateJobOperationsResponse>(
                  this, METHODID_ADD_MUTATE_JOB_OPERATIONS)))
          .build();
    }
  }

  /**
   * <pre>
   * Service to manage mutate jobs.
   * </pre>
   */
  public static final class MutateJobServiceStub extends io.grpc.stub.AbstractAsyncStub<MutateJobServiceStub> {
    private MutateJobServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MutateJobServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MutateJobServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates a mutate job.
     * </pre>
     */
    public void createMutateJob(com.google.ads.googleads.v3.services.CreateMutateJobRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v3.services.CreateMutateJobResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateMutateJobMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns the mutate job.
     * </pre>
     */
    public void getMutateJob(com.google.ads.googleads.v3.services.GetMutateJobRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v3.resources.MutateJob> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetMutateJobMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns the results of the mutate job. The job must be done.
     * Supports standard list paging.
     * </pre>
     */
    public void listMutateJobResults(com.google.ads.googleads.v3.services.ListMutateJobResultsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v3.services.ListMutateJobResultsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListMutateJobResultsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Runs the mutate job.
     * The Operation.metadata field type is MutateJobMetadata. When finished, the
     * long running operation will not contain errors or a response. Instead, use
     * ListMutateJobResults to get the results of the job.
     * </pre>
     */
    public void runMutateJob(com.google.ads.googleads.v3.services.RunMutateJobRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRunMutateJobMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Add operations to the mutate job.
     * </pre>
     */
    public void addMutateJobOperations(com.google.ads.googleads.v3.services.AddMutateJobOperationsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v3.services.AddMutateJobOperationsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddMutateJobOperationsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service to manage mutate jobs.
   * </pre>
   */
  public static final class MutateJobServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<MutateJobServiceBlockingStub> {
    private MutateJobServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MutateJobServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MutateJobServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates a mutate job.
     * </pre>
     */
    public com.google.ads.googleads.v3.services.CreateMutateJobResponse createMutateJob(com.google.ads.googleads.v3.services.CreateMutateJobRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateMutateJobMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns the mutate job.
     * </pre>
     */
    public com.google.ads.googleads.v3.resources.MutateJob getMutateJob(com.google.ads.googleads.v3.services.GetMutateJobRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetMutateJobMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns the results of the mutate job. The job must be done.
     * Supports standard list paging.
     * </pre>
     */
    public com.google.ads.googleads.v3.services.ListMutateJobResultsResponse listMutateJobResults(com.google.ads.googleads.v3.services.ListMutateJobResultsRequest request) {
      return blockingUnaryCall(
          getChannel(), getListMutateJobResultsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Runs the mutate job.
     * The Operation.metadata field type is MutateJobMetadata. When finished, the
     * long running operation will not contain errors or a response. Instead, use
     * ListMutateJobResults to get the results of the job.
     * </pre>
     */
    public com.google.longrunning.Operation runMutateJob(com.google.ads.googleads.v3.services.RunMutateJobRequest request) {
      return blockingUnaryCall(
          getChannel(), getRunMutateJobMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Add operations to the mutate job.
     * </pre>
     */
    public com.google.ads.googleads.v3.services.AddMutateJobOperationsResponse addMutateJobOperations(com.google.ads.googleads.v3.services.AddMutateJobOperationsRequest request) {
      return blockingUnaryCall(
          getChannel(), getAddMutateJobOperationsMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service to manage mutate jobs.
   * </pre>
   */
  public static final class MutateJobServiceFutureStub extends io.grpc.stub.AbstractFutureStub<MutateJobServiceFutureStub> {
    private MutateJobServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MutateJobServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MutateJobServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates a mutate job.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v3.services.CreateMutateJobResponse> createMutateJob(
        com.google.ads.googleads.v3.services.CreateMutateJobRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateMutateJobMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns the mutate job.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v3.resources.MutateJob> getMutateJob(
        com.google.ads.googleads.v3.services.GetMutateJobRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetMutateJobMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns the results of the mutate job. The job must be done.
     * Supports standard list paging.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v3.services.ListMutateJobResultsResponse> listMutateJobResults(
        com.google.ads.googleads.v3.services.ListMutateJobResultsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListMutateJobResultsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Runs the mutate job.
     * The Operation.metadata field type is MutateJobMetadata. When finished, the
     * long running operation will not contain errors or a response. Instead, use
     * ListMutateJobResults to get the results of the job.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.longrunning.Operation> runMutateJob(
        com.google.ads.googleads.v3.services.RunMutateJobRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRunMutateJobMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Add operations to the mutate job.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v3.services.AddMutateJobOperationsResponse> addMutateJobOperations(
        com.google.ads.googleads.v3.services.AddMutateJobOperationsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAddMutateJobOperationsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_MUTATE_JOB = 0;
  private static final int METHODID_GET_MUTATE_JOB = 1;
  private static final int METHODID_LIST_MUTATE_JOB_RESULTS = 2;
  private static final int METHODID_RUN_MUTATE_JOB = 3;
  private static final int METHODID_ADD_MUTATE_JOB_OPERATIONS = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final MutateJobServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(MutateJobServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_MUTATE_JOB:
          serviceImpl.createMutateJob((com.google.ads.googleads.v3.services.CreateMutateJobRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v3.services.CreateMutateJobResponse>) responseObserver);
          break;
        case METHODID_GET_MUTATE_JOB:
          serviceImpl.getMutateJob((com.google.ads.googleads.v3.services.GetMutateJobRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v3.resources.MutateJob>) responseObserver);
          break;
        case METHODID_LIST_MUTATE_JOB_RESULTS:
          serviceImpl.listMutateJobResults((com.google.ads.googleads.v3.services.ListMutateJobResultsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v3.services.ListMutateJobResultsResponse>) responseObserver);
          break;
        case METHODID_RUN_MUTATE_JOB:
          serviceImpl.runMutateJob((com.google.ads.googleads.v3.services.RunMutateJobRequest) request,
              (io.grpc.stub.StreamObserver<com.google.longrunning.Operation>) responseObserver);
          break;
        case METHODID_ADD_MUTATE_JOB_OPERATIONS:
          serviceImpl.addMutateJobOperations((com.google.ads.googleads.v3.services.AddMutateJobOperationsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v3.services.AddMutateJobOperationsResponse>) responseObserver);
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

  private static abstract class MutateJobServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MutateJobServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v3.services.MutateJobServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("MutateJobService");
    }
  }

  private static final class MutateJobServiceFileDescriptorSupplier
      extends MutateJobServiceBaseDescriptorSupplier {
    MutateJobServiceFileDescriptorSupplier() {}
  }

  private static final class MutateJobServiceMethodDescriptorSupplier
      extends MutateJobServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    MutateJobServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (MutateJobServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MutateJobServiceFileDescriptorSupplier())
              .addMethod(getCreateMutateJobMethod())
              .addMethod(getGetMutateJobMethod())
              .addMethod(getListMutateJobResultsMethod())
              .addMethod(getRunMutateJobMethod())
              .addMethod(getAddMutateJobOperationsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
