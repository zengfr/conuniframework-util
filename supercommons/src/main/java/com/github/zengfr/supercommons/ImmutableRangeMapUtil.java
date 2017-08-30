package com.github.zengfr.supercommons;
import java.util.*;
import java.util.Map.Entry;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class ImmutableRangeMapUtil{ 
/**
*public static <K,V> com.google.common.collect.ImmutableRangeMap<K, V> com.google.common.collect.ImmutableRangeMap.copyOf(com.google.common.collect.RangeMap<K, ? extends V>)
*/ 
public static <K extends java.lang.Comparable<?> ,V> com.google.common.collect.ImmutableRangeMap<K, V> copyOf(com.google.common.collect.RangeMap<K, ? extends V> p0){
	return com.google.common.collect.ImmutableRangeMap.copyOf(p0);
}
/**
*public static <K,V> com.google.common.collect.ImmutableRangeMap<K, V> com.google.common.collect.ImmutableRangeMap.of()
*/ 
public static <K extends java.lang.Comparable<?> ,V> com.google.common.collect.ImmutableRangeMap<K, V> of(){
	return com.google.common.collect.ImmutableRangeMap.of();
}
/**
*public static <K,V> com.google.common.collect.ImmutableRangeMap<K, V> com.google.common.collect.ImmutableRangeMap.of(com.google.common.collect.Range<K>,V)
*/ 
public static <K extends java.lang.Comparable<?> ,V> com.google.common.collect.ImmutableRangeMap<K, V> of(com.google.common.collect.Range<K> p0,V p1){
	return com.google.common.collect.ImmutableRangeMap.of(p0,p1);
}
}
