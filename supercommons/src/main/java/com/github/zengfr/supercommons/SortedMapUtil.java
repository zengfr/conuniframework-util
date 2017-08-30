package com.github.zengfr.supercommons;
import java.util.*;
import java.util.Map.Entry;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class SortedMapUtil{ 
/**
*public static <K,V> java.util.SortedMap<K, V> com.google.common.collect.Maps.asMap(java.util.SortedSet<K>,com.google.common.base.Function<? super K, V>)
*/ 
public static <K,V> java.util.SortedMap<K, V> asMap(java.util.SortedSet<K> p0,com.google.common.base.Function<? super K, V> p1){
	return com.google.common.collect.Maps.asMap(p0,p1);
}
/**
*public static java.util.SortedMap org.apache.commons.collections.map.FixedSizeSortedMap.decorate(java.util.SortedMap)
*/ 
public static java.util.SortedMap decorate(java.util.SortedMap p0){
	return org.apache.commons.collections.map.FixedSizeSortedMap.decorate(p0);
}
/**
*public static java.util.SortedMap org.apache.commons.collections.map.TransformedSortedMap.decorate(java.util.SortedMap,org.apache.commons.collections.Transformer,org.apache.commons.collections.Transformer)
*/ 
public static java.util.SortedMap decorate(java.util.SortedMap p0,org.apache.commons.collections.Transformer p1,org.apache.commons.collections.Transformer p2){
	return org.apache.commons.collections.map.TransformedSortedMap.decorate(p0,p1,p2);
}
/**
*public static java.util.SortedMap org.apache.commons.collections.map.LazySortedMap.decorate(java.util.SortedMap,org.apache.commons.collections.Factory)
*/ 
public static java.util.SortedMap decorate(java.util.SortedMap p0,org.apache.commons.collections.Factory p1){
	return org.apache.commons.collections.map.LazySortedMap.decorate(p0,p1);
}
/**
*public static java.util.SortedMap org.apache.commons.collections.map.LazySortedMap.decorate(java.util.SortedMap,org.apache.commons.collections.Transformer)
*/ 
public static java.util.SortedMap decorate(java.util.SortedMap p0,org.apache.commons.collections.Transformer p1){
	return org.apache.commons.collections.map.LazySortedMap.decorate(p0,p1);
}
/**
*public static java.util.SortedMap org.apache.commons.collections.map.PredicatedSortedMap.decorate(java.util.SortedMap,org.apache.commons.collections.Predicate,org.apache.commons.collections.Predicate)
*/ 
public static java.util.SortedMap decorate(java.util.SortedMap p0,org.apache.commons.collections.Predicate p1,org.apache.commons.collections.Predicate p2){
	return org.apache.commons.collections.map.PredicatedSortedMap.decorate(p0,p1,p2);
}
/**
*public static java.util.SortedMap org.apache.commons.collections.map.TypedSortedMap.decorate(java.util.SortedMap,java.lang.Class,java.lang.Class)
*/ 
public static java.util.SortedMap decorate(java.util.SortedMap p0,java.lang.Class p1,java.lang.Class p2){
	return org.apache.commons.collections.map.TypedSortedMap.decorate(p0,p1,p2);
}
/**
*public static java.util.SortedMap org.apache.commons.collections.map.TransformedSortedMap.decorateTransform(java.util.SortedMap,org.apache.commons.collections.Transformer,org.apache.commons.collections.Transformer)
*/ 
public static java.util.SortedMap decorateTransform(java.util.SortedMap p0,org.apache.commons.collections.Transformer p1,org.apache.commons.collections.Transformer p2){
	return org.apache.commons.collections.map.TransformedSortedMap.decorateTransform(p0,p1,p2);
}
/**
*public static <K,V> java.util.SortedMap<K, V> com.google.common.collect.Maps.filterEntries(java.util.SortedMap<K, V>,com.google.common.base.Predicate<? super java.util.Map.java.util.Map$Entry<K, V>>)
*/ 
public static <K,V> java.util.SortedMap<K, V> filterEntries(java.util.SortedMap<K, V> p0,com.google.common.base.Predicate<? super Entry<K, V>> p1){
	return com.google.common.collect.Maps.filterEntries(p0,p1);
}
/**
*public static <K,V> java.util.SortedMap<K, V> com.google.common.collect.Maps.filterKeys(java.util.SortedMap<K, V>,com.google.common.base.Predicate<? super K>)
*/ 
public static <K,V> java.util.SortedMap<K, V> filterKeys(java.util.SortedMap<K, V> p0,com.google.common.base.Predicate<? super K> p1){
	return com.google.common.collect.Maps.filterKeys(p0,p1);
}
/**
*public static <K,V> java.util.SortedMap<K, V> com.google.common.collect.Maps.filterValues(java.util.SortedMap<K, V>,com.google.common.base.Predicate<? super V>)
*/ 
public static <K,V> java.util.SortedMap<K, V> filterValues(java.util.SortedMap<K, V> p0,com.google.common.base.Predicate<? super V> p1){
	return com.google.common.collect.Maps.filterValues(p0,p1);
}
/**
*public static <K,V> java.util.SortedMap<K, V> org.apache.commons.collections4.MapUtils.fixedSizeSortedMap(java.util.SortedMap<K, V>)
*/ 
public static <K,V> java.util.SortedMap<K, V> fixedSizeSortedMap(java.util.SortedMap<K, V> p0){
	return org.apache.commons.collections4.MapUtils.fixedSizeSortedMap(p0);
}
/**
*public static java.util.SortedMap org.apache.commons.collections.MapUtils.fixedSizeSortedMap(java.util.SortedMap)
*/ 
public static java.util.SortedMap fixedSizeSortedMap(java.util.SortedMap p0){
	return org.apache.commons.collections.MapUtils.fixedSizeSortedMap(p0);
}
/**
*public static <K,V> java.util.SortedMap<K, V> org.apache.commons.collections4.MapUtils.lazySortedMap(java.util.SortedMap<K, V>,org.apache.commons.collections4.Factory<? extends V>)
*/ 
public static <K,V> java.util.SortedMap<K, V> lazySortedMap(java.util.SortedMap<K, V> p0,org.apache.commons.collections4.Factory<? extends V> p1){
	return org.apache.commons.collections4.MapUtils.lazySortedMap(p0,p1);
}
/**
*public static <K,V> java.util.SortedMap<K, V> org.apache.commons.collections4.MapUtils.lazySortedMap(java.util.SortedMap<K, V>,org.apache.commons.collections4.Transformer<? super K, ? extends V>)
*/ 
public static <K,V> java.util.SortedMap<K, V> lazySortedMap(java.util.SortedMap<K, V> p0,org.apache.commons.collections4.Transformer<? super K, ? extends V> p1){
	return org.apache.commons.collections4.MapUtils.lazySortedMap(p0,p1);
}
/**
*public static java.util.SortedMap org.apache.commons.collections.MapUtils.lazySortedMap(java.util.SortedMap,org.apache.commons.collections.Factory)
*/ 
public static java.util.SortedMap lazySortedMap(java.util.SortedMap p0,org.apache.commons.collections.Factory p1){
	return org.apache.commons.collections.MapUtils.lazySortedMap(p0,p1);
}
/**
*public static java.util.SortedMap org.apache.commons.collections.MapUtils.lazySortedMap(java.util.SortedMap,org.apache.commons.collections.Transformer)
*/ 
public static java.util.SortedMap lazySortedMap(java.util.SortedMap p0,org.apache.commons.collections.Transformer p1){
	return org.apache.commons.collections.MapUtils.lazySortedMap(p0,p1);
}
/**
*public static <K,V> java.util.SortedMap<K, V> org.apache.commons.collections4.MapUtils.predicatedSortedMap(java.util.SortedMap<K, V>,org.apache.commons.collections4.Predicate<? super K>,org.apache.commons.collections4.Predicate<? super V>)
*/ 
public static <K,V> java.util.SortedMap<K, V> predicatedSortedMap(java.util.SortedMap<K, V> p0,org.apache.commons.collections4.Predicate<? super K> p1,org.apache.commons.collections4.Predicate<? super V> p2){
	return org.apache.commons.collections4.MapUtils.predicatedSortedMap(p0,p1,p2);
}
/**
*public static java.util.SortedMap org.apache.commons.collections.MapUtils.predicatedSortedMap(java.util.SortedMap,org.apache.commons.collections.Predicate,org.apache.commons.collections.Predicate)
*/ 
public static java.util.SortedMap predicatedSortedMap(java.util.SortedMap p0,org.apache.commons.collections.Predicate p1,org.apache.commons.collections.Predicate p2){
	return org.apache.commons.collections.MapUtils.predicatedSortedMap(p0,p1,p2);
}
/**
*public static java.util.SortedMap<java.lang.String, java.nio.charset.Charset> org.apache.commons.io.Charsets.requiredCharsets()
*/ 
public static java.util.SortedMap<java.lang.String, java.nio.charset.Charset> requiredCharsets(){
	return org.apache.commons.io.Charsets.requiredCharsets();
}
/**
*public static <K,V> java.util.SortedMap<K, V> org.apache.commons.collections4.MapUtils.synchronizedSortedMap(java.util.SortedMap<K, V>)
*/ 
public static <K,V> java.util.SortedMap<K, V> synchronizedSortedMap(java.util.SortedMap<K, V> p0){
	return org.apache.commons.collections4.MapUtils.synchronizedSortedMap(p0);
}
/**
*public static java.util.Map org.apache.commons.collections.MapUtils.synchronizedSortedMap(java.util.SortedMap)
*/ 
public static java.util.Map synchronizedSortedMap(java.util.SortedMap p0){
	return org.apache.commons.collections.MapUtils.synchronizedSortedMap(p0);
}
/**
*public static <K,V1,V2> java.util.SortedMap<K, V2> com.google.common.collect.Maps.transformEntries(java.util.SortedMap<K, V1>,com.google.common.collect.Maps.com.google.common.collect.Maps$EntryTransformer<? super K, ? super V1, V2>)
*/ 
public static <K,V1,V2> java.util.SortedMap<K, V2> transformEntries(java.util.SortedMap<K, V1> p0,EntryTransformer<? super K, ? super V1, V2> p1){
	return com.google.common.collect.Maps.transformEntries(p0,p1);
}
/**
*public static <K,V1,V2> java.util.SortedMap<K, V2> com.google.common.collect.Maps.transformValues(java.util.SortedMap<K, V1>,com.google.common.base.Function<? super V1, V2>)
*/ 
public static <K,V1,V2> java.util.SortedMap<K, V2> transformValues(java.util.SortedMap<K, V1> p0,com.google.common.base.Function<? super V1, V2> p1){
	return com.google.common.collect.Maps.transformValues(p0,p1);
}
/**
*public static <K,V> java.util.SortedMap<K, V> org.apache.commons.collections4.MapUtils.transformedSortedMap(java.util.SortedMap<K, V>,org.apache.commons.collections4.Transformer<? super K, ? extends K>,org.apache.commons.collections4.Transformer<? super V, ? extends V>)
*/ 
public static <K,V> java.util.SortedMap<K, V> transformedSortedMap(java.util.SortedMap<K, V> p0,org.apache.commons.collections4.Transformer<? super K, ? extends K> p1,org.apache.commons.collections4.Transformer<? super V, ? extends V> p2){
	return org.apache.commons.collections4.MapUtils.transformedSortedMap(p0,p1,p2);
}
/**
*public static java.util.SortedMap org.apache.commons.collections.MapUtils.transformedSortedMap(java.util.SortedMap,org.apache.commons.collections.Transformer,org.apache.commons.collections.Transformer)
*/ 
public static java.util.SortedMap transformedSortedMap(java.util.SortedMap p0,org.apache.commons.collections.Transformer p1,org.apache.commons.collections.Transformer p2){
	return org.apache.commons.collections.MapUtils.transformedSortedMap(p0,p1,p2);
}
/**
*public static java.util.SortedMap org.apache.commons.collections.MapUtils.typedSortedMap(java.util.SortedMap,java.lang.Class,java.lang.Class)
*/ 
public static java.util.SortedMap typedSortedMap(java.util.SortedMap p0,java.lang.Class p1,java.lang.Class p2){
	return org.apache.commons.collections.MapUtils.typedSortedMap(p0,p1,p2);
}
/**
*public static <K,V> java.util.SortedMap<K, V> org.apache.commons.collections4.MapUtils.unmodifiableSortedMap(java.util.SortedMap<K, ? extends V>)
*/ 
public static <K,V> java.util.SortedMap<K, V> unmodifiableSortedMap(java.util.SortedMap<K, ? extends V> p0){
	return org.apache.commons.collections4.MapUtils.unmodifiableSortedMap(p0);
}
/**
*public static java.util.Map org.apache.commons.collections.MapUtils.unmodifiableSortedMap(java.util.SortedMap)
*/ 
public static java.util.Map unmodifiableSortedMap(java.util.SortedMap p0){
	return org.apache.commons.collections.MapUtils.unmodifiableSortedMap(p0);
}
}
