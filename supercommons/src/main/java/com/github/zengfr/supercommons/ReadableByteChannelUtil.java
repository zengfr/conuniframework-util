package com.zengfr.supercommons;
import com.google.common.io.ByteStreams;
import org.apache.commons.io.IOUtils;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class ReadableByteChannelUtil{ 
public static long copy(java.nio.channels.ReadableByteChannel p0,java.nio.channels.WritableByteChannel p1) throws java.io.IOException{
return ByteStreams.copy(p0,p1);
}
public static int read(java.nio.channels.ReadableByteChannel p0,java.nio.ByteBuffer p1) throws java.io.IOException{
return IOUtils.read(p0,p1);
}
public static long skip(java.nio.channels.ReadableByteChannel p0,long p1) throws java.io.IOException{
return IOUtils.skip(p0,p1);
}
public static void readFully(java.nio.channels.ReadableByteChannel p0,java.nio.ByteBuffer p1) throws java.io.IOException{
 IOUtils.readFully(p0,p1);
}
public static void skipFully(java.nio.channels.ReadableByteChannel p0,long p1) throws java.io.IOException{
 IOUtils.skipFully(p0,p1);
}
}
