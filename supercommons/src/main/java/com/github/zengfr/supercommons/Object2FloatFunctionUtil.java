package com.github.zengfr.supercommons;
import java.util.*;
import java.util.Map.Entry;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Object2FloatFunctionUtil{ 
/**
*public static <K> it.unimi.dsi.fastutil.objects.Object2FloatFunction<K> it.unimi.dsi.fastutil.objects.Object2FloatFunctions.primitive(java.util.function.Function<? super K, ? extends java.lang.Float>)
*/ 
public static <K> it.unimi.dsi.fastutil.objects.Object2FloatFunction<K> primitive(java.util.function.Function<? super K, ? extends java.lang.Float> p0){
	return it.unimi.dsi.fastutil.objects.Object2FloatFunctions.primitive(p0);
}
/**
*public static <K> it.unimi.dsi.fastutil.objects.Object2FloatFunction<K> it.unimi.dsi.fastutil.objects.Object2FloatFunctions.singleton(K,java.lang.Float)
*/ 
public static <K> it.unimi.dsi.fastutil.objects.Object2FloatFunction<K> singleton(K p0,java.lang.Float p1){
	return it.unimi.dsi.fastutil.objects.Object2FloatFunctions.singleton(p0,p1);
}
/**
*public static <K> it.unimi.dsi.fastutil.objects.Object2FloatFunction<K> it.unimi.dsi.fastutil.objects.Object2FloatFunctions.singleton(K,float)
*/ 
public static <K> it.unimi.dsi.fastutil.objects.Object2FloatFunction<K> singleton(K p0,float p1){
	return it.unimi.dsi.fastutil.objects.Object2FloatFunctions.singleton(p0,p1);
}
/**
*public static <K> it.unimi.dsi.fastutil.objects.Object2FloatFunction<K> it.unimi.dsi.fastutil.objects.Object2FloatFunctions.synchronize(it.unimi.dsi.fastutil.objects.Object2FloatFunction<K>,java.lang.Object)
*/ 
public static <K> it.unimi.dsi.fastutil.objects.Object2FloatFunction<K> synchronize(it.unimi.dsi.fastutil.objects.Object2FloatFunction<K> p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.objects.Object2FloatFunctions.synchronize(p0,p1);
}
/**
*public static <K> it.unimi.dsi.fastutil.objects.Object2FloatFunction<K> it.unimi.dsi.fastutil.objects.Object2FloatFunctions.synchronize(it.unimi.dsi.fastutil.objects.Object2FloatFunction<K>)
*/ 
public static <K> it.unimi.dsi.fastutil.objects.Object2FloatFunction<K> synchronize(it.unimi.dsi.fastutil.objects.Object2FloatFunction<K> p0){
	return it.unimi.dsi.fastutil.objects.Object2FloatFunctions.synchronize(p0);
}
/**
*public static <K> it.unimi.dsi.fastutil.objects.Object2FloatFunction<K> it.unimi.dsi.fastutil.objects.Object2FloatFunctions.unmodifiable(it.unimi.dsi.fastutil.objects.Object2FloatFunction<K>)
*/ 
public static <K> it.unimi.dsi.fastutil.objects.Object2FloatFunction<K> unmodifiable(it.unimi.dsi.fastutil.objects.Object2FloatFunction<K> p0){
	return it.unimi.dsi.fastutil.objects.Object2FloatFunctions.unmodifiable(p0);
}
}
