package com.github.zengfr.supercommons;
import it.unimi.dsi.fastutil.BigArrays;
import it.unimi.dsi.fastutil.longs.Long2BooleanSortedMaps;
import it.unimi.dsi.fastutil.longs.Long2ByteSortedMaps;
import it.unimi.dsi.fastutil.longs.Long2CharSortedMaps;
import it.unimi.dsi.fastutil.longs.Long2DoubleSortedMaps;
import it.unimi.dsi.fastutil.longs.Long2FloatSortedMaps;
import it.unimi.dsi.fastutil.longs.Long2IntSortedMaps;
import it.unimi.dsi.fastutil.longs.Long2LongSortedMaps;
import it.unimi.dsi.fastutil.longs.Long2ObjectSortedMaps;
import it.unimi.dsi.fastutil.longs.Long2ReferenceSortedMaps;
import it.unimi.dsi.fastutil.longs.Long2ShortSortedMaps;
import it.unimi.dsi.fastutil.longs.LongArrays;
import it.unimi.dsi.fastutil.longs.LongBigArrays;
import it.unimi.dsi.fastutil.longs.LongComparators;
import it.unimi.dsi.fastutil.longs.LongHeaps;
import it.unimi.dsi.fastutil.longs.LongIndirectHeaps;
import it.unimi.dsi.fastutil.longs.LongSemiIndirectHeaps;
import it.unimi.dsi.fastutil.longs.LongSortedSets;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class LongComparatorUtil{ 
public static void mergeSort(long p0,long p1,it.unimi.dsi.fastutil.longs.LongComparator p2,it.unimi.dsi.fastutil.BigSwapper p3){
 BigArrays.mergeSort(p0,p1,p2,p3);
}
public static void quickSort(long p0,long p1,it.unimi.dsi.fastutil.longs.LongComparator p2,it.unimi.dsi.fastutil.BigSwapper p3){
 BigArrays.quickSort(p0,p1,p2,p3);
}
public static it.unimi.dsi.fastutil.longs.Long2BooleanSortedMap singleton(java.lang.Long p0,java.lang.Boolean p1,it.unimi.dsi.fastutil.longs.LongComparator p2){
return Long2BooleanSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.longs.Long2BooleanSortedMap singleton(long p0,boolean p1,it.unimi.dsi.fastutil.longs.LongComparator p2){
return Long2BooleanSortedMaps.singleton(p0,p1,p2);
}
public static java.util.Comparator<? super java.util.Map.java.util.Map.Entry<java.lang.Long, ?>> entryComparator(it.unimi.dsi.fastutil.longs.LongComparator p0){
return Long2BooleanSortedMaps.entryComparator(p0);
}
public static it.unimi.dsi.fastutil.longs.Long2ByteSortedMap singleton(java.lang.Long p0,java.lang.Byte p1,it.unimi.dsi.fastutil.longs.LongComparator p2){
return Long2ByteSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.longs.Long2ByteSortedMap singleton(long p0,byte p1,it.unimi.dsi.fastutil.longs.LongComparator p2){
return Long2ByteSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.longs.Long2CharSortedMap singleton(java.lang.Long p0,java.lang.Character p1,it.unimi.dsi.fastutil.longs.LongComparator p2){
return Long2CharSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.longs.Long2CharSortedMap singleton(long p0,char p1,it.unimi.dsi.fastutil.longs.LongComparator p2){
return Long2CharSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.longs.Long2DoubleSortedMap singleton(java.lang.Long p0,java.lang.Double p1,it.unimi.dsi.fastutil.longs.LongComparator p2){
return Long2DoubleSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.longs.Long2DoubleSortedMap singleton(long p0,double p1,it.unimi.dsi.fastutil.longs.LongComparator p2){
return Long2DoubleSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.longs.Long2FloatSortedMap singleton(java.lang.Long p0,java.lang.Float p1,it.unimi.dsi.fastutil.longs.LongComparator p2){
return Long2FloatSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.longs.Long2FloatSortedMap singleton(long p0,float p1,it.unimi.dsi.fastutil.longs.LongComparator p2){
return Long2FloatSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.longs.Long2IntSortedMap singleton(java.lang.Long p0,java.lang.Integer p1,it.unimi.dsi.fastutil.longs.LongComparator p2){
return Long2IntSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.longs.Long2IntSortedMap singleton(long p0,int p1,it.unimi.dsi.fastutil.longs.LongComparator p2){
return Long2IntSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.longs.Long2LongSortedMap singleton(java.lang.Long p0,java.lang.Long p1,it.unimi.dsi.fastutil.longs.LongComparator p2){
return Long2LongSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.longs.Long2LongSortedMap singleton(long p0,long p1,it.unimi.dsi.fastutil.longs.LongComparator p2){
return Long2LongSortedMaps.singleton(p0,p1,p2);
}
public static <V> it.unimi.dsi.fastutil.longs.Long2ObjectSortedMap<V> singleton(java.lang.Long p0,V p1,it.unimi.dsi.fastutil.longs.LongComparator p2){
return Long2ObjectSortedMaps.singleton(p0,p1,p2);
}
public static <V> it.unimi.dsi.fastutil.longs.Long2ObjectSortedMap<V> singleton(long p0,V p1,it.unimi.dsi.fastutil.longs.LongComparator p2){
return Long2ObjectSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.longs.Long2ShortSortedMap singleton(java.lang.Long p0,java.lang.Short p1,it.unimi.dsi.fastutil.longs.LongComparator p2){
return Long2ShortSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.longs.Long2ShortSortedMap singleton(long p0,short p1,it.unimi.dsi.fastutil.longs.LongComparator p2){
return Long2ShortSortedMaps.singleton(p0,p1,p2);
}
public static int binarySearch(long[] p0,long p1,it.unimi.dsi.fastutil.longs.LongComparator p2){
return LongArrays.binarySearch(p0,p1,p2);
}
public static int binarySearch(long[] p0,int p1,int p2,long p3,it.unimi.dsi.fastutil.longs.LongComparator p4){
return LongArrays.binarySearch(p0,p1,p2,p3,p4);
}
public static void mergeSort(long[] p0,it.unimi.dsi.fastutil.longs.LongComparator p1){
 LongArrays.mergeSort(p0,p1);
}
public static void mergeSort(long[] p0,int p1,int p2,it.unimi.dsi.fastutil.longs.LongComparator p3){
 LongArrays.mergeSort(p0,p1,p2,p3);
}
public static void mergeSort(long[] p0,int p1,int p2,it.unimi.dsi.fastutil.longs.LongComparator p3,long[] p4){
 LongArrays.mergeSort(p0,p1,p2,p3,p4);
}
public static void quickSort(long[] p0,it.unimi.dsi.fastutil.longs.LongComparator p1){
 LongArrays.quickSort(p0,p1);
}
public static void quickSort(long[] p0,int p1,int p2,it.unimi.dsi.fastutil.longs.LongComparator p3){
 LongArrays.quickSort(p0,p1,p2,p3);
}
public static void parallelQuickSort(long[] p0,it.unimi.dsi.fastutil.longs.LongComparator p1){
 LongArrays.parallelQuickSort(p0,p1);
}
public static void parallelQuickSort(long[] p0,int p1,int p2,it.unimi.dsi.fastutil.longs.LongComparator p3){
 LongArrays.parallelQuickSort(p0,p1,p2,p3);
}
public static long binarySearch(long[][] p0,long p1,long p2,long p3,it.unimi.dsi.fastutil.longs.LongComparator p4){
return LongBigArrays.binarySearch(p0,p1,p2,p3,p4);
}
public static long binarySearch(long[][] p0,long p1,it.unimi.dsi.fastutil.longs.LongComparator p2){
return LongBigArrays.binarySearch(p0,p1,p2);
}
public static void quickSort(long[][] p0,it.unimi.dsi.fastutil.longs.LongComparator p1){
 LongBigArrays.quickSort(p0,p1);
}
public static void quickSort(long[][] p0,long p1,long p2,it.unimi.dsi.fastutil.longs.LongComparator p3){
 LongBigArrays.quickSort(p0,p1,p2,p3);
}
public static it.unimi.dsi.fastutil.longs.LongComparator asLongComparator(java.util.Comparator<? super java.lang.Long> p0){
return LongComparators.asLongComparator(p0);
}
public static it.unimi.dsi.fastutil.longs.LongComparator oppositeComparator(it.unimi.dsi.fastutil.longs.LongComparator p0){
return LongComparators.oppositeComparator(p0);
}
public static void makeHeap(long[] p0,int p1,it.unimi.dsi.fastutil.longs.LongComparator p2){
 LongHeaps.makeHeap(p0,p1,p2);
}
public static int downHeap(long[] p0,int p1,int p2,it.unimi.dsi.fastutil.longs.LongComparator p3){
return LongHeaps.downHeap(p0,p1,p2,p3);
}
public static int upHeap(long[] p0,int p1,int p2,it.unimi.dsi.fastutil.longs.LongComparator p3){
return LongHeaps.upHeap(p0,p1,p2,p3);
}
public static void makeHeap(long[] p0,int p1,int p2,int[] p3,int[] p4,it.unimi.dsi.fastutil.longs.LongComparator p5){
 LongIndirectHeaps.makeHeap(p0,p1,p2,p3,p4,p5);
}
public static void makeHeap(long[] p0,int[] p1,int[] p2,int p3,it.unimi.dsi.fastutil.longs.LongComparator p4){
 LongIndirectHeaps.makeHeap(p0,p1,p2,p3,p4);
}
public static int downHeap(long[] p0,int[] p1,int[] p2,int p3,int p4,it.unimi.dsi.fastutil.longs.LongComparator p5){
return LongIndirectHeaps.downHeap(p0,p1,p2,p3,p4,p5);
}
public static int upHeap(long[] p0,int[] p1,int[] p2,int p3,int p4,it.unimi.dsi.fastutil.longs.LongComparator p5){
return LongIndirectHeaps.upHeap(p0,p1,p2,p3,p4,p5);
}
public static int[] makeHeap(long[] p0,int p1,int p2,it.unimi.dsi.fastutil.longs.LongComparator p3){
return LongSemiIndirectHeaps.makeHeap(p0,p1,p2,p3);
}
public static void makeHeap(long[] p0,int p1,int p2,int[] p3,it.unimi.dsi.fastutil.longs.LongComparator p4){
 LongSemiIndirectHeaps.makeHeap(p0,p1,p2,p3,p4);
}
public static void makeHeap(long[] p0,int[] p1,int p2,it.unimi.dsi.fastutil.longs.LongComparator p3){
 LongSemiIndirectHeaps.makeHeap(p0,p1,p2,p3);
}
public static int downHeap(long[] p0,int[] p1,int p2,int p3,it.unimi.dsi.fastutil.longs.LongComparator p4){
return LongSemiIndirectHeaps.downHeap(p0,p1,p2,p3,p4);
}
public static int upHeap(long[] p0,int[] p1,int p2,int p3,it.unimi.dsi.fastutil.longs.LongComparator p4){
return LongSemiIndirectHeaps.upHeap(p0,p1,p2,p3,p4);
}
public static int front(long[] p0,int[] p1,int p2,int[] p3,it.unimi.dsi.fastutil.longs.LongComparator p4){
return LongSemiIndirectHeaps.front(p0,p1,p2,p3,p4);
}
public static it.unimi.dsi.fastutil.longs.LongSortedSet singleton(java.lang.Object p0,it.unimi.dsi.fastutil.longs.LongComparator p1){
return LongSortedSets.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.longs.LongSortedSet singleton(long p0,it.unimi.dsi.fastutil.longs.LongComparator p1){
return LongSortedSets.singleton(p0,p1);
}
}
