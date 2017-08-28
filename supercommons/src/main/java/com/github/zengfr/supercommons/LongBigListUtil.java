package com.zengfr.supercommons;
import it.unimi.dsi.fastutil.longs.LongBigLists;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class LongBigListUtil{ 
public static it.unimi.dsi.fastutil.longs.LongBigList shuffle(it.unimi.dsi.fastutil.longs.LongBigList p0,java.util.Random p1){
return LongBigLists.shuffle(p0,p1);
}
public static it.unimi.dsi.fastutil.longs.LongBigList singleton(long p0){
return LongBigLists.singleton(p0);
}
public static it.unimi.dsi.fastutil.longs.LongBigList singleton(java.lang.Object p0){
return LongBigLists.singleton(p0);
}
public static it.unimi.dsi.fastutil.longs.LongBigList unmodifiable(it.unimi.dsi.fastutil.longs.LongBigList p0){
return LongBigLists.unmodifiable(p0);
}
public static it.unimi.dsi.fastutil.longs.LongBigList synchronize(it.unimi.dsi.fastutil.longs.LongBigList p0){
return LongBigLists.synchronize(p0);
}
public static it.unimi.dsi.fastutil.longs.LongBigList synchronize(it.unimi.dsi.fastutil.longs.LongBigList p0,java.lang.Object p1){
return LongBigLists.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.longs.LongBigList asBigList(it.unimi.dsi.fastutil.longs.LongList p0){
return LongBigLists.asBigList(p0);
}
}
