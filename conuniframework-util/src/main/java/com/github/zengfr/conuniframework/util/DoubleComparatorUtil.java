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
public final class DoubleComparatorUtil{ 
/**
*{@link it.unimi.dsi.fastutil.doubles.DoubleComparators#asDoubleComparator(java.util.Comparator<? super java.lang.Double>)}
*@see it.unimi.dsi.fastutil.doubles.DoubleComparators#asDoubleComparator(java.util.Comparator<? super java.lang.Double>)
*<code>public static it.unimi.dsi.fastutil.doubles.DoubleComparator it.unimi.dsi.fastutil.doubles.DoubleComparators.asDoubleComparator(java.util.Comparator<? super java.lang.Double>)
*asDoubleComparator(java.util.Comparator<? super java.lang.Double> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.doubles.DoubleComparator asDoubleComparator(java.util.Comparator<? super java.lang.Double> p0){
	return it.unimi.dsi.fastutil.doubles.DoubleComparators.asDoubleComparator(p0);
}
/**
*{@link it.unimi.dsi.fastutil.doubles.DoubleArrays#binarySearch(double[],double,it.unimi.dsi.fastutil.doubles.DoubleComparator)}
*@see it.unimi.dsi.fastutil.doubles.DoubleArrays#binarySearch(double[],double,it.unimi.dsi.fastutil.doubles.DoubleComparator)
*<code>public static int it.unimi.dsi.fastutil.doubles.DoubleArrays.binarySearch(double[],double,it.unimi.dsi.fastutil.doubles.DoubleComparator)
*binarySearch(double[] p0,double p1,it.unimi.dsi.fastutil.doubles.DoubleComparator p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int binarySearch(double[] p0,double p1,it.unimi.dsi.fastutil.doubles.DoubleComparator p2){
	return it.unimi.dsi.fastutil.doubles.DoubleArrays.binarySearch(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.doubles.DoubleArrays#binarySearch(double[],int,int,double,it.unimi.dsi.fastutil.doubles.DoubleComparator)}
*@see it.unimi.dsi.fastutil.doubles.DoubleArrays#binarySearch(double[],int,int,double,it.unimi.dsi.fastutil.doubles.DoubleComparator)
*<code>public static int it.unimi.dsi.fastutil.doubles.DoubleArrays.binarySearch(double[],int,int,double,it.unimi.dsi.fastutil.doubles.DoubleComparator)
*binarySearch(double[] p0,int p1,int p2,double p3,it.unimi.dsi.fastutil.doubles.DoubleComparator p4)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int binarySearch(double[] p0,int p1,int p2,double p3,it.unimi.dsi.fastutil.doubles.DoubleComparator p4){
	return it.unimi.dsi.fastutil.doubles.DoubleArrays.binarySearch(p0,p1,p2,p3,p4);
}
/**
*{@link it.unimi.dsi.fastutil.doubles.DoubleBigArrays#binarySearch(double[][],long,long,double,it.unimi.dsi.fastutil.doubles.DoubleComparator)}
*@see it.unimi.dsi.fastutil.doubles.DoubleBigArrays#binarySearch(double[][],long,long,double,it.unimi.dsi.fastutil.doubles.DoubleComparator)
*<code>public static long it.unimi.dsi.fastutil.doubles.DoubleBigArrays.binarySearch(double[][],long,long,double,it.unimi.dsi.fastutil.doubles.DoubleComparator)
*binarySearch(double[][] p0,long p1,long p2,double p3,it.unimi.dsi.fastutil.doubles.DoubleComparator p4)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static long binarySearch(double[][] p0,long p1,long p2,double p3,it.unimi.dsi.fastutil.doubles.DoubleComparator p4){
	return it.unimi.dsi.fastutil.doubles.DoubleBigArrays.binarySearch(p0,p1,p2,p3,p4);
}
/**
*{@link it.unimi.dsi.fastutil.doubles.DoubleBigArrays#binarySearch(double[][],double,it.unimi.dsi.fastutil.doubles.DoubleComparator)}
*@see it.unimi.dsi.fastutil.doubles.DoubleBigArrays#binarySearch(double[][],double,it.unimi.dsi.fastutil.doubles.DoubleComparator)
*<code>public static long it.unimi.dsi.fastutil.doubles.DoubleBigArrays.binarySearch(double[][],double,it.unimi.dsi.fastutil.doubles.DoubleComparator)
*binarySearch(double[][] p0,double p1,it.unimi.dsi.fastutil.doubles.DoubleComparator p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static long binarySearch(double[][] p0,double p1,it.unimi.dsi.fastutil.doubles.DoubleComparator p2){
	return it.unimi.dsi.fastutil.doubles.DoubleBigArrays.binarySearch(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.doubles.DoubleHeaps#downHeap(double[],int,int,it.unimi.dsi.fastutil.doubles.DoubleComparator)}
*@see it.unimi.dsi.fastutil.doubles.DoubleHeaps#downHeap(double[],int,int,it.unimi.dsi.fastutil.doubles.DoubleComparator)
*<code>public static int it.unimi.dsi.fastutil.doubles.DoubleHeaps.downHeap(double[],int,int,it.unimi.dsi.fastutil.doubles.DoubleComparator)
*downHeap(double[] p0,int p1,int p2,it.unimi.dsi.fastutil.doubles.DoubleComparator p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int downHeap(double[] p0,int p1,int p2,it.unimi.dsi.fastutil.doubles.DoubleComparator p3){
	return it.unimi.dsi.fastutil.doubles.DoubleHeaps.downHeap(p0,p1,p2,p3);
}
/**
*{@link it.unimi.dsi.fastutil.doubles.DoubleIndirectHeaps#downHeap(double[],int[],int[],int,int,it.unimi.dsi.fastutil.doubles.DoubleComparator)}
*@see it.unimi.dsi.fastutil.doubles.DoubleIndirectHeaps#downHeap(double[],int[],int[],int,int,it.unimi.dsi.fastutil.doubles.DoubleComparator)
*<code>public static int it.unimi.dsi.fastutil.doubles.DoubleIndirectHeaps.downHeap(double[],int[],int[],int,int,it.unimi.dsi.fastutil.doubles.DoubleComparator)
*downHeap(double[] p0,int[] p1,int[] p2,int p3,int p4,it.unimi.dsi.fastutil.doubles.DoubleComparator p5)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int downHeap(double[] p0,int[] p1,int[] p2,int p3,int p4,it.unimi.dsi.fastutil.doubles.DoubleComparator p5){
	return it.unimi.dsi.fastutil.doubles.DoubleIndirectHeaps.downHeap(p0,p1,p2,p3,p4,p5);
}
/**
*{@link it.unimi.dsi.fastutil.doubles.DoubleSemiIndirectHeaps#downHeap(double[],int[],int,int,it.unimi.dsi.fastutil.doubles.DoubleComparator)}
*@see it.unimi.dsi.fastutil.doubles.DoubleSemiIndirectHeaps#downHeap(double[],int[],int,int,it.unimi.dsi.fastutil.doubles.DoubleComparator)
*<code>public static int it.unimi.dsi.fastutil.doubles.DoubleSemiIndirectHeaps.downHeap(double[],int[],int,int,it.unimi.dsi.fastutil.doubles.DoubleComparator)
*downHeap(double[] p0,int[] p1,int p2,int p3,it.unimi.dsi.fastutil.doubles.DoubleComparator p4)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int downHeap(double[] p0,int[] p1,int p2,int p3,it.unimi.dsi.fastutil.doubles.DoubleComparator p4){
	return it.unimi.dsi.fastutil.doubles.DoubleSemiIndirectHeaps.downHeap(p0,p1,p2,p3,p4);
}
/**
*{@link it.unimi.dsi.fastutil.doubles.Double2BooleanSortedMaps#entryComparator(it.unimi.dsi.fastutil.doubles.DoubleComparator)}
*@see it.unimi.dsi.fastutil.doubles.Double2BooleanSortedMaps#entryComparator(it.unimi.dsi.fastutil.doubles.DoubleComparator)
*<code>public static java.util.Comparator<? super java.util.Map$Entry<java.lang.Double, ?>> it.unimi.dsi.fastutil.doubles.Double2BooleanSortedMaps.entryComparator(it.unimi.dsi.fastutil.doubles.DoubleComparator)
*entryComparator(it.unimi.dsi.fastutil.doubles.DoubleComparator p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Comparator<? super java.util.Map.Entry<java.lang.Double, ?>> entryComparator(it.unimi.dsi.fastutil.doubles.DoubleComparator p0){
	return it.unimi.dsi.fastutil.doubles.Double2BooleanSortedMaps.entryComparator(p0);
}
/**
*{@link it.unimi.dsi.fastutil.doubles.DoubleSemiIndirectHeaps#front(double[],int[],int,int[],it.unimi.dsi.fastutil.doubles.DoubleComparator)}
*@see it.unimi.dsi.fastutil.doubles.DoubleSemiIndirectHeaps#front(double[],int[],int,int[],it.unimi.dsi.fastutil.doubles.DoubleComparator)
*<code>public static int it.unimi.dsi.fastutil.doubles.DoubleSemiIndirectHeaps.front(double[],int[],int,int[],it.unimi.dsi.fastutil.doubles.DoubleComparator)
*front(double[] p0,int[] p1,int p2,int[] p3,it.unimi.dsi.fastutil.doubles.DoubleComparator p4)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int front(double[] p0,int[] p1,int p2,int[] p3,it.unimi.dsi.fastutil.doubles.DoubleComparator p4){
	return it.unimi.dsi.fastutil.doubles.DoubleSemiIndirectHeaps.front(p0,p1,p2,p3,p4);
}
/**
*{@link it.unimi.dsi.fastutil.doubles.DoubleHeaps#makeHeap(double[],int,it.unimi.dsi.fastutil.doubles.DoubleComparator)}
*@see it.unimi.dsi.fastutil.doubles.DoubleHeaps#makeHeap(double[],int,it.unimi.dsi.fastutil.doubles.DoubleComparator)
*<code>public static void it.unimi.dsi.fastutil.doubles.DoubleHeaps.makeHeap(double[],int,it.unimi.dsi.fastutil.doubles.DoubleComparator)
*makeHeap(double[] p0,int p1,it.unimi.dsi.fastutil.doubles.DoubleComparator p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void makeHeap(double[] p0,int p1,it.unimi.dsi.fastutil.doubles.DoubleComparator p2){
	 it.unimi.dsi.fastutil.doubles.DoubleHeaps.makeHeap(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.doubles.DoubleIndirectHeaps#makeHeap(double[],int,int,int[],int[],it.unimi.dsi.fastutil.doubles.DoubleComparator)}
*@see it.unimi.dsi.fastutil.doubles.DoubleIndirectHeaps#makeHeap(double[],int,int,int[],int[],it.unimi.dsi.fastutil.doubles.DoubleComparator)
*<code>public static void it.unimi.dsi.fastutil.doubles.DoubleIndirectHeaps.makeHeap(double[],int,int,int[],int[],it.unimi.dsi.fastutil.doubles.DoubleComparator)
*makeHeap(double[] p0,int p1,int p2,int[] p3,int[] p4,it.unimi.dsi.fastutil.doubles.DoubleComparator p5)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void makeHeap(double[] p0,int p1,int p2,int[] p3,int[] p4,it.unimi.dsi.fastutil.doubles.DoubleComparator p5){
	 it.unimi.dsi.fastutil.doubles.DoubleIndirectHeaps.makeHeap(p0,p1,p2,p3,p4,p5);
}
/**
*{@link it.unimi.dsi.fastutil.doubles.DoubleIndirectHeaps#makeHeap(double[],int[],int[],int,it.unimi.dsi.fastutil.doubles.DoubleComparator)}
*@see it.unimi.dsi.fastutil.doubles.DoubleIndirectHeaps#makeHeap(double[],int[],int[],int,it.unimi.dsi.fastutil.doubles.DoubleComparator)
*<code>public static void it.unimi.dsi.fastutil.doubles.DoubleIndirectHeaps.makeHeap(double[],int[],int[],int,it.unimi.dsi.fastutil.doubles.DoubleComparator)
*makeHeap(double[] p0,int[] p1,int[] p2,int p3,it.unimi.dsi.fastutil.doubles.DoubleComparator p4)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void makeHeap(double[] p0,int[] p1,int[] p2,int p3,it.unimi.dsi.fastutil.doubles.DoubleComparator p4){
	 it.unimi.dsi.fastutil.doubles.DoubleIndirectHeaps.makeHeap(p0,p1,p2,p3,p4);
}
/**
*{@link it.unimi.dsi.fastutil.doubles.DoubleSemiIndirectHeaps#makeHeap(double[],int,int,it.unimi.dsi.fastutil.doubles.DoubleComparator)}
*@see it.unimi.dsi.fastutil.doubles.DoubleSemiIndirectHeaps#makeHeap(double[],int,int,it.unimi.dsi.fastutil.doubles.DoubleComparator)
*<code>public static int[] it.unimi.dsi.fastutil.doubles.DoubleSemiIndirectHeaps.makeHeap(double[],int,int,it.unimi.dsi.fastutil.doubles.DoubleComparator)
*makeHeap(double[] p0,int p1,int p2,it.unimi.dsi.fastutil.doubles.DoubleComparator p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int[] makeHeap(double[] p0,int p1,int p2,it.unimi.dsi.fastutil.doubles.DoubleComparator p3){
	return it.unimi.dsi.fastutil.doubles.DoubleSemiIndirectHeaps.makeHeap(p0,p1,p2,p3);
}
/**
*{@link it.unimi.dsi.fastutil.doubles.DoubleSemiIndirectHeaps#makeHeap(double[],int[],int,it.unimi.dsi.fastutil.doubles.DoubleComparator)}
*@see it.unimi.dsi.fastutil.doubles.DoubleSemiIndirectHeaps#makeHeap(double[],int[],int,it.unimi.dsi.fastutil.doubles.DoubleComparator)
*<code>public static void it.unimi.dsi.fastutil.doubles.DoubleSemiIndirectHeaps.makeHeap(double[],int[],int,it.unimi.dsi.fastutil.doubles.DoubleComparator)
*makeHeap(double[] p0,int[] p1,int p2,it.unimi.dsi.fastutil.doubles.DoubleComparator p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void makeHeap(double[] p0,int[] p1,int p2,it.unimi.dsi.fastutil.doubles.DoubleComparator p3){
	 it.unimi.dsi.fastutil.doubles.DoubleSemiIndirectHeaps.makeHeap(p0,p1,p2,p3);
}
/**
*{@link it.unimi.dsi.fastutil.doubles.DoubleSemiIndirectHeaps#makeHeap(double[],int,int,int[],it.unimi.dsi.fastutil.doubles.DoubleComparator)}
*@see it.unimi.dsi.fastutil.doubles.DoubleSemiIndirectHeaps#makeHeap(double[],int,int,int[],it.unimi.dsi.fastutil.doubles.DoubleComparator)
*<code>public static void it.unimi.dsi.fastutil.doubles.DoubleSemiIndirectHeaps.makeHeap(double[],int,int,int[],it.unimi.dsi.fastutil.doubles.DoubleComparator)
*makeHeap(double[] p0,int p1,int p2,int[] p3,it.unimi.dsi.fastutil.doubles.DoubleComparator p4)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void makeHeap(double[] p0,int p1,int p2,int[] p3,it.unimi.dsi.fastutil.doubles.DoubleComparator p4){
	 it.unimi.dsi.fastutil.doubles.DoubleSemiIndirectHeaps.makeHeap(p0,p1,p2,p3,p4);
}
/**
*{@link it.unimi.dsi.fastutil.doubles.DoubleArrays#mergeSort(double[],int,int,it.unimi.dsi.fastutil.doubles.DoubleComparator,double...)}
*@see it.unimi.dsi.fastutil.doubles.DoubleArrays#mergeSort(double[],int,int,it.unimi.dsi.fastutil.doubles.DoubleComparator,double...)
*<code>public static void it.unimi.dsi.fastutil.doubles.DoubleArrays.mergeSort(double[],int,int,it.unimi.dsi.fastutil.doubles.DoubleComparator,double[])
*mergeSort(double[] p0,int p1,int p2,it.unimi.dsi.fastutil.doubles.DoubleComparator p3,double... p4)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void mergeSort(double[] p0,int p1,int p2,it.unimi.dsi.fastutil.doubles.DoubleComparator p3,double... p4){
	 it.unimi.dsi.fastutil.doubles.DoubleArrays.mergeSort(p0,p1,p2,p3,p4);
}
/**
*{@link it.unimi.dsi.fastutil.doubles.DoubleArrays#mergeSort(double[],int,int,it.unimi.dsi.fastutil.doubles.DoubleComparator)}
*@see it.unimi.dsi.fastutil.doubles.DoubleArrays#mergeSort(double[],int,int,it.unimi.dsi.fastutil.doubles.DoubleComparator)
*<code>public static void it.unimi.dsi.fastutil.doubles.DoubleArrays.mergeSort(double[],int,int,it.unimi.dsi.fastutil.doubles.DoubleComparator)
*mergeSort(double[] p0,int p1,int p2,it.unimi.dsi.fastutil.doubles.DoubleComparator p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void mergeSort(double[] p0,int p1,int p2,it.unimi.dsi.fastutil.doubles.DoubleComparator p3){
	 it.unimi.dsi.fastutil.doubles.DoubleArrays.mergeSort(p0,p1,p2,p3);
}
/**
*{@link it.unimi.dsi.fastutil.doubles.DoubleArrays#mergeSort(double[],it.unimi.dsi.fastutil.doubles.DoubleComparator)}
*@see it.unimi.dsi.fastutil.doubles.DoubleArrays#mergeSort(double[],it.unimi.dsi.fastutil.doubles.DoubleComparator)
*<code>public static void it.unimi.dsi.fastutil.doubles.DoubleArrays.mergeSort(double[],it.unimi.dsi.fastutil.doubles.DoubleComparator)
*mergeSort(double[] p0,it.unimi.dsi.fastutil.doubles.DoubleComparator p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void mergeSort(double[] p0,it.unimi.dsi.fastutil.doubles.DoubleComparator p1){
	 it.unimi.dsi.fastutil.doubles.DoubleArrays.mergeSort(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.doubles.DoubleComparators#oppositeComparator(it.unimi.dsi.fastutil.doubles.DoubleComparator)}
*@see it.unimi.dsi.fastutil.doubles.DoubleComparators#oppositeComparator(it.unimi.dsi.fastutil.doubles.DoubleComparator)
*<code>public static it.unimi.dsi.fastutil.doubles.DoubleComparator it.unimi.dsi.fastutil.doubles.DoubleComparators.oppositeComparator(it.unimi.dsi.fastutil.doubles.DoubleComparator)
*oppositeComparator(it.unimi.dsi.fastutil.doubles.DoubleComparator p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.doubles.DoubleComparator oppositeComparator(it.unimi.dsi.fastutil.doubles.DoubleComparator p0){
	return it.unimi.dsi.fastutil.doubles.DoubleComparators.oppositeComparator(p0);
}
/**
*{@link it.unimi.dsi.fastutil.doubles.DoubleArrays#parallelQuickSort(double[],it.unimi.dsi.fastutil.doubles.DoubleComparator)}
*@see it.unimi.dsi.fastutil.doubles.DoubleArrays#parallelQuickSort(double[],it.unimi.dsi.fastutil.doubles.DoubleComparator)
*<code>public static void it.unimi.dsi.fastutil.doubles.DoubleArrays.parallelQuickSort(double[],it.unimi.dsi.fastutil.doubles.DoubleComparator)
*parallelQuickSort(double[] p0,it.unimi.dsi.fastutil.doubles.DoubleComparator p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void parallelQuickSort(double[] p0,it.unimi.dsi.fastutil.doubles.DoubleComparator p1){
	 it.unimi.dsi.fastutil.doubles.DoubleArrays.parallelQuickSort(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.doubles.DoubleArrays#parallelQuickSort(double[],int,int,it.unimi.dsi.fastutil.doubles.DoubleComparator)}
*@see it.unimi.dsi.fastutil.doubles.DoubleArrays#parallelQuickSort(double[],int,int,it.unimi.dsi.fastutil.doubles.DoubleComparator)
*<code>public static void it.unimi.dsi.fastutil.doubles.DoubleArrays.parallelQuickSort(double[],int,int,it.unimi.dsi.fastutil.doubles.DoubleComparator)
*parallelQuickSort(double[] p0,int p1,int p2,it.unimi.dsi.fastutil.doubles.DoubleComparator p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void parallelQuickSort(double[] p0,int p1,int p2,it.unimi.dsi.fastutil.doubles.DoubleComparator p3){
	 it.unimi.dsi.fastutil.doubles.DoubleArrays.parallelQuickSort(p0,p1,p2,p3);
}
/**
*{@link it.unimi.dsi.fastutil.doubles.DoubleArrays#quickSort(double[],it.unimi.dsi.fastutil.doubles.DoubleComparator)}
*@see it.unimi.dsi.fastutil.doubles.DoubleArrays#quickSort(double[],it.unimi.dsi.fastutil.doubles.DoubleComparator)
*<code>public static void it.unimi.dsi.fastutil.doubles.DoubleArrays.quickSort(double[],it.unimi.dsi.fastutil.doubles.DoubleComparator)
*quickSort(double[] p0,it.unimi.dsi.fastutil.doubles.DoubleComparator p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void quickSort(double[] p0,it.unimi.dsi.fastutil.doubles.DoubleComparator p1){
	 it.unimi.dsi.fastutil.doubles.DoubleArrays.quickSort(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.doubles.DoubleArrays#quickSort(double[],int,int,it.unimi.dsi.fastutil.doubles.DoubleComparator)}
*@see it.unimi.dsi.fastutil.doubles.DoubleArrays#quickSort(double[],int,int,it.unimi.dsi.fastutil.doubles.DoubleComparator)
*<code>public static void it.unimi.dsi.fastutil.doubles.DoubleArrays.quickSort(double[],int,int,it.unimi.dsi.fastutil.doubles.DoubleComparator)
*quickSort(double[] p0,int p1,int p2,it.unimi.dsi.fastutil.doubles.DoubleComparator p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void quickSort(double[] p0,int p1,int p2,it.unimi.dsi.fastutil.doubles.DoubleComparator p3){
	 it.unimi.dsi.fastutil.doubles.DoubleArrays.quickSort(p0,p1,p2,p3);
}
/**
*{@link it.unimi.dsi.fastutil.doubles.DoubleBigArrays#quickSort(double[][],long,long,it.unimi.dsi.fastutil.doubles.DoubleComparator)}
*@see it.unimi.dsi.fastutil.doubles.DoubleBigArrays#quickSort(double[][],long,long,it.unimi.dsi.fastutil.doubles.DoubleComparator)
*<code>public static void it.unimi.dsi.fastutil.doubles.DoubleBigArrays.quickSort(double[][],long,long,it.unimi.dsi.fastutil.doubles.DoubleComparator)
*quickSort(double[][] p0,long p1,long p2,it.unimi.dsi.fastutil.doubles.DoubleComparator p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void quickSort(double[][] p0,long p1,long p2,it.unimi.dsi.fastutil.doubles.DoubleComparator p3){
	 it.unimi.dsi.fastutil.doubles.DoubleBigArrays.quickSort(p0,p1,p2,p3);
}
/**
*{@link it.unimi.dsi.fastutil.doubles.DoubleBigArrays#quickSort(double[][],it.unimi.dsi.fastutil.doubles.DoubleComparator)}
*@see it.unimi.dsi.fastutil.doubles.DoubleBigArrays#quickSort(double[][],it.unimi.dsi.fastutil.doubles.DoubleComparator)
*<code>public static void it.unimi.dsi.fastutil.doubles.DoubleBigArrays.quickSort(double[][],it.unimi.dsi.fastutil.doubles.DoubleComparator)
*quickSort(double[][] p0,it.unimi.dsi.fastutil.doubles.DoubleComparator p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void quickSort(double[][] p0,it.unimi.dsi.fastutil.doubles.DoubleComparator p1){
	 it.unimi.dsi.fastutil.doubles.DoubleBigArrays.quickSort(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.doubles.Double2BooleanSortedMaps#singleton(java.lang.Double,java.lang.Boolean,it.unimi.dsi.fastutil.doubles.DoubleComparator)}
*@see it.unimi.dsi.fastutil.doubles.Double2BooleanSortedMaps#singleton(java.lang.Double,java.lang.Boolean,it.unimi.dsi.fastutil.doubles.DoubleComparator)
*<code>public static it.unimi.dsi.fastutil.doubles.Double2BooleanSortedMap it.unimi.dsi.fastutil.doubles.Double2BooleanSortedMaps.singleton(java.lang.Double,java.lang.Boolean,it.unimi.dsi.fastutil.doubles.DoubleComparator)
*singleton(java.lang.Double p0,java.lang.Boolean p1,it.unimi.dsi.fastutil.doubles.DoubleComparator p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.doubles.Double2BooleanSortedMap singleton(java.lang.Double p0,java.lang.Boolean p1,it.unimi.dsi.fastutil.doubles.DoubleComparator p2){
	return it.unimi.dsi.fastutil.doubles.Double2BooleanSortedMaps.singleton(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.doubles.Double2BooleanSortedMaps#singleton(double,boolean,it.unimi.dsi.fastutil.doubles.DoubleComparator)}
*@see it.unimi.dsi.fastutil.doubles.Double2BooleanSortedMaps#singleton(double,boolean,it.unimi.dsi.fastutil.doubles.DoubleComparator)
*<code>public static it.unimi.dsi.fastutil.doubles.Double2BooleanSortedMap it.unimi.dsi.fastutil.doubles.Double2BooleanSortedMaps.singleton(double,boolean,it.unimi.dsi.fastutil.doubles.DoubleComparator)
*singleton(double p0,boolean p1,it.unimi.dsi.fastutil.doubles.DoubleComparator p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.doubles.Double2BooleanSortedMap singleton(double p0,boolean p1,it.unimi.dsi.fastutil.doubles.DoubleComparator p2){
	return it.unimi.dsi.fastutil.doubles.Double2BooleanSortedMaps.singleton(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.doubles.Double2ByteSortedMaps#singleton(java.lang.Double,java.lang.Byte,it.unimi.dsi.fastutil.doubles.DoubleComparator)}
*@see it.unimi.dsi.fastutil.doubles.Double2ByteSortedMaps#singleton(java.lang.Double,java.lang.Byte,it.unimi.dsi.fastutil.doubles.DoubleComparator)
*<code>public static it.unimi.dsi.fastutil.doubles.Double2ByteSortedMap it.unimi.dsi.fastutil.doubles.Double2ByteSortedMaps.singleton(java.lang.Double,java.lang.Byte,it.unimi.dsi.fastutil.doubles.DoubleComparator)
*singleton(java.lang.Double p0,java.lang.Byte p1,it.unimi.dsi.fastutil.doubles.DoubleComparator p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.doubles.Double2ByteSortedMap singleton(java.lang.Double p0,java.lang.Byte p1,it.unimi.dsi.fastutil.doubles.DoubleComparator p2){
	return it.unimi.dsi.fastutil.doubles.Double2ByteSortedMaps.singleton(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.doubles.Double2ByteSortedMaps#singleton(double,byte,it.unimi.dsi.fastutil.doubles.DoubleComparator)}
*@see it.unimi.dsi.fastutil.doubles.Double2ByteSortedMaps#singleton(double,byte,it.unimi.dsi.fastutil.doubles.DoubleComparator)
*<code>public static it.unimi.dsi.fastutil.doubles.Double2ByteSortedMap it.unimi.dsi.fastutil.doubles.Double2ByteSortedMaps.singleton(double,byte,it.unimi.dsi.fastutil.doubles.DoubleComparator)
*singleton(double p0,byte p1,it.unimi.dsi.fastutil.doubles.DoubleComparator p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.doubles.Double2ByteSortedMap singleton(double p0,byte p1,it.unimi.dsi.fastutil.doubles.DoubleComparator p2){
	return it.unimi.dsi.fastutil.doubles.Double2ByteSortedMaps.singleton(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.doubles.Double2CharSortedMaps#singleton(java.lang.Double,java.lang.Character,it.unimi.dsi.fastutil.doubles.DoubleComparator)}
*@see it.unimi.dsi.fastutil.doubles.Double2CharSortedMaps#singleton(java.lang.Double,java.lang.Character,it.unimi.dsi.fastutil.doubles.DoubleComparator)
*<code>public static it.unimi.dsi.fastutil.doubles.Double2CharSortedMap it.unimi.dsi.fastutil.doubles.Double2CharSortedMaps.singleton(java.lang.Double,java.lang.Character,it.unimi.dsi.fastutil.doubles.DoubleComparator)
*singleton(java.lang.Double p0,java.lang.Character p1,it.unimi.dsi.fastutil.doubles.DoubleComparator p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.doubles.Double2CharSortedMap singleton(java.lang.Double p0,java.lang.Character p1,it.unimi.dsi.fastutil.doubles.DoubleComparator p2){
	return it.unimi.dsi.fastutil.doubles.Double2CharSortedMaps.singleton(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.doubles.Double2CharSortedMaps#singleton(double,char,it.unimi.dsi.fastutil.doubles.DoubleComparator)}
*@see it.unimi.dsi.fastutil.doubles.Double2CharSortedMaps#singleton(double,char,it.unimi.dsi.fastutil.doubles.DoubleComparator)
*<code>public static it.unimi.dsi.fastutil.doubles.Double2CharSortedMap it.unimi.dsi.fastutil.doubles.Double2CharSortedMaps.singleton(double,char,it.unimi.dsi.fastutil.doubles.DoubleComparator)
*singleton(double p0,char p1,it.unimi.dsi.fastutil.doubles.DoubleComparator p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.doubles.Double2CharSortedMap singleton(double p0,char p1,it.unimi.dsi.fastutil.doubles.DoubleComparator p2){
	return it.unimi.dsi.fastutil.doubles.Double2CharSortedMaps.singleton(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.doubles.Double2DoubleSortedMaps#singleton(java.lang.Double,java.lang.Double,it.unimi.dsi.fastutil.doubles.DoubleComparator)}
*@see it.unimi.dsi.fastutil.doubles.Double2DoubleSortedMaps#singleton(java.lang.Double,java.lang.Double,it.unimi.dsi.fastutil.doubles.DoubleComparator)
*<code>public static it.unimi.dsi.fastutil.doubles.Double2DoubleSortedMap it.unimi.dsi.fastutil.doubles.Double2DoubleSortedMaps.singleton(java.lang.Double,java.lang.Double,it.unimi.dsi.fastutil.doubles.DoubleComparator)
*singleton(java.lang.Double p0,java.lang.Double p1,it.unimi.dsi.fastutil.doubles.DoubleComparator p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.doubles.Double2DoubleSortedMap singleton(java.lang.Double p0,java.lang.Double p1,it.unimi.dsi.fastutil.doubles.DoubleComparator p2){
	return it.unimi.dsi.fastutil.doubles.Double2DoubleSortedMaps.singleton(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.doubles.Double2DoubleSortedMaps#singleton(double,double,it.unimi.dsi.fastutil.doubles.DoubleComparator)}
*@see it.unimi.dsi.fastutil.doubles.Double2DoubleSortedMaps#singleton(double,double,it.unimi.dsi.fastutil.doubles.DoubleComparator)
*<code>public static it.unimi.dsi.fastutil.doubles.Double2DoubleSortedMap it.unimi.dsi.fastutil.doubles.Double2DoubleSortedMaps.singleton(double,double,it.unimi.dsi.fastutil.doubles.DoubleComparator)
*singleton(double p0,double p1,it.unimi.dsi.fastutil.doubles.DoubleComparator p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.doubles.Double2DoubleSortedMap singleton(double p0,double p1,it.unimi.dsi.fastutil.doubles.DoubleComparator p2){
	return it.unimi.dsi.fastutil.doubles.Double2DoubleSortedMaps.singleton(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.doubles.Double2FloatSortedMaps#singleton(java.lang.Double,java.lang.Float,it.unimi.dsi.fastutil.doubles.DoubleComparator)}
*@see it.unimi.dsi.fastutil.doubles.Double2FloatSortedMaps#singleton(java.lang.Double,java.lang.Float,it.unimi.dsi.fastutil.doubles.DoubleComparator)
*<code>public static it.unimi.dsi.fastutil.doubles.Double2FloatSortedMap it.unimi.dsi.fastutil.doubles.Double2FloatSortedMaps.singleton(java.lang.Double,java.lang.Float,it.unimi.dsi.fastutil.doubles.DoubleComparator)
*singleton(java.lang.Double p0,java.lang.Float p1,it.unimi.dsi.fastutil.doubles.DoubleComparator p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.doubles.Double2FloatSortedMap singleton(java.lang.Double p0,java.lang.Float p1,it.unimi.dsi.fastutil.doubles.DoubleComparator p2){
	return it.unimi.dsi.fastutil.doubles.Double2FloatSortedMaps.singleton(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.doubles.Double2FloatSortedMaps#singleton(double,float,it.unimi.dsi.fastutil.doubles.DoubleComparator)}
*@see it.unimi.dsi.fastutil.doubles.Double2FloatSortedMaps#singleton(double,float,it.unimi.dsi.fastutil.doubles.DoubleComparator)
*<code>public static it.unimi.dsi.fastutil.doubles.Double2FloatSortedMap it.unimi.dsi.fastutil.doubles.Double2FloatSortedMaps.singleton(double,float,it.unimi.dsi.fastutil.doubles.DoubleComparator)
*singleton(double p0,float p1,it.unimi.dsi.fastutil.doubles.DoubleComparator p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.doubles.Double2FloatSortedMap singleton(double p0,float p1,it.unimi.dsi.fastutil.doubles.DoubleComparator p2){
	return it.unimi.dsi.fastutil.doubles.Double2FloatSortedMaps.singleton(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.doubles.Double2IntSortedMaps#singleton(java.lang.Double,java.lang.Integer,it.unimi.dsi.fastutil.doubles.DoubleComparator)}
*@see it.unimi.dsi.fastutil.doubles.Double2IntSortedMaps#singleton(java.lang.Double,java.lang.Integer,it.unimi.dsi.fastutil.doubles.DoubleComparator)
*<code>public static it.unimi.dsi.fastutil.doubles.Double2IntSortedMap it.unimi.dsi.fastutil.doubles.Double2IntSortedMaps.singleton(java.lang.Double,java.lang.Integer,it.unimi.dsi.fastutil.doubles.DoubleComparator)
*singleton(java.lang.Double p0,java.lang.Integer p1,it.unimi.dsi.fastutil.doubles.DoubleComparator p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.doubles.Double2IntSortedMap singleton(java.lang.Double p0,java.lang.Integer p1,it.unimi.dsi.fastutil.doubles.DoubleComparator p2){
	return it.unimi.dsi.fastutil.doubles.Double2IntSortedMaps.singleton(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.doubles.Double2IntSortedMaps#singleton(double,int,it.unimi.dsi.fastutil.doubles.DoubleComparator)}
*@see it.unimi.dsi.fastutil.doubles.Double2IntSortedMaps#singleton(double,int,it.unimi.dsi.fastutil.doubles.DoubleComparator)
*<code>public static it.unimi.dsi.fastutil.doubles.Double2IntSortedMap it.unimi.dsi.fastutil.doubles.Double2IntSortedMaps.singleton(double,int,it.unimi.dsi.fastutil.doubles.DoubleComparator)
*singleton(double p0,int p1,it.unimi.dsi.fastutil.doubles.DoubleComparator p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.doubles.Double2IntSortedMap singleton(double p0,int p1,it.unimi.dsi.fastutil.doubles.DoubleComparator p2){
	return it.unimi.dsi.fastutil.doubles.Double2IntSortedMaps.singleton(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.doubles.Double2LongSortedMaps#singleton(java.lang.Double,java.lang.Long,it.unimi.dsi.fastutil.doubles.DoubleComparator)}
*@see it.unimi.dsi.fastutil.doubles.Double2LongSortedMaps#singleton(java.lang.Double,java.lang.Long,it.unimi.dsi.fastutil.doubles.DoubleComparator)
*<code>public static it.unimi.dsi.fastutil.doubles.Double2LongSortedMap it.unimi.dsi.fastutil.doubles.Double2LongSortedMaps.singleton(java.lang.Double,java.lang.Long,it.unimi.dsi.fastutil.doubles.DoubleComparator)
*singleton(java.lang.Double p0,java.lang.Long p1,it.unimi.dsi.fastutil.doubles.DoubleComparator p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.doubles.Double2LongSortedMap singleton(java.lang.Double p0,java.lang.Long p1,it.unimi.dsi.fastutil.doubles.DoubleComparator p2){
	return it.unimi.dsi.fastutil.doubles.Double2LongSortedMaps.singleton(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.doubles.Double2LongSortedMaps#singleton(double,long,it.unimi.dsi.fastutil.doubles.DoubleComparator)}
*@see it.unimi.dsi.fastutil.doubles.Double2LongSortedMaps#singleton(double,long,it.unimi.dsi.fastutil.doubles.DoubleComparator)
*<code>public static it.unimi.dsi.fastutil.doubles.Double2LongSortedMap it.unimi.dsi.fastutil.doubles.Double2LongSortedMaps.singleton(double,long,it.unimi.dsi.fastutil.doubles.DoubleComparator)
*singleton(double p0,long p1,it.unimi.dsi.fastutil.doubles.DoubleComparator p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.doubles.Double2LongSortedMap singleton(double p0,long p1,it.unimi.dsi.fastutil.doubles.DoubleComparator p2){
	return it.unimi.dsi.fastutil.doubles.Double2LongSortedMaps.singleton(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.doubles.Double2ObjectSortedMaps#singleton(java.lang.Double,V,it.unimi.dsi.fastutil.doubles.DoubleComparator)}
*@see it.unimi.dsi.fastutil.doubles.Double2ObjectSortedMaps#singleton(java.lang.Double,V,it.unimi.dsi.fastutil.doubles.DoubleComparator)
*<code>public static <V> it.unimi.dsi.fastutil.doubles.Double2ObjectSortedMap<V> it.unimi.dsi.fastutil.doubles.Double2ObjectSortedMaps.singleton(java.lang.Double,V,it.unimi.dsi.fastutil.doubles.DoubleComparator)
*singleton(java.lang.Double p0,V p1,it.unimi.dsi.fastutil.doubles.DoubleComparator p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <V> it.unimi.dsi.fastutil.doubles.Double2ObjectSortedMap<V> singleton(java.lang.Double p0,V p1,it.unimi.dsi.fastutil.doubles.DoubleComparator p2){
	return it.unimi.dsi.fastutil.doubles.Double2ObjectSortedMaps.singleton(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.doubles.Double2ObjectSortedMaps#singleton(double,V,it.unimi.dsi.fastutil.doubles.DoubleComparator)}
*@see it.unimi.dsi.fastutil.doubles.Double2ObjectSortedMaps#singleton(double,V,it.unimi.dsi.fastutil.doubles.DoubleComparator)
*<code>public static <V> it.unimi.dsi.fastutil.doubles.Double2ObjectSortedMap<V> it.unimi.dsi.fastutil.doubles.Double2ObjectSortedMaps.singleton(double,V,it.unimi.dsi.fastutil.doubles.DoubleComparator)
*singleton(double p0,V p1,it.unimi.dsi.fastutil.doubles.DoubleComparator p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <V> it.unimi.dsi.fastutil.doubles.Double2ObjectSortedMap<V> singleton(double p0,V p1,it.unimi.dsi.fastutil.doubles.DoubleComparator p2){
	return it.unimi.dsi.fastutil.doubles.Double2ObjectSortedMaps.singleton(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.doubles.Double2ShortSortedMaps#singleton(java.lang.Double,java.lang.Short,it.unimi.dsi.fastutil.doubles.DoubleComparator)}
*@see it.unimi.dsi.fastutil.doubles.Double2ShortSortedMaps#singleton(java.lang.Double,java.lang.Short,it.unimi.dsi.fastutil.doubles.DoubleComparator)
*<code>public static it.unimi.dsi.fastutil.doubles.Double2ShortSortedMap it.unimi.dsi.fastutil.doubles.Double2ShortSortedMaps.singleton(java.lang.Double,java.lang.Short,it.unimi.dsi.fastutil.doubles.DoubleComparator)
*singleton(java.lang.Double p0,java.lang.Short p1,it.unimi.dsi.fastutil.doubles.DoubleComparator p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.doubles.Double2ShortSortedMap singleton(java.lang.Double p0,java.lang.Short p1,it.unimi.dsi.fastutil.doubles.DoubleComparator p2){
	return it.unimi.dsi.fastutil.doubles.Double2ShortSortedMaps.singleton(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.doubles.Double2ShortSortedMaps#singleton(double,short,it.unimi.dsi.fastutil.doubles.DoubleComparator)}
*@see it.unimi.dsi.fastutil.doubles.Double2ShortSortedMaps#singleton(double,short,it.unimi.dsi.fastutil.doubles.DoubleComparator)
*<code>public static it.unimi.dsi.fastutil.doubles.Double2ShortSortedMap it.unimi.dsi.fastutil.doubles.Double2ShortSortedMaps.singleton(double,short,it.unimi.dsi.fastutil.doubles.DoubleComparator)
*singleton(double p0,short p1,it.unimi.dsi.fastutil.doubles.DoubleComparator p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.doubles.Double2ShortSortedMap singleton(double p0,short p1,it.unimi.dsi.fastutil.doubles.DoubleComparator p2){
	return it.unimi.dsi.fastutil.doubles.Double2ShortSortedMaps.singleton(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.doubles.DoubleSortedSets#singleton(java.lang.Object,it.unimi.dsi.fastutil.doubles.DoubleComparator)}
*@see it.unimi.dsi.fastutil.doubles.DoubleSortedSets#singleton(java.lang.Object,it.unimi.dsi.fastutil.doubles.DoubleComparator)
*<code>public static it.unimi.dsi.fastutil.doubles.DoubleSortedSet it.unimi.dsi.fastutil.doubles.DoubleSortedSets.singleton(java.lang.Object,it.unimi.dsi.fastutil.doubles.DoubleComparator)
*singleton(java.lang.Object p0,it.unimi.dsi.fastutil.doubles.DoubleComparator p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.doubles.DoubleSortedSet singleton(java.lang.Object p0,it.unimi.dsi.fastutil.doubles.DoubleComparator p1){
	return it.unimi.dsi.fastutil.doubles.DoubleSortedSets.singleton(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.doubles.DoubleSortedSets#singleton(double,it.unimi.dsi.fastutil.doubles.DoubleComparator)}
*@see it.unimi.dsi.fastutil.doubles.DoubleSortedSets#singleton(double,it.unimi.dsi.fastutil.doubles.DoubleComparator)
*<code>public static it.unimi.dsi.fastutil.doubles.DoubleSortedSet it.unimi.dsi.fastutil.doubles.DoubleSortedSets.singleton(double,it.unimi.dsi.fastutil.doubles.DoubleComparator)
*singleton(double p0,it.unimi.dsi.fastutil.doubles.DoubleComparator p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.doubles.DoubleSortedSet singleton(double p0,it.unimi.dsi.fastutil.doubles.DoubleComparator p1){
	return it.unimi.dsi.fastutil.doubles.DoubleSortedSets.singleton(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.doubles.DoubleArrays#stableSort(double[],it.unimi.dsi.fastutil.doubles.DoubleComparator)}
*@see it.unimi.dsi.fastutil.doubles.DoubleArrays#stableSort(double[],it.unimi.dsi.fastutil.doubles.DoubleComparator)
*<code>public static void it.unimi.dsi.fastutil.doubles.DoubleArrays.stableSort(double[],it.unimi.dsi.fastutil.doubles.DoubleComparator)
*stableSort(double[] p0,it.unimi.dsi.fastutil.doubles.DoubleComparator p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void stableSort(double[] p0,it.unimi.dsi.fastutil.doubles.DoubleComparator p1){
	 it.unimi.dsi.fastutil.doubles.DoubleArrays.stableSort(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.doubles.DoubleArrays#stableSort(double[],int,int,it.unimi.dsi.fastutil.doubles.DoubleComparator)}
*@see it.unimi.dsi.fastutil.doubles.DoubleArrays#stableSort(double[],int,int,it.unimi.dsi.fastutil.doubles.DoubleComparator)
*<code>public static void it.unimi.dsi.fastutil.doubles.DoubleArrays.stableSort(double[],int,int,it.unimi.dsi.fastutil.doubles.DoubleComparator)
*stableSort(double[] p0,int p1,int p2,it.unimi.dsi.fastutil.doubles.DoubleComparator p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void stableSort(double[] p0,int p1,int p2,it.unimi.dsi.fastutil.doubles.DoubleComparator p3){
	 it.unimi.dsi.fastutil.doubles.DoubleArrays.stableSort(p0,p1,p2,p3);
}
/**
*{@link it.unimi.dsi.fastutil.doubles.DoubleArrays#unstableSort(double[],int,int,it.unimi.dsi.fastutil.doubles.DoubleComparator)}
*@see it.unimi.dsi.fastutil.doubles.DoubleArrays#unstableSort(double[],int,int,it.unimi.dsi.fastutil.doubles.DoubleComparator)
*<code>public static void it.unimi.dsi.fastutil.doubles.DoubleArrays.unstableSort(double[],int,int,it.unimi.dsi.fastutil.doubles.DoubleComparator)
*unstableSort(double[] p0,int p1,int p2,it.unimi.dsi.fastutil.doubles.DoubleComparator p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void unstableSort(double[] p0,int p1,int p2,it.unimi.dsi.fastutil.doubles.DoubleComparator p3){
	 it.unimi.dsi.fastutil.doubles.DoubleArrays.unstableSort(p0,p1,p2,p3);
}
/**
*{@link it.unimi.dsi.fastutil.doubles.DoubleArrays#unstableSort(double[],it.unimi.dsi.fastutil.doubles.DoubleComparator)}
*@see it.unimi.dsi.fastutil.doubles.DoubleArrays#unstableSort(double[],it.unimi.dsi.fastutil.doubles.DoubleComparator)
*<code>public static void it.unimi.dsi.fastutil.doubles.DoubleArrays.unstableSort(double[],it.unimi.dsi.fastutil.doubles.DoubleComparator)
*unstableSort(double[] p0,it.unimi.dsi.fastutil.doubles.DoubleComparator p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void unstableSort(double[] p0,it.unimi.dsi.fastutil.doubles.DoubleComparator p1){
	 it.unimi.dsi.fastutil.doubles.DoubleArrays.unstableSort(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.doubles.DoubleHeaps#upHeap(double[],int,int,it.unimi.dsi.fastutil.doubles.DoubleComparator)}
*@see it.unimi.dsi.fastutil.doubles.DoubleHeaps#upHeap(double[],int,int,it.unimi.dsi.fastutil.doubles.DoubleComparator)
*<code>public static int it.unimi.dsi.fastutil.doubles.DoubleHeaps.upHeap(double[],int,int,it.unimi.dsi.fastutil.doubles.DoubleComparator)
*upHeap(double[] p0,int p1,int p2,it.unimi.dsi.fastutil.doubles.DoubleComparator p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int upHeap(double[] p0,int p1,int p2,it.unimi.dsi.fastutil.doubles.DoubleComparator p3){
	return it.unimi.dsi.fastutil.doubles.DoubleHeaps.upHeap(p0,p1,p2,p3);
}
/**
*{@link it.unimi.dsi.fastutil.doubles.DoubleIndirectHeaps#upHeap(double[],int[],int[],int,int,it.unimi.dsi.fastutil.doubles.DoubleComparator)}
*@see it.unimi.dsi.fastutil.doubles.DoubleIndirectHeaps#upHeap(double[],int[],int[],int,int,it.unimi.dsi.fastutil.doubles.DoubleComparator)
*<code>public static int it.unimi.dsi.fastutil.doubles.DoubleIndirectHeaps.upHeap(double[],int[],int[],int,int,it.unimi.dsi.fastutil.doubles.DoubleComparator)
*upHeap(double[] p0,int[] p1,int[] p2,int p3,int p4,it.unimi.dsi.fastutil.doubles.DoubleComparator p5)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int upHeap(double[] p0,int[] p1,int[] p2,int p3,int p4,it.unimi.dsi.fastutil.doubles.DoubleComparator p5){
	return it.unimi.dsi.fastutil.doubles.DoubleIndirectHeaps.upHeap(p0,p1,p2,p3,p4,p5);
}
/**
*{@link it.unimi.dsi.fastutil.doubles.DoubleSemiIndirectHeaps#upHeap(double[],int[],int,int,it.unimi.dsi.fastutil.doubles.DoubleComparator)}
*@see it.unimi.dsi.fastutil.doubles.DoubleSemiIndirectHeaps#upHeap(double[],int[],int,int,it.unimi.dsi.fastutil.doubles.DoubleComparator)
*<code>public static int it.unimi.dsi.fastutil.doubles.DoubleSemiIndirectHeaps.upHeap(double[],int[],int,int,it.unimi.dsi.fastutil.doubles.DoubleComparator)
*upHeap(double[] p0,int[] p1,int p2,int p3,it.unimi.dsi.fastutil.doubles.DoubleComparator p4)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int upHeap(double[] p0,int[] p1,int p2,int p3,it.unimi.dsi.fastutil.doubles.DoubleComparator p4){
	return it.unimi.dsi.fastutil.doubles.DoubleSemiIndirectHeaps.upHeap(p0,p1,p2,p3,p4);
}
}
