package com.github.zengfr.supercommons;
import java.util.*;
import java.util.Map.Entry;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class TreeMultimapUtil{ 
/**
*public static <K,V> com.google.common.collect.TreeMultimap<K, V> com.google.common.collect.TreeMultimap.create()
*/ 
public static <K extends java.lang.Comparable ,V extends java.lang.Comparable > com.google.common.collect.TreeMultimap<K, V> create(){
	return com.google.common.collect.TreeMultimap.create();
}
/**
*public static <K,V> com.google.common.collect.TreeMultimap<K, V> com.google.common.collect.TreeMultimap.create(java.util.Comparator<? super K>,java.util.Comparator<? super V>)
*/ 
public static <K,V> com.google.common.collect.TreeMultimap<K, V> create(java.util.Comparator<? super K> p0,java.util.Comparator<? super V> p1){
	return com.google.common.collect.TreeMultimap.create(p0,p1);
}
/**
*public static <K,V> com.google.common.collect.TreeMultimap<K, V> com.google.common.collect.TreeMultimap.create(com.google.common.collect.Multimap<? extends K, ? extends V>)
*/ 
public static <K extends java.lang.Comparable ,V extends java.lang.Comparable > com.google.common.collect.TreeMultimap<K, V> create(com.google.common.collect.Multimap<? extends K, ? extends V> p0){
	return com.google.common.collect.TreeMultimap.create(p0);
}
}
