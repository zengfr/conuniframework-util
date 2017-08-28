package com.github.zengfr.supercommons;
import it.unimi.dsi.fastutil.doubles.Double2IntFunctions;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Double2IntFunctionUtil{ 
public static it.unimi.dsi.fastutil.doubles.Double2IntFunction singleton(double p0,int p1){
return Double2IntFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.doubles.Double2IntFunction singleton(java.lang.Double p0,java.lang.Integer p1){
return Double2IntFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.doubles.Double2IntFunction primitive(java.util.function.Function<? super java.lang.Double, ? extends java.lang.Integer> p0){
return Double2IntFunctions.primitive(p0);
}
public static it.unimi.dsi.fastutil.doubles.Double2IntFunction unmodifiable(it.unimi.dsi.fastutil.doubles.Double2IntFunction p0){
return Double2IntFunctions.unmodifiable(p0);
}
public static it.unimi.dsi.fastutil.doubles.Double2IntFunction synchronize(it.unimi.dsi.fastutil.doubles.Double2IntFunction p0){
return Double2IntFunctions.synchronize(p0);
}
public static it.unimi.dsi.fastutil.doubles.Double2IntFunction synchronize(it.unimi.dsi.fastutil.doubles.Double2IntFunction p0,java.lang.Object p1){
return Double2IntFunctions.synchronize(p0,p1);
}
}
