package com.github.zengfr.supercommons;
import java.util.*;
import java.util.Map.Entry;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class ImmutableListMultimapUtil{ 
/**
*public static <K,V> com.google.common.collect.ImmutableListMultimap<K, V> com.google.common.collect.ImmutableListMultimap.copyOf(java.lang.Iterable<? extends java.util.Map.java.util.Map$Entry<? extends K, ? extends V>>)
*/ 
public static <K,V> com.google.common.collect.ImmutableListMultimap<K, V> copyOf(java.lang.Iterable<? extends Entry<? extends K, ? extends V>> p0){
	return com.google.common.collect.ImmutableListMultimap.copyOf(p0);
}
/**
*public static <K,V> com.google.common.collect.ImmutableListMultimap<K, V> com.google.common.collect.ImmutableListMultimap.copyOf(com.google.common.collect.Multimap<? extends K, ? extends V>)
*/ 
public static <K,V> com.google.common.collect.ImmutableListMultimap<K, V> copyOf(com.google.common.collect.Multimap<? extends K, ? extends V> p0){
	return com.google.common.collect.ImmutableListMultimap.copyOf(p0);
}
/**
*public static <K,V> com.google.common.collect.ImmutableListMultimap<K, V> com.google.common.collect.Multimaps.index(java.lang.Iterable<V>,com.google.common.base.Function<? super V, K>)
*/ 
public static <K,V> com.google.common.collect.ImmutableListMultimap<K, V> index(java.lang.Iterable<V> p0,com.google.common.base.Function<? super V, K> p1){
	return com.google.common.collect.Multimaps.index(p0,p1);
}
/**
*public static <K,V> com.google.common.collect.ImmutableListMultimap<K, V> com.google.common.collect.Multimaps.index(java.util.Iterator<V>,com.google.common.base.Function<? super V, K>)
*/ 
public static <K,V> com.google.common.collect.ImmutableListMultimap<K, V> index(java.util.Iterator<V> p0,com.google.common.base.Function<? super V, K> p1){
	return com.google.common.collect.Multimaps.index(p0,p1);
}
/**
*public static <K,V> com.google.common.collect.ImmutableListMultimap<K, V> com.google.common.collect.ImmutableListMultimap.of()
*/ 
public static <K,V> com.google.common.collect.ImmutableListMultimap<K, V> of(){
	return com.google.common.collect.ImmutableListMultimap.of();
}
/**
*public static <K,V> com.google.common.collect.ImmutableListMultimap<K, V> com.google.common.collect.ImmutableListMultimap.of(K,V,K,V,K,V,K,V,K,V)
*/ 
public static <K,V> com.google.common.collect.ImmutableListMultimap<K, V> of(K p0,V p1,K p2,V p3,K p4,V p5,K p6,V p7,K p8,V p9){
	return com.google.common.collect.ImmutableListMultimap.of(p0,p1,p2,p3,p4,p5,p6,p7,p8,p9);
}
/**
*public static <K,V> com.google.common.collect.ImmutableListMultimap<K, V> com.google.common.collect.ImmutableListMultimap.of(K,V)
*/ 
public static <K,V> com.google.common.collect.ImmutableListMultimap<K, V> of(K p0,V p1){
	return com.google.common.collect.ImmutableListMultimap.of(p0,p1);
}
/**
*public static <K,V> com.google.common.collect.ImmutableListMultimap<K, V> com.google.common.collect.ImmutableListMultimap.of(K,V,K,V,K,V,K,V)
*/ 
public static <K,V> com.google.common.collect.ImmutableListMultimap<K, V> of(K p0,V p1,K p2,V p3,K p4,V p5,K p6,V p7){
	return com.google.common.collect.ImmutableListMultimap.of(p0,p1,p2,p3,p4,p5,p6,p7);
}
/**
*public static <K,V> com.google.common.collect.ImmutableListMultimap<K, V> com.google.common.collect.ImmutableListMultimap.of(K,V,K,V,K,V)
*/ 
public static <K,V> com.google.common.collect.ImmutableListMultimap<K, V> of(K p0,V p1,K p2,V p3,K p4,V p5){
	return com.google.common.collect.ImmutableListMultimap.of(p0,p1,p2,p3,p4,p5);
}
/**
*public static <K,V> com.google.common.collect.ImmutableListMultimap<K, V> com.google.common.collect.ImmutableListMultimap.of(K,V,K,V)
*/ 
public static <K,V> com.google.common.collect.ImmutableListMultimap<K, V> of(K p0,V p1,K p2,V p3){
	return com.google.common.collect.ImmutableListMultimap.of(p0,p1,p2,p3);
}
}
