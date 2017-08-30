package com.github.zengfr.supercommons;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class LazySortedMapUtil{ 
/**
*public static <K,V> org.apache.commons.collections4.map.LazySortedMap<K, V> org.apache.commons.collections4.map.LazySortedMap.lazySortedMap(java.util.SortedMap<K, V>,org.apache.commons.collections4.Factory<? extends V>)
*/ 
public static <K,V> org.apache.commons.collections4.map.LazySortedMap<K, V> lazySortedMap(java.util.SortedMap<K, V> p0,org.apache.commons.collections4.Factory<? extends V> p1){
	return org.apache.commons.collections4.map.LazySortedMap.lazySortedMap(p0,p1);
}
/**
*public static <K,V> org.apache.commons.collections4.map.LazySortedMap<K, V> org.apache.commons.collections4.map.LazySortedMap.lazySortedMap(java.util.SortedMap<K, V>,org.apache.commons.collections4.Transformer<? super K, ? extends V>)
*/ 
public static <K,V> org.apache.commons.collections4.map.LazySortedMap<K, V> lazySortedMap(java.util.SortedMap<K, V> p0,org.apache.commons.collections4.Transformer<? super K, ? extends V> p1){
	return org.apache.commons.collections4.map.LazySortedMap.lazySortedMap(p0,p1);
}
}
