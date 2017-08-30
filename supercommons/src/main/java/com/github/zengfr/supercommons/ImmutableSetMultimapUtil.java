package com.github.zengfr.supercommons;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class ImmutableSetMultimapUtil{ 
/**
*public static <K,V> com.google.common.collect.ImmutableSetMultimap<K, V> com.google.common.collect.ImmutableSetMultimap.copyOf(com.google.common.collect.Multimap<? extends K, ? extends V>)
*/ 
public static <K,V> com.google.common.collect.ImmutableSetMultimap<K, V> copyOf(com.google.common.collect.Multimap<? extends K, ? extends V> p0){
	return com.google.common.collect.ImmutableSetMultimap.copyOf(p0);
}
/**
*public static <K,V> com.google.common.collect.ImmutableSetMultimap<K, V> com.google.common.collect.ImmutableSetMultimap.copyOf(java.lang.Iterable<? extends java.util.Map.java.util.Map$Entry<? extends K, ? extends V>>)
*/ 
public static <K,V> com.google.common.collect.ImmutableSetMultimap<K, V> copyOf(java.lang.Iterable<? extends Entry<? extends K, ? extends V>> p0){
	return com.google.common.collect.ImmutableSetMultimap.copyOf(p0);
}
/**
*public static <K,V> com.google.common.collect.ImmutableSetMultimap<K, V> com.google.common.collect.ImmutableSetMultimap.of()
*/ 
public static <K,V> com.google.common.collect.ImmutableSetMultimap<K, V> of(){
	return com.google.common.collect.ImmutableSetMultimap.of();
}
/**
*public static <K,V> com.google.common.collect.ImmutableSetMultimap<K, V> com.google.common.collect.ImmutableSetMultimap.of(K,V)
*/ 
public static <K,V> com.google.common.collect.ImmutableSetMultimap<K, V> of(K p0,V p1){
	return com.google.common.collect.ImmutableSetMultimap.of(p0,p1);
}
/**
*public static <K,V> com.google.common.collect.ImmutableSetMultimap<K, V> com.google.common.collect.ImmutableSetMultimap.of(K,V,K,V,K,V,K,V)
*/ 
public static <K,V> com.google.common.collect.ImmutableSetMultimap<K, V> of(K p0,V p1,K p2,V p3,K p4,V p5,K p6,V p7){
	return com.google.common.collect.ImmutableSetMultimap.of(p0,p1,p2,p3,p4,p5,p6,p7);
}
/**
*public static <K,V> com.google.common.collect.ImmutableSetMultimap<K, V> com.google.common.collect.ImmutableSetMultimap.of(K,V,K,V,K,V)
*/ 
public static <K,V> com.google.common.collect.ImmutableSetMultimap<K, V> of(K p0,V p1,K p2,V p3,K p4,V p5){
	return com.google.common.collect.ImmutableSetMultimap.of(p0,p1,p2,p3,p4,p5);
}
/**
*public static <K,V> com.google.common.collect.ImmutableSetMultimap<K, V> com.google.common.collect.ImmutableSetMultimap.of(K,V,K,V,K,V,K,V,K,V)
*/ 
public static <K,V> com.google.common.collect.ImmutableSetMultimap<K, V> of(K p0,V p1,K p2,V p3,K p4,V p5,K p6,V p7,K p8,V p9){
	return com.google.common.collect.ImmutableSetMultimap.of(p0,p1,p2,p3,p4,p5,p6,p7,p8,p9);
}
/**
*public static <K,V> com.google.common.collect.ImmutableSetMultimap<K, V> com.google.common.collect.ImmutableSetMultimap.of(K,V,K,V)
*/ 
public static <K,V> com.google.common.collect.ImmutableSetMultimap<K, V> of(K p0,V p1,K p2,V p3){
	return com.google.common.collect.ImmutableSetMultimap.of(p0,p1,p2,p3);
}
}
