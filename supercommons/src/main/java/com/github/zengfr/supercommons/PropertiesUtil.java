package com.github.zengfr.supercommons;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class PropertiesUtil{ 
/**
*public static com.google.common.collect.ImmutableMap<java.lang.String, java.lang.String> com.google.common.collect.Maps.fromProperties(java.util.Properties)
*/ 
public static com.google.common.collect.ImmutableMap<java.lang.String, java.lang.String> fromProperties(java.util.Properties p0){
	return com.google.common.collect.Maps.fromProperties(p0);
}
/**
*public static java.util.Properties org.apache.commons.collections.MapUtils.toProperties(java.util.Map)
*/ 
public static java.util.Properties toProperties(java.util.Map p0){
	return org.apache.commons.collections.MapUtils.toProperties(p0);
}
/**
*public static org.apache.commons.collections.ExtendedProperties org.apache.commons.collections.ExtendedProperties.convertProperties(java.util.Properties)
*/ 
public static org.apache.commons.collections.ExtendedProperties convertProperties(java.util.Properties p0){
	return org.apache.commons.collections.ExtendedProperties.convertProperties(p0);
}
/**
*public static <K,V> java.util.Properties org.apache.commons.collections4.MapUtils.toProperties(java.util.Map<K, V>)
*/ 
public static <K,V> java.util.Properties toProperties(java.util.Map<K, V> p0){
	return org.apache.commons.collections4.MapUtils.toProperties(p0);
}
/**
*public static java.lang.String org.apache.commons.lang3.text.StrSubstitutor.replace(java.lang.Object,java.util.Properties)
*/ 
public static java.lang.String replace(java.lang.Object p0,java.util.Properties p1){
	return org.apache.commons.lang3.text.StrSubstitutor.replace(p0,p1);
}
}
