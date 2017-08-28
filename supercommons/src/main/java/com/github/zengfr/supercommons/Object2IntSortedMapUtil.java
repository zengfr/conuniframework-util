package com.zengfr.supercommons;
import it.unimi.dsi.fastutil.objects.Object2IntSortedMaps;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Object2IntSortedMapUtil{ 
public static <K> it.unimi.dsi.fastutil.objects.Object2IntSortedMap<K> emptyMap(){
return Object2IntSortedMaps.emptyMap();
}
public static <K> it.unimi.dsi.fastutil.objects.Object2IntSortedMap<K> singleton(K p0,java.lang.Integer p1){
return Object2IntSortedMaps.singleton(p0,p1);
}
public static <K> it.unimi.dsi.fastutil.objects.Object2IntSortedMap<K> singleton(K p0,int p1){
return Object2IntSortedMaps.singleton(p0,p1);
}
public static <K> it.unimi.dsi.fastutil.objects.Object2IntSortedMap<K> singleton(K p0,java.lang.Integer p1,java.util.Comparator<? super K> p2){
return Object2IntSortedMaps.singleton(p0,p1,p2);
}
public static <K> it.unimi.dsi.fastutil.objects.Object2IntSortedMap<K> singleton(K p0,int p1,java.util.Comparator<? super K> p2){
return Object2IntSortedMaps.singleton(p0,p1,p2);
}
public static <K> it.unimi.dsi.fastutil.objects.Object2IntSortedMap<K> unmodifiable(it.unimi.dsi.fastutil.objects.Object2IntSortedMap<K> p0){
return Object2IntSortedMaps.unmodifiable(p0);
}
public static <K> it.unimi.dsi.fastutil.objects.Object2IntSortedMap<K> synchronize(it.unimi.dsi.fastutil.objects.Object2IntSortedMap<K> p0,java.lang.Object p1){
return Object2IntSortedMaps.synchronize(p0,p1);
}
public static <K> it.unimi.dsi.fastutil.objects.Object2IntSortedMap<K> synchronize(it.unimi.dsi.fastutil.objects.Object2IntSortedMap<K> p0){
return Object2IntSortedMaps.synchronize(p0);
}
}
