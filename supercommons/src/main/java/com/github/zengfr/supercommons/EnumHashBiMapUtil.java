package com.github.zengfr.supercommons;
import java.util.*;
import java.util.Map.Entry;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class EnumHashBiMapUtil{ 
/**
*public static <K,V> com.google.common.collect.EnumHashBiMap<K, V> com.google.common.collect.EnumHashBiMap.create(java.lang.Class<K>)
*/ 
public static <K extends java.lang.Enum<K> ,V> com.google.common.collect.EnumHashBiMap<K, V> create(java.lang.Class<K> p0){
	return com.google.common.collect.EnumHashBiMap.create(p0);
}
/**
*public static <K,V> com.google.common.collect.EnumHashBiMap<K, V> com.google.common.collect.EnumHashBiMap.create(java.util.Map<K, ? extends V>)
*/ 
public static <K extends java.lang.Enum<K> ,V> com.google.common.collect.EnumHashBiMap<K, V> create(java.util.Map<K, ? extends V> p0){
	return com.google.common.collect.EnumHashBiMap.create(p0);
}
}
