#include <jni.h>

extern "C" {
jint  Java_com_shone_testjni_HelloWorld_printJNI(JNIEnv *, jobject thiz , jint a, jint b){
	return a+b;
}

}

