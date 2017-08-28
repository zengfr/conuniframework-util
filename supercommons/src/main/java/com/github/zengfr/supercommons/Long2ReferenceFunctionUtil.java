package com.zengfr.supercommons;
import it.unimi.dsi.fastutil.longs.Long2ReferenceFunctions;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Long2ReferenceFunctionUtil{ 
public static <V> it.unimi.dsi.fastutil.longs.Long2ReferenceFunction<V> singleton(java.lang.Long p0,V p1){
return Long2ReferenceFunctions.singleton(p0,p1);
}
public static <V> it.unimi.dsi.fastutil.longs.Long2ReferenceFunction<V> singleton(long p0,V p1){
return Long2ReferenceFunctions.singleton(p0,p1);
}
public static <V> it.unimi.dsi.fastutil.longs.Long2ReferenceFunction<V> unmodifiable(it.unimi.dsi.fastutil.longs.Long2ReferenceFunction<V> p0){
return Long2ReferenceFunctions.unmodifiable(p0);
}
public static <V> it.unimi.dsi.fastutil.longs.Long2ReferenceFunction<V> primitive(java.util.function.Function<? super java.lang.Long, ? extends V> p0){
return Long2ReferenceFunctions.primitive(p0);
}
public static <V> it.unimi.dsi.fastutil.longs.Long2ReferenceFunction<V> synchronize(it.unimi.dsi.fastutil.longs.Long2ReferenceFunction<V> p0){
return Long2ReferenceFunctions.synchronize(p0);
}
public static <V> it.unimi.dsi.fastutil.longs.Long2ReferenceFunction<V> synchronize(it.unimi.dsi.fastutil.longs.Long2ReferenceFunction<V> p0,java.lang.Object p1){
return Long2ReferenceFunctions.synchronize(p0,p1);
}
}
