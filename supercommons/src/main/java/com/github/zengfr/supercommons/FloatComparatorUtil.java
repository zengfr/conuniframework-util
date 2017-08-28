package com.github.zengfr.supercommons;
import it.unimi.dsi.fastutil.floats.Float2BooleanSortedMaps;
import it.unimi.dsi.fastutil.floats.Float2ByteSortedMaps;
import it.unimi.dsi.fastutil.floats.Float2CharSortedMaps;
import it.unimi.dsi.fastutil.floats.Float2DoubleSortedMaps;
import it.unimi.dsi.fastutil.floats.Float2FloatSortedMaps;
import it.unimi.dsi.fastutil.floats.Float2IntSortedMaps;
import it.unimi.dsi.fastutil.floats.Float2LongSortedMaps;
import it.unimi.dsi.fastutil.floats.Float2ObjectSortedMaps;
import it.unimi.dsi.fastutil.floats.Float2ReferenceSortedMaps;
import it.unimi.dsi.fastutil.floats.Float2ShortSortedMaps;
import it.unimi.dsi.fastutil.floats.FloatArrays;
import it.unimi.dsi.fastutil.floats.FloatBigArrays;
import it.unimi.dsi.fastutil.floats.FloatComparators;
import it.unimi.dsi.fastutil.floats.FloatHeaps;
import it.unimi.dsi.fastutil.floats.FloatIndirectHeaps;
import it.unimi.dsi.fastutil.floats.FloatSemiIndirectHeaps;
import it.unimi.dsi.fastutil.floats.FloatSortedSets;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class FloatComparatorUtil{ 
public static it.unimi.dsi.fastutil.floats.Float2BooleanSortedMap singleton(java.lang.Float p0,java.lang.Boolean p1,it.unimi.dsi.fastutil.floats.FloatComparator p2){
return Float2BooleanSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.floats.Float2BooleanSortedMap singleton(float p0,boolean p1,it.unimi.dsi.fastutil.floats.FloatComparator p2){
return Float2BooleanSortedMaps.singleton(p0,p1,p2);
}
public static java.util.Comparator<? super java.util.Map.java.util.Map.Entry<java.lang.Float, ?>> entryComparator(it.unimi.dsi.fastutil.floats.FloatComparator p0){
return Float2BooleanSortedMaps.entryComparator(p0);
}
public static it.unimi.dsi.fastutil.floats.Float2ByteSortedMap singleton(java.lang.Float p0,java.lang.Byte p1,it.unimi.dsi.fastutil.floats.FloatComparator p2){
return Float2ByteSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.floats.Float2ByteSortedMap singleton(float p0,byte p1,it.unimi.dsi.fastutil.floats.FloatComparator p2){
return Float2ByteSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.floats.Float2CharSortedMap singleton(java.lang.Float p0,java.lang.Character p1,it.unimi.dsi.fastutil.floats.FloatComparator p2){
return Float2CharSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.floats.Float2CharSortedMap singleton(float p0,char p1,it.unimi.dsi.fastutil.floats.FloatComparator p2){
return Float2CharSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.floats.Float2DoubleSortedMap singleton(java.lang.Float p0,java.lang.Double p1,it.unimi.dsi.fastutil.floats.FloatComparator p2){
return Float2DoubleSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.floats.Float2DoubleSortedMap singleton(float p0,double p1,it.unimi.dsi.fastutil.floats.FloatComparator p2){
return Float2DoubleSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.floats.Float2FloatSortedMap singleton(java.lang.Float p0,java.lang.Float p1,it.unimi.dsi.fastutil.floats.FloatComparator p2){
return Float2FloatSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.floats.Float2FloatSortedMap singleton(float p0,float p1,it.unimi.dsi.fastutil.floats.FloatComparator p2){
return Float2FloatSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.floats.Float2IntSortedMap singleton(java.lang.Float p0,java.lang.Integer p1,it.unimi.dsi.fastutil.floats.FloatComparator p2){
return Float2IntSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.floats.Float2IntSortedMap singleton(float p0,int p1,it.unimi.dsi.fastutil.floats.FloatComparator p2){
return Float2IntSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.floats.Float2LongSortedMap singleton(java.lang.Float p0,java.lang.Long p1,it.unimi.dsi.fastutil.floats.FloatComparator p2){
return Float2LongSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.floats.Float2LongSortedMap singleton(float p0,long p1,it.unimi.dsi.fastutil.floats.FloatComparator p2){
return Float2LongSortedMaps.singleton(p0,p1,p2);
}
public static <V> it.unimi.dsi.fastutil.floats.Float2ObjectSortedMap<V> singleton(java.lang.Float p0,V p1,it.unimi.dsi.fastutil.floats.FloatComparator p2){
return Float2ObjectSortedMaps.singleton(p0,p1,p2);
}
public static <V> it.unimi.dsi.fastutil.floats.Float2ObjectSortedMap<V> singleton(float p0,V p1,it.unimi.dsi.fastutil.floats.FloatComparator p2){
return Float2ObjectSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.floats.Float2ShortSortedMap singleton(java.lang.Float p0,java.lang.Short p1,it.unimi.dsi.fastutil.floats.FloatComparator p2){
return Float2ShortSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.floats.Float2ShortSortedMap singleton(float p0,short p1,it.unimi.dsi.fastutil.floats.FloatComparator p2){
return Float2ShortSortedMaps.singleton(p0,p1,p2);
}
public static int binarySearch(float[] p0,int p1,int p2,float p3,it.unimi.dsi.fastutil.floats.FloatComparator p4){
return FloatArrays.binarySearch(p0,p1,p2,p3,p4);
}
public static int binarySearch(float[] p0,float p1,it.unimi.dsi.fastutil.floats.FloatComparator p2){
return FloatArrays.binarySearch(p0,p1,p2);
}
public static void mergeSort(float[] p0,int p1,int p2,it.unimi.dsi.fastutil.floats.FloatComparator p3){
 FloatArrays.mergeSort(p0,p1,p2,p3);
}
public static void mergeSort(float[] p0,it.unimi.dsi.fastutil.floats.FloatComparator p1){
 FloatArrays.mergeSort(p0,p1);
}
public static void mergeSort(float[] p0,int p1,int p2,it.unimi.dsi.fastutil.floats.FloatComparator p3,float[] p4){
 FloatArrays.mergeSort(p0,p1,p2,p3,p4);
}
public static void quickSort(float[] p0,it.unimi.dsi.fastutil.floats.FloatComparator p1){
 FloatArrays.quickSort(p0,p1);
}
public static void quickSort(float[] p0,int p1,int p2,it.unimi.dsi.fastutil.floats.FloatComparator p3){
 FloatArrays.quickSort(p0,p1,p2,p3);
}
public static void parallelQuickSort(float[] p0,it.unimi.dsi.fastutil.floats.FloatComparator p1){
 FloatArrays.parallelQuickSort(p0,p1);
}
public static void parallelQuickSort(float[] p0,int p1,int p2,it.unimi.dsi.fastutil.floats.FloatComparator p3){
 FloatArrays.parallelQuickSort(p0,p1,p2,p3);
}
public static long binarySearch(float[][] p0,long p1,long p2,float p3,it.unimi.dsi.fastutil.floats.FloatComparator p4){
return FloatBigArrays.binarySearch(p0,p1,p2,p3,p4);
}
public static long binarySearch(float[][] p0,float p1,it.unimi.dsi.fastutil.floats.FloatComparator p2){
return FloatBigArrays.binarySearch(p0,p1,p2);
}
public static void quickSort(float[][] p0,long p1,long p2,it.unimi.dsi.fastutil.floats.FloatComparator p3){
 FloatBigArrays.quickSort(p0,p1,p2,p3);
}
public static void quickSort(float[][] p0,it.unimi.dsi.fastutil.floats.FloatComparator p1){
 FloatBigArrays.quickSort(p0,p1);
}
public static it.unimi.dsi.fastutil.floats.FloatComparator oppositeComparator(it.unimi.dsi.fastutil.floats.FloatComparator p0){
return FloatComparators.oppositeComparator(p0);
}
public static it.unimi.dsi.fastutil.floats.FloatComparator asFloatComparator(java.util.Comparator<? super java.lang.Float> p0){
return FloatComparators.asFloatComparator(p0);
}
public static void makeHeap(float[] p0,int p1,it.unimi.dsi.fastutil.floats.FloatComparator p2){
 FloatHeaps.makeHeap(p0,p1,p2);
}
public static int downHeap(float[] p0,int p1,int p2,it.unimi.dsi.fastutil.floats.FloatComparator p3){
return FloatHeaps.downHeap(p0,p1,p2,p3);
}
public static int upHeap(float[] p0,int p1,int p2,it.unimi.dsi.fastutil.floats.FloatComparator p3){
return FloatHeaps.upHeap(p0,p1,p2,p3);
}
public static void makeHeap(float[] p0,int p1,int p2,int[] p3,int[] p4,it.unimi.dsi.fastutil.floats.FloatComparator p5){
 FloatIndirectHeaps.makeHeap(p0,p1,p2,p3,p4,p5);
}
public static void makeHeap(float[] p0,int[] p1,int[] p2,int p3,it.unimi.dsi.fastutil.floats.FloatComparator p4){
 FloatIndirectHeaps.makeHeap(p0,p1,p2,p3,p4);
}
public static int downHeap(float[] p0,int[] p1,int[] p2,int p3,int p4,it.unimi.dsi.fastutil.floats.FloatComparator p5){
return FloatIndirectHeaps.downHeap(p0,p1,p2,p3,p4,p5);
}
public static int upHeap(float[] p0,int[] p1,int[] p2,int p3,int p4,it.unimi.dsi.fastutil.floats.FloatComparator p5){
return FloatIndirectHeaps.upHeap(p0,p1,p2,p3,p4,p5);
}
public static int[] makeHeap(float[] p0,int p1,int p2,it.unimi.dsi.fastutil.floats.FloatComparator p3){
return FloatSemiIndirectHeaps.makeHeap(p0,p1,p2,p3);
}
public static void makeHeap(float[] p0,int p1,int p2,int[] p3,it.unimi.dsi.fastutil.floats.FloatComparator p4){
 FloatSemiIndirectHeaps.makeHeap(p0,p1,p2,p3,p4);
}
public static void makeHeap(float[] p0,int[] p1,int p2,it.unimi.dsi.fastutil.floats.FloatComparator p3){
 FloatSemiIndirectHeaps.makeHeap(p0,p1,p2,p3);
}
public static int downHeap(float[] p0,int[] p1,int p2,int p3,it.unimi.dsi.fastutil.floats.FloatComparator p4){
return FloatSemiIndirectHeaps.downHeap(p0,p1,p2,p3,p4);
}
public static int upHeap(float[] p0,int[] p1,int p2,int p3,it.unimi.dsi.fastutil.floats.FloatComparator p4){
return FloatSemiIndirectHeaps.upHeap(p0,p1,p2,p3,p4);
}
public static int front(float[] p0,int[] p1,int p2,int[] p3,it.unimi.dsi.fastutil.floats.FloatComparator p4){
return FloatSemiIndirectHeaps.front(p0,p1,p2,p3,p4);
}
public static it.unimi.dsi.fastutil.floats.FloatSortedSet singleton(java.lang.Object p0,it.unimi.dsi.fastutil.floats.FloatComparator p1){
return FloatSortedSets.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.floats.FloatSortedSet singleton(float p0,it.unimi.dsi.fastutil.floats.FloatComparator p1){
return FloatSortedSets.singleton(p0,p1);
}
}
