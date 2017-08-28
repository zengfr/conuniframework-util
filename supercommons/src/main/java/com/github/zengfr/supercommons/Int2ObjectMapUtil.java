package com.github.zengfr.supercommons;
import it.unimi.dsi.fastutil.ints.Int2ObjectMaps;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Int2ObjectMapUtil{ 
public static <V> it.unimi.dsi.fastutil.ints.Int2ObjectMap<V> emptyMap(){
return Int2ObjectMaps.emptyMap();
}
public static <V> it.unimi.dsi.fastutil.ints.Int2ObjectMap<V> singleton(int p0,V p1){
return Int2ObjectMaps.singleton(p0,p1);
}
public static <V> it.unimi.dsi.fastutil.ints.Int2ObjectMap<V> singleton(java.lang.Integer p0,V p1){
return Int2ObjectMaps.singleton(p0,p1);
}
public static <V> it.unimi.dsi.fastutil.ints.Int2ObjectMap<V> unmodifiable(it.unimi.dsi.fastutil.ints.Int2ObjectMap<V> p0){
return Int2ObjectMaps.unmodifiable(p0);
}
public static <V> it.unimi.dsi.fastutil.ints.Int2ObjectMap<V> synchronize(it.unimi.dsi.fastutil.ints.Int2ObjectMap<V> p0,java.lang.Object p1){
return Int2ObjectMaps.synchronize(p0,p1);
}
public static <V> it.unimi.dsi.fastutil.ints.Int2ObjectMap<V> synchronize(it.unimi.dsi.fastutil.ints.Int2ObjectMap<V> p0){
return Int2ObjectMaps.synchronize(p0);
}
}
