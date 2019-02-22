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
public final class ComparatorUtil{ 
/**
*{@link org.apache.commons.collections4.ComparatorUtils#booleanComparator(boolean)}
*@see org.apache.commons.collections4.ComparatorUtils#booleanComparator(boolean)
*<code>public static java.util.Comparator<java.lang.Boolean> org.apache.commons.collections4.ComparatorUtils.booleanComparator(boolean)
*booleanComparator(boolean p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Comparator<java.lang.Boolean> booleanComparator(boolean p0){
	return org.apache.commons.collections4.ComparatorUtils.booleanComparator(p0);
}
/**
*{@link org.apache.commons.collections4.ComparatorUtils#chainedComparator(java.util.Comparator<E>...)}
*@see org.apache.commons.collections4.ComparatorUtils#chainedComparator(java.util.Comparator<E>...)
*<code>public static <E> java.util.Comparator<E> org.apache.commons.collections4.ComparatorUtils.chainedComparator(java.util.Comparator<E>...)
*chainedComparator(java.util.Comparator<E>... p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E> java.util.Comparator<E> chainedComparator(java.util.Comparator<E>... p0){
	return org.apache.commons.collections4.ComparatorUtils.chainedComparator(p0);
}
/**
*{@link org.apache.commons.collections4.ComparatorUtils#chainedComparator(java.util.Collection<java.util.Comparator<E>>)}
*@see org.apache.commons.collections4.ComparatorUtils#chainedComparator(java.util.Collection<java.util.Comparator<E>>)
*<code>public static <E> java.util.Comparator<E> org.apache.commons.collections4.ComparatorUtils.chainedComparator(java.util.Collection<java.util.Comparator<E>>)
*chainedComparator(java.util.Collection<java.util.Comparator<E>> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E> java.util.Comparator<E> chainedComparator(java.util.Collection<java.util.Comparator<E>> p0){
	return org.apache.commons.collections4.ComparatorUtils.chainedComparator(p0);
}
/**
*{@link org.apache.commons.collections.ComparatorUtils#chainedComparator(java.util.Comparator,java.util.Comparator)}
*@see org.apache.commons.collections.ComparatorUtils#chainedComparator(java.util.Comparator,java.util.Comparator)
*<code>public static java.util.Comparator org.apache.commons.collections.ComparatorUtils.chainedComparator(java.util.Comparator,java.util.Comparator)
*chainedComparator(java.util.Comparator p0,java.util.Comparator p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Comparator chainedComparator(java.util.Comparator p0,java.util.Comparator p1){
	return org.apache.commons.collections.ComparatorUtils.chainedComparator(p0,p1);
}
/**
*{@link org.apache.commons.collections.ComparatorUtils#chainedComparator(java.util.Comparator...)}
*@see org.apache.commons.collections.ComparatorUtils#chainedComparator(java.util.Comparator...)
*<code>public static java.util.Comparator org.apache.commons.collections.ComparatorUtils.chainedComparator(java.util.Comparator[])
*chainedComparator(java.util.Comparator... p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Comparator chainedComparator(java.util.Comparator... p0){
	return org.apache.commons.collections.ComparatorUtils.chainedComparator(p0);
}
/**
*{@link org.apache.commons.collections.ComparatorUtils#chainedComparator(java.util.Collection)}
*@see org.apache.commons.collections.ComparatorUtils#chainedComparator(java.util.Collection)
*<code>public static java.util.Comparator org.apache.commons.collections.ComparatorUtils.chainedComparator(java.util.Collection)
*chainedComparator(java.util.Collection p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Comparator chainedComparator(java.util.Collection p0){
	return org.apache.commons.collections.ComparatorUtils.chainedComparator(p0);
}
/**
*{@link org.apache.commons.collections.IteratorUtils#collatedIterator(java.util.Comparator,java.util.Collection)}
*@see org.apache.commons.collections.IteratorUtils#collatedIterator(java.util.Comparator,java.util.Collection)
*<code>public static java.util.Iterator org.apache.commons.collections.IteratorUtils.collatedIterator(java.util.Comparator,java.util.Collection)
*collatedIterator(java.util.Comparator p0,java.util.Collection p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Iterator collatedIterator(java.util.Comparator p0,java.util.Collection p1){
	return org.apache.commons.collections.IteratorUtils.collatedIterator(p0,p1);
}
/**
*{@link org.apache.commons.collections.IteratorUtils#collatedIterator(java.util.Comparator,java.util.Iterator...)}
*@see org.apache.commons.collections.IteratorUtils#collatedIterator(java.util.Comparator,java.util.Iterator...)
*<code>public static java.util.Iterator org.apache.commons.collections.IteratorUtils.collatedIterator(java.util.Comparator,java.util.Iterator[])
*collatedIterator(java.util.Comparator p0,java.util.Iterator... p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Iterator collatedIterator(java.util.Comparator p0,java.util.Iterator... p1){
	return org.apache.commons.collections.IteratorUtils.collatedIterator(p0,p1);
}
/**
*{@link org.apache.commons.collections.IteratorUtils#collatedIterator(java.util.Comparator,java.util.Iterator,java.util.Iterator)}
*@see org.apache.commons.collections.IteratorUtils#collatedIterator(java.util.Comparator,java.util.Iterator,java.util.Iterator)
*<code>public static java.util.Iterator org.apache.commons.collections.IteratorUtils.collatedIterator(java.util.Comparator,java.util.Iterator,java.util.Iterator)
*collatedIterator(java.util.Comparator p0,java.util.Iterator p1,java.util.Iterator p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Iterator collatedIterator(java.util.Comparator p0,java.util.Iterator p1,java.util.Iterator p2){
	return org.apache.commons.collections.IteratorUtils.collatedIterator(p0,p1,p2);
}
/**
*{@link com.google.common.collect.Comparators#emptiesFirst(java.util.Comparator<T>)}
*@see com.google.common.collect.Comparators#emptiesFirst(java.util.Comparator<T>)
*<code>public static <T> java.util.Comparator<java.util.Optional<T>> com.google.common.collect.Comparators.emptiesFirst(java.util.Comparator<T>)
*emptiesFirst(java.util.Comparator<T> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> java.util.Comparator<java.util.Optional<T>> emptiesFirst(java.util.Comparator<T> p0){
	return com.google.common.collect.Comparators.emptiesFirst(p0);
}
/**
*{@link com.google.common.collect.Comparators#emptiesLast(java.util.Comparator<T>)}
*@see com.google.common.collect.Comparators#emptiesLast(java.util.Comparator<T>)
*<code>public static <T> java.util.Comparator<java.util.Optional<T>> com.google.common.collect.Comparators.emptiesLast(java.util.Comparator<T>)
*emptiesLast(java.util.Comparator<T> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> java.util.Comparator<java.util.Optional<T>> emptiesLast(java.util.Comparator<T> p0){
	return com.google.common.collect.Comparators.emptiesLast(p0);
}
/**
*{@link it.unimi.dsi.fastutil.bytes.Byte2BooleanSortedMaps#entryComparator(it.unimi.dsi.fastutil.bytes.ByteComparator)}
*@see it.unimi.dsi.fastutil.bytes.Byte2BooleanSortedMaps#entryComparator(it.unimi.dsi.fastutil.bytes.ByteComparator)
*<code>public static java.util.Comparator<? super java.util.Map$Entry<java.lang.Byte, ?>> it.unimi.dsi.fastutil.bytes.Byte2BooleanSortedMaps.entryComparator(it.unimi.dsi.fastutil.bytes.ByteComparator)
*entryComparator(it.unimi.dsi.fastutil.bytes.ByteComparator p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Comparator<? super java.util.Map.Entry<java.lang.Byte, ?>> entryComparator(it.unimi.dsi.fastutil.bytes.ByteComparator p0){
	return it.unimi.dsi.fastutil.bytes.Byte2BooleanSortedMaps.entryComparator(p0);
}
/**
*{@link it.unimi.dsi.fastutil.chars.Char2BooleanSortedMaps#entryComparator(it.unimi.dsi.fastutil.chars.CharComparator)}
*@see it.unimi.dsi.fastutil.chars.Char2BooleanSortedMaps#entryComparator(it.unimi.dsi.fastutil.chars.CharComparator)
*<code>public static java.util.Comparator<? super java.util.Map$Entry<java.lang.Character, ?>> it.unimi.dsi.fastutil.chars.Char2BooleanSortedMaps.entryComparator(it.unimi.dsi.fastutil.chars.CharComparator)
*entryComparator(it.unimi.dsi.fastutil.chars.CharComparator p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Comparator<? super java.util.Map.Entry<java.lang.Character, ?>> entryComparator(it.unimi.dsi.fastutil.chars.CharComparator p0){
	return it.unimi.dsi.fastutil.chars.Char2BooleanSortedMaps.entryComparator(p0);
}
/**
*{@link it.unimi.dsi.fastutil.doubles.Double2BooleanSortedMaps#entryComparator(it.unimi.dsi.fastutil.doubles.DoubleComparator)}
*@see it.unimi.dsi.fastutil.doubles.Double2BooleanSortedMaps#entryComparator(it.unimi.dsi.fastutil.doubles.DoubleComparator)
*<code>public static java.util.Comparator<? super java.util.Map$Entry<java.lang.Double, ?>> it.unimi.dsi.fastutil.doubles.Double2BooleanSortedMaps.entryComparator(it.unimi.dsi.fastutil.doubles.DoubleComparator)
*entryComparator(it.unimi.dsi.fastutil.doubles.DoubleComparator p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Comparator<? super java.util.Map.Entry<java.lang.Double, ?>> entryComparator(it.unimi.dsi.fastutil.doubles.DoubleComparator p0){
	return it.unimi.dsi.fastutil.doubles.Double2BooleanSortedMaps.entryComparator(p0);
}
/**
*{@link it.unimi.dsi.fastutil.floats.Float2BooleanSortedMaps#entryComparator(it.unimi.dsi.fastutil.floats.FloatComparator)}
*@see it.unimi.dsi.fastutil.floats.Float2BooleanSortedMaps#entryComparator(it.unimi.dsi.fastutil.floats.FloatComparator)
*<code>public static java.util.Comparator<? super java.util.Map$Entry<java.lang.Float, ?>> it.unimi.dsi.fastutil.floats.Float2BooleanSortedMaps.entryComparator(it.unimi.dsi.fastutil.floats.FloatComparator)
*entryComparator(it.unimi.dsi.fastutil.floats.FloatComparator p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Comparator<? super java.util.Map.Entry<java.lang.Float, ?>> entryComparator(it.unimi.dsi.fastutil.floats.FloatComparator p0){
	return it.unimi.dsi.fastutil.floats.Float2BooleanSortedMaps.entryComparator(p0);
}
/**
*{@link it.unimi.dsi.fastutil.ints.Int2BooleanSortedMaps#entryComparator(it.unimi.dsi.fastutil.ints.IntComparator)}
*@see it.unimi.dsi.fastutil.ints.Int2BooleanSortedMaps#entryComparator(it.unimi.dsi.fastutil.ints.IntComparator)
*<code>public static java.util.Comparator<? super java.util.Map$Entry<java.lang.Integer, ?>> it.unimi.dsi.fastutil.ints.Int2BooleanSortedMaps.entryComparator(it.unimi.dsi.fastutil.ints.IntComparator)
*entryComparator(it.unimi.dsi.fastutil.ints.IntComparator p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Comparator<? super java.util.Map.Entry<java.lang.Integer, ?>> entryComparator(it.unimi.dsi.fastutil.ints.IntComparator p0){
	return it.unimi.dsi.fastutil.ints.Int2BooleanSortedMaps.entryComparator(p0);
}
/**
*{@link it.unimi.dsi.fastutil.longs.Long2BooleanSortedMaps#entryComparator(it.unimi.dsi.fastutil.longs.LongComparator)}
*@see it.unimi.dsi.fastutil.longs.Long2BooleanSortedMaps#entryComparator(it.unimi.dsi.fastutil.longs.LongComparator)
*<code>public static java.util.Comparator<? super java.util.Map$Entry<java.lang.Long, ?>> it.unimi.dsi.fastutil.longs.Long2BooleanSortedMaps.entryComparator(it.unimi.dsi.fastutil.longs.LongComparator)
*entryComparator(it.unimi.dsi.fastutil.longs.LongComparator p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Comparator<? super java.util.Map.Entry<java.lang.Long, ?>> entryComparator(it.unimi.dsi.fastutil.longs.LongComparator p0){
	return it.unimi.dsi.fastutil.longs.Long2BooleanSortedMaps.entryComparator(p0);
}
/**
*{@link it.unimi.dsi.fastutil.objects.Object2BooleanSortedMaps#entryComparator(java.util.Comparator<? super K>)}
*@see it.unimi.dsi.fastutil.objects.Object2BooleanSortedMaps#entryComparator(java.util.Comparator<? super K>)
*<code>public static <K> java.util.Comparator<? super java.util.Map$Entry<K, ?>> it.unimi.dsi.fastutil.objects.Object2BooleanSortedMaps.entryComparator(java.util.Comparator<? super K>)
*entryComparator(java.util.Comparator<? super K> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K> java.util.Comparator<? super java.util.Map.Entry<K, ?>> entryComparator(java.util.Comparator<? super K> p0){
	return it.unimi.dsi.fastutil.objects.Object2BooleanSortedMaps.entryComparator(p0);
}
/**
*{@link it.unimi.dsi.fastutil.shorts.Short2BooleanSortedMaps#entryComparator(it.unimi.dsi.fastutil.shorts.ShortComparator)}
*@see it.unimi.dsi.fastutil.shorts.Short2BooleanSortedMaps#entryComparator(it.unimi.dsi.fastutil.shorts.ShortComparator)
*<code>public static java.util.Comparator<? super java.util.Map$Entry<java.lang.Short, ?>> it.unimi.dsi.fastutil.shorts.Short2BooleanSortedMaps.entryComparator(it.unimi.dsi.fastutil.shorts.ShortComparator)
*entryComparator(it.unimi.dsi.fastutil.shorts.ShortComparator p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Comparator<? super java.util.Map.Entry<java.lang.Short, ?>> entryComparator(it.unimi.dsi.fastutil.shorts.ShortComparator p0){
	return it.unimi.dsi.fastutil.shorts.Short2BooleanSortedMaps.entryComparator(p0);
}
/**
*{@link com.google.common.primitives.Booleans#falseFirst()}
*@see com.google.common.primitives.Booleans#falseFirst()
*<code>public static java.util.Comparator<java.lang.Boolean> com.google.common.primitives.Booleans.falseFirst()
*falseFirst()</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Comparator<java.lang.Boolean> falseFirst(){
	return com.google.common.primitives.Booleans.falseFirst();
}
/**
*{@link com.google.common.collect.Comparators#lexicographical(java.util.Comparator<T>)}
*@see com.google.common.collect.Comparators#lexicographical(java.util.Comparator<T>)
*<code>public static <T,S> java.util.Comparator<java.lang.Iterable<S>> com.google.common.collect.Comparators.lexicographical(java.util.Comparator<T>)
*lexicographical(java.util.Comparator<T> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T,S> java.util.Comparator<java.lang.Iterable<S>> lexicographical(java.util.Comparator<T> p0){
	return com.google.common.collect.Comparators.lexicographical(p0);
}
/**
*{@link com.google.common.primitives.Booleans#lexicographicalComparator()}
*@see com.google.common.primitives.Booleans#lexicographicalComparator()
*<code>public static java.util.Comparator<boolean[]> com.google.common.primitives.Booleans.lexicographicalComparator()
*lexicographicalComparator()</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Comparator<boolean[]> lexicographicalComparator(){
	return com.google.common.primitives.Booleans.lexicographicalComparator();
}
/**
*{@link org.apache.commons.collections.ComparatorUtils#max(java.lang.Object,java.lang.Object,java.util.Comparator)}
*@see org.apache.commons.collections.ComparatorUtils#max(java.lang.Object,java.lang.Object,java.util.Comparator)
*<code>public static java.lang.Object org.apache.commons.collections.ComparatorUtils.max(java.lang.Object,java.lang.Object,java.util.Comparator)
*max(java.lang.Object p0,java.lang.Object p1,java.util.Comparator p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.Object max(java.lang.Object p0,java.lang.Object p1,java.util.Comparator p2){
	return org.apache.commons.collections.ComparatorUtils.max(p0,p1,p2);
}
/**
*{@link org.apache.commons.collections.ComparatorUtils#min(java.lang.Object,java.lang.Object,java.util.Comparator)}
*@see org.apache.commons.collections.ComparatorUtils#min(java.lang.Object,java.lang.Object,java.util.Comparator)
*<code>public static java.lang.Object org.apache.commons.collections.ComparatorUtils.min(java.lang.Object,java.lang.Object,java.util.Comparator)
*min(java.lang.Object p0,java.lang.Object p1,java.util.Comparator p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.Object min(java.lang.Object p0,java.lang.Object p1,java.util.Comparator p2){
	return org.apache.commons.collections.ComparatorUtils.min(p0,p1,p2);
}
/**
*{@link org.apache.commons.collections4.ComparatorUtils#naturalComparator()}
*@see org.apache.commons.collections4.ComparatorUtils#naturalComparator()
*<code>public static <E> java.util.Comparator<E> org.apache.commons.collections4.ComparatorUtils.naturalComparator()
*naturalComparator()</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E extends java.lang.Comparable<? super E> > java.util.Comparator<E> naturalComparator(){
	return org.apache.commons.collections4.ComparatorUtils.naturalComparator();
}
/**
*{@link org.apache.commons.collections4.ComparatorUtils#nullHighComparator(java.util.Comparator<E>)}
*@see org.apache.commons.collections4.ComparatorUtils#nullHighComparator(java.util.Comparator<E>)
*<code>public static <E> java.util.Comparator<E> org.apache.commons.collections4.ComparatorUtils.nullHighComparator(java.util.Comparator<E>)
*nullHighComparator(java.util.Comparator<E> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E> java.util.Comparator<E> nullHighComparator(java.util.Comparator<E> p0){
	return org.apache.commons.collections4.ComparatorUtils.nullHighComparator(p0);
}
/**
*{@link org.apache.commons.collections.ComparatorUtils#nullHighComparator(java.util.Comparator)}
*@see org.apache.commons.collections.ComparatorUtils#nullHighComparator(java.util.Comparator)
*<code>public static java.util.Comparator org.apache.commons.collections.ComparatorUtils.nullHighComparator(java.util.Comparator)
*nullHighComparator(java.util.Comparator p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Comparator nullHighComparator(java.util.Comparator p0){
	return org.apache.commons.collections.ComparatorUtils.nullHighComparator(p0);
}
/**
*{@link org.apache.commons.collections4.ComparatorUtils#nullLowComparator(java.util.Comparator<E>)}
*@see org.apache.commons.collections4.ComparatorUtils#nullLowComparator(java.util.Comparator<E>)
*<code>public static <E> java.util.Comparator<E> org.apache.commons.collections4.ComparatorUtils.nullLowComparator(java.util.Comparator<E>)
*nullLowComparator(java.util.Comparator<E> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E> java.util.Comparator<E> nullLowComparator(java.util.Comparator<E> p0){
	return org.apache.commons.collections4.ComparatorUtils.nullLowComparator(p0);
}
/**
*{@link org.apache.commons.collections.ComparatorUtils#nullLowComparator(java.util.Comparator)}
*@see org.apache.commons.collections.ComparatorUtils#nullLowComparator(java.util.Comparator)
*<code>public static java.util.Comparator org.apache.commons.collections.ComparatorUtils.nullLowComparator(java.util.Comparator)
*nullLowComparator(java.util.Comparator p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Comparator nullLowComparator(java.util.Comparator p0){
	return org.apache.commons.collections.ComparatorUtils.nullLowComparator(p0);
}
/**
*{@link it.unimi.dsi.fastutil.objects.ObjectComparators#oppositeComparator(java.util.Comparator<K>)}
*@see it.unimi.dsi.fastutil.objects.ObjectComparators#oppositeComparator(java.util.Comparator<K>)
*<code>public static <K> java.util.Comparator<K> it.unimi.dsi.fastutil.objects.ObjectComparators.oppositeComparator(java.util.Comparator<K>)
*oppositeComparator(java.util.Comparator<K> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K> java.util.Comparator<K> oppositeComparator(java.util.Comparator<K> p0){
	return it.unimi.dsi.fastutil.objects.ObjectComparators.oppositeComparator(p0);
}
/**
*{@link org.apache.commons.collections4.ComparatorUtils#reversedComparator(java.util.Comparator<E>)}
*@see org.apache.commons.collections4.ComparatorUtils#reversedComparator(java.util.Comparator<E>)
*<code>public static <E> java.util.Comparator<E> org.apache.commons.collections4.ComparatorUtils.reversedComparator(java.util.Comparator<E>)
*reversedComparator(java.util.Comparator<E> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E> java.util.Comparator<E> reversedComparator(java.util.Comparator<E> p0){
	return org.apache.commons.collections4.ComparatorUtils.reversedComparator(p0);
}
/**
*{@link org.apache.commons.collections.ComparatorUtils#reversedComparator(java.util.Comparator)}
*@see org.apache.commons.collections.ComparatorUtils#reversedComparator(java.util.Comparator)
*<code>public static java.util.Comparator org.apache.commons.collections.ComparatorUtils.reversedComparator(java.util.Comparator)
*reversedComparator(java.util.Comparator p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Comparator reversedComparator(java.util.Comparator p0){
	return org.apache.commons.collections.ComparatorUtils.reversedComparator(p0);
}
/**
*{@link org.apache.commons.collections4.ComparatorUtils#transformedComparator(java.util.Comparator<O>,org.apache.commons.collections4.Transformer<? super I, ? extends O>)}
*@see org.apache.commons.collections4.ComparatorUtils#transformedComparator(java.util.Comparator<O>,org.apache.commons.collections4.Transformer<? super I, ? extends O>)
*<code>public static <I,O> java.util.Comparator<I> org.apache.commons.collections4.ComparatorUtils.transformedComparator(java.util.Comparator<O>,org.apache.commons.collections4.Transformer<? super I, ? extends O>)
*transformedComparator(java.util.Comparator<O> p0,org.apache.commons.collections4.Transformer<? super I, ? extends O> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <I,O> java.util.Comparator<I> transformedComparator(java.util.Comparator<O> p0,org.apache.commons.collections4.Transformer<? super I, ? extends O> p1){
	return org.apache.commons.collections4.ComparatorUtils.transformedComparator(p0,p1);
}
/**
*{@link org.apache.commons.collections.ComparatorUtils#transformedComparator(java.util.Comparator,org.apache.commons.collections.Transformer)}
*@see org.apache.commons.collections.ComparatorUtils#transformedComparator(java.util.Comparator,org.apache.commons.collections.Transformer)
*<code>public static java.util.Comparator org.apache.commons.collections.ComparatorUtils.transformedComparator(java.util.Comparator,org.apache.commons.collections.Transformer)
*transformedComparator(java.util.Comparator p0,org.apache.commons.collections.Transformer p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Comparator transformedComparator(java.util.Comparator p0,org.apache.commons.collections.Transformer p1){
	return org.apache.commons.collections.ComparatorUtils.transformedComparator(p0,p1);
}
/**
*{@link com.google.common.primitives.Booleans#trueFirst()}
*@see com.google.common.primitives.Booleans#trueFirst()
*<code>public static java.util.Comparator<java.lang.Boolean> com.google.common.primitives.Booleans.trueFirst()
*trueFirst()</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Comparator<java.lang.Boolean> trueFirst(){
	return com.google.common.primitives.Booleans.trueFirst();
}
}
