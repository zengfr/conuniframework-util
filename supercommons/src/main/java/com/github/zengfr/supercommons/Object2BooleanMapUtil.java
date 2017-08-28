package com.github.zengfr.supercommons;
import it.unimi.dsi.fastutil.objects.Object2BooleanMaps;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Object2BooleanMapUtil{ 
public static <K> it.unimi.dsi.fastutil.objects.Object2BooleanMap<K> emptyMap(){
return Object2BooleanMaps.emptyMap();
}
public static <K> it.unimi.dsi.fastutil.objects.Object2BooleanMap<K> singleton(K p0,boolean p1){
return Object2BooleanMaps.singleton(p0,p1);
}
public static <K> it.unimi.dsi.fastutil.objects.Object2BooleanMap<K> singleton(K p0,java.lang.Boolean p1){
return Object2BooleanMaps.singleton(p0,p1);
}
public static <K> it.unimi.dsi.fastutil.objects.Object2BooleanMap<K> unmodifiable(it.unimi.dsi.fastutil.objects.Object2BooleanMap<K> p0){
return Object2BooleanMaps.unmodifiable(p0);
}
public static <K> it.unimi.dsi.fastutil.objects.Object2BooleanMap<K> synchronize(it.unimi.dsi.fastutil.objects.Object2BooleanMap<K> p0,java.lang.Object p1){
return Object2BooleanMaps.synchronize(p0,p1);
}
public static <K> it.unimi.dsi.fastutil.objects.Object2BooleanMap<K> synchronize(it.unimi.dsi.fastutil.objects.Object2BooleanMap<K> p0){
return Object2BooleanMaps.synchronize(p0);
}
}
