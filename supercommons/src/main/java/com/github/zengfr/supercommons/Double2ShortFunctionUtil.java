package com.zengfr.supercommons;
import it.unimi.dsi.fastutil.doubles.Double2ShortFunctions;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Double2ShortFunctionUtil{ 
public static it.unimi.dsi.fastutil.doubles.Double2ShortFunction singleton(java.lang.Double p0,java.lang.Short p1){
return Double2ShortFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.doubles.Double2ShortFunction singleton(double p0,short p1){
return Double2ShortFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.doubles.Double2ShortFunction unmodifiable(it.unimi.dsi.fastutil.doubles.Double2ShortFunction p0){
return Double2ShortFunctions.unmodifiable(p0);
}
public static it.unimi.dsi.fastutil.doubles.Double2ShortFunction primitive(java.util.function.Function<? super java.lang.Double, ? extends java.lang.Short> p0){
return Double2ShortFunctions.primitive(p0);
}
public static it.unimi.dsi.fastutil.doubles.Double2ShortFunction synchronize(it.unimi.dsi.fastutil.doubles.Double2ShortFunction p0,java.lang.Object p1){
return Double2ShortFunctions.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.doubles.Double2ShortFunction synchronize(it.unimi.dsi.fastutil.doubles.Double2ShortFunction p0){
return Double2ShortFunctions.synchronize(p0);
}
}
