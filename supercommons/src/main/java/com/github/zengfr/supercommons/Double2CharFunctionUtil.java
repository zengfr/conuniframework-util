package com.zengfr.supercommons;
import it.unimi.dsi.fastutil.doubles.Double2CharFunctions;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Double2CharFunctionUtil{ 
public static it.unimi.dsi.fastutil.doubles.Double2CharFunction singleton(java.lang.Double p0,java.lang.Character p1){
return Double2CharFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.doubles.Double2CharFunction singleton(double p0,char p1){
return Double2CharFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.doubles.Double2CharFunction unmodifiable(it.unimi.dsi.fastutil.doubles.Double2CharFunction p0){
return Double2CharFunctions.unmodifiable(p0);
}
public static it.unimi.dsi.fastutil.doubles.Double2CharFunction primitive(java.util.function.Function<? super java.lang.Double, ? extends java.lang.Character> p0){
return Double2CharFunctions.primitive(p0);
}
public static it.unimi.dsi.fastutil.doubles.Double2CharFunction synchronize(it.unimi.dsi.fastutil.doubles.Double2CharFunction p0,java.lang.Object p1){
return Double2CharFunctions.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.doubles.Double2CharFunction synchronize(it.unimi.dsi.fastutil.doubles.Double2CharFunction p0){
return Double2CharFunctions.synchronize(p0);
}
}
