package com.bannote.userservice.department.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * The department service definition.
 * </pre>
 */
@io.grpc.stub.annotations.GrpcGenerated
public final class DepartmentServiceGrpc {

  private DepartmentServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "bannote.userservice.department.v1.DepartmentService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.bannote.userservice.department.v1.GetDepartmentRequest,
      com.bannote.userservice.department.v1.GetDepartmentResponse> getGetDepartmentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetDepartment",
      requestType = com.bannote.userservice.department.v1.GetDepartmentRequest.class,
      responseType = com.bannote.userservice.department.v1.GetDepartmentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.bannote.userservice.department.v1.GetDepartmentRequest,
      com.bannote.userservice.department.v1.GetDepartmentResponse> getGetDepartmentMethod() {
    io.grpc.MethodDescriptor<com.bannote.userservice.department.v1.GetDepartmentRequest, com.bannote.userservice.department.v1.GetDepartmentResponse> getGetDepartmentMethod;
    if ((getGetDepartmentMethod = DepartmentServiceGrpc.getGetDepartmentMethod) == null) {
      synchronized (DepartmentServiceGrpc.class) {
        if ((getGetDepartmentMethod = DepartmentServiceGrpc.getGetDepartmentMethod) == null) {
          DepartmentServiceGrpc.getGetDepartmentMethod = getGetDepartmentMethod =
              io.grpc.MethodDescriptor.<com.bannote.userservice.department.v1.GetDepartmentRequest, com.bannote.userservice.department.v1.GetDepartmentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetDepartment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bannote.userservice.department.v1.GetDepartmentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bannote.userservice.department.v1.GetDepartmentResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DepartmentServiceMethodDescriptorSupplier("GetDepartment"))
              .build();
        }
      }
    }
    return getGetDepartmentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.bannote.userservice.department.v1.CreateDepartmentRequest,
      com.bannote.userservice.department.v1.CreateDepartmentResponse> getCreateDepartmentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateDepartment",
      requestType = com.bannote.userservice.department.v1.CreateDepartmentRequest.class,
      responseType = com.bannote.userservice.department.v1.CreateDepartmentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.bannote.userservice.department.v1.CreateDepartmentRequest,
      com.bannote.userservice.department.v1.CreateDepartmentResponse> getCreateDepartmentMethod() {
    io.grpc.MethodDescriptor<com.bannote.userservice.department.v1.CreateDepartmentRequest, com.bannote.userservice.department.v1.CreateDepartmentResponse> getCreateDepartmentMethod;
    if ((getCreateDepartmentMethod = DepartmentServiceGrpc.getCreateDepartmentMethod) == null) {
      synchronized (DepartmentServiceGrpc.class) {
        if ((getCreateDepartmentMethod = DepartmentServiceGrpc.getCreateDepartmentMethod) == null) {
          DepartmentServiceGrpc.getCreateDepartmentMethod = getCreateDepartmentMethod =
              io.grpc.MethodDescriptor.<com.bannote.userservice.department.v1.CreateDepartmentRequest, com.bannote.userservice.department.v1.CreateDepartmentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateDepartment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bannote.userservice.department.v1.CreateDepartmentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bannote.userservice.department.v1.CreateDepartmentResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DepartmentServiceMethodDescriptorSupplier("CreateDepartment"))
              .build();
        }
      }
    }
    return getCreateDepartmentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.bannote.userservice.department.v1.UpdateDepartmentRequest,
      com.bannote.userservice.department.v1.UpdateDepartmentResponse> getUpdateDepartmentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateDepartment",
      requestType = com.bannote.userservice.department.v1.UpdateDepartmentRequest.class,
      responseType = com.bannote.userservice.department.v1.UpdateDepartmentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.bannote.userservice.department.v1.UpdateDepartmentRequest,
      com.bannote.userservice.department.v1.UpdateDepartmentResponse> getUpdateDepartmentMethod() {
    io.grpc.MethodDescriptor<com.bannote.userservice.department.v1.UpdateDepartmentRequest, com.bannote.userservice.department.v1.UpdateDepartmentResponse> getUpdateDepartmentMethod;
    if ((getUpdateDepartmentMethod = DepartmentServiceGrpc.getUpdateDepartmentMethod) == null) {
      synchronized (DepartmentServiceGrpc.class) {
        if ((getUpdateDepartmentMethod = DepartmentServiceGrpc.getUpdateDepartmentMethod) == null) {
          DepartmentServiceGrpc.getUpdateDepartmentMethod = getUpdateDepartmentMethod =
              io.grpc.MethodDescriptor.<com.bannote.userservice.department.v1.UpdateDepartmentRequest, com.bannote.userservice.department.v1.UpdateDepartmentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateDepartment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bannote.userservice.department.v1.UpdateDepartmentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bannote.userservice.department.v1.UpdateDepartmentResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DepartmentServiceMethodDescriptorSupplier("UpdateDepartment"))
              .build();
        }
      }
    }
    return getUpdateDepartmentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.bannote.userservice.department.v1.DeleteDepartmentRequest,
      com.bannote.userservice.department.v1.DeleteDepartmentResponse> getDeleteDepartmentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteDepartment",
      requestType = com.bannote.userservice.department.v1.DeleteDepartmentRequest.class,
      responseType = com.bannote.userservice.department.v1.DeleteDepartmentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.bannote.userservice.department.v1.DeleteDepartmentRequest,
      com.bannote.userservice.department.v1.DeleteDepartmentResponse> getDeleteDepartmentMethod() {
    io.grpc.MethodDescriptor<com.bannote.userservice.department.v1.DeleteDepartmentRequest, com.bannote.userservice.department.v1.DeleteDepartmentResponse> getDeleteDepartmentMethod;
    if ((getDeleteDepartmentMethod = DepartmentServiceGrpc.getDeleteDepartmentMethod) == null) {
      synchronized (DepartmentServiceGrpc.class) {
        if ((getDeleteDepartmentMethod = DepartmentServiceGrpc.getDeleteDepartmentMethod) == null) {
          DepartmentServiceGrpc.getDeleteDepartmentMethod = getDeleteDepartmentMethod =
              io.grpc.MethodDescriptor.<com.bannote.userservice.department.v1.DeleteDepartmentRequest, com.bannote.userservice.department.v1.DeleteDepartmentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteDepartment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bannote.userservice.department.v1.DeleteDepartmentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bannote.userservice.department.v1.DeleteDepartmentResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DepartmentServiceMethodDescriptorSupplier("DeleteDepartment"))
              .build();
        }
      }
    }
    return getDeleteDepartmentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.bannote.userservice.department.v1.ListDepartmentsRequest,
      com.bannote.userservice.department.v1.ListDepartmentsResponse> getListDepartmentsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListDepartments",
      requestType = com.bannote.userservice.department.v1.ListDepartmentsRequest.class,
      responseType = com.bannote.userservice.department.v1.ListDepartmentsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.bannote.userservice.department.v1.ListDepartmentsRequest,
      com.bannote.userservice.department.v1.ListDepartmentsResponse> getListDepartmentsMethod() {
    io.grpc.MethodDescriptor<com.bannote.userservice.department.v1.ListDepartmentsRequest, com.bannote.userservice.department.v1.ListDepartmentsResponse> getListDepartmentsMethod;
    if ((getListDepartmentsMethod = DepartmentServiceGrpc.getListDepartmentsMethod) == null) {
      synchronized (DepartmentServiceGrpc.class) {
        if ((getListDepartmentsMethod = DepartmentServiceGrpc.getListDepartmentsMethod) == null) {
          DepartmentServiceGrpc.getListDepartmentsMethod = getListDepartmentsMethod =
              io.grpc.MethodDescriptor.<com.bannote.userservice.department.v1.ListDepartmentsRequest, com.bannote.userservice.department.v1.ListDepartmentsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListDepartments"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bannote.userservice.department.v1.ListDepartmentsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bannote.userservice.department.v1.ListDepartmentsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DepartmentServiceMethodDescriptorSupplier("ListDepartments"))
              .build();
        }
      }
    }
    return getListDepartmentsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DepartmentServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DepartmentServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DepartmentServiceStub>() {
        @java.lang.Override
        public DepartmentServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DepartmentServiceStub(channel, callOptions);
        }
      };
    return DepartmentServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static DepartmentServiceBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DepartmentServiceBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DepartmentServiceBlockingV2Stub>() {
        @java.lang.Override
        public DepartmentServiceBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DepartmentServiceBlockingV2Stub(channel, callOptions);
        }
      };
    return DepartmentServiceBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DepartmentServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DepartmentServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DepartmentServiceBlockingStub>() {
        @java.lang.Override
        public DepartmentServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DepartmentServiceBlockingStub(channel, callOptions);
        }
      };
    return DepartmentServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DepartmentServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DepartmentServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DepartmentServiceFutureStub>() {
        @java.lang.Override
        public DepartmentServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DepartmentServiceFutureStub(channel, callOptions);
        }
      };
    return DepartmentServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * The department service definition.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     *  학과 ID로 학과 조회 API
     * </pre>
     */
    default void getDepartment(com.bannote.userservice.department.v1.GetDepartmentRequest request,
        io.grpc.stub.StreamObserver<com.bannote.userservice.department.v1.GetDepartmentResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetDepartmentMethod(), responseObserver);
    }

    /**
     * <pre>
     *  학과 생성 API
     * </pre>
     */
    default void createDepartment(com.bannote.userservice.department.v1.CreateDepartmentRequest request,
        io.grpc.stub.StreamObserver<com.bannote.userservice.department.v1.CreateDepartmentResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateDepartmentMethod(), responseObserver);
    }

    /**
     * <pre>
     *  학과 수정 API
     * </pre>
     */
    default void updateDepartment(com.bannote.userservice.department.v1.UpdateDepartmentRequest request,
        io.grpc.stub.StreamObserver<com.bannote.userservice.department.v1.UpdateDepartmentResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateDepartmentMethod(), responseObserver);
    }

    /**
     * <pre>
     *  학과 삭제 API
     * </pre>
     */
    default void deleteDepartment(com.bannote.userservice.department.v1.DeleteDepartmentRequest request,
        io.grpc.stub.StreamObserver<com.bannote.userservice.department.v1.DeleteDepartmentResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteDepartmentMethod(), responseObserver);
    }

    /**
     * <pre>
     *  학과 목록 조회 API
     * </pre>
     */
    default void listDepartments(com.bannote.userservice.department.v1.ListDepartmentsRequest request,
        io.grpc.stub.StreamObserver<com.bannote.userservice.department.v1.ListDepartmentsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListDepartmentsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service DepartmentService.
   * <pre>
   * The department service definition.
   * </pre>
   */
  public static abstract class DepartmentServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return DepartmentServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service DepartmentService.
   * <pre>
   * The department service definition.
   * </pre>
   */
  public static final class DepartmentServiceStub
      extends io.grpc.stub.AbstractAsyncStub<DepartmentServiceStub> {
    private DepartmentServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DepartmentServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DepartmentServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     *  학과 ID로 학과 조회 API
     * </pre>
     */
    public void getDepartment(com.bannote.userservice.department.v1.GetDepartmentRequest request,
        io.grpc.stub.StreamObserver<com.bannote.userservice.department.v1.GetDepartmentResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetDepartmentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *  학과 생성 API
     * </pre>
     */
    public void createDepartment(com.bannote.userservice.department.v1.CreateDepartmentRequest request,
        io.grpc.stub.StreamObserver<com.bannote.userservice.department.v1.CreateDepartmentResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateDepartmentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *  학과 수정 API
     * </pre>
     */
    public void updateDepartment(com.bannote.userservice.department.v1.UpdateDepartmentRequest request,
        io.grpc.stub.StreamObserver<com.bannote.userservice.department.v1.UpdateDepartmentResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateDepartmentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *  학과 삭제 API
     * </pre>
     */
    public void deleteDepartment(com.bannote.userservice.department.v1.DeleteDepartmentRequest request,
        io.grpc.stub.StreamObserver<com.bannote.userservice.department.v1.DeleteDepartmentResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteDepartmentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *  학과 목록 조회 API
     * </pre>
     */
    public void listDepartments(com.bannote.userservice.department.v1.ListDepartmentsRequest request,
        io.grpc.stub.StreamObserver<com.bannote.userservice.department.v1.ListDepartmentsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListDepartmentsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service DepartmentService.
   * <pre>
   * The department service definition.
   * </pre>
   */
  public static final class DepartmentServiceBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<DepartmentServiceBlockingV2Stub> {
    private DepartmentServiceBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DepartmentServiceBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DepartmentServiceBlockingV2Stub(channel, callOptions);
    }

    /**
     * <pre>
     *  학과 ID로 학과 조회 API
     * </pre>
     */
    public com.bannote.userservice.department.v1.GetDepartmentResponse getDepartment(com.bannote.userservice.department.v1.GetDepartmentRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getGetDepartmentMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *  학과 생성 API
     * </pre>
     */
    public com.bannote.userservice.department.v1.CreateDepartmentResponse createDepartment(com.bannote.userservice.department.v1.CreateDepartmentRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getCreateDepartmentMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *  학과 수정 API
     * </pre>
     */
    public com.bannote.userservice.department.v1.UpdateDepartmentResponse updateDepartment(com.bannote.userservice.department.v1.UpdateDepartmentRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getUpdateDepartmentMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *  학과 삭제 API
     * </pre>
     */
    public com.bannote.userservice.department.v1.DeleteDepartmentResponse deleteDepartment(com.bannote.userservice.department.v1.DeleteDepartmentRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getDeleteDepartmentMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *  학과 목록 조회 API
     * </pre>
     */
    public com.bannote.userservice.department.v1.ListDepartmentsResponse listDepartments(com.bannote.userservice.department.v1.ListDepartmentsRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getListDepartmentsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service DepartmentService.
   * <pre>
   * The department service definition.
   * </pre>
   */
  public static final class DepartmentServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<DepartmentServiceBlockingStub> {
    private DepartmentServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DepartmentServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DepartmentServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     *  학과 ID로 학과 조회 API
     * </pre>
     */
    public com.bannote.userservice.department.v1.GetDepartmentResponse getDepartment(com.bannote.userservice.department.v1.GetDepartmentRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetDepartmentMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *  학과 생성 API
     * </pre>
     */
    public com.bannote.userservice.department.v1.CreateDepartmentResponse createDepartment(com.bannote.userservice.department.v1.CreateDepartmentRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateDepartmentMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *  학과 수정 API
     * </pre>
     */
    public com.bannote.userservice.department.v1.UpdateDepartmentResponse updateDepartment(com.bannote.userservice.department.v1.UpdateDepartmentRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateDepartmentMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *  학과 삭제 API
     * </pre>
     */
    public com.bannote.userservice.department.v1.DeleteDepartmentResponse deleteDepartment(com.bannote.userservice.department.v1.DeleteDepartmentRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteDepartmentMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *  학과 목록 조회 API
     * </pre>
     */
    public com.bannote.userservice.department.v1.ListDepartmentsResponse listDepartments(com.bannote.userservice.department.v1.ListDepartmentsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListDepartmentsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service DepartmentService.
   * <pre>
   * The department service definition.
   * </pre>
   */
  public static final class DepartmentServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<DepartmentServiceFutureStub> {
    private DepartmentServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DepartmentServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DepartmentServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     *  학과 ID로 학과 조회 API
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.bannote.userservice.department.v1.GetDepartmentResponse> getDepartment(
        com.bannote.userservice.department.v1.GetDepartmentRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetDepartmentMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *  학과 생성 API
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.bannote.userservice.department.v1.CreateDepartmentResponse> createDepartment(
        com.bannote.userservice.department.v1.CreateDepartmentRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateDepartmentMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *  학과 수정 API
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.bannote.userservice.department.v1.UpdateDepartmentResponse> updateDepartment(
        com.bannote.userservice.department.v1.UpdateDepartmentRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateDepartmentMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *  학과 삭제 API
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.bannote.userservice.department.v1.DeleteDepartmentResponse> deleteDepartment(
        com.bannote.userservice.department.v1.DeleteDepartmentRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteDepartmentMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *  학과 목록 조회 API
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.bannote.userservice.department.v1.ListDepartmentsResponse> listDepartments(
        com.bannote.userservice.department.v1.ListDepartmentsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListDepartmentsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_DEPARTMENT = 0;
  private static final int METHODID_CREATE_DEPARTMENT = 1;
  private static final int METHODID_UPDATE_DEPARTMENT = 2;
  private static final int METHODID_DELETE_DEPARTMENT = 3;
  private static final int METHODID_LIST_DEPARTMENTS = 4;

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
        case METHODID_GET_DEPARTMENT:
          serviceImpl.getDepartment((com.bannote.userservice.department.v1.GetDepartmentRequest) request,
              (io.grpc.stub.StreamObserver<com.bannote.userservice.department.v1.GetDepartmentResponse>) responseObserver);
          break;
        case METHODID_CREATE_DEPARTMENT:
          serviceImpl.createDepartment((com.bannote.userservice.department.v1.CreateDepartmentRequest) request,
              (io.grpc.stub.StreamObserver<com.bannote.userservice.department.v1.CreateDepartmentResponse>) responseObserver);
          break;
        case METHODID_UPDATE_DEPARTMENT:
          serviceImpl.updateDepartment((com.bannote.userservice.department.v1.UpdateDepartmentRequest) request,
              (io.grpc.stub.StreamObserver<com.bannote.userservice.department.v1.UpdateDepartmentResponse>) responseObserver);
          break;
        case METHODID_DELETE_DEPARTMENT:
          serviceImpl.deleteDepartment((com.bannote.userservice.department.v1.DeleteDepartmentRequest) request,
              (io.grpc.stub.StreamObserver<com.bannote.userservice.department.v1.DeleteDepartmentResponse>) responseObserver);
          break;
        case METHODID_LIST_DEPARTMENTS:
          serviceImpl.listDepartments((com.bannote.userservice.department.v1.ListDepartmentsRequest) request,
              (io.grpc.stub.StreamObserver<com.bannote.userservice.department.v1.ListDepartmentsResponse>) responseObserver);
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
          getGetDepartmentMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.bannote.userservice.department.v1.GetDepartmentRequest,
              com.bannote.userservice.department.v1.GetDepartmentResponse>(
                service, METHODID_GET_DEPARTMENT)))
        .addMethod(
          getCreateDepartmentMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.bannote.userservice.department.v1.CreateDepartmentRequest,
              com.bannote.userservice.department.v1.CreateDepartmentResponse>(
                service, METHODID_CREATE_DEPARTMENT)))
        .addMethod(
          getUpdateDepartmentMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.bannote.userservice.department.v1.UpdateDepartmentRequest,
              com.bannote.userservice.department.v1.UpdateDepartmentResponse>(
                service, METHODID_UPDATE_DEPARTMENT)))
        .addMethod(
          getDeleteDepartmentMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.bannote.userservice.department.v1.DeleteDepartmentRequest,
              com.bannote.userservice.department.v1.DeleteDepartmentResponse>(
                service, METHODID_DELETE_DEPARTMENT)))
        .addMethod(
          getListDepartmentsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.bannote.userservice.department.v1.ListDepartmentsRequest,
              com.bannote.userservice.department.v1.ListDepartmentsResponse>(
                service, METHODID_LIST_DEPARTMENTS)))
        .build();
  }

  private static abstract class DepartmentServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    DepartmentServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.bannote.userservice.department.v1.ServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("DepartmentService");
    }
  }

  private static final class DepartmentServiceFileDescriptorSupplier
      extends DepartmentServiceBaseDescriptorSupplier {
    DepartmentServiceFileDescriptorSupplier() {}
  }

  private static final class DepartmentServiceMethodDescriptorSupplier
      extends DepartmentServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    DepartmentServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (DepartmentServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new DepartmentServiceFileDescriptorSupplier())
              .addMethod(getGetDepartmentMethod())
              .addMethod(getCreateDepartmentMethod())
              .addMethod(getUpdateDepartmentMethod())
              .addMethod(getDeleteDepartmentMethod())
              .addMethod(getListDepartmentsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
