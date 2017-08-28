package com.github.zengfr.supercommons;
import it.unimi.dsi.fastutil.objects.Reference2LongSortedMaps;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Reference2LongSortedMapUtil{ 
public static <K> it.unimi.dsi.fastutil.objects.Reference2LongSortedMap<K> emptyMap(){
return Reference2LongSortedMaps.emptyMap();
}
public static <K> it.unimi.dsi.fastutil.objects.Reference2LongSortedMap<K> singleton(K p0,java.lang.Long p1){
return Reference2LongSortedMaps.singleton(p0,p1);
}
public static <K> it.unimi.dsi.fastutil.objects.Reference2LongSortedMap<K> singleton(K p0,long p1){
return Reference2LongSortedMaps.singleton(p0,p1);
}
public static <K> it.unimi.dsi.fastutil.objects.Reference2LongSortedMap<K> singleton(K p0,java.lang.Long p1,java.util.Comparator<? super K> p2){
return Reference2LongSortedMaps.singleton(p0,p1,p2);
}
public static <K> it.unimi.dsi.fastutil.objects.Reference2LongSortedMap<K> singleton(K p0,long p1,java.util.Comparator<? super K> p2){
return Reference2LongSortedMaps.singleton(p0,p1,p2);
}
public static <K> it.unimi.dsi.fastutil.objects.Reference2LongSortedMap<K> unmodifiable(it.unimi.dsi.fastutil.objects.Reference2LongSortedMap<K> p0){
return Reference2LongSortedMaps.unmodifiable(p0);
}
public static <K> it.unimi.dsi.fastutil.objects.Reference2LongSortedMap<K> synchronize(it.unimi.dsi.fastutil.objects.Reference2LongSortedMap<K> p0,java.lang.Object p1){
return Reference2LongSortedMaps.synchronize(p0,p1);
}
public static <K> it.unimi.dsi.fastutil.objects.Reference2LongSortedMap<K> synchronize(it.unimi.dsi.fastutil.objects.Reference2LongSortedMap<K> p0){
return Reference2LongSortedMaps.synchronize(p0);
}
}
