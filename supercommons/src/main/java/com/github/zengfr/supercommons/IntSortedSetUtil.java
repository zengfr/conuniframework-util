package com.zengfr.supercommons;
import it.unimi.dsi.fastutil.ints.IntSortedSets;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class IntSortedSetUtil{ 
public static it.unimi.dsi.fastutil.ints.IntSortedSet singleton(java.lang.Object p0,it.unimi.dsi.fastutil.ints.IntComparator p1){
return IntSortedSets.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.ints.IntSortedSet singleton(int p0){
return IntSortedSets.singleton(p0);
}
public static it.unimi.dsi.fastutil.ints.IntSortedSet singleton(java.lang.Object p0){
return IntSortedSets.singleton(p0);
}
public static it.unimi.dsi.fastutil.ints.IntSortedSet singleton(int p0,it.unimi.dsi.fastutil.ints.IntComparator p1){
return IntSortedSets.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.ints.IntSortedSet unmodifiable(it.unimi.dsi.fastutil.ints.IntSortedSet p0){
return IntSortedSets.unmodifiable(p0);
}
public static it.unimi.dsi.fastutil.ints.IntSortedSet synchronize(it.unimi.dsi.fastutil.ints.IntSortedSet p0){
return IntSortedSets.synchronize(p0);
}
public static it.unimi.dsi.fastutil.ints.IntSortedSet synchronize(it.unimi.dsi.fastutil.ints.IntSortedSet p0,java.lang.Object p1){
return IntSortedSets.synchronize(p0,p1);
}
}
