package com.zengfr.supercommons;
import com.google.common.io.ByteStreams;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class WritableByteChannelUtil{ 
public static long copy(java.nio.channels.ReadableByteChannel p0,java.nio.channels.WritableByteChannel p1) throws java.io.IOException{
return ByteStreams.copy(p0,p1);
}
}
