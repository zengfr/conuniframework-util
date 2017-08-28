package com.github.zengfr.supercommons;
import it.unimi.dsi.fastutil.shorts.Short2ObjectFunctions;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Short2ObjectFunctionUtil{ 
public static <V> it.unimi.dsi.fastutil.shorts.Short2ObjectFunction<V> singleton(short p0,V p1){
return Short2ObjectFunctions.singleton(p0,p1);
}
public static <V> it.unimi.dsi.fastutil.shorts.Short2ObjectFunction<V> singleton(java.lang.Short p0,V p1){
return Short2ObjectFunctions.singleton(p0,p1);
}
public static <V> it.unimi.dsi.fastutil.shorts.Short2ObjectFunction<V> primitive(java.util.function.Function<? super java.lang.Short, ? extends V> p0){
return Short2ObjectFunctions.primitive(p0);
}
public static <V> it.unimi.dsi.fastutil.shorts.Short2ObjectFunction<V> unmodifiable(it.unimi.dsi.fastutil.shorts.Short2ObjectFunction<V> p0){
return Short2ObjectFunctions.unmodifiable(p0);
}
public static <V> it.unimi.dsi.fastutil.shorts.Short2ObjectFunction<V> synchronize(it.unimi.dsi.fastutil.shorts.Short2ObjectFunction<V> p0){
return Short2ObjectFunctions.synchronize(p0);
}
public static <V> it.unimi.dsi.fastutil.shorts.Short2ObjectFunction<V> synchronize(it.unimi.dsi.fastutil.shorts.Short2ObjectFunction<V> p0,java.lang.Object p1){
return Short2ObjectFunctions.synchronize(p0,p1);
}
}
