package com.zengfr.supercommons;
import it.unimi.dsi.fastutil.shorts.Short2ShortFunctions;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Short2ShortFunctionUtil{ 
public static it.unimi.dsi.fastutil.shorts.Short2ShortFunction singleton(java.lang.Short p0,java.lang.Short p1){
return Short2ShortFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.shorts.Short2ShortFunction singleton(short p0,short p1){
return Short2ShortFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.shorts.Short2ShortFunction unmodifiable(it.unimi.dsi.fastutil.shorts.Short2ShortFunction p0){
return Short2ShortFunctions.unmodifiable(p0);
}
public static it.unimi.dsi.fastutil.shorts.Short2ShortFunction primitive(java.util.function.Function<? super java.lang.Short, ? extends java.lang.Short> p0){
return Short2ShortFunctions.primitive(p0);
}
public static it.unimi.dsi.fastutil.shorts.Short2ShortFunction synchronize(it.unimi.dsi.fastutil.shorts.Short2ShortFunction p0,java.lang.Object p1){
return Short2ShortFunctions.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.shorts.Short2ShortFunction synchronize(it.unimi.dsi.fastutil.shorts.Short2ShortFunction p0){
return Short2ShortFunctions.synchronize(p0);
}
}
