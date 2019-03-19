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
 * Service to manage mutate jobs.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.10.0)",
    comments = "Source: google/ads/googleads/v1/services/mutate_job_service.proto")
public final class MutateJobServiceGrpc {

  private MutateJobServiceGrpc() {}

  public static final String SERVICE_NAME = "google.ads.googleads.v1.services.MutateJobService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getCreateMutateJobMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.google.ads.googleads.v1.services.CreateMutateJobRequest,
      com.google.ads.googleads.v1.services.CreateMutateJobResponse> METHOD_CREATE_MUTATE_JOB = getCreateMutateJobMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v1.services.CreateMutateJobRequest,
      com.google.ads.googleads.v1.services.CreateMutateJobResponse> getCreateMutateJobMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v1.services.CreateMutateJobRequest,
      com.google.ads.googleads.v1.services.CreateMutateJobResponse> getCreateMutateJobMethod() {
    return getCreateMutateJobMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.google.ads.googleads.v1.services.CreateMutateJobRequest,
      com.google.ads.googleads.v1.services.CreateMutateJobResponse> getCreateMutateJobMethodHelper() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v1.services.CreateMutateJobRequest, com.google.ads.googleads.v1.services.CreateMutateJobResponse> getCreateMutateJobMethod;
    if ((getCreateMutateJobMethod = MutateJobServiceGrpc.getCreateMutateJobMethod) == null) {
      synchronized (MutateJobServiceGrpc.class) {
        if ((getCreateMutateJobMethod = MutateJobServiceGrpc.getCreateMutateJobMethod) == null) {
          MutateJobServiceGrpc.getCreateMutateJobMethod = getCreateMutateJobMethod = 
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v1.services.CreateMutateJobRequest, com.google.ads.googleads.v1.services.CreateMutateJobResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "google.ads.googleads.v1.services.MutateJobService", "CreateMutateJob"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v1.services.CreateMutateJobRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v1.services.CreateMutateJobResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new MutateJobServiceMethodDescriptorSupplier("CreateMutateJob"))
                  .build();
          }
        }
     }
     return getCreateMutateJobMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGetMutateJobMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.google.ads.googleads.v1.services.GetMutateJobRequest,
      com.google.ads.googleads.v1.resources.MutateJob> METHOD_GET_MUTATE_JOB = getGetMutateJobMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v1.services.GetMutateJobRequest,
      com.google.ads.googleads.v1.resources.MutateJob> getGetMutateJobMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v1.services.GetMutateJobRequest,
      com.google.ads.googleads.v1.resources.MutateJob> getGetMutateJobMethod() {
    return getGetMutateJobMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.google.ads.googleads.v1.services.GetMutateJobRequest,
      com.google.ads.googleads.v1.resources.MutateJob> getGetMutateJobMethodHelper() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v1.services.GetMutateJobRequest, com.google.ads.googleads.v1.resources.MutateJob> getGetMutateJobMethod;
    if ((getGetMutateJobMethod = MutateJobServiceGrpc.getGetMutateJobMethod) == null) {
      synchronized (MutateJobServiceGrpc.class) {
        if ((getGetMutateJobMethod = MutateJobServiceGrpc.getGetMutateJobMethod) == null) {
          MutateJobServiceGrpc.getGetMutateJobMethod = getGetMutateJobMethod = 
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v1.services.GetMutateJobRequest, com.google.ads.googleads.v1.resources.MutateJob>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "google.ads.googleads.v1.services.MutateJobService", "GetMutateJob"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v1.services.GetMutateJobRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v1.resources.MutateJob.getDefaultInstance()))
                  .setSchemaDescriptor(new MutateJobServiceMethodDescriptorSupplier("GetMutateJob"))
                  .build();
          }
        }
     }
     return getGetMutateJobMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getListMutateJobResultsMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.google.ads.googleads.v1.services.ListMutateJobResultsRequest,
      com.google.ads.googleads.v1.services.ListMutateJobResultsResponse> METHOD_LIST_MUTATE_JOB_RESULTS = getListMutateJobResultsMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v1.services.ListMutateJobResultsRequest,
      com.google.ads.googleads.v1.services.ListMutateJobResultsResponse> getListMutateJobResultsMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v1.services.ListMutateJobResultsRequest,
      com.google.ads.googleads.v1.services.ListMutateJobResultsResponse> getListMutateJobResultsMethod() {
    return getListMutateJobResultsMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.google.ads.googleads.v1.services.ListMutateJobResultsRequest,
      com.google.ads.googleads.v1.services.ListMutateJobResultsResponse> getListMutateJobResultsMethodHelper() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v1.services.ListMutateJobResultsRequest, com.google.ads.googleads.v1.services.ListMutateJobResultsResponse> getListMutateJobResultsMethod;
    if ((getListMutateJobResultsMethod = MutateJobServiceGrpc.getListMutateJobResultsMethod) == null) {
      synchronized (MutateJobServiceGrpc.class) {
        if ((getListMutateJobResultsMethod = MutateJobServiceGrpc.getListMutateJobResultsMethod) == null) {
          MutateJobServiceGrpc.getListMutateJobResultsMethod = getListMutateJobResultsMethod = 
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v1.services.ListMutateJobResultsRequest, com.google.ads.googleads.v1.services.ListMutateJobResultsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "google.ads.googleads.v1.services.MutateJobService", "ListMutateJobResults"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v1.services.ListMutateJobResultsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v1.services.ListMutateJobResultsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new MutateJobServiceMethodDescriptorSupplier("ListMutateJobResults"))
                  .build();
          }
        }
     }
     return getListMutateJobResultsMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getRunMutateJobMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.google.ads.googleads.v1.services.RunMutateJobRequest,
      com.google.longrunning.Operation> METHOD_RUN_MUTATE_JOB = getRunMutateJobMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v1.services.RunMutateJobRequest,
      com.google.longrunning.Operation> getRunMutateJobMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v1.services.RunMutateJobRequest,
      com.google.longrunning.Operation> getRunMutateJobMethod() {
    return getRunMutateJobMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.google.ads.googleads.v1.services.RunMutateJobRequest,
      com.google.longrunning.Operation> getRunMutateJobMethodHelper() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v1.services.RunMutateJobRequest, com.google.longrunning.Operation> getRunMutateJobMethod;
    if ((getRunMutateJobMethod = MutateJobServiceGrpc.getRunMutateJobMethod) == null) {
      synchronized (MutateJobServiceGrpc.class) {
        if ((getRunMutateJobMethod = MutateJobServiceGrpc.getRunMutateJobMethod) == null) {
          MutateJobServiceGrpc.getRunMutateJobMethod = getRunMutateJobMethod = 
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v1.services.RunMutateJobRequest, com.google.longrunning.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "google.ads.googleads.v1.services.MutateJobService", "RunMutateJob"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v1.services.RunMutateJobRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.longrunning.Operation.getDefaultInstance()))
                  .setSchemaDescriptor(new MutateJobServiceMethodDescriptorSupplier("RunMutateJob"))
                  .build();
          }
        }
     }
     return getRunMutateJobMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getAddMutateJobOperationsMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.google.ads.googleads.v1.services.AddMutateJobOperationsRequest,
      com.google.ads.googleads.v1.services.AddMutateJobOperationsResponse> METHOD_ADD_MUTATE_JOB_OPERATIONS = getAddMutateJobOperationsMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v1.services.AddMutateJobOperationsRequest,
      com.google.ads.googleads.v1.services.AddMutateJobOperationsResponse> getAddMutateJobOperationsMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v1.services.AddMutateJobOperationsRequest,
      com.google.ads.googleads.v1.services.AddMutateJobOperationsResponse> getAddMutateJobOperationsMethod() {
    return getAddMutateJobOperationsMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.google.ads.googleads.v1.services.AddMutateJobOperationsRequest,
      com.google.ads.googleads.v1.services.AddMutateJobOperationsResponse> getAddMutateJobOperationsMethodHelper() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v1.services.AddMutateJobOperationsRequest, com.google.ads.googleads.v1.services.AddMutateJobOperationsResponse> getAddMutateJobOperationsMethod;
    if ((getAddMutateJobOperationsMethod = MutateJobServiceGrpc.getAddMutateJobOperationsMethod) == null) {
      synchronized (MutateJobServiceGrpc.class) {
        if ((getAddMutateJobOperationsMethod = MutateJobServiceGrpc.getAddMutateJobOperationsMethod) == null) {
          MutateJobServiceGrpc.getAddMutateJobOperationsMethod = getAddMutateJobOperationsMethod = 
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v1.services.AddMutateJobOperationsRequest, com.google.ads.googleads.v1.services.AddMutateJobOperationsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "google.ads.googleads.v1.services.MutateJobService", "AddMutateJobOperations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v1.services.AddMutateJobOperationsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v1.services.AddMutateJobOperationsResponse.getDefaultInstance()))
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
    return new MutateJobServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MutateJobServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new MutateJobServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MutateJobServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new MutateJobServiceFutureStub(channel);
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
    public void createMutateJob(com.google.ads.googleads.v1.services.CreateMutateJobRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v1.services.CreateMutateJobResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateMutateJobMethodHelper(), responseObserver);
    }

    /**
     * <pre>
     * Returns the mutate job.
     * </pre>
     */
    public void getMutateJob(com.google.ads.googleads.v1.services.GetMutateJobRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v1.resources.MutateJob> responseObserver) {
      asyncUnimplementedUnaryCall(getGetMutateJobMethodHelper(), responseObserver);
    }

    /**
     * <pre>
     * Returns the results of the mutate job. The job must be done.
     * Supports standard list paging.
     * </pre>
     */
    public void listMutateJobResults(com.google.ads.googleads.v1.services.ListMutateJobResultsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v1.services.ListMutateJobResultsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListMutateJobResultsMethodHelper(), responseObserver);
    }

    /**
     * <pre>
     * Runs the mutate job.
     * The Operation.metadata field type is MutateJobMetadata. When finished, the
     * long running operation will not contain errors or a response. Instead, use
     * ListMutateJobResults to get the results of the job.
     * </pre>
     */
    public void runMutateJob(com.google.ads.googleads.v1.services.RunMutateJobRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getRunMutateJobMethodHelper(), responseObserver);
    }

    /**
     * <pre>
     * Add operations to the mutate job.
     * </pre>
     */
    public void addMutateJobOperations(com.google.ads.googleads.v1.services.AddMutateJobOperationsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v1.services.AddMutateJobOperationsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAddMutateJobOperationsMethodHelper(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateMutateJobMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v1.services.CreateMutateJobRequest,
                com.google.ads.googleads.v1.services.CreateMutateJobResponse>(
                  this, METHODID_CREATE_MUTATE_JOB)))
          .addMethod(
            getGetMutateJobMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v1.services.GetMutateJobRequest,
                com.google.ads.googleads.v1.resources.MutateJob>(
                  this, METHODID_GET_MUTATE_JOB)))
          .addMethod(
            getListMutateJobResultsMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v1.services.ListMutateJobResultsRequest,
                com.google.ads.googleads.v1.services.ListMutateJobResultsResponse>(
                  this, METHODID_LIST_MUTATE_JOB_RESULTS)))
          .addMethod(
            getRunMutateJobMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v1.services.RunMutateJobRequest,
                com.google.longrunning.Operation>(
                  this, METHODID_RUN_MUTATE_JOB)))
          .addMethod(
            getAddMutateJobOperationsMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v1.services.AddMutateJobOperationsRequest,
                com.google.ads.googleads.v1.services.AddMutateJobOperationsResponse>(
                  this, METHODID_ADD_MUTATE_JOB_OPERATIONS)))
          .build();
    }
  }

  /**
   * <pre>
   * Service to manage mutate jobs.
   * </pre>
   */
  public static final class MutateJobServiceStub extends io.grpc.stub.AbstractStub<MutateJobServiceStub> {
    private MutateJobServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MutateJobServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MutateJobServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MutateJobServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates a mutate job.
     * </pre>
     */
    public void createMutateJob(com.google.ads.googleads.v1.services.CreateMutateJobRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v1.services.CreateMutateJobResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateMutateJobMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns the mutate job.
     * </pre>
     */
    public void getMutateJob(com.google.ads.googleads.v1.services.GetMutateJobRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v1.resources.MutateJob> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetMutateJobMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns the results of the mutate job. The job must be done.
     * Supports standard list paging.
     * </pre>
     */
    public void listMutateJobResults(com.google.ads.googleads.v1.services.ListMutateJobResultsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v1.services.ListMutateJobResultsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListMutateJobResultsMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Runs the mutate job.
     * The Operation.metadata field type is MutateJobMetadata. When finished, the
     * long running operation will not contain errors or a response. Instead, use
     * ListMutateJobResults to get the results of the job.
     * </pre>
     */
    public void runMutateJob(com.google.ads.googleads.v1.services.RunMutateJobRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRunMutateJobMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Add operations to the mutate job.
     * </pre>
     */
    public void addMutateJobOperations(com.google.ads.googleads.v1.services.AddMutateJobOperationsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v1.services.AddMutateJobOperationsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddMutateJobOperationsMethodHelper(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service to manage mutate jobs.
   * </pre>
   */
  public static final class MutateJobServiceBlockingStub extends io.grpc.stub.AbstractStub<MutateJobServiceBlockingStub> {
    private MutateJobServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MutateJobServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MutateJobServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MutateJobServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates a mutate job.
     * </pre>
     */
    public com.google.ads.googleads.v1.services.CreateMutateJobResponse createMutateJob(com.google.ads.googleads.v1.services.CreateMutateJobRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateMutateJobMethodHelper(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns the mutate job.
     * </pre>
     */
    public com.google.ads.googleads.v1.resources.MutateJob getMutateJob(com.google.ads.googleads.v1.services.GetMutateJobRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetMutateJobMethodHelper(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns the results of the mutate job. The job must be done.
     * Supports standard list paging.
     * </pre>
     */
    public com.google.ads.googleads.v1.services.ListMutateJobResultsResponse listMutateJobResults(com.google.ads.googleads.v1.services.ListMutateJobResultsRequest request) {
      return blockingUnaryCall(
          getChannel(), getListMutateJobResultsMethodHelper(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Runs the mutate job.
     * The Operation.metadata field type is MutateJobMetadata. When finished, the
     * long running operation will not contain errors or a response. Instead, use
     * ListMutateJobResults to get the results of the job.
     * </pre>
     */
    public com.google.longrunning.Operation runMutateJob(com.google.ads.googleads.v1.services.RunMutateJobRequest request) {
      return blockingUnaryCall(
          getChannel(), getRunMutateJobMethodHelper(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Add operations to the mutate job.
     * </pre>
     */
    public com.google.ads.googleads.v1.services.AddMutateJobOperationsResponse addMutateJobOperations(com.google.ads.googleads.v1.services.AddMutateJobOperationsRequest request) {
      return blockingUnaryCall(
          getChannel(), getAddMutateJobOperationsMethodHelper(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service to manage mutate jobs.
   * </pre>
   */
  public static final class MutateJobServiceFutureStub extends io.grpc.stub.AbstractStub<MutateJobServiceFutureStub> {
    private MutateJobServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MutateJobServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MutateJobServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MutateJobServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates a mutate job.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v1.services.CreateMutateJobResponse> createMutateJob(
        com.google.ads.googleads.v1.services.CreateMutateJobRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateMutateJobMethodHelper(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns the mutate job.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v1.resources.MutateJob> getMutateJob(
        com.google.ads.googleads.v1.services.GetMutateJobRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetMutateJobMethodHelper(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns the results of the mutate job. The job must be done.
     * Supports standard list paging.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v1.services.ListMutateJobResultsResponse> listMutateJobResults(
        com.google.ads.googleads.v1.services.ListMutateJobResultsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListMutateJobResultsMethodHelper(), getCallOptions()), request);
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
        com.google.ads.googleads.v1.services.RunMutateJobRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRunMutateJobMethodHelper(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Add operations to the mutate job.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v1.services.AddMutateJobOperationsResponse> addMutateJobOperations(
        com.google.ads.googleads.v1.services.AddMutateJobOperationsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAddMutateJobOperationsMethodHelper(), getCallOptions()), request);
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
          serviceImpl.createMutateJob((com.google.ads.googleads.v1.services.CreateMutateJobRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v1.services.CreateMutateJobResponse>) responseObserver);
          break;
        case METHODID_GET_MUTATE_JOB:
          serviceImpl.getMutateJob((com.google.ads.googleads.v1.services.GetMutateJobRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v1.resources.MutateJob>) responseObserver);
          break;
        case METHODID_LIST_MUTATE_JOB_RESULTS:
          serviceImpl.listMutateJobResults((com.google.ads.googleads.v1.services.ListMutateJobResultsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v1.services.ListMutateJobResultsResponse>) responseObserver);
          break;
        case METHODID_RUN_MUTATE_JOB:
          serviceImpl.runMutateJob((com.google.ads.googleads.v1.services.RunMutateJobRequest) request,
              (io.grpc.stub.StreamObserver<com.google.longrunning.Operation>) responseObserver);
          break;
        case METHODID_ADD_MUTATE_JOB_OPERATIONS:
          serviceImpl.addMutateJobOperations((com.google.ads.googleads.v1.services.AddMutateJobOperationsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v1.services.AddMutateJobOperationsResponse>) responseObserver);
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
      return com.google.ads.googleads.v1.services.MutateJobServiceProto.getDescriptor();
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
              .addMethod(getCreateMutateJobMethodHelper())
              .addMethod(getGetMutateJobMethodHelper())
              .addMethod(getListMutateJobResultsMethodHelper())
              .addMethod(getRunMutateJobMethodHelper())
              .addMethod(getAddMutateJobOperationsMethodHelper())
              .build();
        }
      }
    }
    return result;
  }
}
