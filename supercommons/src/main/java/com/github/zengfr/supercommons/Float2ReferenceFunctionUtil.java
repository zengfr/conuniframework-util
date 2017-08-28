package com.zengfr.supercommons;
import it.unimi.dsi.fastutil.floats.Float2ReferenceFunctions;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Float2ReferenceFunctionUtil{ 
public static <V> it.unimi.dsi.fastutil.floats.Float2ReferenceFunction<V> singleton(java.lang.Float p0,V p1){
return Float2ReferenceFunctions.singleton(p0,p1);
}
public static <V> it.unimi.dsi.fastutil.floats.Float2ReferenceFunction<V> singleton(float p0,V p1){
return Float2ReferenceFunctions.singleton(p0,p1);
}
public static <V> it.unimi.dsi.fastutil.floats.Float2ReferenceFunction<V> unmodifiable(it.unimi.dsi.fastutil.floats.Float2ReferenceFunction<V> p0){
return Float2ReferenceFunctions.unmodifiable(p0);
}
public static <V> it.unimi.dsi.fastutil.floats.Float2ReferenceFunction<V> primitive(java.util.function.Function<? super java.lang.Float, ? extends V> p0){
return Float2ReferenceFunctions.primitive(p0);
}
public static <V> it.unimi.dsi.fastutil.floats.Float2ReferenceFunction<V> synchronize(it.unimi.dsi.fastutil.floats.Float2ReferenceFunction<V> p0){
return Float2ReferenceFunctions.synchronize(p0);
}
public static <V> it.unimi.dsi.fastutil.floats.Float2ReferenceFunction<V> synchronize(it.unimi.dsi.fastutil.floats.Float2ReferenceFunction<V> p0,java.lang.Object p1){
return Float2ReferenceFunctions.synchronize(p0,p1);
}
}
