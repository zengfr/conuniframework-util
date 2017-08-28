package com.github.zengfr.supercommons;
import it.unimi.dsi.fastutil.ints.Int2ByteFunctions;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Int2ByteFunctionUtil{ 
public static it.unimi.dsi.fastutil.ints.Int2ByteFunction singleton(int p0,byte p1){
return Int2ByteFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.ints.Int2ByteFunction singleton(java.lang.Integer p0,java.lang.Byte p1){
return Int2ByteFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.ints.Int2ByteFunction primitive(java.util.function.Function<? super java.lang.Integer, ? extends java.lang.Byte> p0){
return Int2ByteFunctions.primitive(p0);
}
public static it.unimi.dsi.fastutil.ints.Int2ByteFunction unmodifiable(it.unimi.dsi.fastutil.ints.Int2ByteFunction p0){
return Int2ByteFunctions.unmodifiable(p0);
}
public static it.unimi.dsi.fastutil.ints.Int2ByteFunction synchronize(it.unimi.dsi.fastutil.ints.Int2ByteFunction p0){
return Int2ByteFunctions.synchronize(p0);
}
public static it.unimi.dsi.fastutil.ints.Int2ByteFunction synchronize(it.unimi.dsi.fastutil.ints.Int2ByteFunction p0,java.lang.Object p1){
return Int2ByteFunctions.synchronize(p0,p1);
}
}
