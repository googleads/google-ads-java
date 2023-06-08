package com.google.ads.googleads.v12.services;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Service to manage experiments.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/ads/googleads/v12/services/experiment_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ExperimentServiceGrpc {

  private ExperimentServiceGrpc() {}

  public static final String SERVICE_NAME = "google.ads.googleads.v12.services.ExperimentService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v12.services.MutateExperimentsRequest,
      com.google.ads.googleads.v12.services.MutateExperimentsResponse> getMutateExperimentsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MutateExperiments",
      requestType = com.google.ads.googleads.v12.services.MutateExperimentsRequest.class,
      responseType = com.google.ads.googleads.v12.services.MutateExperimentsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v12.services.MutateExperimentsRequest,
      com.google.ads.googleads.v12.services.MutateExperimentsResponse> getMutateExperimentsMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v12.services.MutateExperimentsRequest, com.google.ads.googleads.v12.services.MutateExperimentsResponse> getMutateExperimentsMethod;
    if ((getMutateExperimentsMethod = ExperimentServiceGrpc.getMutateExperimentsMethod) == null) {
      synchronized (ExperimentServiceGrpc.class) {
        if ((getMutateExperimentsMethod = ExperimentServiceGrpc.getMutateExperimentsMethod) == null) {
          ExperimentServiceGrpc.getMutateExperimentsMethod = getMutateExperimentsMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v12.services.MutateExperimentsRequest, com.google.ads.googleads.v12.services.MutateExperimentsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MutateExperiments"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v12.services.MutateExperimentsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v12.services.MutateExperimentsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ExperimentServiceMethodDescriptorSupplier("MutateExperiments"))
              .build();
        }
      }
    }
    return getMutateExperimentsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v12.services.EndExperimentRequest,
      com.google.protobuf.Empty> getEndExperimentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EndExperiment",
      requestType = com.google.ads.googleads.v12.services.EndExperimentRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v12.services.EndExperimentRequest,
      com.google.protobuf.Empty> getEndExperimentMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v12.services.EndExperimentRequest, com.google.protobuf.Empty> getEndExperimentMethod;
    if ((getEndExperimentMethod = ExperimentServiceGrpc.getEndExperimentMethod) == null) {
      synchronized (ExperimentServiceGrpc.class) {
        if ((getEndExperimentMethod = ExperimentServiceGrpc.getEndExperimentMethod) == null) {
          ExperimentServiceGrpc.getEndExperimentMethod = getEndExperimentMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v12.services.EndExperimentRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EndExperiment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v12.services.EndExperimentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new ExperimentServiceMethodDescriptorSupplier("EndExperiment"))
              .build();
        }
      }
    }
    return getEndExperimentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v12.services.ListExperimentAsyncErrorsRequest,
      com.google.ads.googleads.v12.services.ListExperimentAsyncErrorsResponse> getListExperimentAsyncErrorsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListExperimentAsyncErrors",
      requestType = com.google.ads.googleads.v12.services.ListExperimentAsyncErrorsRequest.class,
      responseType = com.google.ads.googleads.v12.services.ListExperimentAsyncErrorsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v12.services.ListExperimentAsyncErrorsRequest,
      com.google.ads.googleads.v12.services.ListExperimentAsyncErrorsResponse> getListExperimentAsyncErrorsMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v12.services.ListExperimentAsyncErrorsRequest, com.google.ads.googleads.v12.services.ListExperimentAsyncErrorsResponse> getListExperimentAsyncErrorsMethod;
    if ((getListExperimentAsyncErrorsMethod = ExperimentServiceGrpc.getListExperimentAsyncErrorsMethod) == null) {
      synchronized (ExperimentServiceGrpc.class) {
        if ((getListExperimentAsyncErrorsMethod = ExperimentServiceGrpc.getListExperimentAsyncErrorsMethod) == null) {
          ExperimentServiceGrpc.getListExperimentAsyncErrorsMethod = getListExperimentAsyncErrorsMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v12.services.ListExperimentAsyncErrorsRequest, com.google.ads.googleads.v12.services.ListExperimentAsyncErrorsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListExperimentAsyncErrors"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v12.services.ListExperimentAsyncErrorsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v12.services.ListExperimentAsyncErrorsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ExperimentServiceMethodDescriptorSupplier("ListExperimentAsyncErrors"))
              .build();
        }
      }
    }
    return getListExperimentAsyncErrorsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v12.services.GraduateExperimentRequest,
      com.google.protobuf.Empty> getGraduateExperimentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GraduateExperiment",
      requestType = com.google.ads.googleads.v12.services.GraduateExperimentRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v12.services.GraduateExperimentRequest,
      com.google.protobuf.Empty> getGraduateExperimentMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v12.services.GraduateExperimentRequest, com.google.protobuf.Empty> getGraduateExperimentMethod;
    if ((getGraduateExperimentMethod = ExperimentServiceGrpc.getGraduateExperimentMethod) == null) {
      synchronized (ExperimentServiceGrpc.class) {
        if ((getGraduateExperimentMethod = ExperimentServiceGrpc.getGraduateExperimentMethod) == null) {
          ExperimentServiceGrpc.getGraduateExperimentMethod = getGraduateExperimentMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v12.services.GraduateExperimentRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GraduateExperiment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v12.services.GraduateExperimentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new ExperimentServiceMethodDescriptorSupplier("GraduateExperiment"))
              .build();
        }
      }
    }
    return getGraduateExperimentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v12.services.ScheduleExperimentRequest,
      com.google.longrunning.Operation> getScheduleExperimentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ScheduleExperiment",
      requestType = com.google.ads.googleads.v12.services.ScheduleExperimentRequest.class,
      responseType = com.google.longrunning.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v12.services.ScheduleExperimentRequest,
      com.google.longrunning.Operation> getScheduleExperimentMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v12.services.ScheduleExperimentRequest, com.google.longrunning.Operation> getScheduleExperimentMethod;
    if ((getScheduleExperimentMethod = ExperimentServiceGrpc.getScheduleExperimentMethod) == null) {
      synchronized (ExperimentServiceGrpc.class) {
        if ((getScheduleExperimentMethod = ExperimentServiceGrpc.getScheduleExperimentMethod) == null) {
          ExperimentServiceGrpc.getScheduleExperimentMethod = getScheduleExperimentMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v12.services.ScheduleExperimentRequest, com.google.longrunning.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ScheduleExperiment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v12.services.ScheduleExperimentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.longrunning.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new ExperimentServiceMethodDescriptorSupplier("ScheduleExperiment"))
              .build();
        }
      }
    }
    return getScheduleExperimentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v12.services.PromoteExperimentRequest,
      com.google.longrunning.Operation> getPromoteExperimentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PromoteExperiment",
      requestType = com.google.ads.googleads.v12.services.PromoteExperimentRequest.class,
      responseType = com.google.longrunning.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v12.services.PromoteExperimentRequest,
      com.google.longrunning.Operation> getPromoteExperimentMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v12.services.PromoteExperimentRequest, com.google.longrunning.Operation> getPromoteExperimentMethod;
    if ((getPromoteExperimentMethod = ExperimentServiceGrpc.getPromoteExperimentMethod) == null) {
      synchronized (ExperimentServiceGrpc.class) {
        if ((getPromoteExperimentMethod = ExperimentServiceGrpc.getPromoteExperimentMethod) == null) {
          ExperimentServiceGrpc.getPromoteExperimentMethod = getPromoteExperimentMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v12.services.PromoteExperimentRequest, com.google.longrunning.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PromoteExperiment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v12.services.PromoteExperimentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.longrunning.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new ExperimentServiceMethodDescriptorSupplier("PromoteExperiment"))
              .build();
        }
      }
    }
    return getPromoteExperimentMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ExperimentServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ExperimentServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ExperimentServiceStub>() {
        @java.lang.Override
        public ExperimentServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ExperimentServiceStub(channel, callOptions);
        }
      };
    return ExperimentServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ExperimentServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ExperimentServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ExperimentServiceBlockingStub>() {
        @java.lang.Override
        public ExperimentServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ExperimentServiceBlockingStub(channel, callOptions);
        }
      };
    return ExperimentServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ExperimentServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ExperimentServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ExperimentServiceFutureStub>() {
        @java.lang.Override
        public ExperimentServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ExperimentServiceFutureStub(channel, callOptions);
        }
      };
    return ExperimentServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Service to manage experiments.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Creates, updates, or removes experiments. Operation statuses are returned.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [ExperimentError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    default void mutateExperiments(com.google.ads.googleads.v12.services.MutateExperimentsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v12.services.MutateExperimentsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMutateExperimentsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Immediately ends an experiment, changing the experiment's scheduled
     * end date and without waiting for end of day. End date is updated to be the
     * time of the request.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [ExperimentError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    default void endExperiment(com.google.ads.googleads.v12.services.EndExperimentRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEndExperimentMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns all errors that occurred during the last Experiment update (either
     * scheduling or promotion).
     * Supports standard list paging.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    default void listExperimentAsyncErrors(com.google.ads.googleads.v12.services.ListExperimentAsyncErrorsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v12.services.ListExperimentAsyncErrorsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListExperimentAsyncErrorsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Graduates an experiment to a full campaign.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [ExperimentError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [MutateError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    default void graduateExperiment(com.google.ads.googleads.v12.services.GraduateExperimentRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGraduateExperimentMethod(), responseObserver);
    }

    /**
     * <pre>
     * Schedule an experiment. The in design campaign
     * will be converted into a real campaign (called the experiment campaign)
     * that will begin serving ads if successfully created.
     * The experiment is scheduled immediately with status INITIALIZING.
     * This method returns a long running operation that tracks the forking of the
     * in design campaign. If the forking fails, a list of errors can be retrieved
     * using the ListExperimentAsyncErrors method. The operation's
     * metadata will be a string containing the resource name of the created
     * experiment.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [ExperimentError]()
     *   [DatabaseError]()
     *   [DateError]()
     *   [DateRangeError]()
     *   [FieldError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RangeError]()
     *   [RequestError]()
     * </pre>
     */
    default void scheduleExperiment(com.google.ads.googleads.v12.services.ScheduleExperimentRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getScheduleExperimentMethod(), responseObserver);
    }

    /**
     * <pre>
     * Promotes the trial campaign thus applying changes in the trial campaign
     * to the base campaign.
     * This method returns a long running operation that tracks the promotion of
     * the experiment campaign. If it fails, a list of errors can be retrieved
     * using the ListExperimentAsyncErrors method. The operation's
     * metadata will be a string containing the resource name of the created
     * experiment.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [ExperimentError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    default void promoteExperiment(com.google.ads.googleads.v12.services.PromoteExperimentRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPromoteExperimentMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service ExperimentService.
   * <pre>
   * Service to manage experiments.
   * </pre>
   */
  public static abstract class ExperimentServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return ExperimentServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service ExperimentService.
   * <pre>
   * Service to manage experiments.
   * </pre>
   */
  public static final class ExperimentServiceStub
      extends io.grpc.stub.AbstractAsyncStub<ExperimentServiceStub> {
    private ExperimentServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ExperimentServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ExperimentServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates, updates, or removes experiments. Operation statuses are returned.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [ExperimentError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public void mutateExperiments(com.google.ads.googleads.v12.services.MutateExperimentsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v12.services.MutateExperimentsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMutateExperimentsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Immediately ends an experiment, changing the experiment's scheduled
     * end date and without waiting for end of day. End date is updated to be the
     * time of the request.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [ExperimentError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public void endExperiment(com.google.ads.googleads.v12.services.EndExperimentRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEndExperimentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns all errors that occurred during the last Experiment update (either
     * scheduling or promotion).
     * Supports standard list paging.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public void listExperimentAsyncErrors(com.google.ads.googleads.v12.services.ListExperimentAsyncErrorsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v12.services.ListExperimentAsyncErrorsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListExperimentAsyncErrorsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Graduates an experiment to a full campaign.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [ExperimentError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [MutateError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public void graduateExperiment(com.google.ads.googleads.v12.services.GraduateExperimentRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGraduateExperimentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Schedule an experiment. The in design campaign
     * will be converted into a real campaign (called the experiment campaign)
     * that will begin serving ads if successfully created.
     * The experiment is scheduled immediately with status INITIALIZING.
     * This method returns a long running operation that tracks the forking of the
     * in design campaign. If the forking fails, a list of errors can be retrieved
     * using the ListExperimentAsyncErrors method. The operation's
     * metadata will be a string containing the resource name of the created
     * experiment.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [ExperimentError]()
     *   [DatabaseError]()
     *   [DateError]()
     *   [DateRangeError]()
     *   [FieldError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RangeError]()
     *   [RequestError]()
     * </pre>
     */
    public void scheduleExperiment(com.google.ads.googleads.v12.services.ScheduleExperimentRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getScheduleExperimentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Promotes the trial campaign thus applying changes in the trial campaign
     * to the base campaign.
     * This method returns a long running operation that tracks the promotion of
     * the experiment campaign. If it fails, a list of errors can be retrieved
     * using the ListExperimentAsyncErrors method. The operation's
     * metadata will be a string containing the resource name of the created
     * experiment.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [ExperimentError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public void promoteExperiment(com.google.ads.googleads.v12.services.PromoteExperimentRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPromoteExperimentMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service ExperimentService.
   * <pre>
   * Service to manage experiments.
   * </pre>
   */
  public static final class ExperimentServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<ExperimentServiceBlockingStub> {
    private ExperimentServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ExperimentServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ExperimentServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates, updates, or removes experiments. Operation statuses are returned.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [ExperimentError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.ads.googleads.v12.services.MutateExperimentsResponse mutateExperiments(com.google.ads.googleads.v12.services.MutateExperimentsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMutateExperimentsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Immediately ends an experiment, changing the experiment's scheduled
     * end date and without waiting for end of day. End date is updated to be the
     * time of the request.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [ExperimentError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.protobuf.Empty endExperiment(com.google.ads.googleads.v12.services.EndExperimentRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEndExperimentMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns all errors that occurred during the last Experiment update (either
     * scheduling or promotion).
     * Supports standard list paging.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.ads.googleads.v12.services.ListExperimentAsyncErrorsResponse listExperimentAsyncErrors(com.google.ads.googleads.v12.services.ListExperimentAsyncErrorsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListExperimentAsyncErrorsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Graduates an experiment to a full campaign.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [ExperimentError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [MutateError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.protobuf.Empty graduateExperiment(com.google.ads.googleads.v12.services.GraduateExperimentRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGraduateExperimentMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Schedule an experiment. The in design campaign
     * will be converted into a real campaign (called the experiment campaign)
     * that will begin serving ads if successfully created.
     * The experiment is scheduled immediately with status INITIALIZING.
     * This method returns a long running operation that tracks the forking of the
     * in design campaign. If the forking fails, a list of errors can be retrieved
     * using the ListExperimentAsyncErrors method. The operation's
     * metadata will be a string containing the resource name of the created
     * experiment.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [ExperimentError]()
     *   [DatabaseError]()
     *   [DateError]()
     *   [DateRangeError]()
     *   [FieldError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RangeError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.longrunning.Operation scheduleExperiment(com.google.ads.googleads.v12.services.ScheduleExperimentRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getScheduleExperimentMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Promotes the trial campaign thus applying changes in the trial campaign
     * to the base campaign.
     * This method returns a long running operation that tracks the promotion of
     * the experiment campaign. If it fails, a list of errors can be retrieved
     * using the ListExperimentAsyncErrors method. The operation's
     * metadata will be a string containing the resource name of the created
     * experiment.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [ExperimentError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.longrunning.Operation promoteExperiment(com.google.ads.googleads.v12.services.PromoteExperimentRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPromoteExperimentMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service ExperimentService.
   * <pre>
   * Service to manage experiments.
   * </pre>
   */
  public static final class ExperimentServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<ExperimentServiceFutureStub> {
    private ExperimentServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ExperimentServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ExperimentServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates, updates, or removes experiments. Operation statuses are returned.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [ExperimentError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v12.services.MutateExperimentsResponse> mutateExperiments(
        com.google.ads.googleads.v12.services.MutateExperimentsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMutateExperimentsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Immediately ends an experiment, changing the experiment's scheduled
     * end date and without waiting for end of day. End date is updated to be the
     * time of the request.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [ExperimentError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> endExperiment(
        com.google.ads.googleads.v12.services.EndExperimentRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEndExperimentMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns all errors that occurred during the last Experiment update (either
     * scheduling or promotion).
     * Supports standard list paging.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v12.services.ListExperimentAsyncErrorsResponse> listExperimentAsyncErrors(
        com.google.ads.googleads.v12.services.ListExperimentAsyncErrorsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListExperimentAsyncErrorsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Graduates an experiment to a full campaign.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [ExperimentError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [MutateError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> graduateExperiment(
        com.google.ads.googleads.v12.services.GraduateExperimentRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGraduateExperimentMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Schedule an experiment. The in design campaign
     * will be converted into a real campaign (called the experiment campaign)
     * that will begin serving ads if successfully created.
     * The experiment is scheduled immediately with status INITIALIZING.
     * This method returns a long running operation that tracks the forking of the
     * in design campaign. If the forking fails, a list of errors can be retrieved
     * using the ListExperimentAsyncErrors method. The operation's
     * metadata will be a string containing the resource name of the created
     * experiment.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [ExperimentError]()
     *   [DatabaseError]()
     *   [DateError]()
     *   [DateRangeError]()
     *   [FieldError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RangeError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.longrunning.Operation> scheduleExperiment(
        com.google.ads.googleads.v12.services.ScheduleExperimentRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getScheduleExperimentMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Promotes the trial campaign thus applying changes in the trial campaign
     * to the base campaign.
     * This method returns a long running operation that tracks the promotion of
     * the experiment campaign. If it fails, a list of errors can be retrieved
     * using the ListExperimentAsyncErrors method. The operation's
     * metadata will be a string containing the resource name of the created
     * experiment.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [ExperimentError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.longrunning.Operation> promoteExperiment(
        com.google.ads.googleads.v12.services.PromoteExperimentRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPromoteExperimentMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_MUTATE_EXPERIMENTS = 0;
  private static final int METHODID_END_EXPERIMENT = 1;
  private static final int METHODID_LIST_EXPERIMENT_ASYNC_ERRORS = 2;
  private static final int METHODID_GRADUATE_EXPERIMENT = 3;
  private static final int METHODID_SCHEDULE_EXPERIMENT = 4;
  private static final int METHODID_PROMOTE_EXPERIMENT = 5;

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
        case METHODID_MUTATE_EXPERIMENTS:
          serviceImpl.mutateExperiments((com.google.ads.googleads.v12.services.MutateExperimentsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v12.services.MutateExperimentsResponse>) responseObserver);
          break;
        case METHODID_END_EXPERIMENT:
          serviceImpl.endExperiment((com.google.ads.googleads.v12.services.EndExperimentRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_LIST_EXPERIMENT_ASYNC_ERRORS:
          serviceImpl.listExperimentAsyncErrors((com.google.ads.googleads.v12.services.ListExperimentAsyncErrorsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v12.services.ListExperimentAsyncErrorsResponse>) responseObserver);
          break;
        case METHODID_GRADUATE_EXPERIMENT:
          serviceImpl.graduateExperiment((com.google.ads.googleads.v12.services.GraduateExperimentRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_SCHEDULE_EXPERIMENT:
          serviceImpl.scheduleExperiment((com.google.ads.googleads.v12.services.ScheduleExperimentRequest) request,
              (io.grpc.stub.StreamObserver<com.google.longrunning.Operation>) responseObserver);
          break;
        case METHODID_PROMOTE_EXPERIMENT:
          serviceImpl.promoteExperiment((com.google.ads.googleads.v12.services.PromoteExperimentRequest) request,
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

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getMutateExperimentsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.ads.googleads.v12.services.MutateExperimentsRequest,
              com.google.ads.googleads.v12.services.MutateExperimentsResponse>(
                service, METHODID_MUTATE_EXPERIMENTS)))
        .addMethod(
          getEndExperimentMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.ads.googleads.v12.services.EndExperimentRequest,
              com.google.protobuf.Empty>(
                service, METHODID_END_EXPERIMENT)))
        .addMethod(
          getListExperimentAsyncErrorsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.ads.googleads.v12.services.ListExperimentAsyncErrorsRequest,
              com.google.ads.googleads.v12.services.ListExperimentAsyncErrorsResponse>(
                service, METHODID_LIST_EXPERIMENT_ASYNC_ERRORS)))
        .addMethod(
          getGraduateExperimentMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.ads.googleads.v12.services.GraduateExperimentRequest,
              com.google.protobuf.Empty>(
                service, METHODID_GRADUATE_EXPERIMENT)))
        .addMethod(
          getScheduleExperimentMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.ads.googleads.v12.services.ScheduleExperimentRequest,
              com.google.longrunning.Operation>(
                service, METHODID_SCHEDULE_EXPERIMENT)))
        .addMethod(
          getPromoteExperimentMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.ads.googleads.v12.services.PromoteExperimentRequest,
              com.google.longrunning.Operation>(
                service, METHODID_PROMOTE_EXPERIMENT)))
        .build();
  }

  private static abstract class ExperimentServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ExperimentServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v12.services.ExperimentServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ExperimentService");
    }
  }

  private static final class ExperimentServiceFileDescriptorSupplier
      extends ExperimentServiceBaseDescriptorSupplier {
    ExperimentServiceFileDescriptorSupplier() {}
  }

  private static final class ExperimentServiceMethodDescriptorSupplier
      extends ExperimentServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ExperimentServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ExperimentServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ExperimentServiceFileDescriptorSupplier())
              .addMethod(getMutateExperimentsMethod())
              .addMethod(getEndExperimentMethod())
              .addMethod(getListExperimentAsyncErrorsMethod())
              .addMethod(getGraduateExperimentMethod())
              .addMethod(getScheduleExperimentMethod())
              .addMethod(getPromoteExperimentMethod())
              .build();
        }
      }
    }
    return result;
  }
}
