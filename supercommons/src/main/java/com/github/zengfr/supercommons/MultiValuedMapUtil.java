package com.github.zengfr.supercommons;
import java.util.*;
import java.util.Map.Entry;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class MultiValuedMapUtil{ 
/**
*public static <K,V> org.apache.commons.collections4.MultiValuedMap<K, V> org.apache.commons.collections4.MultiMapUtils.emptyIfNull(org.apache.commons.collections4.MultiValuedMap<K, V>)
*/ 
public static <K,V> org.apache.commons.collections4.MultiValuedMap<K, V> emptyIfNull(org.apache.commons.collections4.MultiValuedMap<K, V> p0){
	return org.apache.commons.collections4.MultiMapUtils.emptyIfNull(p0);
}
/**
*public static <K,V> org.apache.commons.collections4.MultiValuedMap<K, V> org.apache.commons.collections4.MultiMapUtils.emptyMultiValuedMap()
*/ 
public static <K,V> org.apache.commons.collections4.MultiValuedMap<K, V> emptyMultiValuedMap(){
	return org.apache.commons.collections4.MultiMapUtils.emptyMultiValuedMap();
}
/**
*public static <K,V> org.apache.commons.collections4.MultiValuedMap<K, V> org.apache.commons.collections4.MultiMapUtils.transformedMultiValuedMap(org.apache.commons.collections4.MultiValuedMap<K, V>,org.apache.commons.collections4.Transformer<? super K, ? extends K>,org.apache.commons.collections4.Transformer<? super V, ? extends V>)
*/ 
public static <K,V> org.apache.commons.collections4.MultiValuedMap<K, V> transformedMultiValuedMap(org.apache.commons.collections4.MultiValuedMap<K, V> p0,org.apache.commons.collections4.Transformer<? super K, ? extends K> p1,org.apache.commons.collections4.Transformer<? super V, ? extends V> p2){
	return org.apache.commons.collections4.MultiMapUtils.transformedMultiValuedMap(p0,p1,p2);
}
/**
*public static <K,V> org.apache.commons.collections4.MultiValuedMap<K, V> org.apache.commons.collections4.MultiMapUtils.unmodifiableMultiValuedMap(org.apache.commons.collections4.MultiValuedMap<? extends K, ? extends V>)
*/ 
public static <K,V> org.apache.commons.collections4.MultiValuedMap<K, V> unmodifiableMultiValuedMap(org.apache.commons.collections4.MultiValuedMap<? extends K, ? extends V> p0){
	return org.apache.commons.collections4.MultiMapUtils.unmodifiableMultiValuedMap(p0);
}
}
