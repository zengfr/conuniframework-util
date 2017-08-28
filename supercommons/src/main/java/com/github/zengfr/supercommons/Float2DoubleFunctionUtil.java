package com.zengfr.supercommons;
import it.unimi.dsi.fastutil.floats.Float2DoubleFunctions;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Float2DoubleFunctionUtil{ 
public static it.unimi.dsi.fastutil.floats.Float2DoubleFunction singleton(java.lang.Float p0,java.lang.Double p1){
return Float2DoubleFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.floats.Float2DoubleFunction singleton(float p0,double p1){
return Float2DoubleFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.floats.Float2DoubleFunction unmodifiable(it.unimi.dsi.fastutil.floats.Float2DoubleFunction p0){
return Float2DoubleFunctions.unmodifiable(p0);
}
public static it.unimi.dsi.fastutil.floats.Float2DoubleFunction primitive(java.util.function.Function<? super java.lang.Float, ? extends java.lang.Double> p0){
return Float2DoubleFunctions.primitive(p0);
}
public static it.unimi.dsi.fastutil.floats.Float2DoubleFunction synchronize(it.unimi.dsi.fastutil.floats.Float2DoubleFunction p0){
return Float2DoubleFunctions.synchronize(p0);
}
public static it.unimi.dsi.fastutil.floats.Float2DoubleFunction synchronize(it.unimi.dsi.fastutil.floats.Float2DoubleFunction p0,java.lang.Object p1){
return Float2DoubleFunctions.synchronize(p0,p1);
}
}
