package com.google.ads.googleads.v6.services;

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
 * Service to manage batch jobs.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/ads/googleads/v6/services/batch_job_service.proto")
public final class BatchJobServiceGrpc {

  private BatchJobServiceGrpc() {}

  public static final String SERVICE_NAME = "google.ads.googleads.v6.services.BatchJobService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v6.services.MutateBatchJobRequest,
      com.google.ads.googleads.v6.services.MutateBatchJobResponse> getMutateBatchJobMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MutateBatchJob",
      requestType = com.google.ads.googleads.v6.services.MutateBatchJobRequest.class,
      responseType = com.google.ads.googleads.v6.services.MutateBatchJobResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v6.services.MutateBatchJobRequest,
      com.google.ads.googleads.v6.services.MutateBatchJobResponse> getMutateBatchJobMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v6.services.MutateBatchJobRequest, com.google.ads.googleads.v6.services.MutateBatchJobResponse> getMutateBatchJobMethod;
    if ((getMutateBatchJobMethod = BatchJobServiceGrpc.getMutateBatchJobMethod) == null) {
      synchronized (BatchJobServiceGrpc.class) {
        if ((getMutateBatchJobMethod = BatchJobServiceGrpc.getMutateBatchJobMethod) == null) {
          BatchJobServiceGrpc.getMutateBatchJobMethod = getMutateBatchJobMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v6.services.MutateBatchJobRequest, com.google.ads.googleads.v6.services.MutateBatchJobResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MutateBatchJob"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v6.services.MutateBatchJobRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v6.services.MutateBatchJobResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BatchJobServiceMethodDescriptorSupplier("MutateBatchJob"))
              .build();
        }
      }
    }
    return getMutateBatchJobMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v6.services.GetBatchJobRequest,
      com.google.ads.googleads.v6.resources.BatchJob> getGetBatchJobMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetBatchJob",
      requestType = com.google.ads.googleads.v6.services.GetBatchJobRequest.class,
      responseType = com.google.ads.googleads.v6.resources.BatchJob.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v6.services.GetBatchJobRequest,
      com.google.ads.googleads.v6.resources.BatchJob> getGetBatchJobMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v6.services.GetBatchJobRequest, com.google.ads.googleads.v6.resources.BatchJob> getGetBatchJobMethod;
    if ((getGetBatchJobMethod = BatchJobServiceGrpc.getGetBatchJobMethod) == null) {
      synchronized (BatchJobServiceGrpc.class) {
        if ((getGetBatchJobMethod = BatchJobServiceGrpc.getGetBatchJobMethod) == null) {
          BatchJobServiceGrpc.getGetBatchJobMethod = getGetBatchJobMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v6.services.GetBatchJobRequest, com.google.ads.googleads.v6.resources.BatchJob>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetBatchJob"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v6.services.GetBatchJobRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v6.resources.BatchJob.getDefaultInstance()))
              .setSchemaDescriptor(new BatchJobServiceMethodDescriptorSupplier("GetBatchJob"))
              .build();
        }
      }
    }
    return getGetBatchJobMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v6.services.ListBatchJobResultsRequest,
      com.google.ads.googleads.v6.services.ListBatchJobResultsResponse> getListBatchJobResultsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListBatchJobResults",
      requestType = com.google.ads.googleads.v6.services.ListBatchJobResultsRequest.class,
      responseType = com.google.ads.googleads.v6.services.ListBatchJobResultsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v6.services.ListBatchJobResultsRequest,
      com.google.ads.googleads.v6.services.ListBatchJobResultsResponse> getListBatchJobResultsMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v6.services.ListBatchJobResultsRequest, com.google.ads.googleads.v6.services.ListBatchJobResultsResponse> getListBatchJobResultsMethod;
    if ((getListBatchJobResultsMethod = BatchJobServiceGrpc.getListBatchJobResultsMethod) == null) {
      synchronized (BatchJobServiceGrpc.class) {
        if ((getListBatchJobResultsMethod = BatchJobServiceGrpc.getListBatchJobResultsMethod) == null) {
          BatchJobServiceGrpc.getListBatchJobResultsMethod = getListBatchJobResultsMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v6.services.ListBatchJobResultsRequest, com.google.ads.googleads.v6.services.ListBatchJobResultsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListBatchJobResults"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v6.services.ListBatchJobResultsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v6.services.ListBatchJobResultsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BatchJobServiceMethodDescriptorSupplier("ListBatchJobResults"))
              .build();
        }
      }
    }
    return getListBatchJobResultsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v6.services.RunBatchJobRequest,
      com.google.longrunning.Operation> getRunBatchJobMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RunBatchJob",
      requestType = com.google.ads.googleads.v6.services.RunBatchJobRequest.class,
      responseType = com.google.longrunning.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v6.services.RunBatchJobRequest,
      com.google.longrunning.Operation> getRunBatchJobMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v6.services.RunBatchJobRequest, com.google.longrunning.Operation> getRunBatchJobMethod;
    if ((getRunBatchJobMethod = BatchJobServiceGrpc.getRunBatchJobMethod) == null) {
      synchronized (BatchJobServiceGrpc.class) {
        if ((getRunBatchJobMethod = BatchJobServiceGrpc.getRunBatchJobMethod) == null) {
          BatchJobServiceGrpc.getRunBatchJobMethod = getRunBatchJobMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v6.services.RunBatchJobRequest, com.google.longrunning.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RunBatchJob"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v6.services.RunBatchJobRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.longrunning.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new BatchJobServiceMethodDescriptorSupplier("RunBatchJob"))
              .build();
        }
      }
    }
    return getRunBatchJobMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v6.services.AddBatchJobOperationsRequest,
      com.google.ads.googleads.v6.services.AddBatchJobOperationsResponse> getAddBatchJobOperationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddBatchJobOperations",
      requestType = com.google.ads.googleads.v6.services.AddBatchJobOperationsRequest.class,
      responseType = com.google.ads.googleads.v6.services.AddBatchJobOperationsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v6.services.AddBatchJobOperationsRequest,
      com.google.ads.googleads.v6.services.AddBatchJobOperationsResponse> getAddBatchJobOperationsMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v6.services.AddBatchJobOperationsRequest, com.google.ads.googleads.v6.services.AddBatchJobOperationsResponse> getAddBatchJobOperationsMethod;
    if ((getAddBatchJobOperationsMethod = BatchJobServiceGrpc.getAddBatchJobOperationsMethod) == null) {
      synchronized (BatchJobServiceGrpc.class) {
        if ((getAddBatchJobOperationsMethod = BatchJobServiceGrpc.getAddBatchJobOperationsMethod) == null) {
          BatchJobServiceGrpc.getAddBatchJobOperationsMethod = getAddBatchJobOperationsMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v6.services.AddBatchJobOperationsRequest, com.google.ads.googleads.v6.services.AddBatchJobOperationsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddBatchJobOperations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v6.services.AddBatchJobOperationsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v6.services.AddBatchJobOperationsResponse.getDefaultInstance()))
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
  public static abstract class BatchJobServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Mutates a batch job.
     * </pre>
     */
    public void mutateBatchJob(com.google.ads.googleads.v6.services.MutateBatchJobRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v6.services.MutateBatchJobResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getMutateBatchJobMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns the batch job.
     * </pre>
     */
    public void getBatchJob(com.google.ads.googleads.v6.services.GetBatchJobRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v6.resources.BatchJob> responseObserver) {
      asyncUnimplementedUnaryCall(getGetBatchJobMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns the results of the batch job. The job must be done.
     * Supports standard list paging.
     * </pre>
     */
    public void listBatchJobResults(com.google.ads.googleads.v6.services.ListBatchJobResultsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v6.services.ListBatchJobResultsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListBatchJobResultsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Runs the batch job.
     * The Operation.metadata field type is BatchJobMetadata. When finished, the
     * long running operation will not contain errors or a response. Instead, use
     * ListBatchJobResults to get the results of the job.
     * </pre>
     */
    public void runBatchJob(com.google.ads.googleads.v6.services.RunBatchJobRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getRunBatchJobMethod(), responseObserver);
    }

    /**
     * <pre>
     * Add operations to the batch job.
     * </pre>
     */
    public void addBatchJobOperations(com.google.ads.googleads.v6.services.AddBatchJobOperationsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v6.services.AddBatchJobOperationsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAddBatchJobOperationsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getMutateBatchJobMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v6.services.MutateBatchJobRequest,
                com.google.ads.googleads.v6.services.MutateBatchJobResponse>(
                  this, METHODID_MUTATE_BATCH_JOB)))
          .addMethod(
            getGetBatchJobMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v6.services.GetBatchJobRequest,
                com.google.ads.googleads.v6.resources.BatchJob>(
                  this, METHODID_GET_BATCH_JOB)))
          .addMethod(
            getListBatchJobResultsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v6.services.ListBatchJobResultsRequest,
                com.google.ads.googleads.v6.services.ListBatchJobResultsResponse>(
                  this, METHODID_LIST_BATCH_JOB_RESULTS)))
          .addMethod(
            getRunBatchJobMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v6.services.RunBatchJobRequest,
                com.google.longrunning.Operation>(
                  this, METHODID_RUN_BATCH_JOB)))
          .addMethod(
            getAddBatchJobOperationsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v6.services.AddBatchJobOperationsRequest,
                com.google.ads.googleads.v6.services.AddBatchJobOperationsResponse>(
                  this, METHODID_ADD_BATCH_JOB_OPERATIONS)))
          .build();
    }
  }

  /**
   * <pre>
   * Service to manage batch jobs.
   * </pre>
   */
  public static final class BatchJobServiceStub extends io.grpc.stub.AbstractAsyncStub<BatchJobServiceStub> {
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
     * </pre>
     */
    public void mutateBatchJob(com.google.ads.googleads.v6.services.MutateBatchJobRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v6.services.MutateBatchJobResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getMutateBatchJobMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns the batch job.
     * </pre>
     */
    public void getBatchJob(com.google.ads.googleads.v6.services.GetBatchJobRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v6.resources.BatchJob> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetBatchJobMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns the results of the batch job. The job must be done.
     * Supports standard list paging.
     * </pre>
     */
    public void listBatchJobResults(com.google.ads.googleads.v6.services.ListBatchJobResultsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v6.services.ListBatchJobResultsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListBatchJobResultsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Runs the batch job.
     * The Operation.metadata field type is BatchJobMetadata. When finished, the
     * long running operation will not contain errors or a response. Instead, use
     * ListBatchJobResults to get the results of the job.
     * </pre>
     */
    public void runBatchJob(com.google.ads.googleads.v6.services.RunBatchJobRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRunBatchJobMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Add operations to the batch job.
     * </pre>
     */
    public void addBatchJobOperations(com.google.ads.googleads.v6.services.AddBatchJobOperationsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v6.services.AddBatchJobOperationsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddBatchJobOperationsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service to manage batch jobs.
   * </pre>
   */
  public static final class BatchJobServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<BatchJobServiceBlockingStub> {
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
     * </pre>
     */
    public com.google.ads.googleads.v6.services.MutateBatchJobResponse mutateBatchJob(com.google.ads.googleads.v6.services.MutateBatchJobRequest request) {
      return blockingUnaryCall(
          getChannel(), getMutateBatchJobMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns the batch job.
     * </pre>
     */
    public com.google.ads.googleads.v6.resources.BatchJob getBatchJob(com.google.ads.googleads.v6.services.GetBatchJobRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetBatchJobMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns the results of the batch job. The job must be done.
     * Supports standard list paging.
     * </pre>
     */
    public com.google.ads.googleads.v6.services.ListBatchJobResultsResponse listBatchJobResults(com.google.ads.googleads.v6.services.ListBatchJobResultsRequest request) {
      return blockingUnaryCall(
          getChannel(), getListBatchJobResultsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Runs the batch job.
     * The Operation.metadata field type is BatchJobMetadata. When finished, the
     * long running operation will not contain errors or a response. Instead, use
     * ListBatchJobResults to get the results of the job.
     * </pre>
     */
    public com.google.longrunning.Operation runBatchJob(com.google.ads.googleads.v6.services.RunBatchJobRequest request) {
      return blockingUnaryCall(
          getChannel(), getRunBatchJobMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Add operations to the batch job.
     * </pre>
     */
    public com.google.ads.googleads.v6.services.AddBatchJobOperationsResponse addBatchJobOperations(com.google.ads.googleads.v6.services.AddBatchJobOperationsRequest request) {
      return blockingUnaryCall(
          getChannel(), getAddBatchJobOperationsMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service to manage batch jobs.
   * </pre>
   */
  public static final class BatchJobServiceFutureStub extends io.grpc.stub.AbstractFutureStub<BatchJobServiceFutureStub> {
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
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v6.services.MutateBatchJobResponse> mutateBatchJob(
        com.google.ads.googleads.v6.services.MutateBatchJobRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getMutateBatchJobMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns the batch job.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v6.resources.BatchJob> getBatchJob(
        com.google.ads.googleads.v6.services.GetBatchJobRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetBatchJobMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns the results of the batch job. The job must be done.
     * Supports standard list paging.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v6.services.ListBatchJobResultsResponse> listBatchJobResults(
        com.google.ads.googleads.v6.services.ListBatchJobResultsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListBatchJobResultsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Runs the batch job.
     * The Operation.metadata field type is BatchJobMetadata. When finished, the
     * long running operation will not contain errors or a response. Instead, use
     * ListBatchJobResults to get the results of the job.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.longrunning.Operation> runBatchJob(
        com.google.ads.googleads.v6.services.RunBatchJobRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRunBatchJobMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Add operations to the batch job.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v6.services.AddBatchJobOperationsResponse> addBatchJobOperations(
        com.google.ads.googleads.v6.services.AddBatchJobOperationsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAddBatchJobOperationsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_MUTATE_BATCH_JOB = 0;
  private static final int METHODID_GET_BATCH_JOB = 1;
  private static final int METHODID_LIST_BATCH_JOB_RESULTS = 2;
  private static final int METHODID_RUN_BATCH_JOB = 3;
  private static final int METHODID_ADD_BATCH_JOB_OPERATIONS = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final BatchJobServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(BatchJobServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_MUTATE_BATCH_JOB:
          serviceImpl.mutateBatchJob((com.google.ads.googleads.v6.services.MutateBatchJobRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v6.services.MutateBatchJobResponse>) responseObserver);
          break;
        case METHODID_GET_BATCH_JOB:
          serviceImpl.getBatchJob((com.google.ads.googleads.v6.services.GetBatchJobRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v6.resources.BatchJob>) responseObserver);
          break;
        case METHODID_LIST_BATCH_JOB_RESULTS:
          serviceImpl.listBatchJobResults((com.google.ads.googleads.v6.services.ListBatchJobResultsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v6.services.ListBatchJobResultsResponse>) responseObserver);
          break;
        case METHODID_RUN_BATCH_JOB:
          serviceImpl.runBatchJob((com.google.ads.googleads.v6.services.RunBatchJobRequest) request,
              (io.grpc.stub.StreamObserver<com.google.longrunning.Operation>) responseObserver);
          break;
        case METHODID_ADD_BATCH_JOB_OPERATIONS:
          serviceImpl.addBatchJobOperations((com.google.ads.googleads.v6.services.AddBatchJobOperationsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v6.services.AddBatchJobOperationsResponse>) responseObserver);
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

  private static abstract class BatchJobServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    BatchJobServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v6.services.BatchJobServiceProto.getDescriptor();
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
    private final String methodName;

    BatchJobServiceMethodDescriptorSupplier(String methodName) {
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
              .addMethod(getGetBatchJobMethod())
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
