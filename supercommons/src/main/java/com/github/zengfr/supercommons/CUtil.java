package com.github.zengfr.supercommons;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class CUtil{ 
/**
*public static <R,C,V> com.google.common.collect.ImmutableTable<R, C, V> com.google.common.collect.ImmutableTable.of(R,C,V)
*/ 
public static <R,C,V> com.google.common.collect.ImmutableTable<R, C, V> of(R p0,C p1,V p2){
	return com.google.common.collect.ImmutableTable.of(p0,p1,p2);
}
/**
*public static <C> com.google.common.collect.Range<C> com.google.common.collect.Range.singleton(C)
*/ 
public static <C extends java.lang.Comparable<?> > com.google.common.collect.Range<C> singleton(C p0){
	return com.google.common.collect.Range.singleton(p0);
}
/**
*public static <C> com.google.common.collect.Range<C> com.google.common.collect.Range.range(C,com.google.common.collect.BoundType,C,com.google.common.collect.BoundType)
*/ 
public static <C extends java.lang.Comparable<?> > com.google.common.collect.Range<C> range(C p0,com.google.common.collect.BoundType p1,C p2,com.google.common.collect.BoundType p3){
	return com.google.common.collect.Range.range(p0,p1,p2,p3);
}
/**
*public static <C> com.google.common.collect.Range<C> com.google.common.collect.Range.closed(C,C)
*/ 
public static <C extends java.lang.Comparable<?> > com.google.common.collect.Range<C> closed(C p0,C p1){
	return com.google.common.collect.Range.closed(p0,p1);
}
/**
*public static <C> com.google.common.collect.Range<C> com.google.common.collect.Range.open(C,C)
*/ 
public static <C extends java.lang.Comparable<?> > com.google.common.collect.Range<C> open(C p0,C p1){
	return com.google.common.collect.Range.open(p0,p1);
}
/**
*public static <C> com.google.common.collect.Range<C> com.google.common.collect.Range.atLeast(C)
*/ 
public static <C extends java.lang.Comparable<?> > com.google.common.collect.Range<C> atLeast(C p0){
	return com.google.common.collect.Range.atLeast(p0);
}
/**
*public static <C> com.google.common.collect.Range<C> com.google.common.collect.Range.atMost(C)
*/ 
public static <C extends java.lang.Comparable<?> > com.google.common.collect.Range<C> atMost(C p0){
	return com.google.common.collect.Range.atMost(p0);
}
/**
*public static <C> com.google.common.collect.Range<C> com.google.common.collect.Range.upTo(C,com.google.common.collect.BoundType)
*/ 
public static <C extends java.lang.Comparable<?> > com.google.common.collect.Range<C> upTo(C p0,com.google.common.collect.BoundType p1){
	return com.google.common.collect.Range.upTo(p0,p1);
}
/**
*public static <C> com.google.common.collect.Range<C> com.google.common.collect.Range.greaterThan(C)
*/ 
public static <C extends java.lang.Comparable<?> > com.google.common.collect.Range<C> greaterThan(C p0){
	return com.google.common.collect.Range.greaterThan(p0);
}
/**
*public static <C> com.google.common.collect.Range<C> com.google.common.collect.Range.lessThan(C)
*/ 
public static <C extends java.lang.Comparable<?> > com.google.common.collect.Range<C> lessThan(C p0){
	return com.google.common.collect.Range.lessThan(p0);
}
/**
*public static <C> com.google.common.collect.Range<C> com.google.common.collect.Range.downTo(C,com.google.common.collect.BoundType)
*/ 
public static <C extends java.lang.Comparable<?> > com.google.common.collect.Range<C> downTo(C p0,com.google.common.collect.BoundType p1){
	return com.google.common.collect.Range.downTo(p0,p1);
}
/**
*public static <C> com.google.common.collect.Range<C> com.google.common.collect.Range.openClosed(C,C)
*/ 
public static <C extends java.lang.Comparable<?> > com.google.common.collect.Range<C> openClosed(C p0,C p1){
	return com.google.common.collect.Range.openClosed(p0,p1);
}
/**
*public static <C> com.google.common.collect.Range<C> com.google.common.collect.Range.closedOpen(C,C)
*/ 
public static <C extends java.lang.Comparable<?> > com.google.common.collect.Range<C> closedOpen(C p0,C p1){
	return com.google.common.collect.Range.closedOpen(p0,p1);
}
/**
*public static <R,C,V> com.google.common.collect.Table.com.google.common.collect.Table$Cell<R, C, V> com.google.common.collect.Tables.immutableCell(R,C,V)
*/ 
public static <R,C,V> Cell<R, C, V> immutableCell(R p0,C p1,V p2){
	return com.google.common.collect.Tables.immutableCell(p0,p1,p2);
}
/**
*public static <T,C> T org.apache.commons.collections4.CollectionUtils.forAllButLastDo(java.lang.Iterable<T>,C)
*/ 
public static <T,C extends org.apache.commons.collections4.Closure<? super T> > T forAllButLastDo(java.lang.Iterable<T> p0,C p1){
	return org.apache.commons.collections4.CollectionUtils.forAllButLastDo(p0,p1);
}
/**
*public static <T,C> T org.apache.commons.collections4.CollectionUtils.forAllButLastDo(java.util.Iterator<T>,C)
*/ 
public static <T,C extends org.apache.commons.collections4.Closure<? super T> > T forAllButLastDo(java.util.Iterator<T> p0,C p1){
	return org.apache.commons.collections4.CollectionUtils.forAllButLastDo(p0,p1);
}
/**
*public static <T,C> C org.apache.commons.collections4.CollectionUtils.forAllDo(java.lang.Iterable<T>,C)
*/ 
public static <T,C extends org.apache.commons.collections4.Closure<? super T> > C forAllDo(java.lang.Iterable<T> p0,C p1){
	return org.apache.commons.collections4.CollectionUtils.forAllDo(p0,p1);
}
/**
*public static <T,C> C org.apache.commons.collections4.CollectionUtils.forAllDo(java.util.Iterator<T>,C)
*/ 
public static <T,C extends org.apache.commons.collections4.Closure<? super T> > C forAllDo(java.util.Iterator<T> p0,C p1){
	return org.apache.commons.collections4.CollectionUtils.forAllDo(p0,p1);
}
/**
*public static <T,C,E> C com.facebook.collectionsbase.Piles.filter(java.util.Collection<T>,C,com.facebook.collectionsbase.Filter<T, E>) throws E
*/ 
public static <T,C extends java.util.Collection<T> ,E extends java.lang.Throwable > C filter(java.util.Collection<T> p0,C p1,com.facebook.collectionsbase.Filter<T, E> p2) throws E{
	return com.facebook.collectionsbase.Piles.filter(p0,p1,p2);
}
}
