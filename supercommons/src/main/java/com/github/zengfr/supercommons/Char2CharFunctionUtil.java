package com.github.zengfr.supercommons;
import it.unimi.dsi.fastutil.chars.Char2CharFunctions;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Char2CharFunctionUtil{ 
public static it.unimi.dsi.fastutil.chars.Char2CharFunction singleton(char p0,char p1){
return Char2CharFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.chars.Char2CharFunction singleton(java.lang.Character p0,java.lang.Character p1){
return Char2CharFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.chars.Char2CharFunction primitive(java.util.function.Function<? super java.lang.Character, ? extends java.lang.Character> p0){
return Char2CharFunctions.primitive(p0);
}
public static it.unimi.dsi.fastutil.chars.Char2CharFunction unmodifiable(it.unimi.dsi.fastutil.chars.Char2CharFunction p0){
return Char2CharFunctions.unmodifiable(p0);
}
public static it.unimi.dsi.fastutil.chars.Char2CharFunction synchronize(it.unimi.dsi.fastutil.chars.Char2CharFunction p0){
return Char2CharFunctions.synchronize(p0);
}
public static it.unimi.dsi.fastutil.chars.Char2CharFunction synchronize(it.unimi.dsi.fastutil.chars.Char2CharFunction p0,java.lang.Object p1){
return Char2CharFunctions.synchronize(p0,p1);
}
}
