package com.github.zengfr.supercommons;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class MultisetUtil{ 
/**
*public static <E> com.google.common.collect.Multiset<E> com.google.common.collect.Multisets.sum(com.google.common.collect.Multiset<? extends E>,com.google.common.collect.Multiset<? extends E>)
*/ 
public static <E> com.google.common.collect.Multiset<E> sum(com.google.common.collect.Multiset<? extends E> p0,com.google.common.collect.Multiset<? extends E> p1){
	return com.google.common.collect.Multisets.sum(p0,p1);
}
/**
*public static <E> com.google.common.collect.Multiset<E> com.google.common.collect.Multisets.filter(com.google.common.collect.Multiset<E>,com.google.common.base.Predicate<? super E>)
*/ 
public static <E> com.google.common.collect.Multiset<E> filter(com.google.common.collect.Multiset<E> p0,com.google.common.base.Predicate<? super E> p1){
	return com.google.common.collect.Multisets.filter(p0,p1);
}
/**
*public static <E> com.google.common.collect.Multiset<E> com.google.common.collect.Multisets.intersection(com.google.common.collect.Multiset<E>,com.google.common.collect.Multiset<?>)
*/ 
public static <E> com.google.common.collect.Multiset<E> intersection(com.google.common.collect.Multiset<E> p0,com.google.common.collect.Multiset<?> p1){
	return com.google.common.collect.Multisets.intersection(p0,p1);
}
/**
*public static <E> com.google.common.collect.Multiset<E> com.google.common.collect.Multisets.union(com.google.common.collect.Multiset<? extends E>,com.google.common.collect.Multiset<? extends E>)
*/ 
public static <E> com.google.common.collect.Multiset<E> union(com.google.common.collect.Multiset<? extends E> p0,com.google.common.collect.Multiset<? extends E> p1){
	return com.google.common.collect.Multisets.union(p0,p1);
}
/**
*public static <E> com.google.common.collect.Multiset<E> com.google.common.collect.Multisets.difference(com.google.common.collect.Multiset<E>,com.google.common.collect.Multiset<?>)
*/ 
public static <E> com.google.common.collect.Multiset<E> difference(com.google.common.collect.Multiset<E> p0,com.google.common.collect.Multiset<?> p1){
	return com.google.common.collect.Multisets.difference(p0,p1);
}
/**
*public static <E> com.google.common.collect.Multiset<E> com.google.common.collect.Multisets.unmodifiableMultiset(com.google.common.collect.ImmutableMultiset<E>)
*/ 
public static <E> com.google.common.collect.Multiset<E> unmodifiableMultiset(com.google.common.collect.ImmutableMultiset<E> p0){
	return com.google.common.collect.Multisets.unmodifiableMultiset(p0);
}
/**
*public static <E> com.google.common.collect.Multiset<E> com.google.common.collect.Multisets.unmodifiableMultiset(com.google.common.collect.Multiset<? extends E>)
*/ 
public static <E> com.google.common.collect.Multiset<E> unmodifiableMultiset(com.google.common.collect.Multiset<? extends E> p0){
	return com.google.common.collect.Multisets.unmodifiableMultiset(p0);
}
}
