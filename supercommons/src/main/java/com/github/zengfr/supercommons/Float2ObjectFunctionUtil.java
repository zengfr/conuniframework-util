package com.github.zengfr.supercommons;
import java.util.*;
import java.util.Map.Entry;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Float2ObjectFunctionUtil{ 
/**
*public static <V> it.unimi.dsi.fastutil.floats.Float2ObjectFunction<V> it.unimi.dsi.fastutil.floats.Float2ObjectFunctions.primitive(java.util.function.Function<? super java.lang.Float, ? extends V>)
*/ 
public static <V> it.unimi.dsi.fastutil.floats.Float2ObjectFunction<V> primitive(java.util.function.Function<? super java.lang.Float, ? extends V> p0){
	return it.unimi.dsi.fastutil.floats.Float2ObjectFunctions.primitive(p0);
}
/**
*public static <V> it.unimi.dsi.fastutil.floats.Float2ObjectFunction<V> it.unimi.dsi.fastutil.floats.Float2ObjectFunctions.singleton(java.lang.Float,V)
*/ 
public static <V> it.unimi.dsi.fastutil.floats.Float2ObjectFunction<V> singleton(java.lang.Float p0,V p1){
	return it.unimi.dsi.fastutil.floats.Float2ObjectFunctions.singleton(p0,p1);
}
/**
*public static <V> it.unimi.dsi.fastutil.floats.Float2ObjectFunction<V> it.unimi.dsi.fastutil.floats.Float2ObjectFunctions.singleton(float,V)
*/ 
public static <V> it.unimi.dsi.fastutil.floats.Float2ObjectFunction<V> singleton(float p0,V p1){
	return it.unimi.dsi.fastutil.floats.Float2ObjectFunctions.singleton(p0,p1);
}
/**
*public static <V> it.unimi.dsi.fastutil.floats.Float2ObjectFunction<V> it.unimi.dsi.fastutil.floats.Float2ObjectFunctions.synchronize(it.unimi.dsi.fastutil.floats.Float2ObjectFunction<V>)
*/ 
public static <V> it.unimi.dsi.fastutil.floats.Float2ObjectFunction<V> synchronize(it.unimi.dsi.fastutil.floats.Float2ObjectFunction<V> p0){
	return it.unimi.dsi.fastutil.floats.Float2ObjectFunctions.synchronize(p0);
}
/**
*public static <V> it.unimi.dsi.fastutil.floats.Float2ObjectFunction<V> it.unimi.dsi.fastutil.floats.Float2ObjectFunctions.synchronize(it.unimi.dsi.fastutil.floats.Float2ObjectFunction<V>,java.lang.Object)
*/ 
public static <V> it.unimi.dsi.fastutil.floats.Float2ObjectFunction<V> synchronize(it.unimi.dsi.fastutil.floats.Float2ObjectFunction<V> p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.floats.Float2ObjectFunctions.synchronize(p0,p1);
}
/**
*public static <V> it.unimi.dsi.fastutil.floats.Float2ObjectFunction<V> it.unimi.dsi.fastutil.floats.Float2ObjectFunctions.unmodifiable(it.unimi.dsi.fastutil.floats.Float2ObjectFunction<V>)
*/ 
public static <V> it.unimi.dsi.fastutil.floats.Float2ObjectFunction<V> unmodifiable(it.unimi.dsi.fastutil.floats.Float2ObjectFunction<V> p0){
	return it.unimi.dsi.fastutil.floats.Float2ObjectFunctions.unmodifiable(p0);
}
}
