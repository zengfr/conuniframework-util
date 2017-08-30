package com.github.zengfr.supercommons;
import java.util.*;
import java.util.Map.Entry;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class IterableUtil{ 
/**
*public static <E> java.lang.Iterable<E> org.apache.commons.collections4.IteratorUtils.asIterable(java.util.Iterator<? extends E>)
*/ 
public static <E> java.lang.Iterable<E> asIterable(java.util.Iterator<? extends E> p0){
	return org.apache.commons.collections4.IteratorUtils.asIterable(p0);
}
/**
*public static <E> java.lang.Iterable<E> org.apache.commons.collections4.IteratorUtils.asMultipleUseIterable(java.util.Iterator<? extends E>)
*/ 
public static <E> java.lang.Iterable<E> asMultipleUseIterable(java.util.Iterator<? extends E> p0){
	return org.apache.commons.collections4.IteratorUtils.asMultipleUseIterable(p0);
}
/**
*public static <E> java.lang.Iterable<E> org.apache.commons.collections4.IterableUtils.boundedIterable(java.lang.Iterable<E>,long)
*/ 
public static <E> java.lang.Iterable<E> boundedIterable(java.lang.Iterable<E> p0,long p1){
	return org.apache.commons.collections4.IterableUtils.boundedIterable(p0,p1);
}
/**
*public static <E> java.lang.Iterable<E> org.apache.commons.collections4.IterableUtils.chainedIterable(java.lang.Iterable<? extends E>...)
*/ 
public static <E> java.lang.Iterable<E> chainedIterable(java.lang.Iterable<? extends E>... p0){
	return org.apache.commons.collections4.IterableUtils.chainedIterable(p0);
}
/**
*public static <E> java.lang.Iterable<E> org.apache.commons.collections4.IterableUtils.chainedIterable(java.lang.Iterable<? extends E>,java.lang.Iterable<? extends E>,java.lang.Iterable<? extends E>)
*/ 
public static <E> java.lang.Iterable<E> chainedIterable(java.lang.Iterable<? extends E> p0,java.lang.Iterable<? extends E> p1,java.lang.Iterable<? extends E> p2){
	return org.apache.commons.collections4.IterableUtils.chainedIterable(p0,p1,p2);
}
/**
*public static <E> java.lang.Iterable<E> org.apache.commons.collections4.IterableUtils.chainedIterable(java.lang.Iterable<? extends E>,java.lang.Iterable<? extends E>)
*/ 
public static <E> java.lang.Iterable<E> chainedIterable(java.lang.Iterable<? extends E> p0,java.lang.Iterable<? extends E> p1){
	return org.apache.commons.collections4.IterableUtils.chainedIterable(p0,p1);
}
/**
*public static <E> java.lang.Iterable<E> org.apache.commons.collections4.IterableUtils.chainedIterable(java.lang.Iterable<? extends E>,java.lang.Iterable<? extends E>,java.lang.Iterable<? extends E>,java.lang.Iterable<? extends E>)
*/ 
public static <E> java.lang.Iterable<E> chainedIterable(java.lang.Iterable<? extends E> p0,java.lang.Iterable<? extends E> p1,java.lang.Iterable<? extends E> p2,java.lang.Iterable<? extends E> p3){
	return org.apache.commons.collections4.IterableUtils.chainedIterable(p0,p1,p2,p3);
}
/**
*public static <E> java.lang.Iterable<E> org.apache.commons.collections4.IterableUtils.collatedIterable(java.util.Comparator<? super E>,java.lang.Iterable<? extends E>,java.lang.Iterable<? extends E>)
*/ 
public static <E> java.lang.Iterable<E> collatedIterable(java.util.Comparator<? super E> p0,java.lang.Iterable<? extends E> p1,java.lang.Iterable<? extends E> p2){
	return org.apache.commons.collections4.IterableUtils.collatedIterable(p0,p1,p2);
}
/**
*public static <E> java.lang.Iterable<E> org.apache.commons.collections4.IterableUtils.collatedIterable(java.lang.Iterable<? extends E>,java.lang.Iterable<? extends E>)
*/ 
public static <E> java.lang.Iterable<E> collatedIterable(java.lang.Iterable<? extends E> p0,java.lang.Iterable<? extends E> p1){
	return org.apache.commons.collections4.IterableUtils.collatedIterable(p0,p1);
}
/**
*public static <T> java.lang.Iterable<T> com.google.common.collect.Iterables.concat(java.lang.Iterable<? extends T>,java.lang.Iterable<? extends T>,java.lang.Iterable<? extends T>)
*/ 
public static <T> java.lang.Iterable<T> concat(java.lang.Iterable<? extends T> p0,java.lang.Iterable<? extends T> p1,java.lang.Iterable<? extends T> p2){
	return com.google.common.collect.Iterables.concat(p0,p1,p2);
}
/**
*public static <T> java.lang.Iterable<T> com.google.common.collect.Iterables.concat(java.lang.Iterable<? extends T>,java.lang.Iterable<? extends T>)
*/ 
public static <T> java.lang.Iterable<T> concat(java.lang.Iterable<? extends T> p0,java.lang.Iterable<? extends T> p1){
	return com.google.common.collect.Iterables.concat(p0,p1);
}
/**
*public static <T> java.lang.Iterable<T> com.google.common.collect.Iterables.concat(java.lang.Iterable<? extends java.lang.Iterable<? extends T>>)
*/ 
public static <T> java.lang.Iterable<T> concat(java.lang.Iterable<? extends java.lang.Iterable<? extends T>> p0){
	return com.google.common.collect.Iterables.concat(p0);
}
/**
*public static <T> java.lang.Iterable<T> com.google.common.collect.Iterables.concat(java.lang.Iterable<? extends T>,java.lang.Iterable<? extends T>,java.lang.Iterable<? extends T>,java.lang.Iterable<? extends T>)
*/ 
public static <T> java.lang.Iterable<T> concat(java.lang.Iterable<? extends T> p0,java.lang.Iterable<? extends T> p1,java.lang.Iterable<? extends T> p2,java.lang.Iterable<? extends T> p3){
	return com.google.common.collect.Iterables.concat(p0,p1,p2,p3);
}
/**
*public static <T> java.lang.Iterable<T> com.google.common.collect.Iterables.concat(java.lang.Iterable<? extends T>...)
*/ 
public static <T> java.lang.Iterable<T> concat(java.lang.Iterable<? extends T>... p0){
	return com.google.common.collect.Iterables.concat(p0);
}
/**
*public static <T> java.lang.Iterable<T> com.google.common.collect.Iterables.consumingIterable(java.lang.Iterable<T>)
*/ 
public static <T> java.lang.Iterable<T> consumingIterable(java.lang.Iterable<T> p0){
	return com.google.common.collect.Iterables.consumingIterable(p0);
}
/**
*public static <T> java.lang.Iterable<T> com.google.common.collect.Iterables.cycle(T...)
*/ 
public static <T> java.lang.Iterable<T> cycle(T... p0){
	return com.google.common.collect.Iterables.cycle(p0);
}
/**
*public static <T> java.lang.Iterable<T> com.google.common.collect.Iterables.cycle(java.lang.Iterable<T>)
*/ 
public static <T> java.lang.Iterable<T> cycle(java.lang.Iterable<T> p0){
	return com.google.common.collect.Iterables.cycle(p0);
}
/**
*public static <E> java.lang.Iterable<E> org.apache.commons.collections4.IterableUtils.emptyIfNull(java.lang.Iterable<E>)
*/ 
public static <E> java.lang.Iterable<E> emptyIfNull(java.lang.Iterable<E> p0){
	return org.apache.commons.collections4.IterableUtils.emptyIfNull(p0);
}
/**
*public static <E> java.lang.Iterable<E> org.apache.commons.collections4.IterableUtils.emptyIterable()
*/ 
public static <E> java.lang.Iterable<E> emptyIterable(){
	return org.apache.commons.collections4.IterableUtils.emptyIterable();
}
/**
*public static <T> java.lang.Iterable<T> com.google.common.collect.Iterables.filter(java.lang.Iterable<?>,java.lang.Class<T>)
*/ 
public static <T> java.lang.Iterable<T> filter(java.lang.Iterable<?> p0,java.lang.Class<T> p1){
	return com.google.common.collect.Iterables.filter(p0,p1);
}
/**
*public static <T> java.lang.Iterable<T> com.google.common.collect.Iterables.filter(java.lang.Iterable<T>,com.google.common.base.Predicate<? super T>)
*/ 
public static <T> java.lang.Iterable<T> filter(java.lang.Iterable<T> p0,com.google.common.base.Predicate<? super T> p1){
	return com.google.common.collect.Iterables.filter(p0,p1);
}
/**
*public static <E> java.lang.Iterable<E> org.apache.commons.collections4.IterableUtils.filteredIterable(java.lang.Iterable<E>,org.apache.commons.collections4.Predicate<? super E>)
*/ 
public static <E> java.lang.Iterable<E> filteredIterable(java.lang.Iterable<E> p0,org.apache.commons.collections4.Predicate<? super E> p1){
	return org.apache.commons.collections4.IterableUtils.filteredIterable(p0,p1);
}
/**
*public static java.lang.Iterable<java.lang.Class<?>> org.apache.commons.lang3.ClassUtils.hierarchy(java.lang.Class<?>)
*/ 
public static java.lang.Iterable<java.lang.Class<?>> hierarchy(java.lang.Class<?> p0){
	return org.apache.commons.lang3.ClassUtils.hierarchy(p0);
}
/**
*public static java.lang.Iterable<java.lang.Class<?>> org.apache.commons.lang3.ClassUtils.hierarchy(java.lang.Class<?>,org.apache.commons.lang3.ClassUtils$Interfaces)
*/ 
public static java.lang.Iterable<java.lang.Class<?>> hierarchy(java.lang.Class<?> p0,Interfaces p1){
	return org.apache.commons.lang3.ClassUtils.hierarchy(p0,p1);
}
/**
*public static <T> java.lang.Iterable<T> com.google.common.collect.Iterables.limit(java.lang.Iterable<T>,int)
*/ 
public static <T> java.lang.Iterable<T> limit(java.lang.Iterable<T> p0,int p1){
	return com.google.common.collect.Iterables.limit(p0,p1);
}
/**
*public static <E> java.lang.Iterable<E> org.apache.commons.collections4.IterableUtils.loopingIterable(java.lang.Iterable<E>)
*/ 
public static <E> java.lang.Iterable<E> loopingIterable(java.lang.Iterable<E> p0){
	return org.apache.commons.collections4.IterableUtils.loopingIterable(p0);
}
/**
*public static <T> java.lang.Iterable<T> com.google.common.collect.Iterables.mergeSorted(java.lang.Iterable<? extends java.lang.Iterable<? extends T>>,java.util.Comparator<? super T>)
*/ 
public static <T> java.lang.Iterable<T> mergeSorted(java.lang.Iterable<? extends java.lang.Iterable<? extends T>> p0,java.util.Comparator<? super T> p1){
	return com.google.common.collect.Iterables.mergeSorted(p0,p1);
}
/**
*public static <T> T org.apache.commons.lang3.Validate.noNullElements(T)
*/ 
public static <T extends java.lang.Iterable<?> > T noNullElements(T p0){
	return org.apache.commons.lang3.Validate.noNullElements(p0);
}
/**
*public static <T> T org.apache.commons.lang3.Validate.noNullElements(T,java.lang.String,java.lang.Object...)
*/ 
public static <T extends java.lang.Iterable<?> > T noNullElements(T p0,java.lang.String p1,java.lang.Object... p2){
	return org.apache.commons.lang3.Validate.noNullElements(p0,p1,p2);
}
/**
*public static <T> java.lang.Iterable<java.util.List<T>> com.google.common.collect.Iterables.paddedPartition(java.lang.Iterable<T>,int)
*/ 
public static <T> java.lang.Iterable<java.util.List<T>> paddedPartition(java.lang.Iterable<T> p0,int p1){
	return com.google.common.collect.Iterables.paddedPartition(p0,p1);
}
/**
*public static <T> java.lang.Iterable<java.util.List<T>> com.google.common.collect.Iterables.partition(java.lang.Iterable<T>,int)
*/ 
public static <T> java.lang.Iterable<java.util.List<T>> partition(java.lang.Iterable<T> p0,int p1){
	return com.google.common.collect.Iterables.partition(p0,p1);
}
/**
*public static <T> java.lang.Iterable<T> com.google.common.base.Optional.presentInstances(java.lang.Iterable<? extends com.google.common.base.Optional<? extends T>>)
*/ 
public static <T> java.lang.Iterable<T> presentInstances(java.lang.Iterable<? extends com.google.common.base.Optional<? extends T>> p0){
	return com.google.common.base.Optional.presentInstances(p0);
}
/**
*public static <E> java.lang.Iterable<E> org.apache.commons.collections4.IterableUtils.reversedIterable(java.lang.Iterable<E>)
*/ 
public static <E> java.lang.Iterable<E> reversedIterable(java.lang.Iterable<E> p0){
	return org.apache.commons.collections4.IterableUtils.reversedIterable(p0);
}
/**
*public static <T> java.lang.Iterable<T> com.google.common.collect.Iterables.skip(java.lang.Iterable<T>,int)
*/ 
public static <T> java.lang.Iterable<T> skip(java.lang.Iterable<T> p0,int p1){
	return com.google.common.collect.Iterables.skip(p0,p1);
}
/**
*public static <E> java.lang.Iterable<E> org.apache.commons.collections4.IterableUtils.skippingIterable(java.lang.Iterable<E>,long)
*/ 
public static <E> java.lang.Iterable<E> skippingIterable(java.lang.Iterable<E> p0,long p1){
	return org.apache.commons.collections4.IterableUtils.skippingIterable(p0,p1);
}
/**
*public static <F,T> java.lang.Iterable<T> com.google.common.collect.Iterables.transform(java.lang.Iterable<F>,com.google.common.base.Function<? super F, ? extends T>)
*/ 
public static <F,T> java.lang.Iterable<T> transform(java.lang.Iterable<F> p0,com.google.common.base.Function<? super F, ? extends T> p1){
	return com.google.common.collect.Iterables.transform(p0,p1);
}
/**
*public static <I,O> java.lang.Iterable<O> org.apache.commons.collections4.IterableUtils.transformedIterable(java.lang.Iterable<I>,org.apache.commons.collections4.Transformer<? super I, ? extends O>)
*/ 
public static <I,O> java.lang.Iterable<O> transformedIterable(java.lang.Iterable<I> p0,org.apache.commons.collections4.Transformer<? super I, ? extends O> p1){
	return org.apache.commons.collections4.IterableUtils.transformedIterable(p0,p1);
}
/**
*public static <E> java.lang.Iterable<E> org.apache.commons.collections4.IterableUtils.uniqueIterable(java.lang.Iterable<E>)
*/ 
public static <E> java.lang.Iterable<E> uniqueIterable(java.lang.Iterable<E> p0){
	return org.apache.commons.collections4.IterableUtils.uniqueIterable(p0);
}
/**
*public static <T> java.lang.Iterable<T> com.google.common.collect.Iterables.unmodifiableIterable(java.lang.Iterable<T>)
*/ 
public static <T> java.lang.Iterable<T> unmodifiableIterable(java.lang.Iterable<T> p0){
	return com.google.common.collect.Iterables.unmodifiableIterable(p0);
}
/**
*public static <E> java.lang.Iterable<E> com.google.common.collect.Iterables.unmodifiableIterable(com.google.common.collect.ImmutableCollection<E>)
*/ 
public static <E> java.lang.Iterable<E> unmodifiableIterable(com.google.common.collect.ImmutableCollection<E> p0){
	return com.google.common.collect.Iterables.unmodifiableIterable(p0);
}
/**
*public static <E> java.lang.Iterable<E> org.apache.commons.collections4.IterableUtils.unmodifiableIterable(java.lang.Iterable<E>)
*/ 
public static <E> java.lang.Iterable<E> unmodifiableIterable(java.lang.Iterable<E> p0){
	return org.apache.commons.collections4.IterableUtils.unmodifiableIterable(p0);
}
/**
*public static <E> java.lang.Iterable<E> org.apache.commons.collections4.IterableUtils.zippingIterable(java.lang.Iterable<? extends E>,java.lang.Iterable<? extends E>...)
*/ 
public static <E> java.lang.Iterable<E> zippingIterable(java.lang.Iterable<? extends E> p0,java.lang.Iterable<? extends E>... p1){
	return org.apache.commons.collections4.IterableUtils.zippingIterable(p0,p1);
}
/**
*public static <E> java.lang.Iterable<E> org.apache.commons.collections4.IterableUtils.zippingIterable(java.lang.Iterable<? extends E>,java.lang.Iterable<? extends E>)
*/ 
public static <E> java.lang.Iterable<E> zippingIterable(java.lang.Iterable<? extends E> p0,java.lang.Iterable<? extends E> p1){
	return org.apache.commons.collections4.IterableUtils.zippingIterable(p0,p1);
}
}
