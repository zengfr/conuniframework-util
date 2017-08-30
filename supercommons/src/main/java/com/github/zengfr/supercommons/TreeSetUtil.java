package com.github.zengfr.supercommons;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class TreeSetUtil{ 
/**
*public static <E> java.util.TreeSet<E> com.google.common.collect.Sets.newTreeSet()
*/ 
public static <E extends java.lang.Comparable > java.util.TreeSet<E> newTreeSet(){
	return com.google.common.collect.Sets.newTreeSet();
}
/**
*public static <E> java.util.TreeSet<E> com.google.common.collect.Sets.newTreeSet(java.util.Comparator<? super E>)
*/ 
public static <E> java.util.TreeSet<E> newTreeSet(java.util.Comparator<? super E> p0){
	return com.google.common.collect.Sets.newTreeSet(p0);
}
/**
*public static <E> java.util.TreeSet<E> com.google.common.collect.Sets.newTreeSet(java.lang.Iterable<? extends E>)
*/ 
public static <E extends java.lang.Comparable > java.util.TreeSet<E> newTreeSet(java.lang.Iterable<? extends E> p0){
	return com.google.common.collect.Sets.newTreeSet(p0);
}
}
