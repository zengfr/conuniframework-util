package com.zengfr.supercommons;
import com.google.common.io.Files;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class MappedByteBufferUtil{ 
public static java.nio.MappedByteBuffer map(java.io.File p0) throws java.io.IOException{
return Files.map(p0);
}
public static java.nio.MappedByteBuffer map(java.io.File p0,java.nio.channels.FileChannel.MapMode p1,long p2) throws java.io.FileNotFoundException,java.io.IOException{
return Files.map(p0,p1,p2);
}
public static java.nio.MappedByteBuffer map(java.io.File p0,java.nio.channels.FileChannel.MapMode p1) throws java.io.IOException{
return Files.map(p0,p1);
}
}
