package com.github.zengfr.supercommons;
import it.unimi.dsi.fastutil.floats.Float2BooleanFunctions;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Float2BooleanFunctionUtil{ 
public static it.unimi.dsi.fastutil.floats.Float2BooleanFunction singleton(float p0,boolean p1){
return Float2BooleanFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.floats.Float2BooleanFunction singleton(java.lang.Float p0,java.lang.Boolean p1){
return Float2BooleanFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.floats.Float2BooleanFunction primitive(java.util.function.Function<? super java.lang.Float, ? extends java.lang.Boolean> p0){
return Float2BooleanFunctions.primitive(p0);
}
public static it.unimi.dsi.fastutil.floats.Float2BooleanFunction unmodifiable(it.unimi.dsi.fastutil.floats.Float2BooleanFunction p0){
return Float2BooleanFunctions.unmodifiable(p0);
}
public static it.unimi.dsi.fastutil.floats.Float2BooleanFunction synchronize(it.unimi.dsi.fastutil.floats.Float2BooleanFunction p0){
return Float2BooleanFunctions.synchronize(p0);
}
public static it.unimi.dsi.fastutil.floats.Float2BooleanFunction synchronize(it.unimi.dsi.fastutil.floats.Float2BooleanFunction p0,java.lang.Object p1){
return Float2BooleanFunctions.synchronize(p0,p1);
}
}
