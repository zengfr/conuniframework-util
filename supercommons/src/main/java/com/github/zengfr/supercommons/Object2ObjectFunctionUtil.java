package com.github.zengfr.supercommons;
import java.util.*;
import java.util.Map.Entry;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Object2ObjectFunctionUtil{ 
/**
*public static <K,V> it.unimi.dsi.fastutil.objects.Object2ObjectFunction<K, V> it.unimi.dsi.fastutil.objects.Object2ObjectFunctions.singleton(K,V)
*/ 
public static <K,V> it.unimi.dsi.fastutil.objects.Object2ObjectFunction<K, V> singleton(K p0,V p1){
	return it.unimi.dsi.fastutil.objects.Object2ObjectFunctions.singleton(p0,p1);
}
/**
*public static <K,V> it.unimi.dsi.fastutil.objects.Object2ObjectFunction<K, V> it.unimi.dsi.fastutil.objects.Object2ObjectFunctions.synchronize(it.unimi.dsi.fastutil.objects.Object2ObjectFunction<K, V>,java.lang.Object)
*/ 
public static <K,V> it.unimi.dsi.fastutil.objects.Object2ObjectFunction<K, V> synchronize(it.unimi.dsi.fastutil.objects.Object2ObjectFunction<K, V> p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.objects.Object2ObjectFunctions.synchronize(p0,p1);
}
/**
*public static <K,V> it.unimi.dsi.fastutil.objects.Object2ObjectFunction<K, V> it.unimi.dsi.fastutil.objects.Object2ObjectFunctions.synchronize(it.unimi.dsi.fastutil.objects.Object2ObjectFunction<K, V>)
*/ 
public static <K,V> it.unimi.dsi.fastutil.objects.Object2ObjectFunction<K, V> synchronize(it.unimi.dsi.fastutil.objects.Object2ObjectFunction<K, V> p0){
	return it.unimi.dsi.fastutil.objects.Object2ObjectFunctions.synchronize(p0);
}
/**
*public static <K,V> it.unimi.dsi.fastutil.objects.Object2ObjectFunction<K, V> it.unimi.dsi.fastutil.objects.Object2ObjectFunctions.unmodifiable(it.unimi.dsi.fastutil.objects.Object2ObjectFunction<K, V>)
*/ 
public static <K,V> it.unimi.dsi.fastutil.objects.Object2ObjectFunction<K, V> unmodifiable(it.unimi.dsi.fastutil.objects.Object2ObjectFunction<K, V> p0){
	return it.unimi.dsi.fastutil.objects.Object2ObjectFunctions.unmodifiable(p0);
}
}
