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
public final class ObjectUtil{ 
/**
*{@link org.apache.commons.lang3.ObjectUtils#CONST(T)}
*@see org.apache.commons.lang3.ObjectUtils#CONST(T)
*<code>public static <T> T org.apache.commons.lang3.ObjectUtils.CONST(T)
*CONST(T p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> T CONST(T p0){
	return org.apache.commons.lang3.ObjectUtils.CONST(p0);
}
/**
*{@link org.apache.commons.lang3.event.EventUtils#addEventListener(java.lang.Object,java.lang.Class<L>,L)}
*@see org.apache.commons.lang3.event.EventUtils#addEventListener(java.lang.Object,java.lang.Class<L>,L)
*<code>public static <L> void org.apache.commons.lang3.event.EventUtils.addEventListener(java.lang.Object,java.lang.Class<L>,L)
*addEventListener(java.lang.Object p0,java.lang.Class<L> p1,L p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <L> void addEventListener(java.lang.Object p0,java.lang.Class<L> p1,L p2){
	 org.apache.commons.lang3.event.EventUtils.addEventListener(p0,p1,p2);
}
/**
*{@link org.apache.commons.collections.CollectionUtils#addIgnoreNull(java.util.Collection,java.lang.Object)}
*@see org.apache.commons.collections.CollectionUtils#addIgnoreNull(java.util.Collection,java.lang.Object)
*<code>public static boolean org.apache.commons.collections.CollectionUtils.addIgnoreNull(java.util.Collection,java.lang.Object)
*addIgnoreNull(java.util.Collection p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean addIgnoreNull(java.util.Collection p0,java.lang.Object p1){
	return org.apache.commons.collections.CollectionUtils.addIgnoreNull(p0,p1);
}
/**
*{@link org.apache.commons.lang3.Functions#apply(org.apache.commons.lang3.Functions$FailableFunction<I, O, T>,I)}
*@see org.apache.commons.lang3.Functions#apply(org.apache.commons.lang3.Functions$FailableFunction<I, O, T>,I)
*<code>public static <I,O,T> O org.apache.commons.lang3.Functions.apply(org.apache.commons.lang3.Functions$FailableFunction<I, O, T>,I)
*apply(org.apache.commons.lang3.Functions$FailableFunction<I, O, T> p0,I p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <I,O,T extends java.lang.Throwable > O apply(org.apache.commons.lang3.Functions.FailableFunction<I, O, T> p0,I p1){
	return org.apache.commons.lang3.Functions.apply(p0,p1);
}
/**
*{@link org.apache.commons.lang3.Functions#apply(org.apache.commons.lang3.Functions$FailableBiFunction<I1, I2, O, T>,I1,I2)}
*@see org.apache.commons.lang3.Functions#apply(org.apache.commons.lang3.Functions$FailableBiFunction<I1, I2, O, T>,I1,I2)
*<code>public static <I1,I2,O,T> O org.apache.commons.lang3.Functions.apply(org.apache.commons.lang3.Functions$FailableBiFunction<I1, I2, O, T>,I1,I2)
*apply(org.apache.commons.lang3.Functions$FailableBiFunction<I1, I2, O, T> p0,I1 p1,I2 p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <I1,I2,O,T extends java.lang.Throwable > O apply(org.apache.commons.lang3.Functions.FailableBiFunction<I1, I2, O, T> p0,I1 p1,I2 p2){
	return org.apache.commons.lang3.Functions.apply(p0,p1,p2);
}
/**
*{@link org.apache.commons.collections4.IteratorUtils#arrayIterator(java.lang.Object)}
*@see org.apache.commons.collections4.IteratorUtils#arrayIterator(java.lang.Object)
*<code>public static <E> org.apache.commons.collections4.ResettableIterator<E> org.apache.commons.collections4.IteratorUtils.arrayIterator(java.lang.Object)
*arrayIterator(java.lang.Object p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E> org.apache.commons.collections4.ResettableIterator<E> arrayIterator(java.lang.Object p0){
	return org.apache.commons.collections4.IteratorUtils.arrayIterator(p0);
}
/**
*{@link org.apache.commons.collections4.IteratorUtils#arrayIterator(java.lang.Object,int)}
*@see org.apache.commons.collections4.IteratorUtils#arrayIterator(java.lang.Object,int)
*<code>public static <E> org.apache.commons.collections4.ResettableIterator<E> org.apache.commons.collections4.IteratorUtils.arrayIterator(java.lang.Object,int)
*arrayIterator(java.lang.Object p0,int p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E> org.apache.commons.collections4.ResettableIterator<E> arrayIterator(java.lang.Object p0,int p1){
	return org.apache.commons.collections4.IteratorUtils.arrayIterator(p0,p1);
}
/**
*{@link org.apache.commons.collections4.IteratorUtils#arrayIterator(java.lang.Object,int,int)}
*@see org.apache.commons.collections4.IteratorUtils#arrayIterator(java.lang.Object,int,int)
*<code>public static <E> org.apache.commons.collections4.ResettableIterator<E> org.apache.commons.collections4.IteratorUtils.arrayIterator(java.lang.Object,int,int)
*arrayIterator(java.lang.Object p0,int p1,int p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E> org.apache.commons.collections4.ResettableIterator<E> arrayIterator(java.lang.Object p0,int p1,int p2){
	return org.apache.commons.collections4.IteratorUtils.arrayIterator(p0,p1,p2);
}
/**
*{@link org.apache.commons.collections4.IteratorUtils#arrayListIterator(java.lang.Object,int,int)}
*@see org.apache.commons.collections4.IteratorUtils#arrayListIterator(java.lang.Object,int,int)
*<code>public static <E> org.apache.commons.collections4.ResettableListIterator<E> org.apache.commons.collections4.IteratorUtils.arrayListIterator(java.lang.Object,int,int)
*arrayListIterator(java.lang.Object p0,int p1,int p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E> org.apache.commons.collections4.ResettableListIterator<E> arrayListIterator(java.lang.Object p0,int p1,int p2){
	return org.apache.commons.collections4.IteratorUtils.arrayListIterator(p0,p1,p2);
}
/**
*{@link org.apache.commons.collections4.IteratorUtils#arrayListIterator(java.lang.Object)}
*@see org.apache.commons.collections4.IteratorUtils#arrayListIterator(java.lang.Object)
*<code>public static <E> org.apache.commons.collections4.ResettableListIterator<E> org.apache.commons.collections4.IteratorUtils.arrayListIterator(java.lang.Object)
*arrayListIterator(java.lang.Object p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E> org.apache.commons.collections4.ResettableListIterator<E> arrayListIterator(java.lang.Object p0){
	return org.apache.commons.collections4.IteratorUtils.arrayListIterator(p0);
}
/**
*{@link org.apache.commons.collections4.IteratorUtils#arrayListIterator(java.lang.Object,int)}
*@see org.apache.commons.collections4.IteratorUtils#arrayListIterator(java.lang.Object,int)
*<code>public static <E> org.apache.commons.collections4.ResettableListIterator<E> org.apache.commons.collections4.IteratorUtils.arrayListIterator(java.lang.Object,int)
*arrayListIterator(java.lang.Object p0,int p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E> org.apache.commons.collections4.ResettableListIterator<E> arrayListIterator(java.lang.Object p0,int p1){
	return org.apache.commons.collections4.IteratorUtils.arrayListIterator(p0,p1);
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
*{@link org.apache.commons.lang3.event.EventUtils#bindEventsToMethod(java.lang.Object,java.lang.String,java.lang.Object,java.lang.Class<L>,java.lang.String...)}
*@see org.apache.commons.lang3.event.EventUtils#bindEventsToMethod(java.lang.Object,java.lang.String,java.lang.Object,java.lang.Class<L>,java.lang.String...)
*<code>public static <L> void org.apache.commons.lang3.event.EventUtils.bindEventsToMethod(java.lang.Object,java.lang.String,java.lang.Object,java.lang.Class<L>,java.lang.String...)
*bindEventsToMethod(java.lang.Object p0,java.lang.String p1,java.lang.Object p2,java.lang.Class<L> p3,java.lang.String... p4)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <L> void bindEventsToMethod(java.lang.Object p0,java.lang.String p1,java.lang.Object p2,java.lang.Class<L> p3,java.lang.String... p4){
	 org.apache.commons.lang3.event.EventUtils.bindEventsToMethod(p0,p1,p2,p3,p4);
}
/**
*{@link org.apache.commons.lang3.Functions#call(org.apache.commons.lang3.Functions$FailableCallable<O, T>)}
*@see org.apache.commons.lang3.Functions#call(org.apache.commons.lang3.Functions$FailableCallable<O, T>)
*<code>public static <O,T> O org.apache.commons.lang3.Functions.call(org.apache.commons.lang3.Functions$FailableCallable<O, T>)
*call(org.apache.commons.lang3.Functions$FailableCallable<O, T> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <O,T extends java.lang.Throwable > O call(org.apache.commons.lang3.Functions.FailableCallable<O, T> p0){
	return org.apache.commons.lang3.Functions.call(p0);
}
/**
*{@link org.apache.commons.collections.CollectionUtils#cardinality(java.lang.Object,java.util.Collection)}
*@see org.apache.commons.collections.CollectionUtils#cardinality(java.lang.Object,java.util.Collection)
*<code>public static int org.apache.commons.collections.CollectionUtils.cardinality(java.lang.Object,java.util.Collection)
*cardinality(java.lang.Object p0,java.util.Collection p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int cardinality(java.lang.Object p0,java.util.Collection p1){
	return org.apache.commons.collections.CollectionUtils.cardinality(p0,p1);
}
/**
*{@link org.apache.commons.lang3.time.DateUtils#ceiling(java.lang.Object,int)}
*@see org.apache.commons.lang3.time.DateUtils#ceiling(java.lang.Object,int)
*<code>public static java.util.Date org.apache.commons.lang3.time.DateUtils.ceiling(java.lang.Object,int)
*ceiling(java.lang.Object p0,int p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Date ceiling(java.lang.Object p0,int p1){
	return org.apache.commons.lang3.time.DateUtils.ceiling(p0,p1);
}
/**
*{@link com.google.common.base.Preconditions#checkArgument(boolean,java.lang.String,java.lang.Object)}
*@see com.google.common.base.Preconditions#checkArgument(boolean,java.lang.String,java.lang.Object)
*<code>public static void com.google.common.base.Preconditions.checkArgument(boolean,java.lang.String,java.lang.Object)
*checkArgument(boolean p0,java.lang.String p1,java.lang.Object p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void checkArgument(boolean p0,java.lang.String p1,java.lang.Object p2){
	 com.google.common.base.Preconditions.checkArgument(p0,p1,p2);
}
/**
*{@link com.google.common.base.Preconditions#checkArgument(boolean,java.lang.Object)}
*@see com.google.common.base.Preconditions#checkArgument(boolean,java.lang.Object)
*<code>public static void com.google.common.base.Preconditions.checkArgument(boolean,java.lang.Object)
*checkArgument(boolean p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void checkArgument(boolean p0,java.lang.Object p1){
	 com.google.common.base.Preconditions.checkArgument(p0,p1);
}
/**
*{@link com.google.common.base.Preconditions#checkArgument(boolean,java.lang.String,java.lang.Object,java.lang.Object,java.lang.Object,java.lang.Object)}
*@see com.google.common.base.Preconditions#checkArgument(boolean,java.lang.String,java.lang.Object,java.lang.Object,java.lang.Object,java.lang.Object)
*<code>public static void com.google.common.base.Preconditions.checkArgument(boolean,java.lang.String,java.lang.Object,java.lang.Object,java.lang.Object,java.lang.Object)
*checkArgument(boolean p0,java.lang.String p1,java.lang.Object p2,java.lang.Object p3,java.lang.Object p4,java.lang.Object p5)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void checkArgument(boolean p0,java.lang.String p1,java.lang.Object p2,java.lang.Object p3,java.lang.Object p4,java.lang.Object p5){
	 com.google.common.base.Preconditions.checkArgument(p0,p1,p2,p3,p4,p5);
}
/**
*{@link com.google.common.base.Preconditions#checkArgument(boolean,java.lang.String,java.lang.Object,char)}
*@see com.google.common.base.Preconditions#checkArgument(boolean,java.lang.String,java.lang.Object,char)
*<code>public static void com.google.common.base.Preconditions.checkArgument(boolean,java.lang.String,java.lang.Object,char)
*checkArgument(boolean p0,java.lang.String p1,java.lang.Object p2,char p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void checkArgument(boolean p0,java.lang.String p1,java.lang.Object p2,char p3){
	 com.google.common.base.Preconditions.checkArgument(p0,p1,p2,p3);
}
/**
*{@link com.google.common.base.Preconditions#checkArgument(boolean,java.lang.String,long,java.lang.Object)}
*@see com.google.common.base.Preconditions#checkArgument(boolean,java.lang.String,long,java.lang.Object)
*<code>public static void com.google.common.base.Preconditions.checkArgument(boolean,java.lang.String,long,java.lang.Object)
*checkArgument(boolean p0,java.lang.String p1,long p2,java.lang.Object p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void checkArgument(boolean p0,java.lang.String p1,long p2,java.lang.Object p3){
	 com.google.common.base.Preconditions.checkArgument(p0,p1,p2,p3);
}
/**
*{@link com.google.common.base.Preconditions#checkArgument(boolean,java.lang.String,java.lang.Object,long)}
*@see com.google.common.base.Preconditions#checkArgument(boolean,java.lang.String,java.lang.Object,long)
*<code>public static void com.google.common.base.Preconditions.checkArgument(boolean,java.lang.String,java.lang.Object,long)
*checkArgument(boolean p0,java.lang.String p1,java.lang.Object p2,long p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void checkArgument(boolean p0,java.lang.String p1,java.lang.Object p2,long p3){
	 com.google.common.base.Preconditions.checkArgument(p0,p1,p2,p3);
}
/**
*{@link com.google.common.base.Preconditions#checkArgument(boolean,java.lang.String,java.lang.Object,int)}
*@see com.google.common.base.Preconditions#checkArgument(boolean,java.lang.String,java.lang.Object,int)
*<code>public static void com.google.common.base.Preconditions.checkArgument(boolean,java.lang.String,java.lang.Object,int)
*checkArgument(boolean p0,java.lang.String p1,java.lang.Object p2,int p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void checkArgument(boolean p0,java.lang.String p1,java.lang.Object p2,int p3){
	 com.google.common.base.Preconditions.checkArgument(p0,p1,p2,p3);
}
/**
*{@link com.google.common.base.Preconditions#checkArgument(boolean,java.lang.String,java.lang.Object,java.lang.Object)}
*@see com.google.common.base.Preconditions#checkArgument(boolean,java.lang.String,java.lang.Object,java.lang.Object)
*<code>public static void com.google.common.base.Preconditions.checkArgument(boolean,java.lang.String,java.lang.Object,java.lang.Object)
*checkArgument(boolean p0,java.lang.String p1,java.lang.Object p2,java.lang.Object p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void checkArgument(boolean p0,java.lang.String p1,java.lang.Object p2,java.lang.Object p3){
	 com.google.common.base.Preconditions.checkArgument(p0,p1,p2,p3);
}
/**
*{@link com.google.common.base.Preconditions#checkArgument(boolean,java.lang.String,java.lang.Object,java.lang.Object,java.lang.Object)}
*@see com.google.common.base.Preconditions#checkArgument(boolean,java.lang.String,java.lang.Object,java.lang.Object,java.lang.Object)
*<code>public static void com.google.common.base.Preconditions.checkArgument(boolean,java.lang.String,java.lang.Object,java.lang.Object,java.lang.Object)
*checkArgument(boolean p0,java.lang.String p1,java.lang.Object p2,java.lang.Object p3,java.lang.Object p4)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void checkArgument(boolean p0,java.lang.String p1,java.lang.Object p2,java.lang.Object p3,java.lang.Object p4){
	 com.google.common.base.Preconditions.checkArgument(p0,p1,p2,p3,p4);
}
/**
*{@link com.google.common.base.Preconditions#checkArgument(boolean,java.lang.String,char,java.lang.Object)}
*@see com.google.common.base.Preconditions#checkArgument(boolean,java.lang.String,char,java.lang.Object)
*<code>public static void com.google.common.base.Preconditions.checkArgument(boolean,java.lang.String,char,java.lang.Object)
*checkArgument(boolean p0,java.lang.String p1,char p2,java.lang.Object p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void checkArgument(boolean p0,java.lang.String p1,char p2,java.lang.Object p3){
	 com.google.common.base.Preconditions.checkArgument(p0,p1,p2,p3);
}
/**
*{@link com.google.common.base.Preconditions#checkArgument(boolean,java.lang.String,int,java.lang.Object)}
*@see com.google.common.base.Preconditions#checkArgument(boolean,java.lang.String,int,java.lang.Object)
*<code>public static void com.google.common.base.Preconditions.checkArgument(boolean,java.lang.String,int,java.lang.Object)
*checkArgument(boolean p0,java.lang.String p1,int p2,java.lang.Object p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void checkArgument(boolean p0,java.lang.String p1,int p2,java.lang.Object p3){
	 com.google.common.base.Preconditions.checkArgument(p0,p1,p2,p3);
}
/**
*{@link org.apache.commons.math3.util.MathUtils#checkNotNull(java.lang.Object)}
*@see org.apache.commons.math3.util.MathUtils#checkNotNull(java.lang.Object)
*<code>public static void org.apache.commons.math3.util.MathUtils.checkNotNull(java.lang.Object) throws org.apache.commons.math3.exception.NullArgumentException
*checkNotNull(java.lang.Object p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void checkNotNull(java.lang.Object p0) throws org.apache.commons.math3.exception.NullArgumentException{
	 org.apache.commons.math3.util.MathUtils.checkNotNull(p0);
}
/**
*{@link org.apache.commons.math3.util.MathUtils#checkNotNull(java.lang.Object,org.apache.commons.math3.exception.util.Localizable,java.lang.Object...)}
*@see org.apache.commons.math3.util.MathUtils#checkNotNull(java.lang.Object,org.apache.commons.math3.exception.util.Localizable,java.lang.Object...)
*<code>public static void org.apache.commons.math3.util.MathUtils.checkNotNull(java.lang.Object,org.apache.commons.math3.exception.util.Localizable,java.lang.Object...) throws org.apache.commons.math3.exception.NullArgumentException
*checkNotNull(java.lang.Object p0,org.apache.commons.math3.exception.util.Localizable p1,java.lang.Object... p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void checkNotNull(java.lang.Object p0,org.apache.commons.math3.exception.util.Localizable p1,java.lang.Object... p2) throws org.apache.commons.math3.exception.NullArgumentException{
	 org.apache.commons.math3.util.MathUtils.checkNotNull(p0,p1,p2);
}
/**
*{@link com.google.common.base.Preconditions#checkNotNull(T,java.lang.String,long,java.lang.Object)}
*@see com.google.common.base.Preconditions#checkNotNull(T,java.lang.String,long,java.lang.Object)
*<code>public static <T> T com.google.common.base.Preconditions.checkNotNull(T,java.lang.String,long,java.lang.Object)
*checkNotNull(T p0,java.lang.String p1,long p2,java.lang.Object p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> T checkNotNull(T p0,java.lang.String p1,long p2,java.lang.Object p3){
	return com.google.common.base.Preconditions.checkNotNull(p0,p1,p2,p3);
}
/**
*{@link com.google.common.base.Preconditions#checkNotNull(T,java.lang.String,java.lang.Object,char)}
*@see com.google.common.base.Preconditions#checkNotNull(T,java.lang.String,java.lang.Object,char)
*<code>public static <T> T com.google.common.base.Preconditions.checkNotNull(T,java.lang.String,java.lang.Object,char)
*checkNotNull(T p0,java.lang.String p1,java.lang.Object p2,char p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> T checkNotNull(T p0,java.lang.String p1,java.lang.Object p2,char p3){
	return com.google.common.base.Preconditions.checkNotNull(p0,p1,p2,p3);
}
/**
*{@link com.google.common.base.Preconditions#checkNotNull(T,java.lang.String,java.lang.Object,int)}
*@see com.google.common.base.Preconditions#checkNotNull(T,java.lang.String,java.lang.Object,int)
*<code>public static <T> T com.google.common.base.Preconditions.checkNotNull(T,java.lang.String,java.lang.Object,int)
*checkNotNull(T p0,java.lang.String p1,java.lang.Object p2,int p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> T checkNotNull(T p0,java.lang.String p1,java.lang.Object p2,int p3){
	return com.google.common.base.Preconditions.checkNotNull(p0,p1,p2,p3);
}
/**
*{@link com.google.common.base.Preconditions#checkNotNull(T,java.lang.String,long,long)}
*@see com.google.common.base.Preconditions#checkNotNull(T,java.lang.String,long,long)
*<code>public static <T> T com.google.common.base.Preconditions.checkNotNull(T,java.lang.String,long,long)
*checkNotNull(T p0,java.lang.String p1,long p2,long p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> T checkNotNull(T p0,java.lang.String p1,long p2,long p3){
	return com.google.common.base.Preconditions.checkNotNull(p0,p1,p2,p3);
}
/**
*{@link com.google.common.base.Preconditions#checkNotNull(T,java.lang.String,long,int)}
*@see com.google.common.base.Preconditions#checkNotNull(T,java.lang.String,long,int)
*<code>public static <T> T com.google.common.base.Preconditions.checkNotNull(T,java.lang.String,long,int)
*checkNotNull(T p0,java.lang.String p1,long p2,int p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> T checkNotNull(T p0,java.lang.String p1,long p2,int p3){
	return com.google.common.base.Preconditions.checkNotNull(p0,p1,p2,p3);
}
/**
*{@link com.google.common.base.Preconditions#checkNotNull(T,java.lang.String,long,char)}
*@see com.google.common.base.Preconditions#checkNotNull(T,java.lang.String,long,char)
*<code>public static <T> T com.google.common.base.Preconditions.checkNotNull(T,java.lang.String,long,char)
*checkNotNull(T p0,java.lang.String p1,long p2,char p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> T checkNotNull(T p0,java.lang.String p1,long p2,char p3){
	return com.google.common.base.Preconditions.checkNotNull(p0,p1,p2,p3);
}
/**
*{@link com.google.common.base.Preconditions#checkNotNull(T,java.lang.String,int)}
*@see com.google.common.base.Preconditions#checkNotNull(T,java.lang.String,int)
*<code>public static <T> T com.google.common.base.Preconditions.checkNotNull(T,java.lang.String,int)
*checkNotNull(T p0,java.lang.String p1,int p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> T checkNotNull(T p0,java.lang.String p1,int p2){
	return com.google.common.base.Preconditions.checkNotNull(p0,p1,p2);
}
/**
*{@link com.google.common.base.Preconditions#checkNotNull(T,java.lang.String,java.lang.Object,java.lang.Object,java.lang.Object,java.lang.Object)}
*@see com.google.common.base.Preconditions#checkNotNull(T,java.lang.String,java.lang.Object,java.lang.Object,java.lang.Object,java.lang.Object)
*<code>public static <T> T com.google.common.base.Preconditions.checkNotNull(T,java.lang.String,java.lang.Object,java.lang.Object,java.lang.Object,java.lang.Object)
*checkNotNull(T p0,java.lang.String p1,java.lang.Object p2,java.lang.Object p3,java.lang.Object p4,java.lang.Object p5)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> T checkNotNull(T p0,java.lang.String p1,java.lang.Object p2,java.lang.Object p3,java.lang.Object p4,java.lang.Object p5){
	return com.google.common.base.Preconditions.checkNotNull(p0,p1,p2,p3,p4,p5);
}
/**
*{@link com.google.common.base.Preconditions#checkNotNull(T,java.lang.String,java.lang.Object,java.lang.Object,java.lang.Object)}
*@see com.google.common.base.Preconditions#checkNotNull(T,java.lang.String,java.lang.Object,java.lang.Object,java.lang.Object)
*<code>public static <T> T com.google.common.base.Preconditions.checkNotNull(T,java.lang.String,java.lang.Object,java.lang.Object,java.lang.Object)
*checkNotNull(T p0,java.lang.String p1,java.lang.Object p2,java.lang.Object p3,java.lang.Object p4)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> T checkNotNull(T p0,java.lang.String p1,java.lang.Object p2,java.lang.Object p3,java.lang.Object p4){
	return com.google.common.base.Preconditions.checkNotNull(p0,p1,p2,p3,p4);
}
/**
*{@link com.google.common.base.Preconditions#checkNotNull(T,java.lang.String,java.lang.Object,java.lang.Object)}
*@see com.google.common.base.Preconditions#checkNotNull(T,java.lang.String,java.lang.Object,java.lang.Object)
*<code>public static <T> T com.google.common.base.Preconditions.checkNotNull(T,java.lang.String,java.lang.Object,java.lang.Object)
*checkNotNull(T p0,java.lang.String p1,java.lang.Object p2,java.lang.Object p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> T checkNotNull(T p0,java.lang.String p1,java.lang.Object p2,java.lang.Object p3){
	return com.google.common.base.Preconditions.checkNotNull(p0,p1,p2,p3);
}
/**
*{@link com.google.common.base.Preconditions#checkNotNull(T,java.lang.String,java.lang.Object,long)}
*@see com.google.common.base.Preconditions#checkNotNull(T,java.lang.String,java.lang.Object,long)
*<code>public static <T> T com.google.common.base.Preconditions.checkNotNull(T,java.lang.String,java.lang.Object,long)
*checkNotNull(T p0,java.lang.String p1,java.lang.Object p2,long p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> T checkNotNull(T p0,java.lang.String p1,java.lang.Object p2,long p3){
	return com.google.common.base.Preconditions.checkNotNull(p0,p1,p2,p3);
}
/**
*{@link com.google.common.base.Preconditions#checkNotNull(T,java.lang.String,char)}
*@see com.google.common.base.Preconditions#checkNotNull(T,java.lang.String,char)
*<code>public static <T> T com.google.common.base.Preconditions.checkNotNull(T,java.lang.String,char)
*checkNotNull(T p0,java.lang.String p1,char p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> T checkNotNull(T p0,java.lang.String p1,char p2){
	return com.google.common.base.Preconditions.checkNotNull(p0,p1,p2);
}
/**
*{@link com.google.common.base.Preconditions#checkNotNull(T,java.lang.String,long)}
*@see com.google.common.base.Preconditions#checkNotNull(T,java.lang.String,long)
*<code>public static <T> T com.google.common.base.Preconditions.checkNotNull(T,java.lang.String,long)
*checkNotNull(T p0,java.lang.String p1,long p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> T checkNotNull(T p0,java.lang.String p1,long p2){
	return com.google.common.base.Preconditions.checkNotNull(p0,p1,p2);
}
/**
*{@link com.google.common.base.Preconditions#checkNotNull(T,java.lang.String,java.lang.Object)}
*@see com.google.common.base.Preconditions#checkNotNull(T,java.lang.String,java.lang.Object)
*<code>public static <T> T com.google.common.base.Preconditions.checkNotNull(T,java.lang.String,java.lang.Object)
*checkNotNull(T p0,java.lang.String p1,java.lang.Object p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> T checkNotNull(T p0,java.lang.String p1,java.lang.Object p2){
	return com.google.common.base.Preconditions.checkNotNull(p0,p1,p2);
}
/**
*{@link com.google.common.base.Preconditions#checkNotNull(T,java.lang.String,char,char)}
*@see com.google.common.base.Preconditions#checkNotNull(T,java.lang.String,char,char)
*<code>public static <T> T com.google.common.base.Preconditions.checkNotNull(T,java.lang.String,char,char)
*checkNotNull(T p0,java.lang.String p1,char p2,char p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> T checkNotNull(T p0,java.lang.String p1,char p2,char p3){
	return com.google.common.base.Preconditions.checkNotNull(p0,p1,p2,p3);
}
/**
*{@link com.google.common.base.Preconditions#checkNotNull(T,java.lang.String,java.lang.Object...)}
*@see com.google.common.base.Preconditions#checkNotNull(T,java.lang.String,java.lang.Object...)
*<code>public static <T> T com.google.common.base.Preconditions.checkNotNull(T,java.lang.String,java.lang.Object...)
*checkNotNull(T p0,java.lang.String p1,java.lang.Object... p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> T checkNotNull(T p0,java.lang.String p1,java.lang.Object... p2){
	return com.google.common.base.Preconditions.checkNotNull(p0,p1,p2);
}
/**
*{@link com.google.common.base.Preconditions#checkNotNull(T,java.lang.Object)}
*@see com.google.common.base.Preconditions#checkNotNull(T,java.lang.Object)
*<code>public static <T> T com.google.common.base.Preconditions.checkNotNull(T,java.lang.Object)
*checkNotNull(T p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> T checkNotNull(T p0,java.lang.Object p1){
	return com.google.common.base.Preconditions.checkNotNull(p0,p1);
}
/**
*{@link com.google.common.base.Preconditions#checkNotNull(T)}
*@see com.google.common.base.Preconditions#checkNotNull(T)
*<code>public static <T> T com.google.common.base.Preconditions.checkNotNull(T)
*checkNotNull(T p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> T checkNotNull(T p0){
	return com.google.common.base.Preconditions.checkNotNull(p0);
}
/**
*{@link com.google.common.base.Preconditions#checkNotNull(T,java.lang.String,int,char)}
*@see com.google.common.base.Preconditions#checkNotNull(T,java.lang.String,int,char)
*<code>public static <T> T com.google.common.base.Preconditions.checkNotNull(T,java.lang.String,int,char)
*checkNotNull(T p0,java.lang.String p1,int p2,char p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> T checkNotNull(T p0,java.lang.String p1,int p2,char p3){
	return com.google.common.base.Preconditions.checkNotNull(p0,p1,p2,p3);
}
/**
*{@link com.google.common.base.Preconditions#checkNotNull(T,java.lang.String,int,int)}
*@see com.google.common.base.Preconditions#checkNotNull(T,java.lang.String,int,int)
*<code>public static <T> T com.google.common.base.Preconditions.checkNotNull(T,java.lang.String,int,int)
*checkNotNull(T p0,java.lang.String p1,int p2,int p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> T checkNotNull(T p0,java.lang.String p1,int p2,int p3){
	return com.google.common.base.Preconditions.checkNotNull(p0,p1,p2,p3);
}
/**
*{@link com.google.common.base.Preconditions#checkNotNull(T,java.lang.String,int,long)}
*@see com.google.common.base.Preconditions#checkNotNull(T,java.lang.String,int,long)
*<code>public static <T> T com.google.common.base.Preconditions.checkNotNull(T,java.lang.String,int,long)
*checkNotNull(T p0,java.lang.String p1,int p2,long p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> T checkNotNull(T p0,java.lang.String p1,int p2,long p3){
	return com.google.common.base.Preconditions.checkNotNull(p0,p1,p2,p3);
}
/**
*{@link com.google.common.base.Preconditions#checkNotNull(T,java.lang.String,int,java.lang.Object)}
*@see com.google.common.base.Preconditions#checkNotNull(T,java.lang.String,int,java.lang.Object)
*<code>public static <T> T com.google.common.base.Preconditions.checkNotNull(T,java.lang.String,int,java.lang.Object)
*checkNotNull(T p0,java.lang.String p1,int p2,java.lang.Object p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> T checkNotNull(T p0,java.lang.String p1,int p2,java.lang.Object p3){
	return com.google.common.base.Preconditions.checkNotNull(p0,p1,p2,p3);
}
/**
*{@link com.google.common.base.Preconditions#checkNotNull(T,java.lang.String,char,long)}
*@see com.google.common.base.Preconditions#checkNotNull(T,java.lang.String,char,long)
*<code>public static <T> T com.google.common.base.Preconditions.checkNotNull(T,java.lang.String,char,long)
*checkNotNull(T p0,java.lang.String p1,char p2,long p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> T checkNotNull(T p0,java.lang.String p1,char p2,long p3){
	return com.google.common.base.Preconditions.checkNotNull(p0,p1,p2,p3);
}
/**
*{@link com.google.common.base.Preconditions#checkNotNull(T,java.lang.String,char,java.lang.Object)}
*@see com.google.common.base.Preconditions#checkNotNull(T,java.lang.String,char,java.lang.Object)
*<code>public static <T> T com.google.common.base.Preconditions.checkNotNull(T,java.lang.String,char,java.lang.Object)
*checkNotNull(T p0,java.lang.String p1,char p2,java.lang.Object p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> T checkNotNull(T p0,java.lang.String p1,char p2,java.lang.Object p3){
	return com.google.common.base.Preconditions.checkNotNull(p0,p1,p2,p3);
}
/**
*{@link com.google.common.base.Preconditions#checkNotNull(T,java.lang.String,char,int)}
*@see com.google.common.base.Preconditions#checkNotNull(T,java.lang.String,char,int)
*<code>public static <T> T com.google.common.base.Preconditions.checkNotNull(T,java.lang.String,char,int)
*checkNotNull(T p0,java.lang.String p1,char p2,int p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> T checkNotNull(T p0,java.lang.String p1,char p2,int p3){
	return com.google.common.base.Preconditions.checkNotNull(p0,p1,p2,p3);
}
/**
*{@link com.google.common.base.Preconditions#checkState(boolean,java.lang.String,java.lang.Object)}
*@see com.google.common.base.Preconditions#checkState(boolean,java.lang.String,java.lang.Object)
*<code>public static void com.google.common.base.Preconditions.checkState(boolean,java.lang.String,java.lang.Object)
*checkState(boolean p0,java.lang.String p1,java.lang.Object p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void checkState(boolean p0,java.lang.String p1,java.lang.Object p2){
	 com.google.common.base.Preconditions.checkState(p0,p1,p2);
}
/**
*{@link com.google.common.base.Preconditions#checkState(boolean,java.lang.String,char,java.lang.Object)}
*@see com.google.common.base.Preconditions#checkState(boolean,java.lang.String,char,java.lang.Object)
*<code>public static void com.google.common.base.Preconditions.checkState(boolean,java.lang.String,char,java.lang.Object)
*checkState(boolean p0,java.lang.String p1,char p2,java.lang.Object p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void checkState(boolean p0,java.lang.String p1,char p2,java.lang.Object p3){
	 com.google.common.base.Preconditions.checkState(p0,p1,p2,p3);
}
/**
*{@link com.google.common.base.Preconditions#checkState(boolean,java.lang.Object)}
*@see com.google.common.base.Preconditions#checkState(boolean,java.lang.Object)
*<code>public static void com.google.common.base.Preconditions.checkState(boolean,java.lang.Object)
*checkState(boolean p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void checkState(boolean p0,java.lang.Object p1){
	 com.google.common.base.Preconditions.checkState(p0,p1);
}
/**
*{@link com.google.common.base.Preconditions#checkState(boolean,java.lang.String,java.lang.Object,char)}
*@see com.google.common.base.Preconditions#checkState(boolean,java.lang.String,java.lang.Object,char)
*<code>public static void com.google.common.base.Preconditions.checkState(boolean,java.lang.String,java.lang.Object,char)
*checkState(boolean p0,java.lang.String p1,java.lang.Object p2,char p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void checkState(boolean p0,java.lang.String p1,java.lang.Object p2,char p3){
	 com.google.common.base.Preconditions.checkState(p0,p1,p2,p3);
}
/**
*{@link com.google.common.base.Preconditions#checkState(boolean,java.lang.String,java.lang.Object,int)}
*@see com.google.common.base.Preconditions#checkState(boolean,java.lang.String,java.lang.Object,int)
*<code>public static void com.google.common.base.Preconditions.checkState(boolean,java.lang.String,java.lang.Object,int)
*checkState(boolean p0,java.lang.String p1,java.lang.Object p2,int p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void checkState(boolean p0,java.lang.String p1,java.lang.Object p2,int p3){
	 com.google.common.base.Preconditions.checkState(p0,p1,p2,p3);
}
/**
*{@link com.google.common.base.Preconditions#checkState(boolean,java.lang.String,java.lang.Object,long)}
*@see com.google.common.base.Preconditions#checkState(boolean,java.lang.String,java.lang.Object,long)
*<code>public static void com.google.common.base.Preconditions.checkState(boolean,java.lang.String,java.lang.Object,long)
*checkState(boolean p0,java.lang.String p1,java.lang.Object p2,long p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void checkState(boolean p0,java.lang.String p1,java.lang.Object p2,long p3){
	 com.google.common.base.Preconditions.checkState(p0,p1,p2,p3);
}
/**
*{@link com.google.common.base.Preconditions#checkState(boolean,java.lang.String,java.lang.Object,java.lang.Object)}
*@see com.google.common.base.Preconditions#checkState(boolean,java.lang.String,java.lang.Object,java.lang.Object)
*<code>public static void com.google.common.base.Preconditions.checkState(boolean,java.lang.String,java.lang.Object,java.lang.Object)
*checkState(boolean p0,java.lang.String p1,java.lang.Object p2,java.lang.Object p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void checkState(boolean p0,java.lang.String p1,java.lang.Object p2,java.lang.Object p3){
	 com.google.common.base.Preconditions.checkState(p0,p1,p2,p3);
}
/**
*{@link com.google.common.base.Preconditions#checkState(boolean,java.lang.String,java.lang.Object,java.lang.Object,java.lang.Object)}
*@see com.google.common.base.Preconditions#checkState(boolean,java.lang.String,java.lang.Object,java.lang.Object,java.lang.Object)
*<code>public static void com.google.common.base.Preconditions.checkState(boolean,java.lang.String,java.lang.Object,java.lang.Object,java.lang.Object)
*checkState(boolean p0,java.lang.String p1,java.lang.Object p2,java.lang.Object p3,java.lang.Object p4)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void checkState(boolean p0,java.lang.String p1,java.lang.Object p2,java.lang.Object p3,java.lang.Object p4){
	 com.google.common.base.Preconditions.checkState(p0,p1,p2,p3,p4);
}
/**
*{@link com.google.common.base.Preconditions#checkState(boolean,java.lang.String,java.lang.Object,java.lang.Object,java.lang.Object,java.lang.Object)}
*@see com.google.common.base.Preconditions#checkState(boolean,java.lang.String,java.lang.Object,java.lang.Object,java.lang.Object,java.lang.Object)
*<code>public static void com.google.common.base.Preconditions.checkState(boolean,java.lang.String,java.lang.Object,java.lang.Object,java.lang.Object,java.lang.Object)
*checkState(boolean p0,java.lang.String p1,java.lang.Object p2,java.lang.Object p3,java.lang.Object p4,java.lang.Object p5)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void checkState(boolean p0,java.lang.String p1,java.lang.Object p2,java.lang.Object p3,java.lang.Object p4,java.lang.Object p5){
	 com.google.common.base.Preconditions.checkState(p0,p1,p2,p3,p4,p5);
}
/**
*{@link com.google.common.base.Preconditions#checkState(boolean,java.lang.String,int,java.lang.Object)}
*@see com.google.common.base.Preconditions#checkState(boolean,java.lang.String,int,java.lang.Object)
*<code>public static void com.google.common.base.Preconditions.checkState(boolean,java.lang.String,int,java.lang.Object)
*checkState(boolean p0,java.lang.String p1,int p2,java.lang.Object p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void checkState(boolean p0,java.lang.String p1,int p2,java.lang.Object p3){
	 com.google.common.base.Preconditions.checkState(p0,p1,p2,p3);
}
/**
*{@link com.google.common.base.Preconditions#checkState(boolean,java.lang.String,long,java.lang.Object)}
*@see com.google.common.base.Preconditions#checkState(boolean,java.lang.String,long,java.lang.Object)
*<code>public static void com.google.common.base.Preconditions.checkState(boolean,java.lang.String,long,java.lang.Object)
*checkState(boolean p0,java.lang.String p1,long p2,java.lang.Object p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void checkState(boolean p0,java.lang.String p1,long p2,java.lang.Object p3){
	 com.google.common.base.Preconditions.checkState(p0,p1,p2,p3);
}
/**
*{@link org.apache.commons.lang3.ObjectUtils#clone(T)}
*@see org.apache.commons.lang3.ObjectUtils#clone(T)
*<code>public static <T> T org.apache.commons.lang3.ObjectUtils.clone(T)
*clone(T p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> T clone(T p0){
	return org.apache.commons.lang3.ObjectUtils.clone(p0);
}
/**
*{@link org.apache.commons.beanutils.BeanUtils#cloneBean(java.lang.Object)}
*@see org.apache.commons.beanutils.BeanUtils#cloneBean(java.lang.Object)
*<code>public static java.lang.Object org.apache.commons.beanutils.BeanUtils.cloneBean(java.lang.Object) throws java.lang.IllegalAccessException,java.lang.InstantiationException,java.lang.reflect.InvocationTargetException,java.lang.NoSuchMethodException
*cloneBean(java.lang.Object p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.Object cloneBean(java.lang.Object p0) throws java.lang.IllegalAccessException,java.lang.InstantiationException,java.lang.reflect.InvocationTargetException,java.lang.NoSuchMethodException{
	return org.apache.commons.beanutils.BeanUtils.cloneBean(p0);
}
/**
*{@link org.apache.commons.lang3.ObjectUtils#cloneIfPossible(T)}
*@see org.apache.commons.lang3.ObjectUtils#cloneIfPossible(T)
*<code>public static <T> T org.apache.commons.lang3.ObjectUtils.cloneIfPossible(T)
*cloneIfPossible(T p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> T cloneIfPossible(T p0){
	return org.apache.commons.lang3.ObjectUtils.cloneIfPossible(p0);
}
/**
*{@link org.apache.commons.collections.FactoryUtils#constantFactory(java.lang.Object)}
*@see org.apache.commons.collections.FactoryUtils#constantFactory(java.lang.Object)
*<code>public static org.apache.commons.collections.Factory org.apache.commons.collections.FactoryUtils.constantFactory(java.lang.Object)
*constantFactory(java.lang.Object p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.Factory constantFactory(java.lang.Object p0){
	return org.apache.commons.collections.FactoryUtils.constantFactory(p0);
}
/**
*{@link org.apache.commons.collections.TransformerUtils#constantTransformer(java.lang.Object)}
*@see org.apache.commons.collections.TransformerUtils#constantTransformer(java.lang.Object)
*<code>public static org.apache.commons.collections.Transformer org.apache.commons.collections.TransformerUtils.constantTransformer(java.lang.Object)
*constantTransformer(java.lang.Object p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.Transformer constantTransformer(java.lang.Object p0){
	return org.apache.commons.collections.TransformerUtils.constantTransformer(p0);
}
/**
*{@link org.apache.commons.collections4.IteratorUtils#contains(java.util.Iterator<E>,java.lang.Object)}
*@see org.apache.commons.collections4.IteratorUtils#contains(java.util.Iterator<E>,java.lang.Object)
*<code>public static <E> boolean org.apache.commons.collections4.IteratorUtils.contains(java.util.Iterator<E>,java.lang.Object)
*contains(java.util.Iterator<E> p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E> boolean contains(java.util.Iterator<E> p0,java.lang.Object p1){
	return org.apache.commons.collections4.IteratorUtils.contains(p0,p1);
}
/**
*{@link org.apache.commons.collections4.IterableUtils#contains(java.lang.Iterable<E>,java.lang.Object)}
*@see org.apache.commons.collections4.IterableUtils#contains(java.lang.Iterable<E>,java.lang.Object)
*<code>public static <E> boolean org.apache.commons.collections4.IterableUtils.contains(java.lang.Iterable<E>,java.lang.Object)
*contains(java.lang.Iterable<E> p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E> boolean contains(java.lang.Iterable<E> p0,java.lang.Object p1){
	return org.apache.commons.collections4.IterableUtils.contains(p0,p1);
}
/**
*{@link com.google.common.collect.Iterables#contains(java.lang.Iterable<?>,java.lang.Object)}
*@see com.google.common.collect.Iterables#contains(java.lang.Iterable<?>,java.lang.Object)
*<code>public static boolean com.google.common.collect.Iterables.contains(java.lang.Iterable<?>,java.lang.Object)
*contains(java.lang.Iterable<?> p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean contains(java.lang.Iterable<?> p0,java.lang.Object p1){
	return com.google.common.collect.Iterables.contains(p0,p1);
}
/**
*{@link com.google.common.collect.Iterators#contains(java.util.Iterator<?>,java.lang.Object)}
*@see com.google.common.collect.Iterators#contains(java.util.Iterator<?>,java.lang.Object)
*<code>public static boolean com.google.common.collect.Iterators.contains(java.util.Iterator<?>,java.lang.Object)
*contains(java.util.Iterator<?> p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean contains(java.util.Iterator<?> p0,java.lang.Object p1){
	return com.google.common.collect.Iterators.contains(p0,p1);
}
/**
*{@link org.apache.commons.lang3.ArrayUtils#contains(java.lang.Object[],java.lang.Object)}
*@see org.apache.commons.lang3.ArrayUtils#contains(java.lang.Object[],java.lang.Object)
*<code>public static boolean org.apache.commons.lang3.ArrayUtils.contains(java.lang.Object[],java.lang.Object)
*contains(java.lang.Object[] p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean contains(java.lang.Object[] p0,java.lang.Object p1){
	return org.apache.commons.lang3.ArrayUtils.contains(p0,p1);
}
/**
*{@link org.apache.commons.beanutils.ConvertUtils#convert(java.lang.Object)}
*@see org.apache.commons.beanutils.ConvertUtils#convert(java.lang.Object)
*<code>public static java.lang.String org.apache.commons.beanutils.ConvertUtils.convert(java.lang.Object)
*convert(java.lang.Object p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.String convert(java.lang.Object p0){
	return org.apache.commons.beanutils.ConvertUtils.convert(p0);
}
/**
*{@link org.apache.commons.beanutils.ConvertUtils#convert(java.lang.String,java.lang.Class<?>)}
*@see org.apache.commons.beanutils.ConvertUtils#convert(java.lang.String,java.lang.Class<?>)
*<code>public static java.lang.Object org.apache.commons.beanutils.ConvertUtils.convert(java.lang.String,java.lang.Class<?>)
*convert(java.lang.String p0,java.lang.Class<?> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.Object convert(java.lang.String p0,java.lang.Class<?> p1){
	return org.apache.commons.beanutils.ConvertUtils.convert(p0,p1);
}
/**
*{@link org.apache.commons.beanutils.ConvertUtils#convert(java.lang.String[],java.lang.Class<?>)}
*@see org.apache.commons.beanutils.ConvertUtils#convert(java.lang.String[],java.lang.Class<?>)
*<code>public static java.lang.Object org.apache.commons.beanutils.ConvertUtils.convert(java.lang.String[],java.lang.Class<?>)
*convert(java.lang.String[] p0,java.lang.Class<?> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.Object convert(java.lang.String[] p0,java.lang.Class<?> p1){
	return org.apache.commons.beanutils.ConvertUtils.convert(p0,p1);
}
/**
*{@link org.apache.commons.beanutils.ConvertUtils#convert(java.lang.Object,java.lang.Class<?>)}
*@see org.apache.commons.beanutils.ConvertUtils#convert(java.lang.Object,java.lang.Class<?>)
*<code>public static java.lang.Object org.apache.commons.beanutils.ConvertUtils.convert(java.lang.Object,java.lang.Class<?>)
*convert(java.lang.Object p0,java.lang.Class<?> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.Object convert(java.lang.Object p0,java.lang.Class<?> p1){
	return org.apache.commons.beanutils.ConvertUtils.convert(p0,p1);
}
/**
*{@link org.apache.commons.beanutils.locale.LocaleConvertUtils#convert(java.lang.String,java.lang.Class<?>,java.lang.String)}
*@see org.apache.commons.beanutils.locale.LocaleConvertUtils#convert(java.lang.String,java.lang.Class<?>,java.lang.String)
*<code>public static java.lang.Object org.apache.commons.beanutils.locale.LocaleConvertUtils.convert(java.lang.String,java.lang.Class<?>,java.lang.String)
*convert(java.lang.String p0,java.lang.Class<?> p1,java.lang.String p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.Object convert(java.lang.String p0,java.lang.Class<?> p1,java.lang.String p2){
	return org.apache.commons.beanutils.locale.LocaleConvertUtils.convert(p0,p1,p2);
}
/**
*{@link org.apache.commons.beanutils.locale.LocaleConvertUtils#convert(java.lang.String[],java.lang.Class<?>,java.lang.String)}
*@see org.apache.commons.beanutils.locale.LocaleConvertUtils#convert(java.lang.String[],java.lang.Class<?>,java.lang.String)
*<code>public static java.lang.Object org.apache.commons.beanutils.locale.LocaleConvertUtils.convert(java.lang.String[],java.lang.Class<?>,java.lang.String)
*convert(java.lang.String[] p0,java.lang.Class<?> p1,java.lang.String p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.Object convert(java.lang.String[] p0,java.lang.Class<?> p1,java.lang.String p2){
	return org.apache.commons.beanutils.locale.LocaleConvertUtils.convert(p0,p1,p2);
}
/**
*{@link org.apache.commons.beanutils.locale.LocaleConvertUtils#convert(java.lang.String[],java.lang.Class<?>,java.util.Locale,java.lang.String)}
*@see org.apache.commons.beanutils.locale.LocaleConvertUtils#convert(java.lang.String[],java.lang.Class<?>,java.util.Locale,java.lang.String)
*<code>public static java.lang.Object org.apache.commons.beanutils.locale.LocaleConvertUtils.convert(java.lang.String[],java.lang.Class<?>,java.util.Locale,java.lang.String)
*convert(java.lang.String[] p0,java.lang.Class<?> p1,java.util.Locale p2,java.lang.String p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.Object convert(java.lang.String[] p0,java.lang.Class<?> p1,java.util.Locale p2,java.lang.String p3){
	return org.apache.commons.beanutils.locale.LocaleConvertUtils.convert(p0,p1,p2,p3);
}
/**
*{@link org.apache.commons.beanutils.locale.LocaleConvertUtils#convert(java.lang.String,java.lang.Class<?>,java.util.Locale,java.lang.String)}
*@see org.apache.commons.beanutils.locale.LocaleConvertUtils#convert(java.lang.String,java.lang.Class<?>,java.util.Locale,java.lang.String)
*<code>public static java.lang.Object org.apache.commons.beanutils.locale.LocaleConvertUtils.convert(java.lang.String,java.lang.Class<?>,java.util.Locale,java.lang.String)
*convert(java.lang.String p0,java.lang.Class<?> p1,java.util.Locale p2,java.lang.String p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.Object convert(java.lang.String p0,java.lang.Class<?> p1,java.util.Locale p2,java.lang.String p3){
	return org.apache.commons.beanutils.locale.LocaleConvertUtils.convert(p0,p1,p2,p3);
}
/**
*{@link org.apache.commons.beanutils.locale.LocaleConvertUtils#convert(java.lang.Object,java.lang.String)}
*@see org.apache.commons.beanutils.locale.LocaleConvertUtils#convert(java.lang.Object,java.lang.String)
*<code>public static java.lang.String org.apache.commons.beanutils.locale.LocaleConvertUtils.convert(java.lang.Object,java.lang.String)
*convert(java.lang.Object p0,java.lang.String p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.String convert(java.lang.Object p0,java.lang.String p1){
	return org.apache.commons.beanutils.locale.LocaleConvertUtils.convert(p0,p1);
}
/**
*{@link org.apache.commons.beanutils.locale.LocaleConvertUtils#convert(java.lang.Object,java.util.Locale,java.lang.String)}
*@see org.apache.commons.beanutils.locale.LocaleConvertUtils#convert(java.lang.Object,java.util.Locale,java.lang.String)
*<code>public static java.lang.String org.apache.commons.beanutils.locale.LocaleConvertUtils.convert(java.lang.Object,java.util.Locale,java.lang.String)
*convert(java.lang.Object p0,java.util.Locale p1,java.lang.String p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.String convert(java.lang.Object p0,java.util.Locale p1,java.lang.String p2){
	return org.apache.commons.beanutils.locale.LocaleConvertUtils.convert(p0,p1,p2);
}
/**
*{@link org.apache.commons.beanutils.BeanUtils#copyProperties(java.lang.Object,java.lang.Object)}
*@see org.apache.commons.beanutils.BeanUtils#copyProperties(java.lang.Object,java.lang.Object)
*<code>public static void org.apache.commons.beanutils.BeanUtils.copyProperties(java.lang.Object,java.lang.Object) throws java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException
*copyProperties(java.lang.Object p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void copyProperties(java.lang.Object p0,java.lang.Object p1) throws java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException{
	 org.apache.commons.beanutils.BeanUtils.copyProperties(p0,p1);
}
/**
*{@link org.apache.commons.beanutils.BeanUtils#copyProperty(java.lang.Object,java.lang.String,java.lang.Object)}
*@see org.apache.commons.beanutils.BeanUtils#copyProperty(java.lang.Object,java.lang.String,java.lang.Object)
*<code>public static void org.apache.commons.beanutils.BeanUtils.copyProperty(java.lang.Object,java.lang.String,java.lang.Object) throws java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException
*copyProperty(java.lang.Object p0,java.lang.String p1,java.lang.Object p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void copyProperty(java.lang.Object p0,java.lang.String p1,java.lang.Object p2) throws java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException{
	 org.apache.commons.beanutils.BeanUtils.copyProperty(p0,p1,p2);
}
/**
*{@link org.apache.commons.lang3.concurrent.ConcurrentUtils#createIfAbsent(java.util.concurrent.ConcurrentMap<K, V>,K,org.apache.commons.lang3.concurrent.ConcurrentInitializer<V>)}
*@see org.apache.commons.lang3.concurrent.ConcurrentUtils#createIfAbsent(java.util.concurrent.ConcurrentMap<K, V>,K,org.apache.commons.lang3.concurrent.ConcurrentInitializer<V>)
*<code>public static <K,V> V org.apache.commons.lang3.concurrent.ConcurrentUtils.createIfAbsent(java.util.concurrent.ConcurrentMap<K, V>,K,org.apache.commons.lang3.concurrent.ConcurrentInitializer<V>) throws org.apache.commons.lang3.concurrent.ConcurrentException
*createIfAbsent(java.util.concurrent.ConcurrentMap<K, V> p0,K p1,org.apache.commons.lang3.concurrent.ConcurrentInitializer<V> p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K,V> V createIfAbsent(java.util.concurrent.ConcurrentMap<K, V> p0,K p1,org.apache.commons.lang3.concurrent.ConcurrentInitializer<V> p2) throws org.apache.commons.lang3.concurrent.ConcurrentException{
	return org.apache.commons.lang3.concurrent.ConcurrentUtils.createIfAbsent(p0,p1,p2);
}
/**
*{@link org.apache.commons.lang3.concurrent.ConcurrentUtils#createIfAbsentUnchecked(java.util.concurrent.ConcurrentMap<K, V>,K,org.apache.commons.lang3.concurrent.ConcurrentInitializer<V>)}
*@see org.apache.commons.lang3.concurrent.ConcurrentUtils#createIfAbsentUnchecked(java.util.concurrent.ConcurrentMap<K, V>,K,org.apache.commons.lang3.concurrent.ConcurrentInitializer<V>)
*<code>public static <K,V> V org.apache.commons.lang3.concurrent.ConcurrentUtils.createIfAbsentUnchecked(java.util.concurrent.ConcurrentMap<K, V>,K,org.apache.commons.lang3.concurrent.ConcurrentInitializer<V>)
*createIfAbsentUnchecked(java.util.concurrent.ConcurrentMap<K, V> p0,K p1,org.apache.commons.lang3.concurrent.ConcurrentInitializer<V> p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K,V> V createIfAbsentUnchecked(java.util.concurrent.ConcurrentMap<K, V> p0,K p1,org.apache.commons.lang3.concurrent.ConcurrentInitializer<V> p2){
	return org.apache.commons.lang3.concurrent.ConcurrentUtils.createIfAbsentUnchecked(p0,p1,p2);
}
/**
*{@link org.apache.commons.collections4.MapUtils#debugPrint(java.io.PrintStream,java.lang.Object,java.util.Map<?, ?>)}
*@see org.apache.commons.collections4.MapUtils#debugPrint(java.io.PrintStream,java.lang.Object,java.util.Map<?, ?>)
*<code>public static void org.apache.commons.collections4.MapUtils.debugPrint(java.io.PrintStream,java.lang.Object,java.util.Map<?, ?>)
*debugPrint(java.io.PrintStream p0,java.lang.Object p1,java.util.Map<?, ?> p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void debugPrint(java.io.PrintStream p0,java.lang.Object p1,java.util.Map<?, ?> p2){
	 org.apache.commons.collections4.MapUtils.debugPrint(p0,p1,p2);
}
/**
*{@link org.apache.commons.collections.MapUtils#debugPrint(java.io.PrintStream,java.lang.Object,java.util.Map)}
*@see org.apache.commons.collections.MapUtils#debugPrint(java.io.PrintStream,java.lang.Object,java.util.Map)
*<code>public static void org.apache.commons.collections.MapUtils.debugPrint(java.io.PrintStream,java.lang.Object,java.util.Map)
*debugPrint(java.io.PrintStream p0,java.lang.Object p1,java.util.Map p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void debugPrint(java.io.PrintStream p0,java.lang.Object p1,java.util.Map p2){
	 org.apache.commons.collections.MapUtils.debugPrint(p0,p1,p2);
}
/**
*{@link org.apache.commons.collections.map.DefaultedMap#decorate(java.util.Map,java.lang.Object)}
*@see org.apache.commons.collections.map.DefaultedMap#decorate(java.util.Map,java.lang.Object)
*<code>public static java.util.Map org.apache.commons.collections.map.DefaultedMap.decorate(java.util.Map,java.lang.Object)
*decorate(java.util.Map p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Map decorate(java.util.Map p0,java.lang.Object p1){
	return org.apache.commons.collections.map.DefaultedMap.decorate(p0,p1);
}
/**
*{@link org.apache.commons.lang3.ObjectUtils#defaultIfNull(T,T)}
*@see org.apache.commons.lang3.ObjectUtils#defaultIfNull(T,T)
*<code>public static <T> T org.apache.commons.lang3.ObjectUtils.defaultIfNull(T,T)
*defaultIfNull(T p0,T p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> T defaultIfNull(T p0,T p1){
	return org.apache.commons.lang3.ObjectUtils.defaultIfNull(p0,p1);
}
/**
*{@link org.codehaus.plexus.util.StringUtils#defaultString(java.lang.Object,java.lang.String)}
*@see org.codehaus.plexus.util.StringUtils#defaultString(java.lang.Object,java.lang.String)
*<code>public static java.lang.String org.codehaus.plexus.util.StringUtils.defaultString(java.lang.Object,java.lang.String)
*defaultString(java.lang.Object p0,java.lang.String p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.String defaultString(java.lang.Object p0,java.lang.String p1){
	return org.codehaus.plexus.util.StringUtils.defaultString(p0,p1);
}
/**
*{@link org.codehaus.plexus.util.StringUtils#defaultString(java.lang.Object)}
*@see org.codehaus.plexus.util.StringUtils#defaultString(java.lang.Object)
*<code>public static java.lang.String org.codehaus.plexus.util.StringUtils.defaultString(java.lang.Object)
*defaultString(java.lang.Object p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.String defaultString(java.lang.Object p0){
	return org.codehaus.plexus.util.StringUtils.defaultString(p0);
}
/**
*{@link com.google.common.base.Defaults#defaultValue(java.lang.Class<T>)}
*@see com.google.common.base.Defaults#defaultValue(java.lang.Class<T>)
*<code>public static <T> T com.google.common.base.Defaults.defaultValue(java.lang.Class<T>)
*defaultValue(java.lang.Class<T> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> T defaultValue(java.lang.Class<T> p0){
	return com.google.common.base.Defaults.defaultValue(p0);
}
/**
*{@link org.apache.commons.beanutils.BeanUtils#describe(java.lang.Object)}
*@see org.apache.commons.beanutils.BeanUtils#describe(java.lang.Object)
*<code>public static java.util.Map<java.lang.String, java.lang.String> org.apache.commons.beanutils.BeanUtils.describe(java.lang.Object) throws java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException,java.lang.NoSuchMethodException
*describe(java.lang.Object p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Map<java.lang.String, java.lang.String> describe(java.lang.Object p0) throws java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException,java.lang.NoSuchMethodException{
	return org.apache.commons.beanutils.BeanUtils.describe(p0);
}
/**
*{@link org.apache.commons.lang3.SerializationUtils#deserialize(java.io.InputStream)}
*@see org.apache.commons.lang3.SerializationUtils#deserialize(java.io.InputStream)
*<code>public static <T> T org.apache.commons.lang3.SerializationUtils.deserialize(java.io.InputStream)
*deserialize(java.io.InputStream p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> T deserialize(java.io.InputStream p0){
	return org.apache.commons.lang3.SerializationUtils.deserialize(p0);
}
/**
*{@link org.apache.commons.lang3.SerializationUtils#deserialize(byte...)}
*@see org.apache.commons.lang3.SerializationUtils#deserialize(byte...)
*<code>public static <T> T org.apache.commons.lang3.SerializationUtils.deserialize(byte[])
*deserialize(byte... p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> T deserialize(byte... p0){
	return org.apache.commons.lang3.SerializationUtils.deserialize(p0);
}
/**
*{@link com.facebook.util.serialization.SerDeUtils#deserializeFromByteBuffer(java.nio.ByteBuffer,com.facebook.util.serialization.Deserializer<T>)}
*@see com.facebook.util.serialization.SerDeUtils#deserializeFromByteBuffer(java.nio.ByteBuffer,com.facebook.util.serialization.Deserializer<T>)
*<code>public static <T> T com.facebook.util.serialization.SerDeUtils.deserializeFromByteBuffer(java.nio.ByteBuffer,com.facebook.util.serialization.Deserializer<T>) throws com.facebook.util.serialization.SerDeException
*deserializeFromByteBuffer(java.nio.ByteBuffer p0,com.facebook.util.serialization.Deserializer<T> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> T deserializeFromByteBuffer(java.nio.ByteBuffer p0,com.facebook.util.serialization.Deserializer<T> p1) throws com.facebook.util.serialization.SerDeException{
	return com.facebook.util.serialization.SerDeUtils.deserializeFromByteBuffer(p0,p1);
}
/**
*{@link com.facebook.util.serialization.SerDeUtils#deserializeFromBytes(byte[],com.facebook.util.serialization.Deserializer<T>)}
*@see com.facebook.util.serialization.SerDeUtils#deserializeFromBytes(byte[],com.facebook.util.serialization.Deserializer<T>)
*<code>public static <T> T com.facebook.util.serialization.SerDeUtils.deserializeFromBytes(byte[],com.facebook.util.serialization.Deserializer<T>) throws com.facebook.util.serialization.SerDeException
*deserializeFromBytes(byte[] p0,com.facebook.util.serialization.Deserializer<T> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> T deserializeFromBytes(byte[] p0,com.facebook.util.serialization.Deserializer<T> p1) throws com.facebook.util.serialization.SerDeException{
	return com.facebook.util.serialization.SerDeUtils.deserializeFromBytes(p0,p1);
}
/**
*{@link org.apache.commons.math3.linear.MatrixUtils#deserializeRealMatrix(java.lang.Object,java.lang.String,java.io.ObjectInputStream)}
*@see org.apache.commons.math3.linear.MatrixUtils#deserializeRealMatrix(java.lang.Object,java.lang.String,java.io.ObjectInputStream)
*<code>public static void org.apache.commons.math3.linear.MatrixUtils.deserializeRealMatrix(java.lang.Object,java.lang.String,java.io.ObjectInputStream) throws java.lang.ClassNotFoundException,java.io.IOException
*deserializeRealMatrix(java.lang.Object p0,java.lang.String p1,java.io.ObjectInputStream p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void deserializeRealMatrix(java.lang.Object p0,java.lang.String p1,java.io.ObjectInputStream p2) throws java.lang.ClassNotFoundException,java.io.IOException{
	 org.apache.commons.math3.linear.MatrixUtils.deserializeRealMatrix(p0,p1,p2);
}
/**
*{@link org.apache.commons.math3.linear.MatrixUtils#deserializeRealVector(java.lang.Object,java.lang.String,java.io.ObjectInputStream)}
*@see org.apache.commons.math3.linear.MatrixUtils#deserializeRealVector(java.lang.Object,java.lang.String,java.io.ObjectInputStream)
*<code>public static void org.apache.commons.math3.linear.MatrixUtils.deserializeRealVector(java.lang.Object,java.lang.String,java.io.ObjectInputStream) throws java.lang.ClassNotFoundException,java.io.IOException
*deserializeRealVector(java.lang.Object p0,java.lang.String p1,java.io.ObjectInputStream p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void deserializeRealVector(java.lang.Object p0,java.lang.String p1,java.io.ObjectInputStream p2) throws java.lang.ClassNotFoundException,java.io.IOException{
	 org.apache.commons.math3.linear.MatrixUtils.deserializeRealVector(p0,p1,p2);
}
/**
*{@link org.apache.commons.collections.PredicateUtils#equalPredicate(java.lang.Object)}
*@see org.apache.commons.collections.PredicateUtils#equalPredicate(java.lang.Object)
*<code>public static org.apache.commons.collections.Predicate org.apache.commons.collections.PredicateUtils.equalPredicate(java.lang.Object)
*equalPredicate(java.lang.Object p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.Predicate equalPredicate(java.lang.Object p0){
	return org.apache.commons.collections.PredicateUtils.equalPredicate(p0);
}
/**
*{@link org.codehaus.plexus.util.introspection.ReflectionValueExtractor#evaluate(java.lang.String,java.lang.Object)}
*@see org.codehaus.plexus.util.introspection.ReflectionValueExtractor#evaluate(java.lang.String,java.lang.Object)
*<code>public static java.lang.Object org.codehaus.plexus.util.introspection.ReflectionValueExtractor.evaluate(java.lang.String,java.lang.Object) throws java.lang.Exception
*evaluate(java.lang.String p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.Object evaluate(java.lang.String p0,java.lang.Object p1) throws java.lang.Exception{
	return org.codehaus.plexus.util.introspection.ReflectionValueExtractor.evaluate(p0,p1);
}
/**
*{@link org.codehaus.plexus.util.introspection.ReflectionValueExtractor#evaluate(java.lang.String,java.lang.Object,boolean)}
*@see org.codehaus.plexus.util.introspection.ReflectionValueExtractor#evaluate(java.lang.String,java.lang.Object,boolean)
*<code>public static java.lang.Object org.codehaus.plexus.util.introspection.ReflectionValueExtractor.evaluate(java.lang.String,java.lang.Object,boolean) throws java.lang.Exception
*evaluate(java.lang.String p0,java.lang.Object p1,boolean p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.Object evaluate(java.lang.String p0,java.lang.Object p1,boolean p2) throws java.lang.Exception{
	return org.codehaus.plexus.util.introspection.ReflectionValueExtractor.evaluate(p0,p1,p2);
}
/**
*{@link org.apache.commons.collections4.CollectionUtils#extractSingleton(java.util.Collection<E>)}
*@see org.apache.commons.collections4.CollectionUtils#extractSingleton(java.util.Collection<E>)
*<code>public static <E> E org.apache.commons.collections4.CollectionUtils.extractSingleton(java.util.Collection<E>)
*extractSingleton(java.util.Collection<E> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E> E extractSingleton(java.util.Collection<E> p0){
	return org.apache.commons.collections4.CollectionUtils.extractSingleton(p0);
}
/**
*{@link org.apache.commons.collections4.CollectionUtils#find(java.lang.Iterable<T>,org.apache.commons.collections4.Predicate<? super T>)}
*@see org.apache.commons.collections4.CollectionUtils#find(java.lang.Iterable<T>,org.apache.commons.collections4.Predicate<? super T>)
*<code>public static <T> T org.apache.commons.collections4.CollectionUtils.find(java.lang.Iterable<T>,org.apache.commons.collections4.Predicate<? super T>)
*find(java.lang.Iterable<T> p0,org.apache.commons.collections4.Predicate<? super T> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> T find(java.lang.Iterable<T> p0,org.apache.commons.collections4.Predicate<? super T> p1){
	return org.apache.commons.collections4.CollectionUtils.find(p0,p1);
}
/**
*{@link org.apache.commons.collections4.IteratorUtils#find(java.util.Iterator<E>,org.apache.commons.collections4.Predicate<? super E>)}
*@see org.apache.commons.collections4.IteratorUtils#find(java.util.Iterator<E>,org.apache.commons.collections4.Predicate<? super E>)
*<code>public static <E> E org.apache.commons.collections4.IteratorUtils.find(java.util.Iterator<E>,org.apache.commons.collections4.Predicate<? super E>)
*find(java.util.Iterator<E> p0,org.apache.commons.collections4.Predicate<? super E> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E> E find(java.util.Iterator<E> p0,org.apache.commons.collections4.Predicate<? super E> p1){
	return org.apache.commons.collections4.IteratorUtils.find(p0,p1);
}
/**
*{@link org.apache.commons.collections4.IterableUtils#find(java.lang.Iterable<E>,org.apache.commons.collections4.Predicate<? super E>)}
*@see org.apache.commons.collections4.IterableUtils#find(java.lang.Iterable<E>,org.apache.commons.collections4.Predicate<? super E>)
*<code>public static <E> E org.apache.commons.collections4.IterableUtils.find(java.lang.Iterable<E>,org.apache.commons.collections4.Predicate<? super E>)
*find(java.lang.Iterable<E> p0,org.apache.commons.collections4.Predicate<? super E> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E> E find(java.lang.Iterable<E> p0,org.apache.commons.collections4.Predicate<? super E> p1){
	return org.apache.commons.collections4.IterableUtils.find(p0,p1);
}
/**
*{@link org.apache.commons.collections.CollectionUtils#find(java.util.Collection,org.apache.commons.collections.Predicate)}
*@see org.apache.commons.collections.CollectionUtils#find(java.util.Collection,org.apache.commons.collections.Predicate)
*<code>public static java.lang.Object org.apache.commons.collections.CollectionUtils.find(java.util.Collection,org.apache.commons.collections.Predicate)
*find(java.util.Collection p0,org.apache.commons.collections.Predicate p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.Object find(java.util.Collection p0,org.apache.commons.collections.Predicate p1){
	return org.apache.commons.collections.CollectionUtils.find(p0,p1);
}
/**
*{@link com.google.common.collect.Iterables#find(java.lang.Iterable<? extends T>,com.google.common.base.Predicate<? super T>,T)}
*@see com.google.common.collect.Iterables#find(java.lang.Iterable<? extends T>,com.google.common.base.Predicate<? super T>,T)
*<code>public static <T> T com.google.common.collect.Iterables.find(java.lang.Iterable<? extends T>,com.google.common.base.Predicate<? super T>,T)
*find(java.lang.Iterable<? extends T> p0,com.google.common.base.Predicate<? super T> p1,T p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> T find(java.lang.Iterable<? extends T> p0,com.google.common.base.Predicate<? super T> p1,T p2){
	return com.google.common.collect.Iterables.find(p0,p1,p2);
}
/**
*{@link com.google.common.collect.Iterables#find(java.lang.Iterable<T>,com.google.common.base.Predicate<? super T>)}
*@see com.google.common.collect.Iterables#find(java.lang.Iterable<T>,com.google.common.base.Predicate<? super T>)
*<code>public static <T> T com.google.common.collect.Iterables.find(java.lang.Iterable<T>,com.google.common.base.Predicate<? super T>)
*find(java.lang.Iterable<T> p0,com.google.common.base.Predicate<? super T> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> T find(java.lang.Iterable<T> p0,com.google.common.base.Predicate<? super T> p1){
	return com.google.common.collect.Iterables.find(p0,p1);
}
/**
*{@link com.google.common.collect.Iterators#find(java.util.Iterator<? extends T>,com.google.common.base.Predicate<? super T>,T)}
*@see com.google.common.collect.Iterators#find(java.util.Iterator<? extends T>,com.google.common.base.Predicate<? super T>,T)
*<code>public static <T> T com.google.common.collect.Iterators.find(java.util.Iterator<? extends T>,com.google.common.base.Predicate<? super T>,T)
*find(java.util.Iterator<? extends T> p0,com.google.common.base.Predicate<? super T> p1,T p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> T find(java.util.Iterator<? extends T> p0,com.google.common.base.Predicate<? super T> p1,T p2){
	return com.google.common.collect.Iterators.find(p0,p1,p2);
}
/**
*{@link com.google.common.collect.Iterators#find(java.util.Iterator<T>,com.google.common.base.Predicate<? super T>)}
*@see com.google.common.collect.Iterators#find(java.util.Iterator<T>,com.google.common.base.Predicate<? super T>)
*<code>public static <T> T com.google.common.collect.Iterators.find(java.util.Iterator<T>,com.google.common.base.Predicate<? super T>)
*find(java.util.Iterator<T> p0,com.google.common.base.Predicate<? super T> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> T find(java.util.Iterator<T> p0,com.google.common.base.Predicate<? super T> p1){
	return com.google.common.collect.Iterators.find(p0,p1);
}
/**
*{@link org.apache.commons.collections4.IteratorUtils#first(java.util.Iterator<E>)}
*@see org.apache.commons.collections4.IteratorUtils#first(java.util.Iterator<E>)
*<code>public static <E> E org.apache.commons.collections4.IteratorUtils.first(java.util.Iterator<E>)
*first(java.util.Iterator<E> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E> E first(java.util.Iterator<E> p0){
	return org.apache.commons.collections4.IteratorUtils.first(p0);
}
/**
*{@link org.apache.commons.collections4.IterableUtils#first(java.lang.Iterable<T>)}
*@see org.apache.commons.collections4.IterableUtils#first(java.lang.Iterable<T>)
*<code>public static <T> T org.apache.commons.collections4.IterableUtils.first(java.lang.Iterable<T>)
*first(java.lang.Iterable<T> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> T first(java.lang.Iterable<T> p0){
	return org.apache.commons.collections4.IterableUtils.first(p0);
}
/**
*{@link com.google.common.base.MoreObjects#firstNonNull(T,T)}
*@see com.google.common.base.MoreObjects#firstNonNull(T,T)
*<code>public static <T> T com.google.common.base.MoreObjects.firstNonNull(T,T)
*firstNonNull(T p0,T p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> T firstNonNull(T p0,T p1){
	return com.google.common.base.MoreObjects.firstNonNull(p0,p1);
}
/**
*{@link org.apache.commons.lang3.ObjectUtils#firstNonNull(T...)}
*@see org.apache.commons.lang3.ObjectUtils#firstNonNull(T...)
*<code>public static <T> T org.apache.commons.lang3.ObjectUtils.firstNonNull(T...)
*firstNonNull(T... p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> T firstNonNull(T... p0){
	return org.apache.commons.lang3.ObjectUtils.firstNonNull(p0);
}
/**
*{@link org.apache.commons.collections4.CollectionUtils#forAllButLastDo(java.lang.Iterable<T>,C)}
*@see org.apache.commons.collections4.CollectionUtils#forAllButLastDo(java.lang.Iterable<T>,C)
*<code>public static <T,C> T org.apache.commons.collections4.CollectionUtils.forAllButLastDo(java.lang.Iterable<T>,C)
*forAllButLastDo(java.lang.Iterable<T> p0,C p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T,C extends org.apache.commons.collections4.Closure<? super T> > T forAllButLastDo(java.lang.Iterable<T> p0,C p1){
	return org.apache.commons.collections4.CollectionUtils.forAllButLastDo(p0,p1);
}
/**
*{@link org.apache.commons.collections4.CollectionUtils#forAllButLastDo(java.util.Iterator<T>,C)}
*@see org.apache.commons.collections4.CollectionUtils#forAllButLastDo(java.util.Iterator<T>,C)
*<code>public static <T,C> T org.apache.commons.collections4.CollectionUtils.forAllButLastDo(java.util.Iterator<T>,C)
*forAllButLastDo(java.util.Iterator<T> p0,C p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T,C extends org.apache.commons.collections4.Closure<? super T> > T forAllButLastDo(java.util.Iterator<T> p0,C p1){
	return org.apache.commons.collections4.CollectionUtils.forAllButLastDo(p0,p1);
}
/**
*{@link org.apache.commons.collections4.IteratorUtils#forEachButLast(java.util.Iterator<E>,org.apache.commons.collections4.Closure<? super E>)}
*@see org.apache.commons.collections4.IteratorUtils#forEachButLast(java.util.Iterator<E>,org.apache.commons.collections4.Closure<? super E>)
*<code>public static <E> E org.apache.commons.collections4.IteratorUtils.forEachButLast(java.util.Iterator<E>,org.apache.commons.collections4.Closure<? super E>)
*forEachButLast(java.util.Iterator<E> p0,org.apache.commons.collections4.Closure<? super E> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E> E forEachButLast(java.util.Iterator<E> p0,org.apache.commons.collections4.Closure<? super E> p1){
	return org.apache.commons.collections4.IteratorUtils.forEachButLast(p0,p1);
}
/**
*{@link org.apache.commons.collections4.IterableUtils#forEachButLast(java.lang.Iterable<E>,org.apache.commons.collections4.Closure<? super E>)}
*@see org.apache.commons.collections4.IterableUtils#forEachButLast(java.lang.Iterable<E>,org.apache.commons.collections4.Closure<? super E>)
*<code>public static <E> E org.apache.commons.collections4.IterableUtils.forEachButLast(java.lang.Iterable<E>,org.apache.commons.collections4.Closure<? super E>)
*forEachButLast(java.lang.Iterable<E> p0,org.apache.commons.collections4.Closure<? super E> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E> E forEachButLast(java.lang.Iterable<E> p0,org.apache.commons.collections4.Closure<? super E> p1){
	return org.apache.commons.collections4.IterableUtils.forEachButLast(p0,p1);
}
/**
*{@link com.google.common.collect.Iterables#frequency(java.lang.Iterable<?>,java.lang.Object)}
*@see com.google.common.collect.Iterables#frequency(java.lang.Iterable<?>,java.lang.Object)
*<code>public static int com.google.common.collect.Iterables.frequency(java.lang.Iterable<?>,java.lang.Object)
*frequency(java.lang.Iterable<?> p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int frequency(java.lang.Iterable<?> p0,java.lang.Object p1){
	return com.google.common.collect.Iterables.frequency(p0,p1);
}
/**
*{@link com.google.common.collect.Iterators#frequency(java.util.Iterator<?>,java.lang.Object)}
*@see com.google.common.collect.Iterators#frequency(java.util.Iterator<?>,java.lang.Object)
*<code>public static int com.google.common.collect.Iterators.frequency(java.util.Iterator<?>,java.lang.Object)
*frequency(java.util.Iterator<?> p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int frequency(java.util.Iterator<?> p0,java.lang.Object p1){
	return com.google.common.collect.Iterators.frequency(p0,p1);
}
/**
*{@link org.apache.commons.beanutils.BeanUtils#getArrayProperty(java.lang.Object,java.lang.String)}
*@see org.apache.commons.beanutils.BeanUtils#getArrayProperty(java.lang.Object,java.lang.String)
*<code>public static java.lang.String[] org.apache.commons.beanutils.BeanUtils.getArrayProperty(java.lang.Object,java.lang.String) throws java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException,java.lang.NoSuchMethodException
*getArrayProperty(java.lang.Object p0,java.lang.String p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.String[] getArrayProperty(java.lang.Object p0,java.lang.String p1) throws java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException,java.lang.NoSuchMethodException{
	return org.apache.commons.beanutils.BeanUtils.getArrayProperty(p0,p1);
}
/**
*{@link org.apache.commons.collections.MapUtils#getBoolean(java.util.Map,java.lang.Object,java.lang.Boolean)}
*@see org.apache.commons.collections.MapUtils#getBoolean(java.util.Map,java.lang.Object,java.lang.Boolean)
*<code>public static java.lang.Boolean org.apache.commons.collections.MapUtils.getBoolean(java.util.Map,java.lang.Object,java.lang.Boolean)
*getBoolean(java.util.Map p0,java.lang.Object p1,java.lang.Boolean p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.Boolean getBoolean(java.util.Map p0,java.lang.Object p1,java.lang.Boolean p2){
	return org.apache.commons.collections.MapUtils.getBoolean(p0,p1,p2);
}
/**
*{@link org.apache.commons.collections.MapUtils#getBoolean(java.util.Map,java.lang.Object)}
*@see org.apache.commons.collections.MapUtils#getBoolean(java.util.Map,java.lang.Object)
*<code>public static java.lang.Boolean org.apache.commons.collections.MapUtils.getBoolean(java.util.Map,java.lang.Object)
*getBoolean(java.util.Map p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.Boolean getBoolean(java.util.Map p0,java.lang.Object p1){
	return org.apache.commons.collections.MapUtils.getBoolean(p0,p1);
}
/**
*{@link org.apache.commons.collections.MapUtils#getBooleanValue(java.util.Map,java.lang.Object,boolean)}
*@see org.apache.commons.collections.MapUtils#getBooleanValue(java.util.Map,java.lang.Object,boolean)
*<code>public static boolean org.apache.commons.collections.MapUtils.getBooleanValue(java.util.Map,java.lang.Object,boolean)
*getBooleanValue(java.util.Map p0,java.lang.Object p1,boolean p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean getBooleanValue(java.util.Map p0,java.lang.Object p1,boolean p2){
	return org.apache.commons.collections.MapUtils.getBooleanValue(p0,p1,p2);
}
/**
*{@link org.apache.commons.collections.MapUtils#getBooleanValue(java.util.Map,java.lang.Object)}
*@see org.apache.commons.collections.MapUtils#getBooleanValue(java.util.Map,java.lang.Object)
*<code>public static boolean org.apache.commons.collections.MapUtils.getBooleanValue(java.util.Map,java.lang.Object)
*getBooleanValue(java.util.Map p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean getBooleanValue(java.util.Map p0,java.lang.Object p1){
	return org.apache.commons.collections.MapUtils.getBooleanValue(p0,p1);
}
/**
*{@link org.apache.commons.collections.MapUtils#getByte(java.util.Map,java.lang.Object,java.lang.Byte)}
*@see org.apache.commons.collections.MapUtils#getByte(java.util.Map,java.lang.Object,java.lang.Byte)
*<code>public static java.lang.Byte org.apache.commons.collections.MapUtils.getByte(java.util.Map,java.lang.Object,java.lang.Byte)
*getByte(java.util.Map p0,java.lang.Object p1,java.lang.Byte p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.Byte getByte(java.util.Map p0,java.lang.Object p1,java.lang.Byte p2){
	return org.apache.commons.collections.MapUtils.getByte(p0,p1,p2);
}
/**
*{@link org.apache.commons.collections.MapUtils#getByte(java.util.Map,java.lang.Object)}
*@see org.apache.commons.collections.MapUtils#getByte(java.util.Map,java.lang.Object)
*<code>public static java.lang.Byte org.apache.commons.collections.MapUtils.getByte(java.util.Map,java.lang.Object)
*getByte(java.util.Map p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.Byte getByte(java.util.Map p0,java.lang.Object p1){
	return org.apache.commons.collections.MapUtils.getByte(p0,p1);
}
/**
*{@link org.apache.commons.collections.MapUtils#getByteValue(java.util.Map,java.lang.Object,byte)}
*@see org.apache.commons.collections.MapUtils#getByteValue(java.util.Map,java.lang.Object,byte)
*<code>public static byte org.apache.commons.collections.MapUtils.getByteValue(java.util.Map,java.lang.Object,byte)
*getByteValue(java.util.Map p0,java.lang.Object p1,byte p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static byte getByteValue(java.util.Map p0,java.lang.Object p1,byte p2){
	return org.apache.commons.collections.MapUtils.getByteValue(p0,p1,p2);
}
/**
*{@link org.apache.commons.collections.MapUtils#getByteValue(java.util.Map,java.lang.Object)}
*@see org.apache.commons.collections.MapUtils#getByteValue(java.util.Map,java.lang.Object)
*<code>public static byte org.apache.commons.collections.MapUtils.getByteValue(java.util.Map,java.lang.Object)
*getByteValue(java.util.Map p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static byte getByteValue(java.util.Map p0,java.lang.Object p1){
	return org.apache.commons.collections.MapUtils.getByteValue(p0,p1);
}
/**
*{@link org.apache.commons.lang3.ClassUtils#getCanonicalName(java.lang.Object)}
*@see org.apache.commons.lang3.ClassUtils#getCanonicalName(java.lang.Object)
*<code>public static java.lang.String org.apache.commons.lang3.ClassUtils.getCanonicalName(java.lang.Object)
*getCanonicalName(java.lang.Object p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.String getCanonicalName(java.lang.Object p0){
	return org.apache.commons.lang3.ClassUtils.getCanonicalName(p0);
}
/**
*{@link org.apache.commons.lang3.ClassUtils#getCanonicalName(java.lang.Object,java.lang.String)}
*@see org.apache.commons.lang3.ClassUtils#getCanonicalName(java.lang.Object,java.lang.String)
*<code>public static java.lang.String org.apache.commons.lang3.ClassUtils.getCanonicalName(java.lang.Object,java.lang.String)
*getCanonicalName(java.lang.Object p0,java.lang.String p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.String getCanonicalName(java.lang.Object p0,java.lang.String p1){
	return org.apache.commons.lang3.ClassUtils.getCanonicalName(p0,p1);
}
/**
*{@link com.google.common.util.concurrent.Futures#getChecked(java.util.concurrent.Future<V>,java.lang.Class<X>,long,java.util.concurrent.TimeUnit)}
*@see com.google.common.util.concurrent.Futures#getChecked(java.util.concurrent.Future<V>,java.lang.Class<X>,long,java.util.concurrent.TimeUnit)
*<code>public static <V,X> V com.google.common.util.concurrent.Futures.getChecked(java.util.concurrent.Future<V>,java.lang.Class<X>,long,java.util.concurrent.TimeUnit) throws X
*getChecked(java.util.concurrent.Future<V> p0,java.lang.Class<X> p1,long p2,java.util.concurrent.TimeUnit p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <V,X extends java.lang.Exception > V getChecked(java.util.concurrent.Future<V> p0,java.lang.Class<X> p1,long p2,java.util.concurrent.TimeUnit p3) throws X{
	return com.google.common.util.concurrent.Futures.getChecked(p0,p1,p2,p3);
}
/**
*{@link com.google.common.util.concurrent.Futures#getChecked(java.util.concurrent.Future<V>,java.lang.Class<X>)}
*@see com.google.common.util.concurrent.Futures#getChecked(java.util.concurrent.Future<V>,java.lang.Class<X>)
*<code>public static <V,X> V com.google.common.util.concurrent.Futures.getChecked(java.util.concurrent.Future<V>,java.lang.Class<X>) throws X
*getChecked(java.util.concurrent.Future<V> p0,java.lang.Class<X> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <V,X extends java.lang.Exception > V getChecked(java.util.concurrent.Future<V> p0,java.lang.Class<X> p1) throws X{
	return com.google.common.util.concurrent.Futures.getChecked(p0,p1);
}
/**
*{@link com.google.common.util.concurrent.Futures#getDone(java.util.concurrent.Future<V>)}
*@see com.google.common.util.concurrent.Futures#getDone(java.util.concurrent.Future<V>)
*<code>public static <V> V com.google.common.util.concurrent.Futures.getDone(java.util.concurrent.Future<V>) throws java.util.concurrent.ExecutionException
*getDone(java.util.concurrent.Future<V> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <V> V getDone(java.util.concurrent.Future<V> p0) throws java.util.concurrent.ExecutionException{
	return com.google.common.util.concurrent.Futures.getDone(p0);
}
/**
*{@link org.apache.commons.collections.MapUtils#getDouble(java.util.Map,java.lang.Object)}
*@see org.apache.commons.collections.MapUtils#getDouble(java.util.Map,java.lang.Object)
*<code>public static java.lang.Double org.apache.commons.collections.MapUtils.getDouble(java.util.Map,java.lang.Object)
*getDouble(java.util.Map p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.Double getDouble(java.util.Map p0,java.lang.Object p1){
	return org.apache.commons.collections.MapUtils.getDouble(p0,p1);
}
/**
*{@link org.apache.commons.collections.MapUtils#getDouble(java.util.Map,java.lang.Object,java.lang.Double)}
*@see org.apache.commons.collections.MapUtils#getDouble(java.util.Map,java.lang.Object,java.lang.Double)
*<code>public static java.lang.Double org.apache.commons.collections.MapUtils.getDouble(java.util.Map,java.lang.Object,java.lang.Double)
*getDouble(java.util.Map p0,java.lang.Object p1,java.lang.Double p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.Double getDouble(java.util.Map p0,java.lang.Object p1,java.lang.Double p2){
	return org.apache.commons.collections.MapUtils.getDouble(p0,p1,p2);
}
/**
*{@link org.apache.commons.collections.MapUtils#getDoubleValue(java.util.Map,java.lang.Object)}
*@see org.apache.commons.collections.MapUtils#getDoubleValue(java.util.Map,java.lang.Object)
*<code>public static double org.apache.commons.collections.MapUtils.getDoubleValue(java.util.Map,java.lang.Object)
*getDoubleValue(java.util.Map p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static double getDoubleValue(java.util.Map p0,java.lang.Object p1){
	return org.apache.commons.collections.MapUtils.getDoubleValue(p0,p1);
}
/**
*{@link org.apache.commons.collections.MapUtils#getDoubleValue(java.util.Map,java.lang.Object,double)}
*@see org.apache.commons.collections.MapUtils#getDoubleValue(java.util.Map,java.lang.Object,double)
*<code>public static double org.apache.commons.collections.MapUtils.getDoubleValue(java.util.Map,java.lang.Object,double)
*getDoubleValue(java.util.Map p0,java.lang.Object p1,double p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static double getDoubleValue(java.util.Map p0,java.lang.Object p1,double p2){
	return org.apache.commons.collections.MapUtils.getDoubleValue(p0,p1,p2);
}
/**
*{@link com.google.common.collect.Iterables#getFirst(java.lang.Iterable<? extends T>,T)}
*@see com.google.common.collect.Iterables#getFirst(java.lang.Iterable<? extends T>,T)
*<code>public static <T> T com.google.common.collect.Iterables.getFirst(java.lang.Iterable<? extends T>,T)
*getFirst(java.lang.Iterable<? extends T> p0,T p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> T getFirst(java.lang.Iterable<? extends T> p0,T p1){
	return com.google.common.collect.Iterables.getFirst(p0,p1);
}
/**
*{@link org.apache.commons.collections.MapUtils#getFloat(java.util.Map,java.lang.Object,java.lang.Float)}
*@see org.apache.commons.collections.MapUtils#getFloat(java.util.Map,java.lang.Object,java.lang.Float)
*<code>public static java.lang.Float org.apache.commons.collections.MapUtils.getFloat(java.util.Map,java.lang.Object,java.lang.Float)
*getFloat(java.util.Map p0,java.lang.Object p1,java.lang.Float p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.Float getFloat(java.util.Map p0,java.lang.Object p1,java.lang.Float p2){
	return org.apache.commons.collections.MapUtils.getFloat(p0,p1,p2);
}
/**
*{@link org.apache.commons.collections.MapUtils#getFloat(java.util.Map,java.lang.Object)}
*@see org.apache.commons.collections.MapUtils#getFloat(java.util.Map,java.lang.Object)
*<code>public static java.lang.Float org.apache.commons.collections.MapUtils.getFloat(java.util.Map,java.lang.Object)
*getFloat(java.util.Map p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.Float getFloat(java.util.Map p0,java.lang.Object p1){
	return org.apache.commons.collections.MapUtils.getFloat(p0,p1);
}
/**
*{@link org.apache.commons.collections.MapUtils#getFloatValue(java.util.Map,java.lang.Object)}
*@see org.apache.commons.collections.MapUtils#getFloatValue(java.util.Map,java.lang.Object)
*<code>public static float org.apache.commons.collections.MapUtils.getFloatValue(java.util.Map,java.lang.Object)
*getFloatValue(java.util.Map p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static float getFloatValue(java.util.Map p0,java.lang.Object p1){
	return org.apache.commons.collections.MapUtils.getFloatValue(p0,p1);
}
/**
*{@link org.apache.commons.collections.MapUtils#getFloatValue(java.util.Map,java.lang.Object,float)}
*@see org.apache.commons.collections.MapUtils#getFloatValue(java.util.Map,java.lang.Object,float)
*<code>public static float org.apache.commons.collections.MapUtils.getFloatValue(java.util.Map,java.lang.Object,float)
*getFloatValue(java.util.Map p0,java.lang.Object p1,float p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static float getFloatValue(java.util.Map p0,java.lang.Object p1,float p2){
	return org.apache.commons.collections.MapUtils.getFloatValue(p0,p1,p2);
}
/**
*{@link org.apache.commons.beanutils.locale.LocaleBeanUtils#getIndexedProperty(java.lang.Object,java.lang.String)}
*@see org.apache.commons.beanutils.locale.LocaleBeanUtils#getIndexedProperty(java.lang.Object,java.lang.String)
*<code>public static java.lang.String org.apache.commons.beanutils.locale.LocaleBeanUtils.getIndexedProperty(java.lang.Object,java.lang.String) throws java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException,java.lang.NoSuchMethodException
*getIndexedProperty(java.lang.Object p0,java.lang.String p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.String getIndexedProperty(java.lang.Object p0,java.lang.String p1) throws java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException,java.lang.NoSuchMethodException{
	return org.apache.commons.beanutils.locale.LocaleBeanUtils.getIndexedProperty(p0,p1);
}
/**
*{@link org.apache.commons.beanutils.locale.LocaleBeanUtils#getIndexedProperty(java.lang.Object,java.lang.String,java.lang.String)}
*@see org.apache.commons.beanutils.locale.LocaleBeanUtils#getIndexedProperty(java.lang.Object,java.lang.String,java.lang.String)
*<code>public static java.lang.String org.apache.commons.beanutils.locale.LocaleBeanUtils.getIndexedProperty(java.lang.Object,java.lang.String,java.lang.String) throws java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException,java.lang.NoSuchMethodException
*getIndexedProperty(java.lang.Object p0,java.lang.String p1,java.lang.String p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.String getIndexedProperty(java.lang.Object p0,java.lang.String p1,java.lang.String p2) throws java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException,java.lang.NoSuchMethodException{
	return org.apache.commons.beanutils.locale.LocaleBeanUtils.getIndexedProperty(p0,p1,p2);
}
/**
*{@link org.apache.commons.beanutils.locale.LocaleBeanUtils#getIndexedProperty(java.lang.Object,java.lang.String,int)}
*@see org.apache.commons.beanutils.locale.LocaleBeanUtils#getIndexedProperty(java.lang.Object,java.lang.String,int)
*<code>public static java.lang.String org.apache.commons.beanutils.locale.LocaleBeanUtils.getIndexedProperty(java.lang.Object,java.lang.String,int) throws java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException,java.lang.NoSuchMethodException
*getIndexedProperty(java.lang.Object p0,java.lang.String p1,int p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.String getIndexedProperty(java.lang.Object p0,java.lang.String p1,int p2) throws java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException,java.lang.NoSuchMethodException{
	return org.apache.commons.beanutils.locale.LocaleBeanUtils.getIndexedProperty(p0,p1,p2);
}
/**
*{@link org.apache.commons.beanutils.locale.LocaleBeanUtils#getIndexedProperty(java.lang.Object,java.lang.String,int,java.lang.String)}
*@see org.apache.commons.beanutils.locale.LocaleBeanUtils#getIndexedProperty(java.lang.Object,java.lang.String,int,java.lang.String)
*<code>public static java.lang.String org.apache.commons.beanutils.locale.LocaleBeanUtils.getIndexedProperty(java.lang.Object,java.lang.String,int,java.lang.String) throws java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException,java.lang.NoSuchMethodException
*getIndexedProperty(java.lang.Object p0,java.lang.String p1,int p2,java.lang.String p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.String getIndexedProperty(java.lang.Object p0,java.lang.String p1,int p2,java.lang.String p3) throws java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException,java.lang.NoSuchMethodException{
	return org.apache.commons.beanutils.locale.LocaleBeanUtils.getIndexedProperty(p0,p1,p2,p3);
}
/**
*{@link org.apache.commons.collections.functors.PrototypeFactory#getInstance(java.lang.Object)}
*@see org.apache.commons.collections.functors.PrototypeFactory#getInstance(java.lang.Object)
*<code>public static org.apache.commons.collections.Factory org.apache.commons.collections.functors.PrototypeFactory.getInstance(java.lang.Object)
*getInstance(java.lang.Object p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.Factory getInstance(java.lang.Object p0){
	return org.apache.commons.collections.functors.PrototypeFactory.getInstance(p0);
}
/**
*{@link org.apache.commons.collections.MapUtils#getIntValue(java.util.Map,java.lang.Object)}
*@see org.apache.commons.collections.MapUtils#getIntValue(java.util.Map,java.lang.Object)
*<code>public static int org.apache.commons.collections.MapUtils.getIntValue(java.util.Map,java.lang.Object)
*getIntValue(java.util.Map p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int getIntValue(java.util.Map p0,java.lang.Object p1){
	return org.apache.commons.collections.MapUtils.getIntValue(p0,p1);
}
/**
*{@link org.apache.commons.collections.MapUtils#getIntValue(java.util.Map,java.lang.Object,int)}
*@see org.apache.commons.collections.MapUtils#getIntValue(java.util.Map,java.lang.Object,int)
*<code>public static int org.apache.commons.collections.MapUtils.getIntValue(java.util.Map,java.lang.Object,int)
*getIntValue(java.util.Map p0,java.lang.Object p1,int p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int getIntValue(java.util.Map p0,java.lang.Object p1,int p2){
	return org.apache.commons.collections.MapUtils.getIntValue(p0,p1,p2);
}
/**
*{@link org.apache.commons.collections.MapUtils#getInteger(java.util.Map,java.lang.Object,java.lang.Integer)}
*@see org.apache.commons.collections.MapUtils#getInteger(java.util.Map,java.lang.Object,java.lang.Integer)
*<code>public static java.lang.Integer org.apache.commons.collections.MapUtils.getInteger(java.util.Map,java.lang.Object,java.lang.Integer)
*getInteger(java.util.Map p0,java.lang.Object p1,java.lang.Integer p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.Integer getInteger(java.util.Map p0,java.lang.Object p1,java.lang.Integer p2){
	return org.apache.commons.collections.MapUtils.getInteger(p0,p1,p2);
}
/**
*{@link org.apache.commons.collections.MapUtils#getInteger(java.util.Map,java.lang.Object)}
*@see org.apache.commons.collections.MapUtils#getInteger(java.util.Map,java.lang.Object)
*<code>public static java.lang.Integer org.apache.commons.collections.MapUtils.getInteger(java.util.Map,java.lang.Object)
*getInteger(java.util.Map p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.Integer getInteger(java.util.Map p0,java.lang.Object p1){
	return org.apache.commons.collections.MapUtils.getInteger(p0,p1);
}
/**
*{@link org.apache.commons.collections4.IteratorUtils#getIterator(java.lang.Object)}
*@see org.apache.commons.collections4.IteratorUtils#getIterator(java.lang.Object)
*<code>public static java.util.Iterator<?> org.apache.commons.collections4.IteratorUtils.getIterator(java.lang.Object)
*getIterator(java.lang.Object p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Iterator<?> getIterator(java.lang.Object p0){
	return org.apache.commons.collections4.IteratorUtils.getIterator(p0);
}
/**
*{@link com.google.common.collect.Iterables#getLast(java.lang.Iterable<? extends T>,T)}
*@see com.google.common.collect.Iterables#getLast(java.lang.Iterable<? extends T>,T)
*<code>public static <T> T com.google.common.collect.Iterables.getLast(java.lang.Iterable<? extends T>,T)
*getLast(java.lang.Iterable<? extends T> p0,T p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> T getLast(java.lang.Iterable<? extends T> p0,T p1){
	return com.google.common.collect.Iterables.getLast(p0,p1);
}
/**
*{@link com.google.common.collect.Iterables#getLast(java.lang.Iterable<T>)}
*@see com.google.common.collect.Iterables#getLast(java.lang.Iterable<T>)
*<code>public static <T> T com.google.common.collect.Iterables.getLast(java.lang.Iterable<T>)
*getLast(java.lang.Iterable<T> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> T getLast(java.lang.Iterable<T> p0){
	return com.google.common.collect.Iterables.getLast(p0);
}
/**
*{@link com.google.common.collect.Iterators#getLast(java.util.Iterator<T>)}
*@see com.google.common.collect.Iterators#getLast(java.util.Iterator<T>)
*<code>public static <T> T com.google.common.collect.Iterators.getLast(java.util.Iterator<T>)
*getLast(java.util.Iterator<T> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> T getLast(java.util.Iterator<T> p0){
	return com.google.common.collect.Iterators.getLast(p0);
}
/**
*{@link com.google.common.collect.Iterators#getLast(java.util.Iterator<? extends T>,T)}
*@see com.google.common.collect.Iterators#getLast(java.util.Iterator<? extends T>,T)
*<code>public static <T> T com.google.common.collect.Iterators.getLast(java.util.Iterator<? extends T>,T)
*getLast(java.util.Iterator<? extends T> p0,T p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> T getLast(java.util.Iterator<? extends T> p0,T p1){
	return com.google.common.collect.Iterators.getLast(p0,p1);
}
/**
*{@link org.apache.commons.lang3.ArrayUtils#getLength(java.lang.Object)}
*@see org.apache.commons.lang3.ArrayUtils#getLength(java.lang.Object)
*<code>public static int org.apache.commons.lang3.ArrayUtils.getLength(java.lang.Object)
*getLength(java.lang.Object p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int getLength(java.lang.Object p0){
	return org.apache.commons.lang3.ArrayUtils.getLength(p0);
}
/**
*{@link org.apache.commons.collections.MapUtils#getLong(java.util.Map,java.lang.Object)}
*@see org.apache.commons.collections.MapUtils#getLong(java.util.Map,java.lang.Object)
*<code>public static java.lang.Long org.apache.commons.collections.MapUtils.getLong(java.util.Map,java.lang.Object)
*getLong(java.util.Map p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.Long getLong(java.util.Map p0,java.lang.Object p1){
	return org.apache.commons.collections.MapUtils.getLong(p0,p1);
}
/**
*{@link org.apache.commons.collections.MapUtils#getLong(java.util.Map,java.lang.Object,java.lang.Long)}
*@see org.apache.commons.collections.MapUtils#getLong(java.util.Map,java.lang.Object,java.lang.Long)
*<code>public static java.lang.Long org.apache.commons.collections.MapUtils.getLong(java.util.Map,java.lang.Object,java.lang.Long)
*getLong(java.util.Map p0,java.lang.Object p1,java.lang.Long p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.Long getLong(java.util.Map p0,java.lang.Object p1,java.lang.Long p2){
	return org.apache.commons.collections.MapUtils.getLong(p0,p1,p2);
}
/**
*{@link org.apache.commons.collections.MapUtils#getLongValue(java.util.Map,java.lang.Object)}
*@see org.apache.commons.collections.MapUtils#getLongValue(java.util.Map,java.lang.Object)
*<code>public static long org.apache.commons.collections.MapUtils.getLongValue(java.util.Map,java.lang.Object)
*getLongValue(java.util.Map p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static long getLongValue(java.util.Map p0,java.lang.Object p1){
	return org.apache.commons.collections.MapUtils.getLongValue(p0,p1);
}
/**
*{@link org.apache.commons.collections.MapUtils#getLongValue(java.util.Map,java.lang.Object,long)}
*@see org.apache.commons.collections.MapUtils#getLongValue(java.util.Map,java.lang.Object,long)
*<code>public static long org.apache.commons.collections.MapUtils.getLongValue(java.util.Map,java.lang.Object,long)
*getLongValue(java.util.Map p0,java.lang.Object p1,long p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static long getLongValue(java.util.Map p0,java.lang.Object p1,long p2){
	return org.apache.commons.collections.MapUtils.getLongValue(p0,p1,p2);
}
/**
*{@link org.apache.commons.collections.MapUtils#getMap(java.util.Map,java.lang.Object,java.util.Map)}
*@see org.apache.commons.collections.MapUtils#getMap(java.util.Map,java.lang.Object,java.util.Map)
*<code>public static java.util.Map org.apache.commons.collections.MapUtils.getMap(java.util.Map,java.lang.Object,java.util.Map)
*getMap(java.util.Map p0,java.lang.Object p1,java.util.Map p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Map getMap(java.util.Map p0,java.lang.Object p1,java.util.Map p2){
	return org.apache.commons.collections.MapUtils.getMap(p0,p1,p2);
}
/**
*{@link org.apache.commons.collections.MapUtils#getMap(java.util.Map,java.lang.Object)}
*@see org.apache.commons.collections.MapUtils#getMap(java.util.Map,java.lang.Object)
*<code>public static java.util.Map org.apache.commons.collections.MapUtils.getMap(java.util.Map,java.lang.Object)
*getMap(java.util.Map p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Map getMap(java.util.Map p0,java.lang.Object p1){
	return org.apache.commons.collections.MapUtils.getMap(p0,p1);
}
/**
*{@link org.apache.commons.beanutils.locale.LocaleBeanUtils#getMappedProperty(java.lang.Object,java.lang.String,java.lang.String,java.lang.String)}
*@see org.apache.commons.beanutils.locale.LocaleBeanUtils#getMappedProperty(java.lang.Object,java.lang.String,java.lang.String,java.lang.String)
*<code>public static java.lang.String org.apache.commons.beanutils.locale.LocaleBeanUtils.getMappedProperty(java.lang.Object,java.lang.String,java.lang.String,java.lang.String) throws java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException,java.lang.NoSuchMethodException
*getMappedProperty(java.lang.Object p0,java.lang.String p1,java.lang.String p2,java.lang.String p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.String getMappedProperty(java.lang.Object p0,java.lang.String p1,java.lang.String p2,java.lang.String p3) throws java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException,java.lang.NoSuchMethodException{
	return org.apache.commons.beanutils.locale.LocaleBeanUtils.getMappedProperty(p0,p1,p2,p3);
}
/**
*{@link org.apache.commons.beanutils.locale.LocaleBeanUtils#getMappedProperty(java.lang.Object,java.lang.String,java.lang.String)}
*@see org.apache.commons.beanutils.locale.LocaleBeanUtils#getMappedProperty(java.lang.Object,java.lang.String,java.lang.String)
*<code>public static java.lang.String org.apache.commons.beanutils.locale.LocaleBeanUtils.getMappedProperty(java.lang.Object,java.lang.String,java.lang.String) throws java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException,java.lang.NoSuchMethodException
*getMappedProperty(java.lang.Object p0,java.lang.String p1,java.lang.String p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.String getMappedProperty(java.lang.Object p0,java.lang.String p1,java.lang.String p2) throws java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException,java.lang.NoSuchMethodException{
	return org.apache.commons.beanutils.locale.LocaleBeanUtils.getMappedProperty(p0,p1,p2);
}
/**
*{@link org.apache.commons.beanutils.locale.LocaleBeanUtils#getMappedProperty(java.lang.Object,java.lang.String)}
*@see org.apache.commons.beanutils.locale.LocaleBeanUtils#getMappedProperty(java.lang.Object,java.lang.String)
*<code>public static java.lang.String org.apache.commons.beanutils.locale.LocaleBeanUtils.getMappedProperty(java.lang.Object,java.lang.String) throws java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException,java.lang.NoSuchMethodException
*getMappedProperty(java.lang.Object p0,java.lang.String p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.String getMappedProperty(java.lang.Object p0,java.lang.String p1) throws java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException,java.lang.NoSuchMethodException{
	return org.apache.commons.beanutils.locale.LocaleBeanUtils.getMappedProperty(p0,p1);
}
/**
*{@link org.apache.commons.beanutils.PropertyUtils#getMappedPropertyDescriptors(java.lang.Object)}
*@see org.apache.commons.beanutils.PropertyUtils#getMappedPropertyDescriptors(java.lang.Object)
*<code>public static org.apache.commons.collections.FastHashMap org.apache.commons.beanutils.PropertyUtils.getMappedPropertyDescriptors(java.lang.Object)
*getMappedPropertyDescriptors(java.lang.Object p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.FastHashMap getMappedPropertyDescriptors(java.lang.Object p0){
	return org.apache.commons.beanutils.PropertyUtils.getMappedPropertyDescriptors(p0);
}
/**
*{@link org.apache.commons.beanutils.locale.LocaleBeanUtils#getMappedPropertyLocale(java.lang.Object,java.lang.String,java.lang.String)}
*@see org.apache.commons.beanutils.locale.LocaleBeanUtils#getMappedPropertyLocale(java.lang.Object,java.lang.String,java.lang.String)
*<code>public static java.lang.String org.apache.commons.beanutils.locale.LocaleBeanUtils.getMappedPropertyLocale(java.lang.Object,java.lang.String,java.lang.String) throws java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException,java.lang.NoSuchMethodException
*getMappedPropertyLocale(java.lang.Object p0,java.lang.String p1,java.lang.String p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.String getMappedPropertyLocale(java.lang.Object p0,java.lang.String p1,java.lang.String p2) throws java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException,java.lang.NoSuchMethodException{
	return org.apache.commons.beanutils.locale.LocaleBeanUtils.getMappedPropertyLocale(p0,p1,p2);
}
/**
*{@link org.apache.commons.lang3.ClassUtils#getName(java.lang.Object)}
*@see org.apache.commons.lang3.ClassUtils#getName(java.lang.Object)
*<code>public static java.lang.String org.apache.commons.lang3.ClassUtils.getName(java.lang.Object)
*getName(java.lang.Object p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.String getName(java.lang.Object p0){
	return org.apache.commons.lang3.ClassUtils.getName(p0);
}
/**
*{@link org.apache.commons.lang3.ClassUtils#getName(java.lang.Object,java.lang.String)}
*@see org.apache.commons.lang3.ClassUtils#getName(java.lang.Object,java.lang.String)
*<code>public static java.lang.String org.apache.commons.lang3.ClassUtils.getName(java.lang.Object,java.lang.String)
*getName(java.lang.Object p0,java.lang.String p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.String getName(java.lang.Object p0,java.lang.String p1){
	return org.apache.commons.lang3.ClassUtils.getName(p0,p1);
}
/**
*{@link org.apache.commons.beanutils.locale.LocaleBeanUtils#getNestedProperty(java.lang.Object,java.lang.String,java.lang.String)}
*@see org.apache.commons.beanutils.locale.LocaleBeanUtils#getNestedProperty(java.lang.Object,java.lang.String,java.lang.String)
*<code>public static java.lang.String org.apache.commons.beanutils.locale.LocaleBeanUtils.getNestedProperty(java.lang.Object,java.lang.String,java.lang.String) throws java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException,java.lang.NoSuchMethodException
*getNestedProperty(java.lang.Object p0,java.lang.String p1,java.lang.String p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.String getNestedProperty(java.lang.Object p0,java.lang.String p1,java.lang.String p2) throws java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException,java.lang.NoSuchMethodException{
	return org.apache.commons.beanutils.locale.LocaleBeanUtils.getNestedProperty(p0,p1,p2);
}
/**
*{@link org.apache.commons.beanutils.locale.LocaleBeanUtils#getNestedProperty(java.lang.Object,java.lang.String)}
*@see org.apache.commons.beanutils.locale.LocaleBeanUtils#getNestedProperty(java.lang.Object,java.lang.String)
*<code>public static java.lang.String org.apache.commons.beanutils.locale.LocaleBeanUtils.getNestedProperty(java.lang.Object,java.lang.String) throws java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException,java.lang.NoSuchMethodException
*getNestedProperty(java.lang.Object p0,java.lang.String p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.String getNestedProperty(java.lang.Object p0,java.lang.String p1) throws java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException,java.lang.NoSuchMethodException{
	return org.apache.commons.beanutils.locale.LocaleBeanUtils.getNestedProperty(p0,p1);
}
/**
*{@link com.google.common.collect.Iterators#getNext(java.util.Iterator<? extends T>,T)}
*@see com.google.common.collect.Iterators#getNext(java.util.Iterator<? extends T>,T)
*<code>public static <T> T com.google.common.collect.Iterators.getNext(java.util.Iterator<? extends T>,T)
*getNext(java.util.Iterator<? extends T> p0,T p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> T getNext(java.util.Iterator<? extends T> p0,T p1){
	return com.google.common.collect.Iterators.getNext(p0,p1);
}
/**
*{@link org.apache.commons.collections.MapUtils#getNumber(java.util.Map,java.lang.Object)}
*@see org.apache.commons.collections.MapUtils#getNumber(java.util.Map,java.lang.Object)
*<code>public static java.lang.Number org.apache.commons.collections.MapUtils.getNumber(java.util.Map,java.lang.Object)
*getNumber(java.util.Map p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.Number getNumber(java.util.Map p0,java.lang.Object p1){
	return org.apache.commons.collections.MapUtils.getNumber(p0,p1);
}
/**
*{@link org.apache.commons.collections.MapUtils#getNumber(java.util.Map,java.lang.Object,java.lang.Number)}
*@see org.apache.commons.collections.MapUtils#getNumber(java.util.Map,java.lang.Object,java.lang.Number)
*<code>public static java.lang.Number org.apache.commons.collections.MapUtils.getNumber(java.util.Map,java.lang.Object,java.lang.Number)
*getNumber(java.util.Map p0,java.lang.Object p1,java.lang.Number p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.Number getNumber(java.util.Map p0,java.lang.Object p1,java.lang.Number p2){
	return org.apache.commons.collections.MapUtils.getNumber(p0,p1,p2);
}
/**
*{@link org.apache.commons.collections4.MapUtils#getObject(java.util.Map<K, V>,K,V)}
*@see org.apache.commons.collections4.MapUtils#getObject(java.util.Map<K, V>,K,V)
*<code>public static <K,V> V org.apache.commons.collections4.MapUtils.getObject(java.util.Map<K, V>,K,V)
*getObject(java.util.Map<K, V> p0,K p1,V p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K,V> V getObject(java.util.Map<K, V> p0,K p1,V p2){
	return org.apache.commons.collections4.MapUtils.getObject(p0,p1,p2);
}
/**
*{@link org.apache.commons.collections4.MapUtils#getObject(java.util.Map<? super K, V>,K)}
*@see org.apache.commons.collections4.MapUtils#getObject(java.util.Map<? super K, V>,K)
*<code>public static <K,V> V org.apache.commons.collections4.MapUtils.getObject(java.util.Map<? super K, V>,K)
*getObject(java.util.Map<? super K, V> p0,K p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K,V> V getObject(java.util.Map<? super K, V> p0,K p1){
	return org.apache.commons.collections4.MapUtils.getObject(p0,p1);
}
/**
*{@link org.apache.commons.collections.MapUtils#getObject(java.util.Map,java.lang.Object)}
*@see org.apache.commons.collections.MapUtils#getObject(java.util.Map,java.lang.Object)
*<code>public static java.lang.Object org.apache.commons.collections.MapUtils.getObject(java.util.Map,java.lang.Object)
*getObject(java.util.Map p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.Object getObject(java.util.Map p0,java.lang.Object p1){
	return org.apache.commons.collections.MapUtils.getObject(p0,p1);
}
/**
*{@link org.apache.commons.collections.MapUtils#getObject(java.util.Map,java.lang.Object,java.lang.Object)}
*@see org.apache.commons.collections.MapUtils#getObject(java.util.Map,java.lang.Object,java.lang.Object)
*<code>public static java.lang.Object org.apache.commons.collections.MapUtils.getObject(java.util.Map,java.lang.Object,java.lang.Object)
*getObject(java.util.Map p0,java.lang.Object p1,java.lang.Object p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.Object getObject(java.util.Map p0,java.lang.Object p1,java.lang.Object p2){
	return org.apache.commons.collections.MapUtils.getObject(p0,p1,p2);
}
/**
*{@link com.google.common.collect.Iterables#getOnlyElement(java.lang.Iterable<? extends T>,T)}
*@see com.google.common.collect.Iterables#getOnlyElement(java.lang.Iterable<? extends T>,T)
*<code>public static <T> T com.google.common.collect.Iterables.getOnlyElement(java.lang.Iterable<? extends T>,T)
*getOnlyElement(java.lang.Iterable<? extends T> p0,T p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> T getOnlyElement(java.lang.Iterable<? extends T> p0,T p1){
	return com.google.common.collect.Iterables.getOnlyElement(p0,p1);
}
/**
*{@link com.google.common.collect.Iterables#getOnlyElement(java.lang.Iterable<T>)}
*@see com.google.common.collect.Iterables#getOnlyElement(java.lang.Iterable<T>)
*<code>public static <T> T com.google.common.collect.Iterables.getOnlyElement(java.lang.Iterable<T>)
*getOnlyElement(java.lang.Iterable<T> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> T getOnlyElement(java.lang.Iterable<T> p0){
	return com.google.common.collect.Iterables.getOnlyElement(p0);
}
/**
*{@link com.google.common.collect.Iterators#getOnlyElement(java.util.Iterator<? extends T>,T)}
*@see com.google.common.collect.Iterators#getOnlyElement(java.util.Iterator<? extends T>,T)
*<code>public static <T> T com.google.common.collect.Iterators.getOnlyElement(java.util.Iterator<? extends T>,T)
*getOnlyElement(java.util.Iterator<? extends T> p0,T p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> T getOnlyElement(java.util.Iterator<? extends T> p0,T p1){
	return com.google.common.collect.Iterators.getOnlyElement(p0,p1);
}
/**
*{@link com.google.common.collect.Iterators#getOnlyElement(java.util.Iterator<T>)}
*@see com.google.common.collect.Iterators#getOnlyElement(java.util.Iterator<T>)
*<code>public static <T> T com.google.common.collect.Iterators.getOnlyElement(java.util.Iterator<T>)
*getOnlyElement(java.util.Iterator<T> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> T getOnlyElement(java.util.Iterator<T> p0){
	return com.google.common.collect.Iterators.getOnlyElement(p0);
}
/**
*{@link org.apache.commons.lang3.ClassUtils#getPackageCanonicalName(java.lang.Object,java.lang.String)}
*@see org.apache.commons.lang3.ClassUtils#getPackageCanonicalName(java.lang.Object,java.lang.String)
*<code>public static java.lang.String org.apache.commons.lang3.ClassUtils.getPackageCanonicalName(java.lang.Object,java.lang.String)
*getPackageCanonicalName(java.lang.Object p0,java.lang.String p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.String getPackageCanonicalName(java.lang.Object p0,java.lang.String p1){
	return org.apache.commons.lang3.ClassUtils.getPackageCanonicalName(p0,p1);
}
/**
*{@link org.apache.commons.lang3.ClassUtils#getPackageName(java.lang.Object,java.lang.String)}
*@see org.apache.commons.lang3.ClassUtils#getPackageName(java.lang.Object,java.lang.String)
*<code>public static java.lang.String org.apache.commons.lang3.ClassUtils.getPackageName(java.lang.Object,java.lang.String)
*getPackageName(java.lang.Object p0,java.lang.String p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.String getPackageName(java.lang.Object p0,java.lang.String p1){
	return org.apache.commons.lang3.ClassUtils.getPackageName(p0,p1);
}
/**
*{@link org.apache.commons.beanutils.locale.LocaleBeanUtils#getProperty(java.lang.Object,java.lang.String)}
*@see org.apache.commons.beanutils.locale.LocaleBeanUtils#getProperty(java.lang.Object,java.lang.String)
*<code>public static java.lang.String org.apache.commons.beanutils.locale.LocaleBeanUtils.getProperty(java.lang.Object,java.lang.String) throws java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException,java.lang.NoSuchMethodException
*getProperty(java.lang.Object p0,java.lang.String p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.String getProperty(java.lang.Object p0,java.lang.String p1) throws java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException,java.lang.NoSuchMethodException{
	return org.apache.commons.beanutils.locale.LocaleBeanUtils.getProperty(p0,p1);
}
/**
*{@link org.apache.commons.beanutils.locale.LocaleBeanUtils#getProperty(java.lang.Object,java.lang.String,java.lang.String)}
*@see org.apache.commons.beanutils.locale.LocaleBeanUtils#getProperty(java.lang.Object,java.lang.String,java.lang.String)
*<code>public static java.lang.String org.apache.commons.beanutils.locale.LocaleBeanUtils.getProperty(java.lang.Object,java.lang.String,java.lang.String) throws java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException,java.lang.NoSuchMethodException
*getProperty(java.lang.Object p0,java.lang.String p1,java.lang.String p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.String getProperty(java.lang.Object p0,java.lang.String p1,java.lang.String p2) throws java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException,java.lang.NoSuchMethodException{
	return org.apache.commons.beanutils.locale.LocaleBeanUtils.getProperty(p0,p1,p2);
}
/**
*{@link org.apache.commons.beanutils.PropertyUtils#getPropertyDescriptor(java.lang.Object,java.lang.String)}
*@see org.apache.commons.beanutils.PropertyUtils#getPropertyDescriptor(java.lang.Object,java.lang.String)
*<code>public static java.beans.PropertyDescriptor org.apache.commons.beanutils.PropertyUtils.getPropertyDescriptor(java.lang.Object,java.lang.String) throws java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException,java.lang.NoSuchMethodException
*getPropertyDescriptor(java.lang.Object p0,java.lang.String p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.beans.PropertyDescriptor getPropertyDescriptor(java.lang.Object p0,java.lang.String p1) throws java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException,java.lang.NoSuchMethodException{
	return org.apache.commons.beanutils.PropertyUtils.getPropertyDescriptor(p0,p1);
}
/**
*{@link org.apache.commons.beanutils.PropertyUtils#getPropertyDescriptors(java.lang.Object)}
*@see org.apache.commons.beanutils.PropertyUtils#getPropertyDescriptors(java.lang.Object)
*<code>public static java.beans.PropertyDescriptor[] org.apache.commons.beanutils.PropertyUtils.getPropertyDescriptors(java.lang.Object)
*getPropertyDescriptors(java.lang.Object p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.beans.PropertyDescriptor[] getPropertyDescriptors(java.lang.Object p0){
	return org.apache.commons.beanutils.PropertyUtils.getPropertyDescriptors(p0);
}
/**
*{@link org.apache.commons.beanutils.PropertyUtils#getPropertyEditorClass(java.lang.Object,java.lang.String)}
*@see org.apache.commons.beanutils.PropertyUtils#getPropertyEditorClass(java.lang.Object,java.lang.String)
*<code>public static java.lang.Class<?> org.apache.commons.beanutils.PropertyUtils.getPropertyEditorClass(java.lang.Object,java.lang.String) throws java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException,java.lang.NoSuchMethodException
*getPropertyEditorClass(java.lang.Object p0,java.lang.String p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.Class<?> getPropertyEditorClass(java.lang.Object p0,java.lang.String p1) throws java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException,java.lang.NoSuchMethodException{
	return org.apache.commons.beanutils.PropertyUtils.getPropertyEditorClass(p0,p1);
}
/**
*{@link org.apache.commons.beanutils.PropertyUtils#getPropertyType(java.lang.Object,java.lang.String)}
*@see org.apache.commons.beanutils.PropertyUtils#getPropertyType(java.lang.Object,java.lang.String)
*<code>public static java.lang.Class<?> org.apache.commons.beanutils.PropertyUtils.getPropertyType(java.lang.Object,java.lang.String) throws java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException,java.lang.NoSuchMethodException
*getPropertyType(java.lang.Object p0,java.lang.String p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.Class<?> getPropertyType(java.lang.Object p0,java.lang.String p1) throws java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException,java.lang.NoSuchMethodException{
	return org.apache.commons.beanutils.PropertyUtils.getPropertyType(p0,p1);
}
/**
*{@link org.apache.commons.collections.MapUtils#getShort(java.util.Map,java.lang.Object,java.lang.Short)}
*@see org.apache.commons.collections.MapUtils#getShort(java.util.Map,java.lang.Object,java.lang.Short)
*<code>public static java.lang.Short org.apache.commons.collections.MapUtils.getShort(java.util.Map,java.lang.Object,java.lang.Short)
*getShort(java.util.Map p0,java.lang.Object p1,java.lang.Short p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.Short getShort(java.util.Map p0,java.lang.Object p1,java.lang.Short p2){
	return org.apache.commons.collections.MapUtils.getShort(p0,p1,p2);
}
/**
*{@link org.apache.commons.collections.MapUtils#getShort(java.util.Map,java.lang.Object)}
*@see org.apache.commons.collections.MapUtils#getShort(java.util.Map,java.lang.Object)
*<code>public static java.lang.Short org.apache.commons.collections.MapUtils.getShort(java.util.Map,java.lang.Object)
*getShort(java.util.Map p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.Short getShort(java.util.Map p0,java.lang.Object p1){
	return org.apache.commons.collections.MapUtils.getShort(p0,p1);
}
/**
*{@link org.apache.commons.lang3.ClassUtils#getShortCanonicalName(java.lang.Object,java.lang.String)}
*@see org.apache.commons.lang3.ClassUtils#getShortCanonicalName(java.lang.Object,java.lang.String)
*<code>public static java.lang.String org.apache.commons.lang3.ClassUtils.getShortCanonicalName(java.lang.Object,java.lang.String)
*getShortCanonicalName(java.lang.Object p0,java.lang.String p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.String getShortCanonicalName(java.lang.Object p0,java.lang.String p1){
	return org.apache.commons.lang3.ClassUtils.getShortCanonicalName(p0,p1);
}
/**
*{@link org.apache.commons.lang3.ClassUtils#getShortClassName(java.lang.Object,java.lang.String)}
*@see org.apache.commons.lang3.ClassUtils#getShortClassName(java.lang.Object,java.lang.String)
*<code>public static java.lang.String org.apache.commons.lang3.ClassUtils.getShortClassName(java.lang.Object,java.lang.String)
*getShortClassName(java.lang.Object p0,java.lang.String p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.String getShortClassName(java.lang.Object p0,java.lang.String p1){
	return org.apache.commons.lang3.ClassUtils.getShortClassName(p0,p1);
}
/**
*{@link org.apache.commons.collections.MapUtils#getShortValue(java.util.Map,java.lang.Object)}
*@see org.apache.commons.collections.MapUtils#getShortValue(java.util.Map,java.lang.Object)
*<code>public static short org.apache.commons.collections.MapUtils.getShortValue(java.util.Map,java.lang.Object)
*getShortValue(java.util.Map p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static short getShortValue(java.util.Map p0,java.lang.Object p1){
	return org.apache.commons.collections.MapUtils.getShortValue(p0,p1);
}
/**
*{@link org.apache.commons.collections.MapUtils#getShortValue(java.util.Map,java.lang.Object,short)}
*@see org.apache.commons.collections.MapUtils#getShortValue(java.util.Map,java.lang.Object,short)
*<code>public static short org.apache.commons.collections.MapUtils.getShortValue(java.util.Map,java.lang.Object,short)
*getShortValue(java.util.Map p0,java.lang.Object p1,short p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static short getShortValue(java.util.Map p0,java.lang.Object p1,short p2){
	return org.apache.commons.collections.MapUtils.getShortValue(p0,p1,p2);
}
/**
*{@link org.apache.commons.lang3.ClassUtils#getSimpleName(java.lang.Object)}
*@see org.apache.commons.lang3.ClassUtils#getSimpleName(java.lang.Object)
*<code>public static java.lang.String org.apache.commons.lang3.ClassUtils.getSimpleName(java.lang.Object)
*getSimpleName(java.lang.Object p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.String getSimpleName(java.lang.Object p0){
	return org.apache.commons.lang3.ClassUtils.getSimpleName(p0);
}
/**
*{@link org.apache.commons.lang3.ClassUtils#getSimpleName(java.lang.Object,java.lang.String)}
*@see org.apache.commons.lang3.ClassUtils#getSimpleName(java.lang.Object,java.lang.String)
*<code>public static java.lang.String org.apache.commons.lang3.ClassUtils.getSimpleName(java.lang.Object,java.lang.String)
*getSimpleName(java.lang.Object p0,java.lang.String p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.String getSimpleName(java.lang.Object p0,java.lang.String p1){
	return org.apache.commons.lang3.ClassUtils.getSimpleName(p0,p1);
}
/**
*{@link org.apache.commons.beanutils.locale.LocaleBeanUtils#getSimpleProperty(java.lang.Object,java.lang.String)}
*@see org.apache.commons.beanutils.locale.LocaleBeanUtils#getSimpleProperty(java.lang.Object,java.lang.String)
*<code>public static java.lang.String org.apache.commons.beanutils.locale.LocaleBeanUtils.getSimpleProperty(java.lang.Object,java.lang.String) throws java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException,java.lang.NoSuchMethodException
*getSimpleProperty(java.lang.Object p0,java.lang.String p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.String getSimpleProperty(java.lang.Object p0,java.lang.String p1) throws java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException,java.lang.NoSuchMethodException{
	return org.apache.commons.beanutils.locale.LocaleBeanUtils.getSimpleProperty(p0,p1);
}
/**
*{@link org.apache.commons.beanutils.locale.LocaleBeanUtils#getSimpleProperty(java.lang.Object,java.lang.String,java.lang.String)}
*@see org.apache.commons.beanutils.locale.LocaleBeanUtils#getSimpleProperty(java.lang.Object,java.lang.String,java.lang.String)
*<code>public static java.lang.String org.apache.commons.beanutils.locale.LocaleBeanUtils.getSimpleProperty(java.lang.Object,java.lang.String,java.lang.String) throws java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException,java.lang.NoSuchMethodException
*getSimpleProperty(java.lang.Object p0,java.lang.String p1,java.lang.String p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.String getSimpleProperty(java.lang.Object p0,java.lang.String p1,java.lang.String p2) throws java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException,java.lang.NoSuchMethodException{
	return org.apache.commons.beanutils.locale.LocaleBeanUtils.getSimpleProperty(p0,p1,p2);
}
/**
*{@link org.apache.commons.collections.MapUtils#getString(java.util.Map,java.lang.Object)}
*@see org.apache.commons.collections.MapUtils#getString(java.util.Map,java.lang.Object)
*<code>public static java.lang.String org.apache.commons.collections.MapUtils.getString(java.util.Map,java.lang.Object)
*getString(java.util.Map p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.String getString(java.util.Map p0,java.lang.Object p1){
	return org.apache.commons.collections.MapUtils.getString(p0,p1);
}
/**
*{@link org.apache.commons.collections.MapUtils#getString(java.util.Map,java.lang.Object,java.lang.String)}
*@see org.apache.commons.collections.MapUtils#getString(java.util.Map,java.lang.Object,java.lang.String)
*<code>public static java.lang.String org.apache.commons.collections.MapUtils.getString(java.util.Map,java.lang.Object,java.lang.String)
*getString(java.util.Map p0,java.lang.Object p1,java.lang.String p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.String getString(java.util.Map p0,java.lang.Object p1,java.lang.String p2){
	return org.apache.commons.collections.MapUtils.getString(p0,p1,p2);
}
/**
*{@link com.google.common.util.concurrent.Futures#getUnchecked(java.util.concurrent.Future<V>)}
*@see com.google.common.util.concurrent.Futures#getUnchecked(java.util.concurrent.Future<V>)
*<code>public static <V> V com.google.common.util.concurrent.Futures.getUnchecked(java.util.concurrent.Future<V>)
*getUnchecked(java.util.concurrent.Future<V> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <V> V getUnchecked(java.util.concurrent.Future<V> p0){
	return com.google.common.util.concurrent.Futures.getUnchecked(p0);
}
/**
*{@link com.google.common.util.concurrent.Uninterruptibles#getUninterruptibly(java.util.concurrent.Future<V>)}
*@see com.google.common.util.concurrent.Uninterruptibles#getUninterruptibly(java.util.concurrent.Future<V>)
*<code>public static <V> V com.google.common.util.concurrent.Uninterruptibles.getUninterruptibly(java.util.concurrent.Future<V>) throws java.util.concurrent.ExecutionException
*getUninterruptibly(java.util.concurrent.Future<V> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <V> V getUninterruptibly(java.util.concurrent.Future<V> p0) throws java.util.concurrent.ExecutionException{
	return com.google.common.util.concurrent.Uninterruptibles.getUninterruptibly(p0);
}
/**
*{@link com.google.common.util.concurrent.Uninterruptibles#getUninterruptibly(java.util.concurrent.Future<V>,long,java.util.concurrent.TimeUnit)}
*@see com.google.common.util.concurrent.Uninterruptibles#getUninterruptibly(java.util.concurrent.Future<V>,long,java.util.concurrent.TimeUnit)
*<code>public static <V> V com.google.common.util.concurrent.Uninterruptibles.getUninterruptibly(java.util.concurrent.Future<V>,long,java.util.concurrent.TimeUnit) throws java.util.concurrent.ExecutionException,java.util.concurrent.TimeoutException
*getUninterruptibly(java.util.concurrent.Future<V> p0,long p1,java.util.concurrent.TimeUnit p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <V> V getUninterruptibly(java.util.concurrent.Future<V> p0,long p1,java.util.concurrent.TimeUnit p2) throws java.util.concurrent.ExecutionException,java.util.concurrent.TimeoutException{
	return com.google.common.util.concurrent.Uninterruptibles.getUninterruptibly(p0,p1,p2);
}
/**
*{@link org.codehaus.plexus.util.ReflectionUtils#getValueIncludingSuperclasses(java.lang.String,java.lang.Object)}
*@see org.codehaus.plexus.util.ReflectionUtils#getValueIncludingSuperclasses(java.lang.String,java.lang.Object)
*<code>public static java.lang.Object org.codehaus.plexus.util.ReflectionUtils.getValueIncludingSuperclasses(java.lang.String,java.lang.Object) throws java.lang.IllegalAccessException
*getValueIncludingSuperclasses(java.lang.String p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.Object getValueIncludingSuperclasses(java.lang.String p0,java.lang.Object p1) throws java.lang.IllegalAccessException{
	return org.codehaus.plexus.util.ReflectionUtils.getValueIncludingSuperclasses(p0,p1);
}
/**
*{@link org.codehaus.plexus.util.ReflectionUtils#getVariablesAndValuesIncludingSuperclasses(java.lang.Object)}
*@see org.codehaus.plexus.util.ReflectionUtils#getVariablesAndValuesIncludingSuperclasses(java.lang.Object)
*<code>public static java.util.Map<java.lang.String, java.lang.Object> org.codehaus.plexus.util.ReflectionUtils.getVariablesAndValuesIncludingSuperclasses(java.lang.Object) throws java.lang.IllegalAccessException
*getVariablesAndValuesIncludingSuperclasses(java.lang.Object p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Map<java.lang.String, java.lang.Object> getVariablesAndValuesIncludingSuperclasses(java.lang.Object p0) throws java.lang.IllegalAccessException{
	return org.codehaus.plexus.util.ReflectionUtils.getVariablesAndValuesIncludingSuperclasses(p0);
}
/**
*{@link java.lang.Thread#holdsLock(java.lang.Object)}
*@see java.lang.Thread#holdsLock(java.lang.Object)
*<code>public static native boolean java.lang.Thread.holdsLock(java.lang.Object)
*holdsLock(java.lang.Object p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static native boolean holdsLock(java.lang.Object p0){
	return java.lang.Thread.holdsLock(p0);
}
/**
*{@link org.apache.commons.collections.PredicateUtils#identityPredicate(java.lang.Object)}
*@see org.apache.commons.collections.PredicateUtils#identityPredicate(java.lang.Object)
*<code>public static org.apache.commons.collections.Predicate org.apache.commons.collections.PredicateUtils.identityPredicate(java.lang.Object)
*identityPredicate(java.lang.Object p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.Predicate identityPredicate(java.lang.Object p0){
	return org.apache.commons.collections.PredicateUtils.identityPredicate(p0);
}
/**
*{@link org.apache.commons.lang3.ObjectUtils#identityToString(org.apache.commons.lang3.text.StrBuilder,java.lang.Object)}
*@see org.apache.commons.lang3.ObjectUtils#identityToString(org.apache.commons.lang3.text.StrBuilder,java.lang.Object)
*<code>public static void org.apache.commons.lang3.ObjectUtils.identityToString(org.apache.commons.lang3.text.StrBuilder,java.lang.Object)
*identityToString(org.apache.commons.lang3.text.StrBuilder p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void identityToString(org.apache.commons.lang3.text.StrBuilder p0,java.lang.Object p1){
	 org.apache.commons.lang3.ObjectUtils.identityToString(p0,p1);
}
/**
*{@link org.apache.commons.lang3.ObjectUtils#identityToString(java.lang.StringBuffer,java.lang.Object)}
*@see org.apache.commons.lang3.ObjectUtils#identityToString(java.lang.StringBuffer,java.lang.Object)
*<code>public static void org.apache.commons.lang3.ObjectUtils.identityToString(java.lang.StringBuffer,java.lang.Object)
*identityToString(java.lang.StringBuffer p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void identityToString(java.lang.StringBuffer p0,java.lang.Object p1){
	 org.apache.commons.lang3.ObjectUtils.identityToString(p0,p1);
}
/**
*{@link org.apache.commons.lang3.ObjectUtils#identityToString(java.lang.Appendable,java.lang.Object)}
*@see org.apache.commons.lang3.ObjectUtils#identityToString(java.lang.Appendable,java.lang.Object)
*<code>public static void org.apache.commons.lang3.ObjectUtils.identityToString(java.lang.Appendable,java.lang.Object) throws java.io.IOException
*identityToString(java.lang.Appendable p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void identityToString(java.lang.Appendable p0,java.lang.Object p1) throws java.io.IOException{
	 org.apache.commons.lang3.ObjectUtils.identityToString(p0,p1);
}
/**
*{@link org.apache.commons.lang3.ObjectUtils#identityToString(java.lang.StringBuilder,java.lang.Object)}
*@see org.apache.commons.lang3.ObjectUtils#identityToString(java.lang.StringBuilder,java.lang.Object)
*<code>public static void org.apache.commons.lang3.ObjectUtils.identityToString(java.lang.StringBuilder,java.lang.Object)
*identityToString(java.lang.StringBuilder p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void identityToString(java.lang.StringBuilder p0,java.lang.Object p1){
	 org.apache.commons.lang3.ObjectUtils.identityToString(p0,p1);
}
/**
*{@link org.apache.commons.lang3.ObjectUtils#identityToString(java.lang.Object)}
*@see org.apache.commons.lang3.ObjectUtils#identityToString(java.lang.Object)
*<code>public static java.lang.String org.apache.commons.lang3.ObjectUtils.identityToString(java.lang.Object)
*identityToString(java.lang.Object p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.String identityToString(java.lang.Object p0){
	return org.apache.commons.lang3.ObjectUtils.identityToString(p0);
}
/**
*{@link org.apache.commons.collections.CollectionUtils#index(java.lang.Object,java.lang.Object)}
*@see org.apache.commons.collections.CollectionUtils#index(java.lang.Object,java.lang.Object)
*<code>public static java.lang.Object org.apache.commons.collections.CollectionUtils.index(java.lang.Object,java.lang.Object)
*index(java.lang.Object p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.Object index(java.lang.Object p0,java.lang.Object p1){
	return org.apache.commons.collections.CollectionUtils.index(p0,p1);
}
/**
*{@link org.apache.commons.collections.CollectionUtils#index(java.lang.Object,int)}
*@see org.apache.commons.collections.CollectionUtils#index(java.lang.Object,int)
*<code>public static java.lang.Object org.apache.commons.collections.CollectionUtils.index(java.lang.Object,int)
*index(java.lang.Object p0,int p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.Object index(java.lang.Object p0,int p1){
	return org.apache.commons.collections.CollectionUtils.index(p0,p1);
}
/**
*{@link org.apache.commons.lang3.ArrayUtils#indexOf(java.lang.Object[],java.lang.Object)}
*@see org.apache.commons.lang3.ArrayUtils#indexOf(java.lang.Object[],java.lang.Object)
*<code>public static int org.apache.commons.lang3.ArrayUtils.indexOf(java.lang.Object[],java.lang.Object)
*indexOf(java.lang.Object[] p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int indexOf(java.lang.Object[] p0,java.lang.Object p1){
	return org.apache.commons.lang3.ArrayUtils.indexOf(p0,p1);
}
/**
*{@link org.apache.commons.lang3.ArrayUtils#indexOf(java.lang.Object[],java.lang.Object,int)}
*@see org.apache.commons.lang3.ArrayUtils#indexOf(java.lang.Object[],java.lang.Object,int)
*<code>public static int org.apache.commons.lang3.ArrayUtils.indexOf(java.lang.Object[],java.lang.Object,int)
*indexOf(java.lang.Object[] p0,java.lang.Object p1,int p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int indexOf(java.lang.Object[] p0,java.lang.Object p1,int p2){
	return org.apache.commons.lang3.ArrayUtils.indexOf(p0,p1,p2);
}
/**
*{@link org.apache.commons.lang3.concurrent.ConcurrentUtils#initialize(org.apache.commons.lang3.concurrent.ConcurrentInitializer<T>)}
*@see org.apache.commons.lang3.concurrent.ConcurrentUtils#initialize(org.apache.commons.lang3.concurrent.ConcurrentInitializer<T>)
*<code>public static <T> T org.apache.commons.lang3.concurrent.ConcurrentUtils.initialize(org.apache.commons.lang3.concurrent.ConcurrentInitializer<T>) throws org.apache.commons.lang3.concurrent.ConcurrentException
*initialize(org.apache.commons.lang3.concurrent.ConcurrentInitializer<T> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> T initialize(org.apache.commons.lang3.concurrent.ConcurrentInitializer<T> p0) throws org.apache.commons.lang3.concurrent.ConcurrentException{
	return org.apache.commons.lang3.concurrent.ConcurrentUtils.initialize(p0);
}
/**
*{@link org.apache.commons.lang3.concurrent.ConcurrentUtils#initializeUnchecked(org.apache.commons.lang3.concurrent.ConcurrentInitializer<T>)}
*@see org.apache.commons.lang3.concurrent.ConcurrentUtils#initializeUnchecked(org.apache.commons.lang3.concurrent.ConcurrentInitializer<T>)
*<code>public static <T> T org.apache.commons.lang3.concurrent.ConcurrentUtils.initializeUnchecked(org.apache.commons.lang3.concurrent.ConcurrentInitializer<T>)
*initializeUnchecked(org.apache.commons.lang3.concurrent.ConcurrentInitializer<T> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> T initializeUnchecked(org.apache.commons.lang3.concurrent.ConcurrentInitializer<T> p0){
	return org.apache.commons.lang3.concurrent.ConcurrentUtils.initializeUnchecked(p0);
}
/**
*{@link org.apache.commons.beanutils.ConstructorUtils#invokeConstructor(java.lang.Class<T>,java.lang.Object...)}
*@see org.apache.commons.beanutils.ConstructorUtils#invokeConstructor(java.lang.Class<T>,java.lang.Object...)
*<code>public static <T> T org.apache.commons.beanutils.ConstructorUtils.invokeConstructor(java.lang.Class<T>,java.lang.Object[]) throws java.lang.NoSuchMethodException,java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException,java.lang.InstantiationException
*invokeConstructor(java.lang.Class<T> p0,java.lang.Object... p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> T invokeConstructor(java.lang.Class<T> p0,java.lang.Object... p1) throws java.lang.NoSuchMethodException,java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException,java.lang.InstantiationException{
	return org.apache.commons.beanutils.ConstructorUtils.invokeConstructor(p0,p1);
}
/**
*{@link org.apache.commons.beanutils.ConstructorUtils#invokeConstructor(java.lang.Class<T>,java.lang.Object[],java.lang.Class<?>...)}
*@see org.apache.commons.beanutils.ConstructorUtils#invokeConstructor(java.lang.Class<T>,java.lang.Object[],java.lang.Class<?>...)
*<code>public static <T> T org.apache.commons.beanutils.ConstructorUtils.invokeConstructor(java.lang.Class<T>,java.lang.Object[],java.lang.Class<?>[]) throws java.lang.NoSuchMethodException,java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException,java.lang.InstantiationException
*invokeConstructor(java.lang.Class<T> p0,java.lang.Object[] p1,java.lang.Class<?>... p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> T invokeConstructor(java.lang.Class<T> p0,java.lang.Object[] p1,java.lang.Class<?>... p2) throws java.lang.NoSuchMethodException,java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException,java.lang.InstantiationException{
	return org.apache.commons.beanutils.ConstructorUtils.invokeConstructor(p0,p1,p2);
}
/**
*{@link org.apache.commons.beanutils.ConstructorUtils#invokeConstructor(java.lang.Class<T>,java.lang.Object)}
*@see org.apache.commons.beanutils.ConstructorUtils#invokeConstructor(java.lang.Class<T>,java.lang.Object)
*<code>public static <T> T org.apache.commons.beanutils.ConstructorUtils.invokeConstructor(java.lang.Class<T>,java.lang.Object) throws java.lang.NoSuchMethodException,java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException,java.lang.InstantiationException
*invokeConstructor(java.lang.Class<T> p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> T invokeConstructor(java.lang.Class<T> p0,java.lang.Object p1) throws java.lang.NoSuchMethodException,java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException,java.lang.InstantiationException{
	return org.apache.commons.beanutils.ConstructorUtils.invokeConstructor(p0,p1);
}
/**
*{@link org.apache.commons.beanutils.ConstructorUtils#invokeExactConstructor(java.lang.Class<T>,java.lang.Object[],java.lang.Class<?>...)}
*@see org.apache.commons.beanutils.ConstructorUtils#invokeExactConstructor(java.lang.Class<T>,java.lang.Object[],java.lang.Class<?>...)
*<code>public static <T> T org.apache.commons.beanutils.ConstructorUtils.invokeExactConstructor(java.lang.Class<T>,java.lang.Object[],java.lang.Class<?>[]) throws java.lang.NoSuchMethodException,java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException,java.lang.InstantiationException
*invokeExactConstructor(java.lang.Class<T> p0,java.lang.Object[] p1,java.lang.Class<?>... p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> T invokeExactConstructor(java.lang.Class<T> p0,java.lang.Object[] p1,java.lang.Class<?>... p2) throws java.lang.NoSuchMethodException,java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException,java.lang.InstantiationException{
	return org.apache.commons.beanutils.ConstructorUtils.invokeExactConstructor(p0,p1,p2);
}
/**
*{@link org.apache.commons.beanutils.ConstructorUtils#invokeExactConstructor(java.lang.Class<T>,java.lang.Object)}
*@see org.apache.commons.beanutils.ConstructorUtils#invokeExactConstructor(java.lang.Class<T>,java.lang.Object)
*<code>public static <T> T org.apache.commons.beanutils.ConstructorUtils.invokeExactConstructor(java.lang.Class<T>,java.lang.Object) throws java.lang.NoSuchMethodException,java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException,java.lang.InstantiationException
*invokeExactConstructor(java.lang.Class<T> p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> T invokeExactConstructor(java.lang.Class<T> p0,java.lang.Object p1) throws java.lang.NoSuchMethodException,java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException,java.lang.InstantiationException{
	return org.apache.commons.beanutils.ConstructorUtils.invokeExactConstructor(p0,p1);
}
/**
*{@link org.apache.commons.beanutils.ConstructorUtils#invokeExactConstructor(java.lang.Class<T>,java.lang.Object...)}
*@see org.apache.commons.beanutils.ConstructorUtils#invokeExactConstructor(java.lang.Class<T>,java.lang.Object...)
*<code>public static <T> T org.apache.commons.beanutils.ConstructorUtils.invokeExactConstructor(java.lang.Class<T>,java.lang.Object[]) throws java.lang.NoSuchMethodException,java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException,java.lang.InstantiationException
*invokeExactConstructor(java.lang.Class<T> p0,java.lang.Object... p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> T invokeExactConstructor(java.lang.Class<T> p0,java.lang.Object... p1) throws java.lang.NoSuchMethodException,java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException,java.lang.InstantiationException{
	return org.apache.commons.beanutils.ConstructorUtils.invokeExactConstructor(p0,p1);
}
/**
*{@link org.apache.commons.beanutils.MethodUtils#invokeExactMethod(java.lang.Object,java.lang.String,java.lang.Object...)}
*@see org.apache.commons.beanutils.MethodUtils#invokeExactMethod(java.lang.Object,java.lang.String,java.lang.Object...)
*<code>public static java.lang.Object org.apache.commons.beanutils.MethodUtils.invokeExactMethod(java.lang.Object,java.lang.String,java.lang.Object[]) throws java.lang.NoSuchMethodException,java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException
*invokeExactMethod(java.lang.Object p0,java.lang.String p1,java.lang.Object... p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.Object invokeExactMethod(java.lang.Object p0,java.lang.String p1,java.lang.Object... p2) throws java.lang.NoSuchMethodException,java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException{
	return org.apache.commons.beanutils.MethodUtils.invokeExactMethod(p0,p1,p2);
}
/**
*{@link org.apache.commons.beanutils.MethodUtils#invokeExactMethod(java.lang.Object,java.lang.String,java.lang.Object)}
*@see org.apache.commons.beanutils.MethodUtils#invokeExactMethod(java.lang.Object,java.lang.String,java.lang.Object)
*<code>public static java.lang.Object org.apache.commons.beanutils.MethodUtils.invokeExactMethod(java.lang.Object,java.lang.String,java.lang.Object) throws java.lang.NoSuchMethodException,java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException
*invokeExactMethod(java.lang.Object p0,java.lang.String p1,java.lang.Object p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.Object invokeExactMethod(java.lang.Object p0,java.lang.String p1,java.lang.Object p2) throws java.lang.NoSuchMethodException,java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException{
	return org.apache.commons.beanutils.MethodUtils.invokeExactMethod(p0,p1,p2);
}
/**
*{@link org.apache.commons.beanutils.MethodUtils#invokeExactMethod(java.lang.Object,java.lang.String,java.lang.Object[],java.lang.Class<?>...)}
*@see org.apache.commons.beanutils.MethodUtils#invokeExactMethod(java.lang.Object,java.lang.String,java.lang.Object[],java.lang.Class<?>...)
*<code>public static java.lang.Object org.apache.commons.beanutils.MethodUtils.invokeExactMethod(java.lang.Object,java.lang.String,java.lang.Object[],java.lang.Class<?>[]) throws java.lang.NoSuchMethodException,java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException
*invokeExactMethod(java.lang.Object p0,java.lang.String p1,java.lang.Object[] p2,java.lang.Class<?>... p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.Object invokeExactMethod(java.lang.Object p0,java.lang.String p1,java.lang.Object[] p2,java.lang.Class<?>... p3) throws java.lang.NoSuchMethodException,java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException{
	return org.apache.commons.beanutils.MethodUtils.invokeExactMethod(p0,p1,p2,p3);
}
/**
*{@link org.apache.commons.lang3.reflect.MethodUtils#invokeExactMethod(java.lang.Object,java.lang.String)}
*@see org.apache.commons.lang3.reflect.MethodUtils#invokeExactMethod(java.lang.Object,java.lang.String)
*<code>public static java.lang.Object org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod(java.lang.Object,java.lang.String) throws java.lang.NoSuchMethodException,java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException
*invokeExactMethod(java.lang.Object p0,java.lang.String p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.Object invokeExactMethod(java.lang.Object p0,java.lang.String p1) throws java.lang.NoSuchMethodException,java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException{
	return org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod(p0,p1);
}
/**
*{@link org.apache.commons.beanutils.MethodUtils#invokeExactStaticMethod(java.lang.Class<?>,java.lang.String,java.lang.Object[],java.lang.Class<?>...)}
*@see org.apache.commons.beanutils.MethodUtils#invokeExactStaticMethod(java.lang.Class<?>,java.lang.String,java.lang.Object[],java.lang.Class<?>...)
*<code>public static java.lang.Object org.apache.commons.beanutils.MethodUtils.invokeExactStaticMethod(java.lang.Class<?>,java.lang.String,java.lang.Object[],java.lang.Class<?>[]) throws java.lang.NoSuchMethodException,java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException
*invokeExactStaticMethod(java.lang.Class<?> p0,java.lang.String p1,java.lang.Object[] p2,java.lang.Class<?>... p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.Object invokeExactStaticMethod(java.lang.Class<?> p0,java.lang.String p1,java.lang.Object[] p2,java.lang.Class<?>... p3) throws java.lang.NoSuchMethodException,java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException{
	return org.apache.commons.beanutils.MethodUtils.invokeExactStaticMethod(p0,p1,p2,p3);
}
/**
*{@link org.apache.commons.beanutils.MethodUtils#invokeExactStaticMethod(java.lang.Class<?>,java.lang.String,java.lang.Object...)}
*@see org.apache.commons.beanutils.MethodUtils#invokeExactStaticMethod(java.lang.Class<?>,java.lang.String,java.lang.Object...)
*<code>public static java.lang.Object org.apache.commons.beanutils.MethodUtils.invokeExactStaticMethod(java.lang.Class<?>,java.lang.String,java.lang.Object[]) throws java.lang.NoSuchMethodException,java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException
*invokeExactStaticMethod(java.lang.Class<?> p0,java.lang.String p1,java.lang.Object... p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.Object invokeExactStaticMethod(java.lang.Class<?> p0,java.lang.String p1,java.lang.Object... p2) throws java.lang.NoSuchMethodException,java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException{
	return org.apache.commons.beanutils.MethodUtils.invokeExactStaticMethod(p0,p1,p2);
}
/**
*{@link org.apache.commons.beanutils.MethodUtils#invokeExactStaticMethod(java.lang.Class<?>,java.lang.String,java.lang.Object)}
*@see org.apache.commons.beanutils.MethodUtils#invokeExactStaticMethod(java.lang.Class<?>,java.lang.String,java.lang.Object)
*<code>public static java.lang.Object org.apache.commons.beanutils.MethodUtils.invokeExactStaticMethod(java.lang.Class<?>,java.lang.String,java.lang.Object) throws java.lang.NoSuchMethodException,java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException
*invokeExactStaticMethod(java.lang.Class<?> p0,java.lang.String p1,java.lang.Object p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.Object invokeExactStaticMethod(java.lang.Class<?> p0,java.lang.String p1,java.lang.Object p2) throws java.lang.NoSuchMethodException,java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException{
	return org.apache.commons.beanutils.MethodUtils.invokeExactStaticMethod(p0,p1,p2);
}
/**
*{@link org.apache.commons.beanutils.MethodUtils#invokeMethod(java.lang.Object,java.lang.String,java.lang.Object...)}
*@see org.apache.commons.beanutils.MethodUtils#invokeMethod(java.lang.Object,java.lang.String,java.lang.Object...)
*<code>public static java.lang.Object org.apache.commons.beanutils.MethodUtils.invokeMethod(java.lang.Object,java.lang.String,java.lang.Object[]) throws java.lang.NoSuchMethodException,java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException
*invokeMethod(java.lang.Object p0,java.lang.String p1,java.lang.Object... p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.Object invokeMethod(java.lang.Object p0,java.lang.String p1,java.lang.Object... p2) throws java.lang.NoSuchMethodException,java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException{
	return org.apache.commons.beanutils.MethodUtils.invokeMethod(p0,p1,p2);
}
/**
*{@link org.apache.commons.beanutils.MethodUtils#invokeMethod(java.lang.Object,java.lang.String,java.lang.Object)}
*@see org.apache.commons.beanutils.MethodUtils#invokeMethod(java.lang.Object,java.lang.String,java.lang.Object)
*<code>public static java.lang.Object org.apache.commons.beanutils.MethodUtils.invokeMethod(java.lang.Object,java.lang.String,java.lang.Object) throws java.lang.NoSuchMethodException,java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException
*invokeMethod(java.lang.Object p0,java.lang.String p1,java.lang.Object p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.Object invokeMethod(java.lang.Object p0,java.lang.String p1,java.lang.Object p2) throws java.lang.NoSuchMethodException,java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException{
	return org.apache.commons.beanutils.MethodUtils.invokeMethod(p0,p1,p2);
}
/**
*{@link org.apache.commons.beanutils.MethodUtils#invokeMethod(java.lang.Object,java.lang.String,java.lang.Object[],java.lang.Class<?>...)}
*@see org.apache.commons.beanutils.MethodUtils#invokeMethod(java.lang.Object,java.lang.String,java.lang.Object[],java.lang.Class<?>...)
*<code>public static java.lang.Object org.apache.commons.beanutils.MethodUtils.invokeMethod(java.lang.Object,java.lang.String,java.lang.Object[],java.lang.Class<?>[]) throws java.lang.NoSuchMethodException,java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException
*invokeMethod(java.lang.Object p0,java.lang.String p1,java.lang.Object[] p2,java.lang.Class<?>... p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.Object invokeMethod(java.lang.Object p0,java.lang.String p1,java.lang.Object[] p2,java.lang.Class<?>... p3) throws java.lang.NoSuchMethodException,java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException{
	return org.apache.commons.beanutils.MethodUtils.invokeMethod(p0,p1,p2,p3);
}
/**
*{@link org.apache.commons.lang3.reflect.MethodUtils#invokeMethod(java.lang.Object,java.lang.String)}
*@see org.apache.commons.lang3.reflect.MethodUtils#invokeMethod(java.lang.Object,java.lang.String)
*<code>public static java.lang.Object org.apache.commons.lang3.reflect.MethodUtils.invokeMethod(java.lang.Object,java.lang.String) throws java.lang.NoSuchMethodException,java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException
*invokeMethod(java.lang.Object p0,java.lang.String p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.Object invokeMethod(java.lang.Object p0,java.lang.String p1) throws java.lang.NoSuchMethodException,java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException{
	return org.apache.commons.lang3.reflect.MethodUtils.invokeMethod(p0,p1);
}
/**
*{@link org.apache.commons.lang3.reflect.MethodUtils#invokeMethod(java.lang.Object,boolean,java.lang.String)}
*@see org.apache.commons.lang3.reflect.MethodUtils#invokeMethod(java.lang.Object,boolean,java.lang.String)
*<code>public static java.lang.Object org.apache.commons.lang3.reflect.MethodUtils.invokeMethod(java.lang.Object,boolean,java.lang.String) throws java.lang.NoSuchMethodException,java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException
*invokeMethod(java.lang.Object p0,boolean p1,java.lang.String p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.Object invokeMethod(java.lang.Object p0,boolean p1,java.lang.String p2) throws java.lang.NoSuchMethodException,java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException{
	return org.apache.commons.lang3.reflect.MethodUtils.invokeMethod(p0,p1,p2);
}
/**
*{@link org.apache.commons.lang3.reflect.MethodUtils#invokeMethod(java.lang.Object,boolean,java.lang.String,java.lang.Object...)}
*@see org.apache.commons.lang3.reflect.MethodUtils#invokeMethod(java.lang.Object,boolean,java.lang.String,java.lang.Object...)
*<code>public static java.lang.Object org.apache.commons.lang3.reflect.MethodUtils.invokeMethod(java.lang.Object,boolean,java.lang.String,java.lang.Object...) throws java.lang.NoSuchMethodException,java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException
*invokeMethod(java.lang.Object p0,boolean p1,java.lang.String p2,java.lang.Object... p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.Object invokeMethod(java.lang.Object p0,boolean p1,java.lang.String p2,java.lang.Object... p3) throws java.lang.NoSuchMethodException,java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException{
	return org.apache.commons.lang3.reflect.MethodUtils.invokeMethod(p0,p1,p2,p3);
}
/**
*{@link org.apache.commons.lang3.reflect.MethodUtils#invokeMethod(java.lang.Object,boolean,java.lang.String,java.lang.Object[],java.lang.Class<?>...)}
*@see org.apache.commons.lang3.reflect.MethodUtils#invokeMethod(java.lang.Object,boolean,java.lang.String,java.lang.Object[],java.lang.Class<?>...)
*<code>public static java.lang.Object org.apache.commons.lang3.reflect.MethodUtils.invokeMethod(java.lang.Object,boolean,java.lang.String,java.lang.Object[],java.lang.Class<?>[]) throws java.lang.NoSuchMethodException,java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException
*invokeMethod(java.lang.Object p0,boolean p1,java.lang.String p2,java.lang.Object[] p3,java.lang.Class<?>... p4)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.Object invokeMethod(java.lang.Object p0,boolean p1,java.lang.String p2,java.lang.Object[] p3,java.lang.Class<?>... p4) throws java.lang.NoSuchMethodException,java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException{
	return org.apache.commons.lang3.reflect.MethodUtils.invokeMethod(p0,p1,p2,p3,p4);
}
/**
*{@link org.apache.commons.beanutils.MethodUtils#invokeStaticMethod(java.lang.Class<?>,java.lang.String,java.lang.Object[],java.lang.Class<?>...)}
*@see org.apache.commons.beanutils.MethodUtils#invokeStaticMethod(java.lang.Class<?>,java.lang.String,java.lang.Object[],java.lang.Class<?>...)
*<code>public static java.lang.Object org.apache.commons.beanutils.MethodUtils.invokeStaticMethod(java.lang.Class<?>,java.lang.String,java.lang.Object[],java.lang.Class<?>[]) throws java.lang.NoSuchMethodException,java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException
*invokeStaticMethod(java.lang.Class<?> p0,java.lang.String p1,java.lang.Object[] p2,java.lang.Class<?>... p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.Object invokeStaticMethod(java.lang.Class<?> p0,java.lang.String p1,java.lang.Object[] p2,java.lang.Class<?>... p3) throws java.lang.NoSuchMethodException,java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException{
	return org.apache.commons.beanutils.MethodUtils.invokeStaticMethod(p0,p1,p2,p3);
}
/**
*{@link org.apache.commons.beanutils.MethodUtils#invokeStaticMethod(java.lang.Class<?>,java.lang.String,java.lang.Object...)}
*@see org.apache.commons.beanutils.MethodUtils#invokeStaticMethod(java.lang.Class<?>,java.lang.String,java.lang.Object...)
*<code>public static java.lang.Object org.apache.commons.beanutils.MethodUtils.invokeStaticMethod(java.lang.Class<?>,java.lang.String,java.lang.Object[]) throws java.lang.NoSuchMethodException,java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException
*invokeStaticMethod(java.lang.Class<?> p0,java.lang.String p1,java.lang.Object... p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.Object invokeStaticMethod(java.lang.Class<?> p0,java.lang.String p1,java.lang.Object... p2) throws java.lang.NoSuchMethodException,java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException{
	return org.apache.commons.beanutils.MethodUtils.invokeStaticMethod(p0,p1,p2);
}
/**
*{@link org.apache.commons.beanutils.MethodUtils#invokeStaticMethod(java.lang.Class<?>,java.lang.String,java.lang.Object)}
*@see org.apache.commons.beanutils.MethodUtils#invokeStaticMethod(java.lang.Class<?>,java.lang.String,java.lang.Object)
*<code>public static java.lang.Object org.apache.commons.beanutils.MethodUtils.invokeStaticMethod(java.lang.Class<?>,java.lang.String,java.lang.Object) throws java.lang.NoSuchMethodException,java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException
*invokeStaticMethod(java.lang.Class<?> p0,java.lang.String p1,java.lang.Object p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.Object invokeStaticMethod(java.lang.Class<?> p0,java.lang.String p1,java.lang.Object p2) throws java.lang.NoSuchMethodException,java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException{
	return org.apache.commons.beanutils.MethodUtils.invokeStaticMethod(p0,p1,p2);
}
/**
*{@link org.apache.commons.lang3.ObjectUtils#isEmpty(java.lang.Object)}
*@see org.apache.commons.lang3.ObjectUtils#isEmpty(java.lang.Object)
*<code>public static boolean org.apache.commons.lang3.ObjectUtils.isEmpty(java.lang.Object)
*isEmpty(java.lang.Object p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isEmpty(java.lang.Object p0){
	return org.apache.commons.lang3.ObjectUtils.isEmpty(p0);
}
/**
*{@link org.apache.commons.lang3.ArrayUtils#isEquals(java.lang.Object,java.lang.Object)}
*@see org.apache.commons.lang3.ArrayUtils#isEquals(java.lang.Object,java.lang.Object)
*<code>public static boolean org.apache.commons.lang3.ArrayUtils.isEquals(java.lang.Object,java.lang.Object)
*isEquals(java.lang.Object p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isEquals(java.lang.Object p0,java.lang.Object p1){
	return org.apache.commons.lang3.ArrayUtils.isEquals(p0,p1);
}
/**
*{@link org.apache.commons.lang3.reflect.TypeUtils#isInstance(java.lang.Object,java.lang.reflect.Type)}
*@see org.apache.commons.lang3.reflect.TypeUtils#isInstance(java.lang.Object,java.lang.reflect.Type)
*<code>public static boolean org.apache.commons.lang3.reflect.TypeUtils.isInstance(java.lang.Object,java.lang.reflect.Type)
*isInstance(java.lang.Object p0,java.lang.reflect.Type p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isInstance(java.lang.Object p0,java.lang.reflect.Type p1){
	return org.apache.commons.lang3.reflect.TypeUtils.isInstance(p0,p1);
}
/**
*{@link org.apache.commons.lang3.Validate#isInstanceOf(java.lang.Class<?>,java.lang.Object,java.lang.String,java.lang.Object...)}
*@see org.apache.commons.lang3.Validate#isInstanceOf(java.lang.Class<?>,java.lang.Object,java.lang.String,java.lang.Object...)
*<code>public static void org.apache.commons.lang3.Validate.isInstanceOf(java.lang.Class<?>,java.lang.Object,java.lang.String,java.lang.Object...)
*isInstanceOf(java.lang.Class<?> p0,java.lang.Object p1,java.lang.String p2,java.lang.Object... p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void isInstanceOf(java.lang.Class<?> p0,java.lang.Object p1,java.lang.String p2,java.lang.Object... p3){
	 org.apache.commons.lang3.Validate.isInstanceOf(p0,p1,p2,p3);
}
/**
*{@link org.apache.commons.lang3.Validate#isInstanceOf(java.lang.Class<?>,java.lang.Object)}
*@see org.apache.commons.lang3.Validate#isInstanceOf(java.lang.Class<?>,java.lang.Object)
*<code>public static void org.apache.commons.lang3.Validate.isInstanceOf(java.lang.Class<?>,java.lang.Object)
*isInstanceOf(java.lang.Class<?> p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void isInstanceOf(java.lang.Class<?> p0,java.lang.Object p1){
	 org.apache.commons.lang3.Validate.isInstanceOf(p0,p1);
}
/**
*{@link org.apache.commons.lang3.ObjectUtils#isNotEmpty(java.lang.Object)}
*@see org.apache.commons.lang3.ObjectUtils#isNotEmpty(java.lang.Object)
*<code>public static boolean org.apache.commons.lang3.ObjectUtils.isNotEmpty(java.lang.Object)
*isNotEmpty(java.lang.Object p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isNotEmpty(java.lang.Object p0){
	return org.apache.commons.lang3.ObjectUtils.isNotEmpty(p0);
}
/**
*{@link org.apache.commons.beanutils.PropertyUtils#isReadable(java.lang.Object,java.lang.String)}
*@see org.apache.commons.beanutils.PropertyUtils#isReadable(java.lang.Object,java.lang.String)
*<code>public static boolean org.apache.commons.beanutils.PropertyUtils.isReadable(java.lang.Object,java.lang.String)
*isReadable(java.lang.Object p0,java.lang.String p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isReadable(java.lang.Object p0,java.lang.String p1){
	return org.apache.commons.beanutils.PropertyUtils.isReadable(p0,p1);
}
/**
*{@link org.apache.commons.lang3.ArrayUtils#isSameType(java.lang.Object,java.lang.Object)}
*@see org.apache.commons.lang3.ArrayUtils#isSameType(java.lang.Object,java.lang.Object)
*<code>public static boolean org.apache.commons.lang3.ArrayUtils.isSameType(java.lang.Object,java.lang.Object)
*isSameType(java.lang.Object p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isSameType(java.lang.Object p0,java.lang.Object p1){
	return org.apache.commons.lang3.ArrayUtils.isSameType(p0,p1);
}
/**
*{@link org.apache.commons.io.TaggedIOException#isTaggedWith(java.lang.Throwable,java.lang.Object)}
*@see org.apache.commons.io.TaggedIOException#isTaggedWith(java.lang.Throwable,java.lang.Object)
*<code>public static boolean org.apache.commons.io.TaggedIOException.isTaggedWith(java.lang.Throwable,java.lang.Object)
*isTaggedWith(java.lang.Throwable p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isTaggedWith(java.lang.Throwable p0,java.lang.Object p1){
	return org.apache.commons.io.TaggedIOException.isTaggedWith(p0,p1);
}
/**
*{@link org.apache.commons.beanutils.PropertyUtils#isWriteable(java.lang.Object,java.lang.String)}
*@see org.apache.commons.beanutils.PropertyUtils#isWriteable(java.lang.Object,java.lang.String)
*<code>public static boolean org.apache.commons.beanutils.PropertyUtils.isWriteable(java.lang.Object,java.lang.String)
*isWriteable(java.lang.Object p0,java.lang.String p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isWriteable(java.lang.Object p0,java.lang.String p1){
	return org.apache.commons.beanutils.PropertyUtils.isWriteable(p0,p1);
}
/**
*{@link org.apache.commons.lang3.time.DateUtils#iterator(java.lang.Object,int)}
*@see org.apache.commons.lang3.time.DateUtils#iterator(java.lang.Object,int)
*<code>public static java.util.Iterator<?> org.apache.commons.lang3.time.DateUtils.iterator(java.lang.Object,int)
*iterator(java.lang.Object p0,int p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Iterator<?> iterator(java.lang.Object p0,int p1){
	return org.apache.commons.lang3.time.DateUtils.iterator(p0,p1);
}
/**
*{@link org.apache.commons.lang3.ArrayUtils#lastIndexOf(java.lang.Object[],java.lang.Object)}
*@see org.apache.commons.lang3.ArrayUtils#lastIndexOf(java.lang.Object[],java.lang.Object)
*<code>public static int org.apache.commons.lang3.ArrayUtils.lastIndexOf(java.lang.Object[],java.lang.Object)
*lastIndexOf(java.lang.Object[] p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int lastIndexOf(java.lang.Object[] p0,java.lang.Object p1){
	return org.apache.commons.lang3.ArrayUtils.lastIndexOf(p0,p1);
}
/**
*{@link org.apache.commons.lang3.ArrayUtils#lastIndexOf(java.lang.Object[],java.lang.Object,int)}
*@see org.apache.commons.lang3.ArrayUtils#lastIndexOf(java.lang.Object[],java.lang.Object,int)
*<code>public static int org.apache.commons.lang3.ArrayUtils.lastIndexOf(java.lang.Object[],java.lang.Object,int)
*lastIndexOf(java.lang.Object[] p0,java.lang.Object p1,int p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int lastIndexOf(java.lang.Object[] p0,java.lang.Object p1,int p2){
	return org.apache.commons.lang3.ArrayUtils.lastIndexOf(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#loadObject(java.io.InputStream)}
*@see it.unimi.dsi.fastutil.io.BinIO#loadObject(java.io.InputStream)
*<code>public static java.lang.Object it.unimi.dsi.fastutil.io.BinIO.loadObject(java.io.InputStream) throws java.io.IOException,java.lang.ClassNotFoundException
*loadObject(java.io.InputStream p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.Object loadObject(java.io.InputStream p0) throws java.io.IOException,java.lang.ClassNotFoundException{
	return it.unimi.dsi.fastutil.io.BinIO.loadObject(p0);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#loadObject(java.io.File)}
*@see it.unimi.dsi.fastutil.io.BinIO#loadObject(java.io.File)
*<code>public static java.lang.Object it.unimi.dsi.fastutil.io.BinIO.loadObject(java.io.File) throws java.io.IOException,java.lang.ClassNotFoundException
*loadObject(java.io.File p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.Object loadObject(java.io.File p0) throws java.io.IOException,java.lang.ClassNotFoundException{
	return it.unimi.dsi.fastutil.io.BinIO.loadObject(p0);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#loadObject(java.lang.CharSequence)}
*@see it.unimi.dsi.fastutil.io.BinIO#loadObject(java.lang.CharSequence)
*<code>public static java.lang.Object it.unimi.dsi.fastutil.io.BinIO.loadObject(java.lang.CharSequence) throws java.io.IOException,java.lang.ClassNotFoundException
*loadObject(java.lang.CharSequence p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.Object loadObject(java.lang.CharSequence p0) throws java.io.IOException,java.lang.ClassNotFoundException{
	return it.unimi.dsi.fastutil.io.BinIO.loadObject(p0);
}
/**
*{@link com.facebook.util.TimeUtil#logElapsedTime(java.lang.String,com.facebook.util.ExtCallable<V, E>)}
*@see com.facebook.util.TimeUtil#logElapsedTime(java.lang.String,com.facebook.util.ExtCallable<V, E>)
*<code>public static <V,E> V com.facebook.util.TimeUtil.logElapsedTime(java.lang.String,com.facebook.util.ExtCallable<V, E>) throws E
*logElapsedTime(java.lang.String p0,com.facebook.util.ExtCallable<V, E> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <V,E extends java.lang.Throwable > V logElapsedTime(java.lang.String p0,com.facebook.util.ExtCallable<V, E> p1) throws E{
	return com.facebook.util.TimeUtil.logElapsedTime(p0,p1);
}
/**
*{@link org.apache.commons.collections4.ComparatorUtils#max(E,E,java.util.Comparator<E>)}
*@see org.apache.commons.collections4.ComparatorUtils#max(E,E,java.util.Comparator<E>)
*<code>public static <E> E org.apache.commons.collections4.ComparatorUtils.max(E,E,java.util.Comparator<E>)
*max(E p0,E p1,java.util.Comparator<E> p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E> E max(E p0,E p1,java.util.Comparator<E> p2){
	return org.apache.commons.collections4.ComparatorUtils.max(p0,p1,p2);
}
/**
*{@link org.apache.commons.collections.ComparatorUtils#max(java.lang.Object,java.lang.Object,java.util.Comparator)}
*@see org.apache.commons.collections.ComparatorUtils#max(java.lang.Object,java.lang.Object,java.util.Comparator)
*<code>public static java.lang.Object org.apache.commons.collections.ComparatorUtils.max(java.lang.Object,java.lang.Object,java.util.Comparator)
*max(java.lang.Object p0,java.lang.Object p1,java.util.Comparator p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.Object max(java.lang.Object p0,java.lang.Object p1,java.util.Comparator p2){
	return org.apache.commons.collections.ComparatorUtils.max(p0,p1,p2);
}
/**
*{@link org.apache.commons.lang3.ObjectUtils#median(java.util.Comparator<T>,T...)}
*@see org.apache.commons.lang3.ObjectUtils#median(java.util.Comparator<T>,T...)
*<code>public static <T> T org.apache.commons.lang3.ObjectUtils.median(java.util.Comparator<T>,T...)
*median(java.util.Comparator<T> p0,T... p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> T median(java.util.Comparator<T> p0,T... p1){
	return org.apache.commons.lang3.ObjectUtils.median(p0,p1);
}
/**
*{@link org.apache.commons.collections4.ComparatorUtils#min(E,E,java.util.Comparator<E>)}
*@see org.apache.commons.collections4.ComparatorUtils#min(E,E,java.util.Comparator<E>)
*<code>public static <E> E org.apache.commons.collections4.ComparatorUtils.min(E,E,java.util.Comparator<E>)
*min(E p0,E p1,java.util.Comparator<E> p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E> E min(E p0,E p1,java.util.Comparator<E> p2){
	return org.apache.commons.collections4.ComparatorUtils.min(p0,p1,p2);
}
/**
*{@link org.apache.commons.collections.ComparatorUtils#min(java.lang.Object,java.lang.Object,java.util.Comparator)}
*@see org.apache.commons.collections.ComparatorUtils#min(java.lang.Object,java.lang.Object,java.util.Comparator)
*<code>public static java.lang.Object org.apache.commons.collections.ComparatorUtils.min(java.lang.Object,java.lang.Object,java.util.Comparator)
*min(java.lang.Object p0,java.lang.Object p1,java.util.Comparator p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.Object min(java.lang.Object p0,java.lang.Object p1,java.util.Comparator p2){
	return org.apache.commons.collections.ComparatorUtils.min(p0,p1,p2);
}
/**
*{@link org.apache.commons.lang3.ObjectUtils#mode(T...)}
*@see org.apache.commons.lang3.ObjectUtils#mode(T...)
*<code>public static <T> T org.apache.commons.lang3.ObjectUtils.mode(T...)
*mode(T... p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> T mode(T... p0){
	return org.apache.commons.lang3.ObjectUtils.mode(p0);
}
/**
*{@link org.apache.commons.crypto.utils.ReflectionUtils#newInstance(java.lang.Class<T>,java.lang.Object...)}
*@see org.apache.commons.crypto.utils.ReflectionUtils#newInstance(java.lang.Class<T>,java.lang.Object...)
*<code>public static <T> T org.apache.commons.crypto.utils.ReflectionUtils.newInstance(java.lang.Class<T>,java.lang.Object...)
*newInstance(java.lang.Class<T> p0,java.lang.Object... p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> T newInstance(java.lang.Class<T> p0,java.lang.Object... p1){
	return org.apache.commons.crypto.utils.ReflectionUtils.newInstance(p0,p1);
}
/**
*{@link com.google.common.reflect.Reflection#newProxy(java.lang.Class<T>,java.lang.reflect.InvocationHandler)}
*@see com.google.common.reflect.Reflection#newProxy(java.lang.Class<T>,java.lang.reflect.InvocationHandler)
*<code>public static <T> T com.google.common.reflect.Reflection.newProxy(java.lang.Class<T>,java.lang.reflect.InvocationHandler)
*newProxy(java.lang.Class<T> p0,java.lang.reflect.InvocationHandler p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> T newProxy(java.lang.Class<T> p0,java.lang.reflect.InvocationHandler p1){
	return com.google.common.reflect.Reflection.newProxy(p0,p1);
}
/**
*{@link org.apache.commons.lang3.ObjectUtils#notEqual(java.lang.Object,java.lang.Object)}
*@see org.apache.commons.lang3.ObjectUtils#notEqual(java.lang.Object,java.lang.Object)
*<code>public static boolean org.apache.commons.lang3.ObjectUtils.notEqual(java.lang.Object,java.lang.Object)
*notEqual(java.lang.Object p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean notEqual(java.lang.Object p0,java.lang.Object p1){
	return org.apache.commons.lang3.ObjectUtils.notEqual(p0,p1);
}
/**
*{@link org.apache.commons.lang3.Validate#notNull(T,java.lang.String,java.lang.Object...)}
*@see org.apache.commons.lang3.Validate#notNull(T,java.lang.String,java.lang.Object...)
*<code>public static <T> T org.apache.commons.lang3.Validate.notNull(T,java.lang.String,java.lang.Object...)
*notNull(T p0,java.lang.String p1,java.lang.Object... p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> T notNull(T p0,java.lang.String p1,java.lang.Object... p2){
	return org.apache.commons.lang3.Validate.notNull(p0,p1,p2);
}
/**
*{@link org.apache.commons.lang3.Validate#notNull(T)}
*@see org.apache.commons.lang3.Validate#notNull(T)
*<code>public static <T> T org.apache.commons.lang3.Validate.notNull(T)
*notNull(T p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> T notNull(T p0){
	return org.apache.commons.lang3.Validate.notNull(p0);
}
/**
*{@link org.apache.commons.collections.IteratorUtils#objectGraphIterator(java.lang.Object,org.apache.commons.collections.Transformer)}
*@see org.apache.commons.collections.IteratorUtils#objectGraphIterator(java.lang.Object,org.apache.commons.collections.Transformer)
*<code>public static java.util.Iterator org.apache.commons.collections.IteratorUtils.objectGraphIterator(java.lang.Object,org.apache.commons.collections.Transformer)
*objectGraphIterator(java.lang.Object p0,org.apache.commons.collections.Transformer p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Iterator objectGraphIterator(java.lang.Object p0,org.apache.commons.collections.Transformer p1){
	return org.apache.commons.collections.IteratorUtils.objectGraphIterator(p0,p1);
}
/**
*{@link org.apache.commons.beanutils.BeanUtils#populate(java.lang.Object,java.util.Map<java.lang.String, ?>)}
*@see org.apache.commons.beanutils.BeanUtils#populate(java.lang.Object,java.util.Map<java.lang.String, ?>)
*<code>public static void org.apache.commons.beanutils.BeanUtils.populate(java.lang.Object,java.util.Map<java.lang.String, ?>) throws java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException
*populate(java.lang.Object p0,java.util.Map<java.lang.String, ?> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void populate(java.lang.Object p0,java.util.Map<java.lang.String, ?> p1) throws java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException{
	 org.apache.commons.beanutils.BeanUtils.populate(p0,p1);
}
/**
*{@link org.apache.commons.collections.FactoryUtils#prototypeFactory(java.lang.Object)}
*@see org.apache.commons.collections.FactoryUtils#prototypeFactory(java.lang.Object)
*<code>public static org.apache.commons.collections.Factory org.apache.commons.collections.FactoryUtils.prototypeFactory(java.lang.Object)
*prototypeFactory(java.lang.Object p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.Factory prototypeFactory(java.lang.Object p0){
	return org.apache.commons.collections.FactoryUtils.prototypeFactory(p0);
}
/**
*{@link org.apache.commons.lang3.concurrent.ConcurrentUtils#putIfAbsent(java.util.concurrent.ConcurrentMap<K, V>,K,V)}
*@see org.apache.commons.lang3.concurrent.ConcurrentUtils#putIfAbsent(java.util.concurrent.ConcurrentMap<K, V>,K,V)
*<code>public static <K,V> V org.apache.commons.lang3.concurrent.ConcurrentUtils.putIfAbsent(java.util.concurrent.ConcurrentMap<K, V>,K,V)
*putIfAbsent(java.util.concurrent.ConcurrentMap<K, V> p0,K p1,V p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K,V> V putIfAbsent(java.util.concurrent.ConcurrentMap<K, V> p0,K p1,V p2){
	return org.apache.commons.lang3.concurrent.ConcurrentUtils.putIfAbsent(p0,p1,p2);
}
/**
*{@link java.lang.ref.Reference#reachabilityFence(java.lang.Object)}
*@see java.lang.ref.Reference#reachabilityFence(java.lang.Object)
*<code>public static void java.lang.ref.Reference.reachabilityFence(java.lang.Object)
*reachabilityFence(java.lang.Object p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void reachabilityFence(java.lang.Object p0){
	 java.lang.ref.Reference.reachabilityFence(p0);
}
/**
*{@link com.google.common.io.ByteStreams#readBytes(java.io.InputStream,com.google.common.io.ByteProcessor<T>)}
*@see com.google.common.io.ByteStreams#readBytes(java.io.InputStream,com.google.common.io.ByteProcessor<T>)
*<code>public static <T> T com.google.common.io.ByteStreams.readBytes(java.io.InputStream,com.google.common.io.ByteProcessor<T>) throws java.io.IOException
*readBytes(java.io.InputStream p0,com.google.common.io.ByteProcessor<T> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> T readBytes(java.io.InputStream p0,com.google.common.io.ByteProcessor<T> p1) throws java.io.IOException{
	return com.google.common.io.ByteStreams.readBytes(p0,p1);
}
/**
*{@link com.google.common.io.Files#readBytes(java.io.File,com.google.common.io.ByteProcessor<T>)}
*@see com.google.common.io.Files#readBytes(java.io.File,com.google.common.io.ByteProcessor<T>)
*<code>public static <T> T com.google.common.io.Files.readBytes(java.io.File,com.google.common.io.ByteProcessor<T>) throws java.io.IOException
*readBytes(java.io.File p0,com.google.common.io.ByteProcessor<T> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> T readBytes(java.io.File p0,com.google.common.io.ByteProcessor<T> p1) throws java.io.IOException{
	return com.google.common.io.Files.readBytes(p0,p1);
}
/**
*{@link org.apache.commons.lang3.reflect.FieldUtils#readDeclaredField(java.lang.Object,java.lang.String)}
*@see org.apache.commons.lang3.reflect.FieldUtils#readDeclaredField(java.lang.Object,java.lang.String)
*<code>public static java.lang.Object org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField(java.lang.Object,java.lang.String) throws java.lang.IllegalAccessException
*readDeclaredField(java.lang.Object p0,java.lang.String p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.Object readDeclaredField(java.lang.Object p0,java.lang.String p1) throws java.lang.IllegalAccessException{
	return org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField(p0,p1);
}
/**
*{@link org.apache.commons.lang3.reflect.FieldUtils#readDeclaredField(java.lang.Object,java.lang.String,boolean)}
*@see org.apache.commons.lang3.reflect.FieldUtils#readDeclaredField(java.lang.Object,java.lang.String,boolean)
*<code>public static java.lang.Object org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField(java.lang.Object,java.lang.String,boolean) throws java.lang.IllegalAccessException
*readDeclaredField(java.lang.Object p0,java.lang.String p1,boolean p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.Object readDeclaredField(java.lang.Object p0,java.lang.String p1,boolean p2) throws java.lang.IllegalAccessException{
	return org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField(p0,p1,p2);
}
/**
*{@link org.apache.commons.lang3.reflect.FieldUtils#readDeclaredStaticField(java.lang.Class<?>,java.lang.String)}
*@see org.apache.commons.lang3.reflect.FieldUtils#readDeclaredStaticField(java.lang.Class<?>,java.lang.String)
*<code>public static java.lang.Object org.apache.commons.lang3.reflect.FieldUtils.readDeclaredStaticField(java.lang.Class<?>,java.lang.String) throws java.lang.IllegalAccessException
*readDeclaredStaticField(java.lang.Class<?> p0,java.lang.String p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.Object readDeclaredStaticField(java.lang.Class<?> p0,java.lang.String p1) throws java.lang.IllegalAccessException{
	return org.apache.commons.lang3.reflect.FieldUtils.readDeclaredStaticField(p0,p1);
}
/**
*{@link org.apache.commons.lang3.reflect.FieldUtils#readDeclaredStaticField(java.lang.Class<?>,java.lang.String,boolean)}
*@see org.apache.commons.lang3.reflect.FieldUtils#readDeclaredStaticField(java.lang.Class<?>,java.lang.String,boolean)
*<code>public static java.lang.Object org.apache.commons.lang3.reflect.FieldUtils.readDeclaredStaticField(java.lang.Class<?>,java.lang.String,boolean) throws java.lang.IllegalAccessException
*readDeclaredStaticField(java.lang.Class<?> p0,java.lang.String p1,boolean p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.Object readDeclaredStaticField(java.lang.Class<?> p0,java.lang.String p1,boolean p2) throws java.lang.IllegalAccessException{
	return org.apache.commons.lang3.reflect.FieldUtils.readDeclaredStaticField(p0,p1,p2);
}
/**
*{@link org.apache.commons.lang3.reflect.FieldUtils#readField(java.lang.Object,java.lang.String,boolean)}
*@see org.apache.commons.lang3.reflect.FieldUtils#readField(java.lang.Object,java.lang.String,boolean)
*<code>public static java.lang.Object org.apache.commons.lang3.reflect.FieldUtils.readField(java.lang.Object,java.lang.String,boolean) throws java.lang.IllegalAccessException
*readField(java.lang.Object p0,java.lang.String p1,boolean p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.Object readField(java.lang.Object p0,java.lang.String p1,boolean p2) throws java.lang.IllegalAccessException{
	return org.apache.commons.lang3.reflect.FieldUtils.readField(p0,p1,p2);
}
/**
*{@link org.apache.commons.lang3.reflect.FieldUtils#readField(java.lang.reflect.Field,java.lang.Object,boolean)}
*@see org.apache.commons.lang3.reflect.FieldUtils#readField(java.lang.reflect.Field,java.lang.Object,boolean)
*<code>public static java.lang.Object org.apache.commons.lang3.reflect.FieldUtils.readField(java.lang.reflect.Field,java.lang.Object,boolean) throws java.lang.IllegalAccessException
*readField(java.lang.reflect.Field p0,java.lang.Object p1,boolean p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.Object readField(java.lang.reflect.Field p0,java.lang.Object p1,boolean p2) throws java.lang.IllegalAccessException{
	return org.apache.commons.lang3.reflect.FieldUtils.readField(p0,p1,p2);
}
/**
*{@link org.apache.commons.lang3.reflect.FieldUtils#readField(java.lang.reflect.Field,java.lang.Object)}
*@see org.apache.commons.lang3.reflect.FieldUtils#readField(java.lang.reflect.Field,java.lang.Object)
*<code>public static java.lang.Object org.apache.commons.lang3.reflect.FieldUtils.readField(java.lang.reflect.Field,java.lang.Object) throws java.lang.IllegalAccessException
*readField(java.lang.reflect.Field p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.Object readField(java.lang.reflect.Field p0,java.lang.Object p1) throws java.lang.IllegalAccessException{
	return org.apache.commons.lang3.reflect.FieldUtils.readField(p0,p1);
}
/**
*{@link org.apache.commons.lang3.reflect.FieldUtils#readField(java.lang.Object,java.lang.String)}
*@see org.apache.commons.lang3.reflect.FieldUtils#readField(java.lang.Object,java.lang.String)
*<code>public static java.lang.Object org.apache.commons.lang3.reflect.FieldUtils.readField(java.lang.Object,java.lang.String) throws java.lang.IllegalAccessException
*readField(java.lang.Object p0,java.lang.String p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.Object readField(java.lang.Object p0,java.lang.String p1) throws java.lang.IllegalAccessException{
	return org.apache.commons.lang3.reflect.FieldUtils.readField(p0,p1);
}
/**
*{@link com.google.common.io.CharStreams#readLines(java.lang.Readable,com.google.common.io.LineProcessor<T>)}
*@see com.google.common.io.CharStreams#readLines(java.lang.Readable,com.google.common.io.LineProcessor<T>)
*<code>public static <T> T com.google.common.io.CharStreams.readLines(java.lang.Readable,com.google.common.io.LineProcessor<T>) throws java.io.IOException
*readLines(java.lang.Readable p0,com.google.common.io.LineProcessor<T> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> T readLines(java.lang.Readable p0,com.google.common.io.LineProcessor<T> p1) throws java.io.IOException{
	return com.google.common.io.CharStreams.readLines(p0,p1);
}
/**
*{@link com.google.common.io.Files#readLines(java.io.File,java.nio.charset.Charset,com.google.common.io.LineProcessor<T>)}
*@see com.google.common.io.Files#readLines(java.io.File,java.nio.charset.Charset,com.google.common.io.LineProcessor<T>)
*<code>public static <T> T com.google.common.io.Files.readLines(java.io.File,java.nio.charset.Charset,com.google.common.io.LineProcessor<T>) throws java.io.IOException
*readLines(java.io.File p0,java.nio.charset.Charset p1,com.google.common.io.LineProcessor<T> p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> T readLines(java.io.File p0,java.nio.charset.Charset p1,com.google.common.io.LineProcessor<T> p2) throws java.io.IOException{
	return com.google.common.io.Files.readLines(p0,p1,p2);
}
/**
*{@link com.google.common.io.Resources#readLines(java.net.URL,java.nio.charset.Charset,com.google.common.io.LineProcessor<T>)}
*@see com.google.common.io.Resources#readLines(java.net.URL,java.nio.charset.Charset,com.google.common.io.LineProcessor<T>)
*<code>public static <T> T com.google.common.io.Resources.readLines(java.net.URL,java.nio.charset.Charset,com.google.common.io.LineProcessor<T>) throws java.io.IOException
*readLines(java.net.URL p0,java.nio.charset.Charset p1,com.google.common.io.LineProcessor<T> p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> T readLines(java.net.URL p0,java.nio.charset.Charset p1,com.google.common.io.LineProcessor<T> p2) throws java.io.IOException{
	return com.google.common.io.Resources.readLines(p0,p1,p2);
}
/**
*{@link org.apache.commons.lang3.reflect.FieldUtils#readStaticField(java.lang.reflect.Field,boolean)}
*@see org.apache.commons.lang3.reflect.FieldUtils#readStaticField(java.lang.reflect.Field,boolean)
*<code>public static java.lang.Object org.apache.commons.lang3.reflect.FieldUtils.readStaticField(java.lang.reflect.Field,boolean) throws java.lang.IllegalAccessException
*readStaticField(java.lang.reflect.Field p0,boolean p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.Object readStaticField(java.lang.reflect.Field p0,boolean p1) throws java.lang.IllegalAccessException{
	return org.apache.commons.lang3.reflect.FieldUtils.readStaticField(p0,p1);
}
/**
*{@link org.apache.commons.lang3.reflect.FieldUtils#readStaticField(java.lang.reflect.Field)}
*@see org.apache.commons.lang3.reflect.FieldUtils#readStaticField(java.lang.reflect.Field)
*<code>public static java.lang.Object org.apache.commons.lang3.reflect.FieldUtils.readStaticField(java.lang.reflect.Field) throws java.lang.IllegalAccessException
*readStaticField(java.lang.reflect.Field p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.Object readStaticField(java.lang.reflect.Field p0) throws java.lang.IllegalAccessException{
	return org.apache.commons.lang3.reflect.FieldUtils.readStaticField(p0);
}
/**
*{@link org.apache.commons.lang3.reflect.FieldUtils#readStaticField(java.lang.Class<?>,java.lang.String,boolean)}
*@see org.apache.commons.lang3.reflect.FieldUtils#readStaticField(java.lang.Class<?>,java.lang.String,boolean)
*<code>public static java.lang.Object org.apache.commons.lang3.reflect.FieldUtils.readStaticField(java.lang.Class<?>,java.lang.String,boolean) throws java.lang.IllegalAccessException
*readStaticField(java.lang.Class<?> p0,java.lang.String p1,boolean p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.Object readStaticField(java.lang.Class<?> p0,java.lang.String p1,boolean p2) throws java.lang.IllegalAccessException{
	return org.apache.commons.lang3.reflect.FieldUtils.readStaticField(p0,p1,p2);
}
/**
*{@link org.apache.commons.lang3.reflect.FieldUtils#readStaticField(java.lang.Class<?>,java.lang.String)}
*@see org.apache.commons.lang3.reflect.FieldUtils#readStaticField(java.lang.Class<?>,java.lang.String)
*<code>public static java.lang.Object org.apache.commons.lang3.reflect.FieldUtils.readStaticField(java.lang.Class<?>,java.lang.String) throws java.lang.IllegalAccessException
*readStaticField(java.lang.Class<?> p0,java.lang.String p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.Object readStaticField(java.lang.Class<?> p0,java.lang.String p1) throws java.lang.IllegalAccessException{
	return org.apache.commons.lang3.reflect.FieldUtils.readStaticField(p0,p1);
}
/**
*{@link org.apache.commons.lang3.builder.CompareToBuilder#reflectionCompare(java.lang.Object,java.lang.Object)}
*@see org.apache.commons.lang3.builder.CompareToBuilder#reflectionCompare(java.lang.Object,java.lang.Object)
*<code>public static int org.apache.commons.lang3.builder.CompareToBuilder.reflectionCompare(java.lang.Object,java.lang.Object)
*reflectionCompare(java.lang.Object p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int reflectionCompare(java.lang.Object p0,java.lang.Object p1){
	return org.apache.commons.lang3.builder.CompareToBuilder.reflectionCompare(p0,p1);
}
/**
*{@link org.apache.commons.lang3.builder.CompareToBuilder#reflectionCompare(java.lang.Object,java.lang.Object,java.util.Collection<java.lang.String>)}
*@see org.apache.commons.lang3.builder.CompareToBuilder#reflectionCompare(java.lang.Object,java.lang.Object,java.util.Collection<java.lang.String>)
*<code>public static int org.apache.commons.lang3.builder.CompareToBuilder.reflectionCompare(java.lang.Object,java.lang.Object,java.util.Collection<java.lang.String>)
*reflectionCompare(java.lang.Object p0,java.lang.Object p1,java.util.Collection<java.lang.String> p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int reflectionCompare(java.lang.Object p0,java.lang.Object p1,java.util.Collection<java.lang.String> p2){
	return org.apache.commons.lang3.builder.CompareToBuilder.reflectionCompare(p0,p1,p2);
}
/**
*{@link org.apache.commons.lang3.builder.CompareToBuilder#reflectionCompare(java.lang.Object,java.lang.Object,java.lang.String...)}
*@see org.apache.commons.lang3.builder.CompareToBuilder#reflectionCompare(java.lang.Object,java.lang.Object,java.lang.String...)
*<code>public static int org.apache.commons.lang3.builder.CompareToBuilder.reflectionCompare(java.lang.Object,java.lang.Object,java.lang.String...)
*reflectionCompare(java.lang.Object p0,java.lang.Object p1,java.lang.String... p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int reflectionCompare(java.lang.Object p0,java.lang.Object p1,java.lang.String... p2){
	return org.apache.commons.lang3.builder.CompareToBuilder.reflectionCompare(p0,p1,p2);
}
/**
*{@link org.apache.commons.lang3.builder.CompareToBuilder#reflectionCompare(java.lang.Object,java.lang.Object,boolean,java.lang.Class<?>,java.lang.String...)}
*@see org.apache.commons.lang3.builder.CompareToBuilder#reflectionCompare(java.lang.Object,java.lang.Object,boolean,java.lang.Class<?>,java.lang.String...)
*<code>public static int org.apache.commons.lang3.builder.CompareToBuilder.reflectionCompare(java.lang.Object,java.lang.Object,boolean,java.lang.Class<?>,java.lang.String...)
*reflectionCompare(java.lang.Object p0,java.lang.Object p1,boolean p2,java.lang.Class<?> p3,java.lang.String... p4)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int reflectionCompare(java.lang.Object p0,java.lang.Object p1,boolean p2,java.lang.Class<?> p3,java.lang.String... p4){
	return org.apache.commons.lang3.builder.CompareToBuilder.reflectionCompare(p0,p1,p2,p3,p4);
}
/**
*{@link org.apache.commons.lang3.builder.CompareToBuilder#reflectionCompare(java.lang.Object,java.lang.Object,boolean)}
*@see org.apache.commons.lang3.builder.CompareToBuilder#reflectionCompare(java.lang.Object,java.lang.Object,boolean)
*<code>public static int org.apache.commons.lang3.builder.CompareToBuilder.reflectionCompare(java.lang.Object,java.lang.Object,boolean)
*reflectionCompare(java.lang.Object p0,java.lang.Object p1,boolean p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int reflectionCompare(java.lang.Object p0,java.lang.Object p1,boolean p2){
	return org.apache.commons.lang3.builder.CompareToBuilder.reflectionCompare(p0,p1,p2);
}
/**
*{@link org.apache.commons.lang3.builder.EqualsBuilder#reflectionEquals(java.lang.Object,java.lang.Object,java.util.Collection<java.lang.String>)}
*@see org.apache.commons.lang3.builder.EqualsBuilder#reflectionEquals(java.lang.Object,java.lang.Object,java.util.Collection<java.lang.String>)
*<code>public static boolean org.apache.commons.lang3.builder.EqualsBuilder.reflectionEquals(java.lang.Object,java.lang.Object,java.util.Collection<java.lang.String>)
*reflectionEquals(java.lang.Object p0,java.lang.Object p1,java.util.Collection<java.lang.String> p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean reflectionEquals(java.lang.Object p0,java.lang.Object p1,java.util.Collection<java.lang.String> p2){
	return org.apache.commons.lang3.builder.EqualsBuilder.reflectionEquals(p0,p1,p2);
}
/**
*{@link org.apache.commons.lang3.builder.EqualsBuilder#reflectionEquals(java.lang.Object,java.lang.Object,boolean,java.lang.Class<?>,java.lang.String...)}
*@see org.apache.commons.lang3.builder.EqualsBuilder#reflectionEquals(java.lang.Object,java.lang.Object,boolean,java.lang.Class<?>,java.lang.String...)
*<code>public static boolean org.apache.commons.lang3.builder.EqualsBuilder.reflectionEquals(java.lang.Object,java.lang.Object,boolean,java.lang.Class<?>,java.lang.String...)
*reflectionEquals(java.lang.Object p0,java.lang.Object p1,boolean p2,java.lang.Class<?> p3,java.lang.String... p4)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean reflectionEquals(java.lang.Object p0,java.lang.Object p1,boolean p2,java.lang.Class<?> p3,java.lang.String... p4){
	return org.apache.commons.lang3.builder.EqualsBuilder.reflectionEquals(p0,p1,p2,p3,p4);
}
/**
*{@link org.apache.commons.lang3.builder.EqualsBuilder#reflectionEquals(java.lang.Object,java.lang.Object,boolean,java.lang.Class<?>,boolean,java.lang.String...)}
*@see org.apache.commons.lang3.builder.EqualsBuilder#reflectionEquals(java.lang.Object,java.lang.Object,boolean,java.lang.Class<?>,boolean,java.lang.String...)
*<code>public static boolean org.apache.commons.lang3.builder.EqualsBuilder.reflectionEquals(java.lang.Object,java.lang.Object,boolean,java.lang.Class<?>,boolean,java.lang.String...)
*reflectionEquals(java.lang.Object p0,java.lang.Object p1,boolean p2,java.lang.Class<?> p3,boolean p4,java.lang.String... p5)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean reflectionEquals(java.lang.Object p0,java.lang.Object p1,boolean p2,java.lang.Class<?> p3,boolean p4,java.lang.String... p5){
	return org.apache.commons.lang3.builder.EqualsBuilder.reflectionEquals(p0,p1,p2,p3,p4,p5);
}
/**
*{@link org.apache.commons.lang3.builder.EqualsBuilder#reflectionEquals(java.lang.Object,java.lang.Object,boolean)}
*@see org.apache.commons.lang3.builder.EqualsBuilder#reflectionEquals(java.lang.Object,java.lang.Object,boolean)
*<code>public static boolean org.apache.commons.lang3.builder.EqualsBuilder.reflectionEquals(java.lang.Object,java.lang.Object,boolean)
*reflectionEquals(java.lang.Object p0,java.lang.Object p1,boolean p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean reflectionEquals(java.lang.Object p0,java.lang.Object p1,boolean p2){
	return org.apache.commons.lang3.builder.EqualsBuilder.reflectionEquals(p0,p1,p2);
}
/**
*{@link org.apache.commons.lang3.builder.EqualsBuilder#reflectionEquals(java.lang.Object,java.lang.Object,java.lang.String...)}
*@see org.apache.commons.lang3.builder.EqualsBuilder#reflectionEquals(java.lang.Object,java.lang.Object,java.lang.String...)
*<code>public static boolean org.apache.commons.lang3.builder.EqualsBuilder.reflectionEquals(java.lang.Object,java.lang.Object,java.lang.String...)
*reflectionEquals(java.lang.Object p0,java.lang.Object p1,java.lang.String... p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean reflectionEquals(java.lang.Object p0,java.lang.Object p1,java.lang.String... p2){
	return org.apache.commons.lang3.builder.EqualsBuilder.reflectionEquals(p0,p1,p2);
}
/**
*{@link org.apache.commons.lang3.builder.HashCodeBuilder#reflectionHashCode(int,int,java.lang.Object)}
*@see org.apache.commons.lang3.builder.HashCodeBuilder#reflectionHashCode(int,int,java.lang.Object)
*<code>public static int org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(int,int,java.lang.Object)
*reflectionHashCode(int p0,int p1,java.lang.Object p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int reflectionHashCode(int p0,int p1,java.lang.Object p2){
	return org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(p0,p1,p2);
}
/**
*{@link org.apache.commons.lang3.builder.HashCodeBuilder#reflectionHashCode(java.lang.Object,java.util.Collection<java.lang.String>)}
*@see org.apache.commons.lang3.builder.HashCodeBuilder#reflectionHashCode(java.lang.Object,java.util.Collection<java.lang.String>)
*<code>public static int org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(java.lang.Object,java.util.Collection<java.lang.String>)
*reflectionHashCode(java.lang.Object p0,java.util.Collection<java.lang.String> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int reflectionHashCode(java.lang.Object p0,java.util.Collection<java.lang.String> p1){
	return org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(p0,p1);
}
/**
*{@link org.apache.commons.lang3.builder.HashCodeBuilder#reflectionHashCode(java.lang.Object,boolean)}
*@see org.apache.commons.lang3.builder.HashCodeBuilder#reflectionHashCode(java.lang.Object,boolean)
*<code>public static int org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(java.lang.Object,boolean)
*reflectionHashCode(java.lang.Object p0,boolean p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int reflectionHashCode(java.lang.Object p0,boolean p1){
	return org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(p0,p1);
}
/**
*{@link org.apache.commons.lang3.builder.HashCodeBuilder#reflectionHashCode(java.lang.Object,java.lang.String...)}
*@see org.apache.commons.lang3.builder.HashCodeBuilder#reflectionHashCode(java.lang.Object,java.lang.String...)
*<code>public static int org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(java.lang.Object,java.lang.String...)
*reflectionHashCode(java.lang.Object p0,java.lang.String... p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int reflectionHashCode(java.lang.Object p0,java.lang.String... p1){
	return org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(p0,p1);
}
/**
*{@link org.apache.commons.lang3.builder.HashCodeBuilder#reflectionHashCode(int,int,java.lang.Object,boolean)}
*@see org.apache.commons.lang3.builder.HashCodeBuilder#reflectionHashCode(int,int,java.lang.Object,boolean)
*<code>public static int org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(int,int,java.lang.Object,boolean)
*reflectionHashCode(int p0,int p1,java.lang.Object p2,boolean p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int reflectionHashCode(int p0,int p1,java.lang.Object p2,boolean p3){
	return org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(p0,p1,p2,p3);
}
/**
*{@link org.apache.commons.lang3.builder.ToStringBuilder#reflectionToString(java.lang.Object,org.apache.commons.lang3.builder.ToStringStyle)}
*@see org.apache.commons.lang3.builder.ToStringBuilder#reflectionToString(java.lang.Object,org.apache.commons.lang3.builder.ToStringStyle)
*<code>public static java.lang.String org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString(java.lang.Object,org.apache.commons.lang3.builder.ToStringStyle)
*reflectionToString(java.lang.Object p0,org.apache.commons.lang3.builder.ToStringStyle p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.String reflectionToString(java.lang.Object p0,org.apache.commons.lang3.builder.ToStringStyle p1){
	return org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString(p0,p1);
}
/**
*{@link org.apache.commons.lang3.builder.ToStringBuilder#reflectionToString(java.lang.Object,org.apache.commons.lang3.builder.ToStringStyle,boolean)}
*@see org.apache.commons.lang3.builder.ToStringBuilder#reflectionToString(java.lang.Object,org.apache.commons.lang3.builder.ToStringStyle,boolean)
*<code>public static java.lang.String org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString(java.lang.Object,org.apache.commons.lang3.builder.ToStringStyle,boolean)
*reflectionToString(java.lang.Object p0,org.apache.commons.lang3.builder.ToStringStyle p1,boolean p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.String reflectionToString(java.lang.Object p0,org.apache.commons.lang3.builder.ToStringStyle p1,boolean p2){
	return org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString(p0,p1,p2);
}
/**
*{@link org.apache.commons.lang3.builder.ToStringBuilder#reflectionToString(java.lang.Object)}
*@see org.apache.commons.lang3.builder.ToStringBuilder#reflectionToString(java.lang.Object)
*<code>public static java.lang.String org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString(java.lang.Object)
*reflectionToString(java.lang.Object p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.String reflectionToString(java.lang.Object p0){
	return org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString(p0);
}
/**
*{@link org.apache.commons.lang3.ArrayUtils#removeElement(T[],java.lang.Object)}
*@see org.apache.commons.lang3.ArrayUtils#removeElement(T[],java.lang.Object)
*<code>public static <T> T[] org.apache.commons.lang3.ArrayUtils.removeElement(T[],java.lang.Object)
*removeElement(T[] p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> T[] removeElement(T[] p0,java.lang.Object p1){
	return org.apache.commons.lang3.ArrayUtils.removeElement(p0,p1);
}
/**
*{@link org.apache.commons.lang3.text.StrSubstitutor#replace(java.lang.Object,java.util.Map<java.lang.String, V>)}
*@see org.apache.commons.lang3.text.StrSubstitutor#replace(java.lang.Object,java.util.Map<java.lang.String, V>)
*<code>public static <V> java.lang.String org.apache.commons.lang3.text.StrSubstitutor.replace(java.lang.Object,java.util.Map<java.lang.String, V>)
*replace(java.lang.Object p0,java.util.Map<java.lang.String, V> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <V> java.lang.String replace(java.lang.Object p0,java.util.Map<java.lang.String, V> p1){
	return org.apache.commons.lang3.text.StrSubstitutor.replace(p0,p1);
}
/**
*{@link org.apache.commons.lang3.text.StrSubstitutor#replace(java.lang.Object,java.util.Properties)}
*@see org.apache.commons.lang3.text.StrSubstitutor#replace(java.lang.Object,java.util.Properties)
*<code>public static java.lang.String org.apache.commons.lang3.text.StrSubstitutor.replace(java.lang.Object,java.util.Properties)
*replace(java.lang.Object p0,java.util.Properties p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.String replace(java.lang.Object p0,java.util.Properties p1){
	return org.apache.commons.lang3.text.StrSubstitutor.replace(p0,p1);
}
/**
*{@link org.apache.commons.lang3.text.StrSubstitutor#replace(java.lang.Object,java.util.Map<java.lang.String, V>,java.lang.String,java.lang.String)}
*@see org.apache.commons.lang3.text.StrSubstitutor#replace(java.lang.Object,java.util.Map<java.lang.String, V>,java.lang.String,java.lang.String)
*<code>public static <V> java.lang.String org.apache.commons.lang3.text.StrSubstitutor.replace(java.lang.Object,java.util.Map<java.lang.String, V>,java.lang.String,java.lang.String)
*replace(java.lang.Object p0,java.util.Map<java.lang.String, V> p1,java.lang.String p2,java.lang.String p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <V> java.lang.String replace(java.lang.Object p0,java.util.Map<java.lang.String, V> p1,java.lang.String p2,java.lang.String p3){
	return org.apache.commons.lang3.text.StrSubstitutor.replace(p0,p1,p2,p3);
}
/**
*{@link org.apache.commons.lang3.text.StrSubstitutor#replaceSystemProperties(java.lang.Object)}
*@see org.apache.commons.lang3.text.StrSubstitutor#replaceSystemProperties(java.lang.Object)
*<code>public static java.lang.String org.apache.commons.lang3.text.StrSubstitutor.replaceSystemProperties(java.lang.Object)
*replaceSystemProperties(java.lang.Object p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.String replaceSystemProperties(java.lang.Object p0){
	return org.apache.commons.lang3.text.StrSubstitutor.replaceSystemProperties(p0);
}
/**
*{@link org.apache.commons.lang3.exception.ExceptionUtils#rethrow(java.lang.Throwable)}
*@see org.apache.commons.lang3.exception.ExceptionUtils#rethrow(java.lang.Throwable)
*<code>public static <R> R org.apache.commons.lang3.exception.ExceptionUtils.rethrow(java.lang.Throwable)
*rethrow(java.lang.Throwable p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <R> R rethrow(java.lang.Throwable p0){
	return org.apache.commons.lang3.exception.ExceptionUtils.rethrow(p0);
}
/**
*{@link org.apache.commons.lang3.time.DateUtils#round(java.lang.Object,int)}
*@see org.apache.commons.lang3.time.DateUtils#round(java.lang.Object,int)
*<code>public static java.util.Date org.apache.commons.lang3.time.DateUtils.round(java.lang.Object,int)
*round(java.lang.Object p0,int p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Date round(java.lang.Object p0,int p1){
	return org.apache.commons.lang3.time.DateUtils.round(p0,p1);
}
/**
*{@link org.apache.commons.collections4.MapUtils#safeAddToMap(java.util.Map<? super K, java.lang.Object>,K,java.lang.Object)}
*@see org.apache.commons.collections4.MapUtils#safeAddToMap(java.util.Map<? super K, java.lang.Object>,K,java.lang.Object)
*<code>public static <K> void org.apache.commons.collections4.MapUtils.safeAddToMap(java.util.Map<? super K, java.lang.Object>,K,java.lang.Object) throws java.lang.NullPointerException
*safeAddToMap(java.util.Map<? super K, java.lang.Object> p0,K p1,java.lang.Object p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K> void safeAddToMap(java.util.Map<? super K, java.lang.Object> p0,K p1,java.lang.Object p2) throws java.lang.NullPointerException{
	 org.apache.commons.collections4.MapUtils.safeAddToMap(p0,p1,p2);
}
/**
*{@link org.apache.commons.collections.MapUtils#safeAddToMap(java.util.Map,java.lang.Object,java.lang.Object)}
*@see org.apache.commons.collections.MapUtils#safeAddToMap(java.util.Map,java.lang.Object,java.lang.Object)
*<code>public static void org.apache.commons.collections.MapUtils.safeAddToMap(java.util.Map,java.lang.Object,java.lang.Object) throws java.lang.NullPointerException
*safeAddToMap(java.util.Map p0,java.lang.Object p1,java.lang.Object p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void safeAddToMap(java.util.Map p0,java.lang.Object p1,java.lang.Object p2) throws java.lang.NullPointerException{
	 org.apache.commons.collections.MapUtils.safeAddToMap(p0,p1,p2);
}
/**
*{@link org.apache.commons.beanutils.PropertyUtils#setIndexedProperty(java.lang.Object,java.lang.String,int,java.lang.Object)}
*@see org.apache.commons.beanutils.PropertyUtils#setIndexedProperty(java.lang.Object,java.lang.String,int,java.lang.Object)
*<code>public static void org.apache.commons.beanutils.PropertyUtils.setIndexedProperty(java.lang.Object,java.lang.String,int,java.lang.Object) throws java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException,java.lang.NoSuchMethodException
*setIndexedProperty(java.lang.Object p0,java.lang.String p1,int p2,java.lang.Object p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void setIndexedProperty(java.lang.Object p0,java.lang.String p1,int p2,java.lang.Object p3) throws java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException,java.lang.NoSuchMethodException{
	 org.apache.commons.beanutils.PropertyUtils.setIndexedProperty(p0,p1,p2,p3);
}
/**
*{@link org.apache.commons.beanutils.PropertyUtils#setIndexedProperty(java.lang.Object,java.lang.String,java.lang.Object)}
*@see org.apache.commons.beanutils.PropertyUtils#setIndexedProperty(java.lang.Object,java.lang.String,java.lang.Object)
*<code>public static void org.apache.commons.beanutils.PropertyUtils.setIndexedProperty(java.lang.Object,java.lang.String,java.lang.Object) throws java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException,java.lang.NoSuchMethodException
*setIndexedProperty(java.lang.Object p0,java.lang.String p1,java.lang.Object p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void setIndexedProperty(java.lang.Object p0,java.lang.String p1,java.lang.Object p2) throws java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException,java.lang.NoSuchMethodException{
	 org.apache.commons.beanutils.PropertyUtils.setIndexedProperty(p0,p1,p2);
}
/**
*{@link org.apache.commons.beanutils.PropertyUtils#setMappedProperty(java.lang.Object,java.lang.String,java.lang.String,java.lang.Object)}
*@see org.apache.commons.beanutils.PropertyUtils#setMappedProperty(java.lang.Object,java.lang.String,java.lang.String,java.lang.Object)
*<code>public static void org.apache.commons.beanutils.PropertyUtils.setMappedProperty(java.lang.Object,java.lang.String,java.lang.String,java.lang.Object) throws java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException,java.lang.NoSuchMethodException
*setMappedProperty(java.lang.Object p0,java.lang.String p1,java.lang.String p2,java.lang.Object p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void setMappedProperty(java.lang.Object p0,java.lang.String p1,java.lang.String p2,java.lang.Object p3) throws java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException,java.lang.NoSuchMethodException{
	 org.apache.commons.beanutils.PropertyUtils.setMappedProperty(p0,p1,p2,p3);
}
/**
*{@link org.apache.commons.beanutils.PropertyUtils#setMappedProperty(java.lang.Object,java.lang.String,java.lang.Object)}
*@see org.apache.commons.beanutils.PropertyUtils#setMappedProperty(java.lang.Object,java.lang.String,java.lang.Object)
*<code>public static void org.apache.commons.beanutils.PropertyUtils.setMappedProperty(java.lang.Object,java.lang.String,java.lang.Object) throws java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException,java.lang.NoSuchMethodException
*setMappedProperty(java.lang.Object p0,java.lang.String p1,java.lang.Object p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void setMappedProperty(java.lang.Object p0,java.lang.String p1,java.lang.Object p2) throws java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException,java.lang.NoSuchMethodException{
	 org.apache.commons.beanutils.PropertyUtils.setMappedProperty(p0,p1,p2);
}
/**
*{@link org.apache.commons.beanutils.PropertyUtils#setNestedProperty(java.lang.Object,java.lang.String,java.lang.Object)}
*@see org.apache.commons.beanutils.PropertyUtils#setNestedProperty(java.lang.Object,java.lang.String,java.lang.Object)
*<code>public static void org.apache.commons.beanutils.PropertyUtils.setNestedProperty(java.lang.Object,java.lang.String,java.lang.Object) throws java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException,java.lang.NoSuchMethodException
*setNestedProperty(java.lang.Object p0,java.lang.String p1,java.lang.Object p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void setNestedProperty(java.lang.Object p0,java.lang.String p1,java.lang.Object p2) throws java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException,java.lang.NoSuchMethodException{
	 org.apache.commons.beanutils.PropertyUtils.setNestedProperty(p0,p1,p2);
}
/**
*{@link org.apache.commons.beanutils.locale.LocaleBeanUtils#setProperty(java.lang.Object,java.lang.String,java.lang.Object)}
*@see org.apache.commons.beanutils.locale.LocaleBeanUtils#setProperty(java.lang.Object,java.lang.String,java.lang.Object)
*<code>public static void org.apache.commons.beanutils.locale.LocaleBeanUtils.setProperty(java.lang.Object,java.lang.String,java.lang.Object) throws java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException
*setProperty(java.lang.Object p0,java.lang.String p1,java.lang.Object p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void setProperty(java.lang.Object p0,java.lang.String p1,java.lang.Object p2) throws java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException{
	 org.apache.commons.beanutils.locale.LocaleBeanUtils.setProperty(p0,p1,p2);
}
/**
*{@link org.apache.commons.beanutils.locale.LocaleBeanUtils#setProperty(java.lang.Object,java.lang.String,java.lang.Object,java.lang.String)}
*@see org.apache.commons.beanutils.locale.LocaleBeanUtils#setProperty(java.lang.Object,java.lang.String,java.lang.Object,java.lang.String)
*<code>public static void org.apache.commons.beanutils.locale.LocaleBeanUtils.setProperty(java.lang.Object,java.lang.String,java.lang.Object,java.lang.String) throws java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException
*setProperty(java.lang.Object p0,java.lang.String p1,java.lang.Object p2,java.lang.String p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void setProperty(java.lang.Object p0,java.lang.String p1,java.lang.Object p2,java.lang.String p3) throws java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException{
	 org.apache.commons.beanutils.locale.LocaleBeanUtils.setProperty(p0,p1,p2,p3);
}
/**
*{@link org.apache.commons.beanutils.PropertyUtils#setSimpleProperty(java.lang.Object,java.lang.String,java.lang.Object)}
*@see org.apache.commons.beanutils.PropertyUtils#setSimpleProperty(java.lang.Object,java.lang.String,java.lang.Object)
*<code>public static void org.apache.commons.beanutils.PropertyUtils.setSimpleProperty(java.lang.Object,java.lang.String,java.lang.Object) throws java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException,java.lang.NoSuchMethodException
*setSimpleProperty(java.lang.Object p0,java.lang.String p1,java.lang.Object p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void setSimpleProperty(java.lang.Object p0,java.lang.String p1,java.lang.Object p2) throws java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException,java.lang.NoSuchMethodException{
	 org.apache.commons.beanutils.PropertyUtils.setSimpleProperty(p0,p1,p2);
}
/**
*{@link org.codehaus.plexus.util.ReflectionUtils#setVariableValueInObject(java.lang.Object,java.lang.String,java.lang.Object)}
*@see org.codehaus.plexus.util.ReflectionUtils#setVariableValueInObject(java.lang.Object,java.lang.String,java.lang.Object)
*<code>public static void org.codehaus.plexus.util.ReflectionUtils.setVariableValueInObject(java.lang.Object,java.lang.String,java.lang.Object) throws java.lang.IllegalAccessException
*setVariableValueInObject(java.lang.Object p0,java.lang.String p1,java.lang.Object p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void setVariableValueInObject(java.lang.Object p0,java.lang.String p1,java.lang.Object p2) throws java.lang.IllegalAccessException{
	 org.codehaus.plexus.util.ReflectionUtils.setVariableValueInObject(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.booleans.BooleanBigLists#singleton(java.lang.Object)}
*@see it.unimi.dsi.fastutil.booleans.BooleanBigLists#singleton(java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.booleans.BooleanBigList it.unimi.dsi.fastutil.booleans.BooleanBigLists.singleton(java.lang.Object)
*singleton(java.lang.Object p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.booleans.BooleanBigList singleton(java.lang.Object p0){
	return it.unimi.dsi.fastutil.booleans.BooleanBigLists.singleton(p0);
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
*{@link it.unimi.dsi.fastutil.chars.CharSortedSets#singleton(java.lang.Object,it.unimi.dsi.fastutil.chars.CharComparator)}
*@see it.unimi.dsi.fastutil.chars.CharSortedSets#singleton(java.lang.Object,it.unimi.dsi.fastutil.chars.CharComparator)
*<code>public static it.unimi.dsi.fastutil.chars.CharSortedSet it.unimi.dsi.fastutil.chars.CharSortedSets.singleton(java.lang.Object,it.unimi.dsi.fastutil.chars.CharComparator)
*singleton(java.lang.Object p0,it.unimi.dsi.fastutil.chars.CharComparator p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.chars.CharSortedSet singleton(java.lang.Object p0,it.unimi.dsi.fastutil.chars.CharComparator p1){
	return it.unimi.dsi.fastutil.chars.CharSortedSets.singleton(p0,p1);
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
*{@link it.unimi.dsi.fastutil.floats.FloatSortedSets#singleton(java.lang.Object,it.unimi.dsi.fastutil.floats.FloatComparator)}
*@see it.unimi.dsi.fastutil.floats.FloatSortedSets#singleton(java.lang.Object,it.unimi.dsi.fastutil.floats.FloatComparator)
*<code>public static it.unimi.dsi.fastutil.floats.FloatSortedSet it.unimi.dsi.fastutil.floats.FloatSortedSets.singleton(java.lang.Object,it.unimi.dsi.fastutil.floats.FloatComparator)
*singleton(java.lang.Object p0,it.unimi.dsi.fastutil.floats.FloatComparator p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.floats.FloatSortedSet singleton(java.lang.Object p0,it.unimi.dsi.fastutil.floats.FloatComparator p1){
	return it.unimi.dsi.fastutil.floats.FloatSortedSets.singleton(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.ints.IntSortedSets#singleton(java.lang.Object,it.unimi.dsi.fastutil.ints.IntComparator)}
*@see it.unimi.dsi.fastutil.ints.IntSortedSets#singleton(java.lang.Object,it.unimi.dsi.fastutil.ints.IntComparator)
*<code>public static it.unimi.dsi.fastutil.ints.IntSortedSet it.unimi.dsi.fastutil.ints.IntSortedSets.singleton(java.lang.Object,it.unimi.dsi.fastutil.ints.IntComparator)
*singleton(java.lang.Object p0,it.unimi.dsi.fastutil.ints.IntComparator p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.ints.IntSortedSet singleton(java.lang.Object p0,it.unimi.dsi.fastutil.ints.IntComparator p1){
	return it.unimi.dsi.fastutil.ints.IntSortedSets.singleton(p0,p1);
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
*{@link org.apache.commons.collections.IteratorUtils#singletonIterator(java.lang.Object)}
*@see org.apache.commons.collections.IteratorUtils#singletonIterator(java.lang.Object)
*<code>public static org.apache.commons.collections.ResettableIterator org.apache.commons.collections.IteratorUtils.singletonIterator(java.lang.Object)
*singletonIterator(java.lang.Object p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.ResettableIterator singletonIterator(java.lang.Object p0){
	return org.apache.commons.collections.IteratorUtils.singletonIterator(p0);
}
/**
*{@link org.apache.commons.collections.IteratorUtils#singletonListIterator(java.lang.Object)}
*@see org.apache.commons.collections.IteratorUtils#singletonListIterator(java.lang.Object)
*<code>public static java.util.ListIterator org.apache.commons.collections.IteratorUtils.singletonListIterator(java.lang.Object)
*singletonListIterator(java.lang.Object p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.ListIterator singletonListIterator(java.lang.Object p0){
	return org.apache.commons.collections.IteratorUtils.singletonListIterator(p0);
}
/**
*{@link org.apache.commons.collections4.CollectionUtils#size(java.lang.Object)}
*@see org.apache.commons.collections4.CollectionUtils#size(java.lang.Object)
*<code>public static int org.apache.commons.collections4.CollectionUtils.size(java.lang.Object)
*size(java.lang.Object p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int size(java.lang.Object p0){
	return org.apache.commons.collections4.CollectionUtils.size(p0);
}
/**
*{@link org.apache.commons.collections4.CollectionUtils#sizeIsEmpty(java.lang.Object)}
*@see org.apache.commons.collections4.CollectionUtils#sizeIsEmpty(java.lang.Object)
*<code>public static boolean org.apache.commons.collections4.CollectionUtils.sizeIsEmpty(java.lang.Object)
*sizeIsEmpty(java.lang.Object p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean sizeIsEmpty(java.lang.Object p0){
	return org.apache.commons.collections4.CollectionUtils.sizeIsEmpty(p0);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#storeObject(java.lang.Object,java.lang.CharSequence)}
*@see it.unimi.dsi.fastutil.io.BinIO#storeObject(java.lang.Object,java.lang.CharSequence)
*<code>public static void it.unimi.dsi.fastutil.io.BinIO.storeObject(java.lang.Object,java.lang.CharSequence) throws java.io.IOException
*storeObject(java.lang.Object p0,java.lang.CharSequence p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void storeObject(java.lang.Object p0,java.lang.CharSequence p1) throws java.io.IOException{
	 it.unimi.dsi.fastutil.io.BinIO.storeObject(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#storeObject(java.lang.Object,java.io.OutputStream)}
*@see it.unimi.dsi.fastutil.io.BinIO#storeObject(java.lang.Object,java.io.OutputStream)
*<code>public static void it.unimi.dsi.fastutil.io.BinIO.storeObject(java.lang.Object,java.io.OutputStream) throws java.io.IOException
*storeObject(java.lang.Object p0,java.io.OutputStream p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void storeObject(java.lang.Object p0,java.io.OutputStream p1) throws java.io.IOException{
	 it.unimi.dsi.fastutil.io.BinIO.storeObject(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#storeObject(java.lang.Object,java.io.File)}
*@see it.unimi.dsi.fastutil.io.BinIO#storeObject(java.lang.Object,java.io.File)
*<code>public static void it.unimi.dsi.fastutil.io.BinIO.storeObject(java.lang.Object,java.io.File) throws java.io.IOException
*storeObject(java.lang.Object p0,java.io.File p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void storeObject(java.lang.Object p0,java.io.File p1) throws java.io.IOException{
	 it.unimi.dsi.fastutil.io.BinIO.storeObject(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.IndirectPriorityQueues#synchronize(it.unimi.dsi.fastutil.IndirectPriorityQueue<K>,java.lang.Object)}
*@see it.unimi.dsi.fastutil.IndirectPriorityQueues#synchronize(it.unimi.dsi.fastutil.IndirectPriorityQueue<K>,java.lang.Object)
*<code>public static <K> it.unimi.dsi.fastutil.IndirectPriorityQueue<K> it.unimi.dsi.fastutil.IndirectPriorityQueues.synchronize(it.unimi.dsi.fastutil.IndirectPriorityQueue<K>,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.IndirectPriorityQueue<K> p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K> it.unimi.dsi.fastutil.IndirectPriorityQueue<K> synchronize(it.unimi.dsi.fastutil.IndirectPriorityQueue<K> p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.IndirectPriorityQueues.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.PriorityQueues#synchronize(it.unimi.dsi.fastutil.PriorityQueue<K>,java.lang.Object)}
*@see it.unimi.dsi.fastutil.PriorityQueues#synchronize(it.unimi.dsi.fastutil.PriorityQueue<K>,java.lang.Object)
*<code>public static <K> it.unimi.dsi.fastutil.PriorityQueue<K> it.unimi.dsi.fastutil.PriorityQueues.synchronize(it.unimi.dsi.fastutil.PriorityQueue<K>,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.PriorityQueue<K> p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K> it.unimi.dsi.fastutil.PriorityQueue<K> synchronize(it.unimi.dsi.fastutil.PriorityQueue<K> p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.PriorityQueues.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.booleans.BooleanBigLists#synchronize(it.unimi.dsi.fastutil.booleans.BooleanBigList,java.lang.Object)}
*@see it.unimi.dsi.fastutil.booleans.BooleanBigLists#synchronize(it.unimi.dsi.fastutil.booleans.BooleanBigList,java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.booleans.BooleanBigList it.unimi.dsi.fastutil.booleans.BooleanBigLists.synchronize(it.unimi.dsi.fastutil.booleans.BooleanBigList,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.booleans.BooleanBigList p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.booleans.BooleanBigList synchronize(it.unimi.dsi.fastutil.booleans.BooleanBigList p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.booleans.BooleanBigLists.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.booleans.BooleanCollections#synchronize(it.unimi.dsi.fastutil.booleans.BooleanCollection,java.lang.Object)}
*@see it.unimi.dsi.fastutil.booleans.BooleanCollections#synchronize(it.unimi.dsi.fastutil.booleans.BooleanCollection,java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.booleans.BooleanCollection it.unimi.dsi.fastutil.booleans.BooleanCollections.synchronize(it.unimi.dsi.fastutil.booleans.BooleanCollection,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.booleans.BooleanCollection p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.booleans.BooleanCollection synchronize(it.unimi.dsi.fastutil.booleans.BooleanCollection p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.booleans.BooleanCollections.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.booleans.BooleanLists#synchronize(it.unimi.dsi.fastutil.booleans.BooleanList,java.lang.Object)}
*@see it.unimi.dsi.fastutil.booleans.BooleanLists#synchronize(it.unimi.dsi.fastutil.booleans.BooleanList,java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.booleans.BooleanList it.unimi.dsi.fastutil.booleans.BooleanLists.synchronize(it.unimi.dsi.fastutil.booleans.BooleanList,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.booleans.BooleanList p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.booleans.BooleanList synchronize(it.unimi.dsi.fastutil.booleans.BooleanList p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.booleans.BooleanLists.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.booleans.BooleanSets#synchronize(it.unimi.dsi.fastutil.booleans.BooleanSet,java.lang.Object)}
*@see it.unimi.dsi.fastutil.booleans.BooleanSets#synchronize(it.unimi.dsi.fastutil.booleans.BooleanSet,java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.booleans.BooleanSet it.unimi.dsi.fastutil.booleans.BooleanSets.synchronize(it.unimi.dsi.fastutil.booleans.BooleanSet,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.booleans.BooleanSet p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.booleans.BooleanSet synchronize(it.unimi.dsi.fastutil.booleans.BooleanSet p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.booleans.BooleanSets.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.bytes.Byte2BooleanFunctions#synchronize(it.unimi.dsi.fastutil.bytes.Byte2BooleanFunction,java.lang.Object)}
*@see it.unimi.dsi.fastutil.bytes.Byte2BooleanFunctions#synchronize(it.unimi.dsi.fastutil.bytes.Byte2BooleanFunction,java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.bytes.Byte2BooleanFunction it.unimi.dsi.fastutil.bytes.Byte2BooleanFunctions.synchronize(it.unimi.dsi.fastutil.bytes.Byte2BooleanFunction,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.bytes.Byte2BooleanFunction p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.bytes.Byte2BooleanFunction synchronize(it.unimi.dsi.fastutil.bytes.Byte2BooleanFunction p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.bytes.Byte2BooleanFunctions.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.bytes.Byte2BooleanMaps#synchronize(it.unimi.dsi.fastutil.bytes.Byte2BooleanMap,java.lang.Object)}
*@see it.unimi.dsi.fastutil.bytes.Byte2BooleanMaps#synchronize(it.unimi.dsi.fastutil.bytes.Byte2BooleanMap,java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.bytes.Byte2BooleanMap it.unimi.dsi.fastutil.bytes.Byte2BooleanMaps.synchronize(it.unimi.dsi.fastutil.bytes.Byte2BooleanMap,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.bytes.Byte2BooleanMap p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.bytes.Byte2BooleanMap synchronize(it.unimi.dsi.fastutil.bytes.Byte2BooleanMap p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.bytes.Byte2BooleanMaps.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.bytes.Byte2BooleanSortedMaps#synchronize(it.unimi.dsi.fastutil.bytes.Byte2BooleanSortedMap,java.lang.Object)}
*@see it.unimi.dsi.fastutil.bytes.Byte2BooleanSortedMaps#synchronize(it.unimi.dsi.fastutil.bytes.Byte2BooleanSortedMap,java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.bytes.Byte2BooleanSortedMap it.unimi.dsi.fastutil.bytes.Byte2BooleanSortedMaps.synchronize(it.unimi.dsi.fastutil.bytes.Byte2BooleanSortedMap,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.bytes.Byte2BooleanSortedMap p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.bytes.Byte2BooleanSortedMap synchronize(it.unimi.dsi.fastutil.bytes.Byte2BooleanSortedMap p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.bytes.Byte2BooleanSortedMaps.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.bytes.Byte2ByteFunctions#synchronize(it.unimi.dsi.fastutil.bytes.Byte2ByteFunction,java.lang.Object)}
*@see it.unimi.dsi.fastutil.bytes.Byte2ByteFunctions#synchronize(it.unimi.dsi.fastutil.bytes.Byte2ByteFunction,java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.bytes.Byte2ByteFunction it.unimi.dsi.fastutil.bytes.Byte2ByteFunctions.synchronize(it.unimi.dsi.fastutil.bytes.Byte2ByteFunction,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.bytes.Byte2ByteFunction p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.bytes.Byte2ByteFunction synchronize(it.unimi.dsi.fastutil.bytes.Byte2ByteFunction p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.bytes.Byte2ByteFunctions.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.bytes.Byte2ByteMaps#synchronize(it.unimi.dsi.fastutil.bytes.Byte2ByteMap,java.lang.Object)}
*@see it.unimi.dsi.fastutil.bytes.Byte2ByteMaps#synchronize(it.unimi.dsi.fastutil.bytes.Byte2ByteMap,java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.bytes.Byte2ByteMap it.unimi.dsi.fastutil.bytes.Byte2ByteMaps.synchronize(it.unimi.dsi.fastutil.bytes.Byte2ByteMap,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.bytes.Byte2ByteMap p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.bytes.Byte2ByteMap synchronize(it.unimi.dsi.fastutil.bytes.Byte2ByteMap p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.bytes.Byte2ByteMaps.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.bytes.Byte2ByteSortedMaps#synchronize(it.unimi.dsi.fastutil.bytes.Byte2ByteSortedMap,java.lang.Object)}
*@see it.unimi.dsi.fastutil.bytes.Byte2ByteSortedMaps#synchronize(it.unimi.dsi.fastutil.bytes.Byte2ByteSortedMap,java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.bytes.Byte2ByteSortedMap it.unimi.dsi.fastutil.bytes.Byte2ByteSortedMaps.synchronize(it.unimi.dsi.fastutil.bytes.Byte2ByteSortedMap,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.bytes.Byte2ByteSortedMap p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.bytes.Byte2ByteSortedMap synchronize(it.unimi.dsi.fastutil.bytes.Byte2ByteSortedMap p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.bytes.Byte2ByteSortedMaps.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.bytes.Byte2CharFunctions#synchronize(it.unimi.dsi.fastutil.bytes.Byte2CharFunction,java.lang.Object)}
*@see it.unimi.dsi.fastutil.bytes.Byte2CharFunctions#synchronize(it.unimi.dsi.fastutil.bytes.Byte2CharFunction,java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.bytes.Byte2CharFunction it.unimi.dsi.fastutil.bytes.Byte2CharFunctions.synchronize(it.unimi.dsi.fastutil.bytes.Byte2CharFunction,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.bytes.Byte2CharFunction p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.bytes.Byte2CharFunction synchronize(it.unimi.dsi.fastutil.bytes.Byte2CharFunction p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.bytes.Byte2CharFunctions.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.bytes.Byte2CharMaps#synchronize(it.unimi.dsi.fastutil.bytes.Byte2CharMap,java.lang.Object)}
*@see it.unimi.dsi.fastutil.bytes.Byte2CharMaps#synchronize(it.unimi.dsi.fastutil.bytes.Byte2CharMap,java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.bytes.Byte2CharMap it.unimi.dsi.fastutil.bytes.Byte2CharMaps.synchronize(it.unimi.dsi.fastutil.bytes.Byte2CharMap,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.bytes.Byte2CharMap p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.bytes.Byte2CharMap synchronize(it.unimi.dsi.fastutil.bytes.Byte2CharMap p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.bytes.Byte2CharMaps.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.bytes.Byte2CharSortedMaps#synchronize(it.unimi.dsi.fastutil.bytes.Byte2CharSortedMap,java.lang.Object)}
*@see it.unimi.dsi.fastutil.bytes.Byte2CharSortedMaps#synchronize(it.unimi.dsi.fastutil.bytes.Byte2CharSortedMap,java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.bytes.Byte2CharSortedMap it.unimi.dsi.fastutil.bytes.Byte2CharSortedMaps.synchronize(it.unimi.dsi.fastutil.bytes.Byte2CharSortedMap,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.bytes.Byte2CharSortedMap p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.bytes.Byte2CharSortedMap synchronize(it.unimi.dsi.fastutil.bytes.Byte2CharSortedMap p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.bytes.Byte2CharSortedMaps.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.bytes.Byte2DoubleFunctions#synchronize(it.unimi.dsi.fastutil.bytes.Byte2DoubleFunction,java.lang.Object)}
*@see it.unimi.dsi.fastutil.bytes.Byte2DoubleFunctions#synchronize(it.unimi.dsi.fastutil.bytes.Byte2DoubleFunction,java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.bytes.Byte2DoubleFunction it.unimi.dsi.fastutil.bytes.Byte2DoubleFunctions.synchronize(it.unimi.dsi.fastutil.bytes.Byte2DoubleFunction,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.bytes.Byte2DoubleFunction p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.bytes.Byte2DoubleFunction synchronize(it.unimi.dsi.fastutil.bytes.Byte2DoubleFunction p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.bytes.Byte2DoubleFunctions.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.bytes.Byte2DoubleMaps#synchronize(it.unimi.dsi.fastutil.bytes.Byte2DoubleMap,java.lang.Object)}
*@see it.unimi.dsi.fastutil.bytes.Byte2DoubleMaps#synchronize(it.unimi.dsi.fastutil.bytes.Byte2DoubleMap,java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.bytes.Byte2DoubleMap it.unimi.dsi.fastutil.bytes.Byte2DoubleMaps.synchronize(it.unimi.dsi.fastutil.bytes.Byte2DoubleMap,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.bytes.Byte2DoubleMap p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.bytes.Byte2DoubleMap synchronize(it.unimi.dsi.fastutil.bytes.Byte2DoubleMap p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.bytes.Byte2DoubleMaps.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.bytes.Byte2DoubleSortedMaps#synchronize(it.unimi.dsi.fastutil.bytes.Byte2DoubleSortedMap,java.lang.Object)}
*@see it.unimi.dsi.fastutil.bytes.Byte2DoubleSortedMaps#synchronize(it.unimi.dsi.fastutil.bytes.Byte2DoubleSortedMap,java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.bytes.Byte2DoubleSortedMap it.unimi.dsi.fastutil.bytes.Byte2DoubleSortedMaps.synchronize(it.unimi.dsi.fastutil.bytes.Byte2DoubleSortedMap,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.bytes.Byte2DoubleSortedMap p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.bytes.Byte2DoubleSortedMap synchronize(it.unimi.dsi.fastutil.bytes.Byte2DoubleSortedMap p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.bytes.Byte2DoubleSortedMaps.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.bytes.Byte2FloatFunctions#synchronize(it.unimi.dsi.fastutil.bytes.Byte2FloatFunction,java.lang.Object)}
*@see it.unimi.dsi.fastutil.bytes.Byte2FloatFunctions#synchronize(it.unimi.dsi.fastutil.bytes.Byte2FloatFunction,java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.bytes.Byte2FloatFunction it.unimi.dsi.fastutil.bytes.Byte2FloatFunctions.synchronize(it.unimi.dsi.fastutil.bytes.Byte2FloatFunction,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.bytes.Byte2FloatFunction p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.bytes.Byte2FloatFunction synchronize(it.unimi.dsi.fastutil.bytes.Byte2FloatFunction p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.bytes.Byte2FloatFunctions.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.bytes.Byte2FloatMaps#synchronize(it.unimi.dsi.fastutil.bytes.Byte2FloatMap,java.lang.Object)}
*@see it.unimi.dsi.fastutil.bytes.Byte2FloatMaps#synchronize(it.unimi.dsi.fastutil.bytes.Byte2FloatMap,java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.bytes.Byte2FloatMap it.unimi.dsi.fastutil.bytes.Byte2FloatMaps.synchronize(it.unimi.dsi.fastutil.bytes.Byte2FloatMap,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.bytes.Byte2FloatMap p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.bytes.Byte2FloatMap synchronize(it.unimi.dsi.fastutil.bytes.Byte2FloatMap p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.bytes.Byte2FloatMaps.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.bytes.Byte2FloatSortedMaps#synchronize(it.unimi.dsi.fastutil.bytes.Byte2FloatSortedMap,java.lang.Object)}
*@see it.unimi.dsi.fastutil.bytes.Byte2FloatSortedMaps#synchronize(it.unimi.dsi.fastutil.bytes.Byte2FloatSortedMap,java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.bytes.Byte2FloatSortedMap it.unimi.dsi.fastutil.bytes.Byte2FloatSortedMaps.synchronize(it.unimi.dsi.fastutil.bytes.Byte2FloatSortedMap,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.bytes.Byte2FloatSortedMap p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.bytes.Byte2FloatSortedMap synchronize(it.unimi.dsi.fastutil.bytes.Byte2FloatSortedMap p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.bytes.Byte2FloatSortedMaps.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.bytes.Byte2IntFunctions#synchronize(it.unimi.dsi.fastutil.bytes.Byte2IntFunction,java.lang.Object)}
*@see it.unimi.dsi.fastutil.bytes.Byte2IntFunctions#synchronize(it.unimi.dsi.fastutil.bytes.Byte2IntFunction,java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.bytes.Byte2IntFunction it.unimi.dsi.fastutil.bytes.Byte2IntFunctions.synchronize(it.unimi.dsi.fastutil.bytes.Byte2IntFunction,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.bytes.Byte2IntFunction p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.bytes.Byte2IntFunction synchronize(it.unimi.dsi.fastutil.bytes.Byte2IntFunction p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.bytes.Byte2IntFunctions.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.bytes.Byte2IntMaps#synchronize(it.unimi.dsi.fastutil.bytes.Byte2IntMap,java.lang.Object)}
*@see it.unimi.dsi.fastutil.bytes.Byte2IntMaps#synchronize(it.unimi.dsi.fastutil.bytes.Byte2IntMap,java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.bytes.Byte2IntMap it.unimi.dsi.fastutil.bytes.Byte2IntMaps.synchronize(it.unimi.dsi.fastutil.bytes.Byte2IntMap,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.bytes.Byte2IntMap p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.bytes.Byte2IntMap synchronize(it.unimi.dsi.fastutil.bytes.Byte2IntMap p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.bytes.Byte2IntMaps.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.bytes.Byte2IntSortedMaps#synchronize(it.unimi.dsi.fastutil.bytes.Byte2IntSortedMap,java.lang.Object)}
*@see it.unimi.dsi.fastutil.bytes.Byte2IntSortedMaps#synchronize(it.unimi.dsi.fastutil.bytes.Byte2IntSortedMap,java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.bytes.Byte2IntSortedMap it.unimi.dsi.fastutil.bytes.Byte2IntSortedMaps.synchronize(it.unimi.dsi.fastutil.bytes.Byte2IntSortedMap,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.bytes.Byte2IntSortedMap p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.bytes.Byte2IntSortedMap synchronize(it.unimi.dsi.fastutil.bytes.Byte2IntSortedMap p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.bytes.Byte2IntSortedMaps.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.bytes.Byte2LongFunctions#synchronize(it.unimi.dsi.fastutil.bytes.Byte2LongFunction,java.lang.Object)}
*@see it.unimi.dsi.fastutil.bytes.Byte2LongFunctions#synchronize(it.unimi.dsi.fastutil.bytes.Byte2LongFunction,java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.bytes.Byte2LongFunction it.unimi.dsi.fastutil.bytes.Byte2LongFunctions.synchronize(it.unimi.dsi.fastutil.bytes.Byte2LongFunction,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.bytes.Byte2LongFunction p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.bytes.Byte2LongFunction synchronize(it.unimi.dsi.fastutil.bytes.Byte2LongFunction p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.bytes.Byte2LongFunctions.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.bytes.Byte2LongMaps#synchronize(it.unimi.dsi.fastutil.bytes.Byte2LongMap,java.lang.Object)}
*@see it.unimi.dsi.fastutil.bytes.Byte2LongMaps#synchronize(it.unimi.dsi.fastutil.bytes.Byte2LongMap,java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.bytes.Byte2LongMap it.unimi.dsi.fastutil.bytes.Byte2LongMaps.synchronize(it.unimi.dsi.fastutil.bytes.Byte2LongMap,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.bytes.Byte2LongMap p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.bytes.Byte2LongMap synchronize(it.unimi.dsi.fastutil.bytes.Byte2LongMap p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.bytes.Byte2LongMaps.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.bytes.Byte2LongSortedMaps#synchronize(it.unimi.dsi.fastutil.bytes.Byte2LongSortedMap,java.lang.Object)}
*@see it.unimi.dsi.fastutil.bytes.Byte2LongSortedMaps#synchronize(it.unimi.dsi.fastutil.bytes.Byte2LongSortedMap,java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.bytes.Byte2LongSortedMap it.unimi.dsi.fastutil.bytes.Byte2LongSortedMaps.synchronize(it.unimi.dsi.fastutil.bytes.Byte2LongSortedMap,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.bytes.Byte2LongSortedMap p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.bytes.Byte2LongSortedMap synchronize(it.unimi.dsi.fastutil.bytes.Byte2LongSortedMap p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.bytes.Byte2LongSortedMaps.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.bytes.Byte2ObjectFunctions#synchronize(it.unimi.dsi.fastutil.bytes.Byte2ObjectFunction<V>,java.lang.Object)}
*@see it.unimi.dsi.fastutil.bytes.Byte2ObjectFunctions#synchronize(it.unimi.dsi.fastutil.bytes.Byte2ObjectFunction<V>,java.lang.Object)
*<code>public static <V> it.unimi.dsi.fastutil.bytes.Byte2ObjectFunction<V> it.unimi.dsi.fastutil.bytes.Byte2ObjectFunctions.synchronize(it.unimi.dsi.fastutil.bytes.Byte2ObjectFunction<V>,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.bytes.Byte2ObjectFunction<V> p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <V> it.unimi.dsi.fastutil.bytes.Byte2ObjectFunction<V> synchronize(it.unimi.dsi.fastutil.bytes.Byte2ObjectFunction<V> p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.bytes.Byte2ObjectFunctions.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.bytes.Byte2ObjectMaps#synchronize(it.unimi.dsi.fastutil.bytes.Byte2ObjectMap<V>,java.lang.Object)}
*@see it.unimi.dsi.fastutil.bytes.Byte2ObjectMaps#synchronize(it.unimi.dsi.fastutil.bytes.Byte2ObjectMap<V>,java.lang.Object)
*<code>public static <V> it.unimi.dsi.fastutil.bytes.Byte2ObjectMap<V> it.unimi.dsi.fastutil.bytes.Byte2ObjectMaps.synchronize(it.unimi.dsi.fastutil.bytes.Byte2ObjectMap<V>,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.bytes.Byte2ObjectMap<V> p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <V> it.unimi.dsi.fastutil.bytes.Byte2ObjectMap<V> synchronize(it.unimi.dsi.fastutil.bytes.Byte2ObjectMap<V> p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.bytes.Byte2ObjectMaps.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.bytes.Byte2ObjectSortedMaps#synchronize(it.unimi.dsi.fastutil.bytes.Byte2ObjectSortedMap<V>,java.lang.Object)}
*@see it.unimi.dsi.fastutil.bytes.Byte2ObjectSortedMaps#synchronize(it.unimi.dsi.fastutil.bytes.Byte2ObjectSortedMap<V>,java.lang.Object)
*<code>public static <V> it.unimi.dsi.fastutil.bytes.Byte2ObjectSortedMap<V> it.unimi.dsi.fastutil.bytes.Byte2ObjectSortedMaps.synchronize(it.unimi.dsi.fastutil.bytes.Byte2ObjectSortedMap<V>,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.bytes.Byte2ObjectSortedMap<V> p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <V> it.unimi.dsi.fastutil.bytes.Byte2ObjectSortedMap<V> synchronize(it.unimi.dsi.fastutil.bytes.Byte2ObjectSortedMap<V> p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.bytes.Byte2ObjectSortedMaps.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.bytes.Byte2ReferenceFunctions#synchronize(it.unimi.dsi.fastutil.bytes.Byte2ReferenceFunction<V>,java.lang.Object)}
*@see it.unimi.dsi.fastutil.bytes.Byte2ReferenceFunctions#synchronize(it.unimi.dsi.fastutil.bytes.Byte2ReferenceFunction<V>,java.lang.Object)
*<code>public static <V> it.unimi.dsi.fastutil.bytes.Byte2ReferenceFunction<V> it.unimi.dsi.fastutil.bytes.Byte2ReferenceFunctions.synchronize(it.unimi.dsi.fastutil.bytes.Byte2ReferenceFunction<V>,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.bytes.Byte2ReferenceFunction<V> p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <V> it.unimi.dsi.fastutil.bytes.Byte2ReferenceFunction<V> synchronize(it.unimi.dsi.fastutil.bytes.Byte2ReferenceFunction<V> p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.bytes.Byte2ReferenceFunctions.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.bytes.Byte2ReferenceMaps#synchronize(it.unimi.dsi.fastutil.bytes.Byte2ReferenceMap<V>,java.lang.Object)}
*@see it.unimi.dsi.fastutil.bytes.Byte2ReferenceMaps#synchronize(it.unimi.dsi.fastutil.bytes.Byte2ReferenceMap<V>,java.lang.Object)
*<code>public static <V> it.unimi.dsi.fastutil.bytes.Byte2ReferenceMap<V> it.unimi.dsi.fastutil.bytes.Byte2ReferenceMaps.synchronize(it.unimi.dsi.fastutil.bytes.Byte2ReferenceMap<V>,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.bytes.Byte2ReferenceMap<V> p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <V> it.unimi.dsi.fastutil.bytes.Byte2ReferenceMap<V> synchronize(it.unimi.dsi.fastutil.bytes.Byte2ReferenceMap<V> p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.bytes.Byte2ReferenceMaps.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.bytes.Byte2ReferenceSortedMaps#synchronize(it.unimi.dsi.fastutil.bytes.Byte2ReferenceSortedMap<V>,java.lang.Object)}
*@see it.unimi.dsi.fastutil.bytes.Byte2ReferenceSortedMaps#synchronize(it.unimi.dsi.fastutil.bytes.Byte2ReferenceSortedMap<V>,java.lang.Object)
*<code>public static <V> it.unimi.dsi.fastutil.bytes.Byte2ReferenceSortedMap<V> it.unimi.dsi.fastutil.bytes.Byte2ReferenceSortedMaps.synchronize(it.unimi.dsi.fastutil.bytes.Byte2ReferenceSortedMap<V>,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.bytes.Byte2ReferenceSortedMap<V> p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <V> it.unimi.dsi.fastutil.bytes.Byte2ReferenceSortedMap<V> synchronize(it.unimi.dsi.fastutil.bytes.Byte2ReferenceSortedMap<V> p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.bytes.Byte2ReferenceSortedMaps.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.bytes.Byte2ShortFunctions#synchronize(it.unimi.dsi.fastutil.bytes.Byte2ShortFunction,java.lang.Object)}
*@see it.unimi.dsi.fastutil.bytes.Byte2ShortFunctions#synchronize(it.unimi.dsi.fastutil.bytes.Byte2ShortFunction,java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.bytes.Byte2ShortFunction it.unimi.dsi.fastutil.bytes.Byte2ShortFunctions.synchronize(it.unimi.dsi.fastutil.bytes.Byte2ShortFunction,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.bytes.Byte2ShortFunction p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.bytes.Byte2ShortFunction synchronize(it.unimi.dsi.fastutil.bytes.Byte2ShortFunction p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.bytes.Byte2ShortFunctions.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.bytes.Byte2ShortMaps#synchronize(it.unimi.dsi.fastutil.bytes.Byte2ShortMap,java.lang.Object)}
*@see it.unimi.dsi.fastutil.bytes.Byte2ShortMaps#synchronize(it.unimi.dsi.fastutil.bytes.Byte2ShortMap,java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.bytes.Byte2ShortMap it.unimi.dsi.fastutil.bytes.Byte2ShortMaps.synchronize(it.unimi.dsi.fastutil.bytes.Byte2ShortMap,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.bytes.Byte2ShortMap p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.bytes.Byte2ShortMap synchronize(it.unimi.dsi.fastutil.bytes.Byte2ShortMap p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.bytes.Byte2ShortMaps.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.bytes.Byte2ShortSortedMaps#synchronize(it.unimi.dsi.fastutil.bytes.Byte2ShortSortedMap,java.lang.Object)}
*@see it.unimi.dsi.fastutil.bytes.Byte2ShortSortedMaps#synchronize(it.unimi.dsi.fastutil.bytes.Byte2ShortSortedMap,java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.bytes.Byte2ShortSortedMap it.unimi.dsi.fastutil.bytes.Byte2ShortSortedMaps.synchronize(it.unimi.dsi.fastutil.bytes.Byte2ShortSortedMap,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.bytes.Byte2ShortSortedMap p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.bytes.Byte2ShortSortedMap synchronize(it.unimi.dsi.fastutil.bytes.Byte2ShortSortedMap p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.bytes.Byte2ShortSortedMaps.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.bytes.ByteBigLists#synchronize(it.unimi.dsi.fastutil.bytes.ByteBigList,java.lang.Object)}
*@see it.unimi.dsi.fastutil.bytes.ByteBigLists#synchronize(it.unimi.dsi.fastutil.bytes.ByteBigList,java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.bytes.ByteBigList it.unimi.dsi.fastutil.bytes.ByteBigLists.synchronize(it.unimi.dsi.fastutil.bytes.ByteBigList,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.bytes.ByteBigList p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.bytes.ByteBigList synchronize(it.unimi.dsi.fastutil.bytes.ByteBigList p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.bytes.ByteBigLists.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.bytes.ByteCollections#synchronize(it.unimi.dsi.fastutil.bytes.ByteCollection,java.lang.Object)}
*@see it.unimi.dsi.fastutil.bytes.ByteCollections#synchronize(it.unimi.dsi.fastutil.bytes.ByteCollection,java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.bytes.ByteCollection it.unimi.dsi.fastutil.bytes.ByteCollections.synchronize(it.unimi.dsi.fastutil.bytes.ByteCollection,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.bytes.ByteCollection p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.bytes.ByteCollection synchronize(it.unimi.dsi.fastutil.bytes.ByteCollection p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.bytes.ByteCollections.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.bytes.ByteLists#synchronize(it.unimi.dsi.fastutil.bytes.ByteList,java.lang.Object)}
*@see it.unimi.dsi.fastutil.bytes.ByteLists#synchronize(it.unimi.dsi.fastutil.bytes.ByteList,java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.bytes.ByteList it.unimi.dsi.fastutil.bytes.ByteLists.synchronize(it.unimi.dsi.fastutil.bytes.ByteList,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.bytes.ByteList p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.bytes.ByteList synchronize(it.unimi.dsi.fastutil.bytes.ByteList p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.bytes.ByteLists.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.bytes.BytePriorityQueues#synchronize(it.unimi.dsi.fastutil.bytes.BytePriorityQueue,java.lang.Object)}
*@see it.unimi.dsi.fastutil.bytes.BytePriorityQueues#synchronize(it.unimi.dsi.fastutil.bytes.BytePriorityQueue,java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.bytes.BytePriorityQueue it.unimi.dsi.fastutil.bytes.BytePriorityQueues.synchronize(it.unimi.dsi.fastutil.bytes.BytePriorityQueue,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.bytes.BytePriorityQueue p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.bytes.BytePriorityQueue synchronize(it.unimi.dsi.fastutil.bytes.BytePriorityQueue p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.bytes.BytePriorityQueues.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.bytes.ByteSets#synchronize(it.unimi.dsi.fastutil.bytes.ByteSet,java.lang.Object)}
*@see it.unimi.dsi.fastutil.bytes.ByteSets#synchronize(it.unimi.dsi.fastutil.bytes.ByteSet,java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.bytes.ByteSet it.unimi.dsi.fastutil.bytes.ByteSets.synchronize(it.unimi.dsi.fastutil.bytes.ByteSet,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.bytes.ByteSet p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.bytes.ByteSet synchronize(it.unimi.dsi.fastutil.bytes.ByteSet p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.bytes.ByteSets.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.bytes.ByteSortedSets#synchronize(it.unimi.dsi.fastutil.bytes.ByteSortedSet,java.lang.Object)}
*@see it.unimi.dsi.fastutil.bytes.ByteSortedSets#synchronize(it.unimi.dsi.fastutil.bytes.ByteSortedSet,java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.bytes.ByteSortedSet it.unimi.dsi.fastutil.bytes.ByteSortedSets.synchronize(it.unimi.dsi.fastutil.bytes.ByteSortedSet,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.bytes.ByteSortedSet p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.bytes.ByteSortedSet synchronize(it.unimi.dsi.fastutil.bytes.ByteSortedSet p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.bytes.ByteSortedSets.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.chars.Char2BooleanFunctions#synchronize(it.unimi.dsi.fastutil.chars.Char2BooleanFunction,java.lang.Object)}
*@see it.unimi.dsi.fastutil.chars.Char2BooleanFunctions#synchronize(it.unimi.dsi.fastutil.chars.Char2BooleanFunction,java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.chars.Char2BooleanFunction it.unimi.dsi.fastutil.chars.Char2BooleanFunctions.synchronize(it.unimi.dsi.fastutil.chars.Char2BooleanFunction,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.chars.Char2BooleanFunction p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.chars.Char2BooleanFunction synchronize(it.unimi.dsi.fastutil.chars.Char2BooleanFunction p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.chars.Char2BooleanFunctions.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.chars.Char2BooleanMaps#synchronize(it.unimi.dsi.fastutil.chars.Char2BooleanMap,java.lang.Object)}
*@see it.unimi.dsi.fastutil.chars.Char2BooleanMaps#synchronize(it.unimi.dsi.fastutil.chars.Char2BooleanMap,java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.chars.Char2BooleanMap it.unimi.dsi.fastutil.chars.Char2BooleanMaps.synchronize(it.unimi.dsi.fastutil.chars.Char2BooleanMap,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.chars.Char2BooleanMap p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.chars.Char2BooleanMap synchronize(it.unimi.dsi.fastutil.chars.Char2BooleanMap p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.chars.Char2BooleanMaps.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.chars.Char2BooleanSortedMaps#synchronize(it.unimi.dsi.fastutil.chars.Char2BooleanSortedMap,java.lang.Object)}
*@see it.unimi.dsi.fastutil.chars.Char2BooleanSortedMaps#synchronize(it.unimi.dsi.fastutil.chars.Char2BooleanSortedMap,java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.chars.Char2BooleanSortedMap it.unimi.dsi.fastutil.chars.Char2BooleanSortedMaps.synchronize(it.unimi.dsi.fastutil.chars.Char2BooleanSortedMap,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.chars.Char2BooleanSortedMap p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.chars.Char2BooleanSortedMap synchronize(it.unimi.dsi.fastutil.chars.Char2BooleanSortedMap p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.chars.Char2BooleanSortedMaps.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.chars.Char2ByteFunctions#synchronize(it.unimi.dsi.fastutil.chars.Char2ByteFunction,java.lang.Object)}
*@see it.unimi.dsi.fastutil.chars.Char2ByteFunctions#synchronize(it.unimi.dsi.fastutil.chars.Char2ByteFunction,java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.chars.Char2ByteFunction it.unimi.dsi.fastutil.chars.Char2ByteFunctions.synchronize(it.unimi.dsi.fastutil.chars.Char2ByteFunction,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.chars.Char2ByteFunction p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.chars.Char2ByteFunction synchronize(it.unimi.dsi.fastutil.chars.Char2ByteFunction p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.chars.Char2ByteFunctions.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.chars.Char2ByteMaps#synchronize(it.unimi.dsi.fastutil.chars.Char2ByteMap,java.lang.Object)}
*@see it.unimi.dsi.fastutil.chars.Char2ByteMaps#synchronize(it.unimi.dsi.fastutil.chars.Char2ByteMap,java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.chars.Char2ByteMap it.unimi.dsi.fastutil.chars.Char2ByteMaps.synchronize(it.unimi.dsi.fastutil.chars.Char2ByteMap,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.chars.Char2ByteMap p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.chars.Char2ByteMap synchronize(it.unimi.dsi.fastutil.chars.Char2ByteMap p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.chars.Char2ByteMaps.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.chars.Char2ByteSortedMaps#synchronize(it.unimi.dsi.fastutil.chars.Char2ByteSortedMap,java.lang.Object)}
*@see it.unimi.dsi.fastutil.chars.Char2ByteSortedMaps#synchronize(it.unimi.dsi.fastutil.chars.Char2ByteSortedMap,java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.chars.Char2ByteSortedMap it.unimi.dsi.fastutil.chars.Char2ByteSortedMaps.synchronize(it.unimi.dsi.fastutil.chars.Char2ByteSortedMap,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.chars.Char2ByteSortedMap p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.chars.Char2ByteSortedMap synchronize(it.unimi.dsi.fastutil.chars.Char2ByteSortedMap p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.chars.Char2ByteSortedMaps.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.chars.Char2CharFunctions#synchronize(it.unimi.dsi.fastutil.chars.Char2CharFunction,java.lang.Object)}
*@see it.unimi.dsi.fastutil.chars.Char2CharFunctions#synchronize(it.unimi.dsi.fastutil.chars.Char2CharFunction,java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.chars.Char2CharFunction it.unimi.dsi.fastutil.chars.Char2CharFunctions.synchronize(it.unimi.dsi.fastutil.chars.Char2CharFunction,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.chars.Char2CharFunction p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.chars.Char2CharFunction synchronize(it.unimi.dsi.fastutil.chars.Char2CharFunction p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.chars.Char2CharFunctions.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.chars.Char2CharMaps#synchronize(it.unimi.dsi.fastutil.chars.Char2CharMap,java.lang.Object)}
*@see it.unimi.dsi.fastutil.chars.Char2CharMaps#synchronize(it.unimi.dsi.fastutil.chars.Char2CharMap,java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.chars.Char2CharMap it.unimi.dsi.fastutil.chars.Char2CharMaps.synchronize(it.unimi.dsi.fastutil.chars.Char2CharMap,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.chars.Char2CharMap p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.chars.Char2CharMap synchronize(it.unimi.dsi.fastutil.chars.Char2CharMap p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.chars.Char2CharMaps.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.chars.Char2CharSortedMaps#synchronize(it.unimi.dsi.fastutil.chars.Char2CharSortedMap,java.lang.Object)}
*@see it.unimi.dsi.fastutil.chars.Char2CharSortedMaps#synchronize(it.unimi.dsi.fastutil.chars.Char2CharSortedMap,java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.chars.Char2CharSortedMap it.unimi.dsi.fastutil.chars.Char2CharSortedMaps.synchronize(it.unimi.dsi.fastutil.chars.Char2CharSortedMap,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.chars.Char2CharSortedMap p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.chars.Char2CharSortedMap synchronize(it.unimi.dsi.fastutil.chars.Char2CharSortedMap p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.chars.Char2CharSortedMaps.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.chars.Char2DoubleFunctions#synchronize(it.unimi.dsi.fastutil.chars.Char2DoubleFunction,java.lang.Object)}
*@see it.unimi.dsi.fastutil.chars.Char2DoubleFunctions#synchronize(it.unimi.dsi.fastutil.chars.Char2DoubleFunction,java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.chars.Char2DoubleFunction it.unimi.dsi.fastutil.chars.Char2DoubleFunctions.synchronize(it.unimi.dsi.fastutil.chars.Char2DoubleFunction,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.chars.Char2DoubleFunction p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.chars.Char2DoubleFunction synchronize(it.unimi.dsi.fastutil.chars.Char2DoubleFunction p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.chars.Char2DoubleFunctions.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.chars.Char2DoubleMaps#synchronize(it.unimi.dsi.fastutil.chars.Char2DoubleMap,java.lang.Object)}
*@see it.unimi.dsi.fastutil.chars.Char2DoubleMaps#synchronize(it.unimi.dsi.fastutil.chars.Char2DoubleMap,java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.chars.Char2DoubleMap it.unimi.dsi.fastutil.chars.Char2DoubleMaps.synchronize(it.unimi.dsi.fastutil.chars.Char2DoubleMap,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.chars.Char2DoubleMap p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.chars.Char2DoubleMap synchronize(it.unimi.dsi.fastutil.chars.Char2DoubleMap p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.chars.Char2DoubleMaps.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.chars.Char2DoubleSortedMaps#synchronize(it.unimi.dsi.fastutil.chars.Char2DoubleSortedMap,java.lang.Object)}
*@see it.unimi.dsi.fastutil.chars.Char2DoubleSortedMaps#synchronize(it.unimi.dsi.fastutil.chars.Char2DoubleSortedMap,java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.chars.Char2DoubleSortedMap it.unimi.dsi.fastutil.chars.Char2DoubleSortedMaps.synchronize(it.unimi.dsi.fastutil.chars.Char2DoubleSortedMap,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.chars.Char2DoubleSortedMap p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.chars.Char2DoubleSortedMap synchronize(it.unimi.dsi.fastutil.chars.Char2DoubleSortedMap p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.chars.Char2DoubleSortedMaps.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.chars.Char2FloatFunctions#synchronize(it.unimi.dsi.fastutil.chars.Char2FloatFunction,java.lang.Object)}
*@see it.unimi.dsi.fastutil.chars.Char2FloatFunctions#synchronize(it.unimi.dsi.fastutil.chars.Char2FloatFunction,java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.chars.Char2FloatFunction it.unimi.dsi.fastutil.chars.Char2FloatFunctions.synchronize(it.unimi.dsi.fastutil.chars.Char2FloatFunction,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.chars.Char2FloatFunction p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.chars.Char2FloatFunction synchronize(it.unimi.dsi.fastutil.chars.Char2FloatFunction p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.chars.Char2FloatFunctions.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.chars.Char2FloatMaps#synchronize(it.unimi.dsi.fastutil.chars.Char2FloatMap,java.lang.Object)}
*@see it.unimi.dsi.fastutil.chars.Char2FloatMaps#synchronize(it.unimi.dsi.fastutil.chars.Char2FloatMap,java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.chars.Char2FloatMap it.unimi.dsi.fastutil.chars.Char2FloatMaps.synchronize(it.unimi.dsi.fastutil.chars.Char2FloatMap,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.chars.Char2FloatMap p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.chars.Char2FloatMap synchronize(it.unimi.dsi.fastutil.chars.Char2FloatMap p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.chars.Char2FloatMaps.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.chars.Char2FloatSortedMaps#synchronize(it.unimi.dsi.fastutil.chars.Char2FloatSortedMap,java.lang.Object)}
*@see it.unimi.dsi.fastutil.chars.Char2FloatSortedMaps#synchronize(it.unimi.dsi.fastutil.chars.Char2FloatSortedMap,java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.chars.Char2FloatSortedMap it.unimi.dsi.fastutil.chars.Char2FloatSortedMaps.synchronize(it.unimi.dsi.fastutil.chars.Char2FloatSortedMap,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.chars.Char2FloatSortedMap p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.chars.Char2FloatSortedMap synchronize(it.unimi.dsi.fastutil.chars.Char2FloatSortedMap p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.chars.Char2FloatSortedMaps.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.chars.Char2IntFunctions#synchronize(it.unimi.dsi.fastutil.chars.Char2IntFunction,java.lang.Object)}
*@see it.unimi.dsi.fastutil.chars.Char2IntFunctions#synchronize(it.unimi.dsi.fastutil.chars.Char2IntFunction,java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.chars.Char2IntFunction it.unimi.dsi.fastutil.chars.Char2IntFunctions.synchronize(it.unimi.dsi.fastutil.chars.Char2IntFunction,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.chars.Char2IntFunction p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.chars.Char2IntFunction synchronize(it.unimi.dsi.fastutil.chars.Char2IntFunction p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.chars.Char2IntFunctions.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.chars.Char2IntMaps#synchronize(it.unimi.dsi.fastutil.chars.Char2IntMap,java.lang.Object)}
*@see it.unimi.dsi.fastutil.chars.Char2IntMaps#synchronize(it.unimi.dsi.fastutil.chars.Char2IntMap,java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.chars.Char2IntMap it.unimi.dsi.fastutil.chars.Char2IntMaps.synchronize(it.unimi.dsi.fastutil.chars.Char2IntMap,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.chars.Char2IntMap p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.chars.Char2IntMap synchronize(it.unimi.dsi.fastutil.chars.Char2IntMap p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.chars.Char2IntMaps.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.chars.Char2IntSortedMaps#synchronize(it.unimi.dsi.fastutil.chars.Char2IntSortedMap,java.lang.Object)}
*@see it.unimi.dsi.fastutil.chars.Char2IntSortedMaps#synchronize(it.unimi.dsi.fastutil.chars.Char2IntSortedMap,java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.chars.Char2IntSortedMap it.unimi.dsi.fastutil.chars.Char2IntSortedMaps.synchronize(it.unimi.dsi.fastutil.chars.Char2IntSortedMap,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.chars.Char2IntSortedMap p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.chars.Char2IntSortedMap synchronize(it.unimi.dsi.fastutil.chars.Char2IntSortedMap p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.chars.Char2IntSortedMaps.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.chars.Char2LongFunctions#synchronize(it.unimi.dsi.fastutil.chars.Char2LongFunction,java.lang.Object)}
*@see it.unimi.dsi.fastutil.chars.Char2LongFunctions#synchronize(it.unimi.dsi.fastutil.chars.Char2LongFunction,java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.chars.Char2LongFunction it.unimi.dsi.fastutil.chars.Char2LongFunctions.synchronize(it.unimi.dsi.fastutil.chars.Char2LongFunction,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.chars.Char2LongFunction p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.chars.Char2LongFunction synchronize(it.unimi.dsi.fastutil.chars.Char2LongFunction p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.chars.Char2LongFunctions.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.chars.Char2LongMaps#synchronize(it.unimi.dsi.fastutil.chars.Char2LongMap,java.lang.Object)}
*@see it.unimi.dsi.fastutil.chars.Char2LongMaps#synchronize(it.unimi.dsi.fastutil.chars.Char2LongMap,java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.chars.Char2LongMap it.unimi.dsi.fastutil.chars.Char2LongMaps.synchronize(it.unimi.dsi.fastutil.chars.Char2LongMap,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.chars.Char2LongMap p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.chars.Char2LongMap synchronize(it.unimi.dsi.fastutil.chars.Char2LongMap p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.chars.Char2LongMaps.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.chars.Char2LongSortedMaps#synchronize(it.unimi.dsi.fastutil.chars.Char2LongSortedMap,java.lang.Object)}
*@see it.unimi.dsi.fastutil.chars.Char2LongSortedMaps#synchronize(it.unimi.dsi.fastutil.chars.Char2LongSortedMap,java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.chars.Char2LongSortedMap it.unimi.dsi.fastutil.chars.Char2LongSortedMaps.synchronize(it.unimi.dsi.fastutil.chars.Char2LongSortedMap,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.chars.Char2LongSortedMap p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.chars.Char2LongSortedMap synchronize(it.unimi.dsi.fastutil.chars.Char2LongSortedMap p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.chars.Char2LongSortedMaps.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.chars.Char2ObjectFunctions#synchronize(it.unimi.dsi.fastutil.chars.Char2ObjectFunction<V>,java.lang.Object)}
*@see it.unimi.dsi.fastutil.chars.Char2ObjectFunctions#synchronize(it.unimi.dsi.fastutil.chars.Char2ObjectFunction<V>,java.lang.Object)
*<code>public static <V> it.unimi.dsi.fastutil.chars.Char2ObjectFunction<V> it.unimi.dsi.fastutil.chars.Char2ObjectFunctions.synchronize(it.unimi.dsi.fastutil.chars.Char2ObjectFunction<V>,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.chars.Char2ObjectFunction<V> p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <V> it.unimi.dsi.fastutil.chars.Char2ObjectFunction<V> synchronize(it.unimi.dsi.fastutil.chars.Char2ObjectFunction<V> p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.chars.Char2ObjectFunctions.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.chars.Char2ObjectMaps#synchronize(it.unimi.dsi.fastutil.chars.Char2ObjectMap<V>,java.lang.Object)}
*@see it.unimi.dsi.fastutil.chars.Char2ObjectMaps#synchronize(it.unimi.dsi.fastutil.chars.Char2ObjectMap<V>,java.lang.Object)
*<code>public static <V> it.unimi.dsi.fastutil.chars.Char2ObjectMap<V> it.unimi.dsi.fastutil.chars.Char2ObjectMaps.synchronize(it.unimi.dsi.fastutil.chars.Char2ObjectMap<V>,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.chars.Char2ObjectMap<V> p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <V> it.unimi.dsi.fastutil.chars.Char2ObjectMap<V> synchronize(it.unimi.dsi.fastutil.chars.Char2ObjectMap<V> p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.chars.Char2ObjectMaps.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.chars.Char2ObjectSortedMaps#synchronize(it.unimi.dsi.fastutil.chars.Char2ObjectSortedMap<V>,java.lang.Object)}
*@see it.unimi.dsi.fastutil.chars.Char2ObjectSortedMaps#synchronize(it.unimi.dsi.fastutil.chars.Char2ObjectSortedMap<V>,java.lang.Object)
*<code>public static <V> it.unimi.dsi.fastutil.chars.Char2ObjectSortedMap<V> it.unimi.dsi.fastutil.chars.Char2ObjectSortedMaps.synchronize(it.unimi.dsi.fastutil.chars.Char2ObjectSortedMap<V>,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.chars.Char2ObjectSortedMap<V> p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <V> it.unimi.dsi.fastutil.chars.Char2ObjectSortedMap<V> synchronize(it.unimi.dsi.fastutil.chars.Char2ObjectSortedMap<V> p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.chars.Char2ObjectSortedMaps.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.chars.Char2ReferenceFunctions#synchronize(it.unimi.dsi.fastutil.chars.Char2ReferenceFunction<V>,java.lang.Object)}
*@see it.unimi.dsi.fastutil.chars.Char2ReferenceFunctions#synchronize(it.unimi.dsi.fastutil.chars.Char2ReferenceFunction<V>,java.lang.Object)
*<code>public static <V> it.unimi.dsi.fastutil.chars.Char2ReferenceFunction<V> it.unimi.dsi.fastutil.chars.Char2ReferenceFunctions.synchronize(it.unimi.dsi.fastutil.chars.Char2ReferenceFunction<V>,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.chars.Char2ReferenceFunction<V> p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <V> it.unimi.dsi.fastutil.chars.Char2ReferenceFunction<V> synchronize(it.unimi.dsi.fastutil.chars.Char2ReferenceFunction<V> p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.chars.Char2ReferenceFunctions.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.chars.Char2ReferenceMaps#synchronize(it.unimi.dsi.fastutil.chars.Char2ReferenceMap<V>,java.lang.Object)}
*@see it.unimi.dsi.fastutil.chars.Char2ReferenceMaps#synchronize(it.unimi.dsi.fastutil.chars.Char2ReferenceMap<V>,java.lang.Object)
*<code>public static <V> it.unimi.dsi.fastutil.chars.Char2ReferenceMap<V> it.unimi.dsi.fastutil.chars.Char2ReferenceMaps.synchronize(it.unimi.dsi.fastutil.chars.Char2ReferenceMap<V>,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.chars.Char2ReferenceMap<V> p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <V> it.unimi.dsi.fastutil.chars.Char2ReferenceMap<V> synchronize(it.unimi.dsi.fastutil.chars.Char2ReferenceMap<V> p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.chars.Char2ReferenceMaps.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.chars.Char2ReferenceSortedMaps#synchronize(it.unimi.dsi.fastutil.chars.Char2ReferenceSortedMap<V>,java.lang.Object)}
*@see it.unimi.dsi.fastutil.chars.Char2ReferenceSortedMaps#synchronize(it.unimi.dsi.fastutil.chars.Char2ReferenceSortedMap<V>,java.lang.Object)
*<code>public static <V> it.unimi.dsi.fastutil.chars.Char2ReferenceSortedMap<V> it.unimi.dsi.fastutil.chars.Char2ReferenceSortedMaps.synchronize(it.unimi.dsi.fastutil.chars.Char2ReferenceSortedMap<V>,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.chars.Char2ReferenceSortedMap<V> p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <V> it.unimi.dsi.fastutil.chars.Char2ReferenceSortedMap<V> synchronize(it.unimi.dsi.fastutil.chars.Char2ReferenceSortedMap<V> p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.chars.Char2ReferenceSortedMaps.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.chars.Char2ShortFunctions#synchronize(it.unimi.dsi.fastutil.chars.Char2ShortFunction,java.lang.Object)}
*@see it.unimi.dsi.fastutil.chars.Char2ShortFunctions#synchronize(it.unimi.dsi.fastutil.chars.Char2ShortFunction,java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.chars.Char2ShortFunction it.unimi.dsi.fastutil.chars.Char2ShortFunctions.synchronize(it.unimi.dsi.fastutil.chars.Char2ShortFunction,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.chars.Char2ShortFunction p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.chars.Char2ShortFunction synchronize(it.unimi.dsi.fastutil.chars.Char2ShortFunction p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.chars.Char2ShortFunctions.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.chars.Char2ShortMaps#synchronize(it.unimi.dsi.fastutil.chars.Char2ShortMap,java.lang.Object)}
*@see it.unimi.dsi.fastutil.chars.Char2ShortMaps#synchronize(it.unimi.dsi.fastutil.chars.Char2ShortMap,java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.chars.Char2ShortMap it.unimi.dsi.fastutil.chars.Char2ShortMaps.synchronize(it.unimi.dsi.fastutil.chars.Char2ShortMap,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.chars.Char2ShortMap p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.chars.Char2ShortMap synchronize(it.unimi.dsi.fastutil.chars.Char2ShortMap p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.chars.Char2ShortMaps.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.chars.Char2ShortSortedMaps#synchronize(it.unimi.dsi.fastutil.chars.Char2ShortSortedMap,java.lang.Object)}
*@see it.unimi.dsi.fastutil.chars.Char2ShortSortedMaps#synchronize(it.unimi.dsi.fastutil.chars.Char2ShortSortedMap,java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.chars.Char2ShortSortedMap it.unimi.dsi.fastutil.chars.Char2ShortSortedMaps.synchronize(it.unimi.dsi.fastutil.chars.Char2ShortSortedMap,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.chars.Char2ShortSortedMap p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.chars.Char2ShortSortedMap synchronize(it.unimi.dsi.fastutil.chars.Char2ShortSortedMap p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.chars.Char2ShortSortedMaps.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.chars.CharBigLists#synchronize(it.unimi.dsi.fastutil.chars.CharBigList,java.lang.Object)}
*@see it.unimi.dsi.fastutil.chars.CharBigLists#synchronize(it.unimi.dsi.fastutil.chars.CharBigList,java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.chars.CharBigList it.unimi.dsi.fastutil.chars.CharBigLists.synchronize(it.unimi.dsi.fastutil.chars.CharBigList,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.chars.CharBigList p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.chars.CharBigList synchronize(it.unimi.dsi.fastutil.chars.CharBigList p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.chars.CharBigLists.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.chars.CharCollections#synchronize(it.unimi.dsi.fastutil.chars.CharCollection,java.lang.Object)}
*@see it.unimi.dsi.fastutil.chars.CharCollections#synchronize(it.unimi.dsi.fastutil.chars.CharCollection,java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.chars.CharCollection it.unimi.dsi.fastutil.chars.CharCollections.synchronize(it.unimi.dsi.fastutil.chars.CharCollection,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.chars.CharCollection p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.chars.CharCollection synchronize(it.unimi.dsi.fastutil.chars.CharCollection p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.chars.CharCollections.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.chars.CharLists#synchronize(it.unimi.dsi.fastutil.chars.CharList,java.lang.Object)}
*@see it.unimi.dsi.fastutil.chars.CharLists#synchronize(it.unimi.dsi.fastutil.chars.CharList,java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.chars.CharList it.unimi.dsi.fastutil.chars.CharLists.synchronize(it.unimi.dsi.fastutil.chars.CharList,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.chars.CharList p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.chars.CharList synchronize(it.unimi.dsi.fastutil.chars.CharList p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.chars.CharLists.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.chars.CharPriorityQueues#synchronize(it.unimi.dsi.fastutil.chars.CharPriorityQueue,java.lang.Object)}
*@see it.unimi.dsi.fastutil.chars.CharPriorityQueues#synchronize(it.unimi.dsi.fastutil.chars.CharPriorityQueue,java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.chars.CharPriorityQueue it.unimi.dsi.fastutil.chars.CharPriorityQueues.synchronize(it.unimi.dsi.fastutil.chars.CharPriorityQueue,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.chars.CharPriorityQueue p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.chars.CharPriorityQueue synchronize(it.unimi.dsi.fastutil.chars.CharPriorityQueue p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.chars.CharPriorityQueues.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.chars.CharSets#synchronize(it.unimi.dsi.fastutil.chars.CharSet,java.lang.Object)}
*@see it.unimi.dsi.fastutil.chars.CharSets#synchronize(it.unimi.dsi.fastutil.chars.CharSet,java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.chars.CharSet it.unimi.dsi.fastutil.chars.CharSets.synchronize(it.unimi.dsi.fastutil.chars.CharSet,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.chars.CharSet p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.chars.CharSet synchronize(it.unimi.dsi.fastutil.chars.CharSet p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.chars.CharSets.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.chars.CharSortedSets#synchronize(it.unimi.dsi.fastutil.chars.CharSortedSet,java.lang.Object)}
*@see it.unimi.dsi.fastutil.chars.CharSortedSets#synchronize(it.unimi.dsi.fastutil.chars.CharSortedSet,java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.chars.CharSortedSet it.unimi.dsi.fastutil.chars.CharSortedSets.synchronize(it.unimi.dsi.fastutil.chars.CharSortedSet,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.chars.CharSortedSet p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.chars.CharSortedSet synchronize(it.unimi.dsi.fastutil.chars.CharSortedSet p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.chars.CharSortedSets.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.doubles.Double2BooleanFunctions#synchronize(it.unimi.dsi.fastutil.doubles.Double2BooleanFunction,java.lang.Object)}
*@see it.unimi.dsi.fastutil.doubles.Double2BooleanFunctions#synchronize(it.unimi.dsi.fastutil.doubles.Double2BooleanFunction,java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.doubles.Double2BooleanFunction it.unimi.dsi.fastutil.doubles.Double2BooleanFunctions.synchronize(it.unimi.dsi.fastutil.doubles.Double2BooleanFunction,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.doubles.Double2BooleanFunction p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.doubles.Double2BooleanFunction synchronize(it.unimi.dsi.fastutil.doubles.Double2BooleanFunction p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.doubles.Double2BooleanFunctions.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.doubles.Double2BooleanMaps#synchronize(it.unimi.dsi.fastutil.doubles.Double2BooleanMap,java.lang.Object)}
*@see it.unimi.dsi.fastutil.doubles.Double2BooleanMaps#synchronize(it.unimi.dsi.fastutil.doubles.Double2BooleanMap,java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.doubles.Double2BooleanMap it.unimi.dsi.fastutil.doubles.Double2BooleanMaps.synchronize(it.unimi.dsi.fastutil.doubles.Double2BooleanMap,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.doubles.Double2BooleanMap p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.doubles.Double2BooleanMap synchronize(it.unimi.dsi.fastutil.doubles.Double2BooleanMap p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.doubles.Double2BooleanMaps.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.doubles.Double2BooleanSortedMaps#synchronize(it.unimi.dsi.fastutil.doubles.Double2BooleanSortedMap,java.lang.Object)}
*@see it.unimi.dsi.fastutil.doubles.Double2BooleanSortedMaps#synchronize(it.unimi.dsi.fastutil.doubles.Double2BooleanSortedMap,java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.doubles.Double2BooleanSortedMap it.unimi.dsi.fastutil.doubles.Double2BooleanSortedMaps.synchronize(it.unimi.dsi.fastutil.doubles.Double2BooleanSortedMap,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.doubles.Double2BooleanSortedMap p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.doubles.Double2BooleanSortedMap synchronize(it.unimi.dsi.fastutil.doubles.Double2BooleanSortedMap p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.doubles.Double2BooleanSortedMaps.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.doubles.Double2ByteFunctions#synchronize(it.unimi.dsi.fastutil.doubles.Double2ByteFunction,java.lang.Object)}
*@see it.unimi.dsi.fastutil.doubles.Double2ByteFunctions#synchronize(it.unimi.dsi.fastutil.doubles.Double2ByteFunction,java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.doubles.Double2ByteFunction it.unimi.dsi.fastutil.doubles.Double2ByteFunctions.synchronize(it.unimi.dsi.fastutil.doubles.Double2ByteFunction,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.doubles.Double2ByteFunction p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.doubles.Double2ByteFunction synchronize(it.unimi.dsi.fastutil.doubles.Double2ByteFunction p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.doubles.Double2ByteFunctions.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.doubles.Double2ByteMaps#synchronize(it.unimi.dsi.fastutil.doubles.Double2ByteMap,java.lang.Object)}
*@see it.unimi.dsi.fastutil.doubles.Double2ByteMaps#synchronize(it.unimi.dsi.fastutil.doubles.Double2ByteMap,java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.doubles.Double2ByteMap it.unimi.dsi.fastutil.doubles.Double2ByteMaps.synchronize(it.unimi.dsi.fastutil.doubles.Double2ByteMap,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.doubles.Double2ByteMap p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.doubles.Double2ByteMap synchronize(it.unimi.dsi.fastutil.doubles.Double2ByteMap p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.doubles.Double2ByteMaps.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.doubles.Double2ByteSortedMaps#synchronize(it.unimi.dsi.fastutil.doubles.Double2ByteSortedMap,java.lang.Object)}
*@see it.unimi.dsi.fastutil.doubles.Double2ByteSortedMaps#synchronize(it.unimi.dsi.fastutil.doubles.Double2ByteSortedMap,java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.doubles.Double2ByteSortedMap it.unimi.dsi.fastutil.doubles.Double2ByteSortedMaps.synchronize(it.unimi.dsi.fastutil.doubles.Double2ByteSortedMap,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.doubles.Double2ByteSortedMap p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.doubles.Double2ByteSortedMap synchronize(it.unimi.dsi.fastutil.doubles.Double2ByteSortedMap p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.doubles.Double2ByteSortedMaps.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.doubles.Double2CharFunctions#synchronize(it.unimi.dsi.fastutil.doubles.Double2CharFunction,java.lang.Object)}
*@see it.unimi.dsi.fastutil.doubles.Double2CharFunctions#synchronize(it.unimi.dsi.fastutil.doubles.Double2CharFunction,java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.doubles.Double2CharFunction it.unimi.dsi.fastutil.doubles.Double2CharFunctions.synchronize(it.unimi.dsi.fastutil.doubles.Double2CharFunction,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.doubles.Double2CharFunction p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.doubles.Double2CharFunction synchronize(it.unimi.dsi.fastutil.doubles.Double2CharFunction p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.doubles.Double2CharFunctions.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.doubles.Double2CharMaps#synchronize(it.unimi.dsi.fastutil.doubles.Double2CharMap,java.lang.Object)}
*@see it.unimi.dsi.fastutil.doubles.Double2CharMaps#synchronize(it.unimi.dsi.fastutil.doubles.Double2CharMap,java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.doubles.Double2CharMap it.unimi.dsi.fastutil.doubles.Double2CharMaps.synchronize(it.unimi.dsi.fastutil.doubles.Double2CharMap,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.doubles.Double2CharMap p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.doubles.Double2CharMap synchronize(it.unimi.dsi.fastutil.doubles.Double2CharMap p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.doubles.Double2CharMaps.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.doubles.Double2CharSortedMaps#synchronize(it.unimi.dsi.fastutil.doubles.Double2CharSortedMap,java.lang.Object)}
*@see it.unimi.dsi.fastutil.doubles.Double2CharSortedMaps#synchronize(it.unimi.dsi.fastutil.doubles.Double2CharSortedMap,java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.doubles.Double2CharSortedMap it.unimi.dsi.fastutil.doubles.Double2CharSortedMaps.synchronize(it.unimi.dsi.fastutil.doubles.Double2CharSortedMap,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.doubles.Double2CharSortedMap p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.doubles.Double2CharSortedMap synchronize(it.unimi.dsi.fastutil.doubles.Double2CharSortedMap p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.doubles.Double2CharSortedMaps.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.doubles.Double2DoubleFunctions#synchronize(it.unimi.dsi.fastutil.doubles.Double2DoubleFunction,java.lang.Object)}
*@see it.unimi.dsi.fastutil.doubles.Double2DoubleFunctions#synchronize(it.unimi.dsi.fastutil.doubles.Double2DoubleFunction,java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.doubles.Double2DoubleFunction it.unimi.dsi.fastutil.doubles.Double2DoubleFunctions.synchronize(it.unimi.dsi.fastutil.doubles.Double2DoubleFunction,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.doubles.Double2DoubleFunction p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.doubles.Double2DoubleFunction synchronize(it.unimi.dsi.fastutil.doubles.Double2DoubleFunction p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.doubles.Double2DoubleFunctions.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.doubles.Double2DoubleMaps#synchronize(it.unimi.dsi.fastutil.doubles.Double2DoubleMap,java.lang.Object)}
*@see it.unimi.dsi.fastutil.doubles.Double2DoubleMaps#synchronize(it.unimi.dsi.fastutil.doubles.Double2DoubleMap,java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.doubles.Double2DoubleMap it.unimi.dsi.fastutil.doubles.Double2DoubleMaps.synchronize(it.unimi.dsi.fastutil.doubles.Double2DoubleMap,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.doubles.Double2DoubleMap p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.doubles.Double2DoubleMap synchronize(it.unimi.dsi.fastutil.doubles.Double2DoubleMap p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.doubles.Double2DoubleMaps.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.doubles.Double2DoubleSortedMaps#synchronize(it.unimi.dsi.fastutil.doubles.Double2DoubleSortedMap,java.lang.Object)}
*@see it.unimi.dsi.fastutil.doubles.Double2DoubleSortedMaps#synchronize(it.unimi.dsi.fastutil.doubles.Double2DoubleSortedMap,java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.doubles.Double2DoubleSortedMap it.unimi.dsi.fastutil.doubles.Double2DoubleSortedMaps.synchronize(it.unimi.dsi.fastutil.doubles.Double2DoubleSortedMap,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.doubles.Double2DoubleSortedMap p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.doubles.Double2DoubleSortedMap synchronize(it.unimi.dsi.fastutil.doubles.Double2DoubleSortedMap p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.doubles.Double2DoubleSortedMaps.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.doubles.Double2FloatFunctions#synchronize(it.unimi.dsi.fastutil.doubles.Double2FloatFunction,java.lang.Object)}
*@see it.unimi.dsi.fastutil.doubles.Double2FloatFunctions#synchronize(it.unimi.dsi.fastutil.doubles.Double2FloatFunction,java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.doubles.Double2FloatFunction it.unimi.dsi.fastutil.doubles.Double2FloatFunctions.synchronize(it.unimi.dsi.fastutil.doubles.Double2FloatFunction,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.doubles.Double2FloatFunction p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.doubles.Double2FloatFunction synchronize(it.unimi.dsi.fastutil.doubles.Double2FloatFunction p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.doubles.Double2FloatFunctions.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.doubles.Double2FloatMaps#synchronize(it.unimi.dsi.fastutil.doubles.Double2FloatMap,java.lang.Object)}
*@see it.unimi.dsi.fastutil.doubles.Double2FloatMaps#synchronize(it.unimi.dsi.fastutil.doubles.Double2FloatMap,java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.doubles.Double2FloatMap it.unimi.dsi.fastutil.doubles.Double2FloatMaps.synchronize(it.unimi.dsi.fastutil.doubles.Double2FloatMap,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.doubles.Double2FloatMap p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.doubles.Double2FloatMap synchronize(it.unimi.dsi.fastutil.doubles.Double2FloatMap p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.doubles.Double2FloatMaps.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.doubles.Double2FloatSortedMaps#synchronize(it.unimi.dsi.fastutil.doubles.Double2FloatSortedMap,java.lang.Object)}
*@see it.unimi.dsi.fastutil.doubles.Double2FloatSortedMaps#synchronize(it.unimi.dsi.fastutil.doubles.Double2FloatSortedMap,java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.doubles.Double2FloatSortedMap it.unimi.dsi.fastutil.doubles.Double2FloatSortedMaps.synchronize(it.unimi.dsi.fastutil.doubles.Double2FloatSortedMap,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.doubles.Double2FloatSortedMap p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.doubles.Double2FloatSortedMap synchronize(it.unimi.dsi.fastutil.doubles.Double2FloatSortedMap p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.doubles.Double2FloatSortedMaps.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.doubles.Double2IntFunctions#synchronize(it.unimi.dsi.fastutil.doubles.Double2IntFunction,java.lang.Object)}
*@see it.unimi.dsi.fastutil.doubles.Double2IntFunctions#synchronize(it.unimi.dsi.fastutil.doubles.Double2IntFunction,java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.doubles.Double2IntFunction it.unimi.dsi.fastutil.doubles.Double2IntFunctions.synchronize(it.unimi.dsi.fastutil.doubles.Double2IntFunction,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.doubles.Double2IntFunction p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.doubles.Double2IntFunction synchronize(it.unimi.dsi.fastutil.doubles.Double2IntFunction p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.doubles.Double2IntFunctions.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.doubles.Double2IntMaps#synchronize(it.unimi.dsi.fastutil.doubles.Double2IntMap,java.lang.Object)}
*@see it.unimi.dsi.fastutil.doubles.Double2IntMaps#synchronize(it.unimi.dsi.fastutil.doubles.Double2IntMap,java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.doubles.Double2IntMap it.unimi.dsi.fastutil.doubles.Double2IntMaps.synchronize(it.unimi.dsi.fastutil.doubles.Double2IntMap,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.doubles.Double2IntMap p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.doubles.Double2IntMap synchronize(it.unimi.dsi.fastutil.doubles.Double2IntMap p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.doubles.Double2IntMaps.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.doubles.Double2IntSortedMaps#synchronize(it.unimi.dsi.fastutil.doubles.Double2IntSortedMap,java.lang.Object)}
*@see it.unimi.dsi.fastutil.doubles.Double2IntSortedMaps#synchronize(it.unimi.dsi.fastutil.doubles.Double2IntSortedMap,java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.doubles.Double2IntSortedMap it.unimi.dsi.fastutil.doubles.Double2IntSortedMaps.synchronize(it.unimi.dsi.fastutil.doubles.Double2IntSortedMap,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.doubles.Double2IntSortedMap p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.doubles.Double2IntSortedMap synchronize(it.unimi.dsi.fastutil.doubles.Double2IntSortedMap p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.doubles.Double2IntSortedMaps.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.doubles.Double2LongFunctions#synchronize(it.unimi.dsi.fastutil.doubles.Double2LongFunction,java.lang.Object)}
*@see it.unimi.dsi.fastutil.doubles.Double2LongFunctions#synchronize(it.unimi.dsi.fastutil.doubles.Double2LongFunction,java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.doubles.Double2LongFunction it.unimi.dsi.fastutil.doubles.Double2LongFunctions.synchronize(it.unimi.dsi.fastutil.doubles.Double2LongFunction,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.doubles.Double2LongFunction p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.doubles.Double2LongFunction synchronize(it.unimi.dsi.fastutil.doubles.Double2LongFunction p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.doubles.Double2LongFunctions.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.doubles.Double2LongMaps#synchronize(it.unimi.dsi.fastutil.doubles.Double2LongMap,java.lang.Object)}
*@see it.unimi.dsi.fastutil.doubles.Double2LongMaps#synchronize(it.unimi.dsi.fastutil.doubles.Double2LongMap,java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.doubles.Double2LongMap it.unimi.dsi.fastutil.doubles.Double2LongMaps.synchronize(it.unimi.dsi.fastutil.doubles.Double2LongMap,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.doubles.Double2LongMap p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.doubles.Double2LongMap synchronize(it.unimi.dsi.fastutil.doubles.Double2LongMap p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.doubles.Double2LongMaps.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.doubles.Double2LongSortedMaps#synchronize(it.unimi.dsi.fastutil.doubles.Double2LongSortedMap,java.lang.Object)}
*@see it.unimi.dsi.fastutil.doubles.Double2LongSortedMaps#synchronize(it.unimi.dsi.fastutil.doubles.Double2LongSortedMap,java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.doubles.Double2LongSortedMap it.unimi.dsi.fastutil.doubles.Double2LongSortedMaps.synchronize(it.unimi.dsi.fastutil.doubles.Double2LongSortedMap,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.doubles.Double2LongSortedMap p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.doubles.Double2LongSortedMap synchronize(it.unimi.dsi.fastutil.doubles.Double2LongSortedMap p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.doubles.Double2LongSortedMaps.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.doubles.Double2ObjectFunctions#synchronize(it.unimi.dsi.fastutil.doubles.Double2ObjectFunction<V>,java.lang.Object)}
*@see it.unimi.dsi.fastutil.doubles.Double2ObjectFunctions#synchronize(it.unimi.dsi.fastutil.doubles.Double2ObjectFunction<V>,java.lang.Object)
*<code>public static <V> it.unimi.dsi.fastutil.doubles.Double2ObjectFunction<V> it.unimi.dsi.fastutil.doubles.Double2ObjectFunctions.synchronize(it.unimi.dsi.fastutil.doubles.Double2ObjectFunction<V>,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.doubles.Double2ObjectFunction<V> p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <V> it.unimi.dsi.fastutil.doubles.Double2ObjectFunction<V> synchronize(it.unimi.dsi.fastutil.doubles.Double2ObjectFunction<V> p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.doubles.Double2ObjectFunctions.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.doubles.Double2ObjectMaps#synchronize(it.unimi.dsi.fastutil.doubles.Double2ObjectMap<V>,java.lang.Object)}
*@see it.unimi.dsi.fastutil.doubles.Double2ObjectMaps#synchronize(it.unimi.dsi.fastutil.doubles.Double2ObjectMap<V>,java.lang.Object)
*<code>public static <V> it.unimi.dsi.fastutil.doubles.Double2ObjectMap<V> it.unimi.dsi.fastutil.doubles.Double2ObjectMaps.synchronize(it.unimi.dsi.fastutil.doubles.Double2ObjectMap<V>,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.doubles.Double2ObjectMap<V> p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <V> it.unimi.dsi.fastutil.doubles.Double2ObjectMap<V> synchronize(it.unimi.dsi.fastutil.doubles.Double2ObjectMap<V> p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.doubles.Double2ObjectMaps.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.doubles.Double2ObjectSortedMaps#synchronize(it.unimi.dsi.fastutil.doubles.Double2ObjectSortedMap<V>,java.lang.Object)}
*@see it.unimi.dsi.fastutil.doubles.Double2ObjectSortedMaps#synchronize(it.unimi.dsi.fastutil.doubles.Double2ObjectSortedMap<V>,java.lang.Object)
*<code>public static <V> it.unimi.dsi.fastutil.doubles.Double2ObjectSortedMap<V> it.unimi.dsi.fastutil.doubles.Double2ObjectSortedMaps.synchronize(it.unimi.dsi.fastutil.doubles.Double2ObjectSortedMap<V>,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.doubles.Double2ObjectSortedMap<V> p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <V> it.unimi.dsi.fastutil.doubles.Double2ObjectSortedMap<V> synchronize(it.unimi.dsi.fastutil.doubles.Double2ObjectSortedMap<V> p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.doubles.Double2ObjectSortedMaps.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.doubles.Double2ReferenceFunctions#synchronize(it.unimi.dsi.fastutil.doubles.Double2ReferenceFunction<V>,java.lang.Object)}
*@see it.unimi.dsi.fastutil.doubles.Double2ReferenceFunctions#synchronize(it.unimi.dsi.fastutil.doubles.Double2ReferenceFunction<V>,java.lang.Object)
*<code>public static <V> it.unimi.dsi.fastutil.doubles.Double2ReferenceFunction<V> it.unimi.dsi.fastutil.doubles.Double2ReferenceFunctions.synchronize(it.unimi.dsi.fastutil.doubles.Double2ReferenceFunction<V>,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.doubles.Double2ReferenceFunction<V> p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <V> it.unimi.dsi.fastutil.doubles.Double2ReferenceFunction<V> synchronize(it.unimi.dsi.fastutil.doubles.Double2ReferenceFunction<V> p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.doubles.Double2ReferenceFunctions.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.doubles.Double2ReferenceMaps#synchronize(it.unimi.dsi.fastutil.doubles.Double2ReferenceMap<V>,java.lang.Object)}
*@see it.unimi.dsi.fastutil.doubles.Double2ReferenceMaps#synchronize(it.unimi.dsi.fastutil.doubles.Double2ReferenceMap<V>,java.lang.Object)
*<code>public static <V> it.unimi.dsi.fastutil.doubles.Double2ReferenceMap<V> it.unimi.dsi.fastutil.doubles.Double2ReferenceMaps.synchronize(it.unimi.dsi.fastutil.doubles.Double2ReferenceMap<V>,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.doubles.Double2ReferenceMap<V> p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <V> it.unimi.dsi.fastutil.doubles.Double2ReferenceMap<V> synchronize(it.unimi.dsi.fastutil.doubles.Double2ReferenceMap<V> p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.doubles.Double2ReferenceMaps.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.doubles.Double2ReferenceSortedMaps#synchronize(it.unimi.dsi.fastutil.doubles.Double2ReferenceSortedMap<V>,java.lang.Object)}
*@see it.unimi.dsi.fastutil.doubles.Double2ReferenceSortedMaps#synchronize(it.unimi.dsi.fastutil.doubles.Double2ReferenceSortedMap<V>,java.lang.Object)
*<code>public static <V> it.unimi.dsi.fastutil.doubles.Double2ReferenceSortedMap<V> it.unimi.dsi.fastutil.doubles.Double2ReferenceSortedMaps.synchronize(it.unimi.dsi.fastutil.doubles.Double2ReferenceSortedMap<V>,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.doubles.Double2ReferenceSortedMap<V> p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <V> it.unimi.dsi.fastutil.doubles.Double2ReferenceSortedMap<V> synchronize(it.unimi.dsi.fastutil.doubles.Double2ReferenceSortedMap<V> p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.doubles.Double2ReferenceSortedMaps.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.doubles.Double2ShortFunctions#synchronize(it.unimi.dsi.fastutil.doubles.Double2ShortFunction,java.lang.Object)}
*@see it.unimi.dsi.fastutil.doubles.Double2ShortFunctions#synchronize(it.unimi.dsi.fastutil.doubles.Double2ShortFunction,java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.doubles.Double2ShortFunction it.unimi.dsi.fastutil.doubles.Double2ShortFunctions.synchronize(it.unimi.dsi.fastutil.doubles.Double2ShortFunction,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.doubles.Double2ShortFunction p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.doubles.Double2ShortFunction synchronize(it.unimi.dsi.fastutil.doubles.Double2ShortFunction p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.doubles.Double2ShortFunctions.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.doubles.Double2ShortMaps#synchronize(it.unimi.dsi.fastutil.doubles.Double2ShortMap,java.lang.Object)}
*@see it.unimi.dsi.fastutil.doubles.Double2ShortMaps#synchronize(it.unimi.dsi.fastutil.doubles.Double2ShortMap,java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.doubles.Double2ShortMap it.unimi.dsi.fastutil.doubles.Double2ShortMaps.synchronize(it.unimi.dsi.fastutil.doubles.Double2ShortMap,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.doubles.Double2ShortMap p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.doubles.Double2ShortMap synchronize(it.unimi.dsi.fastutil.doubles.Double2ShortMap p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.doubles.Double2ShortMaps.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.doubles.Double2ShortSortedMaps#synchronize(it.unimi.dsi.fastutil.doubles.Double2ShortSortedMap,java.lang.Object)}
*@see it.unimi.dsi.fastutil.doubles.Double2ShortSortedMaps#synchronize(it.unimi.dsi.fastutil.doubles.Double2ShortSortedMap,java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.doubles.Double2ShortSortedMap it.unimi.dsi.fastutil.doubles.Double2ShortSortedMaps.synchronize(it.unimi.dsi.fastutil.doubles.Double2ShortSortedMap,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.doubles.Double2ShortSortedMap p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.doubles.Double2ShortSortedMap synchronize(it.unimi.dsi.fastutil.doubles.Double2ShortSortedMap p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.doubles.Double2ShortSortedMaps.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.doubles.DoubleBigLists#synchronize(it.unimi.dsi.fastutil.doubles.DoubleBigList,java.lang.Object)}
*@see it.unimi.dsi.fastutil.doubles.DoubleBigLists#synchronize(it.unimi.dsi.fastutil.doubles.DoubleBigList,java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.doubles.DoubleBigList it.unimi.dsi.fastutil.doubles.DoubleBigLists.synchronize(it.unimi.dsi.fastutil.doubles.DoubleBigList,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.doubles.DoubleBigList p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.doubles.DoubleBigList synchronize(it.unimi.dsi.fastutil.doubles.DoubleBigList p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.doubles.DoubleBigLists.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.doubles.DoubleCollections#synchronize(it.unimi.dsi.fastutil.doubles.DoubleCollection,java.lang.Object)}
*@see it.unimi.dsi.fastutil.doubles.DoubleCollections#synchronize(it.unimi.dsi.fastutil.doubles.DoubleCollection,java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.doubles.DoubleCollection it.unimi.dsi.fastutil.doubles.DoubleCollections.synchronize(it.unimi.dsi.fastutil.doubles.DoubleCollection,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.doubles.DoubleCollection p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.doubles.DoubleCollection synchronize(it.unimi.dsi.fastutil.doubles.DoubleCollection p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.doubles.DoubleCollections.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.doubles.DoubleLists#synchronize(it.unimi.dsi.fastutil.doubles.DoubleList,java.lang.Object)}
*@see it.unimi.dsi.fastutil.doubles.DoubleLists#synchronize(it.unimi.dsi.fastutil.doubles.DoubleList,java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.doubles.DoubleList it.unimi.dsi.fastutil.doubles.DoubleLists.synchronize(it.unimi.dsi.fastutil.doubles.DoubleList,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.doubles.DoubleList p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.doubles.DoubleList synchronize(it.unimi.dsi.fastutil.doubles.DoubleList p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.doubles.DoubleLists.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.doubles.DoublePriorityQueues#synchronize(it.unimi.dsi.fastutil.doubles.DoublePriorityQueue,java.lang.Object)}
*@see it.unimi.dsi.fastutil.doubles.DoublePriorityQueues#synchronize(it.unimi.dsi.fastutil.doubles.DoublePriorityQueue,java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.doubles.DoublePriorityQueue it.unimi.dsi.fastutil.doubles.DoublePriorityQueues.synchronize(it.unimi.dsi.fastutil.doubles.DoublePriorityQueue,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.doubles.DoublePriorityQueue p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.doubles.DoublePriorityQueue synchronize(it.unimi.dsi.fastutil.doubles.DoublePriorityQueue p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.doubles.DoublePriorityQueues.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.doubles.DoubleSets#synchronize(it.unimi.dsi.fastutil.doubles.DoubleSet,java.lang.Object)}
*@see it.unimi.dsi.fastutil.doubles.DoubleSets#synchronize(it.unimi.dsi.fastutil.doubles.DoubleSet,java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.doubles.DoubleSet it.unimi.dsi.fastutil.doubles.DoubleSets.synchronize(it.unimi.dsi.fastutil.doubles.DoubleSet,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.doubles.DoubleSet p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.doubles.DoubleSet synchronize(it.unimi.dsi.fastutil.doubles.DoubleSet p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.doubles.DoubleSets.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.doubles.DoubleSortedSets#synchronize(it.unimi.dsi.fastutil.doubles.DoubleSortedSet,java.lang.Object)}
*@see it.unimi.dsi.fastutil.doubles.DoubleSortedSets#synchronize(it.unimi.dsi.fastutil.doubles.DoubleSortedSet,java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.doubles.DoubleSortedSet it.unimi.dsi.fastutil.doubles.DoubleSortedSets.synchronize(it.unimi.dsi.fastutil.doubles.DoubleSortedSet,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.doubles.DoubleSortedSet p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.doubles.DoubleSortedSet synchronize(it.unimi.dsi.fastutil.doubles.DoubleSortedSet p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.doubles.DoubleSortedSets.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.floats.Float2BooleanFunctions#synchronize(it.unimi.dsi.fastutil.floats.Float2BooleanFunction,java.lang.Object)}
*@see it.unimi.dsi.fastutil.floats.Float2BooleanFunctions#synchronize(it.unimi.dsi.fastutil.floats.Float2BooleanFunction,java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.floats.Float2BooleanFunction it.unimi.dsi.fastutil.floats.Float2BooleanFunctions.synchronize(it.unimi.dsi.fastutil.floats.Float2BooleanFunction,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.floats.Float2BooleanFunction p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.floats.Float2BooleanFunction synchronize(it.unimi.dsi.fastutil.floats.Float2BooleanFunction p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.floats.Float2BooleanFunctions.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.floats.Float2BooleanMaps#synchronize(it.unimi.dsi.fastutil.floats.Float2BooleanMap,java.lang.Object)}
*@see it.unimi.dsi.fastutil.floats.Float2BooleanMaps#synchronize(it.unimi.dsi.fastutil.floats.Float2BooleanMap,java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.floats.Float2BooleanMap it.unimi.dsi.fastutil.floats.Float2BooleanMaps.synchronize(it.unimi.dsi.fastutil.floats.Float2BooleanMap,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.floats.Float2BooleanMap p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.floats.Float2BooleanMap synchronize(it.unimi.dsi.fastutil.floats.Float2BooleanMap p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.floats.Float2BooleanMaps.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.floats.Float2BooleanSortedMaps#synchronize(it.unimi.dsi.fastutil.floats.Float2BooleanSortedMap,java.lang.Object)}
*@see it.unimi.dsi.fastutil.floats.Float2BooleanSortedMaps#synchronize(it.unimi.dsi.fastutil.floats.Float2BooleanSortedMap,java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.floats.Float2BooleanSortedMap it.unimi.dsi.fastutil.floats.Float2BooleanSortedMaps.synchronize(it.unimi.dsi.fastutil.floats.Float2BooleanSortedMap,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.floats.Float2BooleanSortedMap p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.floats.Float2BooleanSortedMap synchronize(it.unimi.dsi.fastutil.floats.Float2BooleanSortedMap p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.floats.Float2BooleanSortedMaps.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.floats.Float2ByteFunctions#synchronize(it.unimi.dsi.fastutil.floats.Float2ByteFunction,java.lang.Object)}
*@see it.unimi.dsi.fastutil.floats.Float2ByteFunctions#synchronize(it.unimi.dsi.fastutil.floats.Float2ByteFunction,java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.floats.Float2ByteFunction it.unimi.dsi.fastutil.floats.Float2ByteFunctions.synchronize(it.unimi.dsi.fastutil.floats.Float2ByteFunction,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.floats.Float2ByteFunction p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.floats.Float2ByteFunction synchronize(it.unimi.dsi.fastutil.floats.Float2ByteFunction p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.floats.Float2ByteFunctions.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.floats.Float2ByteMaps#synchronize(it.unimi.dsi.fastutil.floats.Float2ByteMap,java.lang.Object)}
*@see it.unimi.dsi.fastutil.floats.Float2ByteMaps#synchronize(it.unimi.dsi.fastutil.floats.Float2ByteMap,java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.floats.Float2ByteMap it.unimi.dsi.fastutil.floats.Float2ByteMaps.synchronize(it.unimi.dsi.fastutil.floats.Float2ByteMap,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.floats.Float2ByteMap p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.floats.Float2ByteMap synchronize(it.unimi.dsi.fastutil.floats.Float2ByteMap p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.floats.Float2ByteMaps.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.floats.Float2ByteSortedMaps#synchronize(it.unimi.dsi.fastutil.floats.Float2ByteSortedMap,java.lang.Object)}
*@see it.unimi.dsi.fastutil.floats.Float2ByteSortedMaps#synchronize(it.unimi.dsi.fastutil.floats.Float2ByteSortedMap,java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.floats.Float2ByteSortedMap it.unimi.dsi.fastutil.floats.Float2ByteSortedMaps.synchronize(it.unimi.dsi.fastutil.floats.Float2ByteSortedMap,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.floats.Float2ByteSortedMap p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.floats.Float2ByteSortedMap synchronize(it.unimi.dsi.fastutil.floats.Float2ByteSortedMap p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.floats.Float2ByteSortedMaps.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.floats.Float2CharFunctions#synchronize(it.unimi.dsi.fastutil.floats.Float2CharFunction,java.lang.Object)}
*@see it.unimi.dsi.fastutil.floats.Float2CharFunctions#synchronize(it.unimi.dsi.fastutil.floats.Float2CharFunction,java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.floats.Float2CharFunction it.unimi.dsi.fastutil.floats.Float2CharFunctions.synchronize(it.unimi.dsi.fastutil.floats.Float2CharFunction,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.floats.Float2CharFunction p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.floats.Float2CharFunction synchronize(it.unimi.dsi.fastutil.floats.Float2CharFunction p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.floats.Float2CharFunctions.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.floats.Float2CharMaps#synchronize(it.unimi.dsi.fastutil.floats.Float2CharMap,java.lang.Object)}
*@see it.unimi.dsi.fastutil.floats.Float2CharMaps#synchronize(it.unimi.dsi.fastutil.floats.Float2CharMap,java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.floats.Float2CharMap it.unimi.dsi.fastutil.floats.Float2CharMaps.synchronize(it.unimi.dsi.fastutil.floats.Float2CharMap,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.floats.Float2CharMap p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.floats.Float2CharMap synchronize(it.unimi.dsi.fastutil.floats.Float2CharMap p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.floats.Float2CharMaps.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.floats.Float2CharSortedMaps#synchronize(it.unimi.dsi.fastutil.floats.Float2CharSortedMap,java.lang.Object)}
*@see it.unimi.dsi.fastutil.floats.Float2CharSortedMaps#synchronize(it.unimi.dsi.fastutil.floats.Float2CharSortedMap,java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.floats.Float2CharSortedMap it.unimi.dsi.fastutil.floats.Float2CharSortedMaps.synchronize(it.unimi.dsi.fastutil.floats.Float2CharSortedMap,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.floats.Float2CharSortedMap p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.floats.Float2CharSortedMap synchronize(it.unimi.dsi.fastutil.floats.Float2CharSortedMap p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.floats.Float2CharSortedMaps.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.floats.Float2DoubleFunctions#synchronize(it.unimi.dsi.fastutil.floats.Float2DoubleFunction,java.lang.Object)}
*@see it.unimi.dsi.fastutil.floats.Float2DoubleFunctions#synchronize(it.unimi.dsi.fastutil.floats.Float2DoubleFunction,java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.floats.Float2DoubleFunction it.unimi.dsi.fastutil.floats.Float2DoubleFunctions.synchronize(it.unimi.dsi.fastutil.floats.Float2DoubleFunction,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.floats.Float2DoubleFunction p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.floats.Float2DoubleFunction synchronize(it.unimi.dsi.fastutil.floats.Float2DoubleFunction p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.floats.Float2DoubleFunctions.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.floats.Float2DoubleMaps#synchronize(it.unimi.dsi.fastutil.floats.Float2DoubleMap,java.lang.Object)}
*@see it.unimi.dsi.fastutil.floats.Float2DoubleMaps#synchronize(it.unimi.dsi.fastutil.floats.Float2DoubleMap,java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.floats.Float2DoubleMap it.unimi.dsi.fastutil.floats.Float2DoubleMaps.synchronize(it.unimi.dsi.fastutil.floats.Float2DoubleMap,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.floats.Float2DoubleMap p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.floats.Float2DoubleMap synchronize(it.unimi.dsi.fastutil.floats.Float2DoubleMap p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.floats.Float2DoubleMaps.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.floats.Float2DoubleSortedMaps#synchronize(it.unimi.dsi.fastutil.floats.Float2DoubleSortedMap,java.lang.Object)}
*@see it.unimi.dsi.fastutil.floats.Float2DoubleSortedMaps#synchronize(it.unimi.dsi.fastutil.floats.Float2DoubleSortedMap,java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.floats.Float2DoubleSortedMap it.unimi.dsi.fastutil.floats.Float2DoubleSortedMaps.synchronize(it.unimi.dsi.fastutil.floats.Float2DoubleSortedMap,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.floats.Float2DoubleSortedMap p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.floats.Float2DoubleSortedMap synchronize(it.unimi.dsi.fastutil.floats.Float2DoubleSortedMap p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.floats.Float2DoubleSortedMaps.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.floats.Float2FloatFunctions#synchronize(it.unimi.dsi.fastutil.floats.Float2FloatFunction,java.lang.Object)}
*@see it.unimi.dsi.fastutil.floats.Float2FloatFunctions#synchronize(it.unimi.dsi.fastutil.floats.Float2FloatFunction,java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.floats.Float2FloatFunction it.unimi.dsi.fastutil.floats.Float2FloatFunctions.synchronize(it.unimi.dsi.fastutil.floats.Float2FloatFunction,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.floats.Float2FloatFunction p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.floats.Float2FloatFunction synchronize(it.unimi.dsi.fastutil.floats.Float2FloatFunction p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.floats.Float2FloatFunctions.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.floats.Float2FloatMaps#synchronize(it.unimi.dsi.fastutil.floats.Float2FloatMap,java.lang.Object)}
*@see it.unimi.dsi.fastutil.floats.Float2FloatMaps#synchronize(it.unimi.dsi.fastutil.floats.Float2FloatMap,java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.floats.Float2FloatMap it.unimi.dsi.fastutil.floats.Float2FloatMaps.synchronize(it.unimi.dsi.fastutil.floats.Float2FloatMap,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.floats.Float2FloatMap p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.floats.Float2FloatMap synchronize(it.unimi.dsi.fastutil.floats.Float2FloatMap p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.floats.Float2FloatMaps.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.floats.Float2FloatSortedMaps#synchronize(it.unimi.dsi.fastutil.floats.Float2FloatSortedMap,java.lang.Object)}
*@see it.unimi.dsi.fastutil.floats.Float2FloatSortedMaps#synchronize(it.unimi.dsi.fastutil.floats.Float2FloatSortedMap,java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.floats.Float2FloatSortedMap it.unimi.dsi.fastutil.floats.Float2FloatSortedMaps.synchronize(it.unimi.dsi.fastutil.floats.Float2FloatSortedMap,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.floats.Float2FloatSortedMap p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.floats.Float2FloatSortedMap synchronize(it.unimi.dsi.fastutil.floats.Float2FloatSortedMap p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.floats.Float2FloatSortedMaps.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.floats.Float2IntFunctions#synchronize(it.unimi.dsi.fastutil.floats.Float2IntFunction,java.lang.Object)}
*@see it.unimi.dsi.fastutil.floats.Float2IntFunctions#synchronize(it.unimi.dsi.fastutil.floats.Float2IntFunction,java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.floats.Float2IntFunction it.unimi.dsi.fastutil.floats.Float2IntFunctions.synchronize(it.unimi.dsi.fastutil.floats.Float2IntFunction,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.floats.Float2IntFunction p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.floats.Float2IntFunction synchronize(it.unimi.dsi.fastutil.floats.Float2IntFunction p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.floats.Float2IntFunctions.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.floats.Float2IntMaps#synchronize(it.unimi.dsi.fastutil.floats.Float2IntMap,java.lang.Object)}
*@see it.unimi.dsi.fastutil.floats.Float2IntMaps#synchronize(it.unimi.dsi.fastutil.floats.Float2IntMap,java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.floats.Float2IntMap it.unimi.dsi.fastutil.floats.Float2IntMaps.synchronize(it.unimi.dsi.fastutil.floats.Float2IntMap,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.floats.Float2IntMap p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.floats.Float2IntMap synchronize(it.unimi.dsi.fastutil.floats.Float2IntMap p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.floats.Float2IntMaps.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.floats.Float2IntSortedMaps#synchronize(it.unimi.dsi.fastutil.floats.Float2IntSortedMap,java.lang.Object)}
*@see it.unimi.dsi.fastutil.floats.Float2IntSortedMaps#synchronize(it.unimi.dsi.fastutil.floats.Float2IntSortedMap,java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.floats.Float2IntSortedMap it.unimi.dsi.fastutil.floats.Float2IntSortedMaps.synchronize(it.unimi.dsi.fastutil.floats.Float2IntSortedMap,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.floats.Float2IntSortedMap p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.floats.Float2IntSortedMap synchronize(it.unimi.dsi.fastutil.floats.Float2IntSortedMap p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.floats.Float2IntSortedMaps.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.floats.Float2LongFunctions#synchronize(it.unimi.dsi.fastutil.floats.Float2LongFunction,java.lang.Object)}
*@see it.unimi.dsi.fastutil.floats.Float2LongFunctions#synchronize(it.unimi.dsi.fastutil.floats.Float2LongFunction,java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.floats.Float2LongFunction it.unimi.dsi.fastutil.floats.Float2LongFunctions.synchronize(it.unimi.dsi.fastutil.floats.Float2LongFunction,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.floats.Float2LongFunction p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.floats.Float2LongFunction synchronize(it.unimi.dsi.fastutil.floats.Float2LongFunction p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.floats.Float2LongFunctions.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.floats.Float2LongMaps#synchronize(it.unimi.dsi.fastutil.floats.Float2LongMap,java.lang.Object)}
*@see it.unimi.dsi.fastutil.floats.Float2LongMaps#synchronize(it.unimi.dsi.fastutil.floats.Float2LongMap,java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.floats.Float2LongMap it.unimi.dsi.fastutil.floats.Float2LongMaps.synchronize(it.unimi.dsi.fastutil.floats.Float2LongMap,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.floats.Float2LongMap p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.floats.Float2LongMap synchronize(it.unimi.dsi.fastutil.floats.Float2LongMap p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.floats.Float2LongMaps.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.floats.Float2LongSortedMaps#synchronize(it.unimi.dsi.fastutil.floats.Float2LongSortedMap,java.lang.Object)}
*@see it.unimi.dsi.fastutil.floats.Float2LongSortedMaps#synchronize(it.unimi.dsi.fastutil.floats.Float2LongSortedMap,java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.floats.Float2LongSortedMap it.unimi.dsi.fastutil.floats.Float2LongSortedMaps.synchronize(it.unimi.dsi.fastutil.floats.Float2LongSortedMap,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.floats.Float2LongSortedMap p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.floats.Float2LongSortedMap synchronize(it.unimi.dsi.fastutil.floats.Float2LongSortedMap p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.floats.Float2LongSortedMaps.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.floats.Float2ObjectFunctions#synchronize(it.unimi.dsi.fastutil.floats.Float2ObjectFunction<V>,java.lang.Object)}
*@see it.unimi.dsi.fastutil.floats.Float2ObjectFunctions#synchronize(it.unimi.dsi.fastutil.floats.Float2ObjectFunction<V>,java.lang.Object)
*<code>public static <V> it.unimi.dsi.fastutil.floats.Float2ObjectFunction<V> it.unimi.dsi.fastutil.floats.Float2ObjectFunctions.synchronize(it.unimi.dsi.fastutil.floats.Float2ObjectFunction<V>,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.floats.Float2ObjectFunction<V> p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <V> it.unimi.dsi.fastutil.floats.Float2ObjectFunction<V> synchronize(it.unimi.dsi.fastutil.floats.Float2ObjectFunction<V> p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.floats.Float2ObjectFunctions.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.floats.Float2ObjectMaps#synchronize(it.unimi.dsi.fastutil.floats.Float2ObjectMap<V>,java.lang.Object)}
*@see it.unimi.dsi.fastutil.floats.Float2ObjectMaps#synchronize(it.unimi.dsi.fastutil.floats.Float2ObjectMap<V>,java.lang.Object)
*<code>public static <V> it.unimi.dsi.fastutil.floats.Float2ObjectMap<V> it.unimi.dsi.fastutil.floats.Float2ObjectMaps.synchronize(it.unimi.dsi.fastutil.floats.Float2ObjectMap<V>,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.floats.Float2ObjectMap<V> p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <V> it.unimi.dsi.fastutil.floats.Float2ObjectMap<V> synchronize(it.unimi.dsi.fastutil.floats.Float2ObjectMap<V> p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.floats.Float2ObjectMaps.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.floats.Float2ObjectSortedMaps#synchronize(it.unimi.dsi.fastutil.floats.Float2ObjectSortedMap<V>,java.lang.Object)}
*@see it.unimi.dsi.fastutil.floats.Float2ObjectSortedMaps#synchronize(it.unimi.dsi.fastutil.floats.Float2ObjectSortedMap<V>,java.lang.Object)
*<code>public static <V> it.unimi.dsi.fastutil.floats.Float2ObjectSortedMap<V> it.unimi.dsi.fastutil.floats.Float2ObjectSortedMaps.synchronize(it.unimi.dsi.fastutil.floats.Float2ObjectSortedMap<V>,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.floats.Float2ObjectSortedMap<V> p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <V> it.unimi.dsi.fastutil.floats.Float2ObjectSortedMap<V> synchronize(it.unimi.dsi.fastutil.floats.Float2ObjectSortedMap<V> p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.floats.Float2ObjectSortedMaps.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.floats.Float2ReferenceFunctions#synchronize(it.unimi.dsi.fastutil.floats.Float2ReferenceFunction<V>,java.lang.Object)}
*@see it.unimi.dsi.fastutil.floats.Float2ReferenceFunctions#synchronize(it.unimi.dsi.fastutil.floats.Float2ReferenceFunction<V>,java.lang.Object)
*<code>public static <V> it.unimi.dsi.fastutil.floats.Float2ReferenceFunction<V> it.unimi.dsi.fastutil.floats.Float2ReferenceFunctions.synchronize(it.unimi.dsi.fastutil.floats.Float2ReferenceFunction<V>,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.floats.Float2ReferenceFunction<V> p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <V> it.unimi.dsi.fastutil.floats.Float2ReferenceFunction<V> synchronize(it.unimi.dsi.fastutil.floats.Float2ReferenceFunction<V> p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.floats.Float2ReferenceFunctions.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.floats.Float2ReferenceMaps#synchronize(it.unimi.dsi.fastutil.floats.Float2ReferenceMap<V>,java.lang.Object)}
*@see it.unimi.dsi.fastutil.floats.Float2ReferenceMaps#synchronize(it.unimi.dsi.fastutil.floats.Float2ReferenceMap<V>,java.lang.Object)
*<code>public static <V> it.unimi.dsi.fastutil.floats.Float2ReferenceMap<V> it.unimi.dsi.fastutil.floats.Float2ReferenceMaps.synchronize(it.unimi.dsi.fastutil.floats.Float2ReferenceMap<V>,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.floats.Float2ReferenceMap<V> p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <V> it.unimi.dsi.fastutil.floats.Float2ReferenceMap<V> synchronize(it.unimi.dsi.fastutil.floats.Float2ReferenceMap<V> p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.floats.Float2ReferenceMaps.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.floats.Float2ReferenceSortedMaps#synchronize(it.unimi.dsi.fastutil.floats.Float2ReferenceSortedMap<V>,java.lang.Object)}
*@see it.unimi.dsi.fastutil.floats.Float2ReferenceSortedMaps#synchronize(it.unimi.dsi.fastutil.floats.Float2ReferenceSortedMap<V>,java.lang.Object)
*<code>public static <V> it.unimi.dsi.fastutil.floats.Float2ReferenceSortedMap<V> it.unimi.dsi.fastutil.floats.Float2ReferenceSortedMaps.synchronize(it.unimi.dsi.fastutil.floats.Float2ReferenceSortedMap<V>,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.floats.Float2ReferenceSortedMap<V> p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <V> it.unimi.dsi.fastutil.floats.Float2ReferenceSortedMap<V> synchronize(it.unimi.dsi.fastutil.floats.Float2ReferenceSortedMap<V> p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.floats.Float2ReferenceSortedMaps.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.floats.Float2ShortFunctions#synchronize(it.unimi.dsi.fastutil.floats.Float2ShortFunction,java.lang.Object)}
*@see it.unimi.dsi.fastutil.floats.Float2ShortFunctions#synchronize(it.unimi.dsi.fastutil.floats.Float2ShortFunction,java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.floats.Float2ShortFunction it.unimi.dsi.fastutil.floats.Float2ShortFunctions.synchronize(it.unimi.dsi.fastutil.floats.Float2ShortFunction,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.floats.Float2ShortFunction p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.floats.Float2ShortFunction synchronize(it.unimi.dsi.fastutil.floats.Float2ShortFunction p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.floats.Float2ShortFunctions.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.floats.Float2ShortMaps#synchronize(it.unimi.dsi.fastutil.floats.Float2ShortMap,java.lang.Object)}
*@see it.unimi.dsi.fastutil.floats.Float2ShortMaps#synchronize(it.unimi.dsi.fastutil.floats.Float2ShortMap,java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.floats.Float2ShortMap it.unimi.dsi.fastutil.floats.Float2ShortMaps.synchronize(it.unimi.dsi.fastutil.floats.Float2ShortMap,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.floats.Float2ShortMap p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.floats.Float2ShortMap synchronize(it.unimi.dsi.fastutil.floats.Float2ShortMap p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.floats.Float2ShortMaps.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.floats.Float2ShortSortedMaps#synchronize(it.unimi.dsi.fastutil.floats.Float2ShortSortedMap,java.lang.Object)}
*@see it.unimi.dsi.fastutil.floats.Float2ShortSortedMaps#synchronize(it.unimi.dsi.fastutil.floats.Float2ShortSortedMap,java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.floats.Float2ShortSortedMap it.unimi.dsi.fastutil.floats.Float2ShortSortedMaps.synchronize(it.unimi.dsi.fastutil.floats.Float2ShortSortedMap,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.floats.Float2ShortSortedMap p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.floats.Float2ShortSortedMap synchronize(it.unimi.dsi.fastutil.floats.Float2ShortSortedMap p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.floats.Float2ShortSortedMaps.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.floats.FloatBigLists#synchronize(it.unimi.dsi.fastutil.floats.FloatBigList,java.lang.Object)}
*@see it.unimi.dsi.fastutil.floats.FloatBigLists#synchronize(it.unimi.dsi.fastutil.floats.FloatBigList,java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.floats.FloatBigList it.unimi.dsi.fastutil.floats.FloatBigLists.synchronize(it.unimi.dsi.fastutil.floats.FloatBigList,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.floats.FloatBigList p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.floats.FloatBigList synchronize(it.unimi.dsi.fastutil.floats.FloatBigList p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.floats.FloatBigLists.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.floats.FloatCollections#synchronize(it.unimi.dsi.fastutil.floats.FloatCollection,java.lang.Object)}
*@see it.unimi.dsi.fastutil.floats.FloatCollections#synchronize(it.unimi.dsi.fastutil.floats.FloatCollection,java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.floats.FloatCollection it.unimi.dsi.fastutil.floats.FloatCollections.synchronize(it.unimi.dsi.fastutil.floats.FloatCollection,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.floats.FloatCollection p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.floats.FloatCollection synchronize(it.unimi.dsi.fastutil.floats.FloatCollection p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.floats.FloatCollections.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.floats.FloatLists#synchronize(it.unimi.dsi.fastutil.floats.FloatList,java.lang.Object)}
*@see it.unimi.dsi.fastutil.floats.FloatLists#synchronize(it.unimi.dsi.fastutil.floats.FloatList,java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.floats.FloatList it.unimi.dsi.fastutil.floats.FloatLists.synchronize(it.unimi.dsi.fastutil.floats.FloatList,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.floats.FloatList p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.floats.FloatList synchronize(it.unimi.dsi.fastutil.floats.FloatList p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.floats.FloatLists.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.floats.FloatPriorityQueues#synchronize(it.unimi.dsi.fastutil.floats.FloatPriorityQueue,java.lang.Object)}
*@see it.unimi.dsi.fastutil.floats.FloatPriorityQueues#synchronize(it.unimi.dsi.fastutil.floats.FloatPriorityQueue,java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.floats.FloatPriorityQueue it.unimi.dsi.fastutil.floats.FloatPriorityQueues.synchronize(it.unimi.dsi.fastutil.floats.FloatPriorityQueue,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.floats.FloatPriorityQueue p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.floats.FloatPriorityQueue synchronize(it.unimi.dsi.fastutil.floats.FloatPriorityQueue p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.floats.FloatPriorityQueues.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.floats.FloatSets#synchronize(it.unimi.dsi.fastutil.floats.FloatSet,java.lang.Object)}
*@see it.unimi.dsi.fastutil.floats.FloatSets#synchronize(it.unimi.dsi.fastutil.floats.FloatSet,java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.floats.FloatSet it.unimi.dsi.fastutil.floats.FloatSets.synchronize(it.unimi.dsi.fastutil.floats.FloatSet,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.floats.FloatSet p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.floats.FloatSet synchronize(it.unimi.dsi.fastutil.floats.FloatSet p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.floats.FloatSets.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.floats.FloatSortedSets#synchronize(it.unimi.dsi.fastutil.floats.FloatSortedSet,java.lang.Object)}
*@see it.unimi.dsi.fastutil.floats.FloatSortedSets#synchronize(it.unimi.dsi.fastutil.floats.FloatSortedSet,java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.floats.FloatSortedSet it.unimi.dsi.fastutil.floats.FloatSortedSets.synchronize(it.unimi.dsi.fastutil.floats.FloatSortedSet,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.floats.FloatSortedSet p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.floats.FloatSortedSet synchronize(it.unimi.dsi.fastutil.floats.FloatSortedSet p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.floats.FloatSortedSets.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.ints.Int2BooleanFunctions#synchronize(it.unimi.dsi.fastutil.ints.Int2BooleanFunction,java.lang.Object)}
*@see it.unimi.dsi.fastutil.ints.Int2BooleanFunctions#synchronize(it.unimi.dsi.fastutil.ints.Int2BooleanFunction,java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.ints.Int2BooleanFunction it.unimi.dsi.fastutil.ints.Int2BooleanFunctions.synchronize(it.unimi.dsi.fastutil.ints.Int2BooleanFunction,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.ints.Int2BooleanFunction p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.ints.Int2BooleanFunction synchronize(it.unimi.dsi.fastutil.ints.Int2BooleanFunction p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.ints.Int2BooleanFunctions.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.ints.Int2BooleanMaps#synchronize(it.unimi.dsi.fastutil.ints.Int2BooleanMap,java.lang.Object)}
*@see it.unimi.dsi.fastutil.ints.Int2BooleanMaps#synchronize(it.unimi.dsi.fastutil.ints.Int2BooleanMap,java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.ints.Int2BooleanMap it.unimi.dsi.fastutil.ints.Int2BooleanMaps.synchronize(it.unimi.dsi.fastutil.ints.Int2BooleanMap,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.ints.Int2BooleanMap p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.ints.Int2BooleanMap synchronize(it.unimi.dsi.fastutil.ints.Int2BooleanMap p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.ints.Int2BooleanMaps.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.ints.Int2BooleanSortedMaps#synchronize(it.unimi.dsi.fastutil.ints.Int2BooleanSortedMap,java.lang.Object)}
*@see it.unimi.dsi.fastutil.ints.Int2BooleanSortedMaps#synchronize(it.unimi.dsi.fastutil.ints.Int2BooleanSortedMap,java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.ints.Int2BooleanSortedMap it.unimi.dsi.fastutil.ints.Int2BooleanSortedMaps.synchronize(it.unimi.dsi.fastutil.ints.Int2BooleanSortedMap,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.ints.Int2BooleanSortedMap p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.ints.Int2BooleanSortedMap synchronize(it.unimi.dsi.fastutil.ints.Int2BooleanSortedMap p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.ints.Int2BooleanSortedMaps.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.ints.Int2ByteFunctions#synchronize(it.unimi.dsi.fastutil.ints.Int2ByteFunction,java.lang.Object)}
*@see it.unimi.dsi.fastutil.ints.Int2ByteFunctions#synchronize(it.unimi.dsi.fastutil.ints.Int2ByteFunction,java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.ints.Int2ByteFunction it.unimi.dsi.fastutil.ints.Int2ByteFunctions.synchronize(it.unimi.dsi.fastutil.ints.Int2ByteFunction,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.ints.Int2ByteFunction p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.ints.Int2ByteFunction synchronize(it.unimi.dsi.fastutil.ints.Int2ByteFunction p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.ints.Int2ByteFunctions.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.ints.Int2ByteMaps#synchronize(it.unimi.dsi.fastutil.ints.Int2ByteMap,java.lang.Object)}
*@see it.unimi.dsi.fastutil.ints.Int2ByteMaps#synchronize(it.unimi.dsi.fastutil.ints.Int2ByteMap,java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.ints.Int2ByteMap it.unimi.dsi.fastutil.ints.Int2ByteMaps.synchronize(it.unimi.dsi.fastutil.ints.Int2ByteMap,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.ints.Int2ByteMap p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.ints.Int2ByteMap synchronize(it.unimi.dsi.fastutil.ints.Int2ByteMap p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.ints.Int2ByteMaps.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.ints.Int2ByteSortedMaps#synchronize(it.unimi.dsi.fastutil.ints.Int2ByteSortedMap,java.lang.Object)}
*@see it.unimi.dsi.fastutil.ints.Int2ByteSortedMaps#synchronize(it.unimi.dsi.fastutil.ints.Int2ByteSortedMap,java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.ints.Int2ByteSortedMap it.unimi.dsi.fastutil.ints.Int2ByteSortedMaps.synchronize(it.unimi.dsi.fastutil.ints.Int2ByteSortedMap,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.ints.Int2ByteSortedMap p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.ints.Int2ByteSortedMap synchronize(it.unimi.dsi.fastutil.ints.Int2ByteSortedMap p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.ints.Int2ByteSortedMaps.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.ints.Int2CharFunctions#synchronize(it.unimi.dsi.fastutil.ints.Int2CharFunction,java.lang.Object)}
*@see it.unimi.dsi.fastutil.ints.Int2CharFunctions#synchronize(it.unimi.dsi.fastutil.ints.Int2CharFunction,java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.ints.Int2CharFunction it.unimi.dsi.fastutil.ints.Int2CharFunctions.synchronize(it.unimi.dsi.fastutil.ints.Int2CharFunction,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.ints.Int2CharFunction p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.ints.Int2CharFunction synchronize(it.unimi.dsi.fastutil.ints.Int2CharFunction p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.ints.Int2CharFunctions.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.ints.Int2CharMaps#synchronize(it.unimi.dsi.fastutil.ints.Int2CharMap,java.lang.Object)}
*@see it.unimi.dsi.fastutil.ints.Int2CharMaps#synchronize(it.unimi.dsi.fastutil.ints.Int2CharMap,java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.ints.Int2CharMap it.unimi.dsi.fastutil.ints.Int2CharMaps.synchronize(it.unimi.dsi.fastutil.ints.Int2CharMap,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.ints.Int2CharMap p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.ints.Int2CharMap synchronize(it.unimi.dsi.fastutil.ints.Int2CharMap p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.ints.Int2CharMaps.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.ints.Int2CharSortedMaps#synchronize(it.unimi.dsi.fastutil.ints.Int2CharSortedMap,java.lang.Object)}
*@see it.unimi.dsi.fastutil.ints.Int2CharSortedMaps#synchronize(it.unimi.dsi.fastutil.ints.Int2CharSortedMap,java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.ints.Int2CharSortedMap it.unimi.dsi.fastutil.ints.Int2CharSortedMaps.synchronize(it.unimi.dsi.fastutil.ints.Int2CharSortedMap,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.ints.Int2CharSortedMap p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.ints.Int2CharSortedMap synchronize(it.unimi.dsi.fastutil.ints.Int2CharSortedMap p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.ints.Int2CharSortedMaps.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.ints.Int2DoubleFunctions#synchronize(it.unimi.dsi.fastutil.ints.Int2DoubleFunction,java.lang.Object)}
*@see it.unimi.dsi.fastutil.ints.Int2DoubleFunctions#synchronize(it.unimi.dsi.fastutil.ints.Int2DoubleFunction,java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.ints.Int2DoubleFunction it.unimi.dsi.fastutil.ints.Int2DoubleFunctions.synchronize(it.unimi.dsi.fastutil.ints.Int2DoubleFunction,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.ints.Int2DoubleFunction p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.ints.Int2DoubleFunction synchronize(it.unimi.dsi.fastutil.ints.Int2DoubleFunction p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.ints.Int2DoubleFunctions.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.ints.Int2DoubleMaps#synchronize(it.unimi.dsi.fastutil.ints.Int2DoubleMap,java.lang.Object)}
*@see it.unimi.dsi.fastutil.ints.Int2DoubleMaps#synchronize(it.unimi.dsi.fastutil.ints.Int2DoubleMap,java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.ints.Int2DoubleMap it.unimi.dsi.fastutil.ints.Int2DoubleMaps.synchronize(it.unimi.dsi.fastutil.ints.Int2DoubleMap,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.ints.Int2DoubleMap p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.ints.Int2DoubleMap synchronize(it.unimi.dsi.fastutil.ints.Int2DoubleMap p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.ints.Int2DoubleMaps.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.ints.Int2DoubleSortedMaps#synchronize(it.unimi.dsi.fastutil.ints.Int2DoubleSortedMap,java.lang.Object)}
*@see it.unimi.dsi.fastutil.ints.Int2DoubleSortedMaps#synchronize(it.unimi.dsi.fastutil.ints.Int2DoubleSortedMap,java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.ints.Int2DoubleSortedMap it.unimi.dsi.fastutil.ints.Int2DoubleSortedMaps.synchronize(it.unimi.dsi.fastutil.ints.Int2DoubleSortedMap,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.ints.Int2DoubleSortedMap p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.ints.Int2DoubleSortedMap synchronize(it.unimi.dsi.fastutil.ints.Int2DoubleSortedMap p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.ints.Int2DoubleSortedMaps.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.ints.Int2FloatFunctions#synchronize(it.unimi.dsi.fastutil.ints.Int2FloatFunction,java.lang.Object)}
*@see it.unimi.dsi.fastutil.ints.Int2FloatFunctions#synchronize(it.unimi.dsi.fastutil.ints.Int2FloatFunction,java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.ints.Int2FloatFunction it.unimi.dsi.fastutil.ints.Int2FloatFunctions.synchronize(it.unimi.dsi.fastutil.ints.Int2FloatFunction,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.ints.Int2FloatFunction p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.ints.Int2FloatFunction synchronize(it.unimi.dsi.fastutil.ints.Int2FloatFunction p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.ints.Int2FloatFunctions.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.ints.Int2FloatMaps#synchronize(it.unimi.dsi.fastutil.ints.Int2FloatMap,java.lang.Object)}
*@see it.unimi.dsi.fastutil.ints.Int2FloatMaps#synchronize(it.unimi.dsi.fastutil.ints.Int2FloatMap,java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.ints.Int2FloatMap it.unimi.dsi.fastutil.ints.Int2FloatMaps.synchronize(it.unimi.dsi.fastutil.ints.Int2FloatMap,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.ints.Int2FloatMap p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.ints.Int2FloatMap synchronize(it.unimi.dsi.fastutil.ints.Int2FloatMap p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.ints.Int2FloatMaps.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.ints.Int2FloatSortedMaps#synchronize(it.unimi.dsi.fastutil.ints.Int2FloatSortedMap,java.lang.Object)}
*@see it.unimi.dsi.fastutil.ints.Int2FloatSortedMaps#synchronize(it.unimi.dsi.fastutil.ints.Int2FloatSortedMap,java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.ints.Int2FloatSortedMap it.unimi.dsi.fastutil.ints.Int2FloatSortedMaps.synchronize(it.unimi.dsi.fastutil.ints.Int2FloatSortedMap,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.ints.Int2FloatSortedMap p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.ints.Int2FloatSortedMap synchronize(it.unimi.dsi.fastutil.ints.Int2FloatSortedMap p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.ints.Int2FloatSortedMaps.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.ints.Int2IntFunctions#synchronize(it.unimi.dsi.fastutil.ints.Int2IntFunction,java.lang.Object)}
*@see it.unimi.dsi.fastutil.ints.Int2IntFunctions#synchronize(it.unimi.dsi.fastutil.ints.Int2IntFunction,java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.ints.Int2IntFunction it.unimi.dsi.fastutil.ints.Int2IntFunctions.synchronize(it.unimi.dsi.fastutil.ints.Int2IntFunction,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.ints.Int2IntFunction p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.ints.Int2IntFunction synchronize(it.unimi.dsi.fastutil.ints.Int2IntFunction p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.ints.Int2IntFunctions.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.ints.Int2IntMaps#synchronize(it.unimi.dsi.fastutil.ints.Int2IntMap,java.lang.Object)}
*@see it.unimi.dsi.fastutil.ints.Int2IntMaps#synchronize(it.unimi.dsi.fastutil.ints.Int2IntMap,java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.ints.Int2IntMap it.unimi.dsi.fastutil.ints.Int2IntMaps.synchronize(it.unimi.dsi.fastutil.ints.Int2IntMap,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.ints.Int2IntMap p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.ints.Int2IntMap synchronize(it.unimi.dsi.fastutil.ints.Int2IntMap p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.ints.Int2IntMaps.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.ints.Int2IntSortedMaps#synchronize(it.unimi.dsi.fastutil.ints.Int2IntSortedMap,java.lang.Object)}
*@see it.unimi.dsi.fastutil.ints.Int2IntSortedMaps#synchronize(it.unimi.dsi.fastutil.ints.Int2IntSortedMap,java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.ints.Int2IntSortedMap it.unimi.dsi.fastutil.ints.Int2IntSortedMaps.synchronize(it.unimi.dsi.fastutil.ints.Int2IntSortedMap,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.ints.Int2IntSortedMap p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.ints.Int2IntSortedMap synchronize(it.unimi.dsi.fastutil.ints.Int2IntSortedMap p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.ints.Int2IntSortedMaps.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.ints.Int2LongFunctions#synchronize(it.unimi.dsi.fastutil.ints.Int2LongFunction,java.lang.Object)}
*@see it.unimi.dsi.fastutil.ints.Int2LongFunctions#synchronize(it.unimi.dsi.fastutil.ints.Int2LongFunction,java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.ints.Int2LongFunction it.unimi.dsi.fastutil.ints.Int2LongFunctions.synchronize(it.unimi.dsi.fastutil.ints.Int2LongFunction,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.ints.Int2LongFunction p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.ints.Int2LongFunction synchronize(it.unimi.dsi.fastutil.ints.Int2LongFunction p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.ints.Int2LongFunctions.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.ints.Int2LongMaps#synchronize(it.unimi.dsi.fastutil.ints.Int2LongMap,java.lang.Object)}
*@see it.unimi.dsi.fastutil.ints.Int2LongMaps#synchronize(it.unimi.dsi.fastutil.ints.Int2LongMap,java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.ints.Int2LongMap it.unimi.dsi.fastutil.ints.Int2LongMaps.synchronize(it.unimi.dsi.fastutil.ints.Int2LongMap,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.ints.Int2LongMap p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.ints.Int2LongMap synchronize(it.unimi.dsi.fastutil.ints.Int2LongMap p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.ints.Int2LongMaps.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.ints.Int2LongSortedMaps#synchronize(it.unimi.dsi.fastutil.ints.Int2LongSortedMap,java.lang.Object)}
*@see it.unimi.dsi.fastutil.ints.Int2LongSortedMaps#synchronize(it.unimi.dsi.fastutil.ints.Int2LongSortedMap,java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.ints.Int2LongSortedMap it.unimi.dsi.fastutil.ints.Int2LongSortedMaps.synchronize(it.unimi.dsi.fastutil.ints.Int2LongSortedMap,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.ints.Int2LongSortedMap p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.ints.Int2LongSortedMap synchronize(it.unimi.dsi.fastutil.ints.Int2LongSortedMap p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.ints.Int2LongSortedMaps.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.ints.Int2ObjectFunctions#synchronize(it.unimi.dsi.fastutil.ints.Int2ObjectFunction<V>,java.lang.Object)}
*@see it.unimi.dsi.fastutil.ints.Int2ObjectFunctions#synchronize(it.unimi.dsi.fastutil.ints.Int2ObjectFunction<V>,java.lang.Object)
*<code>public static <V> it.unimi.dsi.fastutil.ints.Int2ObjectFunction<V> it.unimi.dsi.fastutil.ints.Int2ObjectFunctions.synchronize(it.unimi.dsi.fastutil.ints.Int2ObjectFunction<V>,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.ints.Int2ObjectFunction<V> p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <V> it.unimi.dsi.fastutil.ints.Int2ObjectFunction<V> synchronize(it.unimi.dsi.fastutil.ints.Int2ObjectFunction<V> p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.ints.Int2ObjectFunctions.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.ints.Int2ObjectMaps#synchronize(it.unimi.dsi.fastutil.ints.Int2ObjectMap<V>,java.lang.Object)}
*@see it.unimi.dsi.fastutil.ints.Int2ObjectMaps#synchronize(it.unimi.dsi.fastutil.ints.Int2ObjectMap<V>,java.lang.Object)
*<code>public static <V> it.unimi.dsi.fastutil.ints.Int2ObjectMap<V> it.unimi.dsi.fastutil.ints.Int2ObjectMaps.synchronize(it.unimi.dsi.fastutil.ints.Int2ObjectMap<V>,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.ints.Int2ObjectMap<V> p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <V> it.unimi.dsi.fastutil.ints.Int2ObjectMap<V> synchronize(it.unimi.dsi.fastutil.ints.Int2ObjectMap<V> p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.ints.Int2ObjectMaps.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.ints.Int2ObjectSortedMaps#synchronize(it.unimi.dsi.fastutil.ints.Int2ObjectSortedMap<V>,java.lang.Object)}
*@see it.unimi.dsi.fastutil.ints.Int2ObjectSortedMaps#synchronize(it.unimi.dsi.fastutil.ints.Int2ObjectSortedMap<V>,java.lang.Object)
*<code>public static <V> it.unimi.dsi.fastutil.ints.Int2ObjectSortedMap<V> it.unimi.dsi.fastutil.ints.Int2ObjectSortedMaps.synchronize(it.unimi.dsi.fastutil.ints.Int2ObjectSortedMap<V>,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.ints.Int2ObjectSortedMap<V> p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <V> it.unimi.dsi.fastutil.ints.Int2ObjectSortedMap<V> synchronize(it.unimi.dsi.fastutil.ints.Int2ObjectSortedMap<V> p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.ints.Int2ObjectSortedMaps.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.ints.Int2ReferenceFunctions#synchronize(it.unimi.dsi.fastutil.ints.Int2ReferenceFunction<V>,java.lang.Object)}
*@see it.unimi.dsi.fastutil.ints.Int2ReferenceFunctions#synchronize(it.unimi.dsi.fastutil.ints.Int2ReferenceFunction<V>,java.lang.Object)
*<code>public static <V> it.unimi.dsi.fastutil.ints.Int2ReferenceFunction<V> it.unimi.dsi.fastutil.ints.Int2ReferenceFunctions.synchronize(it.unimi.dsi.fastutil.ints.Int2ReferenceFunction<V>,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.ints.Int2ReferenceFunction<V> p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <V> it.unimi.dsi.fastutil.ints.Int2ReferenceFunction<V> synchronize(it.unimi.dsi.fastutil.ints.Int2ReferenceFunction<V> p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.ints.Int2ReferenceFunctions.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.ints.Int2ReferenceMaps#synchronize(it.unimi.dsi.fastutil.ints.Int2ReferenceMap<V>,java.lang.Object)}
*@see it.unimi.dsi.fastutil.ints.Int2ReferenceMaps#synchronize(it.unimi.dsi.fastutil.ints.Int2ReferenceMap<V>,java.lang.Object)
*<code>public static <V> it.unimi.dsi.fastutil.ints.Int2ReferenceMap<V> it.unimi.dsi.fastutil.ints.Int2ReferenceMaps.synchronize(it.unimi.dsi.fastutil.ints.Int2ReferenceMap<V>,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.ints.Int2ReferenceMap<V> p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <V> it.unimi.dsi.fastutil.ints.Int2ReferenceMap<V> synchronize(it.unimi.dsi.fastutil.ints.Int2ReferenceMap<V> p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.ints.Int2ReferenceMaps.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.ints.Int2ReferenceSortedMaps#synchronize(it.unimi.dsi.fastutil.ints.Int2ReferenceSortedMap<V>,java.lang.Object)}
*@see it.unimi.dsi.fastutil.ints.Int2ReferenceSortedMaps#synchronize(it.unimi.dsi.fastutil.ints.Int2ReferenceSortedMap<V>,java.lang.Object)
*<code>public static <V> it.unimi.dsi.fastutil.ints.Int2ReferenceSortedMap<V> it.unimi.dsi.fastutil.ints.Int2ReferenceSortedMaps.synchronize(it.unimi.dsi.fastutil.ints.Int2ReferenceSortedMap<V>,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.ints.Int2ReferenceSortedMap<V> p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <V> it.unimi.dsi.fastutil.ints.Int2ReferenceSortedMap<V> synchronize(it.unimi.dsi.fastutil.ints.Int2ReferenceSortedMap<V> p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.ints.Int2ReferenceSortedMaps.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.ints.Int2ShortFunctions#synchronize(it.unimi.dsi.fastutil.ints.Int2ShortFunction,java.lang.Object)}
*@see it.unimi.dsi.fastutil.ints.Int2ShortFunctions#synchronize(it.unimi.dsi.fastutil.ints.Int2ShortFunction,java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.ints.Int2ShortFunction it.unimi.dsi.fastutil.ints.Int2ShortFunctions.synchronize(it.unimi.dsi.fastutil.ints.Int2ShortFunction,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.ints.Int2ShortFunction p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.ints.Int2ShortFunction synchronize(it.unimi.dsi.fastutil.ints.Int2ShortFunction p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.ints.Int2ShortFunctions.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.ints.Int2ShortMaps#synchronize(it.unimi.dsi.fastutil.ints.Int2ShortMap,java.lang.Object)}
*@see it.unimi.dsi.fastutil.ints.Int2ShortMaps#synchronize(it.unimi.dsi.fastutil.ints.Int2ShortMap,java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.ints.Int2ShortMap it.unimi.dsi.fastutil.ints.Int2ShortMaps.synchronize(it.unimi.dsi.fastutil.ints.Int2ShortMap,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.ints.Int2ShortMap p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.ints.Int2ShortMap synchronize(it.unimi.dsi.fastutil.ints.Int2ShortMap p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.ints.Int2ShortMaps.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.ints.Int2ShortSortedMaps#synchronize(it.unimi.dsi.fastutil.ints.Int2ShortSortedMap,java.lang.Object)}
*@see it.unimi.dsi.fastutil.ints.Int2ShortSortedMaps#synchronize(it.unimi.dsi.fastutil.ints.Int2ShortSortedMap,java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.ints.Int2ShortSortedMap it.unimi.dsi.fastutil.ints.Int2ShortSortedMaps.synchronize(it.unimi.dsi.fastutil.ints.Int2ShortSortedMap,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.ints.Int2ShortSortedMap p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.ints.Int2ShortSortedMap synchronize(it.unimi.dsi.fastutil.ints.Int2ShortSortedMap p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.ints.Int2ShortSortedMaps.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.ints.IntBigLists#synchronize(it.unimi.dsi.fastutil.ints.IntBigList,java.lang.Object)}
*@see it.unimi.dsi.fastutil.ints.IntBigLists#synchronize(it.unimi.dsi.fastutil.ints.IntBigList,java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.ints.IntBigList it.unimi.dsi.fastutil.ints.IntBigLists.synchronize(it.unimi.dsi.fastutil.ints.IntBigList,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.ints.IntBigList p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.ints.IntBigList synchronize(it.unimi.dsi.fastutil.ints.IntBigList p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.ints.IntBigLists.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.ints.IntCollections#synchronize(it.unimi.dsi.fastutil.ints.IntCollection,java.lang.Object)}
*@see it.unimi.dsi.fastutil.ints.IntCollections#synchronize(it.unimi.dsi.fastutil.ints.IntCollection,java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.ints.IntCollection it.unimi.dsi.fastutil.ints.IntCollections.synchronize(it.unimi.dsi.fastutil.ints.IntCollection,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.ints.IntCollection p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.ints.IntCollection synchronize(it.unimi.dsi.fastutil.ints.IntCollection p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.ints.IntCollections.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.ints.IntLists#synchronize(it.unimi.dsi.fastutil.ints.IntList,java.lang.Object)}
*@see it.unimi.dsi.fastutil.ints.IntLists#synchronize(it.unimi.dsi.fastutil.ints.IntList,java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.ints.IntList it.unimi.dsi.fastutil.ints.IntLists.synchronize(it.unimi.dsi.fastutil.ints.IntList,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.ints.IntList p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.ints.IntList synchronize(it.unimi.dsi.fastutil.ints.IntList p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.ints.IntLists.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.ints.IntPriorityQueues#synchronize(it.unimi.dsi.fastutil.ints.IntPriorityQueue,java.lang.Object)}
*@see it.unimi.dsi.fastutil.ints.IntPriorityQueues#synchronize(it.unimi.dsi.fastutil.ints.IntPriorityQueue,java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.ints.IntPriorityQueue it.unimi.dsi.fastutil.ints.IntPriorityQueues.synchronize(it.unimi.dsi.fastutil.ints.IntPriorityQueue,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.ints.IntPriorityQueue p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.ints.IntPriorityQueue synchronize(it.unimi.dsi.fastutil.ints.IntPriorityQueue p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.ints.IntPriorityQueues.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.ints.IntSets#synchronize(it.unimi.dsi.fastutil.ints.IntSet,java.lang.Object)}
*@see it.unimi.dsi.fastutil.ints.IntSets#synchronize(it.unimi.dsi.fastutil.ints.IntSet,java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.ints.IntSet it.unimi.dsi.fastutil.ints.IntSets.synchronize(it.unimi.dsi.fastutil.ints.IntSet,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.ints.IntSet p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.ints.IntSet synchronize(it.unimi.dsi.fastutil.ints.IntSet p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.ints.IntSets.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.ints.IntSortedSets#synchronize(it.unimi.dsi.fastutil.ints.IntSortedSet,java.lang.Object)}
*@see it.unimi.dsi.fastutil.ints.IntSortedSets#synchronize(it.unimi.dsi.fastutil.ints.IntSortedSet,java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.ints.IntSortedSet it.unimi.dsi.fastutil.ints.IntSortedSets.synchronize(it.unimi.dsi.fastutil.ints.IntSortedSet,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.ints.IntSortedSet p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.ints.IntSortedSet synchronize(it.unimi.dsi.fastutil.ints.IntSortedSet p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.ints.IntSortedSets.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.longs.Long2BooleanFunctions#synchronize(it.unimi.dsi.fastutil.longs.Long2BooleanFunction,java.lang.Object)}
*@see it.unimi.dsi.fastutil.longs.Long2BooleanFunctions#synchronize(it.unimi.dsi.fastutil.longs.Long2BooleanFunction,java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.longs.Long2BooleanFunction it.unimi.dsi.fastutil.longs.Long2BooleanFunctions.synchronize(it.unimi.dsi.fastutil.longs.Long2BooleanFunction,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.longs.Long2BooleanFunction p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.longs.Long2BooleanFunction synchronize(it.unimi.dsi.fastutil.longs.Long2BooleanFunction p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.longs.Long2BooleanFunctions.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.longs.Long2BooleanMaps#synchronize(it.unimi.dsi.fastutil.longs.Long2BooleanMap,java.lang.Object)}
*@see it.unimi.dsi.fastutil.longs.Long2BooleanMaps#synchronize(it.unimi.dsi.fastutil.longs.Long2BooleanMap,java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.longs.Long2BooleanMap it.unimi.dsi.fastutil.longs.Long2BooleanMaps.synchronize(it.unimi.dsi.fastutil.longs.Long2BooleanMap,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.longs.Long2BooleanMap p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.longs.Long2BooleanMap synchronize(it.unimi.dsi.fastutil.longs.Long2BooleanMap p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.longs.Long2BooleanMaps.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.longs.Long2BooleanSortedMaps#synchronize(it.unimi.dsi.fastutil.longs.Long2BooleanSortedMap,java.lang.Object)}
*@see it.unimi.dsi.fastutil.longs.Long2BooleanSortedMaps#synchronize(it.unimi.dsi.fastutil.longs.Long2BooleanSortedMap,java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.longs.Long2BooleanSortedMap it.unimi.dsi.fastutil.longs.Long2BooleanSortedMaps.synchronize(it.unimi.dsi.fastutil.longs.Long2BooleanSortedMap,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.longs.Long2BooleanSortedMap p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.longs.Long2BooleanSortedMap synchronize(it.unimi.dsi.fastutil.longs.Long2BooleanSortedMap p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.longs.Long2BooleanSortedMaps.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.longs.Long2ByteFunctions#synchronize(it.unimi.dsi.fastutil.longs.Long2ByteFunction,java.lang.Object)}
*@see it.unimi.dsi.fastutil.longs.Long2ByteFunctions#synchronize(it.unimi.dsi.fastutil.longs.Long2ByteFunction,java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.longs.Long2ByteFunction it.unimi.dsi.fastutil.longs.Long2ByteFunctions.synchronize(it.unimi.dsi.fastutil.longs.Long2ByteFunction,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.longs.Long2ByteFunction p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.longs.Long2ByteFunction synchronize(it.unimi.dsi.fastutil.longs.Long2ByteFunction p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.longs.Long2ByteFunctions.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.longs.Long2ByteMaps#synchronize(it.unimi.dsi.fastutil.longs.Long2ByteMap,java.lang.Object)}
*@see it.unimi.dsi.fastutil.longs.Long2ByteMaps#synchronize(it.unimi.dsi.fastutil.longs.Long2ByteMap,java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.longs.Long2ByteMap it.unimi.dsi.fastutil.longs.Long2ByteMaps.synchronize(it.unimi.dsi.fastutil.longs.Long2ByteMap,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.longs.Long2ByteMap p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.longs.Long2ByteMap synchronize(it.unimi.dsi.fastutil.longs.Long2ByteMap p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.longs.Long2ByteMaps.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.longs.Long2ByteSortedMaps#synchronize(it.unimi.dsi.fastutil.longs.Long2ByteSortedMap,java.lang.Object)}
*@see it.unimi.dsi.fastutil.longs.Long2ByteSortedMaps#synchronize(it.unimi.dsi.fastutil.longs.Long2ByteSortedMap,java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.longs.Long2ByteSortedMap it.unimi.dsi.fastutil.longs.Long2ByteSortedMaps.synchronize(it.unimi.dsi.fastutil.longs.Long2ByteSortedMap,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.longs.Long2ByteSortedMap p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.longs.Long2ByteSortedMap synchronize(it.unimi.dsi.fastutil.longs.Long2ByteSortedMap p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.longs.Long2ByteSortedMaps.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.longs.Long2CharFunctions#synchronize(it.unimi.dsi.fastutil.longs.Long2CharFunction,java.lang.Object)}
*@see it.unimi.dsi.fastutil.longs.Long2CharFunctions#synchronize(it.unimi.dsi.fastutil.longs.Long2CharFunction,java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.longs.Long2CharFunction it.unimi.dsi.fastutil.longs.Long2CharFunctions.synchronize(it.unimi.dsi.fastutil.longs.Long2CharFunction,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.longs.Long2CharFunction p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.longs.Long2CharFunction synchronize(it.unimi.dsi.fastutil.longs.Long2CharFunction p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.longs.Long2CharFunctions.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.longs.Long2CharMaps#synchronize(it.unimi.dsi.fastutil.longs.Long2CharMap,java.lang.Object)}
*@see it.unimi.dsi.fastutil.longs.Long2CharMaps#synchronize(it.unimi.dsi.fastutil.longs.Long2CharMap,java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.longs.Long2CharMap it.unimi.dsi.fastutil.longs.Long2CharMaps.synchronize(it.unimi.dsi.fastutil.longs.Long2CharMap,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.longs.Long2CharMap p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.longs.Long2CharMap synchronize(it.unimi.dsi.fastutil.longs.Long2CharMap p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.longs.Long2CharMaps.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.longs.Long2CharSortedMaps#synchronize(it.unimi.dsi.fastutil.longs.Long2CharSortedMap,java.lang.Object)}
*@see it.unimi.dsi.fastutil.longs.Long2CharSortedMaps#synchronize(it.unimi.dsi.fastutil.longs.Long2CharSortedMap,java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.longs.Long2CharSortedMap it.unimi.dsi.fastutil.longs.Long2CharSortedMaps.synchronize(it.unimi.dsi.fastutil.longs.Long2CharSortedMap,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.longs.Long2CharSortedMap p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.longs.Long2CharSortedMap synchronize(it.unimi.dsi.fastutil.longs.Long2CharSortedMap p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.longs.Long2CharSortedMaps.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.longs.Long2DoubleFunctions#synchronize(it.unimi.dsi.fastutil.longs.Long2DoubleFunction,java.lang.Object)}
*@see it.unimi.dsi.fastutil.longs.Long2DoubleFunctions#synchronize(it.unimi.dsi.fastutil.longs.Long2DoubleFunction,java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.longs.Long2DoubleFunction it.unimi.dsi.fastutil.longs.Long2DoubleFunctions.synchronize(it.unimi.dsi.fastutil.longs.Long2DoubleFunction,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.longs.Long2DoubleFunction p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.longs.Long2DoubleFunction synchronize(it.unimi.dsi.fastutil.longs.Long2DoubleFunction p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.longs.Long2DoubleFunctions.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.longs.Long2DoubleMaps#synchronize(it.unimi.dsi.fastutil.longs.Long2DoubleMap,java.lang.Object)}
*@see it.unimi.dsi.fastutil.longs.Long2DoubleMaps#synchronize(it.unimi.dsi.fastutil.longs.Long2DoubleMap,java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.longs.Long2DoubleMap it.unimi.dsi.fastutil.longs.Long2DoubleMaps.synchronize(it.unimi.dsi.fastutil.longs.Long2DoubleMap,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.longs.Long2DoubleMap p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.longs.Long2DoubleMap synchronize(it.unimi.dsi.fastutil.longs.Long2DoubleMap p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.longs.Long2DoubleMaps.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.longs.Long2DoubleSortedMaps#synchronize(it.unimi.dsi.fastutil.longs.Long2DoubleSortedMap,java.lang.Object)}
*@see it.unimi.dsi.fastutil.longs.Long2DoubleSortedMaps#synchronize(it.unimi.dsi.fastutil.longs.Long2DoubleSortedMap,java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.longs.Long2DoubleSortedMap it.unimi.dsi.fastutil.longs.Long2DoubleSortedMaps.synchronize(it.unimi.dsi.fastutil.longs.Long2DoubleSortedMap,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.longs.Long2DoubleSortedMap p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.longs.Long2DoubleSortedMap synchronize(it.unimi.dsi.fastutil.longs.Long2DoubleSortedMap p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.longs.Long2DoubleSortedMaps.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.longs.Long2FloatFunctions#synchronize(it.unimi.dsi.fastutil.longs.Long2FloatFunction,java.lang.Object)}
*@see it.unimi.dsi.fastutil.longs.Long2FloatFunctions#synchronize(it.unimi.dsi.fastutil.longs.Long2FloatFunction,java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.longs.Long2FloatFunction it.unimi.dsi.fastutil.longs.Long2FloatFunctions.synchronize(it.unimi.dsi.fastutil.longs.Long2FloatFunction,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.longs.Long2FloatFunction p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.longs.Long2FloatFunction synchronize(it.unimi.dsi.fastutil.longs.Long2FloatFunction p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.longs.Long2FloatFunctions.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.longs.Long2FloatMaps#synchronize(it.unimi.dsi.fastutil.longs.Long2FloatMap,java.lang.Object)}
*@see it.unimi.dsi.fastutil.longs.Long2FloatMaps#synchronize(it.unimi.dsi.fastutil.longs.Long2FloatMap,java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.longs.Long2FloatMap it.unimi.dsi.fastutil.longs.Long2FloatMaps.synchronize(it.unimi.dsi.fastutil.longs.Long2FloatMap,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.longs.Long2FloatMap p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.longs.Long2FloatMap synchronize(it.unimi.dsi.fastutil.longs.Long2FloatMap p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.longs.Long2FloatMaps.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.longs.Long2FloatSortedMaps#synchronize(it.unimi.dsi.fastutil.longs.Long2FloatSortedMap,java.lang.Object)}
*@see it.unimi.dsi.fastutil.longs.Long2FloatSortedMaps#synchronize(it.unimi.dsi.fastutil.longs.Long2FloatSortedMap,java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.longs.Long2FloatSortedMap it.unimi.dsi.fastutil.longs.Long2FloatSortedMaps.synchronize(it.unimi.dsi.fastutil.longs.Long2FloatSortedMap,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.longs.Long2FloatSortedMap p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.longs.Long2FloatSortedMap synchronize(it.unimi.dsi.fastutil.longs.Long2FloatSortedMap p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.longs.Long2FloatSortedMaps.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.longs.Long2IntFunctions#synchronize(it.unimi.dsi.fastutil.longs.Long2IntFunction,java.lang.Object)}
*@see it.unimi.dsi.fastutil.longs.Long2IntFunctions#synchronize(it.unimi.dsi.fastutil.longs.Long2IntFunction,java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.longs.Long2IntFunction it.unimi.dsi.fastutil.longs.Long2IntFunctions.synchronize(it.unimi.dsi.fastutil.longs.Long2IntFunction,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.longs.Long2IntFunction p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.longs.Long2IntFunction synchronize(it.unimi.dsi.fastutil.longs.Long2IntFunction p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.longs.Long2IntFunctions.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.longs.Long2IntMaps#synchronize(it.unimi.dsi.fastutil.longs.Long2IntMap,java.lang.Object)}
*@see it.unimi.dsi.fastutil.longs.Long2IntMaps#synchronize(it.unimi.dsi.fastutil.longs.Long2IntMap,java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.longs.Long2IntMap it.unimi.dsi.fastutil.longs.Long2IntMaps.synchronize(it.unimi.dsi.fastutil.longs.Long2IntMap,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.longs.Long2IntMap p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.longs.Long2IntMap synchronize(it.unimi.dsi.fastutil.longs.Long2IntMap p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.longs.Long2IntMaps.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.longs.Long2IntSortedMaps#synchronize(it.unimi.dsi.fastutil.longs.Long2IntSortedMap,java.lang.Object)}
*@see it.unimi.dsi.fastutil.longs.Long2IntSortedMaps#synchronize(it.unimi.dsi.fastutil.longs.Long2IntSortedMap,java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.longs.Long2IntSortedMap it.unimi.dsi.fastutil.longs.Long2IntSortedMaps.synchronize(it.unimi.dsi.fastutil.longs.Long2IntSortedMap,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.longs.Long2IntSortedMap p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.longs.Long2IntSortedMap synchronize(it.unimi.dsi.fastutil.longs.Long2IntSortedMap p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.longs.Long2IntSortedMaps.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.longs.Long2LongFunctions#synchronize(it.unimi.dsi.fastutil.longs.Long2LongFunction,java.lang.Object)}
*@see it.unimi.dsi.fastutil.longs.Long2LongFunctions#synchronize(it.unimi.dsi.fastutil.longs.Long2LongFunction,java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.longs.Long2LongFunction it.unimi.dsi.fastutil.longs.Long2LongFunctions.synchronize(it.unimi.dsi.fastutil.longs.Long2LongFunction,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.longs.Long2LongFunction p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.longs.Long2LongFunction synchronize(it.unimi.dsi.fastutil.longs.Long2LongFunction p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.longs.Long2LongFunctions.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.longs.Long2LongMaps#synchronize(it.unimi.dsi.fastutil.longs.Long2LongMap,java.lang.Object)}
*@see it.unimi.dsi.fastutil.longs.Long2LongMaps#synchronize(it.unimi.dsi.fastutil.longs.Long2LongMap,java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.longs.Long2LongMap it.unimi.dsi.fastutil.longs.Long2LongMaps.synchronize(it.unimi.dsi.fastutil.longs.Long2LongMap,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.longs.Long2LongMap p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.longs.Long2LongMap synchronize(it.unimi.dsi.fastutil.longs.Long2LongMap p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.longs.Long2LongMaps.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.longs.Long2LongSortedMaps#synchronize(it.unimi.dsi.fastutil.longs.Long2LongSortedMap,java.lang.Object)}
*@see it.unimi.dsi.fastutil.longs.Long2LongSortedMaps#synchronize(it.unimi.dsi.fastutil.longs.Long2LongSortedMap,java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.longs.Long2LongSortedMap it.unimi.dsi.fastutil.longs.Long2LongSortedMaps.synchronize(it.unimi.dsi.fastutil.longs.Long2LongSortedMap,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.longs.Long2LongSortedMap p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.longs.Long2LongSortedMap synchronize(it.unimi.dsi.fastutil.longs.Long2LongSortedMap p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.longs.Long2LongSortedMaps.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.longs.Long2ObjectFunctions#synchronize(it.unimi.dsi.fastutil.longs.Long2ObjectFunction<V>,java.lang.Object)}
*@see it.unimi.dsi.fastutil.longs.Long2ObjectFunctions#synchronize(it.unimi.dsi.fastutil.longs.Long2ObjectFunction<V>,java.lang.Object)
*<code>public static <V> it.unimi.dsi.fastutil.longs.Long2ObjectFunction<V> it.unimi.dsi.fastutil.longs.Long2ObjectFunctions.synchronize(it.unimi.dsi.fastutil.longs.Long2ObjectFunction<V>,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.longs.Long2ObjectFunction<V> p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <V> it.unimi.dsi.fastutil.longs.Long2ObjectFunction<V> synchronize(it.unimi.dsi.fastutil.longs.Long2ObjectFunction<V> p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.longs.Long2ObjectFunctions.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.longs.Long2ObjectMaps#synchronize(it.unimi.dsi.fastutil.longs.Long2ObjectMap<V>,java.lang.Object)}
*@see it.unimi.dsi.fastutil.longs.Long2ObjectMaps#synchronize(it.unimi.dsi.fastutil.longs.Long2ObjectMap<V>,java.lang.Object)
*<code>public static <V> it.unimi.dsi.fastutil.longs.Long2ObjectMap<V> it.unimi.dsi.fastutil.longs.Long2ObjectMaps.synchronize(it.unimi.dsi.fastutil.longs.Long2ObjectMap<V>,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.longs.Long2ObjectMap<V> p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <V> it.unimi.dsi.fastutil.longs.Long2ObjectMap<V> synchronize(it.unimi.dsi.fastutil.longs.Long2ObjectMap<V> p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.longs.Long2ObjectMaps.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.longs.Long2ObjectSortedMaps#synchronize(it.unimi.dsi.fastutil.longs.Long2ObjectSortedMap<V>,java.lang.Object)}
*@see it.unimi.dsi.fastutil.longs.Long2ObjectSortedMaps#synchronize(it.unimi.dsi.fastutil.longs.Long2ObjectSortedMap<V>,java.lang.Object)
*<code>public static <V> it.unimi.dsi.fastutil.longs.Long2ObjectSortedMap<V> it.unimi.dsi.fastutil.longs.Long2ObjectSortedMaps.synchronize(it.unimi.dsi.fastutil.longs.Long2ObjectSortedMap<V>,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.longs.Long2ObjectSortedMap<V> p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <V> it.unimi.dsi.fastutil.longs.Long2ObjectSortedMap<V> synchronize(it.unimi.dsi.fastutil.longs.Long2ObjectSortedMap<V> p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.longs.Long2ObjectSortedMaps.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.longs.Long2ReferenceFunctions#synchronize(it.unimi.dsi.fastutil.longs.Long2ReferenceFunction<V>,java.lang.Object)}
*@see it.unimi.dsi.fastutil.longs.Long2ReferenceFunctions#synchronize(it.unimi.dsi.fastutil.longs.Long2ReferenceFunction<V>,java.lang.Object)
*<code>public static <V> it.unimi.dsi.fastutil.longs.Long2ReferenceFunction<V> it.unimi.dsi.fastutil.longs.Long2ReferenceFunctions.synchronize(it.unimi.dsi.fastutil.longs.Long2ReferenceFunction<V>,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.longs.Long2ReferenceFunction<V> p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <V> it.unimi.dsi.fastutil.longs.Long2ReferenceFunction<V> synchronize(it.unimi.dsi.fastutil.longs.Long2ReferenceFunction<V> p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.longs.Long2ReferenceFunctions.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.longs.Long2ReferenceMaps#synchronize(it.unimi.dsi.fastutil.longs.Long2ReferenceMap<V>,java.lang.Object)}
*@see it.unimi.dsi.fastutil.longs.Long2ReferenceMaps#synchronize(it.unimi.dsi.fastutil.longs.Long2ReferenceMap<V>,java.lang.Object)
*<code>public static <V> it.unimi.dsi.fastutil.longs.Long2ReferenceMap<V> it.unimi.dsi.fastutil.longs.Long2ReferenceMaps.synchronize(it.unimi.dsi.fastutil.longs.Long2ReferenceMap<V>,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.longs.Long2ReferenceMap<V> p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <V> it.unimi.dsi.fastutil.longs.Long2ReferenceMap<V> synchronize(it.unimi.dsi.fastutil.longs.Long2ReferenceMap<V> p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.longs.Long2ReferenceMaps.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.longs.Long2ReferenceSortedMaps#synchronize(it.unimi.dsi.fastutil.longs.Long2ReferenceSortedMap<V>,java.lang.Object)}
*@see it.unimi.dsi.fastutil.longs.Long2ReferenceSortedMaps#synchronize(it.unimi.dsi.fastutil.longs.Long2ReferenceSortedMap<V>,java.lang.Object)
*<code>public static <V> it.unimi.dsi.fastutil.longs.Long2ReferenceSortedMap<V> it.unimi.dsi.fastutil.longs.Long2ReferenceSortedMaps.synchronize(it.unimi.dsi.fastutil.longs.Long2ReferenceSortedMap<V>,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.longs.Long2ReferenceSortedMap<V> p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <V> it.unimi.dsi.fastutil.longs.Long2ReferenceSortedMap<V> synchronize(it.unimi.dsi.fastutil.longs.Long2ReferenceSortedMap<V> p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.longs.Long2ReferenceSortedMaps.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.longs.Long2ShortFunctions#synchronize(it.unimi.dsi.fastutil.longs.Long2ShortFunction,java.lang.Object)}
*@see it.unimi.dsi.fastutil.longs.Long2ShortFunctions#synchronize(it.unimi.dsi.fastutil.longs.Long2ShortFunction,java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.longs.Long2ShortFunction it.unimi.dsi.fastutil.longs.Long2ShortFunctions.synchronize(it.unimi.dsi.fastutil.longs.Long2ShortFunction,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.longs.Long2ShortFunction p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.longs.Long2ShortFunction synchronize(it.unimi.dsi.fastutil.longs.Long2ShortFunction p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.longs.Long2ShortFunctions.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.longs.Long2ShortMaps#synchronize(it.unimi.dsi.fastutil.longs.Long2ShortMap,java.lang.Object)}
*@see it.unimi.dsi.fastutil.longs.Long2ShortMaps#synchronize(it.unimi.dsi.fastutil.longs.Long2ShortMap,java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.longs.Long2ShortMap it.unimi.dsi.fastutil.longs.Long2ShortMaps.synchronize(it.unimi.dsi.fastutil.longs.Long2ShortMap,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.longs.Long2ShortMap p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.longs.Long2ShortMap synchronize(it.unimi.dsi.fastutil.longs.Long2ShortMap p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.longs.Long2ShortMaps.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.longs.Long2ShortSortedMaps#synchronize(it.unimi.dsi.fastutil.longs.Long2ShortSortedMap,java.lang.Object)}
*@see it.unimi.dsi.fastutil.longs.Long2ShortSortedMaps#synchronize(it.unimi.dsi.fastutil.longs.Long2ShortSortedMap,java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.longs.Long2ShortSortedMap it.unimi.dsi.fastutil.longs.Long2ShortSortedMaps.synchronize(it.unimi.dsi.fastutil.longs.Long2ShortSortedMap,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.longs.Long2ShortSortedMap p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.longs.Long2ShortSortedMap synchronize(it.unimi.dsi.fastutil.longs.Long2ShortSortedMap p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.longs.Long2ShortSortedMaps.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.longs.LongBigLists#synchronize(it.unimi.dsi.fastutil.longs.LongBigList,java.lang.Object)}
*@see it.unimi.dsi.fastutil.longs.LongBigLists#synchronize(it.unimi.dsi.fastutil.longs.LongBigList,java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.longs.LongBigList it.unimi.dsi.fastutil.longs.LongBigLists.synchronize(it.unimi.dsi.fastutil.longs.LongBigList,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.longs.LongBigList p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.longs.LongBigList synchronize(it.unimi.dsi.fastutil.longs.LongBigList p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.longs.LongBigLists.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.longs.LongCollections#synchronize(it.unimi.dsi.fastutil.longs.LongCollection,java.lang.Object)}
*@see it.unimi.dsi.fastutil.longs.LongCollections#synchronize(it.unimi.dsi.fastutil.longs.LongCollection,java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.longs.LongCollection it.unimi.dsi.fastutil.longs.LongCollections.synchronize(it.unimi.dsi.fastutil.longs.LongCollection,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.longs.LongCollection p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.longs.LongCollection synchronize(it.unimi.dsi.fastutil.longs.LongCollection p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.longs.LongCollections.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.longs.LongLists#synchronize(it.unimi.dsi.fastutil.longs.LongList,java.lang.Object)}
*@see it.unimi.dsi.fastutil.longs.LongLists#synchronize(it.unimi.dsi.fastutil.longs.LongList,java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.longs.LongList it.unimi.dsi.fastutil.longs.LongLists.synchronize(it.unimi.dsi.fastutil.longs.LongList,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.longs.LongList p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.longs.LongList synchronize(it.unimi.dsi.fastutil.longs.LongList p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.longs.LongLists.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.longs.LongPriorityQueues#synchronize(it.unimi.dsi.fastutil.longs.LongPriorityQueue,java.lang.Object)}
*@see it.unimi.dsi.fastutil.longs.LongPriorityQueues#synchronize(it.unimi.dsi.fastutil.longs.LongPriorityQueue,java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.longs.LongPriorityQueue it.unimi.dsi.fastutil.longs.LongPriorityQueues.synchronize(it.unimi.dsi.fastutil.longs.LongPriorityQueue,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.longs.LongPriorityQueue p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.longs.LongPriorityQueue synchronize(it.unimi.dsi.fastutil.longs.LongPriorityQueue p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.longs.LongPriorityQueues.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.longs.LongSets#synchronize(it.unimi.dsi.fastutil.longs.LongSet,java.lang.Object)}
*@see it.unimi.dsi.fastutil.longs.LongSets#synchronize(it.unimi.dsi.fastutil.longs.LongSet,java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.longs.LongSet it.unimi.dsi.fastutil.longs.LongSets.synchronize(it.unimi.dsi.fastutil.longs.LongSet,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.longs.LongSet p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.longs.LongSet synchronize(it.unimi.dsi.fastutil.longs.LongSet p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.longs.LongSets.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.longs.LongSortedSets#synchronize(it.unimi.dsi.fastutil.longs.LongSortedSet,java.lang.Object)}
*@see it.unimi.dsi.fastutil.longs.LongSortedSets#synchronize(it.unimi.dsi.fastutil.longs.LongSortedSet,java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.longs.LongSortedSet it.unimi.dsi.fastutil.longs.LongSortedSets.synchronize(it.unimi.dsi.fastutil.longs.LongSortedSet,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.longs.LongSortedSet p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.longs.LongSortedSet synchronize(it.unimi.dsi.fastutil.longs.LongSortedSet p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.longs.LongSortedSets.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.objects.Object2BooleanFunctions#synchronize(it.unimi.dsi.fastutil.objects.Object2BooleanFunction<K>,java.lang.Object)}
*@see it.unimi.dsi.fastutil.objects.Object2BooleanFunctions#synchronize(it.unimi.dsi.fastutil.objects.Object2BooleanFunction<K>,java.lang.Object)
*<code>public static <K> it.unimi.dsi.fastutil.objects.Object2BooleanFunction<K> it.unimi.dsi.fastutil.objects.Object2BooleanFunctions.synchronize(it.unimi.dsi.fastutil.objects.Object2BooleanFunction<K>,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.objects.Object2BooleanFunction<K> p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K> it.unimi.dsi.fastutil.objects.Object2BooleanFunction<K> synchronize(it.unimi.dsi.fastutil.objects.Object2BooleanFunction<K> p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.objects.Object2BooleanFunctions.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.objects.Object2BooleanMaps#synchronize(it.unimi.dsi.fastutil.objects.Object2BooleanMap<K>,java.lang.Object)}
*@see it.unimi.dsi.fastutil.objects.Object2BooleanMaps#synchronize(it.unimi.dsi.fastutil.objects.Object2BooleanMap<K>,java.lang.Object)
*<code>public static <K> it.unimi.dsi.fastutil.objects.Object2BooleanMap<K> it.unimi.dsi.fastutil.objects.Object2BooleanMaps.synchronize(it.unimi.dsi.fastutil.objects.Object2BooleanMap<K>,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.objects.Object2BooleanMap<K> p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K> it.unimi.dsi.fastutil.objects.Object2BooleanMap<K> synchronize(it.unimi.dsi.fastutil.objects.Object2BooleanMap<K> p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.objects.Object2BooleanMaps.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.objects.Object2BooleanSortedMaps#synchronize(it.unimi.dsi.fastutil.objects.Object2BooleanSortedMap<K>,java.lang.Object)}
*@see it.unimi.dsi.fastutil.objects.Object2BooleanSortedMaps#synchronize(it.unimi.dsi.fastutil.objects.Object2BooleanSortedMap<K>,java.lang.Object)
*<code>public static <K> it.unimi.dsi.fastutil.objects.Object2BooleanSortedMap<K> it.unimi.dsi.fastutil.objects.Object2BooleanSortedMaps.synchronize(it.unimi.dsi.fastutil.objects.Object2BooleanSortedMap<K>,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.objects.Object2BooleanSortedMap<K> p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K> it.unimi.dsi.fastutil.objects.Object2BooleanSortedMap<K> synchronize(it.unimi.dsi.fastutil.objects.Object2BooleanSortedMap<K> p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.objects.Object2BooleanSortedMaps.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.objects.Object2ByteFunctions#synchronize(it.unimi.dsi.fastutil.objects.Object2ByteFunction<K>,java.lang.Object)}
*@see it.unimi.dsi.fastutil.objects.Object2ByteFunctions#synchronize(it.unimi.dsi.fastutil.objects.Object2ByteFunction<K>,java.lang.Object)
*<code>public static <K> it.unimi.dsi.fastutil.objects.Object2ByteFunction<K> it.unimi.dsi.fastutil.objects.Object2ByteFunctions.synchronize(it.unimi.dsi.fastutil.objects.Object2ByteFunction<K>,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.objects.Object2ByteFunction<K> p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K> it.unimi.dsi.fastutil.objects.Object2ByteFunction<K> synchronize(it.unimi.dsi.fastutil.objects.Object2ByteFunction<K> p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.objects.Object2ByteFunctions.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.objects.Object2ByteMaps#synchronize(it.unimi.dsi.fastutil.objects.Object2ByteMap<K>,java.lang.Object)}
*@see it.unimi.dsi.fastutil.objects.Object2ByteMaps#synchronize(it.unimi.dsi.fastutil.objects.Object2ByteMap<K>,java.lang.Object)
*<code>public static <K> it.unimi.dsi.fastutil.objects.Object2ByteMap<K> it.unimi.dsi.fastutil.objects.Object2ByteMaps.synchronize(it.unimi.dsi.fastutil.objects.Object2ByteMap<K>,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.objects.Object2ByteMap<K> p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K> it.unimi.dsi.fastutil.objects.Object2ByteMap<K> synchronize(it.unimi.dsi.fastutil.objects.Object2ByteMap<K> p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.objects.Object2ByteMaps.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.objects.Object2ByteSortedMaps#synchronize(it.unimi.dsi.fastutil.objects.Object2ByteSortedMap<K>,java.lang.Object)}
*@see it.unimi.dsi.fastutil.objects.Object2ByteSortedMaps#synchronize(it.unimi.dsi.fastutil.objects.Object2ByteSortedMap<K>,java.lang.Object)
*<code>public static <K> it.unimi.dsi.fastutil.objects.Object2ByteSortedMap<K> it.unimi.dsi.fastutil.objects.Object2ByteSortedMaps.synchronize(it.unimi.dsi.fastutil.objects.Object2ByteSortedMap<K>,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.objects.Object2ByteSortedMap<K> p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K> it.unimi.dsi.fastutil.objects.Object2ByteSortedMap<K> synchronize(it.unimi.dsi.fastutil.objects.Object2ByteSortedMap<K> p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.objects.Object2ByteSortedMaps.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.objects.Object2CharFunctions#synchronize(it.unimi.dsi.fastutil.objects.Object2CharFunction<K>,java.lang.Object)}
*@see it.unimi.dsi.fastutil.objects.Object2CharFunctions#synchronize(it.unimi.dsi.fastutil.objects.Object2CharFunction<K>,java.lang.Object)
*<code>public static <K> it.unimi.dsi.fastutil.objects.Object2CharFunction<K> it.unimi.dsi.fastutil.objects.Object2CharFunctions.synchronize(it.unimi.dsi.fastutil.objects.Object2CharFunction<K>,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.objects.Object2CharFunction<K> p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K> it.unimi.dsi.fastutil.objects.Object2CharFunction<K> synchronize(it.unimi.dsi.fastutil.objects.Object2CharFunction<K> p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.objects.Object2CharFunctions.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.objects.Object2CharMaps#synchronize(it.unimi.dsi.fastutil.objects.Object2CharMap<K>,java.lang.Object)}
*@see it.unimi.dsi.fastutil.objects.Object2CharMaps#synchronize(it.unimi.dsi.fastutil.objects.Object2CharMap<K>,java.lang.Object)
*<code>public static <K> it.unimi.dsi.fastutil.objects.Object2CharMap<K> it.unimi.dsi.fastutil.objects.Object2CharMaps.synchronize(it.unimi.dsi.fastutil.objects.Object2CharMap<K>,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.objects.Object2CharMap<K> p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K> it.unimi.dsi.fastutil.objects.Object2CharMap<K> synchronize(it.unimi.dsi.fastutil.objects.Object2CharMap<K> p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.objects.Object2CharMaps.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.objects.Object2CharSortedMaps#synchronize(it.unimi.dsi.fastutil.objects.Object2CharSortedMap<K>,java.lang.Object)}
*@see it.unimi.dsi.fastutil.objects.Object2CharSortedMaps#synchronize(it.unimi.dsi.fastutil.objects.Object2CharSortedMap<K>,java.lang.Object)
*<code>public static <K> it.unimi.dsi.fastutil.objects.Object2CharSortedMap<K> it.unimi.dsi.fastutil.objects.Object2CharSortedMaps.synchronize(it.unimi.dsi.fastutil.objects.Object2CharSortedMap<K>,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.objects.Object2CharSortedMap<K> p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K> it.unimi.dsi.fastutil.objects.Object2CharSortedMap<K> synchronize(it.unimi.dsi.fastutil.objects.Object2CharSortedMap<K> p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.objects.Object2CharSortedMaps.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.objects.Object2DoubleFunctions#synchronize(it.unimi.dsi.fastutil.objects.Object2DoubleFunction<K>,java.lang.Object)}
*@see it.unimi.dsi.fastutil.objects.Object2DoubleFunctions#synchronize(it.unimi.dsi.fastutil.objects.Object2DoubleFunction<K>,java.lang.Object)
*<code>public static <K> it.unimi.dsi.fastutil.objects.Object2DoubleFunction<K> it.unimi.dsi.fastutil.objects.Object2DoubleFunctions.synchronize(it.unimi.dsi.fastutil.objects.Object2DoubleFunction<K>,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.objects.Object2DoubleFunction<K> p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K> it.unimi.dsi.fastutil.objects.Object2DoubleFunction<K> synchronize(it.unimi.dsi.fastutil.objects.Object2DoubleFunction<K> p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.objects.Object2DoubleFunctions.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.objects.Object2DoubleMaps#synchronize(it.unimi.dsi.fastutil.objects.Object2DoubleMap<K>,java.lang.Object)}
*@see it.unimi.dsi.fastutil.objects.Object2DoubleMaps#synchronize(it.unimi.dsi.fastutil.objects.Object2DoubleMap<K>,java.lang.Object)
*<code>public static <K> it.unimi.dsi.fastutil.objects.Object2DoubleMap<K> it.unimi.dsi.fastutil.objects.Object2DoubleMaps.synchronize(it.unimi.dsi.fastutil.objects.Object2DoubleMap<K>,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.objects.Object2DoubleMap<K> p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K> it.unimi.dsi.fastutil.objects.Object2DoubleMap<K> synchronize(it.unimi.dsi.fastutil.objects.Object2DoubleMap<K> p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.objects.Object2DoubleMaps.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.objects.Object2DoubleSortedMaps#synchronize(it.unimi.dsi.fastutil.objects.Object2DoubleSortedMap<K>,java.lang.Object)}
*@see it.unimi.dsi.fastutil.objects.Object2DoubleSortedMaps#synchronize(it.unimi.dsi.fastutil.objects.Object2DoubleSortedMap<K>,java.lang.Object)
*<code>public static <K> it.unimi.dsi.fastutil.objects.Object2DoubleSortedMap<K> it.unimi.dsi.fastutil.objects.Object2DoubleSortedMaps.synchronize(it.unimi.dsi.fastutil.objects.Object2DoubleSortedMap<K>,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.objects.Object2DoubleSortedMap<K> p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K> it.unimi.dsi.fastutil.objects.Object2DoubleSortedMap<K> synchronize(it.unimi.dsi.fastutil.objects.Object2DoubleSortedMap<K> p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.objects.Object2DoubleSortedMaps.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.objects.Object2FloatFunctions#synchronize(it.unimi.dsi.fastutil.objects.Object2FloatFunction<K>,java.lang.Object)}
*@see it.unimi.dsi.fastutil.objects.Object2FloatFunctions#synchronize(it.unimi.dsi.fastutil.objects.Object2FloatFunction<K>,java.lang.Object)
*<code>public static <K> it.unimi.dsi.fastutil.objects.Object2FloatFunction<K> it.unimi.dsi.fastutil.objects.Object2FloatFunctions.synchronize(it.unimi.dsi.fastutil.objects.Object2FloatFunction<K>,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.objects.Object2FloatFunction<K> p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K> it.unimi.dsi.fastutil.objects.Object2FloatFunction<K> synchronize(it.unimi.dsi.fastutil.objects.Object2FloatFunction<K> p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.objects.Object2FloatFunctions.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.objects.Object2FloatMaps#synchronize(it.unimi.dsi.fastutil.objects.Object2FloatMap<K>,java.lang.Object)}
*@see it.unimi.dsi.fastutil.objects.Object2FloatMaps#synchronize(it.unimi.dsi.fastutil.objects.Object2FloatMap<K>,java.lang.Object)
*<code>public static <K> it.unimi.dsi.fastutil.objects.Object2FloatMap<K> it.unimi.dsi.fastutil.objects.Object2FloatMaps.synchronize(it.unimi.dsi.fastutil.objects.Object2FloatMap<K>,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.objects.Object2FloatMap<K> p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K> it.unimi.dsi.fastutil.objects.Object2FloatMap<K> synchronize(it.unimi.dsi.fastutil.objects.Object2FloatMap<K> p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.objects.Object2FloatMaps.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.objects.Object2FloatSortedMaps#synchronize(it.unimi.dsi.fastutil.objects.Object2FloatSortedMap<K>,java.lang.Object)}
*@see it.unimi.dsi.fastutil.objects.Object2FloatSortedMaps#synchronize(it.unimi.dsi.fastutil.objects.Object2FloatSortedMap<K>,java.lang.Object)
*<code>public static <K> it.unimi.dsi.fastutil.objects.Object2FloatSortedMap<K> it.unimi.dsi.fastutil.objects.Object2FloatSortedMaps.synchronize(it.unimi.dsi.fastutil.objects.Object2FloatSortedMap<K>,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.objects.Object2FloatSortedMap<K> p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K> it.unimi.dsi.fastutil.objects.Object2FloatSortedMap<K> synchronize(it.unimi.dsi.fastutil.objects.Object2FloatSortedMap<K> p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.objects.Object2FloatSortedMaps.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.objects.Object2IntFunctions#synchronize(it.unimi.dsi.fastutil.objects.Object2IntFunction<K>,java.lang.Object)}
*@see it.unimi.dsi.fastutil.objects.Object2IntFunctions#synchronize(it.unimi.dsi.fastutil.objects.Object2IntFunction<K>,java.lang.Object)
*<code>public static <K> it.unimi.dsi.fastutil.objects.Object2IntFunction<K> it.unimi.dsi.fastutil.objects.Object2IntFunctions.synchronize(it.unimi.dsi.fastutil.objects.Object2IntFunction<K>,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.objects.Object2IntFunction<K> p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K> it.unimi.dsi.fastutil.objects.Object2IntFunction<K> synchronize(it.unimi.dsi.fastutil.objects.Object2IntFunction<K> p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.objects.Object2IntFunctions.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.objects.Object2IntMaps#synchronize(it.unimi.dsi.fastutil.objects.Object2IntMap<K>,java.lang.Object)}
*@see it.unimi.dsi.fastutil.objects.Object2IntMaps#synchronize(it.unimi.dsi.fastutil.objects.Object2IntMap<K>,java.lang.Object)
*<code>public static <K> it.unimi.dsi.fastutil.objects.Object2IntMap<K> it.unimi.dsi.fastutil.objects.Object2IntMaps.synchronize(it.unimi.dsi.fastutil.objects.Object2IntMap<K>,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.objects.Object2IntMap<K> p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K> it.unimi.dsi.fastutil.objects.Object2IntMap<K> synchronize(it.unimi.dsi.fastutil.objects.Object2IntMap<K> p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.objects.Object2IntMaps.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.objects.Object2IntSortedMaps#synchronize(it.unimi.dsi.fastutil.objects.Object2IntSortedMap<K>,java.lang.Object)}
*@see it.unimi.dsi.fastutil.objects.Object2IntSortedMaps#synchronize(it.unimi.dsi.fastutil.objects.Object2IntSortedMap<K>,java.lang.Object)
*<code>public static <K> it.unimi.dsi.fastutil.objects.Object2IntSortedMap<K> it.unimi.dsi.fastutil.objects.Object2IntSortedMaps.synchronize(it.unimi.dsi.fastutil.objects.Object2IntSortedMap<K>,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.objects.Object2IntSortedMap<K> p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K> it.unimi.dsi.fastutil.objects.Object2IntSortedMap<K> synchronize(it.unimi.dsi.fastutil.objects.Object2IntSortedMap<K> p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.objects.Object2IntSortedMaps.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.objects.Object2LongFunctions#synchronize(it.unimi.dsi.fastutil.objects.Object2LongFunction<K>,java.lang.Object)}
*@see it.unimi.dsi.fastutil.objects.Object2LongFunctions#synchronize(it.unimi.dsi.fastutil.objects.Object2LongFunction<K>,java.lang.Object)
*<code>public static <K> it.unimi.dsi.fastutil.objects.Object2LongFunction<K> it.unimi.dsi.fastutil.objects.Object2LongFunctions.synchronize(it.unimi.dsi.fastutil.objects.Object2LongFunction<K>,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.objects.Object2LongFunction<K> p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K> it.unimi.dsi.fastutil.objects.Object2LongFunction<K> synchronize(it.unimi.dsi.fastutil.objects.Object2LongFunction<K> p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.objects.Object2LongFunctions.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.objects.Object2LongMaps#synchronize(it.unimi.dsi.fastutil.objects.Object2LongMap<K>,java.lang.Object)}
*@see it.unimi.dsi.fastutil.objects.Object2LongMaps#synchronize(it.unimi.dsi.fastutil.objects.Object2LongMap<K>,java.lang.Object)
*<code>public static <K> it.unimi.dsi.fastutil.objects.Object2LongMap<K> it.unimi.dsi.fastutil.objects.Object2LongMaps.synchronize(it.unimi.dsi.fastutil.objects.Object2LongMap<K>,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.objects.Object2LongMap<K> p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K> it.unimi.dsi.fastutil.objects.Object2LongMap<K> synchronize(it.unimi.dsi.fastutil.objects.Object2LongMap<K> p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.objects.Object2LongMaps.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.objects.Object2LongSortedMaps#synchronize(it.unimi.dsi.fastutil.objects.Object2LongSortedMap<K>,java.lang.Object)}
*@see it.unimi.dsi.fastutil.objects.Object2LongSortedMaps#synchronize(it.unimi.dsi.fastutil.objects.Object2LongSortedMap<K>,java.lang.Object)
*<code>public static <K> it.unimi.dsi.fastutil.objects.Object2LongSortedMap<K> it.unimi.dsi.fastutil.objects.Object2LongSortedMaps.synchronize(it.unimi.dsi.fastutil.objects.Object2LongSortedMap<K>,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.objects.Object2LongSortedMap<K> p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K> it.unimi.dsi.fastutil.objects.Object2LongSortedMap<K> synchronize(it.unimi.dsi.fastutil.objects.Object2LongSortedMap<K> p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.objects.Object2LongSortedMaps.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.objects.Object2ObjectFunctions#synchronize(it.unimi.dsi.fastutil.objects.Object2ObjectFunction<K, V>,java.lang.Object)}
*@see it.unimi.dsi.fastutil.objects.Object2ObjectFunctions#synchronize(it.unimi.dsi.fastutil.objects.Object2ObjectFunction<K, V>,java.lang.Object)
*<code>public static <K,V> it.unimi.dsi.fastutil.objects.Object2ObjectFunction<K, V> it.unimi.dsi.fastutil.objects.Object2ObjectFunctions.synchronize(it.unimi.dsi.fastutil.objects.Object2ObjectFunction<K, V>,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.objects.Object2ObjectFunction<K, V> p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K,V> it.unimi.dsi.fastutil.objects.Object2ObjectFunction<K, V> synchronize(it.unimi.dsi.fastutil.objects.Object2ObjectFunction<K, V> p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.objects.Object2ObjectFunctions.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.objects.Object2ObjectMaps#synchronize(it.unimi.dsi.fastutil.objects.Object2ObjectMap<K, V>,java.lang.Object)}
*@see it.unimi.dsi.fastutil.objects.Object2ObjectMaps#synchronize(it.unimi.dsi.fastutil.objects.Object2ObjectMap<K, V>,java.lang.Object)
*<code>public static <K,V> it.unimi.dsi.fastutil.objects.Object2ObjectMap<K, V> it.unimi.dsi.fastutil.objects.Object2ObjectMaps.synchronize(it.unimi.dsi.fastutil.objects.Object2ObjectMap<K, V>,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.objects.Object2ObjectMap<K, V> p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K,V> it.unimi.dsi.fastutil.objects.Object2ObjectMap<K, V> synchronize(it.unimi.dsi.fastutil.objects.Object2ObjectMap<K, V> p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.objects.Object2ObjectMaps.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.objects.Object2ObjectSortedMaps#synchronize(it.unimi.dsi.fastutil.objects.Object2ObjectSortedMap<K, V>,java.lang.Object)}
*@see it.unimi.dsi.fastutil.objects.Object2ObjectSortedMaps#synchronize(it.unimi.dsi.fastutil.objects.Object2ObjectSortedMap<K, V>,java.lang.Object)
*<code>public static <K,V> it.unimi.dsi.fastutil.objects.Object2ObjectSortedMap<K, V> it.unimi.dsi.fastutil.objects.Object2ObjectSortedMaps.synchronize(it.unimi.dsi.fastutil.objects.Object2ObjectSortedMap<K, V>,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.objects.Object2ObjectSortedMap<K, V> p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K,V> it.unimi.dsi.fastutil.objects.Object2ObjectSortedMap<K, V> synchronize(it.unimi.dsi.fastutil.objects.Object2ObjectSortedMap<K, V> p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.objects.Object2ObjectSortedMaps.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.objects.Object2ReferenceFunctions#synchronize(it.unimi.dsi.fastutil.objects.Object2ReferenceFunction<K, V>,java.lang.Object)}
*@see it.unimi.dsi.fastutil.objects.Object2ReferenceFunctions#synchronize(it.unimi.dsi.fastutil.objects.Object2ReferenceFunction<K, V>,java.lang.Object)
*<code>public static <K,V> it.unimi.dsi.fastutil.objects.Object2ReferenceFunction<K, V> it.unimi.dsi.fastutil.objects.Object2ReferenceFunctions.synchronize(it.unimi.dsi.fastutil.objects.Object2ReferenceFunction<K, V>,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.objects.Object2ReferenceFunction<K, V> p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K,V> it.unimi.dsi.fastutil.objects.Object2ReferenceFunction<K, V> synchronize(it.unimi.dsi.fastutil.objects.Object2ReferenceFunction<K, V> p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.objects.Object2ReferenceFunctions.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.objects.Object2ReferenceMaps#synchronize(it.unimi.dsi.fastutil.objects.Object2ReferenceMap<K, V>,java.lang.Object)}
*@see it.unimi.dsi.fastutil.objects.Object2ReferenceMaps#synchronize(it.unimi.dsi.fastutil.objects.Object2ReferenceMap<K, V>,java.lang.Object)
*<code>public static <K,V> it.unimi.dsi.fastutil.objects.Object2ReferenceMap<K, V> it.unimi.dsi.fastutil.objects.Object2ReferenceMaps.synchronize(it.unimi.dsi.fastutil.objects.Object2ReferenceMap<K, V>,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.objects.Object2ReferenceMap<K, V> p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K,V> it.unimi.dsi.fastutil.objects.Object2ReferenceMap<K, V> synchronize(it.unimi.dsi.fastutil.objects.Object2ReferenceMap<K, V> p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.objects.Object2ReferenceMaps.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.objects.Object2ReferenceSortedMaps#synchronize(it.unimi.dsi.fastutil.objects.Object2ReferenceSortedMap<K, V>,java.lang.Object)}
*@see it.unimi.dsi.fastutil.objects.Object2ReferenceSortedMaps#synchronize(it.unimi.dsi.fastutil.objects.Object2ReferenceSortedMap<K, V>,java.lang.Object)
*<code>public static <K,V> it.unimi.dsi.fastutil.objects.Object2ReferenceSortedMap<K, V> it.unimi.dsi.fastutil.objects.Object2ReferenceSortedMaps.synchronize(it.unimi.dsi.fastutil.objects.Object2ReferenceSortedMap<K, V>,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.objects.Object2ReferenceSortedMap<K, V> p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K,V> it.unimi.dsi.fastutil.objects.Object2ReferenceSortedMap<K, V> synchronize(it.unimi.dsi.fastutil.objects.Object2ReferenceSortedMap<K, V> p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.objects.Object2ReferenceSortedMaps.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.objects.Object2ShortFunctions#synchronize(it.unimi.dsi.fastutil.objects.Object2ShortFunction<K>,java.lang.Object)}
*@see it.unimi.dsi.fastutil.objects.Object2ShortFunctions#synchronize(it.unimi.dsi.fastutil.objects.Object2ShortFunction<K>,java.lang.Object)
*<code>public static <K> it.unimi.dsi.fastutil.objects.Object2ShortFunction<K> it.unimi.dsi.fastutil.objects.Object2ShortFunctions.synchronize(it.unimi.dsi.fastutil.objects.Object2ShortFunction<K>,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.objects.Object2ShortFunction<K> p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K> it.unimi.dsi.fastutil.objects.Object2ShortFunction<K> synchronize(it.unimi.dsi.fastutil.objects.Object2ShortFunction<K> p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.objects.Object2ShortFunctions.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.objects.Object2ShortMaps#synchronize(it.unimi.dsi.fastutil.objects.Object2ShortMap<K>,java.lang.Object)}
*@see it.unimi.dsi.fastutil.objects.Object2ShortMaps#synchronize(it.unimi.dsi.fastutil.objects.Object2ShortMap<K>,java.lang.Object)
*<code>public static <K> it.unimi.dsi.fastutil.objects.Object2ShortMap<K> it.unimi.dsi.fastutil.objects.Object2ShortMaps.synchronize(it.unimi.dsi.fastutil.objects.Object2ShortMap<K>,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.objects.Object2ShortMap<K> p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K> it.unimi.dsi.fastutil.objects.Object2ShortMap<K> synchronize(it.unimi.dsi.fastutil.objects.Object2ShortMap<K> p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.objects.Object2ShortMaps.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.objects.Object2ShortSortedMaps#synchronize(it.unimi.dsi.fastutil.objects.Object2ShortSortedMap<K>,java.lang.Object)}
*@see it.unimi.dsi.fastutil.objects.Object2ShortSortedMaps#synchronize(it.unimi.dsi.fastutil.objects.Object2ShortSortedMap<K>,java.lang.Object)
*<code>public static <K> it.unimi.dsi.fastutil.objects.Object2ShortSortedMap<K> it.unimi.dsi.fastutil.objects.Object2ShortSortedMaps.synchronize(it.unimi.dsi.fastutil.objects.Object2ShortSortedMap<K>,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.objects.Object2ShortSortedMap<K> p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K> it.unimi.dsi.fastutil.objects.Object2ShortSortedMap<K> synchronize(it.unimi.dsi.fastutil.objects.Object2ShortSortedMap<K> p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.objects.Object2ShortSortedMaps.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.objects.ObjectBigLists#synchronize(it.unimi.dsi.fastutil.objects.ObjectBigList<K>,java.lang.Object)}
*@see it.unimi.dsi.fastutil.objects.ObjectBigLists#synchronize(it.unimi.dsi.fastutil.objects.ObjectBigList<K>,java.lang.Object)
*<code>public static <K> it.unimi.dsi.fastutil.objects.ObjectBigList<K> it.unimi.dsi.fastutil.objects.ObjectBigLists.synchronize(it.unimi.dsi.fastutil.objects.ObjectBigList<K>,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.objects.ObjectBigList<K> p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K> it.unimi.dsi.fastutil.objects.ObjectBigList<K> synchronize(it.unimi.dsi.fastutil.objects.ObjectBigList<K> p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.objects.ObjectBigLists.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.objects.ObjectCollections#synchronize(it.unimi.dsi.fastutil.objects.ObjectCollection<K>,java.lang.Object)}
*@see it.unimi.dsi.fastutil.objects.ObjectCollections#synchronize(it.unimi.dsi.fastutil.objects.ObjectCollection<K>,java.lang.Object)
*<code>public static <K> it.unimi.dsi.fastutil.objects.ObjectCollection<K> it.unimi.dsi.fastutil.objects.ObjectCollections.synchronize(it.unimi.dsi.fastutil.objects.ObjectCollection<K>,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.objects.ObjectCollection<K> p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K> it.unimi.dsi.fastutil.objects.ObjectCollection<K> synchronize(it.unimi.dsi.fastutil.objects.ObjectCollection<K> p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.objects.ObjectCollections.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.objects.ObjectLists#synchronize(it.unimi.dsi.fastutil.objects.ObjectList<K>,java.lang.Object)}
*@see it.unimi.dsi.fastutil.objects.ObjectLists#synchronize(it.unimi.dsi.fastutil.objects.ObjectList<K>,java.lang.Object)
*<code>public static <K> it.unimi.dsi.fastutil.objects.ObjectList<K> it.unimi.dsi.fastutil.objects.ObjectLists.synchronize(it.unimi.dsi.fastutil.objects.ObjectList<K>,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.objects.ObjectList<K> p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K> it.unimi.dsi.fastutil.objects.ObjectList<K> synchronize(it.unimi.dsi.fastutil.objects.ObjectList<K> p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.objects.ObjectLists.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.objects.ObjectSets#synchronize(it.unimi.dsi.fastutil.objects.ObjectSet<K>,java.lang.Object)}
*@see it.unimi.dsi.fastutil.objects.ObjectSets#synchronize(it.unimi.dsi.fastutil.objects.ObjectSet<K>,java.lang.Object)
*<code>public static <K> it.unimi.dsi.fastutil.objects.ObjectSet<K> it.unimi.dsi.fastutil.objects.ObjectSets.synchronize(it.unimi.dsi.fastutil.objects.ObjectSet<K>,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.objects.ObjectSet<K> p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K> it.unimi.dsi.fastutil.objects.ObjectSet<K> synchronize(it.unimi.dsi.fastutil.objects.ObjectSet<K> p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.objects.ObjectSets.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.objects.ObjectSortedSets#synchronize(it.unimi.dsi.fastutil.objects.ObjectSortedSet<K>,java.lang.Object)}
*@see it.unimi.dsi.fastutil.objects.ObjectSortedSets#synchronize(it.unimi.dsi.fastutil.objects.ObjectSortedSet<K>,java.lang.Object)
*<code>public static <K> it.unimi.dsi.fastutil.objects.ObjectSortedSet<K> it.unimi.dsi.fastutil.objects.ObjectSortedSets.synchronize(it.unimi.dsi.fastutil.objects.ObjectSortedSet<K>,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.objects.ObjectSortedSet<K> p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K> it.unimi.dsi.fastutil.objects.ObjectSortedSet<K> synchronize(it.unimi.dsi.fastutil.objects.ObjectSortedSet<K> p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.objects.ObjectSortedSets.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.objects.Reference2BooleanFunctions#synchronize(it.unimi.dsi.fastutil.objects.Reference2BooleanFunction<K>,java.lang.Object)}
*@see it.unimi.dsi.fastutil.objects.Reference2BooleanFunctions#synchronize(it.unimi.dsi.fastutil.objects.Reference2BooleanFunction<K>,java.lang.Object)
*<code>public static <K> it.unimi.dsi.fastutil.objects.Reference2BooleanFunction<K> it.unimi.dsi.fastutil.objects.Reference2BooleanFunctions.synchronize(it.unimi.dsi.fastutil.objects.Reference2BooleanFunction<K>,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.objects.Reference2BooleanFunction<K> p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K> it.unimi.dsi.fastutil.objects.Reference2BooleanFunction<K> synchronize(it.unimi.dsi.fastutil.objects.Reference2BooleanFunction<K> p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.objects.Reference2BooleanFunctions.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.objects.Reference2BooleanMaps#synchronize(it.unimi.dsi.fastutil.objects.Reference2BooleanMap<K>,java.lang.Object)}
*@see it.unimi.dsi.fastutil.objects.Reference2BooleanMaps#synchronize(it.unimi.dsi.fastutil.objects.Reference2BooleanMap<K>,java.lang.Object)
*<code>public static <K> it.unimi.dsi.fastutil.objects.Reference2BooleanMap<K> it.unimi.dsi.fastutil.objects.Reference2BooleanMaps.synchronize(it.unimi.dsi.fastutil.objects.Reference2BooleanMap<K>,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.objects.Reference2BooleanMap<K> p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K> it.unimi.dsi.fastutil.objects.Reference2BooleanMap<K> synchronize(it.unimi.dsi.fastutil.objects.Reference2BooleanMap<K> p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.objects.Reference2BooleanMaps.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.objects.Reference2BooleanSortedMaps#synchronize(it.unimi.dsi.fastutil.objects.Reference2BooleanSortedMap<K>,java.lang.Object)}
*@see it.unimi.dsi.fastutil.objects.Reference2BooleanSortedMaps#synchronize(it.unimi.dsi.fastutil.objects.Reference2BooleanSortedMap<K>,java.lang.Object)
*<code>public static <K> it.unimi.dsi.fastutil.objects.Reference2BooleanSortedMap<K> it.unimi.dsi.fastutil.objects.Reference2BooleanSortedMaps.synchronize(it.unimi.dsi.fastutil.objects.Reference2BooleanSortedMap<K>,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.objects.Reference2BooleanSortedMap<K> p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K> it.unimi.dsi.fastutil.objects.Reference2BooleanSortedMap<K> synchronize(it.unimi.dsi.fastutil.objects.Reference2BooleanSortedMap<K> p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.objects.Reference2BooleanSortedMaps.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.objects.Reference2ByteFunctions#synchronize(it.unimi.dsi.fastutil.objects.Reference2ByteFunction<K>,java.lang.Object)}
*@see it.unimi.dsi.fastutil.objects.Reference2ByteFunctions#synchronize(it.unimi.dsi.fastutil.objects.Reference2ByteFunction<K>,java.lang.Object)
*<code>public static <K> it.unimi.dsi.fastutil.objects.Reference2ByteFunction<K> it.unimi.dsi.fastutil.objects.Reference2ByteFunctions.synchronize(it.unimi.dsi.fastutil.objects.Reference2ByteFunction<K>,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.objects.Reference2ByteFunction<K> p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K> it.unimi.dsi.fastutil.objects.Reference2ByteFunction<K> synchronize(it.unimi.dsi.fastutil.objects.Reference2ByteFunction<K> p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.objects.Reference2ByteFunctions.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.objects.Reference2ByteMaps#synchronize(it.unimi.dsi.fastutil.objects.Reference2ByteMap<K>,java.lang.Object)}
*@see it.unimi.dsi.fastutil.objects.Reference2ByteMaps#synchronize(it.unimi.dsi.fastutil.objects.Reference2ByteMap<K>,java.lang.Object)
*<code>public static <K> it.unimi.dsi.fastutil.objects.Reference2ByteMap<K> it.unimi.dsi.fastutil.objects.Reference2ByteMaps.synchronize(it.unimi.dsi.fastutil.objects.Reference2ByteMap<K>,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.objects.Reference2ByteMap<K> p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K> it.unimi.dsi.fastutil.objects.Reference2ByteMap<K> synchronize(it.unimi.dsi.fastutil.objects.Reference2ByteMap<K> p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.objects.Reference2ByteMaps.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.objects.Reference2ByteSortedMaps#synchronize(it.unimi.dsi.fastutil.objects.Reference2ByteSortedMap<K>,java.lang.Object)}
*@see it.unimi.dsi.fastutil.objects.Reference2ByteSortedMaps#synchronize(it.unimi.dsi.fastutil.objects.Reference2ByteSortedMap<K>,java.lang.Object)
*<code>public static <K> it.unimi.dsi.fastutil.objects.Reference2ByteSortedMap<K> it.unimi.dsi.fastutil.objects.Reference2ByteSortedMaps.synchronize(it.unimi.dsi.fastutil.objects.Reference2ByteSortedMap<K>,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.objects.Reference2ByteSortedMap<K> p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K> it.unimi.dsi.fastutil.objects.Reference2ByteSortedMap<K> synchronize(it.unimi.dsi.fastutil.objects.Reference2ByteSortedMap<K> p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.objects.Reference2ByteSortedMaps.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.objects.Reference2CharFunctions#synchronize(it.unimi.dsi.fastutil.objects.Reference2CharFunction<K>,java.lang.Object)}
*@see it.unimi.dsi.fastutil.objects.Reference2CharFunctions#synchronize(it.unimi.dsi.fastutil.objects.Reference2CharFunction<K>,java.lang.Object)
*<code>public static <K> it.unimi.dsi.fastutil.objects.Reference2CharFunction<K> it.unimi.dsi.fastutil.objects.Reference2CharFunctions.synchronize(it.unimi.dsi.fastutil.objects.Reference2CharFunction<K>,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.objects.Reference2CharFunction<K> p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K> it.unimi.dsi.fastutil.objects.Reference2CharFunction<K> synchronize(it.unimi.dsi.fastutil.objects.Reference2CharFunction<K> p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.objects.Reference2CharFunctions.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.objects.Reference2CharMaps#synchronize(it.unimi.dsi.fastutil.objects.Reference2CharMap<K>,java.lang.Object)}
*@see it.unimi.dsi.fastutil.objects.Reference2CharMaps#synchronize(it.unimi.dsi.fastutil.objects.Reference2CharMap<K>,java.lang.Object)
*<code>public static <K> it.unimi.dsi.fastutil.objects.Reference2CharMap<K> it.unimi.dsi.fastutil.objects.Reference2CharMaps.synchronize(it.unimi.dsi.fastutil.objects.Reference2CharMap<K>,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.objects.Reference2CharMap<K> p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K> it.unimi.dsi.fastutil.objects.Reference2CharMap<K> synchronize(it.unimi.dsi.fastutil.objects.Reference2CharMap<K> p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.objects.Reference2CharMaps.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.objects.Reference2CharSortedMaps#synchronize(it.unimi.dsi.fastutil.objects.Reference2CharSortedMap<K>,java.lang.Object)}
*@see it.unimi.dsi.fastutil.objects.Reference2CharSortedMaps#synchronize(it.unimi.dsi.fastutil.objects.Reference2CharSortedMap<K>,java.lang.Object)
*<code>public static <K> it.unimi.dsi.fastutil.objects.Reference2CharSortedMap<K> it.unimi.dsi.fastutil.objects.Reference2CharSortedMaps.synchronize(it.unimi.dsi.fastutil.objects.Reference2CharSortedMap<K>,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.objects.Reference2CharSortedMap<K> p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K> it.unimi.dsi.fastutil.objects.Reference2CharSortedMap<K> synchronize(it.unimi.dsi.fastutil.objects.Reference2CharSortedMap<K> p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.objects.Reference2CharSortedMaps.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.objects.Reference2DoubleFunctions#synchronize(it.unimi.dsi.fastutil.objects.Reference2DoubleFunction<K>,java.lang.Object)}
*@see it.unimi.dsi.fastutil.objects.Reference2DoubleFunctions#synchronize(it.unimi.dsi.fastutil.objects.Reference2DoubleFunction<K>,java.lang.Object)
*<code>public static <K> it.unimi.dsi.fastutil.objects.Reference2DoubleFunction<K> it.unimi.dsi.fastutil.objects.Reference2DoubleFunctions.synchronize(it.unimi.dsi.fastutil.objects.Reference2DoubleFunction<K>,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.objects.Reference2DoubleFunction<K> p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K> it.unimi.dsi.fastutil.objects.Reference2DoubleFunction<K> synchronize(it.unimi.dsi.fastutil.objects.Reference2DoubleFunction<K> p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.objects.Reference2DoubleFunctions.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.objects.Reference2DoubleMaps#synchronize(it.unimi.dsi.fastutil.objects.Reference2DoubleMap<K>,java.lang.Object)}
*@see it.unimi.dsi.fastutil.objects.Reference2DoubleMaps#synchronize(it.unimi.dsi.fastutil.objects.Reference2DoubleMap<K>,java.lang.Object)
*<code>public static <K> it.unimi.dsi.fastutil.objects.Reference2DoubleMap<K> it.unimi.dsi.fastutil.objects.Reference2DoubleMaps.synchronize(it.unimi.dsi.fastutil.objects.Reference2DoubleMap<K>,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.objects.Reference2DoubleMap<K> p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K> it.unimi.dsi.fastutil.objects.Reference2DoubleMap<K> synchronize(it.unimi.dsi.fastutil.objects.Reference2DoubleMap<K> p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.objects.Reference2DoubleMaps.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.objects.Reference2DoubleSortedMaps#synchronize(it.unimi.dsi.fastutil.objects.Reference2DoubleSortedMap<K>,java.lang.Object)}
*@see it.unimi.dsi.fastutil.objects.Reference2DoubleSortedMaps#synchronize(it.unimi.dsi.fastutil.objects.Reference2DoubleSortedMap<K>,java.lang.Object)
*<code>public static <K> it.unimi.dsi.fastutil.objects.Reference2DoubleSortedMap<K> it.unimi.dsi.fastutil.objects.Reference2DoubleSortedMaps.synchronize(it.unimi.dsi.fastutil.objects.Reference2DoubleSortedMap<K>,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.objects.Reference2DoubleSortedMap<K> p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K> it.unimi.dsi.fastutil.objects.Reference2DoubleSortedMap<K> synchronize(it.unimi.dsi.fastutil.objects.Reference2DoubleSortedMap<K> p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.objects.Reference2DoubleSortedMaps.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.objects.Reference2FloatFunctions#synchronize(it.unimi.dsi.fastutil.objects.Reference2FloatFunction<K>,java.lang.Object)}
*@see it.unimi.dsi.fastutil.objects.Reference2FloatFunctions#synchronize(it.unimi.dsi.fastutil.objects.Reference2FloatFunction<K>,java.lang.Object)
*<code>public static <K> it.unimi.dsi.fastutil.objects.Reference2FloatFunction<K> it.unimi.dsi.fastutil.objects.Reference2FloatFunctions.synchronize(it.unimi.dsi.fastutil.objects.Reference2FloatFunction<K>,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.objects.Reference2FloatFunction<K> p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K> it.unimi.dsi.fastutil.objects.Reference2FloatFunction<K> synchronize(it.unimi.dsi.fastutil.objects.Reference2FloatFunction<K> p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.objects.Reference2FloatFunctions.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.objects.Reference2FloatMaps#synchronize(it.unimi.dsi.fastutil.objects.Reference2FloatMap<K>,java.lang.Object)}
*@see it.unimi.dsi.fastutil.objects.Reference2FloatMaps#synchronize(it.unimi.dsi.fastutil.objects.Reference2FloatMap<K>,java.lang.Object)
*<code>public static <K> it.unimi.dsi.fastutil.objects.Reference2FloatMap<K> it.unimi.dsi.fastutil.objects.Reference2FloatMaps.synchronize(it.unimi.dsi.fastutil.objects.Reference2FloatMap<K>,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.objects.Reference2FloatMap<K> p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K> it.unimi.dsi.fastutil.objects.Reference2FloatMap<K> synchronize(it.unimi.dsi.fastutil.objects.Reference2FloatMap<K> p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.objects.Reference2FloatMaps.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.objects.Reference2FloatSortedMaps#synchronize(it.unimi.dsi.fastutil.objects.Reference2FloatSortedMap<K>,java.lang.Object)}
*@see it.unimi.dsi.fastutil.objects.Reference2FloatSortedMaps#synchronize(it.unimi.dsi.fastutil.objects.Reference2FloatSortedMap<K>,java.lang.Object)
*<code>public static <K> it.unimi.dsi.fastutil.objects.Reference2FloatSortedMap<K> it.unimi.dsi.fastutil.objects.Reference2FloatSortedMaps.synchronize(it.unimi.dsi.fastutil.objects.Reference2FloatSortedMap<K>,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.objects.Reference2FloatSortedMap<K> p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K> it.unimi.dsi.fastutil.objects.Reference2FloatSortedMap<K> synchronize(it.unimi.dsi.fastutil.objects.Reference2FloatSortedMap<K> p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.objects.Reference2FloatSortedMaps.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.objects.Reference2IntFunctions#synchronize(it.unimi.dsi.fastutil.objects.Reference2IntFunction<K>,java.lang.Object)}
*@see it.unimi.dsi.fastutil.objects.Reference2IntFunctions#synchronize(it.unimi.dsi.fastutil.objects.Reference2IntFunction<K>,java.lang.Object)
*<code>public static <K> it.unimi.dsi.fastutil.objects.Reference2IntFunction<K> it.unimi.dsi.fastutil.objects.Reference2IntFunctions.synchronize(it.unimi.dsi.fastutil.objects.Reference2IntFunction<K>,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.objects.Reference2IntFunction<K> p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K> it.unimi.dsi.fastutil.objects.Reference2IntFunction<K> synchronize(it.unimi.dsi.fastutil.objects.Reference2IntFunction<K> p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.objects.Reference2IntFunctions.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.objects.Reference2IntMaps#synchronize(it.unimi.dsi.fastutil.objects.Reference2IntMap<K>,java.lang.Object)}
*@see it.unimi.dsi.fastutil.objects.Reference2IntMaps#synchronize(it.unimi.dsi.fastutil.objects.Reference2IntMap<K>,java.lang.Object)
*<code>public static <K> it.unimi.dsi.fastutil.objects.Reference2IntMap<K> it.unimi.dsi.fastutil.objects.Reference2IntMaps.synchronize(it.unimi.dsi.fastutil.objects.Reference2IntMap<K>,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.objects.Reference2IntMap<K> p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K> it.unimi.dsi.fastutil.objects.Reference2IntMap<K> synchronize(it.unimi.dsi.fastutil.objects.Reference2IntMap<K> p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.objects.Reference2IntMaps.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.objects.Reference2IntSortedMaps#synchronize(it.unimi.dsi.fastutil.objects.Reference2IntSortedMap<K>,java.lang.Object)}
*@see it.unimi.dsi.fastutil.objects.Reference2IntSortedMaps#synchronize(it.unimi.dsi.fastutil.objects.Reference2IntSortedMap<K>,java.lang.Object)
*<code>public static <K> it.unimi.dsi.fastutil.objects.Reference2IntSortedMap<K> it.unimi.dsi.fastutil.objects.Reference2IntSortedMaps.synchronize(it.unimi.dsi.fastutil.objects.Reference2IntSortedMap<K>,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.objects.Reference2IntSortedMap<K> p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K> it.unimi.dsi.fastutil.objects.Reference2IntSortedMap<K> synchronize(it.unimi.dsi.fastutil.objects.Reference2IntSortedMap<K> p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.objects.Reference2IntSortedMaps.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.objects.Reference2LongFunctions#synchronize(it.unimi.dsi.fastutil.objects.Reference2LongFunction<K>,java.lang.Object)}
*@see it.unimi.dsi.fastutil.objects.Reference2LongFunctions#synchronize(it.unimi.dsi.fastutil.objects.Reference2LongFunction<K>,java.lang.Object)
*<code>public static <K> it.unimi.dsi.fastutil.objects.Reference2LongFunction<K> it.unimi.dsi.fastutil.objects.Reference2LongFunctions.synchronize(it.unimi.dsi.fastutil.objects.Reference2LongFunction<K>,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.objects.Reference2LongFunction<K> p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K> it.unimi.dsi.fastutil.objects.Reference2LongFunction<K> synchronize(it.unimi.dsi.fastutil.objects.Reference2LongFunction<K> p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.objects.Reference2LongFunctions.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.objects.Reference2LongMaps#synchronize(it.unimi.dsi.fastutil.objects.Reference2LongMap<K>,java.lang.Object)}
*@see it.unimi.dsi.fastutil.objects.Reference2LongMaps#synchronize(it.unimi.dsi.fastutil.objects.Reference2LongMap<K>,java.lang.Object)
*<code>public static <K> it.unimi.dsi.fastutil.objects.Reference2LongMap<K> it.unimi.dsi.fastutil.objects.Reference2LongMaps.synchronize(it.unimi.dsi.fastutil.objects.Reference2LongMap<K>,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.objects.Reference2LongMap<K> p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K> it.unimi.dsi.fastutil.objects.Reference2LongMap<K> synchronize(it.unimi.dsi.fastutil.objects.Reference2LongMap<K> p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.objects.Reference2LongMaps.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.objects.Reference2LongSortedMaps#synchronize(it.unimi.dsi.fastutil.objects.Reference2LongSortedMap<K>,java.lang.Object)}
*@see it.unimi.dsi.fastutil.objects.Reference2LongSortedMaps#synchronize(it.unimi.dsi.fastutil.objects.Reference2LongSortedMap<K>,java.lang.Object)
*<code>public static <K> it.unimi.dsi.fastutil.objects.Reference2LongSortedMap<K> it.unimi.dsi.fastutil.objects.Reference2LongSortedMaps.synchronize(it.unimi.dsi.fastutil.objects.Reference2LongSortedMap<K>,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.objects.Reference2LongSortedMap<K> p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K> it.unimi.dsi.fastutil.objects.Reference2LongSortedMap<K> synchronize(it.unimi.dsi.fastutil.objects.Reference2LongSortedMap<K> p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.objects.Reference2LongSortedMaps.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.objects.Reference2ObjectFunctions#synchronize(it.unimi.dsi.fastutil.objects.Reference2ObjectFunction<K, V>,java.lang.Object)}
*@see it.unimi.dsi.fastutil.objects.Reference2ObjectFunctions#synchronize(it.unimi.dsi.fastutil.objects.Reference2ObjectFunction<K, V>,java.lang.Object)
*<code>public static <K,V> it.unimi.dsi.fastutil.objects.Reference2ObjectFunction<K, V> it.unimi.dsi.fastutil.objects.Reference2ObjectFunctions.synchronize(it.unimi.dsi.fastutil.objects.Reference2ObjectFunction<K, V>,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.objects.Reference2ObjectFunction<K, V> p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K,V> it.unimi.dsi.fastutil.objects.Reference2ObjectFunction<K, V> synchronize(it.unimi.dsi.fastutil.objects.Reference2ObjectFunction<K, V> p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.objects.Reference2ObjectFunctions.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.objects.Reference2ObjectMaps#synchronize(it.unimi.dsi.fastutil.objects.Reference2ObjectMap<K, V>,java.lang.Object)}
*@see it.unimi.dsi.fastutil.objects.Reference2ObjectMaps#synchronize(it.unimi.dsi.fastutil.objects.Reference2ObjectMap<K, V>,java.lang.Object)
*<code>public static <K,V> it.unimi.dsi.fastutil.objects.Reference2ObjectMap<K, V> it.unimi.dsi.fastutil.objects.Reference2ObjectMaps.synchronize(it.unimi.dsi.fastutil.objects.Reference2ObjectMap<K, V>,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.objects.Reference2ObjectMap<K, V> p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K,V> it.unimi.dsi.fastutil.objects.Reference2ObjectMap<K, V> synchronize(it.unimi.dsi.fastutil.objects.Reference2ObjectMap<K, V> p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.objects.Reference2ObjectMaps.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.objects.Reference2ObjectSortedMaps#synchronize(it.unimi.dsi.fastutil.objects.Reference2ObjectSortedMap<K, V>,java.lang.Object)}
*@see it.unimi.dsi.fastutil.objects.Reference2ObjectSortedMaps#synchronize(it.unimi.dsi.fastutil.objects.Reference2ObjectSortedMap<K, V>,java.lang.Object)
*<code>public static <K,V> it.unimi.dsi.fastutil.objects.Reference2ObjectSortedMap<K, V> it.unimi.dsi.fastutil.objects.Reference2ObjectSortedMaps.synchronize(it.unimi.dsi.fastutil.objects.Reference2ObjectSortedMap<K, V>,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.objects.Reference2ObjectSortedMap<K, V> p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K,V> it.unimi.dsi.fastutil.objects.Reference2ObjectSortedMap<K, V> synchronize(it.unimi.dsi.fastutil.objects.Reference2ObjectSortedMap<K, V> p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.objects.Reference2ObjectSortedMaps.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.objects.Reference2ReferenceFunctions#synchronize(it.unimi.dsi.fastutil.objects.Reference2ReferenceFunction<K, V>,java.lang.Object)}
*@see it.unimi.dsi.fastutil.objects.Reference2ReferenceFunctions#synchronize(it.unimi.dsi.fastutil.objects.Reference2ReferenceFunction<K, V>,java.lang.Object)
*<code>public static <K,V> it.unimi.dsi.fastutil.objects.Reference2ReferenceFunction<K, V> it.unimi.dsi.fastutil.objects.Reference2ReferenceFunctions.synchronize(it.unimi.dsi.fastutil.objects.Reference2ReferenceFunction<K, V>,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.objects.Reference2ReferenceFunction<K, V> p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K,V> it.unimi.dsi.fastutil.objects.Reference2ReferenceFunction<K, V> synchronize(it.unimi.dsi.fastutil.objects.Reference2ReferenceFunction<K, V> p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.objects.Reference2ReferenceFunctions.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.objects.Reference2ReferenceMaps#synchronize(it.unimi.dsi.fastutil.objects.Reference2ReferenceMap<K, V>,java.lang.Object)}
*@see it.unimi.dsi.fastutil.objects.Reference2ReferenceMaps#synchronize(it.unimi.dsi.fastutil.objects.Reference2ReferenceMap<K, V>,java.lang.Object)
*<code>public static <K,V> it.unimi.dsi.fastutil.objects.Reference2ReferenceMap<K, V> it.unimi.dsi.fastutil.objects.Reference2ReferenceMaps.synchronize(it.unimi.dsi.fastutil.objects.Reference2ReferenceMap<K, V>,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.objects.Reference2ReferenceMap<K, V> p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K,V> it.unimi.dsi.fastutil.objects.Reference2ReferenceMap<K, V> synchronize(it.unimi.dsi.fastutil.objects.Reference2ReferenceMap<K, V> p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.objects.Reference2ReferenceMaps.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.objects.Reference2ReferenceSortedMaps#synchronize(it.unimi.dsi.fastutil.objects.Reference2ReferenceSortedMap<K, V>,java.lang.Object)}
*@see it.unimi.dsi.fastutil.objects.Reference2ReferenceSortedMaps#synchronize(it.unimi.dsi.fastutil.objects.Reference2ReferenceSortedMap<K, V>,java.lang.Object)
*<code>public static <K,V> it.unimi.dsi.fastutil.objects.Reference2ReferenceSortedMap<K, V> it.unimi.dsi.fastutil.objects.Reference2ReferenceSortedMaps.synchronize(it.unimi.dsi.fastutil.objects.Reference2ReferenceSortedMap<K, V>,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.objects.Reference2ReferenceSortedMap<K, V> p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K,V> it.unimi.dsi.fastutil.objects.Reference2ReferenceSortedMap<K, V> synchronize(it.unimi.dsi.fastutil.objects.Reference2ReferenceSortedMap<K, V> p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.objects.Reference2ReferenceSortedMaps.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.objects.Reference2ShortFunctions#synchronize(it.unimi.dsi.fastutil.objects.Reference2ShortFunction<K>,java.lang.Object)}
*@see it.unimi.dsi.fastutil.objects.Reference2ShortFunctions#synchronize(it.unimi.dsi.fastutil.objects.Reference2ShortFunction<K>,java.lang.Object)
*<code>public static <K> it.unimi.dsi.fastutil.objects.Reference2ShortFunction<K> it.unimi.dsi.fastutil.objects.Reference2ShortFunctions.synchronize(it.unimi.dsi.fastutil.objects.Reference2ShortFunction<K>,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.objects.Reference2ShortFunction<K> p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K> it.unimi.dsi.fastutil.objects.Reference2ShortFunction<K> synchronize(it.unimi.dsi.fastutil.objects.Reference2ShortFunction<K> p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.objects.Reference2ShortFunctions.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.objects.Reference2ShortMaps#synchronize(it.unimi.dsi.fastutil.objects.Reference2ShortMap<K>,java.lang.Object)}
*@see it.unimi.dsi.fastutil.objects.Reference2ShortMaps#synchronize(it.unimi.dsi.fastutil.objects.Reference2ShortMap<K>,java.lang.Object)
*<code>public static <K> it.unimi.dsi.fastutil.objects.Reference2ShortMap<K> it.unimi.dsi.fastutil.objects.Reference2ShortMaps.synchronize(it.unimi.dsi.fastutil.objects.Reference2ShortMap<K>,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.objects.Reference2ShortMap<K> p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K> it.unimi.dsi.fastutil.objects.Reference2ShortMap<K> synchronize(it.unimi.dsi.fastutil.objects.Reference2ShortMap<K> p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.objects.Reference2ShortMaps.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.objects.Reference2ShortSortedMaps#synchronize(it.unimi.dsi.fastutil.objects.Reference2ShortSortedMap<K>,java.lang.Object)}
*@see it.unimi.dsi.fastutil.objects.Reference2ShortSortedMaps#synchronize(it.unimi.dsi.fastutil.objects.Reference2ShortSortedMap<K>,java.lang.Object)
*<code>public static <K> it.unimi.dsi.fastutil.objects.Reference2ShortSortedMap<K> it.unimi.dsi.fastutil.objects.Reference2ShortSortedMaps.synchronize(it.unimi.dsi.fastutil.objects.Reference2ShortSortedMap<K>,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.objects.Reference2ShortSortedMap<K> p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K> it.unimi.dsi.fastutil.objects.Reference2ShortSortedMap<K> synchronize(it.unimi.dsi.fastutil.objects.Reference2ShortSortedMap<K> p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.objects.Reference2ShortSortedMaps.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.objects.ReferenceBigLists#synchronize(it.unimi.dsi.fastutil.objects.ReferenceBigList<K>,java.lang.Object)}
*@see it.unimi.dsi.fastutil.objects.ReferenceBigLists#synchronize(it.unimi.dsi.fastutil.objects.ReferenceBigList<K>,java.lang.Object)
*<code>public static <K> it.unimi.dsi.fastutil.objects.ReferenceBigList<K> it.unimi.dsi.fastutil.objects.ReferenceBigLists.synchronize(it.unimi.dsi.fastutil.objects.ReferenceBigList<K>,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.objects.ReferenceBigList<K> p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K> it.unimi.dsi.fastutil.objects.ReferenceBigList<K> synchronize(it.unimi.dsi.fastutil.objects.ReferenceBigList<K> p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.objects.ReferenceBigLists.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.objects.ReferenceCollections#synchronize(it.unimi.dsi.fastutil.objects.ReferenceCollection<K>,java.lang.Object)}
*@see it.unimi.dsi.fastutil.objects.ReferenceCollections#synchronize(it.unimi.dsi.fastutil.objects.ReferenceCollection<K>,java.lang.Object)
*<code>public static <K> it.unimi.dsi.fastutil.objects.ReferenceCollection<K> it.unimi.dsi.fastutil.objects.ReferenceCollections.synchronize(it.unimi.dsi.fastutil.objects.ReferenceCollection<K>,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.objects.ReferenceCollection<K> p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K> it.unimi.dsi.fastutil.objects.ReferenceCollection<K> synchronize(it.unimi.dsi.fastutil.objects.ReferenceCollection<K> p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.objects.ReferenceCollections.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.objects.ReferenceLists#synchronize(it.unimi.dsi.fastutil.objects.ReferenceList<K>,java.lang.Object)}
*@see it.unimi.dsi.fastutil.objects.ReferenceLists#synchronize(it.unimi.dsi.fastutil.objects.ReferenceList<K>,java.lang.Object)
*<code>public static <K> it.unimi.dsi.fastutil.objects.ReferenceList<K> it.unimi.dsi.fastutil.objects.ReferenceLists.synchronize(it.unimi.dsi.fastutil.objects.ReferenceList<K>,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.objects.ReferenceList<K> p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K> it.unimi.dsi.fastutil.objects.ReferenceList<K> synchronize(it.unimi.dsi.fastutil.objects.ReferenceList<K> p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.objects.ReferenceLists.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.objects.ReferenceSets#synchronize(it.unimi.dsi.fastutil.objects.ReferenceSet<K>,java.lang.Object)}
*@see it.unimi.dsi.fastutil.objects.ReferenceSets#synchronize(it.unimi.dsi.fastutil.objects.ReferenceSet<K>,java.lang.Object)
*<code>public static <K> it.unimi.dsi.fastutil.objects.ReferenceSet<K> it.unimi.dsi.fastutil.objects.ReferenceSets.synchronize(it.unimi.dsi.fastutil.objects.ReferenceSet<K>,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.objects.ReferenceSet<K> p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K> it.unimi.dsi.fastutil.objects.ReferenceSet<K> synchronize(it.unimi.dsi.fastutil.objects.ReferenceSet<K> p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.objects.ReferenceSets.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.objects.ReferenceSortedSets#synchronize(it.unimi.dsi.fastutil.objects.ReferenceSortedSet<K>,java.lang.Object)}
*@see it.unimi.dsi.fastutil.objects.ReferenceSortedSets#synchronize(it.unimi.dsi.fastutil.objects.ReferenceSortedSet<K>,java.lang.Object)
*<code>public static <K> it.unimi.dsi.fastutil.objects.ReferenceSortedSet<K> it.unimi.dsi.fastutil.objects.ReferenceSortedSets.synchronize(it.unimi.dsi.fastutil.objects.ReferenceSortedSet<K>,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.objects.ReferenceSortedSet<K> p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K> it.unimi.dsi.fastutil.objects.ReferenceSortedSet<K> synchronize(it.unimi.dsi.fastutil.objects.ReferenceSortedSet<K> p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.objects.ReferenceSortedSets.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.shorts.Short2BooleanFunctions#synchronize(it.unimi.dsi.fastutil.shorts.Short2BooleanFunction,java.lang.Object)}
*@see it.unimi.dsi.fastutil.shorts.Short2BooleanFunctions#synchronize(it.unimi.dsi.fastutil.shorts.Short2BooleanFunction,java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.shorts.Short2BooleanFunction it.unimi.dsi.fastutil.shorts.Short2BooleanFunctions.synchronize(it.unimi.dsi.fastutil.shorts.Short2BooleanFunction,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.shorts.Short2BooleanFunction p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.shorts.Short2BooleanFunction synchronize(it.unimi.dsi.fastutil.shorts.Short2BooleanFunction p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.shorts.Short2BooleanFunctions.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.shorts.Short2BooleanMaps#synchronize(it.unimi.dsi.fastutil.shorts.Short2BooleanMap,java.lang.Object)}
*@see it.unimi.dsi.fastutil.shorts.Short2BooleanMaps#synchronize(it.unimi.dsi.fastutil.shorts.Short2BooleanMap,java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.shorts.Short2BooleanMap it.unimi.dsi.fastutil.shorts.Short2BooleanMaps.synchronize(it.unimi.dsi.fastutil.shorts.Short2BooleanMap,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.shorts.Short2BooleanMap p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.shorts.Short2BooleanMap synchronize(it.unimi.dsi.fastutil.shorts.Short2BooleanMap p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.shorts.Short2BooleanMaps.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.shorts.Short2BooleanSortedMaps#synchronize(it.unimi.dsi.fastutil.shorts.Short2BooleanSortedMap,java.lang.Object)}
*@see it.unimi.dsi.fastutil.shorts.Short2BooleanSortedMaps#synchronize(it.unimi.dsi.fastutil.shorts.Short2BooleanSortedMap,java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.shorts.Short2BooleanSortedMap it.unimi.dsi.fastutil.shorts.Short2BooleanSortedMaps.synchronize(it.unimi.dsi.fastutil.shorts.Short2BooleanSortedMap,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.shorts.Short2BooleanSortedMap p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.shorts.Short2BooleanSortedMap synchronize(it.unimi.dsi.fastutil.shorts.Short2BooleanSortedMap p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.shorts.Short2BooleanSortedMaps.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.shorts.Short2ByteFunctions#synchronize(it.unimi.dsi.fastutil.shorts.Short2ByteFunction,java.lang.Object)}
*@see it.unimi.dsi.fastutil.shorts.Short2ByteFunctions#synchronize(it.unimi.dsi.fastutil.shorts.Short2ByteFunction,java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.shorts.Short2ByteFunction it.unimi.dsi.fastutil.shorts.Short2ByteFunctions.synchronize(it.unimi.dsi.fastutil.shorts.Short2ByteFunction,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.shorts.Short2ByteFunction p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.shorts.Short2ByteFunction synchronize(it.unimi.dsi.fastutil.shorts.Short2ByteFunction p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.shorts.Short2ByteFunctions.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.shorts.Short2ByteMaps#synchronize(it.unimi.dsi.fastutil.shorts.Short2ByteMap,java.lang.Object)}
*@see it.unimi.dsi.fastutil.shorts.Short2ByteMaps#synchronize(it.unimi.dsi.fastutil.shorts.Short2ByteMap,java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.shorts.Short2ByteMap it.unimi.dsi.fastutil.shorts.Short2ByteMaps.synchronize(it.unimi.dsi.fastutil.shorts.Short2ByteMap,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.shorts.Short2ByteMap p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.shorts.Short2ByteMap synchronize(it.unimi.dsi.fastutil.shorts.Short2ByteMap p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.shorts.Short2ByteMaps.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.shorts.Short2ByteSortedMaps#synchronize(it.unimi.dsi.fastutil.shorts.Short2ByteSortedMap,java.lang.Object)}
*@see it.unimi.dsi.fastutil.shorts.Short2ByteSortedMaps#synchronize(it.unimi.dsi.fastutil.shorts.Short2ByteSortedMap,java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.shorts.Short2ByteSortedMap it.unimi.dsi.fastutil.shorts.Short2ByteSortedMaps.synchronize(it.unimi.dsi.fastutil.shorts.Short2ByteSortedMap,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.shorts.Short2ByteSortedMap p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.shorts.Short2ByteSortedMap synchronize(it.unimi.dsi.fastutil.shorts.Short2ByteSortedMap p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.shorts.Short2ByteSortedMaps.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.shorts.Short2CharFunctions#synchronize(it.unimi.dsi.fastutil.shorts.Short2CharFunction,java.lang.Object)}
*@see it.unimi.dsi.fastutil.shorts.Short2CharFunctions#synchronize(it.unimi.dsi.fastutil.shorts.Short2CharFunction,java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.shorts.Short2CharFunction it.unimi.dsi.fastutil.shorts.Short2CharFunctions.synchronize(it.unimi.dsi.fastutil.shorts.Short2CharFunction,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.shorts.Short2CharFunction p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.shorts.Short2CharFunction synchronize(it.unimi.dsi.fastutil.shorts.Short2CharFunction p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.shorts.Short2CharFunctions.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.shorts.Short2CharMaps#synchronize(it.unimi.dsi.fastutil.shorts.Short2CharMap,java.lang.Object)}
*@see it.unimi.dsi.fastutil.shorts.Short2CharMaps#synchronize(it.unimi.dsi.fastutil.shorts.Short2CharMap,java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.shorts.Short2CharMap it.unimi.dsi.fastutil.shorts.Short2CharMaps.synchronize(it.unimi.dsi.fastutil.shorts.Short2CharMap,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.shorts.Short2CharMap p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.shorts.Short2CharMap synchronize(it.unimi.dsi.fastutil.shorts.Short2CharMap p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.shorts.Short2CharMaps.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.shorts.Short2CharSortedMaps#synchronize(it.unimi.dsi.fastutil.shorts.Short2CharSortedMap,java.lang.Object)}
*@see it.unimi.dsi.fastutil.shorts.Short2CharSortedMaps#synchronize(it.unimi.dsi.fastutil.shorts.Short2CharSortedMap,java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.shorts.Short2CharSortedMap it.unimi.dsi.fastutil.shorts.Short2CharSortedMaps.synchronize(it.unimi.dsi.fastutil.shorts.Short2CharSortedMap,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.shorts.Short2CharSortedMap p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.shorts.Short2CharSortedMap synchronize(it.unimi.dsi.fastutil.shorts.Short2CharSortedMap p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.shorts.Short2CharSortedMaps.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.shorts.Short2DoubleFunctions#synchronize(it.unimi.dsi.fastutil.shorts.Short2DoubleFunction,java.lang.Object)}
*@see it.unimi.dsi.fastutil.shorts.Short2DoubleFunctions#synchronize(it.unimi.dsi.fastutil.shorts.Short2DoubleFunction,java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.shorts.Short2DoubleFunction it.unimi.dsi.fastutil.shorts.Short2DoubleFunctions.synchronize(it.unimi.dsi.fastutil.shorts.Short2DoubleFunction,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.shorts.Short2DoubleFunction p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.shorts.Short2DoubleFunction synchronize(it.unimi.dsi.fastutil.shorts.Short2DoubleFunction p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.shorts.Short2DoubleFunctions.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.shorts.Short2DoubleMaps#synchronize(it.unimi.dsi.fastutil.shorts.Short2DoubleMap,java.lang.Object)}
*@see it.unimi.dsi.fastutil.shorts.Short2DoubleMaps#synchronize(it.unimi.dsi.fastutil.shorts.Short2DoubleMap,java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.shorts.Short2DoubleMap it.unimi.dsi.fastutil.shorts.Short2DoubleMaps.synchronize(it.unimi.dsi.fastutil.shorts.Short2DoubleMap,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.shorts.Short2DoubleMap p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.shorts.Short2DoubleMap synchronize(it.unimi.dsi.fastutil.shorts.Short2DoubleMap p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.shorts.Short2DoubleMaps.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.shorts.Short2DoubleSortedMaps#synchronize(it.unimi.dsi.fastutil.shorts.Short2DoubleSortedMap,java.lang.Object)}
*@see it.unimi.dsi.fastutil.shorts.Short2DoubleSortedMaps#synchronize(it.unimi.dsi.fastutil.shorts.Short2DoubleSortedMap,java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.shorts.Short2DoubleSortedMap it.unimi.dsi.fastutil.shorts.Short2DoubleSortedMaps.synchronize(it.unimi.dsi.fastutil.shorts.Short2DoubleSortedMap,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.shorts.Short2DoubleSortedMap p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.shorts.Short2DoubleSortedMap synchronize(it.unimi.dsi.fastutil.shorts.Short2DoubleSortedMap p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.shorts.Short2DoubleSortedMaps.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.shorts.Short2FloatFunctions#synchronize(it.unimi.dsi.fastutil.shorts.Short2FloatFunction,java.lang.Object)}
*@see it.unimi.dsi.fastutil.shorts.Short2FloatFunctions#synchronize(it.unimi.dsi.fastutil.shorts.Short2FloatFunction,java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.shorts.Short2FloatFunction it.unimi.dsi.fastutil.shorts.Short2FloatFunctions.synchronize(it.unimi.dsi.fastutil.shorts.Short2FloatFunction,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.shorts.Short2FloatFunction p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.shorts.Short2FloatFunction synchronize(it.unimi.dsi.fastutil.shorts.Short2FloatFunction p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.shorts.Short2FloatFunctions.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.shorts.Short2FloatMaps#synchronize(it.unimi.dsi.fastutil.shorts.Short2FloatMap,java.lang.Object)}
*@see it.unimi.dsi.fastutil.shorts.Short2FloatMaps#synchronize(it.unimi.dsi.fastutil.shorts.Short2FloatMap,java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.shorts.Short2FloatMap it.unimi.dsi.fastutil.shorts.Short2FloatMaps.synchronize(it.unimi.dsi.fastutil.shorts.Short2FloatMap,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.shorts.Short2FloatMap p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.shorts.Short2FloatMap synchronize(it.unimi.dsi.fastutil.shorts.Short2FloatMap p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.shorts.Short2FloatMaps.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.shorts.Short2FloatSortedMaps#synchronize(it.unimi.dsi.fastutil.shorts.Short2FloatSortedMap,java.lang.Object)}
*@see it.unimi.dsi.fastutil.shorts.Short2FloatSortedMaps#synchronize(it.unimi.dsi.fastutil.shorts.Short2FloatSortedMap,java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.shorts.Short2FloatSortedMap it.unimi.dsi.fastutil.shorts.Short2FloatSortedMaps.synchronize(it.unimi.dsi.fastutil.shorts.Short2FloatSortedMap,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.shorts.Short2FloatSortedMap p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.shorts.Short2FloatSortedMap synchronize(it.unimi.dsi.fastutil.shorts.Short2FloatSortedMap p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.shorts.Short2FloatSortedMaps.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.shorts.Short2IntFunctions#synchronize(it.unimi.dsi.fastutil.shorts.Short2IntFunction,java.lang.Object)}
*@see it.unimi.dsi.fastutil.shorts.Short2IntFunctions#synchronize(it.unimi.dsi.fastutil.shorts.Short2IntFunction,java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.shorts.Short2IntFunction it.unimi.dsi.fastutil.shorts.Short2IntFunctions.synchronize(it.unimi.dsi.fastutil.shorts.Short2IntFunction,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.shorts.Short2IntFunction p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.shorts.Short2IntFunction synchronize(it.unimi.dsi.fastutil.shorts.Short2IntFunction p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.shorts.Short2IntFunctions.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.shorts.Short2IntMaps#synchronize(it.unimi.dsi.fastutil.shorts.Short2IntMap,java.lang.Object)}
*@see it.unimi.dsi.fastutil.shorts.Short2IntMaps#synchronize(it.unimi.dsi.fastutil.shorts.Short2IntMap,java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.shorts.Short2IntMap it.unimi.dsi.fastutil.shorts.Short2IntMaps.synchronize(it.unimi.dsi.fastutil.shorts.Short2IntMap,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.shorts.Short2IntMap p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.shorts.Short2IntMap synchronize(it.unimi.dsi.fastutil.shorts.Short2IntMap p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.shorts.Short2IntMaps.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.shorts.Short2IntSortedMaps#synchronize(it.unimi.dsi.fastutil.shorts.Short2IntSortedMap,java.lang.Object)}
*@see it.unimi.dsi.fastutil.shorts.Short2IntSortedMaps#synchronize(it.unimi.dsi.fastutil.shorts.Short2IntSortedMap,java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.shorts.Short2IntSortedMap it.unimi.dsi.fastutil.shorts.Short2IntSortedMaps.synchronize(it.unimi.dsi.fastutil.shorts.Short2IntSortedMap,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.shorts.Short2IntSortedMap p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.shorts.Short2IntSortedMap synchronize(it.unimi.dsi.fastutil.shorts.Short2IntSortedMap p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.shorts.Short2IntSortedMaps.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.shorts.Short2LongFunctions#synchronize(it.unimi.dsi.fastutil.shorts.Short2LongFunction,java.lang.Object)}
*@see it.unimi.dsi.fastutil.shorts.Short2LongFunctions#synchronize(it.unimi.dsi.fastutil.shorts.Short2LongFunction,java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.shorts.Short2LongFunction it.unimi.dsi.fastutil.shorts.Short2LongFunctions.synchronize(it.unimi.dsi.fastutil.shorts.Short2LongFunction,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.shorts.Short2LongFunction p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.shorts.Short2LongFunction synchronize(it.unimi.dsi.fastutil.shorts.Short2LongFunction p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.shorts.Short2LongFunctions.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.shorts.Short2LongMaps#synchronize(it.unimi.dsi.fastutil.shorts.Short2LongMap,java.lang.Object)}
*@see it.unimi.dsi.fastutil.shorts.Short2LongMaps#synchronize(it.unimi.dsi.fastutil.shorts.Short2LongMap,java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.shorts.Short2LongMap it.unimi.dsi.fastutil.shorts.Short2LongMaps.synchronize(it.unimi.dsi.fastutil.shorts.Short2LongMap,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.shorts.Short2LongMap p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.shorts.Short2LongMap synchronize(it.unimi.dsi.fastutil.shorts.Short2LongMap p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.shorts.Short2LongMaps.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.shorts.Short2LongSortedMaps#synchronize(it.unimi.dsi.fastutil.shorts.Short2LongSortedMap,java.lang.Object)}
*@see it.unimi.dsi.fastutil.shorts.Short2LongSortedMaps#synchronize(it.unimi.dsi.fastutil.shorts.Short2LongSortedMap,java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.shorts.Short2LongSortedMap it.unimi.dsi.fastutil.shorts.Short2LongSortedMaps.synchronize(it.unimi.dsi.fastutil.shorts.Short2LongSortedMap,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.shorts.Short2LongSortedMap p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.shorts.Short2LongSortedMap synchronize(it.unimi.dsi.fastutil.shorts.Short2LongSortedMap p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.shorts.Short2LongSortedMaps.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.shorts.Short2ObjectFunctions#synchronize(it.unimi.dsi.fastutil.shorts.Short2ObjectFunction<V>,java.lang.Object)}
*@see it.unimi.dsi.fastutil.shorts.Short2ObjectFunctions#synchronize(it.unimi.dsi.fastutil.shorts.Short2ObjectFunction<V>,java.lang.Object)
*<code>public static <V> it.unimi.dsi.fastutil.shorts.Short2ObjectFunction<V> it.unimi.dsi.fastutil.shorts.Short2ObjectFunctions.synchronize(it.unimi.dsi.fastutil.shorts.Short2ObjectFunction<V>,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.shorts.Short2ObjectFunction<V> p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <V> it.unimi.dsi.fastutil.shorts.Short2ObjectFunction<V> synchronize(it.unimi.dsi.fastutil.shorts.Short2ObjectFunction<V> p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.shorts.Short2ObjectFunctions.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.shorts.Short2ObjectMaps#synchronize(it.unimi.dsi.fastutil.shorts.Short2ObjectMap<V>,java.lang.Object)}
*@see it.unimi.dsi.fastutil.shorts.Short2ObjectMaps#synchronize(it.unimi.dsi.fastutil.shorts.Short2ObjectMap<V>,java.lang.Object)
*<code>public static <V> it.unimi.dsi.fastutil.shorts.Short2ObjectMap<V> it.unimi.dsi.fastutil.shorts.Short2ObjectMaps.synchronize(it.unimi.dsi.fastutil.shorts.Short2ObjectMap<V>,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.shorts.Short2ObjectMap<V> p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <V> it.unimi.dsi.fastutil.shorts.Short2ObjectMap<V> synchronize(it.unimi.dsi.fastutil.shorts.Short2ObjectMap<V> p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.shorts.Short2ObjectMaps.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.shorts.Short2ObjectSortedMaps#synchronize(it.unimi.dsi.fastutil.shorts.Short2ObjectSortedMap<V>,java.lang.Object)}
*@see it.unimi.dsi.fastutil.shorts.Short2ObjectSortedMaps#synchronize(it.unimi.dsi.fastutil.shorts.Short2ObjectSortedMap<V>,java.lang.Object)
*<code>public static <V> it.unimi.dsi.fastutil.shorts.Short2ObjectSortedMap<V> it.unimi.dsi.fastutil.shorts.Short2ObjectSortedMaps.synchronize(it.unimi.dsi.fastutil.shorts.Short2ObjectSortedMap<V>,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.shorts.Short2ObjectSortedMap<V> p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <V> it.unimi.dsi.fastutil.shorts.Short2ObjectSortedMap<V> synchronize(it.unimi.dsi.fastutil.shorts.Short2ObjectSortedMap<V> p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.shorts.Short2ObjectSortedMaps.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.shorts.Short2ReferenceFunctions#synchronize(it.unimi.dsi.fastutil.shorts.Short2ReferenceFunction<V>,java.lang.Object)}
*@see it.unimi.dsi.fastutil.shorts.Short2ReferenceFunctions#synchronize(it.unimi.dsi.fastutil.shorts.Short2ReferenceFunction<V>,java.lang.Object)
*<code>public static <V> it.unimi.dsi.fastutil.shorts.Short2ReferenceFunction<V> it.unimi.dsi.fastutil.shorts.Short2ReferenceFunctions.synchronize(it.unimi.dsi.fastutil.shorts.Short2ReferenceFunction<V>,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.shorts.Short2ReferenceFunction<V> p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <V> it.unimi.dsi.fastutil.shorts.Short2ReferenceFunction<V> synchronize(it.unimi.dsi.fastutil.shorts.Short2ReferenceFunction<V> p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.shorts.Short2ReferenceFunctions.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.shorts.Short2ReferenceMaps#synchronize(it.unimi.dsi.fastutil.shorts.Short2ReferenceMap<V>,java.lang.Object)}
*@see it.unimi.dsi.fastutil.shorts.Short2ReferenceMaps#synchronize(it.unimi.dsi.fastutil.shorts.Short2ReferenceMap<V>,java.lang.Object)
*<code>public static <V> it.unimi.dsi.fastutil.shorts.Short2ReferenceMap<V> it.unimi.dsi.fastutil.shorts.Short2ReferenceMaps.synchronize(it.unimi.dsi.fastutil.shorts.Short2ReferenceMap<V>,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.shorts.Short2ReferenceMap<V> p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <V> it.unimi.dsi.fastutil.shorts.Short2ReferenceMap<V> synchronize(it.unimi.dsi.fastutil.shorts.Short2ReferenceMap<V> p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.shorts.Short2ReferenceMaps.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.shorts.Short2ReferenceSortedMaps#synchronize(it.unimi.dsi.fastutil.shorts.Short2ReferenceSortedMap<V>,java.lang.Object)}
*@see it.unimi.dsi.fastutil.shorts.Short2ReferenceSortedMaps#synchronize(it.unimi.dsi.fastutil.shorts.Short2ReferenceSortedMap<V>,java.lang.Object)
*<code>public static <V> it.unimi.dsi.fastutil.shorts.Short2ReferenceSortedMap<V> it.unimi.dsi.fastutil.shorts.Short2ReferenceSortedMaps.synchronize(it.unimi.dsi.fastutil.shorts.Short2ReferenceSortedMap<V>,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.shorts.Short2ReferenceSortedMap<V> p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <V> it.unimi.dsi.fastutil.shorts.Short2ReferenceSortedMap<V> synchronize(it.unimi.dsi.fastutil.shorts.Short2ReferenceSortedMap<V> p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.shorts.Short2ReferenceSortedMaps.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.shorts.Short2ShortFunctions#synchronize(it.unimi.dsi.fastutil.shorts.Short2ShortFunction,java.lang.Object)}
*@see it.unimi.dsi.fastutil.shorts.Short2ShortFunctions#synchronize(it.unimi.dsi.fastutil.shorts.Short2ShortFunction,java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.shorts.Short2ShortFunction it.unimi.dsi.fastutil.shorts.Short2ShortFunctions.synchronize(it.unimi.dsi.fastutil.shorts.Short2ShortFunction,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.shorts.Short2ShortFunction p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.shorts.Short2ShortFunction synchronize(it.unimi.dsi.fastutil.shorts.Short2ShortFunction p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.shorts.Short2ShortFunctions.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.shorts.Short2ShortMaps#synchronize(it.unimi.dsi.fastutil.shorts.Short2ShortMap,java.lang.Object)}
*@see it.unimi.dsi.fastutil.shorts.Short2ShortMaps#synchronize(it.unimi.dsi.fastutil.shorts.Short2ShortMap,java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.shorts.Short2ShortMap it.unimi.dsi.fastutil.shorts.Short2ShortMaps.synchronize(it.unimi.dsi.fastutil.shorts.Short2ShortMap,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.shorts.Short2ShortMap p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.shorts.Short2ShortMap synchronize(it.unimi.dsi.fastutil.shorts.Short2ShortMap p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.shorts.Short2ShortMaps.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.shorts.Short2ShortSortedMaps#synchronize(it.unimi.dsi.fastutil.shorts.Short2ShortSortedMap,java.lang.Object)}
*@see it.unimi.dsi.fastutil.shorts.Short2ShortSortedMaps#synchronize(it.unimi.dsi.fastutil.shorts.Short2ShortSortedMap,java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.shorts.Short2ShortSortedMap it.unimi.dsi.fastutil.shorts.Short2ShortSortedMaps.synchronize(it.unimi.dsi.fastutil.shorts.Short2ShortSortedMap,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.shorts.Short2ShortSortedMap p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.shorts.Short2ShortSortedMap synchronize(it.unimi.dsi.fastutil.shorts.Short2ShortSortedMap p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.shorts.Short2ShortSortedMaps.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.shorts.ShortBigLists#synchronize(it.unimi.dsi.fastutil.shorts.ShortBigList,java.lang.Object)}
*@see it.unimi.dsi.fastutil.shorts.ShortBigLists#synchronize(it.unimi.dsi.fastutil.shorts.ShortBigList,java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.shorts.ShortBigList it.unimi.dsi.fastutil.shorts.ShortBigLists.synchronize(it.unimi.dsi.fastutil.shorts.ShortBigList,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.shorts.ShortBigList p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.shorts.ShortBigList synchronize(it.unimi.dsi.fastutil.shorts.ShortBigList p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.shorts.ShortBigLists.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.shorts.ShortCollections#synchronize(it.unimi.dsi.fastutil.shorts.ShortCollection,java.lang.Object)}
*@see it.unimi.dsi.fastutil.shorts.ShortCollections#synchronize(it.unimi.dsi.fastutil.shorts.ShortCollection,java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.shorts.ShortCollection it.unimi.dsi.fastutil.shorts.ShortCollections.synchronize(it.unimi.dsi.fastutil.shorts.ShortCollection,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.shorts.ShortCollection p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.shorts.ShortCollection synchronize(it.unimi.dsi.fastutil.shorts.ShortCollection p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.shorts.ShortCollections.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.shorts.ShortLists#synchronize(it.unimi.dsi.fastutil.shorts.ShortList,java.lang.Object)}
*@see it.unimi.dsi.fastutil.shorts.ShortLists#synchronize(it.unimi.dsi.fastutil.shorts.ShortList,java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.shorts.ShortList it.unimi.dsi.fastutil.shorts.ShortLists.synchronize(it.unimi.dsi.fastutil.shorts.ShortList,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.shorts.ShortList p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.shorts.ShortList synchronize(it.unimi.dsi.fastutil.shorts.ShortList p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.shorts.ShortLists.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.shorts.ShortPriorityQueues#synchronize(it.unimi.dsi.fastutil.shorts.ShortPriorityQueue,java.lang.Object)}
*@see it.unimi.dsi.fastutil.shorts.ShortPriorityQueues#synchronize(it.unimi.dsi.fastutil.shorts.ShortPriorityQueue,java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.shorts.ShortPriorityQueue it.unimi.dsi.fastutil.shorts.ShortPriorityQueues.synchronize(it.unimi.dsi.fastutil.shorts.ShortPriorityQueue,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.shorts.ShortPriorityQueue p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.shorts.ShortPriorityQueue synchronize(it.unimi.dsi.fastutil.shorts.ShortPriorityQueue p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.shorts.ShortPriorityQueues.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.shorts.ShortSets#synchronize(it.unimi.dsi.fastutil.shorts.ShortSet,java.lang.Object)}
*@see it.unimi.dsi.fastutil.shorts.ShortSets#synchronize(it.unimi.dsi.fastutil.shorts.ShortSet,java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.shorts.ShortSet it.unimi.dsi.fastutil.shorts.ShortSets.synchronize(it.unimi.dsi.fastutil.shorts.ShortSet,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.shorts.ShortSet p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.shorts.ShortSet synchronize(it.unimi.dsi.fastutil.shorts.ShortSet p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.shorts.ShortSets.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.shorts.ShortSortedSets#synchronize(it.unimi.dsi.fastutil.shorts.ShortSortedSet,java.lang.Object)}
*@see it.unimi.dsi.fastutil.shorts.ShortSortedSets#synchronize(it.unimi.dsi.fastutil.shorts.ShortSortedSet,java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.shorts.ShortSortedSet it.unimi.dsi.fastutil.shorts.ShortSortedSets.synchronize(it.unimi.dsi.fastutil.shorts.ShortSortedSet,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.shorts.ShortSortedSet p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.shorts.ShortSortedSet synchronize(it.unimi.dsi.fastutil.shorts.ShortSortedSet p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.shorts.ShortSortedSets.synchronize(p0,p1);
}
/**
*{@link com.google.common.util.concurrent.Uninterruptibles#takeUninterruptibly(java.util.concurrent.BlockingQueue<E>)}
*@see com.google.common.util.concurrent.Uninterruptibles#takeUninterruptibly(java.util.concurrent.BlockingQueue<E>)
*<code>public static <E> E com.google.common.util.concurrent.Uninterruptibles.takeUninterruptibly(java.util.concurrent.BlockingQueue<E>)
*takeUninterruptibly(java.util.concurrent.BlockingQueue<E> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E> E takeUninterruptibly(java.util.concurrent.BlockingQueue<E> p0){
	return com.google.common.util.concurrent.Uninterruptibles.takeUninterruptibly(p0);
}
/**
*{@link org.apache.commons.io.TaggedIOException#throwCauseIfTaggedWith(java.lang.Throwable,java.lang.Object)}
*@see org.apache.commons.io.TaggedIOException#throwCauseIfTaggedWith(java.lang.Throwable,java.lang.Object)
*<code>public static void org.apache.commons.io.TaggedIOException.throwCauseIfTaggedWith(java.lang.Throwable,java.lang.Object) throws java.io.IOException
*throwCauseIfTaggedWith(java.lang.Throwable p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void throwCauseIfTaggedWith(java.lang.Throwable p0,java.lang.Object p1) throws java.io.IOException{
	 org.apache.commons.io.TaggedIOException.throwCauseIfTaggedWith(p0,p1);
}
/**
*{@link org.apache.commons.lang3.ArrayUtils#toPrimitive(java.lang.Object)}
*@see org.apache.commons.lang3.ArrayUtils#toPrimitive(java.lang.Object)
*<code>public static java.lang.Object org.apache.commons.lang3.ArrayUtils.toPrimitive(java.lang.Object)
*toPrimitive(java.lang.Object p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.Object toPrimitive(java.lang.Object p0){
	return org.apache.commons.lang3.ArrayUtils.toPrimitive(p0);
}
/**
*{@link org.apache.commons.lang3.builder.ReflectionToStringBuilder#toStringExclude(java.lang.Object,java.util.Collection<java.lang.String>)}
*@see org.apache.commons.lang3.builder.ReflectionToStringBuilder#toStringExclude(java.lang.Object,java.util.Collection<java.lang.String>)
*<code>public static java.lang.String org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude(java.lang.Object,java.util.Collection<java.lang.String>)
*toStringExclude(java.lang.Object p0,java.util.Collection<java.lang.String> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.String toStringExclude(java.lang.Object p0,java.util.Collection<java.lang.String> p1){
	return org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude(p0,p1);
}
/**
*{@link org.apache.commons.lang3.builder.ReflectionToStringBuilder#toStringExclude(java.lang.Object,java.lang.String...)}
*@see org.apache.commons.lang3.builder.ReflectionToStringBuilder#toStringExclude(java.lang.Object,java.lang.String...)
*<code>public static java.lang.String org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude(java.lang.Object,java.lang.String...)
*toStringExclude(java.lang.Object p0,java.lang.String... p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.String toStringExclude(java.lang.Object p0,java.lang.String... p1){
	return org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude(p0,p1);
}
/**
*{@link org.apache.commons.io.FileCleaner#track(java.lang.String,java.lang.Object,org.apache.commons.io.FileDeleteStrategy)}
*@see org.apache.commons.io.FileCleaner#track(java.lang.String,java.lang.Object,org.apache.commons.io.FileDeleteStrategy)
*<code>public static void org.apache.commons.io.FileCleaner.track(java.lang.String,java.lang.Object,org.apache.commons.io.FileDeleteStrategy)
*track(java.lang.String p0,java.lang.Object p1,org.apache.commons.io.FileDeleteStrategy p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void track(java.lang.String p0,java.lang.Object p1,org.apache.commons.io.FileDeleteStrategy p2){
	 org.apache.commons.io.FileCleaner.track(p0,p1,p2);
}
/**
*{@link org.apache.commons.io.FileCleaner#track(java.io.File,java.lang.Object)}
*@see org.apache.commons.io.FileCleaner#track(java.io.File,java.lang.Object)
*<code>public static void org.apache.commons.io.FileCleaner.track(java.io.File,java.lang.Object)
*track(java.io.File p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void track(java.io.File p0,java.lang.Object p1){
	 org.apache.commons.io.FileCleaner.track(p0,p1);
}
/**
*{@link org.apache.commons.io.FileCleaner#track(java.io.File,java.lang.Object,org.apache.commons.io.FileDeleteStrategy)}
*@see org.apache.commons.io.FileCleaner#track(java.io.File,java.lang.Object,org.apache.commons.io.FileDeleteStrategy)
*<code>public static void org.apache.commons.io.FileCleaner.track(java.io.File,java.lang.Object,org.apache.commons.io.FileDeleteStrategy)
*track(java.io.File p0,java.lang.Object p1,org.apache.commons.io.FileDeleteStrategy p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void track(java.io.File p0,java.lang.Object p1,org.apache.commons.io.FileDeleteStrategy p2){
	 org.apache.commons.io.FileCleaner.track(p0,p1,p2);
}
/**
*{@link org.apache.commons.io.FileCleaner#track(java.lang.String,java.lang.Object)}
*@see org.apache.commons.io.FileCleaner#track(java.lang.String,java.lang.Object)
*<code>public static void org.apache.commons.io.FileCleaner.track(java.lang.String,java.lang.Object)
*track(java.lang.String p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void track(java.lang.String p0,java.lang.Object p1){
	 org.apache.commons.io.FileCleaner.track(p0,p1);
}
/**
*{@link org.apache.commons.lang3.time.DateUtils#truncate(java.lang.Object,int)}
*@see org.apache.commons.lang3.time.DateUtils#truncate(java.lang.Object,int)
*<code>public static java.util.Date org.apache.commons.lang3.time.DateUtils.truncate(java.lang.Object,int)
*truncate(java.lang.Object p0,int p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Date truncate(java.lang.Object p0,int p1){
	return org.apache.commons.lang3.time.DateUtils.truncate(p0,p1);
}
/**
*{@link org.apache.commons.collections4.MapUtils#verbosePrint(java.io.PrintStream,java.lang.Object,java.util.Map<?, ?>)}
*@see org.apache.commons.collections4.MapUtils#verbosePrint(java.io.PrintStream,java.lang.Object,java.util.Map<?, ?>)
*<code>public static void org.apache.commons.collections4.MapUtils.verbosePrint(java.io.PrintStream,java.lang.Object,java.util.Map<?, ?>)
*verbosePrint(java.io.PrintStream p0,java.lang.Object p1,java.util.Map<?, ?> p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void verbosePrint(java.io.PrintStream p0,java.lang.Object p1,java.util.Map<?, ?> p2){
	 org.apache.commons.collections4.MapUtils.verbosePrint(p0,p1,p2);
}
/**
*{@link org.apache.commons.collections.MapUtils#verbosePrint(java.io.PrintStream,java.lang.Object,java.util.Map)}
*@see org.apache.commons.collections.MapUtils#verbosePrint(java.io.PrintStream,java.lang.Object,java.util.Map)
*<code>public static void org.apache.commons.collections.MapUtils.verbosePrint(java.io.PrintStream,java.lang.Object,java.util.Map)
*verbosePrint(java.io.PrintStream p0,java.lang.Object p1,java.util.Map p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void verbosePrint(java.io.PrintStream p0,java.lang.Object p1,java.util.Map p2){
	 org.apache.commons.collections.MapUtils.verbosePrint(p0,p1,p2);
}
/**
*{@link com.google.common.base.Verify#verifyNotNull(T,java.lang.String,java.lang.Object...)}
*@see com.google.common.base.Verify#verifyNotNull(T,java.lang.String,java.lang.Object...)
*<code>public static <T> T com.google.common.base.Verify.verifyNotNull(T,java.lang.String,java.lang.Object...)
*verifyNotNull(T p0,java.lang.String p1,java.lang.Object... p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> T verifyNotNull(T p0,java.lang.String p1,java.lang.Object... p2){
	return com.google.common.base.Verify.verifyNotNull(p0,p1,p2);
}
/**
*{@link com.google.common.base.Verify#verifyNotNull(T)}
*@see com.google.common.base.Verify#verifyNotNull(T)
*<code>public static <T> T com.google.common.base.Verify.verifyNotNull(T)
*verifyNotNull(T p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> T verifyNotNull(T p0){
	return com.google.common.base.Verify.verifyNotNull(p0);
}
/**
*{@link com.facebook.util.reflection.RobustProxy#wrap(java.lang.Class<T>,T)}
*@see com.facebook.util.reflection.RobustProxy#wrap(java.lang.Class<T>,T)
*<code>public static <T> T com.facebook.util.reflection.RobustProxy.wrap(java.lang.Class<T>,T)
*wrap(java.lang.Class<T> p0,T p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> T wrap(java.lang.Class<T> p0,T p1){
	return com.facebook.util.reflection.RobustProxy.wrap(p0,p1);
}
/**
*{@link org.apache.commons.lang3.exception.ExceptionUtils#wrapAndThrow(java.lang.Throwable)}
*@see org.apache.commons.lang3.exception.ExceptionUtils#wrapAndThrow(java.lang.Throwable)
*<code>public static <R> R org.apache.commons.lang3.exception.ExceptionUtils.wrapAndThrow(java.lang.Throwable)
*wrapAndThrow(java.lang.Throwable p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <R> R wrapAndThrow(java.lang.Throwable p0){
	return org.apache.commons.lang3.exception.ExceptionUtils.wrapAndThrow(p0);
}
/**
*{@link org.apache.commons.lang3.reflect.FieldUtils#writeDeclaredField(java.lang.Object,java.lang.String,java.lang.Object)}
*@see org.apache.commons.lang3.reflect.FieldUtils#writeDeclaredField(java.lang.Object,java.lang.String,java.lang.Object)
*<code>public static void org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField(java.lang.Object,java.lang.String,java.lang.Object) throws java.lang.IllegalAccessException
*writeDeclaredField(java.lang.Object p0,java.lang.String p1,java.lang.Object p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void writeDeclaredField(java.lang.Object p0,java.lang.String p1,java.lang.Object p2) throws java.lang.IllegalAccessException{
	 org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField(p0,p1,p2);
}
/**
*{@link org.apache.commons.lang3.reflect.FieldUtils#writeDeclaredField(java.lang.Object,java.lang.String,java.lang.Object,boolean)}
*@see org.apache.commons.lang3.reflect.FieldUtils#writeDeclaredField(java.lang.Object,java.lang.String,java.lang.Object,boolean)
*<code>public static void org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField(java.lang.Object,java.lang.String,java.lang.Object,boolean) throws java.lang.IllegalAccessException
*writeDeclaredField(java.lang.Object p0,java.lang.String p1,java.lang.Object p2,boolean p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void writeDeclaredField(java.lang.Object p0,java.lang.String p1,java.lang.Object p2,boolean p3) throws java.lang.IllegalAccessException{
	 org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField(p0,p1,p2,p3);
}
/**
*{@link org.apache.commons.lang3.reflect.FieldUtils#writeDeclaredStaticField(java.lang.Class<?>,java.lang.String,java.lang.Object,boolean)}
*@see org.apache.commons.lang3.reflect.FieldUtils#writeDeclaredStaticField(java.lang.Class<?>,java.lang.String,java.lang.Object,boolean)
*<code>public static void org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredStaticField(java.lang.Class<?>,java.lang.String,java.lang.Object,boolean) throws java.lang.IllegalAccessException
*writeDeclaredStaticField(java.lang.Class<?> p0,java.lang.String p1,java.lang.Object p2,boolean p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void writeDeclaredStaticField(java.lang.Class<?> p0,java.lang.String p1,java.lang.Object p2,boolean p3) throws java.lang.IllegalAccessException{
	 org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredStaticField(p0,p1,p2,p3);
}
/**
*{@link org.apache.commons.lang3.reflect.FieldUtils#writeDeclaredStaticField(java.lang.Class<?>,java.lang.String,java.lang.Object)}
*@see org.apache.commons.lang3.reflect.FieldUtils#writeDeclaredStaticField(java.lang.Class<?>,java.lang.String,java.lang.Object)
*<code>public static void org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredStaticField(java.lang.Class<?>,java.lang.String,java.lang.Object) throws java.lang.IllegalAccessException
*writeDeclaredStaticField(java.lang.Class<?> p0,java.lang.String p1,java.lang.Object p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void writeDeclaredStaticField(java.lang.Class<?> p0,java.lang.String p1,java.lang.Object p2) throws java.lang.IllegalAccessException{
	 org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredStaticField(p0,p1,p2);
}
/**
*{@link org.apache.commons.lang3.reflect.FieldUtils#writeField(java.lang.reflect.Field,java.lang.Object,java.lang.Object,boolean)}
*@see org.apache.commons.lang3.reflect.FieldUtils#writeField(java.lang.reflect.Field,java.lang.Object,java.lang.Object,boolean)
*<code>public static void org.apache.commons.lang3.reflect.FieldUtils.writeField(java.lang.reflect.Field,java.lang.Object,java.lang.Object,boolean) throws java.lang.IllegalAccessException
*writeField(java.lang.reflect.Field p0,java.lang.Object p1,java.lang.Object p2,boolean p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void writeField(java.lang.reflect.Field p0,java.lang.Object p1,java.lang.Object p2,boolean p3) throws java.lang.IllegalAccessException{
	 org.apache.commons.lang3.reflect.FieldUtils.writeField(p0,p1,p2,p3);
}
/**
*{@link org.apache.commons.lang3.reflect.FieldUtils#writeField(java.lang.reflect.Field,java.lang.Object,java.lang.Object)}
*@see org.apache.commons.lang3.reflect.FieldUtils#writeField(java.lang.reflect.Field,java.lang.Object,java.lang.Object)
*<code>public static void org.apache.commons.lang3.reflect.FieldUtils.writeField(java.lang.reflect.Field,java.lang.Object,java.lang.Object) throws java.lang.IllegalAccessException
*writeField(java.lang.reflect.Field p0,java.lang.Object p1,java.lang.Object p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void writeField(java.lang.reflect.Field p0,java.lang.Object p1,java.lang.Object p2) throws java.lang.IllegalAccessException{
	 org.apache.commons.lang3.reflect.FieldUtils.writeField(p0,p1,p2);
}
/**
*{@link org.apache.commons.lang3.reflect.FieldUtils#writeField(java.lang.Object,java.lang.String,java.lang.Object)}
*@see org.apache.commons.lang3.reflect.FieldUtils#writeField(java.lang.Object,java.lang.String,java.lang.Object)
*<code>public static void org.apache.commons.lang3.reflect.FieldUtils.writeField(java.lang.Object,java.lang.String,java.lang.Object) throws java.lang.IllegalAccessException
*writeField(java.lang.Object p0,java.lang.String p1,java.lang.Object p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void writeField(java.lang.Object p0,java.lang.String p1,java.lang.Object p2) throws java.lang.IllegalAccessException{
	 org.apache.commons.lang3.reflect.FieldUtils.writeField(p0,p1,p2);
}
/**
*{@link org.apache.commons.lang3.reflect.FieldUtils#writeField(java.lang.Object,java.lang.String,java.lang.Object,boolean)}
*@see org.apache.commons.lang3.reflect.FieldUtils#writeField(java.lang.Object,java.lang.String,java.lang.Object,boolean)
*<code>public static void org.apache.commons.lang3.reflect.FieldUtils.writeField(java.lang.Object,java.lang.String,java.lang.Object,boolean) throws java.lang.IllegalAccessException
*writeField(java.lang.Object p0,java.lang.String p1,java.lang.Object p2,boolean p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void writeField(java.lang.Object p0,java.lang.String p1,java.lang.Object p2,boolean p3) throws java.lang.IllegalAccessException{
	 org.apache.commons.lang3.reflect.FieldUtils.writeField(p0,p1,p2,p3);
}
/**
*{@link org.apache.commons.lang3.reflect.FieldUtils#writeStaticField(java.lang.reflect.Field,java.lang.Object)}
*@see org.apache.commons.lang3.reflect.FieldUtils#writeStaticField(java.lang.reflect.Field,java.lang.Object)
*<code>public static void org.apache.commons.lang3.reflect.FieldUtils.writeStaticField(java.lang.reflect.Field,java.lang.Object) throws java.lang.IllegalAccessException
*writeStaticField(java.lang.reflect.Field p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void writeStaticField(java.lang.reflect.Field p0,java.lang.Object p1) throws java.lang.IllegalAccessException{
	 org.apache.commons.lang3.reflect.FieldUtils.writeStaticField(p0,p1);
}
/**
*{@link org.apache.commons.lang3.reflect.FieldUtils#writeStaticField(java.lang.Class<?>,java.lang.String,java.lang.Object)}
*@see org.apache.commons.lang3.reflect.FieldUtils#writeStaticField(java.lang.Class<?>,java.lang.String,java.lang.Object)
*<code>public static void org.apache.commons.lang3.reflect.FieldUtils.writeStaticField(java.lang.Class<?>,java.lang.String,java.lang.Object) throws java.lang.IllegalAccessException
*writeStaticField(java.lang.Class<?> p0,java.lang.String p1,java.lang.Object p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void writeStaticField(java.lang.Class<?> p0,java.lang.String p1,java.lang.Object p2) throws java.lang.IllegalAccessException{
	 org.apache.commons.lang3.reflect.FieldUtils.writeStaticField(p0,p1,p2);
}
/**
*{@link org.apache.commons.lang3.reflect.FieldUtils#writeStaticField(java.lang.Class<?>,java.lang.String,java.lang.Object,boolean)}
*@see org.apache.commons.lang3.reflect.FieldUtils#writeStaticField(java.lang.Class<?>,java.lang.String,java.lang.Object,boolean)
*<code>public static void org.apache.commons.lang3.reflect.FieldUtils.writeStaticField(java.lang.Class<?>,java.lang.String,java.lang.Object,boolean) throws java.lang.IllegalAccessException
*writeStaticField(java.lang.Class<?> p0,java.lang.String p1,java.lang.Object p2,boolean p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void writeStaticField(java.lang.Class<?> p0,java.lang.String p1,java.lang.Object p2,boolean p3) throws java.lang.IllegalAccessException{
	 org.apache.commons.lang3.reflect.FieldUtils.writeStaticField(p0,p1,p2,p3);
}
/**
*{@link org.apache.commons.lang3.reflect.FieldUtils#writeStaticField(java.lang.reflect.Field,java.lang.Object,boolean)}
*@see org.apache.commons.lang3.reflect.FieldUtils#writeStaticField(java.lang.reflect.Field,java.lang.Object,boolean)
*<code>public static void org.apache.commons.lang3.reflect.FieldUtils.writeStaticField(java.lang.reflect.Field,java.lang.Object,boolean) throws java.lang.IllegalAccessException
*writeStaticField(java.lang.reflect.Field p0,java.lang.Object p1,boolean p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void writeStaticField(java.lang.reflect.Field p0,java.lang.Object p1,boolean p2) throws java.lang.IllegalAccessException{
	 org.apache.commons.lang3.reflect.FieldUtils.writeStaticField(p0,p1,p2);
}
}
