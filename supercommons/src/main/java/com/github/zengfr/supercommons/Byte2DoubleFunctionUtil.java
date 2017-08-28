package com.github.zengfr.supercommons;
import it.unimi.dsi.fastutil.bytes.Byte2DoubleFunctions;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Byte2DoubleFunctionUtil{ 
public static it.unimi.dsi.fastutil.bytes.Byte2DoubleFunction singleton(byte p0,double p1){
return Byte2DoubleFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.bytes.Byte2DoubleFunction singleton(java.lang.Byte p0,java.lang.Double p1){
return Byte2DoubleFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.bytes.Byte2DoubleFunction primitive(java.util.function.Function<? super java.lang.Byte, ? extends java.lang.Double> p0){
return Byte2DoubleFunctions.primitive(p0);
}
public static it.unimi.dsi.fastutil.bytes.Byte2DoubleFunction unmodifiable(it.unimi.dsi.fastutil.bytes.Byte2DoubleFunction p0){
return Byte2DoubleFunctions.unmodifiable(p0);
}
public static it.unimi.dsi.fastutil.bytes.Byte2DoubleFunction synchronize(it.unimi.dsi.fastutil.bytes.Byte2DoubleFunction p0){
return Byte2DoubleFunctions.synchronize(p0);
}
public static it.unimi.dsi.fastutil.bytes.Byte2DoubleFunction synchronize(it.unimi.dsi.fastutil.bytes.Byte2DoubleFunction p0,java.lang.Object p1){
return Byte2DoubleFunctions.synchronize(p0,p1);
}
}
