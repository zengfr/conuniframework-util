package com.github.zengfr.supercommons;
import it.unimi.dsi.fastutil.ints.Int2LongFunctions;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Int2LongFunctionUtil{ 
public static it.unimi.dsi.fastutil.ints.Int2LongFunction singleton(int p0,long p1){
return Int2LongFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.ints.Int2LongFunction singleton(java.lang.Integer p0,java.lang.Long p1){
return Int2LongFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.ints.Int2LongFunction primitive(java.util.function.Function<? super java.lang.Integer, ? extends java.lang.Long> p0){
return Int2LongFunctions.primitive(p0);
}
public static it.unimi.dsi.fastutil.ints.Int2LongFunction unmodifiable(it.unimi.dsi.fastutil.ints.Int2LongFunction p0){
return Int2LongFunctions.unmodifiable(p0);
}
public static it.unimi.dsi.fastutil.ints.Int2LongFunction synchronize(it.unimi.dsi.fastutil.ints.Int2LongFunction p0){
return Int2LongFunctions.synchronize(p0);
}
public static it.unimi.dsi.fastutil.ints.Int2LongFunction synchronize(it.unimi.dsi.fastutil.ints.Int2LongFunction p0,java.lang.Object p1){
return Int2LongFunctions.synchronize(p0,p1);
}
}
