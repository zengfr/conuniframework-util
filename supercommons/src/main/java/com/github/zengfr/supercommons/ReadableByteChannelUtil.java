package com.github.zengfr.supercommons;
import java.util.*;
import java.util.Map.Entry;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class ReadableByteChannelUtil{ 
/**
*public static long com.google.common.io.ByteStreams.copy(java.nio.channels.ReadableByteChannel,java.nio.channels.WritableByteChannel) throws java.io.IOException
*/ 
public static long copy(java.nio.channels.ReadableByteChannel p0,java.nio.channels.WritableByteChannel p1) throws java.io.IOException{
	return com.google.common.io.ByteStreams.copy(p0,p1);
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
*public static long org.apache.commons.io.IOUtils.skip(java.nio.channels.ReadableByteChannel,long) throws java.io.IOException
*/ 
public static long skip(java.nio.channels.ReadableByteChannel p0,long p1) throws java.io.IOException{
	return org.apache.commons.io.IOUtils.skip(p0,p1);
}
/**
*public static void org.apache.commons.io.IOUtils.skipFully(java.nio.channels.ReadableByteChannel,long) throws java.io.IOException
*/ 
public static void skipFully(java.nio.channels.ReadableByteChannel p0,long p1) throws java.io.IOException{
	 org.apache.commons.io.IOUtils.skipFully(p0,p1);
}
}
