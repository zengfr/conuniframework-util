package com.github.zengfr.supercommons;
import java.util.*;
import java.util.Map.Entry;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class EntryUtil{ 
/**
*public static <K,V> java.util.Map.java.util.Map$Entry<K, V> com.google.common.collect.Maps.immutableEntry(K,V)
*/ 
public static <K,V> Entry<K, V> immutableEntry(K p0,V p1){
	return com.google.common.collect.Maps.immutableEntry(p0,p1);
}
/**
*public static <E> com.google.common.collect.Multiset.com.google.common.collect.Multiset$Entry<E> com.google.common.collect.Multisets.immutableEntry(E,int)
*/ 
public static <E> Entry<E> immutableEntry(E p0,int p1){
	return com.google.common.collect.Multisets.immutableEntry(p0,p1);
}
}
