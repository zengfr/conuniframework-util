package com.github.zengfr.supercommons;
import java.util.*;
import java.util.Map.Entry;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class DefaultedMapUtil{ 
/**
*public static <K,V> org.apache.commons.collections4.map.DefaultedMap<K, V> org.apache.commons.collections4.map.DefaultedMap.defaultedMap(java.util.Map<K, V>,V)
*/ 
public static <K,V> org.apache.commons.collections4.map.DefaultedMap<K, V> defaultedMap(java.util.Map<K, V> p0,V p1){
	return org.apache.commons.collections4.map.DefaultedMap.defaultedMap(p0,p1);
}
/**
*public static <K,V> org.apache.commons.collections4.map.DefaultedMap<K, V> org.apache.commons.collections4.map.DefaultedMap.defaultedMap(java.util.Map<K, V>,org.apache.commons.collections4.Factory<? extends V>)
*/ 
public static <K,V> org.apache.commons.collections4.map.DefaultedMap<K, V> defaultedMap(java.util.Map<K, V> p0,org.apache.commons.collections4.Factory<? extends V> p1){
	return org.apache.commons.collections4.map.DefaultedMap.defaultedMap(p0,p1);
}
}
