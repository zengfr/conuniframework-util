package com.github.zengfr.supercommons;
import java.util.*;
import java.util.Map.Entry;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Float2ReferenceFunctionUtil{ 
/**
*public static <V> it.unimi.dsi.fastutil.floats.Float2ReferenceFunction<V> it.unimi.dsi.fastutil.floats.Float2ReferenceFunctions.primitive(java.util.function.Function<? super java.lang.Float, ? extends V>)
*/ 
public static <V> it.unimi.dsi.fastutil.floats.Float2ReferenceFunction<V> primitive(java.util.function.Function<? super java.lang.Float, ? extends V> p0){
	return it.unimi.dsi.fastutil.floats.Float2ReferenceFunctions.primitive(p0);
}
/**
*public static <V> it.unimi.dsi.fastutil.floats.Float2ReferenceFunction<V> it.unimi.dsi.fastutil.floats.Float2ReferenceFunctions.singleton(java.lang.Float,V)
*/ 
public static <V> it.unimi.dsi.fastutil.floats.Float2ReferenceFunction<V> singleton(java.lang.Float p0,V p1){
	return it.unimi.dsi.fastutil.floats.Float2ReferenceFunctions.singleton(p0,p1);
}
/**
*public static <V> it.unimi.dsi.fastutil.floats.Float2ReferenceFunction<V> it.unimi.dsi.fastutil.floats.Float2ReferenceFunctions.singleton(float,V)
*/ 
public static <V> it.unimi.dsi.fastutil.floats.Float2ReferenceFunction<V> singleton(float p0,V p1){
	return it.unimi.dsi.fastutil.floats.Float2ReferenceFunctions.singleton(p0,p1);
}
/**
*public static <V> it.unimi.dsi.fastutil.floats.Float2ReferenceFunction<V> it.unimi.dsi.fastutil.floats.Float2ReferenceFunctions.synchronize(it.unimi.dsi.fastutil.floats.Float2ReferenceFunction<V>)
*/ 
public static <V> it.unimi.dsi.fastutil.floats.Float2ReferenceFunction<V> synchronize(it.unimi.dsi.fastutil.floats.Float2ReferenceFunction<V> p0){
	return it.unimi.dsi.fastutil.floats.Float2ReferenceFunctions.synchronize(p0);
}
/**
*public static <V> it.unimi.dsi.fastutil.floats.Float2ReferenceFunction<V> it.unimi.dsi.fastutil.floats.Float2ReferenceFunctions.synchronize(it.unimi.dsi.fastutil.floats.Float2ReferenceFunction<V>,java.lang.Object)
*/ 
public static <V> it.unimi.dsi.fastutil.floats.Float2ReferenceFunction<V> synchronize(it.unimi.dsi.fastutil.floats.Float2ReferenceFunction<V> p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.floats.Float2ReferenceFunctions.synchronize(p0,p1);
}
/**
*public static <V> it.unimi.dsi.fastutil.floats.Float2ReferenceFunction<V> it.unimi.dsi.fastutil.floats.Float2ReferenceFunctions.unmodifiable(it.unimi.dsi.fastutil.floats.Float2ReferenceFunction<V>)
*/ 
public static <V> it.unimi.dsi.fastutil.floats.Float2ReferenceFunction<V> unmodifiable(it.unimi.dsi.fastutil.floats.Float2ReferenceFunction<V> p0){
	return it.unimi.dsi.fastutil.floats.Float2ReferenceFunctions.unmodifiable(p0);
}
}
