package com.github.zengfr.supercommons;
import java.util.*;
import java.util.Map.Entry;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class MultimapUtil{ 
/**
*public static <K,V> com.google.common.collect.Multimap<K, V> com.google.common.collect.MapConstraints.constrainedMultimap(com.google.common.collect.Multimap<K, V>,com.google.common.collect.MapConstraint<? super K, ? super V>)
*/ 
public static <K,V> com.google.common.collect.Multimap<K, V> constrainedMultimap(com.google.common.collect.Multimap<K, V> p0,com.google.common.collect.MapConstraint<? super K, ? super V> p1){
	return com.google.common.collect.MapConstraints.constrainedMultimap(p0,p1);
}
/**
*public static <K,V> com.google.common.collect.Multimap<K, V> com.google.common.collect.Multimaps.filterEntries(com.google.common.collect.Multimap<K, V>,com.google.common.base.Predicate<? super java.util.Map.java.util.Map$Entry<K, V>>)
*/ 
public static <K,V> com.google.common.collect.Multimap<K, V> filterEntries(com.google.common.collect.Multimap<K, V> p0,com.google.common.base.Predicate<? super Entry<K, V>> p1){
	return com.google.common.collect.Multimaps.filterEntries(p0,p1);
}
/**
*public static <K,V> com.google.common.collect.Multimap<K, V> com.google.common.collect.Multimaps.filterKeys(com.google.common.collect.Multimap<K, V>,com.google.common.base.Predicate<? super K>)
*/ 
public static <K,V> com.google.common.collect.Multimap<K, V> filterKeys(com.google.common.collect.Multimap<K, V> p0,com.google.common.base.Predicate<? super K> p1){
	return com.google.common.collect.Multimaps.filterKeys(p0,p1);
}
/**
*public static <K,V> com.google.common.collect.Multimap<K, V> com.google.common.collect.Multimaps.filterValues(com.google.common.collect.Multimap<K, V>,com.google.common.base.Predicate<? super V>)
*/ 
public static <K,V> com.google.common.collect.Multimap<K, V> filterValues(com.google.common.collect.Multimap<K, V> p0,com.google.common.base.Predicate<? super V> p1){
	return com.google.common.collect.Multimaps.filterValues(p0,p1);
}
/**
*public static <K,V,M> M com.google.common.collect.Multimaps.invertFrom(com.google.common.collect.Multimap<? extends V, ? extends K>,M)
*/ 
public static <K,V,M extends com.google.common.collect.Multimap<K, V> > M invertFrom(com.google.common.collect.Multimap<? extends V, ? extends K> p0,M p1){
	return com.google.common.collect.Multimaps.invertFrom(p0,p1);
}
/**
*public static <K,V> com.google.common.collect.Multimap<K, V> com.google.common.collect.Multimaps.newMultimap(java.util.Map<K, java.util.Collection<V>>,com.google.common.base.Supplier<? extends java.util.Collection<V>>)
*/ 
public static <K,V> com.google.common.collect.Multimap<K, V> newMultimap(java.util.Map<K, java.util.Collection<V>> p0,com.google.common.base.Supplier<? extends java.util.Collection<V>> p1){
	return com.google.common.collect.Multimaps.newMultimap(p0,p1);
}
/**
*public static <K,V> com.google.common.collect.Multimap<K, V> com.google.common.collect.Multimaps.synchronizedMultimap(com.google.common.collect.Multimap<K, V>)
*/ 
public static <K,V> com.google.common.collect.Multimap<K, V> synchronizedMultimap(com.google.common.collect.Multimap<K, V> p0){
	return com.google.common.collect.Multimaps.synchronizedMultimap(p0);
}
/**
*public static <K,V1,V2> com.google.common.collect.Multimap<K, V2> com.google.common.collect.Multimaps.transformEntries(com.google.common.collect.Multimap<K, V1>,com.google.common.collect.Maps.com.google.common.collect.Maps$EntryTransformer<? super K, ? super V1, V2>)
*/ 
public static <K,V1,V2> com.google.common.collect.Multimap<K, V2> transformEntries(com.google.common.collect.Multimap<K, V1> p0,EntryTransformer<? super K, ? super V1, V2> p1){
	return com.google.common.collect.Multimaps.transformEntries(p0,p1);
}
/**
*public static <K,V1,V2> com.google.common.collect.Multimap<K, V2> com.google.common.collect.Multimaps.transformValues(com.google.common.collect.Multimap<K, V1>,com.google.common.base.Function<? super V1, V2>)
*/ 
public static <K,V1,V2> com.google.common.collect.Multimap<K, V2> transformValues(com.google.common.collect.Multimap<K, V1> p0,com.google.common.base.Function<? super V1, V2> p1){
	return com.google.common.collect.Multimaps.transformValues(p0,p1);
}
/**
*public static <K,V> com.google.common.collect.Multimap<K, V> com.google.common.collect.Multimaps.unmodifiableMultimap(com.google.common.collect.Multimap<K, V>)
*/ 
public static <K,V> com.google.common.collect.Multimap<K, V> unmodifiableMultimap(com.google.common.collect.Multimap<K, V> p0){
	return com.google.common.collect.Multimaps.unmodifiableMultimap(p0);
}
/**
*public static <K,V> com.google.common.collect.Multimap<K, V> com.google.common.collect.Multimaps.unmodifiableMultimap(com.google.common.collect.ImmutableMultimap<K, V>)
*/ 
public static <K,V> com.google.common.collect.Multimap<K, V> unmodifiableMultimap(com.google.common.collect.ImmutableMultimap<K, V> p0){
	return com.google.common.collect.Multimaps.unmodifiableMultimap(p0);
}
}
