package com.github.zengfr.supercommons;
import com.google.common.collect.MapConstraints;
import com.google.common.collect.Multimaps;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class SetMultimapUtil{ 
public static <K,V> com.google.common.collect.SetMultimap<K, V> constrainedSetMultimap(com.google.common.collect.SetMultimap<K, V> p0,com.google.common.collect.MapConstraint<? super K, ? super V> p1){
return MapConstraints.constrainedSetMultimap(p0,p1);
}
public static <K,V> com.google.common.collect.SetMultimap<K, V> forMap(java.util.Map<K, V> p0){
return Multimaps.forMap(p0);
}
public static <K,V> com.google.common.collect.SetMultimap<K, V> filterEntries(com.google.common.collect.SetMultimap<K, V> p0,com.google.common.base.Predicate<? super java.util.Map.java.util.Map.Entry<K, V>> p1){
return Multimaps.filterEntries(p0,p1);
}
public static <K,V> com.google.common.collect.SetMultimap<K, V> filterValues(com.google.common.collect.SetMultimap<K, V> p0,com.google.common.base.Predicate<? super V> p1){
return Multimaps.filterValues(p0,p1);
}
public static <K,V> com.google.common.collect.SetMultimap<K, V> newSetMultimap(java.util.Map<K, java.util.Collection<V>> p0,com.google.common.base.Supplier<? extends java.util.Set<V>> p1){
return Multimaps.newSetMultimap(p0,p1);
}
public static <K,V> com.google.common.collect.SetMultimap<K, V> unmodifiableSetMultimap(com.google.common.collect.ImmutableSetMultimap<K, V> p0){
return Multimaps.unmodifiableSetMultimap(p0);
}
public static <K,V> com.google.common.collect.SetMultimap<K, V> unmodifiableSetMultimap(com.google.common.collect.SetMultimap<K, V> p0){
return Multimaps.unmodifiableSetMultimap(p0);
}
public static <K,V> com.google.common.collect.SetMultimap<K, V> synchronizedSetMultimap(com.google.common.collect.SetMultimap<K, V> p0){
return Multimaps.synchronizedSetMultimap(p0);
}
public static <K,V> com.google.common.collect.SetMultimap<K, V> filterKeys(com.google.common.collect.SetMultimap<K, V> p0,com.google.common.base.Predicate<? super K> p1){
return Multimaps.filterKeys(p0,p1);
}
}
