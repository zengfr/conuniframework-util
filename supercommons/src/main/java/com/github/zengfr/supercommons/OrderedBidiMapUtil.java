package com.github.zengfr.supercommons;
import java.util.*;
import java.util.Map.Entry;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class OrderedBidiMapUtil{ 
/**
*public static org.apache.commons.collections.OrderedBidiMap org.apache.commons.collections.bidimap.UnmodifiableOrderedBidiMap.decorate(org.apache.commons.collections.OrderedBidiMap)
*/ 
public static org.apache.commons.collections.OrderedBidiMap decorate(org.apache.commons.collections.OrderedBidiMap p0){
	return org.apache.commons.collections.bidimap.UnmodifiableOrderedBidiMap.decorate(p0);
}
/**
*public static <K,V> org.apache.commons.collections4.OrderedBidiMap<K, V> org.apache.commons.collections4.bidimap.UnmodifiableOrderedBidiMap.unmodifiableOrderedBidiMap(org.apache.commons.collections4.OrderedBidiMap<? extends K, ? extends V>)
*/ 
public static <K,V> org.apache.commons.collections4.OrderedBidiMap<K, V> unmodifiableOrderedBidiMap(org.apache.commons.collections4.OrderedBidiMap<? extends K, ? extends V> p0){
	return org.apache.commons.collections4.bidimap.UnmodifiableOrderedBidiMap.unmodifiableOrderedBidiMap(p0);
}
}
