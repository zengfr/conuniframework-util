package com.github.zengfr.supercommons;
import com.google.common.collect.ImmutableSortedSet;
import com.google.common.collect.ImmutableSortedSetFauxverideShim;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class ImmutableSortedSetUtil{ 
public static <E> com.google.common.collect.ImmutableSortedSet<E> copyOf(java.util.Collection<? extends E> p0){
return ImmutableSortedSet.copyOf(p0);
}
public static <E> com.google.common.collect.ImmutableSortedSet<E> copyOf(java.util.Iterator<? extends E> p0){
return ImmutableSortedSet.copyOf(p0);
}
public static <E> com.google.common.collect.ImmutableSortedSet<E> copyOf(java.lang.Iterable<? extends E> p0){
return ImmutableSortedSet.copyOf(p0);
}
public static <E extends java.lang.Comparable<? super E> > com.google.common.collect.ImmutableSortedSet<E> copyOf(E[] p0){
return ImmutableSortedSet.copyOf(p0);
}
public static <E> com.google.common.collect.ImmutableSortedSet<E> copyOf(java.util.Comparator<? super E> p0,java.util.Iterator<? extends E> p1){
return ImmutableSortedSet.copyOf(p0,p1);
}
public static <E> com.google.common.collect.ImmutableSortedSet<E> copyOf(java.util.Comparator<? super E> p0,java.lang.Iterable<? extends E> p1){
return ImmutableSortedSet.copyOf(p0,p1);
}
public static <E> com.google.common.collect.ImmutableSortedSet<E> copyOf(java.util.Comparator<? super E> p0,java.util.Collection<? extends E> p1){
return ImmutableSortedSet.copyOf(p0,p1);
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
public static <E> com.google.common.collect.ImmutableSortedSet<E> of(){
return ImmutableSortedSet.of();
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
public static <E> com.google.common.collect.ImmutableSortedSet<E> copyOfSorted(java.util.SortedSet<E> p0){
return ImmutableSortedSet.copyOfSorted(p0);
}
}
