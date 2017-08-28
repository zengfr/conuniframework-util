package com.github.zengfr.supercommons;
import it.unimi.dsi.fastutil.objects.Reference2ObjectMaps;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Reference2ObjectMapUtil{ 
public static <K,V> it.unimi.dsi.fastutil.objects.Reference2ObjectMap<K, V> emptyMap(){
return Reference2ObjectMaps.emptyMap();
}
public static <K,V> it.unimi.dsi.fastutil.objects.Reference2ObjectMap<K, V> singleton(K p0,V p1){
return Reference2ObjectMaps.singleton(p0,p1);
}
public static <K,V> it.unimi.dsi.fastutil.objects.Reference2ObjectMap<K, V> unmodifiable(it.unimi.dsi.fastutil.objects.Reference2ObjectMap<K, V> p0){
return Reference2ObjectMaps.unmodifiable(p0);
}
public static <K,V> it.unimi.dsi.fastutil.objects.Reference2ObjectMap<K, V> synchronize(it.unimi.dsi.fastutil.objects.Reference2ObjectMap<K, V> p0,java.lang.Object p1){
return Reference2ObjectMaps.synchronize(p0,p1);
}
public static <K,V> it.unimi.dsi.fastutil.objects.Reference2ObjectMap<K, V> synchronize(it.unimi.dsi.fastutil.objects.Reference2ObjectMap<K, V> p0){
return Reference2ObjectMaps.synchronize(p0);
}
}
