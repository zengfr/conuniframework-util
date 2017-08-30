package com.github.zengfr.supercommons;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class SerializableUtil{
/**
*public static <T> T org.apache.commons.lang3.SerializationUtils.clone(T)
*/
public static <T extends java.io.Serializable > T clone(T p0){
	return org.apache.commons.lang3.SerializationUtils.clone(p0);
}
/**
*public static byte[] org.apache.commons.lang3.SerializationUtils.serialize(java.io.Serializable)
*/
public static byte[] serialize(java.io.Serializable p0){
	return org.apache.commons.lang3.SerializationUtils.serialize(p0);
}
/**
*public static void org.apache.commons.lang3.SerializationUtils.serialize(java.io.Serializable,java.io.OutputStream)
*/
public static void serialize(java.io.Serializable p0,java.io.OutputStream p1){
	 org.apache.commons.lang3.SerializationUtils.serialize(p0,p1);
}
/**
*public static <T> T org.apache.commons.lang3.SerializationUtils.roundtrip(T)
*/
public static <T extends java.io.Serializable > T roundtrip(T p0){
	return org.apache.commons.lang3.SerializationUtils.roundtrip(p0);
}
/**
*public static java.lang.Object org.apache.commons.lang.SerializationUtils.clone(java.io.Serializable)
*/
/*public static java.lang.Object clone(java.io.Serializable p0){
	return org.apache.commons.lang.SerializationUtils.clone(p0);
}*/
}
