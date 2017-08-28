package com.github.zengfr.supercommons;
import it.unimi.dsi.fastutil.floats.Float2ByteFunctions;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Float2ByteFunctionUtil{ 
public static it.unimi.dsi.fastutil.floats.Float2ByteFunction singleton(float p0,byte p1){
return Float2ByteFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.floats.Float2ByteFunction singleton(java.lang.Float p0,java.lang.Byte p1){
return Float2ByteFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.floats.Float2ByteFunction primitive(java.util.function.Function<? super java.lang.Float, ? extends java.lang.Byte> p0){
return Float2ByteFunctions.primitive(p0);
}
public static it.unimi.dsi.fastutil.floats.Float2ByteFunction unmodifiable(it.unimi.dsi.fastutil.floats.Float2ByteFunction p0){
return Float2ByteFunctions.unmodifiable(p0);
}
public static it.unimi.dsi.fastutil.floats.Float2ByteFunction synchronize(it.unimi.dsi.fastutil.floats.Float2ByteFunction p0){
return Float2ByteFunctions.synchronize(p0);
}
public static it.unimi.dsi.fastutil.floats.Float2ByteFunction synchronize(it.unimi.dsi.fastutil.floats.Float2ByteFunction p0,java.lang.Object p1){
return Float2ByteFunctions.synchronize(p0,p1);
}
}
