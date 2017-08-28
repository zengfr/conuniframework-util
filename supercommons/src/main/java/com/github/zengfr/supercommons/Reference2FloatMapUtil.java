package com.zengfr.supercommons;
import it.unimi.dsi.fastutil.objects.Reference2FloatMaps;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Reference2FloatMapUtil{ 
public static <K> it.unimi.dsi.fastutil.objects.Reference2FloatMap<K> emptyMap(){
return Reference2FloatMaps.emptyMap();
}
public static <K> it.unimi.dsi.fastutil.objects.Reference2FloatMap<K> singleton(K p0,float p1){
return Reference2FloatMaps.singleton(p0,p1);
}
public static <K> it.unimi.dsi.fastutil.objects.Reference2FloatMap<K> singleton(K p0,java.lang.Float p1){
return Reference2FloatMaps.singleton(p0,p1);
}
public static <K> it.unimi.dsi.fastutil.objects.Reference2FloatMap<K> unmodifiable(it.unimi.dsi.fastutil.objects.Reference2FloatMap<K> p0){
return Reference2FloatMaps.unmodifiable(p0);
}
public static <K> it.unimi.dsi.fastutil.objects.Reference2FloatMap<K> synchronize(it.unimi.dsi.fastutil.objects.Reference2FloatMap<K> p0,java.lang.Object p1){
return Reference2FloatMaps.synchronize(p0,p1);
}
public static <K> it.unimi.dsi.fastutil.objects.Reference2FloatMap<K> synchronize(it.unimi.dsi.fastutil.objects.Reference2FloatMap<K> p0){
return Reference2FloatMaps.synchronize(p0);
}
}
