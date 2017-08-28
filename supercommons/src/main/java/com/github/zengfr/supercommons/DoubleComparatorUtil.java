package com.zengfr.supercommons;
import it.unimi.dsi.fastutil.doubles.Double2BooleanSortedMaps;
import it.unimi.dsi.fastutil.doubles.Double2ByteSortedMaps;
import it.unimi.dsi.fastutil.doubles.Double2CharSortedMaps;
import it.unimi.dsi.fastutil.doubles.Double2DoubleSortedMaps;
import it.unimi.dsi.fastutil.doubles.Double2FloatSortedMaps;
import it.unimi.dsi.fastutil.doubles.Double2IntSortedMaps;
import it.unimi.dsi.fastutil.doubles.Double2LongSortedMaps;
import it.unimi.dsi.fastutil.doubles.Double2ObjectSortedMaps;
import it.unimi.dsi.fastutil.doubles.Double2ReferenceSortedMaps;
import it.unimi.dsi.fastutil.doubles.Double2ShortSortedMaps;
import it.unimi.dsi.fastutil.doubles.DoubleArrays;
import it.unimi.dsi.fastutil.doubles.DoubleBigArrays;
import it.unimi.dsi.fastutil.doubles.DoubleComparators;
import it.unimi.dsi.fastutil.doubles.DoubleHeaps;
import it.unimi.dsi.fastutil.doubles.DoubleIndirectHeaps;
import it.unimi.dsi.fastutil.doubles.DoubleSemiIndirectHeaps;
import it.unimi.dsi.fastutil.doubles.DoubleSortedSets;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class DoubleComparatorUtil{ 
public static it.unimi.dsi.fastutil.doubles.Double2BooleanSortedMap singleton(java.lang.Double p0,java.lang.Boolean p1,it.unimi.dsi.fastutil.doubles.DoubleComparator p2){
return Double2BooleanSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.doubles.Double2BooleanSortedMap singleton(double p0,boolean p1,it.unimi.dsi.fastutil.doubles.DoubleComparator p2){
return Double2BooleanSortedMaps.singleton(p0,p1,p2);
}
public static java.util.Comparator<? super java.util.Map.java.util.Map.Entry<java.lang.Double, ?>> entryComparator(it.unimi.dsi.fastutil.doubles.DoubleComparator p0){
return Double2BooleanSortedMaps.entryComparator(p0);
}
public static it.unimi.dsi.fastutil.doubles.Double2ByteSortedMap singleton(java.lang.Double p0,java.lang.Byte p1,it.unimi.dsi.fastutil.doubles.DoubleComparator p2){
return Double2ByteSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.doubles.Double2ByteSortedMap singleton(double p0,byte p1,it.unimi.dsi.fastutil.doubles.DoubleComparator p2){
return Double2ByteSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.doubles.Double2CharSortedMap singleton(java.lang.Double p0,java.lang.Character p1,it.unimi.dsi.fastutil.doubles.DoubleComparator p2){
return Double2CharSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.doubles.Double2CharSortedMap singleton(double p0,char p1,it.unimi.dsi.fastutil.doubles.DoubleComparator p2){
return Double2CharSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.doubles.Double2DoubleSortedMap singleton(java.lang.Double p0,java.lang.Double p1,it.unimi.dsi.fastutil.doubles.DoubleComparator p2){
return Double2DoubleSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.doubles.Double2DoubleSortedMap singleton(double p0,double p1,it.unimi.dsi.fastutil.doubles.DoubleComparator p2){
return Double2DoubleSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.doubles.Double2FloatSortedMap singleton(java.lang.Double p0,java.lang.Float p1,it.unimi.dsi.fastutil.doubles.DoubleComparator p2){
return Double2FloatSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.doubles.Double2FloatSortedMap singleton(double p0,float p1,it.unimi.dsi.fastutil.doubles.DoubleComparator p2){
return Double2FloatSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.doubles.Double2IntSortedMap singleton(java.lang.Double p0,java.lang.Integer p1,it.unimi.dsi.fastutil.doubles.DoubleComparator p2){
return Double2IntSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.doubles.Double2IntSortedMap singleton(double p0,int p1,it.unimi.dsi.fastutil.doubles.DoubleComparator p2){
return Double2IntSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.doubles.Double2LongSortedMap singleton(java.lang.Double p0,java.lang.Long p1,it.unimi.dsi.fastutil.doubles.DoubleComparator p2){
return Double2LongSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.doubles.Double2LongSortedMap singleton(double p0,long p1,it.unimi.dsi.fastutil.doubles.DoubleComparator p2){
return Double2LongSortedMaps.singleton(p0,p1,p2);
}
public static <V> it.unimi.dsi.fastutil.doubles.Double2ObjectSortedMap<V> singleton(java.lang.Double p0,V p1,it.unimi.dsi.fastutil.doubles.DoubleComparator p2){
return Double2ObjectSortedMaps.singleton(p0,p1,p2);
}
public static <V> it.unimi.dsi.fastutil.doubles.Double2ObjectSortedMap<V> singleton(double p0,V p1,it.unimi.dsi.fastutil.doubles.DoubleComparator p2){
return Double2ObjectSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.doubles.Double2ShortSortedMap singleton(java.lang.Double p0,java.lang.Short p1,it.unimi.dsi.fastutil.doubles.DoubleComparator p2){
return Double2ShortSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.doubles.Double2ShortSortedMap singleton(double p0,short p1,it.unimi.dsi.fastutil.doubles.DoubleComparator p2){
return Double2ShortSortedMaps.singleton(p0,p1,p2);
}
public static int binarySearch(double[] p0,double p1,it.unimi.dsi.fastutil.doubles.DoubleComparator p2){
return DoubleArrays.binarySearch(p0,p1,p2);
}
public static int binarySearch(double[] p0,int p1,int p2,double p3,it.unimi.dsi.fastutil.doubles.DoubleComparator p4){
return DoubleArrays.binarySearch(p0,p1,p2,p3,p4);
}
public static void mergeSort(double[] p0,it.unimi.dsi.fastutil.doubles.DoubleComparator p1){
 DoubleArrays.mergeSort(p0,p1);
}
public static void mergeSort(double[] p0,int p1,int p2,it.unimi.dsi.fastutil.doubles.DoubleComparator p3){
 DoubleArrays.mergeSort(p0,p1,p2,p3);
}
public static void mergeSort(double[] p0,int p1,int p2,it.unimi.dsi.fastutil.doubles.DoubleComparator p3,double[] p4){
 DoubleArrays.mergeSort(p0,p1,p2,p3,p4);
}
public static void quickSort(double[] p0,int p1,int p2,it.unimi.dsi.fastutil.doubles.DoubleComparator p3){
 DoubleArrays.quickSort(p0,p1,p2,p3);
}
public static void quickSort(double[] p0,it.unimi.dsi.fastutil.doubles.DoubleComparator p1){
 DoubleArrays.quickSort(p0,p1);
}
public static void parallelQuickSort(double[] p0,it.unimi.dsi.fastutil.doubles.DoubleComparator p1){
 DoubleArrays.parallelQuickSort(p0,p1);
}
public static void parallelQuickSort(double[] p0,int p1,int p2,it.unimi.dsi.fastutil.doubles.DoubleComparator p3){
 DoubleArrays.parallelQuickSort(p0,p1,p2,p3);
}
public static long binarySearch(double[][] p0,long p1,long p2,double p3,it.unimi.dsi.fastutil.doubles.DoubleComparator p4){
return DoubleBigArrays.binarySearch(p0,p1,p2,p3,p4);
}
public static long binarySearch(double[][] p0,double p1,it.unimi.dsi.fastutil.doubles.DoubleComparator p2){
return DoubleBigArrays.binarySearch(p0,p1,p2);
}
public static void quickSort(double[][] p0,it.unimi.dsi.fastutil.doubles.DoubleComparator p1){
 DoubleBigArrays.quickSort(p0,p1);
}
public static void quickSort(double[][] p0,long p1,long p2,it.unimi.dsi.fastutil.doubles.DoubleComparator p3){
 DoubleBigArrays.quickSort(p0,p1,p2,p3);
}
public static it.unimi.dsi.fastutil.doubles.DoubleComparator asDoubleComparator(java.util.Comparator<? super java.lang.Double> p0){
return DoubleComparators.asDoubleComparator(p0);
}
public static it.unimi.dsi.fastutil.doubles.DoubleComparator oppositeComparator(it.unimi.dsi.fastutil.doubles.DoubleComparator p0){
return DoubleComparators.oppositeComparator(p0);
}
public static void makeHeap(double[] p0,int p1,it.unimi.dsi.fastutil.doubles.DoubleComparator p2){
 DoubleHeaps.makeHeap(p0,p1,p2);
}
public static int downHeap(double[] p0,int p1,int p2,it.unimi.dsi.fastutil.doubles.DoubleComparator p3){
return DoubleHeaps.downHeap(p0,p1,p2,p3);
}
public static int upHeap(double[] p0,int p1,int p2,it.unimi.dsi.fastutil.doubles.DoubleComparator p3){
return DoubleHeaps.upHeap(p0,p1,p2,p3);
}
public static void makeHeap(double[] p0,int p1,int p2,int[] p3,int[] p4,it.unimi.dsi.fastutil.doubles.DoubleComparator p5){
 DoubleIndirectHeaps.makeHeap(p0,p1,p2,p3,p4,p5);
}
public static void makeHeap(double[] p0,int[] p1,int[] p2,int p3,it.unimi.dsi.fastutil.doubles.DoubleComparator p4){
 DoubleIndirectHeaps.makeHeap(p0,p1,p2,p3,p4);
}
public static int downHeap(double[] p0,int[] p1,int[] p2,int p3,int p4,it.unimi.dsi.fastutil.doubles.DoubleComparator p5){
return DoubleIndirectHeaps.downHeap(p0,p1,p2,p3,p4,p5);
}
public static int upHeap(double[] p0,int[] p1,int[] p2,int p3,int p4,it.unimi.dsi.fastutil.doubles.DoubleComparator p5){
return DoubleIndirectHeaps.upHeap(p0,p1,p2,p3,p4,p5);
}
public static int front(double[] p0,int[] p1,int p2,int[] p3,it.unimi.dsi.fastutil.doubles.DoubleComparator p4){
return DoubleSemiIndirectHeaps.front(p0,p1,p2,p3,p4);
}
public static int[] makeHeap(double[] p0,int p1,int p2,it.unimi.dsi.fastutil.doubles.DoubleComparator p3){
return DoubleSemiIndirectHeaps.makeHeap(p0,p1,p2,p3);
}
public static void makeHeap(double[] p0,int[] p1,int p2,it.unimi.dsi.fastutil.doubles.DoubleComparator p3){
 DoubleSemiIndirectHeaps.makeHeap(p0,p1,p2,p3);
}
public static void makeHeap(double[] p0,int p1,int p2,int[] p3,it.unimi.dsi.fastutil.doubles.DoubleComparator p4){
 DoubleSemiIndirectHeaps.makeHeap(p0,p1,p2,p3,p4);
}
public static int downHeap(double[] p0,int[] p1,int p2,int p3,it.unimi.dsi.fastutil.doubles.DoubleComparator p4){
return DoubleSemiIndirectHeaps.downHeap(p0,p1,p2,p3,p4);
}
public static int upHeap(double[] p0,int[] p1,int p2,int p3,it.unimi.dsi.fastutil.doubles.DoubleComparator p4){
return DoubleSemiIndirectHeaps.upHeap(p0,p1,p2,p3,p4);
}
public static it.unimi.dsi.fastutil.doubles.DoubleSortedSet singleton(java.lang.Object p0,it.unimi.dsi.fastutil.doubles.DoubleComparator p1){
return DoubleSortedSets.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.doubles.DoubleSortedSet singleton(double p0,it.unimi.dsi.fastutil.doubles.DoubleComparator p1){
return DoubleSortedSets.singleton(p0,p1);
}
}
