package com.github.zengfr.supercommons;
import it.unimi.dsi.fastutil.objects.Object2DoubleSortedMaps;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Object2DoubleSortedMapUtil{ 
public static <K> it.unimi.dsi.fastutil.objects.Object2DoubleSortedMap<K> emptyMap(){
return Object2DoubleSortedMaps.emptyMap();
}
public static <K> it.unimi.dsi.fastutil.objects.Object2DoubleSortedMap<K> singleton(K p0,java.lang.Double p1){
return Object2DoubleSortedMaps.singleton(p0,p1);
}
public static <K> it.unimi.dsi.fastutil.objects.Object2DoubleSortedMap<K> singleton(K p0,double p1){
return Object2DoubleSortedMaps.singleton(p0,p1);
}
public static <K> it.unimi.dsi.fastutil.objects.Object2DoubleSortedMap<K> singleton(K p0,java.lang.Double p1,java.util.Comparator<? super K> p2){
return Object2DoubleSortedMaps.singleton(p0,p1,p2);
}
public static <K> it.unimi.dsi.fastutil.objects.Object2DoubleSortedMap<K> singleton(K p0,double p1,java.util.Comparator<? super K> p2){
return Object2DoubleSortedMaps.singleton(p0,p1,p2);
}
public static <K> it.unimi.dsi.fastutil.objects.Object2DoubleSortedMap<K> unmodifiable(it.unimi.dsi.fastutil.objects.Object2DoubleSortedMap<K> p0){
return Object2DoubleSortedMaps.unmodifiable(p0);
}
public static <K> it.unimi.dsi.fastutil.objects.Object2DoubleSortedMap<K> synchronize(it.unimi.dsi.fastutil.objects.Object2DoubleSortedMap<K> p0,java.lang.Object p1){
return Object2DoubleSortedMaps.synchronize(p0,p1);
}
public static <K> it.unimi.dsi.fastutil.objects.Object2DoubleSortedMap<K> synchronize(it.unimi.dsi.fastutil.objects.Object2DoubleSortedMap<K> p0){
return Object2DoubleSortedMaps.synchronize(p0);
}
}
