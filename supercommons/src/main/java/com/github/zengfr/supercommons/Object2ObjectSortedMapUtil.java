package com.zengfr.supercommons;
import it.unimi.dsi.fastutil.objects.Object2ObjectSortedMaps;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Object2ObjectSortedMapUtil{ 
public static <K,V> it.unimi.dsi.fastutil.objects.Object2ObjectSortedMap<K, V> emptyMap(){
return Object2ObjectSortedMaps.emptyMap();
}
public static <K,V> it.unimi.dsi.fastutil.objects.Object2ObjectSortedMap<K, V> singleton(K p0,V p1){
return Object2ObjectSortedMaps.singleton(p0,p1);
}
public static <K,V> it.unimi.dsi.fastutil.objects.Object2ObjectSortedMap<K, V> singleton(K p0,V p1,java.util.Comparator<? super K> p2){
return Object2ObjectSortedMaps.singleton(p0,p1,p2);
}
public static <K,V> it.unimi.dsi.fastutil.objects.Object2ObjectSortedMap<K, V> unmodifiable(it.unimi.dsi.fastutil.objects.Object2ObjectSortedMap<K, V> p0){
return Object2ObjectSortedMaps.unmodifiable(p0);
}
public static <K,V> it.unimi.dsi.fastutil.objects.Object2ObjectSortedMap<K, V> synchronize(it.unimi.dsi.fastutil.objects.Object2ObjectSortedMap<K, V> p0,java.lang.Object p1){
return Object2ObjectSortedMaps.synchronize(p0,p1);
}
public static <K,V> it.unimi.dsi.fastutil.objects.Object2ObjectSortedMap<K, V> synchronize(it.unimi.dsi.fastutil.objects.Object2ObjectSortedMap<K, V> p0){
return Object2ObjectSortedMaps.synchronize(p0);
}
}
