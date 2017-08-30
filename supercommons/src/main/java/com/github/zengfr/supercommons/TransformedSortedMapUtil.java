package com.github.zengfr.supercommons;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class TransformedSortedMapUtil{ 
/**
*public static <K,V> org.apache.commons.collections4.map.TransformedSortedMap<K, V> org.apache.commons.collections4.map.TransformedSortedMap.transformingSortedMap(java.util.SortedMap<K, V>,org.apache.commons.collections4.Transformer<? super K, ? extends K>,org.apache.commons.collections4.Transformer<? super V, ? extends V>)
*/ 
public static <K,V> org.apache.commons.collections4.map.TransformedSortedMap<K, V> transformingSortedMap(java.util.SortedMap<K, V> p0,org.apache.commons.collections4.Transformer<? super K, ? extends K> p1,org.apache.commons.collections4.Transformer<? super V, ? extends V> p2){
	return org.apache.commons.collections4.map.TransformedSortedMap.transformingSortedMap(p0,p1,p2);
}
/**
*public static <K,V> org.apache.commons.collections4.map.TransformedSortedMap<K, V> org.apache.commons.collections4.map.TransformedSortedMap.transformedSortedMap(java.util.SortedMap<K, V>,org.apache.commons.collections4.Transformer<? super K, ? extends K>,org.apache.commons.collections4.Transformer<? super V, ? extends V>)
*/ 
public static <K,V> org.apache.commons.collections4.map.TransformedSortedMap<K, V> transformedSortedMap(java.util.SortedMap<K, V> p0,org.apache.commons.collections4.Transformer<? super K, ? extends K> p1,org.apache.commons.collections4.Transformer<? super V, ? extends V> p2){
	return org.apache.commons.collections4.map.TransformedSortedMap.transformedSortedMap(p0,p1,p2);
}
}
