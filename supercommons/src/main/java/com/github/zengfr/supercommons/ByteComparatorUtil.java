package com.github.zengfr.supercommons;
import it.unimi.dsi.fastutil.bytes.Byte2BooleanSortedMaps;
import it.unimi.dsi.fastutil.bytes.Byte2ByteSortedMaps;
import it.unimi.dsi.fastutil.bytes.Byte2CharSortedMaps;
import it.unimi.dsi.fastutil.bytes.Byte2DoubleSortedMaps;
import it.unimi.dsi.fastutil.bytes.Byte2FloatSortedMaps;
import it.unimi.dsi.fastutil.bytes.Byte2IntSortedMaps;
import it.unimi.dsi.fastutil.bytes.Byte2LongSortedMaps;
import it.unimi.dsi.fastutil.bytes.Byte2ObjectSortedMaps;
import it.unimi.dsi.fastutil.bytes.Byte2ReferenceSortedMaps;
import it.unimi.dsi.fastutil.bytes.Byte2ShortSortedMaps;
import it.unimi.dsi.fastutil.bytes.ByteArrays;
import it.unimi.dsi.fastutil.bytes.ByteBigArrays;
import it.unimi.dsi.fastutil.bytes.ByteComparators;
import it.unimi.dsi.fastutil.bytes.ByteHeaps;
import it.unimi.dsi.fastutil.bytes.ByteIndirectHeaps;
import it.unimi.dsi.fastutil.bytes.ByteSemiIndirectHeaps;
import it.unimi.dsi.fastutil.bytes.ByteSortedSets;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class ByteComparatorUtil{ 
public static it.unimi.dsi.fastutil.bytes.Byte2BooleanSortedMap singleton(java.lang.Byte p0,java.lang.Boolean p1,it.unimi.dsi.fastutil.bytes.ByteComparator p2){
return Byte2BooleanSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.bytes.Byte2BooleanSortedMap singleton(byte p0,boolean p1,it.unimi.dsi.fastutil.bytes.ByteComparator p2){
return Byte2BooleanSortedMaps.singleton(p0,p1,p2);
}
public static java.util.Comparator<? super java.util.Map.java.util.Map.Entry<java.lang.Byte, ?>> entryComparator(it.unimi.dsi.fastutil.bytes.ByteComparator p0){
return Byte2BooleanSortedMaps.entryComparator(p0);
}
public static it.unimi.dsi.fastutil.bytes.Byte2ByteSortedMap singleton(java.lang.Byte p0,java.lang.Byte p1,it.unimi.dsi.fastutil.bytes.ByteComparator p2){
return Byte2ByteSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.bytes.Byte2ByteSortedMap singleton(byte p0,byte p1,it.unimi.dsi.fastutil.bytes.ByteComparator p2){
return Byte2ByteSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.bytes.Byte2CharSortedMap singleton(java.lang.Byte p0,java.lang.Character p1,it.unimi.dsi.fastutil.bytes.ByteComparator p2){
return Byte2CharSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.bytes.Byte2CharSortedMap singleton(byte p0,char p1,it.unimi.dsi.fastutil.bytes.ByteComparator p2){
return Byte2CharSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.bytes.Byte2DoubleSortedMap singleton(java.lang.Byte p0,java.lang.Double p1,it.unimi.dsi.fastutil.bytes.ByteComparator p2){
return Byte2DoubleSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.bytes.Byte2DoubleSortedMap singleton(byte p0,double p1,it.unimi.dsi.fastutil.bytes.ByteComparator p2){
return Byte2DoubleSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.bytes.Byte2FloatSortedMap singleton(java.lang.Byte p0,java.lang.Float p1,it.unimi.dsi.fastutil.bytes.ByteComparator p2){
return Byte2FloatSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.bytes.Byte2FloatSortedMap singleton(byte p0,float p1,it.unimi.dsi.fastutil.bytes.ByteComparator p2){
return Byte2FloatSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.bytes.Byte2IntSortedMap singleton(java.lang.Byte p0,java.lang.Integer p1,it.unimi.dsi.fastutil.bytes.ByteComparator p2){
return Byte2IntSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.bytes.Byte2IntSortedMap singleton(byte p0,int p1,it.unimi.dsi.fastutil.bytes.ByteComparator p2){
return Byte2IntSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.bytes.Byte2LongSortedMap singleton(java.lang.Byte p0,java.lang.Long p1,it.unimi.dsi.fastutil.bytes.ByteComparator p2){
return Byte2LongSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.bytes.Byte2LongSortedMap singleton(byte p0,long p1,it.unimi.dsi.fastutil.bytes.ByteComparator p2){
return Byte2LongSortedMaps.singleton(p0,p1,p2);
}
public static <V> it.unimi.dsi.fastutil.bytes.Byte2ObjectSortedMap<V> singleton(java.lang.Byte p0,V p1,it.unimi.dsi.fastutil.bytes.ByteComparator p2){
return Byte2ObjectSortedMaps.singleton(p0,p1,p2);
}
public static <V> it.unimi.dsi.fastutil.bytes.Byte2ObjectSortedMap<V> singleton(byte p0,V p1,it.unimi.dsi.fastutil.bytes.ByteComparator p2){
return Byte2ObjectSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.bytes.Byte2ShortSortedMap singleton(java.lang.Byte p0,java.lang.Short p1,it.unimi.dsi.fastutil.bytes.ByteComparator p2){
return Byte2ShortSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.bytes.Byte2ShortSortedMap singleton(byte p0,short p1,it.unimi.dsi.fastutil.bytes.ByteComparator p2){
return Byte2ShortSortedMaps.singleton(p0,p1,p2);
}
public static int binarySearch(byte[] p0,byte p1,it.unimi.dsi.fastutil.bytes.ByteComparator p2){
return ByteArrays.binarySearch(p0,p1,p2);
}
public static int binarySearch(byte[] p0,int p1,int p2,byte p3,it.unimi.dsi.fastutil.bytes.ByteComparator p4){
return ByteArrays.binarySearch(p0,p1,p2,p3,p4);
}
public static void mergeSort(byte[] p0,it.unimi.dsi.fastutil.bytes.ByteComparator p1){
 ByteArrays.mergeSort(p0,p1);
}
public static void mergeSort(byte[] p0,int p1,int p2,it.unimi.dsi.fastutil.bytes.ByteComparator p3){
 ByteArrays.mergeSort(p0,p1,p2,p3);
}
public static void mergeSort(byte[] p0,int p1,int p2,it.unimi.dsi.fastutil.bytes.ByteComparator p3,byte[] p4){
 ByteArrays.mergeSort(p0,p1,p2,p3,p4);
}
public static void quickSort(byte[] p0,it.unimi.dsi.fastutil.bytes.ByteComparator p1){
 ByteArrays.quickSort(p0,p1);
}
public static void quickSort(byte[] p0,int p1,int p2,it.unimi.dsi.fastutil.bytes.ByteComparator p3){
 ByteArrays.quickSort(p0,p1,p2,p3);
}
public static void parallelQuickSort(byte[] p0,it.unimi.dsi.fastutil.bytes.ByteComparator p1){
 ByteArrays.parallelQuickSort(p0,p1);
}
public static void parallelQuickSort(byte[] p0,int p1,int p2,it.unimi.dsi.fastutil.bytes.ByteComparator p3){
 ByteArrays.parallelQuickSort(p0,p1,p2,p3);
}
public static long binarySearch(byte[][] p0,long p1,long p2,byte p3,it.unimi.dsi.fastutil.bytes.ByteComparator p4){
return ByteBigArrays.binarySearch(p0,p1,p2,p3,p4);
}
public static long binarySearch(byte[][] p0,byte p1,it.unimi.dsi.fastutil.bytes.ByteComparator p2){
return ByteBigArrays.binarySearch(p0,p1,p2);
}
public static void quickSort(byte[][] p0,it.unimi.dsi.fastutil.bytes.ByteComparator p1){
 ByteBigArrays.quickSort(p0,p1);
}
public static void quickSort(byte[][] p0,long p1,long p2,it.unimi.dsi.fastutil.bytes.ByteComparator p3){
 ByteBigArrays.quickSort(p0,p1,p2,p3);
}
public static it.unimi.dsi.fastutil.bytes.ByteComparator oppositeComparator(it.unimi.dsi.fastutil.bytes.ByteComparator p0){
return ByteComparators.oppositeComparator(p0);
}
public static it.unimi.dsi.fastutil.bytes.ByteComparator asByteComparator(java.util.Comparator<? super java.lang.Byte> p0){
return ByteComparators.asByteComparator(p0);
}
public static void makeHeap(byte[] p0,int p1,it.unimi.dsi.fastutil.bytes.ByteComparator p2){
 ByteHeaps.makeHeap(p0,p1,p2);
}
public static int downHeap(byte[] p0,int p1,int p2,it.unimi.dsi.fastutil.bytes.ByteComparator p3){
return ByteHeaps.downHeap(p0,p1,p2,p3);
}
public static int upHeap(byte[] p0,int p1,int p2,it.unimi.dsi.fastutil.bytes.ByteComparator p3){
return ByteHeaps.upHeap(p0,p1,p2,p3);
}
public static void makeHeap(byte[] p0,int p1,int p2,int[] p3,int[] p4,it.unimi.dsi.fastutil.bytes.ByteComparator p5){
 ByteIndirectHeaps.makeHeap(p0,p1,p2,p3,p4,p5);
}
public static void makeHeap(byte[] p0,int[] p1,int[] p2,int p3,it.unimi.dsi.fastutil.bytes.ByteComparator p4){
 ByteIndirectHeaps.makeHeap(p0,p1,p2,p3,p4);
}
public static int downHeap(byte[] p0,int[] p1,int[] p2,int p3,int p4,it.unimi.dsi.fastutil.bytes.ByteComparator p5){
return ByteIndirectHeaps.downHeap(p0,p1,p2,p3,p4,p5);
}
public static int upHeap(byte[] p0,int[] p1,int[] p2,int p3,int p4,it.unimi.dsi.fastutil.bytes.ByteComparator p5){
return ByteIndirectHeaps.upHeap(p0,p1,p2,p3,p4,p5);
}
public static int[] makeHeap(byte[] p0,int p1,int p2,it.unimi.dsi.fastutil.bytes.ByteComparator p3){
return ByteSemiIndirectHeaps.makeHeap(p0,p1,p2,p3);
}
public static void makeHeap(byte[] p0,int p1,int p2,int[] p3,it.unimi.dsi.fastutil.bytes.ByteComparator p4){
 ByteSemiIndirectHeaps.makeHeap(p0,p1,p2,p3,p4);
}
public static void makeHeap(byte[] p0,int[] p1,int p2,it.unimi.dsi.fastutil.bytes.ByteComparator p3){
 ByteSemiIndirectHeaps.makeHeap(p0,p1,p2,p3);
}
public static int downHeap(byte[] p0,int[] p1,int p2,int p3,it.unimi.dsi.fastutil.bytes.ByteComparator p4){
return ByteSemiIndirectHeaps.downHeap(p0,p1,p2,p3,p4);
}
public static int upHeap(byte[] p0,int[] p1,int p2,int p3,it.unimi.dsi.fastutil.bytes.ByteComparator p4){
return ByteSemiIndirectHeaps.upHeap(p0,p1,p2,p3,p4);
}
public static int front(byte[] p0,int[] p1,int p2,int[] p3,it.unimi.dsi.fastutil.bytes.ByteComparator p4){
return ByteSemiIndirectHeaps.front(p0,p1,p2,p3,p4);
}
public static it.unimi.dsi.fastutil.bytes.ByteSortedSet singleton(java.lang.Object p0,it.unimi.dsi.fastutil.bytes.ByteComparator p1){
return ByteSortedSets.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.bytes.ByteSortedSet singleton(byte p0,it.unimi.dsi.fastutil.bytes.ByteComparator p1){
return ByteSortedSets.singleton(p0,p1);
}
}
