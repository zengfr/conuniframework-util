package com.zengfr.supercommons;
import it.unimi.dsi.fastutil.floats.Float2ReferenceMaps;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Float2ReferenceMapUtil{ 
public static <V> it.unimi.dsi.fastutil.floats.Float2ReferenceMap<V> emptyMap(){
return Float2ReferenceMaps.emptyMap();
}
public static <V> it.unimi.dsi.fastutil.floats.Float2ReferenceMap<V> singleton(float p0,V p1){
return Float2ReferenceMaps.singleton(p0,p1);
}
public static <V> it.unimi.dsi.fastutil.floats.Float2ReferenceMap<V> singleton(java.lang.Float p0,V p1){
return Float2ReferenceMaps.singleton(p0,p1);
}
public static <V> it.unimi.dsi.fastutil.floats.Float2ReferenceMap<V> unmodifiable(it.unimi.dsi.fastutil.floats.Float2ReferenceMap<V> p0){
return Float2ReferenceMaps.unmodifiable(p0);
}
public static <V> it.unimi.dsi.fastutil.floats.Float2ReferenceMap<V> synchronize(it.unimi.dsi.fastutil.floats.Float2ReferenceMap<V> p0,java.lang.Object p1){
return Float2ReferenceMaps.synchronize(p0,p1);
}
public static <V> it.unimi.dsi.fastutil.floats.Float2ReferenceMap<V> synchronize(it.unimi.dsi.fastutil.floats.Float2ReferenceMap<V> p0){
return Float2ReferenceMaps.synchronize(p0);
}
}
