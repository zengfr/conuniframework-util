package com.zengfr.supercommons;
import org.apache.commons.collections4.MapUtils;
import org.apache.commons.collections4.SplitMapUtils;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class IterableMapUtil{ 
public static <K,V> org.apache.commons.collections4.IterableMap<K, V> predicatedMap(java.util.Map<K, V> p0,org.apache.commons.collections4.Predicate<? super K> p1,org.apache.commons.collections4.Predicate<? super V> p2){
return MapUtils.predicatedMap(p0,p1,p2);
}
public static <K,V> org.apache.commons.collections4.IterableMap<K, V> transformedMap(java.util.Map<K, V> p0,org.apache.commons.collections4.Transformer<? super K, ? extends K> p1,org.apache.commons.collections4.Transformer<? super V, ? extends V> p2){
return MapUtils.transformedMap(p0,p1,p2);
}
public static <K,V> org.apache.commons.collections4.IterableMap<K, V> lazyMap(java.util.Map<K, V> p0,org.apache.commons.collections4.Factory<? extends V> p1){
return MapUtils.lazyMap(p0,p1);
}
public static <K,V> org.apache.commons.collections4.IterableMap<K, V> lazyMap(java.util.Map<K, V> p0,org.apache.commons.collections4.Transformer<? super K, ? extends V> p1){
return MapUtils.lazyMap(p0,p1);
}
public static <K,V> org.apache.commons.collections4.IterableMap<K, V> fixedSizeMap(java.util.Map<K, V> p0){
return MapUtils.fixedSizeMap(p0);
}
public static <K,V> org.apache.commons.collections4.IterableMap<K, V> iterableMap(java.util.Map<K, V> p0){
return MapUtils.iterableMap(p0);
}
public static <K,V> org.apache.commons.collections4.IterableMap<K, V> readableMap(org.apache.commons.collections4.Get<K, V> p0){
return SplitMapUtils.readableMap(p0);
}
}
