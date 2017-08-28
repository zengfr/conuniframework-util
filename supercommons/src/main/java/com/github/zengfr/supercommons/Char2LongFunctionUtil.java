package com.zengfr.supercommons;
import it.unimi.dsi.fastutil.chars.Char2LongFunctions;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Char2LongFunctionUtil{ 
public static it.unimi.dsi.fastutil.chars.Char2LongFunction singleton(java.lang.Character p0,java.lang.Long p1){
return Char2LongFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.chars.Char2LongFunction singleton(char p0,long p1){
return Char2LongFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.chars.Char2LongFunction unmodifiable(it.unimi.dsi.fastutil.chars.Char2LongFunction p0){
return Char2LongFunctions.unmodifiable(p0);
}
public static it.unimi.dsi.fastutil.chars.Char2LongFunction primitive(java.util.function.Function<? super java.lang.Character, ? extends java.lang.Long> p0){
return Char2LongFunctions.primitive(p0);
}
public static it.unimi.dsi.fastutil.chars.Char2LongFunction synchronize(it.unimi.dsi.fastutil.chars.Char2LongFunction p0){
return Char2LongFunctions.synchronize(p0);
}
public static it.unimi.dsi.fastutil.chars.Char2LongFunction synchronize(it.unimi.dsi.fastutil.chars.Char2LongFunction p0,java.lang.Object p1){
return Char2LongFunctions.synchronize(p0,p1);
}
}
