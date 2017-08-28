package com.github.zengfr.supercommons;
import com.google.common.primitives.Shorts;
import it.unimi.dsi.fastutil.io.BinIO;
import it.unimi.dsi.fastutil.io.TextIO;
import it.unimi.dsi.fastutil.shorts.ShortArrays;
import it.unimi.dsi.fastutil.shorts.ShortBigArrayBigList;
import it.unimi.dsi.fastutil.shorts.ShortBigArrays;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class ShortArrayUtil{ 
public static short[] concat(short[]... p0){
return Shorts.concat(p0);
}
public static long loadShorts(java.io.DataInput p0,short[][] p1,long p2,long p3) throws java.io.IOException{
return BinIO.loadShorts(p0,p1,p2,p3);
}
public static long loadShorts(java.io.File p0,short[][] p1) throws java.io.IOException{
return BinIO.loadShorts(p0,p1);
}
public static long loadShorts(java.io.File p0,short[][] p1,long p2,long p3) throws java.io.IOException{
return BinIO.loadShorts(p0,p1,p2,p3);
}
public static long loadShorts(java.io.DataInput p0,short[][] p1) throws java.io.IOException{
return BinIO.loadShorts(p0,p1);
}
public static long loadShorts(java.lang.CharSequence p0,short[][] p1) throws java.io.IOException{
return BinIO.loadShorts(p0,p1);
}
public static long loadShorts(java.lang.CharSequence p0,short[][] p1,long p2,long p3) throws java.io.IOException{
return BinIO.loadShorts(p0,p1,p2,p3);
}
public static void storeShorts(short[][] p0,java.lang.CharSequence p1) throws java.io.IOException{
 BinIO.storeShorts(p0,p1);
}
public static void storeShorts(short[][] p0,java.io.File p1) throws java.io.IOException{
 BinIO.storeShorts(p0,p1);
}
public static void storeShorts(short[][] p0,long p1,long p2,java.lang.CharSequence p3) throws java.io.IOException{
 BinIO.storeShorts(p0,p1,p2,p3);
}
public static void storeShorts(short[][] p0,long p1,long p2,java.io.File p3) throws java.io.IOException{
 BinIO.storeShorts(p0,p1,p2,p3);
}
public static void storeShorts(short[][] p0,long p1,long p2,java.io.DataOutput p3) throws java.io.IOException{
 BinIO.storeShorts(p0,p1,p2,p3);
}
public static void storeShorts(short[][] p0,java.io.DataOutput p1) throws java.io.IOException{
 BinIO.storeShorts(p0,p1);
}
public static short[][] loadShortsBig(java.lang.CharSequence p0) throws java.io.IOException{
return BinIO.loadShortsBig(p0);
}
public static short[][] loadShortsBig(java.io.File p0) throws java.io.IOException{
return BinIO.loadShortsBig(p0);
}
public static long loadShorts(java.io.BufferedReader p0,short[][] p1) throws java.io.IOException{
return TextIO.loadShorts(p0,p1);
}
public static long loadShorts(java.io.BufferedReader p0,short[][] p1,long p2,long p3) throws java.io.IOException{
return TextIO.loadShorts(p0,p1,p2,p3);
}
public static void storeShorts(short[][] p0,java.io.PrintStream p1){
 TextIO.storeShorts(p0,p1);
}
public static void storeShorts(short[][] p0,long p1,long p2,java.io.PrintStream p3){
 TextIO.storeShorts(p0,p1,p2,p3);
}
public static void radixSort(short[][] p0,int p1,int p2){
 ShortArrays.radixSort(p0,p1,p2);
}
public static void radixSort(short[][] p0){
 ShortArrays.radixSort(p0);
}
public static it.unimi.dsi.fastutil.shorts.ShortBigArrayBigList wrap(short[][] p0){
return ShortBigArrayBigList.wrap(p0);
}
public static it.unimi.dsi.fastutil.shorts.ShortBigArrayBigList wrap(short[][] p0,long p1){
return ShortBigArrayBigList.wrap(p0,p1);
}
public static void add(short[][] p0,long p1,short p2){
 ShortBigArrays.add(p0,p1,p2);
}
public static long length(short[][] p0){
return ShortBigArrays.length(p0);
}
public static short[][] trim(short[][] p0,long p1){
return ShortBigArrays.trim(p0,p1);
}
public static short[][] copy(short[][] p0){
return ShortBigArrays.copy(p0);
}
public static short[][] copy(short[][] p0,long p1,long p2){
return ShortBigArrays.copy(p0,p1,p2);
}
public static void copy(short[][] p0,long p1,short[][] p2,long p3,long p4){
 ShortBigArrays.copy(p0,p1,p2,p3,p4);
}
public static void set(short[][] p0,long p1,short p2){
 ShortBigArrays.set(p0,p1,p2);
}
public static short[][] wrap(short[] p0){
return ShortBigArrays.wrap(p0);
}
public static void fill(short[][] p0,short p1){
 ShortBigArrays.fill(p0,p1);
}
public static void fill(short[][] p0,long p1,long p2,short p3){
 ShortBigArrays.fill(p0,p1,p2,p3);
}
public static short[][] ensureCapacity(short[][] p0,long p1,long p2){
return ShortBigArrays.ensureCapacity(p0,p1,p2);
}
public static short[][] ensureCapacity(short[][] p0,long p1){
return ShortBigArrays.ensureCapacity(p0,p1);
}
public static short[][] setLength(short[][] p0,long p1){
return ShortBigArrays.setLength(p0,p1);
}
public static short[][] grow(short[][] p0,long p1,long p2){
return ShortBigArrays.grow(p0,p1,p2);
}
public static short[][] grow(short[][] p0,long p1){
return ShortBigArrays.grow(p0,p1);
}
public static long binarySearch(short[][] p0,long p1,long p2,short p3){
return ShortBigArrays.binarySearch(p0,p1,p2,p3);
}
public static long binarySearch(short[][] p0,short p1){
return ShortBigArrays.binarySearch(p0,p1);
}
public static long binarySearch(short[][] p0,long p1,long p2,short p3,it.unimi.dsi.fastutil.shorts.ShortComparator p4){
return ShortBigArrays.binarySearch(p0,p1,p2,p3,p4);
}
public static long binarySearch(short[][] p0,short p1,it.unimi.dsi.fastutil.shorts.ShortComparator p2){
return ShortBigArrays.binarySearch(p0,p1,p2);
}
public static short[][] shuffle(short[][] p0,java.util.Random p1){
return ShortBigArrays.shuffle(p0,p1);
}
public static short[][] shuffle(short[][] p0,long p1,long p2,java.util.Random p3){
return ShortBigArrays.shuffle(p0,p1,p2,p3);
}
public static void swap(short[][] p0,long p1,long p2){
 ShortBigArrays.swap(p0,p1,p2);
}
public static void ensureFromTo(short[][] p0,long p1,long p2){
 ShortBigArrays.ensureFromTo(p0,p1,p2);
}
public static void quickSort(short[][] p0,it.unimi.dsi.fastutil.shorts.ShortComparator p1){
 ShortBigArrays.quickSort(p0,p1);
}
public static void quickSort(short[][] p0,long p1,long p2,it.unimi.dsi.fastutil.shorts.ShortComparator p3){
 ShortBigArrays.quickSort(p0,p1,p2,p3);
}
public static void quickSort(short[][] p0){
 ShortBigArrays.quickSort(p0);
}
public static void quickSort(short[][] p0,long p1,long p2){
 ShortBigArrays.quickSort(p0,p1,p2);
}
public static short[][] newBigArray(long p0){
return ShortBigArrays.newBigArray(p0);
}
public static void copyToBig(short[] p0,int p1,short[][] p2,long p3,long p4){
 ShortBigArrays.copyToBig(p0,p1,p2,p3,p4);
}
public static void copyFromBig(short[][] p0,long p1,short[] p2,int p3,int p4){
 ShortBigArrays.copyFromBig(p0,p1,p2,p3,p4);
}
public static void mul(short[][] p0,long p1,short p2){
 ShortBigArrays.mul(p0,p1,p2);
}
public static void decr(short[][] p0,long p1){
 ShortBigArrays.decr(p0,p1);
}
public static void incr(short[][] p0,long p1){
 ShortBigArrays.incr(p0,p1);
}
public static void radixSort(short[][] p0,short[][] p1,long p2,long p3){
 ShortBigArrays.radixSort(p0,p1,p2,p3);
}
public static void radixSort(short[][] p0,short[][] p1){
 ShortBigArrays.radixSort(p0,p1);
}
public static void radixSort(short[][] p0,long p1,long p2){
 ShortBigArrays.radixSort(p0,p1,p2);
}
public static void ensureOffsetLength(short[][] p0,long p1,long p2){
 ShortBigArrays.ensureOffsetLength(p0,p1,p2);
}
}
