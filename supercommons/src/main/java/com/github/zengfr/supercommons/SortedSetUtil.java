package com.zengfr.supercommons;
import com.google.common.collect.Sets;
import org.apache.commons.collections.SetUtils;
import org.apache.commons.collections.set.UnmodifiableSortedSet;
import org.apache.commons.collections.set.PredicatedSortedSet;
import org.apache.commons.collections.set.TypedSortedSet;
import org.apache.commons.collections.set.TransformedSortedSet;
import org.apache.commons.collections.set.SynchronizedSortedSet;
import org.apache.commons.collections4.SetUtils;
import org.apache.commons.collections4.set.UnmodifiableSortedSet;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class SortedSetUtil{ 
public static <E> java.util.SortedSet<E> filter(java.util.SortedSet<E> p0,com.google.common.base.Predicate<? super E> p1){
return Sets.filter(p0,p1);
}
public static java.util.SortedSet synchronizedSortedSet(java.util.SortedSet p0){
return SetUtils.synchronizedSortedSet(p0);
}
public static java.util.SortedSet unmodifiableSortedSet(java.util.SortedSet p0){
return SetUtils.unmodifiableSortedSet(p0);
}
public static java.util.SortedSet predicatedSortedSet(java.util.SortedSet p0,org.apache.commons.collections.Predicate p1){
return SetUtils.predicatedSortedSet(p0,p1);
}
public static java.util.SortedSet transformedSortedSet(java.util.SortedSet p0,org.apache.commons.collections.Transformer p1){
return SetUtils.transformedSortedSet(p0,p1);
}
public static java.util.SortedSet typedSortedSet(java.util.SortedSet p0,java.lang.Class p1){
return SetUtils.typedSortedSet(p0,p1);
}
public static java.util.SortedSet decorate(java.util.SortedSet p0){
return UnmodifiableSortedSet.decorate(p0);
}
public static java.util.SortedSet decorate(java.util.SortedSet p0,org.apache.commons.collections.Predicate p1){
return PredicatedSortedSet.decorate(p0,p1);
}
public static java.util.SortedSet decorate(java.util.SortedSet p0,java.lang.Class p1){
return TypedSortedSet.decorate(p0,p1);
}
public static java.util.SortedSet decorate(java.util.SortedSet p0,org.apache.commons.collections.Transformer p1){
return TransformedSortedSet.decorate(p0,p1);
}
public static <E> java.util.SortedSet<E> emptySortedSet(){
return SetUtils.emptySortedSet();
}
public static <E> java.util.SortedSet<E> synchronizedSortedSet(java.util.SortedSet<E> p0){
return SetUtils.synchronizedSortedSet(p0);
}
public static <E> java.util.SortedSet<E> unmodifiableNavigableSet(java.util.NavigableSet<E> p0){
return SetUtils.unmodifiableNavigableSet(p0);
}
public static <E> java.util.SortedSet<E> unmodifiableSortedSet(java.util.SortedSet<E> p0){
return SetUtils.unmodifiableSortedSet(p0);
}
public static <E> java.util.SortedSet<E> predicatedNavigableSet(java.util.NavigableSet<E> p0,org.apache.commons.collections4.Predicate<? super E> p1){
return SetUtils.predicatedNavigableSet(p0,p1);
}
public static <E> java.util.SortedSet<E> transformedNavigableSet(java.util.NavigableSet<E> p0,org.apache.commons.collections4.Transformer<? super E, ? extends E> p1){
return SetUtils.transformedNavigableSet(p0,p1);
}
public static <E> java.util.SortedSet<E> predicatedSortedSet(java.util.SortedSet<E> p0,org.apache.commons.collections4.Predicate<? super E> p1){
return SetUtils.predicatedSortedSet(p0,p1);
}
public static <E> java.util.SortedSet<E> transformedSortedSet(java.util.SortedSet<E> p0,org.apache.commons.collections4.Transformer<? super E, ? extends E> p1){
return SetUtils.transformedSortedSet(p0,p1);
}
}
