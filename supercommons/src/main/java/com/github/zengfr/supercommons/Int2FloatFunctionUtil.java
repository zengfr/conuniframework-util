package com.zengfr.supercommons;
import it.unimi.dsi.fastutil.ints.Int2FloatFunctions;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Int2FloatFunctionUtil{ 
public static it.unimi.dsi.fastutil.ints.Int2FloatFunction singleton(java.lang.Integer p0,java.lang.Float p1){
return Int2FloatFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.ints.Int2FloatFunction singleton(int p0,float p1){
return Int2FloatFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.ints.Int2FloatFunction unmodifiable(it.unimi.dsi.fastutil.ints.Int2FloatFunction p0){
return Int2FloatFunctions.unmodifiable(p0);
}
public static it.unimi.dsi.fastutil.ints.Int2FloatFunction primitive(java.util.function.Function<? super java.lang.Integer, ? extends java.lang.Float> p0){
return Int2FloatFunctions.primitive(p0);
}
public static it.unimi.dsi.fastutil.ints.Int2FloatFunction synchronize(it.unimi.dsi.fastutil.ints.Int2FloatFunction p0,java.lang.Object p1){
return Int2FloatFunctions.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.ints.Int2FloatFunction synchronize(it.unimi.dsi.fastutil.ints.Int2FloatFunction p0){
return Int2FloatFunctions.synchronize(p0);
}
}
