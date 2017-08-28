package com.github.zengfr.supercommons;
import it.unimi.dsi.fastutil.bytes.Byte2ObjectMaps;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Byte2ObjectMapUtil{ 
public static <V> it.unimi.dsi.fastutil.bytes.Byte2ObjectMap<V> emptyMap(){
return Byte2ObjectMaps.emptyMap();
}
public static <V> it.unimi.dsi.fastutil.bytes.Byte2ObjectMap<V> singleton(byte p0,V p1){
return Byte2ObjectMaps.singleton(p0,p1);
}
public static <V> it.unimi.dsi.fastutil.bytes.Byte2ObjectMap<V> singleton(java.lang.Byte p0,V p1){
return Byte2ObjectMaps.singleton(p0,p1);
}
public static <V> it.unimi.dsi.fastutil.bytes.Byte2ObjectMap<V> unmodifiable(it.unimi.dsi.fastutil.bytes.Byte2ObjectMap<V> p0){
return Byte2ObjectMaps.unmodifiable(p0);
}
public static <V> it.unimi.dsi.fastutil.bytes.Byte2ObjectMap<V> synchronize(it.unimi.dsi.fastutil.bytes.Byte2ObjectMap<V> p0,java.lang.Object p1){
return Byte2ObjectMaps.synchronize(p0,p1);
}
public static <V> it.unimi.dsi.fastutil.bytes.Byte2ObjectMap<V> synchronize(it.unimi.dsi.fastutil.bytes.Byte2ObjectMap<V> p0){
return Byte2ObjectMaps.synchronize(p0);
}
}
