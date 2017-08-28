package com.zengfr.supercommons;
import it.unimi.dsi.fastutil.longs.Long2BooleanFunctions;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Long2BooleanFunctionUtil{ 
public static it.unimi.dsi.fastutil.longs.Long2BooleanFunction singleton(java.lang.Long p0,java.lang.Boolean p1){
return Long2BooleanFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.longs.Long2BooleanFunction singleton(long p0,boolean p1){
return Long2BooleanFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.longs.Long2BooleanFunction unmodifiable(it.unimi.dsi.fastutil.longs.Long2BooleanFunction p0){
return Long2BooleanFunctions.unmodifiable(p0);
}
public static it.unimi.dsi.fastutil.longs.Long2BooleanFunction primitive(java.util.function.Function<? super java.lang.Long, ? extends java.lang.Boolean> p0){
return Long2BooleanFunctions.primitive(p0);
}
public static it.unimi.dsi.fastutil.longs.Long2BooleanFunction synchronize(it.unimi.dsi.fastutil.longs.Long2BooleanFunction p0){
return Long2BooleanFunctions.synchronize(p0);
}
public static it.unimi.dsi.fastutil.longs.Long2BooleanFunction synchronize(it.unimi.dsi.fastutil.longs.Long2BooleanFunction p0,java.lang.Object p1){
return Long2BooleanFunctions.synchronize(p0,p1);
}
}
