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
public final class UnmodifiableIteratorUtil{ 
/**
*{@link com.google.common.collect.Iterators#filter(java.util.Iterator<?>,java.lang.Class<T>)}
*@see com.google.common.collect.Iterators#filter(java.util.Iterator<?>,java.lang.Class<T>)
*<code>public static <T> com.google.common.collect.UnmodifiableIterator<T> com.google.common.collect.Iterators.filter(java.util.Iterator<?>,java.lang.Class<T>)
*filter(java.util.Iterator<?> p0,java.lang.Class<T> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> com.google.common.collect.UnmodifiableIterator<T> filter(java.util.Iterator<?> p0,java.lang.Class<T> p1){
	return com.google.common.collect.Iterators.filter(p0,p1);
}
/**
*{@link com.google.common.collect.Iterators#filter(java.util.Iterator<T>,com.google.common.base.Predicate<? super T>)}
*@see com.google.common.collect.Iterators#filter(java.util.Iterator<T>,com.google.common.base.Predicate<? super T>)
*<code>public static <T> com.google.common.collect.UnmodifiableIterator<T> com.google.common.collect.Iterators.filter(java.util.Iterator<T>,com.google.common.base.Predicate<? super T>)
*filter(java.util.Iterator<T> p0,com.google.common.base.Predicate<? super T> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> com.google.common.collect.UnmodifiableIterator<T> filter(java.util.Iterator<T> p0,com.google.common.base.Predicate<? super T> p1){
	return com.google.common.collect.Iterators.filter(p0,p1);
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
*{@link com.google.common.collect.Iterators#forEnumeration(java.util.Enumeration<T>)}
*@see com.google.common.collect.Iterators#forEnumeration(java.util.Enumeration<T>)
*<code>public static <T> com.google.common.collect.UnmodifiableIterator<T> com.google.common.collect.Iterators.forEnumeration(java.util.Enumeration<T>)
*forEnumeration(java.util.Enumeration<T> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> com.google.common.collect.UnmodifiableIterator<T> forEnumeration(java.util.Enumeration<T> p0){
	return com.google.common.collect.Iterators.forEnumeration(p0);
}
/**
*{@link com.google.common.collect.Iterators#mergeSorted(java.lang.Iterable<? extends java.util.Iterator<? extends T>>,java.util.Comparator<? super T>)}
*@see com.google.common.collect.Iterators#mergeSorted(java.lang.Iterable<? extends java.util.Iterator<? extends T>>,java.util.Comparator<? super T>)
*<code>public static <T> com.google.common.collect.UnmodifiableIterator<T> com.google.common.collect.Iterators.mergeSorted(java.lang.Iterable<? extends java.util.Iterator<? extends T>>,java.util.Comparator<? super T>)
*mergeSorted(java.lang.Iterable<? extends java.util.Iterator<? extends T>> p0,java.util.Comparator<? super T> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> com.google.common.collect.UnmodifiableIterator<T> mergeSorted(java.lang.Iterable<? extends java.util.Iterator<? extends T>> p0,java.util.Comparator<? super T> p1){
	return com.google.common.collect.Iterators.mergeSorted(p0,p1);
}
/**
*{@link com.google.common.collect.Iterators#paddedPartition(java.util.Iterator<T>,int)}
*@see com.google.common.collect.Iterators#paddedPartition(java.util.Iterator<T>,int)
*<code>public static <T> com.google.common.collect.UnmodifiableIterator<java.util.List<T>> com.google.common.collect.Iterators.paddedPartition(java.util.Iterator<T>,int)
*paddedPartition(java.util.Iterator<T> p0,int p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> com.google.common.collect.UnmodifiableIterator<java.util.List<T>> paddedPartition(java.util.Iterator<T> p0,int p1){
	return com.google.common.collect.Iterators.paddedPartition(p0,p1);
}
/**
*{@link com.google.common.collect.Iterators#partition(java.util.Iterator<T>,int)}
*@see com.google.common.collect.Iterators#partition(java.util.Iterator<T>,int)
*<code>public static <T> com.google.common.collect.UnmodifiableIterator<java.util.List<T>> com.google.common.collect.Iterators.partition(java.util.Iterator<T>,int)
*partition(java.util.Iterator<T> p0,int p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> com.google.common.collect.UnmodifiableIterator<java.util.List<T>> partition(java.util.Iterator<T> p0,int p1){
	return com.google.common.collect.Iterators.partition(p0,p1);
}
/**
*{@link com.google.common.collect.Iterators#singletonIterator(T)}
*@see com.google.common.collect.Iterators#singletonIterator(T)
*<code>public static <T> com.google.common.collect.UnmodifiableIterator<T> com.google.common.collect.Iterators.singletonIterator(T)
*singletonIterator(T p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> com.google.common.collect.UnmodifiableIterator<T> singletonIterator(T p0){
	return com.google.common.collect.Iterators.singletonIterator(p0);
}
/**
*{@link com.google.common.collect.Iterators#unmodifiableIterator(com.google.common.collect.UnmodifiableIterator<T>)}
*@see com.google.common.collect.Iterators#unmodifiableIterator(com.google.common.collect.UnmodifiableIterator<T>)
*<code>public static <T> com.google.common.collect.UnmodifiableIterator<T> com.google.common.collect.Iterators.unmodifiableIterator(com.google.common.collect.UnmodifiableIterator<T>)
*unmodifiableIterator(com.google.common.collect.UnmodifiableIterator<T> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> com.google.common.collect.UnmodifiableIterator<T> unmodifiableIterator(com.google.common.collect.UnmodifiableIterator<T> p0){
	return com.google.common.collect.Iterators.unmodifiableIterator(p0);
}
/**
*{@link com.google.common.collect.Iterators#unmodifiableIterator(java.util.Iterator<? extends T>)}
*@see com.google.common.collect.Iterators#unmodifiableIterator(java.util.Iterator<? extends T>)
*<code>public static <T> com.google.common.collect.UnmodifiableIterator<T> com.google.common.collect.Iterators.unmodifiableIterator(java.util.Iterator<? extends T>)
*unmodifiableIterator(java.util.Iterator<? extends T> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> com.google.common.collect.UnmodifiableIterator<T> unmodifiableIterator(java.util.Iterator<? extends T> p0){
	return com.google.common.collect.Iterators.unmodifiableIterator(p0);
}
}
