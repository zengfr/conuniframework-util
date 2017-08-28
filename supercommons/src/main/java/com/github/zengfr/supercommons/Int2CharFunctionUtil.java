package com.github.zengfr.supercommons;
import it.unimi.dsi.fastutil.ints.Int2CharFunctions;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Int2CharFunctionUtil{ 
public static it.unimi.dsi.fastutil.ints.Int2CharFunction singleton(int p0,char p1){
return Int2CharFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.ints.Int2CharFunction singleton(java.lang.Integer p0,java.lang.Character p1){
return Int2CharFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.ints.Int2CharFunction primitive(java.util.function.Function<? super java.lang.Integer, ? extends java.lang.Character> p0){
return Int2CharFunctions.primitive(p0);
}
public static it.unimi.dsi.fastutil.ints.Int2CharFunction unmodifiable(it.unimi.dsi.fastutil.ints.Int2CharFunction p0){
return Int2CharFunctions.unmodifiable(p0);
}
public static it.unimi.dsi.fastutil.ints.Int2CharFunction synchronize(it.unimi.dsi.fastutil.ints.Int2CharFunction p0){
return Int2CharFunctions.synchronize(p0);
}
public static it.unimi.dsi.fastutil.ints.Int2CharFunction synchronize(it.unimi.dsi.fastutil.ints.Int2CharFunction p0,java.lang.Object p1){
return Int2CharFunctions.synchronize(p0,p1);
}
}
