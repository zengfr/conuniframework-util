package com.github.zengfr.supercommons;
import com.google.common.collect.MapConstraints;
import com.google.common.collect.Multimaps;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class ListMultimapUtil{ 
public static <K,V> com.google.common.collect.ListMultimap<K, V> constrainedListMultimap(com.google.common.collect.ListMultimap<K, V> p0,com.google.common.collect.MapConstraint<? super K, ? super V> p1){
return MapConstraints.constrainedListMultimap(p0,p1);
}
public static <K,V1,V2> com.google.common.collect.ListMultimap<K, V2> transformEntries(com.google.common.collect.ListMultimap<K, V1> p0,com.google.common.collect.Maps.com.google.common.collect.Maps.EntryTransformer<? super K, ? super V1, V2> p1){
return Multimaps.transformEntries(p0,p1);
}
public static <K,V1,V2> com.google.common.collect.ListMultimap<K, V2> transformValues(com.google.common.collect.ListMultimap<K, V1> p0,com.google.common.base.Function<? super V1, V2> p1){
return Multimaps.transformValues(p0,p1);
}
public static <K,V> com.google.common.collect.ListMultimap<K, V> newListMultimap(java.util.Map<K, java.util.Collection<V>> p0,com.google.common.base.Supplier<? extends java.util.List<V>> p1){
return Multimaps.newListMultimap(p0,p1);
}
public static <K,V> com.google.common.collect.ListMultimap<K, V> unmodifiableListMultimap(com.google.common.collect.ListMultimap<K, V> p0){
return Multimaps.unmodifiableListMultimap(p0);
}
public static <K,V> com.google.common.collect.ListMultimap<K, V> unmodifiableListMultimap(com.google.common.collect.ImmutableListMultimap<K, V> p0){
return Multimaps.unmodifiableListMultimap(p0);
}
public static <K,V> com.google.common.collect.ListMultimap<K, V> synchronizedListMultimap(com.google.common.collect.ListMultimap<K, V> p0){
return Multimaps.synchronizedListMultimap(p0);
}
public static <K,V> com.google.common.collect.ListMultimap<K, V> filterKeys(com.google.common.collect.ListMultimap<K, V> p0,com.google.common.base.Predicate<? super K> p1){
return Multimaps.filterKeys(p0,p1);
}
}
