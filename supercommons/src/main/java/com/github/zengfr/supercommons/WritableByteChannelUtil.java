package com.github.zengfr.supercommons;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class WritableByteChannelUtil{ 
/**
*public static long com.google.common.io.ByteStreams.copy(java.nio.channels.ReadableByteChannel,java.nio.channels.WritableByteChannel) throws java.io.IOException
*/ 
public static long copy(java.nio.channels.ReadableByteChannel p0,java.nio.channels.WritableByteChannel p1) throws java.io.IOException{
	return com.google.common.io.ByteStreams.copy(p0,p1);
}
}
