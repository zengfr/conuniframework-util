package com.github.zengfr.supercommons;
import java.util.*;
import java.util.Map.Entry;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class TreeMapUtil{ 
/**
*public static <K,V> java.util.TreeMap<K, V> com.google.common.collect.Maps.newTreeMap(java.util.SortedMap<K, ? extends V>)
*/ 
public static <K,V> java.util.TreeMap<K, V> newTreeMap(java.util.SortedMap<K, ? extends V> p0){
	return com.google.common.collect.Maps.newTreeMap(p0);
}
/**
*public static <C,K,V> java.util.TreeMap<K, V> com.google.common.collect.Maps.newTreeMap(java.util.Comparator<C>)
*/ 
public static <C,K,V> java.util.TreeMap<K, V> newTreeMap(java.util.Comparator<C> p0){
	return com.google.common.collect.Maps.newTreeMap(p0);
}
/**
*public static <K,V> java.util.TreeMap<K, V> com.google.common.collect.Maps.newTreeMap()
*/ 
public static <K extends java.lang.Comparable ,V> java.util.TreeMap<K, V> newTreeMap(){
	return com.google.common.collect.Maps.newTreeMap();
}
}
