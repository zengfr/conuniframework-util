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
public final class LongArrayUtil{ 
/**
*{@link it.unimi.dsi.fastutil.BigArrays#add(long[][],long,long)}
*@see it.unimi.dsi.fastutil.BigArrays#add(long[][],long,long)
*<code>public static void it.unimi.dsi.fastutil.BigArrays.add(long[][],long,long)
*add(long[][] p0,long p1,long p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void add(long[][] p0,long p1,long p2){
	 it.unimi.dsi.fastutil.BigArrays.add(p0,p1,p2);
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
*{@link it.unimi.dsi.fastutil.longs.LongBigArrays#binarySearch(long[][],long,long,long)}
*@see it.unimi.dsi.fastutil.longs.LongBigArrays#binarySearch(long[][],long,long,long)
*<code>public static long it.unimi.dsi.fastutil.longs.LongBigArrays.binarySearch(long[][],long,long,long)
*binarySearch(long[][] p0,long p1,long p2,long p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static long binarySearch(long[][] p0,long p1,long p2,long p3){
	return it.unimi.dsi.fastutil.longs.LongBigArrays.binarySearch(p0,p1,p2,p3);
}
/**
*{@link it.unimi.dsi.fastutil.longs.LongBigArrays#binarySearch(long[][],long)}
*@see it.unimi.dsi.fastutil.longs.LongBigArrays#binarySearch(long[][],long)
*<code>public static long it.unimi.dsi.fastutil.longs.LongBigArrays.binarySearch(long[][],long)
*binarySearch(long[][] p0,long p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static long binarySearch(long[][] p0,long p1){
	return it.unimi.dsi.fastutil.longs.LongBigArrays.binarySearch(p0,p1);
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
*{@link org.apache.commons.math3.util.MathArrays#checkNonNegative(long[]...)}
*@see org.apache.commons.math3.util.MathArrays#checkNonNegative(long[]...)
*<code>public static void org.apache.commons.math3.util.MathArrays.checkNonNegative(long[][]) throws org.apache.commons.math3.exception.NotPositiveException
*checkNonNegative(long[]... p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void checkNonNegative(long[]... p0) throws org.apache.commons.math3.exception.NotPositiveException{
	 org.apache.commons.math3.util.MathArrays.checkNonNegative(p0);
}
/**
*{@link org.apache.commons.math3.util.MathArrays#checkRectangular(long[]...)}
*@see org.apache.commons.math3.util.MathArrays#checkRectangular(long[]...)
*<code>public static void org.apache.commons.math3.util.MathArrays.checkRectangular(long[][]) throws org.apache.commons.math3.exception.NullArgumentException,org.apache.commons.math3.exception.DimensionMismatchException
*checkRectangular(long[]... p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void checkRectangular(long[]... p0) throws org.apache.commons.math3.exception.NullArgumentException,org.apache.commons.math3.exception.DimensionMismatchException{
	 org.apache.commons.math3.util.MathArrays.checkRectangular(p0);
}
/**
*{@link org.apache.commons.math3.stat.inference.TestUtils#chiSquare(long[]...)}
*@see org.apache.commons.math3.stat.inference.TestUtils#chiSquare(long[]...)
*<code>public static double org.apache.commons.math3.stat.inference.TestUtils.chiSquare(long[][]) throws org.apache.commons.math3.exception.NullArgumentException,org.apache.commons.math3.exception.NotPositiveException,org.apache.commons.math3.exception.DimensionMismatchException
*chiSquare(long[]... p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static double chiSquare(long[]... p0) throws org.apache.commons.math3.exception.NullArgumentException,org.apache.commons.math3.exception.NotPositiveException,org.apache.commons.math3.exception.DimensionMismatchException{
	return org.apache.commons.math3.stat.inference.TestUtils.chiSquare(p0);
}
/**
*{@link org.apache.commons.math3.stat.inference.TestUtils#chiSquareTest(long[]...)}
*@see org.apache.commons.math3.stat.inference.TestUtils#chiSquareTest(long[]...)
*<code>public static double org.apache.commons.math3.stat.inference.TestUtils.chiSquareTest(long[][]) throws org.apache.commons.math3.exception.NullArgumentException,org.apache.commons.math3.exception.DimensionMismatchException,org.apache.commons.math3.exception.NotPositiveException,org.apache.commons.math3.exception.MaxCountExceededException
*chiSquareTest(long[]... p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static double chiSquareTest(long[]... p0) throws org.apache.commons.math3.exception.NullArgumentException,org.apache.commons.math3.exception.DimensionMismatchException,org.apache.commons.math3.exception.NotPositiveException,org.apache.commons.math3.exception.MaxCountExceededException{
	return org.apache.commons.math3.stat.inference.TestUtils.chiSquareTest(p0);
}
/**
*{@link org.apache.commons.math3.stat.inference.TestUtils#chiSquareTest(long[][],double)}
*@see org.apache.commons.math3.stat.inference.TestUtils#chiSquareTest(long[][],double)
*<code>public static boolean org.apache.commons.math3.stat.inference.TestUtils.chiSquareTest(long[][],double) throws org.apache.commons.math3.exception.NullArgumentException,org.apache.commons.math3.exception.DimensionMismatchException,org.apache.commons.math3.exception.NotPositiveException,org.apache.commons.math3.exception.OutOfRangeException,org.apache.commons.math3.exception.MaxCountExceededException
*chiSquareTest(long[][] p0,double p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean chiSquareTest(long[][] p0,double p1) throws org.apache.commons.math3.exception.NullArgumentException,org.apache.commons.math3.exception.DimensionMismatchException,org.apache.commons.math3.exception.NotPositiveException,org.apache.commons.math3.exception.OutOfRangeException,org.apache.commons.math3.exception.MaxCountExceededException{
	return org.apache.commons.math3.stat.inference.TestUtils.chiSquareTest(p0,p1);
}
/**
*{@link com.google.common.primitives.Longs#concat(long[]...)}
*@see com.google.common.primitives.Longs#concat(long[]...)
*<code>public static long[] com.google.common.primitives.Longs.concat(long[]...)
*concat(long[]... p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static long[] concat(long[]... p0){
	return com.google.common.primitives.Longs.concat(p0);
}
/**
*{@link it.unimi.dsi.fastutil.BigArrays#copy(long[][],long,long[][],long,long)}
*@see it.unimi.dsi.fastutil.BigArrays#copy(long[][],long,long[][],long,long)
*<code>public static void it.unimi.dsi.fastutil.BigArrays.copy(long[][],long,long[][],long,long)
*copy(long[][] p0,long p1,long[][] p2,long p3,long p4)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void copy(long[][] p0,long p1,long[][] p2,long p3,long p4){
	 it.unimi.dsi.fastutil.BigArrays.copy(p0,p1,p2,p3,p4);
}
/**
*{@link it.unimi.dsi.fastutil.BigArrays#copy(long[][],long,long)}
*@see it.unimi.dsi.fastutil.BigArrays#copy(long[][],long,long)
*<code>public static long[][] it.unimi.dsi.fastutil.BigArrays.copy(long[][],long,long)
*copy(long[][] p0,long p1,long p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static long[][] copy(long[][] p0,long p1,long p2){
	return it.unimi.dsi.fastutil.BigArrays.copy(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.BigArrays#copy(long[]...)}
*@see it.unimi.dsi.fastutil.BigArrays#copy(long[]...)
*<code>public static long[][] it.unimi.dsi.fastutil.BigArrays.copy(long[][])
*copy(long[]... p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static long[][] copy(long[]... p0){
	return it.unimi.dsi.fastutil.BigArrays.copy(p0);
}
/**
*{@link it.unimi.dsi.fastutil.BigArrays#copyFromBig(long[][],long,long[],int,int)}
*@see it.unimi.dsi.fastutil.BigArrays#copyFromBig(long[][],long,long[],int,int)
*<code>public static void it.unimi.dsi.fastutil.BigArrays.copyFromBig(long[][],long,long[],int,int)
*copyFromBig(long[][] p0,long p1,long[] p2,int p3,int p4)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void copyFromBig(long[][] p0,long p1,long[] p2,int p3,int p4){
	 it.unimi.dsi.fastutil.BigArrays.copyFromBig(p0,p1,p2,p3,p4);
}
/**
*{@link it.unimi.dsi.fastutil.BigArrays#copyToBig(long[],int,long[][],long,long)}
*@see it.unimi.dsi.fastutil.BigArrays#copyToBig(long[],int,long[][],long,long)
*<code>public static void it.unimi.dsi.fastutil.BigArrays.copyToBig(long[],int,long[][],long,long)
*copyToBig(long[] p0,int p1,long[][] p2,long p3,long p4)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void copyToBig(long[] p0,int p1,long[][] p2,long p3,long p4){
	 it.unimi.dsi.fastutil.BigArrays.copyToBig(p0,p1,p2,p3,p4);
}
/**
*{@link it.unimi.dsi.fastutil.BigArrays#decr(long[][],long)}
*@see it.unimi.dsi.fastutil.BigArrays#decr(long[][],long)
*<code>public static void it.unimi.dsi.fastutil.BigArrays.decr(long[][],long)
*decr(long[][] p0,long p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void decr(long[][] p0,long p1){
	 it.unimi.dsi.fastutil.BigArrays.decr(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.BigArrays#ensureCapacity(long[][],long,long)}
*@see it.unimi.dsi.fastutil.BigArrays#ensureCapacity(long[][],long,long)
*<code>public static long[][] it.unimi.dsi.fastutil.BigArrays.ensureCapacity(long[][],long,long)
*ensureCapacity(long[][] p0,long p1,long p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static long[][] ensureCapacity(long[][] p0,long p1,long p2){
	return it.unimi.dsi.fastutil.BigArrays.ensureCapacity(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.BigArrays#ensureCapacity(long[][],long)}
*@see it.unimi.dsi.fastutil.BigArrays#ensureCapacity(long[][],long)
*<code>public static long[][] it.unimi.dsi.fastutil.BigArrays.ensureCapacity(long[][],long)
*ensureCapacity(long[][] p0,long p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static long[][] ensureCapacity(long[][] p0,long p1){
	return it.unimi.dsi.fastutil.BigArrays.ensureCapacity(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.BigArrays#ensureFromTo(long[][],long,long)}
*@see it.unimi.dsi.fastutil.BigArrays#ensureFromTo(long[][],long,long)
*<code>public static void it.unimi.dsi.fastutil.BigArrays.ensureFromTo(long[][],long,long)
*ensureFromTo(long[][] p0,long p1,long p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void ensureFromTo(long[][] p0,long p1,long p2){
	 it.unimi.dsi.fastutil.BigArrays.ensureFromTo(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.BigArrays#ensureOffsetLength(long[][],long,long)}
*@see it.unimi.dsi.fastutil.BigArrays#ensureOffsetLength(long[][],long,long)
*<code>public static void it.unimi.dsi.fastutil.BigArrays.ensureOffsetLength(long[][],long,long)
*ensureOffsetLength(long[][] p0,long p1,long p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void ensureOffsetLength(long[][] p0,long p1,long p2){
	 it.unimi.dsi.fastutil.BigArrays.ensureOffsetLength(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.BigArrays#ensureSameLength(long[][],long[]...)}
*@see it.unimi.dsi.fastutil.BigArrays#ensureSameLength(long[][],long[]...)
*<code>public static void it.unimi.dsi.fastutil.BigArrays.ensureSameLength(long[][],long[][])
*ensureSameLength(long[][] p0,long[]... p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void ensureSameLength(long[][] p0,long[]... p1){
	 it.unimi.dsi.fastutil.BigArrays.ensureSameLength(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.BigArrays#fill(long[][],long,long,long)}
*@see it.unimi.dsi.fastutil.BigArrays#fill(long[][],long,long,long)
*<code>public static void it.unimi.dsi.fastutil.BigArrays.fill(long[][],long,long,long)
*fill(long[][] p0,long p1,long p2,long p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void fill(long[][] p0,long p1,long p2,long p3){
	 it.unimi.dsi.fastutil.BigArrays.fill(p0,p1,p2,p3);
}
/**
*{@link it.unimi.dsi.fastutil.BigArrays#fill(long[][],long)}
*@see it.unimi.dsi.fastutil.BigArrays#fill(long[][],long)
*<code>public static void it.unimi.dsi.fastutil.BigArrays.fill(long[][],long)
*fill(long[][] p0,long p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void fill(long[][] p0,long p1){
	 it.unimi.dsi.fastutil.BigArrays.fill(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.BigArrays#forceCapacity(long[][],long,long)}
*@see it.unimi.dsi.fastutil.BigArrays#forceCapacity(long[][],long,long)
*<code>public static long[][] it.unimi.dsi.fastutil.BigArrays.forceCapacity(long[][],long,long)
*forceCapacity(long[][] p0,long p1,long p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static long[][] forceCapacity(long[][] p0,long p1,long p2){
	return it.unimi.dsi.fastutil.BigArrays.forceCapacity(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.BigArrays#grow(long[][],long,long)}
*@see it.unimi.dsi.fastutil.BigArrays#grow(long[][],long,long)
*<code>public static long[][] it.unimi.dsi.fastutil.BigArrays.grow(long[][],long,long)
*grow(long[][] p0,long p1,long p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static long[][] grow(long[][] p0,long p1,long p2){
	return it.unimi.dsi.fastutil.BigArrays.grow(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.BigArrays#grow(long[][],long)}
*@see it.unimi.dsi.fastutil.BigArrays#grow(long[][],long)
*<code>public static long[][] it.unimi.dsi.fastutil.BigArrays.grow(long[][],long)
*grow(long[][] p0,long p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static long[][] grow(long[][] p0,long p1){
	return it.unimi.dsi.fastutil.BigArrays.grow(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.BigArrays#incr(long[][],long)}
*@see it.unimi.dsi.fastutil.BigArrays#incr(long[][],long)
*<code>public static void it.unimi.dsi.fastutil.BigArrays.incr(long[][],long)
*incr(long[][] p0,long p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void incr(long[][] p0,long p1){
	 it.unimi.dsi.fastutil.BigArrays.incr(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.BigArrays#length(long[]...)}
*@see it.unimi.dsi.fastutil.BigArrays#length(long[]...)
*<code>public static long it.unimi.dsi.fastutil.BigArrays.length(long[][])
*length(long[]... p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static long length(long[]... p0){
	return it.unimi.dsi.fastutil.BigArrays.length(p0);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#loadLongs(java.io.DataInput,long[]...)}
*@see it.unimi.dsi.fastutil.io.BinIO#loadLongs(java.io.DataInput,long[]...)
*<code>public static long it.unimi.dsi.fastutil.io.BinIO.loadLongs(java.io.DataInput,long[][]) throws java.io.IOException
*loadLongs(java.io.DataInput p0,long[]... p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static long loadLongs(java.io.DataInput p0,long[]... p1) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.loadLongs(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#loadLongs(java.io.DataInput,long[][],long,long)}
*@see it.unimi.dsi.fastutil.io.BinIO#loadLongs(java.io.DataInput,long[][],long,long)
*<code>public static long it.unimi.dsi.fastutil.io.BinIO.loadLongs(java.io.DataInput,long[][],long,long) throws java.io.IOException
*loadLongs(java.io.DataInput p0,long[][] p1,long p2,long p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static long loadLongs(java.io.DataInput p0,long[][] p1,long p2,long p3) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.loadLongs(p0,p1,p2,p3);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#loadLongs(java.io.File,long[][],long,long)}
*@see it.unimi.dsi.fastutil.io.BinIO#loadLongs(java.io.File,long[][],long,long)
*<code>public static long it.unimi.dsi.fastutil.io.BinIO.loadLongs(java.io.File,long[][],long,long) throws java.io.IOException
*loadLongs(java.io.File p0,long[][] p1,long p2,long p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static long loadLongs(java.io.File p0,long[][] p1,long p2,long p3) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.loadLongs(p0,p1,p2,p3);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#loadLongs(java.lang.CharSequence,long[]...)}
*@see it.unimi.dsi.fastutil.io.BinIO#loadLongs(java.lang.CharSequence,long[]...)
*<code>public static long it.unimi.dsi.fastutil.io.BinIO.loadLongs(java.lang.CharSequence,long[][]) throws java.io.IOException
*loadLongs(java.lang.CharSequence p0,long[]... p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static long loadLongs(java.lang.CharSequence p0,long[]... p1) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.loadLongs(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#loadLongs(java.lang.CharSequence,long[][],long,long)}
*@see it.unimi.dsi.fastutil.io.BinIO#loadLongs(java.lang.CharSequence,long[][],long,long)
*<code>public static long it.unimi.dsi.fastutil.io.BinIO.loadLongs(java.lang.CharSequence,long[][],long,long) throws java.io.IOException
*loadLongs(java.lang.CharSequence p0,long[][] p1,long p2,long p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static long loadLongs(java.lang.CharSequence p0,long[][] p1,long p2,long p3) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.loadLongs(p0,p1,p2,p3);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#loadLongs(java.io.File,long[]...)}
*@see it.unimi.dsi.fastutil.io.BinIO#loadLongs(java.io.File,long[]...)
*<code>public static long it.unimi.dsi.fastutil.io.BinIO.loadLongs(java.io.File,long[][]) throws java.io.IOException
*loadLongs(java.io.File p0,long[]... p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static long loadLongs(java.io.File p0,long[]... p1) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.loadLongs(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.io.TextIO#loadLongs(java.io.BufferedReader,long[][],long,long)}
*@see it.unimi.dsi.fastutil.io.TextIO#loadLongs(java.io.BufferedReader,long[][],long,long)
*<code>public static long it.unimi.dsi.fastutil.io.TextIO.loadLongs(java.io.BufferedReader,long[][],long,long) throws java.io.IOException
*loadLongs(java.io.BufferedReader p0,long[][] p1,long p2,long p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static long loadLongs(java.io.BufferedReader p0,long[][] p1,long p2,long p3) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.TextIO.loadLongs(p0,p1,p2,p3);
}
/**
*{@link it.unimi.dsi.fastutil.io.TextIO#loadLongs(java.io.BufferedReader,long[]...)}
*@see it.unimi.dsi.fastutil.io.TextIO#loadLongs(java.io.BufferedReader,long[]...)
*<code>public static long it.unimi.dsi.fastutil.io.TextIO.loadLongs(java.io.BufferedReader,long[][]) throws java.io.IOException
*loadLongs(java.io.BufferedReader p0,long[]... p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static long loadLongs(java.io.BufferedReader p0,long[]... p1) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.TextIO.loadLongs(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#loadLongsBig(java.io.File)}
*@see it.unimi.dsi.fastutil.io.BinIO#loadLongsBig(java.io.File)
*<code>public static long[][] it.unimi.dsi.fastutil.io.BinIO.loadLongsBig(java.io.File) throws java.io.IOException
*loadLongsBig(java.io.File p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static long[][] loadLongsBig(java.io.File p0) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.loadLongsBig(p0);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#loadLongsBig(java.lang.CharSequence)}
*@see it.unimi.dsi.fastutil.io.BinIO#loadLongsBig(java.lang.CharSequence)
*<code>public static long[][] it.unimi.dsi.fastutil.io.BinIO.loadLongsBig(java.lang.CharSequence) throws java.io.IOException
*loadLongsBig(java.lang.CharSequence p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static long[][] loadLongsBig(java.lang.CharSequence p0) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.loadLongsBig(p0);
}
/**
*{@link it.unimi.dsi.fastutil.BigArrays#mul(long[][],long,long)}
*@see it.unimi.dsi.fastutil.BigArrays#mul(long[][],long,long)
*<code>public static void it.unimi.dsi.fastutil.BigArrays.mul(long[][],long,long)
*mul(long[][] p0,long p1,long p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void mul(long[][] p0,long p1,long p2){
	 it.unimi.dsi.fastutil.BigArrays.mul(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.longs.LongBigArrays#newBigArray(long)}
*@see it.unimi.dsi.fastutil.longs.LongBigArrays#newBigArray(long)
*<code>public static long[][] it.unimi.dsi.fastutil.longs.LongBigArrays.newBigArray(long)
*newBigArray(long p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static long[][] newBigArray(long p0){
	return it.unimi.dsi.fastutil.longs.LongBigArrays.newBigArray(p0);
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
*{@link it.unimi.dsi.fastutil.longs.LongBigArrays#quickSort(long[][],long,long)}
*@see it.unimi.dsi.fastutil.longs.LongBigArrays#quickSort(long[][],long,long)
*<code>public static void it.unimi.dsi.fastutil.longs.LongBigArrays.quickSort(long[][],long,long)
*quickSort(long[][] p0,long p1,long p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void quickSort(long[][] p0,long p1,long p2){
	 it.unimi.dsi.fastutil.longs.LongBigArrays.quickSort(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.longs.LongBigArrays#quickSort(long[]...)}
*@see it.unimi.dsi.fastutil.longs.LongBigArrays#quickSort(long[]...)
*<code>public static void it.unimi.dsi.fastutil.longs.LongBigArrays.quickSort(long[][])
*quickSort(long[]... p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void quickSort(long[]... p0){
	 it.unimi.dsi.fastutil.longs.LongBigArrays.quickSort(p0);
}
/**
*{@link it.unimi.dsi.fastutil.longs.LongArrays#radixSort(long[][],int,int)}
*@see it.unimi.dsi.fastutil.longs.LongArrays#radixSort(long[][],int,int)
*<code>public static void it.unimi.dsi.fastutil.longs.LongArrays.radixSort(long[][],int,int)
*radixSort(long[][] p0,int p1,int p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void radixSort(long[][] p0,int p1,int p2){
	 it.unimi.dsi.fastutil.longs.LongArrays.radixSort(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.longs.LongArrays#radixSort(long[]...)}
*@see it.unimi.dsi.fastutil.longs.LongArrays#radixSort(long[]...)
*<code>public static void it.unimi.dsi.fastutil.longs.LongArrays.radixSort(long[][])
*radixSort(long[]... p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void radixSort(long[]... p0){
	 it.unimi.dsi.fastutil.longs.LongArrays.radixSort(p0);
}
/**
*{@link it.unimi.dsi.fastutil.longs.LongBigArrays#radixSort(long[][],long[][],long,long)}
*@see it.unimi.dsi.fastutil.longs.LongBigArrays#radixSort(long[][],long[][],long,long)
*<code>public static void it.unimi.dsi.fastutil.longs.LongBigArrays.radixSort(long[][],long[][],long,long)
*radixSort(long[][] p0,long[][] p1,long p2,long p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void radixSort(long[][] p0,long[][] p1,long p2,long p3){
	 it.unimi.dsi.fastutil.longs.LongBigArrays.radixSort(p0,p1,p2,p3);
}
/**
*{@link it.unimi.dsi.fastutil.longs.LongBigArrays#radixSort(long[][],long[]...)}
*@see it.unimi.dsi.fastutil.longs.LongBigArrays#radixSort(long[][],long[]...)
*<code>public static void it.unimi.dsi.fastutil.longs.LongBigArrays.radixSort(long[][],long[][])
*radixSort(long[][] p0,long[]... p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void radixSort(long[][] p0,long[]... p1){
	 it.unimi.dsi.fastutil.longs.LongBigArrays.radixSort(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.longs.LongBigArrays#radixSort(long[][],long,long)}
*@see it.unimi.dsi.fastutil.longs.LongBigArrays#radixSort(long[][],long,long)
*<code>public static void it.unimi.dsi.fastutil.longs.LongBigArrays.radixSort(long[][],long,long)
*radixSort(long[][] p0,long p1,long p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void radixSort(long[][] p0,long p1,long p2){
	 it.unimi.dsi.fastutil.longs.LongBigArrays.radixSort(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.bytes.ByteBigArrays#radixSortIndirect(long[][],byte[][],byte[][],boolean)}
*@see it.unimi.dsi.fastutil.bytes.ByteBigArrays#radixSortIndirect(long[][],byte[][],byte[][],boolean)
*<code>public static void it.unimi.dsi.fastutil.bytes.ByteBigArrays.radixSortIndirect(long[][],byte[][],byte[][],boolean)
*radixSortIndirect(long[][] p0,byte[][] p1,byte[][] p2,boolean p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void radixSortIndirect(long[][] p0,byte[][] p1,byte[][] p2,boolean p3){
	 it.unimi.dsi.fastutil.bytes.ByteBigArrays.radixSortIndirect(p0,p1,p2,p3);
}
/**
*{@link it.unimi.dsi.fastutil.bytes.ByteBigArrays#radixSortIndirect(long[][],byte[][],byte[][],long,long,boolean)}
*@see it.unimi.dsi.fastutil.bytes.ByteBigArrays#radixSortIndirect(long[][],byte[][],byte[][],long,long,boolean)
*<code>public static void it.unimi.dsi.fastutil.bytes.ByteBigArrays.radixSortIndirect(long[][],byte[][],byte[][],long,long,boolean)
*radixSortIndirect(long[][] p0,byte[][] p1,byte[][] p2,long p3,long p4,boolean p5)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void radixSortIndirect(long[][] p0,byte[][] p1,byte[][] p2,long p3,long p4,boolean p5){
	 it.unimi.dsi.fastutil.bytes.ByteBigArrays.radixSortIndirect(p0,p1,p2,p3,p4,p5);
}
/**
*{@link it.unimi.dsi.fastutil.chars.CharBigArrays#radixSortIndirect(long[][],char[][],char[][],boolean)}
*@see it.unimi.dsi.fastutil.chars.CharBigArrays#radixSortIndirect(long[][],char[][],char[][],boolean)
*<code>public static void it.unimi.dsi.fastutil.chars.CharBigArrays.radixSortIndirect(long[][],char[][],char[][],boolean)
*radixSortIndirect(long[][] p0,char[][] p1,char[][] p2,boolean p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void radixSortIndirect(long[][] p0,char[][] p1,char[][] p2,boolean p3){
	 it.unimi.dsi.fastutil.chars.CharBigArrays.radixSortIndirect(p0,p1,p2,p3);
}
/**
*{@link it.unimi.dsi.fastutil.chars.CharBigArrays#radixSortIndirect(long[][],char[][],char[][],long,long,boolean)}
*@see it.unimi.dsi.fastutil.chars.CharBigArrays#radixSortIndirect(long[][],char[][],char[][],long,long,boolean)
*<code>public static void it.unimi.dsi.fastutil.chars.CharBigArrays.radixSortIndirect(long[][],char[][],char[][],long,long,boolean)
*radixSortIndirect(long[][] p0,char[][] p1,char[][] p2,long p3,long p4,boolean p5)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void radixSortIndirect(long[][] p0,char[][] p1,char[][] p2,long p3,long p4,boolean p5){
	 it.unimi.dsi.fastutil.chars.CharBigArrays.radixSortIndirect(p0,p1,p2,p3,p4,p5);
}
/**
*{@link it.unimi.dsi.fastutil.doubles.DoubleBigArrays#radixSortIndirect(long[][],double[][],double[][],boolean)}
*@see it.unimi.dsi.fastutil.doubles.DoubleBigArrays#radixSortIndirect(long[][],double[][],double[][],boolean)
*<code>public static void it.unimi.dsi.fastutil.doubles.DoubleBigArrays.radixSortIndirect(long[][],double[][],double[][],boolean)
*radixSortIndirect(long[][] p0,double[][] p1,double[][] p2,boolean p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void radixSortIndirect(long[][] p0,double[][] p1,double[][] p2,boolean p3){
	 it.unimi.dsi.fastutil.doubles.DoubleBigArrays.radixSortIndirect(p0,p1,p2,p3);
}
/**
*{@link it.unimi.dsi.fastutil.doubles.DoubleBigArrays#radixSortIndirect(long[][],double[][],double[][],long,long,boolean)}
*@see it.unimi.dsi.fastutil.doubles.DoubleBigArrays#radixSortIndirect(long[][],double[][],double[][],long,long,boolean)
*<code>public static void it.unimi.dsi.fastutil.doubles.DoubleBigArrays.radixSortIndirect(long[][],double[][],double[][],long,long,boolean)
*radixSortIndirect(long[][] p0,double[][] p1,double[][] p2,long p3,long p4,boolean p5)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void radixSortIndirect(long[][] p0,double[][] p1,double[][] p2,long p3,long p4,boolean p5){
	 it.unimi.dsi.fastutil.doubles.DoubleBigArrays.radixSortIndirect(p0,p1,p2,p3,p4,p5);
}
/**
*{@link it.unimi.dsi.fastutil.floats.FloatBigArrays#radixSortIndirect(long[][],float[][],float[][],boolean)}
*@see it.unimi.dsi.fastutil.floats.FloatBigArrays#radixSortIndirect(long[][],float[][],float[][],boolean)
*<code>public static void it.unimi.dsi.fastutil.floats.FloatBigArrays.radixSortIndirect(long[][],float[][],float[][],boolean)
*radixSortIndirect(long[][] p0,float[][] p1,float[][] p2,boolean p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void radixSortIndirect(long[][] p0,float[][] p1,float[][] p2,boolean p3){
	 it.unimi.dsi.fastutil.floats.FloatBigArrays.radixSortIndirect(p0,p1,p2,p3);
}
/**
*{@link it.unimi.dsi.fastutil.floats.FloatBigArrays#radixSortIndirect(long[][],float[][],float[][],long,long,boolean)}
*@see it.unimi.dsi.fastutil.floats.FloatBigArrays#radixSortIndirect(long[][],float[][],float[][],long,long,boolean)
*<code>public static void it.unimi.dsi.fastutil.floats.FloatBigArrays.radixSortIndirect(long[][],float[][],float[][],long,long,boolean)
*radixSortIndirect(long[][] p0,float[][] p1,float[][] p2,long p3,long p4,boolean p5)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void radixSortIndirect(long[][] p0,float[][] p1,float[][] p2,long p3,long p4,boolean p5){
	 it.unimi.dsi.fastutil.floats.FloatBigArrays.radixSortIndirect(p0,p1,p2,p3,p4,p5);
}
/**
*{@link it.unimi.dsi.fastutil.ints.IntBigArrays#radixSortIndirect(long[][],int[][],int[][],boolean)}
*@see it.unimi.dsi.fastutil.ints.IntBigArrays#radixSortIndirect(long[][],int[][],int[][],boolean)
*<code>public static void it.unimi.dsi.fastutil.ints.IntBigArrays.radixSortIndirect(long[][],int[][],int[][],boolean)
*radixSortIndirect(long[][] p0,int[][] p1,int[][] p2,boolean p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void radixSortIndirect(long[][] p0,int[][] p1,int[][] p2,boolean p3){
	 it.unimi.dsi.fastutil.ints.IntBigArrays.radixSortIndirect(p0,p1,p2,p3);
}
/**
*{@link it.unimi.dsi.fastutil.ints.IntBigArrays#radixSortIndirect(long[][],int[][],int[][],long,long,boolean)}
*@see it.unimi.dsi.fastutil.ints.IntBigArrays#radixSortIndirect(long[][],int[][],int[][],long,long,boolean)
*<code>public static void it.unimi.dsi.fastutil.ints.IntBigArrays.radixSortIndirect(long[][],int[][],int[][],long,long,boolean)
*radixSortIndirect(long[][] p0,int[][] p1,int[][] p2,long p3,long p4,boolean p5)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void radixSortIndirect(long[][] p0,int[][] p1,int[][] p2,long p3,long p4,boolean p5){
	 it.unimi.dsi.fastutil.ints.IntBigArrays.radixSortIndirect(p0,p1,p2,p3,p4,p5);
}
/**
*{@link it.unimi.dsi.fastutil.longs.LongBigArrays#radixSortIndirect(long[][],long[][],long[][],boolean)}
*@see it.unimi.dsi.fastutil.longs.LongBigArrays#radixSortIndirect(long[][],long[][],long[][],boolean)
*<code>public static void it.unimi.dsi.fastutil.longs.LongBigArrays.radixSortIndirect(long[][],long[][],long[][],boolean)
*radixSortIndirect(long[][] p0,long[][] p1,long[][] p2,boolean p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void radixSortIndirect(long[][] p0,long[][] p1,long[][] p2,boolean p3){
	 it.unimi.dsi.fastutil.longs.LongBigArrays.radixSortIndirect(p0,p1,p2,p3);
}
/**
*{@link it.unimi.dsi.fastutil.longs.LongBigArrays#radixSortIndirect(long[][],long[][],long[][],long,long,boolean)}
*@see it.unimi.dsi.fastutil.longs.LongBigArrays#radixSortIndirect(long[][],long[][],long[][],long,long,boolean)
*<code>public static void it.unimi.dsi.fastutil.longs.LongBigArrays.radixSortIndirect(long[][],long[][],long[][],long,long,boolean)
*radixSortIndirect(long[][] p0,long[][] p1,long[][] p2,long p3,long p4,boolean p5)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void radixSortIndirect(long[][] p0,long[][] p1,long[][] p2,long p3,long p4,boolean p5){
	 it.unimi.dsi.fastutil.longs.LongBigArrays.radixSortIndirect(p0,p1,p2,p3,p4,p5);
}
/**
*{@link it.unimi.dsi.fastutil.shorts.ShortBigArrays#radixSortIndirect(long[][],short[][],short[][],boolean)}
*@see it.unimi.dsi.fastutil.shorts.ShortBigArrays#radixSortIndirect(long[][],short[][],short[][],boolean)
*<code>public static void it.unimi.dsi.fastutil.shorts.ShortBigArrays.radixSortIndirect(long[][],short[][],short[][],boolean)
*radixSortIndirect(long[][] p0,short[][] p1,short[][] p2,boolean p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void radixSortIndirect(long[][] p0,short[][] p1,short[][] p2,boolean p3){
	 it.unimi.dsi.fastutil.shorts.ShortBigArrays.radixSortIndirect(p0,p1,p2,p3);
}
/**
*{@link it.unimi.dsi.fastutil.shorts.ShortBigArrays#radixSortIndirect(long[][],short[][],short[][],long,long,boolean)}
*@see it.unimi.dsi.fastutil.shorts.ShortBigArrays#radixSortIndirect(long[][],short[][],short[][],long,long,boolean)
*<code>public static void it.unimi.dsi.fastutil.shorts.ShortBigArrays.radixSortIndirect(long[][],short[][],short[][],long,long,boolean)
*radixSortIndirect(long[][] p0,short[][] p1,short[][] p2,long p3,long p4,boolean p5)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void radixSortIndirect(long[][] p0,short[][] p1,short[][] p2,long p3,long p4,boolean p5){
	 it.unimi.dsi.fastutil.shorts.ShortBigArrays.radixSortIndirect(p0,p1,p2,p3,p4,p5);
}
/**
*{@link it.unimi.dsi.fastutil.BigArrays#set(long[][],long,long)}
*@see it.unimi.dsi.fastutil.BigArrays#set(long[][],long,long)
*<code>public static void it.unimi.dsi.fastutil.BigArrays.set(long[][],long,long)
*set(long[][] p0,long p1,long p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void set(long[][] p0,long p1,long p2){
	 it.unimi.dsi.fastutil.BigArrays.set(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.BigArrays#setLength(long[][],long)}
*@see it.unimi.dsi.fastutil.BigArrays#setLength(long[][],long)
*<code>public static long[][] it.unimi.dsi.fastutil.BigArrays.setLength(long[][],long)
*setLength(long[][] p0,long p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static long[][] setLength(long[][] p0,long p1){
	return it.unimi.dsi.fastutil.BigArrays.setLength(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.longs.LongBigArrays#shuffle(long[][],long,long,java.util.Random)}
*@see it.unimi.dsi.fastutil.longs.LongBigArrays#shuffle(long[][],long,long,java.util.Random)
*<code>public static long[][] it.unimi.dsi.fastutil.longs.LongBigArrays.shuffle(long[][],long,long,java.util.Random)
*shuffle(long[][] p0,long p1,long p2,java.util.Random p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static long[][] shuffle(long[][] p0,long p1,long p2,java.util.Random p3){
	return it.unimi.dsi.fastutil.longs.LongBigArrays.shuffle(p0,p1,p2,p3);
}
/**
*{@link it.unimi.dsi.fastutil.longs.LongBigArrays#shuffle(long[][],java.util.Random)}
*@see it.unimi.dsi.fastutil.longs.LongBigArrays#shuffle(long[][],java.util.Random)
*<code>public static long[][] it.unimi.dsi.fastutil.longs.LongBigArrays.shuffle(long[][],java.util.Random)
*shuffle(long[][] p0,java.util.Random p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static long[][] shuffle(long[][] p0,java.util.Random p1){
	return it.unimi.dsi.fastutil.longs.LongBigArrays.shuffle(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#storeLongs(long[][],java.lang.CharSequence)}
*@see it.unimi.dsi.fastutil.io.BinIO#storeLongs(long[][],java.lang.CharSequence)
*<code>public static void it.unimi.dsi.fastutil.io.BinIO.storeLongs(long[][],java.lang.CharSequence) throws java.io.IOException
*storeLongs(long[][] p0,java.lang.CharSequence p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void storeLongs(long[][] p0,java.lang.CharSequence p1) throws java.io.IOException{
	 it.unimi.dsi.fastutil.io.BinIO.storeLongs(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#storeLongs(long[][],java.io.File)}
*@see it.unimi.dsi.fastutil.io.BinIO#storeLongs(long[][],java.io.File)
*<code>public static void it.unimi.dsi.fastutil.io.BinIO.storeLongs(long[][],java.io.File) throws java.io.IOException
*storeLongs(long[][] p0,java.io.File p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void storeLongs(long[][] p0,java.io.File p1) throws java.io.IOException{
	 it.unimi.dsi.fastutil.io.BinIO.storeLongs(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#storeLongs(long[][],long,long,java.lang.CharSequence)}
*@see it.unimi.dsi.fastutil.io.BinIO#storeLongs(long[][],long,long,java.lang.CharSequence)
*<code>public static void it.unimi.dsi.fastutil.io.BinIO.storeLongs(long[][],long,long,java.lang.CharSequence) throws java.io.IOException
*storeLongs(long[][] p0,long p1,long p2,java.lang.CharSequence p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void storeLongs(long[][] p0,long p1,long p2,java.lang.CharSequence p3) throws java.io.IOException{
	 it.unimi.dsi.fastutil.io.BinIO.storeLongs(p0,p1,p2,p3);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#storeLongs(long[][],long,long,java.io.DataOutput)}
*@see it.unimi.dsi.fastutil.io.BinIO#storeLongs(long[][],long,long,java.io.DataOutput)
*<code>public static void it.unimi.dsi.fastutil.io.BinIO.storeLongs(long[][],long,long,java.io.DataOutput) throws java.io.IOException
*storeLongs(long[][] p0,long p1,long p2,java.io.DataOutput p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void storeLongs(long[][] p0,long p1,long p2,java.io.DataOutput p3) throws java.io.IOException{
	 it.unimi.dsi.fastutil.io.BinIO.storeLongs(p0,p1,p2,p3);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#storeLongs(long[][],long,long,java.io.File)}
*@see it.unimi.dsi.fastutil.io.BinIO#storeLongs(long[][],long,long,java.io.File)
*<code>public static void it.unimi.dsi.fastutil.io.BinIO.storeLongs(long[][],long,long,java.io.File) throws java.io.IOException
*storeLongs(long[][] p0,long p1,long p2,java.io.File p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void storeLongs(long[][] p0,long p1,long p2,java.io.File p3) throws java.io.IOException{
	 it.unimi.dsi.fastutil.io.BinIO.storeLongs(p0,p1,p2,p3);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#storeLongs(long[][],java.io.DataOutput)}
*@see it.unimi.dsi.fastutil.io.BinIO#storeLongs(long[][],java.io.DataOutput)
*<code>public static void it.unimi.dsi.fastutil.io.BinIO.storeLongs(long[][],java.io.DataOutput) throws java.io.IOException
*storeLongs(long[][] p0,java.io.DataOutput p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void storeLongs(long[][] p0,java.io.DataOutput p1) throws java.io.IOException{
	 it.unimi.dsi.fastutil.io.BinIO.storeLongs(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.io.TextIO#storeLongs(long[][],long,long,java.io.PrintStream)}
*@see it.unimi.dsi.fastutil.io.TextIO#storeLongs(long[][],long,long,java.io.PrintStream)
*<code>public static void it.unimi.dsi.fastutil.io.TextIO.storeLongs(long[][],long,long,java.io.PrintStream)
*storeLongs(long[][] p0,long p1,long p2,java.io.PrintStream p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void storeLongs(long[][] p0,long p1,long p2,java.io.PrintStream p3){
	 it.unimi.dsi.fastutil.io.TextIO.storeLongs(p0,p1,p2,p3);
}
/**
*{@link it.unimi.dsi.fastutil.io.TextIO#storeLongs(long[][],java.io.PrintStream)}
*@see it.unimi.dsi.fastutil.io.TextIO#storeLongs(long[][],java.io.PrintStream)
*<code>public static void it.unimi.dsi.fastutil.io.TextIO.storeLongs(long[][],java.io.PrintStream)
*storeLongs(long[][] p0,java.io.PrintStream p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void storeLongs(long[][] p0,java.io.PrintStream p1){
	 it.unimi.dsi.fastutil.io.TextIO.storeLongs(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.BigArrays#swap(long[][],long,long)}
*@see it.unimi.dsi.fastutil.BigArrays#swap(long[][],long,long)
*<code>public static void it.unimi.dsi.fastutil.BigArrays.swap(long[][],long,long)
*swap(long[][] p0,long p1,long p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void swap(long[][] p0,long p1,long p2){
	 it.unimi.dsi.fastutil.BigArrays.swap(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.BigArrays#trim(long[][],long)}
*@see it.unimi.dsi.fastutil.BigArrays#trim(long[][],long)
*<code>public static long[][] it.unimi.dsi.fastutil.BigArrays.trim(long[][],long)
*trim(long[][] p0,long p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static long[][] trim(long[][] p0,long p1){
	return it.unimi.dsi.fastutil.BigArrays.trim(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.longs.LongIterators#unwrap(it.unimi.dsi.fastutil.longs.LongIterator,long[]...)}
*@see it.unimi.dsi.fastutil.longs.LongIterators#unwrap(it.unimi.dsi.fastutil.longs.LongIterator,long[]...)
*<code>public static long it.unimi.dsi.fastutil.longs.LongIterators.unwrap(it.unimi.dsi.fastutil.longs.LongIterator,long[][])
*unwrap(it.unimi.dsi.fastutil.longs.LongIterator p0,long[]... p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static long unwrap(it.unimi.dsi.fastutil.longs.LongIterator p0,long[]... p1){
	return it.unimi.dsi.fastutil.longs.LongIterators.unwrap(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.longs.LongIterators#unwrap(it.unimi.dsi.fastutil.longs.LongIterator,long[][],long,long)}
*@see it.unimi.dsi.fastutil.longs.LongIterators#unwrap(it.unimi.dsi.fastutil.longs.LongIterator,long[][],long,long)
*<code>public static long it.unimi.dsi.fastutil.longs.LongIterators.unwrap(it.unimi.dsi.fastutil.longs.LongIterator,long[][],long,long)
*unwrap(it.unimi.dsi.fastutil.longs.LongIterator p0,long[][] p1,long p2,long p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static long unwrap(it.unimi.dsi.fastutil.longs.LongIterator p0,long[][] p1,long p2,long p3){
	return it.unimi.dsi.fastutil.longs.LongIterators.unwrap(p0,p1,p2,p3);
}
/**
*{@link it.unimi.dsi.fastutil.longs.LongIterators#unwrapBig(it.unimi.dsi.fastutil.longs.LongIterator,long)}
*@see it.unimi.dsi.fastutil.longs.LongIterators#unwrapBig(it.unimi.dsi.fastutil.longs.LongIterator,long)
*<code>public static long[][] it.unimi.dsi.fastutil.longs.LongIterators.unwrapBig(it.unimi.dsi.fastutil.longs.LongIterator,long)
*unwrapBig(it.unimi.dsi.fastutil.longs.LongIterator p0,long p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static long[][] unwrapBig(it.unimi.dsi.fastutil.longs.LongIterator p0,long p1){
	return it.unimi.dsi.fastutil.longs.LongIterators.unwrapBig(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.longs.LongIterators#unwrapBig(it.unimi.dsi.fastutil.longs.LongIterator)}
*@see it.unimi.dsi.fastutil.longs.LongIterators#unwrapBig(it.unimi.dsi.fastutil.longs.LongIterator)
*<code>public static long[][] it.unimi.dsi.fastutil.longs.LongIterators.unwrapBig(it.unimi.dsi.fastutil.longs.LongIterator)
*unwrapBig(it.unimi.dsi.fastutil.longs.LongIterator p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static long[][] unwrapBig(it.unimi.dsi.fastutil.longs.LongIterator p0){
	return it.unimi.dsi.fastutil.longs.LongIterators.unwrapBig(p0);
}
/**
*{@link it.unimi.dsi.fastutil.BigArrays#wrap(long...)}
*@see it.unimi.dsi.fastutil.BigArrays#wrap(long...)
*<code>public static long[][] it.unimi.dsi.fastutil.BigArrays.wrap(long[])
*wrap(long... p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static long[][] wrap(long... p0){
	return it.unimi.dsi.fastutil.BigArrays.wrap(p0);
}
/**
*{@link it.unimi.dsi.fastutil.longs.LongBigArrayBigList#wrap(long[]...)}
*@see it.unimi.dsi.fastutil.longs.LongBigArrayBigList#wrap(long[]...)
*<code>public static it.unimi.dsi.fastutil.longs.LongBigArrayBigList it.unimi.dsi.fastutil.longs.LongBigArrayBigList.wrap(long[][])
*wrap(long[]... p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.longs.LongBigArrayBigList wrap(long[]... p0){
	return it.unimi.dsi.fastutil.longs.LongBigArrayBigList.wrap(p0);
}
/**
*{@link it.unimi.dsi.fastutil.longs.LongBigArrayBigList#wrap(long[][],long)}
*@see it.unimi.dsi.fastutil.longs.LongBigArrayBigList#wrap(long[][],long)
*<code>public static it.unimi.dsi.fastutil.longs.LongBigArrayBigList it.unimi.dsi.fastutil.longs.LongBigArrayBigList.wrap(long[][],long)
*wrap(long[][] p0,long p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.longs.LongBigArrayBigList wrap(long[][] p0,long p1){
	return it.unimi.dsi.fastutil.longs.LongBigArrayBigList.wrap(p0,p1);
}
}
