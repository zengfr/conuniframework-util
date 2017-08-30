package com.github.zengfr.supercommons;
import java.util.*;
import java.util.Map.Entry;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class URLUtil{ 
/**
*public static com.google.common.io.ByteSource com.google.common.io.Resources.asByteSource(java.net.URL)
*/ 
public static com.google.common.io.ByteSource asByteSource(java.net.URL p0){
	return com.google.common.io.Resources.asByteSource(p0);
}
/**
*public static com.google.common.io.CharSource com.google.common.io.Resources.asCharSource(java.net.URL,java.nio.charset.Charset)
*/ 
public static com.google.common.io.CharSource asCharSource(java.net.URL p0,java.nio.charset.Charset p1){
	return com.google.common.io.Resources.asCharSource(p0,p1);
}
/**
*public static void com.google.common.io.Resources.copy(java.net.URL,java.io.OutputStream) throws java.io.IOException
*/ 
public static void copy(java.net.URL p0,java.io.OutputStream p1) throws java.io.IOException{
	 com.google.common.io.Resources.copy(p0,p1);
}
/**
*public static void org.apache.commons.io.FileUtils.copyURLToFile(java.net.URL,java.io.File,int,int) throws java.io.IOException
*/ 
public static void copyURLToFile(java.net.URL p0,java.io.File p1,int p2,int p3) throws java.io.IOException{
	 org.apache.commons.io.FileUtils.copyURLToFile(p0,p1,p2,p3);
}
/**
*public static void org.apache.commons.io.FileUtils.copyURLToFile(java.net.URL,java.io.File) throws java.io.IOException
*/ 
public static void copyURLToFile(java.net.URL p0,java.io.File p1) throws java.io.IOException{
	 org.apache.commons.io.FileUtils.copyURLToFile(p0,p1);
}
/**
*public static java.net.URL com.google.common.io.Resources.getResource(java.lang.String)
*/ 
public static java.net.URL getResource(java.lang.String p0){
	return com.google.common.io.Resources.getResource(p0);
}
/**
*public static java.net.URL com.google.common.io.Resources.getResource(java.lang.Class<?>,java.lang.String)
*/ 
public static java.net.URL getResource(java.lang.Class<?> p0,java.lang.String p1){
	return com.google.common.io.Resources.getResource(p0,p1);
}
/**
*public static <T> T com.google.common.io.Resources.readLines(java.net.URL,java.nio.charset.Charset,com.google.common.io.LineProcessor<T>) throws java.io.IOException
*/ 
public static <T> T readLines(java.net.URL p0,java.nio.charset.Charset p1,com.google.common.io.LineProcessor<T> p2) throws java.io.IOException{
	return com.google.common.io.Resources.readLines(p0,p1,p2);
}
/**
*public static java.util.List<java.lang.String> com.google.common.io.Resources.readLines(java.net.URL,java.nio.charset.Charset) throws java.io.IOException
*/ 
public static java.util.List<java.lang.String> readLines(java.net.URL p0,java.nio.charset.Charset p1) throws java.io.IOException{
	return com.google.common.io.Resources.readLines(p0,p1);
}
/**
*public static byte[] com.google.common.io.Resources.toByteArray(java.net.URL) throws java.io.IOException
*/ 
public static byte[] toByteArray(java.net.URL p0) throws java.io.IOException{
	return com.google.common.io.Resources.toByteArray(p0);
}
/**
*public static java.io.File org.apache.commons.io.FileUtils.toFile(java.net.URL)
*/ 
public static java.io.File toFile(java.net.URL p0){
	return org.apache.commons.io.FileUtils.toFile(p0);
}
}
