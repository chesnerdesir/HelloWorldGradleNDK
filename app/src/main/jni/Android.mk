LOCAL_PATH := $(call my-dir)

include $(CLEAR_VARS)

LOCAL_MODULE := myHello
LOCAL_SRC_FILES := hello.c

LOCAL_CFLAGS :=

include $(BUILD_SHARED_LIBRARY)


