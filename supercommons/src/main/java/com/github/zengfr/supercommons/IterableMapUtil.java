package com.github.zengfr.supercommons;
import java.util.*;
import java.util.Map.Entry;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class IterableMapUtil{ 
/**
*public static <K,V> org.apache.commons.collections4.IterableMap<K, V> org.apache.commons.collections4.MapUtils.fixedSizeMap(java.util.Map<K, V>)
*/ 
public static <K,V> org.apache.commons.collections4.IterableMap<K, V> fixedSizeMap(java.util.Map<K, V> p0){
	return org.apache.commons.collections4.MapUtils.fixedSizeMap(p0);
}
/**
*public static <K,V> org.apache.commons.collections4.IterableMap<K, V> org.apache.commons.collections4.MapUtils.iterableMap(java.util.Map<K, V>)
*/ 
public static <K,V> org.apache.commons.collections4.IterableMap<K, V> iterableMap(java.util.Map<K, V> p0){
	return org.apache.commons.collections4.MapUtils.iterableMap(p0);
}
/**
*public static <K,V> org.apache.commons.collections4.IterableMap<K, V> org.apache.commons.collections4.MapUtils.lazyMap(java.util.Map<K, V>,org.apache.commons.collections4.Transformer<? super K, ? extends V>)
*/ 
public static <K,V> org.apache.commons.collections4.IterableMap<K, V> lazyMap(java.util.Map<K, V> p0,org.apache.commons.collections4.Transformer<? super K, ? extends V> p1){
	return org.apache.commons.collections4.MapUtils.lazyMap(p0,p1);
}
/**
*public static <K,V> org.apache.commons.collections4.IterableMap<K, V> org.apache.commons.collections4.MapUtils.lazyMap(java.util.Map<K, V>,org.apache.commons.collections4.Factory<? extends V>)
*/ 
public static <K,V> org.apache.commons.collections4.IterableMap<K, V> lazyMap(java.util.Map<K, V> p0,org.apache.commons.collections4.Factory<? extends V> p1){
	return org.apache.commons.collections4.MapUtils.lazyMap(p0,p1);
}
/**
*public static <K,V> org.apache.commons.collections4.IterableMap<K, V> org.apache.commons.collections4.MapUtils.predicatedMap(java.util.Map<K, V>,org.apache.commons.collections4.Predicate<? super K>,org.apache.commons.collections4.Predicate<? super V>)
*/ 
public static <K,V> org.apache.commons.collections4.IterableMap<K, V> predicatedMap(java.util.Map<K, V> p0,org.apache.commons.collections4.Predicate<? super K> p1,org.apache.commons.collections4.Predicate<? super V> p2){
	return org.apache.commons.collections4.MapUtils.predicatedMap(p0,p1,p2);
}
/**
*public static <K,V> org.apache.commons.collections4.IterableMap<K, V> org.apache.commons.collections4.SplitMapUtils.readableMap(org.apache.commons.collections4.Get<K, V>)
*/ 
public static <K,V> org.apache.commons.collections4.IterableMap<K, V> readableMap(org.apache.commons.collections4.Get<K, V> p0){
	return org.apache.commons.collections4.SplitMapUtils.readableMap(p0);
}
/**
*public static <K,V> org.apache.commons.collections4.IterableMap<K, V> org.apache.commons.collections4.MapUtils.transformedMap(java.util.Map<K, V>,org.apache.commons.collections4.Transformer<? super K, ? extends K>,org.apache.commons.collections4.Transformer<? super V, ? extends V>)
*/ 
public static <K,V> org.apache.commons.collections4.IterableMap<K, V> transformedMap(java.util.Map<K, V> p0,org.apache.commons.collections4.Transformer<? super K, ? extends K> p1,org.apache.commons.collections4.Transformer<? super V, ? extends V> p2){
	return org.apache.commons.collections4.MapUtils.transformedMap(p0,p1,p2);
}
}
