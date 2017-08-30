package com.github.zengfr.supercommons;
import java.util.*;
import java.util.Map.Entry;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class MapIteratorUtil{ 
/**
*public static org.apache.commons.collections.MapIterator org.apache.commons.collections.iterators.UnmodifiableMapIterator.decorate(org.apache.commons.collections.MapIterator)
*/ 
public static org.apache.commons.collections.MapIterator decorate(org.apache.commons.collections.MapIterator p0){
	return org.apache.commons.collections.iterators.UnmodifiableMapIterator.decorate(p0);
}
/**
*public static <K,V> org.apache.commons.collections4.MapIterator<K, V> org.apache.commons.collections4.IteratorUtils.emptyMapIterator()
*/ 
public static <K,V> org.apache.commons.collections4.MapIterator<K, V> emptyMapIterator(){
	return org.apache.commons.collections4.IteratorUtils.emptyMapIterator();
}
/**
*public static <K,V> org.apache.commons.collections4.MapIterator<K, V> org.apache.commons.collections4.IteratorUtils.unmodifiableMapIterator(org.apache.commons.collections4.MapIterator<K, V>)
*/ 
public static <K,V> org.apache.commons.collections4.MapIterator<K, V> unmodifiableMapIterator(org.apache.commons.collections4.MapIterator<K, V> p0){
	return org.apache.commons.collections4.IteratorUtils.unmodifiableMapIterator(p0);
}
/**
*public static <K,V> org.apache.commons.collections4.MapIterator<K, V> org.apache.commons.collections4.iterators.UnmodifiableMapIterator.unmodifiableMapIterator(org.apache.commons.collections4.MapIterator<? extends K, ? extends V>)
*/ 
public static <K,V> org.apache.commons.collections4.MapIterator<K, V> unmodifiableMapIterator(org.apache.commons.collections4.MapIterator<? extends K, ? extends V> p0){
	return org.apache.commons.collections4.iterators.UnmodifiableMapIterator.unmodifiableMapIterator(p0);
}
/**
*public static org.apache.commons.collections.MapIterator org.apache.commons.collections.IteratorUtils.unmodifiableMapIterator(org.apache.commons.collections.MapIterator)
*/ 
public static org.apache.commons.collections.MapIterator unmodifiableMapIterator(org.apache.commons.collections.MapIterator p0){
	return org.apache.commons.collections.IteratorUtils.unmodifiableMapIterator(p0);
}
}
