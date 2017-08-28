package com.github.zengfr.supercommons;
import it.unimi.dsi.fastutil.objects.Object2ReferenceSortedMaps;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Object2ReferenceSortedMapUtil{ 
public static <K,V> it.unimi.dsi.fastutil.objects.Object2ReferenceSortedMap<K, V> emptyMap(){
return Object2ReferenceSortedMaps.emptyMap();
}
public static <K,V> it.unimi.dsi.fastutil.objects.Object2ReferenceSortedMap<K, V> singleton(K p0,V p1){
return Object2ReferenceSortedMaps.singleton(p0,p1);
}
public static <K,V> it.unimi.dsi.fastutil.objects.Object2ReferenceSortedMap<K, V> singleton(K p0,V p1,java.util.Comparator<? super K> p2){
return Object2ReferenceSortedMaps.singleton(p0,p1,p2);
}
public static <K,V> it.unimi.dsi.fastutil.objects.Object2ReferenceSortedMap<K, V> unmodifiable(it.unimi.dsi.fastutil.objects.Object2ReferenceSortedMap<K, V> p0){
return Object2ReferenceSortedMaps.unmodifiable(p0);
}
public static <K,V> it.unimi.dsi.fastutil.objects.Object2ReferenceSortedMap<K, V> synchronize(it.unimi.dsi.fastutil.objects.Object2ReferenceSortedMap<K, V> p0,java.lang.Object p1){
return Object2ReferenceSortedMaps.synchronize(p0,p1);
}
public static <K,V> it.unimi.dsi.fastutil.objects.Object2ReferenceSortedMap<K, V> synchronize(it.unimi.dsi.fastutil.objects.Object2ReferenceSortedMap<K, V> p0){
return Object2ReferenceSortedMaps.synchronize(p0);
}
}
