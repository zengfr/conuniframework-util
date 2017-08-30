package com.github.zengfr.supercommons;
import java.util.*;
import java.util.Map.Entry;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class SortedSetUtil{ 
/**
*public static java.util.SortedSet org.apache.commons.collections.set.UnmodifiableSortedSet.decorate(java.util.SortedSet)
*/ 
public static java.util.SortedSet decorate(java.util.SortedSet p0){
	return org.apache.commons.collections.set.UnmodifiableSortedSet.decorate(p0);
}
/**
*public static java.util.SortedSet org.apache.commons.collections.set.PredicatedSortedSet.decorate(java.util.SortedSet,org.apache.commons.collections.Predicate)
*/ 
public static java.util.SortedSet decorate(java.util.SortedSet p0,org.apache.commons.collections.Predicate p1){
	return org.apache.commons.collections.set.PredicatedSortedSet.decorate(p0,p1);
}
/**
*public static java.util.SortedSet org.apache.commons.collections.set.TypedSortedSet.decorate(java.util.SortedSet,java.lang.Class)
*/ 
public static java.util.SortedSet decorate(java.util.SortedSet p0,java.lang.Class p1){
	return org.apache.commons.collections.set.TypedSortedSet.decorate(p0,p1);
}
/**
*public static java.util.SortedSet org.apache.commons.collections.set.TransformedSortedSet.decorate(java.util.SortedSet,org.apache.commons.collections.Transformer)
*/ 
public static java.util.SortedSet decorate(java.util.SortedSet p0,org.apache.commons.collections.Transformer p1){
	return org.apache.commons.collections.set.TransformedSortedSet.decorate(p0,p1);
}
/**
*public static <E> java.util.SortedSet<E> org.apache.commons.collections4.SetUtils.emptySortedSet()
*/ 
public static <E> java.util.SortedSet<E> emptySortedSet(){
	return org.apache.commons.collections4.SetUtils.emptySortedSet();
}
/**
*public static <E> java.util.SortedSet<E> com.google.common.collect.Sets.filter(java.util.SortedSet<E>,com.google.common.base.Predicate<? super E>)
*/ 
public static <E> java.util.SortedSet<E> filter(java.util.SortedSet<E> p0,com.google.common.base.Predicate<? super E> p1){
	return com.google.common.collect.Sets.filter(p0,p1);
}
/**
*public static <E> java.util.SortedSet<E> org.apache.commons.collections4.SetUtils.predicatedNavigableSet(java.util.NavigableSet<E>,org.apache.commons.collections4.Predicate<? super E>)
*/ 
public static <E> java.util.SortedSet<E> predicatedNavigableSet(java.util.NavigableSet<E> p0,org.apache.commons.collections4.Predicate<? super E> p1){
	return org.apache.commons.collections4.SetUtils.predicatedNavigableSet(p0,p1);
}
/**
*public static <E> java.util.SortedSet<E> org.apache.commons.collections4.SetUtils.predicatedSortedSet(java.util.SortedSet<E>,org.apache.commons.collections4.Predicate<? super E>)
*/ 
public static <E> java.util.SortedSet<E> predicatedSortedSet(java.util.SortedSet<E> p0,org.apache.commons.collections4.Predicate<? super E> p1){
	return org.apache.commons.collections4.SetUtils.predicatedSortedSet(p0,p1);
}
/**
*public static java.util.SortedSet org.apache.commons.collections.SetUtils.predicatedSortedSet(java.util.SortedSet,org.apache.commons.collections.Predicate)
*/ 
public static java.util.SortedSet predicatedSortedSet(java.util.SortedSet p0,org.apache.commons.collections.Predicate p1){
	return org.apache.commons.collections.SetUtils.predicatedSortedSet(p0,p1);
}
/**
*public static <E> java.util.SortedSet<E> org.apache.commons.collections4.SetUtils.synchronizedSortedSet(java.util.SortedSet<E>)
*/ 
public static <E> java.util.SortedSet<E> synchronizedSortedSet(java.util.SortedSet<E> p0){
	return org.apache.commons.collections4.SetUtils.synchronizedSortedSet(p0);
}
/**
*public static java.util.SortedSet org.apache.commons.collections.SetUtils.synchronizedSortedSet(java.util.SortedSet)
*/ 
public static java.util.SortedSet synchronizedSortedSet(java.util.SortedSet p0){
	return org.apache.commons.collections.SetUtils.synchronizedSortedSet(p0);
}
/**
*public static <E> java.util.SortedSet<E> org.apache.commons.collections4.SetUtils.transformedNavigableSet(java.util.NavigableSet<E>,org.apache.commons.collections4.Transformer<? super E, ? extends E>)
*/ 
public static <E> java.util.SortedSet<E> transformedNavigableSet(java.util.NavigableSet<E> p0,org.apache.commons.collections4.Transformer<? super E, ? extends E> p1){
	return org.apache.commons.collections4.SetUtils.transformedNavigableSet(p0,p1);
}
/**
*public static <E> java.util.SortedSet<E> org.apache.commons.collections4.SetUtils.transformedSortedSet(java.util.SortedSet<E>,org.apache.commons.collections4.Transformer<? super E, ? extends E>)
*/ 
public static <E> java.util.SortedSet<E> transformedSortedSet(java.util.SortedSet<E> p0,org.apache.commons.collections4.Transformer<? super E, ? extends E> p1){
	return org.apache.commons.collections4.SetUtils.transformedSortedSet(p0,p1);
}
/**
*public static java.util.SortedSet org.apache.commons.collections.SetUtils.transformedSortedSet(java.util.SortedSet,org.apache.commons.collections.Transformer)
*/ 
public static java.util.SortedSet transformedSortedSet(java.util.SortedSet p0,org.apache.commons.collections.Transformer p1){
	return org.apache.commons.collections.SetUtils.transformedSortedSet(p0,p1);
}
/**
*public static java.util.SortedSet org.apache.commons.collections.SetUtils.typedSortedSet(java.util.SortedSet,java.lang.Class)
*/ 
public static java.util.SortedSet typedSortedSet(java.util.SortedSet p0,java.lang.Class p1){
	return org.apache.commons.collections.SetUtils.typedSortedSet(p0,p1);
}
/**
*public static <E> java.util.SortedSet<E> org.apache.commons.collections4.SetUtils.unmodifiableNavigableSet(java.util.NavigableSet<E>)
*/ 
public static <E> java.util.SortedSet<E> unmodifiableNavigableSet(java.util.NavigableSet<E> p0){
	return org.apache.commons.collections4.SetUtils.unmodifiableNavigableSet(p0);
}
/**
*public static <E> java.util.SortedSet<E> org.apache.commons.collections4.SetUtils.unmodifiableSortedSet(java.util.SortedSet<E>)
*/ 
public static <E> java.util.SortedSet<E> unmodifiableSortedSet(java.util.SortedSet<E> p0){
	return org.apache.commons.collections4.SetUtils.unmodifiableSortedSet(p0);
}
/**
*public static java.util.SortedSet org.apache.commons.collections.SetUtils.unmodifiableSortedSet(java.util.SortedSet)
*/ 
public static java.util.SortedSet unmodifiableSortedSet(java.util.SortedSet p0){
	return org.apache.commons.collections.SetUtils.unmodifiableSortedSet(p0);
}
}
