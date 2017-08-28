package com.zengfr.supercommons;
import it.unimi.dsi.fastutil.bytes.Byte2ReferenceMaps;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Byte2ReferenceMapUtil{ 
public static <V> it.unimi.dsi.fastutil.bytes.Byte2ReferenceMap<V> emptyMap(){
return Byte2ReferenceMaps.emptyMap();
}
public static <V> it.unimi.dsi.fastutil.bytes.Byte2ReferenceMap<V> singleton(byte p0,V p1){
return Byte2ReferenceMaps.singleton(p0,p1);
}
public static <V> it.unimi.dsi.fastutil.bytes.Byte2ReferenceMap<V> singleton(java.lang.Byte p0,V p1){
return Byte2ReferenceMaps.singleton(p0,p1);
}
public static <V> it.unimi.dsi.fastutil.bytes.Byte2ReferenceMap<V> unmodifiable(it.unimi.dsi.fastutil.bytes.Byte2ReferenceMap<V> p0){
return Byte2ReferenceMaps.unmodifiable(p0);
}
public static <V> it.unimi.dsi.fastutil.bytes.Byte2ReferenceMap<V> synchronize(it.unimi.dsi.fastutil.bytes.Byte2ReferenceMap<V> p0,java.lang.Object p1){
return Byte2ReferenceMaps.synchronize(p0,p1);
}
public static <V> it.unimi.dsi.fastutil.bytes.Byte2ReferenceMap<V> synchronize(it.unimi.dsi.fastutil.bytes.Byte2ReferenceMap<V> p0){
return Byte2ReferenceMaps.synchronize(p0);
}
}
