package com.github.zengfr.supercommons;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class OrderedMapUtil{ 
/**
*public static org.apache.commons.collections.OrderedMap org.apache.commons.collections.map.ListOrderedMap.decorate(java.util.Map)
*/ 
public static org.apache.commons.collections.OrderedMap decorate(java.util.Map p0){
	return org.apache.commons.collections.map.ListOrderedMap.decorate(p0);
}
/**
*public static org.apache.commons.collections.OrderedMap org.apache.commons.collections.map.UnmodifiableOrderedMap.decorate(org.apache.commons.collections.OrderedMap)
*/ 
public static org.apache.commons.collections.OrderedMap decorate(org.apache.commons.collections.OrderedMap p0){
	return org.apache.commons.collections.map.UnmodifiableOrderedMap.decorate(p0);
}
/**
*public static <K,V> org.apache.commons.collections4.OrderedMap<K, V> org.apache.commons.collections4.MapUtils.orderedMap(java.util.Map<K, V>)
*/ 
public static <K,V> org.apache.commons.collections4.OrderedMap<K, V> orderedMap(java.util.Map<K, V> p0){
	return org.apache.commons.collections4.MapUtils.orderedMap(p0);
}
/**
*public static <K,V> org.apache.commons.collections4.OrderedMap<K, V> org.apache.commons.collections4.map.UnmodifiableOrderedMap.unmodifiableOrderedMap(org.apache.commons.collections4.OrderedMap<? extends K, ? extends V>)
*/ 
public static <K,V> org.apache.commons.collections4.OrderedMap<K, V> unmodifiableOrderedMap(org.apache.commons.collections4.OrderedMap<? extends K, ? extends V> p0){
	return org.apache.commons.collections4.map.UnmodifiableOrderedMap.unmodifiableOrderedMap(p0);
}
}
