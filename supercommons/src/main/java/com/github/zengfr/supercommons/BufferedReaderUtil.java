package com.github.zengfr.supercommons;
import com.google.common.io.Files;
import org.apache.commons.io.IOUtils;
import it.unimi.dsi.fastutil.io.TextIO;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class BufferedReaderUtil{ 
public static java.io.BufferedReader newReader(java.io.File p0,java.nio.charset.Charset p1) throws java.io.FileNotFoundException{
return Files.newReader(p0,p1);
}
public static java.io.BufferedReader buffer(java.io.Reader p0){
return IOUtils.buffer(p0);
}
public static java.io.BufferedReader buffer(java.io.Reader p0,int p1){
return IOUtils.buffer(p0,p1);
}
public static java.io.BufferedReader toBufferedReader(java.io.Reader p0,int p1){
return IOUtils.toBufferedReader(p0,p1);
}
public static java.io.BufferedReader toBufferedReader(java.io.Reader p0){
return IOUtils.toBufferedReader(p0);
}
public static it.unimi.dsi.fastutil.ints.IntIterator asIntIterator(java.io.BufferedReader p0){
return TextIO.asIntIterator(p0);
}
public static int loadShorts(java.io.BufferedReader p0,short[] p1) throws java.io.IOException{
return TextIO.loadShorts(p0,p1);
}
public static int loadShorts(java.io.BufferedReader p0,short[] p1,int p2,int p3) throws java.io.IOException{
return TextIO.loadShorts(p0,p1,p2,p3);
}
public static long loadShorts(java.io.BufferedReader p0,short[][] p1) throws java.io.IOException{
return TextIO.loadShorts(p0,p1);
}
public static long loadShorts(java.io.BufferedReader p0,short[][] p1,long p2,long p3) throws java.io.IOException{
return TextIO.loadShorts(p0,p1,p2,p3);
}
public static it.unimi.dsi.fastutil.shorts.ShortIterator asShortIterator(java.io.BufferedReader p0){
return TextIO.asShortIterator(p0);
}
public static int loadDoubles(java.io.BufferedReader p0,double[] p1) throws java.io.IOException{
return TextIO.loadDoubles(p0,p1);
}
public static long loadDoubles(java.io.BufferedReader p0,double[][] p1,long p2,long p3) throws java.io.IOException{
return TextIO.loadDoubles(p0,p1,p2,p3);
}
public static long loadDoubles(java.io.BufferedReader p0,double[][] p1) throws java.io.IOException{
return TextIO.loadDoubles(p0,p1);
}
public static int loadDoubles(java.io.BufferedReader p0,double[] p1,int p2,int p3) throws java.io.IOException{
return TextIO.loadDoubles(p0,p1,p2,p3);
}
public static long loadBooleans(java.io.BufferedReader p0,boolean[][] p1,long p2,long p3) throws java.io.IOException{
return TextIO.loadBooleans(p0,p1,p2,p3);
}
public static int loadBooleans(java.io.BufferedReader p0,boolean[] p1,int p2,int p3) throws java.io.IOException{
return TextIO.loadBooleans(p0,p1,p2,p3);
}
public static int loadBooleans(java.io.BufferedReader p0,boolean[] p1) throws java.io.IOException{
return TextIO.loadBooleans(p0,p1);
}
public static long loadBooleans(java.io.BufferedReader p0,boolean[][] p1) throws java.io.IOException{
return TextIO.loadBooleans(p0,p1);
}
public static int loadInts(java.io.BufferedReader p0,int[] p1) throws java.io.IOException{
return TextIO.loadInts(p0,p1);
}
public static int loadInts(java.io.BufferedReader p0,int[] p1,int p2,int p3) throws java.io.IOException{
return TextIO.loadInts(p0,p1,p2,p3);
}
public static long loadInts(java.io.BufferedReader p0,int[][] p1,long p2,long p3) throws java.io.IOException{
return TextIO.loadInts(p0,p1,p2,p3);
}
public static long loadInts(java.io.BufferedReader p0,int[][] p1) throws java.io.IOException{
return TextIO.loadInts(p0,p1);
}
public static int loadBytes(java.io.BufferedReader p0,byte[] p1) throws java.io.IOException{
return TextIO.loadBytes(p0,p1);
}
public static long loadBytes(java.io.BufferedReader p0,byte[][] p1) throws java.io.IOException{
return TextIO.loadBytes(p0,p1);
}
public static long loadBytes(java.io.BufferedReader p0,byte[][] p1,long p2,long p3) throws java.io.IOException{
return TextIO.loadBytes(p0,p1,p2,p3);
}
public static int loadBytes(java.io.BufferedReader p0,byte[] p1,int p2,int p3) throws java.io.IOException{
return TextIO.loadBytes(p0,p1,p2,p3);
}
public static int loadFloats(java.io.BufferedReader p0,float[] p1,int p2,int p3) throws java.io.IOException{
return TextIO.loadFloats(p0,p1,p2,p3);
}
public static int loadFloats(java.io.BufferedReader p0,float[] p1) throws java.io.IOException{
return TextIO.loadFloats(p0,p1);
}
public static long loadFloats(java.io.BufferedReader p0,float[][] p1,long p2,long p3) throws java.io.IOException{
return TextIO.loadFloats(p0,p1,p2,p3);
}
public static long loadFloats(java.io.BufferedReader p0,float[][] p1) throws java.io.IOException{
return TextIO.loadFloats(p0,p1);
}
public static it.unimi.dsi.fastutil.longs.LongIterator asLongIterator(java.io.BufferedReader p0){
return TextIO.asLongIterator(p0);
}
public static long loadLongs(java.io.BufferedReader p0,long[][] p1) throws java.io.IOException{
return TextIO.loadLongs(p0,p1);
}
public static long loadLongs(java.io.BufferedReader p0,long[][] p1,long p2,long p3) throws java.io.IOException{
return TextIO.loadLongs(p0,p1,p2,p3);
}
public static int loadLongs(java.io.BufferedReader p0,long[] p1,int p2,int p3) throws java.io.IOException{
return TextIO.loadLongs(p0,p1,p2,p3);
}
public static int loadLongs(java.io.BufferedReader p0,long[] p1) throws java.io.IOException{
return TextIO.loadLongs(p0,p1);
}
public static it.unimi.dsi.fastutil.doubles.DoubleIterator asDoubleIterator(java.io.BufferedReader p0){
return TextIO.asDoubleIterator(p0);
}
public static it.unimi.dsi.fastutil.floats.FloatIterator asFloatIterator(java.io.BufferedReader p0){
return TextIO.asFloatIterator(p0);
}
public static it.unimi.dsi.fastutil.bytes.ByteIterator asByteIterator(java.io.BufferedReader p0){
return TextIO.asByteIterator(p0);
}
public static it.unimi.dsi.fastutil.booleans.BooleanIterator asBooleanIterator(java.io.BufferedReader p0){
return TextIO.asBooleanIterator(p0);
}
}
