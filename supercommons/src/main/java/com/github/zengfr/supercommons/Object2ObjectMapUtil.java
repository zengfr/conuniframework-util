package com.github.zengfr.supercommons;
import java.util.*;
import java.util.Map.Entry;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Object2ObjectMapUtil{ 
/**
*public static <K,V> it.unimi.dsi.fastutil.objects.Object2ObjectMap<K, V> it.unimi.dsi.fastutil.objects.Object2ObjectMaps.emptyMap()
*/ 
public static <K,V> it.unimi.dsi.fastutil.objects.Object2ObjectMap<K, V> emptyMap(){
	return it.unimi.dsi.fastutil.objects.Object2ObjectMaps.emptyMap();
}
/**
*public static <K,V> it.unimi.dsi.fastutil.objects.Object2ObjectMap<K, V> it.unimi.dsi.fastutil.objects.Object2ObjectMaps.singleton(K,V)
*/ 
public static <K,V> it.unimi.dsi.fastutil.objects.Object2ObjectMap<K, V> singleton(K p0,V p1){
	return it.unimi.dsi.fastutil.objects.Object2ObjectMaps.singleton(p0,p1);
}
/**
*public static <K,V> it.unimi.dsi.fastutil.objects.Object2ObjectMap<K, V> it.unimi.dsi.fastutil.objects.Object2ObjectMaps.synchronize(it.unimi.dsi.fastutil.objects.Object2ObjectMap<K, V>,java.lang.Object)
*/ 
public static <K,V> it.unimi.dsi.fastutil.objects.Object2ObjectMap<K, V> synchronize(it.unimi.dsi.fastutil.objects.Object2ObjectMap<K, V> p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.objects.Object2ObjectMaps.synchronize(p0,p1);
}
/**
*public static <K,V> it.unimi.dsi.fastutil.objects.Object2ObjectMap<K, V> it.unimi.dsi.fastutil.objects.Object2ObjectMaps.synchronize(it.unimi.dsi.fastutil.objects.Object2ObjectMap<K, V>)
*/ 
public static <K,V> it.unimi.dsi.fastutil.objects.Object2ObjectMap<K, V> synchronize(it.unimi.dsi.fastutil.objects.Object2ObjectMap<K, V> p0){
	return it.unimi.dsi.fastutil.objects.Object2ObjectMaps.synchronize(p0);
}
/**
*public static <K,V> it.unimi.dsi.fastutil.objects.Object2ObjectMap<K, V> it.unimi.dsi.fastutil.objects.Object2ObjectMaps.unmodifiable(it.unimi.dsi.fastutil.objects.Object2ObjectMap<K, V>)
*/ 
public static <K,V> it.unimi.dsi.fastutil.objects.Object2ObjectMap<K, V> unmodifiable(it.unimi.dsi.fastutil.objects.Object2ObjectMap<K, V> p0){
	return it.unimi.dsi.fastutil.objects.Object2ObjectMaps.unmodifiable(p0);
}
}
