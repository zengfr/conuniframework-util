package com.github.zengfr.supercommons;
import java.util.*;
import java.util.Map.Entry;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class MultiKeyMapUtil{ 
/**
*public static org.apache.commons.collections.map.MultiKeyMap org.apache.commons.collections.map.MultiKeyMap.decorate(org.apache.commons.collections.map.AbstractHashedMap)
*/ 
public static org.apache.commons.collections.map.MultiKeyMap decorate(org.apache.commons.collections.map.AbstractHashedMap p0){
	return org.apache.commons.collections.map.MultiKeyMap.decorate(p0);
}
/**
*public static <K,V> org.apache.commons.collections4.map.MultiKeyMap<K, V> org.apache.commons.collections4.map.MultiKeyMap.multiKeyMap(org.apache.commons.collections4.map.AbstractHashedMap<org.apache.commons.collections4.keyvalue.MultiKey<? extends K>, V>)
*/ 
public static <K,V> org.apache.commons.collections4.map.MultiKeyMap<K, V> multiKeyMap(org.apache.commons.collections4.map.AbstractHashedMap<org.apache.commons.collections4.keyvalue.MultiKey<? extends K>, V> p0){
	return org.apache.commons.collections4.map.MultiKeyMap.multiKeyMap(p0);
}
}
