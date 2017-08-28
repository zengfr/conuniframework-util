package com.github.zengfr.supercommons;
import it.unimi.dsi.fastutil.ints.Int2ReferenceFunctions;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Int2ReferenceFunctionUtil{ 
public static <V> it.unimi.dsi.fastutil.ints.Int2ReferenceFunction<V> singleton(int p0,V p1){
return Int2ReferenceFunctions.singleton(p0,p1);
}
public static <V> it.unimi.dsi.fastutil.ints.Int2ReferenceFunction<V> singleton(java.lang.Integer p0,V p1){
return Int2ReferenceFunctions.singleton(p0,p1);
}
public static <V> it.unimi.dsi.fastutil.ints.Int2ReferenceFunction<V> primitive(java.util.function.Function<? super java.lang.Integer, ? extends V> p0){
return Int2ReferenceFunctions.primitive(p0);
}
public static <V> it.unimi.dsi.fastutil.ints.Int2ReferenceFunction<V> unmodifiable(it.unimi.dsi.fastutil.ints.Int2ReferenceFunction<V> p0){
return Int2ReferenceFunctions.unmodifiable(p0);
}
public static <V> it.unimi.dsi.fastutil.ints.Int2ReferenceFunction<V> synchronize(it.unimi.dsi.fastutil.ints.Int2ReferenceFunction<V> p0){
return Int2ReferenceFunctions.synchronize(p0);
}
public static <V> it.unimi.dsi.fastutil.ints.Int2ReferenceFunction<V> synchronize(it.unimi.dsi.fastutil.ints.Int2ReferenceFunction<V> p0,java.lang.Object p1){
return Int2ReferenceFunctions.synchronize(p0,p1);
}
}
