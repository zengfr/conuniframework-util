package com.zengfr.supercommons;
import it.unimi.dsi.fastutil.doubles.Double2ObjectMaps;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Double2ObjectMapUtil{ 
public static <V> it.unimi.dsi.fastutil.doubles.Double2ObjectMap<V> emptyMap(){
return Double2ObjectMaps.emptyMap();
}
public static <V> it.unimi.dsi.fastutil.doubles.Double2ObjectMap<V> singleton(double p0,V p1){
return Double2ObjectMaps.singleton(p0,p1);
}
public static <V> it.unimi.dsi.fastutil.doubles.Double2ObjectMap<V> singleton(java.lang.Double p0,V p1){
return Double2ObjectMaps.singleton(p0,p1);
}
public static <V> it.unimi.dsi.fastutil.doubles.Double2ObjectMap<V> unmodifiable(it.unimi.dsi.fastutil.doubles.Double2ObjectMap<V> p0){
return Double2ObjectMaps.unmodifiable(p0);
}
public static <V> it.unimi.dsi.fastutil.doubles.Double2ObjectMap<V> synchronize(it.unimi.dsi.fastutil.doubles.Double2ObjectMap<V> p0,java.lang.Object p1){
return Double2ObjectMaps.synchronize(p0,p1);
}
public static <V> it.unimi.dsi.fastutil.doubles.Double2ObjectMap<V> synchronize(it.unimi.dsi.fastutil.doubles.Double2ObjectMap<V> p0){
return Double2ObjectMaps.synchronize(p0);
}
}
