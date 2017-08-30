package com.github.zengfr.supercommons;
import java.util.*;
import java.util.Map.Entry;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class MultiValueMapUtil{ 
/**
*public static org.apache.commons.collections.map.MultiValueMap org.apache.commons.collections.map.MultiValueMap.decorate(java.util.Map,java.lang.Class)
*/ 
public static org.apache.commons.collections.map.MultiValueMap decorate(java.util.Map p0,java.lang.Class p1){
	return org.apache.commons.collections.map.MultiValueMap.decorate(p0,p1);
}
/**
*public static org.apache.commons.collections.map.MultiValueMap org.apache.commons.collections.map.MultiValueMap.decorate(java.util.Map,org.apache.commons.collections.Factory)
*/ 
public static org.apache.commons.collections.map.MultiValueMap decorate(java.util.Map p0,org.apache.commons.collections.Factory p1){
	return org.apache.commons.collections.map.MultiValueMap.decorate(p0,p1);
}
/**
*public static org.apache.commons.collections.map.MultiValueMap org.apache.commons.collections.map.MultiValueMap.decorate(java.util.Map)
*/ 
public static org.apache.commons.collections.map.MultiValueMap decorate(java.util.Map p0){
	return org.apache.commons.collections.map.MultiValueMap.decorate(p0);
}
/**
*public static <K,V,C> org.apache.commons.collections4.map.MultiValueMap<K, V> org.apache.commons.collections4.MapUtils.multiValueMap(java.util.Map<K, C>,java.lang.Class<C>)
*/ 
public static <K,V,C extends java.util.Collection<V> > org.apache.commons.collections4.map.MultiValueMap<K, V> multiValueMap(java.util.Map<K, C> p0,java.lang.Class<C> p1){
	return org.apache.commons.collections4.MapUtils.multiValueMap(p0,p1);
}
/**
*public static <K,V,C> org.apache.commons.collections4.map.MultiValueMap<K, V> org.apache.commons.collections4.MapUtils.multiValueMap(java.util.Map<K, C>,org.apache.commons.collections4.Factory<C>)
*/ 
public static <K,V,C extends java.util.Collection<V> > org.apache.commons.collections4.map.MultiValueMap<K, V> multiValueMap(java.util.Map<K, C> p0,org.apache.commons.collections4.Factory<C> p1){
	return org.apache.commons.collections4.MapUtils.multiValueMap(p0,p1);
}
/**
*public static <K,V> org.apache.commons.collections4.map.MultiValueMap<K, V> org.apache.commons.collections4.MapUtils.multiValueMap(java.util.Map<K, ? super java.util.Collection<V>>)
*/ 
public static <K,V> org.apache.commons.collections4.map.MultiValueMap<K, V> multiValueMap(java.util.Map<K, ? super java.util.Collection<V>> p0){
	return org.apache.commons.collections4.MapUtils.multiValueMap(p0);
}
/**
*public static <K,V,C> org.apache.commons.collections4.map.MultiValueMap<K, V> org.apache.commons.collections4.map.MultiValueMap.multiValueMap(java.util.Map<K, ? super C>,org.apache.commons.collections4.Factory<C>)
*/ 
public static <K,V,C extends java.util.Collection<V> > org.apache.commons.collections4.map.MultiValueMap<K, V> multiValueMap(java.util.Map<K, ? super C> p0,org.apache.commons.collections4.Factory<C> p1){
	return org.apache.commons.collections4.map.MultiValueMap.multiValueMap(p0,p1);
}
/**
*public static <K,V,C> org.apache.commons.collections4.map.MultiValueMap<K, V> org.apache.commons.collections4.map.MultiValueMap.multiValueMap(java.util.Map<K, ? super C>,java.lang.Class<C>)
*/ 
public static <K,V,C extends java.util.Collection<V> > org.apache.commons.collections4.map.MultiValueMap<K, V> multiValueMap(java.util.Map<K, ? super C> p0,java.lang.Class<C> p1){
	return org.apache.commons.collections4.map.MultiValueMap.multiValueMap(p0,p1);
}
}
