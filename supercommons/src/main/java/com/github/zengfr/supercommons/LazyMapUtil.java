package com.github.zengfr.supercommons;
import java.util.*;
import java.util.Map.Entry;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class LazyMapUtil{ 
/**
*public static <K,V> org.apache.commons.collections4.map.LazyMap<K, V> org.apache.commons.collections4.map.LazyMap.lazyMap(java.util.Map<K, V>,org.apache.commons.collections4.Factory<? extends V>)
*/ 
public static <K,V> org.apache.commons.collections4.map.LazyMap<K, V> lazyMap(java.util.Map<K, V> p0,org.apache.commons.collections4.Factory<? extends V> p1){
	return org.apache.commons.collections4.map.LazyMap.lazyMap(p0,p1);
}
/**
*public static <V,K> org.apache.commons.collections4.map.LazyMap<K, V> org.apache.commons.collections4.map.LazyMap.lazyMap(java.util.Map<K, V>,org.apache.commons.collections4.Transformer<? super K, ? extends V>)
*/ 
public static <V,K> org.apache.commons.collections4.map.LazyMap<K, V> lazyMap(java.util.Map<K, V> p0,org.apache.commons.collections4.Transformer<? super K, ? extends V> p1){
	return org.apache.commons.collections4.map.LazyMap.lazyMap(p0,p1);
}
}
