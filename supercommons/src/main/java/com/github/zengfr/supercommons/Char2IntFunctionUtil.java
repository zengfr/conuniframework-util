package com.zengfr.supercommons;
import it.unimi.dsi.fastutil.chars.Char2IntFunctions;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Char2IntFunctionUtil{ 
public static it.unimi.dsi.fastutil.chars.Char2IntFunction singleton(java.lang.Character p0,java.lang.Integer p1){
return Char2IntFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.chars.Char2IntFunction singleton(char p0,int p1){
return Char2IntFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.chars.Char2IntFunction unmodifiable(it.unimi.dsi.fastutil.chars.Char2IntFunction p0){
return Char2IntFunctions.unmodifiable(p0);
}
public static it.unimi.dsi.fastutil.chars.Char2IntFunction primitive(java.util.function.Function<? super java.lang.Character, ? extends java.lang.Integer> p0){
return Char2IntFunctions.primitive(p0);
}
public static it.unimi.dsi.fastutil.chars.Char2IntFunction synchronize(it.unimi.dsi.fastutil.chars.Char2IntFunction p0){
return Char2IntFunctions.synchronize(p0);
}
public static it.unimi.dsi.fastutil.chars.Char2IntFunction synchronize(it.unimi.dsi.fastutil.chars.Char2IntFunction p0,java.lang.Object p1){
return Char2IntFunctions.synchronize(p0,p1);
}
}
