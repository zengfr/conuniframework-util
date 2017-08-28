package com.zengfr.supercommons;
import it.unimi.dsi.fastutil.ints.Int2ShortFunctions;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Int2ShortFunctionUtil{ 
public static it.unimi.dsi.fastutil.ints.Int2ShortFunction singleton(java.lang.Integer p0,java.lang.Short p1){
return Int2ShortFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.ints.Int2ShortFunction singleton(int p0,short p1){
return Int2ShortFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.ints.Int2ShortFunction unmodifiable(it.unimi.dsi.fastutil.ints.Int2ShortFunction p0){
return Int2ShortFunctions.unmodifiable(p0);
}
public static it.unimi.dsi.fastutil.ints.Int2ShortFunction primitive(java.util.function.Function<? super java.lang.Integer, ? extends java.lang.Short> p0){
return Int2ShortFunctions.primitive(p0);
}
public static it.unimi.dsi.fastutil.ints.Int2ShortFunction synchronize(it.unimi.dsi.fastutil.ints.Int2ShortFunction p0,java.lang.Object p1){
return Int2ShortFunctions.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.ints.Int2ShortFunction synchronize(it.unimi.dsi.fastutil.ints.Int2ShortFunction p0){
return Int2ShortFunctions.synchronize(p0);
}
}
