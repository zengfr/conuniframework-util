package com.zengfr.supercommons;
import it.unimi.dsi.fastutil.shorts.Short2LongFunctions;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Short2LongFunctionUtil{ 
public static it.unimi.dsi.fastutil.shorts.Short2LongFunction singleton(java.lang.Short p0,java.lang.Long p1){
return Short2LongFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.shorts.Short2LongFunction singleton(short p0,long p1){
return Short2LongFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.shorts.Short2LongFunction unmodifiable(it.unimi.dsi.fastutil.shorts.Short2LongFunction p0){
return Short2LongFunctions.unmodifiable(p0);
}
public static it.unimi.dsi.fastutil.shorts.Short2LongFunction primitive(java.util.function.Function<? super java.lang.Short, ? extends java.lang.Long> p0){
return Short2LongFunctions.primitive(p0);
}
public static it.unimi.dsi.fastutil.shorts.Short2LongFunction synchronize(it.unimi.dsi.fastutil.shorts.Short2LongFunction p0){
return Short2LongFunctions.synchronize(p0);
}
public static it.unimi.dsi.fastutil.shorts.Short2LongFunction synchronize(it.unimi.dsi.fastutil.shorts.Short2LongFunction p0,java.lang.Object p1){
return Short2LongFunctions.synchronize(p0,p1);
}
}
