package com.zengfr.supercommons;
import it.unimi.dsi.fastutil.longs.Long2ObjectFunctions;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Long2ObjectFunctionUtil{ 
public static <V> it.unimi.dsi.fastutil.longs.Long2ObjectFunction<V> singleton(java.lang.Long p0,V p1){
return Long2ObjectFunctions.singleton(p0,p1);
}
public static <V> it.unimi.dsi.fastutil.longs.Long2ObjectFunction<V> singleton(long p0,V p1){
return Long2ObjectFunctions.singleton(p0,p1);
}
public static <V> it.unimi.dsi.fastutil.longs.Long2ObjectFunction<V> unmodifiable(it.unimi.dsi.fastutil.longs.Long2ObjectFunction<V> p0){
return Long2ObjectFunctions.unmodifiable(p0);
}
public static <V> it.unimi.dsi.fastutil.longs.Long2ObjectFunction<V> primitive(java.util.function.Function<? super java.lang.Long, ? extends V> p0){
return Long2ObjectFunctions.primitive(p0);
}
public static <V> it.unimi.dsi.fastutil.longs.Long2ObjectFunction<V> synchronize(it.unimi.dsi.fastutil.longs.Long2ObjectFunction<V> p0){
return Long2ObjectFunctions.synchronize(p0);
}
public static <V> it.unimi.dsi.fastutil.longs.Long2ObjectFunction<V> synchronize(it.unimi.dsi.fastutil.longs.Long2ObjectFunction<V> p0,java.lang.Object p1){
return Long2ObjectFunctions.synchronize(p0,p1);
}
}
