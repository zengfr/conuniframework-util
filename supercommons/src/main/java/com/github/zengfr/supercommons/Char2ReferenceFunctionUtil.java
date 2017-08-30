package com.github.zengfr.supercommons;
import java.util.*;
import java.util.Map.Entry;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Char2ReferenceFunctionUtil{ 
/**
*public static <V> it.unimi.dsi.fastutil.chars.Char2ReferenceFunction<V> it.unimi.dsi.fastutil.chars.Char2ReferenceFunctions.primitive(java.util.function.Function<? super java.lang.Character, ? extends V>)
*/ 
public static <V> it.unimi.dsi.fastutil.chars.Char2ReferenceFunction<V> primitive(java.util.function.Function<? super java.lang.Character, ? extends V> p0){
	return it.unimi.dsi.fastutil.chars.Char2ReferenceFunctions.primitive(p0);
}
/**
*public static <V> it.unimi.dsi.fastutil.chars.Char2ReferenceFunction<V> it.unimi.dsi.fastutil.chars.Char2ReferenceFunctions.singleton(java.lang.Character,V)
*/ 
public static <V> it.unimi.dsi.fastutil.chars.Char2ReferenceFunction<V> singleton(java.lang.Character p0,V p1){
	return it.unimi.dsi.fastutil.chars.Char2ReferenceFunctions.singleton(p0,p1);
}
/**
*public static <V> it.unimi.dsi.fastutil.chars.Char2ReferenceFunction<V> it.unimi.dsi.fastutil.chars.Char2ReferenceFunctions.singleton(char,V)
*/ 
public static <V> it.unimi.dsi.fastutil.chars.Char2ReferenceFunction<V> singleton(char p0,V p1){
	return it.unimi.dsi.fastutil.chars.Char2ReferenceFunctions.singleton(p0,p1);
}
/**
*public static <V> it.unimi.dsi.fastutil.chars.Char2ReferenceFunction<V> it.unimi.dsi.fastutil.chars.Char2ReferenceFunctions.synchronize(it.unimi.dsi.fastutil.chars.Char2ReferenceFunction<V>)
*/ 
public static <V> it.unimi.dsi.fastutil.chars.Char2ReferenceFunction<V> synchronize(it.unimi.dsi.fastutil.chars.Char2ReferenceFunction<V> p0){
	return it.unimi.dsi.fastutil.chars.Char2ReferenceFunctions.synchronize(p0);
}
/**
*public static <V> it.unimi.dsi.fastutil.chars.Char2ReferenceFunction<V> it.unimi.dsi.fastutil.chars.Char2ReferenceFunctions.synchronize(it.unimi.dsi.fastutil.chars.Char2ReferenceFunction<V>,java.lang.Object)
*/ 
public static <V> it.unimi.dsi.fastutil.chars.Char2ReferenceFunction<V> synchronize(it.unimi.dsi.fastutil.chars.Char2ReferenceFunction<V> p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.chars.Char2ReferenceFunctions.synchronize(p0,p1);
}
/**
*public static <V> it.unimi.dsi.fastutil.chars.Char2ReferenceFunction<V> it.unimi.dsi.fastutil.chars.Char2ReferenceFunctions.unmodifiable(it.unimi.dsi.fastutil.chars.Char2ReferenceFunction<V>)
*/ 
public static <V> it.unimi.dsi.fastutil.chars.Char2ReferenceFunction<V> unmodifiable(it.unimi.dsi.fastutil.chars.Char2ReferenceFunction<V> p0){
	return it.unimi.dsi.fastutil.chars.Char2ReferenceFunctions.unmodifiable(p0);
}
}
