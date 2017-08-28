package com.zengfr.supercommons;
import it.unimi.dsi.fastutil.bytes.Byte2ByteFunctions;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Byte2ByteFunctionUtil{ 
public static it.unimi.dsi.fastutil.bytes.Byte2ByteFunction singleton(java.lang.Byte p0,java.lang.Byte p1){
return Byte2ByteFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.bytes.Byte2ByteFunction singleton(byte p0,byte p1){
return Byte2ByteFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.bytes.Byte2ByteFunction unmodifiable(it.unimi.dsi.fastutil.bytes.Byte2ByteFunction p0){
return Byte2ByteFunctions.unmodifiable(p0);
}
public static it.unimi.dsi.fastutil.bytes.Byte2ByteFunction primitive(java.util.function.Function<? super java.lang.Byte, ? extends java.lang.Byte> p0){
return Byte2ByteFunctions.primitive(p0);
}
public static it.unimi.dsi.fastutil.bytes.Byte2ByteFunction synchronize(it.unimi.dsi.fastutil.bytes.Byte2ByteFunction p0,java.lang.Object p1){
return Byte2ByteFunctions.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.bytes.Byte2ByteFunction synchronize(it.unimi.dsi.fastutil.bytes.Byte2ByteFunction p0){
return Byte2ByteFunctions.synchronize(p0);
}
}
