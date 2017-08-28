package com.zengfr.supercommons;
import it.unimi.dsi.fastutil.objects.Object2ShortMaps;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Object2ShortMapUtil{ 
public static <K> it.unimi.dsi.fastutil.objects.Object2ShortMap<K> emptyMap(){
return Object2ShortMaps.emptyMap();
}
public static <K> it.unimi.dsi.fastutil.objects.Object2ShortMap<K> singleton(K p0,short p1){
return Object2ShortMaps.singleton(p0,p1);
}
public static <K> it.unimi.dsi.fastutil.objects.Object2ShortMap<K> singleton(K p0,java.lang.Short p1){
return Object2ShortMaps.singleton(p0,p1);
}
public static <K> it.unimi.dsi.fastutil.objects.Object2ShortMap<K> unmodifiable(it.unimi.dsi.fastutil.objects.Object2ShortMap<K> p0){
return Object2ShortMaps.unmodifiable(p0);
}
public static <K> it.unimi.dsi.fastutil.objects.Object2ShortMap<K> synchronize(it.unimi.dsi.fastutil.objects.Object2ShortMap<K> p0,java.lang.Object p1){
return Object2ShortMaps.synchronize(p0,p1);
}
public static <K> it.unimi.dsi.fastutil.objects.Object2ShortMap<K> synchronize(it.unimi.dsi.fastutil.objects.Object2ShortMap<K> p0){
return Object2ShortMaps.synchronize(p0);
}
}
