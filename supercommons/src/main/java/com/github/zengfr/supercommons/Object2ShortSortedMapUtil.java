package com.github.zengfr.supercommons;
import it.unimi.dsi.fastutil.objects.Object2ShortSortedMaps;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Object2ShortSortedMapUtil{ 
public static <K> it.unimi.dsi.fastutil.objects.Object2ShortSortedMap<K> emptyMap(){
return Object2ShortSortedMaps.emptyMap();
}
public static <K> it.unimi.dsi.fastutil.objects.Object2ShortSortedMap<K> singleton(K p0,java.lang.Short p1){
return Object2ShortSortedMaps.singleton(p0,p1);
}
public static <K> it.unimi.dsi.fastutil.objects.Object2ShortSortedMap<K> singleton(K p0,short p1){
return Object2ShortSortedMaps.singleton(p0,p1);
}
public static <K> it.unimi.dsi.fastutil.objects.Object2ShortSortedMap<K> singleton(K p0,java.lang.Short p1,java.util.Comparator<? super K> p2){
return Object2ShortSortedMaps.singleton(p0,p1,p2);
}
public static <K> it.unimi.dsi.fastutil.objects.Object2ShortSortedMap<K> singleton(K p0,short p1,java.util.Comparator<? super K> p2){
return Object2ShortSortedMaps.singleton(p0,p1,p2);
}
public static <K> it.unimi.dsi.fastutil.objects.Object2ShortSortedMap<K> unmodifiable(it.unimi.dsi.fastutil.objects.Object2ShortSortedMap<K> p0){
return Object2ShortSortedMaps.unmodifiable(p0);
}
public static <K> it.unimi.dsi.fastutil.objects.Object2ShortSortedMap<K> synchronize(it.unimi.dsi.fastutil.objects.Object2ShortSortedMap<K> p0,java.lang.Object p1){
return Object2ShortSortedMaps.synchronize(p0,p1);
}
public static <K> it.unimi.dsi.fastutil.objects.Object2ShortSortedMap<K> synchronize(it.unimi.dsi.fastutil.objects.Object2ShortSortedMap<K> p0){
return Object2ShortSortedMaps.synchronize(p0);
}
}
