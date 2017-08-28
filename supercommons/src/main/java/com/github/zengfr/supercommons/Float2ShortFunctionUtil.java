package com.github.zengfr.supercommons;
import it.unimi.dsi.fastutil.floats.Float2ShortFunctions;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Float2ShortFunctionUtil{ 
public static it.unimi.dsi.fastutil.floats.Float2ShortFunction singleton(float p0,short p1){
return Float2ShortFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.floats.Float2ShortFunction singleton(java.lang.Float p0,java.lang.Short p1){
return Float2ShortFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.floats.Float2ShortFunction primitive(java.util.function.Function<? super java.lang.Float, ? extends java.lang.Short> p0){
return Float2ShortFunctions.primitive(p0);
}
public static it.unimi.dsi.fastutil.floats.Float2ShortFunction unmodifiable(it.unimi.dsi.fastutil.floats.Float2ShortFunction p0){
return Float2ShortFunctions.unmodifiable(p0);
}
public static it.unimi.dsi.fastutil.floats.Float2ShortFunction synchronize(it.unimi.dsi.fastutil.floats.Float2ShortFunction p0){
return Float2ShortFunctions.synchronize(p0);
}
public static it.unimi.dsi.fastutil.floats.Float2ShortFunction synchronize(it.unimi.dsi.fastutil.floats.Float2ShortFunction p0,java.lang.Object p1){
return Float2ShortFunctions.synchronize(p0,p1);
}
}
