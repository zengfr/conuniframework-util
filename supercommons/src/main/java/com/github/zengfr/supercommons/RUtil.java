package com.github.zengfr.supercommons;
import com.google.common.collect.ImmutableTable;
import com.google.common.collect.Tables;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.tuple.Pair;
import org.apache.commons.lang3.tuple.ImmutablePair;
import org.apache.commons.lang3.tuple.ImmutableTriple;
import org.apache.commons.lang3.tuple.Triple;
import org.apache.commons.lang3.tuple.MutablePair;
import org.apache.commons.lang3.tuple.MutableTriple;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class RUtil{ 
public static <R,C,V> com.google.common.collect.ImmutableTable<R, C, V> of(R p0,C p1,V p2){
return ImmutableTable.of(p0,p1,p2);
}
public static <R,C,V> com.google.common.collect.Table.com.google.common.collect.Table.Cell<R, C, V> immutableCell(R p0,C p1,V p2){
return Tables.immutableCell(p0,p1,p2);
}
public static <I,O,R extends java.util.Collection<? super O> > R collect(java.lang.Iterable<? extends I> p0,org.apache.commons.collections4.Transformer<? super I, ? extends O> p1,R p2){
return CollectionUtils.collect(p0,p1,p2);
}
public static <I,O,R extends java.util.Collection<? super O> > R collect(java.util.Iterator<? extends I> p0,org.apache.commons.collections4.Transformer<? super I, ? extends O> p1,R p2){
return CollectionUtils.collect(p0,p1,p2);
}
public static <O,R extends java.util.Collection<? super O> > R select(java.lang.Iterable<? extends O> p0,org.apache.commons.collections4.Predicate<? super O> p1,R p2){
return CollectionUtils.select(p0,p1,p2);
}
public static <O,R extends java.util.Collection<? super O> > R select(java.lang.Iterable<? extends O> p0,org.apache.commons.collections4.Predicate<? super O> p1,R p2,R p3){
return CollectionUtils.select(p0,p1,p2,p3);
}
public static <O,R extends java.util.Collection<? super O> > R selectRejected(java.lang.Iterable<? extends O> p0,org.apache.commons.collections4.Predicate<? super O> p1,R p2){
return CollectionUtils.selectRejected(p0,p1,p2);
}
public static <L,R> org.apache.commons.lang3.tuple.Pair<L, R> of(L p0,R p1){
return Pair.of(p0,p1);
}
public static <L,M,R> org.apache.commons.lang3.tuple.ImmutableTriple<L, M, R> of(L p0,M p1,R p2){
return ImmutableTriple.of(p0,p1,p2);
}
}
