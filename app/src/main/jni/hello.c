#include "com_example_myappgradle_app_helloWorldGradle.h"

JNIEXPORT jstring JNICALL Java_com_example_myappgradle_app_helloWorldGradle_getMessageFromNative
  (JNIEnv *env, jobject obj){

  return (*env)->NewStringUTF(env,"Hello World from Native ---<!!");

}


JNIEXPORT jint JNICALL Java_com_example_myappgradle_app_helloWorldGradle_getIntegerFromNative
    (JNIEnv *env, jobject obj, jint d){


 jint i, s=1;

 for(i=1;i<=d;++i) s=s*i;//get d!

 return s;

}