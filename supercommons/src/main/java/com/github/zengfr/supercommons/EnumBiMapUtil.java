package com.github.zengfr.supercommons;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class EnumBiMapUtil{ 
/**
*public static <K,V> com.google.common.collect.EnumBiMap<K, V> com.google.common.collect.EnumBiMap.create(java.util.Map<K, V>)
*/ 
public static <K extends java.lang.Enum<K> ,V extends java.lang.Enum<V> > com.google.common.collect.EnumBiMap<K, V> create(java.util.Map<K, V> p0){
	return com.google.common.collect.EnumBiMap.create(p0);
}
/**
*public static <K,V> com.google.common.collect.EnumBiMap<K, V> com.google.common.collect.EnumBiMap.create(java.lang.Class<K>,java.lang.Class<V>)
*/ 
public static <K extends java.lang.Enum<K> ,V extends java.lang.Enum<V> > com.google.common.collect.EnumBiMap<K, V> create(java.lang.Class<K> p0,java.lang.Class<V> p1){
	return com.google.common.collect.EnumBiMap.create(p0,p1);
}
}
