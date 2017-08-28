package com.zengfr.supercommons;
import it.unimi.dsi.fastutil.shorts.Short2ReferenceMaps;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Short2ReferenceMapUtil{ 
public static <V> it.unimi.dsi.fastutil.shorts.Short2ReferenceMap<V> emptyMap(){
return Short2ReferenceMaps.emptyMap();
}
public static <V> it.unimi.dsi.fastutil.shorts.Short2ReferenceMap<V> singleton(short p0,V p1){
return Short2ReferenceMaps.singleton(p0,p1);
}
public static <V> it.unimi.dsi.fastutil.shorts.Short2ReferenceMap<V> singleton(java.lang.Short p0,V p1){
return Short2ReferenceMaps.singleton(p0,p1);
}
public static <V> it.unimi.dsi.fastutil.shorts.Short2ReferenceMap<V> unmodifiable(it.unimi.dsi.fastutil.shorts.Short2ReferenceMap<V> p0){
return Short2ReferenceMaps.unmodifiable(p0);
}
public static <V> it.unimi.dsi.fastutil.shorts.Short2ReferenceMap<V> synchronize(it.unimi.dsi.fastutil.shorts.Short2ReferenceMap<V> p0,java.lang.Object p1){
return Short2ReferenceMaps.synchronize(p0,p1);
}
public static <V> it.unimi.dsi.fastutil.shorts.Short2ReferenceMap<V> synchronize(it.unimi.dsi.fastutil.shorts.Short2ReferenceMap<V> p0){
return Short2ReferenceMaps.synchronize(p0);
}
}
