package com.zengfr.supercommons;
import it.unimi.dsi.fastutil.floats.Float2ReferenceSortedMaps;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Float2ReferenceSortedMapUtil{ 
public static <V> it.unimi.dsi.fastutil.floats.Float2ReferenceSortedMap<V> emptyMap(){
return Float2ReferenceSortedMaps.emptyMap();
}
public static <V> it.unimi.dsi.fastutil.floats.Float2ReferenceSortedMap<V> singleton(java.lang.Float p0,V p1){
return Float2ReferenceSortedMaps.singleton(p0,p1);
}
public static <V> it.unimi.dsi.fastutil.floats.Float2ReferenceSortedMap<V> singleton(float p0,V p1){
return Float2ReferenceSortedMaps.singleton(p0,p1);
}
public static <V> it.unimi.dsi.fastutil.floats.Float2ReferenceSortedMap<V> singleton(java.lang.Float p0,V p1,it.unimi.dsi.fastutil.floats.FloatComparator p2){
return Float2ReferenceSortedMaps.singleton(p0,p1,p2);
}
public static <V> it.unimi.dsi.fastutil.floats.Float2ReferenceSortedMap<V> singleton(float p0,V p1,it.unimi.dsi.fastutil.floats.FloatComparator p2){
return Float2ReferenceSortedMaps.singleton(p0,p1,p2);
}
public static <V> it.unimi.dsi.fastutil.floats.Float2ReferenceSortedMap<V> unmodifiable(it.unimi.dsi.fastutil.floats.Float2ReferenceSortedMap<V> p0){
return Float2ReferenceSortedMaps.unmodifiable(p0);
}
public static <V> it.unimi.dsi.fastutil.floats.Float2ReferenceSortedMap<V> synchronize(it.unimi.dsi.fastutil.floats.Float2ReferenceSortedMap<V> p0,java.lang.Object p1){
return Float2ReferenceSortedMaps.synchronize(p0,p1);
}
public static <V> it.unimi.dsi.fastutil.floats.Float2ReferenceSortedMap<V> synchronize(it.unimi.dsi.fastutil.floats.Float2ReferenceSortedMap<V> p0){
return Float2ReferenceSortedMaps.synchronize(p0);
}
}
