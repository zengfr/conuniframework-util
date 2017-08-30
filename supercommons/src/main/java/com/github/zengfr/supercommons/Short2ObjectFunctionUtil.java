package com.github.zengfr.supercommons;
import java.util.*;
import java.util.Map.Entry;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Short2ObjectFunctionUtil{ 
/**
*public static <V> it.unimi.dsi.fastutil.shorts.Short2ObjectFunction<V> it.unimi.dsi.fastutil.shorts.Short2ObjectFunctions.primitive(java.util.function.Function<? super java.lang.Short, ? extends V>)
*/ 
public static <V> it.unimi.dsi.fastutil.shorts.Short2ObjectFunction<V> primitive(java.util.function.Function<? super java.lang.Short, ? extends V> p0){
	return it.unimi.dsi.fastutil.shorts.Short2ObjectFunctions.primitive(p0);
}
/**
*public static <V> it.unimi.dsi.fastutil.shorts.Short2ObjectFunction<V> it.unimi.dsi.fastutil.shorts.Short2ObjectFunctions.singleton(java.lang.Short,V)
*/ 
public static <V> it.unimi.dsi.fastutil.shorts.Short2ObjectFunction<V> singleton(java.lang.Short p0,V p1){
	return it.unimi.dsi.fastutil.shorts.Short2ObjectFunctions.singleton(p0,p1);
}
/**
*public static <V> it.unimi.dsi.fastutil.shorts.Short2ObjectFunction<V> it.unimi.dsi.fastutil.shorts.Short2ObjectFunctions.singleton(short,V)
*/ 
public static <V> it.unimi.dsi.fastutil.shorts.Short2ObjectFunction<V> singleton(short p0,V p1){
	return it.unimi.dsi.fastutil.shorts.Short2ObjectFunctions.singleton(p0,p1);
}
/**
*public static <V> it.unimi.dsi.fastutil.shorts.Short2ObjectFunction<V> it.unimi.dsi.fastutil.shorts.Short2ObjectFunctions.synchronize(it.unimi.dsi.fastutil.shorts.Short2ObjectFunction<V>)
*/ 
public static <V> it.unimi.dsi.fastutil.shorts.Short2ObjectFunction<V> synchronize(it.unimi.dsi.fastutil.shorts.Short2ObjectFunction<V> p0){
	return it.unimi.dsi.fastutil.shorts.Short2ObjectFunctions.synchronize(p0);
}
/**
*public static <V> it.unimi.dsi.fastutil.shorts.Short2ObjectFunction<V> it.unimi.dsi.fastutil.shorts.Short2ObjectFunctions.synchronize(it.unimi.dsi.fastutil.shorts.Short2ObjectFunction<V>,java.lang.Object)
*/ 
public static <V> it.unimi.dsi.fastutil.shorts.Short2ObjectFunction<V> synchronize(it.unimi.dsi.fastutil.shorts.Short2ObjectFunction<V> p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.shorts.Short2ObjectFunctions.synchronize(p0,p1);
}
/**
*public static <V> it.unimi.dsi.fastutil.shorts.Short2ObjectFunction<V> it.unimi.dsi.fastutil.shorts.Short2ObjectFunctions.unmodifiable(it.unimi.dsi.fastutil.shorts.Short2ObjectFunction<V>)
*/ 
public static <V> it.unimi.dsi.fastutil.shorts.Short2ObjectFunction<V> unmodifiable(it.unimi.dsi.fastutil.shorts.Short2ObjectFunction<V> p0){
	return it.unimi.dsi.fastutil.shorts.Short2ObjectFunctions.unmodifiable(p0);
}
}
