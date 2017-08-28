package com.github.zengfr.supercommons;
import it.unimi.dsi.fastutil.longs.Long2ShortFunctions;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Long2ShortFunctionUtil{ 
public static it.unimi.dsi.fastutil.longs.Long2ShortFunction singleton(long p0,short p1){
return Long2ShortFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.longs.Long2ShortFunction singleton(java.lang.Long p0,java.lang.Short p1){
return Long2ShortFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.longs.Long2ShortFunction primitive(java.util.function.Function<? super java.lang.Long, ? extends java.lang.Short> p0){
return Long2ShortFunctions.primitive(p0);
}
public static it.unimi.dsi.fastutil.longs.Long2ShortFunction unmodifiable(it.unimi.dsi.fastutil.longs.Long2ShortFunction p0){
return Long2ShortFunctions.unmodifiable(p0);
}
public static it.unimi.dsi.fastutil.longs.Long2ShortFunction synchronize(it.unimi.dsi.fastutil.longs.Long2ShortFunction p0){
return Long2ShortFunctions.synchronize(p0);
}
public static it.unimi.dsi.fastutil.longs.Long2ShortFunction synchronize(it.unimi.dsi.fastutil.longs.Long2ShortFunction p0,java.lang.Object p1){
return Long2ShortFunctions.synchronize(p0,p1);
}
}
