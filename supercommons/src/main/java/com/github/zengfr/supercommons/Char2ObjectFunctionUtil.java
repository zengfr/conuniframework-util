package com.github.zengfr.supercommons;
import java.util.*;
import java.util.Map.Entry;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Char2ObjectFunctionUtil{ 
/**
*public static <V> it.unimi.dsi.fastutil.chars.Char2ObjectFunction<V> it.unimi.dsi.fastutil.chars.Char2ObjectFunctions.primitive(java.util.function.Function<? super java.lang.Character, ? extends V>)
*/ 
public static <V> it.unimi.dsi.fastutil.chars.Char2ObjectFunction<V> primitive(java.util.function.Function<? super java.lang.Character, ? extends V> p0){
	return it.unimi.dsi.fastutil.chars.Char2ObjectFunctions.primitive(p0);
}
/**
*public static <V> it.unimi.dsi.fastutil.chars.Char2ObjectFunction<V> it.unimi.dsi.fastutil.chars.Char2ObjectFunctions.singleton(java.lang.Character,V)
*/ 
public static <V> it.unimi.dsi.fastutil.chars.Char2ObjectFunction<V> singleton(java.lang.Character p0,V p1){
	return it.unimi.dsi.fastutil.chars.Char2ObjectFunctions.singleton(p0,p1);
}
/**
*public static <V> it.unimi.dsi.fastutil.chars.Char2ObjectFunction<V> it.unimi.dsi.fastutil.chars.Char2ObjectFunctions.singleton(char,V)
*/ 
public static <V> it.unimi.dsi.fastutil.chars.Char2ObjectFunction<V> singleton(char p0,V p1){
	return it.unimi.dsi.fastutil.chars.Char2ObjectFunctions.singleton(p0,p1);
}
/**
*public static <V> it.unimi.dsi.fastutil.chars.Char2ObjectFunction<V> it.unimi.dsi.fastutil.chars.Char2ObjectFunctions.synchronize(it.unimi.dsi.fastutil.chars.Char2ObjectFunction<V>)
*/ 
public static <V> it.unimi.dsi.fastutil.chars.Char2ObjectFunction<V> synchronize(it.unimi.dsi.fastutil.chars.Char2ObjectFunction<V> p0){
	return it.unimi.dsi.fastutil.chars.Char2ObjectFunctions.synchronize(p0);
}
/**
*public static <V> it.unimi.dsi.fastutil.chars.Char2ObjectFunction<V> it.unimi.dsi.fastutil.chars.Char2ObjectFunctions.synchronize(it.unimi.dsi.fastutil.chars.Char2ObjectFunction<V>,java.lang.Object)
*/ 
public static <V> it.unimi.dsi.fastutil.chars.Char2ObjectFunction<V> synchronize(it.unimi.dsi.fastutil.chars.Char2ObjectFunction<V> p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.chars.Char2ObjectFunctions.synchronize(p0,p1);
}
/**
*public static <V> it.unimi.dsi.fastutil.chars.Char2ObjectFunction<V> it.unimi.dsi.fastutil.chars.Char2ObjectFunctions.unmodifiable(it.unimi.dsi.fastutil.chars.Char2ObjectFunction<V>)
*/ 
public static <V> it.unimi.dsi.fastutil.chars.Char2ObjectFunction<V> unmodifiable(it.unimi.dsi.fastutil.chars.Char2ObjectFunction<V> p0){
	return it.unimi.dsi.fastutil.chars.Char2ObjectFunctions.unmodifiable(p0);
}
}
