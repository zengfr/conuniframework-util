package com.github.zengfr.supercommons;
import it.unimi.dsi.fastutil.ints.Int2ReferenceMaps;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Int2ReferenceMapUtil{ 
public static <V> it.unimi.dsi.fastutil.ints.Int2ReferenceMap<V> emptyMap(){
return Int2ReferenceMaps.emptyMap();
}
public static <V> it.unimi.dsi.fastutil.ints.Int2ReferenceMap<V> singleton(int p0,V p1){
return Int2ReferenceMaps.singleton(p0,p1);
}
public static <V> it.unimi.dsi.fastutil.ints.Int2ReferenceMap<V> singleton(java.lang.Integer p0,V p1){
return Int2ReferenceMaps.singleton(p0,p1);
}
public static <V> it.unimi.dsi.fastutil.ints.Int2ReferenceMap<V> unmodifiable(it.unimi.dsi.fastutil.ints.Int2ReferenceMap<V> p0){
return Int2ReferenceMaps.unmodifiable(p0);
}
public static <V> it.unimi.dsi.fastutil.ints.Int2ReferenceMap<V> synchronize(it.unimi.dsi.fastutil.ints.Int2ReferenceMap<V> p0,java.lang.Object p1){
return Int2ReferenceMaps.synchronize(p0,p1);
}
public static <V> it.unimi.dsi.fastutil.ints.Int2ReferenceMap<V> synchronize(it.unimi.dsi.fastutil.ints.Int2ReferenceMap<V> p0){
return Int2ReferenceMaps.synchronize(p0);
}
}
