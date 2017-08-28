package com.zengfr.supercommons;
import com.google.common.io.CharStreams;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class ReadableUtil{ 
public static long copy(java.lang.Readable p0,java.lang.Appendable p1) throws java.io.IOException{
return CharStreams.copy(p0,p1);
}
public static <T> T readLines(java.lang.Readable p0,com.google.common.io.LineProcessor<T> p1) throws java.io.IOException{
return CharStreams.readLines(p0,p1);
}
public static java.util.List<java.lang.String> readLines(java.lang.Readable p0) throws java.io.IOException{
return CharStreams.readLines(p0);
}
}
