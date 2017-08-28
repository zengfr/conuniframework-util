package com.zengfr.supercommons;
import it.unimi.dsi.fastutil.longs.Long2ByteFunctions;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Long2ByteFunctionUtil{ 
public static it.unimi.dsi.fastutil.longs.Long2ByteFunction singleton(java.lang.Long p0,java.lang.Byte p1){
return Long2ByteFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.longs.Long2ByteFunction singleton(long p0,byte p1){
return Long2ByteFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.longs.Long2ByteFunction unmodifiable(it.unimi.dsi.fastutil.longs.Long2ByteFunction p0){
return Long2ByteFunctions.unmodifiable(p0);
}
public static it.unimi.dsi.fastutil.longs.Long2ByteFunction primitive(java.util.function.Function<? super java.lang.Long, ? extends java.lang.Byte> p0){
return Long2ByteFunctions.primitive(p0);
}
public static it.unimi.dsi.fastutil.longs.Long2ByteFunction synchronize(it.unimi.dsi.fastutil.longs.Long2ByteFunction p0,java.lang.Object p1){
return Long2ByteFunctions.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.longs.Long2ByteFunction synchronize(it.unimi.dsi.fastutil.longs.Long2ByteFunction p0){
return Long2ByteFunctions.synchronize(p0);
}
}
