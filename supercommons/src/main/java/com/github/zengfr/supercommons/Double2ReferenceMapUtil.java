package com.zengfr.supercommons;
import it.unimi.dsi.fastutil.doubles.Double2ReferenceMaps;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Double2ReferenceMapUtil{ 
public static <V> it.unimi.dsi.fastutil.doubles.Double2ReferenceMap<V> emptyMap(){
return Double2ReferenceMaps.emptyMap();
}
public static <V> it.unimi.dsi.fastutil.doubles.Double2ReferenceMap<V> singleton(double p0,V p1){
return Double2ReferenceMaps.singleton(p0,p1);
}
public static <V> it.unimi.dsi.fastutil.doubles.Double2ReferenceMap<V> singleton(java.lang.Double p0,V p1){
return Double2ReferenceMaps.singleton(p0,p1);
}
public static <V> it.unimi.dsi.fastutil.doubles.Double2ReferenceMap<V> unmodifiable(it.unimi.dsi.fastutil.doubles.Double2ReferenceMap<V> p0){
return Double2ReferenceMaps.unmodifiable(p0);
}
public static <V> it.unimi.dsi.fastutil.doubles.Double2ReferenceMap<V> synchronize(it.unimi.dsi.fastutil.doubles.Double2ReferenceMap<V> p0,java.lang.Object p1){
return Double2ReferenceMaps.synchronize(p0,p1);
}
public static <V> it.unimi.dsi.fastutil.doubles.Double2ReferenceMap<V> synchronize(it.unimi.dsi.fastutil.doubles.Double2ReferenceMap<V> p0){
return Double2ReferenceMaps.synchronize(p0);
}
}
