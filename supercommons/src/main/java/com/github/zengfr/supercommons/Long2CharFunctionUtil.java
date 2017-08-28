package com.zengfr.supercommons;
import it.unimi.dsi.fastutil.longs.Long2CharFunctions;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Long2CharFunctionUtil{ 
public static it.unimi.dsi.fastutil.longs.Long2CharFunction singleton(java.lang.Long p0,java.lang.Character p1){
return Long2CharFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.longs.Long2CharFunction singleton(long p0,char p1){
return Long2CharFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.longs.Long2CharFunction unmodifiable(it.unimi.dsi.fastutil.longs.Long2CharFunction p0){
return Long2CharFunctions.unmodifiable(p0);
}
public static it.unimi.dsi.fastutil.longs.Long2CharFunction primitive(java.util.function.Function<? super java.lang.Long, ? extends java.lang.Character> p0){
return Long2CharFunctions.primitive(p0);
}
public static it.unimi.dsi.fastutil.longs.Long2CharFunction synchronize(it.unimi.dsi.fastutil.longs.Long2CharFunction p0,java.lang.Object p1){
return Long2CharFunctions.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.longs.Long2CharFunction synchronize(it.unimi.dsi.fastutil.longs.Long2CharFunction p0){
return Long2CharFunctions.synchronize(p0);
}
}
