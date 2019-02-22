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
public final class ByteComparatorUtil{ 
/**
*{@link it.unimi.dsi.fastutil.bytes.ByteComparators#asByteComparator(java.util.Comparator<? super java.lang.Byte>)}
*@see it.unimi.dsi.fastutil.bytes.ByteComparators#asByteComparator(java.util.Comparator<? super java.lang.Byte>)
*<code>public static it.unimi.dsi.fastutil.bytes.ByteComparator it.unimi.dsi.fastutil.bytes.ByteComparators.asByteComparator(java.util.Comparator<? super java.lang.Byte>)
*asByteComparator(java.util.Comparator<? super java.lang.Byte> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.bytes.ByteComparator asByteComparator(java.util.Comparator<? super java.lang.Byte> p0){
	return it.unimi.dsi.fastutil.bytes.ByteComparators.asByteComparator(p0);
}
/**
*{@link it.unimi.dsi.fastutil.bytes.ByteArrays#binarySearch(byte[],byte,it.unimi.dsi.fastutil.bytes.ByteComparator)}
*@see it.unimi.dsi.fastutil.bytes.ByteArrays#binarySearch(byte[],byte,it.unimi.dsi.fastutil.bytes.ByteComparator)
*<code>public static int it.unimi.dsi.fastutil.bytes.ByteArrays.binarySearch(byte[],byte,it.unimi.dsi.fastutil.bytes.ByteComparator)
*binarySearch(byte[] p0,byte p1,it.unimi.dsi.fastutil.bytes.ByteComparator p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int binarySearch(byte[] p0,byte p1,it.unimi.dsi.fastutil.bytes.ByteComparator p2){
	return it.unimi.dsi.fastutil.bytes.ByteArrays.binarySearch(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.bytes.ByteArrays#binarySearch(byte[],int,int,byte,it.unimi.dsi.fastutil.bytes.ByteComparator)}
*@see it.unimi.dsi.fastutil.bytes.ByteArrays#binarySearch(byte[],int,int,byte,it.unimi.dsi.fastutil.bytes.ByteComparator)
*<code>public static int it.unimi.dsi.fastutil.bytes.ByteArrays.binarySearch(byte[],int,int,byte,it.unimi.dsi.fastutil.bytes.ByteComparator)
*binarySearch(byte[] p0,int p1,int p2,byte p3,it.unimi.dsi.fastutil.bytes.ByteComparator p4)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int binarySearch(byte[] p0,int p1,int p2,byte p3,it.unimi.dsi.fastutil.bytes.ByteComparator p4){
	return it.unimi.dsi.fastutil.bytes.ByteArrays.binarySearch(p0,p1,p2,p3,p4);
}
/**
*{@link it.unimi.dsi.fastutil.bytes.ByteBigArrays#binarySearch(byte[][],long,long,byte,it.unimi.dsi.fastutil.bytes.ByteComparator)}
*@see it.unimi.dsi.fastutil.bytes.ByteBigArrays#binarySearch(byte[][],long,long,byte,it.unimi.dsi.fastutil.bytes.ByteComparator)
*<code>public static long it.unimi.dsi.fastutil.bytes.ByteBigArrays.binarySearch(byte[][],long,long,byte,it.unimi.dsi.fastutil.bytes.ByteComparator)
*binarySearch(byte[][] p0,long p1,long p2,byte p3,it.unimi.dsi.fastutil.bytes.ByteComparator p4)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static long binarySearch(byte[][] p0,long p1,long p2,byte p3,it.unimi.dsi.fastutil.bytes.ByteComparator p4){
	return it.unimi.dsi.fastutil.bytes.ByteBigArrays.binarySearch(p0,p1,p2,p3,p4);
}
/**
*{@link it.unimi.dsi.fastutil.bytes.ByteBigArrays#binarySearch(byte[][],byte,it.unimi.dsi.fastutil.bytes.ByteComparator)}
*@see it.unimi.dsi.fastutil.bytes.ByteBigArrays#binarySearch(byte[][],byte,it.unimi.dsi.fastutil.bytes.ByteComparator)
*<code>public static long it.unimi.dsi.fastutil.bytes.ByteBigArrays.binarySearch(byte[][],byte,it.unimi.dsi.fastutil.bytes.ByteComparator)
*binarySearch(byte[][] p0,byte p1,it.unimi.dsi.fastutil.bytes.ByteComparator p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static long binarySearch(byte[][] p0,byte p1,it.unimi.dsi.fastutil.bytes.ByteComparator p2){
	return it.unimi.dsi.fastutil.bytes.ByteBigArrays.binarySearch(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.bytes.ByteHeaps#downHeap(byte[],int,int,it.unimi.dsi.fastutil.bytes.ByteComparator)}
*@see it.unimi.dsi.fastutil.bytes.ByteHeaps#downHeap(byte[],int,int,it.unimi.dsi.fastutil.bytes.ByteComparator)
*<code>public static int it.unimi.dsi.fastutil.bytes.ByteHeaps.downHeap(byte[],int,int,it.unimi.dsi.fastutil.bytes.ByteComparator)
*downHeap(byte[] p0,int p1,int p2,it.unimi.dsi.fastutil.bytes.ByteComparator p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int downHeap(byte[] p0,int p1,int p2,it.unimi.dsi.fastutil.bytes.ByteComparator p3){
	return it.unimi.dsi.fastutil.bytes.ByteHeaps.downHeap(p0,p1,p2,p3);
}
/**
*{@link it.unimi.dsi.fastutil.bytes.ByteIndirectHeaps#downHeap(byte[],int[],int[],int,int,it.unimi.dsi.fastutil.bytes.ByteComparator)}
*@see it.unimi.dsi.fastutil.bytes.ByteIndirectHeaps#downHeap(byte[],int[],int[],int,int,it.unimi.dsi.fastutil.bytes.ByteComparator)
*<code>public static int it.unimi.dsi.fastutil.bytes.ByteIndirectHeaps.downHeap(byte[],int[],int[],int,int,it.unimi.dsi.fastutil.bytes.ByteComparator)
*downHeap(byte[] p0,int[] p1,int[] p2,int p3,int p4,it.unimi.dsi.fastutil.bytes.ByteComparator p5)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int downHeap(byte[] p0,int[] p1,int[] p2,int p3,int p4,it.unimi.dsi.fastutil.bytes.ByteComparator p5){
	return it.unimi.dsi.fastutil.bytes.ByteIndirectHeaps.downHeap(p0,p1,p2,p3,p4,p5);
}
/**
*{@link it.unimi.dsi.fastutil.bytes.ByteSemiIndirectHeaps#downHeap(byte[],int[],int,int,it.unimi.dsi.fastutil.bytes.ByteComparator)}
*@see it.unimi.dsi.fastutil.bytes.ByteSemiIndirectHeaps#downHeap(byte[],int[],int,int,it.unimi.dsi.fastutil.bytes.ByteComparator)
*<code>public static int it.unimi.dsi.fastutil.bytes.ByteSemiIndirectHeaps.downHeap(byte[],int[],int,int,it.unimi.dsi.fastutil.bytes.ByteComparator)
*downHeap(byte[] p0,int[] p1,int p2,int p3,it.unimi.dsi.fastutil.bytes.ByteComparator p4)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int downHeap(byte[] p0,int[] p1,int p2,int p3,it.unimi.dsi.fastutil.bytes.ByteComparator p4){
	return it.unimi.dsi.fastutil.bytes.ByteSemiIndirectHeaps.downHeap(p0,p1,p2,p3,p4);
}
/**
*{@link it.unimi.dsi.fastutil.bytes.Byte2BooleanSortedMaps#entryComparator(it.unimi.dsi.fastutil.bytes.ByteComparator)}
*@see it.unimi.dsi.fastutil.bytes.Byte2BooleanSortedMaps#entryComparator(it.unimi.dsi.fastutil.bytes.ByteComparator)
*<code>public static java.util.Comparator<? super java.util.Map$Entry<java.lang.Byte, ?>> it.unimi.dsi.fastutil.bytes.Byte2BooleanSortedMaps.entryComparator(it.unimi.dsi.fastutil.bytes.ByteComparator)
*entryComparator(it.unimi.dsi.fastutil.bytes.ByteComparator p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Comparator<? super java.util.Map.Entry<java.lang.Byte, ?>> entryComparator(it.unimi.dsi.fastutil.bytes.ByteComparator p0){
	return it.unimi.dsi.fastutil.bytes.Byte2BooleanSortedMaps.entryComparator(p0);
}
/**
*{@link it.unimi.dsi.fastutil.bytes.ByteSemiIndirectHeaps#front(byte[],int[],int,int[],it.unimi.dsi.fastutil.bytes.ByteComparator)}
*@see it.unimi.dsi.fastutil.bytes.ByteSemiIndirectHeaps#front(byte[],int[],int,int[],it.unimi.dsi.fastutil.bytes.ByteComparator)
*<code>public static int it.unimi.dsi.fastutil.bytes.ByteSemiIndirectHeaps.front(byte[],int[],int,int[],it.unimi.dsi.fastutil.bytes.ByteComparator)
*front(byte[] p0,int[] p1,int p2,int[] p3,it.unimi.dsi.fastutil.bytes.ByteComparator p4)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int front(byte[] p0,int[] p1,int p2,int[] p3,it.unimi.dsi.fastutil.bytes.ByteComparator p4){
	return it.unimi.dsi.fastutil.bytes.ByteSemiIndirectHeaps.front(p0,p1,p2,p3,p4);
}
/**
*{@link it.unimi.dsi.fastutil.bytes.ByteHeaps#makeHeap(byte[],int,it.unimi.dsi.fastutil.bytes.ByteComparator)}
*@see it.unimi.dsi.fastutil.bytes.ByteHeaps#makeHeap(byte[],int,it.unimi.dsi.fastutil.bytes.ByteComparator)
*<code>public static void it.unimi.dsi.fastutil.bytes.ByteHeaps.makeHeap(byte[],int,it.unimi.dsi.fastutil.bytes.ByteComparator)
*makeHeap(byte[] p0,int p1,it.unimi.dsi.fastutil.bytes.ByteComparator p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void makeHeap(byte[] p0,int p1,it.unimi.dsi.fastutil.bytes.ByteComparator p2){
	 it.unimi.dsi.fastutil.bytes.ByteHeaps.makeHeap(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.bytes.ByteIndirectHeaps#makeHeap(byte[],int,int,int[],int[],it.unimi.dsi.fastutil.bytes.ByteComparator)}
*@see it.unimi.dsi.fastutil.bytes.ByteIndirectHeaps#makeHeap(byte[],int,int,int[],int[],it.unimi.dsi.fastutil.bytes.ByteComparator)
*<code>public static void it.unimi.dsi.fastutil.bytes.ByteIndirectHeaps.makeHeap(byte[],int,int,int[],int[],it.unimi.dsi.fastutil.bytes.ByteComparator)
*makeHeap(byte[] p0,int p1,int p2,int[] p3,int[] p4,it.unimi.dsi.fastutil.bytes.ByteComparator p5)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void makeHeap(byte[] p0,int p1,int p2,int[] p3,int[] p4,it.unimi.dsi.fastutil.bytes.ByteComparator p5){
	 it.unimi.dsi.fastutil.bytes.ByteIndirectHeaps.makeHeap(p0,p1,p2,p3,p4,p5);
}
/**
*{@link it.unimi.dsi.fastutil.bytes.ByteIndirectHeaps#makeHeap(byte[],int[],int[],int,it.unimi.dsi.fastutil.bytes.ByteComparator)}
*@see it.unimi.dsi.fastutil.bytes.ByteIndirectHeaps#makeHeap(byte[],int[],int[],int,it.unimi.dsi.fastutil.bytes.ByteComparator)
*<code>public static void it.unimi.dsi.fastutil.bytes.ByteIndirectHeaps.makeHeap(byte[],int[],int[],int,it.unimi.dsi.fastutil.bytes.ByteComparator)
*makeHeap(byte[] p0,int[] p1,int[] p2,int p3,it.unimi.dsi.fastutil.bytes.ByteComparator p4)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void makeHeap(byte[] p0,int[] p1,int[] p2,int p3,it.unimi.dsi.fastutil.bytes.ByteComparator p4){
	 it.unimi.dsi.fastutil.bytes.ByteIndirectHeaps.makeHeap(p0,p1,p2,p3,p4);
}
/**
*{@link it.unimi.dsi.fastutil.bytes.ByteSemiIndirectHeaps#makeHeap(byte[],int,int,it.unimi.dsi.fastutil.bytes.ByteComparator)}
*@see it.unimi.dsi.fastutil.bytes.ByteSemiIndirectHeaps#makeHeap(byte[],int,int,it.unimi.dsi.fastutil.bytes.ByteComparator)
*<code>public static int[] it.unimi.dsi.fastutil.bytes.ByteSemiIndirectHeaps.makeHeap(byte[],int,int,it.unimi.dsi.fastutil.bytes.ByteComparator)
*makeHeap(byte[] p0,int p1,int p2,it.unimi.dsi.fastutil.bytes.ByteComparator p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int[] makeHeap(byte[] p0,int p1,int p2,it.unimi.dsi.fastutil.bytes.ByteComparator p3){
	return it.unimi.dsi.fastutil.bytes.ByteSemiIndirectHeaps.makeHeap(p0,p1,p2,p3);
}
/**
*{@link it.unimi.dsi.fastutil.bytes.ByteSemiIndirectHeaps#makeHeap(byte[],int[],int,it.unimi.dsi.fastutil.bytes.ByteComparator)}
*@see it.unimi.dsi.fastutil.bytes.ByteSemiIndirectHeaps#makeHeap(byte[],int[],int,it.unimi.dsi.fastutil.bytes.ByteComparator)
*<code>public static void it.unimi.dsi.fastutil.bytes.ByteSemiIndirectHeaps.makeHeap(byte[],int[],int,it.unimi.dsi.fastutil.bytes.ByteComparator)
*makeHeap(byte[] p0,int[] p1,int p2,it.unimi.dsi.fastutil.bytes.ByteComparator p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void makeHeap(byte[] p0,int[] p1,int p2,it.unimi.dsi.fastutil.bytes.ByteComparator p3){
	 it.unimi.dsi.fastutil.bytes.ByteSemiIndirectHeaps.makeHeap(p0,p1,p2,p3);
}
/**
*{@link it.unimi.dsi.fastutil.bytes.ByteSemiIndirectHeaps#makeHeap(byte[],int,int,int[],it.unimi.dsi.fastutil.bytes.ByteComparator)}
*@see it.unimi.dsi.fastutil.bytes.ByteSemiIndirectHeaps#makeHeap(byte[],int,int,int[],it.unimi.dsi.fastutil.bytes.ByteComparator)
*<code>public static void it.unimi.dsi.fastutil.bytes.ByteSemiIndirectHeaps.makeHeap(byte[],int,int,int[],it.unimi.dsi.fastutil.bytes.ByteComparator)
*makeHeap(byte[] p0,int p1,int p2,int[] p3,it.unimi.dsi.fastutil.bytes.ByteComparator p4)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void makeHeap(byte[] p0,int p1,int p2,int[] p3,it.unimi.dsi.fastutil.bytes.ByteComparator p4){
	 it.unimi.dsi.fastutil.bytes.ByteSemiIndirectHeaps.makeHeap(p0,p1,p2,p3,p4);
}
/**
*{@link it.unimi.dsi.fastutil.bytes.ByteArrays#mergeSort(byte[],int,int,it.unimi.dsi.fastutil.bytes.ByteComparator,byte...)}
*@see it.unimi.dsi.fastutil.bytes.ByteArrays#mergeSort(byte[],int,int,it.unimi.dsi.fastutil.bytes.ByteComparator,byte...)
*<code>public static void it.unimi.dsi.fastutil.bytes.ByteArrays.mergeSort(byte[],int,int,it.unimi.dsi.fastutil.bytes.ByteComparator,byte[])
*mergeSort(byte[] p0,int p1,int p2,it.unimi.dsi.fastutil.bytes.ByteComparator p3,byte... p4)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void mergeSort(byte[] p0,int p1,int p2,it.unimi.dsi.fastutil.bytes.ByteComparator p3,byte... p4){
	 it.unimi.dsi.fastutil.bytes.ByteArrays.mergeSort(p0,p1,p2,p3,p4);
}
/**
*{@link it.unimi.dsi.fastutil.bytes.ByteArrays#mergeSort(byte[],int,int,it.unimi.dsi.fastutil.bytes.ByteComparator)}
*@see it.unimi.dsi.fastutil.bytes.ByteArrays#mergeSort(byte[],int,int,it.unimi.dsi.fastutil.bytes.ByteComparator)
*<code>public static void it.unimi.dsi.fastutil.bytes.ByteArrays.mergeSort(byte[],int,int,it.unimi.dsi.fastutil.bytes.ByteComparator)
*mergeSort(byte[] p0,int p1,int p2,it.unimi.dsi.fastutil.bytes.ByteComparator p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void mergeSort(byte[] p0,int p1,int p2,it.unimi.dsi.fastutil.bytes.ByteComparator p3){
	 it.unimi.dsi.fastutil.bytes.ByteArrays.mergeSort(p0,p1,p2,p3);
}
/**
*{@link it.unimi.dsi.fastutil.bytes.ByteArrays#mergeSort(byte[],it.unimi.dsi.fastutil.bytes.ByteComparator)}
*@see it.unimi.dsi.fastutil.bytes.ByteArrays#mergeSort(byte[],it.unimi.dsi.fastutil.bytes.ByteComparator)
*<code>public static void it.unimi.dsi.fastutil.bytes.ByteArrays.mergeSort(byte[],it.unimi.dsi.fastutil.bytes.ByteComparator)
*mergeSort(byte[] p0,it.unimi.dsi.fastutil.bytes.ByteComparator p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void mergeSort(byte[] p0,it.unimi.dsi.fastutil.bytes.ByteComparator p1){
	 it.unimi.dsi.fastutil.bytes.ByteArrays.mergeSort(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.bytes.ByteComparators#oppositeComparator(it.unimi.dsi.fastutil.bytes.ByteComparator)}
*@see it.unimi.dsi.fastutil.bytes.ByteComparators#oppositeComparator(it.unimi.dsi.fastutil.bytes.ByteComparator)
*<code>public static it.unimi.dsi.fastutil.bytes.ByteComparator it.unimi.dsi.fastutil.bytes.ByteComparators.oppositeComparator(it.unimi.dsi.fastutil.bytes.ByteComparator)
*oppositeComparator(it.unimi.dsi.fastutil.bytes.ByteComparator p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.bytes.ByteComparator oppositeComparator(it.unimi.dsi.fastutil.bytes.ByteComparator p0){
	return it.unimi.dsi.fastutil.bytes.ByteComparators.oppositeComparator(p0);
}
/**
*{@link it.unimi.dsi.fastutil.bytes.ByteArrays#parallelQuickSort(byte[],it.unimi.dsi.fastutil.bytes.ByteComparator)}
*@see it.unimi.dsi.fastutil.bytes.ByteArrays#parallelQuickSort(byte[],it.unimi.dsi.fastutil.bytes.ByteComparator)
*<code>public static void it.unimi.dsi.fastutil.bytes.ByteArrays.parallelQuickSort(byte[],it.unimi.dsi.fastutil.bytes.ByteComparator)
*parallelQuickSort(byte[] p0,it.unimi.dsi.fastutil.bytes.ByteComparator p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void parallelQuickSort(byte[] p0,it.unimi.dsi.fastutil.bytes.ByteComparator p1){
	 it.unimi.dsi.fastutil.bytes.ByteArrays.parallelQuickSort(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.bytes.ByteArrays#parallelQuickSort(byte[],int,int,it.unimi.dsi.fastutil.bytes.ByteComparator)}
*@see it.unimi.dsi.fastutil.bytes.ByteArrays#parallelQuickSort(byte[],int,int,it.unimi.dsi.fastutil.bytes.ByteComparator)
*<code>public static void it.unimi.dsi.fastutil.bytes.ByteArrays.parallelQuickSort(byte[],int,int,it.unimi.dsi.fastutil.bytes.ByteComparator)
*parallelQuickSort(byte[] p0,int p1,int p2,it.unimi.dsi.fastutil.bytes.ByteComparator p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void parallelQuickSort(byte[] p0,int p1,int p2,it.unimi.dsi.fastutil.bytes.ByteComparator p3){
	 it.unimi.dsi.fastutil.bytes.ByteArrays.parallelQuickSort(p0,p1,p2,p3);
}
/**
*{@link it.unimi.dsi.fastutil.bytes.ByteArrays#quickSort(byte[],it.unimi.dsi.fastutil.bytes.ByteComparator)}
*@see it.unimi.dsi.fastutil.bytes.ByteArrays#quickSort(byte[],it.unimi.dsi.fastutil.bytes.ByteComparator)
*<code>public static void it.unimi.dsi.fastutil.bytes.ByteArrays.quickSort(byte[],it.unimi.dsi.fastutil.bytes.ByteComparator)
*quickSort(byte[] p0,it.unimi.dsi.fastutil.bytes.ByteComparator p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void quickSort(byte[] p0,it.unimi.dsi.fastutil.bytes.ByteComparator p1){
	 it.unimi.dsi.fastutil.bytes.ByteArrays.quickSort(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.bytes.ByteArrays#quickSort(byte[],int,int,it.unimi.dsi.fastutil.bytes.ByteComparator)}
*@see it.unimi.dsi.fastutil.bytes.ByteArrays#quickSort(byte[],int,int,it.unimi.dsi.fastutil.bytes.ByteComparator)
*<code>public static void it.unimi.dsi.fastutil.bytes.ByteArrays.quickSort(byte[],int,int,it.unimi.dsi.fastutil.bytes.ByteComparator)
*quickSort(byte[] p0,int p1,int p2,it.unimi.dsi.fastutil.bytes.ByteComparator p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void quickSort(byte[] p0,int p1,int p2,it.unimi.dsi.fastutil.bytes.ByteComparator p3){
	 it.unimi.dsi.fastutil.bytes.ByteArrays.quickSort(p0,p1,p2,p3);
}
/**
*{@link it.unimi.dsi.fastutil.bytes.ByteBigArrays#quickSort(byte[][],long,long,it.unimi.dsi.fastutil.bytes.ByteComparator)}
*@see it.unimi.dsi.fastutil.bytes.ByteBigArrays#quickSort(byte[][],long,long,it.unimi.dsi.fastutil.bytes.ByteComparator)
*<code>public static void it.unimi.dsi.fastutil.bytes.ByteBigArrays.quickSort(byte[][],long,long,it.unimi.dsi.fastutil.bytes.ByteComparator)
*quickSort(byte[][] p0,long p1,long p2,it.unimi.dsi.fastutil.bytes.ByteComparator p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void quickSort(byte[][] p0,long p1,long p2,it.unimi.dsi.fastutil.bytes.ByteComparator p3){
	 it.unimi.dsi.fastutil.bytes.ByteBigArrays.quickSort(p0,p1,p2,p3);
}
/**
*{@link it.unimi.dsi.fastutil.bytes.ByteBigArrays#quickSort(byte[][],it.unimi.dsi.fastutil.bytes.ByteComparator)}
*@see it.unimi.dsi.fastutil.bytes.ByteBigArrays#quickSort(byte[][],it.unimi.dsi.fastutil.bytes.ByteComparator)
*<code>public static void it.unimi.dsi.fastutil.bytes.ByteBigArrays.quickSort(byte[][],it.unimi.dsi.fastutil.bytes.ByteComparator)
*quickSort(byte[][] p0,it.unimi.dsi.fastutil.bytes.ByteComparator p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void quickSort(byte[][] p0,it.unimi.dsi.fastutil.bytes.ByteComparator p1){
	 it.unimi.dsi.fastutil.bytes.ByteBigArrays.quickSort(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.bytes.Byte2BooleanSortedMaps#singleton(java.lang.Byte,java.lang.Boolean,it.unimi.dsi.fastutil.bytes.ByteComparator)}
*@see it.unimi.dsi.fastutil.bytes.Byte2BooleanSortedMaps#singleton(java.lang.Byte,java.lang.Boolean,it.unimi.dsi.fastutil.bytes.ByteComparator)
*<code>public static it.unimi.dsi.fastutil.bytes.Byte2BooleanSortedMap it.unimi.dsi.fastutil.bytes.Byte2BooleanSortedMaps.singleton(java.lang.Byte,java.lang.Boolean,it.unimi.dsi.fastutil.bytes.ByteComparator)
*singleton(java.lang.Byte p0,java.lang.Boolean p1,it.unimi.dsi.fastutil.bytes.ByteComparator p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.bytes.Byte2BooleanSortedMap singleton(java.lang.Byte p0,java.lang.Boolean p1,it.unimi.dsi.fastutil.bytes.ByteComparator p2){
	return it.unimi.dsi.fastutil.bytes.Byte2BooleanSortedMaps.singleton(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.bytes.Byte2BooleanSortedMaps#singleton(byte,boolean,it.unimi.dsi.fastutil.bytes.ByteComparator)}
*@see it.unimi.dsi.fastutil.bytes.Byte2BooleanSortedMaps#singleton(byte,boolean,it.unimi.dsi.fastutil.bytes.ByteComparator)
*<code>public static it.unimi.dsi.fastutil.bytes.Byte2BooleanSortedMap it.unimi.dsi.fastutil.bytes.Byte2BooleanSortedMaps.singleton(byte,boolean,it.unimi.dsi.fastutil.bytes.ByteComparator)
*singleton(byte p0,boolean p1,it.unimi.dsi.fastutil.bytes.ByteComparator p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.bytes.Byte2BooleanSortedMap singleton(byte p0,boolean p1,it.unimi.dsi.fastutil.bytes.ByteComparator p2){
	return it.unimi.dsi.fastutil.bytes.Byte2BooleanSortedMaps.singleton(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.bytes.Byte2ByteSortedMaps#singleton(java.lang.Byte,java.lang.Byte,it.unimi.dsi.fastutil.bytes.ByteComparator)}
*@see it.unimi.dsi.fastutil.bytes.Byte2ByteSortedMaps#singleton(java.lang.Byte,java.lang.Byte,it.unimi.dsi.fastutil.bytes.ByteComparator)
*<code>public static it.unimi.dsi.fastutil.bytes.Byte2ByteSortedMap it.unimi.dsi.fastutil.bytes.Byte2ByteSortedMaps.singleton(java.lang.Byte,java.lang.Byte,it.unimi.dsi.fastutil.bytes.ByteComparator)
*singleton(java.lang.Byte p0,java.lang.Byte p1,it.unimi.dsi.fastutil.bytes.ByteComparator p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.bytes.Byte2ByteSortedMap singleton(java.lang.Byte p0,java.lang.Byte p1,it.unimi.dsi.fastutil.bytes.ByteComparator p2){
	return it.unimi.dsi.fastutil.bytes.Byte2ByteSortedMaps.singleton(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.bytes.Byte2ByteSortedMaps#singleton(byte,byte,it.unimi.dsi.fastutil.bytes.ByteComparator)}
*@see it.unimi.dsi.fastutil.bytes.Byte2ByteSortedMaps#singleton(byte,byte,it.unimi.dsi.fastutil.bytes.ByteComparator)
*<code>public static it.unimi.dsi.fastutil.bytes.Byte2ByteSortedMap it.unimi.dsi.fastutil.bytes.Byte2ByteSortedMaps.singleton(byte,byte,it.unimi.dsi.fastutil.bytes.ByteComparator)
*singleton(byte p0,byte p1,it.unimi.dsi.fastutil.bytes.ByteComparator p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.bytes.Byte2ByteSortedMap singleton(byte p0,byte p1,it.unimi.dsi.fastutil.bytes.ByteComparator p2){
	return it.unimi.dsi.fastutil.bytes.Byte2ByteSortedMaps.singleton(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.bytes.Byte2CharSortedMaps#singleton(java.lang.Byte,java.lang.Character,it.unimi.dsi.fastutil.bytes.ByteComparator)}
*@see it.unimi.dsi.fastutil.bytes.Byte2CharSortedMaps#singleton(java.lang.Byte,java.lang.Character,it.unimi.dsi.fastutil.bytes.ByteComparator)
*<code>public static it.unimi.dsi.fastutil.bytes.Byte2CharSortedMap it.unimi.dsi.fastutil.bytes.Byte2CharSortedMaps.singleton(java.lang.Byte,java.lang.Character,it.unimi.dsi.fastutil.bytes.ByteComparator)
*singleton(java.lang.Byte p0,java.lang.Character p1,it.unimi.dsi.fastutil.bytes.ByteComparator p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.bytes.Byte2CharSortedMap singleton(java.lang.Byte p0,java.lang.Character p1,it.unimi.dsi.fastutil.bytes.ByteComparator p2){
	return it.unimi.dsi.fastutil.bytes.Byte2CharSortedMaps.singleton(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.bytes.Byte2CharSortedMaps#singleton(byte,char,it.unimi.dsi.fastutil.bytes.ByteComparator)}
*@see it.unimi.dsi.fastutil.bytes.Byte2CharSortedMaps#singleton(byte,char,it.unimi.dsi.fastutil.bytes.ByteComparator)
*<code>public static it.unimi.dsi.fastutil.bytes.Byte2CharSortedMap it.unimi.dsi.fastutil.bytes.Byte2CharSortedMaps.singleton(byte,char,it.unimi.dsi.fastutil.bytes.ByteComparator)
*singleton(byte p0,char p1,it.unimi.dsi.fastutil.bytes.ByteComparator p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.bytes.Byte2CharSortedMap singleton(byte p0,char p1,it.unimi.dsi.fastutil.bytes.ByteComparator p2){
	return it.unimi.dsi.fastutil.bytes.Byte2CharSortedMaps.singleton(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.bytes.Byte2DoubleSortedMaps#singleton(java.lang.Byte,java.lang.Double,it.unimi.dsi.fastutil.bytes.ByteComparator)}
*@see it.unimi.dsi.fastutil.bytes.Byte2DoubleSortedMaps#singleton(java.lang.Byte,java.lang.Double,it.unimi.dsi.fastutil.bytes.ByteComparator)
*<code>public static it.unimi.dsi.fastutil.bytes.Byte2DoubleSortedMap it.unimi.dsi.fastutil.bytes.Byte2DoubleSortedMaps.singleton(java.lang.Byte,java.lang.Double,it.unimi.dsi.fastutil.bytes.ByteComparator)
*singleton(java.lang.Byte p0,java.lang.Double p1,it.unimi.dsi.fastutil.bytes.ByteComparator p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.bytes.Byte2DoubleSortedMap singleton(java.lang.Byte p0,java.lang.Double p1,it.unimi.dsi.fastutil.bytes.ByteComparator p2){
	return it.unimi.dsi.fastutil.bytes.Byte2DoubleSortedMaps.singleton(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.bytes.Byte2DoubleSortedMaps#singleton(byte,double,it.unimi.dsi.fastutil.bytes.ByteComparator)}
*@see it.unimi.dsi.fastutil.bytes.Byte2DoubleSortedMaps#singleton(byte,double,it.unimi.dsi.fastutil.bytes.ByteComparator)
*<code>public static it.unimi.dsi.fastutil.bytes.Byte2DoubleSortedMap it.unimi.dsi.fastutil.bytes.Byte2DoubleSortedMaps.singleton(byte,double,it.unimi.dsi.fastutil.bytes.ByteComparator)
*singleton(byte p0,double p1,it.unimi.dsi.fastutil.bytes.ByteComparator p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.bytes.Byte2DoubleSortedMap singleton(byte p0,double p1,it.unimi.dsi.fastutil.bytes.ByteComparator p2){
	return it.unimi.dsi.fastutil.bytes.Byte2DoubleSortedMaps.singleton(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.bytes.Byte2FloatSortedMaps#singleton(java.lang.Byte,java.lang.Float,it.unimi.dsi.fastutil.bytes.ByteComparator)}
*@see it.unimi.dsi.fastutil.bytes.Byte2FloatSortedMaps#singleton(java.lang.Byte,java.lang.Float,it.unimi.dsi.fastutil.bytes.ByteComparator)
*<code>public static it.unimi.dsi.fastutil.bytes.Byte2FloatSortedMap it.unimi.dsi.fastutil.bytes.Byte2FloatSortedMaps.singleton(java.lang.Byte,java.lang.Float,it.unimi.dsi.fastutil.bytes.ByteComparator)
*singleton(java.lang.Byte p0,java.lang.Float p1,it.unimi.dsi.fastutil.bytes.ByteComparator p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.bytes.Byte2FloatSortedMap singleton(java.lang.Byte p0,java.lang.Float p1,it.unimi.dsi.fastutil.bytes.ByteComparator p2){
	return it.unimi.dsi.fastutil.bytes.Byte2FloatSortedMaps.singleton(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.bytes.Byte2FloatSortedMaps#singleton(byte,float,it.unimi.dsi.fastutil.bytes.ByteComparator)}
*@see it.unimi.dsi.fastutil.bytes.Byte2FloatSortedMaps#singleton(byte,float,it.unimi.dsi.fastutil.bytes.ByteComparator)
*<code>public static it.unimi.dsi.fastutil.bytes.Byte2FloatSortedMap it.unimi.dsi.fastutil.bytes.Byte2FloatSortedMaps.singleton(byte,float,it.unimi.dsi.fastutil.bytes.ByteComparator)
*singleton(byte p0,float p1,it.unimi.dsi.fastutil.bytes.ByteComparator p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.bytes.Byte2FloatSortedMap singleton(byte p0,float p1,it.unimi.dsi.fastutil.bytes.ByteComparator p2){
	return it.unimi.dsi.fastutil.bytes.Byte2FloatSortedMaps.singleton(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.bytes.Byte2IntSortedMaps#singleton(java.lang.Byte,java.lang.Integer,it.unimi.dsi.fastutil.bytes.ByteComparator)}
*@see it.unimi.dsi.fastutil.bytes.Byte2IntSortedMaps#singleton(java.lang.Byte,java.lang.Integer,it.unimi.dsi.fastutil.bytes.ByteComparator)
*<code>public static it.unimi.dsi.fastutil.bytes.Byte2IntSortedMap it.unimi.dsi.fastutil.bytes.Byte2IntSortedMaps.singleton(java.lang.Byte,java.lang.Integer,it.unimi.dsi.fastutil.bytes.ByteComparator)
*singleton(java.lang.Byte p0,java.lang.Integer p1,it.unimi.dsi.fastutil.bytes.ByteComparator p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.bytes.Byte2IntSortedMap singleton(java.lang.Byte p0,java.lang.Integer p1,it.unimi.dsi.fastutil.bytes.ByteComparator p2){
	return it.unimi.dsi.fastutil.bytes.Byte2IntSortedMaps.singleton(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.bytes.Byte2IntSortedMaps#singleton(byte,int,it.unimi.dsi.fastutil.bytes.ByteComparator)}
*@see it.unimi.dsi.fastutil.bytes.Byte2IntSortedMaps#singleton(byte,int,it.unimi.dsi.fastutil.bytes.ByteComparator)
*<code>public static it.unimi.dsi.fastutil.bytes.Byte2IntSortedMap it.unimi.dsi.fastutil.bytes.Byte2IntSortedMaps.singleton(byte,int,it.unimi.dsi.fastutil.bytes.ByteComparator)
*singleton(byte p0,int p1,it.unimi.dsi.fastutil.bytes.ByteComparator p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.bytes.Byte2IntSortedMap singleton(byte p0,int p1,it.unimi.dsi.fastutil.bytes.ByteComparator p2){
	return it.unimi.dsi.fastutil.bytes.Byte2IntSortedMaps.singleton(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.bytes.Byte2LongSortedMaps#singleton(java.lang.Byte,java.lang.Long,it.unimi.dsi.fastutil.bytes.ByteComparator)}
*@see it.unimi.dsi.fastutil.bytes.Byte2LongSortedMaps#singleton(java.lang.Byte,java.lang.Long,it.unimi.dsi.fastutil.bytes.ByteComparator)
*<code>public static it.unimi.dsi.fastutil.bytes.Byte2LongSortedMap it.unimi.dsi.fastutil.bytes.Byte2LongSortedMaps.singleton(java.lang.Byte,java.lang.Long,it.unimi.dsi.fastutil.bytes.ByteComparator)
*singleton(java.lang.Byte p0,java.lang.Long p1,it.unimi.dsi.fastutil.bytes.ByteComparator p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.bytes.Byte2LongSortedMap singleton(java.lang.Byte p0,java.lang.Long p1,it.unimi.dsi.fastutil.bytes.ByteComparator p2){
	return it.unimi.dsi.fastutil.bytes.Byte2LongSortedMaps.singleton(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.bytes.Byte2LongSortedMaps#singleton(byte,long,it.unimi.dsi.fastutil.bytes.ByteComparator)}
*@see it.unimi.dsi.fastutil.bytes.Byte2LongSortedMaps#singleton(byte,long,it.unimi.dsi.fastutil.bytes.ByteComparator)
*<code>public static it.unimi.dsi.fastutil.bytes.Byte2LongSortedMap it.unimi.dsi.fastutil.bytes.Byte2LongSortedMaps.singleton(byte,long,it.unimi.dsi.fastutil.bytes.ByteComparator)
*singleton(byte p0,long p1,it.unimi.dsi.fastutil.bytes.ByteComparator p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.bytes.Byte2LongSortedMap singleton(byte p0,long p1,it.unimi.dsi.fastutil.bytes.ByteComparator p2){
	return it.unimi.dsi.fastutil.bytes.Byte2LongSortedMaps.singleton(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.bytes.Byte2ObjectSortedMaps#singleton(java.lang.Byte,V,it.unimi.dsi.fastutil.bytes.ByteComparator)}
*@see it.unimi.dsi.fastutil.bytes.Byte2ObjectSortedMaps#singleton(java.lang.Byte,V,it.unimi.dsi.fastutil.bytes.ByteComparator)
*<code>public static <V> it.unimi.dsi.fastutil.bytes.Byte2ObjectSortedMap<V> it.unimi.dsi.fastutil.bytes.Byte2ObjectSortedMaps.singleton(java.lang.Byte,V,it.unimi.dsi.fastutil.bytes.ByteComparator)
*singleton(java.lang.Byte p0,V p1,it.unimi.dsi.fastutil.bytes.ByteComparator p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <V> it.unimi.dsi.fastutil.bytes.Byte2ObjectSortedMap<V> singleton(java.lang.Byte p0,V p1,it.unimi.dsi.fastutil.bytes.ByteComparator p2){
	return it.unimi.dsi.fastutil.bytes.Byte2ObjectSortedMaps.singleton(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.bytes.Byte2ObjectSortedMaps#singleton(byte,V,it.unimi.dsi.fastutil.bytes.ByteComparator)}
*@see it.unimi.dsi.fastutil.bytes.Byte2ObjectSortedMaps#singleton(byte,V,it.unimi.dsi.fastutil.bytes.ByteComparator)
*<code>public static <V> it.unimi.dsi.fastutil.bytes.Byte2ObjectSortedMap<V> it.unimi.dsi.fastutil.bytes.Byte2ObjectSortedMaps.singleton(byte,V,it.unimi.dsi.fastutil.bytes.ByteComparator)
*singleton(byte p0,V p1,it.unimi.dsi.fastutil.bytes.ByteComparator p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <V> it.unimi.dsi.fastutil.bytes.Byte2ObjectSortedMap<V> singleton(byte p0,V p1,it.unimi.dsi.fastutil.bytes.ByteComparator p2){
	return it.unimi.dsi.fastutil.bytes.Byte2ObjectSortedMaps.singleton(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.bytes.Byte2ShortSortedMaps#singleton(java.lang.Byte,java.lang.Short,it.unimi.dsi.fastutil.bytes.ByteComparator)}
*@see it.unimi.dsi.fastutil.bytes.Byte2ShortSortedMaps#singleton(java.lang.Byte,java.lang.Short,it.unimi.dsi.fastutil.bytes.ByteComparator)
*<code>public static it.unimi.dsi.fastutil.bytes.Byte2ShortSortedMap it.unimi.dsi.fastutil.bytes.Byte2ShortSortedMaps.singleton(java.lang.Byte,java.lang.Short,it.unimi.dsi.fastutil.bytes.ByteComparator)
*singleton(java.lang.Byte p0,java.lang.Short p1,it.unimi.dsi.fastutil.bytes.ByteComparator p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.bytes.Byte2ShortSortedMap singleton(java.lang.Byte p0,java.lang.Short p1,it.unimi.dsi.fastutil.bytes.ByteComparator p2){
	return it.unimi.dsi.fastutil.bytes.Byte2ShortSortedMaps.singleton(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.bytes.Byte2ShortSortedMaps#singleton(byte,short,it.unimi.dsi.fastutil.bytes.ByteComparator)}
*@see it.unimi.dsi.fastutil.bytes.Byte2ShortSortedMaps#singleton(byte,short,it.unimi.dsi.fastutil.bytes.ByteComparator)
*<code>public static it.unimi.dsi.fastutil.bytes.Byte2ShortSortedMap it.unimi.dsi.fastutil.bytes.Byte2ShortSortedMaps.singleton(byte,short,it.unimi.dsi.fastutil.bytes.ByteComparator)
*singleton(byte p0,short p1,it.unimi.dsi.fastutil.bytes.ByteComparator p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.bytes.Byte2ShortSortedMap singleton(byte p0,short p1,it.unimi.dsi.fastutil.bytes.ByteComparator p2){
	return it.unimi.dsi.fastutil.bytes.Byte2ShortSortedMaps.singleton(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.bytes.ByteSortedSets#singleton(java.lang.Object,it.unimi.dsi.fastutil.bytes.ByteComparator)}
*@see it.unimi.dsi.fastutil.bytes.ByteSortedSets#singleton(java.lang.Object,it.unimi.dsi.fastutil.bytes.ByteComparator)
*<code>public static it.unimi.dsi.fastutil.bytes.ByteSortedSet it.unimi.dsi.fastutil.bytes.ByteSortedSets.singleton(java.lang.Object,it.unimi.dsi.fastutil.bytes.ByteComparator)
*singleton(java.lang.Object p0,it.unimi.dsi.fastutil.bytes.ByteComparator p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.bytes.ByteSortedSet singleton(java.lang.Object p0,it.unimi.dsi.fastutil.bytes.ByteComparator p1){
	return it.unimi.dsi.fastutil.bytes.ByteSortedSets.singleton(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.bytes.ByteSortedSets#singleton(byte,it.unimi.dsi.fastutil.bytes.ByteComparator)}
*@see it.unimi.dsi.fastutil.bytes.ByteSortedSets#singleton(byte,it.unimi.dsi.fastutil.bytes.ByteComparator)
*<code>public static it.unimi.dsi.fastutil.bytes.ByteSortedSet it.unimi.dsi.fastutil.bytes.ByteSortedSets.singleton(byte,it.unimi.dsi.fastutil.bytes.ByteComparator)
*singleton(byte p0,it.unimi.dsi.fastutil.bytes.ByteComparator p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.bytes.ByteSortedSet singleton(byte p0,it.unimi.dsi.fastutil.bytes.ByteComparator p1){
	return it.unimi.dsi.fastutil.bytes.ByteSortedSets.singleton(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.bytes.ByteArrays#stableSort(byte[],it.unimi.dsi.fastutil.bytes.ByteComparator)}
*@see it.unimi.dsi.fastutil.bytes.ByteArrays#stableSort(byte[],it.unimi.dsi.fastutil.bytes.ByteComparator)
*<code>public static void it.unimi.dsi.fastutil.bytes.ByteArrays.stableSort(byte[],it.unimi.dsi.fastutil.bytes.ByteComparator)
*stableSort(byte[] p0,it.unimi.dsi.fastutil.bytes.ByteComparator p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void stableSort(byte[] p0,it.unimi.dsi.fastutil.bytes.ByteComparator p1){
	 it.unimi.dsi.fastutil.bytes.ByteArrays.stableSort(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.bytes.ByteArrays#stableSort(byte[],int,int,it.unimi.dsi.fastutil.bytes.ByteComparator)}
*@see it.unimi.dsi.fastutil.bytes.ByteArrays#stableSort(byte[],int,int,it.unimi.dsi.fastutil.bytes.ByteComparator)
*<code>public static void it.unimi.dsi.fastutil.bytes.ByteArrays.stableSort(byte[],int,int,it.unimi.dsi.fastutil.bytes.ByteComparator)
*stableSort(byte[] p0,int p1,int p2,it.unimi.dsi.fastutil.bytes.ByteComparator p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void stableSort(byte[] p0,int p1,int p2,it.unimi.dsi.fastutil.bytes.ByteComparator p3){
	 it.unimi.dsi.fastutil.bytes.ByteArrays.stableSort(p0,p1,p2,p3);
}
/**
*{@link it.unimi.dsi.fastutil.bytes.ByteArrays#unstableSort(byte[],int,int,it.unimi.dsi.fastutil.bytes.ByteComparator)}
*@see it.unimi.dsi.fastutil.bytes.ByteArrays#unstableSort(byte[],int,int,it.unimi.dsi.fastutil.bytes.ByteComparator)
*<code>public static void it.unimi.dsi.fastutil.bytes.ByteArrays.unstableSort(byte[],int,int,it.unimi.dsi.fastutil.bytes.ByteComparator)
*unstableSort(byte[] p0,int p1,int p2,it.unimi.dsi.fastutil.bytes.ByteComparator p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void unstableSort(byte[] p0,int p1,int p2,it.unimi.dsi.fastutil.bytes.ByteComparator p3){
	 it.unimi.dsi.fastutil.bytes.ByteArrays.unstableSort(p0,p1,p2,p3);
}
/**
*{@link it.unimi.dsi.fastutil.bytes.ByteArrays#unstableSort(byte[],it.unimi.dsi.fastutil.bytes.ByteComparator)}
*@see it.unimi.dsi.fastutil.bytes.ByteArrays#unstableSort(byte[],it.unimi.dsi.fastutil.bytes.ByteComparator)
*<code>public static void it.unimi.dsi.fastutil.bytes.ByteArrays.unstableSort(byte[],it.unimi.dsi.fastutil.bytes.ByteComparator)
*unstableSort(byte[] p0,it.unimi.dsi.fastutil.bytes.ByteComparator p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void unstableSort(byte[] p0,it.unimi.dsi.fastutil.bytes.ByteComparator p1){
	 it.unimi.dsi.fastutil.bytes.ByteArrays.unstableSort(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.bytes.ByteHeaps#upHeap(byte[],int,int,it.unimi.dsi.fastutil.bytes.ByteComparator)}
*@see it.unimi.dsi.fastutil.bytes.ByteHeaps#upHeap(byte[],int,int,it.unimi.dsi.fastutil.bytes.ByteComparator)
*<code>public static int it.unimi.dsi.fastutil.bytes.ByteHeaps.upHeap(byte[],int,int,it.unimi.dsi.fastutil.bytes.ByteComparator)
*upHeap(byte[] p0,int p1,int p2,it.unimi.dsi.fastutil.bytes.ByteComparator p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int upHeap(byte[] p0,int p1,int p2,it.unimi.dsi.fastutil.bytes.ByteComparator p3){
	return it.unimi.dsi.fastutil.bytes.ByteHeaps.upHeap(p0,p1,p2,p3);
}
/**
*{@link it.unimi.dsi.fastutil.bytes.ByteIndirectHeaps#upHeap(byte[],int[],int[],int,int,it.unimi.dsi.fastutil.bytes.ByteComparator)}
*@see it.unimi.dsi.fastutil.bytes.ByteIndirectHeaps#upHeap(byte[],int[],int[],int,int,it.unimi.dsi.fastutil.bytes.ByteComparator)
*<code>public static int it.unimi.dsi.fastutil.bytes.ByteIndirectHeaps.upHeap(byte[],int[],int[],int,int,it.unimi.dsi.fastutil.bytes.ByteComparator)
*upHeap(byte[] p0,int[] p1,int[] p2,int p3,int p4,it.unimi.dsi.fastutil.bytes.ByteComparator p5)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int upHeap(byte[] p0,int[] p1,int[] p2,int p3,int p4,it.unimi.dsi.fastutil.bytes.ByteComparator p5){
	return it.unimi.dsi.fastutil.bytes.ByteIndirectHeaps.upHeap(p0,p1,p2,p3,p4,p5);
}
/**
*{@link it.unimi.dsi.fastutil.bytes.ByteSemiIndirectHeaps#upHeap(byte[],int[],int,int,it.unimi.dsi.fastutil.bytes.ByteComparator)}
*@see it.unimi.dsi.fastutil.bytes.ByteSemiIndirectHeaps#upHeap(byte[],int[],int,int,it.unimi.dsi.fastutil.bytes.ByteComparator)
*<code>public static int it.unimi.dsi.fastutil.bytes.ByteSemiIndirectHeaps.upHeap(byte[],int[],int,int,it.unimi.dsi.fastutil.bytes.ByteComparator)
*upHeap(byte[] p0,int[] p1,int p2,int p3,it.unimi.dsi.fastutil.bytes.ByteComparator p4)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int upHeap(byte[] p0,int[] p1,int p2,int p3,it.unimi.dsi.fastutil.bytes.ByteComparator p4){
	return it.unimi.dsi.fastutil.bytes.ByteSemiIndirectHeaps.upHeap(p0,p1,p2,p3,p4);
}
}
