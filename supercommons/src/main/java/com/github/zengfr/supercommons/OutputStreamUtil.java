package com.github.zengfr.supercommons;
import com.google.common.hash.Funnels;
import com.google.common.io.ByteStreams;
import com.google.common.io.Files;
import com.google.common.io.Resources;
import org.apache.commons.io.IOUtils;
import org.apache.commons.io.CopyUtils;
import org.apache.commons.io.EndianUtils;
import org.apache.commons.io.HexDump;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.SerializationUtils;
import it.unimi.dsi.fastutil.io.BinIO;
import org.apache.commons.lang.SerializationUtils;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class OutputStreamUtil{ 
public static java.io.OutputStream asOutputStream(com.google.common.hash.PrimitiveSink p0){
return Funnels.asOutputStream(p0);
}
public static long copy(java.io.InputStream p0,java.io.OutputStream p1) throws java.io.IOException{
return ByteStreams.copy(p0,p1);
}
public static java.io.OutputStream nullOutputStream(){
return ByteStreams.nullOutputStream();
}
public static void copy(java.io.File p0,java.io.OutputStream p1) throws java.io.IOException{
 Files.copy(p0,p1);
}
public static void copy(java.net.URL p0,java.io.OutputStream p1) throws java.io.IOException{
 Resources.copy(p0,p1);
}
public static void write(java.lang.String p0,java.io.OutputStream p1,java.lang.String p2) throws java.io.IOException{
 IOUtils.write(p0,p1,p2);
}
public static void write(java.lang.String p0,java.io.OutputStream p1,java.nio.charset.Charset p2) throws java.io.IOException{
 IOUtils.write(p0,p1,p2);
}
public static void write(java.lang.String p0,java.io.OutputStream p1) throws java.io.IOException{
 IOUtils.write(p0,p1);
}
public static void write(java.lang.StringBuffer p0,java.io.OutputStream p1) throws java.io.IOException{
 IOUtils.write(p0,p1);
}
public static void write(java.lang.StringBuffer p0,java.io.OutputStream p1,java.lang.String p2) throws java.io.IOException{
 IOUtils.write(p0,p1,p2);
}
public static void write(char[] p0,java.io.OutputStream p1) throws java.io.IOException{
 IOUtils.write(p0,p1);
}
public static void write(char[] p0,java.io.OutputStream p1,java.nio.charset.Charset p2) throws java.io.IOException{
 IOUtils.write(p0,p1,p2);
}
public static void write(char[] p0,java.io.OutputStream p1,java.lang.String p2) throws java.io.IOException{
 IOUtils.write(p0,p1,p2);
}
public static void write(java.lang.CharSequence p0,java.io.OutputStream p1,java.lang.String p2) throws java.io.IOException{
 IOUtils.write(p0,p1,p2);
}
public static void write(byte[] p0,java.io.OutputStream p1) throws java.io.IOException{
 IOUtils.write(p0,p1);
}
public static void write(java.lang.CharSequence p0,java.io.OutputStream p1,java.nio.charset.Charset p2) throws java.io.IOException{
 IOUtils.write(p0,p1,p2);
}
public static void write(java.lang.CharSequence p0,java.io.OutputStream p1) throws java.io.IOException{
 IOUtils.write(p0,p1);
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
public static long copy(java.io.InputStream p0,java.io.OutputStream p1,int p2) throws java.io.IOException{
return IOUtils.copy(p0,p1,p2);
}
public static java.io.BufferedOutputStream buffer(java.io.OutputStream p0,int p1){
return IOUtils.buffer(p0,p1);
}
public static java.io.BufferedOutputStream buffer(java.io.OutputStream p0){
return IOUtils.buffer(p0);
}
public static void writeLines(java.util.Collection<?> p0,java.lang.String p1,java.io.OutputStream p2) throws java.io.IOException{
 IOUtils.writeLines(p0,p1,p2);
}
public static void writeLines(java.util.Collection<?> p0,java.lang.String p1,java.io.OutputStream p2,java.nio.charset.Charset p3) throws java.io.IOException{
 IOUtils.writeLines(p0,p1,p2,p3);
}
public static void writeLines(java.util.Collection<?> p0,java.lang.String p1,java.io.OutputStream p2,java.lang.String p3) throws java.io.IOException{
 IOUtils.writeLines(p0,p1,p2,p3);
}
public static void closeQuietly(java.io.OutputStream p0){
 IOUtils.closeQuietly(p0);
}
public static void writeChunked(byte[] p0,java.io.OutputStream p1) throws java.io.IOException{
 IOUtils.writeChunked(p0,p1);
}
public static long copyLarge(java.io.InputStream p0,java.io.OutputStream p1,byte[] p2) throws java.io.IOException{
return IOUtils.copyLarge(p0,p1,p2);
}
public static long copyLarge(java.io.InputStream p0,java.io.OutputStream p1) throws java.io.IOException{
return IOUtils.copyLarge(p0,p1);
}
public static long copyLarge(java.io.InputStream p0,java.io.OutputStream p1,long p2,long p3) throws java.io.IOException{
return IOUtils.copyLarge(p0,p1,p2,p3);
}
public static long copyLarge(java.io.InputStream p0,java.io.OutputStream p1,long p2,long p3,byte[] p4) throws java.io.IOException{
return IOUtils.copyLarge(p0,p1,p2,p3,p4);
}
public static void copy(java.lang.String p0,java.io.OutputStream p1) throws java.io.IOException{
 CopyUtils.copy(p0,p1);
}
public static void copy(java.lang.String p0,java.io.OutputStream p1,java.lang.String p2) throws java.io.IOException{
 CopyUtils.copy(p0,p1,p2);
}
public static void copy(byte[] p0,java.io.OutputStream p1) throws java.io.IOException{
 CopyUtils.copy(p0,p1);
}
public static void writeSwappedLong(java.io.OutputStream p0,long p1) throws java.io.IOException{
 EndianUtils.writeSwappedLong(p0,p1);
}
public static void writeSwappedShort(java.io.OutputStream p0,short p1) throws java.io.IOException{
 EndianUtils.writeSwappedShort(p0,p1);
}
public static void writeSwappedFloat(java.io.OutputStream p0,float p1) throws java.io.IOException{
 EndianUtils.writeSwappedFloat(p0,p1);
}
public static void writeSwappedInteger(java.io.OutputStream p0,int p1) throws java.io.IOException{
 EndianUtils.writeSwappedInteger(p0,p1);
}
public static void writeSwappedDouble(java.io.OutputStream p0,double p1) throws java.io.IOException{
 EndianUtils.writeSwappedDouble(p0,p1);
}
public static void dump(byte[] p0,long p1,java.io.OutputStream p2,int p3) throws java.io.IOException,java.lang.ArrayIndexOutOfBoundsException,java.lang.IllegalArgumentException{
 HexDump.dump(p0,p1,p2,p3);
}
public static long copyFile(java.io.File p0,java.io.OutputStream p1) throws java.io.IOException{
return FileUtils.copyFile(p0,p1);
}
public static void serialize(java.io.Serializable p0,java.io.OutputStream p1){
 SerializationUtils.serialize(p0,p1);
}
public static void storeObject(java.lang.Object p0,java.io.OutputStream p1) throws java.io.IOException{
 BinIO.storeObject(p0,p1);
}
public static void storeBytes(byte[][] p0,java.io.OutputStream p1) throws java.io.IOException{
 BinIO.storeBytes(p0,p1);
}
public static void storeBytes(byte[] p0,int p1,int p2,java.io.OutputStream p3) throws java.io.IOException{
 BinIO.storeBytes(p0,p1,p2,p3);
}
public static void storeBytes(byte[][] p0,long p1,long p2,java.io.OutputStream p3) throws java.io.IOException{
 BinIO.storeBytes(p0,p1,p2,p3);
}
public static void storeBytes(byte[] p0,java.io.OutputStream p1) throws java.io.IOException{
 BinIO.storeBytes(p0,p1);
}
}
