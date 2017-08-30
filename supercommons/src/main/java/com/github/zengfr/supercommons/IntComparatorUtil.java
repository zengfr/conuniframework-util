package com.github.zengfr.supercommons;
import java.util.*;
import java.util.Map.Entry;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class IntComparatorUtil{ 
/**
*public static it.unimi.dsi.fastutil.ints.IntComparator it.unimi.dsi.fastutil.ints.IntComparators.asIntComparator(java.util.Comparator<? super java.lang.Integer>)
*/ 
public static it.unimi.dsi.fastutil.ints.IntComparator asIntComparator(java.util.Comparator<? super java.lang.Integer> p0){
	return it.unimi.dsi.fastutil.ints.IntComparators.asIntComparator(p0);
}
/**
*public static int it.unimi.dsi.fastutil.ints.IntArrays.binarySearch(int[],int,it.unimi.dsi.fastutil.ints.IntComparator)
*/ 
public static int binarySearch(int[] p0,int p1,it.unimi.dsi.fastutil.ints.IntComparator p2){
	return it.unimi.dsi.fastutil.ints.IntArrays.binarySearch(p0,p1,p2);
}
/**
*public static int it.unimi.dsi.fastutil.ints.IntArrays.binarySearch(int[],int,int,int,it.unimi.dsi.fastutil.ints.IntComparator)
*/ 
public static int binarySearch(int[] p0,int p1,int p2,int p3,it.unimi.dsi.fastutil.ints.IntComparator p4){
	return it.unimi.dsi.fastutil.ints.IntArrays.binarySearch(p0,p1,p2,p3,p4);
}
/**
*public static long it.unimi.dsi.fastutil.ints.IntBigArrays.binarySearch(int[][],long,long,int,it.unimi.dsi.fastutil.ints.IntComparator)
*/ 
public static long binarySearch(int[][] p0,long p1,long p2,int p3,it.unimi.dsi.fastutil.ints.IntComparator p4){
	return it.unimi.dsi.fastutil.ints.IntBigArrays.binarySearch(p0,p1,p2,p3,p4);
}
/**
*public static long it.unimi.dsi.fastutil.ints.IntBigArrays.binarySearch(int[][],int,it.unimi.dsi.fastutil.ints.IntComparator)
*/ 
public static long binarySearch(int[][] p0,int p1,it.unimi.dsi.fastutil.ints.IntComparator p2){
	return it.unimi.dsi.fastutil.ints.IntBigArrays.binarySearch(p0,p1,p2);
}
/**
*public static int it.unimi.dsi.fastutil.ints.IntHeaps.downHeap(int[],int,int,it.unimi.dsi.fastutil.ints.IntComparator)
*/ 
public static int downHeap(int[] p0,int p1,int p2,it.unimi.dsi.fastutil.ints.IntComparator p3){
	return it.unimi.dsi.fastutil.ints.IntHeaps.downHeap(p0,p1,p2,p3);
}
/**
*public static int it.unimi.dsi.fastutil.ints.IntIndirectHeaps.downHeap(int[],int[],int[],int,int,it.unimi.dsi.fastutil.ints.IntComparator)
*/ 
public static int downHeap(int[] p0,int[] p1,int[] p2,int p3,int p4,it.unimi.dsi.fastutil.ints.IntComparator p5){
	return it.unimi.dsi.fastutil.ints.IntIndirectHeaps.downHeap(p0,p1,p2,p3,p4,p5);
}
/**
*public static int it.unimi.dsi.fastutil.ints.IntSemiIndirectHeaps.downHeap(int[],int[],int,int,it.unimi.dsi.fastutil.ints.IntComparator)
*/ 
public static int downHeap(int[] p0,int[] p1,int p2,int p3,it.unimi.dsi.fastutil.ints.IntComparator p4){
	return it.unimi.dsi.fastutil.ints.IntSemiIndirectHeaps.downHeap(p0,p1,p2,p3,p4);
}
/**
*public static java.util.Comparator<? super java.util.Map.java.util.Map$Entry<java.lang.Integer, ?>> it.unimi.dsi.fastutil.ints.Int2BooleanSortedMaps.entryComparator(it.unimi.dsi.fastutil.ints.IntComparator)
*/ 
public static java.util.Comparator<? super Entry<java.lang.Integer, ?>> entryComparator(it.unimi.dsi.fastutil.ints.IntComparator p0){
	return it.unimi.dsi.fastutil.ints.Int2BooleanSortedMaps.entryComparator(p0);
}
/**
*public static int it.unimi.dsi.fastutil.ints.IntSemiIndirectHeaps.front(int[],int[],int,int[],it.unimi.dsi.fastutil.ints.IntComparator)
*/ 
public static int front(int[] p0,int[] p1,int p2,int[] p3,it.unimi.dsi.fastutil.ints.IntComparator p4){
	return it.unimi.dsi.fastutil.ints.IntSemiIndirectHeaps.front(p0,p1,p2,p3,p4);
}
/**
*public static void it.unimi.dsi.fastutil.ints.IntHeaps.makeHeap(int[],int,it.unimi.dsi.fastutil.ints.IntComparator)
*/ 
public static void makeHeap(int[] p0,int p1,it.unimi.dsi.fastutil.ints.IntComparator p2){
	 it.unimi.dsi.fastutil.ints.IntHeaps.makeHeap(p0,p1,p2);
}
/**
*public static void it.unimi.dsi.fastutil.ints.IntIndirectHeaps.makeHeap(int[],int,int,int[],int[],it.unimi.dsi.fastutil.ints.IntComparator)
*/ 
public static void makeHeap(int[] p0,int p1,int p2,int[] p3,int[] p4,it.unimi.dsi.fastutil.ints.IntComparator p5){
	 it.unimi.dsi.fastutil.ints.IntIndirectHeaps.makeHeap(p0,p1,p2,p3,p4,p5);
}
/**
*public static void it.unimi.dsi.fastutil.ints.IntIndirectHeaps.makeHeap(int[],int[],int[],int,it.unimi.dsi.fastutil.ints.IntComparator)
*/ 
public static void makeHeap(int[] p0,int[] p1,int[] p2,int p3,it.unimi.dsi.fastutil.ints.IntComparator p4){
	 it.unimi.dsi.fastutil.ints.IntIndirectHeaps.makeHeap(p0,p1,p2,p3,p4);
}
/**
*public static int[] it.unimi.dsi.fastutil.ints.IntSemiIndirectHeaps.makeHeap(int[],int,int,it.unimi.dsi.fastutil.ints.IntComparator)
*/ 
public static int[] makeHeap(int[] p0,int p1,int p2,it.unimi.dsi.fastutil.ints.IntComparator p3){
	return it.unimi.dsi.fastutil.ints.IntSemiIndirectHeaps.makeHeap(p0,p1,p2,p3);
}
/**
*public static void it.unimi.dsi.fastutil.ints.IntSemiIndirectHeaps.makeHeap(int[],int[],int,it.unimi.dsi.fastutil.ints.IntComparator)
*/ 
public static void makeHeap(int[] p0,int[] p1,int p2,it.unimi.dsi.fastutil.ints.IntComparator p3){
	 it.unimi.dsi.fastutil.ints.IntSemiIndirectHeaps.makeHeap(p0,p1,p2,p3);
}
/**
*public static void it.unimi.dsi.fastutil.ints.IntSemiIndirectHeaps.makeHeap(int[],int,int,int[],it.unimi.dsi.fastutil.ints.IntComparator)
*/ 
public static void makeHeap(int[] p0,int p1,int p2,int[] p3,it.unimi.dsi.fastutil.ints.IntComparator p4){
	 it.unimi.dsi.fastutil.ints.IntSemiIndirectHeaps.makeHeap(p0,p1,p2,p3,p4);
}
/**
*public static void it.unimi.dsi.fastutil.Arrays.mergeSort(int,int,it.unimi.dsi.fastutil.ints.IntComparator,it.unimi.dsi.fastutil.Swapper)
*/ 
public static void mergeSort(int p0,int p1,it.unimi.dsi.fastutil.ints.IntComparator p2,it.unimi.dsi.fastutil.Swapper p3){
	 it.unimi.dsi.fastutil.Arrays.mergeSort(p0,p1,p2,p3);
}
/**
*public static void it.unimi.dsi.fastutil.ints.IntArrays.mergeSort(int[],it.unimi.dsi.fastutil.ints.IntComparator)
*/ 
public static void mergeSort(int[] p0,it.unimi.dsi.fastutil.ints.IntComparator p1){
	 it.unimi.dsi.fastutil.ints.IntArrays.mergeSort(p0,p1);
}
/**
*public static void it.unimi.dsi.fastutil.ints.IntArrays.mergeSort(int[],int,int,it.unimi.dsi.fastutil.ints.IntComparator)
*/ 
public static void mergeSort(int[] p0,int p1,int p2,it.unimi.dsi.fastutil.ints.IntComparator p3){
	 it.unimi.dsi.fastutil.ints.IntArrays.mergeSort(p0,p1,p2,p3);
}
/**
*public static void it.unimi.dsi.fastutil.ints.IntArrays.mergeSort(int[],int,int,it.unimi.dsi.fastutil.ints.IntComparator,int[])
*/ 
public static void mergeSort(int[] p0,int p1,int p2,it.unimi.dsi.fastutil.ints.IntComparator p3,int... p4){
	 it.unimi.dsi.fastutil.ints.IntArrays.mergeSort(p0,p1,p2,p3,p4);
}
/**
*public static it.unimi.dsi.fastutil.ints.IntComparator it.unimi.dsi.fastutil.ints.IntComparators.oppositeComparator(it.unimi.dsi.fastutil.ints.IntComparator)
*/ 
public static it.unimi.dsi.fastutil.ints.IntComparator oppositeComparator(it.unimi.dsi.fastutil.ints.IntComparator p0){
	return it.unimi.dsi.fastutil.ints.IntComparators.oppositeComparator(p0);
}
/**
*public static void it.unimi.dsi.fastutil.Arrays.parallelQuickSort(int,int,it.unimi.dsi.fastutil.ints.IntComparator,it.unimi.dsi.fastutil.Swapper)
*/ 
public static void parallelQuickSort(int p0,int p1,it.unimi.dsi.fastutil.ints.IntComparator p2,it.unimi.dsi.fastutil.Swapper p3){
	 it.unimi.dsi.fastutil.Arrays.parallelQuickSort(p0,p1,p2,p3);
}
/**
*public static void it.unimi.dsi.fastutil.ints.IntArrays.parallelQuickSort(int[],int,int,it.unimi.dsi.fastutil.ints.IntComparator)
*/ 
public static void parallelQuickSort(int[] p0,int p1,int p2,it.unimi.dsi.fastutil.ints.IntComparator p3){
	 it.unimi.dsi.fastutil.ints.IntArrays.parallelQuickSort(p0,p1,p2,p3);
}
/**
*public static void it.unimi.dsi.fastutil.ints.IntArrays.parallelQuickSort(int[],it.unimi.dsi.fastutil.ints.IntComparator)
*/ 
public static void parallelQuickSort(int[] p0,it.unimi.dsi.fastutil.ints.IntComparator p1){
	 it.unimi.dsi.fastutil.ints.IntArrays.parallelQuickSort(p0,p1);
}
/**
*public static void it.unimi.dsi.fastutil.Arrays.quickSort(int,int,it.unimi.dsi.fastutil.ints.IntComparator,it.unimi.dsi.fastutil.Swapper)
*/ 
public static void quickSort(int p0,int p1,it.unimi.dsi.fastutil.ints.IntComparator p2,it.unimi.dsi.fastutil.Swapper p3){
	 it.unimi.dsi.fastutil.Arrays.quickSort(p0,p1,p2,p3);
}
/**
*public static void it.unimi.dsi.fastutil.ints.IntArrays.quickSort(int[],it.unimi.dsi.fastutil.ints.IntComparator)
*/ 
public static void quickSort(int[] p0,it.unimi.dsi.fastutil.ints.IntComparator p1){
	 it.unimi.dsi.fastutil.ints.IntArrays.quickSort(p0,p1);
}
/**
*public static void it.unimi.dsi.fastutil.ints.IntArrays.quickSort(int[],int,int,it.unimi.dsi.fastutil.ints.IntComparator)
*/ 
public static void quickSort(int[] p0,int p1,int p2,it.unimi.dsi.fastutil.ints.IntComparator p3){
	 it.unimi.dsi.fastutil.ints.IntArrays.quickSort(p0,p1,p2,p3);
}
/**
*public static void it.unimi.dsi.fastutil.ints.IntBigArrays.quickSort(int[][],it.unimi.dsi.fastutil.ints.IntComparator)
*/ 
public static void quickSort(int[][] p0,it.unimi.dsi.fastutil.ints.IntComparator p1){
	 it.unimi.dsi.fastutil.ints.IntBigArrays.quickSort(p0,p1);
}
/**
*public static void it.unimi.dsi.fastutil.ints.IntBigArrays.quickSort(int[][],long,long,it.unimi.dsi.fastutil.ints.IntComparator)
*/ 
public static void quickSort(int[][] p0,long p1,long p2,it.unimi.dsi.fastutil.ints.IntComparator p3){
	 it.unimi.dsi.fastutil.ints.IntBigArrays.quickSort(p0,p1,p2,p3);
}
/**
*public static it.unimi.dsi.fastutil.ints.Int2BooleanSortedMap it.unimi.dsi.fastutil.ints.Int2BooleanSortedMaps.singleton(java.lang.Integer,java.lang.Boolean,it.unimi.dsi.fastutil.ints.IntComparator)
*/ 
public static it.unimi.dsi.fastutil.ints.Int2BooleanSortedMap singleton(java.lang.Integer p0,java.lang.Boolean p1,it.unimi.dsi.fastutil.ints.IntComparator p2){
	return it.unimi.dsi.fastutil.ints.Int2BooleanSortedMaps.singleton(p0,p1,p2);
}
/**
*public static it.unimi.dsi.fastutil.ints.Int2BooleanSortedMap it.unimi.dsi.fastutil.ints.Int2BooleanSortedMaps.singleton(int,boolean,it.unimi.dsi.fastutil.ints.IntComparator)
*/ 
public static it.unimi.dsi.fastutil.ints.Int2BooleanSortedMap singleton(int p0,boolean p1,it.unimi.dsi.fastutil.ints.IntComparator p2){
	return it.unimi.dsi.fastutil.ints.Int2BooleanSortedMaps.singleton(p0,p1,p2);
}
/**
*public static it.unimi.dsi.fastutil.ints.Int2ByteSortedMap it.unimi.dsi.fastutil.ints.Int2ByteSortedMaps.singleton(java.lang.Integer,java.lang.Byte,it.unimi.dsi.fastutil.ints.IntComparator)
*/ 
public static it.unimi.dsi.fastutil.ints.Int2ByteSortedMap singleton(java.lang.Integer p0,java.lang.Byte p1,it.unimi.dsi.fastutil.ints.IntComparator p2){
	return it.unimi.dsi.fastutil.ints.Int2ByteSortedMaps.singleton(p0,p1,p2);
}
/**
*public static it.unimi.dsi.fastutil.ints.Int2ByteSortedMap it.unimi.dsi.fastutil.ints.Int2ByteSortedMaps.singleton(int,byte,it.unimi.dsi.fastutil.ints.IntComparator)
*/ 
public static it.unimi.dsi.fastutil.ints.Int2ByteSortedMap singleton(int p0,byte p1,it.unimi.dsi.fastutil.ints.IntComparator p2){
	return it.unimi.dsi.fastutil.ints.Int2ByteSortedMaps.singleton(p0,p1,p2);
}
/**
*public static it.unimi.dsi.fastutil.ints.Int2CharSortedMap it.unimi.dsi.fastutil.ints.Int2CharSortedMaps.singleton(java.lang.Integer,java.lang.Character,it.unimi.dsi.fastutil.ints.IntComparator)
*/ 
public static it.unimi.dsi.fastutil.ints.Int2CharSortedMap singleton(java.lang.Integer p0,java.lang.Character p1,it.unimi.dsi.fastutil.ints.IntComparator p2){
	return it.unimi.dsi.fastutil.ints.Int2CharSortedMaps.singleton(p0,p1,p2);
}
/**
*public static it.unimi.dsi.fastutil.ints.Int2CharSortedMap it.unimi.dsi.fastutil.ints.Int2CharSortedMaps.singleton(int,char,it.unimi.dsi.fastutil.ints.IntComparator)
*/ 
public static it.unimi.dsi.fastutil.ints.Int2CharSortedMap singleton(int p0,char p1,it.unimi.dsi.fastutil.ints.IntComparator p2){
	return it.unimi.dsi.fastutil.ints.Int2CharSortedMaps.singleton(p0,p1,p2);
}
/**
*public static it.unimi.dsi.fastutil.ints.Int2DoubleSortedMap it.unimi.dsi.fastutil.ints.Int2DoubleSortedMaps.singleton(java.lang.Integer,java.lang.Double,it.unimi.dsi.fastutil.ints.IntComparator)
*/ 
public static it.unimi.dsi.fastutil.ints.Int2DoubleSortedMap singleton(java.lang.Integer p0,java.lang.Double p1,it.unimi.dsi.fastutil.ints.IntComparator p2){
	return it.unimi.dsi.fastutil.ints.Int2DoubleSortedMaps.singleton(p0,p1,p2);
}
/**
*public static it.unimi.dsi.fastutil.ints.Int2DoubleSortedMap it.unimi.dsi.fastutil.ints.Int2DoubleSortedMaps.singleton(int,double,it.unimi.dsi.fastutil.ints.IntComparator)
*/ 
public static it.unimi.dsi.fastutil.ints.Int2DoubleSortedMap singleton(int p0,double p1,it.unimi.dsi.fastutil.ints.IntComparator p2){
	return it.unimi.dsi.fastutil.ints.Int2DoubleSortedMaps.singleton(p0,p1,p2);
}
/**
*public static it.unimi.dsi.fastutil.ints.Int2FloatSortedMap it.unimi.dsi.fastutil.ints.Int2FloatSortedMaps.singleton(java.lang.Integer,java.lang.Float,it.unimi.dsi.fastutil.ints.IntComparator)
*/ 
public static it.unimi.dsi.fastutil.ints.Int2FloatSortedMap singleton(java.lang.Integer p0,java.lang.Float p1,it.unimi.dsi.fastutil.ints.IntComparator p2){
	return it.unimi.dsi.fastutil.ints.Int2FloatSortedMaps.singleton(p0,p1,p2);
}
/**
*public static it.unimi.dsi.fastutil.ints.Int2FloatSortedMap it.unimi.dsi.fastutil.ints.Int2FloatSortedMaps.singleton(int,float,it.unimi.dsi.fastutil.ints.IntComparator)
*/ 
public static it.unimi.dsi.fastutil.ints.Int2FloatSortedMap singleton(int p0,float p1,it.unimi.dsi.fastutil.ints.IntComparator p2){
	return it.unimi.dsi.fastutil.ints.Int2FloatSortedMaps.singleton(p0,p1,p2);
}
/**
*public static it.unimi.dsi.fastutil.ints.Int2IntSortedMap it.unimi.dsi.fastutil.ints.Int2IntSortedMaps.singleton(java.lang.Integer,java.lang.Integer,it.unimi.dsi.fastutil.ints.IntComparator)
*/ 
public static it.unimi.dsi.fastutil.ints.Int2IntSortedMap singleton(java.lang.Integer p0,java.lang.Integer p1,it.unimi.dsi.fastutil.ints.IntComparator p2){
	return it.unimi.dsi.fastutil.ints.Int2IntSortedMaps.singleton(p0,p1,p2);
}
/**
*public static it.unimi.dsi.fastutil.ints.Int2IntSortedMap it.unimi.dsi.fastutil.ints.Int2IntSortedMaps.singleton(int,int,it.unimi.dsi.fastutil.ints.IntComparator)
*/ 
public static it.unimi.dsi.fastutil.ints.Int2IntSortedMap singleton(int p0,int p1,it.unimi.dsi.fastutil.ints.IntComparator p2){
	return it.unimi.dsi.fastutil.ints.Int2IntSortedMaps.singleton(p0,p1,p2);
}
/**
*public static it.unimi.dsi.fastutil.ints.Int2LongSortedMap it.unimi.dsi.fastutil.ints.Int2LongSortedMaps.singleton(java.lang.Integer,java.lang.Long,it.unimi.dsi.fastutil.ints.IntComparator)
*/ 
public static it.unimi.dsi.fastutil.ints.Int2LongSortedMap singleton(java.lang.Integer p0,java.lang.Long p1,it.unimi.dsi.fastutil.ints.IntComparator p2){
	return it.unimi.dsi.fastutil.ints.Int2LongSortedMaps.singleton(p0,p1,p2);
}
/**
*public static it.unimi.dsi.fastutil.ints.Int2LongSortedMap it.unimi.dsi.fastutil.ints.Int2LongSortedMaps.singleton(int,long,it.unimi.dsi.fastutil.ints.IntComparator)
*/ 
public static it.unimi.dsi.fastutil.ints.Int2LongSortedMap singleton(int p0,long p1,it.unimi.dsi.fastutil.ints.IntComparator p2){
	return it.unimi.dsi.fastutil.ints.Int2LongSortedMaps.singleton(p0,p1,p2);
}
/**
*public static <V> it.unimi.dsi.fastutil.ints.Int2ObjectSortedMap<V> it.unimi.dsi.fastutil.ints.Int2ObjectSortedMaps.singleton(java.lang.Integer,V,it.unimi.dsi.fastutil.ints.IntComparator)
*/ 
public static <V> it.unimi.dsi.fastutil.ints.Int2ObjectSortedMap<V> singleton(java.lang.Integer p0,V p1,it.unimi.dsi.fastutil.ints.IntComparator p2){
	return it.unimi.dsi.fastutil.ints.Int2ObjectSortedMaps.singleton(p0,p1,p2);
}
/**
*public static <V> it.unimi.dsi.fastutil.ints.Int2ObjectSortedMap<V> it.unimi.dsi.fastutil.ints.Int2ObjectSortedMaps.singleton(int,V,it.unimi.dsi.fastutil.ints.IntComparator)
*/ 
public static <V> it.unimi.dsi.fastutil.ints.Int2ObjectSortedMap<V> singleton(int p0,V p1,it.unimi.dsi.fastutil.ints.IntComparator p2){
	return it.unimi.dsi.fastutil.ints.Int2ObjectSortedMaps.singleton(p0,p1,p2);
}
/**
*public static it.unimi.dsi.fastutil.ints.Int2ShortSortedMap it.unimi.dsi.fastutil.ints.Int2ShortSortedMaps.singleton(java.lang.Integer,java.lang.Short,it.unimi.dsi.fastutil.ints.IntComparator)
*/ 
public static it.unimi.dsi.fastutil.ints.Int2ShortSortedMap singleton(java.lang.Integer p0,java.lang.Short p1,it.unimi.dsi.fastutil.ints.IntComparator p2){
	return it.unimi.dsi.fastutil.ints.Int2ShortSortedMaps.singleton(p0,p1,p2);
}
/**
*public static it.unimi.dsi.fastutil.ints.Int2ShortSortedMap it.unimi.dsi.fastutil.ints.Int2ShortSortedMaps.singleton(int,short,it.unimi.dsi.fastutil.ints.IntComparator)
*/ 
public static it.unimi.dsi.fastutil.ints.Int2ShortSortedMap singleton(int p0,short p1,it.unimi.dsi.fastutil.ints.IntComparator p2){
	return it.unimi.dsi.fastutil.ints.Int2ShortSortedMaps.singleton(p0,p1,p2);
}
/**
*public static it.unimi.dsi.fastutil.ints.IntSortedSet it.unimi.dsi.fastutil.ints.IntSortedSets.singleton(java.lang.Object,it.unimi.dsi.fastutil.ints.IntComparator)
*/ 
public static it.unimi.dsi.fastutil.ints.IntSortedSet singleton(java.lang.Object p0,it.unimi.dsi.fastutil.ints.IntComparator p1){
	return it.unimi.dsi.fastutil.ints.IntSortedSets.singleton(p0,p1);
}
/**
*public static it.unimi.dsi.fastutil.ints.IntSortedSet it.unimi.dsi.fastutil.ints.IntSortedSets.singleton(int,it.unimi.dsi.fastutil.ints.IntComparator)
*/ 
public static it.unimi.dsi.fastutil.ints.IntSortedSet singleton(int p0,it.unimi.dsi.fastutil.ints.IntComparator p1){
	return it.unimi.dsi.fastutil.ints.IntSortedSets.singleton(p0,p1);
}
/**
*public static int it.unimi.dsi.fastutil.ints.IntHeaps.upHeap(int[],int,int,it.unimi.dsi.fastutil.ints.IntComparator)
*/ 
public static int upHeap(int[] p0,int p1,int p2,it.unimi.dsi.fastutil.ints.IntComparator p3){
	return it.unimi.dsi.fastutil.ints.IntHeaps.upHeap(p0,p1,p2,p3);
}
/**
*public static int it.unimi.dsi.fastutil.ints.IntIndirectHeaps.upHeap(int[],int[],int[],int,int,it.unimi.dsi.fastutil.ints.IntComparator)
*/ 
public static int upHeap(int[] p0,int[] p1,int[] p2,int p3,int p4,it.unimi.dsi.fastutil.ints.IntComparator p5){
	return it.unimi.dsi.fastutil.ints.IntIndirectHeaps.upHeap(p0,p1,p2,p3,p4,p5);
}
/**
*public static int it.unimi.dsi.fastutil.ints.IntSemiIndirectHeaps.upHeap(int[],int[],int,int,it.unimi.dsi.fastutil.ints.IntComparator)
*/ 
public static int upHeap(int[] p0,int[] p1,int p2,int p3,it.unimi.dsi.fastutil.ints.IntComparator p4){
	return it.unimi.dsi.fastutil.ints.IntSemiIndirectHeaps.upHeap(p0,p1,p2,p3,p4);
}
}
