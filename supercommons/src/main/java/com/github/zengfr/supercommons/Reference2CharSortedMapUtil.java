package com.zengfr.supercommons;
import it.unimi.dsi.fastutil.objects.Reference2CharSortedMaps;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Reference2CharSortedMapUtil{ 
public static <K> it.unimi.dsi.fastutil.objects.Reference2CharSortedMap<K> emptyMap(){
return Reference2CharSortedMaps.emptyMap();
}
public static <K> it.unimi.dsi.fastutil.objects.Reference2CharSortedMap<K> singleton(K p0,java.lang.Character p1){
return Reference2CharSortedMaps.singleton(p0,p1);
}
public static <K> it.unimi.dsi.fastutil.objects.Reference2CharSortedMap<K> singleton(K p0,char p1){
return Reference2CharSortedMaps.singleton(p0,p1);
}
public static <K> it.unimi.dsi.fastutil.objects.Reference2CharSortedMap<K> singleton(K p0,java.lang.Character p1,java.util.Comparator<? super K> p2){
return Reference2CharSortedMaps.singleton(p0,p1,p2);
}
public static <K> it.unimi.dsi.fastutil.objects.Reference2CharSortedMap<K> singleton(K p0,char p1,java.util.Comparator<? super K> p2){
return Reference2CharSortedMaps.singleton(p0,p1,p2);
}
public static <K> it.unimi.dsi.fastutil.objects.Reference2CharSortedMap<K> unmodifiable(it.unimi.dsi.fastutil.objects.Reference2CharSortedMap<K> p0){
return Reference2CharSortedMaps.unmodifiable(p0);
}
public static <K> it.unimi.dsi.fastutil.objects.Reference2CharSortedMap<K> synchronize(it.unimi.dsi.fastutil.objects.Reference2CharSortedMap<K> p0,java.lang.Object p1){
return Reference2CharSortedMaps.synchronize(p0,p1);
}
public static <K> it.unimi.dsi.fastutil.objects.Reference2CharSortedMap<K> synchronize(it.unimi.dsi.fastutil.objects.Reference2CharSortedMap<K> p0){
return Reference2CharSortedMaps.synchronize(p0);
}
}
