package com.google.ads.googleads.v19.services;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Service to manage batch jobs.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/ads/googleads/v19/services/batch_job_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class BatchJobServiceGrpc {

  private BatchJobServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "google.ads.googleads.v19.services.BatchJobService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v19.services.MutateBatchJobRequest,
      com.google.ads.googleads.v19.services.MutateBatchJobResponse> getMutateBatchJobMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MutateBatchJob",
      requestType = com.google.ads.googleads.v19.services.MutateBatchJobRequest.class,
      responseType = com.google.ads.googleads.v19.services.MutateBatchJobResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v19.services.MutateBatchJobRequest,
      com.google.ads.googleads.v19.services.MutateBatchJobResponse> getMutateBatchJobMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v19.services.MutateBatchJobRequest, com.google.ads.googleads.v19.services.MutateBatchJobResponse> getMutateBatchJobMethod;
    if ((getMutateBatchJobMethod = BatchJobServiceGrpc.getMutateBatchJobMethod) == null) {
      synchronized (BatchJobServiceGrpc.class) {
        if ((getMutateBatchJobMethod = BatchJobServiceGrpc.getMutateBatchJobMethod) == null) {
          BatchJobServiceGrpc.getMutateBatchJobMethod = getMutateBatchJobMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v19.services.MutateBatchJobRequest, com.google.ads.googleads.v19.services.MutateBatchJobResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MutateBatchJob"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v19.services.MutateBatchJobRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v19.services.MutateBatchJobResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BatchJobServiceMethodDescriptorSupplier("MutateBatchJob"))
              .build();
        }
      }
    }
    return getMutateBatchJobMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v19.services.ListBatchJobResultsRequest,
      com.google.ads.googleads.v19.services.ListBatchJobResultsResponse> getListBatchJobResultsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListBatchJobResults",
      requestType = com.google.ads.googleads.v19.services.ListBatchJobResultsRequest.class,
      responseType = com.google.ads.googleads.v19.services.ListBatchJobResultsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v19.services.ListBatchJobResultsRequest,
      com.google.ads.googleads.v19.services.ListBatchJobResultsResponse> getListBatchJobResultsMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v19.services.ListBatchJobResultsRequest, com.google.ads.googleads.v19.services.ListBatchJobResultsResponse> getListBatchJobResultsMethod;
    if ((getListBatchJobResultsMethod = BatchJobServiceGrpc.getListBatchJobResultsMethod) == null) {
      synchronized (BatchJobServiceGrpc.class) {
        if ((getListBatchJobResultsMethod = BatchJobServiceGrpc.getListBatchJobResultsMethod) == null) {
          BatchJobServiceGrpc.getListBatchJobResultsMethod = getListBatchJobResultsMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v19.services.ListBatchJobResultsRequest, com.google.ads.googleads.v19.services.ListBatchJobResultsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListBatchJobResults"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v19.services.ListBatchJobResultsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v19.services.ListBatchJobResultsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BatchJobServiceMethodDescriptorSupplier("ListBatchJobResults"))
              .build();
        }
      }
    }
    return getListBatchJobResultsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v19.services.RunBatchJobRequest,
      com.google.longrunning.Operation> getRunBatchJobMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RunBatchJob",
      requestType = com.google.ads.googleads.v19.services.RunBatchJobRequest.class,
      responseType = com.google.longrunning.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v19.services.RunBatchJobRequest,
      com.google.longrunning.Operation> getRunBatchJobMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v19.services.RunBatchJobRequest, com.google.longrunning.Operation> getRunBatchJobMethod;
    if ((getRunBatchJobMethod = BatchJobServiceGrpc.getRunBatchJobMethod) == null) {
      synchronized (BatchJobServiceGrpc.class) {
        if ((getRunBatchJobMethod = BatchJobServiceGrpc.getRunBatchJobMethod) == null) {
          BatchJobServiceGrpc.getRunBatchJobMethod = getRunBatchJobMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v19.services.RunBatchJobRequest, com.google.longrunning.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RunBatchJob"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v19.services.RunBatchJobRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.longrunning.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new BatchJobServiceMethodDescriptorSupplier("RunBatchJob"))
              .build();
        }
      }
    }
    return getRunBatchJobMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v19.services.AddBatchJobOperationsRequest,
      com.google.ads.googleads.v19.services.AddBatchJobOperationsResponse> getAddBatchJobOperationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddBatchJobOperations",
      requestType = com.google.ads.googleads.v19.services.AddBatchJobOperationsRequest.class,
      responseType = com.google.ads.googleads.v19.services.AddBatchJobOperationsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v19.services.AddBatchJobOperationsRequest,
      com.google.ads.googleads.v19.services.AddBatchJobOperationsResponse> getAddBatchJobOperationsMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v19.services.AddBatchJobOperationsRequest, com.google.ads.googleads.v19.services.AddBatchJobOperationsResponse> getAddBatchJobOperationsMethod;
    if ((getAddBatchJobOperationsMethod = BatchJobServiceGrpc.getAddBatchJobOperationsMethod) == null) {
      synchronized (BatchJobServiceGrpc.class) {
        if ((getAddBatchJobOperationsMethod = BatchJobServiceGrpc.getAddBatchJobOperationsMethod) == null) {
          BatchJobServiceGrpc.getAddBatchJobOperationsMethod = getAddBatchJobOperationsMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v19.services.AddBatchJobOperationsRequest, com.google.ads.googleads.v19.services.AddBatchJobOperationsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddBatchJobOperations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v19.services.AddBatchJobOperationsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v19.services.AddBatchJobOperationsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BatchJobServiceMethodDescriptorSupplier("AddBatchJobOperations"))
              .build();
        }
      }
    }
    return getAddBatchJobOperationsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static BatchJobServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BatchJobServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BatchJobServiceStub>() {
        @java.lang.Override
        public BatchJobServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BatchJobServiceStub(channel, callOptions);
        }
      };
    return BatchJobServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static BatchJobServiceBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BatchJobServiceBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BatchJobServiceBlockingV2Stub>() {
        @java.lang.Override
        public BatchJobServiceBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BatchJobServiceBlockingV2Stub(channel, callOptions);
        }
      };
    return BatchJobServiceBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static BatchJobServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BatchJobServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BatchJobServiceBlockingStub>() {
        @java.lang.Override
        public BatchJobServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BatchJobServiceBlockingStub(channel, callOptions);
        }
      };
    return BatchJobServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static BatchJobServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BatchJobServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BatchJobServiceFutureStub>() {
        @java.lang.Override
        public BatchJobServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BatchJobServiceFutureStub(channel, callOptions);
        }
      };
    return BatchJobServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Service to manage batch jobs.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Mutates a batch job.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     *   [ResourceCountLimitExceededError]()
     * </pre>
     */
    default void mutateBatchJob(com.google.ads.googleads.v19.services.MutateBatchJobRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v19.services.MutateBatchJobResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMutateBatchJobMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns the results of the batch job. The job must be done.
     * Supports standard list paging.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [BatchJobError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    default void listBatchJobResults(com.google.ads.googleads.v19.services.ListBatchJobResultsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v19.services.ListBatchJobResultsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListBatchJobResultsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Runs the batch job.
     * The Operation.metadata field type is BatchJobMetadata. When finished, the
     * long running operation will not contain errors or a response. Instead, use
     * ListBatchJobResults to get the results of the job.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [BatchJobError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    default void runBatchJob(com.google.ads.googleads.v19.services.RunBatchJobRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRunBatchJobMethod(), responseObserver);
    }

    /**
     * <pre>
     * Add operations to the batch job.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [BatchJobError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     *   [ResourceCountLimitExceededError]()
     * </pre>
     */
    default void addBatchJobOperations(com.google.ads.googleads.v19.services.AddBatchJobOperationsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v19.services.AddBatchJobOperationsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddBatchJobOperationsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service BatchJobService.
   * <pre>
   * Service to manage batch jobs.
   * </pre>
   */
  public static abstract class BatchJobServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return BatchJobServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service BatchJobService.
   * <pre>
   * Service to manage batch jobs.
   * </pre>
   */
  public static final class BatchJobServiceStub
      extends io.grpc.stub.AbstractAsyncStub<BatchJobServiceStub> {
    private BatchJobServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BatchJobServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BatchJobServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Mutates a batch job.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     *   [ResourceCountLimitExceededError]()
     * </pre>
     */
    public void mutateBatchJob(com.google.ads.googleads.v19.services.MutateBatchJobRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v19.services.MutateBatchJobResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMutateBatchJobMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns the results of the batch job. The job must be done.
     * Supports standard list paging.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [BatchJobError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public void listBatchJobResults(com.google.ads.googleads.v19.services.ListBatchJobResultsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v19.services.ListBatchJobResultsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListBatchJobResultsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Runs the batch job.
     * The Operation.metadata field type is BatchJobMetadata. When finished, the
     * long running operation will not contain errors or a response. Instead, use
     * ListBatchJobResults to get the results of the job.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [BatchJobError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public void runBatchJob(com.google.ads.googleads.v19.services.RunBatchJobRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRunBatchJobMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Add operations to the batch job.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [BatchJobError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     *   [ResourceCountLimitExceededError]()
     * </pre>
     */
    public void addBatchJobOperations(com.google.ads.googleads.v19.services.AddBatchJobOperationsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v19.services.AddBatchJobOperationsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddBatchJobOperationsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service BatchJobService.
   * <pre>
   * Service to manage batch jobs.
   * </pre>
   */
  public static final class BatchJobServiceBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<BatchJobServiceBlockingV2Stub> {
    private BatchJobServiceBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BatchJobServiceBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BatchJobServiceBlockingV2Stub(channel, callOptions);
    }

    /**
     * <pre>
     * Mutates a batch job.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     *   [ResourceCountLimitExceededError]()
     * </pre>
     */
    public com.google.ads.googleads.v19.services.MutateBatchJobResponse mutateBatchJob(com.google.ads.googleads.v19.services.MutateBatchJobRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMutateBatchJobMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns the results of the batch job. The job must be done.
     * Supports standard list paging.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [BatchJobError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.ads.googleads.v19.services.ListBatchJobResultsResponse listBatchJobResults(com.google.ads.googleads.v19.services.ListBatchJobResultsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListBatchJobResultsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Runs the batch job.
     * The Operation.metadata field type is BatchJobMetadata. When finished, the
     * long running operation will not contain errors or a response. Instead, use
     * ListBatchJobResults to get the results of the job.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [BatchJobError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.longrunning.Operation runBatchJob(com.google.ads.googleads.v19.services.RunBatchJobRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRunBatchJobMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Add operations to the batch job.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [BatchJobError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     *   [ResourceCountLimitExceededError]()
     * </pre>
     */
    public com.google.ads.googleads.v19.services.AddBatchJobOperationsResponse addBatchJobOperations(com.google.ads.googleads.v19.services.AddBatchJobOperationsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddBatchJobOperationsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service BatchJobService.
   * <pre>
   * Service to manage batch jobs.
   * </pre>
   */
  public static final class BatchJobServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<BatchJobServiceBlockingStub> {
    private BatchJobServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BatchJobServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BatchJobServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Mutates a batch job.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     *   [ResourceCountLimitExceededError]()
     * </pre>
     */
    public com.google.ads.googleads.v19.services.MutateBatchJobResponse mutateBatchJob(com.google.ads.googleads.v19.services.MutateBatchJobRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMutateBatchJobMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns the results of the batch job. The job must be done.
     * Supports standard list paging.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [BatchJobError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.ads.googleads.v19.services.ListBatchJobResultsResponse listBatchJobResults(com.google.ads.googleads.v19.services.ListBatchJobResultsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListBatchJobResultsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Runs the batch job.
     * The Operation.metadata field type is BatchJobMetadata. When finished, the
     * long running operation will not contain errors or a response. Instead, use
     * ListBatchJobResults to get the results of the job.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [BatchJobError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.longrunning.Operation runBatchJob(com.google.ads.googleads.v19.services.RunBatchJobRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRunBatchJobMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Add operations to the batch job.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [BatchJobError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     *   [ResourceCountLimitExceededError]()
     * </pre>
     */
    public com.google.ads.googleads.v19.services.AddBatchJobOperationsResponse addBatchJobOperations(com.google.ads.googleads.v19.services.AddBatchJobOperationsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddBatchJobOperationsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service BatchJobService.
   * <pre>
   * Service to manage batch jobs.
   * </pre>
   */
  public static final class BatchJobServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<BatchJobServiceFutureStub> {
    private BatchJobServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BatchJobServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BatchJobServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Mutates a batch job.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     *   [ResourceCountLimitExceededError]()
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v19.services.MutateBatchJobResponse> mutateBatchJob(
        com.google.ads.googleads.v19.services.MutateBatchJobRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMutateBatchJobMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns the results of the batch job. The job must be done.
     * Supports standard list paging.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [BatchJobError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v19.services.ListBatchJobResultsResponse> listBatchJobResults(
        com.google.ads.googleads.v19.services.ListBatchJobResultsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListBatchJobResultsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Runs the batch job.
     * The Operation.metadata field type is BatchJobMetadata. When finished, the
     * long running operation will not contain errors or a response. Instead, use
     * ListBatchJobResults to get the results of the job.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [BatchJobError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.longrunning.Operation> runBatchJob(
        com.google.ads.googleads.v19.services.RunBatchJobRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRunBatchJobMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Add operations to the batch job.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [BatchJobError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     *   [ResourceCountLimitExceededError]()
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v19.services.AddBatchJobOperationsResponse> addBatchJobOperations(
        com.google.ads.googleads.v19.services.AddBatchJobOperationsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddBatchJobOperationsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_MUTATE_BATCH_JOB = 0;
  private static final int METHODID_LIST_BATCH_JOB_RESULTS = 1;
  private static final int METHODID_RUN_BATCH_JOB = 2;
  private static final int METHODID_ADD_BATCH_JOB_OPERATIONS = 3;

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
        case METHODID_MUTATE_BATCH_JOB:
          serviceImpl.mutateBatchJob((com.google.ads.googleads.v19.services.MutateBatchJobRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v19.services.MutateBatchJobResponse>) responseObserver);
          break;
        case METHODID_LIST_BATCH_JOB_RESULTS:
          serviceImpl.listBatchJobResults((com.google.ads.googleads.v19.services.ListBatchJobResultsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v19.services.ListBatchJobResultsResponse>) responseObserver);
          break;
        case METHODID_RUN_BATCH_JOB:
          serviceImpl.runBatchJob((com.google.ads.googleads.v19.services.RunBatchJobRequest) request,
              (io.grpc.stub.StreamObserver<com.google.longrunning.Operation>) responseObserver);
          break;
        case METHODID_ADD_BATCH_JOB_OPERATIONS:
          serviceImpl.addBatchJobOperations((com.google.ads.googleads.v19.services.AddBatchJobOperationsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v19.services.AddBatchJobOperationsResponse>) responseObserver);
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
          getMutateBatchJobMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.ads.googleads.v19.services.MutateBatchJobRequest,
              com.google.ads.googleads.v19.services.MutateBatchJobResponse>(
                service, METHODID_MUTATE_BATCH_JOB)))
        .addMethod(
          getListBatchJobResultsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.ads.googleads.v19.services.ListBatchJobResultsRequest,
              com.google.ads.googleads.v19.services.ListBatchJobResultsResponse>(
                service, METHODID_LIST_BATCH_JOB_RESULTS)))
        .addMethod(
          getRunBatchJobMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.ads.googleads.v19.services.RunBatchJobRequest,
              com.google.longrunning.Operation>(
                service, METHODID_RUN_BATCH_JOB)))
        .addMethod(
          getAddBatchJobOperationsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.ads.googleads.v19.services.AddBatchJobOperationsRequest,
              com.google.ads.googleads.v19.services.AddBatchJobOperationsResponse>(
                service, METHODID_ADD_BATCH_JOB_OPERATIONS)))
        .build();
  }

  private static abstract class BatchJobServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    BatchJobServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v19.services.BatchJobServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("BatchJobService");
    }
  }

  private static final class BatchJobServiceFileDescriptorSupplier
      extends BatchJobServiceBaseDescriptorSupplier {
    BatchJobServiceFileDescriptorSupplier() {}
  }

  private static final class BatchJobServiceMethodDescriptorSupplier
      extends BatchJobServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    BatchJobServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (BatchJobServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new BatchJobServiceFileDescriptorSupplier())
              .addMethod(getMutateBatchJobMethod())
              .addMethod(getListBatchJobResultsMethod())
              .addMethod(getRunBatchJobMethod())
              .addMethod(getAddBatchJobOperationsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
