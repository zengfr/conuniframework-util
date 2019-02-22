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
public final class KArrayUtil{ 
/**
*{@link it.unimi.dsi.fastutil.objects.ObjectBigArrays#binarySearch(K[][],long,long,K,java.util.Comparator<K>)}
*@see it.unimi.dsi.fastutil.objects.ObjectBigArrays#binarySearch(K[][],long,long,K,java.util.Comparator<K>)
*<code>public static <K> long it.unimi.dsi.fastutil.objects.ObjectBigArrays.binarySearch(K[][],long,long,K,java.util.Comparator<K>)
*binarySearch(K[][] p0,long p1,long p2,K p3,java.util.Comparator<K> p4)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K> long binarySearch(K[][] p0,long p1,long p2,K p3,java.util.Comparator<K> p4){
	return it.unimi.dsi.fastutil.objects.ObjectBigArrays.binarySearch(p0,p1,p2,p3,p4);
}
/**
*{@link it.unimi.dsi.fastutil.objects.ObjectBigArrays#binarySearch(K[][],java.lang.Object)}
*@see it.unimi.dsi.fastutil.objects.ObjectBigArrays#binarySearch(K[][],java.lang.Object)
*<code>public static <K> long it.unimi.dsi.fastutil.objects.ObjectBigArrays.binarySearch(K[][],java.lang.Object)
*binarySearch(K[][] p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K> long binarySearch(K[][] p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.objects.ObjectBigArrays.binarySearch(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.objects.ObjectBigArrays#binarySearch(K[][],K,java.util.Comparator<K>)}
*@see it.unimi.dsi.fastutil.objects.ObjectBigArrays#binarySearch(K[][],K,java.util.Comparator<K>)
*<code>public static <K> long it.unimi.dsi.fastutil.objects.ObjectBigArrays.binarySearch(K[][],K,java.util.Comparator<K>)
*binarySearch(K[][] p0,K p1,java.util.Comparator<K> p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K> long binarySearch(K[][] p0,K p1,java.util.Comparator<K> p2){
	return it.unimi.dsi.fastutil.objects.ObjectBigArrays.binarySearch(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.objects.ObjectBigArrays#binarySearch(K[][],long,long,K)}
*@see it.unimi.dsi.fastutil.objects.ObjectBigArrays#binarySearch(K[][],long,long,K)
*<code>public static <K> long it.unimi.dsi.fastutil.objects.ObjectBigArrays.binarySearch(K[][],long,long,K)
*binarySearch(K[][] p0,long p1,long p2,K p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K> long binarySearch(K[][] p0,long p1,long p2,K p3){
	return it.unimi.dsi.fastutil.objects.ObjectBigArrays.binarySearch(p0,p1,p2,p3);
}
/**
*{@link it.unimi.dsi.fastutil.BigArrays#copy(K[][],long,K[][],long,long)}
*@see it.unimi.dsi.fastutil.BigArrays#copy(K[][],long,K[][],long,long)
*<code>public static <K> void it.unimi.dsi.fastutil.BigArrays.copy(K[][],long,K[][],long,long)
*copy(K[][] p0,long p1,K[][] p2,long p3,long p4)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K> void copy(K[][] p0,long p1,K[][] p2,long p3,long p4){
	 it.unimi.dsi.fastutil.BigArrays.copy(p0,p1,p2,p3,p4);
}
/**
*{@link it.unimi.dsi.fastutil.BigArrays#copy(K[][],long,long)}
*@see it.unimi.dsi.fastutil.BigArrays#copy(K[][],long,long)
*<code>public static <K> K[][] it.unimi.dsi.fastutil.BigArrays.copy(K[][],long,long)
*copy(K[][] p0,long p1,long p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K> K[][] copy(K[][] p0,long p1,long p2){
	return it.unimi.dsi.fastutil.BigArrays.copy(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.BigArrays#copy(K[]...)}
*@see it.unimi.dsi.fastutil.BigArrays#copy(K[]...)
*<code>public static <K> K[][] it.unimi.dsi.fastutil.BigArrays.copy(K[][])
*copy(K[]... p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K> K[][] copy(K[]... p0){
	return it.unimi.dsi.fastutil.BigArrays.copy(p0);
}
/**
*{@link it.unimi.dsi.fastutil.BigArrays#copyFromBig(K[][],long,K[],int,int)}
*@see it.unimi.dsi.fastutil.BigArrays#copyFromBig(K[][],long,K[],int,int)
*<code>public static <K> void it.unimi.dsi.fastutil.BigArrays.copyFromBig(K[][],long,K[],int,int)
*copyFromBig(K[][] p0,long p1,K[] p2,int p3,int p4)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K> void copyFromBig(K[][] p0,long p1,K[] p2,int p3,int p4){
	 it.unimi.dsi.fastutil.BigArrays.copyFromBig(p0,p1,p2,p3,p4);
}
/**
*{@link it.unimi.dsi.fastutil.BigArrays#copyToBig(K[],int,K[][],long,long)}
*@see it.unimi.dsi.fastutil.BigArrays#copyToBig(K[],int,K[][],long,long)
*<code>public static <K> void it.unimi.dsi.fastutil.BigArrays.copyToBig(K[],int,K[][],long,long)
*copyToBig(K[] p0,int p1,K[][] p2,long p3,long p4)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K> void copyToBig(K[] p0,int p1,K[][] p2,long p3,long p4){
	 it.unimi.dsi.fastutil.BigArrays.copyToBig(p0,p1,p2,p3,p4);
}
/**
*{@link it.unimi.dsi.fastutil.BigArrays#ensureCapacity(K[][],long)}
*@see it.unimi.dsi.fastutil.BigArrays#ensureCapacity(K[][],long)
*<code>public static <K> K[][] it.unimi.dsi.fastutil.BigArrays.ensureCapacity(K[][],long)
*ensureCapacity(K[][] p0,long p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K> K[][] ensureCapacity(K[][] p0,long p1){
	return it.unimi.dsi.fastutil.BigArrays.ensureCapacity(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.BigArrays#ensureCapacity(K[][],long,long)}
*@see it.unimi.dsi.fastutil.BigArrays#ensureCapacity(K[][],long,long)
*<code>public static <K> K[][] it.unimi.dsi.fastutil.BigArrays.ensureCapacity(K[][],long,long)
*ensureCapacity(K[][] p0,long p1,long p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K> K[][] ensureCapacity(K[][] p0,long p1,long p2){
	return it.unimi.dsi.fastutil.BigArrays.ensureCapacity(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.BigArrays#ensureFromTo(K[][],long,long)}
*@see it.unimi.dsi.fastutil.BigArrays#ensureFromTo(K[][],long,long)
*<code>public static <K> void it.unimi.dsi.fastutil.BigArrays.ensureFromTo(K[][],long,long)
*ensureFromTo(K[][] p0,long p1,long p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K> void ensureFromTo(K[][] p0,long p1,long p2){
	 it.unimi.dsi.fastutil.BigArrays.ensureFromTo(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.BigArrays#ensureOffsetLength(K[][],long,long)}
*@see it.unimi.dsi.fastutil.BigArrays#ensureOffsetLength(K[][],long,long)
*<code>public static <K> void it.unimi.dsi.fastutil.BigArrays.ensureOffsetLength(K[][],long,long)
*ensureOffsetLength(K[][] p0,long p1,long p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K> void ensureOffsetLength(K[][] p0,long p1,long p2){
	 it.unimi.dsi.fastutil.BigArrays.ensureOffsetLength(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.BigArrays#ensureSameLength(K[][],K[]...)}
*@see it.unimi.dsi.fastutil.BigArrays#ensureSameLength(K[][],K[]...)
*<code>public static <K> void it.unimi.dsi.fastutil.BigArrays.ensureSameLength(K[][],K[][])
*ensureSameLength(K[][] p0,K[]... p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K> void ensureSameLength(K[][] p0,K[]... p1){
	 it.unimi.dsi.fastutil.BigArrays.ensureSameLength(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.BigArrays#fill(K[][],K)}
*@see it.unimi.dsi.fastutil.BigArrays#fill(K[][],K)
*<code>public static <K> void it.unimi.dsi.fastutil.BigArrays.fill(K[][],K)
*fill(K[][] p0,K p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K> void fill(K[][] p0,K p1){
	 it.unimi.dsi.fastutil.BigArrays.fill(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.BigArrays#fill(K[][],long,long,K)}
*@see it.unimi.dsi.fastutil.BigArrays#fill(K[][],long,long,K)
*<code>public static <K> void it.unimi.dsi.fastutil.BigArrays.fill(K[][],long,long,K)
*fill(K[][] p0,long p1,long p2,K p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K> void fill(K[][] p0,long p1,long p2,K p3){
	 it.unimi.dsi.fastutil.BigArrays.fill(p0,p1,p2,p3);
}
/**
*{@link it.unimi.dsi.fastutil.BigArrays#forceCapacity(K[][],long,long)}
*@see it.unimi.dsi.fastutil.BigArrays#forceCapacity(K[][],long,long)
*<code>public static <K> K[][] it.unimi.dsi.fastutil.BigArrays.forceCapacity(K[][],long,long)
*forceCapacity(K[][] p0,long p1,long p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K> K[][] forceCapacity(K[][] p0,long p1,long p2){
	return it.unimi.dsi.fastutil.BigArrays.forceCapacity(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.BigArrays#grow(K[][],long)}
*@see it.unimi.dsi.fastutil.BigArrays#grow(K[][],long)
*<code>public static <K> K[][] it.unimi.dsi.fastutil.BigArrays.grow(K[][],long)
*grow(K[][] p0,long p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K> K[][] grow(K[][] p0,long p1){
	return it.unimi.dsi.fastutil.BigArrays.grow(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.BigArrays#grow(K[][],long,long)}
*@see it.unimi.dsi.fastutil.BigArrays#grow(K[][],long,long)
*<code>public static <K> K[][] it.unimi.dsi.fastutil.BigArrays.grow(K[][],long,long)
*grow(K[][] p0,long p1,long p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K> K[][] grow(K[][] p0,long p1,long p2){
	return it.unimi.dsi.fastutil.BigArrays.grow(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.BigArrays#length(K[]...)}
*@see it.unimi.dsi.fastutil.BigArrays#length(K[]...)
*<code>public static <K> long it.unimi.dsi.fastutil.BigArrays.length(K[][])
*length(K[]... p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K> long length(K[]... p0){
	return it.unimi.dsi.fastutil.BigArrays.length(p0);
}
/**
*{@link it.unimi.dsi.fastutil.objects.ObjectBigArrays#newBigArray(K[][],long)}
*@see it.unimi.dsi.fastutil.objects.ObjectBigArrays#newBigArray(K[][],long)
*<code>public static <K> K[][] it.unimi.dsi.fastutil.objects.ObjectBigArrays.newBigArray(K[][],long)
*newBigArray(K[][] p0,long p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K> K[][] newBigArray(K[][] p0,long p1){
	return it.unimi.dsi.fastutil.objects.ObjectBigArrays.newBigArray(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.objects.ObjectBigArrays#quickSort(K[][],long,long,java.util.Comparator<K>)}
*@see it.unimi.dsi.fastutil.objects.ObjectBigArrays#quickSort(K[][],long,long,java.util.Comparator<K>)
*<code>public static <K> void it.unimi.dsi.fastutil.objects.ObjectBigArrays.quickSort(K[][],long,long,java.util.Comparator<K>)
*quickSort(K[][] p0,long p1,long p2,java.util.Comparator<K> p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K> void quickSort(K[][] p0,long p1,long p2,java.util.Comparator<K> p3){
	 it.unimi.dsi.fastutil.objects.ObjectBigArrays.quickSort(p0,p1,p2,p3);
}
/**
*{@link it.unimi.dsi.fastutil.objects.ObjectBigArrays#quickSort(K[][],long,long)}
*@see it.unimi.dsi.fastutil.objects.ObjectBigArrays#quickSort(K[][],long,long)
*<code>public static <K> void it.unimi.dsi.fastutil.objects.ObjectBigArrays.quickSort(K[][],long,long)
*quickSort(K[][] p0,long p1,long p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K> void quickSort(K[][] p0,long p1,long p2){
	 it.unimi.dsi.fastutil.objects.ObjectBigArrays.quickSort(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.objects.ObjectBigArrays#quickSort(K[][],java.util.Comparator<K>)}
*@see it.unimi.dsi.fastutil.objects.ObjectBigArrays#quickSort(K[][],java.util.Comparator<K>)
*<code>public static <K> void it.unimi.dsi.fastutil.objects.ObjectBigArrays.quickSort(K[][],java.util.Comparator<K>)
*quickSort(K[][] p0,java.util.Comparator<K> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K> void quickSort(K[][] p0,java.util.Comparator<K> p1){
	 it.unimi.dsi.fastutil.objects.ObjectBigArrays.quickSort(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.objects.ObjectBigArrays#quickSort(K[]...)}
*@see it.unimi.dsi.fastutil.objects.ObjectBigArrays#quickSort(K[]...)
*<code>public static <K> void it.unimi.dsi.fastutil.objects.ObjectBigArrays.quickSort(K[][])
*quickSort(K[]... p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K> void quickSort(K[]... p0){
	 it.unimi.dsi.fastutil.objects.ObjectBigArrays.quickSort(p0);
}
/**
*{@link it.unimi.dsi.fastutil.BigArrays#set(K[][],long,K)}
*@see it.unimi.dsi.fastutil.BigArrays#set(K[][],long,K)
*<code>public static <K> void it.unimi.dsi.fastutil.BigArrays.set(K[][],long,K)
*set(K[][] p0,long p1,K p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K> void set(K[][] p0,long p1,K p2){
	 it.unimi.dsi.fastutil.BigArrays.set(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.BigArrays#setLength(K[][],long)}
*@see it.unimi.dsi.fastutil.BigArrays#setLength(K[][],long)
*<code>public static <K> K[][] it.unimi.dsi.fastutil.BigArrays.setLength(K[][],long)
*setLength(K[][] p0,long p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K> K[][] setLength(K[][] p0,long p1){
	return it.unimi.dsi.fastutil.BigArrays.setLength(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.objects.ObjectBigArrays#shuffle(K[][],java.util.Random)}
*@see it.unimi.dsi.fastutil.objects.ObjectBigArrays#shuffle(K[][],java.util.Random)
*<code>public static <K> K[][] it.unimi.dsi.fastutil.objects.ObjectBigArrays.shuffle(K[][],java.util.Random)
*shuffle(K[][] p0,java.util.Random p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K> K[][] shuffle(K[][] p0,java.util.Random p1){
	return it.unimi.dsi.fastutil.objects.ObjectBigArrays.shuffle(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.objects.ObjectBigArrays#shuffle(K[][],long,long,java.util.Random)}
*@see it.unimi.dsi.fastutil.objects.ObjectBigArrays#shuffle(K[][],long,long,java.util.Random)
*<code>public static <K> K[][] it.unimi.dsi.fastutil.objects.ObjectBigArrays.shuffle(K[][],long,long,java.util.Random)
*shuffle(K[][] p0,long p1,long p2,java.util.Random p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K> K[][] shuffle(K[][] p0,long p1,long p2,java.util.Random p3){
	return it.unimi.dsi.fastutil.objects.ObjectBigArrays.shuffle(p0,p1,p2,p3);
}
/**
*{@link it.unimi.dsi.fastutil.BigArrays#swap(K[][],long,long)}
*@see it.unimi.dsi.fastutil.BigArrays#swap(K[][],long,long)
*<code>public static <K> void it.unimi.dsi.fastutil.BigArrays.swap(K[][],long,long)
*swap(K[][] p0,long p1,long p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K> void swap(K[][] p0,long p1,long p2){
	 it.unimi.dsi.fastutil.BigArrays.swap(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.BigArrays#trim(K[][],long)}
*@see it.unimi.dsi.fastutil.BigArrays#trim(K[][],long)
*<code>public static <K> K[][] it.unimi.dsi.fastutil.BigArrays.trim(K[][],long)
*trim(K[][] p0,long p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K> K[][] trim(K[][] p0,long p1){
	return it.unimi.dsi.fastutil.BigArrays.trim(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.objects.ObjectIterators#unwrap(java.util.Iterator<? extends K>,K[]...)}
*@see it.unimi.dsi.fastutil.objects.ObjectIterators#unwrap(java.util.Iterator<? extends K>,K[]...)
*<code>public static <K> long it.unimi.dsi.fastutil.objects.ObjectIterators.unwrap(java.util.Iterator<? extends K>,K[][])
*unwrap(java.util.Iterator<? extends K> p0,K[]... p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K> long unwrap(java.util.Iterator<? extends K> p0,K[]... p1){
	return it.unimi.dsi.fastutil.objects.ObjectIterators.unwrap(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.objects.ObjectIterators#unwrap(java.util.Iterator<? extends K>,K[][],long,long)}
*@see it.unimi.dsi.fastutil.objects.ObjectIterators#unwrap(java.util.Iterator<? extends K>,K[][],long,long)
*<code>public static <K> long it.unimi.dsi.fastutil.objects.ObjectIterators.unwrap(java.util.Iterator<? extends K>,K[][],long,long)
*unwrap(java.util.Iterator<? extends K> p0,K[][] p1,long p2,long p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K> long unwrap(java.util.Iterator<? extends K> p0,K[][] p1,long p2,long p3){
	return it.unimi.dsi.fastutil.objects.ObjectIterators.unwrap(p0,p1,p2,p3);
}
/**
*{@link it.unimi.dsi.fastutil.objects.ObjectBigArrayBigList#wrap(K[]...)}
*@see it.unimi.dsi.fastutil.objects.ObjectBigArrayBigList#wrap(K[]...)
*<code>public static <K> it.unimi.dsi.fastutil.objects.ObjectBigArrayBigList<K> it.unimi.dsi.fastutil.objects.ObjectBigArrayBigList.wrap(K[][])
*wrap(K[]... p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K> it.unimi.dsi.fastutil.objects.ObjectBigArrayBigList<K> wrap(K[]... p0){
	return it.unimi.dsi.fastutil.objects.ObjectBigArrayBigList.wrap(p0);
}
/**
*{@link it.unimi.dsi.fastutil.objects.ObjectBigArrayBigList#wrap(K[][],long)}
*@see it.unimi.dsi.fastutil.objects.ObjectBigArrayBigList#wrap(K[][],long)
*<code>public static <K> it.unimi.dsi.fastutil.objects.ObjectBigArrayBigList<K> it.unimi.dsi.fastutil.objects.ObjectBigArrayBigList.wrap(K[][],long)
*wrap(K[][] p0,long p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K> it.unimi.dsi.fastutil.objects.ObjectBigArrayBigList<K> wrap(K[][] p0,long p1){
	return it.unimi.dsi.fastutil.objects.ObjectBigArrayBigList.wrap(p0,p1);
}
}
