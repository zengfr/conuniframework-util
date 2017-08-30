package com.github.zengfr.supercommons;
import java.util.*;
import java.util.Map.Entry;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Int2ReferenceFunctionUtil{ 
/**
*public static <V> it.unimi.dsi.fastutil.ints.Int2ReferenceFunction<V> it.unimi.dsi.fastutil.ints.Int2ReferenceFunctions.primitive(java.util.function.Function<? super java.lang.Integer, ? extends V>)
*/ 
public static <V> it.unimi.dsi.fastutil.ints.Int2ReferenceFunction<V> primitive(java.util.function.Function<? super java.lang.Integer, ? extends V> p0){
	return it.unimi.dsi.fastutil.ints.Int2ReferenceFunctions.primitive(p0);
}
/**
*public static <V> it.unimi.dsi.fastutil.ints.Int2ReferenceFunction<V> it.unimi.dsi.fastutil.ints.Int2ReferenceFunctions.singleton(java.lang.Integer,V)
*/ 
public static <V> it.unimi.dsi.fastutil.ints.Int2ReferenceFunction<V> singleton(java.lang.Integer p0,V p1){
	return it.unimi.dsi.fastutil.ints.Int2ReferenceFunctions.singleton(p0,p1);
}
/**
*public static <V> it.unimi.dsi.fastutil.ints.Int2ReferenceFunction<V> it.unimi.dsi.fastutil.ints.Int2ReferenceFunctions.singleton(int,V)
*/ 
public static <V> it.unimi.dsi.fastutil.ints.Int2ReferenceFunction<V> singleton(int p0,V p1){
	return it.unimi.dsi.fastutil.ints.Int2ReferenceFunctions.singleton(p0,p1);
}
/**
*public static <V> it.unimi.dsi.fastutil.ints.Int2ReferenceFunction<V> it.unimi.dsi.fastutil.ints.Int2ReferenceFunctions.synchronize(it.unimi.dsi.fastutil.ints.Int2ReferenceFunction<V>)
*/ 
public static <V> it.unimi.dsi.fastutil.ints.Int2ReferenceFunction<V> synchronize(it.unimi.dsi.fastutil.ints.Int2ReferenceFunction<V> p0){
	return it.unimi.dsi.fastutil.ints.Int2ReferenceFunctions.synchronize(p0);
}
/**
*public static <V> it.unimi.dsi.fastutil.ints.Int2ReferenceFunction<V> it.unimi.dsi.fastutil.ints.Int2ReferenceFunctions.synchronize(it.unimi.dsi.fastutil.ints.Int2ReferenceFunction<V>,java.lang.Object)
*/ 
public static <V> it.unimi.dsi.fastutil.ints.Int2ReferenceFunction<V> synchronize(it.unimi.dsi.fastutil.ints.Int2ReferenceFunction<V> p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.ints.Int2ReferenceFunctions.synchronize(p0,p1);
}
/**
*public static <V> it.unimi.dsi.fastutil.ints.Int2ReferenceFunction<V> it.unimi.dsi.fastutil.ints.Int2ReferenceFunctions.unmodifiable(it.unimi.dsi.fastutil.ints.Int2ReferenceFunction<V>)
*/ 
public static <V> it.unimi.dsi.fastutil.ints.Int2ReferenceFunction<V> unmodifiable(it.unimi.dsi.fastutil.ints.Int2ReferenceFunction<V> p0){
	return it.unimi.dsi.fastutil.ints.Int2ReferenceFunctions.unmodifiable(p0);
}
}
