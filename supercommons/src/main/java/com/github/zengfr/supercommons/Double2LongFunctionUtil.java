package com.github.zengfr.supercommons;
import it.unimi.dsi.fastutil.doubles.Double2LongFunctions;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Double2LongFunctionUtil{ 
public static it.unimi.dsi.fastutil.doubles.Double2LongFunction singleton(double p0,long p1){
return Double2LongFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.doubles.Double2LongFunction singleton(java.lang.Double p0,java.lang.Long p1){
return Double2LongFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.doubles.Double2LongFunction primitive(java.util.function.Function<? super java.lang.Double, ? extends java.lang.Long> p0){
return Double2LongFunctions.primitive(p0);
}
public static it.unimi.dsi.fastutil.doubles.Double2LongFunction unmodifiable(it.unimi.dsi.fastutil.doubles.Double2LongFunction p0){
return Double2LongFunctions.unmodifiable(p0);
}
public static it.unimi.dsi.fastutil.doubles.Double2LongFunction synchronize(it.unimi.dsi.fastutil.doubles.Double2LongFunction p0){
return Double2LongFunctions.synchronize(p0);
}
public static it.unimi.dsi.fastutil.doubles.Double2LongFunction synchronize(it.unimi.dsi.fastutil.doubles.Double2LongFunction p0,java.lang.Object p1){
return Double2LongFunctions.synchronize(p0,p1);
}
}
