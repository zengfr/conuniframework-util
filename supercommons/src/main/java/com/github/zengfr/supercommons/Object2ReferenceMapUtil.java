package com.zengfr.supercommons;
import it.unimi.dsi.fastutil.objects.Object2ReferenceMaps;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Object2ReferenceMapUtil{ 
public static <K,V> it.unimi.dsi.fastutil.objects.Object2ReferenceMap<K, V> emptyMap(){
return Object2ReferenceMaps.emptyMap();
}
public static <K,V> it.unimi.dsi.fastutil.objects.Object2ReferenceMap<K, V> singleton(K p0,V p1){
return Object2ReferenceMaps.singleton(p0,p1);
}
public static <K,V> it.unimi.dsi.fastutil.objects.Object2ReferenceMap<K, V> unmodifiable(it.unimi.dsi.fastutil.objects.Object2ReferenceMap<K, V> p0){
return Object2ReferenceMaps.unmodifiable(p0);
}
public static <K,V> it.unimi.dsi.fastutil.objects.Object2ReferenceMap<K, V> synchronize(it.unimi.dsi.fastutil.objects.Object2ReferenceMap<K, V> p0,java.lang.Object p1){
return Object2ReferenceMaps.synchronize(p0,p1);
}
public static <K,V> it.unimi.dsi.fastutil.objects.Object2ReferenceMap<K, V> synchronize(it.unimi.dsi.fastutil.objects.Object2ReferenceMap<K, V> p0){
return Object2ReferenceMaps.synchronize(p0);
}
}
