package com.github.zengfr.supercommons;
import java.util.*;
import java.util.Map.Entry;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class BidiMapUtil{ 
/**
*public static org.apache.commons.collections.BidiMap org.apache.commons.collections.bidimap.UnmodifiableBidiMap.decorate(org.apache.commons.collections.BidiMap)
*/ 
public static org.apache.commons.collections.BidiMap decorate(org.apache.commons.collections.BidiMap p0){
	return org.apache.commons.collections.bidimap.UnmodifiableBidiMap.decorate(p0);
}
/**
*public static <K,V> org.apache.commons.collections4.BidiMap<K, V> org.apache.commons.collections4.bidimap.UnmodifiableBidiMap.unmodifiableBidiMap(org.apache.commons.collections4.BidiMap<? extends K, ? extends V>)
*/ 
public static <K,V> org.apache.commons.collections4.BidiMap<K, V> unmodifiableBidiMap(org.apache.commons.collections4.BidiMap<? extends K, ? extends V> p0){
	return org.apache.commons.collections4.bidimap.UnmodifiableBidiMap.unmodifiableBidiMap(p0);
}
}
