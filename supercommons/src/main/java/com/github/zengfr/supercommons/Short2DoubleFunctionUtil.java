package com.github.zengfr.supercommons;
import it.unimi.dsi.fastutil.shorts.Short2DoubleFunctions;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Short2DoubleFunctionUtil{ 
public static it.unimi.dsi.fastutil.shorts.Short2DoubleFunction singleton(short p0,double p1){
return Short2DoubleFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.shorts.Short2DoubleFunction singleton(java.lang.Short p0,java.lang.Double p1){
return Short2DoubleFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.shorts.Short2DoubleFunction primitive(java.util.function.Function<? super java.lang.Short, ? extends java.lang.Double> p0){
return Short2DoubleFunctions.primitive(p0);
}
public static it.unimi.dsi.fastutil.shorts.Short2DoubleFunction unmodifiable(it.unimi.dsi.fastutil.shorts.Short2DoubleFunction p0){
return Short2DoubleFunctions.unmodifiable(p0);
}
public static it.unimi.dsi.fastutil.shorts.Short2DoubleFunction synchronize(it.unimi.dsi.fastutil.shorts.Short2DoubleFunction p0){
return Short2DoubleFunctions.synchronize(p0);
}
public static it.unimi.dsi.fastutil.shorts.Short2DoubleFunction synchronize(it.unimi.dsi.fastutil.shorts.Short2DoubleFunction p0,java.lang.Object p1){
return Short2DoubleFunctions.synchronize(p0,p1);
}
}
