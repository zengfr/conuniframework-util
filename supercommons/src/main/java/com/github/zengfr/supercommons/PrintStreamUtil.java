package com.github.zengfr.supercommons;
import org.apache.commons.collections.MapUtils;
import org.apache.commons.collections4.MapUtils;
import org.apache.commons.lang3.exception.ExceptionUtils;
import it.unimi.dsi.fastutil.io.TextIO;
import org.apache.commons.lang.exception.ExceptionUtils;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class PrintStreamUtil{ 
public static void debugPrint(java.io.PrintStream p0,java.lang.Object p1,java.util.Map p2){
 MapUtils.debugPrint(p0,p1,p2);
}
public static void verbosePrint(java.io.PrintStream p0,java.lang.Object p1,java.util.Map p2){
 MapUtils.verbosePrint(p0,p1,p2);
}
public static void debugPrint(java.io.PrintStream p0,java.lang.Object p1,java.util.Map<?, ?> p2){
 MapUtils.debugPrint(p0,p1,p2);
}
public static void verbosePrint(java.io.PrintStream p0,java.lang.Object p1,java.util.Map<?, ?> p2){
 MapUtils.verbosePrint(p0,p1,p2);
}
public static void printRootCauseStackTrace(java.lang.Throwable p0,java.io.PrintStream p1){
 ExceptionUtils.printRootCauseStackTrace(p0,p1);
}
public static void storeShorts(short[][] p0,java.io.PrintStream p1){
 TextIO.storeShorts(p0,p1);
}
public static void storeShorts(short[][] p0,long p1,long p2,java.io.PrintStream p3){
 TextIO.storeShorts(p0,p1,p2,p3);
}
public static void storeShorts(it.unimi.dsi.fastutil.shorts.ShortIterator p0,java.io.PrintStream p1){
 TextIO.storeShorts(p0,p1);
}
public static void storeShorts(short[] p0,java.io.PrintStream p1){
 TextIO.storeShorts(p0,p1);
}
public static void storeShorts(short[] p0,int p1,int p2,java.io.PrintStream p3){
 TextIO.storeShorts(p0,p1,p2,p3);
}
public static void storeFloats(float[] p0,int p1,int p2,java.io.PrintStream p3){
 TextIO.storeFloats(p0,p1,p2,p3);
}
public static void storeFloats(it.unimi.dsi.fastutil.floats.FloatIterator p0,java.io.PrintStream p1){
 TextIO.storeFloats(p0,p1);
}
public static void storeFloats(float[][] p0,long p1,long p2,java.io.PrintStream p3){
 TextIO.storeFloats(p0,p1,p2,p3);
}
public static void storeFloats(float[][] p0,java.io.PrintStream p1){
 TextIO.storeFloats(p0,p1);
}
public static void storeFloats(float[] p0,java.io.PrintStream p1){
 TextIO.storeFloats(p0,p1);
}
public static void storeBytes(it.unimi.dsi.fastutil.bytes.ByteIterator p0,java.io.PrintStream p1){
 TextIO.storeBytes(p0,p1);
}
public static void storeBytes(byte[][] p0,long p1,long p2,java.io.PrintStream p3){
 TextIO.storeBytes(p0,p1,p2,p3);
}
public static void storeBytes(byte[][] p0,java.io.PrintStream p1){
 TextIO.storeBytes(p0,p1);
}
public static void storeBytes(byte[] p0,int p1,int p2,java.io.PrintStream p3){
 TextIO.storeBytes(p0,p1,p2,p3);
}
public static void storeBytes(byte[] p0,java.io.PrintStream p1){
 TextIO.storeBytes(p0,p1);
}
public static void storeDoubles(double[][] p0,long p1,long p2,java.io.PrintStream p3){
 TextIO.storeDoubles(p0,p1,p2,p3);
}
public static void storeDoubles(double[] p0,java.io.PrintStream p1){
 TextIO.storeDoubles(p0,p1);
}
public static void storeDoubles(double[][] p0,java.io.PrintStream p1){
 TextIO.storeDoubles(p0,p1);
}
public static void storeDoubles(double[] p0,int p1,int p2,java.io.PrintStream p3){
 TextIO.storeDoubles(p0,p1,p2,p3);
}
public static void storeDoubles(it.unimi.dsi.fastutil.doubles.DoubleIterator p0,java.io.PrintStream p1){
 TextIO.storeDoubles(p0,p1);
}
public static void storeLongs(long[] p0,java.io.PrintStream p1){
 TextIO.storeLongs(p0,p1);
}
public static void storeLongs(long[] p0,int p1,int p2,java.io.PrintStream p3){
 TextIO.storeLongs(p0,p1,p2,p3);
}
public static void storeLongs(long[][] p0,java.io.PrintStream p1){
 TextIO.storeLongs(p0,p1);
}
public static void storeLongs(long[][] p0,long p1,long p2,java.io.PrintStream p3){
 TextIO.storeLongs(p0,p1,p2,p3);
}
public static void storeLongs(it.unimi.dsi.fastutil.longs.LongIterator p0,java.io.PrintStream p1){
 TextIO.storeLongs(p0,p1);
}
public static void storeInts(int[][] p0,java.io.PrintStream p1){
 TextIO.storeInts(p0,p1);
}
public static void storeInts(int[][] p0,long p1,long p2,java.io.PrintStream p3){
 TextIO.storeInts(p0,p1,p2,p3);
}
public static void storeInts(int[] p0,java.io.PrintStream p1){
 TextIO.storeInts(p0,p1);
}
public static void storeInts(int[] p0,int p1,int p2,java.io.PrintStream p3){
 TextIO.storeInts(p0,p1,p2,p3);
}
public static void storeInts(it.unimi.dsi.fastutil.ints.IntIterator p0,java.io.PrintStream p1){
 TextIO.storeInts(p0,p1);
}
public static void storeBooleans(boolean[][] p0,long p1,long p2,java.io.PrintStream p3){
 TextIO.storeBooleans(p0,p1,p2,p3);
}
public static void storeBooleans(boolean[] p0,java.io.PrintStream p1){
 TextIO.storeBooleans(p0,p1);
}
public static void storeBooleans(boolean[] p0,int p1,int p2,java.io.PrintStream p3){
 TextIO.storeBooleans(p0,p1,p2,p3);
}
public static void storeBooleans(boolean[][] p0,java.io.PrintStream p1){
 TextIO.storeBooleans(p0,p1);
}
public static void storeBooleans(it.unimi.dsi.fastutil.booleans.BooleanIterator p0,java.io.PrintStream p1){
 TextIO.storeBooleans(p0,p1);
}
}
