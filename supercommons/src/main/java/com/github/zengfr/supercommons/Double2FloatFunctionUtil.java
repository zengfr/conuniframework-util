package com.github.zengfr.supercommons;
import it.unimi.dsi.fastutil.doubles.Double2FloatFunctions;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Double2FloatFunctionUtil{ 
public static it.unimi.dsi.fastutil.doubles.Double2FloatFunction singleton(double p0,float p1){
return Double2FloatFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.doubles.Double2FloatFunction singleton(java.lang.Double p0,java.lang.Float p1){
return Double2FloatFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.doubles.Double2FloatFunction primitive(java.util.function.Function<? super java.lang.Double, ? extends java.lang.Float> p0){
return Double2FloatFunctions.primitive(p0);
}
public static it.unimi.dsi.fastutil.doubles.Double2FloatFunction unmodifiable(it.unimi.dsi.fastutil.doubles.Double2FloatFunction p0){
return Double2FloatFunctions.unmodifiable(p0);
}
public static it.unimi.dsi.fastutil.doubles.Double2FloatFunction synchronize(it.unimi.dsi.fastutil.doubles.Double2FloatFunction p0){
return Double2FloatFunctions.synchronize(p0);
}
public static it.unimi.dsi.fastutil.doubles.Double2FloatFunction synchronize(it.unimi.dsi.fastutil.doubles.Double2FloatFunction p0,java.lang.Object p1){
return Double2FloatFunctions.synchronize(p0,p1);
}
}
