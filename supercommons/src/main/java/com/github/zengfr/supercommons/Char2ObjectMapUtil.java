package com.github.zengfr.supercommons;
import it.unimi.dsi.fastutil.chars.Char2ObjectMaps;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Char2ObjectMapUtil{ 
public static <V> it.unimi.dsi.fastutil.chars.Char2ObjectMap<V> emptyMap(){
return Char2ObjectMaps.emptyMap();
}
public static <V> it.unimi.dsi.fastutil.chars.Char2ObjectMap<V> singleton(char p0,V p1){
return Char2ObjectMaps.singleton(p0,p1);
}
public static <V> it.unimi.dsi.fastutil.chars.Char2ObjectMap<V> singleton(java.lang.Character p0,V p1){
return Char2ObjectMaps.singleton(p0,p1);
}
public static <V> it.unimi.dsi.fastutil.chars.Char2ObjectMap<V> unmodifiable(it.unimi.dsi.fastutil.chars.Char2ObjectMap<V> p0){
return Char2ObjectMaps.unmodifiable(p0);
}
public static <V> it.unimi.dsi.fastutil.chars.Char2ObjectMap<V> synchronize(it.unimi.dsi.fastutil.chars.Char2ObjectMap<V> p0,java.lang.Object p1){
return Char2ObjectMaps.synchronize(p0,p1);
}
public static <V> it.unimi.dsi.fastutil.chars.Char2ObjectMap<V> synchronize(it.unimi.dsi.fastutil.chars.Char2ObjectMap<V> p0){
return Char2ObjectMaps.synchronize(p0);
}
}
