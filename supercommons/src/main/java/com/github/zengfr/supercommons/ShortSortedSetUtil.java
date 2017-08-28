package com.github.zengfr.supercommons;
import it.unimi.dsi.fastutil.shorts.ShortSortedSets;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class ShortSortedSetUtil{ 
public static it.unimi.dsi.fastutil.shorts.ShortSortedSet singleton(java.lang.Object p0,it.unimi.dsi.fastutil.shorts.ShortComparator p1){
return ShortSortedSets.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.shorts.ShortSortedSet singleton(short p0){
return ShortSortedSets.singleton(p0);
}
public static it.unimi.dsi.fastutil.shorts.ShortSortedSet singleton(java.lang.Object p0){
return ShortSortedSets.singleton(p0);
}
public static it.unimi.dsi.fastutil.shorts.ShortSortedSet singleton(short p0,it.unimi.dsi.fastutil.shorts.ShortComparator p1){
return ShortSortedSets.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.shorts.ShortSortedSet unmodifiable(it.unimi.dsi.fastutil.shorts.ShortSortedSet p0){
return ShortSortedSets.unmodifiable(p0);
}
public static it.unimi.dsi.fastutil.shorts.ShortSortedSet synchronize(it.unimi.dsi.fastutil.shorts.ShortSortedSet p0){
return ShortSortedSets.synchronize(p0);
}
public static it.unimi.dsi.fastutil.shorts.ShortSortedSet synchronize(it.unimi.dsi.fastutil.shorts.ShortSortedSet p0,java.lang.Object p1){
return ShortSortedSets.synchronize(p0,p1);
}
}
