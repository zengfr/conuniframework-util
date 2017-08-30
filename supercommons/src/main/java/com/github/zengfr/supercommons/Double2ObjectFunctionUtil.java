package com.github.zengfr.supercommons;
import java.util.*;
import java.util.Map.Entry;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Double2ObjectFunctionUtil{ 
/**
*public static <V> it.unimi.dsi.fastutil.doubles.Double2ObjectFunction<V> it.unimi.dsi.fastutil.doubles.Double2ObjectFunctions.primitive(java.util.function.Function<? super java.lang.Double, ? extends V>)
*/ 
public static <V> it.unimi.dsi.fastutil.doubles.Double2ObjectFunction<V> primitive(java.util.function.Function<? super java.lang.Double, ? extends V> p0){
	return it.unimi.dsi.fastutil.doubles.Double2ObjectFunctions.primitive(p0);
}
/**
*public static <V> it.unimi.dsi.fastutil.doubles.Double2ObjectFunction<V> it.unimi.dsi.fastutil.doubles.Double2ObjectFunctions.singleton(java.lang.Double,V)
*/ 
public static <V> it.unimi.dsi.fastutil.doubles.Double2ObjectFunction<V> singleton(java.lang.Double p0,V p1){
	return it.unimi.dsi.fastutil.doubles.Double2ObjectFunctions.singleton(p0,p1);
}
/**
*public static <V> it.unimi.dsi.fastutil.doubles.Double2ObjectFunction<V> it.unimi.dsi.fastutil.doubles.Double2ObjectFunctions.singleton(double,V)
*/ 
public static <V> it.unimi.dsi.fastutil.doubles.Double2ObjectFunction<V> singleton(double p0,V p1){
	return it.unimi.dsi.fastutil.doubles.Double2ObjectFunctions.singleton(p0,p1);
}
/**
*public static <V> it.unimi.dsi.fastutil.doubles.Double2ObjectFunction<V> it.unimi.dsi.fastutil.doubles.Double2ObjectFunctions.synchronize(it.unimi.dsi.fastutil.doubles.Double2ObjectFunction<V>)
*/ 
public static <V> it.unimi.dsi.fastutil.doubles.Double2ObjectFunction<V> synchronize(it.unimi.dsi.fastutil.doubles.Double2ObjectFunction<V> p0){
	return it.unimi.dsi.fastutil.doubles.Double2ObjectFunctions.synchronize(p0);
}
/**
*public static <V> it.unimi.dsi.fastutil.doubles.Double2ObjectFunction<V> it.unimi.dsi.fastutil.doubles.Double2ObjectFunctions.synchronize(it.unimi.dsi.fastutil.doubles.Double2ObjectFunction<V>,java.lang.Object)
*/ 
public static <V> it.unimi.dsi.fastutil.doubles.Double2ObjectFunction<V> synchronize(it.unimi.dsi.fastutil.doubles.Double2ObjectFunction<V> p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.doubles.Double2ObjectFunctions.synchronize(p0,p1);
}
/**
*public static <V> it.unimi.dsi.fastutil.doubles.Double2ObjectFunction<V> it.unimi.dsi.fastutil.doubles.Double2ObjectFunctions.unmodifiable(it.unimi.dsi.fastutil.doubles.Double2ObjectFunction<V>)
*/ 
public static <V> it.unimi.dsi.fastutil.doubles.Double2ObjectFunction<V> unmodifiable(it.unimi.dsi.fastutil.doubles.Double2ObjectFunction<V> p0){
	return it.unimi.dsi.fastutil.doubles.Double2ObjectFunctions.unmodifiable(p0);
}
}
