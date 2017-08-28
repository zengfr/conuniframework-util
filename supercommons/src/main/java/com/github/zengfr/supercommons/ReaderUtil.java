package com.github.zengfr.supercommons;
import com.google.common.io.CharStreams;
import com.google.common.io.Closeables;
import org.apache.commons.io.IOUtils;
import org.apache.commons.io.CopyUtils;
import org.apache.commons.collections.primitives.adapters.io.CharIteratorReader;
import org.apache.commons.collections.primitives.adapters.io.ReaderCharIterator;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class ReaderUtil{ 
public static void skipFully(java.io.Reader p0,long p1) throws java.io.IOException{
 CharStreams.skipFully(p0,p1);
}
public static void closeQuietly(java.io.Reader p0){
 Closeables.closeQuietly(p0);
}
public static boolean contentEquals(java.io.Reader p0,java.io.Reader p1) throws java.io.IOException{
return IOUtils.contentEquals(p0,p1);
}
public static char[] toCharArray(java.io.Reader p0) throws java.io.IOException{
return IOUtils.toCharArray(p0);
}
public static int read(java.io.Reader p0,char[] p1,int p2,int p3) throws java.io.IOException{
return IOUtils.read(p0,p1,p2,p3);
}
public static int read(java.io.Reader p0,char[] p1) throws java.io.IOException{
return IOUtils.read(p0,p1);
}
public static int copy(java.io.Reader p0,java.io.Writer p1) throws java.io.IOException{
return IOUtils.copy(p0,p1);
}
public static void copy(java.io.Reader p0,java.io.OutputStream p1) throws java.io.IOException{
 IOUtils.copy(p0,p1);
}
public static void copy(java.io.Reader p0,java.io.OutputStream p1,java.nio.charset.Charset p2) throws java.io.IOException{
 IOUtils.copy(p0,p1,p2);
}
public static void copy(java.io.Reader p0,java.io.OutputStream p1,java.lang.String p2) throws java.io.IOException{
 IOUtils.copy(p0,p1,p2);
}
public static long skip(java.io.Reader p0,long p1) throws java.io.IOException{
return IOUtils.skip(p0,p1);
}
public static void readFully(java.io.Reader p0,char[] p1) throws java.io.IOException{
 IOUtils.readFully(p0,p1);
}
public static void readFully(java.io.Reader p0,char[] p1,int p2,int p3) throws java.io.IOException{
 IOUtils.readFully(p0,p1,p2,p3);
}
public static byte[] toByteArray(java.io.Reader p0,java.lang.String p1) throws java.io.IOException{
return IOUtils.toByteArray(p0,p1);
}
public static byte[] toByteArray(java.io.Reader p0,java.nio.charset.Charset p1) throws java.io.IOException{
return IOUtils.toByteArray(p0,p1);
}
public static byte[] toByteArray(java.io.Reader p0) throws java.io.IOException{
return IOUtils.toByteArray(p0);
}
public static java.io.BufferedReader buffer(java.io.Reader p0){
return IOUtils.buffer(p0);
}
public static java.io.BufferedReader buffer(java.io.Reader p0,int p1){
return IOUtils.buffer(p0,p1);
}
public static java.util.List<java.lang.String> readLines(java.io.Reader p0) throws java.io.IOException{
return IOUtils.readLines(p0);
}
public static boolean contentEqualsIgnoreEOL(java.io.Reader p0,java.io.Reader p1) throws java.io.IOException{
return IOUtils.contentEqualsIgnoreEOL(p0,p1);
}
public static java.io.BufferedReader toBufferedReader(java.io.Reader p0,int p1){
return IOUtils.toBufferedReader(p0,p1);
}
public static java.io.BufferedReader toBufferedReader(java.io.Reader p0){
return IOUtils.toBufferedReader(p0);
}
public static org.apache.commons.io.LineIterator lineIterator(java.io.Reader p0){
return IOUtils.lineIterator(p0);
}
public static long copyLarge(java.io.Reader p0,java.io.Writer p1,long p2,long p3,char[] p4) throws java.io.IOException{
return IOUtils.copyLarge(p0,p1,p2,p3,p4);
}
public static long copyLarge(java.io.Reader p0,java.io.Writer p1,long p2,long p3) throws java.io.IOException{
return IOUtils.copyLarge(p0,p1,p2,p3);
}
public static long copyLarge(java.io.Reader p0,java.io.Writer p1,char[] p2) throws java.io.IOException{
return IOUtils.copyLarge(p0,p1,p2);
}
public static long copyLarge(java.io.Reader p0,java.io.Writer p1) throws java.io.IOException{
return IOUtils.copyLarge(p0,p1);
}
public static java.io.Reader adapt(org.apache.commons.collections.primitives.CharIterator p0){
return CharIteratorReader.adapt(p0);
}
public static org.apache.commons.collections.primitives.CharIterator adapt(java.io.Reader p0){
return ReaderCharIterator.adapt(p0);
}
}
