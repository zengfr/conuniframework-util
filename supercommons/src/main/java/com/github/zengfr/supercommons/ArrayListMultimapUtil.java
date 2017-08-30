package com.github.zengfr.supercommons;
import java.util.*;
import java.util.Map.Entry;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class ArrayListMultimapUtil{ 
/**
*public static <K,V> com.google.common.collect.ArrayListMultimap<K, V> com.google.common.collect.ArrayListMultimap.create(com.google.common.collect.Multimap<? extends K, ? extends V>)
*/ 
public static <K,V> com.google.common.collect.ArrayListMultimap<K, V> create(com.google.common.collect.Multimap<? extends K, ? extends V> p0){
	return com.google.common.collect.ArrayListMultimap.create(p0);
}
/**
*public static <K,V> com.google.common.collect.ArrayListMultimap<K, V> com.google.common.collect.ArrayListMultimap.create(int,int)
*/ 
public static <K,V> com.google.common.collect.ArrayListMultimap<K, V> create(int p0,int p1){
	return com.google.common.collect.ArrayListMultimap.create(p0,p1);
}
/**
*public static <K,V> com.google.common.collect.ArrayListMultimap<K, V> com.google.common.collect.ArrayListMultimap.create()
*/ 
public static <K,V> com.google.common.collect.ArrayListMultimap<K, V> create(){
	return com.google.common.collect.ArrayListMultimap.create();
}
}
