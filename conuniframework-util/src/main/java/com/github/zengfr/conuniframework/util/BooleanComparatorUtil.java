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
public final class BooleanComparatorUtil{ 
/**
*{@link it.unimi.dsi.fastutil.booleans.BooleanComparators#asBooleanComparator(java.util.Comparator<? super java.lang.Boolean>)}
*@see it.unimi.dsi.fastutil.booleans.BooleanComparators#asBooleanComparator(java.util.Comparator<? super java.lang.Boolean>)
*<code>public static it.unimi.dsi.fastutil.booleans.BooleanComparator it.unimi.dsi.fastutil.booleans.BooleanComparators.asBooleanComparator(java.util.Comparator<? super java.lang.Boolean>)
*asBooleanComparator(java.util.Comparator<? super java.lang.Boolean> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.booleans.BooleanComparator asBooleanComparator(java.util.Comparator<? super java.lang.Boolean> p0){
	return it.unimi.dsi.fastutil.booleans.BooleanComparators.asBooleanComparator(p0);
}
/**
*{@link org.apache.commons.collections4.comparators.BooleanComparator#booleanComparator(boolean)}
*@see org.apache.commons.collections4.comparators.BooleanComparator#booleanComparator(boolean)
*<code>public static org.apache.commons.collections4.comparators.BooleanComparator org.apache.commons.collections4.comparators.BooleanComparator.booleanComparator(boolean)
*booleanComparator(boolean p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections4.comparators.BooleanComparator booleanComparator(boolean p0){
	return org.apache.commons.collections4.comparators.BooleanComparator.booleanComparator(p0);
}
/**
*{@link org.apache.commons.collections.comparators.BooleanComparator#getBooleanComparator(boolean)}
*@see org.apache.commons.collections.comparators.BooleanComparator#getBooleanComparator(boolean)
*<code>public static org.apache.commons.collections.comparators.BooleanComparator org.apache.commons.collections.comparators.BooleanComparator.getBooleanComparator(boolean)
*getBooleanComparator(boolean p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.comparators.BooleanComparator getBooleanComparator(boolean p0){
	return org.apache.commons.collections.comparators.BooleanComparator.getBooleanComparator(p0);
}
/**
*{@link org.apache.commons.collections4.comparators.BooleanComparator#getFalseFirstComparator()}
*@see org.apache.commons.collections4.comparators.BooleanComparator#getFalseFirstComparator()
*<code>public static org.apache.commons.collections4.comparators.BooleanComparator org.apache.commons.collections4.comparators.BooleanComparator.getFalseFirstComparator()
*getFalseFirstComparator()</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections4.comparators.BooleanComparator getFalseFirstComparator(){
	return org.apache.commons.collections4.comparators.BooleanComparator.getFalseFirstComparator();
}
/**
*{@link org.apache.commons.collections4.comparators.BooleanComparator#getTrueFirstComparator()}
*@see org.apache.commons.collections4.comparators.BooleanComparator#getTrueFirstComparator()
*<code>public static org.apache.commons.collections4.comparators.BooleanComparator org.apache.commons.collections4.comparators.BooleanComparator.getTrueFirstComparator()
*getTrueFirstComparator()</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections4.comparators.BooleanComparator getTrueFirstComparator(){
	return org.apache.commons.collections4.comparators.BooleanComparator.getTrueFirstComparator();
}
/**
*{@link it.unimi.dsi.fastutil.booleans.BooleanArrays#mergeSort(boolean[],it.unimi.dsi.fastutil.booleans.BooleanComparator)}
*@see it.unimi.dsi.fastutil.booleans.BooleanArrays#mergeSort(boolean[],it.unimi.dsi.fastutil.booleans.BooleanComparator)
*<code>public static void it.unimi.dsi.fastutil.booleans.BooleanArrays.mergeSort(boolean[],it.unimi.dsi.fastutil.booleans.BooleanComparator)
*mergeSort(boolean[] p0,it.unimi.dsi.fastutil.booleans.BooleanComparator p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void mergeSort(boolean[] p0,it.unimi.dsi.fastutil.booleans.BooleanComparator p1){
	 it.unimi.dsi.fastutil.booleans.BooleanArrays.mergeSort(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.booleans.BooleanArrays#mergeSort(boolean[],int,int,it.unimi.dsi.fastutil.booleans.BooleanComparator)}
*@see it.unimi.dsi.fastutil.booleans.BooleanArrays#mergeSort(boolean[],int,int,it.unimi.dsi.fastutil.booleans.BooleanComparator)
*<code>public static void it.unimi.dsi.fastutil.booleans.BooleanArrays.mergeSort(boolean[],int,int,it.unimi.dsi.fastutil.booleans.BooleanComparator)
*mergeSort(boolean[] p0,int p1,int p2,it.unimi.dsi.fastutil.booleans.BooleanComparator p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void mergeSort(boolean[] p0,int p1,int p2,it.unimi.dsi.fastutil.booleans.BooleanComparator p3){
	 it.unimi.dsi.fastutil.booleans.BooleanArrays.mergeSort(p0,p1,p2,p3);
}
/**
*{@link it.unimi.dsi.fastutil.booleans.BooleanArrays#mergeSort(boolean[],int,int,it.unimi.dsi.fastutil.booleans.BooleanComparator,boolean...)}
*@see it.unimi.dsi.fastutil.booleans.BooleanArrays#mergeSort(boolean[],int,int,it.unimi.dsi.fastutil.booleans.BooleanComparator,boolean...)
*<code>public static void it.unimi.dsi.fastutil.booleans.BooleanArrays.mergeSort(boolean[],int,int,it.unimi.dsi.fastutil.booleans.BooleanComparator,boolean[])
*mergeSort(boolean[] p0,int p1,int p2,it.unimi.dsi.fastutil.booleans.BooleanComparator p3,boolean... p4)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void mergeSort(boolean[] p0,int p1,int p2,it.unimi.dsi.fastutil.booleans.BooleanComparator p3,boolean... p4){
	 it.unimi.dsi.fastutil.booleans.BooleanArrays.mergeSort(p0,p1,p2,p3,p4);
}
/**
*{@link it.unimi.dsi.fastutil.booleans.BooleanComparators#oppositeComparator(it.unimi.dsi.fastutil.booleans.BooleanComparator)}
*@see it.unimi.dsi.fastutil.booleans.BooleanComparators#oppositeComparator(it.unimi.dsi.fastutil.booleans.BooleanComparator)
*<code>public static it.unimi.dsi.fastutil.booleans.BooleanComparator it.unimi.dsi.fastutil.booleans.BooleanComparators.oppositeComparator(it.unimi.dsi.fastutil.booleans.BooleanComparator)
*oppositeComparator(it.unimi.dsi.fastutil.booleans.BooleanComparator p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.booleans.BooleanComparator oppositeComparator(it.unimi.dsi.fastutil.booleans.BooleanComparator p0){
	return it.unimi.dsi.fastutil.booleans.BooleanComparators.oppositeComparator(p0);
}
/**
*{@link it.unimi.dsi.fastutil.booleans.BooleanArrays#parallelQuickSort(boolean[],int,int,it.unimi.dsi.fastutil.booleans.BooleanComparator)}
*@see it.unimi.dsi.fastutil.booleans.BooleanArrays#parallelQuickSort(boolean[],int,int,it.unimi.dsi.fastutil.booleans.BooleanComparator)
*<code>public static void it.unimi.dsi.fastutil.booleans.BooleanArrays.parallelQuickSort(boolean[],int,int,it.unimi.dsi.fastutil.booleans.BooleanComparator)
*parallelQuickSort(boolean[] p0,int p1,int p2,it.unimi.dsi.fastutil.booleans.BooleanComparator p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void parallelQuickSort(boolean[] p0,int p1,int p2,it.unimi.dsi.fastutil.booleans.BooleanComparator p3){
	 it.unimi.dsi.fastutil.booleans.BooleanArrays.parallelQuickSort(p0,p1,p2,p3);
}
/**
*{@link it.unimi.dsi.fastutil.booleans.BooleanArrays#parallelQuickSort(boolean[],it.unimi.dsi.fastutil.booleans.BooleanComparator)}
*@see it.unimi.dsi.fastutil.booleans.BooleanArrays#parallelQuickSort(boolean[],it.unimi.dsi.fastutil.booleans.BooleanComparator)
*<code>public static void it.unimi.dsi.fastutil.booleans.BooleanArrays.parallelQuickSort(boolean[],it.unimi.dsi.fastutil.booleans.BooleanComparator)
*parallelQuickSort(boolean[] p0,it.unimi.dsi.fastutil.booleans.BooleanComparator p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void parallelQuickSort(boolean[] p0,it.unimi.dsi.fastutil.booleans.BooleanComparator p1){
	 it.unimi.dsi.fastutil.booleans.BooleanArrays.parallelQuickSort(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.booleans.BooleanArrays#quickSort(boolean[],it.unimi.dsi.fastutil.booleans.BooleanComparator)}
*@see it.unimi.dsi.fastutil.booleans.BooleanArrays#quickSort(boolean[],it.unimi.dsi.fastutil.booleans.BooleanComparator)
*<code>public static void it.unimi.dsi.fastutil.booleans.BooleanArrays.quickSort(boolean[],it.unimi.dsi.fastutil.booleans.BooleanComparator)
*quickSort(boolean[] p0,it.unimi.dsi.fastutil.booleans.BooleanComparator p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void quickSort(boolean[] p0,it.unimi.dsi.fastutil.booleans.BooleanComparator p1){
	 it.unimi.dsi.fastutil.booleans.BooleanArrays.quickSort(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.booleans.BooleanArrays#quickSort(boolean[],int,int,it.unimi.dsi.fastutil.booleans.BooleanComparator)}
*@see it.unimi.dsi.fastutil.booleans.BooleanArrays#quickSort(boolean[],int,int,it.unimi.dsi.fastutil.booleans.BooleanComparator)
*<code>public static void it.unimi.dsi.fastutil.booleans.BooleanArrays.quickSort(boolean[],int,int,it.unimi.dsi.fastutil.booleans.BooleanComparator)
*quickSort(boolean[] p0,int p1,int p2,it.unimi.dsi.fastutil.booleans.BooleanComparator p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void quickSort(boolean[] p0,int p1,int p2,it.unimi.dsi.fastutil.booleans.BooleanComparator p3){
	 it.unimi.dsi.fastutil.booleans.BooleanArrays.quickSort(p0,p1,p2,p3);
}
/**
*{@link it.unimi.dsi.fastutil.booleans.BooleanBigArrays#quickSort(boolean[][],it.unimi.dsi.fastutil.booleans.BooleanComparator)}
*@see it.unimi.dsi.fastutil.booleans.BooleanBigArrays#quickSort(boolean[][],it.unimi.dsi.fastutil.booleans.BooleanComparator)
*<code>public static void it.unimi.dsi.fastutil.booleans.BooleanBigArrays.quickSort(boolean[][],it.unimi.dsi.fastutil.booleans.BooleanComparator)
*quickSort(boolean[][] p0,it.unimi.dsi.fastutil.booleans.BooleanComparator p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void quickSort(boolean[][] p0,it.unimi.dsi.fastutil.booleans.BooleanComparator p1){
	 it.unimi.dsi.fastutil.booleans.BooleanBigArrays.quickSort(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.booleans.BooleanBigArrays#quickSort(boolean[][],long,long,it.unimi.dsi.fastutil.booleans.BooleanComparator)}
*@see it.unimi.dsi.fastutil.booleans.BooleanBigArrays#quickSort(boolean[][],long,long,it.unimi.dsi.fastutil.booleans.BooleanComparator)
*<code>public static void it.unimi.dsi.fastutil.booleans.BooleanBigArrays.quickSort(boolean[][],long,long,it.unimi.dsi.fastutil.booleans.BooleanComparator)
*quickSort(boolean[][] p0,long p1,long p2,it.unimi.dsi.fastutil.booleans.BooleanComparator p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void quickSort(boolean[][] p0,long p1,long p2,it.unimi.dsi.fastutil.booleans.BooleanComparator p3){
	 it.unimi.dsi.fastutil.booleans.BooleanBigArrays.quickSort(p0,p1,p2,p3);
}
/**
*{@link it.unimi.dsi.fastutil.booleans.BooleanArrays#stableSort(boolean[],int,int,it.unimi.dsi.fastutil.booleans.BooleanComparator)}
*@see it.unimi.dsi.fastutil.booleans.BooleanArrays#stableSort(boolean[],int,int,it.unimi.dsi.fastutil.booleans.BooleanComparator)
*<code>public static void it.unimi.dsi.fastutil.booleans.BooleanArrays.stableSort(boolean[],int,int,it.unimi.dsi.fastutil.booleans.BooleanComparator)
*stableSort(boolean[] p0,int p1,int p2,it.unimi.dsi.fastutil.booleans.BooleanComparator p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void stableSort(boolean[] p0,int p1,int p2,it.unimi.dsi.fastutil.booleans.BooleanComparator p3){
	 it.unimi.dsi.fastutil.booleans.BooleanArrays.stableSort(p0,p1,p2,p3);
}
/**
*{@link it.unimi.dsi.fastutil.booleans.BooleanArrays#stableSort(boolean[],it.unimi.dsi.fastutil.booleans.BooleanComparator)}
*@see it.unimi.dsi.fastutil.booleans.BooleanArrays#stableSort(boolean[],it.unimi.dsi.fastutil.booleans.BooleanComparator)
*<code>public static void it.unimi.dsi.fastutil.booleans.BooleanArrays.stableSort(boolean[],it.unimi.dsi.fastutil.booleans.BooleanComparator)
*stableSort(boolean[] p0,it.unimi.dsi.fastutil.booleans.BooleanComparator p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void stableSort(boolean[] p0,it.unimi.dsi.fastutil.booleans.BooleanComparator p1){
	 it.unimi.dsi.fastutil.booleans.BooleanArrays.stableSort(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.booleans.BooleanArrays#unstableSort(boolean[],int,int,it.unimi.dsi.fastutil.booleans.BooleanComparator)}
*@see it.unimi.dsi.fastutil.booleans.BooleanArrays#unstableSort(boolean[],int,int,it.unimi.dsi.fastutil.booleans.BooleanComparator)
*<code>public static void it.unimi.dsi.fastutil.booleans.BooleanArrays.unstableSort(boolean[],int,int,it.unimi.dsi.fastutil.booleans.BooleanComparator)
*unstableSort(boolean[] p0,int p1,int p2,it.unimi.dsi.fastutil.booleans.BooleanComparator p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void unstableSort(boolean[] p0,int p1,int p2,it.unimi.dsi.fastutil.booleans.BooleanComparator p3){
	 it.unimi.dsi.fastutil.booleans.BooleanArrays.unstableSort(p0,p1,p2,p3);
}
/**
*{@link it.unimi.dsi.fastutil.booleans.BooleanArrays#unstableSort(boolean[],it.unimi.dsi.fastutil.booleans.BooleanComparator)}
*@see it.unimi.dsi.fastutil.booleans.BooleanArrays#unstableSort(boolean[],it.unimi.dsi.fastutil.booleans.BooleanComparator)
*<code>public static void it.unimi.dsi.fastutil.booleans.BooleanArrays.unstableSort(boolean[],it.unimi.dsi.fastutil.booleans.BooleanComparator)
*unstableSort(boolean[] p0,it.unimi.dsi.fastutil.booleans.BooleanComparator p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void unstableSort(boolean[] p0,it.unimi.dsi.fastutil.booleans.BooleanComparator p1){
	 it.unimi.dsi.fastutil.booleans.BooleanArrays.unstableSort(p0,p1);
}
}
