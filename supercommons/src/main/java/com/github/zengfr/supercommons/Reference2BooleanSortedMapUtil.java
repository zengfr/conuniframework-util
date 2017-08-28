package com.github.zengfr.supercommons;
import it.unimi.dsi.fastutil.objects.Reference2BooleanSortedMaps;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Reference2BooleanSortedMapUtil{ 
public static <K> it.unimi.dsi.fastutil.objects.Reference2BooleanSortedMap<K> emptyMap(){
return Reference2BooleanSortedMaps.emptyMap();
}
public static <K> it.unimi.dsi.fastutil.objects.Reference2BooleanSortedMap<K> singleton(K p0,java.lang.Boolean p1){
return Reference2BooleanSortedMaps.singleton(p0,p1);
}
public static <K> it.unimi.dsi.fastutil.objects.Reference2BooleanSortedMap<K> singleton(K p0,boolean p1){
return Reference2BooleanSortedMaps.singleton(p0,p1);
}
public static <K> it.unimi.dsi.fastutil.objects.Reference2BooleanSortedMap<K> singleton(K p0,java.lang.Boolean p1,java.util.Comparator<? super K> p2){
return Reference2BooleanSortedMaps.singleton(p0,p1,p2);
}
public static <K> it.unimi.dsi.fastutil.objects.Reference2BooleanSortedMap<K> singleton(K p0,boolean p1,java.util.Comparator<? super K> p2){
return Reference2BooleanSortedMaps.singleton(p0,p1,p2);
}
public static <K> it.unimi.dsi.fastutil.objects.Reference2BooleanSortedMap<K> unmodifiable(it.unimi.dsi.fastutil.objects.Reference2BooleanSortedMap<K> p0){
return Reference2BooleanSortedMaps.unmodifiable(p0);
}
public static <K> it.unimi.dsi.fastutil.objects.Reference2BooleanSortedMap<K> synchronize(it.unimi.dsi.fastutil.objects.Reference2BooleanSortedMap<K> p0,java.lang.Object p1){
return Reference2BooleanSortedMaps.synchronize(p0,p1);
}
public static <K> it.unimi.dsi.fastutil.objects.Reference2BooleanSortedMap<K> synchronize(it.unimi.dsi.fastutil.objects.Reference2BooleanSortedMap<K> p0){
return Reference2BooleanSortedMaps.synchronize(p0);
}
}
