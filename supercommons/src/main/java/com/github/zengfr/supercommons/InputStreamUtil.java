package com.github.zengfr.supercommons;
import com.google.common.hash.BloomFilter;
import com.google.common.io.ByteStreams;
import com.google.common.io.Closeables;
import org.apache.commons.io.IOUtils;
import org.apache.commons.io.CopyUtils;
import org.apache.commons.io.EndianUtils;
import org.apache.commons.io.output.ByteArrayOutputStream;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.SerializationUtils;
import org.apache.commons.collections.primitives.adapters.io.ByteIteratorInputStream;
import org.apache.commons.collections.primitives.adapters.io.InputStreamByteIterator;
import it.unimi.dsi.fastutil.io.BinIO;
import com.facebook.util.StreamImporter;
import org.apache.commons.lang.SerializationUtils;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class InputStreamUtil{ 
public static <T> com.google.common.hash.BloomFilter<T> readFrom(java.io.InputStream p0,com.google.common.hash.Funnel<T> p1) throws java.io.IOException{
return BloomFilter.readFrom(p0,p1);
}
public static java.io.InputStream limit(java.io.InputStream p0,long p1){
return ByteStreams.limit(p0,p1);
}
public static int read(java.io.InputStream p0,byte[] p1,int p2,int p3) throws java.io.IOException{
return ByteStreams.read(p0,p1,p2,p3);
}
public static long copy(java.io.InputStream p0,java.io.OutputStream p1) throws java.io.IOException{
return ByteStreams.copy(p0,p1);
}
public static void readFully(java.io.InputStream p0,byte[] p1) throws java.io.IOException{
 ByteStreams.readFully(p0,p1);
}
public static void readFully(java.io.InputStream p0,byte[] p1,int p2,int p3) throws java.io.IOException{
 ByteStreams.readFully(p0,p1,p2,p3);
}
public static <T> T readBytes(java.io.InputStream p0,com.google.common.io.ByteProcessor<T> p1) throws java.io.IOException{
return ByteStreams.readBytes(p0,p1);
}
public static byte[] toByteArray(java.io.InputStream p0) throws java.io.IOException{
return ByteStreams.toByteArray(p0);
}
public static void skipFully(java.io.InputStream p0,long p1) throws java.io.IOException{
 ByteStreams.skipFully(p0,p1);
}
public static void closeQuietly(java.io.InputStream p0){
 Closeables.closeQuietly(p0);
}
public static boolean contentEquals(java.io.InputStream p0,java.io.InputStream p1) throws java.io.IOException{
return IOUtils.contentEquals(p0,p1);
}
public static char[] toCharArray(java.io.InputStream p0,java.nio.charset.Charset p1) throws java.io.IOException{
return IOUtils.toCharArray(p0,p1);
}
public static char[] toCharArray(java.io.InputStream p0) throws java.io.IOException{
return IOUtils.toCharArray(p0);
}
public static char[] toCharArray(java.io.InputStream p0,java.lang.String p1) throws java.io.IOException{
return IOUtils.toCharArray(p0,p1);
}
public static int read(java.io.InputStream p0,byte[] p1) throws java.io.IOException{
return IOUtils.read(p0,p1);
}
public static void copy(java.io.InputStream p0,java.io.Writer p1) throws java.io.IOException{
 IOUtils.copy(p0,p1);
}
public static long copy(java.io.InputStream p0,java.io.OutputStream p1,int p2) throws java.io.IOException{
return IOUtils.copy(p0,p1,p2);
}
public static void copy(java.io.InputStream p0,java.io.Writer p1,java.lang.String p2) throws java.io.IOException{
 IOUtils.copy(p0,p1,p2);
}
public static void copy(java.io.InputStream p0,java.io.Writer p1,java.nio.charset.Charset p2) throws java.io.IOException{
 IOUtils.copy(p0,p1,p2);
}
public static long skip(java.io.InputStream p0,long p1) throws java.io.IOException{
return IOUtils.skip(p0,p1);
}
public static byte[] readFully(java.io.InputStream p0,int p1) throws java.io.IOException{
return IOUtils.readFully(p0,p1);
}
public static byte[] toByteArray(java.io.InputStream p0,int p1) throws java.io.IOException{
return IOUtils.toByteArray(p0,p1);
}
public static byte[] toByteArray(java.io.InputStream p0,long p1) throws java.io.IOException{
return IOUtils.toByteArray(p0,p1);
}
public static java.io.BufferedInputStream buffer(java.io.InputStream p0,int p1){
return IOUtils.buffer(p0,p1);
}
public static java.io.BufferedInputStream buffer(java.io.InputStream p0){
return IOUtils.buffer(p0);
}
public static java.util.List<java.lang.String> readLines(java.io.InputStream p0) throws java.io.IOException{
return IOUtils.readLines(p0);
}
public static java.util.List<java.lang.String> readLines(java.io.InputStream p0,java.lang.String p1) throws java.io.IOException{
return IOUtils.readLines(p0,p1);
}
public static java.util.List<java.lang.String> readLines(java.io.InputStream p0,java.nio.charset.Charset p1) throws java.io.IOException{
return IOUtils.readLines(p0,p1);
}
public static java.io.InputStream toBufferedInputStream(java.io.InputStream p0) throws java.io.IOException{
return IOUtils.toBufferedInputStream(p0);
}
public static java.io.InputStream toBufferedInputStream(java.io.InputStream p0,int p1) throws java.io.IOException{
return IOUtils.toBufferedInputStream(p0,p1);
}
public static java.io.InputStream toInputStream(java.lang.CharSequence p0){
return IOUtils.toInputStream(p0);
}
public static java.io.InputStream toInputStream(java.lang.String p0){
return IOUtils.toInputStream(p0);
}
public static java.io.InputStream toInputStream(java.lang.CharSequence p0,java.lang.String p1) throws java.io.IOException{
return IOUtils.toInputStream(p0,p1);
}
public static java.io.InputStream toInputStream(java.lang.CharSequence p0,java.nio.charset.Charset p1){
return IOUtils.toInputStream(p0,p1);
}
public static java.io.InputStream toInputStream(java.lang.String p0,java.lang.String p1) throws java.io.IOException{
return IOUtils.toInputStream(p0,p1);
}
public static java.io.InputStream toInputStream(java.lang.String p0,java.nio.charset.Charset p1){
return IOUtils.toInputStream(p0,p1);
}
public static org.apache.commons.io.LineIterator lineIterator(java.io.InputStream p0,java.lang.String p1) throws java.io.IOException{
return IOUtils.lineIterator(p0,p1);
}
public static org.apache.commons.io.LineIterator lineIterator(java.io.InputStream p0,java.nio.charset.Charset p1) throws java.io.IOException{
return IOUtils.lineIterator(p0,p1);
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
public static float readSwappedFloat(java.io.InputStream p0) throws java.io.IOException{
return EndianUtils.readSwappedFloat(p0);
}
public static short readSwappedShort(java.io.InputStream p0) throws java.io.IOException{
return EndianUtils.readSwappedShort(p0);
}
public static long readSwappedLong(java.io.InputStream p0) throws java.io.IOException{
return EndianUtils.readSwappedLong(p0);
}
public static int readSwappedUnsignedShort(java.io.InputStream p0) throws java.io.IOException{
return EndianUtils.readSwappedUnsignedShort(p0);
}
public static int readSwappedInteger(java.io.InputStream p0) throws java.io.IOException{
return EndianUtils.readSwappedInteger(p0);
}
public static double readSwappedDouble(java.io.InputStream p0) throws java.io.IOException{
return EndianUtils.readSwappedDouble(p0);
}
public static long readSwappedUnsignedInteger(java.io.InputStream p0) throws java.io.IOException{
return EndianUtils.readSwappedUnsignedInteger(p0);
}
public static void copyToFile(java.io.InputStream p0,java.io.File p1) throws java.io.IOException{
 FileUtils.copyToFile(p0,p1);
}
public static void copyInputStreamToFile(java.io.InputStream p0,java.io.File p1) throws java.io.IOException{
 FileUtils.copyInputStreamToFile(p0,p1);
}
public static <T> T deserialize(java.io.InputStream p0){
return SerializationUtils.deserialize(p0);
}
public static java.io.InputStream adapt(org.apache.commons.collections.primitives.ByteIterator p0){
return ByteIteratorInputStream.adapt(p0);
}
public static org.apache.commons.collections.primitives.ByteIterator adapt(java.io.InputStream p0){
return InputStreamByteIterator.adapt(p0);
}
public static int loadBytes(java.io.InputStream p0,byte[] p1) throws java.io.IOException{
return BinIO.loadBytes(p0,p1);
}
public static int loadBytes(java.io.InputStream p0,byte[] p1,int p2,int p3) throws java.io.IOException{
return BinIO.loadBytes(p0,p1,p2,p3);
}
public static long loadBytes(java.io.InputStream p0,byte[][] p1,long p2,long p3) throws java.io.IOException{
return BinIO.loadBytes(p0,p1,p2,p3);
}
public static long loadBytes(java.io.InputStream p0,byte[][] p1) throws java.io.IOException{
return BinIO.loadBytes(p0,p1);
}
public static java.lang.Object loadObject(java.io.InputStream p0) throws java.io.IOException,java.lang.ClassNotFoundException{
return BinIO.loadObject(p0);
}
public static java.util.List<java.lang.String> importLines(java.io.InputStream p0) throws java.io.IOException{
return StreamImporter.importLines(p0);
}
}
