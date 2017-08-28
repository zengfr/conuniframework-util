package com.zengfr.supercommons;
import org.apache.commons.collections.map.ListOrderedMap;
import org.apache.commons.collections.map.UnmodifiableOrderedMap;
import org.apache.commons.collections4.MapUtils;
import org.apache.commons.collections4.map.UnmodifiableOrderedMap;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class OrderedMapUtil{ 
public static org.apache.commons.collections.OrderedMap decorate(java.util.Map p0){
return ListOrderedMap.decorate(p0);
}
public static org.apache.commons.collections.OrderedMap decorate(org.apache.commons.collections.OrderedMap p0){
return UnmodifiableOrderedMap.decorate(p0);
}
public static <K,V> org.apache.commons.collections4.OrderedMap<K, V> orderedMap(java.util.Map<K, V> p0){
return MapUtils.orderedMap(p0);
}
public static <K,V> org.apache.commons.collections4.OrderedMap<K, V> unmodifiableOrderedMap(org.apache.commons.collections4.OrderedMap<? extends K, ? extends V> p0){
return UnmodifiableOrderedMap.unmodifiableOrderedMap(p0);
}
}
