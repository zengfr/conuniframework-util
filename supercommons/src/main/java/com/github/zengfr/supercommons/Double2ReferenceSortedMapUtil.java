package com.github.zengfr.supercommons;
import it.unimi.dsi.fastutil.doubles.Double2ReferenceSortedMaps;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Double2ReferenceSortedMapUtil{ 
public static <V> it.unimi.dsi.fastutil.doubles.Double2ReferenceSortedMap<V> emptyMap(){
return Double2ReferenceSortedMaps.emptyMap();
}
public static <V> it.unimi.dsi.fastutil.doubles.Double2ReferenceSortedMap<V> singleton(java.lang.Double p0,V p1){
return Double2ReferenceSortedMaps.singleton(p0,p1);
}
public static <V> it.unimi.dsi.fastutil.doubles.Double2ReferenceSortedMap<V> singleton(double p0,V p1){
return Double2ReferenceSortedMaps.singleton(p0,p1);
}
public static <V> it.unimi.dsi.fastutil.doubles.Double2ReferenceSortedMap<V> singleton(java.lang.Double p0,V p1,it.unimi.dsi.fastutil.doubles.DoubleComparator p2){
return Double2ReferenceSortedMaps.singleton(p0,p1,p2);
}
public static <V> it.unimi.dsi.fastutil.doubles.Double2ReferenceSortedMap<V> singleton(double p0,V p1,it.unimi.dsi.fastutil.doubles.DoubleComparator p2){
return Double2ReferenceSortedMaps.singleton(p0,p1,p2);
}
public static <V> it.unimi.dsi.fastutil.doubles.Double2ReferenceSortedMap<V> unmodifiable(it.unimi.dsi.fastutil.doubles.Double2ReferenceSortedMap<V> p0){
return Double2ReferenceSortedMaps.unmodifiable(p0);
}
public static <V> it.unimi.dsi.fastutil.doubles.Double2ReferenceSortedMap<V> synchronize(it.unimi.dsi.fastutil.doubles.Double2ReferenceSortedMap<V> p0,java.lang.Object p1){
return Double2ReferenceSortedMaps.synchronize(p0,p1);
}
public static <V> it.unimi.dsi.fastutil.doubles.Double2ReferenceSortedMap<V> synchronize(it.unimi.dsi.fastutil.doubles.Double2ReferenceSortedMap<V> p0){
return Double2ReferenceSortedMaps.synchronize(p0);
}
}
