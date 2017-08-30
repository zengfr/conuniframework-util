package com.github.zengfr.supercommons;
import java.util.*;
import java.util.Map.Entry;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class ByteBufferUtil{ 
/**
*public static <T> T com.facebook.util.serialization.SerDeUtils.deserializeFromByteBuffer(java.nio.ByteBuffer,com.facebook.util.serialization.Deserializer<T>) throws com.facebook.util.serialization.SerDeException
*/ 
public static <T> T deserializeFromByteBuffer(java.nio.ByteBuffer p0,com.facebook.util.serialization.Deserializer<T> p1) throws com.facebook.util.serialization.SerDeException{
	return com.facebook.util.serialization.SerDeUtils.deserializeFromByteBuffer(p0,p1);
}
/**
*public static int org.apache.commons.io.IOUtils.read(java.nio.channels.ReadableByteChannel,java.nio.ByteBuffer) throws java.io.IOException
*/ 
public static int read(java.nio.channels.ReadableByteChannel p0,java.nio.ByteBuffer p1) throws java.io.IOException{
	return org.apache.commons.io.IOUtils.read(p0,p1);
}
/**
*public static void org.apache.commons.io.IOUtils.readFully(java.nio.channels.ReadableByteChannel,java.nio.ByteBuffer) throws java.io.IOException
*/ 
public static void readFully(java.nio.channels.ReadableByteChannel p0,java.nio.ByteBuffer p1) throws java.io.IOException{
	 org.apache.commons.io.IOUtils.readFully(p0,p1);
}
/**
*public static <T> java.nio.ByteBuffer com.facebook.util.serialization.SerDeUtils.serializeToByteBuffer(T,com.facebook.util.serialization.Serializer<T>) throws com.facebook.util.serialization.SerDeException
*/ 
public static <T> java.nio.ByteBuffer serializeToByteBuffer(T p0,com.facebook.util.serialization.Serializer<T> p1) throws com.facebook.util.serialization.SerDeException{
	return com.facebook.util.serialization.SerDeUtils.serializeToByteBuffer(p0,p1);
}
/**
*public static java.nio.ByteBuffer com.facebook.util.Convert.toByteBuffer(byte[])
*/ 
public static java.nio.ByteBuffer toByteBuffer(byte... p0){
	return com.facebook.util.Convert.toByteBuffer(p0);
}
/**
*public static java.nio.ByteBuffer com.facebook.util.Convert.toByteBuffer(java.lang.String)
*/ 
public static java.nio.ByteBuffer toByteBuffer(java.lang.String p0){
	return com.facebook.util.Convert.toByteBuffer(p0);
}
/**
*public static byte[] com.facebook.util.Convert.toBytes(java.nio.ByteBuffer)
*/ 
public static byte[] toBytes(java.nio.ByteBuffer p0){
	return com.facebook.util.Convert.toBytes(p0);
}
}
