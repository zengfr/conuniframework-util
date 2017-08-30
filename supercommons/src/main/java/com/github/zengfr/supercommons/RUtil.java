package com.github.zengfr.supercommons;

import com.google.common.collect.Table.Cell;

/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class RUtil{
/**
*public static <R,C,V> com.google.common.collect.ImmutableTable<R, C, V> com.google.common.collect.ImmutableTable.of(R,C,V)
*/
/*public static <R,C,V> com.google.common.collect.ImmutableTable<R, C, V> of(R p0,C p1,V p2){
	return com.google.common.collect.ImmutableTable.of(p0,p1,p2);
}*/
/**
*public static <R,C,V> com.google.common.collect.Table.com.google.common.collect.Table$Cell<R, C, V> com.google.common.collect.Tables.immutableCell(R,C,V)
*/
public static <R,C,V> Cell<R, C, V> immutableCell(R p0,C p1,V p2){
	return com.google.common.collect.Tables.immutableCell(p0,p1,p2);
}
/**
*public static <I,O,R> R org.apache.commons.collections4.CollectionUtils.collect(java.lang.Iterable<? extends I>,org.apache.commons.collections4.Transformer<? super I, ? extends O>,R)
*/
public static <I,O,R extends java.util.Collection<? super O> > R collect(java.lang.Iterable<? extends I> p0,org.apache.commons.collections4.Transformer<? super I, ? extends O> p1,R p2){
	return org.apache.commons.collections4.CollectionUtils.collect(p0,p1,p2);
}
/**
*public static <I,O,R> R org.apache.commons.collections4.CollectionUtils.collect(java.util.Iterator<? extends I>,org.apache.commons.collections4.Transformer<? super I, ? extends O>,R)
*/
public static <I,O,R extends java.util.Collection<? super O> > R collect(java.util.Iterator<? extends I> p0,org.apache.commons.collections4.Transformer<? super I, ? extends O> p1,R p2){
	return org.apache.commons.collections4.CollectionUtils.collect(p0,p1,p2);
}
/**
*public static <O,R> R org.apache.commons.collections4.CollectionUtils.select(java.lang.Iterable<? extends O>,org.apache.commons.collections4.Predicate<? super O>,R)
*/
public static <O,R extends java.util.Collection<? super O> > R select(java.lang.Iterable<? extends O> p0,org.apache.commons.collections4.Predicate<? super O> p1,R p2){
	return org.apache.commons.collections4.CollectionUtils.select(p0,p1,p2);
}
/**
*public static <O,R> R org.apache.commons.collections4.CollectionUtils.select(java.lang.Iterable<? extends O>,org.apache.commons.collections4.Predicate<? super O>,R,R)
*/
public static <O,R extends java.util.Collection<? super O> > R select(java.lang.Iterable<? extends O> p0,org.apache.commons.collections4.Predicate<? super O> p1,R p2,R p3){
	return org.apache.commons.collections4.CollectionUtils.select(p0,p1,p2,p3);
}
/**
*public static <O,R> R org.apache.commons.collections4.CollectionUtils.selectRejected(java.lang.Iterable<? extends O>,org.apache.commons.collections4.Predicate<? super O>,R)
*/
public static <O,R extends java.util.Collection<? super O> > R selectRejected(java.lang.Iterable<? extends O> p0,org.apache.commons.collections4.Predicate<? super O> p1,R p2){
	return org.apache.commons.collections4.CollectionUtils.selectRejected(p0,p1,p2);
}
/**
*public static <L,R> org.apache.commons.lang3.tuple.Pair<L, R> org.apache.commons.lang3.tuple.Pair.of(L,R)
*/
public static <L,R> org.apache.commons.lang3.tuple.Pair<L, R> of(L p0,R p1){
	return org.apache.commons.lang3.tuple.Pair.of(p0,p1);
}
/**
*public static <L,M,R> org.apache.commons.lang3.tuple.ImmutableTriple<L, M, R> org.apache.commons.lang3.tuple.ImmutableTriple.of(L,M,R)
*/
public static <L,M,R> org.apache.commons.lang3.tuple.ImmutableTriple<L, M, R> of(L p0,M p1,R p2){
	return org.apache.commons.lang3.tuple.ImmutableTriple.of(p0,p1,p2);
}
}
