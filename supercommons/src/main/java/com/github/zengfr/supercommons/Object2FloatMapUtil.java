package com.github.zengfr.supercommons;
import it.unimi.dsi.fastutil.objects.Object2FloatMaps;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Object2FloatMapUtil{ 
public static <K> it.unimi.dsi.fastutil.objects.Object2FloatMap<K> emptyMap(){
return Object2FloatMaps.emptyMap();
}
public static <K> it.unimi.dsi.fastutil.objects.Object2FloatMap<K> singleton(K p0,float p1){
return Object2FloatMaps.singleton(p0,p1);
}
public static <K> it.unimi.dsi.fastutil.objects.Object2FloatMap<K> singleton(K p0,java.lang.Float p1){
return Object2FloatMaps.singleton(p0,p1);
}
public static <K> it.unimi.dsi.fastutil.objects.Object2FloatMap<K> unmodifiable(it.unimi.dsi.fastutil.objects.Object2FloatMap<K> p0){
return Object2FloatMaps.unmodifiable(p0);
}
public static <K> it.unimi.dsi.fastutil.objects.Object2FloatMap<K> synchronize(it.unimi.dsi.fastutil.objects.Object2FloatMap<K> p0,java.lang.Object p1){
return Object2FloatMaps.synchronize(p0,p1);
}
public static <K> it.unimi.dsi.fastutil.objects.Object2FloatMap<K> synchronize(it.unimi.dsi.fastutil.objects.Object2FloatMap<K> p0){
return Object2FloatMaps.synchronize(p0);
}
}
