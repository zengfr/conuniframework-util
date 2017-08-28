package com.github.zengfr.supercommons;
import it.unimi.dsi.fastutil.shorts.ShortBigLists;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class ShortBigListUtil{ 
public static it.unimi.dsi.fastutil.shorts.ShortBigList shuffle(it.unimi.dsi.fastutil.shorts.ShortBigList p0,java.util.Random p1){
return ShortBigLists.shuffle(p0,p1);
}
public static it.unimi.dsi.fastutil.shorts.ShortBigList singleton(short p0){
return ShortBigLists.singleton(p0);
}
public static it.unimi.dsi.fastutil.shorts.ShortBigList singleton(java.lang.Object p0){
return ShortBigLists.singleton(p0);
}
public static it.unimi.dsi.fastutil.shorts.ShortBigList unmodifiable(it.unimi.dsi.fastutil.shorts.ShortBigList p0){
return ShortBigLists.unmodifiable(p0);
}
public static it.unimi.dsi.fastutil.shorts.ShortBigList synchronize(it.unimi.dsi.fastutil.shorts.ShortBigList p0){
return ShortBigLists.synchronize(p0);
}
public static it.unimi.dsi.fastutil.shorts.ShortBigList synchronize(it.unimi.dsi.fastutil.shorts.ShortBigList p0,java.lang.Object p1){
return ShortBigLists.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.shorts.ShortBigList asBigList(it.unimi.dsi.fastutil.shorts.ShortList p0){
return ShortBigLists.asBigList(p0);
}
}
