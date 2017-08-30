package com.github.zengfr.supercommons;
import java.util.*;
import java.util.Map.Entry;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class HashMapUtil{ 
/**
*public static <K,V> java.util.HashMap<K, V> com.google.common.collect.Maps.newHashMap(java.util.Map<? extends K, ? extends V>)
*/ 
public static <K,V> java.util.HashMap<K, V> newHashMap(java.util.Map<? extends K, ? extends V> p0){
	return com.google.common.collect.Maps.newHashMap(p0);
}
/**
*public static <K,V> java.util.HashMap<K, V> com.google.common.collect.Maps.newHashMap()
*/ 
public static <K,V> java.util.HashMap<K, V> newHashMap(){
	return com.google.common.collect.Maps.newHashMap();
}
/**
*public static <K,V> java.util.HashMap<K, V> com.google.common.collect.Maps.newHashMapWithExpectedSize(int)
*/ 
public static <K,V> java.util.HashMap<K, V> newHashMapWithExpectedSize(int p0){
	return com.google.common.collect.Maps.newHashMapWithExpectedSize(p0);
}
}
