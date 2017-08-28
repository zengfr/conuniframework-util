package com.github.zengfr.supercommons;
import it.unimi.dsi.fastutil.bytes.Byte2IntFunctions;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Byte2IntFunctionUtil{ 
public static it.unimi.dsi.fastutil.bytes.Byte2IntFunction singleton(byte p0,int p1){
return Byte2IntFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.bytes.Byte2IntFunction singleton(java.lang.Byte p0,java.lang.Integer p1){
return Byte2IntFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.bytes.Byte2IntFunction primitive(java.util.function.Function<? super java.lang.Byte, ? extends java.lang.Integer> p0){
return Byte2IntFunctions.primitive(p0);
}
public static it.unimi.dsi.fastutil.bytes.Byte2IntFunction unmodifiable(it.unimi.dsi.fastutil.bytes.Byte2IntFunction p0){
return Byte2IntFunctions.unmodifiable(p0);
}
public static it.unimi.dsi.fastutil.bytes.Byte2IntFunction synchronize(it.unimi.dsi.fastutil.bytes.Byte2IntFunction p0){
return Byte2IntFunctions.synchronize(p0);
}
public static it.unimi.dsi.fastutil.bytes.Byte2IntFunction synchronize(it.unimi.dsi.fastutil.bytes.Byte2IntFunction p0,java.lang.Object p1){
return Byte2IntFunctions.synchronize(p0,p1);
}
}
