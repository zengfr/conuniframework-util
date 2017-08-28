package com.zengfr.supercommons;
import it.unimi.dsi.fastutil.floats.Float2FloatFunctions;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Float2FloatFunctionUtil{ 
public static it.unimi.dsi.fastutil.floats.Float2FloatFunction singleton(java.lang.Float p0,java.lang.Float p1){
return Float2FloatFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.floats.Float2FloatFunction singleton(float p0,float p1){
return Float2FloatFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.floats.Float2FloatFunction unmodifiable(it.unimi.dsi.fastutil.floats.Float2FloatFunction p0){
return Float2FloatFunctions.unmodifiable(p0);
}
public static it.unimi.dsi.fastutil.floats.Float2FloatFunction primitive(java.util.function.Function<? super java.lang.Float, ? extends java.lang.Float> p0){
return Float2FloatFunctions.primitive(p0);
}
public static it.unimi.dsi.fastutil.floats.Float2FloatFunction synchronize(it.unimi.dsi.fastutil.floats.Float2FloatFunction p0,java.lang.Object p1){
return Float2FloatFunctions.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.floats.Float2FloatFunction synchronize(it.unimi.dsi.fastutil.floats.Float2FloatFunction p0){
return Float2FloatFunctions.synchronize(p0);
}
}
