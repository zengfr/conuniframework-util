package com.zengfr.supercommons;
import it.unimi.dsi.fastutil.objects.Reference2CharMaps;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Reference2CharMapUtil{ 
public static <K> it.unimi.dsi.fastutil.objects.Reference2CharMap<K> emptyMap(){
return Reference2CharMaps.emptyMap();
}
public static <K> it.unimi.dsi.fastutil.objects.Reference2CharMap<K> singleton(K p0,char p1){
return Reference2CharMaps.singleton(p0,p1);
}
public static <K> it.unimi.dsi.fastutil.objects.Reference2CharMap<K> singleton(K p0,java.lang.Character p1){
return Reference2CharMaps.singleton(p0,p1);
}
public static <K> it.unimi.dsi.fastutil.objects.Reference2CharMap<K> unmodifiable(it.unimi.dsi.fastutil.objects.Reference2CharMap<K> p0){
return Reference2CharMaps.unmodifiable(p0);
}
public static <K> it.unimi.dsi.fastutil.objects.Reference2CharMap<K> synchronize(it.unimi.dsi.fastutil.objects.Reference2CharMap<K> p0,java.lang.Object p1){
return Reference2CharMaps.synchronize(p0,p1);
}
public static <K> it.unimi.dsi.fastutil.objects.Reference2CharMap<K> synchronize(it.unimi.dsi.fastutil.objects.Reference2CharMap<K> p0){
return Reference2CharMaps.synchronize(p0);
}
}
