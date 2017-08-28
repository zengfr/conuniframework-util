package com.zengfr.supercommons;
import it.unimi.dsi.fastutil.ints.Int2IntFunctions;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Int2IntFunctionUtil{ 
public static it.unimi.dsi.fastutil.ints.Int2IntFunction singleton(java.lang.Integer p0,java.lang.Integer p1){
return Int2IntFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.ints.Int2IntFunction singleton(int p0,int p1){
return Int2IntFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.ints.Int2IntFunction unmodifiable(it.unimi.dsi.fastutil.ints.Int2IntFunction p0){
return Int2IntFunctions.unmodifiable(p0);
}
public static it.unimi.dsi.fastutil.ints.Int2IntFunction primitive(java.util.function.Function<? super java.lang.Integer, ? extends java.lang.Integer> p0){
return Int2IntFunctions.primitive(p0);
}
public static it.unimi.dsi.fastutil.ints.Int2IntFunction synchronize(it.unimi.dsi.fastutil.ints.Int2IntFunction p0){
return Int2IntFunctions.synchronize(p0);
}
public static it.unimi.dsi.fastutil.ints.Int2IntFunction synchronize(it.unimi.dsi.fastutil.ints.Int2IntFunction p0,java.lang.Object p1){
return Int2IntFunctions.synchronize(p0,p1);
}
}
