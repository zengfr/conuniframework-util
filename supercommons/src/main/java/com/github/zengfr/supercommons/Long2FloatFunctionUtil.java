package com.zengfr.supercommons;
import it.unimi.dsi.fastutil.longs.Long2FloatFunctions;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Long2FloatFunctionUtil{ 
public static it.unimi.dsi.fastutil.longs.Long2FloatFunction singleton(java.lang.Long p0,java.lang.Float p1){
return Long2FloatFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.longs.Long2FloatFunction singleton(long p0,float p1){
return Long2FloatFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.longs.Long2FloatFunction unmodifiable(it.unimi.dsi.fastutil.longs.Long2FloatFunction p0){
return Long2FloatFunctions.unmodifiable(p0);
}
public static it.unimi.dsi.fastutil.longs.Long2FloatFunction primitive(java.util.function.Function<? super java.lang.Long, ? extends java.lang.Float> p0){
return Long2FloatFunctions.primitive(p0);
}
public static it.unimi.dsi.fastutil.longs.Long2FloatFunction synchronize(it.unimi.dsi.fastutil.longs.Long2FloatFunction p0,java.lang.Object p1){
return Long2FloatFunctions.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.longs.Long2FloatFunction synchronize(it.unimi.dsi.fastutil.longs.Long2FloatFunction p0){
return Long2FloatFunctions.synchronize(p0);
}
}
