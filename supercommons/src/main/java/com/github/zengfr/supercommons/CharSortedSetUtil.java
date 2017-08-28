package com.github.zengfr.supercommons;
import it.unimi.dsi.fastutil.chars.CharSortedSets;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class CharSortedSetUtil{ 
public static it.unimi.dsi.fastutil.chars.CharSortedSet singleton(java.lang.Object p0,it.unimi.dsi.fastutil.chars.CharComparator p1){
return CharSortedSets.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.chars.CharSortedSet singleton(char p0){
return CharSortedSets.singleton(p0);
}
public static it.unimi.dsi.fastutil.chars.CharSortedSet singleton(java.lang.Object p0){
return CharSortedSets.singleton(p0);
}
public static it.unimi.dsi.fastutil.chars.CharSortedSet singleton(char p0,it.unimi.dsi.fastutil.chars.CharComparator p1){
return CharSortedSets.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.chars.CharSortedSet unmodifiable(it.unimi.dsi.fastutil.chars.CharSortedSet p0){
return CharSortedSets.unmodifiable(p0);
}
public static it.unimi.dsi.fastutil.chars.CharSortedSet synchronize(it.unimi.dsi.fastutil.chars.CharSortedSet p0){
return CharSortedSets.synchronize(p0);
}
public static it.unimi.dsi.fastutil.chars.CharSortedSet synchronize(it.unimi.dsi.fastutil.chars.CharSortedSet p0,java.lang.Object p1){
return CharSortedSets.synchronize(p0,p1);
}
}
