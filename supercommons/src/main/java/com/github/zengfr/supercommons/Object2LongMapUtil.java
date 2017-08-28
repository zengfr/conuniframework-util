package com.github.zengfr.supercommons;
import it.unimi.dsi.fastutil.objects.Object2LongMaps;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Object2LongMapUtil{ 
public static <K> it.unimi.dsi.fastutil.objects.Object2LongMap<K> emptyMap(){
return Object2LongMaps.emptyMap();
}
public static <K> it.unimi.dsi.fastutil.objects.Object2LongMap<K> singleton(K p0,long p1){
return Object2LongMaps.singleton(p0,p1);
}
public static <K> it.unimi.dsi.fastutil.objects.Object2LongMap<K> singleton(K p0,java.lang.Long p1){
return Object2LongMaps.singleton(p0,p1);
}
public static <K> it.unimi.dsi.fastutil.objects.Object2LongMap<K> unmodifiable(it.unimi.dsi.fastutil.objects.Object2LongMap<K> p0){
return Object2LongMaps.unmodifiable(p0);
}
public static <K> it.unimi.dsi.fastutil.objects.Object2LongMap<K> synchronize(it.unimi.dsi.fastutil.objects.Object2LongMap<K> p0,java.lang.Object p1){
return Object2LongMaps.synchronize(p0,p1);
}
public static <K> it.unimi.dsi.fastutil.objects.Object2LongMap<K> synchronize(it.unimi.dsi.fastutil.objects.Object2LongMap<K> p0){
return Object2LongMaps.synchronize(p0);
}
}
