/**
 * Autogenerated by Thrift Compiler (0.9.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.emc.pravega.controller.stream.api.v1;


import java.util.Map;
import java.util.HashMap;
import org.apache.thrift.TEnum;

public enum ScalingPolicyType implements org.apache.thrift.TEnum {
  FIXED_NUM_SEGMENTS(0),
  BY_RATE_IN_BYTES(1),
  BY_RATE_IN_EVENTS(2);

  private final int value;

  private ScalingPolicyType(int value) {
    this.value = value;
  }

  /**
   * Get the integer value of this enum value, as defined in the Thrift IDL.
   */
  public int getValue() {
    return value;
  }

  /**
   * Find a the enum type by its integer value, as defined in the Thrift IDL.
   * @return null if the value is not found.
   */
  public static ScalingPolicyType findByValue(int value) { 
    switch (value) {
      case 0:
        return FIXED_NUM_SEGMENTS;
      case 1:
        return BY_RATE_IN_BYTES;
      case 2:
        return BY_RATE_IN_EVENTS;
      default:
        return null;
    }
  }
}
