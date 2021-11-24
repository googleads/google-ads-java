package com.google.ads.googleads.v9.services;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * CampaignExperimentService manages the life cycle of campaign experiments.
 * It is used to create new experiments from drafts, modify experiment
 * properties, promote changes in an experiment back to its base campaign,
 * graduate experiments into new stand-alone campaigns, and to remove an
 * experiment.
 * An experiment consists of two variants or arms - the base campaign and the
 * experiment campaign, directing a fixed share of traffic to each arm.
 * A campaign experiment is created from a draft of changes to the base campaign
 * and will be a snapshot of changes in the draft at the time of creation.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/ads/googleads/v9/services/campaign_experiment_service.proto")
public final class CampaignExperimentServiceGrpc {

  private CampaignExperimentServiceGrpc() {}

  public static final String SERVICE_NAME = "google.ads.googleads.v9.services.CampaignExperimentService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v9.services.GetCampaignExperimentRequest,
      com.google.ads.googleads.v9.resources.CampaignExperiment> getGetCampaignExperimentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetCampaignExperiment",
      requestType = com.google.ads.googleads.v9.services.GetCampaignExperimentRequest.class,
      responseType = com.google.ads.googleads.v9.resources.CampaignExperiment.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v9.services.GetCampaignExperimentRequest,
      com.google.ads.googleads.v9.resources.CampaignExperiment> getGetCampaignExperimentMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v9.services.GetCampaignExperimentRequest, com.google.ads.googleads.v9.resources.CampaignExperiment> getGetCampaignExperimentMethod;
    if ((getGetCampaignExperimentMethod = CampaignExperimentServiceGrpc.getGetCampaignExperimentMethod) == null) {
      synchronized (CampaignExperimentServiceGrpc.class) {
        if ((getGetCampaignExperimentMethod = CampaignExperimentServiceGrpc.getGetCampaignExperimentMethod) == null) {
          CampaignExperimentServiceGrpc.getGetCampaignExperimentMethod = getGetCampaignExperimentMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v9.services.GetCampaignExperimentRequest, com.google.ads.googleads.v9.resources.CampaignExperiment>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetCampaignExperiment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v9.services.GetCampaignExperimentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v9.resources.CampaignExperiment.getDefaultInstance()))
              .setSchemaDescriptor(new CampaignExperimentServiceMethodDescriptorSupplier("GetCampaignExperiment"))
              .build();
        }
      }
    }
    return getGetCampaignExperimentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v9.services.CreateCampaignExperimentRequest,
      com.google.longrunning.Operation> getCreateCampaignExperimentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateCampaignExperiment",
      requestType = com.google.ads.googleads.v9.services.CreateCampaignExperimentRequest.class,
      responseType = com.google.longrunning.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v9.services.CreateCampaignExperimentRequest,
      com.google.longrunning.Operation> getCreateCampaignExperimentMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v9.services.CreateCampaignExperimentRequest, com.google.longrunning.Operation> getCreateCampaignExperimentMethod;
    if ((getCreateCampaignExperimentMethod = CampaignExperimentServiceGrpc.getCreateCampaignExperimentMethod) == null) {
      synchronized (CampaignExperimentServiceGrpc.class) {
        if ((getCreateCampaignExperimentMethod = CampaignExperimentServiceGrpc.getCreateCampaignExperimentMethod) == null) {
          CampaignExperimentServiceGrpc.getCreateCampaignExperimentMethod = getCreateCampaignExperimentMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v9.services.CreateCampaignExperimentRequest, com.google.longrunning.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateCampaignExperiment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v9.services.CreateCampaignExperimentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.longrunning.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new CampaignExperimentServiceMethodDescriptorSupplier("CreateCampaignExperiment"))
              .build();
        }
      }
    }
    return getCreateCampaignExperimentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v9.services.MutateCampaignExperimentsRequest,
      com.google.ads.googleads.v9.services.MutateCampaignExperimentsResponse> getMutateCampaignExperimentsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MutateCampaignExperiments",
      requestType = com.google.ads.googleads.v9.services.MutateCampaignExperimentsRequest.class,
      responseType = com.google.ads.googleads.v9.services.MutateCampaignExperimentsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v9.services.MutateCampaignExperimentsRequest,
      com.google.ads.googleads.v9.services.MutateCampaignExperimentsResponse> getMutateCampaignExperimentsMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v9.services.MutateCampaignExperimentsRequest, com.google.ads.googleads.v9.services.MutateCampaignExperimentsResponse> getMutateCampaignExperimentsMethod;
    if ((getMutateCampaignExperimentsMethod = CampaignExperimentServiceGrpc.getMutateCampaignExperimentsMethod) == null) {
      synchronized (CampaignExperimentServiceGrpc.class) {
        if ((getMutateCampaignExperimentsMethod = CampaignExperimentServiceGrpc.getMutateCampaignExperimentsMethod) == null) {
          CampaignExperimentServiceGrpc.getMutateCampaignExperimentsMethod = getMutateCampaignExperimentsMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v9.services.MutateCampaignExperimentsRequest, com.google.ads.googleads.v9.services.MutateCampaignExperimentsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MutateCampaignExperiments"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v9.services.MutateCampaignExperimentsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v9.services.MutateCampaignExperimentsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CampaignExperimentServiceMethodDescriptorSupplier("MutateCampaignExperiments"))
              .build();
        }
      }
    }
    return getMutateCampaignExperimentsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v9.services.GraduateCampaignExperimentRequest,
      com.google.ads.googleads.v9.services.GraduateCampaignExperimentResponse> getGraduateCampaignExperimentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GraduateCampaignExperiment",
      requestType = com.google.ads.googleads.v9.services.GraduateCampaignExperimentRequest.class,
      responseType = com.google.ads.googleads.v9.services.GraduateCampaignExperimentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v9.services.GraduateCampaignExperimentRequest,
      com.google.ads.googleads.v9.services.GraduateCampaignExperimentResponse> getGraduateCampaignExperimentMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v9.services.GraduateCampaignExperimentRequest, com.google.ads.googleads.v9.services.GraduateCampaignExperimentResponse> getGraduateCampaignExperimentMethod;
    if ((getGraduateCampaignExperimentMethod = CampaignExperimentServiceGrpc.getGraduateCampaignExperimentMethod) == null) {
      synchronized (CampaignExperimentServiceGrpc.class) {
        if ((getGraduateCampaignExperimentMethod = CampaignExperimentServiceGrpc.getGraduateCampaignExperimentMethod) == null) {
          CampaignExperimentServiceGrpc.getGraduateCampaignExperimentMethod = getGraduateCampaignExperimentMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v9.services.GraduateCampaignExperimentRequest, com.google.ads.googleads.v9.services.GraduateCampaignExperimentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GraduateCampaignExperiment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v9.services.GraduateCampaignExperimentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v9.services.GraduateCampaignExperimentResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CampaignExperimentServiceMethodDescriptorSupplier("GraduateCampaignExperiment"))
              .build();
        }
      }
    }
    return getGraduateCampaignExperimentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v9.services.PromoteCampaignExperimentRequest,
      com.google.longrunning.Operation> getPromoteCampaignExperimentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PromoteCampaignExperiment",
      requestType = com.google.ads.googleads.v9.services.PromoteCampaignExperimentRequest.class,
      responseType = com.google.longrunning.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v9.services.PromoteCampaignExperimentRequest,
      com.google.longrunning.Operation> getPromoteCampaignExperimentMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v9.services.PromoteCampaignExperimentRequest, com.google.longrunning.Operation> getPromoteCampaignExperimentMethod;
    if ((getPromoteCampaignExperimentMethod = CampaignExperimentServiceGrpc.getPromoteCampaignExperimentMethod) == null) {
      synchronized (CampaignExperimentServiceGrpc.class) {
        if ((getPromoteCampaignExperimentMethod = CampaignExperimentServiceGrpc.getPromoteCampaignExperimentMethod) == null) {
          CampaignExperimentServiceGrpc.getPromoteCampaignExperimentMethod = getPromoteCampaignExperimentMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v9.services.PromoteCampaignExperimentRequest, com.google.longrunning.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PromoteCampaignExperiment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v9.services.PromoteCampaignExperimentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.longrunning.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new CampaignExperimentServiceMethodDescriptorSupplier("PromoteCampaignExperiment"))
              .build();
        }
      }
    }
    return getPromoteCampaignExperimentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v9.services.EndCampaignExperimentRequest,
      com.google.protobuf.Empty> getEndCampaignExperimentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EndCampaignExperiment",
      requestType = com.google.ads.googleads.v9.services.EndCampaignExperimentRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v9.services.EndCampaignExperimentRequest,
      com.google.protobuf.Empty> getEndCampaignExperimentMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v9.services.EndCampaignExperimentRequest, com.google.protobuf.Empty> getEndCampaignExperimentMethod;
    if ((getEndCampaignExperimentMethod = CampaignExperimentServiceGrpc.getEndCampaignExperimentMethod) == null) {
      synchronized (CampaignExperimentServiceGrpc.class) {
        if ((getEndCampaignExperimentMethod = CampaignExperimentServiceGrpc.getEndCampaignExperimentMethod) == null) {
          CampaignExperimentServiceGrpc.getEndCampaignExperimentMethod = getEndCampaignExperimentMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v9.services.EndCampaignExperimentRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EndCampaignExperiment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v9.services.EndCampaignExperimentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new CampaignExperimentServiceMethodDescriptorSupplier("EndCampaignExperiment"))
              .build();
        }
      }
    }
    return getEndCampaignExperimentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v9.services.ListCampaignExperimentAsyncErrorsRequest,
      com.google.ads.googleads.v9.services.ListCampaignExperimentAsyncErrorsResponse> getListCampaignExperimentAsyncErrorsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListCampaignExperimentAsyncErrors",
      requestType = com.google.ads.googleads.v9.services.ListCampaignExperimentAsyncErrorsRequest.class,
      responseType = com.google.ads.googleads.v9.services.ListCampaignExperimentAsyncErrorsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v9.services.ListCampaignExperimentAsyncErrorsRequest,
      com.google.ads.googleads.v9.services.ListCampaignExperimentAsyncErrorsResponse> getListCampaignExperimentAsyncErrorsMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v9.services.ListCampaignExperimentAsyncErrorsRequest, com.google.ads.googleads.v9.services.ListCampaignExperimentAsyncErrorsResponse> getListCampaignExperimentAsyncErrorsMethod;
    if ((getListCampaignExperimentAsyncErrorsMethod = CampaignExperimentServiceGrpc.getListCampaignExperimentAsyncErrorsMethod) == null) {
      synchronized (CampaignExperimentServiceGrpc.class) {
        if ((getListCampaignExperimentAsyncErrorsMethod = CampaignExperimentServiceGrpc.getListCampaignExperimentAsyncErrorsMethod) == null) {
          CampaignExperimentServiceGrpc.getListCampaignExperimentAsyncErrorsMethod = getListCampaignExperimentAsyncErrorsMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v9.services.ListCampaignExperimentAsyncErrorsRequest, com.google.ads.googleads.v9.services.ListCampaignExperimentAsyncErrorsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListCampaignExperimentAsyncErrors"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v9.services.ListCampaignExperimentAsyncErrorsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v9.services.ListCampaignExperimentAsyncErrorsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CampaignExperimentServiceMethodDescriptorSupplier("ListCampaignExperimentAsyncErrors"))
              .build();
        }
      }
    }
    return getListCampaignExperimentAsyncErrorsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CampaignExperimentServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CampaignExperimentServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CampaignExperimentServiceStub>() {
        @java.lang.Override
        public CampaignExperimentServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CampaignExperimentServiceStub(channel, callOptions);
        }
      };
    return CampaignExperimentServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CampaignExperimentServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CampaignExperimentServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CampaignExperimentServiceBlockingStub>() {
        @java.lang.Override
        public CampaignExperimentServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CampaignExperimentServiceBlockingStub(channel, callOptions);
        }
      };
    return CampaignExperimentServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CampaignExperimentServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CampaignExperimentServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CampaignExperimentServiceFutureStub>() {
        @java.lang.Override
        public CampaignExperimentServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CampaignExperimentServiceFutureStub(channel, callOptions);
        }
      };
    return CampaignExperimentServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * CampaignExperimentService manages the life cycle of campaign experiments.
   * It is used to create new experiments from drafts, modify experiment
   * properties, promote changes in an experiment back to its base campaign,
   * graduate experiments into new stand-alone campaigns, and to remove an
   * experiment.
   * An experiment consists of two variants or arms - the base campaign and the
   * experiment campaign, directing a fixed share of traffic to each arm.
   * A campaign experiment is created from a draft of changes to the base campaign
   * and will be a snapshot of changes in the draft at the time of creation.
   * </pre>
   */
  public static abstract class CampaignExperimentServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the requested campaign experiment in full detail.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public void getCampaignExperiment(com.google.ads.googleads.v9.services.GetCampaignExperimentRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v9.resources.CampaignExperiment> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetCampaignExperimentMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates a campaign experiment based on a campaign draft. The draft campaign
     * will be forked into a real campaign (called the experiment campaign) that
     * will begin serving ads if successfully created.
     * The campaign experiment is created immediately with status INITIALIZING.
     * This method return a long running operation that tracks the forking of the
     * draft campaign. If the forking fails, a list of errors can be retrieved
     * using the ListCampaignExperimentAsyncErrors method. The operation's
     * metadata will be a StringValue containing the resource name of the created
     * campaign experiment.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [CampaignExperimentError]()
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
    public void createCampaignExperiment(com.google.ads.googleads.v9.services.CreateCampaignExperimentRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateCampaignExperimentMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates campaign experiments. Operation statuses are returned.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [CampaignExperimentError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public void mutateCampaignExperiments(com.google.ads.googleads.v9.services.MutateCampaignExperimentsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v9.services.MutateCampaignExperimentsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMutateCampaignExperimentsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Graduates a campaign experiment to a full campaign. The base and experiment
     * campaigns will start running independently with their own budgets.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [CampaignExperimentError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [MutateError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public void graduateCampaignExperiment(com.google.ads.googleads.v9.services.GraduateCampaignExperimentRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v9.services.GraduateCampaignExperimentResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGraduateCampaignExperimentMethod(), responseObserver);
    }

    /**
     * <pre>
     * Promotes the changes in a experiment campaign back to the base campaign.
     * The campaign experiment is updated immediately with status PROMOTING.
     * This method return a long running operation that tracks the promoting of
     * the experiment campaign. If the promoting fails, a list of errors can be
     * retrieved using the ListCampaignExperimentAsyncErrors method.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public void promoteCampaignExperiment(com.google.ads.googleads.v9.services.PromoteCampaignExperimentRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPromoteCampaignExperimentMethod(), responseObserver);
    }

    /**
     * <pre>
     * Immediately ends a campaign experiment, changing the experiment's scheduled
     * end date and without waiting for end of day. End date is updated to be the
     * time of the request.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [CampaignExperimentError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public void endCampaignExperiment(com.google.ads.googleads.v9.services.EndCampaignExperimentRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEndCampaignExperimentMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns all errors that occurred during CampaignExperiment create or
     * promote (whichever occurred last).
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
    public void listCampaignExperimentAsyncErrors(com.google.ads.googleads.v9.services.ListCampaignExperimentAsyncErrorsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v9.services.ListCampaignExperimentAsyncErrorsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListCampaignExperimentAsyncErrorsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetCampaignExperimentMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v9.services.GetCampaignExperimentRequest,
                com.google.ads.googleads.v9.resources.CampaignExperiment>(
                  this, METHODID_GET_CAMPAIGN_EXPERIMENT)))
          .addMethod(
            getCreateCampaignExperimentMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v9.services.CreateCampaignExperimentRequest,
                com.google.longrunning.Operation>(
                  this, METHODID_CREATE_CAMPAIGN_EXPERIMENT)))
          .addMethod(
            getMutateCampaignExperimentsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v9.services.MutateCampaignExperimentsRequest,
                com.google.ads.googleads.v9.services.MutateCampaignExperimentsResponse>(
                  this, METHODID_MUTATE_CAMPAIGN_EXPERIMENTS)))
          .addMethod(
            getGraduateCampaignExperimentMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v9.services.GraduateCampaignExperimentRequest,
                com.google.ads.googleads.v9.services.GraduateCampaignExperimentResponse>(
                  this, METHODID_GRADUATE_CAMPAIGN_EXPERIMENT)))
          .addMethod(
            getPromoteCampaignExperimentMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v9.services.PromoteCampaignExperimentRequest,
                com.google.longrunning.Operation>(
                  this, METHODID_PROMOTE_CAMPAIGN_EXPERIMENT)))
          .addMethod(
            getEndCampaignExperimentMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v9.services.EndCampaignExperimentRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_END_CAMPAIGN_EXPERIMENT)))
          .addMethod(
            getListCampaignExperimentAsyncErrorsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v9.services.ListCampaignExperimentAsyncErrorsRequest,
                com.google.ads.googleads.v9.services.ListCampaignExperimentAsyncErrorsResponse>(
                  this, METHODID_LIST_CAMPAIGN_EXPERIMENT_ASYNC_ERRORS)))
          .build();
    }
  }

  /**
   * <pre>
   * CampaignExperimentService manages the life cycle of campaign experiments.
   * It is used to create new experiments from drafts, modify experiment
   * properties, promote changes in an experiment back to its base campaign,
   * graduate experiments into new stand-alone campaigns, and to remove an
   * experiment.
   * An experiment consists of two variants or arms - the base campaign and the
   * experiment campaign, directing a fixed share of traffic to each arm.
   * A campaign experiment is created from a draft of changes to the base campaign
   * and will be a snapshot of changes in the draft at the time of creation.
   * </pre>
   */
  public static final class CampaignExperimentServiceStub extends io.grpc.stub.AbstractAsyncStub<CampaignExperimentServiceStub> {
    private CampaignExperimentServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CampaignExperimentServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CampaignExperimentServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested campaign experiment in full detail.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public void getCampaignExperiment(com.google.ads.googleads.v9.services.GetCampaignExperimentRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v9.resources.CampaignExperiment> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetCampaignExperimentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates a campaign experiment based on a campaign draft. The draft campaign
     * will be forked into a real campaign (called the experiment campaign) that
     * will begin serving ads if successfully created.
     * The campaign experiment is created immediately with status INITIALIZING.
     * This method return a long running operation that tracks the forking of the
     * draft campaign. If the forking fails, a list of errors can be retrieved
     * using the ListCampaignExperimentAsyncErrors method. The operation's
     * metadata will be a StringValue containing the resource name of the created
     * campaign experiment.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [CampaignExperimentError]()
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
    public void createCampaignExperiment(com.google.ads.googleads.v9.services.CreateCampaignExperimentRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateCampaignExperimentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates campaign experiments. Operation statuses are returned.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [CampaignExperimentError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public void mutateCampaignExperiments(com.google.ads.googleads.v9.services.MutateCampaignExperimentsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v9.services.MutateCampaignExperimentsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMutateCampaignExperimentsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Graduates a campaign experiment to a full campaign. The base and experiment
     * campaigns will start running independently with their own budgets.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [CampaignExperimentError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [MutateError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public void graduateCampaignExperiment(com.google.ads.googleads.v9.services.GraduateCampaignExperimentRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v9.services.GraduateCampaignExperimentResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGraduateCampaignExperimentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Promotes the changes in a experiment campaign back to the base campaign.
     * The campaign experiment is updated immediately with status PROMOTING.
     * This method return a long running operation that tracks the promoting of
     * the experiment campaign. If the promoting fails, a list of errors can be
     * retrieved using the ListCampaignExperimentAsyncErrors method.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public void promoteCampaignExperiment(com.google.ads.googleads.v9.services.PromoteCampaignExperimentRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPromoteCampaignExperimentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Immediately ends a campaign experiment, changing the experiment's scheduled
     * end date and without waiting for end of day. End date is updated to be the
     * time of the request.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [CampaignExperimentError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public void endCampaignExperiment(com.google.ads.googleads.v9.services.EndCampaignExperimentRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEndCampaignExperimentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns all errors that occurred during CampaignExperiment create or
     * promote (whichever occurred last).
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
    public void listCampaignExperimentAsyncErrors(com.google.ads.googleads.v9.services.ListCampaignExperimentAsyncErrorsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v9.services.ListCampaignExperimentAsyncErrorsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListCampaignExperimentAsyncErrorsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * CampaignExperimentService manages the life cycle of campaign experiments.
   * It is used to create new experiments from drafts, modify experiment
   * properties, promote changes in an experiment back to its base campaign,
   * graduate experiments into new stand-alone campaigns, and to remove an
   * experiment.
   * An experiment consists of two variants or arms - the base campaign and the
   * experiment campaign, directing a fixed share of traffic to each arm.
   * A campaign experiment is created from a draft of changes to the base campaign
   * and will be a snapshot of changes in the draft at the time of creation.
   * </pre>
   */
  public static final class CampaignExperimentServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<CampaignExperimentServiceBlockingStub> {
    private CampaignExperimentServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CampaignExperimentServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CampaignExperimentServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested campaign experiment in full detail.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.ads.googleads.v9.resources.CampaignExperiment getCampaignExperiment(com.google.ads.googleads.v9.services.GetCampaignExperimentRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetCampaignExperimentMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates a campaign experiment based on a campaign draft. The draft campaign
     * will be forked into a real campaign (called the experiment campaign) that
     * will begin serving ads if successfully created.
     * The campaign experiment is created immediately with status INITIALIZING.
     * This method return a long running operation that tracks the forking of the
     * draft campaign. If the forking fails, a list of errors can be retrieved
     * using the ListCampaignExperimentAsyncErrors method. The operation's
     * metadata will be a StringValue containing the resource name of the created
     * campaign experiment.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [CampaignExperimentError]()
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
    public com.google.longrunning.Operation createCampaignExperiment(com.google.ads.googleads.v9.services.CreateCampaignExperimentRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateCampaignExperimentMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates campaign experiments. Operation statuses are returned.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [CampaignExperimentError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.ads.googleads.v9.services.MutateCampaignExperimentsResponse mutateCampaignExperiments(com.google.ads.googleads.v9.services.MutateCampaignExperimentsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMutateCampaignExperimentsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Graduates a campaign experiment to a full campaign. The base and experiment
     * campaigns will start running independently with their own budgets.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [CampaignExperimentError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [MutateError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.ads.googleads.v9.services.GraduateCampaignExperimentResponse graduateCampaignExperiment(com.google.ads.googleads.v9.services.GraduateCampaignExperimentRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGraduateCampaignExperimentMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Promotes the changes in a experiment campaign back to the base campaign.
     * The campaign experiment is updated immediately with status PROMOTING.
     * This method return a long running operation that tracks the promoting of
     * the experiment campaign. If the promoting fails, a list of errors can be
     * retrieved using the ListCampaignExperimentAsyncErrors method.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.longrunning.Operation promoteCampaignExperiment(com.google.ads.googleads.v9.services.PromoteCampaignExperimentRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPromoteCampaignExperimentMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Immediately ends a campaign experiment, changing the experiment's scheduled
     * end date and without waiting for end of day. End date is updated to be the
     * time of the request.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [CampaignExperimentError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.protobuf.Empty endCampaignExperiment(com.google.ads.googleads.v9.services.EndCampaignExperimentRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEndCampaignExperimentMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns all errors that occurred during CampaignExperiment create or
     * promote (whichever occurred last).
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
    public com.google.ads.googleads.v9.services.ListCampaignExperimentAsyncErrorsResponse listCampaignExperimentAsyncErrors(com.google.ads.googleads.v9.services.ListCampaignExperimentAsyncErrorsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListCampaignExperimentAsyncErrorsMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * CampaignExperimentService manages the life cycle of campaign experiments.
   * It is used to create new experiments from drafts, modify experiment
   * properties, promote changes in an experiment back to its base campaign,
   * graduate experiments into new stand-alone campaigns, and to remove an
   * experiment.
   * An experiment consists of two variants or arms - the base campaign and the
   * experiment campaign, directing a fixed share of traffic to each arm.
   * A campaign experiment is created from a draft of changes to the base campaign
   * and will be a snapshot of changes in the draft at the time of creation.
   * </pre>
   */
  public static final class CampaignExperimentServiceFutureStub extends io.grpc.stub.AbstractFutureStub<CampaignExperimentServiceFutureStub> {
    private CampaignExperimentServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CampaignExperimentServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CampaignExperimentServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested campaign experiment in full detail.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v9.resources.CampaignExperiment> getCampaignExperiment(
        com.google.ads.googleads.v9.services.GetCampaignExperimentRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetCampaignExperimentMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates a campaign experiment based on a campaign draft. The draft campaign
     * will be forked into a real campaign (called the experiment campaign) that
     * will begin serving ads if successfully created.
     * The campaign experiment is created immediately with status INITIALIZING.
     * This method return a long running operation that tracks the forking of the
     * draft campaign. If the forking fails, a list of errors can be retrieved
     * using the ListCampaignExperimentAsyncErrors method. The operation's
     * metadata will be a StringValue containing the resource name of the created
     * campaign experiment.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [CampaignExperimentError]()
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
    public com.google.common.util.concurrent.ListenableFuture<com.google.longrunning.Operation> createCampaignExperiment(
        com.google.ads.googleads.v9.services.CreateCampaignExperimentRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateCampaignExperimentMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates campaign experiments. Operation statuses are returned.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [CampaignExperimentError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v9.services.MutateCampaignExperimentsResponse> mutateCampaignExperiments(
        com.google.ads.googleads.v9.services.MutateCampaignExperimentsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMutateCampaignExperimentsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Graduates a campaign experiment to a full campaign. The base and experiment
     * campaigns will start running independently with their own budgets.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [CampaignExperimentError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [MutateError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v9.services.GraduateCampaignExperimentResponse> graduateCampaignExperiment(
        com.google.ads.googleads.v9.services.GraduateCampaignExperimentRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGraduateCampaignExperimentMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Promotes the changes in a experiment campaign back to the base campaign.
     * The campaign experiment is updated immediately with status PROMOTING.
     * This method return a long running operation that tracks the promoting of
     * the experiment campaign. If the promoting fails, a list of errors can be
     * retrieved using the ListCampaignExperimentAsyncErrors method.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.longrunning.Operation> promoteCampaignExperiment(
        com.google.ads.googleads.v9.services.PromoteCampaignExperimentRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPromoteCampaignExperimentMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Immediately ends a campaign experiment, changing the experiment's scheduled
     * end date and without waiting for end of day. End date is updated to be the
     * time of the request.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [CampaignExperimentError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> endCampaignExperiment(
        com.google.ads.googleads.v9.services.EndCampaignExperimentRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEndCampaignExperimentMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns all errors that occurred during CampaignExperiment create or
     * promote (whichever occurred last).
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
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v9.services.ListCampaignExperimentAsyncErrorsResponse> listCampaignExperimentAsyncErrors(
        com.google.ads.googleads.v9.services.ListCampaignExperimentAsyncErrorsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListCampaignExperimentAsyncErrorsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_CAMPAIGN_EXPERIMENT = 0;
  private static final int METHODID_CREATE_CAMPAIGN_EXPERIMENT = 1;
  private static final int METHODID_MUTATE_CAMPAIGN_EXPERIMENTS = 2;
  private static final int METHODID_GRADUATE_CAMPAIGN_EXPERIMENT = 3;
  private static final int METHODID_PROMOTE_CAMPAIGN_EXPERIMENT = 4;
  private static final int METHODID_END_CAMPAIGN_EXPERIMENT = 5;
  private static final int METHODID_LIST_CAMPAIGN_EXPERIMENT_ASYNC_ERRORS = 6;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CampaignExperimentServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CampaignExperimentServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_CAMPAIGN_EXPERIMENT:
          serviceImpl.getCampaignExperiment((com.google.ads.googleads.v9.services.GetCampaignExperimentRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v9.resources.CampaignExperiment>) responseObserver);
          break;
        case METHODID_CREATE_CAMPAIGN_EXPERIMENT:
          serviceImpl.createCampaignExperiment((com.google.ads.googleads.v9.services.CreateCampaignExperimentRequest) request,
              (io.grpc.stub.StreamObserver<com.google.longrunning.Operation>) responseObserver);
          break;
        case METHODID_MUTATE_CAMPAIGN_EXPERIMENTS:
          serviceImpl.mutateCampaignExperiments((com.google.ads.googleads.v9.services.MutateCampaignExperimentsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v9.services.MutateCampaignExperimentsResponse>) responseObserver);
          break;
        case METHODID_GRADUATE_CAMPAIGN_EXPERIMENT:
          serviceImpl.graduateCampaignExperiment((com.google.ads.googleads.v9.services.GraduateCampaignExperimentRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v9.services.GraduateCampaignExperimentResponse>) responseObserver);
          break;
        case METHODID_PROMOTE_CAMPAIGN_EXPERIMENT:
          serviceImpl.promoteCampaignExperiment((com.google.ads.googleads.v9.services.PromoteCampaignExperimentRequest) request,
              (io.grpc.stub.StreamObserver<com.google.longrunning.Operation>) responseObserver);
          break;
        case METHODID_END_CAMPAIGN_EXPERIMENT:
          serviceImpl.endCampaignExperiment((com.google.ads.googleads.v9.services.EndCampaignExperimentRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_LIST_CAMPAIGN_EXPERIMENT_ASYNC_ERRORS:
          serviceImpl.listCampaignExperimentAsyncErrors((com.google.ads.googleads.v9.services.ListCampaignExperimentAsyncErrorsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v9.services.ListCampaignExperimentAsyncErrorsResponse>) responseObserver);
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

  private static abstract class CampaignExperimentServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CampaignExperimentServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v9.services.CampaignExperimentServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CampaignExperimentService");
    }
  }

  private static final class CampaignExperimentServiceFileDescriptorSupplier
      extends CampaignExperimentServiceBaseDescriptorSupplier {
    CampaignExperimentServiceFileDescriptorSupplier() {}
  }

  private static final class CampaignExperimentServiceMethodDescriptorSupplier
      extends CampaignExperimentServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CampaignExperimentServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (CampaignExperimentServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CampaignExperimentServiceFileDescriptorSupplier())
              .addMethod(getGetCampaignExperimentMethod())
              .addMethod(getCreateCampaignExperimentMethod())
              .addMethod(getMutateCampaignExperimentsMethod())
              .addMethod(getGraduateCampaignExperimentMethod())
              .addMethod(getPromoteCampaignExperimentMethod())
              .addMethod(getEndCampaignExperimentMethod())
              .addMethod(getListCampaignExperimentAsyncErrorsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
