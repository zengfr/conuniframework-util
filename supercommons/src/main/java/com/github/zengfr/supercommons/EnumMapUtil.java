package com.github.zengfr.supercommons;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class EnumMapUtil{ 
/**
*public static <K,V> java.util.EnumMap<K, V> com.google.common.collect.Maps.newEnumMap(java.util.Map<K, ? extends V>)
*/ 
public static <K extends java.lang.Enum<K> ,V> java.util.EnumMap<K, V> newEnumMap(java.util.Map<K, ? extends V> p0){
	return com.google.common.collect.Maps.newEnumMap(p0);
}
/**
*public static <K,V> java.util.EnumMap<K, V> com.google.common.collect.Maps.newEnumMap(java.lang.Class<K>)
*/ 
public static <K extends java.lang.Enum<K> ,V> java.util.EnumMap<K, V> newEnumMap(java.lang.Class<K> p0){
	return com.google.common.collect.Maps.newEnumMap(p0);
}
}
