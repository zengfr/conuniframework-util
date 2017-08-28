package com.zengfr.supercommons;
import it.unimi.dsi.fastutil.ints.Int2BooleanFunctions;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Int2BooleanFunctionUtil{ 
public static it.unimi.dsi.fastutil.ints.Int2BooleanFunction singleton(java.lang.Integer p0,java.lang.Boolean p1){
return Int2BooleanFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.ints.Int2BooleanFunction singleton(int p0,boolean p1){
return Int2BooleanFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.ints.Int2BooleanFunction unmodifiable(it.unimi.dsi.fastutil.ints.Int2BooleanFunction p0){
return Int2BooleanFunctions.unmodifiable(p0);
}
public static it.unimi.dsi.fastutil.ints.Int2BooleanFunction primitive(java.util.function.Function<? super java.lang.Integer, ? extends java.lang.Boolean> p0){
return Int2BooleanFunctions.primitive(p0);
}
public static it.unimi.dsi.fastutil.ints.Int2BooleanFunction synchronize(it.unimi.dsi.fastutil.ints.Int2BooleanFunction p0){
return Int2BooleanFunctions.synchronize(p0);
}
public static it.unimi.dsi.fastutil.ints.Int2BooleanFunction synchronize(it.unimi.dsi.fastutil.ints.Int2BooleanFunction p0,java.lang.Object p1){
return Int2BooleanFunctions.synchronize(p0,p1);
}
}
