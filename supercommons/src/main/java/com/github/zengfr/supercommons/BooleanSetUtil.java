package com.zengfr.supercommons;
import it.unimi.dsi.fastutil.booleans.BooleanSets;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class BooleanSetUtil{ 
public static it.unimi.dsi.fastutil.booleans.BooleanSet singleton(java.lang.Boolean p0){
return BooleanSets.singleton(p0);
}
public static it.unimi.dsi.fastutil.booleans.BooleanSet singleton(boolean p0){
return BooleanSets.singleton(p0);
}
public static it.unimi.dsi.fastutil.booleans.BooleanSet unmodifiable(it.unimi.dsi.fastutil.booleans.BooleanSet p0){
return BooleanSets.unmodifiable(p0);
}
public static it.unimi.dsi.fastutil.booleans.BooleanSet synchronize(it.unimi.dsi.fastutil.booleans.BooleanSet p0){
return BooleanSets.synchronize(p0);
}
public static it.unimi.dsi.fastutil.booleans.BooleanSet synchronize(it.unimi.dsi.fastutil.booleans.BooleanSet p0,java.lang.Object p1){
return BooleanSets.synchronize(p0,p1);
}
}
