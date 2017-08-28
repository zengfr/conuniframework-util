package com.zengfr.supercommons;
import it.unimi.dsi.fastutil.chars.Char2ObjectSortedMaps;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Char2ObjectSortedMapUtil{ 
public static <V> it.unimi.dsi.fastutil.chars.Char2ObjectSortedMap<V> emptyMap(){
return Char2ObjectSortedMaps.emptyMap();
}
public static <V> it.unimi.dsi.fastutil.chars.Char2ObjectSortedMap<V> singleton(java.lang.Character p0,V p1){
return Char2ObjectSortedMaps.singleton(p0,p1);
}
public static <V> it.unimi.dsi.fastutil.chars.Char2ObjectSortedMap<V> singleton(char p0,V p1){
return Char2ObjectSortedMaps.singleton(p0,p1);
}
public static <V> it.unimi.dsi.fastutil.chars.Char2ObjectSortedMap<V> singleton(java.lang.Character p0,V p1,it.unimi.dsi.fastutil.chars.CharComparator p2){
return Char2ObjectSortedMaps.singleton(p0,p1,p2);
}
public static <V> it.unimi.dsi.fastutil.chars.Char2ObjectSortedMap<V> singleton(char p0,V p1,it.unimi.dsi.fastutil.chars.CharComparator p2){
return Char2ObjectSortedMaps.singleton(p0,p1,p2);
}
public static <V> it.unimi.dsi.fastutil.chars.Char2ObjectSortedMap<V> unmodifiable(it.unimi.dsi.fastutil.chars.Char2ObjectSortedMap<V> p0){
return Char2ObjectSortedMaps.unmodifiable(p0);
}
public static <V> it.unimi.dsi.fastutil.chars.Char2ObjectSortedMap<V> synchronize(it.unimi.dsi.fastutil.chars.Char2ObjectSortedMap<V> p0,java.lang.Object p1){
return Char2ObjectSortedMaps.synchronize(p0,p1);
}
public static <V> it.unimi.dsi.fastutil.chars.Char2ObjectSortedMap<V> synchronize(it.unimi.dsi.fastutil.chars.Char2ObjectSortedMap<V> p0){
return Char2ObjectSortedMaps.synchronize(p0);
}
}
