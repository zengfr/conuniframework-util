package com.github.zengfr.supercommons;
import it.unimi.dsi.fastutil.chars.Char2ReferenceSortedMaps;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Char2ReferenceSortedMapUtil{ 
public static <V> it.unimi.dsi.fastutil.chars.Char2ReferenceSortedMap<V> emptyMap(){
return Char2ReferenceSortedMaps.emptyMap();
}
public static <V> it.unimi.dsi.fastutil.chars.Char2ReferenceSortedMap<V> singleton(java.lang.Character p0,V p1){
return Char2ReferenceSortedMaps.singleton(p0,p1);
}
public static <V> it.unimi.dsi.fastutil.chars.Char2ReferenceSortedMap<V> singleton(char p0,V p1){
return Char2ReferenceSortedMaps.singleton(p0,p1);
}
public static <V> it.unimi.dsi.fastutil.chars.Char2ReferenceSortedMap<V> singleton(java.lang.Character p0,V p1,it.unimi.dsi.fastutil.chars.CharComparator p2){
return Char2ReferenceSortedMaps.singleton(p0,p1,p2);
}
public static <V> it.unimi.dsi.fastutil.chars.Char2ReferenceSortedMap<V> singleton(char p0,V p1,it.unimi.dsi.fastutil.chars.CharComparator p2){
return Char2ReferenceSortedMaps.singleton(p0,p1,p2);
}
public static <V> it.unimi.dsi.fastutil.chars.Char2ReferenceSortedMap<V> unmodifiable(it.unimi.dsi.fastutil.chars.Char2ReferenceSortedMap<V> p0){
return Char2ReferenceSortedMaps.unmodifiable(p0);
}
public static <V> it.unimi.dsi.fastutil.chars.Char2ReferenceSortedMap<V> synchronize(it.unimi.dsi.fastutil.chars.Char2ReferenceSortedMap<V> p0,java.lang.Object p1){
return Char2ReferenceSortedMaps.synchronize(p0,p1);
}
public static <V> it.unimi.dsi.fastutil.chars.Char2ReferenceSortedMap<V> synchronize(it.unimi.dsi.fastutil.chars.Char2ReferenceSortedMap<V> p0){
return Char2ReferenceSortedMaps.synchronize(p0);
}
}
