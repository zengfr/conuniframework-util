package com.github.zengfr.supercommons;
import it.unimi.dsi.fastutil.floats.Float2IntFunctions;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Float2IntFunctionUtil{ 
public static it.unimi.dsi.fastutil.floats.Float2IntFunction singleton(float p0,int p1){
return Float2IntFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.floats.Float2IntFunction singleton(java.lang.Float p0,java.lang.Integer p1){
return Float2IntFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.floats.Float2IntFunction primitive(java.util.function.Function<? super java.lang.Float, ? extends java.lang.Integer> p0){
return Float2IntFunctions.primitive(p0);
}
public static it.unimi.dsi.fastutil.floats.Float2IntFunction unmodifiable(it.unimi.dsi.fastutil.floats.Float2IntFunction p0){
return Float2IntFunctions.unmodifiable(p0);
}
public static it.unimi.dsi.fastutil.floats.Float2IntFunction synchronize(it.unimi.dsi.fastutil.floats.Float2IntFunction p0){
return Float2IntFunctions.synchronize(p0);
}
public static it.unimi.dsi.fastutil.floats.Float2IntFunction synchronize(it.unimi.dsi.fastutil.floats.Float2IntFunction p0,java.lang.Object p1){
return Float2IntFunctions.synchronize(p0,p1);
}
}
