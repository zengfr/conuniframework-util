package com.github.zengfr.supercommons;
import com.google.common.primitives.Ints;
import org.apache.commons.math3.ml.neuralnet.MapUtils;
import it.unimi.dsi.fastutil.ints.IntArrays;
import it.unimi.dsi.fastutil.ints.IntBigArrayBigList;
import it.unimi.dsi.fastutil.ints.IntBigArrays;
import it.unimi.dsi.fastutil.io.BinIO;
import it.unimi.dsi.fastutil.io.TextIO;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class IntArrayUtil{ 
public static int[] concat(int[]... p0){
return Ints.concat(p0);
}
public static int[][] computeHitHistogram(java.lang.Iterable<double[]> p0,org.apache.commons.math3.ml.neuralnet.twod.NeuronSquareMesh2D p1,org.apache.commons.math3.ml.distance.DistanceMeasure p2){
return MapUtils.computeHitHistogram(p0,p1,p2);
}
public static void radixSort(int[][] p0,int p1,int p2){
 IntArrays.radixSort(p0,p1,p2);
}
public static void radixSort(int[][] p0){
 IntArrays.radixSort(p0);
}
public static it.unimi.dsi.fastutil.ints.IntBigArrayBigList wrap(int[][] p0){
return IntBigArrayBigList.wrap(p0);
}
public static it.unimi.dsi.fastutil.ints.IntBigArrayBigList wrap(int[][] p0,long p1){
return IntBigArrayBigList.wrap(p0,p1);
}
public static void add(int[][] p0,long p1,int p2){
 IntBigArrays.add(p0,p1,p2);
}
public static long length(int[][] p0){
return IntBigArrays.length(p0);
}
public static int[][] trim(int[][] p0,long p1){
return IntBigArrays.trim(p0,p1);
}
public static int[][] copy(int[][] p0){
return IntBigArrays.copy(p0);
}
public static int[][] copy(int[][] p0,long p1,long p2){
return IntBigArrays.copy(p0,p1,p2);
}
public static void copy(int[][] p0,long p1,int[][] p2,long p3,long p4){
 IntBigArrays.copy(p0,p1,p2,p3,p4);
}
public static void set(int[][] p0,long p1,int p2){
 IntBigArrays.set(p0,p1,p2);
}
public static int[][] wrap(int[] p0){
return IntBigArrays.wrap(p0);
}
public static void fill(int[][] p0,int p1){
 IntBigArrays.fill(p0,p1);
}
public static void fill(int[][] p0,long p1,long p2,int p3){
 IntBigArrays.fill(p0,p1,p2,p3);
}
public static int[][] ensureCapacity(int[][] p0,long p1,long p2){
return IntBigArrays.ensureCapacity(p0,p1,p2);
}
public static int[][] ensureCapacity(int[][] p0,long p1){
return IntBigArrays.ensureCapacity(p0,p1);
}
public static int[][] setLength(int[][] p0,long p1){
return IntBigArrays.setLength(p0,p1);
}
public static int[][] grow(int[][] p0,long p1,long p2){
return IntBigArrays.grow(p0,p1,p2);
}
public static int[][] grow(int[][] p0,long p1){
return IntBigArrays.grow(p0,p1);
}
public static long binarySearch(int[][] p0,long p1,long p2,int p3){
return IntBigArrays.binarySearch(p0,p1,p2,p3);
}
public static long binarySearch(int[][] p0,int p1){
return IntBigArrays.binarySearch(p0,p1);
}
public static long binarySearch(int[][] p0,long p1,long p2,int p3,it.unimi.dsi.fastutil.ints.IntComparator p4){
return IntBigArrays.binarySearch(p0,p1,p2,p3,p4);
}
public static long binarySearch(int[][] p0,int p1,it.unimi.dsi.fastutil.ints.IntComparator p2){
return IntBigArrays.binarySearch(p0,p1,p2);
}
public static int[][] shuffle(int[][] p0,java.util.Random p1){
return IntBigArrays.shuffle(p0,p1);
}
public static int[][] shuffle(int[][] p0,long p1,long p2,java.util.Random p3){
return IntBigArrays.shuffle(p0,p1,p2,p3);
}
public static void swap(int[][] p0,long p1,long p2){
 IntBigArrays.swap(p0,p1,p2);
}
public static void ensureFromTo(int[][] p0,long p1,long p2){
 IntBigArrays.ensureFromTo(p0,p1,p2);
}
public static void quickSort(int[][] p0,it.unimi.dsi.fastutil.ints.IntComparator p1){
 IntBigArrays.quickSort(p0,p1);
}
public static void quickSort(int[][] p0,long p1,long p2,it.unimi.dsi.fastutil.ints.IntComparator p3){
 IntBigArrays.quickSort(p0,p1,p2,p3);
}
public static void quickSort(int[][] p0){
 IntBigArrays.quickSort(p0);
}
public static void quickSort(int[][] p0,long p1,long p2){
 IntBigArrays.quickSort(p0,p1,p2);
}
public static int[][] newBigArray(long p0){
return IntBigArrays.newBigArray(p0);
}
public static void copyToBig(int[] p0,int p1,int[][] p2,long p3,long p4){
 IntBigArrays.copyToBig(p0,p1,p2,p3,p4);
}
public static void copyFromBig(int[][] p0,long p1,int[] p2,int p3,int p4){
 IntBigArrays.copyFromBig(p0,p1,p2,p3,p4);
}
public static void mul(int[][] p0,long p1,int p2){
 IntBigArrays.mul(p0,p1,p2);
}
public static void decr(int[][] p0,long p1){
 IntBigArrays.decr(p0,p1);
}
public static void incr(int[][] p0,long p1){
 IntBigArrays.incr(p0,p1);
}
public static void radixSort(int[][] p0,int[][] p1,long p2,long p3){
 IntBigArrays.radixSort(p0,p1,p2,p3);
}
public static void radixSort(int[][] p0,int[][] p1){
 IntBigArrays.radixSort(p0,p1);
}
public static void radixSort(int[][] p0,long p1,long p2){
 IntBigArrays.radixSort(p0,p1,p2);
}
public static void ensureOffsetLength(int[][] p0,long p1,long p2){
 IntBigArrays.ensureOffsetLength(p0,p1,p2);
}
public static long loadInts(java.io.File p0,int[][] p1,long p2,long p3) throws java.io.IOException{
return BinIO.loadInts(p0,p1,p2,p3);
}
public static long loadInts(java.lang.CharSequence p0,int[][] p1,long p2,long p3) throws java.io.IOException{
return BinIO.loadInts(p0,p1,p2,p3);
}
public static long loadInts(java.lang.CharSequence p0,int[][] p1) throws java.io.IOException{
return BinIO.loadInts(p0,p1);
}
public static long loadInts(java.io.File p0,int[][] p1) throws java.io.IOException{
return BinIO.loadInts(p0,p1);
}
public static long loadInts(java.io.DataInput p0,int[][] p1) throws java.io.IOException{
return BinIO.loadInts(p0,p1);
}
public static long loadInts(java.io.DataInput p0,int[][] p1,long p2,long p3) throws java.io.IOException{
return BinIO.loadInts(p0,p1,p2,p3);
}
public static int[][] loadIntsBig(java.io.File p0) throws java.io.IOException{
return BinIO.loadIntsBig(p0);
}
public static int[][] loadIntsBig(java.lang.CharSequence p0) throws java.io.IOException{
return BinIO.loadIntsBig(p0);
}
public static void storeInts(int[][] p0,long p1,long p2,java.lang.CharSequence p3) throws java.io.IOException{
 BinIO.storeInts(p0,p1,p2,p3);
}
public static void storeInts(int[][] p0,java.io.DataOutput p1) throws java.io.IOException{
 BinIO.storeInts(p0,p1);
}
public static void storeInts(int[][] p0,long p1,long p2,java.io.File p3) throws java.io.IOException{
 BinIO.storeInts(p0,p1,p2,p3);
}
public static void storeInts(int[][] p0,java.io.File p1) throws java.io.IOException{
 BinIO.storeInts(p0,p1);
}
public static void storeInts(int[][] p0,java.lang.CharSequence p1) throws java.io.IOException{
 BinIO.storeInts(p0,p1);
}
public static void storeInts(int[][] p0,long p1,long p2,java.io.DataOutput p3) throws java.io.IOException{
 BinIO.storeInts(p0,p1,p2,p3);
}
public static long loadInts(java.io.BufferedReader p0,int[][] p1,long p2,long p3) throws java.io.IOException{
return TextIO.loadInts(p0,p1,p2,p3);
}
public static long loadInts(java.io.BufferedReader p0,int[][] p1) throws java.io.IOException{
return TextIO.loadInts(p0,p1);
}
public static void storeInts(int[][] p0,java.io.PrintStream p1){
 TextIO.storeInts(p0,p1);
}
public static void storeInts(int[][] p0,long p1,long p2,java.io.PrintStream p3){
 TextIO.storeInts(p0,p1,p2,p3);
}
}
