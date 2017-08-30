package com.github.zengfr.supercommons;
import java.util.*;
import java.util.Map.Entry;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class EArrayUtil{ 
/**
*public static <E> org.apache.commons.collections4.ResettableIterator<E> org.apache.commons.collections4.IteratorUtils.arrayIterator(E[],int)
*/ 
public static <E> org.apache.commons.collections4.ResettableIterator<E> arrayIterator(E[] p0,int p1){
	return org.apache.commons.collections4.IteratorUtils.arrayIterator(p0,p1);
}
/**
*public static <E> org.apache.commons.collections4.ResettableIterator<E> org.apache.commons.collections4.IteratorUtils.arrayIterator(E[],int,int)
*/ 
public static <E> org.apache.commons.collections4.ResettableIterator<E> arrayIterator(E[] p0,int p1,int p2){
	return org.apache.commons.collections4.IteratorUtils.arrayIterator(p0,p1,p2);
}
/**
*public static <E> org.apache.commons.collections4.ResettableIterator<E> org.apache.commons.collections4.IteratorUtils.arrayIterator(E...)
*/ 
public static <E> org.apache.commons.collections4.ResettableIterator<E> arrayIterator(E... p0){
	return org.apache.commons.collections4.IteratorUtils.arrayIterator(p0);
}
/**
*public static <E> org.apache.commons.collections4.ResettableListIterator<E> org.apache.commons.collections4.IteratorUtils.arrayListIterator(E[],int,int)
*/ 
public static <E> org.apache.commons.collections4.ResettableListIterator<E> arrayListIterator(E[] p0,int p1,int p2){
	return org.apache.commons.collections4.IteratorUtils.arrayListIterator(p0,p1,p2);
}
/**
*public static <E> org.apache.commons.collections4.ResettableListIterator<E> org.apache.commons.collections4.IteratorUtils.arrayListIterator(E[],int)
*/ 
public static <E> org.apache.commons.collections4.ResettableListIterator<E> arrayListIterator(E[] p0,int p1){
	return org.apache.commons.collections4.IteratorUtils.arrayListIterator(p0,p1);
}
/**
*public static <E> org.apache.commons.collections4.ResettableListIterator<E> org.apache.commons.collections4.IteratorUtils.arrayListIterator(E...)
*/ 
public static <E> org.apache.commons.collections4.ResettableListIterator<E> arrayListIterator(E... p0){
	return org.apache.commons.collections4.IteratorUtils.arrayListIterator(p0);
}
/**
*public static <E> java.util.List<E> com.google.common.collect.Lists.asList(E,E[])
*/ 
public static <E> java.util.List<E> asList(E p0,E... p1){
	return com.google.common.collect.Lists.asList(p0,p1);
}
/**
*public static <E> java.util.List<E> com.google.common.collect.Lists.asList(E,E,E[])
*/ 
public static <E> java.util.List<E> asList(E p0,E p1,E... p2){
	return com.google.common.collect.Lists.asList(p0,p1,p2);
}
/**
*public static <E> com.google.common.collect.ImmutableSortedSet<E> com.google.common.collect.ImmutableSortedSet.copyOf(E[])
*/ 
public static <E extends java.lang.Comparable<? super E> > com.google.common.collect.ImmutableSortedSet<E> copyOf(E... p0){
	return com.google.common.collect.ImmutableSortedSet.copyOf(p0);
}
/**
*public static <E> long org.apache.commons.lang3.EnumUtils.generateBitVector(java.lang.Class<E>,E...)
*/ 
public static <E extends java.lang.Enum<E> > long generateBitVector(java.lang.Class<E> p0,E... p1){
	return org.apache.commons.lang3.EnumUtils.generateBitVector(p0,p1);
}
/**
*public static <E> long[] org.apache.commons.lang3.EnumUtils.generateBitVectors(java.lang.Class<E>,E...)
*/ 
public static <E extends java.lang.Enum<E> > long[] generateBitVectors(java.lang.Class<E> p0,E... p1){
	return org.apache.commons.lang3.EnumUtils.generateBitVectors(p0,p1);
}
/**
*public static <E> com.google.common.collect.ImmutableSet<E> com.google.common.collect.Sets.immutableEnumSet(E,E...)
*/ 
public static <E extends java.lang.Enum<E> > com.google.common.collect.ImmutableSet<E> immutableEnumSet(E p0,E... p1){
	return com.google.common.collect.Sets.immutableEnumSet(p0,p1);
}
/**
*public static <E> java.util.ArrayList<E> com.google.common.collect.Lists.newArrayList(E...)
*/ 
public static <E> java.util.ArrayList<E> newArrayList(E... p0){
	return com.google.common.collect.Lists.newArrayList(p0);
}
/**
*public static <E> java.util.HashSet<E> com.google.common.collect.Sets.newHashSet(E...)
*/ 
public static <E> java.util.HashSet<E> newHashSet(E... p0){
	return com.google.common.collect.Sets.newHashSet(p0);
}
/**
*public static <E> java.util.concurrent.atomic.AtomicReferenceArray<E> com.google.common.util.concurrent.Atomics.newReferenceArray(E[])
*/ 
public static <E> java.util.concurrent.atomic.AtomicReferenceArray<E> newReferenceArray(E... p0){
	return com.google.common.util.concurrent.Atomics.newReferenceArray(p0);
}
/**
*public static <E> com.google.common.collect.ImmutableSortedSet<E> com.google.common.collect.ImmutableSortedSet.of(E,E,E,E,E,E,E...)
*/ 
public static <E extends java.lang.Comparable<? super E> > com.google.common.collect.ImmutableSortedSet<E> of(E p0,E p1,E p2,E p3,E p4,E p5,E... p6){
	return com.google.common.collect.ImmutableSortedSet.of(p0,p1,p2,p3,p4,p5,p6);
}
/**
*public static <E> com.google.common.collect.FluentIterable<E> com.google.common.collect.FluentIterable.of(E[])
*/ 
public static <E> com.google.common.collect.FluentIterable<E> of(E... p0){
	return com.google.common.collect.FluentIterable.of(p0);
}
/**
*public static <E> com.google.common.collect.ImmutableList<E> com.google.common.collect.ImmutableList.of(E,E,E,E,E,E,E,E,E,E,E,E,E...)
*/ 
public static <E> com.google.common.collect.ImmutableList<E> of(E p0,E p1,E p2,E p3,E p4,E p5,E p6,E p7,E p8,E p9,E p10,E p11,E... p12){
	return com.google.common.collect.ImmutableList.of(p0,p1,p2,p3,p4,p5,p6,p7,p8,p9,p10,p11,p12);
}
}
