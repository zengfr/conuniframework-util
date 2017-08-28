package com.github.zengfr.supercommons;
import com.google.common.base.Functions;
import com.google.common.collect.ImmutableSortedSet;
import com.google.common.collect.ImmutableSortedSetFauxverideShim;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMultiset;
import com.google.common.collect.ImmutableSortedMultiset;
import com.google.common.collect.ImmutableSortedMultisetFauxverideShim;
import com.google.common.collect.Lists;
import com.google.common.collect.Multisets;
import com.google.common.collect.Sets;
import com.google.common.util.concurrent.Uninterruptibles;
import org.apache.commons.collections4.IteratorUtils;
import org.apache.commons.collections4.ComparatorUtils;
import org.apache.commons.collections4.IterableUtils;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class EUtil{ 
public static <E> com.google.common.base.Function<java.lang.Object, E> constant(E p0){
return Functions.constant(p0);
}
public static <E extends java.lang.Comparable<? super E> > com.google.common.collect.ImmutableSortedSet<E> of(E p0,E p1,E p2,E p3){
return ImmutableSortedSet.of(p0,p1,p2,p3);
}
public static <E extends java.lang.Comparable<? super E> > com.google.common.collect.ImmutableSortedSet<E> of(E p0,E p1,E p2,E p3,E p4,E p5,E... p6){
return ImmutableSortedSet.of(p0,p1,p2,p3,p4,p5,p6);
}
public static <E extends java.lang.Comparable<? super E> > com.google.common.collect.ImmutableSortedSet<E> of(E p0,E p1,E p2,E p3,E p4){
return ImmutableSortedSet.of(p0,p1,p2,p3,p4);
}
public static <E extends java.lang.Comparable<? super E> > com.google.common.collect.ImmutableSortedSet<E> of(E p0,E p1,E p2){
return ImmutableSortedSet.of(p0,p1,p2);
}
public static <E extends java.lang.Comparable<? super E> > com.google.common.collect.ImmutableSortedSet<E> of(E p0,E p1){
return ImmutableSortedSet.of(p0,p1);
}
public static <E extends java.lang.Comparable<? super E> > com.google.common.collect.ImmutableSortedSet<E> of(E p0){
return ImmutableSortedSet.of(p0);
}
public static <E> com.google.common.collect.ImmutableList<E> of(E p0,E p1,E p2,E p3,E p4,E p5){
return ImmutableList.of(p0,p1,p2,p3,p4,p5);
}
public static <E> com.google.common.collect.ImmutableList<E> of(E p0,E p1,E p2,E p3,E p4,E p5,E p6){
return ImmutableList.of(p0,p1,p2,p3,p4,p5,p6);
}
public static <E> com.google.common.collect.ImmutableList<E> of(E p0,E p1,E p2,E p3,E p4,E p5,E p6,E p7){
return ImmutableList.of(p0,p1,p2,p3,p4,p5,p6,p7);
}
public static <E> com.google.common.collect.ImmutableList<E> of(E p0,E p1,E p2,E p3,E p4,E p5,E p6,E p7,E p8,E p9,E p10,E p11,E... p12){
return ImmutableList.of(p0,p1,p2,p3,p4,p5,p6,p7,p8,p9,p10,p11,p12);
}
public static <E> com.google.common.collect.ImmutableList<E> of(E p0,E p1,E p2,E p3,E p4,E p5,E p6,E p7,E p8,E p9,E p10){
return ImmutableList.of(p0,p1,p2,p3,p4,p5,p6,p7,p8,p9,p10);
}
public static <E> com.google.common.collect.ImmutableList<E> of(E p0,E p1,E p2,E p3,E p4,E p5,E p6,E p7,E p8,E p9){
return ImmutableList.of(p0,p1,p2,p3,p4,p5,p6,p7,p8,p9);
}
public static <E> com.google.common.collect.ImmutableList<E> of(E p0,E p1,E p2,E p3,E p4,E p5,E p6,E p7,E p8){
return ImmutableList.of(p0,p1,p2,p3,p4,p5,p6,p7,p8);
}
public static <E> java.util.List<E> asList(E p0,E[] p1){
return Lists.asList(p0,p1);
}
public static <E> java.util.List<E> asList(E p0,E p1,E[] p2){
return Lists.asList(p0,p1,p2);
}
public static <E> com.google.common.collect.Multiset.com.google.common.collect.Multiset.Entry<E> immutableEntry(E p0,int p1){
return Multisets.immutableEntry(p0,p1);
}
public static <E extends java.lang.Enum<E> > com.google.common.collect.ImmutableSet<E> immutableEnumSet(E p0,E... p1){
return Sets.immutableEnumSet(p0,p1);
}
public static <E> void putUninterruptibly(java.util.concurrent.BlockingQueue<E> p0,E p1){
 Uninterruptibles.putUninterruptibly(p0,p1);
}
public static <E> org.apache.commons.collections4.ResettableIterator<E> singletonIterator(E p0){
return IteratorUtils.singletonIterator(p0);
}
public static <E> java.util.ListIterator<E> singletonListIterator(E p0){
return IteratorUtils.singletonListIterator(p0);
}
public static <E> java.util.Iterator<E> objectGraphIterator(E p0,org.apache.commons.collections4.Transformer<? super E, ? extends E> p1){
return IteratorUtils.objectGraphIterator(p0,p1);
}
public static <E> E min(E p0,E p1,java.util.Comparator<E> p2){
return ComparatorUtils.min(p0,p1,p2);
}
public static <E> E max(E p0,E p1,java.util.Comparator<E> p2){
return ComparatorUtils.max(p0,p1,p2);
}
public static <E> boolean contains(java.lang.Iterable<? extends E> p0,E p1,org.apache.commons.collections4.Equator<? super E> p2){
return IterableUtils.contains(p0,p1,p2);
}
}
