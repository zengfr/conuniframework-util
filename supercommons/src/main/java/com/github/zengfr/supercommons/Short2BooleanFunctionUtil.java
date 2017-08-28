package com.github.zengfr.supercommons;
import it.unimi.dsi.fastutil.shorts.Short2BooleanFunctions;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Short2BooleanFunctionUtil{ 
public static it.unimi.dsi.fastutil.shorts.Short2BooleanFunction singleton(short p0,boolean p1){
return Short2BooleanFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.shorts.Short2BooleanFunction singleton(java.lang.Short p0,java.lang.Boolean p1){
return Short2BooleanFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.shorts.Short2BooleanFunction primitive(java.util.function.Function<? super java.lang.Short, ? extends java.lang.Boolean> p0){
return Short2BooleanFunctions.primitive(p0);
}
public static it.unimi.dsi.fastutil.shorts.Short2BooleanFunction unmodifiable(it.unimi.dsi.fastutil.shorts.Short2BooleanFunction p0){
return Short2BooleanFunctions.unmodifiable(p0);
}
public static it.unimi.dsi.fastutil.shorts.Short2BooleanFunction synchronize(it.unimi.dsi.fastutil.shorts.Short2BooleanFunction p0){
return Short2BooleanFunctions.synchronize(p0);
}
public static it.unimi.dsi.fastutil.shorts.Short2BooleanFunction synchronize(it.unimi.dsi.fastutil.shorts.Short2BooleanFunction p0,java.lang.Object p1){
return Short2BooleanFunctions.synchronize(p0,p1);
}
}
