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
public final class IteratorUtil{ 
/**
*{@link org.apache.commons.collections.CollectionUtils#addAll(java.util.Collection,java.util.Iterator)}
*@see org.apache.commons.collections.CollectionUtils#addAll(java.util.Collection,java.util.Iterator)
*<code>public static void org.apache.commons.collections.CollectionUtils.addAll(java.util.Collection,java.util.Iterator)
*addAll(java.util.Collection p0,java.util.Iterator p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void addAll(java.util.Collection p0,java.util.Iterator p1){
	 org.apache.commons.collections.CollectionUtils.addAll(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.booleans.BooleanIterators#asBooleanIterator(java.util.Iterator)}
*@see it.unimi.dsi.fastutil.booleans.BooleanIterators#asBooleanIterator(java.util.Iterator)
*<code>public static it.unimi.dsi.fastutil.booleans.BooleanIterator it.unimi.dsi.fastutil.booleans.BooleanIterators.asBooleanIterator(java.util.Iterator)
*asBooleanIterator(java.util.Iterator p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.booleans.BooleanIterator asBooleanIterator(java.util.Iterator p0){
	return it.unimi.dsi.fastutil.booleans.BooleanIterators.asBooleanIterator(p0);
}
/**
*{@link it.unimi.dsi.fastutil.bytes.ByteIterators#asByteIterator(java.util.Iterator)}
*@see it.unimi.dsi.fastutil.bytes.ByteIterators#asByteIterator(java.util.Iterator)
*<code>public static it.unimi.dsi.fastutil.bytes.ByteIterator it.unimi.dsi.fastutil.bytes.ByteIterators.asByteIterator(java.util.Iterator)
*asByteIterator(java.util.Iterator p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.bytes.ByteIterator asByteIterator(java.util.Iterator p0){
	return it.unimi.dsi.fastutil.bytes.ByteIterators.asByteIterator(p0);
}
/**
*{@link it.unimi.dsi.fastutil.chars.CharIterators#asCharIterator(java.util.Iterator)}
*@see it.unimi.dsi.fastutil.chars.CharIterators#asCharIterator(java.util.Iterator)
*<code>public static it.unimi.dsi.fastutil.chars.CharIterator it.unimi.dsi.fastutil.chars.CharIterators.asCharIterator(java.util.Iterator)
*asCharIterator(java.util.Iterator p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.chars.CharIterator asCharIterator(java.util.Iterator p0){
	return it.unimi.dsi.fastutil.chars.CharIterators.asCharIterator(p0);
}
/**
*{@link it.unimi.dsi.fastutil.doubles.DoubleIterators#asDoubleIterator(java.util.Iterator)}
*@see it.unimi.dsi.fastutil.doubles.DoubleIterators#asDoubleIterator(java.util.Iterator)
*<code>public static it.unimi.dsi.fastutil.doubles.DoubleIterator it.unimi.dsi.fastutil.doubles.DoubleIterators.asDoubleIterator(java.util.Iterator)
*asDoubleIterator(java.util.Iterator p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.doubles.DoubleIterator asDoubleIterator(java.util.Iterator p0){
	return it.unimi.dsi.fastutil.doubles.DoubleIterators.asDoubleIterator(p0);
}
/**
*{@link org.apache.commons.collections.IteratorUtils#asEnumeration(java.util.Iterator)}
*@see org.apache.commons.collections.IteratorUtils#asEnumeration(java.util.Iterator)
*<code>public static java.util.Enumeration org.apache.commons.collections.IteratorUtils.asEnumeration(java.util.Iterator)
*asEnumeration(java.util.Iterator p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Enumeration asEnumeration(java.util.Iterator p0){
	return org.apache.commons.collections.IteratorUtils.asEnumeration(p0);
}
/**
*{@link it.unimi.dsi.fastutil.floats.FloatIterators#asFloatIterator(java.util.Iterator)}
*@see it.unimi.dsi.fastutil.floats.FloatIterators#asFloatIterator(java.util.Iterator)
*<code>public static it.unimi.dsi.fastutil.floats.FloatIterator it.unimi.dsi.fastutil.floats.FloatIterators.asFloatIterator(java.util.Iterator)
*asFloatIterator(java.util.Iterator p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.floats.FloatIterator asFloatIterator(java.util.Iterator p0){
	return it.unimi.dsi.fastutil.floats.FloatIterators.asFloatIterator(p0);
}
/**
*{@link it.unimi.dsi.fastutil.ints.IntIterators#asIntIterator(java.util.Iterator)}
*@see it.unimi.dsi.fastutil.ints.IntIterators#asIntIterator(java.util.Iterator)
*<code>public static it.unimi.dsi.fastutil.ints.IntIterator it.unimi.dsi.fastutil.ints.IntIterators.asIntIterator(java.util.Iterator)
*asIntIterator(java.util.Iterator p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.ints.IntIterator asIntIterator(java.util.Iterator p0){
	return it.unimi.dsi.fastutil.ints.IntIterators.asIntIterator(p0);
}
/**
*{@link org.apache.commons.collections4.IteratorUtils#asIterator(java.util.Enumeration<? extends E>,java.util.Collection<? super E>)}
*@see org.apache.commons.collections4.IteratorUtils#asIterator(java.util.Enumeration<? extends E>,java.util.Collection<? super E>)
*<code>public static <E> java.util.Iterator<E> org.apache.commons.collections4.IteratorUtils.asIterator(java.util.Enumeration<? extends E>,java.util.Collection<? super E>)
*asIterator(java.util.Enumeration<? extends E> p0,java.util.Collection<? super E> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E> java.util.Iterator<E> asIterator(java.util.Enumeration<? extends E> p0,java.util.Collection<? super E> p1){
	return org.apache.commons.collections4.IteratorUtils.asIterator(p0,p1);
}
/**
*{@link org.apache.commons.collections4.IteratorUtils#asIterator(java.util.Enumeration<? extends E>)}
*@see org.apache.commons.collections4.IteratorUtils#asIterator(java.util.Enumeration<? extends E>)
*<code>public static <E> java.util.Iterator<E> org.apache.commons.collections4.IteratorUtils.asIterator(java.util.Enumeration<? extends E>)
*asIterator(java.util.Enumeration<? extends E> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E> java.util.Iterator<E> asIterator(java.util.Enumeration<? extends E> p0){
	return org.apache.commons.collections4.IteratorUtils.asIterator(p0);
}
/**
*{@link org.apache.commons.collections.IteratorUtils#asIterator(java.util.Enumeration)}
*@see org.apache.commons.collections.IteratorUtils#asIterator(java.util.Enumeration)
*<code>public static java.util.Iterator org.apache.commons.collections.IteratorUtils.asIterator(java.util.Enumeration)
*asIterator(java.util.Enumeration p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Iterator asIterator(java.util.Enumeration p0){
	return org.apache.commons.collections.IteratorUtils.asIterator(p0);
}
/**
*{@link org.apache.commons.collections.IteratorUtils#asIterator(java.util.Enumeration,java.util.Collection)}
*@see org.apache.commons.collections.IteratorUtils#asIterator(java.util.Enumeration,java.util.Collection)
*<code>public static java.util.Iterator org.apache.commons.collections.IteratorUtils.asIterator(java.util.Enumeration,java.util.Collection)
*asIterator(java.util.Enumeration p0,java.util.Collection p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Iterator asIterator(java.util.Enumeration p0,java.util.Collection p1){
	return org.apache.commons.collections.IteratorUtils.asIterator(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.longs.LongIterators#asLongIterator(java.util.Iterator)}
*@see it.unimi.dsi.fastutil.longs.LongIterators#asLongIterator(java.util.Iterator)
*<code>public static it.unimi.dsi.fastutil.longs.LongIterator it.unimi.dsi.fastutil.longs.LongIterators.asLongIterator(java.util.Iterator)
*asLongIterator(java.util.Iterator p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.longs.LongIterator asLongIterator(java.util.Iterator p0){
	return it.unimi.dsi.fastutil.longs.LongIterators.asLongIterator(p0);
}
/**
*{@link it.unimi.dsi.fastutil.shorts.ShortIterators#asShortIterator(java.util.Iterator)}
*@see it.unimi.dsi.fastutil.shorts.ShortIterators#asShortIterator(java.util.Iterator)
*<code>public static it.unimi.dsi.fastutil.shorts.ShortIterator it.unimi.dsi.fastutil.shorts.ShortIterators.asShortIterator(java.util.Iterator)
*asShortIterator(java.util.Iterator p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.shorts.ShortIterator asShortIterator(java.util.Iterator p0){
	return it.unimi.dsi.fastutil.shorts.ShortIterators.asShortIterator(p0);
}
/**
*{@link org.apache.commons.collections4.IteratorUtils#chainedIterator(java.util.Collection<java.util.Iterator<? extends E>>)}
*@see org.apache.commons.collections4.IteratorUtils#chainedIterator(java.util.Collection<java.util.Iterator<? extends E>>)
*<code>public static <E> java.util.Iterator<E> org.apache.commons.collections4.IteratorUtils.chainedIterator(java.util.Collection<java.util.Iterator<? extends E>>)
*chainedIterator(java.util.Collection<java.util.Iterator<? extends E>> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E> java.util.Iterator<E> chainedIterator(java.util.Collection<java.util.Iterator<? extends E>> p0){
	return org.apache.commons.collections4.IteratorUtils.chainedIterator(p0);
}
/**
*{@link org.apache.commons.collections4.IteratorUtils#chainedIterator(java.util.Iterator<? extends E>,java.util.Iterator<? extends E>)}
*@see org.apache.commons.collections4.IteratorUtils#chainedIterator(java.util.Iterator<? extends E>,java.util.Iterator<? extends E>)
*<code>public static <E> java.util.Iterator<E> org.apache.commons.collections4.IteratorUtils.chainedIterator(java.util.Iterator<? extends E>,java.util.Iterator<? extends E>)
*chainedIterator(java.util.Iterator<? extends E> p0,java.util.Iterator<? extends E> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E> java.util.Iterator<E> chainedIterator(java.util.Iterator<? extends E> p0,java.util.Iterator<? extends E> p1){
	return org.apache.commons.collections4.IteratorUtils.chainedIterator(p0,p1);
}
/**
*{@link org.apache.commons.collections4.IteratorUtils#chainedIterator(java.util.Iterator<? extends E>...)}
*@see org.apache.commons.collections4.IteratorUtils#chainedIterator(java.util.Iterator<? extends E>...)
*<code>public static <E> java.util.Iterator<E> org.apache.commons.collections4.IteratorUtils.chainedIterator(java.util.Iterator<? extends E>...)
*chainedIterator(java.util.Iterator<? extends E>... p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E> java.util.Iterator<E> chainedIterator(java.util.Iterator<? extends E>... p0){
	return org.apache.commons.collections4.IteratorUtils.chainedIterator(p0);
}
/**
*{@link org.apache.commons.collections.IteratorUtils#chainedIterator(java.util.Iterator,java.util.Iterator)}
*@see org.apache.commons.collections.IteratorUtils#chainedIterator(java.util.Iterator,java.util.Iterator)
*<code>public static java.util.Iterator org.apache.commons.collections.IteratorUtils.chainedIterator(java.util.Iterator,java.util.Iterator)
*chainedIterator(java.util.Iterator p0,java.util.Iterator p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Iterator chainedIterator(java.util.Iterator p0,java.util.Iterator p1){
	return org.apache.commons.collections.IteratorUtils.chainedIterator(p0,p1);
}
/**
*{@link org.apache.commons.collections.IteratorUtils#chainedIterator(java.util.Iterator...)}
*@see org.apache.commons.collections.IteratorUtils#chainedIterator(java.util.Iterator...)
*<code>public static java.util.Iterator org.apache.commons.collections.IteratorUtils.chainedIterator(java.util.Iterator[])
*chainedIterator(java.util.Iterator... p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Iterator chainedIterator(java.util.Iterator... p0){
	return org.apache.commons.collections.IteratorUtils.chainedIterator(p0);
}
/**
*{@link org.apache.commons.collections.IteratorUtils#chainedIterator(java.util.Collection)}
*@see org.apache.commons.collections.IteratorUtils#chainedIterator(java.util.Collection)
*<code>public static java.util.Iterator org.apache.commons.collections.IteratorUtils.chainedIterator(java.util.Collection)
*chainedIterator(java.util.Collection p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Iterator chainedIterator(java.util.Collection p0){
	return org.apache.commons.collections.IteratorUtils.chainedIterator(p0);
}
/**
*{@link org.apache.commons.collections4.IteratorUtils#collatedIterator(java.util.Comparator<? super E>,java.util.Iterator<? extends E>...)}
*@see org.apache.commons.collections4.IteratorUtils#collatedIterator(java.util.Comparator<? super E>,java.util.Iterator<? extends E>...)
*<code>public static <E> java.util.Iterator<E> org.apache.commons.collections4.IteratorUtils.collatedIterator(java.util.Comparator<? super E>,java.util.Iterator<? extends E>...)
*collatedIterator(java.util.Comparator<? super E> p0,java.util.Iterator<? extends E>... p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E> java.util.Iterator<E> collatedIterator(java.util.Comparator<? super E> p0,java.util.Iterator<? extends E>... p1){
	return org.apache.commons.collections4.IteratorUtils.collatedIterator(p0,p1);
}
/**
*{@link org.apache.commons.collections4.IteratorUtils#collatedIterator(java.util.Comparator<? super E>,java.util.Collection<java.util.Iterator<? extends E>>)}
*@see org.apache.commons.collections4.IteratorUtils#collatedIterator(java.util.Comparator<? super E>,java.util.Collection<java.util.Iterator<? extends E>>)
*<code>public static <E> java.util.Iterator<E> org.apache.commons.collections4.IteratorUtils.collatedIterator(java.util.Comparator<? super E>,java.util.Collection<java.util.Iterator<? extends E>>)
*collatedIterator(java.util.Comparator<? super E> p0,java.util.Collection<java.util.Iterator<? extends E>> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E> java.util.Iterator<E> collatedIterator(java.util.Comparator<? super E> p0,java.util.Collection<java.util.Iterator<? extends E>> p1){
	return org.apache.commons.collections4.IteratorUtils.collatedIterator(p0,p1);
}
/**
*{@link org.apache.commons.collections4.IteratorUtils#collatedIterator(java.util.Comparator<? super E>,java.util.Iterator<? extends E>,java.util.Iterator<? extends E>)}
*@see org.apache.commons.collections4.IteratorUtils#collatedIterator(java.util.Comparator<? super E>,java.util.Iterator<? extends E>,java.util.Iterator<? extends E>)
*<code>public static <E> java.util.Iterator<E> org.apache.commons.collections4.IteratorUtils.collatedIterator(java.util.Comparator<? super E>,java.util.Iterator<? extends E>,java.util.Iterator<? extends E>)
*collatedIterator(java.util.Comparator<? super E> p0,java.util.Iterator<? extends E> p1,java.util.Iterator<? extends E> p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E> java.util.Iterator<E> collatedIterator(java.util.Comparator<? super E> p0,java.util.Iterator<? extends E> p1,java.util.Iterator<? extends E> p2){
	return org.apache.commons.collections4.IteratorUtils.collatedIterator(p0,p1,p2);
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
*{@link org.apache.commons.collections.CollectionUtils#collect(java.util.Iterator,org.apache.commons.collections.Transformer)}
*@see org.apache.commons.collections.CollectionUtils#collect(java.util.Iterator,org.apache.commons.collections.Transformer)
*<code>public static java.util.Collection org.apache.commons.collections.CollectionUtils.collect(java.util.Iterator,org.apache.commons.collections.Transformer)
*collect(java.util.Iterator p0,org.apache.commons.collections.Transformer p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Collection collect(java.util.Iterator p0,org.apache.commons.collections.Transformer p1){
	return org.apache.commons.collections.CollectionUtils.collect(p0,p1);
}
/**
*{@link org.apache.commons.collections.CollectionUtils#collect(java.util.Iterator,org.apache.commons.collections.Transformer,java.util.Collection)}
*@see org.apache.commons.collections.CollectionUtils#collect(java.util.Iterator,org.apache.commons.collections.Transformer,java.util.Collection)
*<code>public static java.util.Collection org.apache.commons.collections.CollectionUtils.collect(java.util.Iterator,org.apache.commons.collections.Transformer,java.util.Collection)
*collect(java.util.Iterator p0,org.apache.commons.collections.Transformer p1,java.util.Collection p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Collection collect(java.util.Iterator p0,org.apache.commons.collections.Transformer p1,java.util.Collection p2){
	return org.apache.commons.collections.CollectionUtils.collect(p0,p1,p2);
}
/**
*{@link org.apache.commons.math3.util.CombinatoricsUtils#combinationsIterator(int,int)}
*@see org.apache.commons.math3.util.CombinatoricsUtils#combinationsIterator(int,int)
*<code>public static java.util.Iterator<int[]> org.apache.commons.math3.util.CombinatoricsUtils.combinationsIterator(int,int)
*combinationsIterator(int p0,int p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Iterator<int[]> combinationsIterator(int p0,int p1){
	return org.apache.commons.math3.util.CombinatoricsUtils.combinationsIterator(p0,p1);
}
/**
*{@link com.google.common.collect.Iterators#concat(java.util.Iterator<? extends T>,java.util.Iterator<? extends T>,java.util.Iterator<? extends T>,java.util.Iterator<? extends T>)}
*@see com.google.common.collect.Iterators#concat(java.util.Iterator<? extends T>,java.util.Iterator<? extends T>,java.util.Iterator<? extends T>,java.util.Iterator<? extends T>)
*<code>public static <T> java.util.Iterator<T> com.google.common.collect.Iterators.concat(java.util.Iterator<? extends T>,java.util.Iterator<? extends T>,java.util.Iterator<? extends T>,java.util.Iterator<? extends T>)
*concat(java.util.Iterator<? extends T> p0,java.util.Iterator<? extends T> p1,java.util.Iterator<? extends T> p2,java.util.Iterator<? extends T> p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> java.util.Iterator<T> concat(java.util.Iterator<? extends T> p0,java.util.Iterator<? extends T> p1,java.util.Iterator<? extends T> p2,java.util.Iterator<? extends T> p3){
	return com.google.common.collect.Iterators.concat(p0,p1,p2,p3);
}
/**
*{@link com.google.common.collect.Iterators#concat(java.util.Iterator<? extends T>,java.util.Iterator<? extends T>)}
*@see com.google.common.collect.Iterators#concat(java.util.Iterator<? extends T>,java.util.Iterator<? extends T>)
*<code>public static <T> java.util.Iterator<T> com.google.common.collect.Iterators.concat(java.util.Iterator<? extends T>,java.util.Iterator<? extends T>)
*concat(java.util.Iterator<? extends T> p0,java.util.Iterator<? extends T> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> java.util.Iterator<T> concat(java.util.Iterator<? extends T> p0,java.util.Iterator<? extends T> p1){
	return com.google.common.collect.Iterators.concat(p0,p1);
}
/**
*{@link com.google.common.collect.Iterators#concat(java.util.Iterator<? extends T>,java.util.Iterator<? extends T>,java.util.Iterator<? extends T>)}
*@see com.google.common.collect.Iterators#concat(java.util.Iterator<? extends T>,java.util.Iterator<? extends T>,java.util.Iterator<? extends T>)
*<code>public static <T> java.util.Iterator<T> com.google.common.collect.Iterators.concat(java.util.Iterator<? extends T>,java.util.Iterator<? extends T>,java.util.Iterator<? extends T>)
*concat(java.util.Iterator<? extends T> p0,java.util.Iterator<? extends T> p1,java.util.Iterator<? extends T> p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> java.util.Iterator<T> concat(java.util.Iterator<? extends T> p0,java.util.Iterator<? extends T> p1,java.util.Iterator<? extends T> p2){
	return com.google.common.collect.Iterators.concat(p0,p1,p2);
}
/**
*{@link com.google.common.collect.Iterators#concat(java.util.Iterator<? extends java.util.Iterator<? extends T>>)}
*@see com.google.common.collect.Iterators#concat(java.util.Iterator<? extends java.util.Iterator<? extends T>>)
*<code>public static <T> java.util.Iterator<T> com.google.common.collect.Iterators.concat(java.util.Iterator<? extends java.util.Iterator<? extends T>>)
*concat(java.util.Iterator<? extends java.util.Iterator<? extends T>> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> java.util.Iterator<T> concat(java.util.Iterator<? extends java.util.Iterator<? extends T>> p0){
	return com.google.common.collect.Iterators.concat(p0);
}
/**
*{@link com.google.common.collect.Iterators#concat(java.util.Iterator<? extends T>...)}
*@see com.google.common.collect.Iterators#concat(java.util.Iterator<? extends T>...)
*<code>public static <T> java.util.Iterator<T> com.google.common.collect.Iterators.concat(java.util.Iterator<? extends T>...)
*concat(java.util.Iterator<? extends T>... p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> java.util.Iterator<T> concat(java.util.Iterator<? extends T>... p0){
	return com.google.common.collect.Iterators.concat(p0);
}
/**
*{@link com.google.common.collect.Iterators#consumingIterator(java.util.Iterator<T>)}
*@see com.google.common.collect.Iterators#consumingIterator(java.util.Iterator<T>)
*<code>public static <T> java.util.Iterator<T> com.google.common.collect.Iterators.consumingIterator(java.util.Iterator<T>)
*consumingIterator(java.util.Iterator<T> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> java.util.Iterator<T> consumingIterator(java.util.Iterator<T> p0){
	return com.google.common.collect.Iterators.consumingIterator(p0);
}
/**
*{@link com.google.common.collect.Iterators#cycle(java.lang.Iterable<T>)}
*@see com.google.common.collect.Iterators#cycle(java.lang.Iterable<T>)
*<code>public static <T> java.util.Iterator<T> com.google.common.collect.Iterators.cycle(java.lang.Iterable<T>)
*cycle(java.lang.Iterable<T> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> java.util.Iterator<T> cycle(java.lang.Iterable<T> p0){
	return com.google.common.collect.Iterators.cycle(p0);
}
/**
*{@link com.google.common.collect.Iterators#cycle(T...)}
*@see com.google.common.collect.Iterators#cycle(T...)
*<code>public static <T> java.util.Iterator<T> com.google.common.collect.Iterators.cycle(T...)
*cycle(T... p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> java.util.Iterator<T> cycle(T... p0){
	return com.google.common.collect.Iterators.cycle(p0);
}
/**
*{@link org.apache.commons.collections.iterators.UnmodifiableIterator#decorate(java.util.Iterator)}
*@see org.apache.commons.collections.iterators.UnmodifiableIterator#decorate(java.util.Iterator)
*<code>public static java.util.Iterator org.apache.commons.collections.iterators.UnmodifiableIterator.decorate(java.util.Iterator)
*decorate(java.util.Iterator p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Iterator decorate(java.util.Iterator p0){
	return org.apache.commons.collections.iterators.UnmodifiableIterator.decorate(p0);
}
/**
*{@link org.apache.commons.collections4.iterators.EmptyIterator#emptyIterator()}
*@see org.apache.commons.collections4.iterators.EmptyIterator#emptyIterator()
*<code>public static <E> java.util.Iterator<E> org.apache.commons.collections4.iterators.EmptyIterator.emptyIterator()
*emptyIterator()</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E> java.util.Iterator<E> emptyIterator(){
	return org.apache.commons.collections4.iterators.EmptyIterator.emptyIterator();
}
/**
*{@link org.apache.commons.collections4.IteratorUtils#filteredIterator(java.util.Iterator<? extends E>,org.apache.commons.collections4.Predicate<? super E>)}
*@see org.apache.commons.collections4.IteratorUtils#filteredIterator(java.util.Iterator<? extends E>,org.apache.commons.collections4.Predicate<? super E>)
*<code>public static <E> java.util.Iterator<E> org.apache.commons.collections4.IteratorUtils.filteredIterator(java.util.Iterator<? extends E>,org.apache.commons.collections4.Predicate<? super E>)
*filteredIterator(java.util.Iterator<? extends E> p0,org.apache.commons.collections4.Predicate<? super E> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E> java.util.Iterator<E> filteredIterator(java.util.Iterator<? extends E> p0,org.apache.commons.collections4.Predicate<? super E> p1){
	return org.apache.commons.collections4.IteratorUtils.filteredIterator(p0,p1);
}
/**
*{@link org.apache.commons.collections.IteratorUtils#filteredIterator(java.util.Iterator,org.apache.commons.collections.Predicate)}
*@see org.apache.commons.collections.IteratorUtils#filteredIterator(java.util.Iterator,org.apache.commons.collections.Predicate)
*<code>public static java.util.Iterator org.apache.commons.collections.IteratorUtils.filteredIterator(java.util.Iterator,org.apache.commons.collections.Predicate)
*filteredIterator(java.util.Iterator p0,org.apache.commons.collections.Predicate p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Iterator filteredIterator(java.util.Iterator p0,org.apache.commons.collections.Predicate p1){
	return org.apache.commons.collections.IteratorUtils.filteredIterator(p0,p1);
}
/**
*{@link org.apache.commons.collections4.IteratorUtils#getIterator(java.lang.Object)}
*@see org.apache.commons.collections4.IteratorUtils#getIterator(java.lang.Object)
*<code>public static java.util.Iterator<?> org.apache.commons.collections4.IteratorUtils.getIterator(java.lang.Object)
*getIterator(java.lang.Object p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Iterator<?> getIterator(java.lang.Object p0){
	return org.apache.commons.collections4.IteratorUtils.getIterator(p0);
}
/**
*{@link org.apache.commons.io.FileUtils#iterateFiles(java.io.File,org.apache.commons.io.filefilter.IOFileFilter,org.apache.commons.io.filefilter.IOFileFilter)}
*@see org.apache.commons.io.FileUtils#iterateFiles(java.io.File,org.apache.commons.io.filefilter.IOFileFilter,org.apache.commons.io.filefilter.IOFileFilter)
*<code>public static java.util.Iterator<java.io.File> org.apache.commons.io.FileUtils.iterateFiles(java.io.File,org.apache.commons.io.filefilter.IOFileFilter,org.apache.commons.io.filefilter.IOFileFilter)
*iterateFiles(java.io.File p0,org.apache.commons.io.filefilter.IOFileFilter p1,org.apache.commons.io.filefilter.IOFileFilter p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Iterator<java.io.File> iterateFiles(java.io.File p0,org.apache.commons.io.filefilter.IOFileFilter p1,org.apache.commons.io.filefilter.IOFileFilter p2){
	return org.apache.commons.io.FileUtils.iterateFiles(p0,p1,p2);
}
/**
*{@link org.apache.commons.io.FileUtils#iterateFiles(java.io.File,java.lang.String[],boolean)}
*@see org.apache.commons.io.FileUtils#iterateFiles(java.io.File,java.lang.String[],boolean)
*<code>public static java.util.Iterator<java.io.File> org.apache.commons.io.FileUtils.iterateFiles(java.io.File,java.lang.String[],boolean)
*iterateFiles(java.io.File p0,java.lang.String[] p1,boolean p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Iterator<java.io.File> iterateFiles(java.io.File p0,java.lang.String[] p1,boolean p2){
	return org.apache.commons.io.FileUtils.iterateFiles(p0,p1,p2);
}
/**
*{@link org.apache.commons.io.FileUtils#iterateFilesAndDirs(java.io.File,org.apache.commons.io.filefilter.IOFileFilter,org.apache.commons.io.filefilter.IOFileFilter)}
*@see org.apache.commons.io.FileUtils#iterateFilesAndDirs(java.io.File,org.apache.commons.io.filefilter.IOFileFilter,org.apache.commons.io.filefilter.IOFileFilter)
*<code>public static java.util.Iterator<java.io.File> org.apache.commons.io.FileUtils.iterateFilesAndDirs(java.io.File,org.apache.commons.io.filefilter.IOFileFilter,org.apache.commons.io.filefilter.IOFileFilter)
*iterateFilesAndDirs(java.io.File p0,org.apache.commons.io.filefilter.IOFileFilter p1,org.apache.commons.io.filefilter.IOFileFilter p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Iterator<java.io.File> iterateFilesAndDirs(java.io.File p0,org.apache.commons.io.filefilter.IOFileFilter p1,org.apache.commons.io.filefilter.IOFileFilter p2){
	return org.apache.commons.io.FileUtils.iterateFilesAndDirs(p0,p1,p2);
}
/**
*{@link org.apache.commons.lang3.time.DateUtils#iterator(java.lang.Object,int)}
*@see org.apache.commons.lang3.time.DateUtils#iterator(java.lang.Object,int)
*<code>public static java.util.Iterator<?> org.apache.commons.lang3.time.DateUtils.iterator(java.lang.Object,int)
*iterator(java.lang.Object p0,int p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Iterator<?> iterator(java.lang.Object p0,int p1){
	return org.apache.commons.lang3.time.DateUtils.iterator(p0,p1);
}
/**
*{@link org.apache.commons.lang3.time.DateUtils#iterator(java.util.Date,int)}
*@see org.apache.commons.lang3.time.DateUtils#iterator(java.util.Date,int)
*<code>public static java.util.Iterator<java.util.Calendar> org.apache.commons.lang3.time.DateUtils.iterator(java.util.Date,int)
*iterator(java.util.Date p0,int p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Iterator<java.util.Calendar> iterator(java.util.Date p0,int p1){
	return org.apache.commons.lang3.time.DateUtils.iterator(p0,p1);
}
/**
*{@link org.apache.commons.lang3.time.DateUtils#iterator(java.util.Calendar,int)}
*@see org.apache.commons.lang3.time.DateUtils#iterator(java.util.Calendar,int)
*<code>public static java.util.Iterator<java.util.Calendar> org.apache.commons.lang3.time.DateUtils.iterator(java.util.Calendar,int)
*iterator(java.util.Calendar p0,int p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Iterator<java.util.Calendar> iterator(java.util.Calendar p0,int p1){
	return org.apache.commons.lang3.time.DateUtils.iterator(p0,p1);
}
/**
*{@link com.google.common.collect.Iterators#limit(java.util.Iterator<T>,int)}
*@see com.google.common.collect.Iterators#limit(java.util.Iterator<T>,int)
*<code>public static <T> java.util.Iterator<T> com.google.common.collect.Iterators.limit(java.util.Iterator<T>,int)
*limit(java.util.Iterator<T> p0,int p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> java.util.Iterator<T> limit(java.util.Iterator<T> p0,int p1){
	return com.google.common.collect.Iterators.limit(p0,p1);
}
/**
*{@link org.apache.commons.collections4.IteratorUtils#objectGraphIterator(E,org.apache.commons.collections4.Transformer<? super E, ? extends E>)}
*@see org.apache.commons.collections4.IteratorUtils#objectGraphIterator(E,org.apache.commons.collections4.Transformer<? super E, ? extends E>)
*<code>public static <E> java.util.Iterator<E> org.apache.commons.collections4.IteratorUtils.objectGraphIterator(E,org.apache.commons.collections4.Transformer<? super E, ? extends E>)
*objectGraphIterator(E p0,org.apache.commons.collections4.Transformer<? super E, ? extends E> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E> java.util.Iterator<E> objectGraphIterator(E p0,org.apache.commons.collections4.Transformer<? super E, ? extends E> p1){
	return org.apache.commons.collections4.IteratorUtils.objectGraphIterator(p0,p1);
}
/**
*{@link org.apache.commons.collections.IteratorUtils#objectGraphIterator(java.lang.Object,org.apache.commons.collections.Transformer)}
*@see org.apache.commons.collections.IteratorUtils#objectGraphIterator(java.lang.Object,org.apache.commons.collections.Transformer)
*<code>public static java.util.Iterator org.apache.commons.collections.IteratorUtils.objectGraphIterator(java.lang.Object,org.apache.commons.collections.Transformer)
*objectGraphIterator(java.lang.Object p0,org.apache.commons.collections.Transformer p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Iterator objectGraphIterator(java.lang.Object p0,org.apache.commons.collections.Transformer p1){
	return org.apache.commons.collections.IteratorUtils.objectGraphIterator(p0,p1);
}
/**
*{@link org.apache.commons.collections4.IteratorUtils#peekingIterator(java.util.Iterator<? extends E>)}
*@see org.apache.commons.collections4.IteratorUtils#peekingIterator(java.util.Iterator<? extends E>)
*<code>public static <E> java.util.Iterator<E> org.apache.commons.collections4.IteratorUtils.peekingIterator(java.util.Iterator<? extends E>)
*peekingIterator(java.util.Iterator<? extends E> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E> java.util.Iterator<E> peekingIterator(java.util.Iterator<? extends E> p0){
	return org.apache.commons.collections4.IteratorUtils.peekingIterator(p0);
}
/**
*{@link org.apache.commons.collections4.IteratorUtils#pushbackIterator(java.util.Iterator<? extends E>)}
*@see org.apache.commons.collections4.IteratorUtils#pushbackIterator(java.util.Iterator<? extends E>)
*<code>public static <E> java.util.Iterator<E> org.apache.commons.collections4.IteratorUtils.pushbackIterator(java.util.Iterator<? extends E>)
*pushbackIterator(java.util.Iterator<? extends E> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E> java.util.Iterator<E> pushbackIterator(java.util.Iterator<? extends E> p0){
	return org.apache.commons.collections4.IteratorUtils.pushbackIterator(p0);
}
/**
*{@link org.apache.commons.collections.IteratorUtils#toArray(java.util.Iterator)}
*@see org.apache.commons.collections.IteratorUtils#toArray(java.util.Iterator)
*<code>public static java.lang.Object[] org.apache.commons.collections.IteratorUtils.toArray(java.util.Iterator)
*toArray(java.util.Iterator p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.Object[] toArray(java.util.Iterator p0){
	return org.apache.commons.collections.IteratorUtils.toArray(p0);
}
/**
*{@link org.apache.commons.collections.IteratorUtils#toArray(java.util.Iterator,java.lang.Class)}
*@see org.apache.commons.collections.IteratorUtils#toArray(java.util.Iterator,java.lang.Class)
*<code>public static java.lang.Object[] org.apache.commons.collections.IteratorUtils.toArray(java.util.Iterator,java.lang.Class)
*toArray(java.util.Iterator p0,java.lang.Class p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.Object[] toArray(java.util.Iterator p0,java.lang.Class p1){
	return org.apache.commons.collections.IteratorUtils.toArray(p0,p1);
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
*{@link org.apache.commons.collections.IteratorUtils#toListIterator(java.util.Iterator)}
*@see org.apache.commons.collections.IteratorUtils#toListIterator(java.util.Iterator)
*<code>public static java.util.ListIterator org.apache.commons.collections.IteratorUtils.toListIterator(java.util.Iterator)
*toListIterator(java.util.Iterator p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.ListIterator toListIterator(java.util.Iterator p0){
	return org.apache.commons.collections.IteratorUtils.toListIterator(p0);
}
/**
*{@link com.google.common.collect.Iterators#transform(java.util.Iterator<F>,com.google.common.base.Function<? super F, ? extends T>)}
*@see com.google.common.collect.Iterators#transform(java.util.Iterator<F>,com.google.common.base.Function<? super F, ? extends T>)
*<code>public static <F,T> java.util.Iterator<T> com.google.common.collect.Iterators.transform(java.util.Iterator<F>,com.google.common.base.Function<? super F, ? extends T>)
*transform(java.util.Iterator<F> p0,com.google.common.base.Function<? super F, ? extends T> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <F,T> java.util.Iterator<T> transform(java.util.Iterator<F> p0,com.google.common.base.Function<? super F, ? extends T> p1){
	return com.google.common.collect.Iterators.transform(p0,p1);
}
/**
*{@link org.apache.commons.collections4.IteratorUtils#transformedIterator(java.util.Iterator<? extends I>,org.apache.commons.collections4.Transformer<? super I, ? extends O>)}
*@see org.apache.commons.collections4.IteratorUtils#transformedIterator(java.util.Iterator<? extends I>,org.apache.commons.collections4.Transformer<? super I, ? extends O>)
*<code>public static <I,O> java.util.Iterator<O> org.apache.commons.collections4.IteratorUtils.transformedIterator(java.util.Iterator<? extends I>,org.apache.commons.collections4.Transformer<? super I, ? extends O>)
*transformedIterator(java.util.Iterator<? extends I> p0,org.apache.commons.collections4.Transformer<? super I, ? extends O> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <I,O> java.util.Iterator<O> transformedIterator(java.util.Iterator<? extends I> p0,org.apache.commons.collections4.Transformer<? super I, ? extends O> p1){
	return org.apache.commons.collections4.IteratorUtils.transformedIterator(p0,p1);
}
/**
*{@link org.apache.commons.collections.IteratorUtils#transformedIterator(java.util.Iterator,org.apache.commons.collections.Transformer)}
*@see org.apache.commons.collections.IteratorUtils#transformedIterator(java.util.Iterator,org.apache.commons.collections.Transformer)
*<code>public static java.util.Iterator org.apache.commons.collections.IteratorUtils.transformedIterator(java.util.Iterator,org.apache.commons.collections.Transformer)
*transformedIterator(java.util.Iterator p0,org.apache.commons.collections.Transformer p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Iterator transformedIterator(java.util.Iterator p0,org.apache.commons.collections.Transformer p1){
	return org.apache.commons.collections.IteratorUtils.transformedIterator(p0,p1);
}
/**
*{@link org.apache.commons.collections4.IteratorUtils#unmodifiableIterator(java.util.Iterator<E>)}
*@see org.apache.commons.collections4.IteratorUtils#unmodifiableIterator(java.util.Iterator<E>)
*<code>public static <E> java.util.Iterator<E> org.apache.commons.collections4.IteratorUtils.unmodifiableIterator(java.util.Iterator<E>)
*unmodifiableIterator(java.util.Iterator<E> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E> java.util.Iterator<E> unmodifiableIterator(java.util.Iterator<E> p0){
	return org.apache.commons.collections4.IteratorUtils.unmodifiableIterator(p0);
}
/**
*{@link org.apache.commons.collections4.iterators.UnmodifiableIterator#unmodifiableIterator(java.util.Iterator<? extends E>)}
*@see org.apache.commons.collections4.iterators.UnmodifiableIterator#unmodifiableIterator(java.util.Iterator<? extends E>)
*<code>public static <E> java.util.Iterator<E> org.apache.commons.collections4.iterators.UnmodifiableIterator.unmodifiableIterator(java.util.Iterator<? extends E>)
*unmodifiableIterator(java.util.Iterator<? extends E> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E> java.util.Iterator<E> unmodifiableIterator(java.util.Iterator<? extends E> p0){
	return org.apache.commons.collections4.iterators.UnmodifiableIterator.unmodifiableIterator(p0);
}
/**
*{@link org.apache.commons.collections.IteratorUtils#unmodifiableIterator(java.util.Iterator)}
*@see org.apache.commons.collections.IteratorUtils#unmodifiableIterator(java.util.Iterator)
*<code>public static java.util.Iterator org.apache.commons.collections.IteratorUtils.unmodifiableIterator(java.util.Iterator)
*unmodifiableIterator(java.util.Iterator p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Iterator unmodifiableIterator(java.util.Iterator p0){
	return org.apache.commons.collections.IteratorUtils.unmodifiableIterator(p0);
}
/**
*{@link org.apache.commons.collections.primitives.adapters.ByteIteratorIterator#wrap(org.apache.commons.collections.primitives.ByteIterator)}
*@see org.apache.commons.collections.primitives.adapters.ByteIteratorIterator#wrap(org.apache.commons.collections.primitives.ByteIterator)
*<code>public static java.util.Iterator org.apache.commons.collections.primitives.adapters.ByteIteratorIterator.wrap(org.apache.commons.collections.primitives.ByteIterator)
*wrap(org.apache.commons.collections.primitives.ByteIterator p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Iterator wrap(org.apache.commons.collections.primitives.ByteIterator p0){
	return org.apache.commons.collections.primitives.adapters.ByteIteratorIterator.wrap(p0);
}
/**
*{@link org.apache.commons.collections.primitives.adapters.CharIteratorIterator#wrap(org.apache.commons.collections.primitives.CharIterator)}
*@see org.apache.commons.collections.primitives.adapters.CharIteratorIterator#wrap(org.apache.commons.collections.primitives.CharIterator)
*<code>public static java.util.Iterator org.apache.commons.collections.primitives.adapters.CharIteratorIterator.wrap(org.apache.commons.collections.primitives.CharIterator)
*wrap(org.apache.commons.collections.primitives.CharIterator p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Iterator wrap(org.apache.commons.collections.primitives.CharIterator p0){
	return org.apache.commons.collections.primitives.adapters.CharIteratorIterator.wrap(p0);
}
/**
*{@link org.apache.commons.collections.primitives.adapters.DoubleIteratorIterator#wrap(org.apache.commons.collections.primitives.DoubleIterator)}
*@see org.apache.commons.collections.primitives.adapters.DoubleIteratorIterator#wrap(org.apache.commons.collections.primitives.DoubleIterator)
*<code>public static java.util.Iterator org.apache.commons.collections.primitives.adapters.DoubleIteratorIterator.wrap(org.apache.commons.collections.primitives.DoubleIterator)
*wrap(org.apache.commons.collections.primitives.DoubleIterator p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Iterator wrap(org.apache.commons.collections.primitives.DoubleIterator p0){
	return org.apache.commons.collections.primitives.adapters.DoubleIteratorIterator.wrap(p0);
}
/**
*{@link org.apache.commons.collections.primitives.adapters.FloatIteratorIterator#wrap(org.apache.commons.collections.primitives.FloatIterator)}
*@see org.apache.commons.collections.primitives.adapters.FloatIteratorIterator#wrap(org.apache.commons.collections.primitives.FloatIterator)
*<code>public static java.util.Iterator org.apache.commons.collections.primitives.adapters.FloatIteratorIterator.wrap(org.apache.commons.collections.primitives.FloatIterator)
*wrap(org.apache.commons.collections.primitives.FloatIterator p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Iterator wrap(org.apache.commons.collections.primitives.FloatIterator p0){
	return org.apache.commons.collections.primitives.adapters.FloatIteratorIterator.wrap(p0);
}
/**
*{@link org.apache.commons.collections.primitives.adapters.IntIteratorIterator#wrap(org.apache.commons.collections.primitives.IntIterator)}
*@see org.apache.commons.collections.primitives.adapters.IntIteratorIterator#wrap(org.apache.commons.collections.primitives.IntIterator)
*<code>public static java.util.Iterator org.apache.commons.collections.primitives.adapters.IntIteratorIterator.wrap(org.apache.commons.collections.primitives.IntIterator)
*wrap(org.apache.commons.collections.primitives.IntIterator p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Iterator wrap(org.apache.commons.collections.primitives.IntIterator p0){
	return org.apache.commons.collections.primitives.adapters.IntIteratorIterator.wrap(p0);
}
/**
*{@link org.apache.commons.collections.primitives.adapters.IteratorByteIterator#wrap(java.util.Iterator)}
*@see org.apache.commons.collections.primitives.adapters.IteratorByteIterator#wrap(java.util.Iterator)
*<code>public static org.apache.commons.collections.primitives.ByteIterator org.apache.commons.collections.primitives.adapters.IteratorByteIterator.wrap(java.util.Iterator)
*wrap(java.util.Iterator p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.primitives.ByteIterator wrap(java.util.Iterator p0){
	return org.apache.commons.collections.primitives.adapters.IteratorByteIterator.wrap(p0);
}
/**
*{@link org.apache.commons.collections.primitives.adapters.LongIteratorIterator#wrap(org.apache.commons.collections.primitives.LongIterator)}
*@see org.apache.commons.collections.primitives.adapters.LongIteratorIterator#wrap(org.apache.commons.collections.primitives.LongIterator)
*<code>public static java.util.Iterator org.apache.commons.collections.primitives.adapters.LongIteratorIterator.wrap(org.apache.commons.collections.primitives.LongIterator)
*wrap(org.apache.commons.collections.primitives.LongIterator p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Iterator wrap(org.apache.commons.collections.primitives.LongIterator p0){
	return org.apache.commons.collections.primitives.adapters.LongIteratorIterator.wrap(p0);
}
/**
*{@link org.apache.commons.collections.primitives.adapters.ShortIteratorIterator#wrap(org.apache.commons.collections.primitives.ShortIterator)}
*@see org.apache.commons.collections.primitives.adapters.ShortIteratorIterator#wrap(org.apache.commons.collections.primitives.ShortIterator)
*<code>public static java.util.Iterator org.apache.commons.collections.primitives.adapters.ShortIteratorIterator.wrap(org.apache.commons.collections.primitives.ShortIterator)
*wrap(org.apache.commons.collections.primitives.ShortIterator p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Iterator wrap(org.apache.commons.collections.primitives.ShortIterator p0){
	return org.apache.commons.collections.primitives.adapters.ShortIteratorIterator.wrap(p0);
}
}
