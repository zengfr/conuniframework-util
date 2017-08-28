package com.github.zengfr.supercommons;
import org.apache.commons.io.IOUtils;
import com.facebook.util.Convert;
import com.facebook.util.serialization.SerDeUtils;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class ByteBufferUtil{ 
public static int read(java.nio.channels.ReadableByteChannel p0,java.nio.ByteBuffer p1) throws java.io.IOException{
return IOUtils.read(p0,p1);
}
public static void readFully(java.nio.channels.ReadableByteChannel p0,java.nio.ByteBuffer p1) throws java.io.IOException{
 IOUtils.readFully(p0,p1);
}
public static byte[] toBytes(java.nio.ByteBuffer p0){
return Convert.toBytes(p0);
}
public static java.nio.ByteBuffer toByteBuffer(java.lang.String p0){
return Convert.toByteBuffer(p0);
}
public static java.nio.ByteBuffer toByteBuffer(byte[] p0){
return Convert.toByteBuffer(p0);
}
public static <T> java.nio.ByteBuffer serializeToByteBuffer(T p0,com.facebook.util.serialization.Serializer<T> p1) throws com.facebook.util.serialization.SerDeException{
return SerDeUtils.serializeToByteBuffer(p0,p1);
}
public static <T> T deserializeFromByteBuffer(java.nio.ByteBuffer p0,com.facebook.util.serialization.Deserializer<T> p1) throws com.facebook.util.serialization.SerDeException{
return SerDeUtils.deserializeFromByteBuffer(p0,p1);
}
}
