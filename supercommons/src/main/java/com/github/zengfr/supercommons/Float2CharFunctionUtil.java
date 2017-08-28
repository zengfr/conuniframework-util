package com.github.zengfr.supercommons;
import it.unimi.dsi.fastutil.floats.Float2CharFunctions;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Float2CharFunctionUtil{ 
public static it.unimi.dsi.fastutil.floats.Float2CharFunction singleton(float p0,char p1){
return Float2CharFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.floats.Float2CharFunction singleton(java.lang.Float p0,java.lang.Character p1){
return Float2CharFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.floats.Float2CharFunction primitive(java.util.function.Function<? super java.lang.Float, ? extends java.lang.Character> p0){
return Float2CharFunctions.primitive(p0);
}
public static it.unimi.dsi.fastutil.floats.Float2CharFunction unmodifiable(it.unimi.dsi.fastutil.floats.Float2CharFunction p0){
return Float2CharFunctions.unmodifiable(p0);
}
public static it.unimi.dsi.fastutil.floats.Float2CharFunction synchronize(it.unimi.dsi.fastutil.floats.Float2CharFunction p0){
return Float2CharFunctions.synchronize(p0);
}
public static it.unimi.dsi.fastutil.floats.Float2CharFunction synchronize(it.unimi.dsi.fastutil.floats.Float2CharFunction p0,java.lang.Object p1){
return Float2CharFunctions.synchronize(p0,p1);
}
}
