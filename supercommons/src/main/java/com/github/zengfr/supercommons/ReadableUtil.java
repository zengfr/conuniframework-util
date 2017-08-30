package com.github.zengfr.supercommons;
import java.util.*;
import java.util.Map.Entry;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class ReadableUtil{ 
/**
*public static long com.google.common.io.CharStreams.copy(java.lang.Readable,java.lang.Appendable) throws java.io.IOException
*/ 
public static long copy(java.lang.Readable p0,java.lang.Appendable p1) throws java.io.IOException{
	return com.google.common.io.CharStreams.copy(p0,p1);
}
/**
*public static <T> T com.google.common.io.CharStreams.readLines(java.lang.Readable,com.google.common.io.LineProcessor<T>) throws java.io.IOException
*/ 
public static <T> T readLines(java.lang.Readable p0,com.google.common.io.LineProcessor<T> p1) throws java.io.IOException{
	return com.google.common.io.CharStreams.readLines(p0,p1);
}
/**
*public static java.util.List<java.lang.String> com.google.common.io.CharStreams.readLines(java.lang.Readable) throws java.io.IOException
*/ 
public static java.util.List<java.lang.String> readLines(java.lang.Readable p0) throws java.io.IOException{
	return com.google.common.io.CharStreams.readLines(p0);
}
}
