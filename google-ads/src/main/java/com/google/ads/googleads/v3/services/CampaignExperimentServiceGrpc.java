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
    value = "by gRPC proto compiler (version 1.10.0)",
    comments = "Source: google/ads/googleads/v3/services/campaign_experiment_service.proto")
public final class CampaignExperimentServiceGrpc {

  private CampaignExperimentServiceGrpc() {}

  public static final String SERVICE_NAME = "google.ads.googleads.v3.services.CampaignExperimentService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGetCampaignExperimentMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.google.ads.googleads.v3.services.GetCampaignExperimentRequest,
      com.google.ads.googleads.v3.resources.CampaignExperiment> METHOD_GET_CAMPAIGN_EXPERIMENT = getGetCampaignExperimentMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v3.services.GetCampaignExperimentRequest,
      com.google.ads.googleads.v3.resources.CampaignExperiment> getGetCampaignExperimentMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v3.services.GetCampaignExperimentRequest,
      com.google.ads.googleads.v3.resources.CampaignExperiment> getGetCampaignExperimentMethod() {
    return getGetCampaignExperimentMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.google.ads.googleads.v3.services.GetCampaignExperimentRequest,
      com.google.ads.googleads.v3.resources.CampaignExperiment> getGetCampaignExperimentMethodHelper() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v3.services.GetCampaignExperimentRequest, com.google.ads.googleads.v3.resources.CampaignExperiment> getGetCampaignExperimentMethod;
    if ((getGetCampaignExperimentMethod = CampaignExperimentServiceGrpc.getGetCampaignExperimentMethod) == null) {
      synchronized (CampaignExperimentServiceGrpc.class) {
        if ((getGetCampaignExperimentMethod = CampaignExperimentServiceGrpc.getGetCampaignExperimentMethod) == null) {
          CampaignExperimentServiceGrpc.getGetCampaignExperimentMethod = getGetCampaignExperimentMethod = 
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v3.services.GetCampaignExperimentRequest, com.google.ads.googleads.v3.resources.CampaignExperiment>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "google.ads.googleads.v3.services.CampaignExperimentService", "GetCampaignExperiment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v3.services.GetCampaignExperimentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v3.resources.CampaignExperiment.getDefaultInstance()))
                  .setSchemaDescriptor(new CampaignExperimentServiceMethodDescriptorSupplier("GetCampaignExperiment"))
                  .build();
          }
        }
     }
     return getGetCampaignExperimentMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getCreateCampaignExperimentMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.google.ads.googleads.v3.services.CreateCampaignExperimentRequest,
      com.google.longrunning.Operation> METHOD_CREATE_CAMPAIGN_EXPERIMENT = getCreateCampaignExperimentMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v3.services.CreateCampaignExperimentRequest,
      com.google.longrunning.Operation> getCreateCampaignExperimentMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v3.services.CreateCampaignExperimentRequest,
      com.google.longrunning.Operation> getCreateCampaignExperimentMethod() {
    return getCreateCampaignExperimentMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.google.ads.googleads.v3.services.CreateCampaignExperimentRequest,
      com.google.longrunning.Operation> getCreateCampaignExperimentMethodHelper() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v3.services.CreateCampaignExperimentRequest, com.google.longrunning.Operation> getCreateCampaignExperimentMethod;
    if ((getCreateCampaignExperimentMethod = CampaignExperimentServiceGrpc.getCreateCampaignExperimentMethod) == null) {
      synchronized (CampaignExperimentServiceGrpc.class) {
        if ((getCreateCampaignExperimentMethod = CampaignExperimentServiceGrpc.getCreateCampaignExperimentMethod) == null) {
          CampaignExperimentServiceGrpc.getCreateCampaignExperimentMethod = getCreateCampaignExperimentMethod = 
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v3.services.CreateCampaignExperimentRequest, com.google.longrunning.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "google.ads.googleads.v3.services.CampaignExperimentService", "CreateCampaignExperiment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v3.services.CreateCampaignExperimentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.longrunning.Operation.getDefaultInstance()))
                  .setSchemaDescriptor(new CampaignExperimentServiceMethodDescriptorSupplier("CreateCampaignExperiment"))
                  .build();
          }
        }
     }
     return getCreateCampaignExperimentMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getMutateCampaignExperimentsMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.google.ads.googleads.v3.services.MutateCampaignExperimentsRequest,
      com.google.ads.googleads.v3.services.MutateCampaignExperimentsResponse> METHOD_MUTATE_CAMPAIGN_EXPERIMENTS = getMutateCampaignExperimentsMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v3.services.MutateCampaignExperimentsRequest,
      com.google.ads.googleads.v3.services.MutateCampaignExperimentsResponse> getMutateCampaignExperimentsMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v3.services.MutateCampaignExperimentsRequest,
      com.google.ads.googleads.v3.services.MutateCampaignExperimentsResponse> getMutateCampaignExperimentsMethod() {
    return getMutateCampaignExperimentsMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.google.ads.googleads.v3.services.MutateCampaignExperimentsRequest,
      com.google.ads.googleads.v3.services.MutateCampaignExperimentsResponse> getMutateCampaignExperimentsMethodHelper() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v3.services.MutateCampaignExperimentsRequest, com.google.ads.googleads.v3.services.MutateCampaignExperimentsResponse> getMutateCampaignExperimentsMethod;
    if ((getMutateCampaignExperimentsMethod = CampaignExperimentServiceGrpc.getMutateCampaignExperimentsMethod) == null) {
      synchronized (CampaignExperimentServiceGrpc.class) {
        if ((getMutateCampaignExperimentsMethod = CampaignExperimentServiceGrpc.getMutateCampaignExperimentsMethod) == null) {
          CampaignExperimentServiceGrpc.getMutateCampaignExperimentsMethod = getMutateCampaignExperimentsMethod = 
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v3.services.MutateCampaignExperimentsRequest, com.google.ads.googleads.v3.services.MutateCampaignExperimentsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "google.ads.googleads.v3.services.CampaignExperimentService", "MutateCampaignExperiments"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v3.services.MutateCampaignExperimentsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v3.services.MutateCampaignExperimentsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new CampaignExperimentServiceMethodDescriptorSupplier("MutateCampaignExperiments"))
                  .build();
          }
        }
     }
     return getMutateCampaignExperimentsMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGraduateCampaignExperimentMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.google.ads.googleads.v3.services.GraduateCampaignExperimentRequest,
      com.google.ads.googleads.v3.services.GraduateCampaignExperimentResponse> METHOD_GRADUATE_CAMPAIGN_EXPERIMENT = getGraduateCampaignExperimentMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v3.services.GraduateCampaignExperimentRequest,
      com.google.ads.googleads.v3.services.GraduateCampaignExperimentResponse> getGraduateCampaignExperimentMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v3.services.GraduateCampaignExperimentRequest,
      com.google.ads.googleads.v3.services.GraduateCampaignExperimentResponse> getGraduateCampaignExperimentMethod() {
    return getGraduateCampaignExperimentMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.google.ads.googleads.v3.services.GraduateCampaignExperimentRequest,
      com.google.ads.googleads.v3.services.GraduateCampaignExperimentResponse> getGraduateCampaignExperimentMethodHelper() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v3.services.GraduateCampaignExperimentRequest, com.google.ads.googleads.v3.services.GraduateCampaignExperimentResponse> getGraduateCampaignExperimentMethod;
    if ((getGraduateCampaignExperimentMethod = CampaignExperimentServiceGrpc.getGraduateCampaignExperimentMethod) == null) {
      synchronized (CampaignExperimentServiceGrpc.class) {
        if ((getGraduateCampaignExperimentMethod = CampaignExperimentServiceGrpc.getGraduateCampaignExperimentMethod) == null) {
          CampaignExperimentServiceGrpc.getGraduateCampaignExperimentMethod = getGraduateCampaignExperimentMethod = 
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v3.services.GraduateCampaignExperimentRequest, com.google.ads.googleads.v3.services.GraduateCampaignExperimentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "google.ads.googleads.v3.services.CampaignExperimentService", "GraduateCampaignExperiment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v3.services.GraduateCampaignExperimentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v3.services.GraduateCampaignExperimentResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new CampaignExperimentServiceMethodDescriptorSupplier("GraduateCampaignExperiment"))
                  .build();
          }
        }
     }
     return getGraduateCampaignExperimentMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getPromoteCampaignExperimentMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.google.ads.googleads.v3.services.PromoteCampaignExperimentRequest,
      com.google.longrunning.Operation> METHOD_PROMOTE_CAMPAIGN_EXPERIMENT = getPromoteCampaignExperimentMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v3.services.PromoteCampaignExperimentRequest,
      com.google.longrunning.Operation> getPromoteCampaignExperimentMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v3.services.PromoteCampaignExperimentRequest,
      com.google.longrunning.Operation> getPromoteCampaignExperimentMethod() {
    return getPromoteCampaignExperimentMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.google.ads.googleads.v3.services.PromoteCampaignExperimentRequest,
      com.google.longrunning.Operation> getPromoteCampaignExperimentMethodHelper() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v3.services.PromoteCampaignExperimentRequest, com.google.longrunning.Operation> getPromoteCampaignExperimentMethod;
    if ((getPromoteCampaignExperimentMethod = CampaignExperimentServiceGrpc.getPromoteCampaignExperimentMethod) == null) {
      synchronized (CampaignExperimentServiceGrpc.class) {
        if ((getPromoteCampaignExperimentMethod = CampaignExperimentServiceGrpc.getPromoteCampaignExperimentMethod) == null) {
          CampaignExperimentServiceGrpc.getPromoteCampaignExperimentMethod = getPromoteCampaignExperimentMethod = 
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v3.services.PromoteCampaignExperimentRequest, com.google.longrunning.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "google.ads.googleads.v3.services.CampaignExperimentService", "PromoteCampaignExperiment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v3.services.PromoteCampaignExperimentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.longrunning.Operation.getDefaultInstance()))
                  .setSchemaDescriptor(new CampaignExperimentServiceMethodDescriptorSupplier("PromoteCampaignExperiment"))
                  .build();
          }
        }
     }
     return getPromoteCampaignExperimentMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getEndCampaignExperimentMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.google.ads.googleads.v3.services.EndCampaignExperimentRequest,
      com.google.protobuf.Empty> METHOD_END_CAMPAIGN_EXPERIMENT = getEndCampaignExperimentMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v3.services.EndCampaignExperimentRequest,
      com.google.protobuf.Empty> getEndCampaignExperimentMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v3.services.EndCampaignExperimentRequest,
      com.google.protobuf.Empty> getEndCampaignExperimentMethod() {
    return getEndCampaignExperimentMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.google.ads.googleads.v3.services.EndCampaignExperimentRequest,
      com.google.protobuf.Empty> getEndCampaignExperimentMethodHelper() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v3.services.EndCampaignExperimentRequest, com.google.protobuf.Empty> getEndCampaignExperimentMethod;
    if ((getEndCampaignExperimentMethod = CampaignExperimentServiceGrpc.getEndCampaignExperimentMethod) == null) {
      synchronized (CampaignExperimentServiceGrpc.class) {
        if ((getEndCampaignExperimentMethod = CampaignExperimentServiceGrpc.getEndCampaignExperimentMethod) == null) {
          CampaignExperimentServiceGrpc.getEndCampaignExperimentMethod = getEndCampaignExperimentMethod = 
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v3.services.EndCampaignExperimentRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "google.ads.googleads.v3.services.CampaignExperimentService", "EndCampaignExperiment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v3.services.EndCampaignExperimentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new CampaignExperimentServiceMethodDescriptorSupplier("EndCampaignExperiment"))
                  .build();
          }
        }
     }
     return getEndCampaignExperimentMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getListCampaignExperimentAsyncErrorsMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.google.ads.googleads.v3.services.ListCampaignExperimentAsyncErrorsRequest,
      com.google.ads.googleads.v3.services.ListCampaignExperimentAsyncErrorsResponse> METHOD_LIST_CAMPAIGN_EXPERIMENT_ASYNC_ERRORS = getListCampaignExperimentAsyncErrorsMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v3.services.ListCampaignExperimentAsyncErrorsRequest,
      com.google.ads.googleads.v3.services.ListCampaignExperimentAsyncErrorsResponse> getListCampaignExperimentAsyncErrorsMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v3.services.ListCampaignExperimentAsyncErrorsRequest,
      com.google.ads.googleads.v3.services.ListCampaignExperimentAsyncErrorsResponse> getListCampaignExperimentAsyncErrorsMethod() {
    return getListCampaignExperimentAsyncErrorsMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.google.ads.googleads.v3.services.ListCampaignExperimentAsyncErrorsRequest,
      com.google.ads.googleads.v3.services.ListCampaignExperimentAsyncErrorsResponse> getListCampaignExperimentAsyncErrorsMethodHelper() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v3.services.ListCampaignExperimentAsyncErrorsRequest, com.google.ads.googleads.v3.services.ListCampaignExperimentAsyncErrorsResponse> getListCampaignExperimentAsyncErrorsMethod;
    if ((getListCampaignExperimentAsyncErrorsMethod = CampaignExperimentServiceGrpc.getListCampaignExperimentAsyncErrorsMethod) == null) {
      synchronized (CampaignExperimentServiceGrpc.class) {
        if ((getListCampaignExperimentAsyncErrorsMethod = CampaignExperimentServiceGrpc.getListCampaignExperimentAsyncErrorsMethod) == null) {
          CampaignExperimentServiceGrpc.getListCampaignExperimentAsyncErrorsMethod = getListCampaignExperimentAsyncErrorsMethod = 
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v3.services.ListCampaignExperimentAsyncErrorsRequest, com.google.ads.googleads.v3.services.ListCampaignExperimentAsyncErrorsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "google.ads.googleads.v3.services.CampaignExperimentService", "ListCampaignExperimentAsyncErrors"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v3.services.ListCampaignExperimentAsyncErrorsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v3.services.ListCampaignExperimentAsyncErrorsResponse.getDefaultInstance()))
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
    return new CampaignExperimentServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CampaignExperimentServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new CampaignExperimentServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CampaignExperimentServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new CampaignExperimentServiceFutureStub(channel);
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
     * </pre>
     */
    public void getCampaignExperiment(com.google.ads.googleads.v3.services.GetCampaignExperimentRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v3.resources.CampaignExperiment> responseObserver) {
      asyncUnimplementedUnaryCall(getGetCampaignExperimentMethodHelper(), responseObserver);
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
     * </pre>
     */
    public void createCampaignExperiment(com.google.ads.googleads.v3.services.CreateCampaignExperimentRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateCampaignExperimentMethodHelper(), responseObserver);
    }

    /**
     * <pre>
     * Updates campaign experiments. Operation statuses are returned.
     * </pre>
     */
    public void mutateCampaignExperiments(com.google.ads.googleads.v3.services.MutateCampaignExperimentsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v3.services.MutateCampaignExperimentsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getMutateCampaignExperimentsMethodHelper(), responseObserver);
    }

    /**
     * <pre>
     * Graduates a campaign experiment to a full campaign. The base and experiment
     * campaigns will start running independently with their own budgets.
     * </pre>
     */
    public void graduateCampaignExperiment(com.google.ads.googleads.v3.services.GraduateCampaignExperimentRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v3.services.GraduateCampaignExperimentResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGraduateCampaignExperimentMethodHelper(), responseObserver);
    }

    /**
     * <pre>
     * Promotes the changes in a experiment campaign back to the base campaign.
     * The campaign experiment is updated immediately with status PROMOTING.
     * This method return a long running operation that tracks the promoting of
     * the experiment campaign. If the promoting fails, a list of errors can be
     * retrieved using the ListCampaignExperimentAsyncErrors method.
     * </pre>
     */
    public void promoteCampaignExperiment(com.google.ads.googleads.v3.services.PromoteCampaignExperimentRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getPromoteCampaignExperimentMethodHelper(), responseObserver);
    }

    /**
     * <pre>
     * Immediately ends a campaign experiment, changing the experiment's scheduled
     * end date and without waiting for end of day. End date is updated to be the
     * time of the request.
     * </pre>
     */
    public void endCampaignExperiment(com.google.ads.googleads.v3.services.EndCampaignExperimentRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getEndCampaignExperimentMethodHelper(), responseObserver);
    }

    /**
     * <pre>
     * Returns all errors that occurred during CampaignExperiment create or
     * promote (whichever occurred last).
     * Supports standard list paging.
     * </pre>
     */
    public void listCampaignExperimentAsyncErrors(com.google.ads.googleads.v3.services.ListCampaignExperimentAsyncErrorsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v3.services.ListCampaignExperimentAsyncErrorsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListCampaignExperimentAsyncErrorsMethodHelper(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetCampaignExperimentMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v3.services.GetCampaignExperimentRequest,
                com.google.ads.googleads.v3.resources.CampaignExperiment>(
                  this, METHODID_GET_CAMPAIGN_EXPERIMENT)))
          .addMethod(
            getCreateCampaignExperimentMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v3.services.CreateCampaignExperimentRequest,
                com.google.longrunning.Operation>(
                  this, METHODID_CREATE_CAMPAIGN_EXPERIMENT)))
          .addMethod(
            getMutateCampaignExperimentsMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v3.services.MutateCampaignExperimentsRequest,
                com.google.ads.googleads.v3.services.MutateCampaignExperimentsResponse>(
                  this, METHODID_MUTATE_CAMPAIGN_EXPERIMENTS)))
          .addMethod(
            getGraduateCampaignExperimentMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v3.services.GraduateCampaignExperimentRequest,
                com.google.ads.googleads.v3.services.GraduateCampaignExperimentResponse>(
                  this, METHODID_GRADUATE_CAMPAIGN_EXPERIMENT)))
          .addMethod(
            getPromoteCampaignExperimentMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v3.services.PromoteCampaignExperimentRequest,
                com.google.longrunning.Operation>(
                  this, METHODID_PROMOTE_CAMPAIGN_EXPERIMENT)))
          .addMethod(
            getEndCampaignExperimentMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v3.services.EndCampaignExperimentRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_END_CAMPAIGN_EXPERIMENT)))
          .addMethod(
            getListCampaignExperimentAsyncErrorsMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v3.services.ListCampaignExperimentAsyncErrorsRequest,
                com.google.ads.googleads.v3.services.ListCampaignExperimentAsyncErrorsResponse>(
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
  public static final class CampaignExperimentServiceStub extends io.grpc.stub.AbstractStub<CampaignExperimentServiceStub> {
    private CampaignExperimentServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CampaignExperimentServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CampaignExperimentServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CampaignExperimentServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested campaign experiment in full detail.
     * </pre>
     */
    public void getCampaignExperiment(com.google.ads.googleads.v3.services.GetCampaignExperimentRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v3.resources.CampaignExperiment> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetCampaignExperimentMethodHelper(), getCallOptions()), request, responseObserver);
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
     * </pre>
     */
    public void createCampaignExperiment(com.google.ads.googleads.v3.services.CreateCampaignExperimentRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateCampaignExperimentMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates campaign experiments. Operation statuses are returned.
     * </pre>
     */
    public void mutateCampaignExperiments(com.google.ads.googleads.v3.services.MutateCampaignExperimentsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v3.services.MutateCampaignExperimentsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getMutateCampaignExperimentsMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Graduates a campaign experiment to a full campaign. The base and experiment
     * campaigns will start running independently with their own budgets.
     * </pre>
     */
    public void graduateCampaignExperiment(com.google.ads.googleads.v3.services.GraduateCampaignExperimentRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v3.services.GraduateCampaignExperimentResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGraduateCampaignExperimentMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Promotes the changes in a experiment campaign back to the base campaign.
     * The campaign experiment is updated immediately with status PROMOTING.
     * This method return a long running operation that tracks the promoting of
     * the experiment campaign. If the promoting fails, a list of errors can be
     * retrieved using the ListCampaignExperimentAsyncErrors method.
     * </pre>
     */
    public void promoteCampaignExperiment(com.google.ads.googleads.v3.services.PromoteCampaignExperimentRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPromoteCampaignExperimentMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Immediately ends a campaign experiment, changing the experiment's scheduled
     * end date and without waiting for end of day. End date is updated to be the
     * time of the request.
     * </pre>
     */
    public void endCampaignExperiment(com.google.ads.googleads.v3.services.EndCampaignExperimentRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getEndCampaignExperimentMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns all errors that occurred during CampaignExperiment create or
     * promote (whichever occurred last).
     * Supports standard list paging.
     * </pre>
     */
    public void listCampaignExperimentAsyncErrors(com.google.ads.googleads.v3.services.ListCampaignExperimentAsyncErrorsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v3.services.ListCampaignExperimentAsyncErrorsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListCampaignExperimentAsyncErrorsMethodHelper(), getCallOptions()), request, responseObserver);
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
  public static final class CampaignExperimentServiceBlockingStub extends io.grpc.stub.AbstractStub<CampaignExperimentServiceBlockingStub> {
    private CampaignExperimentServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CampaignExperimentServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CampaignExperimentServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CampaignExperimentServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested campaign experiment in full detail.
     * </pre>
     */
    public com.google.ads.googleads.v3.resources.CampaignExperiment getCampaignExperiment(com.google.ads.googleads.v3.services.GetCampaignExperimentRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetCampaignExperimentMethodHelper(), getCallOptions(), request);
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
     * </pre>
     */
    public com.google.longrunning.Operation createCampaignExperiment(com.google.ads.googleads.v3.services.CreateCampaignExperimentRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateCampaignExperimentMethodHelper(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates campaign experiments. Operation statuses are returned.
     * </pre>
     */
    public com.google.ads.googleads.v3.services.MutateCampaignExperimentsResponse mutateCampaignExperiments(com.google.ads.googleads.v3.services.MutateCampaignExperimentsRequest request) {
      return blockingUnaryCall(
          getChannel(), getMutateCampaignExperimentsMethodHelper(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Graduates a campaign experiment to a full campaign. The base and experiment
     * campaigns will start running independently with their own budgets.
     * </pre>
     */
    public com.google.ads.googleads.v3.services.GraduateCampaignExperimentResponse graduateCampaignExperiment(com.google.ads.googleads.v3.services.GraduateCampaignExperimentRequest request) {
      return blockingUnaryCall(
          getChannel(), getGraduateCampaignExperimentMethodHelper(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Promotes the changes in a experiment campaign back to the base campaign.
     * The campaign experiment is updated immediately with status PROMOTING.
     * This method return a long running operation that tracks the promoting of
     * the experiment campaign. If the promoting fails, a list of errors can be
     * retrieved using the ListCampaignExperimentAsyncErrors method.
     * </pre>
     */
    public com.google.longrunning.Operation promoteCampaignExperiment(com.google.ads.googleads.v3.services.PromoteCampaignExperimentRequest request) {
      return blockingUnaryCall(
          getChannel(), getPromoteCampaignExperimentMethodHelper(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Immediately ends a campaign experiment, changing the experiment's scheduled
     * end date and without waiting for end of day. End date is updated to be the
     * time of the request.
     * </pre>
     */
    public com.google.protobuf.Empty endCampaignExperiment(com.google.ads.googleads.v3.services.EndCampaignExperimentRequest request) {
      return blockingUnaryCall(
          getChannel(), getEndCampaignExperimentMethodHelper(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns all errors that occurred during CampaignExperiment create or
     * promote (whichever occurred last).
     * Supports standard list paging.
     * </pre>
     */
    public com.google.ads.googleads.v3.services.ListCampaignExperimentAsyncErrorsResponse listCampaignExperimentAsyncErrors(com.google.ads.googleads.v3.services.ListCampaignExperimentAsyncErrorsRequest request) {
      return blockingUnaryCall(
          getChannel(), getListCampaignExperimentAsyncErrorsMethodHelper(), getCallOptions(), request);
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
  public static final class CampaignExperimentServiceFutureStub extends io.grpc.stub.AbstractStub<CampaignExperimentServiceFutureStub> {
    private CampaignExperimentServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CampaignExperimentServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CampaignExperimentServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CampaignExperimentServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested campaign experiment in full detail.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v3.resources.CampaignExperiment> getCampaignExperiment(
        com.google.ads.googleads.v3.services.GetCampaignExperimentRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetCampaignExperimentMethodHelper(), getCallOptions()), request);
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
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.longrunning.Operation> createCampaignExperiment(
        com.google.ads.googleads.v3.services.CreateCampaignExperimentRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateCampaignExperimentMethodHelper(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates campaign experiments. Operation statuses are returned.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v3.services.MutateCampaignExperimentsResponse> mutateCampaignExperiments(
        com.google.ads.googleads.v3.services.MutateCampaignExperimentsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getMutateCampaignExperimentsMethodHelper(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Graduates a campaign experiment to a full campaign. The base and experiment
     * campaigns will start running independently with their own budgets.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v3.services.GraduateCampaignExperimentResponse> graduateCampaignExperiment(
        com.google.ads.googleads.v3.services.GraduateCampaignExperimentRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGraduateCampaignExperimentMethodHelper(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Promotes the changes in a experiment campaign back to the base campaign.
     * The campaign experiment is updated immediately with status PROMOTING.
     * This method return a long running operation that tracks the promoting of
     * the experiment campaign. If the promoting fails, a list of errors can be
     * retrieved using the ListCampaignExperimentAsyncErrors method.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.longrunning.Operation> promoteCampaignExperiment(
        com.google.ads.googleads.v3.services.PromoteCampaignExperimentRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getPromoteCampaignExperimentMethodHelper(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Immediately ends a campaign experiment, changing the experiment's scheduled
     * end date and without waiting for end of day. End date is updated to be the
     * time of the request.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> endCampaignExperiment(
        com.google.ads.googleads.v3.services.EndCampaignExperimentRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getEndCampaignExperimentMethodHelper(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns all errors that occurred during CampaignExperiment create or
     * promote (whichever occurred last).
     * Supports standard list paging.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v3.services.ListCampaignExperimentAsyncErrorsResponse> listCampaignExperimentAsyncErrors(
        com.google.ads.googleads.v3.services.ListCampaignExperimentAsyncErrorsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListCampaignExperimentAsyncErrorsMethodHelper(), getCallOptions()), request);
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
          serviceImpl.getCampaignExperiment((com.google.ads.googleads.v3.services.GetCampaignExperimentRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v3.resources.CampaignExperiment>) responseObserver);
          break;
        case METHODID_CREATE_CAMPAIGN_EXPERIMENT:
          serviceImpl.createCampaignExperiment((com.google.ads.googleads.v3.services.CreateCampaignExperimentRequest) request,
              (io.grpc.stub.StreamObserver<com.google.longrunning.Operation>) responseObserver);
          break;
        case METHODID_MUTATE_CAMPAIGN_EXPERIMENTS:
          serviceImpl.mutateCampaignExperiments((com.google.ads.googleads.v3.services.MutateCampaignExperimentsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v3.services.MutateCampaignExperimentsResponse>) responseObserver);
          break;
        case METHODID_GRADUATE_CAMPAIGN_EXPERIMENT:
          serviceImpl.graduateCampaignExperiment((com.google.ads.googleads.v3.services.GraduateCampaignExperimentRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v3.services.GraduateCampaignExperimentResponse>) responseObserver);
          break;
        case METHODID_PROMOTE_CAMPAIGN_EXPERIMENT:
          serviceImpl.promoteCampaignExperiment((com.google.ads.googleads.v3.services.PromoteCampaignExperimentRequest) request,
              (io.grpc.stub.StreamObserver<com.google.longrunning.Operation>) responseObserver);
          break;
        case METHODID_END_CAMPAIGN_EXPERIMENT:
          serviceImpl.endCampaignExperiment((com.google.ads.googleads.v3.services.EndCampaignExperimentRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_LIST_CAMPAIGN_EXPERIMENT_ASYNC_ERRORS:
          serviceImpl.listCampaignExperimentAsyncErrors((com.google.ads.googleads.v3.services.ListCampaignExperimentAsyncErrorsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v3.services.ListCampaignExperimentAsyncErrorsResponse>) responseObserver);
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
      return com.google.ads.googleads.v3.services.CampaignExperimentServiceProto.getDescriptor();
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
              .addMethod(getGetCampaignExperimentMethodHelper())
              .addMethod(getCreateCampaignExperimentMethodHelper())
              .addMethod(getMutateCampaignExperimentsMethodHelper())
              .addMethod(getGraduateCampaignExperimentMethodHelper())
              .addMethod(getPromoteCampaignExperimentMethodHelper())
              .addMethod(getEndCampaignExperimentMethodHelper())
              .addMethod(getListCampaignExperimentAsyncErrorsMethodHelper())
              .build();
        }
      }
    }
    return result;
  }
}
