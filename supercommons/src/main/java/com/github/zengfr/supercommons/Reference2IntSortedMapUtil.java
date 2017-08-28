package com.github.zengfr.supercommons;
import it.unimi.dsi.fastutil.objects.Reference2IntSortedMaps;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Reference2IntSortedMapUtil{ 
public static <K> it.unimi.dsi.fastutil.objects.Reference2IntSortedMap<K> emptyMap(){
return Reference2IntSortedMaps.emptyMap();
}
public static <K> it.unimi.dsi.fastutil.objects.Reference2IntSortedMap<K> singleton(K p0,java.lang.Integer p1){
return Reference2IntSortedMaps.singleton(p0,p1);
}
public static <K> it.unimi.dsi.fastutil.objects.Reference2IntSortedMap<K> singleton(K p0,int p1){
return Reference2IntSortedMaps.singleton(p0,p1);
}
public static <K> it.unimi.dsi.fastutil.objects.Reference2IntSortedMap<K> singleton(K p0,java.lang.Integer p1,java.util.Comparator<? super K> p2){
return Reference2IntSortedMaps.singleton(p0,p1,p2);
}
public static <K> it.unimi.dsi.fastutil.objects.Reference2IntSortedMap<K> singleton(K p0,int p1,java.util.Comparator<? super K> p2){
return Reference2IntSortedMaps.singleton(p0,p1,p2);
}
public static <K> it.unimi.dsi.fastutil.objects.Reference2IntSortedMap<K> unmodifiable(it.unimi.dsi.fastutil.objects.Reference2IntSortedMap<K> p0){
return Reference2IntSortedMaps.unmodifiable(p0);
}
public static <K> it.unimi.dsi.fastutil.objects.Reference2IntSortedMap<K> synchronize(it.unimi.dsi.fastutil.objects.Reference2IntSortedMap<K> p0,java.lang.Object p1){
return Reference2IntSortedMaps.synchronize(p0,p1);
}
public static <K> it.unimi.dsi.fastutil.objects.Reference2IntSortedMap<K> synchronize(it.unimi.dsi.fastutil.objects.Reference2IntSortedMap<K> p0){
return Reference2IntSortedMaps.synchronize(p0);
}
}
