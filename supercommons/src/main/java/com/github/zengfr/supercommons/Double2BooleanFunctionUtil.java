package com.github.zengfr.supercommons;
import it.unimi.dsi.fastutil.doubles.Double2BooleanFunctions;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Double2BooleanFunctionUtil{ 
public static it.unimi.dsi.fastutil.doubles.Double2BooleanFunction singleton(double p0,boolean p1){
return Double2BooleanFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.doubles.Double2BooleanFunction singleton(java.lang.Double p0,java.lang.Boolean p1){
return Double2BooleanFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.doubles.Double2BooleanFunction primitive(java.util.function.Function<? super java.lang.Double, ? extends java.lang.Boolean> p0){
return Double2BooleanFunctions.primitive(p0);
}
public static it.unimi.dsi.fastutil.doubles.Double2BooleanFunction unmodifiable(it.unimi.dsi.fastutil.doubles.Double2BooleanFunction p0){
return Double2BooleanFunctions.unmodifiable(p0);
}
public static it.unimi.dsi.fastutil.doubles.Double2BooleanFunction synchronize(it.unimi.dsi.fastutil.doubles.Double2BooleanFunction p0){
return Double2BooleanFunctions.synchronize(p0);
}
public static it.unimi.dsi.fastutil.doubles.Double2BooleanFunction synchronize(it.unimi.dsi.fastutil.doubles.Double2BooleanFunction p0,java.lang.Object p1){
return Double2BooleanFunctions.synchronize(p0,p1);
}
}
