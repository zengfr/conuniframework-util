package com.github.zengfr.supercommons;
import java.util.*;
import java.util.Map.Entry;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Byte2ObjectFunctionUtil{ 
/**
*public static <V> it.unimi.dsi.fastutil.bytes.Byte2ObjectFunction<V> it.unimi.dsi.fastutil.bytes.Byte2ObjectFunctions.primitive(java.util.function.Function<? super java.lang.Byte, ? extends V>)
*/ 
public static <V> it.unimi.dsi.fastutil.bytes.Byte2ObjectFunction<V> primitive(java.util.function.Function<? super java.lang.Byte, ? extends V> p0){
	return it.unimi.dsi.fastutil.bytes.Byte2ObjectFunctions.primitive(p0);
}
/**
*public static <V> it.unimi.dsi.fastutil.bytes.Byte2ObjectFunction<V> it.unimi.dsi.fastutil.bytes.Byte2ObjectFunctions.singleton(java.lang.Byte,V)
*/ 
public static <V> it.unimi.dsi.fastutil.bytes.Byte2ObjectFunction<V> singleton(java.lang.Byte p0,V p1){
	return it.unimi.dsi.fastutil.bytes.Byte2ObjectFunctions.singleton(p0,p1);
}
/**
*public static <V> it.unimi.dsi.fastutil.bytes.Byte2ObjectFunction<V> it.unimi.dsi.fastutil.bytes.Byte2ObjectFunctions.singleton(byte,V)
*/ 
public static <V> it.unimi.dsi.fastutil.bytes.Byte2ObjectFunction<V> singleton(byte p0,V p1){
	return it.unimi.dsi.fastutil.bytes.Byte2ObjectFunctions.singleton(p0,p1);
}
/**
*public static <V> it.unimi.dsi.fastutil.bytes.Byte2ObjectFunction<V> it.unimi.dsi.fastutil.bytes.Byte2ObjectFunctions.synchronize(it.unimi.dsi.fastutil.bytes.Byte2ObjectFunction<V>)
*/ 
public static <V> it.unimi.dsi.fastutil.bytes.Byte2ObjectFunction<V> synchronize(it.unimi.dsi.fastutil.bytes.Byte2ObjectFunction<V> p0){
	return it.unimi.dsi.fastutil.bytes.Byte2ObjectFunctions.synchronize(p0);
}
/**
*public static <V> it.unimi.dsi.fastutil.bytes.Byte2ObjectFunction<V> it.unimi.dsi.fastutil.bytes.Byte2ObjectFunctions.synchronize(it.unimi.dsi.fastutil.bytes.Byte2ObjectFunction<V>,java.lang.Object)
*/ 
public static <V> it.unimi.dsi.fastutil.bytes.Byte2ObjectFunction<V> synchronize(it.unimi.dsi.fastutil.bytes.Byte2ObjectFunction<V> p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.bytes.Byte2ObjectFunctions.synchronize(p0,p1);
}
/**
*public static <V> it.unimi.dsi.fastutil.bytes.Byte2ObjectFunction<V> it.unimi.dsi.fastutil.bytes.Byte2ObjectFunctions.unmodifiable(it.unimi.dsi.fastutil.bytes.Byte2ObjectFunction<V>)
*/ 
public static <V> it.unimi.dsi.fastutil.bytes.Byte2ObjectFunction<V> unmodifiable(it.unimi.dsi.fastutil.bytes.Byte2ObjectFunction<V> p0){
	return it.unimi.dsi.fastutil.bytes.Byte2ObjectFunctions.unmodifiable(p0);
}
}
