package com.zengfr.supercommons;
import it.unimi.dsi.fastutil.floats.FloatSets;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class FloatSetUtil{ 
public static it.unimi.dsi.fastutil.floats.FloatSet singleton(java.lang.Float p0){
return FloatSets.singleton(p0);
}
public static it.unimi.dsi.fastutil.floats.FloatSet singleton(float p0){
return FloatSets.singleton(p0);
}
public static it.unimi.dsi.fastutil.floats.FloatSet unmodifiable(it.unimi.dsi.fastutil.floats.FloatSet p0){
return FloatSets.unmodifiable(p0);
}
public static it.unimi.dsi.fastutil.floats.FloatSet synchronize(it.unimi.dsi.fastutil.floats.FloatSet p0){
return FloatSets.synchronize(p0);
}
public static it.unimi.dsi.fastutil.floats.FloatSet synchronize(it.unimi.dsi.fastutil.floats.FloatSet p0,java.lang.Object p1){
return FloatSets.synchronize(p0,p1);
}
}
