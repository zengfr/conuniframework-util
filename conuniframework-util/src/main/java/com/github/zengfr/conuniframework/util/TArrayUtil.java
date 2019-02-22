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
public final class TArrayUtil{ 
/**
*{@link org.apache.commons.lang3.ArrayUtils#add(T[],int,T)}
*@see org.apache.commons.lang3.ArrayUtils#add(T[],int,T)
*<code>public static <T> T[] org.apache.commons.lang3.ArrayUtils.add(T[],int,T)
*add(T[] p0,int p1,T p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> T[] add(T[] p0,int p1,T p2){
	return org.apache.commons.lang3.ArrayUtils.add(p0,p1,p2);
}
/**
*{@link org.apache.commons.lang3.ArrayUtils#add(T[],T)}
*@see org.apache.commons.lang3.ArrayUtils#add(T[],T)
*<code>public static <T> T[] org.apache.commons.lang3.ArrayUtils.add(T[],T)
*add(T[] p0,T p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> T[] add(T[] p0,T p1){
	return org.apache.commons.lang3.ArrayUtils.add(p0,p1);
}
/**
*{@link org.apache.commons.lang3.ArrayUtils#addAll(T[],T...)}
*@see org.apache.commons.lang3.ArrayUtils#addAll(T[],T...)
*<code>public static <T> T[] org.apache.commons.lang3.ArrayUtils.addAll(T[],T...)
*addAll(T[] p0,T... p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> T[] addAll(T[] p0,T... p1){
	return org.apache.commons.lang3.ArrayUtils.addAll(p0,p1);
}
/**
*{@link org.apache.commons.lang3.ArrayUtils#clone(T...)}
*@see org.apache.commons.lang3.ArrayUtils#clone(T...)
*<code>public static <T> T[] org.apache.commons.lang3.ArrayUtils.clone(T[])
*clone(T... p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> T[] clone(T... p0){
	return org.apache.commons.lang3.ArrayUtils.clone(p0);
}
/**
*{@link com.facebook.collectionsbase.Arrays#comparPrimitiveArrays(T[],T[],java.util.Comparator<? super T[]>)}
*@see com.facebook.collectionsbase.Arrays#comparPrimitiveArrays(T[],T[],java.util.Comparator<? super T[]>)
*<code>public static <T> int com.facebook.collectionsbase.Arrays.comparPrimitiveArrays(T[],T[],java.util.Comparator<? super T[]>)
*comparPrimitiveArrays(T[] p0,T[] p1,java.util.Comparator<? super T[]> p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> int comparPrimitiveArrays(T[] p0,T[] p1,java.util.Comparator<? super T[]> p2){
	return com.facebook.collectionsbase.Arrays.comparPrimitiveArrays(p0,p1,p2);
}
/**
*{@link com.facebook.collectionsbase.Arrays#compareArrays(T[],T...)}
*@see com.facebook.collectionsbase.Arrays#compareArrays(T[],T...)
*<code>public static <T> int com.facebook.collectionsbase.Arrays.compareArrays(T[],T[])
*compareArrays(T[] p0,T... p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T extends java.lang.Comparable<? super T> > int compareArrays(T[] p0,T... p1){
	return com.facebook.collectionsbase.Arrays.compareArrays(p0,p1);
}
/**
*{@link com.facebook.collectionsbase.Arrays#compareArrays(T[],T[],java.util.Comparator<? super T>)}
*@see com.facebook.collectionsbase.Arrays#compareArrays(T[],T[],java.util.Comparator<? super T>)
*<code>public static <T> int com.facebook.collectionsbase.Arrays.compareArrays(T[],T[],java.util.Comparator<? super T>)
*compareArrays(T[] p0,T[] p1,java.util.Comparator<? super T> p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> int compareArrays(T[] p0,T[] p1,java.util.Comparator<? super T> p2){
	return com.facebook.collectionsbase.Arrays.compareArrays(p0,p1,p2);
}
/**
*{@link com.google.common.collect.ObjectArrays#concat(T[],T)}
*@see com.google.common.collect.ObjectArrays#concat(T[],T)
*<code>public static <T> T[] com.google.common.collect.ObjectArrays.concat(T[],T)
*concat(T[] p0,T p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> T[] concat(T[] p0,T p1){
	return com.google.common.collect.ObjectArrays.concat(p0,p1);
}
/**
*{@link com.google.common.collect.ObjectArrays#concat(T,T...)}
*@see com.google.common.collect.ObjectArrays#concat(T,T...)
*<code>public static <T> T[] com.google.common.collect.ObjectArrays.concat(T,T[])
*concat(T p0,T... p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> T[] concat(T p0,T... p1){
	return com.google.common.collect.ObjectArrays.concat(p0,p1);
}
/**
*{@link com.google.common.collect.ObjectArrays#concat(T[],T[],java.lang.Class<T>)}
*@see com.google.common.collect.ObjectArrays#concat(T[],T[],java.lang.Class<T>)
*<code>public static <T> T[] com.google.common.collect.ObjectArrays.concat(T[],T[],java.lang.Class<T>)
*concat(T[] p0,T[] p1,java.lang.Class<T> p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> T[] concat(T[] p0,T[] p1,java.lang.Class<T> p2){
	return com.google.common.collect.ObjectArrays.concat(p0,p1,p2);
}
/**
*{@link org.apache.commons.collections4.CollectionUtils#containsAny(java.util.Collection<?>,T...)}
*@see org.apache.commons.collections4.CollectionUtils#containsAny(java.util.Collection<?>,T...)
*<code>public static <T> boolean org.apache.commons.collections4.CollectionUtils.containsAny(java.util.Collection<?>,T...)
*containsAny(java.util.Collection<?> p0,T... p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> boolean containsAny(java.util.Collection<?> p0,T... p1){
	return org.apache.commons.collections4.CollectionUtils.containsAny(p0,p1);
}
/**
*{@link org.apache.commons.math3.linear.MatrixUtils#createColumnFieldMatrix(T...)}
*@see org.apache.commons.math3.linear.MatrixUtils#createColumnFieldMatrix(T...)
*<code>public static <T> org.apache.commons.math3.linear.FieldMatrix<T> org.apache.commons.math3.linear.MatrixUtils.createColumnFieldMatrix(T[]) throws org.apache.commons.math3.exception.NoDataException,org.apache.commons.math3.exception.NullArgumentException
*createColumnFieldMatrix(T... p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T extends org.apache.commons.math3.FieldElement<T> > org.apache.commons.math3.linear.FieldMatrix<T> createColumnFieldMatrix(T... p0) throws org.apache.commons.math3.exception.NoDataException,org.apache.commons.math3.exception.NullArgumentException{
	return org.apache.commons.math3.linear.MatrixUtils.createColumnFieldMatrix(p0);
}
/**
*{@link org.apache.commons.math3.linear.MatrixUtils#createFieldDiagonalMatrix(T...)}
*@see org.apache.commons.math3.linear.MatrixUtils#createFieldDiagonalMatrix(T...)
*<code>public static <T> org.apache.commons.math3.linear.FieldMatrix<T> org.apache.commons.math3.linear.MatrixUtils.createFieldDiagonalMatrix(T[])
*createFieldDiagonalMatrix(T... p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T extends org.apache.commons.math3.FieldElement<T> > org.apache.commons.math3.linear.FieldMatrix<T> createFieldDiagonalMatrix(T... p0){
	return org.apache.commons.math3.linear.MatrixUtils.createFieldDiagonalMatrix(p0);
}
/**
*{@link org.apache.commons.math3.linear.MatrixUtils#createFieldVector(T...)}
*@see org.apache.commons.math3.linear.MatrixUtils#createFieldVector(T...)
*<code>public static <T> org.apache.commons.math3.linear.FieldVector<T> org.apache.commons.math3.linear.MatrixUtils.createFieldVector(T[]) throws org.apache.commons.math3.exception.NoDataException,org.apache.commons.math3.exception.NullArgumentException,org.apache.commons.math3.exception.ZeroException
*createFieldVector(T... p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T extends org.apache.commons.math3.FieldElement<T> > org.apache.commons.math3.linear.FieldVector<T> createFieldVector(T... p0) throws org.apache.commons.math3.exception.NoDataException,org.apache.commons.math3.exception.NullArgumentException,org.apache.commons.math3.exception.ZeroException{
	return org.apache.commons.math3.linear.MatrixUtils.createFieldVector(p0);
}
/**
*{@link org.apache.commons.math3.linear.MatrixUtils#createRowFieldMatrix(T...)}
*@see org.apache.commons.math3.linear.MatrixUtils#createRowFieldMatrix(T...)
*<code>public static <T> org.apache.commons.math3.linear.FieldMatrix<T> org.apache.commons.math3.linear.MatrixUtils.createRowFieldMatrix(T[]) throws org.apache.commons.math3.exception.NoDataException,org.apache.commons.math3.exception.NullArgumentException
*createRowFieldMatrix(T... p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T extends org.apache.commons.math3.FieldElement<T> > org.apache.commons.math3.linear.FieldMatrix<T> createRowFieldMatrix(T... p0) throws org.apache.commons.math3.exception.NoDataException,org.apache.commons.math3.exception.NullArgumentException{
	return org.apache.commons.math3.linear.MatrixUtils.createRowFieldMatrix(p0);
}
/**
*{@link com.google.common.collect.Iterables#cycle(T...)}
*@see com.google.common.collect.Iterables#cycle(T...)
*<code>public static <T> java.lang.Iterable<T> com.google.common.collect.Iterables.cycle(T...)
*cycle(T... p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> java.lang.Iterable<T> cycle(T... p0){
	return com.google.common.collect.Iterables.cycle(p0);
}
/**
*{@link com.google.common.collect.Ordering#explicit(T,T...)}
*@see com.google.common.collect.Ordering#explicit(T,T...)
*<code>public static <T> com.google.common.collect.Ordering<T> com.google.common.collect.Ordering.explicit(T,T...)
*explicit(T p0,T... p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> com.google.common.collect.Ordering<T> explicit(T p0,T... p1){
	return com.google.common.collect.Ordering.explicit(p0,p1);
}
/**
*{@link org.apache.commons.lang3.StringUtils#firstNonBlank(T...)}
*@see org.apache.commons.lang3.StringUtils#firstNonBlank(T...)
*<code>public static <T> T org.apache.commons.lang3.StringUtils.firstNonBlank(T...)
*firstNonBlank(T... p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T extends java.lang.CharSequence > T firstNonBlank(T... p0){
	return org.apache.commons.lang3.StringUtils.firstNonBlank(p0);
}
/**
*{@link org.apache.commons.lang3.StringUtils#firstNonEmpty(T...)}
*@see org.apache.commons.lang3.StringUtils#firstNonEmpty(T...)
*<code>public static <T> T org.apache.commons.lang3.StringUtils.firstNonEmpty(T...)
*firstNonEmpty(T... p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T extends java.lang.CharSequence > T firstNonEmpty(T... p0){
	return org.apache.commons.lang3.StringUtils.firstNonEmpty(p0);
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
*{@link com.google.common.collect.Iterators#forArray(T...)}
*@see com.google.common.collect.Iterators#forArray(T...)
*<code>public static <T> com.google.common.collect.UnmodifiableIterator<T> com.google.common.collect.Iterators.forArray(T...)
*forArray(T... p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> com.google.common.collect.UnmodifiableIterator<T> forArray(T... p0){
	return com.google.common.collect.Iterators.forArray(p0);
}
/**
*{@link org.apache.commons.lang3.ArrayUtils#insert(int,T[],T...)}
*@see org.apache.commons.lang3.ArrayUtils#insert(int,T[],T...)
*<code>public static <T> T[] org.apache.commons.lang3.ArrayUtils.insert(int,T[],T...)
*insert(int p0,T[] p1,T... p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> T[] insert(int p0,T[] p1,T... p2){
	return org.apache.commons.lang3.ArrayUtils.insert(p0,p1,p2);
}
/**
*{@link org.apache.commons.lang3.ArrayUtils#isArrayIndexValid(T[],int)}
*@see org.apache.commons.lang3.ArrayUtils#isArrayIndexValid(T[],int)
*<code>public static <T> boolean org.apache.commons.lang3.ArrayUtils.isArrayIndexValid(T[],int)
*isArrayIndexValid(T[] p0,int p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> boolean isArrayIndexValid(T[] p0,int p1){
	return org.apache.commons.lang3.ArrayUtils.isArrayIndexValid(p0,p1);
}
/**
*{@link org.apache.commons.math3.util.MathArrays#isMonotonic(T[],org.apache.commons.math3.util.MathArrays$OrderDirection,boolean)}
*@see org.apache.commons.math3.util.MathArrays#isMonotonic(T[],org.apache.commons.math3.util.MathArrays$OrderDirection,boolean)
*<code>public static <T> boolean org.apache.commons.math3.util.MathArrays.isMonotonic(T[],org.apache.commons.math3.util.MathArrays$OrderDirection,boolean)
*isMonotonic(T[] p0,org.apache.commons.math3.util.MathArrays$OrderDirection p1,boolean p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T extends java.lang.Comparable<? super T> > boolean isMonotonic(T[] p0,org.apache.commons.math3.util.MathArrays.OrderDirection p1,boolean p2){
	return org.apache.commons.math3.util.MathArrays.isMonotonic(p0,p1,p2);
}
/**
*{@link org.apache.commons.lang3.ArrayUtils#isNotEmpty(T...)}
*@see org.apache.commons.lang3.ArrayUtils#isNotEmpty(T...)
*<code>public static <T> boolean org.apache.commons.lang3.ArrayUtils.isNotEmpty(T[])
*isNotEmpty(T... p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> boolean isNotEmpty(T... p0){
	return org.apache.commons.lang3.ArrayUtils.isNotEmpty(p0);
}
/**
*{@link org.apache.commons.lang3.ArrayUtils#isSorted(T[],java.util.Comparator<T>)}
*@see org.apache.commons.lang3.ArrayUtils#isSorted(T[],java.util.Comparator<T>)
*<code>public static <T> boolean org.apache.commons.lang3.ArrayUtils.isSorted(T[],java.util.Comparator<T>)
*isSorted(T[] p0,java.util.Comparator<T> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> boolean isSorted(T[] p0,java.util.Comparator<T> p1){
	return org.apache.commons.lang3.ArrayUtils.isSorted(p0,p1);
}
/**
*{@link org.apache.commons.lang3.ArrayUtils#isSorted(T...)}
*@see org.apache.commons.lang3.ArrayUtils#isSorted(T...)
*<code>public static <T> boolean org.apache.commons.lang3.ArrayUtils.isSorted(T[])
*isSorted(T... p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T extends java.lang.Comparable<? super T> > boolean isSorted(T... p0){
	return org.apache.commons.lang3.ArrayUtils.isSorted(p0);
}
/**
*{@link org.apache.commons.lang3.StringUtils#join(T...)}
*@see org.apache.commons.lang3.StringUtils#join(T...)
*<code>public static <T> java.lang.String org.apache.commons.lang3.StringUtils.join(T...)
*join(T... p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> java.lang.String join(T... p0){
	return org.apache.commons.lang3.StringUtils.join(p0);
}
/**
*{@link org.apache.commons.lang3.ObjectUtils#max(T...)}
*@see org.apache.commons.lang3.ObjectUtils#max(T...)
*<code>public static <T> T org.apache.commons.lang3.ObjectUtils.max(T...)
*max(T... p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T extends java.lang.Comparable<? super T> > T max(T... p0){
	return org.apache.commons.lang3.ObjectUtils.max(p0);
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
*{@link org.apache.commons.lang3.ObjectUtils#median(T...)}
*@see org.apache.commons.lang3.ObjectUtils#median(T...)
*<code>public static <T> T org.apache.commons.lang3.ObjectUtils.median(T...)
*median(T... p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T extends java.lang.Comparable<? super T> > T median(T... p0){
	return org.apache.commons.lang3.ObjectUtils.median(p0);
}
/**
*{@link org.apache.commons.lang3.ObjectUtils#min(T...)}
*@see org.apache.commons.lang3.ObjectUtils#min(T...)
*<code>public static <T> T org.apache.commons.lang3.ObjectUtils.min(T...)
*min(T... p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T extends java.lang.Comparable<? super T> > T min(T... p0){
	return org.apache.commons.lang3.ObjectUtils.min(p0);
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
*{@link com.google.common.collect.ObjectArrays#newArray(T[],int)}
*@see com.google.common.collect.ObjectArrays#newArray(T[],int)
*<code>public static <T> T[] com.google.common.collect.ObjectArrays.newArray(T[],int)
*newArray(T[] p0,int p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> T[] newArray(T[] p0,int p1){
	return com.google.common.collect.ObjectArrays.newArray(p0,p1);
}
/**
*{@link org.apache.commons.lang3.Validate#noNullElements(T...)}
*@see org.apache.commons.lang3.Validate#noNullElements(T...)
*<code>public static <T> T[] org.apache.commons.lang3.Validate.noNullElements(T[])
*noNullElements(T... p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> T[] noNullElements(T... p0){
	return org.apache.commons.lang3.Validate.noNullElements(p0);
}
/**
*{@link org.apache.commons.lang3.Validate#noNullElements(T[],java.lang.String,java.lang.Object...)}
*@see org.apache.commons.lang3.Validate#noNullElements(T[],java.lang.String,java.lang.Object...)
*<code>public static <T> T[] org.apache.commons.lang3.Validate.noNullElements(T[],java.lang.String,java.lang.Object...)
*noNullElements(T[] p0,java.lang.String p1,java.lang.Object... p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> T[] noNullElements(T[] p0,java.lang.String p1,java.lang.Object... p2){
	return org.apache.commons.lang3.Validate.noNullElements(p0,p1,p2);
}
/**
*{@link org.apache.commons.lang3.Validate#notEmpty(T...)}
*@see org.apache.commons.lang3.Validate#notEmpty(T...)
*<code>public static <T> T[] org.apache.commons.lang3.Validate.notEmpty(T[])
*notEmpty(T... p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> T[] notEmpty(T... p0){
	return org.apache.commons.lang3.Validate.notEmpty(p0);
}
/**
*{@link org.apache.commons.lang3.Validate#notEmpty(T[],java.lang.String,java.lang.Object...)}
*@see org.apache.commons.lang3.Validate#notEmpty(T[],java.lang.String,java.lang.Object...)
*<code>public static <T> T[] org.apache.commons.lang3.Validate.notEmpty(T[],java.lang.String,java.lang.Object...)
*notEmpty(T[] p0,java.lang.String p1,java.lang.Object... p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> T[] notEmpty(T[] p0,java.lang.String p1,java.lang.Object... p2){
	return org.apache.commons.lang3.Validate.notEmpty(p0,p1,p2);
}
/**
*{@link org.apache.commons.lang3.ArrayUtils#nullToEmpty(T[],java.lang.Class<T[]>)}
*@see org.apache.commons.lang3.ArrayUtils#nullToEmpty(T[],java.lang.Class<T[]>)
*<code>public static <T> T[] org.apache.commons.lang3.ArrayUtils.nullToEmpty(T[],java.lang.Class<T[]>)
*nullToEmpty(T[] p0,java.lang.Class<T[]> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> T[] nullToEmpty(T[] p0,java.lang.Class<T[]> p1){
	return org.apache.commons.lang3.ArrayUtils.nullToEmpty(p0,p1);
}
/**
*{@link org.apache.commons.collections4.FluentIterable#of(T...)}
*@see org.apache.commons.collections4.FluentIterable#of(T...)
*<code>public static <T> org.apache.commons.collections4.FluentIterable<T> org.apache.commons.collections4.FluentIterable.of(T...)
*of(T... p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> org.apache.commons.collections4.FluentIterable<T> of(T... p0){
	return org.apache.commons.collections4.FluentIterable.of(p0);
}
/**
*{@link org.apache.commons.lang3.ArrayUtils#remove(T[],int)}
*@see org.apache.commons.lang3.ArrayUtils#remove(T[],int)
*<code>public static <T> T[] org.apache.commons.lang3.ArrayUtils.remove(T[],int)
*remove(T[] p0,int p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> T[] remove(T[] p0,int p1){
	return org.apache.commons.lang3.ArrayUtils.remove(p0,p1);
}
/**
*{@link org.apache.commons.lang3.ArrayUtils#removeAll(T[],int...)}
*@see org.apache.commons.lang3.ArrayUtils#removeAll(T[],int...)
*<code>public static <T> T[] org.apache.commons.lang3.ArrayUtils.removeAll(T[],int...)
*removeAll(T[] p0,int... p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> T[] removeAll(T[] p0,int... p1){
	return org.apache.commons.lang3.ArrayUtils.removeAll(p0,p1);
}
/**
*{@link org.apache.commons.lang3.ArrayUtils#removeAllOccurences(T[],T)}
*@see org.apache.commons.lang3.ArrayUtils#removeAllOccurences(T[],T)
*<code>public static <T> T[] org.apache.commons.lang3.ArrayUtils.removeAllOccurences(T[],T)
*removeAllOccurences(T[] p0,T p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> T[] removeAllOccurences(T[] p0,T p1){
	return org.apache.commons.lang3.ArrayUtils.removeAllOccurences(p0,p1);
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
*{@link org.apache.commons.lang3.ArrayUtils#removeElements(T[],T...)}
*@see org.apache.commons.lang3.ArrayUtils#removeElements(T[],T...)
*<code>public static <T> T[] org.apache.commons.lang3.ArrayUtils.removeElements(T[],T...)
*removeElements(T[] p0,T... p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> T[] removeElements(T[] p0,T... p1){
	return org.apache.commons.lang3.ArrayUtils.removeElements(p0,p1);
}
/**
*{@link org.apache.commons.lang3.ArrayUtils#subarray(T[],int,int)}
*@see org.apache.commons.lang3.ArrayUtils#subarray(T[],int,int)
*<code>public static <T> T[] org.apache.commons.lang3.ArrayUtils.subarray(T[],int,int)
*subarray(T[] p0,int p1,int p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> T[] subarray(T[] p0,int p1,int p2){
	return org.apache.commons.lang3.ArrayUtils.subarray(p0,p1,p2);
}
/**
*{@link org.apache.commons.lang3.ArrayUtils#toArray(T...)}
*@see org.apache.commons.lang3.ArrayUtils#toArray(T...)
*<code>public static <T> T[] org.apache.commons.lang3.ArrayUtils.toArray(T...)
*toArray(T... p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> T[] toArray(T... p0){
	return org.apache.commons.lang3.ArrayUtils.toArray(p0);
}
/**
*{@link org.apache.commons.lang3.Validate#validIndex(T[],int,java.lang.String,java.lang.Object...)}
*@see org.apache.commons.lang3.Validate#validIndex(T[],int,java.lang.String,java.lang.Object...)
*<code>public static <T> T[] org.apache.commons.lang3.Validate.validIndex(T[],int,java.lang.String,java.lang.Object...)
*validIndex(T[] p0,int p1,java.lang.String p2,java.lang.Object... p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> T[] validIndex(T[] p0,int p1,java.lang.String p2,java.lang.Object... p3){
	return org.apache.commons.lang3.Validate.validIndex(p0,p1,p2,p3);
}
/**
*{@link org.apache.commons.lang3.Validate#validIndex(T[],int)}
*@see org.apache.commons.lang3.Validate#validIndex(T[],int)
*<code>public static <T> T[] org.apache.commons.lang3.Validate.validIndex(T[],int)
*validIndex(T[] p0,int p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> T[] validIndex(T[] p0,int p1){
	return org.apache.commons.lang3.Validate.validIndex(p0,p1);
}
}
