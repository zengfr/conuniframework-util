package com.zengfr.supercommons;
import it.unimi.dsi.fastutil.objects.Object2FloatSortedMaps;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Object2FloatSortedMapUtil{ 
public static <K> it.unimi.dsi.fastutil.objects.Object2FloatSortedMap<K> emptyMap(){
return Object2FloatSortedMaps.emptyMap();
}
public static <K> it.unimi.dsi.fastutil.objects.Object2FloatSortedMap<K> singleton(K p0,java.lang.Float p1){
return Object2FloatSortedMaps.singleton(p0,p1);
}
public static <K> it.unimi.dsi.fastutil.objects.Object2FloatSortedMap<K> singleton(K p0,float p1){
return Object2FloatSortedMaps.singleton(p0,p1);
}
public static <K> it.unimi.dsi.fastutil.objects.Object2FloatSortedMap<K> singleton(K p0,java.lang.Float p1,java.util.Comparator<? super K> p2){
return Object2FloatSortedMaps.singleton(p0,p1,p2);
}
public static <K> it.unimi.dsi.fastutil.objects.Object2FloatSortedMap<K> singleton(K p0,float p1,java.util.Comparator<? super K> p2){
return Object2FloatSortedMaps.singleton(p0,p1,p2);
}
public static <K> it.unimi.dsi.fastutil.objects.Object2FloatSortedMap<K> unmodifiable(it.unimi.dsi.fastutil.objects.Object2FloatSortedMap<K> p0){
return Object2FloatSortedMaps.unmodifiable(p0);
}
public static <K> it.unimi.dsi.fastutil.objects.Object2FloatSortedMap<K> synchronize(it.unimi.dsi.fastutil.objects.Object2FloatSortedMap<K> p0,java.lang.Object p1){
return Object2FloatSortedMaps.synchronize(p0,p1);
}
public static <K> it.unimi.dsi.fastutil.objects.Object2FloatSortedMap<K> synchronize(it.unimi.dsi.fastutil.objects.Object2FloatSortedMap<K> p0){
return Object2FloatSortedMaps.synchronize(p0);
}
}
