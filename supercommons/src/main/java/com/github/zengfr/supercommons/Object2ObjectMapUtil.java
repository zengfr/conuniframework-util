package com.zengfr.supercommons;
import it.unimi.dsi.fastutil.objects.Object2ObjectMaps;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Object2ObjectMapUtil{ 
public static <K,V> it.unimi.dsi.fastutil.objects.Object2ObjectMap<K, V> emptyMap(){
return Object2ObjectMaps.emptyMap();
}
public static <K,V> it.unimi.dsi.fastutil.objects.Object2ObjectMap<K, V> singleton(K p0,V p1){
return Object2ObjectMaps.singleton(p0,p1);
}
public static <K,V> it.unimi.dsi.fastutil.objects.Object2ObjectMap<K, V> unmodifiable(it.unimi.dsi.fastutil.objects.Object2ObjectMap<K, V> p0){
return Object2ObjectMaps.unmodifiable(p0);
}
public static <K,V> it.unimi.dsi.fastutil.objects.Object2ObjectMap<K, V> synchronize(it.unimi.dsi.fastutil.objects.Object2ObjectMap<K, V> p0,java.lang.Object p1){
return Object2ObjectMaps.synchronize(p0,p1);
}
public static <K,V> it.unimi.dsi.fastutil.objects.Object2ObjectMap<K, V> synchronize(it.unimi.dsi.fastutil.objects.Object2ObjectMap<K, V> p0){
return Object2ObjectMaps.synchronize(p0);
}
}
