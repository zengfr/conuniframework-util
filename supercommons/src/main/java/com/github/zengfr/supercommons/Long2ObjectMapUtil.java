package com.zengfr.supercommons;
import it.unimi.dsi.fastutil.longs.Long2ObjectMaps;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Long2ObjectMapUtil{ 
public static <V> it.unimi.dsi.fastutil.longs.Long2ObjectMap<V> emptyMap(){
return Long2ObjectMaps.emptyMap();
}
public static <V> it.unimi.dsi.fastutil.longs.Long2ObjectMap<V> singleton(long p0,V p1){
return Long2ObjectMaps.singleton(p0,p1);
}
public static <V> it.unimi.dsi.fastutil.longs.Long2ObjectMap<V> singleton(java.lang.Long p0,V p1){
return Long2ObjectMaps.singleton(p0,p1);
}
public static <V> it.unimi.dsi.fastutil.longs.Long2ObjectMap<V> unmodifiable(it.unimi.dsi.fastutil.longs.Long2ObjectMap<V> p0){
return Long2ObjectMaps.unmodifiable(p0);
}
public static <V> it.unimi.dsi.fastutil.longs.Long2ObjectMap<V> synchronize(it.unimi.dsi.fastutil.longs.Long2ObjectMap<V> p0,java.lang.Object p1){
return Long2ObjectMaps.synchronize(p0,p1);
}
public static <V> it.unimi.dsi.fastutil.longs.Long2ObjectMap<V> synchronize(it.unimi.dsi.fastutil.longs.Long2ObjectMap<V> p0){
return Long2ObjectMaps.synchronize(p0);
}
}
