package com.github.zengfr.supercommons;
import it.unimi.dsi.fastutil.longs.Long2LongFunctions;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Long2LongFunctionUtil{ 
public static it.unimi.dsi.fastutil.longs.Long2LongFunction singleton(long p0,long p1){
return Long2LongFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.longs.Long2LongFunction singleton(java.lang.Long p0,java.lang.Long p1){
return Long2LongFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.longs.Long2LongFunction primitive(java.util.function.Function<? super java.lang.Long, ? extends java.lang.Long> p0){
return Long2LongFunctions.primitive(p0);
}
public static it.unimi.dsi.fastutil.longs.Long2LongFunction unmodifiable(it.unimi.dsi.fastutil.longs.Long2LongFunction p0){
return Long2LongFunctions.unmodifiable(p0);
}
public static it.unimi.dsi.fastutil.longs.Long2LongFunction synchronize(it.unimi.dsi.fastutil.longs.Long2LongFunction p0){
return Long2LongFunctions.synchronize(p0);
}
public static it.unimi.dsi.fastutil.longs.Long2LongFunction synchronize(it.unimi.dsi.fastutil.longs.Long2LongFunction p0,java.lang.Object p1){
return Long2LongFunctions.synchronize(p0,p1);
}
}
