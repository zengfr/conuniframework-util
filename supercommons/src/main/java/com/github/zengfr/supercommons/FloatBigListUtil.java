package com.zengfr.supercommons;
import it.unimi.dsi.fastutil.floats.FloatBigLists;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class FloatBigListUtil{ 
public static it.unimi.dsi.fastutil.floats.FloatBigList shuffle(it.unimi.dsi.fastutil.floats.FloatBigList p0,java.util.Random p1){
return FloatBigLists.shuffle(p0,p1);
}
public static it.unimi.dsi.fastutil.floats.FloatBigList singleton(float p0){
return FloatBigLists.singleton(p0);
}
public static it.unimi.dsi.fastutil.floats.FloatBigList singleton(java.lang.Object p0){
return FloatBigLists.singleton(p0);
}
public static it.unimi.dsi.fastutil.floats.FloatBigList unmodifiable(it.unimi.dsi.fastutil.floats.FloatBigList p0){
return FloatBigLists.unmodifiable(p0);
}
public static it.unimi.dsi.fastutil.floats.FloatBigList synchronize(it.unimi.dsi.fastutil.floats.FloatBigList p0){
return FloatBigLists.synchronize(p0);
}
public static it.unimi.dsi.fastutil.floats.FloatBigList synchronize(it.unimi.dsi.fastutil.floats.FloatBigList p0,java.lang.Object p1){
return FloatBigLists.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.floats.FloatBigList asBigList(it.unimi.dsi.fastutil.floats.FloatList p0){
return FloatBigLists.asBigList(p0);
}
}
