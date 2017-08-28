package com.zengfr.supercommons;
import it.unimi.dsi.fastutil.bytes.Byte2BooleanFunctions;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Byte2BooleanFunctionUtil{ 
public static it.unimi.dsi.fastutil.bytes.Byte2BooleanFunction singleton(java.lang.Byte p0,java.lang.Boolean p1){
return Byte2BooleanFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.bytes.Byte2BooleanFunction singleton(byte p0,boolean p1){
return Byte2BooleanFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.bytes.Byte2BooleanFunction unmodifiable(it.unimi.dsi.fastutil.bytes.Byte2BooleanFunction p0){
return Byte2BooleanFunctions.unmodifiable(p0);
}
public static it.unimi.dsi.fastutil.bytes.Byte2BooleanFunction primitive(java.util.function.Function<? super java.lang.Byte, ? extends java.lang.Boolean> p0){
return Byte2BooleanFunctions.primitive(p0);
}
public static it.unimi.dsi.fastutil.bytes.Byte2BooleanFunction synchronize(it.unimi.dsi.fastutil.bytes.Byte2BooleanFunction p0){
return Byte2BooleanFunctions.synchronize(p0);
}
public static it.unimi.dsi.fastutil.bytes.Byte2BooleanFunction synchronize(it.unimi.dsi.fastutil.bytes.Byte2BooleanFunction p0,java.lang.Object p1){
return Byte2BooleanFunctions.synchronize(p0,p1);
}
}
