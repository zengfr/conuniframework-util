package com.github.zengfr.supercommons;
import java.util.*;
import java.util.Map.Entry;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class WriterUtil{ 
/**
*public static java.io.Writer com.google.common.io.CharStreams.asWriter(java.lang.Appendable)
*/ 
public static java.io.Writer asWriter(java.lang.Appendable p0){
	return com.google.common.io.CharStreams.asWriter(p0);
}
/**
*public static java.io.BufferedWriter org.apache.commons.io.IOUtils.buffer(java.io.Writer)
*/ 
public static java.io.BufferedWriter buffer(java.io.Writer p0){
	return org.apache.commons.io.IOUtils.buffer(p0);
}
/**
*public static java.io.BufferedWriter org.apache.commons.io.IOUtils.buffer(java.io.Writer,int)
*/ 
public static java.io.BufferedWriter buffer(java.io.Writer p0,int p1){
	return org.apache.commons.io.IOUtils.buffer(p0,p1);
}
/**
*public static void org.apache.commons.io.IOUtils.closeQuietly(java.io.Writer)
*/ 
public static void closeQuietly(java.io.Writer p0){
	 org.apache.commons.io.IOUtils.closeQuietly(p0);
}
/**
*public static void org.apache.commons.io.IOUtils.copy(java.io.InputStream,java.io.Writer,java.nio.charset.Charset) throws java.io.IOException
*/ 
public static void copy(java.io.InputStream p0,java.io.Writer p1,java.nio.charset.Charset p2) throws java.io.IOException{
	 org.apache.commons.io.IOUtils.copy(p0,p1,p2);
}
/**
*public static void org.apache.commons.io.IOUtils.copy(java.io.InputStream,java.io.Writer) throws java.io.IOException
*/ 
public static void copy(java.io.InputStream p0,java.io.Writer p1) throws java.io.IOException{
	 org.apache.commons.io.IOUtils.copy(p0,p1);
}
/**
*public static int org.apache.commons.io.IOUtils.copy(java.io.Reader,java.io.Writer) throws java.io.IOException
*/ 
public static int copy(java.io.Reader p0,java.io.Writer p1) throws java.io.IOException{
	return org.apache.commons.io.IOUtils.copy(p0,p1);
}
/**
*public static void org.apache.commons.io.IOUtils.copy(java.io.InputStream,java.io.Writer,java.lang.String) throws java.io.IOException
*/ 
public static void copy(java.io.InputStream p0,java.io.Writer p1,java.lang.String p2) throws java.io.IOException{
	 org.apache.commons.io.IOUtils.copy(p0,p1,p2);
}
/**
*public static void org.apache.commons.io.CopyUtils.copy(java.lang.String,java.io.Writer) throws java.io.IOException
*/ 
public static void copy(java.lang.String p0,java.io.Writer p1) throws java.io.IOException{
	 org.apache.commons.io.CopyUtils.copy(p0,p1);
}
/**
*public static void org.apache.commons.io.CopyUtils.copy(byte[],java.io.Writer) throws java.io.IOException
*/ 
public static void copy(byte[] p0,java.io.Writer p1) throws java.io.IOException{
	 org.apache.commons.io.CopyUtils.copy(p0,p1);
}
/**
*public static void org.apache.commons.io.CopyUtils.copy(byte[],java.io.Writer,java.lang.String) throws java.io.IOException
*/ 
public static void copy(byte[] p0,java.io.Writer p1,java.lang.String p2) throws java.io.IOException{
	 org.apache.commons.io.CopyUtils.copy(p0,p1,p2);
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
*public static void org.apache.commons.lang.StringEscapeUtils.escapeCsv(java.io.Writer,java.lang.String) throws java.io.IOException
*/ 
public static void escapeCsv(java.io.Writer p0,java.lang.String p1) throws java.io.IOException{
	 org.apache.commons.lang.StringEscapeUtils.escapeCsv(p0,p1);
}
/**
*public static void org.apache.commons.lang.StringEscapeUtils.escapeHtml(java.io.Writer,java.lang.String) throws java.io.IOException
*/ 
public static void escapeHtml(java.io.Writer p0,java.lang.String p1) throws java.io.IOException{
	 org.apache.commons.lang.StringEscapeUtils.escapeHtml(p0,p1);
}
/**
*public static void org.apache.commons.lang.StringEscapeUtils.escapeJava(java.io.Writer,java.lang.String) throws java.io.IOException
*/ 
public static void escapeJava(java.io.Writer p0,java.lang.String p1) throws java.io.IOException{
	 org.apache.commons.lang.StringEscapeUtils.escapeJava(p0,p1);
}
/**
*public static void org.apache.commons.lang.StringEscapeUtils.escapeJavaScript(java.io.Writer,java.lang.String) throws java.io.IOException
*/ 
public static void escapeJavaScript(java.io.Writer p0,java.lang.String p1) throws java.io.IOException{
	 org.apache.commons.lang.StringEscapeUtils.escapeJavaScript(p0,p1);
}
/**
*public static void org.apache.commons.lang.StringEscapeUtils.escapeXml(java.io.Writer,java.lang.String) throws java.io.IOException
*/ 
public static void escapeXml(java.io.Writer p0,java.lang.String p1) throws java.io.IOException{
	 org.apache.commons.lang.StringEscapeUtils.escapeXml(p0,p1);
}
/**
*public static java.io.Writer com.google.common.io.CharStreams.nullWriter()
*/ 
public static java.io.Writer nullWriter(){
	return com.google.common.io.CharStreams.nullWriter();
}
/**
*public static void org.apache.commons.lang.StringEscapeUtils.unescapeCsv(java.io.Writer,java.lang.String) throws java.io.IOException
*/ 
public static void unescapeCsv(java.io.Writer p0,java.lang.String p1) throws java.io.IOException{
	 org.apache.commons.lang.StringEscapeUtils.unescapeCsv(p0,p1);
}
/**
*public static void org.apache.commons.lang.StringEscapeUtils.unescapeHtml(java.io.Writer,java.lang.String) throws java.io.IOException
*/ 
public static void unescapeHtml(java.io.Writer p0,java.lang.String p1) throws java.io.IOException{
	 org.apache.commons.lang.StringEscapeUtils.unescapeHtml(p0,p1);
}
/**
*public static void org.apache.commons.lang.StringEscapeUtils.unescapeJava(java.io.Writer,java.lang.String) throws java.io.IOException
*/ 
public static void unescapeJava(java.io.Writer p0,java.lang.String p1) throws java.io.IOException{
	 org.apache.commons.lang.StringEscapeUtils.unescapeJava(p0,p1);
}
/**
*public static void org.apache.commons.lang.StringEscapeUtils.unescapeJavaScript(java.io.Writer,java.lang.String) throws java.io.IOException
*/ 
public static void unescapeJavaScript(java.io.Writer p0,java.lang.String p1) throws java.io.IOException{
	 org.apache.commons.lang.StringEscapeUtils.unescapeJavaScript(p0,p1);
}
/**
*public static void org.apache.commons.lang.StringEscapeUtils.unescapeXml(java.io.Writer,java.lang.String) throws java.io.IOException
*/ 
public static void unescapeXml(java.io.Writer p0,java.lang.String p1) throws java.io.IOException{
	 org.apache.commons.lang.StringEscapeUtils.unescapeXml(p0,p1);
}
/**
*public static void org.apache.commons.io.IOUtils.write(java.lang.StringBuffer,java.io.Writer) throws java.io.IOException
*/ 
public static void write(java.lang.StringBuffer p0,java.io.Writer p1) throws java.io.IOException{
	 org.apache.commons.io.IOUtils.write(p0,p1);
}
/**
*public static void org.apache.commons.io.IOUtils.write(byte[],java.io.Writer) throws java.io.IOException
*/ 
public static void write(byte[] p0,java.io.Writer p1) throws java.io.IOException{
	 org.apache.commons.io.IOUtils.write(p0,p1);
}
/**
*public static void org.apache.commons.io.IOUtils.write(byte[],java.io.Writer,java.lang.String) throws java.io.IOException
*/ 
public static void write(byte[] p0,java.io.Writer p1,java.lang.String p2) throws java.io.IOException{
	 org.apache.commons.io.IOUtils.write(p0,p1,p2);
}
/**
*public static void org.apache.commons.io.IOUtils.write(char[],java.io.Writer) throws java.io.IOException
*/ 
public static void write(char[] p0,java.io.Writer p1) throws java.io.IOException{
	 org.apache.commons.io.IOUtils.write(p0,p1);
}
/**
*public static void org.apache.commons.io.IOUtils.write(java.lang.CharSequence,java.io.Writer) throws java.io.IOException
*/ 
public static void write(java.lang.CharSequence p0,java.io.Writer p1) throws java.io.IOException{
	 org.apache.commons.io.IOUtils.write(p0,p1);
}
/**
*public static void org.apache.commons.io.IOUtils.write(java.lang.String,java.io.Writer) throws java.io.IOException
*/ 
public static void write(java.lang.String p0,java.io.Writer p1) throws java.io.IOException{
	 org.apache.commons.io.IOUtils.write(p0,p1);
}
/**
*public static void org.apache.commons.io.IOUtils.write(byte[],java.io.Writer,java.nio.charset.Charset) throws java.io.IOException
*/ 
public static void write(byte[] p0,java.io.Writer p1,java.nio.charset.Charset p2) throws java.io.IOException{
	 org.apache.commons.io.IOUtils.write(p0,p1,p2);
}
/**
*public static void org.apache.commons.io.IOUtils.writeChunked(char[],java.io.Writer) throws java.io.IOException
*/ 
public static void writeChunked(char[] p0,java.io.Writer p1) throws java.io.IOException{
	 org.apache.commons.io.IOUtils.writeChunked(p0,p1);
}
/**
*public static void org.apache.commons.io.IOUtils.writeLines(java.util.Collection<?>,java.lang.String,java.io.Writer) throws java.io.IOException
*/ 
public static void writeLines(java.util.Collection<?> p0,java.lang.String p1,java.io.Writer p2) throws java.io.IOException{
	 org.apache.commons.io.IOUtils.writeLines(p0,p1,p2);
}
}
