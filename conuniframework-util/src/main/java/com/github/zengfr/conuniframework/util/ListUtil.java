package com.github.zengfr.conuniframework.util;
import java.util.*;
import java.util.Map.Entry;
import com.google.common.collect.Table;
import com.google.common.collect.Table.Cell;
/**
* @author zengfr
* @author https://github.com/zengfr/conuniframework-util
* @author https://gitee.com/zengfr/conuniframework-util
* @author  http://blog.csdn.net/zfrong/
* @author zengfr3000@qq.com
*/
public final class ListUtil{ 
/**
*{@link com.google.common.collect.Lists#asList(E,E...)}
*@see com.google.common.collect.Lists#asList(E,E...)
*<code>public static <E> java.util.List<E> com.google.common.collect.Lists.asList(E,E[])
*asList(E p0,E... p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E> java.util.List<E> asList(E p0,E... p1){
	return com.google.common.collect.Lists.asList(p0,p1);
}
/**
*{@link com.google.common.collect.Lists#asList(E,E,E...)}
*@see com.google.common.collect.Lists#asList(E,E,E...)
*<code>public static <E> java.util.List<E> com.google.common.collect.Lists.asList(E,E,E[])
*asList(E p0,E p1,E... p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E> java.util.List<E> asList(E p0,E p1,E... p2){
	return com.google.common.collect.Lists.asList(p0,p1,p2);
}
/**
*{@link com.google.common.primitives.Booleans#asList(boolean...)}
*@see com.google.common.primitives.Booleans#asList(boolean...)
*<code>public static java.util.List<java.lang.Boolean> com.google.common.primitives.Booleans.asList(boolean...)
*asList(boolean... p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.List<java.lang.Boolean> asList(boolean... p0){
	return com.google.common.primitives.Booleans.asList(p0);
}
/**
*{@link com.google.common.primitives.Bytes#asList(byte...)}
*@see com.google.common.primitives.Bytes#asList(byte...)
*<code>public static java.util.List<java.lang.Byte> com.google.common.primitives.Bytes.asList(byte...)
*asList(byte... p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.List<java.lang.Byte> asList(byte... p0){
	return com.google.common.primitives.Bytes.asList(p0);
}
/**
*{@link com.google.common.primitives.Chars#asList(char...)}
*@see com.google.common.primitives.Chars#asList(char...)
*<code>public static java.util.List<java.lang.Character> com.google.common.primitives.Chars.asList(char...)
*asList(char... p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.List<java.lang.Character> asList(char... p0){
	return com.google.common.primitives.Chars.asList(p0);
}
/**
*{@link com.google.common.primitives.Doubles#asList(double...)}
*@see com.google.common.primitives.Doubles#asList(double...)
*<code>public static java.util.List<java.lang.Double> com.google.common.primitives.Doubles.asList(double...)
*asList(double... p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.List<java.lang.Double> asList(double... p0){
	return com.google.common.primitives.Doubles.asList(p0);
}
/**
*{@link com.google.common.primitives.Floats#asList(float...)}
*@see com.google.common.primitives.Floats#asList(float...)
*<code>public static java.util.List<java.lang.Float> com.google.common.primitives.Floats.asList(float...)
*asList(float... p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.List<java.lang.Float> asList(float... p0){
	return com.google.common.primitives.Floats.asList(p0);
}
/**
*{@link com.google.common.primitives.Ints#asList(int...)}
*@see com.google.common.primitives.Ints#asList(int...)
*<code>public static java.util.List<java.lang.Integer> com.google.common.primitives.Ints.asList(int...)
*asList(int... p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.List<java.lang.Integer> asList(int... p0){
	return com.google.common.primitives.Ints.asList(p0);
}
/**
*{@link com.google.common.primitives.Longs#asList(long...)}
*@see com.google.common.primitives.Longs#asList(long...)
*<code>public static java.util.List<java.lang.Long> com.google.common.primitives.Longs.asList(long...)
*asList(long... p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.List<java.lang.Long> asList(long... p0){
	return com.google.common.primitives.Longs.asList(p0);
}
/**
*{@link com.google.common.primitives.Shorts#asList(short...)}
*@see com.google.common.primitives.Shorts#asList(short...)
*<code>public static java.util.List<java.lang.Short> com.google.common.primitives.Shorts.asList(short...)
*asList(short... p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.List<java.lang.Short> asList(short... p0){
	return com.google.common.primitives.Shorts.asList(p0);
}
/**
*{@link org.apache.commons.lang3.LocaleUtils#availableLocaleList()}
*@see org.apache.commons.lang3.LocaleUtils#availableLocaleList()
*<code>public static java.util.List<java.util.Locale> org.apache.commons.lang3.LocaleUtils.availableLocaleList()
*availableLocaleList()</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.List<java.util.Locale> availableLocaleList(){
	return org.apache.commons.lang3.LocaleUtils.availableLocaleList();
}
/**
*{@link com.google.common.collect.Lists#cartesianProduct(java.util.List<? extends B>...)}
*@see com.google.common.collect.Lists#cartesianProduct(java.util.List<? extends B>...)
*<code>public static <B> java.util.List<java.util.List<B>> com.google.common.collect.Lists.cartesianProduct(java.util.List<? extends B>...)
*cartesianProduct(java.util.List<? extends B>... p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <B> java.util.List<java.util.List<B>> cartesianProduct(java.util.List<? extends B>... p0){
	return com.google.common.collect.Lists.cartesianProduct(p0);
}
/**
*{@link com.google.common.collect.Lists#cartesianProduct(java.util.List<? extends java.util.List<? extends B>>)}
*@see com.google.common.collect.Lists#cartesianProduct(java.util.List<? extends java.util.List<? extends B>>)
*<code>public static <B> java.util.List<java.util.List<B>> com.google.common.collect.Lists.cartesianProduct(java.util.List<? extends java.util.List<? extends B>>)
*cartesianProduct(java.util.List<? extends java.util.List<? extends B>> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <B> java.util.List<java.util.List<B>> cartesianProduct(java.util.List<? extends java.util.List<? extends B>> p0){
	return com.google.common.collect.Lists.cartesianProduct(p0);
}
/**
*{@link com.google.common.collect.Lists#charactersOf(java.lang.CharSequence)}
*@see com.google.common.collect.Lists#charactersOf(java.lang.CharSequence)
*<code>public static java.util.List<java.lang.Character> com.google.common.collect.Lists.charactersOf(java.lang.CharSequence)
*charactersOf(java.lang.CharSequence p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.List<java.lang.Character> charactersOf(java.lang.CharSequence p0){
	return com.google.common.collect.Lists.charactersOf(p0);
}
/**
*{@link org.apache.commons.collections4.CollectionUtils#collate(java.lang.Iterable<? extends O>,java.lang.Iterable<? extends O>)}
*@see org.apache.commons.collections4.CollectionUtils#collate(java.lang.Iterable<? extends O>,java.lang.Iterable<? extends O>)
*<code>public static <O> java.util.List<O> org.apache.commons.collections4.CollectionUtils.collate(java.lang.Iterable<? extends O>,java.lang.Iterable<? extends O>)
*collate(java.lang.Iterable<? extends O> p0,java.lang.Iterable<? extends O> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <O extends java.lang.Comparable<? super O> > java.util.List<O> collate(java.lang.Iterable<? extends O> p0,java.lang.Iterable<? extends O> p1){
	return org.apache.commons.collections4.CollectionUtils.collate(p0,p1);
}
/**
*{@link org.apache.commons.collections4.CollectionUtils#collate(java.lang.Iterable<? extends O>,java.lang.Iterable<? extends O>,java.util.Comparator<? super O>,boolean)}
*@see org.apache.commons.collections4.CollectionUtils#collate(java.lang.Iterable<? extends O>,java.lang.Iterable<? extends O>,java.util.Comparator<? super O>,boolean)
*<code>public static <O> java.util.List<O> org.apache.commons.collections4.CollectionUtils.collate(java.lang.Iterable<? extends O>,java.lang.Iterable<? extends O>,java.util.Comparator<? super O>,boolean)
*collate(java.lang.Iterable<? extends O> p0,java.lang.Iterable<? extends O> p1,java.util.Comparator<? super O> p2,boolean p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <O> java.util.List<O> collate(java.lang.Iterable<? extends O> p0,java.lang.Iterable<? extends O> p1,java.util.Comparator<? super O> p2,boolean p3){
	return org.apache.commons.collections4.CollectionUtils.collate(p0,p1,p2,p3);
}
/**
*{@link org.apache.commons.collections4.CollectionUtils#collate(java.lang.Iterable<? extends O>,java.lang.Iterable<? extends O>,java.util.Comparator<? super O>)}
*@see org.apache.commons.collections4.CollectionUtils#collate(java.lang.Iterable<? extends O>,java.lang.Iterable<? extends O>,java.util.Comparator<? super O>)
*<code>public static <O> java.util.List<O> org.apache.commons.collections4.CollectionUtils.collate(java.lang.Iterable<? extends O>,java.lang.Iterable<? extends O>,java.util.Comparator<? super O>)
*collate(java.lang.Iterable<? extends O> p0,java.lang.Iterable<? extends O> p1,java.util.Comparator<? super O> p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <O> java.util.List<O> collate(java.lang.Iterable<? extends O> p0,java.lang.Iterable<? extends O> p1,java.util.Comparator<? super O> p2){
	return org.apache.commons.collections4.CollectionUtils.collate(p0,p1,p2);
}
/**
*{@link org.apache.commons.collections4.CollectionUtils#collate(java.lang.Iterable<? extends O>,java.lang.Iterable<? extends O>,boolean)}
*@see org.apache.commons.collections4.CollectionUtils#collate(java.lang.Iterable<? extends O>,java.lang.Iterable<? extends O>,boolean)
*<code>public static <O> java.util.List<O> org.apache.commons.collections4.CollectionUtils.collate(java.lang.Iterable<? extends O>,java.lang.Iterable<? extends O>,boolean)
*collate(java.lang.Iterable<? extends O> p0,java.lang.Iterable<? extends O> p1,boolean p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <O extends java.lang.Comparable<? super O> > java.util.List<O> collate(java.lang.Iterable<? extends O> p0,java.lang.Iterable<? extends O> p1,boolean p2){
	return org.apache.commons.collections4.CollectionUtils.collate(p0,p1,p2);
}
/**
*{@link org.apache.commons.math3.genetics.RandomKey#comparatorPermutation(java.util.List<S>,java.util.Comparator<S>)}
*@see org.apache.commons.math3.genetics.RandomKey#comparatorPermutation(java.util.List<S>,java.util.Comparator<S>)
*<code>public static <S> java.util.List<java.lang.Double> org.apache.commons.math3.genetics.RandomKey.comparatorPermutation(java.util.List<S>,java.util.Comparator<S>)
*comparatorPermutation(java.util.List<S> p0,java.util.Comparator<S> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <S> java.util.List<java.lang.Double> comparatorPermutation(java.util.List<S> p0,java.util.Comparator<S> p1){
	return org.apache.commons.math3.genetics.RandomKey.comparatorPermutation(p0,p1);
}
/**
*{@link org.apache.commons.lang3.ClassUtils#convertClassNamesToClasses(java.util.List<java.lang.String>)}
*@see org.apache.commons.lang3.ClassUtils#convertClassNamesToClasses(java.util.List<java.lang.String>)
*<code>public static java.util.List<java.lang.Class<?>> org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses(java.util.List<java.lang.String>)
*convertClassNamesToClasses(java.util.List<java.lang.String> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.List<java.lang.Class<?>> convertClassNamesToClasses(java.util.List<java.lang.String> p0){
	return org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses(p0);
}
/**
*{@link org.apache.commons.lang3.ClassUtils#convertClassesToClassNames(java.util.List<java.lang.Class<?>>)}
*@see org.apache.commons.lang3.ClassUtils#convertClassesToClassNames(java.util.List<java.lang.Class<?>>)
*<code>public static java.util.List<java.lang.String> org.apache.commons.lang3.ClassUtils.convertClassesToClassNames(java.util.List<java.lang.Class<?>>)
*convertClassesToClassNames(java.util.List<java.lang.Class<?>> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.List<java.lang.String> convertClassesToClassNames(java.util.List<java.lang.Class<?>> p0){
	return org.apache.commons.lang3.ClassUtils.convertClassesToClassNames(p0);
}
/**
*{@link com.facebook.collectionsbase.Piles#copyOf(java.util.Iterator<T>)}
*@see com.facebook.collectionsbase.Piles#copyOf(java.util.Iterator<T>)
*<code>public static <T> java.util.List<T> com.facebook.collectionsbase.Piles.copyOf(java.util.Iterator<T>)
*copyOf(java.util.Iterator<T> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> java.util.List<T> copyOf(java.util.Iterator<T> p0){
	return com.facebook.collectionsbase.Piles.copyOf(p0);
}
/**
*{@link org.apache.commons.lang3.LocaleUtils#countriesByLanguage(java.lang.String)}
*@see org.apache.commons.lang3.LocaleUtils#countriesByLanguage(java.lang.String)
*<code>public static java.util.List<java.util.Locale> org.apache.commons.lang3.LocaleUtils.countriesByLanguage(java.lang.String)
*countriesByLanguage(java.lang.String p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.List<java.util.Locale> countriesByLanguage(java.lang.String p0){
	return org.apache.commons.lang3.LocaleUtils.countriesByLanguage(p0);
}
/**
*{@link org.apache.commons.collections.list.PredicatedList#decorate(java.util.List,org.apache.commons.collections.Predicate)}
*@see org.apache.commons.collections.list.PredicatedList#decorate(java.util.List,org.apache.commons.collections.Predicate)
*<code>public static java.util.List org.apache.commons.collections.list.PredicatedList.decorate(java.util.List,org.apache.commons.collections.Predicate)
*decorate(java.util.List p0,org.apache.commons.collections.Predicate p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.List decorate(java.util.List p0,org.apache.commons.collections.Predicate p1){
	return org.apache.commons.collections.list.PredicatedList.decorate(p0,p1);
}
/**
*{@link org.apache.commons.collections.list.FixedSizeList#decorate(java.util.List)}
*@see org.apache.commons.collections.list.FixedSizeList#decorate(java.util.List)
*<code>public static java.util.List org.apache.commons.collections.list.FixedSizeList.decorate(java.util.List)
*decorate(java.util.List p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.List decorate(java.util.List p0){
	return org.apache.commons.collections.list.FixedSizeList.decorate(p0);
}
/**
*{@link org.apache.commons.collections.list.LazyList#decorate(java.util.List,org.apache.commons.collections.Factory)}
*@see org.apache.commons.collections.list.LazyList#decorate(java.util.List,org.apache.commons.collections.Factory)
*<code>public static java.util.List org.apache.commons.collections.list.LazyList.decorate(java.util.List,org.apache.commons.collections.Factory)
*decorate(java.util.List p0,org.apache.commons.collections.Factory p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.List decorate(java.util.List p0,org.apache.commons.collections.Factory p1){
	return org.apache.commons.collections.list.LazyList.decorate(p0,p1);
}
/**
*{@link org.apache.commons.collections.list.TypedList#decorate(java.util.List,java.lang.Class)}
*@see org.apache.commons.collections.list.TypedList#decorate(java.util.List,java.lang.Class)
*<code>public static java.util.List org.apache.commons.collections.list.TypedList.decorate(java.util.List,java.lang.Class)
*decorate(java.util.List p0,java.lang.Class p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.List decorate(java.util.List p0,java.lang.Class p1){
	return org.apache.commons.collections.list.TypedList.decorate(p0,p1);
}
/**
*{@link org.apache.commons.collections.list.TransformedList#decorate(java.util.List,org.apache.commons.collections.Transformer)}
*@see org.apache.commons.collections.list.TransformedList#decorate(java.util.List,org.apache.commons.collections.Transformer)
*<code>public static java.util.List org.apache.commons.collections.list.TransformedList.decorate(java.util.List,org.apache.commons.collections.Transformer)
*decorate(java.util.List p0,org.apache.commons.collections.Transformer p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.List decorate(java.util.List p0,org.apache.commons.collections.Transformer p1){
	return org.apache.commons.collections.list.TransformedList.decorate(p0,p1);
}
/**
*{@link org.apache.commons.collections.set.ListOrderedSet#decorate(java.util.Set,java.util.List)}
*@see org.apache.commons.collections.set.ListOrderedSet#decorate(java.util.Set,java.util.List)
*<code>public static org.apache.commons.collections.set.ListOrderedSet org.apache.commons.collections.set.ListOrderedSet.decorate(java.util.Set,java.util.List)
*decorate(java.util.Set p0,java.util.List p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.set.ListOrderedSet decorate(java.util.Set p0,java.util.List p1){
	return org.apache.commons.collections.set.ListOrderedSet.decorate(p0,p1);
}
/**
*{@link org.apache.commons.collections4.ListUtils#defaultIfNull(java.util.List<T>,java.util.List<T>)}
*@see org.apache.commons.collections4.ListUtils#defaultIfNull(java.util.List<T>,java.util.List<T>)
*<code>public static <T> java.util.List<T> org.apache.commons.collections4.ListUtils.defaultIfNull(java.util.List<T>,java.util.List<T>)
*defaultIfNull(java.util.List<T> p0,java.util.List<T> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> java.util.List<T> defaultIfNull(java.util.List<T> p0,java.util.List<T> p1){
	return org.apache.commons.collections4.ListUtils.defaultIfNull(p0,p1);
}
/**
*{@link org.apache.commons.collections4.ListUtils#emptyIfNull(java.util.List<T>)}
*@see org.apache.commons.collections4.ListUtils#emptyIfNull(java.util.List<T>)
*<code>public static <T> java.util.List<T> org.apache.commons.collections4.ListUtils.emptyIfNull(java.util.List<T>)
*emptyIfNull(java.util.List<T> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> java.util.List<T> emptyIfNull(java.util.List<T> p0){
	return org.apache.commons.collections4.ListUtils.emptyIfNull(p0);
}
/**
*{@link org.apache.commons.io.filefilter.FileFilterUtils#filterList(org.apache.commons.io.filefilter.IOFileFilter,java.lang.Iterable<java.io.File>)}
*@see org.apache.commons.io.filefilter.FileFilterUtils#filterList(org.apache.commons.io.filefilter.IOFileFilter,java.lang.Iterable<java.io.File>)
*<code>public static java.util.List<java.io.File> org.apache.commons.io.filefilter.FileFilterUtils.filterList(org.apache.commons.io.filefilter.IOFileFilter,java.lang.Iterable<java.io.File>)
*filterList(org.apache.commons.io.filefilter.IOFileFilter p0,java.lang.Iterable<java.io.File> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.List<java.io.File> filterList(org.apache.commons.io.filefilter.IOFileFilter p0,java.lang.Iterable<java.io.File> p1){
	return org.apache.commons.io.filefilter.FileFilterUtils.filterList(p0,p1);
}
/**
*{@link org.apache.commons.io.filefilter.FileFilterUtils#filterList(org.apache.commons.io.filefilter.IOFileFilter,java.io.File...)}
*@see org.apache.commons.io.filefilter.FileFilterUtils#filterList(org.apache.commons.io.filefilter.IOFileFilter,java.io.File...)
*<code>public static java.util.List<java.io.File> org.apache.commons.io.filefilter.FileFilterUtils.filterList(org.apache.commons.io.filefilter.IOFileFilter,java.io.File...)
*filterList(org.apache.commons.io.filefilter.IOFileFilter p0,java.io.File... p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.List<java.io.File> filterList(org.apache.commons.io.filefilter.IOFileFilter p0,java.io.File... p1){
	return org.apache.commons.io.filefilter.FileFilterUtils.filterList(p0,p1);
}
/**
*{@link org.apache.commons.collections4.ListUtils#fixedSizeList(java.util.List<E>)}
*@see org.apache.commons.collections4.ListUtils#fixedSizeList(java.util.List<E>)
*<code>public static <E> java.util.List<E> org.apache.commons.collections4.ListUtils.fixedSizeList(java.util.List<E>)
*fixedSizeList(java.util.List<E> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E> java.util.List<E> fixedSizeList(java.util.List<E> p0){
	return org.apache.commons.collections4.ListUtils.fixedSizeList(p0);
}
/**
*{@link org.apache.commons.collections.ListUtils#fixedSizeList(java.util.List)}
*@see org.apache.commons.collections.ListUtils#fixedSizeList(java.util.List)
*<code>public static java.util.List org.apache.commons.collections.ListUtils.fixedSizeList(java.util.List)
*fixedSizeList(java.util.List p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.List fixedSizeList(java.util.List p0){
	return org.apache.commons.collections.ListUtils.fixedSizeList(p0);
}
/**
*{@link org.apache.commons.lang3.reflect.FieldUtils#getAllFieldsList(java.lang.Class<?>)}
*@see org.apache.commons.lang3.reflect.FieldUtils#getAllFieldsList(java.lang.Class<?>)
*<code>public static java.util.List<java.lang.reflect.Field> org.apache.commons.lang3.reflect.FieldUtils.getAllFieldsList(java.lang.Class<?>)
*getAllFieldsList(java.lang.Class<?> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.List<java.lang.reflect.Field> getAllFieldsList(java.lang.Class<?> p0){
	return org.apache.commons.lang3.reflect.FieldUtils.getAllFieldsList(p0);
}
/**
*{@link org.apache.commons.lang3.ClassUtils#getAllInterfaces(java.lang.Class<?>)}
*@see org.apache.commons.lang3.ClassUtils#getAllInterfaces(java.lang.Class<?>)
*<code>public static java.util.List<java.lang.Class<?>> org.apache.commons.lang3.ClassUtils.getAllInterfaces(java.lang.Class<?>)
*getAllInterfaces(java.lang.Class<?> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.List<java.lang.Class<?>> getAllInterfaces(java.lang.Class<?> p0){
	return org.apache.commons.lang3.ClassUtils.getAllInterfaces(p0);
}
/**
*{@link org.apache.commons.lang3.ClassUtils#getAllSuperclasses(java.lang.Class<?>)}
*@see org.apache.commons.lang3.ClassUtils#getAllSuperclasses(java.lang.Class<?>)
*<code>public static java.util.List<java.lang.Class<?>> org.apache.commons.lang3.ClassUtils.getAllSuperclasses(java.lang.Class<?>)
*getAllSuperclasses(java.lang.Class<?> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.List<java.lang.Class<?>> getAllSuperclasses(java.lang.Class<?> p0){
	return org.apache.commons.lang3.ClassUtils.getAllSuperclasses(p0);
}
/**
*{@link com.google.common.base.Throwables#getCausalChain(java.lang.Throwable)}
*@see com.google.common.base.Throwables#getCausalChain(java.lang.Throwable)
*<code>public static java.util.List<java.lang.Throwable> com.google.common.base.Throwables.getCausalChain(java.lang.Throwable)
*getCausalChain(java.lang.Throwable p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.List<java.lang.Throwable> getCausalChain(java.lang.Throwable p0){
	return com.google.common.base.Throwables.getCausalChain(p0);
}
/**
*{@link org.codehaus.plexus.util.FileUtils#getDefaultExcludesAsList()}
*@see org.codehaus.plexus.util.FileUtils#getDefaultExcludesAsList()
*<code>public static java.util.List<java.lang.String> org.codehaus.plexus.util.FileUtils.getDefaultExcludesAsList()
*getDefaultExcludesAsList()</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.List<java.lang.String> getDefaultExcludesAsList(){
	return org.codehaus.plexus.util.FileUtils.getDefaultExcludesAsList();
}
/**
*{@link org.codehaus.plexus.util.FileUtils#getDirectoryNames(java.io.File,java.lang.String,java.lang.String,boolean)}
*@see org.codehaus.plexus.util.FileUtils#getDirectoryNames(java.io.File,java.lang.String,java.lang.String,boolean)
*<code>public static java.util.List<java.lang.String> org.codehaus.plexus.util.FileUtils.getDirectoryNames(java.io.File,java.lang.String,java.lang.String,boolean) throws java.io.IOException
*getDirectoryNames(java.io.File p0,java.lang.String p1,java.lang.String p2,boolean p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.List<java.lang.String> getDirectoryNames(java.io.File p0,java.lang.String p1,java.lang.String p2,boolean p3) throws java.io.IOException{
	return org.codehaus.plexus.util.FileUtils.getDirectoryNames(p0,p1,p2,p3);
}
/**
*{@link org.codehaus.plexus.util.FileUtils#getDirectoryNames(java.io.File,java.lang.String,java.lang.String,boolean,boolean)}
*@see org.codehaus.plexus.util.FileUtils#getDirectoryNames(java.io.File,java.lang.String,java.lang.String,boolean,boolean)
*<code>public static java.util.List<java.lang.String> org.codehaus.plexus.util.FileUtils.getDirectoryNames(java.io.File,java.lang.String,java.lang.String,boolean,boolean) throws java.io.IOException
*getDirectoryNames(java.io.File p0,java.lang.String p1,java.lang.String p2,boolean p3,boolean p4)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.List<java.lang.String> getDirectoryNames(java.io.File p0,java.lang.String p1,java.lang.String p2,boolean p3,boolean p4) throws java.io.IOException{
	return org.codehaus.plexus.util.FileUtils.getDirectoryNames(p0,p1,p2,p3,p4);
}
/**
*{@link org.apache.commons.lang3.EnumUtils#getEnumList(java.lang.Class<E>)}
*@see org.apache.commons.lang3.EnumUtils#getEnumList(java.lang.Class<E>)
*<code>public static <E> java.util.List<E> org.apache.commons.lang3.EnumUtils.getEnumList(java.lang.Class<E>)
*getEnumList(java.lang.Class<E> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E extends java.lang.Enum<E> > java.util.List<E> getEnumList(java.lang.Class<E> p0){
	return org.apache.commons.lang3.EnumUtils.getEnumList(p0);
}
/**
*{@link org.codehaus.plexus.util.ReflectionUtils#getFieldsIncludingSuperclasses(java.lang.Class<?>)}
*@see org.codehaus.plexus.util.ReflectionUtils#getFieldsIncludingSuperclasses(java.lang.Class<?>)
*<code>public static java.util.List<java.lang.reflect.Field> org.codehaus.plexus.util.ReflectionUtils.getFieldsIncludingSuperclasses(java.lang.Class<?>)
*getFieldsIncludingSuperclasses(java.lang.Class<?> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.List<java.lang.reflect.Field> getFieldsIncludingSuperclasses(java.lang.Class<?> p0){
	return org.codehaus.plexus.util.ReflectionUtils.getFieldsIncludingSuperclasses(p0);
}
/**
*{@link org.apache.commons.lang3.reflect.FieldUtils#getFieldsListWithAnnotation(java.lang.Class<?>,java.lang.Class<? extends java.lang.annotation.Annotation>)}
*@see org.apache.commons.lang3.reflect.FieldUtils#getFieldsListWithAnnotation(java.lang.Class<?>,java.lang.Class<? extends java.lang.annotation.Annotation>)
*<code>public static java.util.List<java.lang.reflect.Field> org.apache.commons.lang3.reflect.FieldUtils.getFieldsListWithAnnotation(java.lang.Class<?>,java.lang.Class<? extends java.lang.annotation.Annotation>)
*getFieldsListWithAnnotation(java.lang.Class<?> p0,java.lang.Class<? extends java.lang.annotation.Annotation> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.List<java.lang.reflect.Field> getFieldsListWithAnnotation(java.lang.Class<?> p0,java.lang.Class<? extends java.lang.annotation.Annotation> p1){
	return org.apache.commons.lang3.reflect.FieldUtils.getFieldsListWithAnnotation(p0,p1);
}
/**
*{@link org.codehaus.plexus.util.FileUtils#getFileAndDirectoryNames(java.io.File,java.lang.String,java.lang.String,boolean,boolean,boolean,boolean)}
*@see org.codehaus.plexus.util.FileUtils#getFileAndDirectoryNames(java.io.File,java.lang.String,java.lang.String,boolean,boolean,boolean,boolean)
*<code>public static java.util.List<java.lang.String> org.codehaus.plexus.util.FileUtils.getFileAndDirectoryNames(java.io.File,java.lang.String,java.lang.String,boolean,boolean,boolean,boolean) throws java.io.IOException
*getFileAndDirectoryNames(java.io.File p0,java.lang.String p1,java.lang.String p2,boolean p3,boolean p4,boolean p5,boolean p6)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.List<java.lang.String> getFileAndDirectoryNames(java.io.File p0,java.lang.String p1,java.lang.String p2,boolean p3,boolean p4,boolean p5,boolean p6) throws java.io.IOException{
	return org.codehaus.plexus.util.FileUtils.getFileAndDirectoryNames(p0,p1,p2,p3,p4,p5,p6);
}
/**
*{@link org.codehaus.plexus.util.FileUtils#getFileNames(java.io.File,java.lang.String,java.lang.String,boolean,boolean)}
*@see org.codehaus.plexus.util.FileUtils#getFileNames(java.io.File,java.lang.String,java.lang.String,boolean,boolean)
*<code>public static java.util.List<java.lang.String> org.codehaus.plexus.util.FileUtils.getFileNames(java.io.File,java.lang.String,java.lang.String,boolean,boolean) throws java.io.IOException
*getFileNames(java.io.File p0,java.lang.String p1,java.lang.String p2,boolean p3,boolean p4)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.List<java.lang.String> getFileNames(java.io.File p0,java.lang.String p1,java.lang.String p2,boolean p3,boolean p4) throws java.io.IOException{
	return org.codehaus.plexus.util.FileUtils.getFileNames(p0,p1,p2,p3,p4);
}
/**
*{@link org.codehaus.plexus.util.FileUtils#getFileNames(java.io.File,java.lang.String,java.lang.String,boolean)}
*@see org.codehaus.plexus.util.FileUtils#getFileNames(java.io.File,java.lang.String,java.lang.String,boolean)
*<code>public static java.util.List<java.lang.String> org.codehaus.plexus.util.FileUtils.getFileNames(java.io.File,java.lang.String,java.lang.String,boolean) throws java.io.IOException
*getFileNames(java.io.File p0,java.lang.String p1,java.lang.String p2,boolean p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.List<java.lang.String> getFileNames(java.io.File p0,java.lang.String p1,java.lang.String p2,boolean p3) throws java.io.IOException{
	return org.codehaus.plexus.util.FileUtils.getFileNames(p0,p1,p2,p3);
}
/**
*{@link org.codehaus.plexus.util.FileUtils#getFiles(java.io.File,java.lang.String,java.lang.String,boolean)}
*@see org.codehaus.plexus.util.FileUtils#getFiles(java.io.File,java.lang.String,java.lang.String,boolean)
*<code>public static java.util.List<java.io.File> org.codehaus.plexus.util.FileUtils.getFiles(java.io.File,java.lang.String,java.lang.String,boolean) throws java.io.IOException
*getFiles(java.io.File p0,java.lang.String p1,java.lang.String p2,boolean p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.List<java.io.File> getFiles(java.io.File p0,java.lang.String p1,java.lang.String p2,boolean p3) throws java.io.IOException{
	return org.codehaus.plexus.util.FileUtils.getFiles(p0,p1,p2,p3);
}
/**
*{@link org.codehaus.plexus.util.FileUtils#getFiles(java.io.File,java.lang.String,java.lang.String)}
*@see org.codehaus.plexus.util.FileUtils#getFiles(java.io.File,java.lang.String,java.lang.String)
*<code>public static java.util.List<java.io.File> org.codehaus.plexus.util.FileUtils.getFiles(java.io.File,java.lang.String,java.lang.String) throws java.io.IOException
*getFiles(java.io.File p0,java.lang.String p1,java.lang.String p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.List<java.io.File> getFiles(java.io.File p0,java.lang.String p1,java.lang.String p2) throws java.io.IOException{
	return org.codehaus.plexus.util.FileUtils.getFiles(p0,p1,p2);
}
/**
*{@link org.apache.commons.lang3.reflect.MethodUtils#getMethodsListWithAnnotation(java.lang.Class<?>,java.lang.Class<? extends java.lang.annotation.Annotation>,boolean,boolean)}
*@see org.apache.commons.lang3.reflect.MethodUtils#getMethodsListWithAnnotation(java.lang.Class<?>,java.lang.Class<? extends java.lang.annotation.Annotation>,boolean,boolean)
*<code>public static java.util.List<java.lang.reflect.Method> org.apache.commons.lang3.reflect.MethodUtils.getMethodsListWithAnnotation(java.lang.Class<?>,java.lang.Class<? extends java.lang.annotation.Annotation>,boolean,boolean)
*getMethodsListWithAnnotation(java.lang.Class<?> p0,java.lang.Class<? extends java.lang.annotation.Annotation> p1,boolean p2,boolean p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.List<java.lang.reflect.Method> getMethodsListWithAnnotation(java.lang.Class<?> p0,java.lang.Class<? extends java.lang.annotation.Annotation> p1,boolean p2,boolean p3){
	return org.apache.commons.lang3.reflect.MethodUtils.getMethodsListWithAnnotation(p0,p1,p2,p3);
}
/**
*{@link org.apache.commons.lang3.reflect.MethodUtils#getMethodsListWithAnnotation(java.lang.Class<?>,java.lang.Class<? extends java.lang.annotation.Annotation>)}
*@see org.apache.commons.lang3.reflect.MethodUtils#getMethodsListWithAnnotation(java.lang.Class<?>,java.lang.Class<? extends java.lang.annotation.Annotation>)
*<code>public static java.util.List<java.lang.reflect.Method> org.apache.commons.lang3.reflect.MethodUtils.getMethodsListWithAnnotation(java.lang.Class<?>,java.lang.Class<? extends java.lang.annotation.Annotation>)
*getMethodsListWithAnnotation(java.lang.Class<?> p0,java.lang.Class<? extends java.lang.annotation.Annotation> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.List<java.lang.reflect.Method> getMethodsListWithAnnotation(java.lang.Class<?> p0,java.lang.Class<? extends java.lang.annotation.Annotation> p1){
	return org.apache.commons.lang3.reflect.MethodUtils.getMethodsListWithAnnotation(p0,p1);
}
/**
*{@link org.codehaus.plexus.util.ReflectionUtils#getSetters(java.lang.Class<?>)}
*@see org.codehaus.plexus.util.ReflectionUtils#getSetters(java.lang.Class<?>)
*<code>public static java.util.List<java.lang.reflect.Method> org.codehaus.plexus.util.ReflectionUtils.getSetters(java.lang.Class<?>)
*getSetters(java.lang.Class<?> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.List<java.lang.reflect.Method> getSetters(java.lang.Class<?> p0){
	return org.codehaus.plexus.util.ReflectionUtils.getSetters(p0);
}
/**
*{@link org.apache.commons.lang3.exception.ExceptionUtils#getThrowableList(java.lang.Throwable)}
*@see org.apache.commons.lang3.exception.ExceptionUtils#getThrowableList(java.lang.Throwable)
*<code>public static java.util.List<java.lang.Throwable> org.apache.commons.lang3.exception.ExceptionUtils.getThrowableList(java.lang.Throwable)
*getThrowableList(java.lang.Throwable p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.List<java.lang.Throwable> getThrowableList(java.lang.Throwable p0){
	return org.apache.commons.lang3.exception.ExceptionUtils.getThrowableList(p0);
}
/**
*{@link org.apache.commons.collections4.MultiMapUtils#getValuesAsList(org.apache.commons.collections4.MultiValuedMap<K, V>,K)}
*@see org.apache.commons.collections4.MultiMapUtils#getValuesAsList(org.apache.commons.collections4.MultiValuedMap<K, V>,K)
*<code>public static <K,V> java.util.List<V> org.apache.commons.collections4.MultiMapUtils.getValuesAsList(org.apache.commons.collections4.MultiValuedMap<K, V>,K)
*getValuesAsList(org.apache.commons.collections4.MultiValuedMap<K, V> p0,K p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K,V> java.util.List<V> getValuesAsList(org.apache.commons.collections4.MultiValuedMap<K, V> p0,K p1){
	return org.apache.commons.collections4.MultiMapUtils.getValuesAsList(p0,p1);
}
/**
*{@link org.codehaus.plexus.util.dag.CycleDetector#hasCycle(org.codehaus.plexus.util.dag.DAG)}
*@see org.codehaus.plexus.util.dag.CycleDetector#hasCycle(org.codehaus.plexus.util.dag.DAG)
*<code>public static java.util.List<java.lang.String> org.codehaus.plexus.util.dag.CycleDetector.hasCycle(org.codehaus.plexus.util.dag.DAG)
*hasCycle(org.codehaus.plexus.util.dag.DAG p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.List<java.lang.String> hasCycle(org.codehaus.plexus.util.dag.DAG p0){
	return org.codehaus.plexus.util.dag.CycleDetector.hasCycle(p0);
}
/**
*{@link org.apache.commons.math3.genetics.RandomKey#identityPermutation(int)}
*@see org.apache.commons.math3.genetics.RandomKey#identityPermutation(int)
*<code>public static final java.util.List<java.lang.Double> org.apache.commons.math3.genetics.RandomKey.identityPermutation(int)
*identityPermutation(int p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static final java.util.List<java.lang.Double> identityPermutation(int p0){
	return org.apache.commons.math3.genetics.RandomKey.identityPermutation(p0);
}
/**
*{@link com.facebook.util.StreamImporter#importLines(java.io.InputStream)}
*@see com.facebook.util.StreamImporter#importLines(java.io.InputStream)
*<code>public static java.util.List<java.lang.String> com.facebook.util.StreamImporter.importLines(java.io.InputStream) throws java.io.IOException
*importLines(java.io.InputStream p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.List<java.lang.String> importLines(java.io.InputStream p0) throws java.io.IOException{
	return com.facebook.util.StreamImporter.importLines(p0);
}
/**
*{@link org.apache.commons.math3.genetics.RandomKey#inducedPermutation(java.util.List<S>,java.util.List<S>)}
*@see org.apache.commons.math3.genetics.RandomKey#inducedPermutation(java.util.List<S>,java.util.List<S>)
*<code>public static <S> java.util.List<java.lang.Double> org.apache.commons.math3.genetics.RandomKey.inducedPermutation(java.util.List<S>,java.util.List<S>) throws org.apache.commons.math3.exception.DimensionMismatchException,org.apache.commons.math3.exception.MathIllegalArgumentException
*inducedPermutation(java.util.List<S> p0,java.util.List<S> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <S> java.util.List<java.lang.Double> inducedPermutation(java.util.List<S> p0,java.util.List<S> p1) throws org.apache.commons.math3.exception.DimensionMismatchException,org.apache.commons.math3.exception.MathIllegalArgumentException{
	return org.apache.commons.math3.genetics.RandomKey.inducedPermutation(p0,p1);
}
/**
*{@link org.apache.commons.collections4.ListUtils#intersection(java.util.List<? extends E>,java.util.List<? extends E>)}
*@see org.apache.commons.collections4.ListUtils#intersection(java.util.List<? extends E>,java.util.List<? extends E>)
*<code>public static <E> java.util.List<E> org.apache.commons.collections4.ListUtils.intersection(java.util.List<? extends E>,java.util.List<? extends E>)
*intersection(java.util.List<? extends E> p0,java.util.List<? extends E> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E> java.util.List<E> intersection(java.util.List<? extends E> p0,java.util.List<? extends E> p1){
	return org.apache.commons.collections4.ListUtils.intersection(p0,p1);
}
/**
*{@link org.apache.commons.collections.ListUtils#intersection(java.util.List,java.util.List)}
*@see org.apache.commons.collections.ListUtils#intersection(java.util.List,java.util.List)
*<code>public static java.util.List org.apache.commons.collections.ListUtils.intersection(java.util.List,java.util.List)
*intersection(java.util.List p0,java.util.List p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.List intersection(java.util.List p0,java.util.List p1){
	return org.apache.commons.collections.ListUtils.intersection(p0,p1);
}
/**
*{@link org.codehaus.plexus.util.dag.CycleDetector#introducesCycle(org.codehaus.plexus.util.dag.Vertex)}
*@see org.codehaus.plexus.util.dag.CycleDetector#introducesCycle(org.codehaus.plexus.util.dag.Vertex)
*<code>public static java.util.List<java.lang.String> org.codehaus.plexus.util.dag.CycleDetector.introducesCycle(org.codehaus.plexus.util.dag.Vertex)
*introducesCycle(org.codehaus.plexus.util.dag.Vertex p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.List<java.lang.String> introducesCycle(org.codehaus.plexus.util.dag.Vertex p0){
	return org.codehaus.plexus.util.dag.CycleDetector.introducesCycle(p0);
}
/**
*{@link org.codehaus.plexus.util.dag.CycleDetector#introducesCycle(org.codehaus.plexus.util.dag.Vertex,java.util.Map<org.codehaus.plexus.util.dag.Vertex, java.lang.Integer>)}
*@see org.codehaus.plexus.util.dag.CycleDetector#introducesCycle(org.codehaus.plexus.util.dag.Vertex,java.util.Map<org.codehaus.plexus.util.dag.Vertex, java.lang.Integer>)
*<code>public static java.util.List<java.lang.String> org.codehaus.plexus.util.dag.CycleDetector.introducesCycle(org.codehaus.plexus.util.dag.Vertex,java.util.Map<org.codehaus.plexus.util.dag.Vertex, java.lang.Integer>)
*introducesCycle(org.codehaus.plexus.util.dag.Vertex p0,java.util.Map<org.codehaus.plexus.util.dag.Vertex, java.lang.Integer> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.List<java.lang.String> introducesCycle(org.codehaus.plexus.util.dag.Vertex p0,java.util.Map<org.codehaus.plexus.util.dag.Vertex, java.lang.Integer> p1){
	return org.codehaus.plexus.util.dag.CycleDetector.introducesCycle(p0,p1);
}
/**
*{@link org.codehaus.plexus.util.CollectionUtils#iteratorToList(java.util.Iterator<E>)}
*@see org.codehaus.plexus.util.CollectionUtils#iteratorToList(java.util.Iterator<E>)
*<code>public static <E> java.util.List<E> org.codehaus.plexus.util.CollectionUtils.iteratorToList(java.util.Iterator<E>)
*iteratorToList(java.util.Iterator<E> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E> java.util.List<E> iteratorToList(java.util.Iterator<E> p0){
	return org.codehaus.plexus.util.CollectionUtils.iteratorToList(p0);
}
/**
*{@link org.apache.commons.lang3.LocaleUtils#languagesByCountry(java.lang.String)}
*@see org.apache.commons.lang3.LocaleUtils#languagesByCountry(java.lang.String)
*<code>public static java.util.List<java.util.Locale> org.apache.commons.lang3.LocaleUtils.languagesByCountry(java.lang.String)
*languagesByCountry(java.lang.String p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.List<java.util.Locale> languagesByCountry(java.lang.String p0){
	return org.apache.commons.lang3.LocaleUtils.languagesByCountry(p0);
}
/**
*{@link org.apache.commons.collections4.ListUtils#lazyList(java.util.List<E>,org.apache.commons.collections4.Transformer<java.lang.Integer, ? extends E>)}
*@see org.apache.commons.collections4.ListUtils#lazyList(java.util.List<E>,org.apache.commons.collections4.Transformer<java.lang.Integer, ? extends E>)
*<code>public static <E> java.util.List<E> org.apache.commons.collections4.ListUtils.lazyList(java.util.List<E>,org.apache.commons.collections4.Transformer<java.lang.Integer, ? extends E>)
*lazyList(java.util.List<E> p0,org.apache.commons.collections4.Transformer<java.lang.Integer, ? extends E> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E> java.util.List<E> lazyList(java.util.List<E> p0,org.apache.commons.collections4.Transformer<java.lang.Integer, ? extends E> p1){
	return org.apache.commons.collections4.ListUtils.lazyList(p0,p1);
}
/**
*{@link org.apache.commons.collections4.ListUtils#lazyList(java.util.List<E>,org.apache.commons.collections4.Factory<? extends E>)}
*@see org.apache.commons.collections4.ListUtils#lazyList(java.util.List<E>,org.apache.commons.collections4.Factory<? extends E>)
*<code>public static <E> java.util.List<E> org.apache.commons.collections4.ListUtils.lazyList(java.util.List<E>,org.apache.commons.collections4.Factory<? extends E>)
*lazyList(java.util.List<E> p0,org.apache.commons.collections4.Factory<? extends E> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E> java.util.List<E> lazyList(java.util.List<E> p0,org.apache.commons.collections4.Factory<? extends E> p1){
	return org.apache.commons.collections4.ListUtils.lazyList(p0,p1);
}
/**
*{@link org.apache.commons.collections.ListUtils#lazyList(java.util.List,org.apache.commons.collections.Factory)}
*@see org.apache.commons.collections.ListUtils#lazyList(java.util.List,org.apache.commons.collections.Factory)
*<code>public static java.util.List org.apache.commons.collections.ListUtils.lazyList(java.util.List,org.apache.commons.collections.Factory)
*lazyList(java.util.List p0,org.apache.commons.collections.Factory p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.List lazyList(java.util.List p0,org.apache.commons.collections.Factory p1){
	return org.apache.commons.collections.ListUtils.lazyList(p0,p1);
}
/**
*{@link com.google.common.base.Throwables#lazyStackTrace(java.lang.Throwable)}
*@see com.google.common.base.Throwables#lazyStackTrace(java.lang.Throwable)
*<code>public static java.util.List<java.lang.StackTraceElement> com.google.common.base.Throwables.lazyStackTrace(java.lang.Throwable)
*lazyStackTrace(java.lang.Throwable p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.List<java.lang.StackTraceElement> lazyStackTrace(java.lang.Throwable p0){
	return com.google.common.base.Throwables.lazyStackTrace(p0);
}
/**
*{@link org.codehaus.plexus.util.FileUtils#loadFile(java.io.File)}
*@see org.codehaus.plexus.util.FileUtils#loadFile(java.io.File)
*<code>public static java.util.List<java.lang.String> org.codehaus.plexus.util.FileUtils.loadFile(java.io.File) throws java.io.IOException
*loadFile(java.io.File p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.List<java.lang.String> loadFile(java.io.File p0) throws java.io.IOException{
	return org.codehaus.plexus.util.FileUtils.loadFile(p0);
}
/**
*{@link org.apache.commons.lang3.LocaleUtils#localeLookupList(java.util.Locale)}
*@see org.apache.commons.lang3.LocaleUtils#localeLookupList(java.util.Locale)
*<code>public static java.util.List<java.util.Locale> org.apache.commons.lang3.LocaleUtils.localeLookupList(java.util.Locale)
*localeLookupList(java.util.Locale p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.List<java.util.Locale> localeLookupList(java.util.Locale p0){
	return org.apache.commons.lang3.LocaleUtils.localeLookupList(p0);
}
/**
*{@link org.apache.commons.lang3.LocaleUtils#localeLookupList(java.util.Locale,java.util.Locale)}
*@see org.apache.commons.lang3.LocaleUtils#localeLookupList(java.util.Locale,java.util.Locale)
*<code>public static java.util.List<java.util.Locale> org.apache.commons.lang3.LocaleUtils.localeLookupList(java.util.Locale,java.util.Locale)
*localeLookupList(java.util.Locale p0,java.util.Locale p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.List<java.util.Locale> localeLookupList(java.util.Locale p0,java.util.Locale p1){
	return org.apache.commons.lang3.LocaleUtils.localeLookupList(p0,p1);
}
/**
*{@link org.apache.commons.collections4.ListUtils#longestCommonSubsequence(java.util.List<E>,java.util.List<E>,org.apache.commons.collections4.Equator<? super E>)}
*@see org.apache.commons.collections4.ListUtils#longestCommonSubsequence(java.util.List<E>,java.util.List<E>,org.apache.commons.collections4.Equator<? super E>)
*<code>public static <E> java.util.List<E> org.apache.commons.collections4.ListUtils.longestCommonSubsequence(java.util.List<E>,java.util.List<E>,org.apache.commons.collections4.Equator<? super E>)
*longestCommonSubsequence(java.util.List<E> p0,java.util.List<E> p1,org.apache.commons.collections4.Equator<? super E> p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E> java.util.List<E> longestCommonSubsequence(java.util.List<E> p0,java.util.List<E> p1,org.apache.commons.collections4.Equator<? super E> p2){
	return org.apache.commons.collections4.ListUtils.longestCommonSubsequence(p0,p1,p2);
}
/**
*{@link org.apache.commons.collections4.ListUtils#longestCommonSubsequence(java.util.List<E>,java.util.List<E>)}
*@see org.apache.commons.collections4.ListUtils#longestCommonSubsequence(java.util.List<E>,java.util.List<E>)
*<code>public static <E> java.util.List<E> org.apache.commons.collections4.ListUtils.longestCommonSubsequence(java.util.List<E>,java.util.List<E>)
*longestCommonSubsequence(java.util.List<E> p0,java.util.List<E> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E> java.util.List<E> longestCommonSubsequence(java.util.List<E> p0,java.util.List<E> p1){
	return org.apache.commons.collections4.ListUtils.longestCommonSubsequence(p0,p1);
}
/**
*{@link org.apache.commons.collections.IteratorUtils#loopingListIterator(java.util.List)}
*@see org.apache.commons.collections.IteratorUtils#loopingListIterator(java.util.List)
*<code>public static org.apache.commons.collections.ResettableListIterator org.apache.commons.collections.IteratorUtils.loopingListIterator(java.util.List)
*loopingListIterator(java.util.List p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.ResettableListIterator loopingListIterator(java.util.List p0){
	return org.apache.commons.collections.IteratorUtils.loopingListIterator(p0);
}
/**
*{@link com.facebook.collections.ListMapper#map(java.util.List<X>,com.facebook.collectionsbase.Mapper<X, Y>)}
*@see com.facebook.collections.ListMapper#map(java.util.List<X>,com.facebook.collectionsbase.Mapper<X, Y>)
*<code>public static <X,Y> java.util.List<Y> com.facebook.collections.ListMapper.map(java.util.List<X>,com.facebook.collectionsbase.Mapper<X, Y>)
*map(java.util.List<X> p0,com.facebook.collectionsbase.Mapper<X, Y> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <X,Y> java.util.List<Y> map(java.util.List<X> p0,com.facebook.collectionsbase.Mapper<X, Y> p1){
	return com.facebook.collections.ListMapper.map(p0,p1);
}
/**
*{@link org.apache.commons.collections4.ListUtils#partition(java.util.List<T>,int)}
*@see org.apache.commons.collections4.ListUtils#partition(java.util.List<T>,int)
*<code>public static <T> java.util.List<java.util.List<T>> org.apache.commons.collections4.ListUtils.partition(java.util.List<T>,int)
*partition(java.util.List<T> p0,int p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> java.util.List<java.util.List<T>> partition(java.util.List<T> p0,int p1){
	return org.apache.commons.collections4.ListUtils.partition(p0,p1);
}
/**
*{@link org.apache.commons.collections4.IterableUtils#partition(java.lang.Iterable<? extends O>,org.apache.commons.collections4.Predicate<? super O>)}
*@see org.apache.commons.collections4.IterableUtils#partition(java.lang.Iterable<? extends O>,org.apache.commons.collections4.Predicate<? super O>)
*<code>public static <O> java.util.List<java.util.List<O>> org.apache.commons.collections4.IterableUtils.partition(java.lang.Iterable<? extends O>,org.apache.commons.collections4.Predicate<? super O>)
*partition(java.lang.Iterable<? extends O> p0,org.apache.commons.collections4.Predicate<? super O> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <O> java.util.List<java.util.List<O>> partition(java.lang.Iterable<? extends O> p0,org.apache.commons.collections4.Predicate<? super O> p1){
	return org.apache.commons.collections4.IterableUtils.partition(p0,p1);
}
/**
*{@link org.apache.commons.collections4.IterableUtils#partition(java.lang.Iterable<? extends O>,org.apache.commons.collections4.Factory<R>,org.apache.commons.collections4.Predicate<? super O>...)}
*@see org.apache.commons.collections4.IterableUtils#partition(java.lang.Iterable<? extends O>,org.apache.commons.collections4.Factory<R>,org.apache.commons.collections4.Predicate<? super O>...)
*<code>public static <O,R> java.util.List<R> org.apache.commons.collections4.IterableUtils.partition(java.lang.Iterable<? extends O>,org.apache.commons.collections4.Factory<R>,org.apache.commons.collections4.Predicate<? super O>...)
*partition(java.lang.Iterable<? extends O> p0,org.apache.commons.collections4.Factory<R> p1,org.apache.commons.collections4.Predicate<? super O>... p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <O,R extends java.util.Collection<O> > java.util.List<R> partition(java.lang.Iterable<? extends O> p0,org.apache.commons.collections4.Factory<R> p1,org.apache.commons.collections4.Predicate<? super O>... p2){
	return org.apache.commons.collections4.IterableUtils.partition(p0,p1,p2);
}
/**
*{@link org.apache.commons.collections4.IterableUtils#partition(java.lang.Iterable<? extends O>,org.apache.commons.collections4.Predicate<? super O>...)}
*@see org.apache.commons.collections4.IterableUtils#partition(java.lang.Iterable<? extends O>,org.apache.commons.collections4.Predicate<? super O>...)
*<code>public static <O> java.util.List<java.util.List<O>> org.apache.commons.collections4.IterableUtils.partition(java.lang.Iterable<? extends O>,org.apache.commons.collections4.Predicate<? super O>...)
*partition(java.lang.Iterable<? extends O> p0,org.apache.commons.collections4.Predicate<? super O>... p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <O> java.util.List<java.util.List<O>> partition(java.lang.Iterable<? extends O> p0,org.apache.commons.collections4.Predicate<? super O>... p1){
	return org.apache.commons.collections4.IterableUtils.partition(p0,p1);
}
/**
*{@link org.apache.commons.collections4.ListUtils#predicatedList(java.util.List<E>,org.apache.commons.collections4.Predicate<E>)}
*@see org.apache.commons.collections4.ListUtils#predicatedList(java.util.List<E>,org.apache.commons.collections4.Predicate<E>)
*<code>public static <E> java.util.List<E> org.apache.commons.collections4.ListUtils.predicatedList(java.util.List<E>,org.apache.commons.collections4.Predicate<E>)
*predicatedList(java.util.List<E> p0,org.apache.commons.collections4.Predicate<E> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E> java.util.List<E> predicatedList(java.util.List<E> p0,org.apache.commons.collections4.Predicate<E> p1){
	return org.apache.commons.collections4.ListUtils.predicatedList(p0,p1);
}
/**
*{@link org.apache.commons.collections.ListUtils#predicatedList(java.util.List,org.apache.commons.collections.Predicate)}
*@see org.apache.commons.collections.ListUtils#predicatedList(java.util.List,org.apache.commons.collections.Predicate)
*<code>public static java.util.List org.apache.commons.collections.ListUtils.predicatedList(java.util.List,org.apache.commons.collections.Predicate)
*predicatedList(java.util.List p0,org.apache.commons.collections.Predicate p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.List predicatedList(java.util.List p0,org.apache.commons.collections.Predicate p1){
	return org.apache.commons.collections.ListUtils.predicatedList(p0,p1);
}
/**
*{@link org.apache.commons.math3.primes.Primes#primeFactors(int)}
*@see org.apache.commons.math3.primes.Primes#primeFactors(int)
*<code>public static java.util.List<java.lang.Integer> org.apache.commons.math3.primes.Primes.primeFactors(int)
*primeFactors(int p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.List<java.lang.Integer> primeFactors(int p0){
	return org.apache.commons.math3.primes.Primes.primeFactors(p0);
}
/**
*{@link org.apache.commons.math3.genetics.BinaryChromosome#randomBinaryRepresentation(int)}
*@see org.apache.commons.math3.genetics.BinaryChromosome#randomBinaryRepresentation(int)
*<code>public static java.util.List<java.lang.Integer> org.apache.commons.math3.genetics.BinaryChromosome.randomBinaryRepresentation(int)
*randomBinaryRepresentation(int p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.List<java.lang.Integer> randomBinaryRepresentation(int p0){
	return org.apache.commons.math3.genetics.BinaryChromosome.randomBinaryRepresentation(p0);
}
/**
*{@link org.apache.commons.math3.genetics.RandomKey#randomPermutation(int)}
*@see org.apache.commons.math3.genetics.RandomKey#randomPermutation(int)
*<code>public static final java.util.List<java.lang.Double> org.apache.commons.math3.genetics.RandomKey.randomPermutation(int)
*randomPermutation(int p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static final java.util.List<java.lang.Double> randomPermutation(int p0){
	return org.apache.commons.math3.genetics.RandomKey.randomPermutation(p0);
}
/**
*{@link com.facebook.collections.PackedByteArray#readByteArrayList(java.io.DataInput,byte,byte)}
*@see com.facebook.collections.PackedByteArray#readByteArrayList(java.io.DataInput,byte,byte)
*<code>public static java.util.List<byte[]> com.facebook.collections.PackedByteArray.readByteArrayList(java.io.DataInput,byte,byte) throws java.io.IOException
*readByteArrayList(java.io.DataInput p0,byte p1,byte p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.List<byte[]> readByteArrayList(java.io.DataInput p0,byte p1,byte p2) throws java.io.IOException{
	return com.facebook.collections.PackedByteArray.readByteArrayList(p0,p1,p2);
}
/**
*{@link org.apache.commons.io.IOUtils#readLines(java.io.InputStream)}
*@see org.apache.commons.io.IOUtils#readLines(java.io.InputStream)
*<code>public static java.util.List<java.lang.String> org.apache.commons.io.IOUtils.readLines(java.io.InputStream) throws java.io.IOException
*readLines(java.io.InputStream p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.List<java.lang.String> readLines(java.io.InputStream p0) throws java.io.IOException{
	return org.apache.commons.io.IOUtils.readLines(p0);
}
/**
*{@link org.apache.commons.io.IOUtils#readLines(java.io.InputStream,java.nio.charset.Charset)}
*@see org.apache.commons.io.IOUtils#readLines(java.io.InputStream,java.nio.charset.Charset)
*<code>public static java.util.List<java.lang.String> org.apache.commons.io.IOUtils.readLines(java.io.InputStream,java.nio.charset.Charset) throws java.io.IOException
*readLines(java.io.InputStream p0,java.nio.charset.Charset p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.List<java.lang.String> readLines(java.io.InputStream p0,java.nio.charset.Charset p1) throws java.io.IOException{
	return org.apache.commons.io.IOUtils.readLines(p0,p1);
}
/**
*{@link org.apache.commons.io.IOUtils#readLines(java.io.InputStream,java.lang.String)}
*@see org.apache.commons.io.IOUtils#readLines(java.io.InputStream,java.lang.String)
*<code>public static java.util.List<java.lang.String> org.apache.commons.io.IOUtils.readLines(java.io.InputStream,java.lang.String) throws java.io.IOException
*readLines(java.io.InputStream p0,java.lang.String p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.List<java.lang.String> readLines(java.io.InputStream p0,java.lang.String p1) throws java.io.IOException{
	return org.apache.commons.io.IOUtils.readLines(p0,p1);
}
/**
*{@link org.apache.commons.io.IOUtils#readLines(java.io.Reader)}
*@see org.apache.commons.io.IOUtils#readLines(java.io.Reader)
*<code>public static java.util.List<java.lang.String> org.apache.commons.io.IOUtils.readLines(java.io.Reader) throws java.io.IOException
*readLines(java.io.Reader p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.List<java.lang.String> readLines(java.io.Reader p0) throws java.io.IOException{
	return org.apache.commons.io.IOUtils.readLines(p0);
}
/**
*{@link org.apache.commons.io.FileUtils#readLines(java.io.File,java.lang.String)}
*@see org.apache.commons.io.FileUtils#readLines(java.io.File,java.lang.String)
*<code>public static java.util.List<java.lang.String> org.apache.commons.io.FileUtils.readLines(java.io.File,java.lang.String) throws java.io.IOException
*readLines(java.io.File p0,java.lang.String p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.List<java.lang.String> readLines(java.io.File p0,java.lang.String p1) throws java.io.IOException{
	return org.apache.commons.io.FileUtils.readLines(p0,p1);
}
/**
*{@link org.apache.commons.io.FileUtils#readLines(java.io.File)}
*@see org.apache.commons.io.FileUtils#readLines(java.io.File)
*<code>public static java.util.List<java.lang.String> org.apache.commons.io.FileUtils.readLines(java.io.File) throws java.io.IOException
*readLines(java.io.File p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.List<java.lang.String> readLines(java.io.File p0) throws java.io.IOException{
	return org.apache.commons.io.FileUtils.readLines(p0);
}
/**
*{@link org.apache.commons.io.FileUtils#readLines(java.io.File,java.nio.charset.Charset)}
*@see org.apache.commons.io.FileUtils#readLines(java.io.File,java.nio.charset.Charset)
*<code>public static java.util.List<java.lang.String> org.apache.commons.io.FileUtils.readLines(java.io.File,java.nio.charset.Charset) throws java.io.IOException
*readLines(java.io.File p0,java.nio.charset.Charset p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.List<java.lang.String> readLines(java.io.File p0,java.nio.charset.Charset p1) throws java.io.IOException{
	return org.apache.commons.io.FileUtils.readLines(p0,p1);
}
/**
*{@link com.google.common.io.CharStreams#readLines(java.lang.Readable)}
*@see com.google.common.io.CharStreams#readLines(java.lang.Readable)
*<code>public static java.util.List<java.lang.String> com.google.common.io.CharStreams.readLines(java.lang.Readable) throws java.io.IOException
*readLines(java.lang.Readable p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.List<java.lang.String> readLines(java.lang.Readable p0) throws java.io.IOException{
	return com.google.common.io.CharStreams.readLines(p0);
}
/**
*{@link com.google.common.io.Resources#readLines(java.net.URL,java.nio.charset.Charset)}
*@see com.google.common.io.Resources#readLines(java.net.URL,java.nio.charset.Charset)
*<code>public static java.util.List<java.lang.String> com.google.common.io.Resources.readLines(java.net.URL,java.nio.charset.Charset) throws java.io.IOException
*readLines(java.net.URL p0,java.nio.charset.Charset p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.List<java.lang.String> readLines(java.net.URL p0,java.nio.charset.Charset p1) throws java.io.IOException{
	return com.google.common.io.Resources.readLines(p0,p1);
}
/**
*{@link org.apache.commons.collections4.ListUtils#removeAll(java.util.Collection<E>,java.util.Collection<?>)}
*@see org.apache.commons.collections4.ListUtils#removeAll(java.util.Collection<E>,java.util.Collection<?>)
*<code>public static <E> java.util.List<E> org.apache.commons.collections4.ListUtils.removeAll(java.util.Collection<E>,java.util.Collection<?>)
*removeAll(java.util.Collection<E> p0,java.util.Collection<?> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E> java.util.List<E> removeAll(java.util.Collection<E> p0,java.util.Collection<?> p1){
	return org.apache.commons.collections4.ListUtils.removeAll(p0,p1);
}
/**
*{@link org.apache.commons.collections.ListUtils#removeAll(java.util.Collection,java.util.Collection)}
*@see org.apache.commons.collections.ListUtils#removeAll(java.util.Collection,java.util.Collection)
*<code>public static java.util.List org.apache.commons.collections.ListUtils.removeAll(java.util.Collection,java.util.Collection)
*removeAll(java.util.Collection p0,java.util.Collection p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.List removeAll(java.util.Collection p0,java.util.Collection p1){
	return org.apache.commons.collections.ListUtils.removeAll(p0,p1);
}
/**
*{@link org.apache.commons.collections4.ListUtils#retainAll(java.util.Collection<E>,java.util.Collection<?>)}
*@see org.apache.commons.collections4.ListUtils#retainAll(java.util.Collection<E>,java.util.Collection<?>)
*<code>public static <E> java.util.List<E> org.apache.commons.collections4.ListUtils.retainAll(java.util.Collection<E>,java.util.Collection<?>)
*retainAll(java.util.Collection<E> p0,java.util.Collection<?> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E> java.util.List<E> retainAll(java.util.Collection<E> p0,java.util.Collection<?> p1){
	return org.apache.commons.collections4.ListUtils.retainAll(p0,p1);
}
/**
*{@link org.apache.commons.collections.ListUtils#retainAll(java.util.Collection,java.util.Collection)}
*@see org.apache.commons.collections.ListUtils#retainAll(java.util.Collection,java.util.Collection)
*<code>public static java.util.List org.apache.commons.collections.ListUtils.retainAll(java.util.Collection,java.util.Collection)
*retainAll(java.util.Collection p0,java.util.Collection p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.List retainAll(java.util.Collection p0,java.util.Collection p1){
	return org.apache.commons.collections.ListUtils.retainAll(p0,p1);
}
/**
*{@link com.google.common.collect.Lists#reverse(java.util.List<T>)}
*@see com.google.common.collect.Lists#reverse(java.util.List<T>)
*<code>public static <T> java.util.List<T> com.google.common.collect.Lists.reverse(java.util.List<T>)
*reverse(java.util.List<T> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> java.util.List<T> reverse(java.util.List<T> p0){
	return com.google.common.collect.Lists.reverse(p0);
}
/**
*{@link org.apache.commons.collections4.ListUtils#select(java.util.Collection<? extends E>,org.apache.commons.collections4.Predicate<? super E>)}
*@see org.apache.commons.collections4.ListUtils#select(java.util.Collection<? extends E>,org.apache.commons.collections4.Predicate<? super E>)
*<code>public static <E> java.util.List<E> org.apache.commons.collections4.ListUtils.select(java.util.Collection<? extends E>,org.apache.commons.collections4.Predicate<? super E>)
*select(java.util.Collection<? extends E> p0,org.apache.commons.collections4.Predicate<? super E> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E> java.util.List<E> select(java.util.Collection<? extends E> p0,org.apache.commons.collections4.Predicate<? super E> p1){
	return org.apache.commons.collections4.ListUtils.select(p0,p1);
}
/**
*{@link org.apache.commons.collections4.ListUtils#selectRejected(java.util.Collection<? extends E>,org.apache.commons.collections4.Predicate<? super E>)}
*@see org.apache.commons.collections4.ListUtils#selectRejected(java.util.Collection<? extends E>,org.apache.commons.collections4.Predicate<? super E>)
*<code>public static <E> java.util.List<E> org.apache.commons.collections4.ListUtils.selectRejected(java.util.Collection<? extends E>,org.apache.commons.collections4.Predicate<? super E>)
*selectRejected(java.util.Collection<? extends E> p0,org.apache.commons.collections4.Predicate<? super E> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E> java.util.List<E> selectRejected(java.util.Collection<? extends E> p0,org.apache.commons.collections4.Predicate<? super E> p1){
	return org.apache.commons.collections4.ListUtils.selectRejected(p0,p1);
}
/**
*{@link org.codehaus.plexus.util.dag.TopologicalSorter#sort(org.codehaus.plexus.util.dag.Vertex)}
*@see org.codehaus.plexus.util.dag.TopologicalSorter#sort(org.codehaus.plexus.util.dag.Vertex)
*<code>public static java.util.List<java.lang.String> org.codehaus.plexus.util.dag.TopologicalSorter.sort(org.codehaus.plexus.util.dag.Vertex)
*sort(org.codehaus.plexus.util.dag.Vertex p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.List<java.lang.String> sort(org.codehaus.plexus.util.dag.Vertex p0){
	return org.codehaus.plexus.util.dag.TopologicalSorter.sort(p0);
}
/**
*{@link org.codehaus.plexus.util.dag.TopologicalSorter#sort(org.codehaus.plexus.util.dag.DAG)}
*@see org.codehaus.plexus.util.dag.TopologicalSorter#sort(org.codehaus.plexus.util.dag.DAG)
*<code>public static java.util.List<java.lang.String> org.codehaus.plexus.util.dag.TopologicalSorter.sort(org.codehaus.plexus.util.dag.DAG)
*sort(org.codehaus.plexus.util.dag.DAG p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.List<java.lang.String> sort(org.codehaus.plexus.util.dag.DAG p0){
	return org.codehaus.plexus.util.dag.TopologicalSorter.sort(p0);
}
/**
*{@link org.apache.commons.crypto.utils.Utils#splitClassNames(java.lang.String,java.lang.String)}
*@see org.apache.commons.crypto.utils.Utils#splitClassNames(java.lang.String,java.lang.String)
*<code>public static java.util.List<java.lang.String> org.apache.commons.crypto.utils.Utils.splitClassNames(java.lang.String,java.lang.String)
*splitClassNames(java.lang.String p0,java.lang.String p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.List<java.lang.String> splitClassNames(java.lang.String p0,java.lang.String p1){
	return org.apache.commons.crypto.utils.Utils.splitClassNames(p0,p1);
}
/**
*{@link org.apache.commons.collections4.ListUtils#subtract(java.util.List<E>,java.util.List<? extends E>)}
*@see org.apache.commons.collections4.ListUtils#subtract(java.util.List<E>,java.util.List<? extends E>)
*<code>public static <E> java.util.List<E> org.apache.commons.collections4.ListUtils.subtract(java.util.List<E>,java.util.List<? extends E>)
*subtract(java.util.List<E> p0,java.util.List<? extends E> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E> java.util.List<E> subtract(java.util.List<E> p0,java.util.List<? extends E> p1){
	return org.apache.commons.collections4.ListUtils.subtract(p0,p1);
}
/**
*{@link org.apache.commons.collections.ListUtils#subtract(java.util.List,java.util.List)}
*@see org.apache.commons.collections.ListUtils#subtract(java.util.List,java.util.List)
*<code>public static java.util.List org.apache.commons.collections.ListUtils.subtract(java.util.List,java.util.List)
*subtract(java.util.List p0,java.util.List p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.List subtract(java.util.List p0,java.util.List p1){
	return org.apache.commons.collections.ListUtils.subtract(p0,p1);
}
/**
*{@link org.apache.commons.collections4.ListUtils#sum(java.util.List<? extends E>,java.util.List<? extends E>)}
*@see org.apache.commons.collections4.ListUtils#sum(java.util.List<? extends E>,java.util.List<? extends E>)
*<code>public static <E> java.util.List<E> org.apache.commons.collections4.ListUtils.sum(java.util.List<? extends E>,java.util.List<? extends E>)
*sum(java.util.List<? extends E> p0,java.util.List<? extends E> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E> java.util.List<E> sum(java.util.List<? extends E> p0,java.util.List<? extends E> p1){
	return org.apache.commons.collections4.ListUtils.sum(p0,p1);
}
/**
*{@link org.apache.commons.collections.ListUtils#sum(java.util.List,java.util.List)}
*@see org.apache.commons.collections.ListUtils#sum(java.util.List,java.util.List)
*<code>public static java.util.List org.apache.commons.collections.ListUtils.sum(java.util.List,java.util.List)
*sum(java.util.List p0,java.util.List p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.List sum(java.util.List p0,java.util.List p1){
	return org.apache.commons.collections.ListUtils.sum(p0,p1);
}
/**
*{@link org.apache.commons.collections4.ListUtils#synchronizedList(java.util.List<E>)}
*@see org.apache.commons.collections4.ListUtils#synchronizedList(java.util.List<E>)
*<code>public static <E> java.util.List<E> org.apache.commons.collections4.ListUtils.synchronizedList(java.util.List<E>)
*synchronizedList(java.util.List<E> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E> java.util.List<E> synchronizedList(java.util.List<E> p0){
	return org.apache.commons.collections4.ListUtils.synchronizedList(p0);
}
/**
*{@link org.apache.commons.collections.ListUtils#synchronizedList(java.util.List)}
*@see org.apache.commons.collections.ListUtils#synchronizedList(java.util.List)
*<code>public static java.util.List org.apache.commons.collections.ListUtils.synchronizedList(java.util.List)
*synchronizedList(java.util.List p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.List synchronizedList(java.util.List p0){
	return org.apache.commons.collections.ListUtils.synchronizedList(p0);
}
/**
*{@link org.apache.commons.collections4.IteratorUtils#toList(java.util.Iterator<? extends E>,int)}
*@see org.apache.commons.collections4.IteratorUtils#toList(java.util.Iterator<? extends E>,int)
*<code>public static <E> java.util.List<E> org.apache.commons.collections4.IteratorUtils.toList(java.util.Iterator<? extends E>,int)
*toList(java.util.Iterator<? extends E> p0,int p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E> java.util.List<E> toList(java.util.Iterator<? extends E> p0,int p1){
	return org.apache.commons.collections4.IteratorUtils.toList(p0,p1);
}
/**
*{@link org.apache.commons.collections4.IteratorUtils#toList(java.util.Iterator<? extends E>)}
*@see org.apache.commons.collections4.IteratorUtils#toList(java.util.Iterator<? extends E>)
*<code>public static <E> java.util.List<E> org.apache.commons.collections4.IteratorUtils.toList(java.util.Iterator<? extends E>)
*toList(java.util.Iterator<? extends E> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E> java.util.List<E> toList(java.util.Iterator<? extends E> p0){
	return org.apache.commons.collections4.IteratorUtils.toList(p0);
}
/**
*{@link org.apache.commons.collections4.IterableUtils#toList(java.lang.Iterable<E>)}
*@see org.apache.commons.collections4.IterableUtils#toList(java.lang.Iterable<E>)
*<code>public static <E> java.util.List<E> org.apache.commons.collections4.IterableUtils.toList(java.lang.Iterable<E>)
*toList(java.lang.Iterable<E> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E> java.util.List<E> toList(java.lang.Iterable<E> p0){
	return org.apache.commons.collections4.IterableUtils.toList(p0);
}
/**
*{@link org.apache.commons.collections4.EnumerationUtils#toList(java.util.StringTokenizer)}
*@see org.apache.commons.collections4.EnumerationUtils#toList(java.util.StringTokenizer)
*<code>public static java.util.List<java.lang.String> org.apache.commons.collections4.EnumerationUtils.toList(java.util.StringTokenizer)
*toList(java.util.StringTokenizer p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.List<java.lang.String> toList(java.util.StringTokenizer p0){
	return org.apache.commons.collections4.EnumerationUtils.toList(p0);
}
/**
*{@link org.apache.commons.collections4.EnumerationUtils#toList(java.util.Enumeration<? extends E>)}
*@see org.apache.commons.collections4.EnumerationUtils#toList(java.util.Enumeration<? extends E>)
*<code>public static <E> java.util.List<E> org.apache.commons.collections4.EnumerationUtils.toList(java.util.Enumeration<? extends E>)
*toList(java.util.Enumeration<? extends E> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E> java.util.List<E> toList(java.util.Enumeration<? extends E> p0){
	return org.apache.commons.collections4.EnumerationUtils.toList(p0);
}
/**
*{@link org.apache.commons.collections.IteratorUtils#toList(java.util.Iterator)}
*@see org.apache.commons.collections.IteratorUtils#toList(java.util.Iterator)
*<code>public static java.util.List org.apache.commons.collections.IteratorUtils.toList(java.util.Iterator)
*toList(java.util.Iterator p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.List toList(java.util.Iterator p0){
	return org.apache.commons.collections.IteratorUtils.toList(p0);
}
/**
*{@link org.apache.commons.collections.IteratorUtils#toList(java.util.Iterator,int)}
*@see org.apache.commons.collections.IteratorUtils#toList(java.util.Iterator,int)
*<code>public static java.util.List org.apache.commons.collections.IteratorUtils.toList(java.util.Iterator,int)
*toList(java.util.Iterator p0,int p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.List toList(java.util.Iterator p0,int p1){
	return org.apache.commons.collections.IteratorUtils.toList(p0,p1);
}
/**
*{@link org.apache.commons.collections.EnumerationUtils#toList(java.util.Enumeration)}
*@see org.apache.commons.collections.EnumerationUtils#toList(java.util.Enumeration)
*<code>public static java.util.List org.apache.commons.collections.EnumerationUtils.toList(java.util.Enumeration)
*toList(java.util.Enumeration p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.List toList(java.util.Enumeration p0){
	return org.apache.commons.collections.EnumerationUtils.toList(p0);
}
/**
*{@link org.apache.commons.io.filefilter.FileFilterUtils#toList(org.apache.commons.io.filefilter.IOFileFilter...)}
*@see org.apache.commons.io.filefilter.FileFilterUtils#toList(org.apache.commons.io.filefilter.IOFileFilter...)
*<code>public static java.util.List<org.apache.commons.io.filefilter.IOFileFilter> org.apache.commons.io.filefilter.FileFilterUtils.toList(org.apache.commons.io.filefilter.IOFileFilter...)
*toList(org.apache.commons.io.filefilter.IOFileFilter... p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.List<org.apache.commons.io.filefilter.IOFileFilter> toList(org.apache.commons.io.filefilter.IOFileFilter... p0){
	return org.apache.commons.io.filefilter.FileFilterUtils.toList(p0);
}
/**
*{@link com.google.common.collect.Lists#transform(java.util.List<F>,com.google.common.base.Function<? super F, ? extends T>)}
*@see com.google.common.collect.Lists#transform(java.util.List<F>,com.google.common.base.Function<? super F, ? extends T>)
*<code>public static <F,T> java.util.List<T> com.google.common.collect.Lists.transform(java.util.List<F>,com.google.common.base.Function<? super F, ? extends T>)
*transform(java.util.List<F> p0,com.google.common.base.Function<? super F, ? extends T> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <F,T> java.util.List<T> transform(java.util.List<F> p0,com.google.common.base.Function<? super F, ? extends T> p1){
	return com.google.common.collect.Lists.transform(p0,p1);
}
/**
*{@link org.apache.commons.collections4.ListUtils#transformedList(java.util.List<E>,org.apache.commons.collections4.Transformer<? super E, ? extends E>)}
*@see org.apache.commons.collections4.ListUtils#transformedList(java.util.List<E>,org.apache.commons.collections4.Transformer<? super E, ? extends E>)
*<code>public static <E> java.util.List<E> org.apache.commons.collections4.ListUtils.transformedList(java.util.List<E>,org.apache.commons.collections4.Transformer<? super E, ? extends E>)
*transformedList(java.util.List<E> p0,org.apache.commons.collections4.Transformer<? super E, ? extends E> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E> java.util.List<E> transformedList(java.util.List<E> p0,org.apache.commons.collections4.Transformer<? super E, ? extends E> p1){
	return org.apache.commons.collections4.ListUtils.transformedList(p0,p1);
}
/**
*{@link org.apache.commons.collections.ListUtils#transformedList(java.util.List,org.apache.commons.collections.Transformer)}
*@see org.apache.commons.collections.ListUtils#transformedList(java.util.List,org.apache.commons.collections.Transformer)
*<code>public static java.util.List org.apache.commons.collections.ListUtils.transformedList(java.util.List,org.apache.commons.collections.Transformer)
*transformedList(java.util.List p0,org.apache.commons.collections.Transformer p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.List transformedList(java.util.List p0,org.apache.commons.collections.Transformer p1){
	return org.apache.commons.collections.ListUtils.transformedList(p0,p1);
}
/**
*{@link com.facebook.collectionsbase.Piles#transmogrify(java.util.Iterator<X>,com.google.common.base.Function<X, Y>)}
*@see com.facebook.collectionsbase.Piles#transmogrify(java.util.Iterator<X>,com.google.common.base.Function<X, Y>)
*<code>public static <X,Y> java.util.List<Y> com.facebook.collectionsbase.Piles.transmogrify(java.util.Iterator<X>,com.google.common.base.Function<X, Y>)
*transmogrify(java.util.Iterator<X> p0,com.google.common.base.Function<X, Y> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <X,Y> java.util.List<Y> transmogrify(java.util.Iterator<X> p0,com.google.common.base.Function<X, Y> p1){
	return com.facebook.collectionsbase.Piles.transmogrify(p0,p1);
}
/**
*{@link com.facebook.collectionsbase.Piles#transmogrify(java.util.Iterator<X>,com.facebook.collectionsbase.Mapper<X, Y>)}
*@see com.facebook.collectionsbase.Piles#transmogrify(java.util.Iterator<X>,com.facebook.collectionsbase.Mapper<X, Y>)
*<code>public static <X,Y> java.util.List<Y> com.facebook.collectionsbase.Piles.transmogrify(java.util.Iterator<X>,com.facebook.collectionsbase.Mapper<X, Y>)
*transmogrify(java.util.Iterator<X> p0,com.facebook.collectionsbase.Mapper<X, Y> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <X,Y> java.util.List<Y> transmogrify(java.util.Iterator<X> p0,com.facebook.collectionsbase.Mapper<X, Y> p1){
	return com.facebook.collectionsbase.Piles.transmogrify(p0,p1);
}
/**
*{@link org.apache.commons.collections.ListUtils#typedList(java.util.List,java.lang.Class)}
*@see org.apache.commons.collections.ListUtils#typedList(java.util.List,java.lang.Class)
*<code>public static java.util.List org.apache.commons.collections.ListUtils.typedList(java.util.List,java.lang.Class)
*typedList(java.util.List p0,java.lang.Class p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.List typedList(java.util.List p0,java.lang.Class p1){
	return org.apache.commons.collections.ListUtils.typedList(p0,p1);
}
/**
*{@link org.apache.commons.collections4.ListUtils#union(java.util.List<? extends E>,java.util.List<? extends E>)}
*@see org.apache.commons.collections4.ListUtils#union(java.util.List<? extends E>,java.util.List<? extends E>)
*<code>public static <E> java.util.List<E> org.apache.commons.collections4.ListUtils.union(java.util.List<? extends E>,java.util.List<? extends E>)
*union(java.util.List<? extends E> p0,java.util.List<? extends E> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E> java.util.List<E> union(java.util.List<? extends E> p0,java.util.List<? extends E> p1){
	return org.apache.commons.collections4.ListUtils.union(p0,p1);
}
/**
*{@link org.apache.commons.collections.ListUtils#union(java.util.List,java.util.List)}
*@see org.apache.commons.collections.ListUtils#union(java.util.List,java.util.List)
*<code>public static java.util.List org.apache.commons.collections.ListUtils.union(java.util.List,java.util.List)
*union(java.util.List p0,java.util.List p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.List union(java.util.List p0,java.util.List p1){
	return org.apache.commons.collections.ListUtils.union(p0,p1);
}
/**
*{@link org.apache.commons.collections4.ListUtils#unmodifiableList(java.util.List<? extends E>)}
*@see org.apache.commons.collections4.ListUtils#unmodifiableList(java.util.List<? extends E>)
*<code>public static <E> java.util.List<E> org.apache.commons.collections4.ListUtils.unmodifiableList(java.util.List<? extends E>)
*unmodifiableList(java.util.List<? extends E> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E> java.util.List<E> unmodifiableList(java.util.List<? extends E> p0){
	return org.apache.commons.collections4.ListUtils.unmodifiableList(p0);
}
/**
*{@link org.apache.commons.collections.ListUtils#unmodifiableList(java.util.List)}
*@see org.apache.commons.collections.ListUtils#unmodifiableList(java.util.List)
*<code>public static java.util.List org.apache.commons.collections.ListUtils.unmodifiableList(java.util.List)
*unmodifiableList(java.util.List p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.List unmodifiableList(java.util.List p0){
	return org.apache.commons.collections.ListUtils.unmodifiableList(p0);
}
/**
*{@link com.facebook.collections.PackedByteArray#unpackComparable(byte...)}
*@see com.facebook.collections.PackedByteArray#unpackComparable(byte...)
*<code>public static java.util.List<byte[]> com.facebook.collections.PackedByteArray.unpackComparable(byte[])
*unpackComparable(byte... p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.List<byte[]> unpackComparable(byte... p0){
	return com.facebook.collections.PackedByteArray.unpackComparable(p0);
}
/**
*{@link com.facebook.collections.PackedByteArray#unpackComparable(byte[],byte,byte)}
*@see com.facebook.collections.PackedByteArray#unpackComparable(byte[],byte,byte)
*<code>public static java.util.List<byte[]> com.facebook.collections.PackedByteArray.unpackComparable(byte[],byte,byte)
*unpackComparable(byte[] p0,byte p1,byte p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.List<byte[]> unpackComparable(byte[] p0,byte p1,byte p2){
	return com.facebook.collections.PackedByteArray.unpackComparable(p0,p1,p2);
}
/**
*{@link org.apache.commons.collections.primitives.adapters.ByteListList#wrap(org.apache.commons.collections.primitives.ByteList)}
*@see org.apache.commons.collections.primitives.adapters.ByteListList#wrap(org.apache.commons.collections.primitives.ByteList)
*<code>public static java.util.List org.apache.commons.collections.primitives.adapters.ByteListList.wrap(org.apache.commons.collections.primitives.ByteList)
*wrap(org.apache.commons.collections.primitives.ByteList p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.List wrap(org.apache.commons.collections.primitives.ByteList p0){
	return org.apache.commons.collections.primitives.adapters.ByteListList.wrap(p0);
}
/**
*{@link org.apache.commons.collections.primitives.adapters.CharListList#wrap(org.apache.commons.collections.primitives.CharList)}
*@see org.apache.commons.collections.primitives.adapters.CharListList#wrap(org.apache.commons.collections.primitives.CharList)
*<code>public static java.util.List org.apache.commons.collections.primitives.adapters.CharListList.wrap(org.apache.commons.collections.primitives.CharList)
*wrap(org.apache.commons.collections.primitives.CharList p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.List wrap(org.apache.commons.collections.primitives.CharList p0){
	return org.apache.commons.collections.primitives.adapters.CharListList.wrap(p0);
}
/**
*{@link org.apache.commons.collections.primitives.adapters.DoubleListList#wrap(org.apache.commons.collections.primitives.DoubleList)}
*@see org.apache.commons.collections.primitives.adapters.DoubleListList#wrap(org.apache.commons.collections.primitives.DoubleList)
*<code>public static java.util.List org.apache.commons.collections.primitives.adapters.DoubleListList.wrap(org.apache.commons.collections.primitives.DoubleList)
*wrap(org.apache.commons.collections.primitives.DoubleList p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.List wrap(org.apache.commons.collections.primitives.DoubleList p0){
	return org.apache.commons.collections.primitives.adapters.DoubleListList.wrap(p0);
}
/**
*{@link org.apache.commons.collections.primitives.adapters.FloatListList#wrap(org.apache.commons.collections.primitives.FloatList)}
*@see org.apache.commons.collections.primitives.adapters.FloatListList#wrap(org.apache.commons.collections.primitives.FloatList)
*<code>public static java.util.List org.apache.commons.collections.primitives.adapters.FloatListList.wrap(org.apache.commons.collections.primitives.FloatList)
*wrap(org.apache.commons.collections.primitives.FloatList p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.List wrap(org.apache.commons.collections.primitives.FloatList p0){
	return org.apache.commons.collections.primitives.adapters.FloatListList.wrap(p0);
}
/**
*{@link org.apache.commons.collections.primitives.adapters.IntListList#wrap(org.apache.commons.collections.primitives.IntList)}
*@see org.apache.commons.collections.primitives.adapters.IntListList#wrap(org.apache.commons.collections.primitives.IntList)
*<code>public static java.util.List org.apache.commons.collections.primitives.adapters.IntListList.wrap(org.apache.commons.collections.primitives.IntList)
*wrap(org.apache.commons.collections.primitives.IntList p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.List wrap(org.apache.commons.collections.primitives.IntList p0){
	return org.apache.commons.collections.primitives.adapters.IntListList.wrap(p0);
}
/**
*{@link org.apache.commons.collections.primitives.adapters.ListByteList#wrap(java.util.List)}
*@see org.apache.commons.collections.primitives.adapters.ListByteList#wrap(java.util.List)
*<code>public static org.apache.commons.collections.primitives.ByteList org.apache.commons.collections.primitives.adapters.ListByteList.wrap(java.util.List)
*wrap(java.util.List p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.primitives.ByteList wrap(java.util.List p0){
	return org.apache.commons.collections.primitives.adapters.ListByteList.wrap(p0);
}
/**
*{@link org.apache.commons.collections.primitives.adapters.LongListList#wrap(org.apache.commons.collections.primitives.LongList)}
*@see org.apache.commons.collections.primitives.adapters.LongListList#wrap(org.apache.commons.collections.primitives.LongList)
*<code>public static java.util.List org.apache.commons.collections.primitives.adapters.LongListList.wrap(org.apache.commons.collections.primitives.LongList)
*wrap(org.apache.commons.collections.primitives.LongList p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.List wrap(org.apache.commons.collections.primitives.LongList p0){
	return org.apache.commons.collections.primitives.adapters.LongListList.wrap(p0);
}
/**
*{@link org.apache.commons.collections.primitives.adapters.ShortListList#wrap(org.apache.commons.collections.primitives.ShortList)}
*@see org.apache.commons.collections.primitives.adapters.ShortListList#wrap(org.apache.commons.collections.primitives.ShortList)
*<code>public static java.util.List org.apache.commons.collections.primitives.adapters.ShortListList.wrap(org.apache.commons.collections.primitives.ShortList)
*wrap(org.apache.commons.collections.primitives.ShortList p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.List wrap(org.apache.commons.collections.primitives.ShortList p0){
	return org.apache.commons.collections.primitives.adapters.ShortListList.wrap(p0);
}
}
