package com.zengfr.supercommons;
import it.unimi.dsi.fastutil.chars.Char2ReferenceFunctions;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Char2ReferenceFunctionUtil{ 
public static <V> it.unimi.dsi.fastutil.chars.Char2ReferenceFunction<V> singleton(java.lang.Character p0,V p1){
return Char2ReferenceFunctions.singleton(p0,p1);
}
public static <V> it.unimi.dsi.fastutil.chars.Char2ReferenceFunction<V> singleton(char p0,V p1){
return Char2ReferenceFunctions.singleton(p0,p1);
}
public static <V> it.unimi.dsi.fastutil.chars.Char2ReferenceFunction<V> unmodifiable(it.unimi.dsi.fastutil.chars.Char2ReferenceFunction<V> p0){
return Char2ReferenceFunctions.unmodifiable(p0);
}
public static <V> it.unimi.dsi.fastutil.chars.Char2ReferenceFunction<V> primitive(java.util.function.Function<? super java.lang.Character, ? extends V> p0){
return Char2ReferenceFunctions.primitive(p0);
}
public static <V> it.unimi.dsi.fastutil.chars.Char2ReferenceFunction<V> synchronize(it.unimi.dsi.fastutil.chars.Char2ReferenceFunction<V> p0){
return Char2ReferenceFunctions.synchronize(p0);
}
public static <V> it.unimi.dsi.fastutil.chars.Char2ReferenceFunction<V> synchronize(it.unimi.dsi.fastutil.chars.Char2ReferenceFunction<V> p0,java.lang.Object p1){
return Char2ReferenceFunctions.synchronize(p0,p1);
}
}
