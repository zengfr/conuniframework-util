package com.github.zengfr.supercommons;
import java.util.*;
import java.util.Map.Entry;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class BiMapUtil{ 
/**
*public static <K,V> com.google.common.collect.BiMap<K, V> com.google.common.collect.MapConstraints.constrainedBiMap(com.google.common.collect.BiMap<K, V>,com.google.common.collect.MapConstraint<? super K, ? super V>)
*/ 
public static <K,V> com.google.common.collect.BiMap<K, V> constrainedBiMap(com.google.common.collect.BiMap<K, V> p0,com.google.common.collect.MapConstraint<? super K, ? super V> p1){
	return com.google.common.collect.MapConstraints.constrainedBiMap(p0,p1);
}
/**
*public static <K,V> com.google.common.collect.BiMap<K, V> com.google.common.collect.Maps.filterEntries(com.google.common.collect.BiMap<K, V>,com.google.common.base.Predicate<? super java.util.Map.java.util.Map$Entry<K, V>>)
*/ 
public static <K,V> com.google.common.collect.BiMap<K, V> filterEntries(com.google.common.collect.BiMap<K, V> p0,com.google.common.base.Predicate<? super Entry<K, V>> p1){
	return com.google.common.collect.Maps.filterEntries(p0,p1);
}
/**
*public static <K,V> com.google.common.collect.BiMap<K, V> com.google.common.collect.Maps.filterKeys(com.google.common.collect.BiMap<K, V>,com.google.common.base.Predicate<? super K>)
*/ 
public static <K,V> com.google.common.collect.BiMap<K, V> filterKeys(com.google.common.collect.BiMap<K, V> p0,com.google.common.base.Predicate<? super K> p1){
	return com.google.common.collect.Maps.filterKeys(p0,p1);
}
/**
*public static <K,V> com.google.common.collect.BiMap<K, V> com.google.common.collect.Maps.filterValues(com.google.common.collect.BiMap<K, V>,com.google.common.base.Predicate<? super V>)
*/ 
public static <K,V> com.google.common.collect.BiMap<K, V> filterValues(com.google.common.collect.BiMap<K, V> p0,com.google.common.base.Predicate<? super V> p1){
	return com.google.common.collect.Maps.filterValues(p0,p1);
}
/**
*public static <K,V> com.google.common.collect.BiMap<K, V> com.google.common.collect.Maps.synchronizedBiMap(com.google.common.collect.BiMap<K, V>)
*/ 
public static <K,V> com.google.common.collect.BiMap<K, V> synchronizedBiMap(com.google.common.collect.BiMap<K, V> p0){
	return com.google.common.collect.Maps.synchronizedBiMap(p0);
}
/**
*public static <K,V> com.google.common.collect.BiMap<K, V> com.google.common.collect.Maps.unmodifiableBiMap(com.google.common.collect.BiMap<? extends K, ? extends V>)
*/ 
public static <K,V> com.google.common.collect.BiMap<K, V> unmodifiableBiMap(com.google.common.collect.BiMap<? extends K, ? extends V> p0){
	return com.google.common.collect.Maps.unmodifiableBiMap(p0);
}
}
