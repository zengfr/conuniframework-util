package com.github.zengfr.supercommons;
import it.unimi.dsi.fastutil.objects.Reference2LongMaps;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Reference2LongMapUtil{ 
public static <K> it.unimi.dsi.fastutil.objects.Reference2LongMap<K> emptyMap(){
return Reference2LongMaps.emptyMap();
}
public static <K> it.unimi.dsi.fastutil.objects.Reference2LongMap<K> singleton(K p0,long p1){
return Reference2LongMaps.singleton(p0,p1);
}
public static <K> it.unimi.dsi.fastutil.objects.Reference2LongMap<K> singleton(K p0,java.lang.Long p1){
return Reference2LongMaps.singleton(p0,p1);
}
public static <K> it.unimi.dsi.fastutil.objects.Reference2LongMap<K> unmodifiable(it.unimi.dsi.fastutil.objects.Reference2LongMap<K> p0){
return Reference2LongMaps.unmodifiable(p0);
}
public static <K> it.unimi.dsi.fastutil.objects.Reference2LongMap<K> synchronize(it.unimi.dsi.fastutil.objects.Reference2LongMap<K> p0,java.lang.Object p1){
return Reference2LongMaps.synchronize(p0,p1);
}
public static <K> it.unimi.dsi.fastutil.objects.Reference2LongMap<K> synchronize(it.unimi.dsi.fastutil.objects.Reference2LongMap<K> p0){
return Reference2LongMaps.synchronize(p0);
}
}
