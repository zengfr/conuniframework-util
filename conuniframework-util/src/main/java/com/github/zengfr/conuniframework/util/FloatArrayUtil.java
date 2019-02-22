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
public final class FloatArrayUtil{ 
/**
*{@link org.apache.commons.lang3.ArrayUtils#add(float[],int,float)}
*@see org.apache.commons.lang3.ArrayUtils#add(float[],int,float)
*<code>public static float[] org.apache.commons.lang3.ArrayUtils.add(float[],int,float)
*add(float[] p0,int p1,float p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static float[] add(float[] p0,int p1,float p2){
	return org.apache.commons.lang3.ArrayUtils.add(p0,p1,p2);
}
/**
*{@link org.apache.commons.lang3.ArrayUtils#add(float[],float)}
*@see org.apache.commons.lang3.ArrayUtils#add(float[],float)
*<code>public static float[] org.apache.commons.lang3.ArrayUtils.add(float[],float)
*add(float[] p0,float p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static float[] add(float[] p0,float p1){
	return org.apache.commons.lang3.ArrayUtils.add(p0,p1);
}
/**
*{@link org.apache.commons.lang3.ArrayUtils#addAll(float[],float...)}
*@see org.apache.commons.lang3.ArrayUtils#addAll(float[],float...)
*<code>public static float[] org.apache.commons.lang3.ArrayUtils.addAll(float[],float...)
*addAll(float[] p0,float... p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static float[] addAll(float[] p0,float... p1){
	return org.apache.commons.lang3.ArrayUtils.addAll(p0,p1);
}
/**
*{@link com.google.common.primitives.Floats#asList(float...)}
*@see com.google.common.primitives.Floats#asList(float...)
*<code>public static java.util.List<java.lang.Float> com.google.common.primitives.Floats.asList(float...)
*asList(float... p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.List<java.lang.Float> asList(float... p0){
	return com.google.common.primitives.Floats.asList(p0);
}
/**
*{@link it.unimi.dsi.fastutil.floats.FloatArrays#binarySearch(float[],float,it.unimi.dsi.fastutil.floats.FloatComparator)}
*@see it.unimi.dsi.fastutil.floats.FloatArrays#binarySearch(float[],float,it.unimi.dsi.fastutil.floats.FloatComparator)
*<code>public static int it.unimi.dsi.fastutil.floats.FloatArrays.binarySearch(float[],float,it.unimi.dsi.fastutil.floats.FloatComparator)
*binarySearch(float[] p0,float p1,it.unimi.dsi.fastutil.floats.FloatComparator p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int binarySearch(float[] p0,float p1,it.unimi.dsi.fastutil.floats.FloatComparator p2){
	return it.unimi.dsi.fastutil.floats.FloatArrays.binarySearch(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.floats.FloatArrays#binarySearch(float[],int,int,float,it.unimi.dsi.fastutil.floats.FloatComparator)}
*@see it.unimi.dsi.fastutil.floats.FloatArrays#binarySearch(float[],int,int,float,it.unimi.dsi.fastutil.floats.FloatComparator)
*<code>public static int it.unimi.dsi.fastutil.floats.FloatArrays.binarySearch(float[],int,int,float,it.unimi.dsi.fastutil.floats.FloatComparator)
*binarySearch(float[] p0,int p1,int p2,float p3,it.unimi.dsi.fastutil.floats.FloatComparator p4)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int binarySearch(float[] p0,int p1,int p2,float p3,it.unimi.dsi.fastutil.floats.FloatComparator p4){
	return it.unimi.dsi.fastutil.floats.FloatArrays.binarySearch(p0,p1,p2,p3,p4);
}
/**
*{@link it.unimi.dsi.fastutil.floats.FloatArrays#binarySearch(float[],float)}
*@see it.unimi.dsi.fastutil.floats.FloatArrays#binarySearch(float[],float)
*<code>public static int it.unimi.dsi.fastutil.floats.FloatArrays.binarySearch(float[],float)
*binarySearch(float[] p0,float p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int binarySearch(float[] p0,float p1){
	return it.unimi.dsi.fastutil.floats.FloatArrays.binarySearch(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.floats.FloatArrays#binarySearch(float[],int,int,float)}
*@see it.unimi.dsi.fastutil.floats.FloatArrays#binarySearch(float[],int,int,float)
*<code>public static int it.unimi.dsi.fastutil.floats.FloatArrays.binarySearch(float[],int,int,float)
*binarySearch(float[] p0,int p1,int p2,float p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int binarySearch(float[] p0,int p1,int p2,float p3){
	return it.unimi.dsi.fastutil.floats.FloatArrays.binarySearch(p0,p1,p2,p3);
}
/**
*{@link org.apache.commons.lang3.ArrayUtils#clone(float...)}
*@see org.apache.commons.lang3.ArrayUtils#clone(float...)
*<code>public static float[] org.apache.commons.lang3.ArrayUtils.clone(float[])
*clone(float... p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static float[] clone(float... p0){
	return org.apache.commons.lang3.ArrayUtils.clone(p0);
}
/**
*{@link com.google.common.primitives.Floats#concat(float[]...)}
*@see com.google.common.primitives.Floats#concat(float[]...)
*<code>public static float[] com.google.common.primitives.Floats.concat(float[]...)
*concat(float[]... p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static float[] concat(float[]... p0){
	return com.google.common.primitives.Floats.concat(p0);
}
/**
*{@link com.google.common.primitives.Floats#contains(float[],float)}
*@see com.google.common.primitives.Floats#contains(float[],float)
*<code>public static boolean com.google.common.primitives.Floats.contains(float[],float)
*contains(float[] p0,float p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean contains(float[] p0,float p1){
	return com.google.common.primitives.Floats.contains(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.floats.FloatArrays#copy(float[],int,int)}
*@see it.unimi.dsi.fastutil.floats.FloatArrays#copy(float[],int,int)
*<code>public static float[] it.unimi.dsi.fastutil.floats.FloatArrays.copy(float[],int,int)
*copy(float[] p0,int p1,int p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static float[] copy(float[] p0,int p1,int p2){
	return it.unimi.dsi.fastutil.floats.FloatArrays.copy(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.floats.FloatArrays#copy(float...)}
*@see it.unimi.dsi.fastutil.floats.FloatArrays#copy(float...)
*<code>public static float[] it.unimi.dsi.fastutil.floats.FloatArrays.copy(float[])
*copy(float... p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static float[] copy(float... p0){
	return it.unimi.dsi.fastutil.floats.FloatArrays.copy(p0);
}
/**
*{@link it.unimi.dsi.fastutil.BigArrays#copyFromBig(float[][],long,float[],int,int)}
*@see it.unimi.dsi.fastutil.BigArrays#copyFromBig(float[][],long,float[],int,int)
*<code>public static void it.unimi.dsi.fastutil.BigArrays.copyFromBig(float[][],long,float[],int,int)
*copyFromBig(float[][] p0,long p1,float[] p2,int p3,int p4)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void copyFromBig(float[][] p0,long p1,float[] p2,int p3,int p4){
	 it.unimi.dsi.fastutil.BigArrays.copyFromBig(p0,p1,p2,p3,p4);
}
/**
*{@link it.unimi.dsi.fastutil.BigArrays#copyToBig(float[],int,float[][],long,long)}
*@see it.unimi.dsi.fastutil.BigArrays#copyToBig(float[],int,float[][],long,long)
*<code>public static void it.unimi.dsi.fastutil.BigArrays.copyToBig(float[],int,float[][],long,long)
*copyToBig(float[] p0,int p1,float[][] p2,long p3,long p4)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void copyToBig(float[] p0,int p1,float[][] p2,long p3,long p4){
	 it.unimi.dsi.fastutil.BigArrays.copyToBig(p0,p1,p2,p3,p4);
}
/**
*{@link it.unimi.dsi.fastutil.floats.FloatHeaps#downHeap(float[],int,int,it.unimi.dsi.fastutil.floats.FloatComparator)}
*@see it.unimi.dsi.fastutil.floats.FloatHeaps#downHeap(float[],int,int,it.unimi.dsi.fastutil.floats.FloatComparator)
*<code>public static int it.unimi.dsi.fastutil.floats.FloatHeaps.downHeap(float[],int,int,it.unimi.dsi.fastutil.floats.FloatComparator)
*downHeap(float[] p0,int p1,int p2,it.unimi.dsi.fastutil.floats.FloatComparator p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int downHeap(float[] p0,int p1,int p2,it.unimi.dsi.fastutil.floats.FloatComparator p3){
	return it.unimi.dsi.fastutil.floats.FloatHeaps.downHeap(p0,p1,p2,p3);
}
/**
*{@link it.unimi.dsi.fastutil.floats.FloatIndirectHeaps#downHeap(float[],int[],int[],int,int,it.unimi.dsi.fastutil.floats.FloatComparator)}
*@see it.unimi.dsi.fastutil.floats.FloatIndirectHeaps#downHeap(float[],int[],int[],int,int,it.unimi.dsi.fastutil.floats.FloatComparator)
*<code>public static int it.unimi.dsi.fastutil.floats.FloatIndirectHeaps.downHeap(float[],int[],int[],int,int,it.unimi.dsi.fastutil.floats.FloatComparator)
*downHeap(float[] p0,int[] p1,int[] p2,int p3,int p4,it.unimi.dsi.fastutil.floats.FloatComparator p5)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int downHeap(float[] p0,int[] p1,int[] p2,int p3,int p4,it.unimi.dsi.fastutil.floats.FloatComparator p5){
	return it.unimi.dsi.fastutil.floats.FloatIndirectHeaps.downHeap(p0,p1,p2,p3,p4,p5);
}
/**
*{@link it.unimi.dsi.fastutil.floats.FloatSemiIndirectHeaps#downHeap(float[],int[],int,int,it.unimi.dsi.fastutil.floats.FloatComparator)}
*@see it.unimi.dsi.fastutil.floats.FloatSemiIndirectHeaps#downHeap(float[],int[],int,int,it.unimi.dsi.fastutil.floats.FloatComparator)
*<code>public static int it.unimi.dsi.fastutil.floats.FloatSemiIndirectHeaps.downHeap(float[],int[],int,int,it.unimi.dsi.fastutil.floats.FloatComparator)
*downHeap(float[] p0,int[] p1,int p2,int p3,it.unimi.dsi.fastutil.floats.FloatComparator p4)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int downHeap(float[] p0,int[] p1,int p2,int p3,it.unimi.dsi.fastutil.floats.FloatComparator p4){
	return it.unimi.dsi.fastutil.floats.FloatSemiIndirectHeaps.downHeap(p0,p1,p2,p3,p4);
}
/**
*{@link it.unimi.dsi.fastutil.floats.FloatArrays#ensureCapacity(float[],int)}
*@see it.unimi.dsi.fastutil.floats.FloatArrays#ensureCapacity(float[],int)
*<code>public static float[] it.unimi.dsi.fastutil.floats.FloatArrays.ensureCapacity(float[],int)
*ensureCapacity(float[] p0,int p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static float[] ensureCapacity(float[] p0,int p1){
	return it.unimi.dsi.fastutil.floats.FloatArrays.ensureCapacity(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.floats.FloatArrays#ensureCapacity(float[],int,int)}
*@see it.unimi.dsi.fastutil.floats.FloatArrays#ensureCapacity(float[],int,int)
*<code>public static float[] it.unimi.dsi.fastutil.floats.FloatArrays.ensureCapacity(float[],int,int)
*ensureCapacity(float[] p0,int p1,int p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static float[] ensureCapacity(float[] p0,int p1,int p2){
	return it.unimi.dsi.fastutil.floats.FloatArrays.ensureCapacity(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.floats.FloatArrays#ensureFromTo(float[],int,int)}
*@see it.unimi.dsi.fastutil.floats.FloatArrays#ensureFromTo(float[],int,int)
*<code>public static void it.unimi.dsi.fastutil.floats.FloatArrays.ensureFromTo(float[],int,int)
*ensureFromTo(float[] p0,int p1,int p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void ensureFromTo(float[] p0,int p1,int p2){
	 it.unimi.dsi.fastutil.floats.FloatArrays.ensureFromTo(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.floats.FloatArrays#ensureOffsetLength(float[],int,int)}
*@see it.unimi.dsi.fastutil.floats.FloatArrays#ensureOffsetLength(float[],int,int)
*<code>public static void it.unimi.dsi.fastutil.floats.FloatArrays.ensureOffsetLength(float[],int,int)
*ensureOffsetLength(float[] p0,int p1,int p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void ensureOffsetLength(float[] p0,int p1,int p2){
	 it.unimi.dsi.fastutil.floats.FloatArrays.ensureOffsetLength(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.floats.FloatArrays#ensureSameLength(float[],float...)}
*@see it.unimi.dsi.fastutil.floats.FloatArrays#ensureSameLength(float[],float...)
*<code>public static void it.unimi.dsi.fastutil.floats.FloatArrays.ensureSameLength(float[],float[])
*ensureSameLength(float[] p0,float... p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void ensureSameLength(float[] p0,float... p1){
	 it.unimi.dsi.fastutil.floats.FloatArrays.ensureSameLength(p0,p1);
}
/**
*{@link org.apache.commons.math3.util.MathArrays#equalsIncludingNaN(float[],float...)}
*@see org.apache.commons.math3.util.MathArrays#equalsIncludingNaN(float[],float...)
*<code>public static boolean org.apache.commons.math3.util.MathArrays.equalsIncludingNaN(float[],float[])
*equalsIncludingNaN(float[] p0,float... p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean equalsIncludingNaN(float[] p0,float... p1){
	return org.apache.commons.math3.util.MathArrays.equalsIncludingNaN(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.floats.FloatArrays#fill(float[],int,int,float)}
*@see it.unimi.dsi.fastutil.floats.FloatArrays#fill(float[],int,int,float)
*<code>public static void it.unimi.dsi.fastutil.floats.FloatArrays.fill(float[],int,int,float)
*fill(float[] p0,int p1,int p2,float p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void fill(float[] p0,int p1,int p2,float p3){
	 it.unimi.dsi.fastutil.floats.FloatArrays.fill(p0,p1,p2,p3);
}
/**
*{@link it.unimi.dsi.fastutil.floats.FloatArrays#fill(float[],float)}
*@see it.unimi.dsi.fastutil.floats.FloatArrays#fill(float[],float)
*<code>public static void it.unimi.dsi.fastutil.floats.FloatArrays.fill(float[],float)
*fill(float[] p0,float p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void fill(float[] p0,float p1){
	 it.unimi.dsi.fastutil.floats.FloatArrays.fill(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.floats.FloatArrays#forceCapacity(float[],int,int)}
*@see it.unimi.dsi.fastutil.floats.FloatArrays#forceCapacity(float[],int,int)
*<code>public static float[] it.unimi.dsi.fastutil.floats.FloatArrays.forceCapacity(float[],int,int)
*forceCapacity(float[] p0,int p1,int p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static float[] forceCapacity(float[] p0,int p1,int p2){
	return it.unimi.dsi.fastutil.floats.FloatArrays.forceCapacity(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.floats.FloatSemiIndirectHeaps#front(float[],int[],int,int[],it.unimi.dsi.fastutil.floats.FloatComparator)}
*@see it.unimi.dsi.fastutil.floats.FloatSemiIndirectHeaps#front(float[],int[],int,int[],it.unimi.dsi.fastutil.floats.FloatComparator)
*<code>public static int it.unimi.dsi.fastutil.floats.FloatSemiIndirectHeaps.front(float[],int[],int,int[],it.unimi.dsi.fastutil.floats.FloatComparator)
*front(float[] p0,int[] p1,int p2,int[] p3,it.unimi.dsi.fastutil.floats.FloatComparator p4)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int front(float[] p0,int[] p1,int p2,int[] p3,it.unimi.dsi.fastutil.floats.FloatComparator p4){
	return it.unimi.dsi.fastutil.floats.FloatSemiIndirectHeaps.front(p0,p1,p2,p3,p4);
}
/**
*{@link it.unimi.dsi.fastutil.floats.FloatSemiIndirectHeaps#front(float[],int[],int,int...)}
*@see it.unimi.dsi.fastutil.floats.FloatSemiIndirectHeaps#front(float[],int[],int,int...)
*<code>public static int it.unimi.dsi.fastutil.floats.FloatSemiIndirectHeaps.front(float[],int[],int,int[])
*front(float[] p0,int[] p1,int p2,int... p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int front(float[] p0,int[] p1,int p2,int... p3){
	return it.unimi.dsi.fastutil.floats.FloatSemiIndirectHeaps.front(p0,p1,p2,p3);
}
/**
*{@link it.unimi.dsi.fastutil.floats.FloatArrays#grow(float[],int,int)}
*@see it.unimi.dsi.fastutil.floats.FloatArrays#grow(float[],int,int)
*<code>public static float[] it.unimi.dsi.fastutil.floats.FloatArrays.grow(float[],int,int)
*grow(float[] p0,int p1,int p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static float[] grow(float[] p0,int p1,int p2){
	return it.unimi.dsi.fastutil.floats.FloatArrays.grow(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.floats.FloatArrays#grow(float[],int)}
*@see it.unimi.dsi.fastutil.floats.FloatArrays#grow(float[],int)
*<code>public static float[] it.unimi.dsi.fastutil.floats.FloatArrays.grow(float[],int)
*grow(float[] p0,int p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static float[] grow(float[] p0,int p1){
	return it.unimi.dsi.fastutil.floats.FloatArrays.grow(p0,p1);
}
/**
*{@link com.google.common.primitives.Floats#indexOf(float[],float)}
*@see com.google.common.primitives.Floats#indexOf(float[],float)
*<code>public static int com.google.common.primitives.Floats.indexOf(float[],float)
*indexOf(float[] p0,float p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int indexOf(float[] p0,float p1){
	return com.google.common.primitives.Floats.indexOf(p0,p1);
}
/**
*{@link com.google.common.primitives.Floats#indexOf(float[],float...)}
*@see com.google.common.primitives.Floats#indexOf(float[],float...)
*<code>public static int com.google.common.primitives.Floats.indexOf(float[],float[])
*indexOf(float[] p0,float... p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int indexOf(float[] p0,float... p1){
	return com.google.common.primitives.Floats.indexOf(p0,p1);
}
/**
*{@link org.apache.commons.lang3.ArrayUtils#indexOf(float[],float,int)}
*@see org.apache.commons.lang3.ArrayUtils#indexOf(float[],float,int)
*<code>public static int org.apache.commons.lang3.ArrayUtils.indexOf(float[],float,int)
*indexOf(float[] p0,float p1,int p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int indexOf(float[] p0,float p1,int p2){
	return org.apache.commons.lang3.ArrayUtils.indexOf(p0,p1,p2);
}
/**
*{@link org.apache.commons.lang3.ArrayUtils#insert(int,float[],float...)}
*@see org.apache.commons.lang3.ArrayUtils#insert(int,float[],float...)
*<code>public static float[] org.apache.commons.lang3.ArrayUtils.insert(int,float[],float...)
*insert(int p0,float[] p1,float... p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static float[] insert(int p0,float[] p1,float... p2){
	return org.apache.commons.lang3.ArrayUtils.insert(p0,p1,p2);
}
/**
*{@link org.apache.commons.lang3.ArrayUtils#isEmpty(float...)}
*@see org.apache.commons.lang3.ArrayUtils#isEmpty(float...)
*<code>public static boolean org.apache.commons.lang3.ArrayUtils.isEmpty(float[])
*isEmpty(float... p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isEmpty(float... p0){
	return org.apache.commons.lang3.ArrayUtils.isEmpty(p0);
}
/**
*{@link org.apache.commons.lang3.ArrayUtils#isNotEmpty(float...)}
*@see org.apache.commons.lang3.ArrayUtils#isNotEmpty(float...)
*<code>public static boolean org.apache.commons.lang3.ArrayUtils.isNotEmpty(float[])
*isNotEmpty(float... p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isNotEmpty(float... p0){
	return org.apache.commons.lang3.ArrayUtils.isNotEmpty(p0);
}
/**
*{@link org.apache.commons.lang3.ArrayUtils#isSameLength(float[],float...)}
*@see org.apache.commons.lang3.ArrayUtils#isSameLength(float[],float...)
*<code>public static boolean org.apache.commons.lang3.ArrayUtils.isSameLength(float[],float[])
*isSameLength(float[] p0,float... p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isSameLength(float[] p0,float... p1){
	return org.apache.commons.lang3.ArrayUtils.isSameLength(p0,p1);
}
/**
*{@link org.apache.commons.lang3.ArrayUtils#isSorted(float...)}
*@see org.apache.commons.lang3.ArrayUtils#isSorted(float...)
*<code>public static boolean org.apache.commons.lang3.ArrayUtils.isSorted(float[])
*isSorted(float... p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isSorted(float... p0){
	return org.apache.commons.lang3.ArrayUtils.isSorted(p0);
}
/**
*{@link com.google.common.primitives.Floats#join(java.lang.String,float...)}
*@see com.google.common.primitives.Floats#join(java.lang.String,float...)
*<code>public static java.lang.String com.google.common.primitives.Floats.join(java.lang.String,float...)
*join(java.lang.String p0,float... p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.String join(java.lang.String p0,float... p1){
	return com.google.common.primitives.Floats.join(p0,p1);
}
/**
*{@link org.apache.commons.lang3.StringUtils#join(float[],char,int,int)}
*@see org.apache.commons.lang3.StringUtils#join(float[],char,int,int)
*<code>public static java.lang.String org.apache.commons.lang3.StringUtils.join(float[],char,int,int)
*join(float[] p0,char p1,int p2,int p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.String join(float[] p0,char p1,int p2,int p3){
	return org.apache.commons.lang3.StringUtils.join(p0,p1,p2,p3);
}
/**
*{@link org.apache.commons.lang3.StringUtils#join(float[],char)}
*@see org.apache.commons.lang3.StringUtils#join(float[],char)
*<code>public static java.lang.String org.apache.commons.lang3.StringUtils.join(float[],char)
*join(float[] p0,char p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.String join(float[] p0,char p1){
	return org.apache.commons.lang3.StringUtils.join(p0,p1);
}
/**
*{@link com.google.common.primitives.Floats#lastIndexOf(float[],float)}
*@see com.google.common.primitives.Floats#lastIndexOf(float[],float)
*<code>public static int com.google.common.primitives.Floats.lastIndexOf(float[],float)
*lastIndexOf(float[] p0,float p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int lastIndexOf(float[] p0,float p1){
	return com.google.common.primitives.Floats.lastIndexOf(p0,p1);
}
/**
*{@link org.apache.commons.lang3.ArrayUtils#lastIndexOf(float[],float,int)}
*@see org.apache.commons.lang3.ArrayUtils#lastIndexOf(float[],float,int)
*<code>public static int org.apache.commons.lang3.ArrayUtils.lastIndexOf(float[],float,int)
*lastIndexOf(float[] p0,float p1,int p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int lastIndexOf(float[] p0,float p1,int p2){
	return org.apache.commons.lang3.ArrayUtils.lastIndexOf(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#loadFloats(java.lang.CharSequence,float[],int,int)}
*@see it.unimi.dsi.fastutil.io.BinIO#loadFloats(java.lang.CharSequence,float[],int,int)
*<code>public static int it.unimi.dsi.fastutil.io.BinIO.loadFloats(java.lang.CharSequence,float[],int,int) throws java.io.IOException
*loadFloats(java.lang.CharSequence p0,float[] p1,int p2,int p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int loadFloats(java.lang.CharSequence p0,float[] p1,int p2,int p3) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.loadFloats(p0,p1,p2,p3);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#loadFloats(java.io.File,float...)}
*@see it.unimi.dsi.fastutil.io.BinIO#loadFloats(java.io.File,float...)
*<code>public static int it.unimi.dsi.fastutil.io.BinIO.loadFloats(java.io.File,float[]) throws java.io.IOException
*loadFloats(java.io.File p0,float... p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int loadFloats(java.io.File p0,float... p1) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.loadFloats(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#loadFloats(java.io.File)}
*@see it.unimi.dsi.fastutil.io.BinIO#loadFloats(java.io.File)
*<code>public static float[] it.unimi.dsi.fastutil.io.BinIO.loadFloats(java.io.File) throws java.io.IOException
*loadFloats(java.io.File p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static float[] loadFloats(java.io.File p0) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.loadFloats(p0);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#loadFloats(java.lang.CharSequence,float...)}
*@see it.unimi.dsi.fastutil.io.BinIO#loadFloats(java.lang.CharSequence,float...)
*<code>public static int it.unimi.dsi.fastutil.io.BinIO.loadFloats(java.lang.CharSequence,float[]) throws java.io.IOException
*loadFloats(java.lang.CharSequence p0,float... p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int loadFloats(java.lang.CharSequence p0,float... p1) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.loadFloats(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#loadFloats(java.lang.CharSequence)}
*@see it.unimi.dsi.fastutil.io.BinIO#loadFloats(java.lang.CharSequence)
*<code>public static float[] it.unimi.dsi.fastutil.io.BinIO.loadFloats(java.lang.CharSequence) throws java.io.IOException
*loadFloats(java.lang.CharSequence p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static float[] loadFloats(java.lang.CharSequence p0) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.loadFloats(p0);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#loadFloats(java.io.File,float[],int,int)}
*@see it.unimi.dsi.fastutil.io.BinIO#loadFloats(java.io.File,float[],int,int)
*<code>public static int it.unimi.dsi.fastutil.io.BinIO.loadFloats(java.io.File,float[],int,int) throws java.io.IOException
*loadFloats(java.io.File p0,float[] p1,int p2,int p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int loadFloats(java.io.File p0,float[] p1,int p2,int p3) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.loadFloats(p0,p1,p2,p3);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#loadFloats(java.io.DataInput,float[],int,int)}
*@see it.unimi.dsi.fastutil.io.BinIO#loadFloats(java.io.DataInput,float[],int,int)
*<code>public static int it.unimi.dsi.fastutil.io.BinIO.loadFloats(java.io.DataInput,float[],int,int) throws java.io.IOException
*loadFloats(java.io.DataInput p0,float[] p1,int p2,int p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int loadFloats(java.io.DataInput p0,float[] p1,int p2,int p3) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.loadFloats(p0,p1,p2,p3);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#loadFloats(java.io.DataInput,float...)}
*@see it.unimi.dsi.fastutil.io.BinIO#loadFloats(java.io.DataInput,float...)
*<code>public static int it.unimi.dsi.fastutil.io.BinIO.loadFloats(java.io.DataInput,float[]) throws java.io.IOException
*loadFloats(java.io.DataInput p0,float... p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int loadFloats(java.io.DataInput p0,float... p1) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.loadFloats(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.io.TextIO#loadFloats(java.io.BufferedReader,float[],int,int)}
*@see it.unimi.dsi.fastutil.io.TextIO#loadFloats(java.io.BufferedReader,float[],int,int)
*<code>public static int it.unimi.dsi.fastutil.io.TextIO.loadFloats(java.io.BufferedReader,float[],int,int) throws java.io.IOException
*loadFloats(java.io.BufferedReader p0,float[] p1,int p2,int p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int loadFloats(java.io.BufferedReader p0,float[] p1,int p2,int p3) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.TextIO.loadFloats(p0,p1,p2,p3);
}
/**
*{@link it.unimi.dsi.fastutil.io.TextIO#loadFloats(java.io.BufferedReader,float...)}
*@see it.unimi.dsi.fastutil.io.TextIO#loadFloats(java.io.BufferedReader,float...)
*<code>public static int it.unimi.dsi.fastutil.io.TextIO.loadFloats(java.io.BufferedReader,float[]) throws java.io.IOException
*loadFloats(java.io.BufferedReader p0,float... p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int loadFloats(java.io.BufferedReader p0,float... p1) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.TextIO.loadFloats(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.floats.FloatHeaps#makeHeap(float[],int,it.unimi.dsi.fastutil.floats.FloatComparator)}
*@see it.unimi.dsi.fastutil.floats.FloatHeaps#makeHeap(float[],int,it.unimi.dsi.fastutil.floats.FloatComparator)
*<code>public static void it.unimi.dsi.fastutil.floats.FloatHeaps.makeHeap(float[],int,it.unimi.dsi.fastutil.floats.FloatComparator)
*makeHeap(float[] p0,int p1,it.unimi.dsi.fastutil.floats.FloatComparator p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void makeHeap(float[] p0,int p1,it.unimi.dsi.fastutil.floats.FloatComparator p2){
	 it.unimi.dsi.fastutil.floats.FloatHeaps.makeHeap(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.floats.FloatIndirectHeaps#makeHeap(float[],int,int,int[],int[],it.unimi.dsi.fastutil.floats.FloatComparator)}
*@see it.unimi.dsi.fastutil.floats.FloatIndirectHeaps#makeHeap(float[],int,int,int[],int[],it.unimi.dsi.fastutil.floats.FloatComparator)
*<code>public static void it.unimi.dsi.fastutil.floats.FloatIndirectHeaps.makeHeap(float[],int,int,int[],int[],it.unimi.dsi.fastutil.floats.FloatComparator)
*makeHeap(float[] p0,int p1,int p2,int[] p3,int[] p4,it.unimi.dsi.fastutil.floats.FloatComparator p5)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void makeHeap(float[] p0,int p1,int p2,int[] p3,int[] p4,it.unimi.dsi.fastutil.floats.FloatComparator p5){
	 it.unimi.dsi.fastutil.floats.FloatIndirectHeaps.makeHeap(p0,p1,p2,p3,p4,p5);
}
/**
*{@link it.unimi.dsi.fastutil.floats.FloatIndirectHeaps#makeHeap(float[],int[],int[],int,it.unimi.dsi.fastutil.floats.FloatComparator)}
*@see it.unimi.dsi.fastutil.floats.FloatIndirectHeaps#makeHeap(float[],int[],int[],int,it.unimi.dsi.fastutil.floats.FloatComparator)
*<code>public static void it.unimi.dsi.fastutil.floats.FloatIndirectHeaps.makeHeap(float[],int[],int[],int,it.unimi.dsi.fastutil.floats.FloatComparator)
*makeHeap(float[] p0,int[] p1,int[] p2,int p3,it.unimi.dsi.fastutil.floats.FloatComparator p4)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void makeHeap(float[] p0,int[] p1,int[] p2,int p3,it.unimi.dsi.fastutil.floats.FloatComparator p4){
	 it.unimi.dsi.fastutil.floats.FloatIndirectHeaps.makeHeap(p0,p1,p2,p3,p4);
}
/**
*{@link it.unimi.dsi.fastutil.floats.FloatSemiIndirectHeaps#makeHeap(float[],int,int,it.unimi.dsi.fastutil.floats.FloatComparator)}
*@see it.unimi.dsi.fastutil.floats.FloatSemiIndirectHeaps#makeHeap(float[],int,int,it.unimi.dsi.fastutil.floats.FloatComparator)
*<code>public static int[] it.unimi.dsi.fastutil.floats.FloatSemiIndirectHeaps.makeHeap(float[],int,int,it.unimi.dsi.fastutil.floats.FloatComparator)
*makeHeap(float[] p0,int p1,int p2,it.unimi.dsi.fastutil.floats.FloatComparator p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int[] makeHeap(float[] p0,int p1,int p2,it.unimi.dsi.fastutil.floats.FloatComparator p3){
	return it.unimi.dsi.fastutil.floats.FloatSemiIndirectHeaps.makeHeap(p0,p1,p2,p3);
}
/**
*{@link it.unimi.dsi.fastutil.floats.FloatSemiIndirectHeaps#makeHeap(float[],int[],int,it.unimi.dsi.fastutil.floats.FloatComparator)}
*@see it.unimi.dsi.fastutil.floats.FloatSemiIndirectHeaps#makeHeap(float[],int[],int,it.unimi.dsi.fastutil.floats.FloatComparator)
*<code>public static void it.unimi.dsi.fastutil.floats.FloatSemiIndirectHeaps.makeHeap(float[],int[],int,it.unimi.dsi.fastutil.floats.FloatComparator)
*makeHeap(float[] p0,int[] p1,int p2,it.unimi.dsi.fastutil.floats.FloatComparator p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void makeHeap(float[] p0,int[] p1,int p2,it.unimi.dsi.fastutil.floats.FloatComparator p3){
	 it.unimi.dsi.fastutil.floats.FloatSemiIndirectHeaps.makeHeap(p0,p1,p2,p3);
}
/**
*{@link it.unimi.dsi.fastutil.floats.FloatSemiIndirectHeaps#makeHeap(float[],int,int,int[],it.unimi.dsi.fastutil.floats.FloatComparator)}
*@see it.unimi.dsi.fastutil.floats.FloatSemiIndirectHeaps#makeHeap(float[],int,int,int[],it.unimi.dsi.fastutil.floats.FloatComparator)
*<code>public static void it.unimi.dsi.fastutil.floats.FloatSemiIndirectHeaps.makeHeap(float[],int,int,int[],it.unimi.dsi.fastutil.floats.FloatComparator)
*makeHeap(float[] p0,int p1,int p2,int[] p3,it.unimi.dsi.fastutil.floats.FloatComparator p4)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void makeHeap(float[] p0,int p1,int p2,int[] p3,it.unimi.dsi.fastutil.floats.FloatComparator p4){
	 it.unimi.dsi.fastutil.floats.FloatSemiIndirectHeaps.makeHeap(p0,p1,p2,p3,p4);
}
/**
*{@link com.google.common.primitives.Floats#max(float...)}
*@see com.google.common.primitives.Floats#max(float...)
*<code>public static float com.google.common.primitives.Floats.max(float...)
*max(float... p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static float max(float... p0){
	return com.google.common.primitives.Floats.max(p0);
}
/**
*{@link it.unimi.dsi.fastutil.floats.FloatArrays#mergeSort(float[],int,int)}
*@see it.unimi.dsi.fastutil.floats.FloatArrays#mergeSort(float[],int,int)
*<code>public static void it.unimi.dsi.fastutil.floats.FloatArrays.mergeSort(float[],int,int)
*mergeSort(float[] p0,int p1,int p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void mergeSort(float[] p0,int p1,int p2){
	 it.unimi.dsi.fastutil.floats.FloatArrays.mergeSort(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.floats.FloatArrays#mergeSort(float[],int,int,it.unimi.dsi.fastutil.floats.FloatComparator,float...)}
*@see it.unimi.dsi.fastutil.floats.FloatArrays#mergeSort(float[],int,int,it.unimi.dsi.fastutil.floats.FloatComparator,float...)
*<code>public static void it.unimi.dsi.fastutil.floats.FloatArrays.mergeSort(float[],int,int,it.unimi.dsi.fastutil.floats.FloatComparator,float[])
*mergeSort(float[] p0,int p1,int p2,it.unimi.dsi.fastutil.floats.FloatComparator p3,float... p4)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void mergeSort(float[] p0,int p1,int p2,it.unimi.dsi.fastutil.floats.FloatComparator p3,float... p4){
	 it.unimi.dsi.fastutil.floats.FloatArrays.mergeSort(p0,p1,p2,p3,p4);
}
/**
*{@link it.unimi.dsi.fastutil.floats.FloatArrays#mergeSort(float[],int,int,it.unimi.dsi.fastutil.floats.FloatComparator)}
*@see it.unimi.dsi.fastutil.floats.FloatArrays#mergeSort(float[],int,int,it.unimi.dsi.fastutil.floats.FloatComparator)
*<code>public static void it.unimi.dsi.fastutil.floats.FloatArrays.mergeSort(float[],int,int,it.unimi.dsi.fastutil.floats.FloatComparator)
*mergeSort(float[] p0,int p1,int p2,it.unimi.dsi.fastutil.floats.FloatComparator p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void mergeSort(float[] p0,int p1,int p2,it.unimi.dsi.fastutil.floats.FloatComparator p3){
	 it.unimi.dsi.fastutil.floats.FloatArrays.mergeSort(p0,p1,p2,p3);
}
/**
*{@link it.unimi.dsi.fastutil.floats.FloatArrays#mergeSort(float...)}
*@see it.unimi.dsi.fastutil.floats.FloatArrays#mergeSort(float...)
*<code>public static void it.unimi.dsi.fastutil.floats.FloatArrays.mergeSort(float[])
*mergeSort(float... p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void mergeSort(float... p0){
	 it.unimi.dsi.fastutil.floats.FloatArrays.mergeSort(p0);
}
/**
*{@link it.unimi.dsi.fastutil.floats.FloatArrays#mergeSort(float[],it.unimi.dsi.fastutil.floats.FloatComparator)}
*@see it.unimi.dsi.fastutil.floats.FloatArrays#mergeSort(float[],it.unimi.dsi.fastutil.floats.FloatComparator)
*<code>public static void it.unimi.dsi.fastutil.floats.FloatArrays.mergeSort(float[],it.unimi.dsi.fastutil.floats.FloatComparator)
*mergeSort(float[] p0,it.unimi.dsi.fastutil.floats.FloatComparator p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void mergeSort(float[] p0,it.unimi.dsi.fastutil.floats.FloatComparator p1){
	 it.unimi.dsi.fastutil.floats.FloatArrays.mergeSort(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.floats.FloatArrays#mergeSort(float[],int,int,float...)}
*@see it.unimi.dsi.fastutil.floats.FloatArrays#mergeSort(float[],int,int,float...)
*<code>public static void it.unimi.dsi.fastutil.floats.FloatArrays.mergeSort(float[],int,int,float[])
*mergeSort(float[] p0,int p1,int p2,float... p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void mergeSort(float[] p0,int p1,int p2,float... p3){
	 it.unimi.dsi.fastutil.floats.FloatArrays.mergeSort(p0,p1,p2,p3);
}
/**
*{@link com.google.common.primitives.Floats#min(float...)}
*@see com.google.common.primitives.Floats#min(float...)
*<code>public static float com.google.common.primitives.Floats.min(float...)
*min(float... p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static float min(float... p0){
	return com.google.common.primitives.Floats.min(p0);
}
/**
*{@link org.apache.commons.lang3.ArrayUtils#nullToEmpty(java.lang.Float...)}
*@see org.apache.commons.lang3.ArrayUtils#nullToEmpty(java.lang.Float...)
*<code>public static java.lang.Float[] org.apache.commons.lang3.ArrayUtils.nullToEmpty(java.lang.Float[])
*nullToEmpty(java.lang.Float... p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.Float[] nullToEmpty(java.lang.Float... p0){
	return org.apache.commons.lang3.ArrayUtils.nullToEmpty(p0);
}
/**
*{@link org.apache.commons.lang3.ArrayUtils#nullToEmpty(float...)}
*@see org.apache.commons.lang3.ArrayUtils#nullToEmpty(float...)
*<code>public static float[] org.apache.commons.lang3.ArrayUtils.nullToEmpty(float[])
*nullToEmpty(float... p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static float[] nullToEmpty(float... p0){
	return org.apache.commons.lang3.ArrayUtils.nullToEmpty(p0);
}
/**
*{@link it.unimi.dsi.fastutil.floats.FloatArrays#parallelQuickSort(float...)}
*@see it.unimi.dsi.fastutil.floats.FloatArrays#parallelQuickSort(float...)
*<code>public static void it.unimi.dsi.fastutil.floats.FloatArrays.parallelQuickSort(float[])
*parallelQuickSort(float... p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void parallelQuickSort(float... p0){
	 it.unimi.dsi.fastutil.floats.FloatArrays.parallelQuickSort(p0);
}
/**
*{@link it.unimi.dsi.fastutil.floats.FloatArrays#parallelQuickSort(float[],float[],int,int)}
*@see it.unimi.dsi.fastutil.floats.FloatArrays#parallelQuickSort(float[],float[],int,int)
*<code>public static void it.unimi.dsi.fastutil.floats.FloatArrays.parallelQuickSort(float[],float[],int,int)
*parallelQuickSort(float[] p0,float[] p1,int p2,int p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void parallelQuickSort(float[] p0,float[] p1,int p2,int p3){
	 it.unimi.dsi.fastutil.floats.FloatArrays.parallelQuickSort(p0,p1,p2,p3);
}
/**
*{@link it.unimi.dsi.fastutil.floats.FloatArrays#parallelQuickSort(float[],float...)}
*@see it.unimi.dsi.fastutil.floats.FloatArrays#parallelQuickSort(float[],float...)
*<code>public static void it.unimi.dsi.fastutil.floats.FloatArrays.parallelQuickSort(float[],float[])
*parallelQuickSort(float[] p0,float... p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void parallelQuickSort(float[] p0,float... p1){
	 it.unimi.dsi.fastutil.floats.FloatArrays.parallelQuickSort(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.floats.FloatArrays#parallelQuickSort(float[],it.unimi.dsi.fastutil.floats.FloatComparator)}
*@see it.unimi.dsi.fastutil.floats.FloatArrays#parallelQuickSort(float[],it.unimi.dsi.fastutil.floats.FloatComparator)
*<code>public static void it.unimi.dsi.fastutil.floats.FloatArrays.parallelQuickSort(float[],it.unimi.dsi.fastutil.floats.FloatComparator)
*parallelQuickSort(float[] p0,it.unimi.dsi.fastutil.floats.FloatComparator p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void parallelQuickSort(float[] p0,it.unimi.dsi.fastutil.floats.FloatComparator p1){
	 it.unimi.dsi.fastutil.floats.FloatArrays.parallelQuickSort(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.floats.FloatArrays#parallelQuickSort(float[],int,int,it.unimi.dsi.fastutil.floats.FloatComparator)}
*@see it.unimi.dsi.fastutil.floats.FloatArrays#parallelQuickSort(float[],int,int,it.unimi.dsi.fastutil.floats.FloatComparator)
*<code>public static void it.unimi.dsi.fastutil.floats.FloatArrays.parallelQuickSort(float[],int,int,it.unimi.dsi.fastutil.floats.FloatComparator)
*parallelQuickSort(float[] p0,int p1,int p2,it.unimi.dsi.fastutil.floats.FloatComparator p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void parallelQuickSort(float[] p0,int p1,int p2,it.unimi.dsi.fastutil.floats.FloatComparator p3){
	 it.unimi.dsi.fastutil.floats.FloatArrays.parallelQuickSort(p0,p1,p2,p3);
}
/**
*{@link it.unimi.dsi.fastutil.floats.FloatArrays#parallelQuickSort(float[],int,int)}
*@see it.unimi.dsi.fastutil.floats.FloatArrays#parallelQuickSort(float[],int,int)
*<code>public static void it.unimi.dsi.fastutil.floats.FloatArrays.parallelQuickSort(float[],int,int)
*parallelQuickSort(float[] p0,int p1,int p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void parallelQuickSort(float[] p0,int p1,int p2){
	 it.unimi.dsi.fastutil.floats.FloatArrays.parallelQuickSort(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.floats.FloatArrays#parallelQuickSortIndirect(int[],float[],int,int)}
*@see it.unimi.dsi.fastutil.floats.FloatArrays#parallelQuickSortIndirect(int[],float[],int,int)
*<code>public static void it.unimi.dsi.fastutil.floats.FloatArrays.parallelQuickSortIndirect(int[],float[],int,int)
*parallelQuickSortIndirect(int[] p0,float[] p1,int p2,int p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void parallelQuickSortIndirect(int[] p0,float[] p1,int p2,int p3){
	 it.unimi.dsi.fastutil.floats.FloatArrays.parallelQuickSortIndirect(p0,p1,p2,p3);
}
/**
*{@link it.unimi.dsi.fastutil.floats.FloatArrays#parallelQuickSortIndirect(int[],float...)}
*@see it.unimi.dsi.fastutil.floats.FloatArrays#parallelQuickSortIndirect(int[],float...)
*<code>public static void it.unimi.dsi.fastutil.floats.FloatArrays.parallelQuickSortIndirect(int[],float[])
*parallelQuickSortIndirect(int[] p0,float... p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void parallelQuickSortIndirect(int[] p0,float... p1){
	 it.unimi.dsi.fastutil.floats.FloatArrays.parallelQuickSortIndirect(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.floats.FloatArrays#parallelRadixSort(float[],float...)}
*@see it.unimi.dsi.fastutil.floats.FloatArrays#parallelRadixSort(float[],float...)
*<code>public static void it.unimi.dsi.fastutil.floats.FloatArrays.parallelRadixSort(float[],float[])
*parallelRadixSort(float[] p0,float... p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void parallelRadixSort(float[] p0,float... p1){
	 it.unimi.dsi.fastutil.floats.FloatArrays.parallelRadixSort(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.floats.FloatArrays#parallelRadixSort(float...)}
*@see it.unimi.dsi.fastutil.floats.FloatArrays#parallelRadixSort(float...)
*<code>public static void it.unimi.dsi.fastutil.floats.FloatArrays.parallelRadixSort(float[])
*parallelRadixSort(float... p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void parallelRadixSort(float... p0){
	 it.unimi.dsi.fastutil.floats.FloatArrays.parallelRadixSort(p0);
}
/**
*{@link it.unimi.dsi.fastutil.floats.FloatArrays#parallelRadixSort(float[],int,int)}
*@see it.unimi.dsi.fastutil.floats.FloatArrays#parallelRadixSort(float[],int,int)
*<code>public static void it.unimi.dsi.fastutil.floats.FloatArrays.parallelRadixSort(float[],int,int)
*parallelRadixSort(float[] p0,int p1,int p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void parallelRadixSort(float[] p0,int p1,int p2){
	 it.unimi.dsi.fastutil.floats.FloatArrays.parallelRadixSort(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.floats.FloatArrays#parallelRadixSort(float[],float[],int,int)}
*@see it.unimi.dsi.fastutil.floats.FloatArrays#parallelRadixSort(float[],float[],int,int)
*<code>public static void it.unimi.dsi.fastutil.floats.FloatArrays.parallelRadixSort(float[],float[],int,int)
*parallelRadixSort(float[] p0,float[] p1,int p2,int p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void parallelRadixSort(float[] p0,float[] p1,int p2,int p3){
	 it.unimi.dsi.fastutil.floats.FloatArrays.parallelRadixSort(p0,p1,p2,p3);
}
/**
*{@link it.unimi.dsi.fastutil.floats.FloatArrays#parallelRadixSortIndirect(int[],float[],int,int,boolean)}
*@see it.unimi.dsi.fastutil.floats.FloatArrays#parallelRadixSortIndirect(int[],float[],int,int,boolean)
*<code>public static void it.unimi.dsi.fastutil.floats.FloatArrays.parallelRadixSortIndirect(int[],float[],int,int,boolean)
*parallelRadixSortIndirect(int[] p0,float[] p1,int p2,int p3,boolean p4)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void parallelRadixSortIndirect(int[] p0,float[] p1,int p2,int p3,boolean p4){
	 it.unimi.dsi.fastutil.floats.FloatArrays.parallelRadixSortIndirect(p0,p1,p2,p3,p4);
}
/**
*{@link it.unimi.dsi.fastutil.floats.FloatArrays#parallelRadixSortIndirect(int[],float[],boolean)}
*@see it.unimi.dsi.fastutil.floats.FloatArrays#parallelRadixSortIndirect(int[],float[],boolean)
*<code>public static void it.unimi.dsi.fastutil.floats.FloatArrays.parallelRadixSortIndirect(int[],float[],boolean)
*parallelRadixSortIndirect(int[] p0,float[] p1,boolean p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void parallelRadixSortIndirect(int[] p0,float[] p1,boolean p2){
	 it.unimi.dsi.fastutil.floats.FloatArrays.parallelRadixSortIndirect(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.floats.FloatArrays#quickSort(float[],float[],int,int)}
*@see it.unimi.dsi.fastutil.floats.FloatArrays#quickSort(float[],float[],int,int)
*<code>public static void it.unimi.dsi.fastutil.floats.FloatArrays.quickSort(float[],float[],int,int)
*quickSort(float[] p0,float[] p1,int p2,int p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void quickSort(float[] p0,float[] p1,int p2,int p3){
	 it.unimi.dsi.fastutil.floats.FloatArrays.quickSort(p0,p1,p2,p3);
}
/**
*{@link it.unimi.dsi.fastutil.floats.FloatArrays#quickSort(float...)}
*@see it.unimi.dsi.fastutil.floats.FloatArrays#quickSort(float...)
*<code>public static void it.unimi.dsi.fastutil.floats.FloatArrays.quickSort(float[])
*quickSort(float... p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void quickSort(float... p0){
	 it.unimi.dsi.fastutil.floats.FloatArrays.quickSort(p0);
}
/**
*{@link it.unimi.dsi.fastutil.floats.FloatArrays#quickSort(float[],float...)}
*@see it.unimi.dsi.fastutil.floats.FloatArrays#quickSort(float[],float...)
*<code>public static void it.unimi.dsi.fastutil.floats.FloatArrays.quickSort(float[],float[])
*quickSort(float[] p0,float... p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void quickSort(float[] p0,float... p1){
	 it.unimi.dsi.fastutil.floats.FloatArrays.quickSort(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.floats.FloatArrays#quickSort(float[],int,int)}
*@see it.unimi.dsi.fastutil.floats.FloatArrays#quickSort(float[],int,int)
*<code>public static void it.unimi.dsi.fastutil.floats.FloatArrays.quickSort(float[],int,int)
*quickSort(float[] p0,int p1,int p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void quickSort(float[] p0,int p1,int p2){
	 it.unimi.dsi.fastutil.floats.FloatArrays.quickSort(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.floats.FloatArrays#quickSort(float[],it.unimi.dsi.fastutil.floats.FloatComparator)}
*@see it.unimi.dsi.fastutil.floats.FloatArrays#quickSort(float[],it.unimi.dsi.fastutil.floats.FloatComparator)
*<code>public static void it.unimi.dsi.fastutil.floats.FloatArrays.quickSort(float[],it.unimi.dsi.fastutil.floats.FloatComparator)
*quickSort(float[] p0,it.unimi.dsi.fastutil.floats.FloatComparator p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void quickSort(float[] p0,it.unimi.dsi.fastutil.floats.FloatComparator p1){
	 it.unimi.dsi.fastutil.floats.FloatArrays.quickSort(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.floats.FloatArrays#quickSort(float[],int,int,it.unimi.dsi.fastutil.floats.FloatComparator)}
*@see it.unimi.dsi.fastutil.floats.FloatArrays#quickSort(float[],int,int,it.unimi.dsi.fastutil.floats.FloatComparator)
*<code>public static void it.unimi.dsi.fastutil.floats.FloatArrays.quickSort(float[],int,int,it.unimi.dsi.fastutil.floats.FloatComparator)
*quickSort(float[] p0,int p1,int p2,it.unimi.dsi.fastutil.floats.FloatComparator p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void quickSort(float[] p0,int p1,int p2,it.unimi.dsi.fastutil.floats.FloatComparator p3){
	 it.unimi.dsi.fastutil.floats.FloatArrays.quickSort(p0,p1,p2,p3);
}
/**
*{@link it.unimi.dsi.fastutil.floats.FloatArrays#quickSortIndirect(int[],float[],int,int)}
*@see it.unimi.dsi.fastutil.floats.FloatArrays#quickSortIndirect(int[],float[],int,int)
*<code>public static void it.unimi.dsi.fastutil.floats.FloatArrays.quickSortIndirect(int[],float[],int,int)
*quickSortIndirect(int[] p0,float[] p1,int p2,int p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void quickSortIndirect(int[] p0,float[] p1,int p2,int p3){
	 it.unimi.dsi.fastutil.floats.FloatArrays.quickSortIndirect(p0,p1,p2,p3);
}
/**
*{@link it.unimi.dsi.fastutil.floats.FloatArrays#quickSortIndirect(int[],float...)}
*@see it.unimi.dsi.fastutil.floats.FloatArrays#quickSortIndirect(int[],float...)
*<code>public static void it.unimi.dsi.fastutil.floats.FloatArrays.quickSortIndirect(int[],float[])
*quickSortIndirect(int[] p0,float... p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void quickSortIndirect(int[] p0,float... p1){
	 it.unimi.dsi.fastutil.floats.FloatArrays.quickSortIndirect(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.floats.FloatArrays#radixSort(float[],float...)}
*@see it.unimi.dsi.fastutil.floats.FloatArrays#radixSort(float[],float...)
*<code>public static void it.unimi.dsi.fastutil.floats.FloatArrays.radixSort(float[],float[])
*radixSort(float[] p0,float... p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void radixSort(float[] p0,float... p1){
	 it.unimi.dsi.fastutil.floats.FloatArrays.radixSort(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.floats.FloatArrays#radixSort(float[],int,int)}
*@see it.unimi.dsi.fastutil.floats.FloatArrays#radixSort(float[],int,int)
*<code>public static void it.unimi.dsi.fastutil.floats.FloatArrays.radixSort(float[],int,int)
*radixSort(float[] p0,int p1,int p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void radixSort(float[] p0,int p1,int p2){
	 it.unimi.dsi.fastutil.floats.FloatArrays.radixSort(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.floats.FloatArrays#radixSort(float...)}
*@see it.unimi.dsi.fastutil.floats.FloatArrays#radixSort(float...)
*<code>public static void it.unimi.dsi.fastutil.floats.FloatArrays.radixSort(float[])
*radixSort(float... p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void radixSort(float... p0){
	 it.unimi.dsi.fastutil.floats.FloatArrays.radixSort(p0);
}
/**
*{@link it.unimi.dsi.fastutil.floats.FloatArrays#radixSort(float[],float[],int,int)}
*@see it.unimi.dsi.fastutil.floats.FloatArrays#radixSort(float[],float[],int,int)
*<code>public static void it.unimi.dsi.fastutil.floats.FloatArrays.radixSort(float[],float[],int,int)
*radixSort(float[] p0,float[] p1,int p2,int p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void radixSort(float[] p0,float[] p1,int p2,int p3){
	 it.unimi.dsi.fastutil.floats.FloatArrays.radixSort(p0,p1,p2,p3);
}
/**
*{@link it.unimi.dsi.fastutil.floats.FloatArrays#radixSortIndirect(int[],float[],boolean)}
*@see it.unimi.dsi.fastutil.floats.FloatArrays#radixSortIndirect(int[],float[],boolean)
*<code>public static void it.unimi.dsi.fastutil.floats.FloatArrays.radixSortIndirect(int[],float[],boolean)
*radixSortIndirect(int[] p0,float[] p1,boolean p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void radixSortIndirect(int[] p0,float[] p1,boolean p2){
	 it.unimi.dsi.fastutil.floats.FloatArrays.radixSortIndirect(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.floats.FloatArrays#radixSortIndirect(int[],float[],float[],boolean)}
*@see it.unimi.dsi.fastutil.floats.FloatArrays#radixSortIndirect(int[],float[],float[],boolean)
*<code>public static void it.unimi.dsi.fastutil.floats.FloatArrays.radixSortIndirect(int[],float[],float[],boolean)
*radixSortIndirect(int[] p0,float[] p1,float[] p2,boolean p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void radixSortIndirect(int[] p0,float[] p1,float[] p2,boolean p3){
	 it.unimi.dsi.fastutil.floats.FloatArrays.radixSortIndirect(p0,p1,p2,p3);
}
/**
*{@link it.unimi.dsi.fastutil.floats.FloatArrays#radixSortIndirect(int[],float[],float[],int,int,boolean)}
*@see it.unimi.dsi.fastutil.floats.FloatArrays#radixSortIndirect(int[],float[],float[],int,int,boolean)
*<code>public static void it.unimi.dsi.fastutil.floats.FloatArrays.radixSortIndirect(int[],float[],float[],int,int,boolean)
*radixSortIndirect(int[] p0,float[] p1,float[] p2,int p3,int p4,boolean p5)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void radixSortIndirect(int[] p0,float[] p1,float[] p2,int p3,int p4,boolean p5){
	 it.unimi.dsi.fastutil.floats.FloatArrays.radixSortIndirect(p0,p1,p2,p3,p4,p5);
}
/**
*{@link it.unimi.dsi.fastutil.floats.FloatArrays#radixSortIndirect(int[],float[],int,int,boolean)}
*@see it.unimi.dsi.fastutil.floats.FloatArrays#radixSortIndirect(int[],float[],int,int,boolean)
*<code>public static void it.unimi.dsi.fastutil.floats.FloatArrays.radixSortIndirect(int[],float[],int,int,boolean)
*radixSortIndirect(int[] p0,float[] p1,int p2,int p3,boolean p4)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void radixSortIndirect(int[] p0,float[] p1,int p2,int p3,boolean p4){
	 it.unimi.dsi.fastutil.floats.FloatArrays.radixSortIndirect(p0,p1,p2,p3,p4);
}
/**
*{@link org.apache.commons.lang3.ArrayUtils#remove(float[],int)}
*@see org.apache.commons.lang3.ArrayUtils#remove(float[],int)
*<code>public static float[] org.apache.commons.lang3.ArrayUtils.remove(float[],int)
*remove(float[] p0,int p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static float[] remove(float[] p0,int p1){
	return org.apache.commons.lang3.ArrayUtils.remove(p0,p1);
}
/**
*{@link org.apache.commons.lang3.ArrayUtils#removeAll(float[],int...)}
*@see org.apache.commons.lang3.ArrayUtils#removeAll(float[],int...)
*<code>public static float[] org.apache.commons.lang3.ArrayUtils.removeAll(float[],int...)
*removeAll(float[] p0,int... p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static float[] removeAll(float[] p0,int... p1){
	return org.apache.commons.lang3.ArrayUtils.removeAll(p0,p1);
}
/**
*{@link org.apache.commons.lang3.ArrayUtils#removeAllOccurences(float[],float)}
*@see org.apache.commons.lang3.ArrayUtils#removeAllOccurences(float[],float)
*<code>public static float[] org.apache.commons.lang3.ArrayUtils.removeAllOccurences(float[],float)
*removeAllOccurences(float[] p0,float p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static float[] removeAllOccurences(float[] p0,float p1){
	return org.apache.commons.lang3.ArrayUtils.removeAllOccurences(p0,p1);
}
/**
*{@link org.apache.commons.lang3.ArrayUtils#removeElement(float[],float)}
*@see org.apache.commons.lang3.ArrayUtils#removeElement(float[],float)
*<code>public static float[] org.apache.commons.lang3.ArrayUtils.removeElement(float[],float)
*removeElement(float[] p0,float p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static float[] removeElement(float[] p0,float p1){
	return org.apache.commons.lang3.ArrayUtils.removeElement(p0,p1);
}
/**
*{@link org.apache.commons.lang3.ArrayUtils#removeElements(float[],float...)}
*@see org.apache.commons.lang3.ArrayUtils#removeElements(float[],float...)
*<code>public static float[] org.apache.commons.lang3.ArrayUtils.removeElements(float[],float...)
*removeElements(float[] p0,float... p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static float[] removeElements(float[] p0,float... p1){
	return org.apache.commons.lang3.ArrayUtils.removeElements(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.floats.FloatArrays#reverse(float[],int,int)}
*@see it.unimi.dsi.fastutil.floats.FloatArrays#reverse(float[],int,int)
*<code>public static float[] it.unimi.dsi.fastutil.floats.FloatArrays.reverse(float[],int,int)
*reverse(float[] p0,int p1,int p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static float[] reverse(float[] p0,int p1,int p2){
	return it.unimi.dsi.fastutil.floats.FloatArrays.reverse(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.floats.FloatArrays#reverse(float...)}
*@see it.unimi.dsi.fastutil.floats.FloatArrays#reverse(float...)
*<code>public static float[] it.unimi.dsi.fastutil.floats.FloatArrays.reverse(float[])
*reverse(float... p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static float[] reverse(float... p0){
	return it.unimi.dsi.fastutil.floats.FloatArrays.reverse(p0);
}
/**
*{@link it.unimi.dsi.fastutil.floats.FloatArrays#setLength(float[],int)}
*@see it.unimi.dsi.fastutil.floats.FloatArrays#setLength(float[],int)
*<code>public static float[] it.unimi.dsi.fastutil.floats.FloatArrays.setLength(float[],int)
*setLength(float[] p0,int p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static float[] setLength(float[] p0,int p1){
	return it.unimi.dsi.fastutil.floats.FloatArrays.setLength(p0,p1);
}
/**
*{@link org.apache.commons.lang3.ArrayUtils#shift(float[],int)}
*@see org.apache.commons.lang3.ArrayUtils#shift(float[],int)
*<code>public static void org.apache.commons.lang3.ArrayUtils.shift(float[],int)
*shift(float[] p0,int p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void shift(float[] p0,int p1){
	 org.apache.commons.lang3.ArrayUtils.shift(p0,p1);
}
/**
*{@link org.apache.commons.lang3.ArrayUtils#shift(float[],int,int,int)}
*@see org.apache.commons.lang3.ArrayUtils#shift(float[],int,int,int)
*<code>public static void org.apache.commons.lang3.ArrayUtils.shift(float[],int,int,int)
*shift(float[] p0,int p1,int p2,int p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void shift(float[] p0,int p1,int p2,int p3){
	 org.apache.commons.lang3.ArrayUtils.shift(p0,p1,p2,p3);
}
/**
*{@link it.unimi.dsi.fastutil.floats.FloatArrays#shuffle(float[],int,int,java.util.Random)}
*@see it.unimi.dsi.fastutil.floats.FloatArrays#shuffle(float[],int,int,java.util.Random)
*<code>public static float[] it.unimi.dsi.fastutil.floats.FloatArrays.shuffle(float[],int,int,java.util.Random)
*shuffle(float[] p0,int p1,int p2,java.util.Random p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static float[] shuffle(float[] p0,int p1,int p2,java.util.Random p3){
	return it.unimi.dsi.fastutil.floats.FloatArrays.shuffle(p0,p1,p2,p3);
}
/**
*{@link it.unimi.dsi.fastutil.floats.FloatArrays#shuffle(float[],java.util.Random)}
*@see it.unimi.dsi.fastutil.floats.FloatArrays#shuffle(float[],java.util.Random)
*<code>public static float[] it.unimi.dsi.fastutil.floats.FloatArrays.shuffle(float[],java.util.Random)
*shuffle(float[] p0,java.util.Random p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static float[] shuffle(float[] p0,java.util.Random p1){
	return it.unimi.dsi.fastutil.floats.FloatArrays.shuffle(p0,p1);
}
/**
*{@link org.apache.commons.lang3.ArrayUtils#shuffle(float...)}
*@see org.apache.commons.lang3.ArrayUtils#shuffle(float...)
*<code>public static void org.apache.commons.lang3.ArrayUtils.shuffle(float[])
*shuffle(float... p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void shuffle(float... p0){
	 org.apache.commons.lang3.ArrayUtils.shuffle(p0);
}
/**
*{@link it.unimi.dsi.fastutil.floats.FloatArrays#stabilize(int[],float...)}
*@see it.unimi.dsi.fastutil.floats.FloatArrays#stabilize(int[],float...)
*<code>public static void it.unimi.dsi.fastutil.floats.FloatArrays.stabilize(int[],float[])
*stabilize(int[] p0,float... p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void stabilize(int[] p0,float... p1){
	 it.unimi.dsi.fastutil.floats.FloatArrays.stabilize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.floats.FloatArrays#stabilize(int[],float[],int,int)}
*@see it.unimi.dsi.fastutil.floats.FloatArrays#stabilize(int[],float[],int,int)
*<code>public static void it.unimi.dsi.fastutil.floats.FloatArrays.stabilize(int[],float[],int,int)
*stabilize(int[] p0,float[] p1,int p2,int p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void stabilize(int[] p0,float[] p1,int p2,int p3){
	 it.unimi.dsi.fastutil.floats.FloatArrays.stabilize(p0,p1,p2,p3);
}
/**
*{@link it.unimi.dsi.fastutil.floats.FloatArrays#stableSort(float...)}
*@see it.unimi.dsi.fastutil.floats.FloatArrays#stableSort(float...)
*<code>public static void it.unimi.dsi.fastutil.floats.FloatArrays.stableSort(float[])
*stableSort(float... p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void stableSort(float... p0){
	 it.unimi.dsi.fastutil.floats.FloatArrays.stableSort(p0);
}
/**
*{@link it.unimi.dsi.fastutil.floats.FloatArrays#stableSort(float[],int,int)}
*@see it.unimi.dsi.fastutil.floats.FloatArrays#stableSort(float[],int,int)
*<code>public static void it.unimi.dsi.fastutil.floats.FloatArrays.stableSort(float[],int,int)
*stableSort(float[] p0,int p1,int p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void stableSort(float[] p0,int p1,int p2){
	 it.unimi.dsi.fastutil.floats.FloatArrays.stableSort(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.floats.FloatArrays#stableSort(float[],it.unimi.dsi.fastutil.floats.FloatComparator)}
*@see it.unimi.dsi.fastutil.floats.FloatArrays#stableSort(float[],it.unimi.dsi.fastutil.floats.FloatComparator)
*<code>public static void it.unimi.dsi.fastutil.floats.FloatArrays.stableSort(float[],it.unimi.dsi.fastutil.floats.FloatComparator)
*stableSort(float[] p0,it.unimi.dsi.fastutil.floats.FloatComparator p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void stableSort(float[] p0,it.unimi.dsi.fastutil.floats.FloatComparator p1){
	 it.unimi.dsi.fastutil.floats.FloatArrays.stableSort(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.floats.FloatArrays#stableSort(float[],int,int,it.unimi.dsi.fastutil.floats.FloatComparator)}
*@see it.unimi.dsi.fastutil.floats.FloatArrays#stableSort(float[],int,int,it.unimi.dsi.fastutil.floats.FloatComparator)
*<code>public static void it.unimi.dsi.fastutil.floats.FloatArrays.stableSort(float[],int,int,it.unimi.dsi.fastutil.floats.FloatComparator)
*stableSort(float[] p0,int p1,int p2,it.unimi.dsi.fastutil.floats.FloatComparator p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void stableSort(float[] p0,int p1,int p2,it.unimi.dsi.fastutil.floats.FloatComparator p3){
	 it.unimi.dsi.fastutil.floats.FloatArrays.stableSort(p0,p1,p2,p3);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#storeFloats(float[],int,int,java.io.DataOutput)}
*@see it.unimi.dsi.fastutil.io.BinIO#storeFloats(float[],int,int,java.io.DataOutput)
*<code>public static void it.unimi.dsi.fastutil.io.BinIO.storeFloats(float[],int,int,java.io.DataOutput) throws java.io.IOException
*storeFloats(float[] p0,int p1,int p2,java.io.DataOutput p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void storeFloats(float[] p0,int p1,int p2,java.io.DataOutput p3) throws java.io.IOException{
	 it.unimi.dsi.fastutil.io.BinIO.storeFloats(p0,p1,p2,p3);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#storeFloats(float[],java.io.DataOutput)}
*@see it.unimi.dsi.fastutil.io.BinIO#storeFloats(float[],java.io.DataOutput)
*<code>public static void it.unimi.dsi.fastutil.io.BinIO.storeFloats(float[],java.io.DataOutput) throws java.io.IOException
*storeFloats(float[] p0,java.io.DataOutput p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void storeFloats(float[] p0,java.io.DataOutput p1) throws java.io.IOException{
	 it.unimi.dsi.fastutil.io.BinIO.storeFloats(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#storeFloats(float[],int,int,java.io.File)}
*@see it.unimi.dsi.fastutil.io.BinIO#storeFloats(float[],int,int,java.io.File)
*<code>public static void it.unimi.dsi.fastutil.io.BinIO.storeFloats(float[],int,int,java.io.File) throws java.io.IOException
*storeFloats(float[] p0,int p1,int p2,java.io.File p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void storeFloats(float[] p0,int p1,int p2,java.io.File p3) throws java.io.IOException{
	 it.unimi.dsi.fastutil.io.BinIO.storeFloats(p0,p1,p2,p3);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#storeFloats(float[],int,int,java.lang.CharSequence)}
*@see it.unimi.dsi.fastutil.io.BinIO#storeFloats(float[],int,int,java.lang.CharSequence)
*<code>public static void it.unimi.dsi.fastutil.io.BinIO.storeFloats(float[],int,int,java.lang.CharSequence) throws java.io.IOException
*storeFloats(float[] p0,int p1,int p2,java.lang.CharSequence p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void storeFloats(float[] p0,int p1,int p2,java.lang.CharSequence p3) throws java.io.IOException{
	 it.unimi.dsi.fastutil.io.BinIO.storeFloats(p0,p1,p2,p3);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#storeFloats(float[],java.io.File)}
*@see it.unimi.dsi.fastutil.io.BinIO#storeFloats(float[],java.io.File)
*<code>public static void it.unimi.dsi.fastutil.io.BinIO.storeFloats(float[],java.io.File) throws java.io.IOException
*storeFloats(float[] p0,java.io.File p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void storeFloats(float[] p0,java.io.File p1) throws java.io.IOException{
	 it.unimi.dsi.fastutil.io.BinIO.storeFloats(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#storeFloats(float[],java.lang.CharSequence)}
*@see it.unimi.dsi.fastutil.io.BinIO#storeFloats(float[],java.lang.CharSequence)
*<code>public static void it.unimi.dsi.fastutil.io.BinIO.storeFloats(float[],java.lang.CharSequence) throws java.io.IOException
*storeFloats(float[] p0,java.lang.CharSequence p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void storeFloats(float[] p0,java.lang.CharSequence p1) throws java.io.IOException{
	 it.unimi.dsi.fastutil.io.BinIO.storeFloats(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.io.TextIO#storeFloats(float[],int,int,java.io.PrintStream)}
*@see it.unimi.dsi.fastutil.io.TextIO#storeFloats(float[],int,int,java.io.PrintStream)
*<code>public static void it.unimi.dsi.fastutil.io.TextIO.storeFloats(float[],int,int,java.io.PrintStream)
*storeFloats(float[] p0,int p1,int p2,java.io.PrintStream p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void storeFloats(float[] p0,int p1,int p2,java.io.PrintStream p3){
	 it.unimi.dsi.fastutil.io.TextIO.storeFloats(p0,p1,p2,p3);
}
/**
*{@link it.unimi.dsi.fastutil.io.TextIO#storeFloats(float[],java.io.PrintStream)}
*@see it.unimi.dsi.fastutil.io.TextIO#storeFloats(float[],java.io.PrintStream)
*<code>public static void it.unimi.dsi.fastutil.io.TextIO.storeFloats(float[],java.io.PrintStream)
*storeFloats(float[] p0,java.io.PrintStream p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void storeFloats(float[] p0,java.io.PrintStream p1){
	 it.unimi.dsi.fastutil.io.TextIO.storeFloats(p0,p1);
}
/**
*{@link org.apache.commons.lang3.ArrayUtils#subarray(float[],int,int)}
*@see org.apache.commons.lang3.ArrayUtils#subarray(float[],int,int)
*<code>public static float[] org.apache.commons.lang3.ArrayUtils.subarray(float[],int,int)
*subarray(float[] p0,int p1,int p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static float[] subarray(float[] p0,int p1,int p2){
	return org.apache.commons.lang3.ArrayUtils.subarray(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.floats.FloatArrays#swap(float[],int,int)}
*@see it.unimi.dsi.fastutil.floats.FloatArrays#swap(float[],int,int)
*<code>public static void it.unimi.dsi.fastutil.floats.FloatArrays.swap(float[],int,int)
*swap(float[] p0,int p1,int p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void swap(float[] p0,int p1,int p2){
	 it.unimi.dsi.fastutil.floats.FloatArrays.swap(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.floats.FloatArrays#swap(float[],int,int,int)}
*@see it.unimi.dsi.fastutil.floats.FloatArrays#swap(float[],int,int,int)
*<code>public static void it.unimi.dsi.fastutil.floats.FloatArrays.swap(float[],int,int,int)
*swap(float[] p0,int p1,int p2,int p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void swap(float[] p0,int p1,int p2,int p3){
	 it.unimi.dsi.fastutil.floats.FloatArrays.swap(p0,p1,p2,p3);
}
/**
*{@link com.google.common.primitives.Floats#toArray(java.util.Collection<? extends java.lang.Number>)}
*@see com.google.common.primitives.Floats#toArray(java.util.Collection<? extends java.lang.Number>)
*<code>public static float[] com.google.common.primitives.Floats.toArray(java.util.Collection<? extends java.lang.Number>)
*toArray(java.util.Collection<? extends java.lang.Number> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static float[] toArray(java.util.Collection<? extends java.lang.Number> p0){
	return com.google.common.primitives.Floats.toArray(p0);
}
/**
*{@link org.apache.commons.lang3.ArrayUtils#toObject(float...)}
*@see org.apache.commons.lang3.ArrayUtils#toObject(float...)
*<code>public static java.lang.Float[] org.apache.commons.lang3.ArrayUtils.toObject(float[])
*toObject(float... p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.Float[] toObject(float... p0){
	return org.apache.commons.lang3.ArrayUtils.toObject(p0);
}
/**
*{@link org.apache.commons.lang3.ArrayUtils#toPrimitive(java.lang.Float[],float)}
*@see org.apache.commons.lang3.ArrayUtils#toPrimitive(java.lang.Float[],float)
*<code>public static float[] org.apache.commons.lang3.ArrayUtils.toPrimitive(java.lang.Float[],float)
*toPrimitive(java.lang.Float[] p0,float p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static float[] toPrimitive(java.lang.Float[] p0,float p1){
	return org.apache.commons.lang3.ArrayUtils.toPrimitive(p0,p1);
}
/**
*{@link org.apache.commons.lang3.ArrayUtils#toPrimitive(java.lang.Float...)}
*@see org.apache.commons.lang3.ArrayUtils#toPrimitive(java.lang.Float...)
*<code>public static float[] org.apache.commons.lang3.ArrayUtils.toPrimitive(java.lang.Float[])
*toPrimitive(java.lang.Float... p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static float[] toPrimitive(java.lang.Float... p0){
	return org.apache.commons.lang3.ArrayUtils.toPrimitive(p0);
}
/**
*{@link it.unimi.dsi.fastutil.floats.FloatArrays#trim(float[],int)}
*@see it.unimi.dsi.fastutil.floats.FloatArrays#trim(float[],int)
*<code>public static float[] it.unimi.dsi.fastutil.floats.FloatArrays.trim(float[],int)
*trim(float[] p0,int p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static float[] trim(float[] p0,int p1){
	return it.unimi.dsi.fastutil.floats.FloatArrays.trim(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.floats.FloatArrays#unstableSort(float[],int,int,it.unimi.dsi.fastutil.floats.FloatComparator)}
*@see it.unimi.dsi.fastutil.floats.FloatArrays#unstableSort(float[],int,int,it.unimi.dsi.fastutil.floats.FloatComparator)
*<code>public static void it.unimi.dsi.fastutil.floats.FloatArrays.unstableSort(float[],int,int,it.unimi.dsi.fastutil.floats.FloatComparator)
*unstableSort(float[] p0,int p1,int p2,it.unimi.dsi.fastutil.floats.FloatComparator p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void unstableSort(float[] p0,int p1,int p2,it.unimi.dsi.fastutil.floats.FloatComparator p3){
	 it.unimi.dsi.fastutil.floats.FloatArrays.unstableSort(p0,p1,p2,p3);
}
/**
*{@link it.unimi.dsi.fastutil.floats.FloatArrays#unstableSort(float[],int,int)}
*@see it.unimi.dsi.fastutil.floats.FloatArrays#unstableSort(float[],int,int)
*<code>public static void it.unimi.dsi.fastutil.floats.FloatArrays.unstableSort(float[],int,int)
*unstableSort(float[] p0,int p1,int p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void unstableSort(float[] p0,int p1,int p2){
	 it.unimi.dsi.fastutil.floats.FloatArrays.unstableSort(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.floats.FloatArrays#unstableSort(float[],it.unimi.dsi.fastutil.floats.FloatComparator)}
*@see it.unimi.dsi.fastutil.floats.FloatArrays#unstableSort(float[],it.unimi.dsi.fastutil.floats.FloatComparator)
*<code>public static void it.unimi.dsi.fastutil.floats.FloatArrays.unstableSort(float[],it.unimi.dsi.fastutil.floats.FloatComparator)
*unstableSort(float[] p0,it.unimi.dsi.fastutil.floats.FloatComparator p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void unstableSort(float[] p0,it.unimi.dsi.fastutil.floats.FloatComparator p1){
	 it.unimi.dsi.fastutil.floats.FloatArrays.unstableSort(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.floats.FloatArrays#unstableSort(float...)}
*@see it.unimi.dsi.fastutil.floats.FloatArrays#unstableSort(float...)
*<code>public static void it.unimi.dsi.fastutil.floats.FloatArrays.unstableSort(float[])
*unstableSort(float... p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void unstableSort(float... p0){
	 it.unimi.dsi.fastutil.floats.FloatArrays.unstableSort(p0);
}
/**
*{@link it.unimi.dsi.fastutil.floats.FloatIterators#unwrap(it.unimi.dsi.fastutil.floats.FloatIterator,float...)}
*@see it.unimi.dsi.fastutil.floats.FloatIterators#unwrap(it.unimi.dsi.fastutil.floats.FloatIterator,float...)
*<code>public static int it.unimi.dsi.fastutil.floats.FloatIterators.unwrap(it.unimi.dsi.fastutil.floats.FloatIterator,float[])
*unwrap(it.unimi.dsi.fastutil.floats.FloatIterator p0,float... p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int unwrap(it.unimi.dsi.fastutil.floats.FloatIterator p0,float... p1){
	return it.unimi.dsi.fastutil.floats.FloatIterators.unwrap(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.floats.FloatIterators#unwrap(it.unimi.dsi.fastutil.floats.FloatIterator,float[],int,int)}
*@see it.unimi.dsi.fastutil.floats.FloatIterators#unwrap(it.unimi.dsi.fastutil.floats.FloatIterator,float[],int,int)
*<code>public static int it.unimi.dsi.fastutil.floats.FloatIterators.unwrap(it.unimi.dsi.fastutil.floats.FloatIterator,float[],int,int)
*unwrap(it.unimi.dsi.fastutil.floats.FloatIterator p0,float[] p1,int p2,int p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int unwrap(it.unimi.dsi.fastutil.floats.FloatIterator p0,float[] p1,int p2,int p3){
	return it.unimi.dsi.fastutil.floats.FloatIterators.unwrap(p0,p1,p2,p3);
}
/**
*{@link it.unimi.dsi.fastutil.floats.FloatIterators#unwrap(it.unimi.dsi.fastutil.floats.FloatIterator)}
*@see it.unimi.dsi.fastutil.floats.FloatIterators#unwrap(it.unimi.dsi.fastutil.floats.FloatIterator)
*<code>public static float[] it.unimi.dsi.fastutil.floats.FloatIterators.unwrap(it.unimi.dsi.fastutil.floats.FloatIterator)
*unwrap(it.unimi.dsi.fastutil.floats.FloatIterator p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static float[] unwrap(it.unimi.dsi.fastutil.floats.FloatIterator p0){
	return it.unimi.dsi.fastutil.floats.FloatIterators.unwrap(p0);
}
/**
*{@link it.unimi.dsi.fastutil.floats.FloatIterators#unwrap(it.unimi.dsi.fastutil.floats.FloatIterator,int)}
*@see it.unimi.dsi.fastutil.floats.FloatIterators#unwrap(it.unimi.dsi.fastutil.floats.FloatIterator,int)
*<code>public static float[] it.unimi.dsi.fastutil.floats.FloatIterators.unwrap(it.unimi.dsi.fastutil.floats.FloatIterator,int)
*unwrap(it.unimi.dsi.fastutil.floats.FloatIterator p0,int p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static float[] unwrap(it.unimi.dsi.fastutil.floats.FloatIterator p0,int p1){
	return it.unimi.dsi.fastutil.floats.FloatIterators.unwrap(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.floats.FloatHeaps#upHeap(float[],int,int,it.unimi.dsi.fastutil.floats.FloatComparator)}
*@see it.unimi.dsi.fastutil.floats.FloatHeaps#upHeap(float[],int,int,it.unimi.dsi.fastutil.floats.FloatComparator)
*<code>public static int it.unimi.dsi.fastutil.floats.FloatHeaps.upHeap(float[],int,int,it.unimi.dsi.fastutil.floats.FloatComparator)
*upHeap(float[] p0,int p1,int p2,it.unimi.dsi.fastutil.floats.FloatComparator p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int upHeap(float[] p0,int p1,int p2,it.unimi.dsi.fastutil.floats.FloatComparator p3){
	return it.unimi.dsi.fastutil.floats.FloatHeaps.upHeap(p0,p1,p2,p3);
}
/**
*{@link it.unimi.dsi.fastutil.floats.FloatIndirectHeaps#upHeap(float[],int[],int[],int,int,it.unimi.dsi.fastutil.floats.FloatComparator)}
*@see it.unimi.dsi.fastutil.floats.FloatIndirectHeaps#upHeap(float[],int[],int[],int,int,it.unimi.dsi.fastutil.floats.FloatComparator)
*<code>public static int it.unimi.dsi.fastutil.floats.FloatIndirectHeaps.upHeap(float[],int[],int[],int,int,it.unimi.dsi.fastutil.floats.FloatComparator)
*upHeap(float[] p0,int[] p1,int[] p2,int p3,int p4,it.unimi.dsi.fastutil.floats.FloatComparator p5)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int upHeap(float[] p0,int[] p1,int[] p2,int p3,int p4,it.unimi.dsi.fastutil.floats.FloatComparator p5){
	return it.unimi.dsi.fastutil.floats.FloatIndirectHeaps.upHeap(p0,p1,p2,p3,p4,p5);
}
/**
*{@link it.unimi.dsi.fastutil.floats.FloatSemiIndirectHeaps#upHeap(float[],int[],int,int,it.unimi.dsi.fastutil.floats.FloatComparator)}
*@see it.unimi.dsi.fastutil.floats.FloatSemiIndirectHeaps#upHeap(float[],int[],int,int,it.unimi.dsi.fastutil.floats.FloatComparator)
*<code>public static int it.unimi.dsi.fastutil.floats.FloatSemiIndirectHeaps.upHeap(float[],int[],int,int,it.unimi.dsi.fastutil.floats.FloatComparator)
*upHeap(float[] p0,int[] p1,int p2,int p3,it.unimi.dsi.fastutil.floats.FloatComparator p4)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int upHeap(float[] p0,int[] p1,int p2,int p3,it.unimi.dsi.fastutil.floats.FloatComparator p4){
	return it.unimi.dsi.fastutil.floats.FloatSemiIndirectHeaps.upHeap(p0,p1,p2,p3,p4);
}
/**
*{@link it.unimi.dsi.fastutil.BigArrays#wrap(float...)}
*@see it.unimi.dsi.fastutil.BigArrays#wrap(float...)
*<code>public static float[][] it.unimi.dsi.fastutil.BigArrays.wrap(float[])
*wrap(float... p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static float[][] wrap(float... p0){
	return it.unimi.dsi.fastutil.BigArrays.wrap(p0);
}
/**
*{@link it.unimi.dsi.fastutil.floats.FloatArrayList#wrap(float[],int)}
*@see it.unimi.dsi.fastutil.floats.FloatArrayList#wrap(float[],int)
*<code>public static it.unimi.dsi.fastutil.floats.FloatArrayList it.unimi.dsi.fastutil.floats.FloatArrayList.wrap(float[],int)
*wrap(float[] p0,int p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.floats.FloatArrayList wrap(float[] p0,int p1){
	return it.unimi.dsi.fastutil.floats.FloatArrayList.wrap(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.floats.FloatIterators#wrap(float[],int,int)}
*@see it.unimi.dsi.fastutil.floats.FloatIterators#wrap(float[],int,int)
*<code>public static it.unimi.dsi.fastutil.floats.FloatListIterator it.unimi.dsi.fastutil.floats.FloatIterators.wrap(float[],int,int)
*wrap(float[] p0,int p1,int p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.floats.FloatListIterator wrap(float[] p0,int p1,int p2){
	return it.unimi.dsi.fastutil.floats.FloatIterators.wrap(p0,p1,p2);
}
}
