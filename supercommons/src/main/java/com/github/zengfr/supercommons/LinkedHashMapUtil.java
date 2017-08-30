package com.github.zengfr.supercommons;
import java.util.*;
import java.util.Map.Entry;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class LinkedHashMapUtil{ 
/**
*public static <K,V> java.util.LinkedHashMap<K, V> com.google.common.collect.Maps.newLinkedHashMap()
*/ 
public static <K,V> java.util.LinkedHashMap<K, V> newLinkedHashMap(){
	return com.google.common.collect.Maps.newLinkedHashMap();
}
/**
*public static <K,V> java.util.LinkedHashMap<K, V> com.google.common.collect.Maps.newLinkedHashMap(java.util.Map<? extends K, ? extends V>)
*/ 
public static <K,V> java.util.LinkedHashMap<K, V> newLinkedHashMap(java.util.Map<? extends K, ? extends V> p0){
	return com.google.common.collect.Maps.newLinkedHashMap(p0);
}
/**
*public static <K,V> java.util.LinkedHashMap<K, V> com.google.common.collect.Maps.newLinkedHashMapWithExpectedSize(int)
*/ 
public static <K,V> java.util.LinkedHashMap<K, V> newLinkedHashMapWithExpectedSize(int p0){
	return com.google.common.collect.Maps.newLinkedHashMapWithExpectedSize(p0);
}
}
