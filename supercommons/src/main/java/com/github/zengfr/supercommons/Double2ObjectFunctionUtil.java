package com.zengfr.supercommons;
import it.unimi.dsi.fastutil.doubles.Double2ObjectFunctions;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Double2ObjectFunctionUtil{ 
public static <V> it.unimi.dsi.fastutil.doubles.Double2ObjectFunction<V> singleton(java.lang.Double p0,V p1){
return Double2ObjectFunctions.singleton(p0,p1);
}
public static <V> it.unimi.dsi.fastutil.doubles.Double2ObjectFunction<V> singleton(double p0,V p1){
return Double2ObjectFunctions.singleton(p0,p1);
}
public static <V> it.unimi.dsi.fastutil.doubles.Double2ObjectFunction<V> unmodifiable(it.unimi.dsi.fastutil.doubles.Double2ObjectFunction<V> p0){
return Double2ObjectFunctions.unmodifiable(p0);
}
public static <V> it.unimi.dsi.fastutil.doubles.Double2ObjectFunction<V> primitive(java.util.function.Function<? super java.lang.Double, ? extends V> p0){
return Double2ObjectFunctions.primitive(p0);
}
public static <V> it.unimi.dsi.fastutil.doubles.Double2ObjectFunction<V> synchronize(it.unimi.dsi.fastutil.doubles.Double2ObjectFunction<V> p0){
return Double2ObjectFunctions.synchronize(p0);
}
public static <V> it.unimi.dsi.fastutil.doubles.Double2ObjectFunction<V> synchronize(it.unimi.dsi.fastutil.doubles.Double2ObjectFunction<V> p0,java.lang.Object p1){
return Double2ObjectFunctions.synchronize(p0,p1);
}
}
