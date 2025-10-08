package com.bannote.userservice.studentclass.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * The student class service definition.
 * </pre>
 */
@io.grpc.stub.annotations.GrpcGenerated
public final class StudentClassServiceGrpc {

  private StudentClassServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "bannote.userservice.studentclass.v1.StudentClassService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.bannote.userservice.studentclass.v1.GetStudentClassRequest,
      com.bannote.userservice.studentclass.v1.GetStudentClassResponse> getGetStudentClassMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetStudentClass",
      requestType = com.bannote.userservice.studentclass.v1.GetStudentClassRequest.class,
      responseType = com.bannote.userservice.studentclass.v1.GetStudentClassResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.bannote.userservice.studentclass.v1.GetStudentClassRequest,
      com.bannote.userservice.studentclass.v1.GetStudentClassResponse> getGetStudentClassMethod() {
    io.grpc.MethodDescriptor<com.bannote.userservice.studentclass.v1.GetStudentClassRequest, com.bannote.userservice.studentclass.v1.GetStudentClassResponse> getGetStudentClassMethod;
    if ((getGetStudentClassMethod = StudentClassServiceGrpc.getGetStudentClassMethod) == null) {
      synchronized (StudentClassServiceGrpc.class) {
        if ((getGetStudentClassMethod = StudentClassServiceGrpc.getGetStudentClassMethod) == null) {
          StudentClassServiceGrpc.getGetStudentClassMethod = getGetStudentClassMethod =
              io.grpc.MethodDescriptor.<com.bannote.userservice.studentclass.v1.GetStudentClassRequest, com.bannote.userservice.studentclass.v1.GetStudentClassResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetStudentClass"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bannote.userservice.studentclass.v1.GetStudentClassRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bannote.userservice.studentclass.v1.GetStudentClassResponse.getDefaultInstance()))
              .setSchemaDescriptor(new StudentClassServiceMethodDescriptorSupplier("GetStudentClass"))
              .build();
        }
      }
    }
    return getGetStudentClassMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.bannote.userservice.studentclass.v1.CreateStudentClassRequest,
      com.bannote.userservice.studentclass.v1.CreateStudentClassResponse> getCreateStudentClassMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateStudentClass",
      requestType = com.bannote.userservice.studentclass.v1.CreateStudentClassRequest.class,
      responseType = com.bannote.userservice.studentclass.v1.CreateStudentClassResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.bannote.userservice.studentclass.v1.CreateStudentClassRequest,
      com.bannote.userservice.studentclass.v1.CreateStudentClassResponse> getCreateStudentClassMethod() {
    io.grpc.MethodDescriptor<com.bannote.userservice.studentclass.v1.CreateStudentClassRequest, com.bannote.userservice.studentclass.v1.CreateStudentClassResponse> getCreateStudentClassMethod;
    if ((getCreateStudentClassMethod = StudentClassServiceGrpc.getCreateStudentClassMethod) == null) {
      synchronized (StudentClassServiceGrpc.class) {
        if ((getCreateStudentClassMethod = StudentClassServiceGrpc.getCreateStudentClassMethod) == null) {
          StudentClassServiceGrpc.getCreateStudentClassMethod = getCreateStudentClassMethod =
              io.grpc.MethodDescriptor.<com.bannote.userservice.studentclass.v1.CreateStudentClassRequest, com.bannote.userservice.studentclass.v1.CreateStudentClassResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateStudentClass"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bannote.userservice.studentclass.v1.CreateStudentClassRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bannote.userservice.studentclass.v1.CreateStudentClassResponse.getDefaultInstance()))
              .setSchemaDescriptor(new StudentClassServiceMethodDescriptorSupplier("CreateStudentClass"))
              .build();
        }
      }
    }
    return getCreateStudentClassMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.bannote.userservice.studentclass.v1.UpdateStudentClassRequest,
      com.bannote.userservice.studentclass.v1.UpdateStudentClassResponse> getUpdateStudentClassMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateStudentClass",
      requestType = com.bannote.userservice.studentclass.v1.UpdateStudentClassRequest.class,
      responseType = com.bannote.userservice.studentclass.v1.UpdateStudentClassResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.bannote.userservice.studentclass.v1.UpdateStudentClassRequest,
      com.bannote.userservice.studentclass.v1.UpdateStudentClassResponse> getUpdateStudentClassMethod() {
    io.grpc.MethodDescriptor<com.bannote.userservice.studentclass.v1.UpdateStudentClassRequest, com.bannote.userservice.studentclass.v1.UpdateStudentClassResponse> getUpdateStudentClassMethod;
    if ((getUpdateStudentClassMethod = StudentClassServiceGrpc.getUpdateStudentClassMethod) == null) {
      synchronized (StudentClassServiceGrpc.class) {
        if ((getUpdateStudentClassMethod = StudentClassServiceGrpc.getUpdateStudentClassMethod) == null) {
          StudentClassServiceGrpc.getUpdateStudentClassMethod = getUpdateStudentClassMethod =
              io.grpc.MethodDescriptor.<com.bannote.userservice.studentclass.v1.UpdateStudentClassRequest, com.bannote.userservice.studentclass.v1.UpdateStudentClassResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateStudentClass"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bannote.userservice.studentclass.v1.UpdateStudentClassRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bannote.userservice.studentclass.v1.UpdateStudentClassResponse.getDefaultInstance()))
              .setSchemaDescriptor(new StudentClassServiceMethodDescriptorSupplier("UpdateStudentClass"))
              .build();
        }
      }
    }
    return getUpdateStudentClassMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.bannote.userservice.studentclass.v1.DeleteStudentClassRequest,
      com.bannote.userservice.studentclass.v1.DeleteStudentClassResponse> getDeleteStudentClassMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteStudentClass",
      requestType = com.bannote.userservice.studentclass.v1.DeleteStudentClassRequest.class,
      responseType = com.bannote.userservice.studentclass.v1.DeleteStudentClassResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.bannote.userservice.studentclass.v1.DeleteStudentClassRequest,
      com.bannote.userservice.studentclass.v1.DeleteStudentClassResponse> getDeleteStudentClassMethod() {
    io.grpc.MethodDescriptor<com.bannote.userservice.studentclass.v1.DeleteStudentClassRequest, com.bannote.userservice.studentclass.v1.DeleteStudentClassResponse> getDeleteStudentClassMethod;
    if ((getDeleteStudentClassMethod = StudentClassServiceGrpc.getDeleteStudentClassMethod) == null) {
      synchronized (StudentClassServiceGrpc.class) {
        if ((getDeleteStudentClassMethod = StudentClassServiceGrpc.getDeleteStudentClassMethod) == null) {
          StudentClassServiceGrpc.getDeleteStudentClassMethod = getDeleteStudentClassMethod =
              io.grpc.MethodDescriptor.<com.bannote.userservice.studentclass.v1.DeleteStudentClassRequest, com.bannote.userservice.studentclass.v1.DeleteStudentClassResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteStudentClass"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bannote.userservice.studentclass.v1.DeleteStudentClassRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bannote.userservice.studentclass.v1.DeleteStudentClassResponse.getDefaultInstance()))
              .setSchemaDescriptor(new StudentClassServiceMethodDescriptorSupplier("DeleteStudentClass"))
              .build();
        }
      }
    }
    return getDeleteStudentClassMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.bannote.userservice.studentclass.v1.ListStudentClassesRequest,
      com.bannote.userservice.studentclass.v1.ListStudentClassesResponse> getListStudentClassesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListStudentClasses",
      requestType = com.bannote.userservice.studentclass.v1.ListStudentClassesRequest.class,
      responseType = com.bannote.userservice.studentclass.v1.ListStudentClassesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.bannote.userservice.studentclass.v1.ListStudentClassesRequest,
      com.bannote.userservice.studentclass.v1.ListStudentClassesResponse> getListStudentClassesMethod() {
    io.grpc.MethodDescriptor<com.bannote.userservice.studentclass.v1.ListStudentClassesRequest, com.bannote.userservice.studentclass.v1.ListStudentClassesResponse> getListStudentClassesMethod;
    if ((getListStudentClassesMethod = StudentClassServiceGrpc.getListStudentClassesMethod) == null) {
      synchronized (StudentClassServiceGrpc.class) {
        if ((getListStudentClassesMethod = StudentClassServiceGrpc.getListStudentClassesMethod) == null) {
          StudentClassServiceGrpc.getListStudentClassesMethod = getListStudentClassesMethod =
              io.grpc.MethodDescriptor.<com.bannote.userservice.studentclass.v1.ListStudentClassesRequest, com.bannote.userservice.studentclass.v1.ListStudentClassesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListStudentClasses"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bannote.userservice.studentclass.v1.ListStudentClassesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bannote.userservice.studentclass.v1.ListStudentClassesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new StudentClassServiceMethodDescriptorSupplier("ListStudentClasses"))
              .build();
        }
      }
    }
    return getListStudentClassesMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static StudentClassServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<StudentClassServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<StudentClassServiceStub>() {
        @java.lang.Override
        public StudentClassServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new StudentClassServiceStub(channel, callOptions);
        }
      };
    return StudentClassServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static StudentClassServiceBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<StudentClassServiceBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<StudentClassServiceBlockingV2Stub>() {
        @java.lang.Override
        public StudentClassServiceBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new StudentClassServiceBlockingV2Stub(channel, callOptions);
        }
      };
    return StudentClassServiceBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static StudentClassServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<StudentClassServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<StudentClassServiceBlockingStub>() {
        @java.lang.Override
        public StudentClassServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new StudentClassServiceBlockingStub(channel, callOptions);
        }
      };
    return StudentClassServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static StudentClassServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<StudentClassServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<StudentClassServiceFutureStub>() {
        @java.lang.Override
        public StudentClassServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new StudentClassServiceFutureStub(channel, callOptions);
        }
      };
    return StudentClassServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * The student class service definition.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     *  학반 ID로 학반 조회 API
     * </pre>
     */
    default void getStudentClass(com.bannote.userservice.studentclass.v1.GetStudentClassRequest request,
        io.grpc.stub.StreamObserver<com.bannote.userservice.studentclass.v1.GetStudentClassResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetStudentClassMethod(), responseObserver);
    }

