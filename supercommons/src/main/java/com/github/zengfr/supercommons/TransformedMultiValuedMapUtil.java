package com.github.zengfr.supercommons;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class TransformedMultiValuedMapUtil{ 
/**
*public static <K,V> org.apache.commons.collections4.multimap.TransformedMultiValuedMap<K, V> org.apache.commons.collections4.multimap.TransformedMultiValuedMap.transformingMap(org.apache.commons.collections4.MultiValuedMap<K, V>,org.apache.commons.collections4.Transformer<? super K, ? extends K>,org.apache.commons.collections4.Transformer<? super V, ? extends V>)
*/ 
public static <K,V> org.apache.commons.collections4.multimap.TransformedMultiValuedMap<K, V> transformingMap(org.apache.commons.collections4.MultiValuedMap<K, V> p0,org.apache.commons.collections4.Transformer<? super K, ? extends K> p1,org.apache.commons.collections4.Transformer<? super V, ? extends V> p2){
	return org.apache.commons.collections4.multimap.TransformedMultiValuedMap.transformingMap(p0,p1,p2);
}
/**
*public static <K,V> org.apache.commons.collections4.multimap.TransformedMultiValuedMap<K, V> org.apache.commons.collections4.multimap.TransformedMultiValuedMap.transformedMap(org.apache.commons.collections4.MultiValuedMap<K, V>,org.apache.commons.collections4.Transformer<? super K, ? extends K>,org.apache.commons.collections4.Transformer<? super V, ? extends V>)
*/ 
public static <K,V> org.apache.commons.collections4.multimap.TransformedMultiValuedMap<K, V> transformedMap(org.apache.commons.collections4.MultiValuedMap<K, V> p0,org.apache.commons.collections4.Transformer<? super K, ? extends K> p1,org.apache.commons.collections4.Transformer<? super V, ? extends V> p2){
	return org.apache.commons.collections4.multimap.TransformedMultiValuedMap.transformedMap(p0,p1,p2);
}
}
