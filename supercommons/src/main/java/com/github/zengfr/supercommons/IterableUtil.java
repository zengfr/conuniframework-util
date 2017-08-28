package com.github.zengfr.supercommons;
import com.google.common.base.Optional;
import com.google.common.collect.Iterables;
import org.apache.commons.collections4.IteratorUtils;
import org.apache.commons.collections4.IterableUtils;
import org.apache.commons.lang3.ClassUtils;
import org.apache.commons.lang3.Validate;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class IterableUtil{ 
public static <T> java.lang.Iterable<T> presentInstances(java.lang.Iterable<? extends com.google.common.base.Optional<? extends T>> p0){
return Optional.presentInstances(p0);
}
public static <T> java.lang.Iterable<T> limit(java.lang.Iterable<T> p0,int p1){
return Iterables.limit(p0,p1);
}
public static <T> java.lang.Iterable<T> concat(java.lang.Iterable<? extends T> p0,java.lang.Iterable<? extends T> p1,java.lang.Iterable<? extends T> p2){
return Iterables.concat(p0,p1,p2);
}
public static <T> java.lang.Iterable<T> concat(java.lang.Iterable<? extends T> p0,java.lang.Iterable<? extends T> p1){
return Iterables.concat(p0,p1);
}
public static <T> java.lang.Iterable<T> concat(java.lang.Iterable<? extends java.lang.Iterable<? extends T>> p0){
return Iterables.concat(p0);
}
public static <T> java.lang.Iterable<T> concat(java.lang.Iterable<? extends T> p0,java.lang.Iterable<? extends T> p1,java.lang.Iterable<? extends T> p2,java.lang.Iterable<? extends T> p3){
return Iterables.concat(p0,p1,p2,p3);
}
public static <T> java.lang.Iterable<T> concat(java.lang.Iterable<? extends T>... p0){
return Iterables.concat(p0);
}
public static <T> java.lang.Iterable<T> skip(java.lang.Iterable<T> p0,int p1){
return Iterables.skip(p0,p1);
}
public static <T> java.lang.Iterable<T> filter(java.lang.Iterable<?> p0,java.lang.Class<T> p1){
return Iterables.filter(p0,p1);
}
public static <T> java.lang.Iterable<T> filter(java.lang.Iterable<T> p0,com.google.common.base.Predicate<? super T> p1){
return Iterables.filter(p0,p1);
}
public static <F,T> java.lang.Iterable<T> transform(java.lang.Iterable<F> p0,com.google.common.base.Function<? super F, ? extends T> p1){
return Iterables.transform(p0,p1);
}
public static <T> java.lang.Iterable<java.util.List<T>> partition(java.lang.Iterable<T> p0,int p1){
return Iterables.partition(p0,p1);
}
public static <T> java.lang.Iterable<T> cycle(java.lang.Iterable<T> p0){
return Iterables.cycle(p0);
}
public static <T> java.lang.Iterable<T> cycle(T... p0){
return Iterables.cycle(p0);
}
public static <T> java.lang.Iterable<java.util.List<T>> paddedPartition(java.lang.Iterable<T> p0,int p1){
return Iterables.paddedPartition(p0,p1);
}
public static <T> java.lang.Iterable<T> mergeSorted(java.lang.Iterable<? extends java.lang.Iterable<? extends T>> p0,java.util.Comparator<? super T> p1){
return Iterables.mergeSorted(p0,p1);
}
public static <T> java.lang.Iterable<T> unmodifiableIterable(java.lang.Iterable<T> p0){
return Iterables.unmodifiableIterable(p0);
}
public static <E> java.lang.Iterable<E> unmodifiableIterable(com.google.common.collect.ImmutableCollection<E> p0){
return Iterables.unmodifiableIterable(p0);
}
public static <T> java.lang.Iterable<T> consumingIterable(java.lang.Iterable<T> p0){
return Iterables.consumingIterable(p0);
}
public static <E> java.lang.Iterable<E> asIterable(java.util.Iterator<? extends E> p0){
return IteratorUtils.asIterable(p0);
}
public static <E> java.lang.Iterable<E> asMultipleUseIterable(java.util.Iterator<? extends E> p0){
return IteratorUtils.asMultipleUseIterable(p0);
}
public static <E> java.lang.Iterable<E> unmodifiableIterable(java.lang.Iterable<E> p0){
return IterableUtils.unmodifiableIterable(p0);
}
public static <E> java.lang.Iterable<E> emptyIterable(){
return IterableUtils.emptyIterable();
}
public static <E> java.lang.Iterable<E> chainedIterable(java.lang.Iterable<? extends E> p0,java.lang.Iterable<? extends E> p1,java.lang.Iterable<? extends E> p2,java.lang.Iterable<? extends E> p3){
return IterableUtils.chainedIterable(p0,p1,p2,p3);
}
public static <E> java.lang.Iterable<E> chainedIterable(java.lang.Iterable<? extends E> p0,java.lang.Iterable<? extends E> p1,java.lang.Iterable<? extends E> p2){
return IterableUtils.chainedIterable(p0,p1,p2);
}
public static <E> java.lang.Iterable<E> chainedIterable(java.lang.Iterable<? extends E> p0,java.lang.Iterable<? extends E> p1){
return IterableUtils.chainedIterable(p0,p1);
}
public static <E> java.lang.Iterable<E> chainedIterable(java.lang.Iterable<? extends E>... p0){
return IterableUtils.chainedIterable(p0);
}
public static <E> java.lang.Iterable<E> collatedIterable(java.util.Comparator<? super E> p0,java.lang.Iterable<? extends E> p1,java.lang.Iterable<? extends E> p2){
return IterableUtils.collatedIterable(p0,p1,p2);
}
public static <E> java.lang.Iterable<E> collatedIterable(java.lang.Iterable<? extends E> p0,java.lang.Iterable<? extends E> p1){
return IterableUtils.collatedIterable(p0,p1);
}
public static <E> java.lang.Iterable<E> boundedIterable(java.lang.Iterable<E> p0,long p1){
return IterableUtils.boundedIterable(p0,p1);
}
public static <E> java.lang.Iterable<E> reversedIterable(java.lang.Iterable<E> p0){
return IterableUtils.reversedIterable(p0);
}
public static <E> java.lang.Iterable<E> skippingIterable(java.lang.Iterable<E> p0,long p1){
return IterableUtils.skippingIterable(p0,p1);
}
public static <E> java.lang.Iterable<E> filteredIterable(java.lang.Iterable<E> p0,org.apache.commons.collections4.Predicate<? super E> p1){
return IterableUtils.filteredIterable(p0,p1);
}
public static <E> java.lang.Iterable<E> loopingIterable(java.lang.Iterable<E> p0){
return IterableUtils.loopingIterable(p0);
}
public static <E> java.lang.Iterable<E> zippingIterable(java.lang.Iterable<? extends E> p0,java.lang.Iterable<? extends E> p1){
return IterableUtils.zippingIterable(p0,p1);
}
public static <E> java.lang.Iterable<E> zippingIterable(java.lang.Iterable<? extends E> p0,java.lang.Iterable<? extends E>... p1){
return IterableUtils.zippingIterable(p0,p1);
}
public static <E> java.lang.Iterable<E> emptyIfNull(java.lang.Iterable<E> p0){
return IterableUtils.emptyIfNull(p0);
}
public static <E> java.lang.Iterable<E> uniqueIterable(java.lang.Iterable<E> p0){
return IterableUtils.uniqueIterable(p0);
}
public static <I,O> java.lang.Iterable<O> transformedIterable(java.lang.Iterable<I> p0,org.apache.commons.collections4.Transformer<? super I, ? extends O> p1){
return IterableUtils.transformedIterable(p0,p1);
}
public static java.lang.Iterable<java.lang.Class<?>> hierarchy(java.lang.Class<?> p0,Interfaces p1){
return ClassUtils.hierarchy(p0,p1);
}
public static java.lang.Iterable<java.lang.Class<?>> hierarchy(java.lang.Class<?> p0){
return ClassUtils.hierarchy(p0);
}
public static <T extends java.lang.Iterable<?> > T noNullElements(T p0,java.lang.String p1,java.lang.Object... p2){
return Validate.noNullElements(p0,p1,p2);
}
public static <T extends java.lang.Iterable<?> > T noNullElements(T p0){
return Validate.noNullElements(p0);
}
}