    /**
     * <pre>
     *  학반 생성 API
     * </pre>
     */
    default void createStudentClass(com.bannote.userservice.studentclass.v1.CreateStudentClassRequest request,
        io.grpc.stub.StreamObserver<com.bannote.userservice.studentclass.v1.CreateStudentClassResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateStudentClassMethod(), responseObserver);
    }

    /**
     * <pre>
     *  학반 수정 API
     * </pre>
     */
    default void updateStudentClass(com.bannote.userservice.studentclass.v1.UpdateStudentClassRequest request,
        io.grpc.stub.StreamObserver<com.bannote.userservice.studentclass.v1.UpdateStudentClassResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateStudentClassMethod(), responseObserver);
    }

    /**
     * <pre>
     *  학반 삭제 API
     * </pre>
     */
    default void deleteStudentClass(com.bannote.userservice.studentclass.v1.DeleteStudentClassRequest request,
        io.grpc.stub.StreamObserver<com.bannote.userservice.studentclass.v1.DeleteStudentClassResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteStudentClassMethod(), responseObserver);
    }

    /**
     * <pre>
     *  학반 목록 조회 API
     * </pre>
     */
    default void listStudentClasses(com.bannote.userservice.studentclass.v1.ListStudentClassesRequest request,
        io.grpc.stub.StreamObserver<com.bannote.userservice.studentclass.v1.ListStudentClassesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListStudentClassesMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service StudentClassService.
   * <pre>
   * The student class service definition.
   * </pre>
   */
  public static abstract class StudentClassServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return StudentClassServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service StudentClassService.
   * <pre>
   * The student class service definition.
   * </pre>
   */
  public static final class StudentClassServiceStub
      extends io.grpc.stub.AbstractAsyncStub<StudentClassServiceStub> {
    private StudentClassServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StudentClassServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new StudentClassServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     *  학반 ID로 학반 조회 API
     * </pre>
     */
    public void getStudentClass(com.bannote.userservice.studentclass.v1.GetStudentClassRequest request,
        io.grpc.stub.StreamObserver<com.bannote.userservice.studentclass.v1.GetStudentClassResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetStudentClassMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *  학반 생성 API
     * </pre>
     */
    public void createStudentClass(com.bannote.userservice.studentclass.v1.CreateStudentClassRequest request,
        io.grpc.stub.StreamObserver<com.bannote.userservice.studentclass.v1.CreateStudentClassResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateStudentClassMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *  학반 수정 API
     * </pre>
     */
    public void updateStudentClass(com.bannote.userservice.studentclass.v1.UpdateStudentClassRequest request,
        io.grpc.stub.StreamObserver<com.bannote.userservice.studentclass.v1.UpdateStudentClassResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateStudentClassMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *  학반 삭제 API
     * </pre>
     */
    public void deleteStudentClass(com.bannote.userservice.studentclass.v1.DeleteStudentClassRequest request,
        io.grpc.stub.StreamObserver<com.bannote.userservice.studentclass.v1.DeleteStudentClassResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteStudentClassMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *  학반 목록 조회 API
     * </pre>
     */
    public void listStudentClasses(com.bannote.userservice.studentclass.v1.ListStudentClassesRequest request,
        io.grpc.stub.StreamObserver<com.bannote.userservice.studentclass.v1.ListStudentClassesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListStudentClassesMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service StudentClassService.
   * <pre>
   * The student class service definition.
   * </pre>
   */
  public static final class StudentClassServiceBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<StudentClassServiceBlockingV2Stub> {
    private StudentClassServiceBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StudentClassServiceBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new StudentClassServiceBlockingV2Stub(channel, callOptions);
    }

    /**
     * <pre>
     *  학반 ID로 학반 조회 API
     * </pre>
     */
    public com.bannote.userservice.studentclass.v1.GetStudentClassResponse getStudentClass(com.bannote.userservice.studentclass.v1.GetStudentClassRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getGetStudentClassMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *  학반 생성 API
     * </pre>
     */
    public com.bannote.userservice.studentclass.v1.CreateStudentClassResponse createStudentClass(com.bannote.userservice.studentclass.v1.CreateStudentClassRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getCreateStudentClassMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *  학반 수정 API
     * </pre>
     */
    public com.bannote.userservice.studentclass.v1.UpdateStudentClassResponse updateStudentClass(com.bannote.userservice.studentclass.v1.UpdateStudentClassRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getUpdateStudentClassMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *  학반 삭제 API
     * </pre>
     */
    public com.bannote.userservice.studentclass.v1.DeleteStudentClassResponse deleteStudentClass(com.bannote.userservice.studentclass.v1.DeleteStudentClassRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getDeleteStudentClassMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *  학반 목록 조회 API
     * </pre>
     */
    public com.bannote.userservice.studentclass.v1.ListStudentClassesResponse listStudentClasses(com.bannote.userservice.studentclass.v1.ListStudentClassesRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getListStudentClassesMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service StudentClassService.
   * <pre>
   * The student class service definition.
   * </pre>
   */
  public static final class StudentClassServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<StudentClassServiceBlockingStub> {
    private StudentClassServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StudentClassServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new StudentClassServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     *  학반 ID로 학반 조회 API
     * </pre>
     */
    public com.bannote.userservice.studentclass.v1.GetStudentClassResponse getStudentClass(com.bannote.userservice.studentclass.v1.GetStudentClassRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetStudentClassMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *  학반 생성 API
     * </pre>
     */
    public com.bannote.userservice.studentclass.v1.CreateStudentClassResponse createStudentClass(com.bannote.userservice.studentclass.v1.CreateStudentClassRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateStudentClassMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *  학반 수정 API
     * </pre>
     */
    public com.bannote.userservice.studentclass.v1.UpdateStudentClassResponse updateStudentClass(com.bannote.userservice.studentclass.v1.UpdateStudentClassRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateStudentClassMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *  학반 삭제 API
     * </pre>
     */
    public com.bannote.userservice.studentclass.v1.DeleteStudentClassResponse deleteStudentClass(com.bannote.userservice.studentclass.v1.DeleteStudentClassRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteStudentClassMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *  학반 목록 조회 API
     * </pre>
     */
    public com.bannote.userservice.studentclass.v1.ListStudentClassesResponse listStudentClasses(com.bannote.userservice.studentclass.v1.ListStudentClassesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListStudentClassesMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service StudentClassService.
   * <pre>
   * The student class service definition.
   * </pre>
   */
  public static final class StudentClassServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<StudentClassServiceFutureStub> {
    private StudentClassServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StudentClassServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new StudentClassServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     *  학반 ID로 학반 조회 API
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.bannote.userservice.studentclass.v1.GetStudentClassResponse> getStudentClass(
        com.bannote.userservice.studentclass.v1.GetStudentClassRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetStudentClassMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *  학반 생성 API
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.bannote.userservice.studentclass.v1.CreateStudentClassResponse> createStudentClass(
        com.bannote.userservice.studentclass.v1.CreateStudentClassRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateStudentClassMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *  학반 수정 API
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.bannote.userservice.studentclass.v1.UpdateStudentClassResponse> updateStudentClass(
        com.bannote.userservice.studentclass.v1.UpdateStudentClassRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateStudentClassMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *  학반 삭제 API
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.bannote.userservice.studentclass.v1.DeleteStudentClassResponse> deleteStudentClass(
        com.bannote.userservice.studentclass.v1.DeleteStudentClassRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteStudentClassMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *  학반 목록 조회 API
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.bannote.userservice.studentclass.v1.ListStudentClassesResponse> listStudentClasses(
        com.bannote.userservice.studentclass.v1.ListStudentClassesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListStudentClassesMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_STUDENT_CLASS = 0;
  private static final int METHODID_CREATE_STUDENT_CLASS = 1;
  private static final int METHODID_UPDATE_STUDENT_CLASS = 2;
  private static final int METHODID_DELETE_STUDENT_CLASS = 3;
  private static final int METHODID_LIST_STUDENT_CLASSES = 4;

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
        case METHODID_GET_STUDENT_CLASS:
          serviceImpl.getStudentClass((com.bannote.userservice.studentclass.v1.GetStudentClassRequest) request,
              (io.grpc.stub.StreamObserver<com.bannote.userservice.studentclass.v1.GetStudentClassResponse>) responseObserver);
          break;
        case METHODID_CREATE_STUDENT_CLASS:
          serviceImpl.createStudentClass((com.bannote.userservice.studentclass.v1.CreateStudentClassRequest) request,
              (io.grpc.stub.StreamObserver<com.bannote.userservice.studentclass.v1.CreateStudentClassResponse>) responseObserver);
          break;
        case METHODID_UPDATE_STUDENT_CLASS:
          serviceImpl.updateStudentClass((com.bannote.userservice.studentclass.v1.UpdateStudentClassRequest) request,
              (io.grpc.stub.StreamObserver<com.bannote.userservice.studentclass.v1.UpdateStudentClassResponse>) responseObserver);
          break;
        case METHODID_DELETE_STUDENT_CLASS:
          serviceImpl.deleteStudentClass((com.bannote.userservice.studentclass.v1.DeleteStudentClassRequest) request,
              (io.grpc.stub.StreamObserver<com.bannote.userservice.studentclass.v1.DeleteStudentClassResponse>) responseObserver);
          break;
        case METHODID_LIST_STUDENT_CLASSES:
          serviceImpl.listStudentClasses((com.bannote.userservice.studentclass.v1.ListStudentClassesRequest) request,
              (io.grpc.stub.StreamObserver<com.bannote.userservice.studentclass.v1.ListStudentClassesResponse>) responseObserver);
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
          getGetStudentClassMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.bannote.userservice.studentclass.v1.GetStudentClassRequest,
              com.bannote.userservice.studentclass.v1.GetStudentClassResponse>(
                service, METHODID_GET_STUDENT_CLASS)))
        .addMethod(
          getCreateStudentClassMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.bannote.userservice.studentclass.v1.CreateStudentClassRequest,
              com.bannote.userservice.studentclass.v1.CreateStudentClassResponse>(
                service, METHODID_CREATE_STUDENT_CLASS)))
        .addMethod(
          getUpdateStudentClassMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.bannote.userservice.studentclass.v1.UpdateStudentClassRequest,
              com.bannote.userservice.studentclass.v1.UpdateStudentClassResponse>(
                service, METHODID_UPDATE_STUDENT_CLASS)))
        .addMethod(
          getDeleteStudentClassMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.bannote.userservice.studentclass.v1.DeleteStudentClassRequest,
              com.bannote.userservice.studentclass.v1.DeleteStudentClassResponse>(
                service, METHODID_DELETE_STUDENT_CLASS)))
        .addMethod(
          getListStudentClassesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.bannote.userservice.studentclass.v1.ListStudentClassesRequest,
              com.bannote.userservice.studentclass.v1.ListStudentClassesResponse>(
                service, METHODID_LIST_STUDENT_CLASSES)))
        .build();
  }

  private static abstract class StudentClassServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    StudentClassServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.bannote.userservice.studentclass.v1.ServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("StudentClassService");
    }
  }

  private static final class StudentClassServiceFileDescriptorSupplier
      extends StudentClassServiceBaseDescriptorSupplier {
    StudentClassServiceFileDescriptorSupplier() {}
  }

  private static final class StudentClassServiceMethodDescriptorSupplier
      extends StudentClassServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    StudentClassServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (StudentClassServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new StudentClassServiceFileDescriptorSupplier())
              .addMethod(getGetStudentClassMethod())
              .addMethod(getCreateStudentClassMethod())
              .addMethod(getUpdateStudentClassMethod())
              .addMethod(getDeleteStudentClassMethod())
              .addMethod(getListStudentClassesMethod())
              .build();
        }
      }
    }
    return result;
  }
}
