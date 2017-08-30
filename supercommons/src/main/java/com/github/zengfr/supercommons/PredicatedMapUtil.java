package com.github.zengfr.supercommons;
import java.util.*;
import java.util.Map.Entry;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class PredicatedMapUtil{ 
/**
*public static <K,V> org.apache.commons.collections4.map.PredicatedMap<K, V> org.apache.commons.collections4.map.PredicatedMap.predicatedMap(java.util.Map<K, V>,org.apache.commons.collections4.Predicate<? super K>,org.apache.commons.collections4.Predicate<? super V>)
*/ 
public static <K,V> org.apache.commons.collections4.map.PredicatedMap<K, V> predicatedMap(java.util.Map<K, V> p0,org.apache.commons.collections4.Predicate<? super K> p1,org.apache.commons.collections4.Predicate<? super V> p2){
	return org.apache.commons.collections4.map.PredicatedMap.predicatedMap(p0,p1,p2);
}
}
