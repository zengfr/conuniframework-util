package com.zengfr.supercommons;
import com.google.common.collect.Maps;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class NavigableMapUtil{ 
public static <K,V> java.util.NavigableMap<K, V> synchronizedNavigableMap(java.util.NavigableMap<K, V> p0){
return Maps.synchronizedNavigableMap(p0);
}
public static <K,V> java.util.NavigableMap<K, V> unmodifiableNavigableMap(java.util.NavigableMap<K, V> p0){
return Maps.unmodifiableNavigableMap(p0);
}
public static <K,V> java.util.NavigableMap<K, V> asMap(java.util.NavigableSet<K> p0,com.google.common.base.Function<? super K, V> p1){
return Maps.asMap(p0,p1);
}
public static <K,V> java.util.NavigableMap<K, V> filterKeys(java.util.NavigableMap<K, V> p0,com.google.common.base.Predicate<? super K> p1){
return Maps.filterKeys(p0,p1);
}
public static <K,V> java.util.NavigableMap<K, V> filterEntries(java.util.NavigableMap<K, V> p0,com.google.common.base.Predicate<? super java.util.Map.java.util.Map.Entry<K, V>> p1){
return Maps.filterEntries(p0,p1);
}
public static <K,V1,V2> java.util.NavigableMap<K, V2> transformValues(java.util.NavigableMap<K, V1> p0,com.google.common.base.Function<? super V1, V2> p1){
return Maps.transformValues(p0,p1);
}
public static <K,V> java.util.NavigableMap<K, V> filterValues(java.util.NavigableMap<K, V> p0,com.google.common.base.Predicate<? super V> p1){
return Maps.filterValues(p0,p1);
}
public static <K,V1,V2> java.util.NavigableMap<K, V2> transformEntries(java.util.NavigableMap<K, V1> p0,EntryTransformer<? super K, ? super V1, V2> p1){
return Maps.transformEntries(p0,p1);
}
}
