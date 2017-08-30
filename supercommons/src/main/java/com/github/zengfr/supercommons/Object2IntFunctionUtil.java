package com.github.zengfr.supercommons;
import java.util.*;
import java.util.Map.Entry;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Object2IntFunctionUtil{ 
/**
*public static <K> it.unimi.dsi.fastutil.objects.Object2IntFunction<K> it.unimi.dsi.fastutil.objects.Object2IntFunctions.primitive(java.util.function.Function<? super K, ? extends java.lang.Integer>)
*/ 
public static <K> it.unimi.dsi.fastutil.objects.Object2IntFunction<K> primitive(java.util.function.Function<? super K, ? extends java.lang.Integer> p0){
	return it.unimi.dsi.fastutil.objects.Object2IntFunctions.primitive(p0);
}
/**
*public static <K> it.unimi.dsi.fastutil.objects.Object2IntFunction<K> it.unimi.dsi.fastutil.objects.Object2IntFunctions.singleton(K,java.lang.Integer)
*/ 
public static <K> it.unimi.dsi.fastutil.objects.Object2IntFunction<K> singleton(K p0,java.lang.Integer p1){
	return it.unimi.dsi.fastutil.objects.Object2IntFunctions.singleton(p0,p1);
}
/**
*public static <K> it.unimi.dsi.fastutil.objects.Object2IntFunction<K> it.unimi.dsi.fastutil.objects.Object2IntFunctions.singleton(K,int)
*/ 
public static <K> it.unimi.dsi.fastutil.objects.Object2IntFunction<K> singleton(K p0,int p1){
	return it.unimi.dsi.fastutil.objects.Object2IntFunctions.singleton(p0,p1);
}
/**
*public static <K> it.unimi.dsi.fastutil.objects.Object2IntFunction<K> it.unimi.dsi.fastutil.objects.Object2IntFunctions.synchronize(it.unimi.dsi.fastutil.objects.Object2IntFunction<K>,java.lang.Object)
*/ 
public static <K> it.unimi.dsi.fastutil.objects.Object2IntFunction<K> synchronize(it.unimi.dsi.fastutil.objects.Object2IntFunction<K> p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.objects.Object2IntFunctions.synchronize(p0,p1);
}
/**
*public static <K> it.unimi.dsi.fastutil.objects.Object2IntFunction<K> it.unimi.dsi.fastutil.objects.Object2IntFunctions.synchronize(it.unimi.dsi.fastutil.objects.Object2IntFunction<K>)
*/ 
public static <K> it.unimi.dsi.fastutil.objects.Object2IntFunction<K> synchronize(it.unimi.dsi.fastutil.objects.Object2IntFunction<K> p0){
	return it.unimi.dsi.fastutil.objects.Object2IntFunctions.synchronize(p0);
}
/**
*public static <K> it.unimi.dsi.fastutil.objects.Object2IntFunction<K> it.unimi.dsi.fastutil.objects.Object2IntFunctions.unmodifiable(it.unimi.dsi.fastutil.objects.Object2IntFunction<K>)
*/ 
public static <K> it.unimi.dsi.fastutil.objects.Object2IntFunction<K> unmodifiable(it.unimi.dsi.fastutil.objects.Object2IntFunction<K> p0){
	return it.unimi.dsi.fastutil.objects.Object2IntFunctions.unmodifiable(p0);
}
}
