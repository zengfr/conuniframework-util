package com.zengfr.supercommons;
import it.unimi.dsi.fastutil.shorts.Short2ObjectMaps;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Short2ObjectMapUtil{ 
public static <V> it.unimi.dsi.fastutil.shorts.Short2ObjectMap<V> emptyMap(){
return Short2ObjectMaps.emptyMap();
}
public static <V> it.unimi.dsi.fastutil.shorts.Short2ObjectMap<V> singleton(short p0,V p1){
return Short2ObjectMaps.singleton(p0,p1);
}
public static <V> it.unimi.dsi.fastutil.shorts.Short2ObjectMap<V> singleton(java.lang.Short p0,V p1){
return Short2ObjectMaps.singleton(p0,p1);
}
public static <V> it.unimi.dsi.fastutil.shorts.Short2ObjectMap<V> unmodifiable(it.unimi.dsi.fastutil.shorts.Short2ObjectMap<V> p0){
return Short2ObjectMaps.unmodifiable(p0);
}
public static <V> it.unimi.dsi.fastutil.shorts.Short2ObjectMap<V> synchronize(it.unimi.dsi.fastutil.shorts.Short2ObjectMap<V> p0,java.lang.Object p1){
return Short2ObjectMaps.synchronize(p0,p1);
}
public static <V> it.unimi.dsi.fastutil.shorts.Short2ObjectMap<V> synchronize(it.unimi.dsi.fastutil.shorts.Short2ObjectMap<V> p0){
return Short2ObjectMaps.synchronize(p0);
}
}
