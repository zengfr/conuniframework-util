package com.github.zengfr.supercommons;
import it.unimi.dsi.fastutil.Arrays;
import it.unimi.dsi.fastutil.ints.Int2BooleanSortedMaps;
import it.unimi.dsi.fastutil.ints.Int2ByteSortedMaps;
import it.unimi.dsi.fastutil.ints.Int2CharSortedMaps;
import it.unimi.dsi.fastutil.ints.Int2DoubleSortedMaps;
import it.unimi.dsi.fastutil.ints.Int2FloatSortedMaps;
import it.unimi.dsi.fastutil.ints.Int2IntSortedMaps;
import it.unimi.dsi.fastutil.ints.Int2LongSortedMaps;
import it.unimi.dsi.fastutil.ints.Int2ObjectSortedMaps;
import it.unimi.dsi.fastutil.ints.Int2ReferenceSortedMaps;
import it.unimi.dsi.fastutil.ints.Int2ShortSortedMaps;
import it.unimi.dsi.fastutil.ints.IntArrays;
import it.unimi.dsi.fastutil.ints.IntBigArrays;
import it.unimi.dsi.fastutil.ints.IntComparators;
import it.unimi.dsi.fastutil.ints.IntHeaps;
import it.unimi.dsi.fastutil.ints.IntIndirectHeaps;
import it.unimi.dsi.fastutil.ints.IntSemiIndirectHeaps;
import it.unimi.dsi.fastutil.ints.IntSortedSets;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class IntComparatorUtil{ 
public static void mergeSort(int p0,int p1,it.unimi.dsi.fastutil.ints.IntComparator p2,it.unimi.dsi.fastutil.Swapper p3){
 Arrays.mergeSort(p0,p1,p2,p3);
}
public static void quickSort(int p0,int p1,it.unimi.dsi.fastutil.ints.IntComparator p2,it.unimi.dsi.fastutil.Swapper p3){
 Arrays.quickSort(p0,p1,p2,p3);
}
public static void parallelQuickSort(int p0,int p1,it.unimi.dsi.fastutil.ints.IntComparator p2,it.unimi.dsi.fastutil.Swapper p3){
 Arrays.parallelQuickSort(p0,p1,p2,p3);
}
public static it.unimi.dsi.fastutil.ints.Int2BooleanSortedMap singleton(java.lang.Integer p0,java.lang.Boolean p1,it.unimi.dsi.fastutil.ints.IntComparator p2){
return Int2BooleanSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.ints.Int2BooleanSortedMap singleton(int p0,boolean p1,it.unimi.dsi.fastutil.ints.IntComparator p2){
return Int2BooleanSortedMaps.singleton(p0,p1,p2);
}
public static java.util.Comparator<? super java.util.Map.java.util.Map.Entry<java.lang.Integer, ?>> entryComparator(it.unimi.dsi.fastutil.ints.IntComparator p0){
return Int2BooleanSortedMaps.entryComparator(p0);
}
public static it.unimi.dsi.fastutil.ints.Int2ByteSortedMap singleton(java.lang.Integer p0,java.lang.Byte p1,it.unimi.dsi.fastutil.ints.IntComparator p2){
return Int2ByteSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.ints.Int2ByteSortedMap singleton(int p0,byte p1,it.unimi.dsi.fastutil.ints.IntComparator p2){
return Int2ByteSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.ints.Int2CharSortedMap singleton(java.lang.Integer p0,java.lang.Character p1,it.unimi.dsi.fastutil.ints.IntComparator p2){
return Int2CharSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.ints.Int2CharSortedMap singleton(int p0,char p1,it.unimi.dsi.fastutil.ints.IntComparator p2){
return Int2CharSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.ints.Int2DoubleSortedMap singleton(java.lang.Integer p0,java.lang.Double p1,it.unimi.dsi.fastutil.ints.IntComparator p2){
return Int2DoubleSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.ints.Int2DoubleSortedMap singleton(int p0,double p1,it.unimi.dsi.fastutil.ints.IntComparator p2){
return Int2DoubleSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.ints.Int2FloatSortedMap singleton(java.lang.Integer p0,java.lang.Float p1,it.unimi.dsi.fastutil.ints.IntComparator p2){
return Int2FloatSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.ints.Int2FloatSortedMap singleton(int p0,float p1,it.unimi.dsi.fastutil.ints.IntComparator p2){
return Int2FloatSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.ints.Int2IntSortedMap singleton(java.lang.Integer p0,java.lang.Integer p1,it.unimi.dsi.fastutil.ints.IntComparator p2){
return Int2IntSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.ints.Int2IntSortedMap singleton(int p0,int p1,it.unimi.dsi.fastutil.ints.IntComparator p2){
return Int2IntSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.ints.Int2LongSortedMap singleton(java.lang.Integer p0,java.lang.Long p1,it.unimi.dsi.fastutil.ints.IntComparator p2){
return Int2LongSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.ints.Int2LongSortedMap singleton(int p0,long p1,it.unimi.dsi.fastutil.ints.IntComparator p2){
return Int2LongSortedMaps.singleton(p0,p1,p2);
}
public static <V> it.unimi.dsi.fastutil.ints.Int2ObjectSortedMap<V> singleton(java.lang.Integer p0,V p1,it.unimi.dsi.fastutil.ints.IntComparator p2){
return Int2ObjectSortedMaps.singleton(p0,p1,p2);
}
public static <V> it.unimi.dsi.fastutil.ints.Int2ObjectSortedMap<V> singleton(int p0,V p1,it.unimi.dsi.fastutil.ints.IntComparator p2){
return Int2ObjectSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.ints.Int2ShortSortedMap singleton(java.lang.Integer p0,java.lang.Short p1,it.unimi.dsi.fastutil.ints.IntComparator p2){
return Int2ShortSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.ints.Int2ShortSortedMap singleton(int p0,short p1,it.unimi.dsi.fastutil.ints.IntComparator p2){
return Int2ShortSortedMaps.singleton(p0,p1,p2);
}
public static int binarySearch(int[] p0,int p1,it.unimi.dsi.fastutil.ints.IntComparator p2){
return IntArrays.binarySearch(p0,p1,p2);
}
public static int binarySearch(int[] p0,int p1,int p2,int p3,it.unimi.dsi.fastutil.ints.IntComparator p4){
return IntArrays.binarySearch(p0,p1,p2,p3,p4);
}
public static void mergeSort(int[] p0,it.unimi.dsi.fastutil.ints.IntComparator p1){
 IntArrays.mergeSort(p0,p1);
}
public static void mergeSort(int[] p0,int p1,int p2,it.unimi.dsi.fastutil.ints.IntComparator p3){
 IntArrays.mergeSort(p0,p1,p2,p3);
}
public static void mergeSort(int[] p0,int p1,int p2,it.unimi.dsi.fastutil.ints.IntComparator p3,int[] p4){
 IntArrays.mergeSort(p0,p1,p2,p3,p4);
}
public static void quickSort(int[] p0,it.unimi.dsi.fastutil.ints.IntComparator p1){
 IntArrays.quickSort(p0,p1);
}
public static void quickSort(int[] p0,int p1,int p2,it.unimi.dsi.fastutil.ints.IntComparator p3){
 IntArrays.quickSort(p0,p1,p2,p3);
}
public static void parallelQuickSort(int[] p0,it.unimi.dsi.fastutil.ints.IntComparator p1){
 IntArrays.parallelQuickSort(p0,p1);
}
public static void parallelQuickSort(int[] p0,int p1,int p2,it.unimi.dsi.fastutil.ints.IntComparator p3){
 IntArrays.parallelQuickSort(p0,p1,p2,p3);
}
public static long binarySearch(int[][] p0,long p1,long p2,int p3,it.unimi.dsi.fastutil.ints.IntComparator p4){
return IntBigArrays.binarySearch(p0,p1,p2,p3,p4);
}
public static long binarySearch(int[][] p0,int p1,it.unimi.dsi.fastutil.ints.IntComparator p2){
return IntBigArrays.binarySearch(p0,p1,p2);
}
public static void quickSort(int[][] p0,it.unimi.dsi.fastutil.ints.IntComparator p1){
 IntBigArrays.quickSort(p0,p1);
}
public static void quickSort(int[][] p0,long p1,long p2,it.unimi.dsi.fastutil.ints.IntComparator p3){
 IntBigArrays.quickSort(p0,p1,p2,p3);
}
public static it.unimi.dsi.fastutil.ints.IntComparator oppositeComparator(it.unimi.dsi.fastutil.ints.IntComparator p0){
return IntComparators.oppositeComparator(p0);
}
public static it.unimi.dsi.fastutil.ints.IntComparator asIntComparator(java.util.Comparator<? super java.lang.Integer> p0){
return IntComparators.asIntComparator(p0);
}
public static void makeHeap(int[] p0,int p1,it.unimi.dsi.fastutil.ints.IntComparator p2){
 IntHeaps.makeHeap(p0,p1,p2);
}
public static int downHeap(int[] p0,int p1,int p2,it.unimi.dsi.fastutil.ints.IntComparator p3){
return IntHeaps.downHeap(p0,p1,p2,p3);
}
public static int upHeap(int[] p0,int p1,int p2,it.unimi.dsi.fastutil.ints.IntComparator p3){
return IntHeaps.upHeap(p0,p1,p2,p3);
}
public static void makeHeap(int[] p0,int p1,int p2,int[] p3,int[] p4,it.unimi.dsi.fastutil.ints.IntComparator p5){
 IntIndirectHeaps.makeHeap(p0,p1,p2,p3,p4,p5);
}
public static void makeHeap(int[] p0,int[] p1,int[] p2,int p3,it.unimi.dsi.fastutil.ints.IntComparator p4){
 IntIndirectHeaps.makeHeap(p0,p1,p2,p3,p4);
}
public static int downHeap(int[] p0,int[] p1,int[] p2,int p3,int p4,it.unimi.dsi.fastutil.ints.IntComparator p5){
return IntIndirectHeaps.downHeap(p0,p1,p2,p3,p4,p5);
}
public static int upHeap(int[] p0,int[] p1,int[] p2,int p3,int p4,it.unimi.dsi.fastutil.ints.IntComparator p5){
return IntIndirectHeaps.upHeap(p0,p1,p2,p3,p4,p5);
}
public static int[] makeHeap(int[] p0,int p1,int p2,it.unimi.dsi.fastutil.ints.IntComparator p3){
return IntSemiIndirectHeaps.makeHeap(p0,p1,p2,p3);
}
public static void makeHeap(int[] p0,int p1,int p2,int[] p3,it.unimi.dsi.fastutil.ints.IntComparator p4){
 IntSemiIndirectHeaps.makeHeap(p0,p1,p2,p3,p4);
}
public static void makeHeap(int[] p0,int[] p1,int p2,it.unimi.dsi.fastutil.ints.IntComparator p3){
 IntSemiIndirectHeaps.makeHeap(p0,p1,p2,p3);
}
public static int downHeap(int[] p0,int[] p1,int p2,int p3,it.unimi.dsi.fastutil.ints.IntComparator p4){
return IntSemiIndirectHeaps.downHeap(p0,p1,p2,p3,p4);
}
public static int upHeap(int[] p0,int[] p1,int p2,int p3,it.unimi.dsi.fastutil.ints.IntComparator p4){
return IntSemiIndirectHeaps.upHeap(p0,p1,p2,p3,p4);
}
public static int front(int[] p0,int[] p1,int p2,int[] p3,it.unimi.dsi.fastutil.ints.IntComparator p4){
return IntSemiIndirectHeaps.front(p0,p1,p2,p3,p4);
}
public static it.unimi.dsi.fastutil.ints.IntSortedSet singleton(java.lang.Object p0,it.unimi.dsi.fastutil.ints.IntComparator p1){
return IntSortedSets.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.ints.IntSortedSet singleton(int p0,it.unimi.dsi.fastutil.ints.IntComparator p1){
return IntSortedSets.singleton(p0,p1);
}
}
