package com.github.zengfr.supercommons;
import it.unimi.dsi.fastutil.longs.Long2ReferenceMaps;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Long2ReferenceMapUtil{ 
public static <V> it.unimi.dsi.fastutil.longs.Long2ReferenceMap<V> emptyMap(){
return Long2ReferenceMaps.emptyMap();
}
public static <V> it.unimi.dsi.fastutil.longs.Long2ReferenceMap<V> singleton(long p0,V p1){
return Long2ReferenceMaps.singleton(p0,p1);
}
public static <V> it.unimi.dsi.fastutil.longs.Long2ReferenceMap<V> singleton(java.lang.Long p0,V p1){
return Long2ReferenceMaps.singleton(p0,p1);
}
public static <V> it.unimi.dsi.fastutil.longs.Long2ReferenceMap<V> unmodifiable(it.unimi.dsi.fastutil.longs.Long2ReferenceMap<V> p0){
return Long2ReferenceMaps.unmodifiable(p0);
}
public static <V> it.unimi.dsi.fastutil.longs.Long2ReferenceMap<V> synchronize(it.unimi.dsi.fastutil.longs.Long2ReferenceMap<V> p0,java.lang.Object p1){
return Long2ReferenceMaps.synchronize(p0,p1);
}
public static <V> it.unimi.dsi.fastutil.longs.Long2ReferenceMap<V> synchronize(it.unimi.dsi.fastutil.longs.Long2ReferenceMap<V> p0){
return Long2ReferenceMaps.synchronize(p0);
}
}
