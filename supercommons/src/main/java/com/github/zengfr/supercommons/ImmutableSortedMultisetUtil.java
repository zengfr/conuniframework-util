package com.github.zengfr.supercommons;
import com.google.common.collect.ImmutableSortedMultiset;
import com.google.common.collect.ImmutableSortedMultisetFauxverideShim;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class ImmutableSortedMultisetUtil{ 
public static <E extends java.lang.Comparable<? super E> > com.google.common.collect.ImmutableSortedMultiset<E> copyOf(E[] p0){
return ImmutableSortedMultiset.copyOf(p0);
}
public static <E> com.google.common.collect.ImmutableSortedMultiset<E> copyOf(java.lang.Iterable<? extends E> p0){
return ImmutableSortedMultiset.copyOf(p0);
}
public static <E> com.google.common.collect.ImmutableSortedMultiset<E> copyOf(java.util.Iterator<? extends E> p0){
return ImmutableSortedMultiset.copyOf(p0);
}
public static <E> com.google.common.collect.ImmutableSortedMultiset<E> copyOf(java.util.Comparator<? super E> p0,java.util.Iterator<? extends E> p1){
return ImmutableSortedMultiset.copyOf(p0,p1);
}
public static <E> com.google.common.collect.ImmutableSortedMultiset<E> copyOf(java.util.Comparator<? super E> p0,java.lang.Iterable<? extends E> p1){
return ImmutableSortedMultiset.copyOf(p0,p1);
}
public static <E> com.google.common.collect.ImmutableSortedMultiset<E> of(){
return ImmutableSortedMultiset.of();
}
public static <E extends java.lang.Comparable<? super E> > com.google.common.collect.ImmutableSortedMultiset<E> of(E p0){
return ImmutableSortedMultiset.of(p0);
}
public static <E extends java.lang.Comparable<? super E> > com.google.common.collect.ImmutableSortedMultiset<E> of(E p0,E p1){
return ImmutableSortedMultiset.of(p0,p1);
}
public static <E extends java.lang.Comparable<? super E> > com.google.common.collect.ImmutableSortedMultiset<E> of(E p0,E p1,E p2){
return ImmutableSortedMultiset.of(p0,p1,p2);
}
public static <E extends java.lang.Comparable<? super E> > com.google.common.collect.ImmutableSortedMultiset<E> of(E p0,E p1,E p2,E p3,E p4,E p5,E... p6){
return ImmutableSortedMultiset.of(p0,p1,p2,p3,p4,p5,p6);
}
public static <E extends java.lang.Comparable<? super E> > com.google.common.collect.ImmutableSortedMultiset<E> of(E p0,E p1,E p2,E p3,E p4){
return ImmutableSortedMultiset.of(p0,p1,p2,p3,p4);
}
public static <E extends java.lang.Comparable<? super E> > com.google.common.collect.ImmutableSortedMultiset<E> of(E p0,E p1,E p2,E p3){
return ImmutableSortedMultiset.of(p0,p1,p2,p3);
}
public static <E> com.google.common.collect.ImmutableSortedMultiset<E> copyOfSorted(com.google.common.collect.SortedMultiset<E> p0){
return ImmutableSortedMultiset.copyOfSorted(p0);
}
}
