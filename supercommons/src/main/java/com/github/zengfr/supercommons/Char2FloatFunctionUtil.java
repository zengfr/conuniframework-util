package com.github.zengfr.supercommons;
import it.unimi.dsi.fastutil.chars.Char2FloatFunctions;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Char2FloatFunctionUtil{ 
public static it.unimi.dsi.fastutil.chars.Char2FloatFunction singleton(char p0,float p1){
return Char2FloatFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.chars.Char2FloatFunction singleton(java.lang.Character p0,java.lang.Float p1){
return Char2FloatFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.chars.Char2FloatFunction primitive(java.util.function.Function<? super java.lang.Character, ? extends java.lang.Float> p0){
return Char2FloatFunctions.primitive(p0);
}
public static it.unimi.dsi.fastutil.chars.Char2FloatFunction unmodifiable(it.unimi.dsi.fastutil.chars.Char2FloatFunction p0){
return Char2FloatFunctions.unmodifiable(p0);
}
public static it.unimi.dsi.fastutil.chars.Char2FloatFunction synchronize(it.unimi.dsi.fastutil.chars.Char2FloatFunction p0){
return Char2FloatFunctions.synchronize(p0);
}
public static it.unimi.dsi.fastutil.chars.Char2FloatFunction synchronize(it.unimi.dsi.fastutil.chars.Char2FloatFunction p0,java.lang.Object p1){
return Char2FloatFunctions.synchronize(p0,p1);
}
}
