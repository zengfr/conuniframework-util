package com.zengfr.supercommons;
import com.google.common.collect.ImmutableSortedSet;
import com.google.common.collect.ImmutableSortedSetFauxverideShim;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMultiset;
import com.google.common.collect.ImmutableSortedMultiset;
import com.google.common.collect.ImmutableSortedMultisetFauxverideShim;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.google.common.util.concurrent.Atomics;
import org.apache.commons.collections4.IteratorUtils;
import org.apache.commons.lang3.EnumUtils;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class EArrayUtil{ 
public static <E extends java.lang.Comparable<? super E> > com.google.common.collect.ImmutableSortedSet<E> copyOf(E[] p0){
return ImmutableSortedSet.copyOf(p0);
}
public static <E extends java.lang.Comparable<? super E> > com.google.common.collect.ImmutableSortedSet<E> of(E p0,E p1,E p2,E p3,E p4,E p5,E... p6){
return ImmutableSortedSet.of(p0,p1,p2,p3,p4,p5,p6);
}
public static <E> com.google.common.collect.FluentIterable<E> of(E[] p0){
return FluentIterable.of(p0);
}
public static <E> com.google.common.collect.ImmutableList<E> of(E p0,E p1,E p2,E p3,E p4,E p5,E p6,E p7,E p8,E p9,E p10,E p11,E... p12){
return ImmutableList.of(p0,p1,p2,p3,p4,p5,p6,p7,p8,p9,p10,p11,p12);
}
public static <E> java.util.List<E> asList(E p0,E[] p1){
return Lists.asList(p0,p1);
}
public static <E> java.util.List<E> asList(E p0,E p1,E[] p2){
return Lists.asList(p0,p1,p2);
}
public static <E> java.util.ArrayList<E> newArrayList(E... p0){
return Lists.newArrayList(p0);
}
public static <E> java.util.HashSet<E> newHashSet(E... p0){
return Sets.newHashSet(p0);
}
public static <E extends java.lang.Enum<E> > com.google.common.collect.ImmutableSet<E> immutableEnumSet(E p0,E... p1){
return Sets.immutableEnumSet(p0,p1);
}
public static <E> java.util.concurrent.atomic.AtomicReferenceArray<E> newReferenceArray(E[] p0){
return Atomics.newReferenceArray(p0);
}
public static <E> org.apache.commons.collections4.ResettableListIterator<E> arrayListIterator(E[] p0,int p1,int p2){
return IteratorUtils.arrayListIterator(p0,p1,p2);
}
public static <E> org.apache.commons.collections4.ResettableListIterator<E> arrayListIterator(E[] p0,int p1){
return IteratorUtils.arrayListIterator(p0,p1);
}
public static <E> org.apache.commons.collections4.ResettableListIterator<E> arrayListIterator(E... p0){
return IteratorUtils.arrayListIterator(p0);
}
public static <E> org.apache.commons.collections4.ResettableIterator<E> arrayIterator(E[] p0,int p1){
return IteratorUtils.arrayIterator(p0,p1);
}
public static <E> org.apache.commons.collections4.ResettableIterator<E> arrayIterator(E[] p0,int p1,int p2){
return IteratorUtils.arrayIterator(p0,p1,p2);
}
public static <E> org.apache.commons.collections4.ResettableIterator<E> arrayIterator(E... p0){
return IteratorUtils.arrayIterator(p0);
}
public static <E extends java.lang.Enum<E> > long generateBitVector(java.lang.Class<E> p0,E... p1){
return EnumUtils.generateBitVector(p0,p1);
}
public static <E extends java.lang.Enum<E> > long[] generateBitVectors(java.lang.Class<E> p0,E... p1){
return EnumUtils.generateBitVectors(p0,p1);
}
}
