// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensorflow/core/protobuf/control_flow.proto

package org.tensorflow.framework;

public interface CondContextDefOrBuilder extends
    // @@protoc_insertion_point(interface_extends:tensorflow.CondContextDef)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Name of the context.
   * </pre>
   *
   * <code>string context_name = 1;</code>
   */
  java.lang.String getContextName();
  /**
   * <pre>
   * Name of the context.
   * </pre>
   *
   * <code>string context_name = 1;</code>
   */
  com.google.protobuf.ByteString
      getContextNameBytes();

  /**
   * <pre>
   * Name of the pred tensor.
   * </pre>
   *
   * <code>string pred_name = 2;</code>
   */
  java.lang.String getPredName();
  /**
   * <pre>
   * Name of the pred tensor.
   * </pre>
   *
   * <code>string pred_name = 2;</code>
   */
  com.google.protobuf.ByteString
      getPredNameBytes();

  /**
   * <pre>
   * Name of the pivot tensor.
   * </pre>
   *
   * <code>string pivot_name = 3;</code>
   */
  java.lang.String getPivotName();
  /**
   * <pre>
   * Name of the pivot tensor.
   * </pre>
   *
   * <code>string pivot_name = 3;</code>
   */
  com.google.protobuf.ByteString
      getPivotNameBytes();

  /**
   * <pre>
   * Branch prediction. 0 or 1.
   * </pre>
   *
   * <code>int32 branch = 4;</code>
   */
  int getBranch();

  /**
   * <pre>
   * Values and external values in control flow context.
   * </pre>
   *
   * <code>.tensorflow.ValuesDef values_def = 5;</code>
   */
  boolean hasValuesDef();
  /**
   * <pre>
   * Values and external values in control flow context.
   * </pre>
   *
   * <code>.tensorflow.ValuesDef values_def = 5;</code>
   */
  org.tensorflow.framework.ValuesDef getValuesDef();
  /**
   * <pre>
   * Values and external values in control flow context.
   * </pre>
   *
   * <code>.tensorflow.ValuesDef values_def = 5;</code>
   */
  org.tensorflow.framework.ValuesDefOrBuilder getValuesDefOrBuilder();

  /**
   * <pre>
   * Contexts contained inside this context (e.g. nested conds).
   * </pre>
   *
   * <code>repeated .tensorflow.ControlFlowContextDef nested_contexts = 6;</code>
   */
  java.util.List<org.tensorflow.framework.ControlFlowContextDef> 
      getNestedContextsList();
  /**
   * <pre>
   * Contexts contained inside this context (e.g. nested conds).
   * </pre>
   *
   * <code>repeated .tensorflow.ControlFlowContextDef nested_contexts = 6;</code>
   */
  org.tensorflow.framework.ControlFlowContextDef getNestedContexts(int index);
  /**
   * <pre>
   * Contexts contained inside this context (e.g. nested conds).
   * </pre>
   *
   * <code>repeated .tensorflow.ControlFlowContextDef nested_contexts = 6;</code>
   */
  int getNestedContextsCount();
  /**
   * <pre>
   * Contexts contained inside this context (e.g. nested conds).
   * </pre>
   *
   * <code>repeated .tensorflow.ControlFlowContextDef nested_contexts = 6;</code>
   */
  java.util.List<? extends org.tensorflow.framework.ControlFlowContextDefOrBuilder> 
      getNestedContextsOrBuilderList();
  /**
   * <pre>
   * Contexts contained inside this context (e.g. nested conds).
   * </pre>
   *
   * <code>repeated .tensorflow.ControlFlowContextDef nested_contexts = 6;</code>
   */
  org.tensorflow.framework.ControlFlowContextDefOrBuilder getNestedContextsOrBuilder(
      int index);
}
