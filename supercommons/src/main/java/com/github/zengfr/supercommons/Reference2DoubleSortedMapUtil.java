package com.github.zengfr.supercommons;
import it.unimi.dsi.fastutil.objects.Reference2DoubleSortedMaps;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Reference2DoubleSortedMapUtil{ 
public static <K> it.unimi.dsi.fastutil.objects.Reference2DoubleSortedMap<K> emptyMap(){
return Reference2DoubleSortedMaps.emptyMap();
}
public static <K> it.unimi.dsi.fastutil.objects.Reference2DoubleSortedMap<K> singleton(K p0,java.lang.Double p1){
return Reference2DoubleSortedMaps.singleton(p0,p1);
}
public static <K> it.unimi.dsi.fastutil.objects.Reference2DoubleSortedMap<K> singleton(K p0,double p1){
return Reference2DoubleSortedMaps.singleton(p0,p1);
}
public static <K> it.unimi.dsi.fastutil.objects.Reference2DoubleSortedMap<K> singleton(K p0,java.lang.Double p1,java.util.Comparator<? super K> p2){
return Reference2DoubleSortedMaps.singleton(p0,p1,p2);
}
public static <K> it.unimi.dsi.fastutil.objects.Reference2DoubleSortedMap<K> singleton(K p0,double p1,java.util.Comparator<? super K> p2){
return Reference2DoubleSortedMaps.singleton(p0,p1,p2);
}
public static <K> it.unimi.dsi.fastutil.objects.Reference2DoubleSortedMap<K> unmodifiable(it.unimi.dsi.fastutil.objects.Reference2DoubleSortedMap<K> p0){
return Reference2DoubleSortedMaps.unmodifiable(p0);
}
public static <K> it.unimi.dsi.fastutil.objects.Reference2DoubleSortedMap<K> synchronize(it.unimi.dsi.fastutil.objects.Reference2DoubleSortedMap<K> p0,java.lang.Object p1){
return Reference2DoubleSortedMaps.synchronize(p0,p1);
}
public static <K> it.unimi.dsi.fastutil.objects.Reference2DoubleSortedMap<K> synchronize(it.unimi.dsi.fastutil.objects.Reference2DoubleSortedMap<K> p0){
return Reference2DoubleSortedMaps.synchronize(p0);
}
}
