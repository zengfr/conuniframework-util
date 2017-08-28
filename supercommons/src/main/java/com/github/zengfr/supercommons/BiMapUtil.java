package com.zengfr.supercommons;
import com.google.common.collect.MapConstraints;
import com.google.common.collect.Maps;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class BiMapUtil{ 
public static <K,V> com.google.common.collect.BiMap<K, V> constrainedBiMap(com.google.common.collect.BiMap<K, V> p0,com.google.common.collect.MapConstraint<? super K, ? super V> p1){
return MapConstraints.constrainedBiMap(p0,p1);
}
public static <K,V> com.google.common.collect.BiMap<K, V> synchronizedBiMap(com.google.common.collect.BiMap<K, V> p0){
return Maps.synchronizedBiMap(p0);
}
public static <K,V> com.google.common.collect.BiMap<K, V> unmodifiableBiMap(com.google.common.collect.BiMap<? extends K, ? extends V> p0){
return Maps.unmodifiableBiMap(p0);
}
public static <K,V> com.google.common.collect.BiMap<K, V> filterKeys(com.google.common.collect.BiMap<K, V> p0,com.google.common.base.Predicate<? super K> p1){
return Maps.filterKeys(p0,p1);
}
public static <K,V> com.google.common.collect.BiMap<K, V> filterEntries(com.google.common.collect.BiMap<K, V> p0,com.google.common.base.Predicate<? super java.util.Map.java.util.Map.Entry<K, V>> p1){
return Maps.filterEntries(p0,p1);
}
public static <K,V> com.google.common.collect.BiMap<K, V> filterValues(com.google.common.collect.BiMap<K, V> p0,com.google.common.base.Predicate<? super V> p1){
return Maps.filterValues(p0,p1);
}
}
