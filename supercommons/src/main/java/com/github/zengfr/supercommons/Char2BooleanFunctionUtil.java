package com.github.zengfr.supercommons;
import it.unimi.dsi.fastutil.chars.Char2BooleanFunctions;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Char2BooleanFunctionUtil{ 
public static it.unimi.dsi.fastutil.chars.Char2BooleanFunction singleton(char p0,boolean p1){
return Char2BooleanFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.chars.Char2BooleanFunction singleton(java.lang.Character p0,java.lang.Boolean p1){
return Char2BooleanFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.chars.Char2BooleanFunction primitive(java.util.function.Function<? super java.lang.Character, ? extends java.lang.Boolean> p0){
return Char2BooleanFunctions.primitive(p0);
}
public static it.unimi.dsi.fastutil.chars.Char2BooleanFunction unmodifiable(it.unimi.dsi.fastutil.chars.Char2BooleanFunction p0){
return Char2BooleanFunctions.unmodifiable(p0);
}
public static it.unimi.dsi.fastutil.chars.Char2BooleanFunction synchronize(it.unimi.dsi.fastutil.chars.Char2BooleanFunction p0){
return Char2BooleanFunctions.synchronize(p0);
}
public static it.unimi.dsi.fastutil.chars.Char2BooleanFunction synchronize(it.unimi.dsi.fastutil.chars.Char2BooleanFunction p0,java.lang.Object p1){
return Char2BooleanFunctions.synchronize(p0,p1);
}
}
