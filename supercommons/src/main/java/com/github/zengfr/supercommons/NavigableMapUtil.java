package com.github.zengfr.supercommons;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class NavigableMapUtil{ 
/**
*public static <K,V> java.util.NavigableMap<K, V> com.google.common.collect.Maps.synchronizedNavigableMap(java.util.NavigableMap<K, V>)
*/ 
public static <K,V> java.util.NavigableMap<K, V> synchronizedNavigableMap(java.util.NavigableMap<K, V> p0){
	return com.google.common.collect.Maps.synchronizedNavigableMap(p0);
}
/**
*public static <K,V> java.util.NavigableMap<K, V> com.google.common.collect.Maps.unmodifiableNavigableMap(java.util.NavigableMap<K, V>)
*/ 
public static <K,V> java.util.NavigableMap<K, V> unmodifiableNavigableMap(java.util.NavigableMap<K, V> p0){
	return com.google.common.collect.Maps.unmodifiableNavigableMap(p0);
}
/**
*public static <K,V> java.util.NavigableMap<K, V> com.google.common.collect.Maps.asMap(java.util.NavigableSet<K>,com.google.common.base.Function<? super K, V>)
*/ 
public static <K,V> java.util.NavigableMap<K, V> asMap(java.util.NavigableSet<K> p0,com.google.common.base.Function<? super K, V> p1){
	return com.google.common.collect.Maps.asMap(p0,p1);
}
/**
*public static <K,V> java.util.NavigableMap<K, V> com.google.common.collect.Maps.filterKeys(java.util.NavigableMap<K, V>,com.google.common.base.Predicate<? super K>)
*/ 
public static <K,V> java.util.NavigableMap<K, V> filterKeys(java.util.NavigableMap<K, V> p0,com.google.common.base.Predicate<? super K> p1){
	return com.google.common.collect.Maps.filterKeys(p0,p1);
}
/**
*public static <K,V> java.util.NavigableMap<K, V> com.google.common.collect.Maps.filterValues(java.util.NavigableMap<K, V>,com.google.common.base.Predicate<? super V>)
*/ 
public static <K,V> java.util.NavigableMap<K, V> filterValues(java.util.NavigableMap<K, V> p0,com.google.common.base.Predicate<? super V> p1){
	return com.google.common.collect.Maps.filterValues(p0,p1);
}
/**
*public static <K,V1,V2> java.util.NavigableMap<K, V2> com.google.common.collect.Maps.transformEntries(java.util.NavigableMap<K, V1>,com.google.common.collect.Maps.com.google.common.collect.Maps$EntryTransformer<? super K, ? super V1, V2>)
*/ 
public static <K,V1,V2> java.util.NavigableMap<K, V2> transformEntries(java.util.NavigableMap<K, V1> p0,EntryTransformer<? super K, ? super V1, V2> p1){
	return com.google.common.collect.Maps.transformEntries(p0,p1);
}
/**
*public static <K,V1,V2> java.util.NavigableMap<K, V2> com.google.common.collect.Maps.transformValues(java.util.NavigableMap<K, V1>,com.google.common.base.Function<? super V1, V2>)
*/ 
public static <K,V1,V2> java.util.NavigableMap<K, V2> transformValues(java.util.NavigableMap<K, V1> p0,com.google.common.base.Function<? super V1, V2> p1){
	return com.google.common.collect.Maps.transformValues(p0,p1);
}
/**
*public static <K,V> java.util.NavigableMap<K, V> com.google.common.collect.Maps.filterEntries(java.util.NavigableMap<K, V>,com.google.common.base.Predicate<? super java.util.Map.java.util.Map$Entry<K, V>>)
*/ 
public static <K,V> java.util.NavigableMap<K, V> filterEntries(java.util.NavigableMap<K, V> p0,com.google.common.base.Predicate<? super Entry<K, V>> p1){
	return com.google.common.collect.Maps.filterEntries(p0,p1);
}
}
