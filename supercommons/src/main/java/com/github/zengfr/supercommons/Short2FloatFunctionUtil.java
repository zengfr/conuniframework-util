package com.github.zengfr.supercommons;
import it.unimi.dsi.fastutil.shorts.Short2FloatFunctions;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Short2FloatFunctionUtil{ 
public static it.unimi.dsi.fastutil.shorts.Short2FloatFunction singleton(short p0,float p1){
return Short2FloatFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.shorts.Short2FloatFunction singleton(java.lang.Short p0,java.lang.Float p1){
return Short2FloatFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.shorts.Short2FloatFunction primitive(java.util.function.Function<? super java.lang.Short, ? extends java.lang.Float> p0){
return Short2FloatFunctions.primitive(p0);
}
public static it.unimi.dsi.fastutil.shorts.Short2FloatFunction unmodifiable(it.unimi.dsi.fastutil.shorts.Short2FloatFunction p0){
return Short2FloatFunctions.unmodifiable(p0);
}
public static it.unimi.dsi.fastutil.shorts.Short2FloatFunction synchronize(it.unimi.dsi.fastutil.shorts.Short2FloatFunction p0){
return Short2FloatFunctions.synchronize(p0);
}
public static it.unimi.dsi.fastutil.shorts.Short2FloatFunction synchronize(it.unimi.dsi.fastutil.shorts.Short2FloatFunction p0,java.lang.Object p1){
return Short2FloatFunctions.synchronize(p0,p1);
}
}
