package com.zengfr.supercommons;
import it.unimi.dsi.fastutil.shorts.Short2ReferenceFunctions;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Short2ReferenceFunctionUtil{ 
public static <V> it.unimi.dsi.fastutil.shorts.Short2ReferenceFunction<V> singleton(java.lang.Short p0,V p1){
return Short2ReferenceFunctions.singleton(p0,p1);
}
public static <V> it.unimi.dsi.fastutil.shorts.Short2ReferenceFunction<V> singleton(short p0,V p1){
return Short2ReferenceFunctions.singleton(p0,p1);
}
public static <V> it.unimi.dsi.fastutil.shorts.Short2ReferenceFunction<V> unmodifiable(it.unimi.dsi.fastutil.shorts.Short2ReferenceFunction<V> p0){
return Short2ReferenceFunctions.unmodifiable(p0);
}
public static <V> it.unimi.dsi.fastutil.shorts.Short2ReferenceFunction<V> primitive(java.util.function.Function<? super java.lang.Short, ? extends V> p0){
return Short2ReferenceFunctions.primitive(p0);
}
public static <V> it.unimi.dsi.fastutil.shorts.Short2ReferenceFunction<V> synchronize(it.unimi.dsi.fastutil.shorts.Short2ReferenceFunction<V> p0){
return Short2ReferenceFunctions.synchronize(p0);
}
public static <V> it.unimi.dsi.fastutil.shorts.Short2ReferenceFunction<V> synchronize(it.unimi.dsi.fastutil.shorts.Short2ReferenceFunction<V> p0,java.lang.Object p1){
return Short2ReferenceFunctions.synchronize(p0,p1);
}
}
