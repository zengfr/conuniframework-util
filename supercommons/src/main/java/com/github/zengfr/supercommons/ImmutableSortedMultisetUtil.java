package com.github.zengfr.supercommons;
import java.util.*;
import java.util.Map.Entry;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class ImmutableSortedMultisetUtil{ 
/**
*public static <E> com.google.common.collect.ImmutableSortedMultiset<E> com.google.common.collect.ImmutableSortedMultiset.copyOf(E[])
*/ 
public static <E extends java.lang.Comparable<? super E> > com.google.common.collect.ImmutableSortedMultiset<E> copyOf(E... p0){
	return com.google.common.collect.ImmutableSortedMultiset.copyOf(p0);
}
/**
*public static <E> com.google.common.collect.ImmutableSortedMultiset<E> com.google.common.collect.ImmutableSortedMultiset.copyOf(java.lang.Iterable<? extends E>)
*/ 
public static <E> com.google.common.collect.ImmutableSortedMultiset<E> copyOf(java.lang.Iterable<? extends E> p0){
	return com.google.common.collect.ImmutableSortedMultiset.copyOf(p0);
}
/**
*public static <E> com.google.common.collect.ImmutableSortedMultiset<E> com.google.common.collect.ImmutableSortedMultiset.copyOf(java.util.Iterator<? extends E>)
*/ 
public static <E> com.google.common.collect.ImmutableSortedMultiset<E> copyOf(java.util.Iterator<? extends E> p0){
	return com.google.common.collect.ImmutableSortedMultiset.copyOf(p0);
}
/**
*public static <E> com.google.common.collect.ImmutableSortedMultiset<E> com.google.common.collect.ImmutableSortedMultiset.copyOf(java.util.Comparator<? super E>,java.util.Iterator<? extends E>)
*/ 
public static <E> com.google.common.collect.ImmutableSortedMultiset<E> copyOf(java.util.Comparator<? super E> p0,java.util.Iterator<? extends E> p1){
	return com.google.common.collect.ImmutableSortedMultiset.copyOf(p0,p1);
}
/**
*public static <E> com.google.common.collect.ImmutableSortedMultiset<E> com.google.common.collect.ImmutableSortedMultiset.copyOf(java.util.Comparator<? super E>,java.lang.Iterable<? extends E>)
*/ 
public static <E> com.google.common.collect.ImmutableSortedMultiset<E> copyOf(java.util.Comparator<? super E> p0,java.lang.Iterable<? extends E> p1){
	return com.google.common.collect.ImmutableSortedMultiset.copyOf(p0,p1);
}
/**
*public static <E> com.google.common.collect.ImmutableSortedMultiset<E> com.google.common.collect.ImmutableSortedMultiset.copyOfSorted(com.google.common.collect.SortedMultiset<E>)
*/ 
public static <E> com.google.common.collect.ImmutableSortedMultiset<E> copyOfSorted(com.google.common.collect.SortedMultiset<E> p0){
	return com.google.common.collect.ImmutableSortedMultiset.copyOfSorted(p0);
}
/**
*public static <E> com.google.common.collect.ImmutableSortedMultiset<E> com.google.common.collect.ImmutableSortedMultiset.of()
*/ 
public static <E> com.google.common.collect.ImmutableSortedMultiset<E> of(){
	return com.google.common.collect.ImmutableSortedMultiset.of();
}
/**
*public static <E> com.google.common.collect.ImmutableSortedMultiset<E> com.google.common.collect.ImmutableSortedMultiset.of(E)
*/ 
public static <E extends java.lang.Comparable<? super E> > com.google.common.collect.ImmutableSortedMultiset<E> of(E p0){
	return com.google.common.collect.ImmutableSortedMultiset.of(p0);
}
/**
*public static <E> com.google.common.collect.ImmutableSortedMultiset<E> com.google.common.collect.ImmutableSortedMultiset.of(E,E)
*/ 
public static <E extends java.lang.Comparable<? super E> > com.google.common.collect.ImmutableSortedMultiset<E> of(E p0,E p1){
	return com.google.common.collect.ImmutableSortedMultiset.of(p0,p1);
}
/**
*public static <E> com.google.common.collect.ImmutableSortedMultiset<E> com.google.common.collect.ImmutableSortedMultiset.of(E,E,E)
*/ 
public static <E extends java.lang.Comparable<? super E> > com.google.common.collect.ImmutableSortedMultiset<E> of(E p0,E p1,E p2){
	return com.google.common.collect.ImmutableSortedMultiset.of(p0,p1,p2);
}
/**
*public static <E> com.google.common.collect.ImmutableSortedMultiset<E> com.google.common.collect.ImmutableSortedMultiset.of(E,E,E,E,E,E,E...)
*/ 
public static <E extends java.lang.Comparable<? super E> > com.google.common.collect.ImmutableSortedMultiset<E> of(E p0,E p1,E p2,E p3,E p4,E p5,E... p6){
	return com.google.common.collect.ImmutableSortedMultiset.of(p0,p1,p2,p3,p4,p5,p6);
}
/**
*public static <E> com.google.common.collect.ImmutableSortedMultiset<E> com.google.common.collect.ImmutableSortedMultiset.of(E,E,E,E,E)
*/ 
public static <E extends java.lang.Comparable<? super E> > com.google.common.collect.ImmutableSortedMultiset<E> of(E p0,E p1,E p2,E p3,E p4){
	return com.google.common.collect.ImmutableSortedMultiset.of(p0,p1,p2,p3,p4);
}
/**
*public static <E> com.google.common.collect.ImmutableSortedMultiset<E> com.google.common.collect.ImmutableSortedMultiset.of(E,E,E,E)
*/ 
public static <E extends java.lang.Comparable<? super E> > com.google.common.collect.ImmutableSortedMultiset<E> of(E p0,E p1,E p2,E p3){
	return com.google.common.collect.ImmutableSortedMultiset.of(p0,p1,p2,p3);
}
}
