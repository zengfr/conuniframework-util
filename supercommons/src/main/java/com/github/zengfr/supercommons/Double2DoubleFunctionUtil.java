package com.github.zengfr.supercommons;
import it.unimi.dsi.fastutil.doubles.Double2DoubleFunctions;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Double2DoubleFunctionUtil{ 
public static it.unimi.dsi.fastutil.doubles.Double2DoubleFunction singleton(double p0,double p1){
return Double2DoubleFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.doubles.Double2DoubleFunction singleton(java.lang.Double p0,java.lang.Double p1){
return Double2DoubleFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.doubles.Double2DoubleFunction primitive(java.util.function.Function<? super java.lang.Double, ? extends java.lang.Double> p0){
return Double2DoubleFunctions.primitive(p0);
}
public static it.unimi.dsi.fastutil.doubles.Double2DoubleFunction unmodifiable(it.unimi.dsi.fastutil.doubles.Double2DoubleFunction p0){
return Double2DoubleFunctions.unmodifiable(p0);
}
public static it.unimi.dsi.fastutil.doubles.Double2DoubleFunction synchronize(it.unimi.dsi.fastutil.doubles.Double2DoubleFunction p0){
return Double2DoubleFunctions.synchronize(p0);
}
public static it.unimi.dsi.fastutil.doubles.Double2DoubleFunction synchronize(it.unimi.dsi.fastutil.doubles.Double2DoubleFunction p0,java.lang.Object p1){
return Double2DoubleFunctions.synchronize(p0,p1);
}
}
