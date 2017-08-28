package com.github.zengfr.supercommons;
import it.unimi.dsi.fastutil.floats.Float2ObjectSortedMaps;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Float2ObjectSortedMapUtil{ 
public static <V> it.unimi.dsi.fastutil.floats.Float2ObjectSortedMap<V> emptyMap(){
return Float2ObjectSortedMaps.emptyMap();
}
public static <V> it.unimi.dsi.fastutil.floats.Float2ObjectSortedMap<V> singleton(java.lang.Float p0,V p1){
return Float2ObjectSortedMaps.singleton(p0,p1);
}
public static <V> it.unimi.dsi.fastutil.floats.Float2ObjectSortedMap<V> singleton(float p0,V p1){
return Float2ObjectSortedMaps.singleton(p0,p1);
}
public static <V> it.unimi.dsi.fastutil.floats.Float2ObjectSortedMap<V> singleton(java.lang.Float p0,V p1,it.unimi.dsi.fastutil.floats.FloatComparator p2){
return Float2ObjectSortedMaps.singleton(p0,p1,p2);
}
public static <V> it.unimi.dsi.fastutil.floats.Float2ObjectSortedMap<V> singleton(float p0,V p1,it.unimi.dsi.fastutil.floats.FloatComparator p2){
return Float2ObjectSortedMaps.singleton(p0,p1,p2);
}
public static <V> it.unimi.dsi.fastutil.floats.Float2ObjectSortedMap<V> unmodifiable(it.unimi.dsi.fastutil.floats.Float2ObjectSortedMap<V> p0){
return Float2ObjectSortedMaps.unmodifiable(p0);
}
public static <V> it.unimi.dsi.fastutil.floats.Float2ObjectSortedMap<V> synchronize(it.unimi.dsi.fastutil.floats.Float2ObjectSortedMap<V> p0,java.lang.Object p1){
return Float2ObjectSortedMaps.synchronize(p0,p1);
}
public static <V> it.unimi.dsi.fastutil.floats.Float2ObjectSortedMap<V> synchronize(it.unimi.dsi.fastutil.floats.Float2ObjectSortedMap<V> p0){
return Float2ObjectSortedMaps.synchronize(p0);
}
}
