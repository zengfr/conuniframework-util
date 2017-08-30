package com.github.zengfr.supercommons;
import java.util.*;
import java.util.Map.Entry;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class IteratorUtil{ 
/**
*public static void org.apache.commons.collections.CollectionUtils.addAll(java.util.Collection,java.util.Iterator)
*/ 
public static void addAll(java.util.Collection p0,java.util.Iterator p1){
	 org.apache.commons.collections.CollectionUtils.addAll(p0,p1);
}
/**
*public static it.unimi.dsi.fastutil.booleans.BooleanIterator it.unimi.dsi.fastutil.booleans.BooleanIterators.asBooleanIterator(java.util.Iterator)
*/ 
public static it.unimi.dsi.fastutil.booleans.BooleanIterator asBooleanIterator(java.util.Iterator p0){
	return it.unimi.dsi.fastutil.booleans.BooleanIterators.asBooleanIterator(p0);
}
/**
*public static it.unimi.dsi.fastutil.bytes.ByteIterator it.unimi.dsi.fastutil.bytes.ByteIterators.asByteIterator(java.util.Iterator)
*/ 
public static it.unimi.dsi.fastutil.bytes.ByteIterator asByteIterator(java.util.Iterator p0){
	return it.unimi.dsi.fastutil.bytes.ByteIterators.asByteIterator(p0);
}
/**
*public static it.unimi.dsi.fastutil.chars.CharIterator it.unimi.dsi.fastutil.chars.CharIterators.asCharIterator(java.util.Iterator)
*/ 
public static it.unimi.dsi.fastutil.chars.CharIterator asCharIterator(java.util.Iterator p0){
	return it.unimi.dsi.fastutil.chars.CharIterators.asCharIterator(p0);
}
/**
*public static it.unimi.dsi.fastutil.doubles.DoubleIterator it.unimi.dsi.fastutil.doubles.DoubleIterators.asDoubleIterator(java.util.Iterator)
*/ 
public static it.unimi.dsi.fastutil.doubles.DoubleIterator asDoubleIterator(java.util.Iterator p0){
	return it.unimi.dsi.fastutil.doubles.DoubleIterators.asDoubleIterator(p0);
}
/**
*public static java.util.Enumeration org.apache.commons.collections.IteratorUtils.asEnumeration(java.util.Iterator)
*/ 
public static java.util.Enumeration asEnumeration(java.util.Iterator p0){
	return org.apache.commons.collections.IteratorUtils.asEnumeration(p0);
}
/**
*public static it.unimi.dsi.fastutil.floats.FloatIterator it.unimi.dsi.fastutil.floats.FloatIterators.asFloatIterator(java.util.Iterator)
*/ 
public static it.unimi.dsi.fastutil.floats.FloatIterator asFloatIterator(java.util.Iterator p0){
	return it.unimi.dsi.fastutil.floats.FloatIterators.asFloatIterator(p0);
}
/**
*public static it.unimi.dsi.fastutil.ints.IntIterator it.unimi.dsi.fastutil.ints.IntIterators.asIntIterator(java.util.Iterator)
*/ 
public static it.unimi.dsi.fastutil.ints.IntIterator asIntIterator(java.util.Iterator p0){
	return it.unimi.dsi.fastutil.ints.IntIterators.asIntIterator(p0);
}
/**
*public static <E> java.util.Iterator<E> org.apache.commons.collections4.IteratorUtils.asIterator(java.util.Enumeration<? extends E>,java.util.Collection<? super E>)
*/ 
public static <E> java.util.Iterator<E> asIterator(java.util.Enumeration<? extends E> p0,java.util.Collection<? super E> p1){
	return org.apache.commons.collections4.IteratorUtils.asIterator(p0,p1);
}
/**
*public static <E> java.util.Iterator<E> org.apache.commons.collections4.IteratorUtils.asIterator(java.util.Enumeration<? extends E>)
*/ 
public static <E> java.util.Iterator<E> asIterator(java.util.Enumeration<? extends E> p0){
	return org.apache.commons.collections4.IteratorUtils.asIterator(p0);
}
/**
*public static java.util.Iterator org.apache.commons.collections.IteratorUtils.asIterator(java.util.Enumeration)
*/ 
public static java.util.Iterator asIterator(java.util.Enumeration p0){
	return org.apache.commons.collections.IteratorUtils.asIterator(p0);
}
/**
*public static java.util.Iterator org.apache.commons.collections.IteratorUtils.asIterator(java.util.Enumeration,java.util.Collection)
*/ 
public static java.util.Iterator asIterator(java.util.Enumeration p0,java.util.Collection p1){
	return org.apache.commons.collections.IteratorUtils.asIterator(p0,p1);
}
/**
*public static it.unimi.dsi.fastutil.longs.LongIterator it.unimi.dsi.fastutil.longs.LongIterators.asLongIterator(java.util.Iterator)
*/ 
public static it.unimi.dsi.fastutil.longs.LongIterator asLongIterator(java.util.Iterator p0){
	return it.unimi.dsi.fastutil.longs.LongIterators.asLongIterator(p0);
}
/**
*public static it.unimi.dsi.fastutil.shorts.ShortIterator it.unimi.dsi.fastutil.shorts.ShortIterators.asShortIterator(java.util.Iterator)
*/ 
public static it.unimi.dsi.fastutil.shorts.ShortIterator asShortIterator(java.util.Iterator p0){
	return it.unimi.dsi.fastutil.shorts.ShortIterators.asShortIterator(p0);
}
/**
*public static <E> java.util.Iterator<E> org.apache.commons.collections4.IteratorUtils.chainedIterator(java.util.Iterator<? extends E>,java.util.Iterator<? extends E>)
*/ 
public static <E> java.util.Iterator<E> chainedIterator(java.util.Iterator<? extends E> p0,java.util.Iterator<? extends E> p1){
	return org.apache.commons.collections4.IteratorUtils.chainedIterator(p0,p1);
}
/**
*public static <E> java.util.Iterator<E> org.apache.commons.collections4.IteratorUtils.chainedIterator(java.util.Collection<java.util.Iterator<? extends E>>)
*/ 
public static <E> java.util.Iterator<E> chainedIterator(java.util.Collection<java.util.Iterator<? extends E>> p0){
	return org.apache.commons.collections4.IteratorUtils.chainedIterator(p0);
}
/**
*public static <E> java.util.Iterator<E> org.apache.commons.collections4.IteratorUtils.chainedIterator(java.util.Iterator<? extends E>...)
*/ 
public static <E> java.util.Iterator<E> chainedIterator(java.util.Iterator<? extends E>... p0){
	return org.apache.commons.collections4.IteratorUtils.chainedIterator(p0);
}
/**
*public static java.util.Iterator org.apache.commons.collections.IteratorUtils.chainedIterator(java.util.Iterator,java.util.Iterator)
*/ 
public static java.util.Iterator chainedIterator(java.util.Iterator p0,java.util.Iterator p1){
	return org.apache.commons.collections.IteratorUtils.chainedIterator(p0,p1);
}
/**
*public static java.util.Iterator org.apache.commons.collections.IteratorUtils.chainedIterator(java.util.Iterator[])
*/ 
public static java.util.Iterator chainedIterator(java.util.Iterator... p0){
	return org.apache.commons.collections.IteratorUtils.chainedIterator(p0);
}
/**
*public static java.util.Iterator org.apache.commons.collections.IteratorUtils.chainedIterator(java.util.Collection)
*/ 
public static java.util.Iterator chainedIterator(java.util.Collection p0){
	return org.apache.commons.collections.IteratorUtils.chainedIterator(p0);
}
/**
*public static <E> java.util.Iterator<E> org.apache.commons.collections4.IteratorUtils.collatedIterator(java.util.Comparator<? super E>,java.util.Iterator<? extends E>...)
*/ 
public static <E> java.util.Iterator<E> collatedIterator(java.util.Comparator<? super E> p0,java.util.Iterator<? extends E>... p1){
	return org.apache.commons.collections4.IteratorUtils.collatedIterator(p0,p1);
}
/**
*public static <E> java.util.Iterator<E> org.apache.commons.collections4.IteratorUtils.collatedIterator(java.util.Comparator<? super E>,java.util.Iterator<? extends E>,java.util.Iterator<? extends E>)
*/ 
public static <E> java.util.Iterator<E> collatedIterator(java.util.Comparator<? super E> p0,java.util.Iterator<? extends E> p1,java.util.Iterator<? extends E> p2){
	return org.apache.commons.collections4.IteratorUtils.collatedIterator(p0,p1,p2);
}
/**
*public static <E> java.util.Iterator<E> org.apache.commons.collections4.IteratorUtils.collatedIterator(java.util.Comparator<? super E>,java.util.Collection<java.util.Iterator<? extends E>>)
*/ 
public static <E> java.util.Iterator<E> collatedIterator(java.util.Comparator<? super E> p0,java.util.Collection<java.util.Iterator<? extends E>> p1){
	return org.apache.commons.collections4.IteratorUtils.collatedIterator(p0,p1);
}
/**
*public static java.util.Iterator org.apache.commons.collections.IteratorUtils.collatedIterator(java.util.Comparator,java.util.Iterator,java.util.Iterator)
*/ 
public static java.util.Iterator collatedIterator(java.util.Comparator p0,java.util.Iterator p1,java.util.Iterator p2){
	return org.apache.commons.collections.IteratorUtils.collatedIterator(p0,p1,p2);
}
/**
*public static java.util.Iterator org.apache.commons.collections.IteratorUtils.collatedIterator(java.util.Comparator,java.util.Iterator[])
*/ 
public static java.util.Iterator collatedIterator(java.util.Comparator p0,java.util.Iterator... p1){
	return org.apache.commons.collections.IteratorUtils.collatedIterator(p0,p1);
}
/**
*public static java.util.Iterator org.apache.commons.collections.IteratorUtils.collatedIterator(java.util.Comparator,java.util.Collection)
*/ 
public static java.util.Iterator collatedIterator(java.util.Comparator p0,java.util.Collection p1){
	return org.apache.commons.collections.IteratorUtils.collatedIterator(p0,p1);
}
/**
*public static java.util.Collection org.apache.commons.collections.CollectionUtils.collect(java.util.Iterator,org.apache.commons.collections.Transformer)
*/ 
public static java.util.Collection collect(java.util.Iterator p0,org.apache.commons.collections.Transformer p1){
	return org.apache.commons.collections.CollectionUtils.collect(p0,p1);
}
/**
*public static java.util.Collection org.apache.commons.collections.CollectionUtils.collect(java.util.Iterator,org.apache.commons.collections.Transformer,java.util.Collection)
*/ 
public static java.util.Collection collect(java.util.Iterator p0,org.apache.commons.collections.Transformer p1,java.util.Collection p2){
	return org.apache.commons.collections.CollectionUtils.collect(p0,p1,p2);
}
/**
*public static java.util.Iterator<int[]> org.apache.commons.math3.util.CombinatoricsUtils.combinationsIterator(int,int)
*/ 
public static java.util.Iterator<int[]> combinationsIterator(int p0,int p1){
	return org.apache.commons.math3.util.CombinatoricsUtils.combinationsIterator(p0,p1);
}
/**
*public static <T> java.util.Iterator<T> com.google.common.collect.Iterators.concat(java.util.Iterator<? extends T>,java.util.Iterator<? extends T>)
*/ 
public static <T> java.util.Iterator<T> concat(java.util.Iterator<? extends T> p0,java.util.Iterator<? extends T> p1){
	return com.google.common.collect.Iterators.concat(p0,p1);
}
/**
*public static <T> java.util.Iterator<T> com.google.common.collect.Iterators.concat(java.util.Iterator<? extends T>,java.util.Iterator<? extends T>,java.util.Iterator<? extends T>)
*/ 
public static <T> java.util.Iterator<T> concat(java.util.Iterator<? extends T> p0,java.util.Iterator<? extends T> p1,java.util.Iterator<? extends T> p2){
	return com.google.common.collect.Iterators.concat(p0,p1,p2);
}
/**
*public static <T> java.util.Iterator<T> com.google.common.collect.Iterators.concat(java.util.Iterator<? extends java.util.Iterator<? extends T>>)
*/ 
public static <T> java.util.Iterator<T> concat(java.util.Iterator<? extends java.util.Iterator<? extends T>> p0){
	return com.google.common.collect.Iterators.concat(p0);
}
/**
*public static <T> java.util.Iterator<T> com.google.common.collect.Iterators.concat(java.util.Iterator<? extends T>...)
*/ 
public static <T> java.util.Iterator<T> concat(java.util.Iterator<? extends T>... p0){
	return com.google.common.collect.Iterators.concat(p0);
}
/**
*public static <T> java.util.Iterator<T> com.google.common.collect.Iterators.concat(java.util.Iterator<? extends T>,java.util.Iterator<? extends T>,java.util.Iterator<? extends T>,java.util.Iterator<? extends T>)
*/ 
public static <T> java.util.Iterator<T> concat(java.util.Iterator<? extends T> p0,java.util.Iterator<? extends T> p1,java.util.Iterator<? extends T> p2,java.util.Iterator<? extends T> p3){
	return com.google.common.collect.Iterators.concat(p0,p1,p2,p3);
}
/**
*public static <T> java.util.Iterator<T> com.google.common.collect.Iterators.consumingIterator(java.util.Iterator<T>)
*/ 
public static <T> java.util.Iterator<T> consumingIterator(java.util.Iterator<T> p0){
	return com.google.common.collect.Iterators.consumingIterator(p0);
}
/**
*public static <T> java.util.Iterator<T> com.google.common.collect.Iterators.cycle(java.lang.Iterable<T>)
*/ 
public static <T> java.util.Iterator<T> cycle(java.lang.Iterable<T> p0){
	return com.google.common.collect.Iterators.cycle(p0);
}
/**
*public static <T> java.util.Iterator<T> com.google.common.collect.Iterators.cycle(T...)
*/ 
public static <T> java.util.Iterator<T> cycle(T... p0){
	return com.google.common.collect.Iterators.cycle(p0);
}
/**
*public static java.util.Iterator org.apache.commons.collections.iterators.UnmodifiableIterator.decorate(java.util.Iterator)
*/ 
public static java.util.Iterator decorate(java.util.Iterator p0){
	return org.apache.commons.collections.iterators.UnmodifiableIterator.decorate(p0);
}
/**
*public static <E> java.util.Iterator<E> org.apache.commons.collections4.iterators.EmptyIterator.emptyIterator()
*/ 
public static <E> java.util.Iterator<E> emptyIterator(){
	return org.apache.commons.collections4.iterators.EmptyIterator.emptyIterator();
}
/**
*public static <E> java.util.Iterator<E> org.apache.commons.collections4.IteratorUtils.filteredIterator(java.util.Iterator<? extends E>,org.apache.commons.collections4.Predicate<? super E>)
*/ 
public static <E> java.util.Iterator<E> filteredIterator(java.util.Iterator<? extends E> p0,org.apache.commons.collections4.Predicate<? super E> p1){
	return org.apache.commons.collections4.IteratorUtils.filteredIterator(p0,p1);
}
/**
*public static java.util.Iterator org.apache.commons.collections.IteratorUtils.filteredIterator(java.util.Iterator,org.apache.commons.collections.Predicate)
*/ 
public static java.util.Iterator filteredIterator(java.util.Iterator p0,org.apache.commons.collections.Predicate p1){
	return org.apache.commons.collections.IteratorUtils.filteredIterator(p0,p1);
}
/**
*public static java.util.Iterator<?> org.apache.commons.collections4.IteratorUtils.getIterator(java.lang.Object)
*/ 
public static java.util.Iterator<?> getIterator(java.lang.Object p0){
	return org.apache.commons.collections4.IteratorUtils.getIterator(p0);
}
/**
*public static java.util.Iterator<java.io.File> org.apache.commons.io.FileUtils.iterateFiles(java.io.File,org.apache.commons.io.filefilter.IOFileFilter,org.apache.commons.io.filefilter.IOFileFilter)
*/ 
public static java.util.Iterator<java.io.File> iterateFiles(java.io.File p0,org.apache.commons.io.filefilter.IOFileFilter p1,org.apache.commons.io.filefilter.IOFileFilter p2){
	return org.apache.commons.io.FileUtils.iterateFiles(p0,p1,p2);
}
/**
*public static java.util.Iterator<java.io.File> org.apache.commons.io.FileUtils.iterateFiles(java.io.File,java.lang.String[],boolean)
*/ 
public static java.util.Iterator<java.io.File> iterateFiles(java.io.File p0,java.lang.String[] p1,boolean p2){
	return org.apache.commons.io.FileUtils.iterateFiles(p0,p1,p2);
}
/**
*public static java.util.Iterator<java.io.File> org.apache.commons.io.FileUtils.iterateFilesAndDirs(java.io.File,org.apache.commons.io.filefilter.IOFileFilter,org.apache.commons.io.filefilter.IOFileFilter)
*/ 
public static java.util.Iterator<java.io.File> iterateFilesAndDirs(java.io.File p0,org.apache.commons.io.filefilter.IOFileFilter p1,org.apache.commons.io.filefilter.IOFileFilter p2){
	return org.apache.commons.io.FileUtils.iterateFilesAndDirs(p0,p1,p2);
}
/**
*public static java.util.Iterator<java.util.Calendar> org.apache.commons.lang3.time.DateUtils.iterator(java.util.Date,int)
*/ 
public static java.util.Iterator<java.util.Calendar> iterator(java.util.Date p0,int p1){
	return org.apache.commons.lang3.time.DateUtils.iterator(p0,p1);
}
/**
*public static java.util.Iterator<java.util.Calendar> org.apache.commons.lang3.time.DateUtils.iterator(java.util.Calendar,int)
*/ 
public static java.util.Iterator<java.util.Calendar> iterator(java.util.Calendar p0,int p1){
	return org.apache.commons.lang3.time.DateUtils.iterator(p0,p1);
}
/**
*public static java.util.Iterator<?> org.apache.commons.lang3.time.DateUtils.iterator(java.lang.Object,int)
*/ 
public static java.util.Iterator<?> iterator(java.lang.Object p0,int p1){
	return org.apache.commons.lang3.time.DateUtils.iterator(p0,p1);
}
/**
*public static java.util.Iterator org.apache.commons.lang.enum.EnumUtils.iterator(java.lang.Class)
*/ 
public static java.util.Iterator iterator(java.lang.Class p0){
	return org.apache.commons.lang.enum.EnumUtils.iterator(p0);
}
/**
*public static java.lang.String org.apache.commons.lang.StringUtils.join(java.util.Iterator,char)
*/ 
public static java.lang.String join(java.util.Iterator p0,char p1){
	return org.apache.commons.lang.StringUtils.join(p0,p1);
}
/**
*public static java.lang.String org.apache.commons.lang.StringUtils.join(java.util.Iterator,java.lang.String)
*/ 
public static java.lang.String join(java.util.Iterator p0,java.lang.String p1){
	return org.apache.commons.lang.StringUtils.join(p0,p1);
}
/**
*public static <T> java.util.Iterator<T> com.google.common.collect.Iterators.limit(java.util.Iterator<T>,int)
*/ 
public static <T> java.util.Iterator<T> limit(java.util.Iterator<T> p0,int p1){
	return com.google.common.collect.Iterators.limit(p0,p1);
}
/**
*public static <E> java.util.Iterator<E> org.apache.commons.collections4.IteratorUtils.objectGraphIterator(E,org.apache.commons.collections4.Transformer<? super E, ? extends E>)
*/ 
public static <E> java.util.Iterator<E> objectGraphIterator(E p0,org.apache.commons.collections4.Transformer<? super E, ? extends E> p1){
	return org.apache.commons.collections4.IteratorUtils.objectGraphIterator(p0,p1);
}
/**
*public static java.util.Iterator org.apache.commons.collections.IteratorUtils.objectGraphIterator(java.lang.Object,org.apache.commons.collections.Transformer)
*/ 
public static java.util.Iterator objectGraphIterator(java.lang.Object p0,org.apache.commons.collections.Transformer p1){
	return org.apache.commons.collections.IteratorUtils.objectGraphIterator(p0,p1);
}
/**
*public static <E> java.util.Iterator<E> org.apache.commons.collections4.IteratorUtils.peekingIterator(java.util.Iterator<? extends E>)
*/ 
public static <E> java.util.Iterator<E> peekingIterator(java.util.Iterator<? extends E> p0){
	return org.apache.commons.collections4.IteratorUtils.peekingIterator(p0);
}
/**
*public static <E> java.util.Iterator<E> org.apache.commons.collections4.IteratorUtils.pushbackIterator(java.util.Iterator<? extends E>)
*/ 
public static <E> java.util.Iterator<E> pushbackIterator(java.util.Iterator<? extends E> p0){
	return org.apache.commons.collections4.IteratorUtils.pushbackIterator(p0);
}
/**
*public static java.lang.Object[] org.apache.commons.collections.IteratorUtils.toArray(java.util.Iterator)
*/ 
public static java.lang.Object[] toArray(java.util.Iterator p0){
	return org.apache.commons.collections.IteratorUtils.toArray(p0);
}
/**
*public static java.lang.Object[] org.apache.commons.collections.IteratorUtils.toArray(java.util.Iterator,java.lang.Class)
*/ 
public static java.lang.Object[] toArray(java.util.Iterator p0,java.lang.Class p1){
	return org.apache.commons.collections.IteratorUtils.toArray(p0,p1);
}
/**
*public static java.util.List org.apache.commons.collections.IteratorUtils.toList(java.util.Iterator,int)
*/ 
public static java.util.List toList(java.util.Iterator p0,int p1){
	return org.apache.commons.collections.IteratorUtils.toList(p0,p1);
}
/**
*public static java.util.List org.apache.commons.collections.IteratorUtils.toList(java.util.Iterator)
*/ 
public static java.util.List toList(java.util.Iterator p0){
	return org.apache.commons.collections.IteratorUtils.toList(p0);
}
/**
*public static java.util.ListIterator org.apache.commons.collections.IteratorUtils.toListIterator(java.util.Iterator)
*/ 
public static java.util.ListIterator toListIterator(java.util.Iterator p0){
	return org.apache.commons.collections.IteratorUtils.toListIterator(p0);
}
/**
*public static <F,T> java.util.Iterator<T> com.google.common.collect.Iterators.transform(java.util.Iterator<F>,com.google.common.base.Function<? super F, ? extends T>)
*/ 
public static <F,T> java.util.Iterator<T> transform(java.util.Iterator<F> p0,com.google.common.base.Function<? super F, ? extends T> p1){
	return com.google.common.collect.Iterators.transform(p0,p1);
}
/**
*public static <I,O> java.util.Iterator<O> org.apache.commons.collections4.IteratorUtils.transformedIterator(java.util.Iterator<? extends I>,org.apache.commons.collections4.Transformer<? super I, ? extends O>)
*/ 
public static <I,O> java.util.Iterator<O> transformedIterator(java.util.Iterator<? extends I> p0,org.apache.commons.collections4.Transformer<? super I, ? extends O> p1){
	return org.apache.commons.collections4.IteratorUtils.transformedIterator(p0,p1);
}
/**
*public static java.util.Iterator org.apache.commons.collections.IteratorUtils.transformedIterator(java.util.Iterator,org.apache.commons.collections.Transformer)
*/ 
public static java.util.Iterator transformedIterator(java.util.Iterator p0,org.apache.commons.collections.Transformer p1){
	return org.apache.commons.collections.IteratorUtils.transformedIterator(p0,p1);
}
/**
*public static <E> java.util.Iterator<E> org.apache.commons.collections4.IteratorUtils.unmodifiableIterator(java.util.Iterator<E>)
*/ 
public static <E> java.util.Iterator<E> unmodifiableIterator(java.util.Iterator<E> p0){
	return org.apache.commons.collections4.IteratorUtils.unmodifiableIterator(p0);
}
/**
*public static <E> java.util.Iterator<E> org.apache.commons.collections4.iterators.UnmodifiableIterator.unmodifiableIterator(java.util.Iterator<? extends E>)
*/ 
public static <E> java.util.Iterator<E> unmodifiableIterator(java.util.Iterator<? extends E> p0){
	return org.apache.commons.collections4.iterators.UnmodifiableIterator.unmodifiableIterator(p0);
}
/**
*public static java.util.Iterator org.apache.commons.collections.IteratorUtils.unmodifiableIterator(java.util.Iterator)
*/ 
public static java.util.Iterator unmodifiableIterator(java.util.Iterator p0){
	return org.apache.commons.collections.IteratorUtils.unmodifiableIterator(p0);
}
/**
*public static java.util.Iterator org.apache.commons.collections.primitives.adapters.ByteIteratorIterator.wrap(org.apache.commons.collections.primitives.ByteIterator)
*/ 
public static java.util.Iterator wrap(org.apache.commons.collections.primitives.ByteIterator p0){
	return org.apache.commons.collections.primitives.adapters.ByteIteratorIterator.wrap(p0);
}
/**
*public static java.util.Iterator org.apache.commons.collections.primitives.adapters.CharIteratorIterator.wrap(org.apache.commons.collections.primitives.CharIterator)
*/ 
public static java.util.Iterator wrap(org.apache.commons.collections.primitives.CharIterator p0){
	return org.apache.commons.collections.primitives.adapters.CharIteratorIterator.wrap(p0);
}
/**
*public static java.util.Iterator org.apache.commons.collections.primitives.adapters.DoubleIteratorIterator.wrap(org.apache.commons.collections.primitives.DoubleIterator)
*/ 
public static java.util.Iterator wrap(org.apache.commons.collections.primitives.DoubleIterator p0){
	return org.apache.commons.collections.primitives.adapters.DoubleIteratorIterator.wrap(p0);
}
/**
*public static java.util.Iterator org.apache.commons.collections.primitives.adapters.FloatIteratorIterator.wrap(org.apache.commons.collections.primitives.FloatIterator)
*/ 
public static java.util.Iterator wrap(org.apache.commons.collections.primitives.FloatIterator p0){
	return org.apache.commons.collections.primitives.adapters.FloatIteratorIterator.wrap(p0);
}
/**
*public static java.util.Iterator org.apache.commons.collections.primitives.adapters.IntIteratorIterator.wrap(org.apache.commons.collections.primitives.IntIterator)
*/ 
public static java.util.Iterator wrap(org.apache.commons.collections.primitives.IntIterator p0){
	return org.apache.commons.collections.primitives.adapters.IntIteratorIterator.wrap(p0);
}
/**
*public static org.apache.commons.collections.primitives.ByteIterator org.apache.commons.collections.primitives.adapters.IteratorByteIterator.wrap(java.util.Iterator)
*/ 
public static org.apache.commons.collections.primitives.ByteIterator wrap(java.util.Iterator p0){
	return org.apache.commons.collections.primitives.adapters.IteratorByteIterator.wrap(p0);
}
/**
*public static java.util.Iterator org.apache.commons.collections.primitives.adapters.LongIteratorIterator.wrap(org.apache.commons.collections.primitives.LongIterator)
*/ 
public static java.util.Iterator wrap(org.apache.commons.collections.primitives.LongIterator p0){
	return org.apache.commons.collections.primitives.adapters.LongIteratorIterator.wrap(p0);
}
/**
*public static java.util.Iterator org.apache.commons.collections.primitives.adapters.ShortIteratorIterator.wrap(org.apache.commons.collections.primitives.ShortIterator)
*/ 
public static java.util.Iterator wrap(org.apache.commons.collections.primitives.ShortIterator p0){
	return org.apache.commons.collections.primitives.adapters.ShortIteratorIterator.wrap(p0);
}
}
