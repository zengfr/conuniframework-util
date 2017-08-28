package com.zengfr.supercommons;
import it.unimi.dsi.fastutil.shorts.Short2ObjectSortedMaps;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Short2ObjectSortedMapUtil{ 
public static <V> it.unimi.dsi.fastutil.shorts.Short2ObjectSortedMap<V> emptyMap(){
return Short2ObjectSortedMaps.emptyMap();
}
public static <V> it.unimi.dsi.fastutil.shorts.Short2ObjectSortedMap<V> singleton(java.lang.Short p0,V p1){
return Short2ObjectSortedMaps.singleton(p0,p1);
}
public static <V> it.unimi.dsi.fastutil.shorts.Short2ObjectSortedMap<V> singleton(short p0,V p1){
return Short2ObjectSortedMaps.singleton(p0,p1);
}
public static <V> it.unimi.dsi.fastutil.shorts.Short2ObjectSortedMap<V> singleton(java.lang.Short p0,V p1,it.unimi.dsi.fastutil.shorts.ShortComparator p2){
return Short2ObjectSortedMaps.singleton(p0,p1,p2);
}
public static <V> it.unimi.dsi.fastutil.shorts.Short2ObjectSortedMap<V> singleton(short p0,V p1,it.unimi.dsi.fastutil.shorts.ShortComparator p2){
return Short2ObjectSortedMaps.singleton(p0,p1,p2);
}
public static <V> it.unimi.dsi.fastutil.shorts.Short2ObjectSortedMap<V> unmodifiable(it.unimi.dsi.fastutil.shorts.Short2ObjectSortedMap<V> p0){
return Short2ObjectSortedMaps.unmodifiable(p0);
}
public static <V> it.unimi.dsi.fastutil.shorts.Short2ObjectSortedMap<V> synchronize(it.unimi.dsi.fastutil.shorts.Short2ObjectSortedMap<V> p0,java.lang.Object p1){
return Short2ObjectSortedMaps.synchronize(p0,p1);
}
public static <V> it.unimi.dsi.fastutil.shorts.Short2ObjectSortedMap<V> synchronize(it.unimi.dsi.fastutil.shorts.Short2ObjectSortedMap<V> p0){
return Short2ObjectSortedMaps.synchronize(p0);
}
}
