package com.zengfr.supercommons;
import it.unimi.dsi.fastutil.shorts.Short2CharFunctions;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Short2CharFunctionUtil{ 
public static it.unimi.dsi.fastutil.shorts.Short2CharFunction singleton(java.lang.Short p0,java.lang.Character p1){
return Short2CharFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.shorts.Short2CharFunction singleton(short p0,char p1){
return Short2CharFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.shorts.Short2CharFunction unmodifiable(it.unimi.dsi.fastutil.shorts.Short2CharFunction p0){
return Short2CharFunctions.unmodifiable(p0);
}
public static it.unimi.dsi.fastutil.shorts.Short2CharFunction primitive(java.util.function.Function<? super java.lang.Short, ? extends java.lang.Character> p0){
return Short2CharFunctions.primitive(p0);
}
public static it.unimi.dsi.fastutil.shorts.Short2CharFunction synchronize(it.unimi.dsi.fastutil.shorts.Short2CharFunction p0,java.lang.Object p1){
return Short2CharFunctions.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.shorts.Short2CharFunction synchronize(it.unimi.dsi.fastutil.shorts.Short2CharFunction p0){
return Short2CharFunctions.synchronize(p0);
}
}
