package com.github.zengfr.supercommons;
import it.unimi.dsi.fastutil.objects.Reference2ObjectSortedMaps;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Reference2ObjectSortedMapUtil{ 
public static <K,V> it.unimi.dsi.fastutil.objects.Reference2ObjectSortedMap<K, V> emptyMap(){
return Reference2ObjectSortedMaps.emptyMap();
}
public static <K,V> it.unimi.dsi.fastutil.objects.Reference2ObjectSortedMap<K, V> singleton(K p0,V p1){
return Reference2ObjectSortedMaps.singleton(p0,p1);
}
public static <K,V> it.unimi.dsi.fastutil.objects.Reference2ObjectSortedMap<K, V> singleton(K p0,V p1,java.util.Comparator<? super K> p2){
return Reference2ObjectSortedMaps.singleton(p0,p1,p2);
}
public static <K,V> it.unimi.dsi.fastutil.objects.Reference2ObjectSortedMap<K, V> unmodifiable(it.unimi.dsi.fastutil.objects.Reference2ObjectSortedMap<K, V> p0){
return Reference2ObjectSortedMaps.unmodifiable(p0);
}
public static <K,V> it.unimi.dsi.fastutil.objects.Reference2ObjectSortedMap<K, V> synchronize(it.unimi.dsi.fastutil.objects.Reference2ObjectSortedMap<K, V> p0,java.lang.Object p1){
return Reference2ObjectSortedMaps.synchronize(p0,p1);
}
public static <K,V> it.unimi.dsi.fastutil.objects.Reference2ObjectSortedMap<K, V> synchronize(it.unimi.dsi.fastutil.objects.Reference2ObjectSortedMap<K, V> p0){
return Reference2ObjectSortedMaps.synchronize(p0);
}
}
