package com.github.zengfr.supercommons;
import it.unimi.dsi.fastutil.shorts.Short2ReferenceSortedMaps;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Short2ReferenceSortedMapUtil{ 
public static <V> it.unimi.dsi.fastutil.shorts.Short2ReferenceSortedMap<V> emptyMap(){
return Short2ReferenceSortedMaps.emptyMap();
}
public static <V> it.unimi.dsi.fastutil.shorts.Short2ReferenceSortedMap<V> singleton(java.lang.Short p0,V p1){
return Short2ReferenceSortedMaps.singleton(p0,p1);
}
public static <V> it.unimi.dsi.fastutil.shorts.Short2ReferenceSortedMap<V> singleton(short p0,V p1){
return Short2ReferenceSortedMaps.singleton(p0,p1);
}
public static <V> it.unimi.dsi.fastutil.shorts.Short2ReferenceSortedMap<V> singleton(java.lang.Short p0,V p1,it.unimi.dsi.fastutil.shorts.ShortComparator p2){
return Short2ReferenceSortedMaps.singleton(p0,p1,p2);
}
public static <V> it.unimi.dsi.fastutil.shorts.Short2ReferenceSortedMap<V> singleton(short p0,V p1,it.unimi.dsi.fastutil.shorts.ShortComparator p2){
return Short2ReferenceSortedMaps.singleton(p0,p1,p2);
}
public static <V> it.unimi.dsi.fastutil.shorts.Short2ReferenceSortedMap<V> unmodifiable(it.unimi.dsi.fastutil.shorts.Short2ReferenceSortedMap<V> p0){
return Short2ReferenceSortedMaps.unmodifiable(p0);
}
public static <V> it.unimi.dsi.fastutil.shorts.Short2ReferenceSortedMap<V> synchronize(it.unimi.dsi.fastutil.shorts.Short2ReferenceSortedMap<V> p0,java.lang.Object p1){
return Short2ReferenceSortedMaps.synchronize(p0,p1);
}
public static <V> it.unimi.dsi.fastutil.shorts.Short2ReferenceSortedMap<V> synchronize(it.unimi.dsi.fastutil.shorts.Short2ReferenceSortedMap<V> p0){
return Short2ReferenceSortedMaps.synchronize(p0);
}
}
