package com.github.zengfr.supercommons;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class UnmodifiableIteratorUtil{ 
/**
*public static <T> com.google.common.collect.UnmodifiableIterator<T> com.google.common.collect.Iterators.emptyIterator()
*/ 
public static <T> com.google.common.collect.UnmodifiableIterator<T> emptyIterator(){
	return com.google.common.collect.Iterators.emptyIterator();
}
/**
*public static <T> com.google.common.collect.UnmodifiableIterator<T> com.google.common.collect.Iterators.singletonIterator(T)
*/ 
public static <T> com.google.common.collect.UnmodifiableIterator<T> singletonIterator(T p0){
	return com.google.common.collect.Iterators.singletonIterator(p0);
}
/**
*public static <T> com.google.common.collect.UnmodifiableIterator<T> com.google.common.collect.Iterators.filter(java.util.Iterator<T>,com.google.common.base.Predicate<? super T>)
*/ 
public static <T> com.google.common.collect.UnmodifiableIterator<T> filter(java.util.Iterator<T> p0,com.google.common.base.Predicate<? super T> p1){
	return com.google.common.collect.Iterators.filter(p0,p1);
}
/**
*public static <T> com.google.common.collect.UnmodifiableIterator<T> com.google.common.collect.Iterators.filter(java.util.Iterator<?>,java.lang.Class<T>)
*/ 
public static <T> com.google.common.collect.UnmodifiableIterator<T> filter(java.util.Iterator<?> p0,java.lang.Class<T> p1){
	return com.google.common.collect.Iterators.filter(p0,p1);
}
/**
*public static <T> com.google.common.collect.UnmodifiableIterator<T> com.google.common.collect.Iterators.forEnumeration(java.util.Enumeration<T>)
*/ 
public static <T> com.google.common.collect.UnmodifiableIterator<T> forEnumeration(java.util.Enumeration<T> p0){
	return com.google.common.collect.Iterators.forEnumeration(p0);
}
/**
*public static <T> com.google.common.collect.UnmodifiableIterator<java.util.List<T>> com.google.common.collect.Iterators.partition(java.util.Iterator<T>,int)
*/ 
public static <T> com.google.common.collect.UnmodifiableIterator<java.util.List<T>> partition(java.util.Iterator<T> p0,int p1){
	return com.google.common.collect.Iterators.partition(p0,p1);
}
/**
*public static <T> com.google.common.collect.UnmodifiableIterator<T> com.google.common.collect.Iterators.mergeSorted(java.lang.Iterable<? extends java.util.Iterator<? extends T>>,java.util.Comparator<? super T>)
*/ 
public static <T> com.google.common.collect.UnmodifiableIterator<T> mergeSorted(java.lang.Iterable<? extends java.util.Iterator<? extends T>> p0,java.util.Comparator<? super T> p1){
	return com.google.common.collect.Iterators.mergeSorted(p0,p1);
}
/**
*public static <T> com.google.common.collect.UnmodifiableIterator<java.util.List<T>> com.google.common.collect.Iterators.paddedPartition(java.util.Iterator<T>,int)
*/ 
public static <T> com.google.common.collect.UnmodifiableIterator<java.util.List<T>> paddedPartition(java.util.Iterator<T> p0,int p1){
	return com.google.common.collect.Iterators.paddedPartition(p0,p1);
}
/**
*public static <T> com.google.common.collect.UnmodifiableIterator<T> com.google.common.collect.Iterators.forArray(T...)
*/ 
public static <T> com.google.common.collect.UnmodifiableIterator<T> forArray(T... p0){
	return com.google.common.collect.Iterators.forArray(p0);
}
/**
*public static <T> com.google.common.collect.UnmodifiableIterator<T> com.google.common.collect.Iterators.unmodifiableIterator(com.google.common.collect.UnmodifiableIterator<T>)
*/ 
public static <T> com.google.common.collect.UnmodifiableIterator<T> unmodifiableIterator(com.google.common.collect.UnmodifiableIterator<T> p0){
	return com.google.common.collect.Iterators.unmodifiableIterator(p0);
}
/**
*public static <T> com.google.common.collect.UnmodifiableIterator<T> com.google.common.collect.Iterators.unmodifiableIterator(java.util.Iterator<T>)
*/ 
public static <T> com.google.common.collect.UnmodifiableIterator<T> unmodifiableIterator(java.util.Iterator<T> p0){
	return com.google.common.collect.Iterators.unmodifiableIterator(p0);
}
}
