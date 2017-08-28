package com.github.zengfr.supercommons;
import it.unimi.dsi.fastutil.objects.Object2IntMaps;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Object2IntMapUtil{ 
public static <K> it.unimi.dsi.fastutil.objects.Object2IntMap<K> emptyMap(){
return Object2IntMaps.emptyMap();
}
public static <K> it.unimi.dsi.fastutil.objects.Object2IntMap<K> singleton(K p0,int p1){
return Object2IntMaps.singleton(p0,p1);
}
public static <K> it.unimi.dsi.fastutil.objects.Object2IntMap<K> singleton(K p0,java.lang.Integer p1){
return Object2IntMaps.singleton(p0,p1);
}
public static <K> it.unimi.dsi.fastutil.objects.Object2IntMap<K> unmodifiable(it.unimi.dsi.fastutil.objects.Object2IntMap<K> p0){
return Object2IntMaps.unmodifiable(p0);
}
public static <K> it.unimi.dsi.fastutil.objects.Object2IntMap<K> synchronize(it.unimi.dsi.fastutil.objects.Object2IntMap<K> p0,java.lang.Object p1){
return Object2IntMaps.synchronize(p0,p1);
}
public static <K> it.unimi.dsi.fastutil.objects.Object2IntMap<K> synchronize(it.unimi.dsi.fastutil.objects.Object2IntMap<K> p0){
return Object2IntMaps.synchronize(p0);
}
}
