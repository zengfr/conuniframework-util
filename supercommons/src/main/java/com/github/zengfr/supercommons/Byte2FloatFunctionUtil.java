package com.zengfr.supercommons;
import it.unimi.dsi.fastutil.bytes.Byte2FloatFunctions;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Byte2FloatFunctionUtil{ 
public static it.unimi.dsi.fastutil.bytes.Byte2FloatFunction singleton(java.lang.Byte p0,java.lang.Float p1){
return Byte2FloatFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.bytes.Byte2FloatFunction singleton(byte p0,float p1){
return Byte2FloatFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.bytes.Byte2FloatFunction unmodifiable(it.unimi.dsi.fastutil.bytes.Byte2FloatFunction p0){
return Byte2FloatFunctions.unmodifiable(p0);
}
public static it.unimi.dsi.fastutil.bytes.Byte2FloatFunction primitive(java.util.function.Function<? super java.lang.Byte, ? extends java.lang.Float> p0){
return Byte2FloatFunctions.primitive(p0);
}
public static it.unimi.dsi.fastutil.bytes.Byte2FloatFunction synchronize(it.unimi.dsi.fastutil.bytes.Byte2FloatFunction p0,java.lang.Object p1){
return Byte2FloatFunctions.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.bytes.Byte2FloatFunction synchronize(it.unimi.dsi.fastutil.bytes.Byte2FloatFunction p0){
return Byte2FloatFunctions.synchronize(p0);
}
}
