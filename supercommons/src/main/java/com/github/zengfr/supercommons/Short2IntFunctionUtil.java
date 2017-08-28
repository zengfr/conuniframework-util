package com.zengfr.supercommons;
import it.unimi.dsi.fastutil.shorts.Short2IntFunctions;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Short2IntFunctionUtil{ 
public static it.unimi.dsi.fastutil.shorts.Short2IntFunction singleton(java.lang.Short p0,java.lang.Integer p1){
return Short2IntFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.shorts.Short2IntFunction singleton(short p0,int p1){
return Short2IntFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.shorts.Short2IntFunction unmodifiable(it.unimi.dsi.fastutil.shorts.Short2IntFunction p0){
return Short2IntFunctions.unmodifiable(p0);
}
public static it.unimi.dsi.fastutil.shorts.Short2IntFunction primitive(java.util.function.Function<? super java.lang.Short, ? extends java.lang.Integer> p0){
return Short2IntFunctions.primitive(p0);
}
public static it.unimi.dsi.fastutil.shorts.Short2IntFunction synchronize(it.unimi.dsi.fastutil.shorts.Short2IntFunction p0){
return Short2IntFunctions.synchronize(p0);
}
public static it.unimi.dsi.fastutil.shorts.Short2IntFunction synchronize(it.unimi.dsi.fastutil.shorts.Short2IntFunction p0,java.lang.Object p1){
return Short2IntFunctions.synchronize(p0,p1);
}
}
