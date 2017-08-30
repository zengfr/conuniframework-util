package com.github.zengfr.supercommons;
import java.util.*;
import java.util.Map.Entry;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class SortedMapDifferenceUtil{ 
/**
*public static <K,V> com.google.common.collect.SortedMapDifference<K, V> com.google.common.collect.Maps.difference(java.util.SortedMap<K, ? extends V>,java.util.Map<? extends K, ? extends V>)
*/ 
public static <K,V> com.google.common.collect.SortedMapDifference<K, V> difference(java.util.SortedMap<K, ? extends V> p0,java.util.Map<? extends K, ? extends V> p1){
	return com.google.common.collect.Maps.difference(p0,p1);
}
}
