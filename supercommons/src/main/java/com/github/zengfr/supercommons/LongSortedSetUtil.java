package com.zengfr.supercommons;
import it.unimi.dsi.fastutil.longs.LongSortedSets;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class LongSortedSetUtil{ 
public static it.unimi.dsi.fastutil.longs.LongSortedSet singleton(java.lang.Object p0,it.unimi.dsi.fastutil.longs.LongComparator p1){
return LongSortedSets.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.longs.LongSortedSet singleton(long p0){
return LongSortedSets.singleton(p0);
}
public static it.unimi.dsi.fastutil.longs.LongSortedSet singleton(java.lang.Object p0){
return LongSortedSets.singleton(p0);
}
public static it.unimi.dsi.fastutil.longs.LongSortedSet singleton(long p0,it.unimi.dsi.fastutil.longs.LongComparator p1){
return LongSortedSets.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.longs.LongSortedSet unmodifiable(it.unimi.dsi.fastutil.longs.LongSortedSet p0){
return LongSortedSets.unmodifiable(p0);
}
public static it.unimi.dsi.fastutil.longs.LongSortedSet synchronize(it.unimi.dsi.fastutil.longs.LongSortedSet p0){
return LongSortedSets.synchronize(p0);
}
public static it.unimi.dsi.fastutil.longs.LongSortedSet synchronize(it.unimi.dsi.fastutil.longs.LongSortedSet p0,java.lang.Object p1){
return LongSortedSets.synchronize(p0,p1);
}
}
