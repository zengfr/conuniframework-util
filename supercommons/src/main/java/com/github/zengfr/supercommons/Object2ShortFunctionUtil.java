package com.github.zengfr.supercommons;
import java.util.*;
import java.util.Map.Entry;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Object2ShortFunctionUtil{ 
/**
*public static <K> it.unimi.dsi.fastutil.objects.Object2ShortFunction<K> it.unimi.dsi.fastutil.objects.Object2ShortFunctions.primitive(java.util.function.Function<? super K, ? extends java.lang.Short>)
*/ 
public static <K> it.unimi.dsi.fastutil.objects.Object2ShortFunction<K> primitive(java.util.function.Function<? super K, ? extends java.lang.Short> p0){
	return it.unimi.dsi.fastutil.objects.Object2ShortFunctions.primitive(p0);
}
/**
*public static <K> it.unimi.dsi.fastutil.objects.Object2ShortFunction<K> it.unimi.dsi.fastutil.objects.Object2ShortFunctions.singleton(K,java.lang.Short)
*/ 
public static <K> it.unimi.dsi.fastutil.objects.Object2ShortFunction<K> singleton(K p0,java.lang.Short p1){
	return it.unimi.dsi.fastutil.objects.Object2ShortFunctions.singleton(p0,p1);
}
/**
*public static <K> it.unimi.dsi.fastutil.objects.Object2ShortFunction<K> it.unimi.dsi.fastutil.objects.Object2ShortFunctions.singleton(K,short)
*/ 
public static <K> it.unimi.dsi.fastutil.objects.Object2ShortFunction<K> singleton(K p0,short p1){
	return it.unimi.dsi.fastutil.objects.Object2ShortFunctions.singleton(p0,p1);
}
/**
*public static <K> it.unimi.dsi.fastutil.objects.Object2ShortFunction<K> it.unimi.dsi.fastutil.objects.Object2ShortFunctions.synchronize(it.unimi.dsi.fastutil.objects.Object2ShortFunction<K>,java.lang.Object)
*/ 
public static <K> it.unimi.dsi.fastutil.objects.Object2ShortFunction<K> synchronize(it.unimi.dsi.fastutil.objects.Object2ShortFunction<K> p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.objects.Object2ShortFunctions.synchronize(p0,p1);
}
/**
*public static <K> it.unimi.dsi.fastutil.objects.Object2ShortFunction<K> it.unimi.dsi.fastutil.objects.Object2ShortFunctions.synchronize(it.unimi.dsi.fastutil.objects.Object2ShortFunction<K>)
*/ 
public static <K> it.unimi.dsi.fastutil.objects.Object2ShortFunction<K> synchronize(it.unimi.dsi.fastutil.objects.Object2ShortFunction<K> p0){
	return it.unimi.dsi.fastutil.objects.Object2ShortFunctions.synchronize(p0);
}
/**
*public static <K> it.unimi.dsi.fastutil.objects.Object2ShortFunction<K> it.unimi.dsi.fastutil.objects.Object2ShortFunctions.unmodifiable(it.unimi.dsi.fastutil.objects.Object2ShortFunction<K>)
*/ 
public static <K> it.unimi.dsi.fastutil.objects.Object2ShortFunction<K> unmodifiable(it.unimi.dsi.fastutil.objects.Object2ShortFunction<K> p0){
	return it.unimi.dsi.fastutil.objects.Object2ShortFunctions.unmodifiable(p0);
}
}
