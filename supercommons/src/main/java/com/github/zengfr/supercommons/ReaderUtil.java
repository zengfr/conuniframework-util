package com.github.zengfr.supercommons;
import java.util.*;
import java.util.Map.Entry;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class ReaderUtil{ 
/**
*public static java.io.Reader org.apache.commons.collections.primitives.adapters.io.CharIteratorReader.adapt(org.apache.commons.collections.primitives.CharIterator)
*/ 
public static java.io.Reader adapt(org.apache.commons.collections.primitives.CharIterator p0){
	return org.apache.commons.collections.primitives.adapters.io.CharIteratorReader.adapt(p0);
}
/**
*public static org.apache.commons.collections.primitives.CharIterator org.apache.commons.collections.primitives.adapters.io.ReaderCharIterator.adapt(java.io.Reader)
*/ 
public static org.apache.commons.collections.primitives.CharIterator adapt(java.io.Reader p0){
	return org.apache.commons.collections.primitives.adapters.io.ReaderCharIterator.adapt(p0);
}
/**
*public static java.io.BufferedReader org.apache.commons.io.IOUtils.buffer(java.io.Reader)
*/ 
public static java.io.BufferedReader buffer(java.io.Reader p0){
	return org.apache.commons.io.IOUtils.buffer(p0);
}
/**
*public static java.io.BufferedReader org.apache.commons.io.IOUtils.buffer(java.io.Reader,int)
*/ 
public static java.io.BufferedReader buffer(java.io.Reader p0,int p1){
	return org.apache.commons.io.IOUtils.buffer(p0,p1);
}
/**
*public static void com.google.common.io.Closeables.closeQuietly(java.io.Reader)
*/ 
public static void closeQuietly(java.io.Reader p0){
	 com.google.common.io.Closeables.closeQuietly(p0);
}
/**
*public static boolean org.apache.commons.io.IOUtils.contentEquals(java.io.Reader,java.io.Reader) throws java.io.IOException
*/ 
public static boolean contentEquals(java.io.Reader p0,java.io.Reader p1) throws java.io.IOException{
	return org.apache.commons.io.IOUtils.contentEquals(p0,p1);
}
/**
*public static boolean org.apache.commons.io.IOUtils.contentEqualsIgnoreEOL(java.io.Reader,java.io.Reader) throws java.io.IOException
*/ 
public static boolean contentEqualsIgnoreEOL(java.io.Reader p0,java.io.Reader p1) throws java.io.IOException{
	return org.apache.commons.io.IOUtils.contentEqualsIgnoreEOL(p0,p1);
}
/**
*public static void org.apache.commons.io.IOUtils.copy(java.io.Reader,java.io.OutputStream,java.lang.String) throws java.io.IOException
*/ 
public static void copy(java.io.Reader p0,java.io.OutputStream p1,java.lang.String p2) throws java.io.IOException{
	 org.apache.commons.io.IOUtils.copy(p0,p1,p2);
}
/**
*public static void org.apache.commons.io.IOUtils.copy(java.io.Reader,java.io.OutputStream) throws java.io.IOException
*/ 
public static void copy(java.io.Reader p0,java.io.OutputStream p1) throws java.io.IOException{
	 org.apache.commons.io.IOUtils.copy(p0,p1);
}
/**
*public static int org.apache.commons.io.IOUtils.copy(java.io.Reader,java.io.Writer) throws java.io.IOException
*/ 
public static int copy(java.io.Reader p0,java.io.Writer p1) throws java.io.IOException{
	return org.apache.commons.io.IOUtils.copy(p0,p1);
}
/**
*public static void org.apache.commons.io.IOUtils.copy(java.io.Reader,java.io.OutputStream,java.nio.charset.Charset) throws java.io.IOException
*/ 
public static void copy(java.io.Reader p0,java.io.OutputStream p1,java.nio.charset.Charset p2) throws java.io.IOException{
	 org.apache.commons.io.IOUtils.copy(p0,p1,p2);
}
/**
*public static long org.apache.commons.io.IOUtils.copyLarge(java.io.Reader,java.io.Writer,long,long,char[]) throws java.io.IOException
*/ 
public static long copyLarge(java.io.Reader p0,java.io.Writer p1,long p2,long p3,char... p4) throws java.io.IOException{
	return org.apache.commons.io.IOUtils.copyLarge(p0,p1,p2,p3,p4);
}
/**
*public static long org.apache.commons.io.IOUtils.copyLarge(java.io.Reader,java.io.Writer,long,long) throws java.io.IOException
*/ 
public static long copyLarge(java.io.Reader p0,java.io.Writer p1,long p2,long p3) throws java.io.IOException{
	return org.apache.commons.io.IOUtils.copyLarge(p0,p1,p2,p3);
}
/**
*public static long org.apache.commons.io.IOUtils.copyLarge(java.io.Reader,java.io.Writer,char[]) throws java.io.IOException
*/ 
public static long copyLarge(java.io.Reader p0,java.io.Writer p1,char... p2) throws java.io.IOException{
	return org.apache.commons.io.IOUtils.copyLarge(p0,p1,p2);
}
/**
*public static long org.apache.commons.io.IOUtils.copyLarge(java.io.Reader,java.io.Writer) throws java.io.IOException
*/ 
public static long copyLarge(java.io.Reader p0,java.io.Writer p1) throws java.io.IOException{
	return org.apache.commons.io.IOUtils.copyLarge(p0,p1);
}
/**
*public static org.apache.commons.io.LineIterator org.apache.commons.io.IOUtils.lineIterator(java.io.Reader)
*/ 
public static org.apache.commons.io.LineIterator lineIterator(java.io.Reader p0){
	return org.apache.commons.io.IOUtils.lineIterator(p0);
}
/**
*public static int org.apache.commons.io.IOUtils.read(java.io.Reader,char[]) throws java.io.IOException
*/ 
public static int read(java.io.Reader p0,char... p1) throws java.io.IOException{
	return org.apache.commons.io.IOUtils.read(p0,p1);
}
/**
*public static int org.apache.commons.io.IOUtils.read(java.io.Reader,char[],int,int) throws java.io.IOException
*/ 
public static int read(java.io.Reader p0,char[] p1,int p2,int p3) throws java.io.IOException{
	return org.apache.commons.io.IOUtils.read(p0,p1,p2,p3);
}
/**
*public static void org.apache.commons.io.IOUtils.readFully(java.io.Reader,char[],int,int) throws java.io.IOException
*/ 
public static void readFully(java.io.Reader p0,char[] p1,int p2,int p3) throws java.io.IOException{
	 org.apache.commons.io.IOUtils.readFully(p0,p1,p2,p3);
}
/**
*public static void org.apache.commons.io.IOUtils.readFully(java.io.Reader,char[]) throws java.io.IOException
*/ 
public static void readFully(java.io.Reader p0,char... p1) throws java.io.IOException{
	 org.apache.commons.io.IOUtils.readFully(p0,p1);
}
/**
*public static java.util.List<java.lang.String> org.apache.commons.io.IOUtils.readLines(java.io.Reader) throws java.io.IOException
*/ 
public static java.util.List<java.lang.String> readLines(java.io.Reader p0) throws java.io.IOException{
	return org.apache.commons.io.IOUtils.readLines(p0);
}
/**
*public static long org.apache.commons.io.IOUtils.skip(java.io.Reader,long) throws java.io.IOException
*/ 
public static long skip(java.io.Reader p0,long p1) throws java.io.IOException{
	return org.apache.commons.io.IOUtils.skip(p0,p1);
}
/**
*public static void com.google.common.io.CharStreams.skipFully(java.io.Reader,long) throws java.io.IOException
*/ 
public static void skipFully(java.io.Reader p0,long p1) throws java.io.IOException{
	 com.google.common.io.CharStreams.skipFully(p0,p1);
}
/**
*public static java.io.BufferedReader org.apache.commons.io.IOUtils.toBufferedReader(java.io.Reader)
*/ 
public static java.io.BufferedReader toBufferedReader(java.io.Reader p0){
	return org.apache.commons.io.IOUtils.toBufferedReader(p0);
}
/**
*public static java.io.BufferedReader org.apache.commons.io.IOUtils.toBufferedReader(java.io.Reader,int)
*/ 
public static java.io.BufferedReader toBufferedReader(java.io.Reader p0,int p1){
	return org.apache.commons.io.IOUtils.toBufferedReader(p0,p1);
}
/**
*public static byte[] org.apache.commons.io.IOUtils.toByteArray(java.io.Reader,java.nio.charset.Charset) throws java.io.IOException
*/ 
public static byte[] toByteArray(java.io.Reader p0,java.nio.charset.Charset p1) throws java.io.IOException{
	return org.apache.commons.io.IOUtils.toByteArray(p0,p1);
}
/**
*public static byte[] org.apache.commons.io.IOUtils.toByteArray(java.io.Reader) throws java.io.IOException
*/ 
public static byte[] toByteArray(java.io.Reader p0) throws java.io.IOException{
	return org.apache.commons.io.IOUtils.toByteArray(p0);
}
/**
*public static byte[] org.apache.commons.io.IOUtils.toByteArray(java.io.Reader,java.lang.String) throws java.io.IOException
*/ 
public static byte[] toByteArray(java.io.Reader p0,java.lang.String p1) throws java.io.IOException{
	return org.apache.commons.io.IOUtils.toByteArray(p0,p1);
}
/**
*public static char[] org.apache.commons.io.IOUtils.toCharArray(java.io.Reader) throws java.io.IOException
*/ 
public static char[] toCharArray(java.io.Reader p0) throws java.io.IOException{
	return org.apache.commons.io.IOUtils.toCharArray(p0);
}
}
