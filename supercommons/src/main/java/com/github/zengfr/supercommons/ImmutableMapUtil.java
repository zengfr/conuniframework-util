package com.github.zengfr.supercommons;
import java.util.*;
import java.util.Map.Entry;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class ImmutableMapUtil{ 
/**
*public static <K,V> com.google.common.collect.ImmutableMap<K, V> com.google.common.collect.ImmutableMap.copyOf(java.lang.Iterable<? extends java.util.Map.java.util.Map$Entry<? extends K, ? extends V>>)
*/ 
public static <K,V> com.google.common.collect.ImmutableMap<K, V> copyOf(java.lang.Iterable<? extends Entry<? extends K, ? extends V>> p0){
	return com.google.common.collect.ImmutableMap.copyOf(p0);
}
/**
*public static <K,V> com.google.common.collect.ImmutableMap<K, V> com.google.common.collect.ImmutableMap.copyOf(java.util.Map<? extends K, ? extends V>)
*/ 
public static <K,V> com.google.common.collect.ImmutableMap<K, V> copyOf(java.util.Map<? extends K, ? extends V> p0){
	return com.google.common.collect.ImmutableMap.copyOf(p0);
}
/**
*public static com.google.common.collect.ImmutableMap<java.lang.String, java.lang.String> com.google.common.collect.Maps.fromProperties(java.util.Properties)
*/ 
public static com.google.common.collect.ImmutableMap<java.lang.String, java.lang.String> fromProperties(java.util.Properties p0){
	return com.google.common.collect.Maps.fromProperties(p0);
}
/**
*public static <K,V> com.google.common.collect.ImmutableMap<K, V> com.google.common.collect.Maps.immutableEnumMap(java.util.Map<K, ? extends V>)
*/ 
public static <K extends java.lang.Enum<K> ,V> com.google.common.collect.ImmutableMap<K, V> immutableEnumMap(java.util.Map<K, ? extends V> p0){
	return com.google.common.collect.Maps.immutableEnumMap(p0);
}
/**
*public static <K,V> com.google.common.collect.ImmutableMap<K, V> com.google.common.collect.ImmutableMap.of(K,V,K,V,K,V,K,V)
*/ 
public static <K,V> com.google.common.collect.ImmutableMap<K, V> of(K p0,V p1,K p2,V p3,K p4,V p5,K p6,V p7){
	return com.google.common.collect.ImmutableMap.of(p0,p1,p2,p3,p4,p5,p6,p7);
}
/**
*public static <K,V> com.google.common.collect.ImmutableMap<K, V> com.google.common.collect.ImmutableMap.of(K,V,K,V,K,V,K,V,K,V)
*/ 
public static <K,V> com.google.common.collect.ImmutableMap<K, V> of(K p0,V p1,K p2,V p3,K p4,V p5,K p6,V p7,K p8,V p9){
	return com.google.common.collect.ImmutableMap.of(p0,p1,p2,p3,p4,p5,p6,p7,p8,p9);
}
/**
*public static <K,V> com.google.common.collect.ImmutableMap<K, V> com.google.common.collect.ImmutableMap.of()
*/ 
public static <K,V> com.google.common.collect.ImmutableMap<K, V> of(){
	return com.google.common.collect.ImmutableMap.of();
}
/**
*public static <K,V> com.google.common.collect.ImmutableMap<K, V> com.google.common.collect.ImmutableMap.of(K,V,K,V,K,V)
*/ 
public static <K,V> com.google.common.collect.ImmutableMap<K, V> of(K p0,V p1,K p2,V p3,K p4,V p5){
	return com.google.common.collect.ImmutableMap.of(p0,p1,p2,p3,p4,p5);
}
/**
*public static <K,V> com.google.common.collect.ImmutableMap<K, V> com.google.common.collect.ImmutableMap.of(K,V,K,V)
*/ 
public static <K,V> com.google.common.collect.ImmutableMap<K, V> of(K p0,V p1,K p2,V p3){
	return com.google.common.collect.ImmutableMap.of(p0,p1,p2,p3);
}
/**
*public static <K,V> com.google.common.collect.ImmutableMap<K, V> com.google.common.collect.ImmutableMap.of(K,V)
*/ 
public static <K,V> com.google.common.collect.ImmutableMap<K, V> of(K p0,V p1){
	return com.google.common.collect.ImmutableMap.of(p0,p1);
}
/**
*public static <K,V> com.google.common.collect.ImmutableMap<K, V> com.google.common.collect.Maps.toMap(java.util.Iterator<K>,com.google.common.base.Function<? super K, V>)
*/ 
public static <K,V> com.google.common.collect.ImmutableMap<K, V> toMap(java.util.Iterator<K> p0,com.google.common.base.Function<? super K, V> p1){
	return com.google.common.collect.Maps.toMap(p0,p1);
}
/**
*public static <K,V> com.google.common.collect.ImmutableMap<K, V> com.google.common.collect.Maps.toMap(java.lang.Iterable<K>,com.google.common.base.Function<? super K, V>)
*/ 
public static <K,V> com.google.common.collect.ImmutableMap<K, V> toMap(java.lang.Iterable<K> p0,com.google.common.base.Function<? super K, V> p1){
	return com.google.common.collect.Maps.toMap(p0,p1);
}
/**
*public static <K,V> com.google.common.collect.ImmutableMap<K, V> com.google.common.collect.Maps.uniqueIndex(java.util.Iterator<V>,com.google.common.base.Function<? super V, K>)
*/ 
public static <K,V> com.google.common.collect.ImmutableMap<K, V> uniqueIndex(java.util.Iterator<V> p0,com.google.common.base.Function<? super V, K> p1){
	return com.google.common.collect.Maps.uniqueIndex(p0,p1);
}
/**
*public static <K,V> com.google.common.collect.ImmutableMap<K, V> com.google.common.collect.Maps.uniqueIndex(java.lang.Iterable<V>,com.google.common.base.Function<? super V, K>)
*/ 
public static <K,V> com.google.common.collect.ImmutableMap<K, V> uniqueIndex(java.lang.Iterable<V> p0,com.google.common.base.Function<? super V, K> p1){
	return com.google.common.collect.Maps.uniqueIndex(p0,p1);
}
}
