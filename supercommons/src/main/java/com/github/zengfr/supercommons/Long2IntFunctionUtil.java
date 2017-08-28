package com.github.zengfr.supercommons;
import it.unimi.dsi.fastutil.longs.Long2IntFunctions;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Long2IntFunctionUtil{ 
public static it.unimi.dsi.fastutil.longs.Long2IntFunction singleton(long p0,int p1){
return Long2IntFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.longs.Long2IntFunction singleton(java.lang.Long p0,java.lang.Integer p1){
return Long2IntFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.longs.Long2IntFunction primitive(java.util.function.Function<? super java.lang.Long, ? extends java.lang.Integer> p0){
return Long2IntFunctions.primitive(p0);
}
public static it.unimi.dsi.fastutil.longs.Long2IntFunction unmodifiable(it.unimi.dsi.fastutil.longs.Long2IntFunction p0){
return Long2IntFunctions.unmodifiable(p0);
}
public static it.unimi.dsi.fastutil.longs.Long2IntFunction synchronize(it.unimi.dsi.fastutil.longs.Long2IntFunction p0){
return Long2IntFunctions.synchronize(p0);
}
public static it.unimi.dsi.fastutil.longs.Long2IntFunction synchronize(it.unimi.dsi.fastutil.longs.Long2IntFunction p0,java.lang.Object p1){
return Long2IntFunctions.synchronize(p0,p1);
}
}
