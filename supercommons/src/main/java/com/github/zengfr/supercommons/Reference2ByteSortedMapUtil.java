package com.github.zengfr.supercommons;
import it.unimi.dsi.fastutil.objects.Reference2ByteSortedMaps;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Reference2ByteSortedMapUtil{ 
public static <K> it.unimi.dsi.fastutil.objects.Reference2ByteSortedMap<K> emptyMap(){
return Reference2ByteSortedMaps.emptyMap();
}
public static <K> it.unimi.dsi.fastutil.objects.Reference2ByteSortedMap<K> singleton(K p0,java.lang.Byte p1){
return Reference2ByteSortedMaps.singleton(p0,p1);
}
public static <K> it.unimi.dsi.fastutil.objects.Reference2ByteSortedMap<K> singleton(K p0,byte p1){
return Reference2ByteSortedMaps.singleton(p0,p1);
}
public static <K> it.unimi.dsi.fastutil.objects.Reference2ByteSortedMap<K> singleton(K p0,java.lang.Byte p1,java.util.Comparator<? super K> p2){
return Reference2ByteSortedMaps.singleton(p0,p1,p2);
}
public static <K> it.unimi.dsi.fastutil.objects.Reference2ByteSortedMap<K> singleton(K p0,byte p1,java.util.Comparator<? super K> p2){
return Reference2ByteSortedMaps.singleton(p0,p1,p2);
}
public static <K> it.unimi.dsi.fastutil.objects.Reference2ByteSortedMap<K> unmodifiable(it.unimi.dsi.fastutil.objects.Reference2ByteSortedMap<K> p0){
return Reference2ByteSortedMaps.unmodifiable(p0);
}
public static <K> it.unimi.dsi.fastutil.objects.Reference2ByteSortedMap<K> synchronize(it.unimi.dsi.fastutil.objects.Reference2ByteSortedMap<K> p0,java.lang.Object p1){
return Reference2ByteSortedMaps.synchronize(p0,p1);
}
public static <K> it.unimi.dsi.fastutil.objects.Reference2ByteSortedMap<K> synchronize(it.unimi.dsi.fastutil.objects.Reference2ByteSortedMap<K> p0){
return Reference2ByteSortedMaps.synchronize(p0);
}
}
