package com.github.zengfr.supercommons;
import it.unimi.dsi.fastutil.shorts.Short2ByteFunctions;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Short2ByteFunctionUtil{ 
public static it.unimi.dsi.fastutil.shorts.Short2ByteFunction singleton(short p0,byte p1){
return Short2ByteFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.shorts.Short2ByteFunction singleton(java.lang.Short p0,java.lang.Byte p1){
return Short2ByteFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.shorts.Short2ByteFunction primitive(java.util.function.Function<? super java.lang.Short, ? extends java.lang.Byte> p0){
return Short2ByteFunctions.primitive(p0);
}
public static it.unimi.dsi.fastutil.shorts.Short2ByteFunction unmodifiable(it.unimi.dsi.fastutil.shorts.Short2ByteFunction p0){
return Short2ByteFunctions.unmodifiable(p0);
}
public static it.unimi.dsi.fastutil.shorts.Short2ByteFunction synchronize(it.unimi.dsi.fastutil.shorts.Short2ByteFunction p0){
return Short2ByteFunctions.synchronize(p0);
}
public static it.unimi.dsi.fastutil.shorts.Short2ByteFunction synchronize(it.unimi.dsi.fastutil.shorts.Short2ByteFunction p0,java.lang.Object p1){
return Short2ByteFunctions.synchronize(p0,p1);
}
}
