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
public final class EArrayUtil{ 
/**
*{@link org.apache.commons.collections4.IteratorUtils#arrayIterator(E[],int)}
*@see org.apache.commons.collections4.IteratorUtils#arrayIterator(E[],int)
*<code>public static <E> org.apache.commons.collections4.ResettableIterator<E> org.apache.commons.collections4.IteratorUtils.arrayIterator(E[],int)
*arrayIterator(E[] p0,int p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E> org.apache.commons.collections4.ResettableIterator<E> arrayIterator(E[] p0,int p1){
	return org.apache.commons.collections4.IteratorUtils.arrayIterator(p0,p1);
}
/**
*{@link org.apache.commons.collections4.IteratorUtils#arrayIterator(E[],int,int)}
*@see org.apache.commons.collections4.IteratorUtils#arrayIterator(E[],int,int)
*<code>public static <E> org.apache.commons.collections4.ResettableIterator<E> org.apache.commons.collections4.IteratorUtils.arrayIterator(E[],int,int)
*arrayIterator(E[] p0,int p1,int p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E> org.apache.commons.collections4.ResettableIterator<E> arrayIterator(E[] p0,int p1,int p2){
	return org.apache.commons.collections4.IteratorUtils.arrayIterator(p0,p1,p2);
}
/**
*{@link org.apache.commons.collections4.IteratorUtils#arrayIterator(E...)}
*@see org.apache.commons.collections4.IteratorUtils#arrayIterator(E...)
*<code>public static <E> org.apache.commons.collections4.ResettableIterator<E> org.apache.commons.collections4.IteratorUtils.arrayIterator(E...)
*arrayIterator(E... p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E> org.apache.commons.collections4.ResettableIterator<E> arrayIterator(E... p0){
	return org.apache.commons.collections4.IteratorUtils.arrayIterator(p0);
}
/**
*{@link org.apache.commons.collections4.IteratorUtils#arrayListIterator(E...)}
*@see org.apache.commons.collections4.IteratorUtils#arrayListIterator(E...)
*<code>public static <E> org.apache.commons.collections4.ResettableListIterator<E> org.apache.commons.collections4.IteratorUtils.arrayListIterator(E...)
*arrayListIterator(E... p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E> org.apache.commons.collections4.ResettableListIterator<E> arrayListIterator(E... p0){
	return org.apache.commons.collections4.IteratorUtils.arrayListIterator(p0);
}
/**
*{@link org.apache.commons.collections4.IteratorUtils#arrayListIterator(E[],int)}
*@see org.apache.commons.collections4.IteratorUtils#arrayListIterator(E[],int)
*<code>public static <E> org.apache.commons.collections4.ResettableListIterator<E> org.apache.commons.collections4.IteratorUtils.arrayListIterator(E[],int)
*arrayListIterator(E[] p0,int p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E> org.apache.commons.collections4.ResettableListIterator<E> arrayListIterator(E[] p0,int p1){
	return org.apache.commons.collections4.IteratorUtils.arrayListIterator(p0,p1);
}
/**
*{@link org.apache.commons.collections4.IteratorUtils#arrayListIterator(E[],int,int)}
*@see org.apache.commons.collections4.IteratorUtils#arrayListIterator(E[],int,int)
*<code>public static <E> org.apache.commons.collections4.ResettableListIterator<E> org.apache.commons.collections4.IteratorUtils.arrayListIterator(E[],int,int)
*arrayListIterator(E[] p0,int p1,int p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E> org.apache.commons.collections4.ResettableListIterator<E> arrayListIterator(E[] p0,int p1,int p2){
	return org.apache.commons.collections4.IteratorUtils.arrayListIterator(p0,p1,p2);
}
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
*{@link com.google.common.collect.ImmutableSortedSet#copyOf(E...)}
*@see com.google.common.collect.ImmutableSortedSet#copyOf(E...)
*<code>public static <E> com.google.common.collect.ImmutableSortedSet<E> com.google.common.collect.ImmutableSortedSet.copyOf(E[])
*copyOf(E... p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E extends java.lang.Comparable<? super E> > com.google.common.collect.ImmutableSortedSet<E> copyOf(E... p0){
	return com.google.common.collect.ImmutableSortedSet.copyOf(p0);
}
/**
*{@link com.google.common.collect.FluentIterable#from(E...)}
*@see com.google.common.collect.FluentIterable#from(E...)
*<code>public static <E> com.google.common.collect.FluentIterable<E> com.google.common.collect.FluentIterable.from(E[])
*from(E... p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E> com.google.common.collect.FluentIterable<E> from(E... p0){
	return com.google.common.collect.FluentIterable.from(p0);
}
/**
*{@link org.apache.commons.lang3.EnumUtils#generateBitVector(java.lang.Class<E>,E...)}
*@see org.apache.commons.lang3.EnumUtils#generateBitVector(java.lang.Class<E>,E...)
*<code>public static <E> long org.apache.commons.lang3.EnumUtils.generateBitVector(java.lang.Class<E>,E...)
*generateBitVector(java.lang.Class<E> p0,E... p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E extends java.lang.Enum<E> > long generateBitVector(java.lang.Class<E> p0,E... p1){
	return org.apache.commons.lang3.EnumUtils.generateBitVector(p0,p1);
}
/**
*{@link org.apache.commons.lang3.EnumUtils#generateBitVectors(java.lang.Class<E>,E...)}
*@see org.apache.commons.lang3.EnumUtils#generateBitVectors(java.lang.Class<E>,E...)
*<code>public static <E> long[] org.apache.commons.lang3.EnumUtils.generateBitVectors(java.lang.Class<E>,E...)
*generateBitVectors(java.lang.Class<E> p0,E... p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E extends java.lang.Enum<E> > long[] generateBitVectors(java.lang.Class<E> p0,E... p1){
	return org.apache.commons.lang3.EnumUtils.generateBitVectors(p0,p1);
}
/**
*{@link org.apache.commons.collections4.SetUtils#hashSet(E...)}
*@see org.apache.commons.collections4.SetUtils#hashSet(E...)
*<code>public static <E> java.util.HashSet<E> org.apache.commons.collections4.SetUtils.hashSet(E...)
*hashSet(E... p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E> java.util.HashSet<E> hashSet(E... p0){
	return org.apache.commons.collections4.SetUtils.hashSet(p0);
}
/**
*{@link com.google.common.collect.Sets#immutableEnumSet(E,E...)}
*@see com.google.common.collect.Sets#immutableEnumSet(E,E...)
*<code>public static <E> com.google.common.collect.ImmutableSet<E> com.google.common.collect.Sets.immutableEnumSet(E,E...)
*immutableEnumSet(E p0,E... p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E extends java.lang.Enum<E> > com.google.common.collect.ImmutableSet<E> immutableEnumSet(E p0,E... p1){
	return com.google.common.collect.Sets.immutableEnumSet(p0,p1);
}
/**
*{@link com.google.common.collect.Lists#newArrayList(E...)}
*@see com.google.common.collect.Lists#newArrayList(E...)
*<code>public static <E> java.util.ArrayList<E> com.google.common.collect.Lists.newArrayList(E...)
*newArrayList(E... p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E> java.util.ArrayList<E> newArrayList(E... p0){
	return com.google.common.collect.Lists.newArrayList(p0);
}
/**
*{@link com.google.common.collect.Sets#newHashSet(E...)}
*@see com.google.common.collect.Sets#newHashSet(E...)
*<code>public static <E> java.util.HashSet<E> com.google.common.collect.Sets.newHashSet(E...)
*newHashSet(E... p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E> java.util.HashSet<E> newHashSet(E... p0){
	return com.google.common.collect.Sets.newHashSet(p0);
}
/**
*{@link com.google.common.util.concurrent.Atomics#newReferenceArray(E...)}
*@see com.google.common.util.concurrent.Atomics#newReferenceArray(E...)
*<code>public static <E> java.util.concurrent.atomic.AtomicReferenceArray<E> com.google.common.util.concurrent.Atomics.newReferenceArray(E[])
*newReferenceArray(E... p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E> java.util.concurrent.atomic.AtomicReferenceArray<E> newReferenceArray(E... p0){
	return com.google.common.util.concurrent.Atomics.newReferenceArray(p0);
}
/**
*{@link com.google.common.collect.ImmutableSortedSet#of(E,E,E,E,E,E,E...)}
*@see com.google.common.collect.ImmutableSortedSet#of(E,E,E,E,E,E,E...)
*<code>public static <E> com.google.common.collect.ImmutableSortedSet<E> com.google.common.collect.ImmutableSortedSet.of(E,E,E,E,E,E,E...)
*of(E p0,E p1,E p2,E p3,E p4,E p5,E... p6)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E extends java.lang.Comparable<? super E> > com.google.common.collect.ImmutableSortedSet<E> of(E p0,E p1,E p2,E p3,E p4,E p5,E... p6){
	return com.google.common.collect.ImmutableSortedSet.of(p0,p1,p2,p3,p4,p5,p6);
}
/**
*{@link com.google.common.collect.FluentIterable#of(E,E...)}
*@see com.google.common.collect.FluentIterable#of(E,E...)
*<code>public static <E> com.google.common.collect.FluentIterable<E> com.google.common.collect.FluentIterable.of(E,E...)
*of(E p0,E... p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E> com.google.common.collect.FluentIterable<E> of(E p0,E... p1){
	return com.google.common.collect.FluentIterable.of(p0,p1);
}
/**
*{@link com.google.common.collect.ImmutableList#of(E,E,E,E,E,E,E,E,E,E,E,E,E...)}
*@see com.google.common.collect.ImmutableList#of(E,E,E,E,E,E,E,E,E,E,E,E,E...)
*<code>public static <E> com.google.common.collect.ImmutableList<E> com.google.common.collect.ImmutableList.of(E,E,E,E,E,E,E,E,E,E,E,E,E...)
*of(E p0,E p1,E p2,E p3,E p4,E p5,E p6,E p7,E p8,E p9,E p10,E p11,E... p12)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E> com.google.common.collect.ImmutableList<E> of(E p0,E p1,E p2,E p3,E p4,E p5,E p6,E p7,E p8,E p9,E p10,E p11,E... p12){
	return com.google.common.collect.ImmutableList.of(p0,p1,p2,p3,p4,p5,p6,p7,p8,p9,p10,p11,p12);
}
/**
*{@link org.apache.commons.collections4.SetUtils#unmodifiableSet(E...)}
*@see org.apache.commons.collections4.SetUtils#unmodifiableSet(E...)
*<code>public static <E> java.util.Set<E> org.apache.commons.collections4.SetUtils.unmodifiableSet(E...)
*unmodifiableSet(E... p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E> java.util.Set<E> unmodifiableSet(E... p0){
	return org.apache.commons.collections4.SetUtils.unmodifiableSet(p0);
}
}
