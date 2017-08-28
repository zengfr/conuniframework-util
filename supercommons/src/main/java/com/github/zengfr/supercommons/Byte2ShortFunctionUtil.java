package com.zengfr.supercommons;
import it.unimi.dsi.fastutil.bytes.Byte2ShortFunctions;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Byte2ShortFunctionUtil{ 
public static it.unimi.dsi.fastutil.bytes.Byte2ShortFunction singleton(java.lang.Byte p0,java.lang.Short p1){
return Byte2ShortFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.bytes.Byte2ShortFunction singleton(byte p0,short p1){
return Byte2ShortFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.bytes.Byte2ShortFunction unmodifiable(it.unimi.dsi.fastutil.bytes.Byte2ShortFunction p0){
return Byte2ShortFunctions.unmodifiable(p0);
}
public static it.unimi.dsi.fastutil.bytes.Byte2ShortFunction primitive(java.util.function.Function<? super java.lang.Byte, ? extends java.lang.Short> p0){
return Byte2ShortFunctions.primitive(p0);
}
public static it.unimi.dsi.fastutil.bytes.Byte2ShortFunction synchronize(it.unimi.dsi.fastutil.bytes.Byte2ShortFunction p0,java.lang.Object p1){
return Byte2ShortFunctions.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.bytes.Byte2ShortFunction synchronize(it.unimi.dsi.fastutil.bytes.Byte2ShortFunction p0){
return Byte2ShortFunctions.synchronize(p0);
}
}
