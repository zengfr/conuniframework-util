package com.github.zengfr.supercommons;
import java.util.*;
import java.util.Map.Entry;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class MapDifferenceUtil{ 
/**
*public static <K,V> com.google.common.collect.MapDifference<K, V> com.google.common.collect.Maps.difference(java.util.Map<? extends K, ? extends V>,java.util.Map<? extends K, ? extends V>)
*/ 
public static <K,V> com.google.common.collect.MapDifference<K, V> difference(java.util.Map<? extends K, ? extends V> p0,java.util.Map<? extends K, ? extends V> p1){
	return com.google.common.collect.Maps.difference(p0,p1);
}
/**
*public static <K,V> com.google.common.collect.MapDifference<K, V> com.google.common.collect.Maps.difference(java.util.Map<? extends K, ? extends V>,java.util.Map<? extends K, ? extends V>,com.google.common.base.Equivalence<? super V>)
*/ 
public static <K,V> com.google.common.collect.MapDifference<K, V> difference(java.util.Map<? extends K, ? extends V> p0,java.util.Map<? extends K, ? extends V> p1,com.google.common.base.Equivalence<? super V> p2){
	return com.google.common.collect.Maps.difference(p0,p1,p2);
}
}
