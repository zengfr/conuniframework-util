package com.github.zengfr.supercommons;
import it.unimi.dsi.fastutil.doubles.Double2ByteFunctions;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Double2ByteFunctionUtil{ 
public static it.unimi.dsi.fastutil.doubles.Double2ByteFunction singleton(double p0,byte p1){
return Double2ByteFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.doubles.Double2ByteFunction singleton(java.lang.Double p0,java.lang.Byte p1){
return Double2ByteFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.doubles.Double2ByteFunction primitive(java.util.function.Function<? super java.lang.Double, ? extends java.lang.Byte> p0){
return Double2ByteFunctions.primitive(p0);
}
public static it.unimi.dsi.fastutil.doubles.Double2ByteFunction unmodifiable(it.unimi.dsi.fastutil.doubles.Double2ByteFunction p0){
return Double2ByteFunctions.unmodifiable(p0);
}
public static it.unimi.dsi.fastutil.doubles.Double2ByteFunction synchronize(it.unimi.dsi.fastutil.doubles.Double2ByteFunction p0){
return Double2ByteFunctions.synchronize(p0);
}
public static it.unimi.dsi.fastutil.doubles.Double2ByteFunction synchronize(it.unimi.dsi.fastutil.doubles.Double2ByteFunction p0,java.lang.Object p1){
return Double2ByteFunctions.synchronize(p0,p1);
}
}
