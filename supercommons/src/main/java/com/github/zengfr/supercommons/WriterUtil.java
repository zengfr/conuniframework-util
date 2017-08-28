package com.github.zengfr.supercommons;
import com.google.common.io.CharStreams;
import org.apache.commons.io.IOUtils;
import org.apache.commons.io.CopyUtils;
import org.apache.commons.lang.StringEscapeUtils;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class WriterUtil{ 
public static java.io.Writer asWriter(java.lang.Appendable p0){
return CharStreams.asWriter(p0);
}
public static java.io.Writer nullWriter(){
return CharStreams.nullWriter();
}
public static void write(java.lang.StringBuffer p0,java.io.Writer p1) throws java.io.IOException{
 IOUtils.write(p0,p1);
}
public static void write(byte[] p0,java.io.Writer p1) throws java.io.IOException{
 IOUtils.write(p0,p1);
}
public static void write(byte[] p0,java.io.Writer p1,java.lang.String p2) throws java.io.IOException{
 IOUtils.write(p0,p1,p2);
}
public static void write(char[] p0,java.io.Writer p1) throws java.io.IOException{
 IOUtils.write(p0,p1);
}
public static void write(java.lang.CharSequence p0,java.io.Writer p1) throws java.io.IOException{
 IOUtils.write(p0,p1);
}
public static void write(java.lang.String p0,java.io.Writer p1) throws java.io.IOException{
 IOUtils.write(p0,p1);
}
public static void write(byte[] p0,java.io.Writer p1,java.nio.charset.Charset p2) throws java.io.IOException{
 IOUtils.write(p0,p1,p2);
}
public static void copy(java.io.InputStream p0,java.io.Writer p1) throws java.io.IOException{
 IOUtils.copy(p0,p1);
}
public static int copy(java.io.Reader p0,java.io.Writer p1) throws java.io.IOException{
return IOUtils.copy(p0,p1);
}
public static void copy(java.io.InputStream p0,java.io.Writer p1,java.lang.String p2) throws java.io.IOException{
 IOUtils.copy(p0,p1,p2);
}
public static void copy(java.io.InputStream p0,java.io.Writer p1,java.nio.charset.Charset p2) throws java.io.IOException{
 IOUtils.copy(p0,p1,p2);
}
public static java.io.BufferedWriter buffer(java.io.Writer p0,int p1){
return IOUtils.buffer(p0,p1);
}
public static java.io.BufferedWriter buffer(java.io.Writer p0){
return IOUtils.buffer(p0);
}
public static void writeLines(java.util.Collection<?> p0,java.lang.String p1,java.io.Writer p2) throws java.io.IOException{
 IOUtils.writeLines(p0,p1,p2);
}
public static void closeQuietly(java.io.Writer p0){
 IOUtils.closeQuietly(p0);
}
public static void writeChunked(char[] p0,java.io.Writer p1) throws java.io.IOException{
 IOUtils.writeChunked(p0,p1);
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
public static void copy(java.lang.String p0,java.io.Writer p1) throws java.io.IOException{
 CopyUtils.copy(p0,p1);
}
public static void copy(byte[] p0,java.io.Writer p1) throws java.io.IOException{
 CopyUtils.copy(p0,p1);
}
public static void copy(byte[] p0,java.io.Writer p1,java.lang.String p2) throws java.io.IOException{
 CopyUtils.copy(p0,p1,p2);
}
public static void unescapeHtml(java.io.Writer p0,java.lang.String p1) throws java.io.IOException{
 StringEscapeUtils.unescapeHtml(p0,p1);
}
public static void escapeHtml(java.io.Writer p0,java.lang.String p1) throws java.io.IOException{
 StringEscapeUtils.escapeHtml(p0,p1);
}
public static void escapeJavaScript(java.io.Writer p0,java.lang.String p1) throws java.io.IOException{
 StringEscapeUtils.escapeJavaScript(p0,p1);
}
public static void unescapeCsv(java.io.Writer p0,java.lang.String p1) throws java.io.IOException{
 StringEscapeUtils.unescapeCsv(p0,p1);
}
public static void escapeXml(java.io.Writer p0,java.lang.String p1) throws java.io.IOException{
 StringEscapeUtils.escapeXml(p0,p1);
}
public static void unescapeJava(java.io.Writer p0,java.lang.String p1) throws java.io.IOException{
 StringEscapeUtils.unescapeJava(p0,p1);
}
public static void escapeJava(java.io.Writer p0,java.lang.String p1) throws java.io.IOException{
 StringEscapeUtils.escapeJava(p0,p1);
}
public static void unescapeXml(java.io.Writer p0,java.lang.String p1) throws java.io.IOException{
 StringEscapeUtils.unescapeXml(p0,p1);
}
public static void escapeCsv(java.io.Writer p0,java.lang.String p1) throws java.io.IOException{
 StringEscapeUtils.escapeCsv(p0,p1);
}
public static void unescapeJavaScript(java.io.Writer p0,java.lang.String p1) throws java.io.IOException{
 StringEscapeUtils.unescapeJavaScript(p0,p1);
}
}
