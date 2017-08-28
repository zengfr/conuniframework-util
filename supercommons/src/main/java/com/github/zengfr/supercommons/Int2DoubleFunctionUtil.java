package com.zengfr.supercommons;
import it.unimi.dsi.fastutil.ints.Int2DoubleFunctions;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Int2DoubleFunctionUtil{ 
public static it.unimi.dsi.fastutil.ints.Int2DoubleFunction singleton(java.lang.Integer p0,java.lang.Double p1){
return Int2DoubleFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.ints.Int2DoubleFunction singleton(int p0,double p1){
return Int2DoubleFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.ints.Int2DoubleFunction unmodifiable(it.unimi.dsi.fastutil.ints.Int2DoubleFunction p0){
return Int2DoubleFunctions.unmodifiable(p0);
}
public static it.unimi.dsi.fastutil.ints.Int2DoubleFunction primitive(java.util.function.Function<? super java.lang.Integer, ? extends java.lang.Double> p0){
return Int2DoubleFunctions.primitive(p0);
}
public static it.unimi.dsi.fastutil.ints.Int2DoubleFunction synchronize(it.unimi.dsi.fastutil.ints.Int2DoubleFunction p0){
return Int2DoubleFunctions.synchronize(p0);
}
public static it.unimi.dsi.fastutil.ints.Int2DoubleFunction synchronize(it.unimi.dsi.fastutil.ints.Int2DoubleFunction p0,java.lang.Object p1){
return Int2DoubleFunctions.synchronize(p0,p1);
}
}
