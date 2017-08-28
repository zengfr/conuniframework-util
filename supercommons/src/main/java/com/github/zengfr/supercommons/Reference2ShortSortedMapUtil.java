package com.github.zengfr.supercommons;
import it.unimi.dsi.fastutil.objects.Reference2ShortSortedMaps;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Reference2ShortSortedMapUtil{ 
public static <K> it.unimi.dsi.fastutil.objects.Reference2ShortSortedMap<K> emptyMap(){
return Reference2ShortSortedMaps.emptyMap();
}
public static <K> it.unimi.dsi.fastutil.objects.Reference2ShortSortedMap<K> singleton(K p0,java.lang.Short p1){
return Reference2ShortSortedMaps.singleton(p0,p1);
}
public static <K> it.unimi.dsi.fastutil.objects.Reference2ShortSortedMap<K> singleton(K p0,short p1){
return Reference2ShortSortedMaps.singleton(p0,p1);
}
public static <K> it.unimi.dsi.fastutil.objects.Reference2ShortSortedMap<K> singleton(K p0,java.lang.Short p1,java.util.Comparator<? super K> p2){
return Reference2ShortSortedMaps.singleton(p0,p1,p2);
}
public static <K> it.unimi.dsi.fastutil.objects.Reference2ShortSortedMap<K> singleton(K p0,short p1,java.util.Comparator<? super K> p2){
return Reference2ShortSortedMaps.singleton(p0,p1,p2);
}
public static <K> it.unimi.dsi.fastutil.objects.Reference2ShortSortedMap<K> unmodifiable(it.unimi.dsi.fastutil.objects.Reference2ShortSortedMap<K> p0){
return Reference2ShortSortedMaps.unmodifiable(p0);
}
public static <K> it.unimi.dsi.fastutil.objects.Reference2ShortSortedMap<K> synchronize(it.unimi.dsi.fastutil.objects.Reference2ShortSortedMap<K> p0,java.lang.Object p1){
return Reference2ShortSortedMaps.synchronize(p0,p1);
}
public static <K> it.unimi.dsi.fastutil.objects.Reference2ShortSortedMap<K> synchronize(it.unimi.dsi.fastutil.objects.Reference2ShortSortedMap<K> p0){
return Reference2ShortSortedMaps.synchronize(p0);
}
}
