package com.github.zengfr.conuniframework.util;
import java.util.*;
import java.util.Map.Entry;
import com.google.common.collect.Table;
import com.google.common.collect.Table.Cell;
/**
* @author zengfr
* @author https://github.com/zengfr/conuniframework-util
* @author https://gitee.com/zengfr/conuniframework-util
* @author  http://blog.csdn.net/zfrong/
* @author zengfr3000@qq.com
*/
public final class ShortComparatorUtil{ 
/**
*{@link it.unimi.dsi.fastutil.shorts.ShortComparators#asShortComparator(java.util.Comparator<? super java.lang.Short>)}
*@see it.unimi.dsi.fastutil.shorts.ShortComparators#asShortComparator(java.util.Comparator<? super java.lang.Short>)
*<code>public static it.unimi.dsi.fastutil.shorts.ShortComparator it.unimi.dsi.fastutil.shorts.ShortComparators.asShortComparator(java.util.Comparator<? super java.lang.Short>)
*asShortComparator(java.util.Comparator<? super java.lang.Short> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.shorts.ShortComparator asShortComparator(java.util.Comparator<? super java.lang.Short> p0){
	return it.unimi.dsi.fastutil.shorts.ShortComparators.asShortComparator(p0);
}
/**
*{@link it.unimi.dsi.fastutil.shorts.ShortArrays#binarySearch(short[],short,it.unimi.dsi.fastutil.shorts.ShortComparator)}
*@see it.unimi.dsi.fastutil.shorts.ShortArrays#binarySearch(short[],short,it.unimi.dsi.fastutil.shorts.ShortComparator)
*<code>public static int it.unimi.dsi.fastutil.shorts.ShortArrays.binarySearch(short[],short,it.unimi.dsi.fastutil.shorts.ShortComparator)
*binarySearch(short[] p0,short p1,it.unimi.dsi.fastutil.shorts.ShortComparator p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int binarySearch(short[] p0,short p1,it.unimi.dsi.fastutil.shorts.ShortComparator p2){
	return it.unimi.dsi.fastutil.shorts.ShortArrays.binarySearch(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.shorts.ShortArrays#binarySearch(short[],int,int,short,it.unimi.dsi.fastutil.shorts.ShortComparator)}
*@see it.unimi.dsi.fastutil.shorts.ShortArrays#binarySearch(short[],int,int,short,it.unimi.dsi.fastutil.shorts.ShortComparator)
*<code>public static int it.unimi.dsi.fastutil.shorts.ShortArrays.binarySearch(short[],int,int,short,it.unimi.dsi.fastutil.shorts.ShortComparator)
*binarySearch(short[] p0,int p1,int p2,short p3,it.unimi.dsi.fastutil.shorts.ShortComparator p4)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int binarySearch(short[] p0,int p1,int p2,short p3,it.unimi.dsi.fastutil.shorts.ShortComparator p4){
	return it.unimi.dsi.fastutil.shorts.ShortArrays.binarySearch(p0,p1,p2,p3,p4);
}
/**
*{@link it.unimi.dsi.fastutil.shorts.ShortBigArrays#binarySearch(short[][],long,long,short,it.unimi.dsi.fastutil.shorts.ShortComparator)}
*@see it.unimi.dsi.fastutil.shorts.ShortBigArrays#binarySearch(short[][],long,long,short,it.unimi.dsi.fastutil.shorts.ShortComparator)
*<code>public static long it.unimi.dsi.fastutil.shorts.ShortBigArrays.binarySearch(short[][],long,long,short,it.unimi.dsi.fastutil.shorts.ShortComparator)
*binarySearch(short[][] p0,long p1,long p2,short p3,it.unimi.dsi.fastutil.shorts.ShortComparator p4)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static long binarySearch(short[][] p0,long p1,long p2,short p3,it.unimi.dsi.fastutil.shorts.ShortComparator p4){
	return it.unimi.dsi.fastutil.shorts.ShortBigArrays.binarySearch(p0,p1,p2,p3,p4);
}
/**
*{@link it.unimi.dsi.fastutil.shorts.ShortBigArrays#binarySearch(short[][],short,it.unimi.dsi.fastutil.shorts.ShortComparator)}
*@see it.unimi.dsi.fastutil.shorts.ShortBigArrays#binarySearch(short[][],short,it.unimi.dsi.fastutil.shorts.ShortComparator)
*<code>public static long it.unimi.dsi.fastutil.shorts.ShortBigArrays.binarySearch(short[][],short,it.unimi.dsi.fastutil.shorts.ShortComparator)
*binarySearch(short[][] p0,short p1,it.unimi.dsi.fastutil.shorts.ShortComparator p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static long binarySearch(short[][] p0,short p1,it.unimi.dsi.fastutil.shorts.ShortComparator p2){
	return it.unimi.dsi.fastutil.shorts.ShortBigArrays.binarySearch(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.shorts.ShortHeaps#downHeap(short[],int,int,it.unimi.dsi.fastutil.shorts.ShortComparator)}
*@see it.unimi.dsi.fastutil.shorts.ShortHeaps#downHeap(short[],int,int,it.unimi.dsi.fastutil.shorts.ShortComparator)
*<code>public static int it.unimi.dsi.fastutil.shorts.ShortHeaps.downHeap(short[],int,int,it.unimi.dsi.fastutil.shorts.ShortComparator)
*downHeap(short[] p0,int p1,int p2,it.unimi.dsi.fastutil.shorts.ShortComparator p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int downHeap(short[] p0,int p1,int p2,it.unimi.dsi.fastutil.shorts.ShortComparator p3){
	return it.unimi.dsi.fastutil.shorts.ShortHeaps.downHeap(p0,p1,p2,p3);
}
/**
*{@link it.unimi.dsi.fastutil.shorts.ShortIndirectHeaps#downHeap(short[],int[],int[],int,int,it.unimi.dsi.fastutil.shorts.ShortComparator)}
*@see it.unimi.dsi.fastutil.shorts.ShortIndirectHeaps#downHeap(short[],int[],int[],int,int,it.unimi.dsi.fastutil.shorts.ShortComparator)
*<code>public static int it.unimi.dsi.fastutil.shorts.ShortIndirectHeaps.downHeap(short[],int[],int[],int,int,it.unimi.dsi.fastutil.shorts.ShortComparator)
*downHeap(short[] p0,int[] p1,int[] p2,int p3,int p4,it.unimi.dsi.fastutil.shorts.ShortComparator p5)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int downHeap(short[] p0,int[] p1,int[] p2,int p3,int p4,it.unimi.dsi.fastutil.shorts.ShortComparator p5){
	return it.unimi.dsi.fastutil.shorts.ShortIndirectHeaps.downHeap(p0,p1,p2,p3,p4,p5);
}
/**
*{@link it.unimi.dsi.fastutil.shorts.ShortSemiIndirectHeaps#downHeap(short[],int[],int,int,it.unimi.dsi.fastutil.shorts.ShortComparator)}
*@see it.unimi.dsi.fastutil.shorts.ShortSemiIndirectHeaps#downHeap(short[],int[],int,int,it.unimi.dsi.fastutil.shorts.ShortComparator)
*<code>public static int it.unimi.dsi.fastutil.shorts.ShortSemiIndirectHeaps.downHeap(short[],int[],int,int,it.unimi.dsi.fastutil.shorts.ShortComparator)
*downHeap(short[] p0,int[] p1,int p2,int p3,it.unimi.dsi.fastutil.shorts.ShortComparator p4)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int downHeap(short[] p0,int[] p1,int p2,int p3,it.unimi.dsi.fastutil.shorts.ShortComparator p4){
	return it.unimi.dsi.fastutil.shorts.ShortSemiIndirectHeaps.downHeap(p0,p1,p2,p3,p4);
}
/**
*{@link it.unimi.dsi.fastutil.shorts.Short2BooleanSortedMaps#entryComparator(it.unimi.dsi.fastutil.shorts.ShortComparator)}
*@see it.unimi.dsi.fastutil.shorts.Short2BooleanSortedMaps#entryComparator(it.unimi.dsi.fastutil.shorts.ShortComparator)
*<code>public static java.util.Comparator<? super java.util.Map$Entry<java.lang.Short, ?>> it.unimi.dsi.fastutil.shorts.Short2BooleanSortedMaps.entryComparator(it.unimi.dsi.fastutil.shorts.ShortComparator)
*entryComparator(it.unimi.dsi.fastutil.shorts.ShortComparator p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Comparator<? super java.util.Map.Entry<java.lang.Short, ?>> entryComparator(it.unimi.dsi.fastutil.shorts.ShortComparator p0){
	return it.unimi.dsi.fastutil.shorts.Short2BooleanSortedMaps.entryComparator(p0);
}
/**
*{@link it.unimi.dsi.fastutil.shorts.ShortSemiIndirectHeaps#front(short[],int[],int,int[],it.unimi.dsi.fastutil.shorts.ShortComparator)}
*@see it.unimi.dsi.fastutil.shorts.ShortSemiIndirectHeaps#front(short[],int[],int,int[],it.unimi.dsi.fastutil.shorts.ShortComparator)
*<code>public static int it.unimi.dsi.fastutil.shorts.ShortSemiIndirectHeaps.front(short[],int[],int,int[],it.unimi.dsi.fastutil.shorts.ShortComparator)
*front(short[] p0,int[] p1,int p2,int[] p3,it.unimi.dsi.fastutil.shorts.ShortComparator p4)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int front(short[] p0,int[] p1,int p2,int[] p3,it.unimi.dsi.fastutil.shorts.ShortComparator p4){
	return it.unimi.dsi.fastutil.shorts.ShortSemiIndirectHeaps.front(p0,p1,p2,p3,p4);
}
/**
*{@link it.unimi.dsi.fastutil.shorts.ShortHeaps#makeHeap(short[],int,it.unimi.dsi.fastutil.shorts.ShortComparator)}
*@see it.unimi.dsi.fastutil.shorts.ShortHeaps#makeHeap(short[],int,it.unimi.dsi.fastutil.shorts.ShortComparator)
*<code>public static void it.unimi.dsi.fastutil.shorts.ShortHeaps.makeHeap(short[],int,it.unimi.dsi.fastutil.shorts.ShortComparator)
*makeHeap(short[] p0,int p1,it.unimi.dsi.fastutil.shorts.ShortComparator p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void makeHeap(short[] p0,int p1,it.unimi.dsi.fastutil.shorts.ShortComparator p2){
	 it.unimi.dsi.fastutil.shorts.ShortHeaps.makeHeap(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.shorts.ShortIndirectHeaps#makeHeap(short[],int,int,int[],int[],it.unimi.dsi.fastutil.shorts.ShortComparator)}
*@see it.unimi.dsi.fastutil.shorts.ShortIndirectHeaps#makeHeap(short[],int,int,int[],int[],it.unimi.dsi.fastutil.shorts.ShortComparator)
*<code>public static void it.unimi.dsi.fastutil.shorts.ShortIndirectHeaps.makeHeap(short[],int,int,int[],int[],it.unimi.dsi.fastutil.shorts.ShortComparator)
*makeHeap(short[] p0,int p1,int p2,int[] p3,int[] p4,it.unimi.dsi.fastutil.shorts.ShortComparator p5)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void makeHeap(short[] p0,int p1,int p2,int[] p3,int[] p4,it.unimi.dsi.fastutil.shorts.ShortComparator p5){
	 it.unimi.dsi.fastutil.shorts.ShortIndirectHeaps.makeHeap(p0,p1,p2,p3,p4,p5);
}
/**
*{@link it.unimi.dsi.fastutil.shorts.ShortIndirectHeaps#makeHeap(short[],int[],int[],int,it.unimi.dsi.fastutil.shorts.ShortComparator)}
*@see it.unimi.dsi.fastutil.shorts.ShortIndirectHeaps#makeHeap(short[],int[],int[],int,it.unimi.dsi.fastutil.shorts.ShortComparator)
*<code>public static void it.unimi.dsi.fastutil.shorts.ShortIndirectHeaps.makeHeap(short[],int[],int[],int,it.unimi.dsi.fastutil.shorts.ShortComparator)
*makeHeap(short[] p0,int[] p1,int[] p2,int p3,it.unimi.dsi.fastutil.shorts.ShortComparator p4)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void makeHeap(short[] p0,int[] p1,int[] p2,int p3,it.unimi.dsi.fastutil.shorts.ShortComparator p4){
	 it.unimi.dsi.fastutil.shorts.ShortIndirectHeaps.makeHeap(p0,p1,p2,p3,p4);
}
/**
*{@link it.unimi.dsi.fastutil.shorts.ShortSemiIndirectHeaps#makeHeap(short[],int,int,it.unimi.dsi.fastutil.shorts.ShortComparator)}
*@see it.unimi.dsi.fastutil.shorts.ShortSemiIndirectHeaps#makeHeap(short[],int,int,it.unimi.dsi.fastutil.shorts.ShortComparator)
*<code>public static int[] it.unimi.dsi.fastutil.shorts.ShortSemiIndirectHeaps.makeHeap(short[],int,int,it.unimi.dsi.fastutil.shorts.ShortComparator)
*makeHeap(short[] p0,int p1,int p2,it.unimi.dsi.fastutil.shorts.ShortComparator p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int[] makeHeap(short[] p0,int p1,int p2,it.unimi.dsi.fastutil.shorts.ShortComparator p3){
	return it.unimi.dsi.fastutil.shorts.ShortSemiIndirectHeaps.makeHeap(p0,p1,p2,p3);
}
/**
*{@link it.unimi.dsi.fastutil.shorts.ShortSemiIndirectHeaps#makeHeap(short[],int[],int,it.unimi.dsi.fastutil.shorts.ShortComparator)}
*@see it.unimi.dsi.fastutil.shorts.ShortSemiIndirectHeaps#makeHeap(short[],int[],int,it.unimi.dsi.fastutil.shorts.ShortComparator)
*<code>public static void it.unimi.dsi.fastutil.shorts.ShortSemiIndirectHeaps.makeHeap(short[],int[],int,it.unimi.dsi.fastutil.shorts.ShortComparator)
*makeHeap(short[] p0,int[] p1,int p2,it.unimi.dsi.fastutil.shorts.ShortComparator p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void makeHeap(short[] p0,int[] p1,int p2,it.unimi.dsi.fastutil.shorts.ShortComparator p3){
	 it.unimi.dsi.fastutil.shorts.ShortSemiIndirectHeaps.makeHeap(p0,p1,p2,p3);
}
/**
*{@link it.unimi.dsi.fastutil.shorts.ShortSemiIndirectHeaps#makeHeap(short[],int,int,int[],it.unimi.dsi.fastutil.shorts.ShortComparator)}
*@see it.unimi.dsi.fastutil.shorts.ShortSemiIndirectHeaps#makeHeap(short[],int,int,int[],it.unimi.dsi.fastutil.shorts.ShortComparator)
*<code>public static void it.unimi.dsi.fastutil.shorts.ShortSemiIndirectHeaps.makeHeap(short[],int,int,int[],it.unimi.dsi.fastutil.shorts.ShortComparator)
*makeHeap(short[] p0,int p1,int p2,int[] p3,it.unimi.dsi.fastutil.shorts.ShortComparator p4)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void makeHeap(short[] p0,int p1,int p2,int[] p3,it.unimi.dsi.fastutil.shorts.ShortComparator p4){
	 it.unimi.dsi.fastutil.shorts.ShortSemiIndirectHeaps.makeHeap(p0,p1,p2,p3,p4);
}
/**
*{@link it.unimi.dsi.fastutil.shorts.ShortArrays#mergeSort(short[],int,int,it.unimi.dsi.fastutil.shorts.ShortComparator,short...)}
*@see it.unimi.dsi.fastutil.shorts.ShortArrays#mergeSort(short[],int,int,it.unimi.dsi.fastutil.shorts.ShortComparator,short...)
*<code>public static void it.unimi.dsi.fastutil.shorts.ShortArrays.mergeSort(short[],int,int,it.unimi.dsi.fastutil.shorts.ShortComparator,short[])
*mergeSort(short[] p0,int p1,int p2,it.unimi.dsi.fastutil.shorts.ShortComparator p3,short... p4)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void mergeSort(short[] p0,int p1,int p2,it.unimi.dsi.fastutil.shorts.ShortComparator p3,short... p4){
	 it.unimi.dsi.fastutil.shorts.ShortArrays.mergeSort(p0,p1,p2,p3,p4);
}
/**
*{@link it.unimi.dsi.fastutil.shorts.ShortArrays#mergeSort(short[],int,int,it.unimi.dsi.fastutil.shorts.ShortComparator)}
*@see it.unimi.dsi.fastutil.shorts.ShortArrays#mergeSort(short[],int,int,it.unimi.dsi.fastutil.shorts.ShortComparator)
*<code>public static void it.unimi.dsi.fastutil.shorts.ShortArrays.mergeSort(short[],int,int,it.unimi.dsi.fastutil.shorts.ShortComparator)
*mergeSort(short[] p0,int p1,int p2,it.unimi.dsi.fastutil.shorts.ShortComparator p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void mergeSort(short[] p0,int p1,int p2,it.unimi.dsi.fastutil.shorts.ShortComparator p3){
	 it.unimi.dsi.fastutil.shorts.ShortArrays.mergeSort(p0,p1,p2,p3);
}
/**
*{@link it.unimi.dsi.fastutil.shorts.ShortArrays#mergeSort(short[],it.unimi.dsi.fastutil.shorts.ShortComparator)}
*@see it.unimi.dsi.fastutil.shorts.ShortArrays#mergeSort(short[],it.unimi.dsi.fastutil.shorts.ShortComparator)
*<code>public static void it.unimi.dsi.fastutil.shorts.ShortArrays.mergeSort(short[],it.unimi.dsi.fastutil.shorts.ShortComparator)
*mergeSort(short[] p0,it.unimi.dsi.fastutil.shorts.ShortComparator p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void mergeSort(short[] p0,it.unimi.dsi.fastutil.shorts.ShortComparator p1){
	 it.unimi.dsi.fastutil.shorts.ShortArrays.mergeSort(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.shorts.ShortComparators#oppositeComparator(it.unimi.dsi.fastutil.shorts.ShortComparator)}
*@see it.unimi.dsi.fastutil.shorts.ShortComparators#oppositeComparator(it.unimi.dsi.fastutil.shorts.ShortComparator)
*<code>public static it.unimi.dsi.fastutil.shorts.ShortComparator it.unimi.dsi.fastutil.shorts.ShortComparators.oppositeComparator(it.unimi.dsi.fastutil.shorts.ShortComparator)
*oppositeComparator(it.unimi.dsi.fastutil.shorts.ShortComparator p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.shorts.ShortComparator oppositeComparator(it.unimi.dsi.fastutil.shorts.ShortComparator p0){
	return it.unimi.dsi.fastutil.shorts.ShortComparators.oppositeComparator(p0);
}
/**
*{@link it.unimi.dsi.fastutil.shorts.ShortArrays#parallelQuickSort(short[],it.unimi.dsi.fastutil.shorts.ShortComparator)}
*@see it.unimi.dsi.fastutil.shorts.ShortArrays#parallelQuickSort(short[],it.unimi.dsi.fastutil.shorts.ShortComparator)
*<code>public static void it.unimi.dsi.fastutil.shorts.ShortArrays.parallelQuickSort(short[],it.unimi.dsi.fastutil.shorts.ShortComparator)
*parallelQuickSort(short[] p0,it.unimi.dsi.fastutil.shorts.ShortComparator p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void parallelQuickSort(short[] p0,it.unimi.dsi.fastutil.shorts.ShortComparator p1){
	 it.unimi.dsi.fastutil.shorts.ShortArrays.parallelQuickSort(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.shorts.ShortArrays#parallelQuickSort(short[],int,int,it.unimi.dsi.fastutil.shorts.ShortComparator)}
*@see it.unimi.dsi.fastutil.shorts.ShortArrays#parallelQuickSort(short[],int,int,it.unimi.dsi.fastutil.shorts.ShortComparator)
*<code>public static void it.unimi.dsi.fastutil.shorts.ShortArrays.parallelQuickSort(short[],int,int,it.unimi.dsi.fastutil.shorts.ShortComparator)
*parallelQuickSort(short[] p0,int p1,int p2,it.unimi.dsi.fastutil.shorts.ShortComparator p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void parallelQuickSort(short[] p0,int p1,int p2,it.unimi.dsi.fastutil.shorts.ShortComparator p3){
	 it.unimi.dsi.fastutil.shorts.ShortArrays.parallelQuickSort(p0,p1,p2,p3);
}
/**
*{@link it.unimi.dsi.fastutil.shorts.ShortArrays#quickSort(short[],it.unimi.dsi.fastutil.shorts.ShortComparator)}
*@see it.unimi.dsi.fastutil.shorts.ShortArrays#quickSort(short[],it.unimi.dsi.fastutil.shorts.ShortComparator)
*<code>public static void it.unimi.dsi.fastutil.shorts.ShortArrays.quickSort(short[],it.unimi.dsi.fastutil.shorts.ShortComparator)
*quickSort(short[] p0,it.unimi.dsi.fastutil.shorts.ShortComparator p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void quickSort(short[] p0,it.unimi.dsi.fastutil.shorts.ShortComparator p1){
	 it.unimi.dsi.fastutil.shorts.ShortArrays.quickSort(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.shorts.ShortArrays#quickSort(short[],int,int,it.unimi.dsi.fastutil.shorts.ShortComparator)}
*@see it.unimi.dsi.fastutil.shorts.ShortArrays#quickSort(short[],int,int,it.unimi.dsi.fastutil.shorts.ShortComparator)
*<code>public static void it.unimi.dsi.fastutil.shorts.ShortArrays.quickSort(short[],int,int,it.unimi.dsi.fastutil.shorts.ShortComparator)
*quickSort(short[] p0,int p1,int p2,it.unimi.dsi.fastutil.shorts.ShortComparator p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void quickSort(short[] p0,int p1,int p2,it.unimi.dsi.fastutil.shorts.ShortComparator p3){
	 it.unimi.dsi.fastutil.shorts.ShortArrays.quickSort(p0,p1,p2,p3);
}
/**
*{@link it.unimi.dsi.fastutil.shorts.ShortBigArrays#quickSort(short[][],long,long,it.unimi.dsi.fastutil.shorts.ShortComparator)}
*@see it.unimi.dsi.fastutil.shorts.ShortBigArrays#quickSort(short[][],long,long,it.unimi.dsi.fastutil.shorts.ShortComparator)
*<code>public static void it.unimi.dsi.fastutil.shorts.ShortBigArrays.quickSort(short[][],long,long,it.unimi.dsi.fastutil.shorts.ShortComparator)
*quickSort(short[][] p0,long p1,long p2,it.unimi.dsi.fastutil.shorts.ShortComparator p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void quickSort(short[][] p0,long p1,long p2,it.unimi.dsi.fastutil.shorts.ShortComparator p3){
	 it.unimi.dsi.fastutil.shorts.ShortBigArrays.quickSort(p0,p1,p2,p3);
}
/**
*{@link it.unimi.dsi.fastutil.shorts.ShortBigArrays#quickSort(short[][],it.unimi.dsi.fastutil.shorts.ShortComparator)}
*@see it.unimi.dsi.fastutil.shorts.ShortBigArrays#quickSort(short[][],it.unimi.dsi.fastutil.shorts.ShortComparator)
*<code>public static void it.unimi.dsi.fastutil.shorts.ShortBigArrays.quickSort(short[][],it.unimi.dsi.fastutil.shorts.ShortComparator)
*quickSort(short[][] p0,it.unimi.dsi.fastutil.shorts.ShortComparator p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void quickSort(short[][] p0,it.unimi.dsi.fastutil.shorts.ShortComparator p1){
	 it.unimi.dsi.fastutil.shorts.ShortBigArrays.quickSort(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.shorts.Short2BooleanSortedMaps#singleton(java.lang.Short,java.lang.Boolean,it.unimi.dsi.fastutil.shorts.ShortComparator)}
*@see it.unimi.dsi.fastutil.shorts.Short2BooleanSortedMaps#singleton(java.lang.Short,java.lang.Boolean,it.unimi.dsi.fastutil.shorts.ShortComparator)
*<code>public static it.unimi.dsi.fastutil.shorts.Short2BooleanSortedMap it.unimi.dsi.fastutil.shorts.Short2BooleanSortedMaps.singleton(java.lang.Short,java.lang.Boolean,it.unimi.dsi.fastutil.shorts.ShortComparator)
*singleton(java.lang.Short p0,java.lang.Boolean p1,it.unimi.dsi.fastutil.shorts.ShortComparator p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.shorts.Short2BooleanSortedMap singleton(java.lang.Short p0,java.lang.Boolean p1,it.unimi.dsi.fastutil.shorts.ShortComparator p2){
	return it.unimi.dsi.fastutil.shorts.Short2BooleanSortedMaps.singleton(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.shorts.Short2BooleanSortedMaps#singleton(short,boolean,it.unimi.dsi.fastutil.shorts.ShortComparator)}
*@see it.unimi.dsi.fastutil.shorts.Short2BooleanSortedMaps#singleton(short,boolean,it.unimi.dsi.fastutil.shorts.ShortComparator)
*<code>public static it.unimi.dsi.fastutil.shorts.Short2BooleanSortedMap it.unimi.dsi.fastutil.shorts.Short2BooleanSortedMaps.singleton(short,boolean,it.unimi.dsi.fastutil.shorts.ShortComparator)
*singleton(short p0,boolean p1,it.unimi.dsi.fastutil.shorts.ShortComparator p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.shorts.Short2BooleanSortedMap singleton(short p0,boolean p1,it.unimi.dsi.fastutil.shorts.ShortComparator p2){
	return it.unimi.dsi.fastutil.shorts.Short2BooleanSortedMaps.singleton(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.shorts.Short2ByteSortedMaps#singleton(java.lang.Short,java.lang.Byte,it.unimi.dsi.fastutil.shorts.ShortComparator)}
*@see it.unimi.dsi.fastutil.shorts.Short2ByteSortedMaps#singleton(java.lang.Short,java.lang.Byte,it.unimi.dsi.fastutil.shorts.ShortComparator)
*<code>public static it.unimi.dsi.fastutil.shorts.Short2ByteSortedMap it.unimi.dsi.fastutil.shorts.Short2ByteSortedMaps.singleton(java.lang.Short,java.lang.Byte,it.unimi.dsi.fastutil.shorts.ShortComparator)
*singleton(java.lang.Short p0,java.lang.Byte p1,it.unimi.dsi.fastutil.shorts.ShortComparator p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.shorts.Short2ByteSortedMap singleton(java.lang.Short p0,java.lang.Byte p1,it.unimi.dsi.fastutil.shorts.ShortComparator p2){
	return it.unimi.dsi.fastutil.shorts.Short2ByteSortedMaps.singleton(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.shorts.Short2ByteSortedMaps#singleton(short,byte,it.unimi.dsi.fastutil.shorts.ShortComparator)}
*@see it.unimi.dsi.fastutil.shorts.Short2ByteSortedMaps#singleton(short,byte,it.unimi.dsi.fastutil.shorts.ShortComparator)
*<code>public static it.unimi.dsi.fastutil.shorts.Short2ByteSortedMap it.unimi.dsi.fastutil.shorts.Short2ByteSortedMaps.singleton(short,byte,it.unimi.dsi.fastutil.shorts.ShortComparator)
*singleton(short p0,byte p1,it.unimi.dsi.fastutil.shorts.ShortComparator p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.shorts.Short2ByteSortedMap singleton(short p0,byte p1,it.unimi.dsi.fastutil.shorts.ShortComparator p2){
	return it.unimi.dsi.fastutil.shorts.Short2ByteSortedMaps.singleton(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.shorts.Short2CharSortedMaps#singleton(java.lang.Short,java.lang.Character,it.unimi.dsi.fastutil.shorts.ShortComparator)}
*@see it.unimi.dsi.fastutil.shorts.Short2CharSortedMaps#singleton(java.lang.Short,java.lang.Character,it.unimi.dsi.fastutil.shorts.ShortComparator)
*<code>public static it.unimi.dsi.fastutil.shorts.Short2CharSortedMap it.unimi.dsi.fastutil.shorts.Short2CharSortedMaps.singleton(java.lang.Short,java.lang.Character,it.unimi.dsi.fastutil.shorts.ShortComparator)
*singleton(java.lang.Short p0,java.lang.Character p1,it.unimi.dsi.fastutil.shorts.ShortComparator p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.shorts.Short2CharSortedMap singleton(java.lang.Short p0,java.lang.Character p1,it.unimi.dsi.fastutil.shorts.ShortComparator p2){
	return it.unimi.dsi.fastutil.shorts.Short2CharSortedMaps.singleton(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.shorts.Short2CharSortedMaps#singleton(short,char,it.unimi.dsi.fastutil.shorts.ShortComparator)}
*@see it.unimi.dsi.fastutil.shorts.Short2CharSortedMaps#singleton(short,char,it.unimi.dsi.fastutil.shorts.ShortComparator)
*<code>public static it.unimi.dsi.fastutil.shorts.Short2CharSortedMap it.unimi.dsi.fastutil.shorts.Short2CharSortedMaps.singleton(short,char,it.unimi.dsi.fastutil.shorts.ShortComparator)
*singleton(short p0,char p1,it.unimi.dsi.fastutil.shorts.ShortComparator p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.shorts.Short2CharSortedMap singleton(short p0,char p1,it.unimi.dsi.fastutil.shorts.ShortComparator p2){
	return it.unimi.dsi.fastutil.shorts.Short2CharSortedMaps.singleton(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.shorts.Short2DoubleSortedMaps#singleton(java.lang.Short,java.lang.Double,it.unimi.dsi.fastutil.shorts.ShortComparator)}
*@see it.unimi.dsi.fastutil.shorts.Short2DoubleSortedMaps#singleton(java.lang.Short,java.lang.Double,it.unimi.dsi.fastutil.shorts.ShortComparator)
*<code>public static it.unimi.dsi.fastutil.shorts.Short2DoubleSortedMap it.unimi.dsi.fastutil.shorts.Short2DoubleSortedMaps.singleton(java.lang.Short,java.lang.Double,it.unimi.dsi.fastutil.shorts.ShortComparator)
*singleton(java.lang.Short p0,java.lang.Double p1,it.unimi.dsi.fastutil.shorts.ShortComparator p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.shorts.Short2DoubleSortedMap singleton(java.lang.Short p0,java.lang.Double p1,it.unimi.dsi.fastutil.shorts.ShortComparator p2){
	return it.unimi.dsi.fastutil.shorts.Short2DoubleSortedMaps.singleton(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.shorts.Short2DoubleSortedMaps#singleton(short,double,it.unimi.dsi.fastutil.shorts.ShortComparator)}
*@see it.unimi.dsi.fastutil.shorts.Short2DoubleSortedMaps#singleton(short,double,it.unimi.dsi.fastutil.shorts.ShortComparator)
*<code>public static it.unimi.dsi.fastutil.shorts.Short2DoubleSortedMap it.unimi.dsi.fastutil.shorts.Short2DoubleSortedMaps.singleton(short,double,it.unimi.dsi.fastutil.shorts.ShortComparator)
*singleton(short p0,double p1,it.unimi.dsi.fastutil.shorts.ShortComparator p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.shorts.Short2DoubleSortedMap singleton(short p0,double p1,it.unimi.dsi.fastutil.shorts.ShortComparator p2){
	return it.unimi.dsi.fastutil.shorts.Short2DoubleSortedMaps.singleton(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.shorts.Short2FloatSortedMaps#singleton(java.lang.Short,java.lang.Float,it.unimi.dsi.fastutil.shorts.ShortComparator)}
*@see it.unimi.dsi.fastutil.shorts.Short2FloatSortedMaps#singleton(java.lang.Short,java.lang.Float,it.unimi.dsi.fastutil.shorts.ShortComparator)
*<code>public static it.unimi.dsi.fastutil.shorts.Short2FloatSortedMap it.unimi.dsi.fastutil.shorts.Short2FloatSortedMaps.singleton(java.lang.Short,java.lang.Float,it.unimi.dsi.fastutil.shorts.ShortComparator)
*singleton(java.lang.Short p0,java.lang.Float p1,it.unimi.dsi.fastutil.shorts.ShortComparator p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.shorts.Short2FloatSortedMap singleton(java.lang.Short p0,java.lang.Float p1,it.unimi.dsi.fastutil.shorts.ShortComparator p2){
	return it.unimi.dsi.fastutil.shorts.Short2FloatSortedMaps.singleton(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.shorts.Short2FloatSortedMaps#singleton(short,float,it.unimi.dsi.fastutil.shorts.ShortComparator)}
*@see it.unimi.dsi.fastutil.shorts.Short2FloatSortedMaps#singleton(short,float,it.unimi.dsi.fastutil.shorts.ShortComparator)
*<code>public static it.unimi.dsi.fastutil.shorts.Short2FloatSortedMap it.unimi.dsi.fastutil.shorts.Short2FloatSortedMaps.singleton(short,float,it.unimi.dsi.fastutil.shorts.ShortComparator)
*singleton(short p0,float p1,it.unimi.dsi.fastutil.shorts.ShortComparator p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.shorts.Short2FloatSortedMap singleton(short p0,float p1,it.unimi.dsi.fastutil.shorts.ShortComparator p2){
	return it.unimi.dsi.fastutil.shorts.Short2FloatSortedMaps.singleton(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.shorts.Short2IntSortedMaps#singleton(java.lang.Short,java.lang.Integer,it.unimi.dsi.fastutil.shorts.ShortComparator)}
*@see it.unimi.dsi.fastutil.shorts.Short2IntSortedMaps#singleton(java.lang.Short,java.lang.Integer,it.unimi.dsi.fastutil.shorts.ShortComparator)
*<code>public static it.unimi.dsi.fastutil.shorts.Short2IntSortedMap it.unimi.dsi.fastutil.shorts.Short2IntSortedMaps.singleton(java.lang.Short,java.lang.Integer,it.unimi.dsi.fastutil.shorts.ShortComparator)
*singleton(java.lang.Short p0,java.lang.Integer p1,it.unimi.dsi.fastutil.shorts.ShortComparator p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.shorts.Short2IntSortedMap singleton(java.lang.Short p0,java.lang.Integer p1,it.unimi.dsi.fastutil.shorts.ShortComparator p2){
	return it.unimi.dsi.fastutil.shorts.Short2IntSortedMaps.singleton(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.shorts.Short2IntSortedMaps#singleton(short,int,it.unimi.dsi.fastutil.shorts.ShortComparator)}
*@see it.unimi.dsi.fastutil.shorts.Short2IntSortedMaps#singleton(short,int,it.unimi.dsi.fastutil.shorts.ShortComparator)
*<code>public static it.unimi.dsi.fastutil.shorts.Short2IntSortedMap it.unimi.dsi.fastutil.shorts.Short2IntSortedMaps.singleton(short,int,it.unimi.dsi.fastutil.shorts.ShortComparator)
*singleton(short p0,int p1,it.unimi.dsi.fastutil.shorts.ShortComparator p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.shorts.Short2IntSortedMap singleton(short p0,int p1,it.unimi.dsi.fastutil.shorts.ShortComparator p2){
	return it.unimi.dsi.fastutil.shorts.Short2IntSortedMaps.singleton(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.shorts.Short2LongSortedMaps#singleton(java.lang.Short,java.lang.Long,it.unimi.dsi.fastutil.shorts.ShortComparator)}
*@see it.unimi.dsi.fastutil.shorts.Short2LongSortedMaps#singleton(java.lang.Short,java.lang.Long,it.unimi.dsi.fastutil.shorts.ShortComparator)
*<code>public static it.unimi.dsi.fastutil.shorts.Short2LongSortedMap it.unimi.dsi.fastutil.shorts.Short2LongSortedMaps.singleton(java.lang.Short,java.lang.Long,it.unimi.dsi.fastutil.shorts.ShortComparator)
*singleton(java.lang.Short p0,java.lang.Long p1,it.unimi.dsi.fastutil.shorts.ShortComparator p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.shorts.Short2LongSortedMap singleton(java.lang.Short p0,java.lang.Long p1,it.unimi.dsi.fastutil.shorts.ShortComparator p2){
	return it.unimi.dsi.fastutil.shorts.Short2LongSortedMaps.singleton(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.shorts.Short2LongSortedMaps#singleton(short,long,it.unimi.dsi.fastutil.shorts.ShortComparator)}
*@see it.unimi.dsi.fastutil.shorts.Short2LongSortedMaps#singleton(short,long,it.unimi.dsi.fastutil.shorts.ShortComparator)
*<code>public static it.unimi.dsi.fastutil.shorts.Short2LongSortedMap it.unimi.dsi.fastutil.shorts.Short2LongSortedMaps.singleton(short,long,it.unimi.dsi.fastutil.shorts.ShortComparator)
*singleton(short p0,long p1,it.unimi.dsi.fastutil.shorts.ShortComparator p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.shorts.Short2LongSortedMap singleton(short p0,long p1,it.unimi.dsi.fastutil.shorts.ShortComparator p2){
	return it.unimi.dsi.fastutil.shorts.Short2LongSortedMaps.singleton(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.shorts.Short2ObjectSortedMaps#singleton(java.lang.Short,V,it.unimi.dsi.fastutil.shorts.ShortComparator)}
*@see it.unimi.dsi.fastutil.shorts.Short2ObjectSortedMaps#singleton(java.lang.Short,V,it.unimi.dsi.fastutil.shorts.ShortComparator)
*<code>public static <V> it.unimi.dsi.fastutil.shorts.Short2ObjectSortedMap<V> it.unimi.dsi.fastutil.shorts.Short2ObjectSortedMaps.singleton(java.lang.Short,V,it.unimi.dsi.fastutil.shorts.ShortComparator)
*singleton(java.lang.Short p0,V p1,it.unimi.dsi.fastutil.shorts.ShortComparator p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <V> it.unimi.dsi.fastutil.shorts.Short2ObjectSortedMap<V> singleton(java.lang.Short p0,V p1,it.unimi.dsi.fastutil.shorts.ShortComparator p2){
	return it.unimi.dsi.fastutil.shorts.Short2ObjectSortedMaps.singleton(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.shorts.Short2ObjectSortedMaps#singleton(short,V,it.unimi.dsi.fastutil.shorts.ShortComparator)}
*@see it.unimi.dsi.fastutil.shorts.Short2ObjectSortedMaps#singleton(short,V,it.unimi.dsi.fastutil.shorts.ShortComparator)
*<code>public static <V> it.unimi.dsi.fastutil.shorts.Short2ObjectSortedMap<V> it.unimi.dsi.fastutil.shorts.Short2ObjectSortedMaps.singleton(short,V,it.unimi.dsi.fastutil.shorts.ShortComparator)
*singleton(short p0,V p1,it.unimi.dsi.fastutil.shorts.ShortComparator p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <V> it.unimi.dsi.fastutil.shorts.Short2ObjectSortedMap<V> singleton(short p0,V p1,it.unimi.dsi.fastutil.shorts.ShortComparator p2){
	return it.unimi.dsi.fastutil.shorts.Short2ObjectSortedMaps.singleton(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.shorts.Short2ShortSortedMaps#singleton(java.lang.Short,java.lang.Short,it.unimi.dsi.fastutil.shorts.ShortComparator)}
*@see it.unimi.dsi.fastutil.shorts.Short2ShortSortedMaps#singleton(java.lang.Short,java.lang.Short,it.unimi.dsi.fastutil.shorts.ShortComparator)
*<code>public static it.unimi.dsi.fastutil.shorts.Short2ShortSortedMap it.unimi.dsi.fastutil.shorts.Short2ShortSortedMaps.singleton(java.lang.Short,java.lang.Short,it.unimi.dsi.fastutil.shorts.ShortComparator)
*singleton(java.lang.Short p0,java.lang.Short p1,it.unimi.dsi.fastutil.shorts.ShortComparator p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.shorts.Short2ShortSortedMap singleton(java.lang.Short p0,java.lang.Short p1,it.unimi.dsi.fastutil.shorts.ShortComparator p2){
	return it.unimi.dsi.fastutil.shorts.Short2ShortSortedMaps.singleton(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.shorts.Short2ShortSortedMaps#singleton(short,short,it.unimi.dsi.fastutil.shorts.ShortComparator)}
*@see it.unimi.dsi.fastutil.shorts.Short2ShortSortedMaps#singleton(short,short,it.unimi.dsi.fastutil.shorts.ShortComparator)
*<code>public static it.unimi.dsi.fastutil.shorts.Short2ShortSortedMap it.unimi.dsi.fastutil.shorts.Short2ShortSortedMaps.singleton(short,short,it.unimi.dsi.fastutil.shorts.ShortComparator)
*singleton(short p0,short p1,it.unimi.dsi.fastutil.shorts.ShortComparator p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.shorts.Short2ShortSortedMap singleton(short p0,short p1,it.unimi.dsi.fastutil.shorts.ShortComparator p2){
	return it.unimi.dsi.fastutil.shorts.Short2ShortSortedMaps.singleton(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.shorts.ShortSortedSets#singleton(java.lang.Object,it.unimi.dsi.fastutil.shorts.ShortComparator)}
*@see it.unimi.dsi.fastutil.shorts.ShortSortedSets#singleton(java.lang.Object,it.unimi.dsi.fastutil.shorts.ShortComparator)
*<code>public static it.unimi.dsi.fastutil.shorts.ShortSortedSet it.unimi.dsi.fastutil.shorts.ShortSortedSets.singleton(java.lang.Object,it.unimi.dsi.fastutil.shorts.ShortComparator)
*singleton(java.lang.Object p0,it.unimi.dsi.fastutil.shorts.ShortComparator p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.shorts.ShortSortedSet singleton(java.lang.Object p0,it.unimi.dsi.fastutil.shorts.ShortComparator p1){
	return it.unimi.dsi.fastutil.shorts.ShortSortedSets.singleton(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.shorts.ShortSortedSets#singleton(short,it.unimi.dsi.fastutil.shorts.ShortComparator)}
*@see it.unimi.dsi.fastutil.shorts.ShortSortedSets#singleton(short,it.unimi.dsi.fastutil.shorts.ShortComparator)
*<code>public static it.unimi.dsi.fastutil.shorts.ShortSortedSet it.unimi.dsi.fastutil.shorts.ShortSortedSets.singleton(short,it.unimi.dsi.fastutil.shorts.ShortComparator)
*singleton(short p0,it.unimi.dsi.fastutil.shorts.ShortComparator p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.shorts.ShortSortedSet singleton(short p0,it.unimi.dsi.fastutil.shorts.ShortComparator p1){
	return it.unimi.dsi.fastutil.shorts.ShortSortedSets.singleton(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.shorts.ShortArrays#stableSort(short[],it.unimi.dsi.fastutil.shorts.ShortComparator)}
*@see it.unimi.dsi.fastutil.shorts.ShortArrays#stableSort(short[],it.unimi.dsi.fastutil.shorts.ShortComparator)
*<code>public static void it.unimi.dsi.fastutil.shorts.ShortArrays.stableSort(short[],it.unimi.dsi.fastutil.shorts.ShortComparator)
*stableSort(short[] p0,it.unimi.dsi.fastutil.shorts.ShortComparator p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void stableSort(short[] p0,it.unimi.dsi.fastutil.shorts.ShortComparator p1){
	 it.unimi.dsi.fastutil.shorts.ShortArrays.stableSort(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.shorts.ShortArrays#stableSort(short[],int,int,it.unimi.dsi.fastutil.shorts.ShortComparator)}
*@see it.unimi.dsi.fastutil.shorts.ShortArrays#stableSort(short[],int,int,it.unimi.dsi.fastutil.shorts.ShortComparator)
*<code>public static void it.unimi.dsi.fastutil.shorts.ShortArrays.stableSort(short[],int,int,it.unimi.dsi.fastutil.shorts.ShortComparator)
*stableSort(short[] p0,int p1,int p2,it.unimi.dsi.fastutil.shorts.ShortComparator p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void stableSort(short[] p0,int p1,int p2,it.unimi.dsi.fastutil.shorts.ShortComparator p3){
	 it.unimi.dsi.fastutil.shorts.ShortArrays.stableSort(p0,p1,p2,p3);
}
/**
*{@link it.unimi.dsi.fastutil.shorts.ShortArrays#unstableSort(short[],int,int,it.unimi.dsi.fastutil.shorts.ShortComparator)}
*@see it.unimi.dsi.fastutil.shorts.ShortArrays#unstableSort(short[],int,int,it.unimi.dsi.fastutil.shorts.ShortComparator)
*<code>public static void it.unimi.dsi.fastutil.shorts.ShortArrays.unstableSort(short[],int,int,it.unimi.dsi.fastutil.shorts.ShortComparator)
*unstableSort(short[] p0,int p1,int p2,it.unimi.dsi.fastutil.shorts.ShortComparator p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void unstableSort(short[] p0,int p1,int p2,it.unimi.dsi.fastutil.shorts.ShortComparator p3){
	 it.unimi.dsi.fastutil.shorts.ShortArrays.unstableSort(p0,p1,p2,p3);
}
/**
*{@link it.unimi.dsi.fastutil.shorts.ShortArrays#unstableSort(short[],it.unimi.dsi.fastutil.shorts.ShortComparator)}
*@see it.unimi.dsi.fastutil.shorts.ShortArrays#unstableSort(short[],it.unimi.dsi.fastutil.shorts.ShortComparator)
*<code>public static void it.unimi.dsi.fastutil.shorts.ShortArrays.unstableSort(short[],it.unimi.dsi.fastutil.shorts.ShortComparator)
*unstableSort(short[] p0,it.unimi.dsi.fastutil.shorts.ShortComparator p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void unstableSort(short[] p0,it.unimi.dsi.fastutil.shorts.ShortComparator p1){
	 it.unimi.dsi.fastutil.shorts.ShortArrays.unstableSort(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.shorts.ShortHeaps#upHeap(short[],int,int,it.unimi.dsi.fastutil.shorts.ShortComparator)}
*@see it.unimi.dsi.fastutil.shorts.ShortHeaps#upHeap(short[],int,int,it.unimi.dsi.fastutil.shorts.ShortComparator)
*<code>public static int it.unimi.dsi.fastutil.shorts.ShortHeaps.upHeap(short[],int,int,it.unimi.dsi.fastutil.shorts.ShortComparator)
*upHeap(short[] p0,int p1,int p2,it.unimi.dsi.fastutil.shorts.ShortComparator p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int upHeap(short[] p0,int p1,int p2,it.unimi.dsi.fastutil.shorts.ShortComparator p3){
	return it.unimi.dsi.fastutil.shorts.ShortHeaps.upHeap(p0,p1,p2,p3);
}
/**
*{@link it.unimi.dsi.fastutil.shorts.ShortIndirectHeaps#upHeap(short[],int[],int[],int,int,it.unimi.dsi.fastutil.shorts.ShortComparator)}
*@see it.unimi.dsi.fastutil.shorts.ShortIndirectHeaps#upHeap(short[],int[],int[],int,int,it.unimi.dsi.fastutil.shorts.ShortComparator)
*<code>public static int it.unimi.dsi.fastutil.shorts.ShortIndirectHeaps.upHeap(short[],int[],int[],int,int,it.unimi.dsi.fastutil.shorts.ShortComparator)
*upHeap(short[] p0,int[] p1,int[] p2,int p3,int p4,it.unimi.dsi.fastutil.shorts.ShortComparator p5)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int upHeap(short[] p0,int[] p1,int[] p2,int p3,int p4,it.unimi.dsi.fastutil.shorts.ShortComparator p5){
	return it.unimi.dsi.fastutil.shorts.ShortIndirectHeaps.upHeap(p0,p1,p2,p3,p4,p5);
}
/**
*{@link it.unimi.dsi.fastutil.shorts.ShortSemiIndirectHeaps#upHeap(short[],int[],int,int,it.unimi.dsi.fastutil.shorts.ShortComparator)}
*@see it.unimi.dsi.fastutil.shorts.ShortSemiIndirectHeaps#upHeap(short[],int[],int,int,it.unimi.dsi.fastutil.shorts.ShortComparator)
*<code>public static int it.unimi.dsi.fastutil.shorts.ShortSemiIndirectHeaps.upHeap(short[],int[],int,int,it.unimi.dsi.fastutil.shorts.ShortComparator)
*upHeap(short[] p0,int[] p1,int p2,int p3,it.unimi.dsi.fastutil.shorts.ShortComparator p4)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int upHeap(short[] p0,int[] p1,int p2,int p3,it.unimi.dsi.fastutil.shorts.ShortComparator p4){
	return it.unimi.dsi.fastutil.shorts.ShortSemiIndirectHeaps.upHeap(p0,p1,p2,p3,p4);
}
}
