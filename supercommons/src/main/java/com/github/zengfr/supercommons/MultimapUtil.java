package com.github.zengfr.supercommons;
import com.google.common.collect.MapConstraints;
import com.google.common.collect.Multimaps;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class MultimapUtil{ 
public static <K,V> com.google.common.collect.Multimap<K, V> constrainedMultimap(com.google.common.collect.Multimap<K, V> p0,com.google.common.collect.MapConstraint<? super K, ? super V> p1){
return MapConstraints.constrainedMultimap(p0,p1);
}
public static <K,V> com.google.common.collect.Multimap<K, V> filterEntries(com.google.common.collect.Multimap<K, V> p0,com.google.common.base.Predicate<? super java.util.Map.java.util.Map.Entry<K, V>> p1){
return Multimaps.filterEntries(p0,p1);
}
public static <K,V> com.google.common.collect.Multimap<K, V> filterValues(com.google.common.collect.Multimap<K, V> p0,com.google.common.base.Predicate<? super V> p1){
return Multimaps.filterValues(p0,p1);
}
public static <K,V1,V2> com.google.common.collect.Multimap<K, V2> transformEntries(com.google.common.collect.Multimap<K, V1> p0,com.google.common.collect.Maps.com.google.common.collect.Maps.EntryTransformer<? super K, ? super V1, V2> p1){
return Multimaps.transformEntries(p0,p1);
}
public static <K,V1,V2> com.google.common.collect.Multimap<K, V2> transformValues(com.google.common.collect.Multimap<K, V1> p0,com.google.common.base.Function<? super V1, V2> p1){
return Multimaps.transformValues(p0,p1);
}
public static <K,V,M extends com.google.common.collect.Multimap<K, V> > M invertFrom(com.google.common.collect.Multimap<? extends V, ? extends K> p0,M p1){
return Multimaps.invertFrom(p0,p1);
}
public static <K,V> com.google.common.collect.Multimap<K, V> newMultimap(java.util.Map<K, java.util.Collection<V>> p0,com.google.common.base.Supplier<? extends java.util.Collection<V>> p1){
return Multimaps.newMultimap(p0,p1);
}
public static <K,V> com.google.common.collect.Multimap<K, V> unmodifiableMultimap(com.google.common.collect.Multimap<K, V> p0){
return Multimaps.unmodifiableMultimap(p0);
}
public static <K,V> com.google.common.collect.Multimap<K, V> unmodifiableMultimap(com.google.common.collect.ImmutableMultimap<K, V> p0){
return Multimaps.unmodifiableMultimap(p0);
}
public static <K,V> com.google.common.collect.Multimap<K, V> synchronizedMultimap(com.google.common.collect.Multimap<K, V> p0){
return Multimaps.synchronizedMultimap(p0);
}
public static <K,V> com.google.common.collect.Multimap<K, V> filterKeys(com.google.common.collect.Multimap<K, V> p0,com.google.common.base.Predicate<? super K> p1){
return Multimaps.filterKeys(p0,p1);
}
}
