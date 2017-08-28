package com.zengfr.supercommons;
import com.google.common.primitives.Longs;
import org.apache.commons.math3.stat.inference.TestUtils;
import org.apache.commons.math3.util.MathArrays;
import it.unimi.dsi.fastutil.io.BinIO;
import it.unimi.dsi.fastutil.io.TextIO;
import it.unimi.dsi.fastutil.longs.LongArrays;
import it.unimi.dsi.fastutil.longs.LongBigArrayBigList;
import it.unimi.dsi.fastutil.longs.LongBigArrays;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class LongArrayUtil{ 
public static long[] concat(long[]... p0){
return Longs.concat(p0);
}
public static double chiSquareTest(long[][] p0) throws org.apache.commons.math3.exception.NullArgumentException,org.apache.commons.math3.exception.DimensionMismatchException,org.apache.commons.math3.exception.NotPositiveException,org.apache.commons.math3.exception.MaxCountExceededException{
return TestUtils.chiSquareTest(p0);
}
public static boolean chiSquareTest(long[][] p0,double p1) throws org.apache.commons.math3.exception.NullArgumentException,org.apache.commons.math3.exception.DimensionMismatchException,org.apache.commons.math3.exception.NotPositiveException,org.apache.commons.math3.exception.OutOfRangeException,org.apache.commons.math3.exception.MaxCountExceededException{
return TestUtils.chiSquareTest(p0,p1);
}
public static double chiSquare(long[][] p0) throws org.apache.commons.math3.exception.NullArgumentException,org.apache.commons.math3.exception.NotPositiveException,org.apache.commons.math3.exception.DimensionMismatchException{
return TestUtils.chiSquare(p0);
}
public static void checkNonNegative(long[][] p0) throws org.apache.commons.math3.exception.NotPositiveException{
 MathArrays.checkNonNegative(p0);
}
public static void checkRectangular(long[][] p0) throws org.apache.commons.math3.exception.NullArgumentException,org.apache.commons.math3.exception.DimensionMismatchException{
 MathArrays.checkRectangular(p0);
}
public static long[][] loadLongsBig(java.lang.CharSequence p0) throws java.io.IOException{
return BinIO.loadLongsBig(p0);
}
public static long[][] loadLongsBig(java.io.File p0) throws java.io.IOException{
return BinIO.loadLongsBig(p0);
}
public static void storeLongs(long[][] p0,java.io.File p1) throws java.io.IOException{
 BinIO.storeLongs(p0,p1);
}
public static void storeLongs(long[][] p0,long p1,long p2,java.lang.CharSequence p3) throws java.io.IOException{
 BinIO.storeLongs(p0,p1,p2,p3);
}
public static void storeLongs(long[][] p0,long p1,long p2,java.io.File p3) throws java.io.IOException{
 BinIO.storeLongs(p0,p1,p2,p3);
}
public static void storeLongs(long[][] p0,java.io.DataOutput p1) throws java.io.IOException{
 BinIO.storeLongs(p0,p1);
}
public static void storeLongs(long[][] p0,long p1,long p2,java.io.DataOutput p3) throws java.io.IOException{
 BinIO.storeLongs(p0,p1,p2,p3);
}
public static void storeLongs(long[][] p0,java.lang.CharSequence p1) throws java.io.IOException{
 BinIO.storeLongs(p0,p1);
}
public static long loadLongs(java.lang.CharSequence p0,long[][] p1) throws java.io.IOException{
return BinIO.loadLongs(p0,p1);
}
public static long loadLongs(java.lang.CharSequence p0,long[][] p1,long p2,long p3) throws java.io.IOException{
return BinIO.loadLongs(p0,p1,p2,p3);
}
public static long loadLongs(java.io.File p0,long[][] p1) throws java.io.IOException{
return BinIO.loadLongs(p0,p1);
}
public static long loadLongs(java.io.DataInput p0,long[][] p1) throws java.io.IOException{
return BinIO.loadLongs(p0,p1);
}
public static long loadLongs(java.io.DataInput p0,long[][] p1,long p2,long p3) throws java.io.IOException{
return BinIO.loadLongs(p0,p1,p2,p3);
}
public static long loadLongs(java.io.File p0,long[][] p1,long p2,long p3) throws java.io.IOException{
return BinIO.loadLongs(p0,p1,p2,p3);
}
public static void storeLongs(long[][] p0,long p1,long p2,java.io.PrintStream p3){
 TextIO.storeLongs(p0,p1,p2,p3);
}
public static void storeLongs(long[][] p0,java.io.PrintStream p1){
 TextIO.storeLongs(p0,p1);
}
public static long loadLongs(java.io.BufferedReader p0,long[][] p1,long p2,long p3) throws java.io.IOException{
return TextIO.loadLongs(p0,p1,p2,p3);
}
public static long loadLongs(java.io.BufferedReader p0,long[][] p1) throws java.io.IOException{
return TextIO.loadLongs(p0,p1);
}
public static void radixSort(long[][] p0,int p1,int p2){
 LongArrays.radixSort(p0,p1,p2);
}
public static void radixSort(long[][] p0){
 LongArrays.radixSort(p0);
}
public static it.unimi.dsi.fastutil.longs.LongBigArrayBigList wrap(long[][] p0){
return LongBigArrayBigList.wrap(p0);
}
public static it.unimi.dsi.fastutil.longs.LongBigArrayBigList wrap(long[][] p0,long p1){
return LongBigArrayBigList.wrap(p0,p1);
}
public static void add(long[][] p0,long p1,long p2){
 LongBigArrays.add(p0,p1,p2);
}
public static long length(long[][] p0){
return LongBigArrays.length(p0);
}
public static long[][] trim(long[][] p0,long p1){
return LongBigArrays.trim(p0,p1);
}
public static long[][] copy(long[][] p0,long p1,long p2){
return LongBigArrays.copy(p0,p1,p2);
}
public static void copy(long[][] p0,long p1,long[][] p2,long p3,long p4){
 LongBigArrays.copy(p0,p1,p2,p3,p4);
}
public static long[][] copy(long[][] p0){
return LongBigArrays.copy(p0);
}
public static void set(long[][] p0,long p1,long p2){
 LongBigArrays.set(p0,p1,p2);
}
public static long[][] wrap(long[] p0){
return LongBigArrays.wrap(p0);
}
public static void fill(long[][] p0,long p1){
 LongBigArrays.fill(p0,p1);
}
public static void fill(long[][] p0,long p1,long p2,long p3){
 LongBigArrays.fill(p0,p1,p2,p3);
}
public static long[][] ensureCapacity(long[][] p0,long p1,long p2){
return LongBigArrays.ensureCapacity(p0,p1,p2);
}
public static long[][] ensureCapacity(long[][] p0,long p1){
return LongBigArrays.ensureCapacity(p0,p1);
}
public static long[][] setLength(long[][] p0,long p1){
return LongBigArrays.setLength(p0,p1);
}
public static long[][] grow(long[][] p0,long p1,long p2){
return LongBigArrays.grow(p0,p1,p2);
}
public static long[][] grow(long[][] p0,long p1){
return LongBigArrays.grow(p0,p1);
}
public static long binarySearch(long[][] p0,long p1,long p2,long p3){
return LongBigArrays.binarySearch(p0,p1,p2,p3);
}
public static long binarySearch(long[][] p0,long p1,long p2,long p3,it.unimi.dsi.fastutil.longs.LongComparator p4){
return LongBigArrays.binarySearch(p0,p1,p2,p3,p4);
}
public static long binarySearch(long[][] p0,long p1){
return LongBigArrays.binarySearch(p0,p1);
}
public static long binarySearch(long[][] p0,long p1,it.unimi.dsi.fastutil.longs.LongComparator p2){
return LongBigArrays.binarySearch(p0,p1,p2);
}
public static long[][] shuffle(long[][] p0,long p1,long p2,java.util.Random p3){
return LongBigArrays.shuffle(p0,p1,p2,p3);
}
public static long[][] shuffle(long[][] p0,java.util.Random p1){
return LongBigArrays.shuffle(p0,p1);
}
public static void swap(long[][] p0,long p1,long p2){
 LongBigArrays.swap(p0,p1,p2);
}
public static void mul(long[][] p0,long p1,long p2){
 LongBigArrays.mul(p0,p1,p2);
}
public static void ensureFromTo(long[][] p0,long p1,long p2){
 LongBigArrays.ensureFromTo(p0,p1,p2);
}
public static void quickSort(long[][] p0,it.unimi.dsi.fastutil.longs.LongComparator p1){
 LongBigArrays.quickSort(p0,p1);
}
public static void quickSort(long[][] p0,long p1,long p2){
 LongBigArrays.quickSort(p0,p1,p2);
}
public static void quickSort(long[][] p0){
 LongBigArrays.quickSort(p0);
}
public static void quickSort(long[][] p0,long p1,long p2,it.unimi.dsi.fastutil.longs.LongComparator p3){
 LongBigArrays.quickSort(p0,p1,p2,p3);
}
public static void ensureOffsetLength(long[][] p0,long p1,long p2){
 LongBigArrays.ensureOffsetLength(p0,p1,p2);
}
public static void copyFromBig(long[][] p0,long p1,long[] p2,int p3,int p4){
 LongBigArrays.copyFromBig(p0,p1,p2,p3,p4);
}
public static void copyToBig(long[] p0,int p1,long[][] p2,long p3,long p4){
 LongBigArrays.copyToBig(p0,p1,p2,p3,p4);
}
public static void incr(long[][] p0,long p1){
 LongBigArrays.incr(p0,p1);
}
public static void radixSort(long[][] p0,long p1,long p2){
 LongBigArrays.radixSort(p0,p1,p2);
}
public static void radixSort(long[][] p0,long[][] p1,long p2,long p3){
 LongBigArrays.radixSort(p0,p1,p2,p3);
}
public static void radixSort(long[][] p0,long[][] p1){
 LongBigArrays.radixSort(p0,p1);
}
public static void decr(long[][] p0,long p1){
 LongBigArrays.decr(p0,p1);
}
public static long[][] newBigArray(long p0){
return LongBigArrays.newBigArray(p0);
}
}
