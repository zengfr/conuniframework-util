package com.github.zengfr.supercommons;
import it.unimi.dsi.fastutil.ints.Int2ReferenceSortedMaps;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Int2ReferenceSortedMapUtil{ 
public static <V> it.unimi.dsi.fastutil.ints.Int2ReferenceSortedMap<V> emptyMap(){
return Int2ReferenceSortedMaps.emptyMap();
}
public static <V> it.unimi.dsi.fastutil.ints.Int2ReferenceSortedMap<V> singleton(java.lang.Integer p0,V p1){
return Int2ReferenceSortedMaps.singleton(p0,p1);
}
public static <V> it.unimi.dsi.fastutil.ints.Int2ReferenceSortedMap<V> singleton(int p0,V p1){
return Int2ReferenceSortedMaps.singleton(p0,p1);
}
public static <V> it.unimi.dsi.fastutil.ints.Int2ReferenceSortedMap<V> singleton(java.lang.Integer p0,V p1,it.unimi.dsi.fastutil.ints.IntComparator p2){
return Int2ReferenceSortedMaps.singleton(p0,p1,p2);
}
public static <V> it.unimi.dsi.fastutil.ints.Int2ReferenceSortedMap<V> singleton(int p0,V p1,it.unimi.dsi.fastutil.ints.IntComparator p2){
return Int2ReferenceSortedMaps.singleton(p0,p1,p2);
}
public static <V> it.unimi.dsi.fastutil.ints.Int2ReferenceSortedMap<V> unmodifiable(it.unimi.dsi.fastutil.ints.Int2ReferenceSortedMap<V> p0){
return Int2ReferenceSortedMaps.unmodifiable(p0);
}
public static <V> it.unimi.dsi.fastutil.ints.Int2ReferenceSortedMap<V> synchronize(it.unimi.dsi.fastutil.ints.Int2ReferenceSortedMap<V> p0,java.lang.Object p1){
return Int2ReferenceSortedMaps.synchronize(p0,p1);
}
public static <V> it.unimi.dsi.fastutil.ints.Int2ReferenceSortedMap<V> synchronize(it.unimi.dsi.fastutil.ints.Int2ReferenceSortedMap<V> p0){
return Int2ReferenceSortedMaps.synchronize(p0);
}
}
