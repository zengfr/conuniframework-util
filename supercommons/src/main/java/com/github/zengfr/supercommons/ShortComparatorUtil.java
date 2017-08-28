package com.zengfr.supercommons;
import it.unimi.dsi.fastutil.shorts.Short2BooleanSortedMaps;
import it.unimi.dsi.fastutil.shorts.Short2ByteSortedMaps;
import it.unimi.dsi.fastutil.shorts.Short2CharSortedMaps;
import it.unimi.dsi.fastutil.shorts.Short2DoubleSortedMaps;
import it.unimi.dsi.fastutil.shorts.Short2FloatSortedMaps;
import it.unimi.dsi.fastutil.shorts.Short2IntSortedMaps;
import it.unimi.dsi.fastutil.shorts.Short2LongSortedMaps;
import it.unimi.dsi.fastutil.shorts.Short2ObjectSortedMaps;
import it.unimi.dsi.fastutil.shorts.Short2ReferenceSortedMaps;
import it.unimi.dsi.fastutil.shorts.Short2ShortSortedMaps;
import it.unimi.dsi.fastutil.shorts.ShortArrays;
import it.unimi.dsi.fastutil.shorts.ShortBigArrays;
import it.unimi.dsi.fastutil.shorts.ShortComparators;
import it.unimi.dsi.fastutil.shorts.ShortHeaps;
import it.unimi.dsi.fastutil.shorts.ShortIndirectHeaps;
import it.unimi.dsi.fastutil.shorts.ShortSemiIndirectHeaps;
import it.unimi.dsi.fastutil.shorts.ShortSortedSets;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class ShortComparatorUtil{ 
public static it.unimi.dsi.fastutil.shorts.Short2BooleanSortedMap singleton(java.lang.Short p0,java.lang.Boolean p1,it.unimi.dsi.fastutil.shorts.ShortComparator p2){
return Short2BooleanSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.shorts.Short2BooleanSortedMap singleton(short p0,boolean p1,it.unimi.dsi.fastutil.shorts.ShortComparator p2){
return Short2BooleanSortedMaps.singleton(p0,p1,p2);
}
public static java.util.Comparator<? super java.util.Map.java.util.Map.Entry<java.lang.Short, ?>> entryComparator(it.unimi.dsi.fastutil.shorts.ShortComparator p0){
return Short2BooleanSortedMaps.entryComparator(p0);
}
public static it.unimi.dsi.fastutil.shorts.Short2ByteSortedMap singleton(java.lang.Short p0,java.lang.Byte p1,it.unimi.dsi.fastutil.shorts.ShortComparator p2){
return Short2ByteSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.shorts.Short2ByteSortedMap singleton(short p0,byte p1,it.unimi.dsi.fastutil.shorts.ShortComparator p2){
return Short2ByteSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.shorts.Short2CharSortedMap singleton(java.lang.Short p0,java.lang.Character p1,it.unimi.dsi.fastutil.shorts.ShortComparator p2){
return Short2CharSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.shorts.Short2CharSortedMap singleton(short p0,char p1,it.unimi.dsi.fastutil.shorts.ShortComparator p2){
return Short2CharSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.shorts.Short2DoubleSortedMap singleton(java.lang.Short p0,java.lang.Double p1,it.unimi.dsi.fastutil.shorts.ShortComparator p2){
return Short2DoubleSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.shorts.Short2DoubleSortedMap singleton(short p0,double p1,it.unimi.dsi.fastutil.shorts.ShortComparator p2){
return Short2DoubleSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.shorts.Short2FloatSortedMap singleton(java.lang.Short p0,java.lang.Float p1,it.unimi.dsi.fastutil.shorts.ShortComparator p2){
return Short2FloatSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.shorts.Short2FloatSortedMap singleton(short p0,float p1,it.unimi.dsi.fastutil.shorts.ShortComparator p2){
return Short2FloatSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.shorts.Short2IntSortedMap singleton(java.lang.Short p0,java.lang.Integer p1,it.unimi.dsi.fastutil.shorts.ShortComparator p2){
return Short2IntSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.shorts.Short2IntSortedMap singleton(short p0,int p1,it.unimi.dsi.fastutil.shorts.ShortComparator p2){
return Short2IntSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.shorts.Short2LongSortedMap singleton(java.lang.Short p0,java.lang.Long p1,it.unimi.dsi.fastutil.shorts.ShortComparator p2){
return Short2LongSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.shorts.Short2LongSortedMap singleton(short p0,long p1,it.unimi.dsi.fastutil.shorts.ShortComparator p2){
return Short2LongSortedMaps.singleton(p0,p1,p2);
}
public static <V> it.unimi.dsi.fastutil.shorts.Short2ObjectSortedMap<V> singleton(java.lang.Short p0,V p1,it.unimi.dsi.fastutil.shorts.ShortComparator p2){
return Short2ObjectSortedMaps.singleton(p0,p1,p2);
}
public static <V> it.unimi.dsi.fastutil.shorts.Short2ObjectSortedMap<V> singleton(short p0,V p1,it.unimi.dsi.fastutil.shorts.ShortComparator p2){
return Short2ObjectSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.shorts.Short2ShortSortedMap singleton(java.lang.Short p0,java.lang.Short p1,it.unimi.dsi.fastutil.shorts.ShortComparator p2){
return Short2ShortSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.shorts.Short2ShortSortedMap singleton(short p0,short p1,it.unimi.dsi.fastutil.shorts.ShortComparator p2){
return Short2ShortSortedMaps.singleton(p0,p1,p2);
}
public static int binarySearch(short[] p0,short p1,it.unimi.dsi.fastutil.shorts.ShortComparator p2){
return ShortArrays.binarySearch(p0,p1,p2);
}
public static int binarySearch(short[] p0,int p1,int p2,short p3,it.unimi.dsi.fastutil.shorts.ShortComparator p4){
return ShortArrays.binarySearch(p0,p1,p2,p3,p4);
}
public static void mergeSort(short[] p0,it.unimi.dsi.fastutil.shorts.ShortComparator p1){
 ShortArrays.mergeSort(p0,p1);
}
public static void mergeSort(short[] p0,int p1,int p2,it.unimi.dsi.fastutil.shorts.ShortComparator p3,short[] p4){
 ShortArrays.mergeSort(p0,p1,p2,p3,p4);
}
public static void mergeSort(short[] p0,int p1,int p2,it.unimi.dsi.fastutil.shorts.ShortComparator p3){
 ShortArrays.mergeSort(p0,p1,p2,p3);
}
public static void quickSort(short[] p0,it.unimi.dsi.fastutil.shorts.ShortComparator p1){
 ShortArrays.quickSort(p0,p1);
}
public static void quickSort(short[] p0,int p1,int p2,it.unimi.dsi.fastutil.shorts.ShortComparator p3){
 ShortArrays.quickSort(p0,p1,p2,p3);
}
public static void parallelQuickSort(short[] p0,int p1,int p2,it.unimi.dsi.fastutil.shorts.ShortComparator p3){
 ShortArrays.parallelQuickSort(p0,p1,p2,p3);
}
public static void parallelQuickSort(short[] p0,it.unimi.dsi.fastutil.shorts.ShortComparator p1){
 ShortArrays.parallelQuickSort(p0,p1);
}
public static long binarySearch(short[][] p0,long p1,long p2,short p3,it.unimi.dsi.fastutil.shorts.ShortComparator p4){
return ShortBigArrays.binarySearch(p0,p1,p2,p3,p4);
}
public static long binarySearch(short[][] p0,short p1,it.unimi.dsi.fastutil.shorts.ShortComparator p2){
return ShortBigArrays.binarySearch(p0,p1,p2);
}
public static void quickSort(short[][] p0,it.unimi.dsi.fastutil.shorts.ShortComparator p1){
 ShortBigArrays.quickSort(p0,p1);
}
public static void quickSort(short[][] p0,long p1,long p2,it.unimi.dsi.fastutil.shorts.ShortComparator p3){
 ShortBigArrays.quickSort(p0,p1,p2,p3);
}
public static it.unimi.dsi.fastutil.shorts.ShortComparator oppositeComparator(it.unimi.dsi.fastutil.shorts.ShortComparator p0){
return ShortComparators.oppositeComparator(p0);
}
public static it.unimi.dsi.fastutil.shorts.ShortComparator asShortComparator(java.util.Comparator<? super java.lang.Short> p0){
return ShortComparators.asShortComparator(p0);
}
public static void makeHeap(short[] p0,int p1,it.unimi.dsi.fastutil.shorts.ShortComparator p2){
 ShortHeaps.makeHeap(p0,p1,p2);
}
public static int downHeap(short[] p0,int p1,int p2,it.unimi.dsi.fastutil.shorts.ShortComparator p3){
return ShortHeaps.downHeap(p0,p1,p2,p3);
}
public static int upHeap(short[] p0,int p1,int p2,it.unimi.dsi.fastutil.shorts.ShortComparator p3){
return ShortHeaps.upHeap(p0,p1,p2,p3);
}
public static void makeHeap(short[] p0,int p1,int p2,int[] p3,int[] p4,it.unimi.dsi.fastutil.shorts.ShortComparator p5){
 ShortIndirectHeaps.makeHeap(p0,p1,p2,p3,p4,p5);
}
public static void makeHeap(short[] p0,int[] p1,int[] p2,int p3,it.unimi.dsi.fastutil.shorts.ShortComparator p4){
 ShortIndirectHeaps.makeHeap(p0,p1,p2,p3,p4);
}
public static int downHeap(short[] p0,int[] p1,int[] p2,int p3,int p4,it.unimi.dsi.fastutil.shorts.ShortComparator p5){
return ShortIndirectHeaps.downHeap(p0,p1,p2,p3,p4,p5);
}
public static int upHeap(short[] p0,int[] p1,int[] p2,int p3,int p4,it.unimi.dsi.fastutil.shorts.ShortComparator p5){
return ShortIndirectHeaps.upHeap(p0,p1,p2,p3,p4,p5);
}
public static int front(short[] p0,int[] p1,int p2,int[] p3,it.unimi.dsi.fastutil.shorts.ShortComparator p4){
return ShortSemiIndirectHeaps.front(p0,p1,p2,p3,p4);
}
public static int[] makeHeap(short[] p0,int p1,int p2,it.unimi.dsi.fastutil.shorts.ShortComparator p3){
return ShortSemiIndirectHeaps.makeHeap(p0,p1,p2,p3);
}
public static void makeHeap(short[] p0,int[] p1,int p2,it.unimi.dsi.fastutil.shorts.ShortComparator p3){
 ShortSemiIndirectHeaps.makeHeap(p0,p1,p2,p3);
}
public static void makeHeap(short[] p0,int p1,int p2,int[] p3,it.unimi.dsi.fastutil.shorts.ShortComparator p4){
 ShortSemiIndirectHeaps.makeHeap(p0,p1,p2,p3,p4);
}
public static int downHeap(short[] p0,int[] p1,int p2,int p3,it.unimi.dsi.fastutil.shorts.ShortComparator p4){
return ShortSemiIndirectHeaps.downHeap(p0,p1,p2,p3,p4);
}
public static int upHeap(short[] p0,int[] p1,int p2,int p3,it.unimi.dsi.fastutil.shorts.ShortComparator p4){
return ShortSemiIndirectHeaps.upHeap(p0,p1,p2,p3,p4);
}
public static it.unimi.dsi.fastutil.shorts.ShortSortedSet singleton(java.lang.Object p0,it.unimi.dsi.fastutil.shorts.ShortComparator p1){
return ShortSortedSets.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.shorts.ShortSortedSet singleton(short p0,it.unimi.dsi.fastutil.shorts.ShortComparator p1){
return ShortSortedSets.singleton(p0,p1);
}
}
