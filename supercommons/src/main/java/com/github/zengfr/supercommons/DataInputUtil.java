package com.zengfr.supercommons;
import it.unimi.dsi.fastutil.io.BinIO;
import com.facebook.collections.PackedByteArray;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class DataInputUtil{ 
public static it.unimi.dsi.fastutil.booleans.BooleanIterator asBooleanIterator(java.io.DataInput p0){
return BinIO.asBooleanIterator(p0);
}
public static it.unimi.dsi.fastutil.ints.IntIterator asIntIterator(java.io.DataInput p0){
return BinIO.asIntIterator(p0);
}
public static long loadBytes(java.io.DataInput p0,byte[][] p1) throws java.io.IOException{
return BinIO.loadBytes(p0,p1);
}
public static int loadBytes(java.io.DataInput p0,byte[] p1,int p2,int p3) throws java.io.IOException{
return BinIO.loadBytes(p0,p1,p2,p3);
}
public static int loadBytes(java.io.DataInput p0,byte[] p1) throws java.io.IOException{
return BinIO.loadBytes(p0,p1);
}
public static long loadBytes(java.io.DataInput p0,byte[][] p1,long p2,long p3) throws java.io.IOException{
return BinIO.loadBytes(p0,p1,p2,p3);
}
public static int loadChars(java.io.DataInput p0,char[] p1,int p2,int p3) throws java.io.IOException{
return BinIO.loadChars(p0,p1,p2,p3);
}
public static int loadChars(java.io.DataInput p0,char[] p1) throws java.io.IOException{
return BinIO.loadChars(p0,p1);
}
public static long loadChars(java.io.DataInput p0,char[][] p1,long p2,long p3) throws java.io.IOException{
return BinIO.loadChars(p0,p1,p2,p3);
}
public static long loadChars(java.io.DataInput p0,char[][] p1) throws java.io.IOException{
return BinIO.loadChars(p0,p1);
}
public static int loadShorts(java.io.DataInput p0,short[] p1) throws java.io.IOException{
return BinIO.loadShorts(p0,p1);
}
public static int loadShorts(java.io.DataInput p0,short[] p1,int p2,int p3) throws java.io.IOException{
return BinIO.loadShorts(p0,p1,p2,p3);
}
public static long loadShorts(java.io.DataInput p0,short[][] p1) throws java.io.IOException{
return BinIO.loadShorts(p0,p1);
}
public static long loadShorts(java.io.DataInput p0,short[][] p1,long p2,long p3) throws java.io.IOException{
return BinIO.loadShorts(p0,p1,p2,p3);
}
public static long loadFloats(java.io.DataInput p0,float[][] p1) throws java.io.IOException{
return BinIO.loadFloats(p0,p1);
}
public static int loadFloats(java.io.DataInput p0,float[] p1) throws java.io.IOException{
return BinIO.loadFloats(p0,p1);
}
public static int loadFloats(java.io.DataInput p0,float[] p1,int p2,int p3) throws java.io.IOException{
return BinIO.loadFloats(p0,p1,p2,p3);
}
public static long loadFloats(java.io.DataInput p0,float[][] p1,long p2,long p3) throws java.io.IOException{
return BinIO.loadFloats(p0,p1,p2,p3);
}
public static long loadBooleans(java.io.DataInput p0,boolean[][] p1,long p2,long p3) throws java.io.IOException{
return BinIO.loadBooleans(p0,p1,p2,p3);
}
public static long loadBooleans(java.io.DataInput p0,boolean[][] p1) throws java.io.IOException{
return BinIO.loadBooleans(p0,p1);
}
public static int loadBooleans(java.io.DataInput p0,boolean[] p1,int p2,int p3) throws java.io.IOException{
return BinIO.loadBooleans(p0,p1,p2,p3);
}
public static int loadBooleans(java.io.DataInput p0,boolean[] p1) throws java.io.IOException{
return BinIO.loadBooleans(p0,p1);
}
public static int loadInts(java.io.DataInput p0,int[] p1,int p2,int p3) throws java.io.IOException{
return BinIO.loadInts(p0,p1,p2,p3);
}
public static int loadInts(java.io.DataInput p0,int[] p1) throws java.io.IOException{
return BinIO.loadInts(p0,p1);
}
public static long loadInts(java.io.DataInput p0,int[][] p1) throws java.io.IOException{
return BinIO.loadInts(p0,p1);
}
public static long loadInts(java.io.DataInput p0,int[][] p1,long p2,long p3) throws java.io.IOException{
return BinIO.loadInts(p0,p1,p2,p3);
}
public static it.unimi.dsi.fastutil.longs.LongIterator asLongIterator(java.io.DataInput p0){
return BinIO.asLongIterator(p0);
}
public static long loadDoubles(java.io.DataInput p0,double[][] p1,long p2,long p3) throws java.io.IOException{
return BinIO.loadDoubles(p0,p1,p2,p3);
}
public static long loadDoubles(java.io.DataInput p0,double[][] p1) throws java.io.IOException{
return BinIO.loadDoubles(p0,p1);
}
public static int loadDoubles(java.io.DataInput p0,double[] p1) throws java.io.IOException{
return BinIO.loadDoubles(p0,p1);
}
public static int loadDoubles(java.io.DataInput p0,double[] p1,int p2,int p3) throws java.io.IOException{
return BinIO.loadDoubles(p0,p1,p2,p3);
}
public static it.unimi.dsi.fastutil.shorts.ShortIterator asShortIterator(java.io.DataInput p0){
return BinIO.asShortIterator(p0);
}
public static long loadLongs(java.io.DataInput p0,long[][] p1) throws java.io.IOException{
return BinIO.loadLongs(p0,p1);
}
public static long loadLongs(java.io.DataInput p0,long[][] p1,long p2,long p3) throws java.io.IOException{
return BinIO.loadLongs(p0,p1,p2,p3);
}
public static int loadLongs(java.io.DataInput p0,long[] p1,int p2,int p3) throws java.io.IOException{
return BinIO.loadLongs(p0,p1,p2,p3);
}
public static int loadLongs(java.io.DataInput p0,long[] p1) throws java.io.IOException{
return BinIO.loadLongs(p0,p1);
}
public static it.unimi.dsi.fastutil.bytes.ByteIterator asByteIterator(java.io.DataInput p0){
return BinIO.asByteIterator(p0);
}
public static it.unimi.dsi.fastutil.chars.CharIterator asCharIterator(java.io.DataInput p0){
return BinIO.asCharIterator(p0);
}
public static it.unimi.dsi.fastutil.doubles.DoubleIterator asDoubleIterator(java.io.DataInput p0){
return BinIO.asDoubleIterator(p0);
}
public static it.unimi.dsi.fastutil.floats.FloatIterator asFloatIterator(java.io.DataInput p0){
return BinIO.asFloatIterator(p0);
}
public static byte[] readByteArray(java.io.DataInput p0,byte p1) throws java.io.IOException{
return PackedByteArray.readByteArray(p0,p1);
}
public static java.util.List<byte[]> readByteArrayList(java.io.DataInput p0,byte p1,byte p2) throws java.io.IOException{
return PackedByteArray.readByteArrayList(p0,p1,p2);
}
}
