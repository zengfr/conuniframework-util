package com.zengfr.supercommons;
import com.google.common.collect.ImmutableTable;
import com.google.common.collect.Range;
import com.google.common.collect.Tables;
import org.apache.commons.collections4.CollectionUtils;
import com.facebook.collectionsbase.Piles;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class CUtil{ 
public static <R,C,V> com.google.common.collect.ImmutableTable<R, C, V> of(R p0,C p1,V p2){
return ImmutableTable.of(p0,p1,p2);
}
public static <C extends java.lang.Comparable<?> > com.google.common.collect.Range<C> singleton(C p0){
return Range.singleton(p0);
}
public static <C extends java.lang.Comparable<?> > com.google.common.collect.Range<C> range(C p0,com.google.common.collect.BoundType p1,C p2,com.google.common.collect.BoundType p3){
return Range.range(p0,p1,p2,p3);
}
public static <C extends java.lang.Comparable<?> > com.google.common.collect.Range<C> closed(C p0,C p1){
return Range.closed(p0,p1);
}
public static <C extends java.lang.Comparable<?> > com.google.common.collect.Range<C> open(C p0,C p1){
return Range.open(p0,p1);
}
public static <C extends java.lang.Comparable<?> > com.google.common.collect.Range<C> downTo(C p0,com.google.common.collect.BoundType p1){
return Range.downTo(p0,p1);
}
public static <C extends java.lang.Comparable<?> > com.google.common.collect.Range<C> lessThan(C p0){
return Range.lessThan(p0);
}
public static <C extends java.lang.Comparable<?> > com.google.common.collect.Range<C> closedOpen(C p0,C p1){
return Range.closedOpen(p0,p1);
}
public static <C extends java.lang.Comparable<?> > com.google.common.collect.Range<C> upTo(C p0,com.google.common.collect.BoundType p1){
return Range.upTo(p0,p1);
}
public static <C extends java.lang.Comparable<?> > com.google.common.collect.Range<C> openClosed(C p0,C p1){
return Range.openClosed(p0,p1);
}
public static <C extends java.lang.Comparable<?> > com.google.common.collect.Range<C> greaterThan(C p0){
return Range.greaterThan(p0);
}
public static <C extends java.lang.Comparable<?> > com.google.common.collect.Range<C> atMost(C p0){
return Range.atMost(p0);
}
public static <C extends java.lang.Comparable<?> > com.google.common.collect.Range<C> atLeast(C p0){
return Range.atLeast(p0);
}
public static <R,C,V> com.google.common.collect.Table.com.google.common.collect.Table.Cell<R, C, V> immutableCell(R p0,C p1,V p2){
return Tables.immutableCell(p0,p1,p2);
}
public static <T,C extends org.apache.commons.collections4.Closure<? super T> > C forAllDo(java.util.Iterator<T> p0,C p1){
return CollectionUtils.forAllDo(p0,p1);
}
public static <T,C extends org.apache.commons.collections4.Closure<? super T> > C forAllDo(java.lang.Iterable<T> p0,C p1){
return CollectionUtils.forAllDo(p0,p1);
}
public static <T,C extends org.apache.commons.collections4.Closure<? super T> > T forAllButLastDo(java.lang.Iterable<T> p0,C p1){
return CollectionUtils.forAllButLastDo(p0,p1);
}
public static <T,C extends org.apache.commons.collections4.Closure<? super T> > T forAllButLastDo(java.util.Iterator<T> p0,C p1){
return CollectionUtils.forAllButLastDo(p0,p1);
}
public static <T,C extends java.util.Collection<T> ,E extends java.lang.Throwable > C filter(java.util.Collection<T> p0,C p1,com.facebook.collectionsbase.Filter<T, E> p2) throws E{
return Piles.filter(p0,p1,p2);
}
}
