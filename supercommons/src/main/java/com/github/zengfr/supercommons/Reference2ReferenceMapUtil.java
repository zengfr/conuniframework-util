package com.github.zengfr.supercommons;
import it.unimi.dsi.fastutil.objects.Reference2ReferenceMaps;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Reference2ReferenceMapUtil{ 
public static <K,V> it.unimi.dsi.fastutil.objects.Reference2ReferenceMap<K, V> emptyMap(){
return Reference2ReferenceMaps.emptyMap();
}
public static <K,V> it.unimi.dsi.fastutil.objects.Reference2ReferenceMap<K, V> singleton(K p0,V p1){
return Reference2ReferenceMaps.singleton(p0,p1);
}
public static <K,V> it.unimi.dsi.fastutil.objects.Reference2ReferenceMap<K, V> unmodifiable(it.unimi.dsi.fastutil.objects.Reference2ReferenceMap<K, V> p0){
return Reference2ReferenceMaps.unmodifiable(p0);
}
public static <K,V> it.unimi.dsi.fastutil.objects.Reference2ReferenceMap<K, V> synchronize(it.unimi.dsi.fastutil.objects.Reference2ReferenceMap<K, V> p0,java.lang.Object p1){
return Reference2ReferenceMaps.synchronize(p0,p1);
}
public static <K,V> it.unimi.dsi.fastutil.objects.Reference2ReferenceMap<K, V> synchronize(it.unimi.dsi.fastutil.objects.Reference2ReferenceMap<K, V> p0){
return Reference2ReferenceMaps.synchronize(p0);
}
}
