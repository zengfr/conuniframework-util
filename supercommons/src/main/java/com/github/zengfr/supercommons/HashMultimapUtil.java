package com.github.zengfr.supercommons;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class HashMultimapUtil{ 
/**
*public static <K,V> com.google.common.collect.HashMultimap<K, V> com.google.common.collect.HashMultimap.create(int,int)
*/ 
public static <K,V> com.google.common.collect.HashMultimap<K, V> create(int p0,int p1){
	return com.google.common.collect.HashMultimap.create(p0,p1);
}
/**
*public static <K,V> com.google.common.collect.HashMultimap<K, V> com.google.common.collect.HashMultimap.create(com.google.common.collect.Multimap<? extends K, ? extends V>)
*/ 
public static <K,V> com.google.common.collect.HashMultimap<K, V> create(com.google.common.collect.Multimap<? extends K, ? extends V> p0){
	return com.google.common.collect.HashMultimap.create(p0);
}
/**
*public static <K,V> com.google.common.collect.HashMultimap<K, V> com.google.common.collect.HashMultimap.create()
*/ 
public static <K,V> com.google.common.collect.HashMultimap<K, V> create(){
	return com.google.common.collect.HashMultimap.create();
}
}
