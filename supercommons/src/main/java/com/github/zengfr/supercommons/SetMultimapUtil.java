package com.github.zengfr.supercommons;
import java.util.*;
import java.util.Map.Entry;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class SetMultimapUtil{ 
/**
*public static <K,V> com.google.common.collect.SetMultimap<K, V> com.google.common.collect.MapConstraints.constrainedSetMultimap(com.google.common.collect.SetMultimap<K, V>,com.google.common.collect.MapConstraint<? super K, ? super V>)
*/ 
public static <K,V> com.google.common.collect.SetMultimap<K, V> constrainedSetMultimap(com.google.common.collect.SetMultimap<K, V> p0,com.google.common.collect.MapConstraint<? super K, ? super V> p1){
	return com.google.common.collect.MapConstraints.constrainedSetMultimap(p0,p1);
}
/**
*public static <K,V> com.google.common.collect.SetMultimap<K, V> com.google.common.collect.Multimaps.filterEntries(com.google.common.collect.SetMultimap<K, V>,com.google.common.base.Predicate<? super java.util.Map.java.util.Map$Entry<K, V>>)
*/ 
public static <K,V> com.google.common.collect.SetMultimap<K, V> filterEntries(com.google.common.collect.SetMultimap<K, V> p0,com.google.common.base.Predicate<? super Entry<K, V>> p1){
	return com.google.common.collect.Multimaps.filterEntries(p0,p1);
}
/**
*public static <K,V> com.google.common.collect.SetMultimap<K, V> com.google.common.collect.Multimaps.filterKeys(com.google.common.collect.SetMultimap<K, V>,com.google.common.base.Predicate<? super K>)
*/ 
public static <K,V> com.google.common.collect.SetMultimap<K, V> filterKeys(com.google.common.collect.SetMultimap<K, V> p0,com.google.common.base.Predicate<? super K> p1){
	return com.google.common.collect.Multimaps.filterKeys(p0,p1);
}
/**
*public static <K,V> com.google.common.collect.SetMultimap<K, V> com.google.common.collect.Multimaps.filterValues(com.google.common.collect.SetMultimap<K, V>,com.google.common.base.Predicate<? super V>)
*/ 
public static <K,V> com.google.common.collect.SetMultimap<K, V> filterValues(com.google.common.collect.SetMultimap<K, V> p0,com.google.common.base.Predicate<? super V> p1){
	return com.google.common.collect.Multimaps.filterValues(p0,p1);
}
/**
*public static <K,V> com.google.common.collect.SetMultimap<K, V> com.google.common.collect.Multimaps.forMap(java.util.Map<K, V>)
*/ 
public static <K,V> com.google.common.collect.SetMultimap<K, V> forMap(java.util.Map<K, V> p0){
	return com.google.common.collect.Multimaps.forMap(p0);
}
/**
*public static <K,V> com.google.common.collect.SetMultimap<K, V> com.google.common.collect.Multimaps.newSetMultimap(java.util.Map<K, java.util.Collection<V>>,com.google.common.base.Supplier<? extends java.util.Set<V>>)
*/ 
public static <K,V> com.google.common.collect.SetMultimap<K, V> newSetMultimap(java.util.Map<K, java.util.Collection<V>> p0,com.google.common.base.Supplier<? extends java.util.Set<V>> p1){
	return com.google.common.collect.Multimaps.newSetMultimap(p0,p1);
}
/**
*public static <K,V> com.google.common.collect.SetMultimap<K, V> com.google.common.collect.Multimaps.synchronizedSetMultimap(com.google.common.collect.SetMultimap<K, V>)
*/ 
public static <K,V> com.google.common.collect.SetMultimap<K, V> synchronizedSetMultimap(com.google.common.collect.SetMultimap<K, V> p0){
	return com.google.common.collect.Multimaps.synchronizedSetMultimap(p0);
}
/**
*public static <K,V> com.google.common.collect.SetMultimap<K, V> com.google.common.collect.Multimaps.unmodifiableSetMultimap(com.google.common.collect.SetMultimap<K, V>)
*/ 
public static <K,V> com.google.common.collect.SetMultimap<K, V> unmodifiableSetMultimap(com.google.common.collect.SetMultimap<K, V> p0){
	return com.google.common.collect.Multimaps.unmodifiableSetMultimap(p0);
}
/**
*public static <K,V> com.google.common.collect.SetMultimap<K, V> com.google.common.collect.Multimaps.unmodifiableSetMultimap(com.google.common.collect.ImmutableSetMultimap<K, V>)
*/ 
public static <K,V> com.google.common.collect.SetMultimap<K, V> unmodifiableSetMultimap(com.google.common.collect.ImmutableSetMultimap<K, V> p0){
	return com.google.common.collect.Multimaps.unmodifiableSetMultimap(p0);
}
}
