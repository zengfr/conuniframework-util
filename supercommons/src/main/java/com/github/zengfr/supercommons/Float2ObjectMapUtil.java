package com.zengfr.supercommons;
import it.unimi.dsi.fastutil.floats.Float2ObjectMaps;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Float2ObjectMapUtil{ 
public static <V> it.unimi.dsi.fastutil.floats.Float2ObjectMap<V> emptyMap(){
return Float2ObjectMaps.emptyMap();
}
public static <V> it.unimi.dsi.fastutil.floats.Float2ObjectMap<V> singleton(float p0,V p1){
return Float2ObjectMaps.singleton(p0,p1);
}
public static <V> it.unimi.dsi.fastutil.floats.Float2ObjectMap<V> singleton(java.lang.Float p0,V p1){
return Float2ObjectMaps.singleton(p0,p1);
}
public static <V> it.unimi.dsi.fastutil.floats.Float2ObjectMap<V> unmodifiable(it.unimi.dsi.fastutil.floats.Float2ObjectMap<V> p0){
return Float2ObjectMaps.unmodifiable(p0);
}
public static <V> it.unimi.dsi.fastutil.floats.Float2ObjectMap<V> synchronize(it.unimi.dsi.fastutil.floats.Float2ObjectMap<V> p0,java.lang.Object p1){
return Float2ObjectMaps.synchronize(p0,p1);
}
public static <V> it.unimi.dsi.fastutil.floats.Float2ObjectMap<V> synchronize(it.unimi.dsi.fastutil.floats.Float2ObjectMap<V> p0){
return Float2ObjectMaps.synchronize(p0);
}
}
