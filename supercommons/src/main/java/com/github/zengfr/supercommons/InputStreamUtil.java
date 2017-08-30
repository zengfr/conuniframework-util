package com.github.zengfr.supercommons;
import java.util.*;
import java.util.Map.Entry;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class InputStreamUtil{ 
/**
*public static java.io.InputStream org.apache.commons.collections.primitives.adapters.io.ByteIteratorInputStream.adapt(org.apache.commons.collections.primitives.ByteIterator)
*/ 
public static java.io.InputStream adapt(org.apache.commons.collections.primitives.ByteIterator p0){
	return org.apache.commons.collections.primitives.adapters.io.ByteIteratorInputStream.adapt(p0);
}
/**
*public static org.apache.commons.collections.primitives.ByteIterator org.apache.commons.collections.primitives.adapters.io.InputStreamByteIterator.adapt(java.io.InputStream)
*/ 
public static org.apache.commons.collections.primitives.ByteIterator adapt(java.io.InputStream p0){
	return org.apache.commons.collections.primitives.adapters.io.InputStreamByteIterator.adapt(p0);
}
/**
*public static java.io.BufferedInputStream org.apache.commons.io.IOUtils.buffer(java.io.InputStream)
*/ 
public static java.io.BufferedInputStream buffer(java.io.InputStream p0){
	return org.apache.commons.io.IOUtils.buffer(p0);
}
/**
*public static java.io.BufferedInputStream org.apache.commons.io.IOUtils.buffer(java.io.InputStream,int)
*/ 
public static java.io.BufferedInputStream buffer(java.io.InputStream p0,int p1){
	return org.apache.commons.io.IOUtils.buffer(p0,p1);
}
/**
*public static void com.google.common.io.Closeables.closeQuietly(java.io.InputStream)
*/ 
public static void closeQuietly(java.io.InputStream p0){
	 com.google.common.io.Closeables.closeQuietly(p0);
}
/**
*public static boolean org.apache.commons.io.IOUtils.contentEquals(java.io.InputStream,java.io.InputStream) throws java.io.IOException
*/ 
public static boolean contentEquals(java.io.InputStream p0,java.io.InputStream p1) throws java.io.IOException{
	return org.apache.commons.io.IOUtils.contentEquals(p0,p1);
}
/**
*public static long com.google.common.io.ByteStreams.copy(java.io.InputStream,java.io.OutputStream) throws java.io.IOException
*/ 
public static long copy(java.io.InputStream p0,java.io.OutputStream p1) throws java.io.IOException{
	return com.google.common.io.ByteStreams.copy(p0,p1);
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
*public static void org.apache.commons.io.IOUtils.copy(java.io.InputStream,java.io.Writer,java.lang.String) throws java.io.IOException
*/ 
public static void copy(java.io.InputStream p0,java.io.Writer p1,java.lang.String p2) throws java.io.IOException{
	 org.apache.commons.io.IOUtils.copy(p0,p1,p2);
}
/**
*public static long org.apache.commons.io.IOUtils.copy(java.io.InputStream,java.io.OutputStream,int) throws java.io.IOException
*/ 
public static long copy(java.io.InputStream p0,java.io.OutputStream p1,int p2) throws java.io.IOException{
	return org.apache.commons.io.IOUtils.copy(p0,p1,p2);
}
/**
*public static void org.apache.commons.io.FileUtils.copyInputStreamToFile(java.io.InputStream,java.io.File) throws java.io.IOException
*/ 
public static void copyInputStreamToFile(java.io.InputStream p0,java.io.File p1) throws java.io.IOException{
	 org.apache.commons.io.FileUtils.copyInputStreamToFile(p0,p1);
}
/**
*public static long org.apache.commons.io.IOUtils.copyLarge(java.io.InputStream,java.io.OutputStream,byte[]) throws java.io.IOException
*/ 
public static long copyLarge(java.io.InputStream p0,java.io.OutputStream p1,byte... p2) throws java.io.IOException{
	return org.apache.commons.io.IOUtils.copyLarge(p0,p1,p2);
}
/**
*public static long org.apache.commons.io.IOUtils.copyLarge(java.io.InputStream,java.io.OutputStream,long,long) throws java.io.IOException
*/ 
public static long copyLarge(java.io.InputStream p0,java.io.OutputStream p1,long p2,long p3) throws java.io.IOException{
	return org.apache.commons.io.IOUtils.copyLarge(p0,p1,p2,p3);
}
/**
*public static long org.apache.commons.io.IOUtils.copyLarge(java.io.InputStream,java.io.OutputStream) throws java.io.IOException
*/ 
public static long copyLarge(java.io.InputStream p0,java.io.OutputStream p1) throws java.io.IOException{
	return org.apache.commons.io.IOUtils.copyLarge(p0,p1);
}
/**
*public static long org.apache.commons.io.IOUtils.copyLarge(java.io.InputStream,java.io.OutputStream,long,long,byte[]) throws java.io.IOException
*/ 
public static long copyLarge(java.io.InputStream p0,java.io.OutputStream p1,long p2,long p3,byte... p4) throws java.io.IOException{
	return org.apache.commons.io.IOUtils.copyLarge(p0,p1,p2,p3,p4);
}
/**
*public static void org.apache.commons.io.FileUtils.copyToFile(java.io.InputStream,java.io.File) throws java.io.IOException
*/ 
public static void copyToFile(java.io.InputStream p0,java.io.File p1) throws java.io.IOException{
	 org.apache.commons.io.FileUtils.copyToFile(p0,p1);
}
/**
*public static <T> T org.apache.commons.lang3.SerializationUtils.deserialize(java.io.InputStream)
*/ 
public static <T> T deserialize(java.io.InputStream p0){
	return org.apache.commons.lang3.SerializationUtils.deserialize(p0);
}
/**
*public static java.util.List<java.lang.String> com.facebook.util.StreamImporter.importLines(java.io.InputStream) throws java.io.IOException
*/ 
public static java.util.List<java.lang.String> importLines(java.io.InputStream p0) throws java.io.IOException{
	return com.facebook.util.StreamImporter.importLines(p0);
}
/**
*public static java.io.InputStream com.google.common.io.ByteStreams.limit(java.io.InputStream,long)
*/ 
public static java.io.InputStream limit(java.io.InputStream p0,long p1){
	return com.google.common.io.ByteStreams.limit(p0,p1);
}
/**
*public static org.apache.commons.io.LineIterator org.apache.commons.io.IOUtils.lineIterator(java.io.InputStream,java.lang.String) throws java.io.IOException
*/ 
public static org.apache.commons.io.LineIterator lineIterator(java.io.InputStream p0,java.lang.String p1) throws java.io.IOException{
	return org.apache.commons.io.IOUtils.lineIterator(p0,p1);
}
/**
*public static org.apache.commons.io.LineIterator org.apache.commons.io.IOUtils.lineIterator(java.io.InputStream,java.nio.charset.Charset) throws java.io.IOException
*/ 
public static org.apache.commons.io.LineIterator lineIterator(java.io.InputStream p0,java.nio.charset.Charset p1) throws java.io.IOException{
	return org.apache.commons.io.IOUtils.lineIterator(p0,p1);
}
/**
*public static int it.unimi.dsi.fastutil.io.BinIO.loadBytes(java.io.InputStream,byte[],int,int) throws java.io.IOException
*/ 
public static int loadBytes(java.io.InputStream p0,byte[] p1,int p2,int p3) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.loadBytes(p0,p1,p2,p3);
}
/**
*public static int it.unimi.dsi.fastutil.io.BinIO.loadBytes(java.io.InputStream,byte[]) throws java.io.IOException
*/ 
public static int loadBytes(java.io.InputStream p0,byte... p1) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.loadBytes(p0,p1);
}
/**
*public static long it.unimi.dsi.fastutil.io.BinIO.loadBytes(java.io.InputStream,byte[][],long,long) throws java.io.IOException
*/ 
public static long loadBytes(java.io.InputStream p0,byte[][] p1,long p2,long p3) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.loadBytes(p0,p1,p2,p3);
}
/**
*public static long it.unimi.dsi.fastutil.io.BinIO.loadBytes(java.io.InputStream,byte[][]) throws java.io.IOException
*/ 
public static long loadBytes(java.io.InputStream p0,byte[]... p1) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.loadBytes(p0,p1);
}
/**
*public static java.lang.Object it.unimi.dsi.fastutil.io.BinIO.loadObject(java.io.InputStream) throws java.io.IOException,java.lang.ClassNotFoundException
*/ 
public static java.lang.Object loadObject(java.io.InputStream p0) throws java.io.IOException,java.lang.ClassNotFoundException{
	return it.unimi.dsi.fastutil.io.BinIO.loadObject(p0);
}
/**
*public static int com.google.common.io.ByteStreams.read(java.io.InputStream,byte[],int,int) throws java.io.IOException
*/ 
public static int read(java.io.InputStream p0,byte[] p1,int p2,int p3) throws java.io.IOException{
	return com.google.common.io.ByteStreams.read(p0,p1,p2,p3);
}
/**
*public static int org.apache.commons.io.IOUtils.read(java.io.InputStream,byte[]) throws java.io.IOException
*/ 
public static int read(java.io.InputStream p0,byte... p1) throws java.io.IOException{
	return org.apache.commons.io.IOUtils.read(p0,p1);
}
/**
*public static <T> T com.google.common.io.ByteStreams.readBytes(java.io.InputStream,com.google.common.io.ByteProcessor<T>) throws java.io.IOException
*/ 
public static <T> T readBytes(java.io.InputStream p0,com.google.common.io.ByteProcessor<T> p1) throws java.io.IOException{
	return com.google.common.io.ByteStreams.readBytes(p0,p1);
}
/**
*public static <T> com.google.common.hash.BloomFilter<T> com.google.common.hash.BloomFilter.readFrom(java.io.InputStream,com.google.common.hash.Funnel<T>) throws java.io.IOException
*/ 
public static <T> com.google.common.hash.BloomFilter<T> readFrom(java.io.InputStream p0,com.google.common.hash.Funnel<T> p1) throws java.io.IOException{
	return com.google.common.hash.BloomFilter.readFrom(p0,p1);
}
/**
*public static void com.google.common.io.ByteStreams.readFully(java.io.InputStream,byte[],int,int) throws java.io.IOException
*/ 
public static void readFully(java.io.InputStream p0,byte[] p1,int p2,int p3) throws java.io.IOException{
	 com.google.common.io.ByteStreams.readFully(p0,p1,p2,p3);
}
/**
*public static void com.google.common.io.ByteStreams.readFully(java.io.InputStream,byte[]) throws java.io.IOException
*/ 
public static void readFully(java.io.InputStream p0,byte... p1) throws java.io.IOException{
	 com.google.common.io.ByteStreams.readFully(p0,p1);
}
/**
*public static byte[] org.apache.commons.io.IOUtils.readFully(java.io.InputStream,int) throws java.io.IOException
*/ 
public static byte[] readFully(java.io.InputStream p0,int p1) throws java.io.IOException{
	return org.apache.commons.io.IOUtils.readFully(p0,p1);
}
/**
*public static java.util.List<java.lang.String> org.apache.commons.io.IOUtils.readLines(java.io.InputStream,java.lang.String) throws java.io.IOException
*/ 
public static java.util.List<java.lang.String> readLines(java.io.InputStream p0,java.lang.String p1) throws java.io.IOException{
	return org.apache.commons.io.IOUtils.readLines(p0,p1);
}
/**
*public static java.util.List<java.lang.String> org.apache.commons.io.IOUtils.readLines(java.io.InputStream,java.nio.charset.Charset) throws java.io.IOException
*/ 
public static java.util.List<java.lang.String> readLines(java.io.InputStream p0,java.nio.charset.Charset p1) throws java.io.IOException{
	return org.apache.commons.io.IOUtils.readLines(p0,p1);
}
/**
*public static java.util.List<java.lang.String> org.apache.commons.io.IOUtils.readLines(java.io.InputStream) throws java.io.IOException
*/ 
public static java.util.List<java.lang.String> readLines(java.io.InputStream p0) throws java.io.IOException{
	return org.apache.commons.io.IOUtils.readLines(p0);
}
/**
*public static double org.apache.commons.io.EndianUtils.readSwappedDouble(java.io.InputStream) throws java.io.IOException
*/ 
public static double readSwappedDouble(java.io.InputStream p0) throws java.io.IOException{
	return org.apache.commons.io.EndianUtils.readSwappedDouble(p0);
}
/**
*public static float org.apache.commons.io.EndianUtils.readSwappedFloat(java.io.InputStream) throws java.io.IOException
*/ 
public static float readSwappedFloat(java.io.InputStream p0) throws java.io.IOException{
	return org.apache.commons.io.EndianUtils.readSwappedFloat(p0);
}
/**
*public static int org.apache.commons.io.EndianUtils.readSwappedInteger(java.io.InputStream) throws java.io.IOException
*/ 
public static int readSwappedInteger(java.io.InputStream p0) throws java.io.IOException{
	return org.apache.commons.io.EndianUtils.readSwappedInteger(p0);
}
/**
*public static long org.apache.commons.io.EndianUtils.readSwappedLong(java.io.InputStream) throws java.io.IOException
*/ 
public static long readSwappedLong(java.io.InputStream p0) throws java.io.IOException{
	return org.apache.commons.io.EndianUtils.readSwappedLong(p0);
}
/**
*public static short org.apache.commons.io.EndianUtils.readSwappedShort(java.io.InputStream) throws java.io.IOException
*/ 
public static short readSwappedShort(java.io.InputStream p0) throws java.io.IOException{
	return org.apache.commons.io.EndianUtils.readSwappedShort(p0);
}
/**
*public static long org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(java.io.InputStream) throws java.io.IOException
*/ 
public static long readSwappedUnsignedInteger(java.io.InputStream p0) throws java.io.IOException{
	return org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(p0);
}
/**
*public static int org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(java.io.InputStream) throws java.io.IOException
*/ 
public static int readSwappedUnsignedShort(java.io.InputStream p0) throws java.io.IOException{
	return org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(p0);
}
/**
*public static long org.apache.commons.io.IOUtils.skip(java.io.InputStream,long) throws java.io.IOException
*/ 
public static long skip(java.io.InputStream p0,long p1) throws java.io.IOException{
	return org.apache.commons.io.IOUtils.skip(p0,p1);
}
/**
*public static void com.google.common.io.ByteStreams.skipFully(java.io.InputStream,long) throws java.io.IOException
*/ 
public static void skipFully(java.io.InputStream p0,long p1) throws java.io.IOException{
	 com.google.common.io.ByteStreams.skipFully(p0,p1);
}
/**
*public static java.io.InputStream org.apache.commons.io.IOUtils.toBufferedInputStream(java.io.InputStream,int) throws java.io.IOException
*/ 
public static java.io.InputStream toBufferedInputStream(java.io.InputStream p0,int p1) throws java.io.IOException{
	return org.apache.commons.io.IOUtils.toBufferedInputStream(p0,p1);
}
/**
*public static java.io.InputStream org.apache.commons.io.IOUtils.toBufferedInputStream(java.io.InputStream) throws java.io.IOException
*/ 
public static java.io.InputStream toBufferedInputStream(java.io.InputStream p0) throws java.io.IOException{
	return org.apache.commons.io.IOUtils.toBufferedInputStream(p0);
}
/**
*public static byte[] com.google.common.io.ByteStreams.toByteArray(java.io.InputStream) throws java.io.IOException
*/ 
public static byte[] toByteArray(java.io.InputStream p0) throws java.io.IOException{
	return com.google.common.io.ByteStreams.toByteArray(p0);
}
/**
*public static byte[] org.apache.commons.io.IOUtils.toByteArray(java.io.InputStream,int) throws java.io.IOException
*/ 
public static byte[] toByteArray(java.io.InputStream p0,int p1) throws java.io.IOException{
	return org.apache.commons.io.IOUtils.toByteArray(p0,p1);
}
/**
*public static byte[] org.apache.commons.io.IOUtils.toByteArray(java.io.InputStream,long) throws java.io.IOException
*/ 
public static byte[] toByteArray(java.io.InputStream p0,long p1) throws java.io.IOException{
	return org.apache.commons.io.IOUtils.toByteArray(p0,p1);
}
/**
*public static char[] org.apache.commons.io.IOUtils.toCharArray(java.io.InputStream,java.nio.charset.Charset) throws java.io.IOException
*/ 
public static char[] toCharArray(java.io.InputStream p0,java.nio.charset.Charset p1) throws java.io.IOException{
	return org.apache.commons.io.IOUtils.toCharArray(p0,p1);
}
/**
*public static char[] org.apache.commons.io.IOUtils.toCharArray(java.io.InputStream) throws java.io.IOException
*/ 
public static char[] toCharArray(java.io.InputStream p0) throws java.io.IOException{
	return org.apache.commons.io.IOUtils.toCharArray(p0);
}
/**
*public static char[] org.apache.commons.io.IOUtils.toCharArray(java.io.InputStream,java.lang.String) throws java.io.IOException
*/ 
public static char[] toCharArray(java.io.InputStream p0,java.lang.String p1) throws java.io.IOException{
	return org.apache.commons.io.IOUtils.toCharArray(p0,p1);
}
/**
*public static java.io.InputStream org.apache.commons.io.IOUtils.toInputStream(java.lang.CharSequence,java.nio.charset.Charset)
*/ 
public static java.io.InputStream toInputStream(java.lang.CharSequence p0,java.nio.charset.Charset p1){
	return org.apache.commons.io.IOUtils.toInputStream(p0,p1);
}
/**
*public static java.io.InputStream org.apache.commons.io.IOUtils.toInputStream(java.lang.String,java.lang.String) throws java.io.IOException
*/ 
public static java.io.InputStream toInputStream(java.lang.String p0,java.lang.String p1) throws java.io.IOException{
	return org.apache.commons.io.IOUtils.toInputStream(p0,p1);
}
/**
*public static java.io.InputStream org.apache.commons.io.IOUtils.toInputStream(java.lang.CharSequence)
*/ 
public static java.io.InputStream toInputStream(java.lang.CharSequence p0){
	return org.apache.commons.io.IOUtils.toInputStream(p0);
}
/**
*public static java.io.InputStream org.apache.commons.io.IOUtils.toInputStream(java.lang.CharSequence,java.lang.String) throws java.io.IOException
*/ 
public static java.io.InputStream toInputStream(java.lang.CharSequence p0,java.lang.String p1) throws java.io.IOException{
	return org.apache.commons.io.IOUtils.toInputStream(p0,p1);
}
/**
*public static java.io.InputStream org.apache.commons.io.IOUtils.toInputStream(java.lang.String)
*/ 
public static java.io.InputStream toInputStream(java.lang.String p0){
	return org.apache.commons.io.IOUtils.toInputStream(p0);
}
/**
*public static java.io.InputStream org.apache.commons.io.IOUtils.toInputStream(java.lang.String,java.nio.charset.Charset)
*/ 
public static java.io.InputStream toInputStream(java.lang.String p0,java.nio.charset.Charset p1){
	return org.apache.commons.io.IOUtils.toInputStream(p0,p1);
}
}
