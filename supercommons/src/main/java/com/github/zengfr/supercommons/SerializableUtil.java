package com.github.zengfr.supercommons;
import org.apache.commons.lang3.SerializationUtils;
import org.apache.commons.lang.SerializationUtils;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class SerializableUtil{ 
public static <T extends java.io.Serializable > T clone(T p0){
return SerializationUtils.clone(p0);
}
public static void serialize(java.io.Serializable p0,java.io.OutputStream p1){
 SerializationUtils.serialize(p0,p1);
}
public static byte[] serialize(java.io.Serializable p0){
return SerializationUtils.serialize(p0);
}
public static <T extends java.io.Serializable > T roundtrip(T p0){
return SerializationUtils.roundtrip(p0);
}
public static java.lang.Object clone(java.io.Serializable p0){
return SerializationUtils.clone(p0);
}
}
