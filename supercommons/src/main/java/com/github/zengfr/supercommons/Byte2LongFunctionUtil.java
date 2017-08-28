package com.github.zengfr.supercommons;
import it.unimi.dsi.fastutil.bytes.Byte2LongFunctions;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Byte2LongFunctionUtil{ 
public static it.unimi.dsi.fastutil.bytes.Byte2LongFunction singleton(byte p0,long p1){
return Byte2LongFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.bytes.Byte2LongFunction singleton(java.lang.Byte p0,java.lang.Long p1){
return Byte2LongFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.bytes.Byte2LongFunction primitive(java.util.function.Function<? super java.lang.Byte, ? extends java.lang.Long> p0){
return Byte2LongFunctions.primitive(p0);
}
public static it.unimi.dsi.fastutil.bytes.Byte2LongFunction unmodifiable(it.unimi.dsi.fastutil.bytes.Byte2LongFunction p0){
return Byte2LongFunctions.unmodifiable(p0);
}
public static it.unimi.dsi.fastutil.bytes.Byte2LongFunction synchronize(it.unimi.dsi.fastutil.bytes.Byte2LongFunction p0){
return Byte2LongFunctions.synchronize(p0);
}
public static it.unimi.dsi.fastutil.bytes.Byte2LongFunction synchronize(it.unimi.dsi.fastutil.bytes.Byte2LongFunction p0,java.lang.Object p1){
return Byte2LongFunctions.synchronize(p0,p1);
}
}
