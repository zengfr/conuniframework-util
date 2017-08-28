package com.github.zengfr.supercommons;
import it.unimi.dsi.fastutil.longs.Long2ReferenceSortedMaps;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Long2ReferenceSortedMapUtil{ 
public static <V> it.unimi.dsi.fastutil.longs.Long2ReferenceSortedMap<V> emptyMap(){
return Long2ReferenceSortedMaps.emptyMap();
}
public static <V> it.unimi.dsi.fastutil.longs.Long2ReferenceSortedMap<V> singleton(java.lang.Long p0,V p1){
return Long2ReferenceSortedMaps.singleton(p0,p1);
}
public static <V> it.unimi.dsi.fastutil.longs.Long2ReferenceSortedMap<V> singleton(long p0,V p1){
return Long2ReferenceSortedMaps.singleton(p0,p1);
}
public static <V> it.unimi.dsi.fastutil.longs.Long2ReferenceSortedMap<V> singleton(java.lang.Long p0,V p1,it.unimi.dsi.fastutil.longs.LongComparator p2){
return Long2ReferenceSortedMaps.singleton(p0,p1,p2);
}
public static <V> it.unimi.dsi.fastutil.longs.Long2ReferenceSortedMap<V> singleton(long p0,V p1,it.unimi.dsi.fastutil.longs.LongComparator p2){
return Long2ReferenceSortedMaps.singleton(p0,p1,p2);
}
public static <V> it.unimi.dsi.fastutil.longs.Long2ReferenceSortedMap<V> unmodifiable(it.unimi.dsi.fastutil.longs.Long2ReferenceSortedMap<V> p0){
return Long2ReferenceSortedMaps.unmodifiable(p0);
}
public static <V> it.unimi.dsi.fastutil.longs.Long2ReferenceSortedMap<V> synchronize(it.unimi.dsi.fastutil.longs.Long2ReferenceSortedMap<V> p0,java.lang.Object p1){
return Long2ReferenceSortedMaps.synchronize(p0,p1);
}
public static <V> it.unimi.dsi.fastutil.longs.Long2ReferenceSortedMap<V> synchronize(it.unimi.dsi.fastutil.longs.Long2ReferenceSortedMap<V> p0){
return Long2ReferenceSortedMaps.synchronize(p0);
}
}
