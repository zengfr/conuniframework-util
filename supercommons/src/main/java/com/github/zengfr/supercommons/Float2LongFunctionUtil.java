package com.github.zengfr.supercommons;
import it.unimi.dsi.fastutil.floats.Float2LongFunctions;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Float2LongFunctionUtil{ 
public static it.unimi.dsi.fastutil.floats.Float2LongFunction singleton(float p0,long p1){
return Float2LongFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.floats.Float2LongFunction singleton(java.lang.Float p0,java.lang.Long p1){
return Float2LongFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.floats.Float2LongFunction primitive(java.util.function.Function<? super java.lang.Float, ? extends java.lang.Long> p0){
return Float2LongFunctions.primitive(p0);
}
public static it.unimi.dsi.fastutil.floats.Float2LongFunction unmodifiable(it.unimi.dsi.fastutil.floats.Float2LongFunction p0){
return Float2LongFunctions.unmodifiable(p0);
}
public static it.unimi.dsi.fastutil.floats.Float2LongFunction synchronize(it.unimi.dsi.fastutil.floats.Float2LongFunction p0){
return Float2LongFunctions.synchronize(p0);
}
public static it.unimi.dsi.fastutil.floats.Float2LongFunction synchronize(it.unimi.dsi.fastutil.floats.Float2LongFunction p0,java.lang.Object p1){
return Float2LongFunctions.synchronize(p0,p1);
}
}
