package com.github.zengfr.supercommons;
import java.util.*;
import java.util.Map.Entry;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Double2ReferenceFunctionUtil{ 
/**
*public static <V> it.unimi.dsi.fastutil.doubles.Double2ReferenceFunction<V> it.unimi.dsi.fastutil.doubles.Double2ReferenceFunctions.primitive(java.util.function.Function<? super java.lang.Double, ? extends V>)
*/ 
public static <V> it.unimi.dsi.fastutil.doubles.Double2ReferenceFunction<V> primitive(java.util.function.Function<? super java.lang.Double, ? extends V> p0){
	return it.unimi.dsi.fastutil.doubles.Double2ReferenceFunctions.primitive(p0);
}
/**
*public static <V> it.unimi.dsi.fastutil.doubles.Double2ReferenceFunction<V> it.unimi.dsi.fastutil.doubles.Double2ReferenceFunctions.singleton(java.lang.Double,V)
*/ 
public static <V> it.unimi.dsi.fastutil.doubles.Double2ReferenceFunction<V> singleton(java.lang.Double p0,V p1){
	return it.unimi.dsi.fastutil.doubles.Double2ReferenceFunctions.singleton(p0,p1);
}
/**
*public static <V> it.unimi.dsi.fastutil.doubles.Double2ReferenceFunction<V> it.unimi.dsi.fastutil.doubles.Double2ReferenceFunctions.singleton(double,V)
*/ 
public static <V> it.unimi.dsi.fastutil.doubles.Double2ReferenceFunction<V> singleton(double p0,V p1){
	return it.unimi.dsi.fastutil.doubles.Double2ReferenceFunctions.singleton(p0,p1);
}
/**
*public static <V> it.unimi.dsi.fastutil.doubles.Double2ReferenceFunction<V> it.unimi.dsi.fastutil.doubles.Double2ReferenceFunctions.synchronize(it.unimi.dsi.fastutil.doubles.Double2ReferenceFunction<V>)
*/ 
public static <V> it.unimi.dsi.fastutil.doubles.Double2ReferenceFunction<V> synchronize(it.unimi.dsi.fastutil.doubles.Double2ReferenceFunction<V> p0){
	return it.unimi.dsi.fastutil.doubles.Double2ReferenceFunctions.synchronize(p0);
}
/**
*public static <V> it.unimi.dsi.fastutil.doubles.Double2ReferenceFunction<V> it.unimi.dsi.fastutil.doubles.Double2ReferenceFunctions.synchronize(it.unimi.dsi.fastutil.doubles.Double2ReferenceFunction<V>,java.lang.Object)
*/ 
public static <V> it.unimi.dsi.fastutil.doubles.Double2ReferenceFunction<V> synchronize(it.unimi.dsi.fastutil.doubles.Double2ReferenceFunction<V> p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.doubles.Double2ReferenceFunctions.synchronize(p0,p1);
}
/**
*public static <V> it.unimi.dsi.fastutil.doubles.Double2ReferenceFunction<V> it.unimi.dsi.fastutil.doubles.Double2ReferenceFunctions.unmodifiable(it.unimi.dsi.fastutil.doubles.Double2ReferenceFunction<V>)
*/ 
public static <V> it.unimi.dsi.fastutil.doubles.Double2ReferenceFunction<V> unmodifiable(it.unimi.dsi.fastutil.doubles.Double2ReferenceFunction<V> p0){
	return it.unimi.dsi.fastutil.doubles.Double2ReferenceFunctions.unmodifiable(p0);
}
}
