package com.github.zengfr.supercommons;
import java.util.*;
import java.util.Map.Entry;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class SetUtil{ 
/**
*public static java.util.Set<java.lang.Class<?>> com.google.common.primitives.Primitives.allPrimitiveTypes()
*/ 
public static java.util.Set<java.lang.Class<?>> allPrimitiveTypes(){
	return com.google.common.primitives.Primitives.allPrimitiveTypes();
}
/**
*public static java.util.Set<java.lang.Class<?>> com.google.common.primitives.Primitives.allWrapperTypes()
*/ 
public static java.util.Set<java.lang.Class<?>> allWrapperTypes(){
	return com.google.common.primitives.Primitives.allWrapperTypes();
}
/**
*public static java.util.Set<java.util.Locale> org.apache.commons.lang3.LocaleUtils.availableLocaleSet()
*/ 
public static java.util.Set<java.util.Locale> availableLocaleSet(){
	return org.apache.commons.lang3.LocaleUtils.availableLocaleSet();
}
/**
*public static <B> java.util.Set<java.util.List<B>> com.google.common.collect.Sets.cartesianProduct(java.util.Set<? extends B>...)
*/ 
public static <B> java.util.Set<java.util.List<B>> cartesianProduct(java.util.Set<? extends B>... p0){
	return com.google.common.collect.Sets.cartesianProduct(p0);
}
/**
*public static <B> java.util.Set<java.util.List<B>> com.google.common.collect.Sets.cartesianProduct(java.util.List<? extends java.util.Set<? extends B>>)
*/ 
public static <B> java.util.Set<java.util.List<B>> cartesianProduct(java.util.List<? extends java.util.Set<? extends B>> p0){
	return com.google.common.collect.Sets.cartesianProduct(p0);
}
/**
*public static java.util.Set org.apache.commons.collections.map.UnmodifiableEntrySet.decorate(java.util.Set)
*/ 
public static java.util.Set decorate(java.util.Set p0){
	return org.apache.commons.collections.map.UnmodifiableEntrySet.decorate(p0);
}
/**
*public static java.util.Set org.apache.commons.collections.set.PredicatedSet.decorate(java.util.Set,org.apache.commons.collections.Predicate)
*/ 
public static java.util.Set decorate(java.util.Set p0,org.apache.commons.collections.Predicate p1){
	return org.apache.commons.collections.set.PredicatedSet.decorate(p0,p1);
}
/**
*public static java.util.Set org.apache.commons.collections.set.TransformedSet.decorate(java.util.Set,org.apache.commons.collections.Transformer)
*/ 
public static java.util.Set decorate(java.util.Set p0,org.apache.commons.collections.Transformer p1){
	return org.apache.commons.collections.set.TransformedSet.decorate(p0,p1);
}
/**
*public static java.util.Set org.apache.commons.collections.set.MapBackedSet.decorate(java.util.Map,java.lang.Object)
*/ 
public static java.util.Set decorate(java.util.Map p0,java.lang.Object p1){
	return org.apache.commons.collections.set.MapBackedSet.decorate(p0,p1);
}
/**
*public static java.util.Set org.apache.commons.collections.set.MapBackedSet.decorate(java.util.Map)
*/ 
public static java.util.Set decorate(java.util.Map p0){
	return org.apache.commons.collections.set.MapBackedSet.decorate(p0);
}
/**
*public static java.util.Set org.apache.commons.collections.set.TypedSet.decorate(java.util.Set,java.lang.Class)
*/ 
public static java.util.Set decorate(java.util.Set p0,java.lang.Class p1){
	return org.apache.commons.collections.set.TypedSet.decorate(p0,p1);
}
/**
*public static org.apache.commons.collections.set.ListOrderedSet org.apache.commons.collections.set.ListOrderedSet.decorate(java.util.Set,java.util.List)
*/ 
public static org.apache.commons.collections.set.ListOrderedSet decorate(java.util.Set p0,java.util.List p1){
	return org.apache.commons.collections.set.ListOrderedSet.decorate(p0,p1);
}
/**
*public static <T> java.util.Set<T> org.apache.commons.collections4.SetUtils.emptyIfNull(java.util.Set<T>)
*/ 
public static <T> java.util.Set<T> emptyIfNull(java.util.Set<T> p0){
	return org.apache.commons.collections4.SetUtils.emptyIfNull(p0);
}
/**
*public static <E> java.util.Set<E> org.apache.commons.collections4.SetUtils.emptySet()
*/ 
public static <E> java.util.Set<E> emptySet(){
	return org.apache.commons.collections4.SetUtils.emptySet();
}
/**
*public static <E> java.util.Set<E> com.google.common.collect.Sets.filter(java.util.Set<E>,com.google.common.base.Predicate<? super E>)
*/ 
public static <E> java.util.Set<E> filter(java.util.Set<E> p0,com.google.common.base.Predicate<? super E> p1){
	return com.google.common.collect.Sets.filter(p0,p1);
}
/**
*public static java.util.Set<java.io.File> org.apache.commons.io.filefilter.FileFilterUtils.filterSet(org.apache.commons.io.filefilter.IOFileFilter,java.io.File...)
*/ 
public static java.util.Set<java.io.File> filterSet(org.apache.commons.io.filefilter.IOFileFilter p0,java.io.File... p1){
	return org.apache.commons.io.filefilter.FileFilterUtils.filterSet(p0,p1);
}
/**
*public static java.util.Set<java.io.File> org.apache.commons.io.filefilter.FileFilterUtils.filterSet(org.apache.commons.io.filefilter.IOFileFilter,java.lang.Iterable<java.io.File>)
*/ 
public static java.util.Set<java.io.File> filterSet(org.apache.commons.io.filefilter.IOFileFilter p0,java.lang.Iterable<java.io.File> p1){
	return org.apache.commons.io.filefilter.FileFilterUtils.filterSet(p0,p1);
}
/**
*public static java.util.Set<java.lang.reflect.Method> org.apache.commons.lang3.reflect.MethodUtils.getOverrideHierarchy(java.lang.reflect.Method,org.apache.commons.lang3.ClassUtils$Interfaces)
*/ 
public static java.util.Set<java.lang.reflect.Method> getOverrideHierarchy(java.lang.reflect.Method p0,Interfaces p1){
	return org.apache.commons.lang3.reflect.MethodUtils.getOverrideHierarchy(p0,p1);
}
/**
*public static <K,V> java.util.Set<V> org.apache.commons.collections4.MultiMapUtils.getValuesAsSet(org.apache.commons.collections4.MultiValuedMap<K, V>,K)
*/ 
public static <K,V> java.util.Set<V> getValuesAsSet(org.apache.commons.collections4.MultiValuedMap<K, V> p0,K p1){
	return org.apache.commons.collections4.MultiMapUtils.getValuesAsSet(p0,p1);
}
/**
*public static <E> java.util.Set<E> com.google.common.collect.Sets.newConcurrentHashSet()
*/ 
public static <E> java.util.Set<E> newConcurrentHashSet(){
	return com.google.common.collect.Sets.newConcurrentHashSet();
}
/**
*public static <E> java.util.Set<E> com.google.common.collect.Sets.newConcurrentHashSet(java.lang.Iterable<? extends E>)
*/ 
public static <E> java.util.Set<E> newConcurrentHashSet(java.lang.Iterable<? extends E> p0){
	return com.google.common.collect.Sets.newConcurrentHashSet(p0);
}
/**
*public static <E> java.util.Set<E> com.google.common.collect.Sets.newIdentityHashSet()
*/ 
public static <E> java.util.Set<E> newIdentityHashSet(){
	return com.google.common.collect.Sets.newIdentityHashSet();
}
/**
*public static <E> java.util.Set<E> com.google.common.collect.Sets.newSetFromMap(java.util.Map<E, java.lang.Boolean>)
*/ 
public static <E> java.util.Set<E> newSetFromMap(java.util.Map<E, java.lang.Boolean> p0){
	return com.google.common.collect.Sets.newSetFromMap(p0);
}
/**
*public static <E> java.util.Set<E> org.apache.commons.collections4.SetUtils.orderedSet(java.util.Set<E>)
*/ 
public static <E> java.util.Set<E> orderedSet(java.util.Set<E> p0){
	return org.apache.commons.collections4.SetUtils.orderedSet(p0);
}
/**
*public static java.util.Set org.apache.commons.collections.SetUtils.orderedSet(java.util.Set)
*/ 
public static java.util.Set orderedSet(java.util.Set p0){
	return org.apache.commons.collections.SetUtils.orderedSet(p0);
}
/**
*public static <E> java.util.Set<java.util.Set<E>> com.google.common.collect.Sets.powerSet(java.util.Set<E>)
*/ 
public static <E> java.util.Set<java.util.Set<E>> powerSet(java.util.Set<E> p0){
	return com.google.common.collect.Sets.powerSet(p0);
}
/**
*public static <E> java.util.Set<E> org.apache.commons.collections4.SetUtils.predicatedSet(java.util.Set<E>,org.apache.commons.collections4.Predicate<? super E>)
*/ 
public static <E> java.util.Set<E> predicatedSet(java.util.Set<E> p0,org.apache.commons.collections4.Predicate<? super E> p1){
	return org.apache.commons.collections4.SetUtils.predicatedSet(p0,p1);
}
/**
*public static java.util.Set org.apache.commons.collections.SetUtils.predicatedSet(java.util.Set,org.apache.commons.collections.Predicate)
*/ 
public static java.util.Set predicatedSet(java.util.Set p0,org.apache.commons.collections.Predicate p1){
	return org.apache.commons.collections.SetUtils.predicatedSet(p0,p1);
}
/**
*public static <E> java.util.Set<E> org.apache.commons.collections4.SetUtils.synchronizedSet(java.util.Set<E>)
*/ 
public static <E> java.util.Set<E> synchronizedSet(java.util.Set<E> p0){
	return org.apache.commons.collections4.SetUtils.synchronizedSet(p0);
}
/**
*public static java.util.Set org.apache.commons.collections.SetUtils.synchronizedSet(java.util.Set)
*/ 
public static java.util.Set synchronizedSet(java.util.Set p0){
	return org.apache.commons.collections.SetUtils.synchronizedSet(p0);
}
/**
*public static <E> java.util.Set<E> org.apache.commons.collections4.SetUtils.transformedSet(java.util.Set<E>,org.apache.commons.collections4.Transformer<? super E, ? extends E>)
*/ 
public static <E> java.util.Set<E> transformedSet(java.util.Set<E> p0,org.apache.commons.collections4.Transformer<? super E, ? extends E> p1){
	return org.apache.commons.collections4.SetUtils.transformedSet(p0,p1);
}
/**
*public static java.util.Set org.apache.commons.collections.SetUtils.transformedSet(java.util.Set,org.apache.commons.collections.Transformer)
*/ 
public static java.util.Set transformedSet(java.util.Set p0,org.apache.commons.collections.Transformer p1){
	return org.apache.commons.collections.SetUtils.transformedSet(p0,p1);
}
/**
*public static java.util.Set org.apache.commons.collections.SetUtils.typedSet(java.util.Set,java.lang.Class)
*/ 
public static java.util.Set typedSet(java.util.Set p0,java.lang.Class p1){
	return org.apache.commons.collections.SetUtils.typedSet(p0,p1);
}
/**
*public static <K,V> java.util.Set<java.util.Map.java.util.Map$Entry<K, V>> org.apache.commons.collections4.map.UnmodifiableEntrySet.unmodifiableEntrySet(java.util.Set<java.util.Map.java.util.Map$Entry<K, V>>)
*/ 
public static <K,V> java.util.Set<Entry<K, V>> unmodifiableEntrySet(java.util.Set<Entry<K, V>> p0){
	return org.apache.commons.collections4.map.UnmodifiableEntrySet.unmodifiableEntrySet(p0);
}
/**
*public static <E> java.util.Set<E> org.apache.commons.collections4.SetUtils.unmodifiableSet(java.util.Set<? extends E>)
*/ 
public static <E> java.util.Set<E> unmodifiableSet(java.util.Set<? extends E> p0){
	return org.apache.commons.collections4.SetUtils.unmodifiableSet(p0);
}
/**
*public static java.util.Set org.apache.commons.collections.SetUtils.unmodifiableSet(java.util.Set)
*/ 
public static java.util.Set unmodifiableSet(java.util.Set p0){
	return org.apache.commons.collections.SetUtils.unmodifiableSet(p0);
}
}
