package com.github.zengfr.supercommons;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class ListMultimapUtil{ 
/**
*public static <K,V> com.google.common.collect.ListMultimap<K, V> com.google.common.collect.MapConstraints.constrainedListMultimap(com.google.common.collect.ListMultimap<K, V>,com.google.common.collect.MapConstraint<? super K, ? super V>)
*/ 
public static <K,V> com.google.common.collect.ListMultimap<K, V> constrainedListMultimap(com.google.common.collect.ListMultimap<K, V> p0,com.google.common.collect.MapConstraint<? super K, ? super V> p1){
	return com.google.common.collect.MapConstraints.constrainedListMultimap(p0,p1);
}
/**
*public static <K,V> com.google.common.collect.ListMultimap<K, V> com.google.common.collect.Multimaps.newListMultimap(java.util.Map<K, java.util.Collection<V>>,com.google.common.base.Supplier<? extends java.util.List<V>>)
*/ 
public static <K,V> com.google.common.collect.ListMultimap<K, V> newListMultimap(java.util.Map<K, java.util.Collection<V>> p0,com.google.common.base.Supplier<? extends java.util.List<V>> p1){
	return com.google.common.collect.Multimaps.newListMultimap(p0,p1);
}
/**
*public static <K,V> com.google.common.collect.ListMultimap<K, V> com.google.common.collect.Multimaps.synchronizedListMultimap(com.google.common.collect.ListMultimap<K, V>)
*/ 
public static <K,V> com.google.common.collect.ListMultimap<K, V> synchronizedListMultimap(com.google.common.collect.ListMultimap<K, V> p0){
	return com.google.common.collect.Multimaps.synchronizedListMultimap(p0);
}
/**
*public static <K,V> com.google.common.collect.ListMultimap<K, V> com.google.common.collect.Multimaps.unmodifiableListMultimap(com.google.common.collect.ListMultimap<K, V>)
*/ 
public static <K,V> com.google.common.collect.ListMultimap<K, V> unmodifiableListMultimap(com.google.common.collect.ListMultimap<K, V> p0){
	return com.google.common.collect.Multimaps.unmodifiableListMultimap(p0);
}
/**
*public static <K,V> com.google.common.collect.ListMultimap<K, V> com.google.common.collect.Multimaps.unmodifiableListMultimap(com.google.common.collect.ImmutableListMultimap<K, V>)
*/ 
public static <K,V> com.google.common.collect.ListMultimap<K, V> unmodifiableListMultimap(com.google.common.collect.ImmutableListMultimap<K, V> p0){
	return com.google.common.collect.Multimaps.unmodifiableListMultimap(p0);
}
/**
*public static <K,V> com.google.common.collect.ListMultimap<K, V> com.google.common.collect.Multimaps.filterKeys(com.google.common.collect.ListMultimap<K, V>,com.google.common.base.Predicate<? super K>)
*/ 
public static <K,V> com.google.common.collect.ListMultimap<K, V> filterKeys(com.google.common.collect.ListMultimap<K, V> p0,com.google.common.base.Predicate<? super K> p1){
	return com.google.common.collect.Multimaps.filterKeys(p0,p1);
}
/**
*public static <K,V1,V2> com.google.common.collect.ListMultimap<K, V2> com.google.common.collect.Multimaps.transformEntries(com.google.common.collect.ListMultimap<K, V1>,com.google.common.collect.Maps.com.google.common.collect.Maps$EntryTransformer<? super K, ? super V1, V2>)
*/ 
public static <K,V1,V2> com.google.common.collect.ListMultimap<K, V2> transformEntries(com.google.common.collect.ListMultimap<K, V1> p0,EntryTransformer<? super K, ? super V1, V2> p1){
	return com.google.common.collect.Multimaps.transformEntries(p0,p1);
}
/**
*public static <K,V1,V2> com.google.common.collect.ListMultimap<K, V2> com.google.common.collect.Multimaps.transformValues(com.google.common.collect.ListMultimap<K, V1>,com.google.common.base.Function<? super V1, V2>)
*/ 
public static <K,V1,V2> com.google.common.collect.ListMultimap<K, V2> transformValues(com.google.common.collect.ListMultimap<K, V1> p0,com.google.common.base.Function<? super V1, V2> p1){
	return com.google.common.collect.Multimaps.transformValues(p0,p1);
}
}
