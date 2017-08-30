package com.github.zengfr.supercommons;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Int2ObjectFunctionUtil{ 
/**
*public static <V> it.unimi.dsi.fastutil.ints.Int2ObjectFunction<V> it.unimi.dsi.fastutil.ints.Int2ObjectFunctions.singleton(java.lang.Integer,V)
*/ 
public static <V> it.unimi.dsi.fastutil.ints.Int2ObjectFunction<V> singleton(java.lang.Integer p0,V p1){
	return it.unimi.dsi.fastutil.ints.Int2ObjectFunctions.singleton(p0,p1);
}
/**
*public static <V> it.unimi.dsi.fastutil.ints.Int2ObjectFunction<V> it.unimi.dsi.fastutil.ints.Int2ObjectFunctions.singleton(int,V)
*/ 
public static <V> it.unimi.dsi.fastutil.ints.Int2ObjectFunction<V> singleton(int p0,V p1){
	return it.unimi.dsi.fastutil.ints.Int2ObjectFunctions.singleton(p0,p1);
}
/**
*public static <V> it.unimi.dsi.fastutil.ints.Int2ObjectFunction<V> it.unimi.dsi.fastutil.ints.Int2ObjectFunctions.synchronize(it.unimi.dsi.fastutil.ints.Int2ObjectFunction<V>,java.lang.Object)
*/ 
public static <V> it.unimi.dsi.fastutil.ints.Int2ObjectFunction<V> synchronize(it.unimi.dsi.fastutil.ints.Int2ObjectFunction<V> p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.ints.Int2ObjectFunctions.synchronize(p0,p1);
}
/**
*public static <V> it.unimi.dsi.fastutil.ints.Int2ObjectFunction<V> it.unimi.dsi.fastutil.ints.Int2ObjectFunctions.synchronize(it.unimi.dsi.fastutil.ints.Int2ObjectFunction<V>)
*/ 
public static <V> it.unimi.dsi.fastutil.ints.Int2ObjectFunction<V> synchronize(it.unimi.dsi.fastutil.ints.Int2ObjectFunction<V> p0){
	return it.unimi.dsi.fastutil.ints.Int2ObjectFunctions.synchronize(p0);
}
/**
*public static <V> it.unimi.dsi.fastutil.ints.Int2ObjectFunction<V> it.unimi.dsi.fastutil.ints.Int2ObjectFunctions.unmodifiable(it.unimi.dsi.fastutil.ints.Int2ObjectFunction<V>)
*/ 
public static <V> it.unimi.dsi.fastutil.ints.Int2ObjectFunction<V> unmodifiable(it.unimi.dsi.fastutil.ints.Int2ObjectFunction<V> p0){
	return it.unimi.dsi.fastutil.ints.Int2ObjectFunctions.unmodifiable(p0);
}
/**
*public static <V> it.unimi.dsi.fastutil.ints.Int2ObjectFunction<V> it.unimi.dsi.fastutil.ints.Int2ObjectFunctions.primitive(java.util.function.Function<? super java.lang.Integer, ? extends V>)
*/ 
public static <V> it.unimi.dsi.fastutil.ints.Int2ObjectFunction<V> primitive(java.util.function.Function<? super java.lang.Integer, ? extends V> p0){
	return it.unimi.dsi.fastutil.ints.Int2ObjectFunctions.primitive(p0);
}
}
