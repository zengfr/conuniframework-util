package com.github.zengfr.supercommons;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class SortedSetMultimapUtil{ 
/**
*public static <K,V> com.google.common.collect.SortedSetMultimap<K, V> com.google.common.collect.MapConstraints.constrainedSortedSetMultimap(com.google.common.collect.SortedSetMultimap<K, V>,com.google.common.collect.MapConstraint<? super K, ? super V>)
*/ 
public static <K,V> com.google.common.collect.SortedSetMultimap<K, V> constrainedSortedSetMultimap(com.google.common.collect.SortedSetMultimap<K, V> p0,com.google.common.collect.MapConstraint<? super K, ? super V> p1){
	return com.google.common.collect.MapConstraints.constrainedSortedSetMultimap(p0,p1);
}
/**
*public static <K,V> com.google.common.collect.SortedSetMultimap<K, V> com.google.common.collect.Multimaps.unmodifiableSortedSetMultimap(com.google.common.collect.SortedSetMultimap<K, V>)
*/ 
public static <K,V> com.google.common.collect.SortedSetMultimap<K, V> unmodifiableSortedSetMultimap(com.google.common.collect.SortedSetMultimap<K, V> p0){
	return com.google.common.collect.Multimaps.unmodifiableSortedSetMultimap(p0);
}
/**
*public static <K,V> com.google.common.collect.SortedSetMultimap<K, V> com.google.common.collect.Multimaps.newSortedSetMultimap(java.util.Map<K, java.util.Collection<V>>,com.google.common.base.Supplier<? extends java.util.SortedSet<V>>)
*/ 
public static <K,V> com.google.common.collect.SortedSetMultimap<K, V> newSortedSetMultimap(java.util.Map<K, java.util.Collection<V>> p0,com.google.common.base.Supplier<? extends java.util.SortedSet<V>> p1){
	return com.google.common.collect.Multimaps.newSortedSetMultimap(p0,p1);
}
/**
*public static <K,V> com.google.common.collect.SortedSetMultimap<K, V> com.google.common.collect.Multimaps.synchronizedSortedSetMultimap(com.google.common.collect.SortedSetMultimap<K, V>)
*/ 
public static <K,V> com.google.common.collect.SortedSetMultimap<K, V> synchronizedSortedSetMultimap(com.google.common.collect.SortedSetMultimap<K, V> p0){
	return com.google.common.collect.Multimaps.synchronizedSortedSetMultimap(p0);
}
}
