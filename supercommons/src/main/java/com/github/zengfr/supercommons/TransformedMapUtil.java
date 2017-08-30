package com.github.zengfr.supercommons;
import java.util.*;
import java.util.Map.Entry;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class TransformedMapUtil{ 
/**
*public static <K,V> org.apache.commons.collections4.map.TransformedMap<K, V> org.apache.commons.collections4.map.TransformedMap.transformedMap(java.util.Map<K, V>,org.apache.commons.collections4.Transformer<? super K, ? extends K>,org.apache.commons.collections4.Transformer<? super V, ? extends V>)
*/ 
public static <K,V> org.apache.commons.collections4.map.TransformedMap<K, V> transformedMap(java.util.Map<K, V> p0,org.apache.commons.collections4.Transformer<? super K, ? extends K> p1,org.apache.commons.collections4.Transformer<? super V, ? extends V> p2){
	return org.apache.commons.collections4.map.TransformedMap.transformedMap(p0,p1,p2);
}
/**
*public static <K,V> org.apache.commons.collections4.map.TransformedMap<K, V> org.apache.commons.collections4.map.TransformedMap.transformingMap(java.util.Map<K, V>,org.apache.commons.collections4.Transformer<? super K, ? extends K>,org.apache.commons.collections4.Transformer<? super V, ? extends V>)
*/ 
public static <K,V> org.apache.commons.collections4.map.TransformedMap<K, V> transformingMap(java.util.Map<K, V> p0,org.apache.commons.collections4.Transformer<? super K, ? extends K> p1,org.apache.commons.collections4.Transformer<? super V, ? extends V> p2){
	return org.apache.commons.collections4.map.TransformedMap.transformingMap(p0,p1,p2);
}
}
