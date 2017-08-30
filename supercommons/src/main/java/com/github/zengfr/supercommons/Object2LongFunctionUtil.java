package com.github.zengfr.supercommons;
import java.util.*;
import java.util.Map.Entry;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Object2LongFunctionUtil{ 
/**
*public static <K> it.unimi.dsi.fastutil.objects.Object2LongFunction<K> it.unimi.dsi.fastutil.objects.Object2LongFunctions.primitive(java.util.function.Function<? super K, ? extends java.lang.Long>)
*/ 
public static <K> it.unimi.dsi.fastutil.objects.Object2LongFunction<K> primitive(java.util.function.Function<? super K, ? extends java.lang.Long> p0){
	return it.unimi.dsi.fastutil.objects.Object2LongFunctions.primitive(p0);
}
/**
*public static <K> it.unimi.dsi.fastutil.objects.Object2LongFunction<K> it.unimi.dsi.fastutil.objects.Object2LongFunctions.singleton(K,java.lang.Long)
*/ 
public static <K> it.unimi.dsi.fastutil.objects.Object2LongFunction<K> singleton(K p0,java.lang.Long p1){
	return it.unimi.dsi.fastutil.objects.Object2LongFunctions.singleton(p0,p1);
}
/**
*public static <K> it.unimi.dsi.fastutil.objects.Object2LongFunction<K> it.unimi.dsi.fastutil.objects.Object2LongFunctions.singleton(K,long)
*/ 
public static <K> it.unimi.dsi.fastutil.objects.Object2LongFunction<K> singleton(K p0,long p1){
	return it.unimi.dsi.fastutil.objects.Object2LongFunctions.singleton(p0,p1);
}
/**
*public static <K> it.unimi.dsi.fastutil.objects.Object2LongFunction<K> it.unimi.dsi.fastutil.objects.Object2LongFunctions.synchronize(it.unimi.dsi.fastutil.objects.Object2LongFunction<K>,java.lang.Object)
*/ 
public static <K> it.unimi.dsi.fastutil.objects.Object2LongFunction<K> synchronize(it.unimi.dsi.fastutil.objects.Object2LongFunction<K> p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.objects.Object2LongFunctions.synchronize(p0,p1);
}
/**
*public static <K> it.unimi.dsi.fastutil.objects.Object2LongFunction<K> it.unimi.dsi.fastutil.objects.Object2LongFunctions.synchronize(it.unimi.dsi.fastutil.objects.Object2LongFunction<K>)
*/ 
public static <K> it.unimi.dsi.fastutil.objects.Object2LongFunction<K> synchronize(it.unimi.dsi.fastutil.objects.Object2LongFunction<K> p0){
	return it.unimi.dsi.fastutil.objects.Object2LongFunctions.synchronize(p0);
}
/**
*public static <K> it.unimi.dsi.fastutil.objects.Object2LongFunction<K> it.unimi.dsi.fastutil.objects.Object2LongFunctions.unmodifiable(it.unimi.dsi.fastutil.objects.Object2LongFunction<K>)
*/ 
public static <K> it.unimi.dsi.fastutil.objects.Object2LongFunction<K> unmodifiable(it.unimi.dsi.fastutil.objects.Object2LongFunction<K> p0){
	return it.unimi.dsi.fastutil.objects.Object2LongFunctions.unmodifiable(p0);
}
}
