package com.zengfr.supercommons;
import it.unimi.dsi.fastutil.longs.Long2DoubleFunctions;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Long2DoubleFunctionUtil{ 
public static it.unimi.dsi.fastutil.longs.Long2DoubleFunction singleton(java.lang.Long p0,java.lang.Double p1){
return Long2DoubleFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.longs.Long2DoubleFunction singleton(long p0,double p1){
return Long2DoubleFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.longs.Long2DoubleFunction unmodifiable(it.unimi.dsi.fastutil.longs.Long2DoubleFunction p0){
return Long2DoubleFunctions.unmodifiable(p0);
}
public static it.unimi.dsi.fastutil.longs.Long2DoubleFunction primitive(java.util.function.Function<? super java.lang.Long, ? extends java.lang.Double> p0){
return Long2DoubleFunctions.primitive(p0);
}
public static it.unimi.dsi.fastutil.longs.Long2DoubleFunction synchronize(it.unimi.dsi.fastutil.longs.Long2DoubleFunction p0){
return Long2DoubleFunctions.synchronize(p0);
}
public static it.unimi.dsi.fastutil.longs.Long2DoubleFunction synchronize(it.unimi.dsi.fastutil.longs.Long2DoubleFunction p0,java.lang.Object p1){
return Long2DoubleFunctions.synchronize(p0,p1);
}
}
