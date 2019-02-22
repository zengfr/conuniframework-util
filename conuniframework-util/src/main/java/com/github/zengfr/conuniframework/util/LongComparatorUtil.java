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
public final class LongComparatorUtil{ 
/**
*{@link it.unimi.dsi.fastutil.longs.LongComparators#asLongComparator(java.util.Comparator<? super java.lang.Long>)}
*@see it.unimi.dsi.fastutil.longs.LongComparators#asLongComparator(java.util.Comparator<? super java.lang.Long>)
*<code>public static it.unimi.dsi.fastutil.longs.LongComparator it.unimi.dsi.fastutil.longs.LongComparators.asLongComparator(java.util.Comparator<? super java.lang.Long>)
*asLongComparator(java.util.Comparator<? super java.lang.Long> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.longs.LongComparator asLongComparator(java.util.Comparator<? super java.lang.Long> p0){
	return it.unimi.dsi.fastutil.longs.LongComparators.asLongComparator(p0);
}
/**
*{@link it.unimi.dsi.fastutil.longs.LongArrays#binarySearch(long[],long,it.unimi.dsi.fastutil.longs.LongComparator)}
*@see it.unimi.dsi.fastutil.longs.LongArrays#binarySearch(long[],long,it.unimi.dsi.fastutil.longs.LongComparator)
*<code>public static int it.unimi.dsi.fastutil.longs.LongArrays.binarySearch(long[],long,it.unimi.dsi.fastutil.longs.LongComparator)
*binarySearch(long[] p0,long p1,it.unimi.dsi.fastutil.longs.LongComparator p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int binarySearch(long[] p0,long p1,it.unimi.dsi.fastutil.longs.LongComparator p2){
	return it.unimi.dsi.fastutil.longs.LongArrays.binarySearch(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.longs.LongArrays#binarySearch(long[],int,int,long,it.unimi.dsi.fastutil.longs.LongComparator)}
*@see it.unimi.dsi.fastutil.longs.LongArrays#binarySearch(long[],int,int,long,it.unimi.dsi.fastutil.longs.LongComparator)
*<code>public static int it.unimi.dsi.fastutil.longs.LongArrays.binarySearch(long[],int,int,long,it.unimi.dsi.fastutil.longs.LongComparator)
*binarySearch(long[] p0,int p1,int p2,long p3,it.unimi.dsi.fastutil.longs.LongComparator p4)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int binarySearch(long[] p0,int p1,int p2,long p3,it.unimi.dsi.fastutil.longs.LongComparator p4){
	return it.unimi.dsi.fastutil.longs.LongArrays.binarySearch(p0,p1,p2,p3,p4);
}
/**
*{@link it.unimi.dsi.fastutil.longs.LongBigArrays#binarySearch(long[][],long,long,long,it.unimi.dsi.fastutil.longs.LongComparator)}
*@see it.unimi.dsi.fastutil.longs.LongBigArrays#binarySearch(long[][],long,long,long,it.unimi.dsi.fastutil.longs.LongComparator)
*<code>public static long it.unimi.dsi.fastutil.longs.LongBigArrays.binarySearch(long[][],long,long,long,it.unimi.dsi.fastutil.longs.LongComparator)
*binarySearch(long[][] p0,long p1,long p2,long p3,it.unimi.dsi.fastutil.longs.LongComparator p4)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static long binarySearch(long[][] p0,long p1,long p2,long p3,it.unimi.dsi.fastutil.longs.LongComparator p4){
	return it.unimi.dsi.fastutil.longs.LongBigArrays.binarySearch(p0,p1,p2,p3,p4);
}
/**
*{@link it.unimi.dsi.fastutil.longs.LongBigArrays#binarySearch(long[][],long,it.unimi.dsi.fastutil.longs.LongComparator)}
*@see it.unimi.dsi.fastutil.longs.LongBigArrays#binarySearch(long[][],long,it.unimi.dsi.fastutil.longs.LongComparator)
*<code>public static long it.unimi.dsi.fastutil.longs.LongBigArrays.binarySearch(long[][],long,it.unimi.dsi.fastutil.longs.LongComparator)
*binarySearch(long[][] p0,long p1,it.unimi.dsi.fastutil.longs.LongComparator p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static long binarySearch(long[][] p0,long p1,it.unimi.dsi.fastutil.longs.LongComparator p2){
	return it.unimi.dsi.fastutil.longs.LongBigArrays.binarySearch(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.longs.LongHeaps#downHeap(long[],int,int,it.unimi.dsi.fastutil.longs.LongComparator)}
*@see it.unimi.dsi.fastutil.longs.LongHeaps#downHeap(long[],int,int,it.unimi.dsi.fastutil.longs.LongComparator)
*<code>public static int it.unimi.dsi.fastutil.longs.LongHeaps.downHeap(long[],int,int,it.unimi.dsi.fastutil.longs.LongComparator)
*downHeap(long[] p0,int p1,int p2,it.unimi.dsi.fastutil.longs.LongComparator p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int downHeap(long[] p0,int p1,int p2,it.unimi.dsi.fastutil.longs.LongComparator p3){
	return it.unimi.dsi.fastutil.longs.LongHeaps.downHeap(p0,p1,p2,p3);
}
/**
*{@link it.unimi.dsi.fastutil.longs.LongIndirectHeaps#downHeap(long[],int[],int[],int,int,it.unimi.dsi.fastutil.longs.LongComparator)}
*@see it.unimi.dsi.fastutil.longs.LongIndirectHeaps#downHeap(long[],int[],int[],int,int,it.unimi.dsi.fastutil.longs.LongComparator)
*<code>public static int it.unimi.dsi.fastutil.longs.LongIndirectHeaps.downHeap(long[],int[],int[],int,int,it.unimi.dsi.fastutil.longs.LongComparator)
*downHeap(long[] p0,int[] p1,int[] p2,int p3,int p4,it.unimi.dsi.fastutil.longs.LongComparator p5)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int downHeap(long[] p0,int[] p1,int[] p2,int p3,int p4,it.unimi.dsi.fastutil.longs.LongComparator p5){
	return it.unimi.dsi.fastutil.longs.LongIndirectHeaps.downHeap(p0,p1,p2,p3,p4,p5);
}
/**
*{@link it.unimi.dsi.fastutil.longs.LongSemiIndirectHeaps#downHeap(long[],int[],int,int,it.unimi.dsi.fastutil.longs.LongComparator)}
*@see it.unimi.dsi.fastutil.longs.LongSemiIndirectHeaps#downHeap(long[],int[],int,int,it.unimi.dsi.fastutil.longs.LongComparator)
*<code>public static int it.unimi.dsi.fastutil.longs.LongSemiIndirectHeaps.downHeap(long[],int[],int,int,it.unimi.dsi.fastutil.longs.LongComparator)
*downHeap(long[] p0,int[] p1,int p2,int p3,it.unimi.dsi.fastutil.longs.LongComparator p4)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int downHeap(long[] p0,int[] p1,int p2,int p3,it.unimi.dsi.fastutil.longs.LongComparator p4){
	return it.unimi.dsi.fastutil.longs.LongSemiIndirectHeaps.downHeap(p0,p1,p2,p3,p4);
}
/**
*{@link it.unimi.dsi.fastutil.longs.Long2BooleanSortedMaps#entryComparator(it.unimi.dsi.fastutil.longs.LongComparator)}
*@see it.unimi.dsi.fastutil.longs.Long2BooleanSortedMaps#entryComparator(it.unimi.dsi.fastutil.longs.LongComparator)
*<code>public static java.util.Comparator<? super java.util.Map$Entry<java.lang.Long, ?>> it.unimi.dsi.fastutil.longs.Long2BooleanSortedMaps.entryComparator(it.unimi.dsi.fastutil.longs.LongComparator)
*entryComparator(it.unimi.dsi.fastutil.longs.LongComparator p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Comparator<? super java.util.Map.Entry<java.lang.Long, ?>> entryComparator(it.unimi.dsi.fastutil.longs.LongComparator p0){
	return it.unimi.dsi.fastutil.longs.Long2BooleanSortedMaps.entryComparator(p0);
}
/**
*{@link it.unimi.dsi.fastutil.longs.LongSemiIndirectHeaps#front(long[],int[],int,int[],it.unimi.dsi.fastutil.longs.LongComparator)}
*@see it.unimi.dsi.fastutil.longs.LongSemiIndirectHeaps#front(long[],int[],int,int[],it.unimi.dsi.fastutil.longs.LongComparator)
*<code>public static int it.unimi.dsi.fastutil.longs.LongSemiIndirectHeaps.front(long[],int[],int,int[],it.unimi.dsi.fastutil.longs.LongComparator)
*front(long[] p0,int[] p1,int p2,int[] p3,it.unimi.dsi.fastutil.longs.LongComparator p4)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int front(long[] p0,int[] p1,int p2,int[] p3,it.unimi.dsi.fastutil.longs.LongComparator p4){
	return it.unimi.dsi.fastutil.longs.LongSemiIndirectHeaps.front(p0,p1,p2,p3,p4);
}
/**
*{@link it.unimi.dsi.fastutil.longs.LongHeaps#makeHeap(long[],int,it.unimi.dsi.fastutil.longs.LongComparator)}
*@see it.unimi.dsi.fastutil.longs.LongHeaps#makeHeap(long[],int,it.unimi.dsi.fastutil.longs.LongComparator)
*<code>public static void it.unimi.dsi.fastutil.longs.LongHeaps.makeHeap(long[],int,it.unimi.dsi.fastutil.longs.LongComparator)
*makeHeap(long[] p0,int p1,it.unimi.dsi.fastutil.longs.LongComparator p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void makeHeap(long[] p0,int p1,it.unimi.dsi.fastutil.longs.LongComparator p2){
	 it.unimi.dsi.fastutil.longs.LongHeaps.makeHeap(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.longs.LongIndirectHeaps#makeHeap(long[],int,int,int[],int[],it.unimi.dsi.fastutil.longs.LongComparator)}
*@see it.unimi.dsi.fastutil.longs.LongIndirectHeaps#makeHeap(long[],int,int,int[],int[],it.unimi.dsi.fastutil.longs.LongComparator)
*<code>public static void it.unimi.dsi.fastutil.longs.LongIndirectHeaps.makeHeap(long[],int,int,int[],int[],it.unimi.dsi.fastutil.longs.LongComparator)
*makeHeap(long[] p0,int p1,int p2,int[] p3,int[] p4,it.unimi.dsi.fastutil.longs.LongComparator p5)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void makeHeap(long[] p0,int p1,int p2,int[] p3,int[] p4,it.unimi.dsi.fastutil.longs.LongComparator p5){
	 it.unimi.dsi.fastutil.longs.LongIndirectHeaps.makeHeap(p0,p1,p2,p3,p4,p5);
}
/**
*{@link it.unimi.dsi.fastutil.longs.LongIndirectHeaps#makeHeap(long[],int[],int[],int,it.unimi.dsi.fastutil.longs.LongComparator)}
*@see it.unimi.dsi.fastutil.longs.LongIndirectHeaps#makeHeap(long[],int[],int[],int,it.unimi.dsi.fastutil.longs.LongComparator)
*<code>public static void it.unimi.dsi.fastutil.longs.LongIndirectHeaps.makeHeap(long[],int[],int[],int,it.unimi.dsi.fastutil.longs.LongComparator)
*makeHeap(long[] p0,int[] p1,int[] p2,int p3,it.unimi.dsi.fastutil.longs.LongComparator p4)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void makeHeap(long[] p0,int[] p1,int[] p2,int p3,it.unimi.dsi.fastutil.longs.LongComparator p4){
	 it.unimi.dsi.fastutil.longs.LongIndirectHeaps.makeHeap(p0,p1,p2,p3,p4);
}
/**
*{@link it.unimi.dsi.fastutil.longs.LongSemiIndirectHeaps#makeHeap(long[],int,int,it.unimi.dsi.fastutil.longs.LongComparator)}
*@see it.unimi.dsi.fastutil.longs.LongSemiIndirectHeaps#makeHeap(long[],int,int,it.unimi.dsi.fastutil.longs.LongComparator)
*<code>public static int[] it.unimi.dsi.fastutil.longs.LongSemiIndirectHeaps.makeHeap(long[],int,int,it.unimi.dsi.fastutil.longs.LongComparator)
*makeHeap(long[] p0,int p1,int p2,it.unimi.dsi.fastutil.longs.LongComparator p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int[] makeHeap(long[] p0,int p1,int p2,it.unimi.dsi.fastutil.longs.LongComparator p3){
	return it.unimi.dsi.fastutil.longs.LongSemiIndirectHeaps.makeHeap(p0,p1,p2,p3);
}
/**
*{@link it.unimi.dsi.fastutil.longs.LongSemiIndirectHeaps#makeHeap(long[],int[],int,it.unimi.dsi.fastutil.longs.LongComparator)}
*@see it.unimi.dsi.fastutil.longs.LongSemiIndirectHeaps#makeHeap(long[],int[],int,it.unimi.dsi.fastutil.longs.LongComparator)
*<code>public static void it.unimi.dsi.fastutil.longs.LongSemiIndirectHeaps.makeHeap(long[],int[],int,it.unimi.dsi.fastutil.longs.LongComparator)
*makeHeap(long[] p0,int[] p1,int p2,it.unimi.dsi.fastutil.longs.LongComparator p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void makeHeap(long[] p0,int[] p1,int p2,it.unimi.dsi.fastutil.longs.LongComparator p3){
	 it.unimi.dsi.fastutil.longs.LongSemiIndirectHeaps.makeHeap(p0,p1,p2,p3);
}
/**
*{@link it.unimi.dsi.fastutil.longs.LongSemiIndirectHeaps#makeHeap(long[],int,int,int[],it.unimi.dsi.fastutil.longs.LongComparator)}
*@see it.unimi.dsi.fastutil.longs.LongSemiIndirectHeaps#makeHeap(long[],int,int,int[],it.unimi.dsi.fastutil.longs.LongComparator)
*<code>public static void it.unimi.dsi.fastutil.longs.LongSemiIndirectHeaps.makeHeap(long[],int,int,int[],it.unimi.dsi.fastutil.longs.LongComparator)
*makeHeap(long[] p0,int p1,int p2,int[] p3,it.unimi.dsi.fastutil.longs.LongComparator p4)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void makeHeap(long[] p0,int p1,int p2,int[] p3,it.unimi.dsi.fastutil.longs.LongComparator p4){
	 it.unimi.dsi.fastutil.longs.LongSemiIndirectHeaps.makeHeap(p0,p1,p2,p3,p4);
}
/**
*{@link it.unimi.dsi.fastutil.BigArrays#mergeSort(long,long,it.unimi.dsi.fastutil.longs.LongComparator,it.unimi.dsi.fastutil.BigSwapper)}
*@see it.unimi.dsi.fastutil.BigArrays#mergeSort(long,long,it.unimi.dsi.fastutil.longs.LongComparator,it.unimi.dsi.fastutil.BigSwapper)
*<code>public static void it.unimi.dsi.fastutil.BigArrays.mergeSort(long,long,it.unimi.dsi.fastutil.longs.LongComparator,it.unimi.dsi.fastutil.BigSwapper)
*mergeSort(long p0,long p1,it.unimi.dsi.fastutil.longs.LongComparator p2,it.unimi.dsi.fastutil.BigSwapper p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void mergeSort(long p0,long p1,it.unimi.dsi.fastutil.longs.LongComparator p2,it.unimi.dsi.fastutil.BigSwapper p3){
	 it.unimi.dsi.fastutil.BigArrays.mergeSort(p0,p1,p2,p3);
}
/**
*{@link it.unimi.dsi.fastutil.longs.LongArrays#mergeSort(long[],int,int,it.unimi.dsi.fastutil.longs.LongComparator,long...)}
*@see it.unimi.dsi.fastutil.longs.LongArrays#mergeSort(long[],int,int,it.unimi.dsi.fastutil.longs.LongComparator,long...)
*<code>public static void it.unimi.dsi.fastutil.longs.LongArrays.mergeSort(long[],int,int,it.unimi.dsi.fastutil.longs.LongComparator,long[])
*mergeSort(long[] p0,int p1,int p2,it.unimi.dsi.fastutil.longs.LongComparator p3,long... p4)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void mergeSort(long[] p0,int p1,int p2,it.unimi.dsi.fastutil.longs.LongComparator p3,long... p4){
	 it.unimi.dsi.fastutil.longs.LongArrays.mergeSort(p0,p1,p2,p3,p4);
}
/**
*{@link it.unimi.dsi.fastutil.longs.LongArrays#mergeSort(long[],int,int,it.unimi.dsi.fastutil.longs.LongComparator)}
*@see it.unimi.dsi.fastutil.longs.LongArrays#mergeSort(long[],int,int,it.unimi.dsi.fastutil.longs.LongComparator)
*<code>public static void it.unimi.dsi.fastutil.longs.LongArrays.mergeSort(long[],int,int,it.unimi.dsi.fastutil.longs.LongComparator)
*mergeSort(long[] p0,int p1,int p2,it.unimi.dsi.fastutil.longs.LongComparator p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void mergeSort(long[] p0,int p1,int p2,it.unimi.dsi.fastutil.longs.LongComparator p3){
	 it.unimi.dsi.fastutil.longs.LongArrays.mergeSort(p0,p1,p2,p3);
}
/**
*{@link it.unimi.dsi.fastutil.longs.LongArrays#mergeSort(long[],it.unimi.dsi.fastutil.longs.LongComparator)}
*@see it.unimi.dsi.fastutil.longs.LongArrays#mergeSort(long[],it.unimi.dsi.fastutil.longs.LongComparator)
*<code>public static void it.unimi.dsi.fastutil.longs.LongArrays.mergeSort(long[],it.unimi.dsi.fastutil.longs.LongComparator)
*mergeSort(long[] p0,it.unimi.dsi.fastutil.longs.LongComparator p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void mergeSort(long[] p0,it.unimi.dsi.fastutil.longs.LongComparator p1){
	 it.unimi.dsi.fastutil.longs.LongArrays.mergeSort(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.longs.LongComparators#oppositeComparator(it.unimi.dsi.fastutil.longs.LongComparator)}
*@see it.unimi.dsi.fastutil.longs.LongComparators#oppositeComparator(it.unimi.dsi.fastutil.longs.LongComparator)
*<code>public static it.unimi.dsi.fastutil.longs.LongComparator it.unimi.dsi.fastutil.longs.LongComparators.oppositeComparator(it.unimi.dsi.fastutil.longs.LongComparator)
*oppositeComparator(it.unimi.dsi.fastutil.longs.LongComparator p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.longs.LongComparator oppositeComparator(it.unimi.dsi.fastutil.longs.LongComparator p0){
	return it.unimi.dsi.fastutil.longs.LongComparators.oppositeComparator(p0);
}
/**
*{@link it.unimi.dsi.fastutil.longs.LongArrays#parallelQuickSort(long[],it.unimi.dsi.fastutil.longs.LongComparator)}
*@see it.unimi.dsi.fastutil.longs.LongArrays#parallelQuickSort(long[],it.unimi.dsi.fastutil.longs.LongComparator)
*<code>public static void it.unimi.dsi.fastutil.longs.LongArrays.parallelQuickSort(long[],it.unimi.dsi.fastutil.longs.LongComparator)
*parallelQuickSort(long[] p0,it.unimi.dsi.fastutil.longs.LongComparator p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void parallelQuickSort(long[] p0,it.unimi.dsi.fastutil.longs.LongComparator p1){
	 it.unimi.dsi.fastutil.longs.LongArrays.parallelQuickSort(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.longs.LongArrays#parallelQuickSort(long[],int,int,it.unimi.dsi.fastutil.longs.LongComparator)}
*@see it.unimi.dsi.fastutil.longs.LongArrays#parallelQuickSort(long[],int,int,it.unimi.dsi.fastutil.longs.LongComparator)
*<code>public static void it.unimi.dsi.fastutil.longs.LongArrays.parallelQuickSort(long[],int,int,it.unimi.dsi.fastutil.longs.LongComparator)
*parallelQuickSort(long[] p0,int p1,int p2,it.unimi.dsi.fastutil.longs.LongComparator p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void parallelQuickSort(long[] p0,int p1,int p2,it.unimi.dsi.fastutil.longs.LongComparator p3){
	 it.unimi.dsi.fastutil.longs.LongArrays.parallelQuickSort(p0,p1,p2,p3);
}
/**
*{@link it.unimi.dsi.fastutil.BigArrays#quickSort(long,long,it.unimi.dsi.fastutil.longs.LongComparator,it.unimi.dsi.fastutil.BigSwapper)}
*@see it.unimi.dsi.fastutil.BigArrays#quickSort(long,long,it.unimi.dsi.fastutil.longs.LongComparator,it.unimi.dsi.fastutil.BigSwapper)
*<code>public static void it.unimi.dsi.fastutil.BigArrays.quickSort(long,long,it.unimi.dsi.fastutil.longs.LongComparator,it.unimi.dsi.fastutil.BigSwapper)
*quickSort(long p0,long p1,it.unimi.dsi.fastutil.longs.LongComparator p2,it.unimi.dsi.fastutil.BigSwapper p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void quickSort(long p0,long p1,it.unimi.dsi.fastutil.longs.LongComparator p2,it.unimi.dsi.fastutil.BigSwapper p3){
	 it.unimi.dsi.fastutil.BigArrays.quickSort(p0,p1,p2,p3);
}
/**
*{@link it.unimi.dsi.fastutil.longs.LongArrays#quickSort(long[],it.unimi.dsi.fastutil.longs.LongComparator)}
*@see it.unimi.dsi.fastutil.longs.LongArrays#quickSort(long[],it.unimi.dsi.fastutil.longs.LongComparator)
*<code>public static void it.unimi.dsi.fastutil.longs.LongArrays.quickSort(long[],it.unimi.dsi.fastutil.longs.LongComparator)
*quickSort(long[] p0,it.unimi.dsi.fastutil.longs.LongComparator p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void quickSort(long[] p0,it.unimi.dsi.fastutil.longs.LongComparator p1){
	 it.unimi.dsi.fastutil.longs.LongArrays.quickSort(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.longs.LongArrays#quickSort(long[],int,int,it.unimi.dsi.fastutil.longs.LongComparator)}
*@see it.unimi.dsi.fastutil.longs.LongArrays#quickSort(long[],int,int,it.unimi.dsi.fastutil.longs.LongComparator)
*<code>public static void it.unimi.dsi.fastutil.longs.LongArrays.quickSort(long[],int,int,it.unimi.dsi.fastutil.longs.LongComparator)
*quickSort(long[] p0,int p1,int p2,it.unimi.dsi.fastutil.longs.LongComparator p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void quickSort(long[] p0,int p1,int p2,it.unimi.dsi.fastutil.longs.LongComparator p3){
	 it.unimi.dsi.fastutil.longs.LongArrays.quickSort(p0,p1,p2,p3);
}
/**
*{@link it.unimi.dsi.fastutil.longs.LongBigArrays#quickSort(long[][],long,long,it.unimi.dsi.fastutil.longs.LongComparator)}
*@see it.unimi.dsi.fastutil.longs.LongBigArrays#quickSort(long[][],long,long,it.unimi.dsi.fastutil.longs.LongComparator)
*<code>public static void it.unimi.dsi.fastutil.longs.LongBigArrays.quickSort(long[][],long,long,it.unimi.dsi.fastutil.longs.LongComparator)
*quickSort(long[][] p0,long p1,long p2,it.unimi.dsi.fastutil.longs.LongComparator p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void quickSort(long[][] p0,long p1,long p2,it.unimi.dsi.fastutil.longs.LongComparator p3){
	 it.unimi.dsi.fastutil.longs.LongBigArrays.quickSort(p0,p1,p2,p3);
}
/**
*{@link it.unimi.dsi.fastutil.longs.LongBigArrays#quickSort(long[][],it.unimi.dsi.fastutil.longs.LongComparator)}
*@see it.unimi.dsi.fastutil.longs.LongBigArrays#quickSort(long[][],it.unimi.dsi.fastutil.longs.LongComparator)
*<code>public static void it.unimi.dsi.fastutil.longs.LongBigArrays.quickSort(long[][],it.unimi.dsi.fastutil.longs.LongComparator)
*quickSort(long[][] p0,it.unimi.dsi.fastutil.longs.LongComparator p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void quickSort(long[][] p0,it.unimi.dsi.fastutil.longs.LongComparator p1){
	 it.unimi.dsi.fastutil.longs.LongBigArrays.quickSort(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.longs.Long2BooleanSortedMaps#singleton(java.lang.Long,java.lang.Boolean,it.unimi.dsi.fastutil.longs.LongComparator)}
*@see it.unimi.dsi.fastutil.longs.Long2BooleanSortedMaps#singleton(java.lang.Long,java.lang.Boolean,it.unimi.dsi.fastutil.longs.LongComparator)
*<code>public static it.unimi.dsi.fastutil.longs.Long2BooleanSortedMap it.unimi.dsi.fastutil.longs.Long2BooleanSortedMaps.singleton(java.lang.Long,java.lang.Boolean,it.unimi.dsi.fastutil.longs.LongComparator)
*singleton(java.lang.Long p0,java.lang.Boolean p1,it.unimi.dsi.fastutil.longs.LongComparator p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.longs.Long2BooleanSortedMap singleton(java.lang.Long p0,java.lang.Boolean p1,it.unimi.dsi.fastutil.longs.LongComparator p2){
	return it.unimi.dsi.fastutil.longs.Long2BooleanSortedMaps.singleton(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.longs.Long2BooleanSortedMaps#singleton(long,boolean,it.unimi.dsi.fastutil.longs.LongComparator)}
*@see it.unimi.dsi.fastutil.longs.Long2BooleanSortedMaps#singleton(long,boolean,it.unimi.dsi.fastutil.longs.LongComparator)
*<code>public static it.unimi.dsi.fastutil.longs.Long2BooleanSortedMap it.unimi.dsi.fastutil.longs.Long2BooleanSortedMaps.singleton(long,boolean,it.unimi.dsi.fastutil.longs.LongComparator)
*singleton(long p0,boolean p1,it.unimi.dsi.fastutil.longs.LongComparator p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.longs.Long2BooleanSortedMap singleton(long p0,boolean p1,it.unimi.dsi.fastutil.longs.LongComparator p2){
	return it.unimi.dsi.fastutil.longs.Long2BooleanSortedMaps.singleton(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.longs.Long2ByteSortedMaps#singleton(java.lang.Long,java.lang.Byte,it.unimi.dsi.fastutil.longs.LongComparator)}
*@see it.unimi.dsi.fastutil.longs.Long2ByteSortedMaps#singleton(java.lang.Long,java.lang.Byte,it.unimi.dsi.fastutil.longs.LongComparator)
*<code>public static it.unimi.dsi.fastutil.longs.Long2ByteSortedMap it.unimi.dsi.fastutil.longs.Long2ByteSortedMaps.singleton(java.lang.Long,java.lang.Byte,it.unimi.dsi.fastutil.longs.LongComparator)
*singleton(java.lang.Long p0,java.lang.Byte p1,it.unimi.dsi.fastutil.longs.LongComparator p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.longs.Long2ByteSortedMap singleton(java.lang.Long p0,java.lang.Byte p1,it.unimi.dsi.fastutil.longs.LongComparator p2){
	return it.unimi.dsi.fastutil.longs.Long2ByteSortedMaps.singleton(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.longs.Long2ByteSortedMaps#singleton(long,byte,it.unimi.dsi.fastutil.longs.LongComparator)}
*@see it.unimi.dsi.fastutil.longs.Long2ByteSortedMaps#singleton(long,byte,it.unimi.dsi.fastutil.longs.LongComparator)
*<code>public static it.unimi.dsi.fastutil.longs.Long2ByteSortedMap it.unimi.dsi.fastutil.longs.Long2ByteSortedMaps.singleton(long,byte,it.unimi.dsi.fastutil.longs.LongComparator)
*singleton(long p0,byte p1,it.unimi.dsi.fastutil.longs.LongComparator p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.longs.Long2ByteSortedMap singleton(long p0,byte p1,it.unimi.dsi.fastutil.longs.LongComparator p2){
	return it.unimi.dsi.fastutil.longs.Long2ByteSortedMaps.singleton(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.longs.Long2CharSortedMaps#singleton(java.lang.Long,java.lang.Character,it.unimi.dsi.fastutil.longs.LongComparator)}
*@see it.unimi.dsi.fastutil.longs.Long2CharSortedMaps#singleton(java.lang.Long,java.lang.Character,it.unimi.dsi.fastutil.longs.LongComparator)
*<code>public static it.unimi.dsi.fastutil.longs.Long2CharSortedMap it.unimi.dsi.fastutil.longs.Long2CharSortedMaps.singleton(java.lang.Long,java.lang.Character,it.unimi.dsi.fastutil.longs.LongComparator)
*singleton(java.lang.Long p0,java.lang.Character p1,it.unimi.dsi.fastutil.longs.LongComparator p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.longs.Long2CharSortedMap singleton(java.lang.Long p0,java.lang.Character p1,it.unimi.dsi.fastutil.longs.LongComparator p2){
	return it.unimi.dsi.fastutil.longs.Long2CharSortedMaps.singleton(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.longs.Long2CharSortedMaps#singleton(long,char,it.unimi.dsi.fastutil.longs.LongComparator)}
*@see it.unimi.dsi.fastutil.longs.Long2CharSortedMaps#singleton(long,char,it.unimi.dsi.fastutil.longs.LongComparator)
*<code>public static it.unimi.dsi.fastutil.longs.Long2CharSortedMap it.unimi.dsi.fastutil.longs.Long2CharSortedMaps.singleton(long,char,it.unimi.dsi.fastutil.longs.LongComparator)
*singleton(long p0,char p1,it.unimi.dsi.fastutil.longs.LongComparator p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.longs.Long2CharSortedMap singleton(long p0,char p1,it.unimi.dsi.fastutil.longs.LongComparator p2){
	return it.unimi.dsi.fastutil.longs.Long2CharSortedMaps.singleton(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.longs.Long2DoubleSortedMaps#singleton(java.lang.Long,java.lang.Double,it.unimi.dsi.fastutil.longs.LongComparator)}
*@see it.unimi.dsi.fastutil.longs.Long2DoubleSortedMaps#singleton(java.lang.Long,java.lang.Double,it.unimi.dsi.fastutil.longs.LongComparator)
*<code>public static it.unimi.dsi.fastutil.longs.Long2DoubleSortedMap it.unimi.dsi.fastutil.longs.Long2DoubleSortedMaps.singleton(java.lang.Long,java.lang.Double,it.unimi.dsi.fastutil.longs.LongComparator)
*singleton(java.lang.Long p0,java.lang.Double p1,it.unimi.dsi.fastutil.longs.LongComparator p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.longs.Long2DoubleSortedMap singleton(java.lang.Long p0,java.lang.Double p1,it.unimi.dsi.fastutil.longs.LongComparator p2){
	return it.unimi.dsi.fastutil.longs.Long2DoubleSortedMaps.singleton(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.longs.Long2DoubleSortedMaps#singleton(long,double,it.unimi.dsi.fastutil.longs.LongComparator)}
*@see it.unimi.dsi.fastutil.longs.Long2DoubleSortedMaps#singleton(long,double,it.unimi.dsi.fastutil.longs.LongComparator)
*<code>public static it.unimi.dsi.fastutil.longs.Long2DoubleSortedMap it.unimi.dsi.fastutil.longs.Long2DoubleSortedMaps.singleton(long,double,it.unimi.dsi.fastutil.longs.LongComparator)
*singleton(long p0,double p1,it.unimi.dsi.fastutil.longs.LongComparator p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.longs.Long2DoubleSortedMap singleton(long p0,double p1,it.unimi.dsi.fastutil.longs.LongComparator p2){
	return it.unimi.dsi.fastutil.longs.Long2DoubleSortedMaps.singleton(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.longs.Long2FloatSortedMaps#singleton(java.lang.Long,java.lang.Float,it.unimi.dsi.fastutil.longs.LongComparator)}
*@see it.unimi.dsi.fastutil.longs.Long2FloatSortedMaps#singleton(java.lang.Long,java.lang.Float,it.unimi.dsi.fastutil.longs.LongComparator)
*<code>public static it.unimi.dsi.fastutil.longs.Long2FloatSortedMap it.unimi.dsi.fastutil.longs.Long2FloatSortedMaps.singleton(java.lang.Long,java.lang.Float,it.unimi.dsi.fastutil.longs.LongComparator)
*singleton(java.lang.Long p0,java.lang.Float p1,it.unimi.dsi.fastutil.longs.LongComparator p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.longs.Long2FloatSortedMap singleton(java.lang.Long p0,java.lang.Float p1,it.unimi.dsi.fastutil.longs.LongComparator p2){
	return it.unimi.dsi.fastutil.longs.Long2FloatSortedMaps.singleton(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.longs.Long2FloatSortedMaps#singleton(long,float,it.unimi.dsi.fastutil.longs.LongComparator)}
*@see it.unimi.dsi.fastutil.longs.Long2FloatSortedMaps#singleton(long,float,it.unimi.dsi.fastutil.longs.LongComparator)
*<code>public static it.unimi.dsi.fastutil.longs.Long2FloatSortedMap it.unimi.dsi.fastutil.longs.Long2FloatSortedMaps.singleton(long,float,it.unimi.dsi.fastutil.longs.LongComparator)
*singleton(long p0,float p1,it.unimi.dsi.fastutil.longs.LongComparator p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.longs.Long2FloatSortedMap singleton(long p0,float p1,it.unimi.dsi.fastutil.longs.LongComparator p2){
	return it.unimi.dsi.fastutil.longs.Long2FloatSortedMaps.singleton(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.longs.Long2IntSortedMaps#singleton(java.lang.Long,java.lang.Integer,it.unimi.dsi.fastutil.longs.LongComparator)}
*@see it.unimi.dsi.fastutil.longs.Long2IntSortedMaps#singleton(java.lang.Long,java.lang.Integer,it.unimi.dsi.fastutil.longs.LongComparator)
*<code>public static it.unimi.dsi.fastutil.longs.Long2IntSortedMap it.unimi.dsi.fastutil.longs.Long2IntSortedMaps.singleton(java.lang.Long,java.lang.Integer,it.unimi.dsi.fastutil.longs.LongComparator)
*singleton(java.lang.Long p0,java.lang.Integer p1,it.unimi.dsi.fastutil.longs.LongComparator p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.longs.Long2IntSortedMap singleton(java.lang.Long p0,java.lang.Integer p1,it.unimi.dsi.fastutil.longs.LongComparator p2){
	return it.unimi.dsi.fastutil.longs.Long2IntSortedMaps.singleton(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.longs.Long2IntSortedMaps#singleton(long,int,it.unimi.dsi.fastutil.longs.LongComparator)}
*@see it.unimi.dsi.fastutil.longs.Long2IntSortedMaps#singleton(long,int,it.unimi.dsi.fastutil.longs.LongComparator)
*<code>public static it.unimi.dsi.fastutil.longs.Long2IntSortedMap it.unimi.dsi.fastutil.longs.Long2IntSortedMaps.singleton(long,int,it.unimi.dsi.fastutil.longs.LongComparator)
*singleton(long p0,int p1,it.unimi.dsi.fastutil.longs.LongComparator p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.longs.Long2IntSortedMap singleton(long p0,int p1,it.unimi.dsi.fastutil.longs.LongComparator p2){
	return it.unimi.dsi.fastutil.longs.Long2IntSortedMaps.singleton(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.longs.Long2LongSortedMaps#singleton(java.lang.Long,java.lang.Long,it.unimi.dsi.fastutil.longs.LongComparator)}
*@see it.unimi.dsi.fastutil.longs.Long2LongSortedMaps#singleton(java.lang.Long,java.lang.Long,it.unimi.dsi.fastutil.longs.LongComparator)
*<code>public static it.unimi.dsi.fastutil.longs.Long2LongSortedMap it.unimi.dsi.fastutil.longs.Long2LongSortedMaps.singleton(java.lang.Long,java.lang.Long,it.unimi.dsi.fastutil.longs.LongComparator)
*singleton(java.lang.Long p0,java.lang.Long p1,it.unimi.dsi.fastutil.longs.LongComparator p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.longs.Long2LongSortedMap singleton(java.lang.Long p0,java.lang.Long p1,it.unimi.dsi.fastutil.longs.LongComparator p2){
	return it.unimi.dsi.fastutil.longs.Long2LongSortedMaps.singleton(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.longs.Long2LongSortedMaps#singleton(long,long,it.unimi.dsi.fastutil.longs.LongComparator)}
*@see it.unimi.dsi.fastutil.longs.Long2LongSortedMaps#singleton(long,long,it.unimi.dsi.fastutil.longs.LongComparator)
*<code>public static it.unimi.dsi.fastutil.longs.Long2LongSortedMap it.unimi.dsi.fastutil.longs.Long2LongSortedMaps.singleton(long,long,it.unimi.dsi.fastutil.longs.LongComparator)
*singleton(long p0,long p1,it.unimi.dsi.fastutil.longs.LongComparator p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.longs.Long2LongSortedMap singleton(long p0,long p1,it.unimi.dsi.fastutil.longs.LongComparator p2){
	return it.unimi.dsi.fastutil.longs.Long2LongSortedMaps.singleton(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.longs.Long2ObjectSortedMaps#singleton(java.lang.Long,V,it.unimi.dsi.fastutil.longs.LongComparator)}
*@see it.unimi.dsi.fastutil.longs.Long2ObjectSortedMaps#singleton(java.lang.Long,V,it.unimi.dsi.fastutil.longs.LongComparator)
*<code>public static <V> it.unimi.dsi.fastutil.longs.Long2ObjectSortedMap<V> it.unimi.dsi.fastutil.longs.Long2ObjectSortedMaps.singleton(java.lang.Long,V,it.unimi.dsi.fastutil.longs.LongComparator)
*singleton(java.lang.Long p0,V p1,it.unimi.dsi.fastutil.longs.LongComparator p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <V> it.unimi.dsi.fastutil.longs.Long2ObjectSortedMap<V> singleton(java.lang.Long p0,V p1,it.unimi.dsi.fastutil.longs.LongComparator p2){
	return it.unimi.dsi.fastutil.longs.Long2ObjectSortedMaps.singleton(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.longs.Long2ObjectSortedMaps#singleton(long,V,it.unimi.dsi.fastutil.longs.LongComparator)}
*@see it.unimi.dsi.fastutil.longs.Long2ObjectSortedMaps#singleton(long,V,it.unimi.dsi.fastutil.longs.LongComparator)
*<code>public static <V> it.unimi.dsi.fastutil.longs.Long2ObjectSortedMap<V> it.unimi.dsi.fastutil.longs.Long2ObjectSortedMaps.singleton(long,V,it.unimi.dsi.fastutil.longs.LongComparator)
*singleton(long p0,V p1,it.unimi.dsi.fastutil.longs.LongComparator p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <V> it.unimi.dsi.fastutil.longs.Long2ObjectSortedMap<V> singleton(long p0,V p1,it.unimi.dsi.fastutil.longs.LongComparator p2){
	return it.unimi.dsi.fastutil.longs.Long2ObjectSortedMaps.singleton(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.longs.Long2ShortSortedMaps#singleton(java.lang.Long,java.lang.Short,it.unimi.dsi.fastutil.longs.LongComparator)}
*@see it.unimi.dsi.fastutil.longs.Long2ShortSortedMaps#singleton(java.lang.Long,java.lang.Short,it.unimi.dsi.fastutil.longs.LongComparator)
*<code>public static it.unimi.dsi.fastutil.longs.Long2ShortSortedMap it.unimi.dsi.fastutil.longs.Long2ShortSortedMaps.singleton(java.lang.Long,java.lang.Short,it.unimi.dsi.fastutil.longs.LongComparator)
*singleton(java.lang.Long p0,java.lang.Short p1,it.unimi.dsi.fastutil.longs.LongComparator p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.longs.Long2ShortSortedMap singleton(java.lang.Long p0,java.lang.Short p1,it.unimi.dsi.fastutil.longs.LongComparator p2){
	return it.unimi.dsi.fastutil.longs.Long2ShortSortedMaps.singleton(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.longs.Long2ShortSortedMaps#singleton(long,short,it.unimi.dsi.fastutil.longs.LongComparator)}
*@see it.unimi.dsi.fastutil.longs.Long2ShortSortedMaps#singleton(long,short,it.unimi.dsi.fastutil.longs.LongComparator)
*<code>public static it.unimi.dsi.fastutil.longs.Long2ShortSortedMap it.unimi.dsi.fastutil.longs.Long2ShortSortedMaps.singleton(long,short,it.unimi.dsi.fastutil.longs.LongComparator)
*singleton(long p0,short p1,it.unimi.dsi.fastutil.longs.LongComparator p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.longs.Long2ShortSortedMap singleton(long p0,short p1,it.unimi.dsi.fastutil.longs.LongComparator p2){
	return it.unimi.dsi.fastutil.longs.Long2ShortSortedMaps.singleton(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.longs.LongSortedSets#singleton(java.lang.Object,it.unimi.dsi.fastutil.longs.LongComparator)}
*@see it.unimi.dsi.fastutil.longs.LongSortedSets#singleton(java.lang.Object,it.unimi.dsi.fastutil.longs.LongComparator)
*<code>public static it.unimi.dsi.fastutil.longs.LongSortedSet it.unimi.dsi.fastutil.longs.LongSortedSets.singleton(java.lang.Object,it.unimi.dsi.fastutil.longs.LongComparator)
*singleton(java.lang.Object p0,it.unimi.dsi.fastutil.longs.LongComparator p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.longs.LongSortedSet singleton(java.lang.Object p0,it.unimi.dsi.fastutil.longs.LongComparator p1){
	return it.unimi.dsi.fastutil.longs.LongSortedSets.singleton(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.longs.LongSortedSets#singleton(long,it.unimi.dsi.fastutil.longs.LongComparator)}
*@see it.unimi.dsi.fastutil.longs.LongSortedSets#singleton(long,it.unimi.dsi.fastutil.longs.LongComparator)
*<code>public static it.unimi.dsi.fastutil.longs.LongSortedSet it.unimi.dsi.fastutil.longs.LongSortedSets.singleton(long,it.unimi.dsi.fastutil.longs.LongComparator)
*singleton(long p0,it.unimi.dsi.fastutil.longs.LongComparator p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.longs.LongSortedSet singleton(long p0,it.unimi.dsi.fastutil.longs.LongComparator p1){
	return it.unimi.dsi.fastutil.longs.LongSortedSets.singleton(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.longs.LongArrays#stableSort(long[],it.unimi.dsi.fastutil.longs.LongComparator)}
*@see it.unimi.dsi.fastutil.longs.LongArrays#stableSort(long[],it.unimi.dsi.fastutil.longs.LongComparator)
*<code>public static void it.unimi.dsi.fastutil.longs.LongArrays.stableSort(long[],it.unimi.dsi.fastutil.longs.LongComparator)
*stableSort(long[] p0,it.unimi.dsi.fastutil.longs.LongComparator p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void stableSort(long[] p0,it.unimi.dsi.fastutil.longs.LongComparator p1){
	 it.unimi.dsi.fastutil.longs.LongArrays.stableSort(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.longs.LongArrays#stableSort(long[],int,int,it.unimi.dsi.fastutil.longs.LongComparator)}
*@see it.unimi.dsi.fastutil.longs.LongArrays#stableSort(long[],int,int,it.unimi.dsi.fastutil.longs.LongComparator)
*<code>public static void it.unimi.dsi.fastutil.longs.LongArrays.stableSort(long[],int,int,it.unimi.dsi.fastutil.longs.LongComparator)
*stableSort(long[] p0,int p1,int p2,it.unimi.dsi.fastutil.longs.LongComparator p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void stableSort(long[] p0,int p1,int p2,it.unimi.dsi.fastutil.longs.LongComparator p3){
	 it.unimi.dsi.fastutil.longs.LongArrays.stableSort(p0,p1,p2,p3);
}
/**
*{@link it.unimi.dsi.fastutil.longs.LongArrays#unstableSort(long[],int,int,it.unimi.dsi.fastutil.longs.LongComparator)}
*@see it.unimi.dsi.fastutil.longs.LongArrays#unstableSort(long[],int,int,it.unimi.dsi.fastutil.longs.LongComparator)
*<code>public static void it.unimi.dsi.fastutil.longs.LongArrays.unstableSort(long[],int,int,it.unimi.dsi.fastutil.longs.LongComparator)
*unstableSort(long[] p0,int p1,int p2,it.unimi.dsi.fastutil.longs.LongComparator p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void unstableSort(long[] p0,int p1,int p2,it.unimi.dsi.fastutil.longs.LongComparator p3){
	 it.unimi.dsi.fastutil.longs.LongArrays.unstableSort(p0,p1,p2,p3);
}
/**
*{@link it.unimi.dsi.fastutil.longs.LongArrays#unstableSort(long[],it.unimi.dsi.fastutil.longs.LongComparator)}
*@see it.unimi.dsi.fastutil.longs.LongArrays#unstableSort(long[],it.unimi.dsi.fastutil.longs.LongComparator)
*<code>public static void it.unimi.dsi.fastutil.longs.LongArrays.unstableSort(long[],it.unimi.dsi.fastutil.longs.LongComparator)
*unstableSort(long[] p0,it.unimi.dsi.fastutil.longs.LongComparator p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void unstableSort(long[] p0,it.unimi.dsi.fastutil.longs.LongComparator p1){
	 it.unimi.dsi.fastutil.longs.LongArrays.unstableSort(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.longs.LongHeaps#upHeap(long[],int,int,it.unimi.dsi.fastutil.longs.LongComparator)}
*@see it.unimi.dsi.fastutil.longs.LongHeaps#upHeap(long[],int,int,it.unimi.dsi.fastutil.longs.LongComparator)
*<code>public static int it.unimi.dsi.fastutil.longs.LongHeaps.upHeap(long[],int,int,it.unimi.dsi.fastutil.longs.LongComparator)
*upHeap(long[] p0,int p1,int p2,it.unimi.dsi.fastutil.longs.LongComparator p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int upHeap(long[] p0,int p1,int p2,it.unimi.dsi.fastutil.longs.LongComparator p3){
	return it.unimi.dsi.fastutil.longs.LongHeaps.upHeap(p0,p1,p2,p3);
}
/**
*{@link it.unimi.dsi.fastutil.longs.LongIndirectHeaps#upHeap(long[],int[],int[],int,int,it.unimi.dsi.fastutil.longs.LongComparator)}
*@see it.unimi.dsi.fastutil.longs.LongIndirectHeaps#upHeap(long[],int[],int[],int,int,it.unimi.dsi.fastutil.longs.LongComparator)
*<code>public static int it.unimi.dsi.fastutil.longs.LongIndirectHeaps.upHeap(long[],int[],int[],int,int,it.unimi.dsi.fastutil.longs.LongComparator)
*upHeap(long[] p0,int[] p1,int[] p2,int p3,int p4,it.unimi.dsi.fastutil.longs.LongComparator p5)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int upHeap(long[] p0,int[] p1,int[] p2,int p3,int p4,it.unimi.dsi.fastutil.longs.LongComparator p5){
	return it.unimi.dsi.fastutil.longs.LongIndirectHeaps.upHeap(p0,p1,p2,p3,p4,p5);
}
/**
*{@link it.unimi.dsi.fastutil.longs.LongSemiIndirectHeaps#upHeap(long[],int[],int,int,it.unimi.dsi.fastutil.longs.LongComparator)}
*@see it.unimi.dsi.fastutil.longs.LongSemiIndirectHeaps#upHeap(long[],int[],int,int,it.unimi.dsi.fastutil.longs.LongComparator)
*<code>public static int it.unimi.dsi.fastutil.longs.LongSemiIndirectHeaps.upHeap(long[],int[],int,int,it.unimi.dsi.fastutil.longs.LongComparator)
*upHeap(long[] p0,int[] p1,int p2,int p3,it.unimi.dsi.fastutil.longs.LongComparator p4)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int upHeap(long[] p0,int[] p1,int p2,int p3,it.unimi.dsi.fastutil.longs.LongComparator p4){
	return it.unimi.dsi.fastutil.longs.LongSemiIndirectHeaps.upHeap(p0,p1,p2,p3,p4);
}
}
