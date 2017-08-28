package com.zengfr.supercommons;
import it.unimi.dsi.fastutil.booleans.BooleanBigLists;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class BooleanBigListUtil{ 
public static it.unimi.dsi.fastutil.booleans.BooleanBigList shuffle(it.unimi.dsi.fastutil.booleans.BooleanBigList p0,java.util.Random p1){
return BooleanBigLists.shuffle(p0,p1);
}
public static it.unimi.dsi.fastutil.booleans.BooleanBigList singleton(boolean p0){
return BooleanBigLists.singleton(p0);
}
public static it.unimi.dsi.fastutil.booleans.BooleanBigList singleton(java.lang.Object p0){
return BooleanBigLists.singleton(p0);
}
public static it.unimi.dsi.fastutil.booleans.BooleanBigList unmodifiable(it.unimi.dsi.fastutil.booleans.BooleanBigList p0){
return BooleanBigLists.unmodifiable(p0);
}
public static it.unimi.dsi.fastutil.booleans.BooleanBigList synchronize(it.unimi.dsi.fastutil.booleans.BooleanBigList p0){
return BooleanBigLists.synchronize(p0);
}
public static it.unimi.dsi.fastutil.booleans.BooleanBigList synchronize(it.unimi.dsi.fastutil.booleans.BooleanBigList p0,java.lang.Object p1){
return BooleanBigLists.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.booleans.BooleanBigList asBigList(it.unimi.dsi.fastutil.booleans.BooleanList p0){
return BooleanBigLists.asBigList(p0);
}
}
