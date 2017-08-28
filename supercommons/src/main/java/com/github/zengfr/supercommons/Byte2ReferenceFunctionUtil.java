package com.zengfr.supercommons;
import it.unimi.dsi.fastutil.bytes.Byte2ReferenceFunctions;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Byte2ReferenceFunctionUtil{ 
public static <V> it.unimi.dsi.fastutil.bytes.Byte2ReferenceFunction<V> singleton(java.lang.Byte p0,V p1){
return Byte2ReferenceFunctions.singleton(p0,p1);
}
public static <V> it.unimi.dsi.fastutil.bytes.Byte2ReferenceFunction<V> singleton(byte p0,V p1){
return Byte2ReferenceFunctions.singleton(p0,p1);
}
public static <V> it.unimi.dsi.fastutil.bytes.Byte2ReferenceFunction<V> unmodifiable(it.unimi.dsi.fastutil.bytes.Byte2ReferenceFunction<V> p0){
return Byte2ReferenceFunctions.unmodifiable(p0);
}
public static <V> it.unimi.dsi.fastutil.bytes.Byte2ReferenceFunction<V> primitive(java.util.function.Function<? super java.lang.Byte, ? extends V> p0){
return Byte2ReferenceFunctions.primitive(p0);
}
public static <V> it.unimi.dsi.fastutil.bytes.Byte2ReferenceFunction<V> synchronize(it.unimi.dsi.fastutil.bytes.Byte2ReferenceFunction<V> p0){
return Byte2ReferenceFunctions.synchronize(p0);
}
public static <V> it.unimi.dsi.fastutil.bytes.Byte2ReferenceFunction<V> synchronize(it.unimi.dsi.fastutil.bytes.Byte2ReferenceFunction<V> p0,java.lang.Object p1){
return Byte2ReferenceFunctions.synchronize(p0,p1);
}
}
