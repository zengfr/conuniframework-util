package com.zengfr.supercommons;
import com.google.common.collect.MapConstraints;
import com.google.common.collect.Multimaps;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class SortedSetMultimapUtil{ 
public static <K,V> com.google.common.collect.SortedSetMultimap<K, V> constrainedSortedSetMultimap(com.google.common.collect.SortedSetMultimap<K, V> p0,com.google.common.collect.MapConstraint<? super K, ? super V> p1){
return MapConstraints.constrainedSortedSetMultimap(p0,p1);
}
public static <K,V> com.google.common.collect.SortedSetMultimap<K, V> newSortedSetMultimap(java.util.Map<K, java.util.Collection<V>> p0,com.google.common.base.Supplier<? extends java.util.SortedSet<V>> p1){
return Multimaps.newSortedSetMultimap(p0,p1);
}
public static <K,V> com.google.common.collect.SortedSetMultimap<K, V> unmodifiableSortedSetMultimap(com.google.common.collect.SortedSetMultimap<K, V> p0){
return Multimaps.unmodifiableSortedSetMultimap(p0);
}
public static <K,V> com.google.common.collect.SortedSetMultimap<K, V> synchronizedSortedSetMultimap(com.google.common.collect.SortedSetMultimap<K, V> p0){
return Multimaps.synchronizedSortedSetMultimap(p0);
}
}
