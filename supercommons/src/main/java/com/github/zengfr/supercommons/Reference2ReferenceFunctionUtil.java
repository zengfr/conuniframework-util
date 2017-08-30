package com.github.zengfr.supercommons;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Reference2ReferenceFunctionUtil{ 
/**
*public static <K,V> it.unimi.dsi.fastutil.objects.Reference2ReferenceFunction<K, V> it.unimi.dsi.fastutil.objects.Reference2ReferenceFunctions.singleton(K,V)
*/ 
public static <K,V> it.unimi.dsi.fastutil.objects.Reference2ReferenceFunction<K, V> singleton(K p0,V p1){
	return it.unimi.dsi.fastutil.objects.Reference2ReferenceFunctions.singleton(p0,p1);
}
/**
*public static <K,V> it.unimi.dsi.fastutil.objects.Reference2ReferenceFunction<K, V> it.unimi.dsi.fastutil.objects.Reference2ReferenceFunctions.synchronize(it.unimi.dsi.fastutil.objects.Reference2ReferenceFunction<K, V>,java.lang.Object)
*/ 
public static <K,V> it.unimi.dsi.fastutil.objects.Reference2ReferenceFunction<K, V> synchronize(it.unimi.dsi.fastutil.objects.Reference2ReferenceFunction<K, V> p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.objects.Reference2ReferenceFunctions.synchronize(p0,p1);
}
/**
*public static <K,V> it.unimi.dsi.fastutil.objects.Reference2ReferenceFunction<K, V> it.unimi.dsi.fastutil.objects.Reference2ReferenceFunctions.synchronize(it.unimi.dsi.fastutil.objects.Reference2ReferenceFunction<K, V>)
*/ 
public static <K,V> it.unimi.dsi.fastutil.objects.Reference2ReferenceFunction<K, V> synchronize(it.unimi.dsi.fastutil.objects.Reference2ReferenceFunction<K, V> p0){
	return it.unimi.dsi.fastutil.objects.Reference2ReferenceFunctions.synchronize(p0);
}
/**
*public static <K,V> it.unimi.dsi.fastutil.objects.Reference2ReferenceFunction<K, V> it.unimi.dsi.fastutil.objects.Reference2ReferenceFunctions.unmodifiable(it.unimi.dsi.fastutil.objects.Reference2ReferenceFunction<K, V>)
*/ 
public static <K,V> it.unimi.dsi.fastutil.objects.Reference2ReferenceFunction<K, V> unmodifiable(it.unimi.dsi.fastutil.objects.Reference2ReferenceFunction<K, V> p0){
	return it.unimi.dsi.fastutil.objects.Reference2ReferenceFunctions.unmodifiable(p0);
}
}
