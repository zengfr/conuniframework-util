package com.github.zengfr.supercommons;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class NavigableSetUtil{ 
/**
*public static <E> java.util.NavigableSet<E> com.google.common.collect.Sets.synchronizedNavigableSet(java.util.NavigableSet<E>)
*/ 
public static <E> java.util.NavigableSet<E> synchronizedNavigableSet(java.util.NavigableSet<E> p0){
	return com.google.common.collect.Sets.synchronizedNavigableSet(p0);
}
/**
*public static <E> java.util.NavigableSet<E> com.google.common.collect.Sets.unmodifiableNavigableSet(java.util.NavigableSet<E>)
*/ 
public static <E> java.util.NavigableSet<E> unmodifiableNavigableSet(java.util.NavigableSet<E> p0){
	return com.google.common.collect.Sets.unmodifiableNavigableSet(p0);
}
/**
*public static <E> java.util.NavigableSet<E> com.google.common.collect.Sets.filter(java.util.NavigableSet<E>,com.google.common.base.Predicate<? super E>)
*/ 
public static <E> java.util.NavigableSet<E> filter(java.util.NavigableSet<E> p0,com.google.common.base.Predicate<? super E> p1){
	return com.google.common.collect.Sets.filter(p0,p1);
}
}
