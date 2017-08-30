package com.github.zengfr.supercommons;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class EnumerationUtil{ 
/**
*public static <T> java.util.Enumeration<T> com.google.common.collect.Iterators.asEnumeration(java.util.Iterator<T>)
*/ 
public static <T> java.util.Enumeration<T> asEnumeration(java.util.Iterator<T> p0){
	return com.google.common.collect.Iterators.asEnumeration(p0);
}
/**
*public static void org.apache.commons.collections.CollectionUtils.addAll(java.util.Collection,java.util.Enumeration)
*/ 
public static void addAll(java.util.Collection p0,java.util.Enumeration p1){
	 org.apache.commons.collections.CollectionUtils.addAll(p0,p1);
}
/**
*public static java.util.Enumeration org.apache.commons.collections.IteratorUtils.asEnumeration(java.util.Iterator)
*/ 
public static java.util.Enumeration asEnumeration(java.util.Iterator p0){
	return org.apache.commons.collections.IteratorUtils.asEnumeration(p0);
}
/**
*public static java.util.Iterator org.apache.commons.collections.IteratorUtils.asIterator(java.util.Enumeration,java.util.Collection)
*/ 
public static java.util.Iterator asIterator(java.util.Enumeration p0,java.util.Collection p1){
	return org.apache.commons.collections.IteratorUtils.asIterator(p0,p1);
}
/**
*public static java.util.Iterator org.apache.commons.collections.IteratorUtils.asIterator(java.util.Enumeration)
*/ 
public static java.util.Iterator asIterator(java.util.Enumeration p0){
	return org.apache.commons.collections.IteratorUtils.asIterator(p0);
}
/**
*public static java.util.List org.apache.commons.collections.EnumerationUtils.toList(java.util.Enumeration)
*/ 
public static java.util.List toList(java.util.Enumeration p0){
	return org.apache.commons.collections.EnumerationUtils.toList(p0);
}
/**
*public static <E> java.util.Enumeration<E> org.apache.commons.collections4.IteratorUtils.asEnumeration(java.util.Iterator<? extends E>)
*/ 
public static <E> java.util.Enumeration<E> asEnumeration(java.util.Iterator<? extends E> p0){
	return org.apache.commons.collections4.IteratorUtils.asEnumeration(p0);
}
}
