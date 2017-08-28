package com.github.zengfr.supercommons;
import it.unimi.dsi.fastutil.chars.Char2ShortFunctions;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Char2ShortFunctionUtil{ 
public static it.unimi.dsi.fastutil.chars.Char2ShortFunction singleton(char p0,short p1){
return Char2ShortFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.chars.Char2ShortFunction singleton(java.lang.Character p0,java.lang.Short p1){
return Char2ShortFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.chars.Char2ShortFunction primitive(java.util.function.Function<? super java.lang.Character, ? extends java.lang.Short> p0){
return Char2ShortFunctions.primitive(p0);
}
public static it.unimi.dsi.fastutil.chars.Char2ShortFunction unmodifiable(it.unimi.dsi.fastutil.chars.Char2ShortFunction p0){
return Char2ShortFunctions.unmodifiable(p0);
}
public static it.unimi.dsi.fastutil.chars.Char2ShortFunction synchronize(it.unimi.dsi.fastutil.chars.Char2ShortFunction p0){
return Char2ShortFunctions.synchronize(p0);
}
public static it.unimi.dsi.fastutil.chars.Char2ShortFunction synchronize(it.unimi.dsi.fastutil.chars.Char2ShortFunction p0,java.lang.Object p1){
return Char2ShortFunctions.synchronize(p0,p1);
}
}
