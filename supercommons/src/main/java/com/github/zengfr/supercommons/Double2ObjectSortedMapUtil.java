package com.zengfr.supercommons;
import it.unimi.dsi.fastutil.doubles.Double2ObjectSortedMaps;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Double2ObjectSortedMapUtil{ 
public static <V> it.unimi.dsi.fastutil.doubles.Double2ObjectSortedMap<V> emptyMap(){
return Double2ObjectSortedMaps.emptyMap();
}
public static <V> it.unimi.dsi.fastutil.doubles.Double2ObjectSortedMap<V> singleton(java.lang.Double p0,V p1){
return Double2ObjectSortedMaps.singleton(p0,p1);
}
public static <V> it.unimi.dsi.fastutil.doubles.Double2ObjectSortedMap<V> singleton(double p0,V p1){
return Double2ObjectSortedMaps.singleton(p0,p1);
}
public static <V> it.unimi.dsi.fastutil.doubles.Double2ObjectSortedMap<V> singleton(java.lang.Double p0,V p1,it.unimi.dsi.fastutil.doubles.DoubleComparator p2){
return Double2ObjectSortedMaps.singleton(p0,p1,p2);
}
public static <V> it.unimi.dsi.fastutil.doubles.Double2ObjectSortedMap<V> singleton(double p0,V p1,it.unimi.dsi.fastutil.doubles.DoubleComparator p2){
return Double2ObjectSortedMaps.singleton(p0,p1,p2);
}
public static <V> it.unimi.dsi.fastutil.doubles.Double2ObjectSortedMap<V> unmodifiable(it.unimi.dsi.fastutil.doubles.Double2ObjectSortedMap<V> p0){
return Double2ObjectSortedMaps.unmodifiable(p0);
}
public static <V> it.unimi.dsi.fastutil.doubles.Double2ObjectSortedMap<V> synchronize(it.unimi.dsi.fastutil.doubles.Double2ObjectSortedMap<V> p0,java.lang.Object p1){
return Double2ObjectSortedMaps.synchronize(p0,p1);
}
public static <V> it.unimi.dsi.fastutil.doubles.Double2ObjectSortedMap<V> synchronize(it.unimi.dsi.fastutil.doubles.Double2ObjectSortedMap<V> p0){
return Double2ObjectSortedMaps.synchronize(p0);
}
}
