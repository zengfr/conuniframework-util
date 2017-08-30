package com.github.zengfr.supercommons;
import java.util.*;
import java.util.Map.Entry;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Long2ObjectFunctionUtil{ 
/**
*public static <V> it.unimi.dsi.fastutil.longs.Long2ObjectFunction<V> it.unimi.dsi.fastutil.longs.Long2ObjectFunctions.primitive(java.util.function.Function<? super java.lang.Long, ? extends V>)
*/ 
public static <V> it.unimi.dsi.fastutil.longs.Long2ObjectFunction<V> primitive(java.util.function.Function<? super java.lang.Long, ? extends V> p0){
	return it.unimi.dsi.fastutil.longs.Long2ObjectFunctions.primitive(p0);
}
/**
*public static <V> it.unimi.dsi.fastutil.longs.Long2ObjectFunction<V> it.unimi.dsi.fastutil.longs.Long2ObjectFunctions.singleton(java.lang.Long,V)
*/ 
public static <V> it.unimi.dsi.fastutil.longs.Long2ObjectFunction<V> singleton(java.lang.Long p0,V p1){
	return it.unimi.dsi.fastutil.longs.Long2ObjectFunctions.singleton(p0,p1);
}
/**
*public static <V> it.unimi.dsi.fastutil.longs.Long2ObjectFunction<V> it.unimi.dsi.fastutil.longs.Long2ObjectFunctions.singleton(long,V)
*/ 
public static <V> it.unimi.dsi.fastutil.longs.Long2ObjectFunction<V> singleton(long p0,V p1){
	return it.unimi.dsi.fastutil.longs.Long2ObjectFunctions.singleton(p0,p1);
}
/**
*public static <V> it.unimi.dsi.fastutil.longs.Long2ObjectFunction<V> it.unimi.dsi.fastutil.longs.Long2ObjectFunctions.synchronize(it.unimi.dsi.fastutil.longs.Long2ObjectFunction<V>)
*/ 
public static <V> it.unimi.dsi.fastutil.longs.Long2ObjectFunction<V> synchronize(it.unimi.dsi.fastutil.longs.Long2ObjectFunction<V> p0){
	return it.unimi.dsi.fastutil.longs.Long2ObjectFunctions.synchronize(p0);
}
/**
*public static <V> it.unimi.dsi.fastutil.longs.Long2ObjectFunction<V> it.unimi.dsi.fastutil.longs.Long2ObjectFunctions.synchronize(it.unimi.dsi.fastutil.longs.Long2ObjectFunction<V>,java.lang.Object)
*/ 
public static <V> it.unimi.dsi.fastutil.longs.Long2ObjectFunction<V> synchronize(it.unimi.dsi.fastutil.longs.Long2ObjectFunction<V> p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.longs.Long2ObjectFunctions.synchronize(p0,p1);
}
/**
*public static <V> it.unimi.dsi.fastutil.longs.Long2ObjectFunction<V> it.unimi.dsi.fastutil.longs.Long2ObjectFunctions.unmodifiable(it.unimi.dsi.fastutil.longs.Long2ObjectFunction<V>)
*/ 
public static <V> it.unimi.dsi.fastutil.longs.Long2ObjectFunction<V> unmodifiable(it.unimi.dsi.fastutil.longs.Long2ObjectFunction<V> p0){
	return it.unimi.dsi.fastutil.longs.Long2ObjectFunctions.unmodifiable(p0);
}
}
